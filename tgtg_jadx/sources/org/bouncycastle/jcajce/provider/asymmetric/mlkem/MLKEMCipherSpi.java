package org.bouncycastle.jcajce.provider.asymmetric.mlkem;

import e0.f;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;
import m0.i1;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.jcajce.spec.KEMParameterSpec;
import org.bouncycastle.jcajce.spec.KTSParameterSpec;
import org.bouncycastle.jcajce.spec.MLKEMParameterSpec;
import org.bouncycastle.jce.provider.a;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMExtractor;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMGenerator;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMParameters;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.bouncycastle.pqc.jcajce.provider.util.WrapUtil;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Exceptions;
import r8.k;
import w.a0;

/* JADX INFO: loaded from: classes3.dex */
class MLKEMCipherSpi extends CipherSpi {
    private final String algorithmName;
    private AlgorithmParameters engineParams;
    private MLKEMGenerator kemGen;
    private KTSParameterSpec kemParameterSpec;
    private MLKEMParameters mlkemParamters;
    private BCMLKEMPrivateKey unwrapKey;
    private BCMLKEMPublicKey wrapKey;

    public static class Base extends MLKEMCipherSpi {
        public Base() throws NoSuchAlgorithmException {
            super("MLKEM");
        }
    }

    public static class MLKEM1024 extends MLKEMCipherSpi {
        public MLKEM1024() {
            super(MLKEMParameters.ml_kem_1024);
        }
    }

    public static class MLKEM512 extends MLKEMCipherSpi {
        public MLKEM512() {
            super(MLKEMParameters.ml_kem_512);
        }
    }

    public static class MLKEM768 extends MLKEMCipherSpi {
        public MLKEM768() {
            super(MLKEMParameters.ml_kem_768);
        }
    }

    public MLKEMCipherSpi(MLKEMParameters mLKEMParameters) {
        this.mlkemParamters = mLKEMParameters;
        this.algorithmName = mLKEMParameters.getName();
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return NewHope.SENDB_BYTES;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i11) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(this.algorithmName, "BCPQC");
                this.engineParams = algorithmParameters;
                algorithmParameters.init(this.kemParameterSpec);
            } catch (Exception e5) {
                throw Exceptions.illegalStateException(e5.toString(), e5);
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i11, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        KTSParameterSpec kEMParameterSpec;
        if (algorithmParameterSpec == null) {
            kEMParameterSpec = new KEMParameterSpec("AES-KWP");
        } else {
            if (!(algorithmParameterSpec instanceof KTSParameterSpec)) {
                throw new InvalidAlgorithmParameterException(k.p(new StringBuilder(), this.algorithmName, " can only accept KTSParameterSpec"));
            }
            kEMParameterSpec = (KTSParameterSpec) algorithmParameterSpec;
        }
        this.kemParameterSpec = kEMParameterSpec;
        if (i11 == 3) {
            if (!(key instanceof BCMLKEMPublicKey)) {
                throw new InvalidKeyException(k.p(new StringBuilder("Only a "), this.algorithmName, " public key can be used for wrapping"));
            }
            this.wrapKey = (BCMLKEMPublicKey) key;
            this.kemGen = new MLKEMGenerator(CryptoServicesRegistrar.getSecureRandom(secureRandom));
        } else if (i11 != 4) {
            a.t("Cipher only valid for wrapping/unwrapping");
            return;
        } else {
            if (!(key instanceof BCMLKEMPrivateKey)) {
                throw new InvalidKeyException(k.p(new StringBuilder("Only a "), this.algorithmName, " private key can be used for unwrapping"));
            }
            this.unwrapKey = (BCMLKEMPrivateKey) key;
        }
        MLKEMParameters mLKEMParameters = this.mlkemParamters;
        if (mLKEMParameters != null) {
            String name = MLKEMParameterSpec.fromName(mLKEMParameters.getName()).getName();
            if (!name.equals(key.getAlgorithm())) {
                throw new InvalidKeyException("cipher locked to ".concat(name));
            }
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(f.k("Cannot support mode ", str));
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(a0.p("Padding ", str, " unknown"));
    }

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i11) throws NoSuchAlgorithmException, InvalidKeyException {
        if (i11 != 3) {
            a.i("only SECRET_KEY supported");
            return null;
        }
        byte[] bArrExtractSecret = null;
        try {
            try {
                MLKEMExtractor mLKEMExtractor = new MLKEMExtractor(this.unwrapKey.getKeyParams());
                bArrExtractSecret = mLKEMExtractor.extractSecret(Arrays.copyOfRange(bArr, 0, mLKEMExtractor.getEncapsulationLength()));
                Wrapper keyUnwrapper = WrapUtil.getKeyUnwrapper(this.kemParameterSpec, bArrExtractSecret);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, mLKEMExtractor.getEncapsulationLength(), bArr.length);
                return new SecretKeySpec(keyUnwrapper.unwrap(bArrCopyOfRange, 0, bArrCopyOfRange.length), str);
            } catch (IllegalArgumentException e5) {
                throw new NoSuchAlgorithmException("unable to extract KTS secret: " + e5.getMessage());
            } catch (InvalidCipherTextException e11) {
                throw new InvalidKeyException("unable to extract KTS secret: " + e11.getMessage());
            }
        } finally {
            if (bArrExtractSecret != null) {
                Arrays.clear(bArrExtractSecret);
            }
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws ShortBufferException {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        if (key.getEncoded() == null) {
            a.i("Cannot wrap key, null encoding.");
            return null;
        }
        SecretWithEncapsulation secretWithEncapsulationGenerateEncapsulated = null;
        try {
            try {
                secretWithEncapsulationGenerateEncapsulated = this.kemGen.generateEncapsulated(this.wrapKey.getKeyParams());
                Wrapper keyWrapper = WrapUtil.getKeyWrapper(this.kemParameterSpec, secretWithEncapsulationGenerateEncapsulated.getSecret());
                byte[] encapsulation = secretWithEncapsulationGenerateEncapsulated.getEncapsulation();
                byte[] encoded = key.getEncoded();
                byte[] bArrConcatenate = Arrays.concatenate(encapsulation, keyWrapper.wrap(encoded, 0, encoded.length));
                Arrays.clear(encoded);
                try {
                    secretWithEncapsulationGenerateEncapsulated.destroy();
                    return bArrConcatenate;
                } catch (DestroyFailedException e5) {
                    throw new IllegalBlockSizeException("unable to destroy interim values: " + e5.getMessage());
                }
            } catch (IllegalArgumentException e11) {
                throw new IllegalBlockSizeException("unable to generate KTS secret: " + e11.getMessage());
            }
        } catch (Throwable th2) {
            if (secretWithEncapsulationGenerateEncapsulated != null) {
                try {
                    secretWithEncapsulationGenerateEncapsulated.destroy();
                } catch (DestroyFailedException e12) {
                    throw new IllegalBlockSizeException("unable to destroy interim values: " + e12.getMessage());
                }
            }
            throw th2;
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i11, int i12) throws BadPaddingException, IllegalBlockSizeException {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i11, int i12) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    public MLKEMCipherSpi(String str) {
        this.algorithmName = str;
        this.mlkemParamters = null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i11, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i11, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e5) {
            throw Exceptions.illegalArgumentException(e5.getMessage(), e5);
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i11, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(KEMParameterSpec.class);
            } catch (Exception unused) {
                i1.n(algorithmParameters);
                return;
            }
        } else {
            parameterSpec = null;
        }
        engineInit(i11, key, parameterSpec, secureRandom);
    }
}
