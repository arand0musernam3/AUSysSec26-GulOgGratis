package org.bouncycastle.jcajce.provider.symmetric.util;

import com.braze.h2;
import e0.f;
import j4.s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import m0.i1;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.crypto.params.ParametersWithUKM;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jcajce.spec.GOST28147WrapParameterSpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.a;
import org.bouncycastle.util.Arrays;
import w.a0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseWrapCipher extends CipherSpi implements PBE {
    private Class[] availableSpecs;
    protected AlgorithmParameters engineParams;
    private boolean forWrapping;
    private final JcaJceHelper helper;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f33308iv;
    private int ivSize;
    protected int pbeHash;
    protected int pbeIvSize;
    protected int pbeKeySize;
    protected int pbeType;
    protected Wrapper wrapEngine;
    private ErasableOutputStream wrapStream;

    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public void erase() {
            Arrays.fill(((ByteArrayOutputStream) this).buf, (byte) 0);
            reset();
        }

        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public static class InvalidKeyOrParametersException extends InvalidKeyException {
        private final Throwable cause;

        public InvalidKeyOrParametersException(String str, Throwable th2) {
            super(str);
            this.cause = th2;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    public BaseWrapCipher(int i11, Wrapper wrapper, int i12) {
        this.availableSpecs = new Class[]{GOST28147WrapParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.wrapStream = null;
        this.helper = new BCJcaJceHelper();
        this.pbeKeySize = i11;
        this.wrapEngine = wrapper;
        this.ivSize = i12;
    }

    public final AlgorithmParameters createParametersInstance(String str) throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.helper.createAlgorithmParameters(str);
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        byte[] bArrWrap;
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream == null) {
            h2.b("not supported in a wrapping mode");
            return 0;
        }
        erasableOutputStream.write(bArr, i11, i12);
        try {
            boolean z11 = this.forWrapping;
            Wrapper wrapper = this.wrapEngine;
            if (z11) {
                try {
                    bArrWrap = wrapper.wrap(this.wrapStream.getBuf(), 0, this.wrapStream.size());
                } catch (Exception e5) {
                    throw new IllegalBlockSizeException(e5.getMessage());
                }
            } else {
                try {
                    bArrWrap = wrapper.unwrap(this.wrapStream.getBuf(), 0, this.wrapStream.size());
                } catch (InvalidCipherTextException e11) {
                    throw new BadPaddingException(e11.getMessage());
                }
            }
            if (bArrWrap.length + i13 > bArr2.length) {
                throw new ShortBufferException("output buffer too short for input.");
            }
            System.arraycopy(bArrWrap, 0, bArr2, i13, bArrWrap.length);
            return bArrWrap.length;
        } finally {
            this.wrapStream.erase();
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return Arrays.clone(this.f33308iv);
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i11) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.f33308iv != null) {
            String algorithmName = this.wrapEngine.getAlgorithmName();
            if (algorithmName.indexOf(47) >= 0) {
                algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
            }
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance(algorithmName);
                this.engineParams = algorithmParametersCreateParametersInstance;
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(this.f33308iv));
            } catch (Exception e5) {
                i1.s(e5);
                return null;
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i11, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        CipherParameters keyParameter;
        int i12;
        if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                keyParameter = PBE.Util.makePBEParameters(bCPBEKey, algorithmParameterSpec, this.wrapEngine.getAlgorithmName());
            } else {
                if (bCPBEKey.getParam() == null) {
                    i1.v("PBE requires PBE parameters to be set.");
                    return;
                }
                keyParameter = bCPBEKey.getParam();
            }
        } else {
            keyParameter = new KeyParameter(key.getEncoded());
        }
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            byte[] iv2 = ((IvParameterSpec) algorithmParameterSpec).getIV();
            this.f33308iv = iv2;
            keyParameter = new ParametersWithIV(keyParameter, iv2);
        }
        if (algorithmParameterSpec instanceof GOST28147WrapParameterSpec) {
            GOST28147WrapParameterSpec gOST28147WrapParameterSpec = (GOST28147WrapParameterSpec) algorithmParameterSpec;
            byte[] sBox = gOST28147WrapParameterSpec.getSBox();
            if (sBox != null) {
                keyParameter = new ParametersWithSBox(keyParameter, sBox);
            }
            keyParameter = new ParametersWithUKM(keyParameter, gOST28147WrapParameterSpec.getUKM());
        }
        if ((keyParameter instanceof KeyParameter) && (i12 = this.ivSize) != 0 && (i11 == 3 || i11 == 1)) {
            byte[] bArr = new byte[i12];
            this.f33308iv = bArr;
            secureRandom.nextBytes(bArr);
            keyParameter = new ParametersWithIV(keyParameter, this.f33308iv);
        }
        if (secureRandom != null) {
            keyParameter = new ParametersWithRandom(keyParameter, secureRandom);
        }
        try {
            if (i11 != 1) {
                if (i11 == 2) {
                    this.wrapEngine.init(false, keyParameter);
                    this.wrapStream = new ErasableOutputStream();
                } else if (i11 == 3) {
                    this.wrapEngine.init(true, keyParameter);
                    this.wrapStream = null;
                } else {
                    if (i11 != 4) {
                        throw new InvalidParameterException("Unknown mode parameter passed to init.");
                    }
                    this.wrapEngine.init(false, keyParameter);
                    this.wrapStream = null;
                }
                this.forWrapping = false;
                return;
            }
            this.wrapEngine.init(true, keyParameter);
            this.wrapStream = new ErasableOutputStream();
            this.forWrapping = true;
        } catch (Exception e5) {
            throw new InvalidKeyOrParametersException(e5.getMessage(), e5);
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(f.k("can't support mode ", str));
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(a0.p("Padding ", str, " unknown."));
    }

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i11) throws NoSuchAlgorithmException, InvalidKeyException {
        try {
            Wrapper wrapper = this.wrapEngine;
            byte[] bArrEngineDoFinal = wrapper == null ? engineDoFinal(bArr, 0, bArr.length) : wrapper.unwrap(bArr, 0, bArr.length);
            if (i11 == 3) {
                return new SecretKeySpec(bArrEngineDoFinal, str);
            }
            if (str.equals("") && i11 == 2) {
                try {
                    PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance(bArrEngineDoFinal);
                    PrivateKey privateKey = BouncyCastleProvider.getPrivateKey(privateKeyInfo);
                    if (privateKey != null) {
                        return privateKey;
                    }
                    throw new InvalidKeyException("algorithm " + privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm() + " not supported");
                } catch (Exception unused) {
                    a.i("Invalid key encoding.");
                    return null;
                }
            }
            try {
                KeyFactory keyFactoryCreateKeyFactory = this.helper.createKeyFactory(str);
                if (i11 == 1) {
                    return keyFactoryCreateKeyFactory.generatePublic(new X509EncodedKeySpec(bArrEngineDoFinal));
                }
                if (i11 == 2) {
                    return keyFactoryCreateKeyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArrEngineDoFinal));
                }
                throw new InvalidKeyException(s.f(i11, "Unknown key type "));
            } catch (NoSuchProviderException e5) {
                throw new InvalidKeyException("Unknown key type " + e5.getMessage());
            } catch (InvalidKeySpecException e11) {
                throw new InvalidKeyException("Unknown key type " + e11.getMessage());
            }
        } catch (BadPaddingException e12) {
            throw new InvalidKeyException(e12.getMessage());
        } catch (IllegalBlockSizeException e13) {
            throw new InvalidKeyException(e13.getMessage());
        } catch (InvalidCipherTextException e14) {
            throw new InvalidKeyException(e14.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws IOException, ShortBufferException {
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream != null) {
            erasableOutputStream.write(bArr, i11, i12);
            return 0;
        }
        h2.b("not supported in a wrapping mode");
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            a.i("Cannot wrap key, null encoding.");
            return null;
        }
        try {
            Wrapper wrapper = this.wrapEngine;
            return wrapper == null ? engineDoFinal(encoded, 0, encoded.length) : wrapper.wrap(encoded, 0, encoded.length);
        } catch (BadPaddingException e5) {
            throw new IllegalBlockSizeException(e5.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i11, int i12) throws IOException {
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream != null) {
            erasableOutputStream.write(bArr, i11, i12);
            return null;
        }
        h2.b("not supported in a wrapping mode");
        return null;
    }

    public BaseWrapCipher(int i11, Wrapper wrapper) {
        this(i11, wrapper, 0);
    }

    public BaseWrapCipher() {
        this.availableSpecs = new Class[]{GOST28147WrapParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.wrapStream = null;
        this.helper = new BCJcaJceHelper();
    }

    public BaseWrapCipher(Wrapper wrapper) {
        this(wrapper, 0);
    }

    public BaseWrapCipher(Wrapper wrapper, int i11) {
        this.availableSpecs = new Class[]{GOST28147WrapParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.wrapStream = null;
        this.helper = new BCJcaJceHelper();
        this.wrapEngine = wrapper;
        this.ivSize = i11;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i11, int i12) throws BadPaddingException, IllegalBlockSizeException, IOException {
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream == null) {
            h2.b("not supported in a wrapping mode");
            return null;
        }
        if (bArr != null) {
            erasableOutputStream.write(bArr, i11, i12);
        }
        try {
            boolean z11 = this.forWrapping;
            Wrapper wrapper = this.wrapEngine;
            if (z11) {
                try {
                    return wrapper.wrap(this.wrapStream.getBuf(), 0, this.wrapStream.size());
                } catch (Exception e5) {
                    throw new IllegalBlockSizeException(e5.getMessage());
                }
            }
            try {
                return wrapper.unwrap(this.wrapStream.getBuf(), 0, this.wrapStream.size());
            } catch (InvalidCipherTextException e11) {
                throw new BadPaddingException(e11.getMessage());
            }
        } finally {
            this.wrapStream.erase();
        }
        this.wrapStream.erase();
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i11, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i11, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e5) {
            throw new InvalidKeyOrParametersException(e5.getMessage(), e5);
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i11, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpecExtractSpec;
        if (algorithmParameters != null) {
            algorithmParameterSpecExtractSpec = SpecUtil.extractSpec(algorithmParameters, this.availableSpecs);
            if (algorithmParameterSpecExtractSpec == null) {
                i1.n(algorithmParameters);
                return;
            }
        } else {
            algorithmParameterSpecExtractSpec = null;
        }
        this.engineParams = algorithmParameters;
        engineInit(i11, key, algorithmParameterSpecExtractSpec, secureRandom);
    }
}
