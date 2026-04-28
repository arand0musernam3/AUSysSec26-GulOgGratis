package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.braze.h2;
import e0.f;
import i4.a;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import m0.i1;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.encodings.ISO9796d1Encoding;
import org.bouncycastle.crypto.encodings.OAEPEncoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.tls.TlsRsaKeyExchange;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.jcajce.spec.TLSRSAPremasterSecretParameterSpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Strings;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
public class CipherSpi extends BaseCipherSpi {
    private BaseCipherSpi.ErasableOutputStream bOut;
    private AsymmetricBlockCipher cipher;
    private AlgorithmParameters engineParams;
    private final JcaJceHelper helper;
    private CipherParameters param;
    private AlgorithmParameterSpec paramSpec;
    private boolean privateKeyOnly;
    private boolean publicKeyOnly;
    private TLSRSAPremasterSecretParameterSpec tlsRsaSpec;

    public static class ISO9796d1Padding extends CipherSpi {
        public ISO9796d1Padding() {
            super(new ISO9796d1Encoding(new RSABlindedEngine()));
        }
    }

    public static class NoPadding extends CipherSpi {
        public NoPadding() {
            super(new RSABlindedEngine());
        }
    }

    public static class OAEPPadding extends CipherSpi {
        public OAEPPadding() {
            super(OAEPParameterSpec.DEFAULT);
        }
    }

    public static class PKCS1v1_5Padding extends CipherSpi {
        public PKCS1v1_5Padding() {
            super(new CustomPKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class PKCS1v1_5Padding_PrivateOnly extends CipherSpi {
        public PKCS1v1_5Padding_PrivateOnly() {
            super(false, true, new CustomPKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public static class PKCS1v1_5Padding_PublicOnly extends CipherSpi {
        public PKCS1v1_5Padding_PublicOnly() {
            super(true, false, new CustomPKCS1Encoding(new RSABlindedEngine()));
        }
    }

    public CipherSpi(OAEPParameterSpec oAEPParameterSpec) {
        this.helper = new BCJcaJceHelper();
        this.publicKeyOnly = false;
        this.privateKeyOnly = false;
        this.bOut = new BaseCipherSpi.ErasableOutputStream();
        this.tlsRsaSpec = null;
        this.param = null;
        try {
            initFromSpec(oAEPParameterSpec);
        } catch (NoSuchPaddingException e5) {
            a.f(e5.getMessage());
            throw null;
        }
    }

    private int getInputLimit() {
        if (this.tlsRsaSpec != null) {
            return TlsRsaKeyExchange.getInputLimit((RSAKeyParameters) ((ParametersWithRandom) this.param).getParameters());
        }
        AsymmetricBlockCipher asymmetricBlockCipher = this.cipher;
        boolean z11 = asymmetricBlockCipher instanceof RSABlindedEngine;
        int inputBlockSize = asymmetricBlockCipher.getInputBlockSize();
        return z11 ? inputBlockSize + 1 : inputBlockSize;
    }

    private byte[] getOutput() throws BadPaddingException {
        byte[] bArrProcessBlock;
        try {
            if (this.tlsRsaSpec != null) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) this.param;
                bArrProcessBlock = TlsRsaKeyExchange.decryptPreMasterSecret(this.bOut.getBuf(), 0, this.bOut.size(), (RSAKeyParameters) parametersWithRandom.getParameters(), this.tlsRsaSpec.getProtocolVersion(), parametersWithRandom.getRandom());
            } else {
                try {
                    bArrProcessBlock = this.cipher.processBlock(this.bOut.getBuf(), 0, this.bOut.size());
                    if (bArrProcessBlock == null) {
                        throw new BadBlockException("unable to decrypt block", null);
                    }
                } catch (ArrayIndexOutOfBoundsException e5) {
                    throw new BadBlockException("unable to decrypt block", e5);
                } catch (InvalidCipherTextException e11) {
                    throw new BadBlockException("unable to decrypt block", e11);
                }
            }
            return bArrProcessBlock;
        } finally {
            this.bOut.erase();
        }
    }

    private void initFromSpec(OAEPParameterSpec oAEPParameterSpec) throws NoSuchPaddingException {
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
        Digest digest = DigestFactory.getDigest(mGF1ParameterSpec.getDigestAlgorithm());
        if (digest != null) {
            this.cipher = new OAEPEncoding(new RSABlindedEngine(), digest, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
            this.paramSpec = oAEPParameterSpec;
        } else {
            throw new NoSuchPaddingException("no match on OAEP constructor for digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        if (i13 > bArr2.length - engineGetOutputSize(bArr == null ? 0 : i12)) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        byte[] bArrEngineDoFinal = engineDoFinal(bArr, i11, i12);
        System.arraycopy(bArrEngineDoFinal, 0, bArr2, i13, bArrEngineDoFinal.length);
        return bArrEngineDoFinal.length;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        try {
            return this.cipher.getInputBlockSize();
        } catch (NullPointerException unused) {
            h2.b("RSA Cipher not initialised");
            return 0;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        if (key instanceof RSAPrivateKey) {
            return ((RSAPrivateKey) key).getModulus().bitLength();
        }
        if (key instanceof RSAPublicKey) {
            return ((RSAPublicKey) key).getModulus().bitLength();
        }
        a.f("not an RSA key!");
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i11) {
        if (this.tlsRsaSpec != null) {
            return 48;
        }
        try {
            return this.cipher.getOutputBlockSize();
        } catch (NullPointerException unused) {
            h2.b("RSA Cipher not initialised");
            return 0;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.paramSpec != null) {
            try {
                AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.helper.createAlgorithmParameters("OAEP");
                this.engineParams = algorithmParametersCreateAlgorithmParameters;
                algorithmParametersCreateAlgorithmParameters.init(this.paramSpec);
            } catch (Exception e5) {
                i1.s(e5);
                return null;
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i11, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        RSAKeyParameters rSAKeyParametersGeneratePrivateKeyParameter;
        this.tlsRsaSpec = null;
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof OAEPParameterSpec) && !(algorithmParameterSpec instanceof TLSRSAPremasterSecretParameterSpec)) {
            throw new InvalidAlgorithmParameterException("unknown parameter type: ".concat(algorithmParameterSpec.getClass().getName()));
        }
        if (key instanceof RSAPublicKey) {
            if (this.privateKeyOnly && i11 == 1) {
                org.bouncycastle.jce.provider.a.i("mode 1 requires RSAPrivateKey");
                return;
            }
            rSAKeyParametersGeneratePrivateKeyParameter = RSAUtil.generatePublicKeyParameter((RSAPublicKey) key);
        } else if (!(key instanceof RSAPrivateKey)) {
            org.bouncycastle.jce.provider.a.i("unknown key type passed to RSA");
            return;
        } else {
            if (this.publicKeyOnly && i11 == 1) {
                org.bouncycastle.jce.provider.a.i("mode 2 requires RSAPublicKey");
                return;
            }
            rSAKeyParametersGeneratePrivateKeyParameter = RSAUtil.generatePrivateKeyParameter((RSAPrivateKey) key);
        }
        this.param = rSAKeyParametersGeneratePrivateKeyParameter;
        if (algorithmParameterSpec instanceof OAEPParameterSpec) {
            OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
            this.paramSpec = algorithmParameterSpec;
            if (!oAEPParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !oAEPParameterSpec.getMGFAlgorithm().equals(PKCSObjectIdentifiers.id_mgf1.getId())) {
                i1.v("unknown mask generation function specified");
                return;
            }
            if (!(oAEPParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec)) {
                i1.v("unkown MGF parameters");
                return;
            }
            Digest digest = DigestFactory.getDigest(oAEPParameterSpec.getDigestAlgorithm());
            if (digest == null) {
                throw new InvalidAlgorithmParameterException("no match on digest algorithm: " + oAEPParameterSpec.getDigestAlgorithm());
            }
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
            Digest digest2 = DigestFactory.getDigest(mGF1ParameterSpec.getDigestAlgorithm());
            if (digest2 == null) {
                throw new InvalidAlgorithmParameterException("no match on MGF digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
            }
            this.cipher = new OAEPEncoding(new RSABlindedEngine(), digest, digest2, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
        } else if (algorithmParameterSpec instanceof TLSRSAPremasterSecretParameterSpec) {
            CipherParameters cipherParameters = this.param;
            if (!(cipherParameters instanceof RSAKeyParameters) || !((RSAKeyParameters) cipherParameters).isPrivate()) {
                org.bouncycastle.jce.provider.a.i("RSA private key required for TLS decryption");
                return;
            }
            this.tlsRsaSpec = (TLSRSAPremasterSecretParameterSpec) algorithmParameterSpec;
        }
        CipherParameters cipherParameters2 = this.param;
        this.param = secureRandom != null ? new ParametersWithRandom(cipherParameters2, secureRandom) : new ParametersWithRandom(cipherParameters2, CryptoServicesRegistrar.getSecureRandom());
        this.bOut.reset();
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new InvalidParameterException(k.h(i11, "unknown opmode ", " passed to RSA"));
                    }
                }
            }
            this.cipher.init(false, this.param);
            return;
        }
        this.cipher.init(true, this.param);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("NONE") || upperCase.equals("ECB")) {
            return;
        }
        if (upperCase.equals("1")) {
            this.privateKeyOnly = true;
            this.publicKeyOnly = false;
        } else {
            if (!upperCase.equals("2")) {
                throw new NoSuchAlgorithmException(f.k("can't support mode ", str));
            }
            this.privateKeyOnly = false;
            this.publicKeyOnly = true;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi, javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("NOPADDING")) {
            this.cipher = new RSABlindedEngine();
            return;
        }
        if (upperCase.equals("PKCS1PADDING")) {
            this.cipher = new CustomPKCS1Encoding(new RSABlindedEngine());
            return;
        }
        if (upperCase.equals("ISO9796-1PADDING")) {
            this.cipher = new ISO9796d1Encoding(new RSABlindedEngine());
            return;
        }
        if (upperCase.equals("OAEPWITHMD5ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("MD5", "MGF1", new MGF1ParameterSpec("MD5"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPPADDING")) {
            initFromSpec(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (upperCase.equals("OAEPWITHSHA1ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-1ANDMGF1PADDING")) {
            initFromSpec(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (upperCase.equals("OAEPWITHSHA224ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-224ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA224, "MGF1", new MGF1ParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA224), PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA256ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-256ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA384ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-384ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA384, "MGF1", MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA512ANDMGF1PADDING") || upperCase.equals("OAEPWITHSHA-512ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA3-224ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (upperCase.equals("OAEPWITHSHA3-256ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("SHA3-256", "MGF1", new MGF1ParameterSpec("SHA3-256"), PSource.PSpecified.DEFAULT));
        } else if (upperCase.equals("OAEPWITHSHA3-384ANDMGF1PADDING")) {
            initFromSpec(new OAEPParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), PSource.PSpecified.DEFAULT));
        } else {
            if (!upperCase.equals("OAEPWITHSHA3-512ANDMGF1PADDING")) {
                throw new NoSuchPaddingException(k.l(str, " unavailable with RSA."));
            }
            initFromSpec(new OAEPParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), PSource.PSpecified.DEFAULT));
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i11, int i12) throws IOException {
        if (i12 > getInputLimit() - this.bOut.size()) {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        this.bOut.write(bArr, i11, i12);
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws IOException {
        engineUpdate(bArr, i11, i12);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i11, int i12) throws BadPaddingException, IllegalBlockSizeException, IOException {
        if (bArr != null) {
            engineUpdate(bArr, i11, i12);
        }
        return getOutput();
    }

    public CipherSpi(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.helper = new BCJcaJceHelper();
        this.publicKeyOnly = false;
        this.privateKeyOnly = false;
        this.bOut = new BaseCipherSpi.ErasableOutputStream();
        this.tlsRsaSpec = null;
        this.param = null;
        this.cipher = asymmetricBlockCipher;
    }

    public CipherSpi(boolean z11, boolean z12, AsymmetricBlockCipher asymmetricBlockCipher) {
        this.helper = new BCJcaJceHelper();
        this.publicKeyOnly = false;
        this.privateKeyOnly = false;
        this.bOut = new BaseCipherSpi.ErasableOutputStream();
        this.tlsRsaSpec = null;
        this.param = null;
        this.publicKeyOnly = z11;
        this.privateKeyOnly = z12;
        this.cipher = asymmetricBlockCipher;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i11, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i11, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e5) {
            throw new InvalidKeyException("Eeeek! " + e5.toString(), e5);
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i11, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(OAEPParameterSpec.class);
            } catch (InvalidParameterSpecException e5) {
                throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + e5.toString(), e5);
            }
        } else {
            parameterSpec = null;
        }
        this.engineParams = algorithmParameters;
        engineInit(i11, key, parameterSpec, secureRandom);
    }
}
