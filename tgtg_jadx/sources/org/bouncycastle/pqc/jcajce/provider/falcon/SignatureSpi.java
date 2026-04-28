package org.bouncycastle.pqc.jcajce.provider.falcon;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.jce.provider.a;
import org.bouncycastle.pqc.crypto.falcon.FalconParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconSigner;
import org.bouncycastle.util.Strings;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
public class SignatureSpi extends Signature {
    private ByteArrayOutputStream bOut;
    private FalconParameters parameters;
    private SecureRandom random;
    private FalconSigner signer;

    public static class Base extends SignatureSpi {
        public Base() {
            super(new FalconSigner());
        }
    }

    public static class Falcon1024 extends SignatureSpi {
        public Falcon1024() {
            super(new FalconSigner(), FalconParameters.falcon_1024);
        }
    }

    public static class Falcon512 extends SignatureSpi {
        public Falcon512() {
            super(new FalconSigner(), FalconParameters.falcon_512);
        }
    }

    public SignatureSpi(FalconSigner falconSigner, FalconParameters falconParameters) {
        super(Strings.toUpperCase(falconParameters.getName()));
        this.parameters = falconParameters;
        this.bOut = new ByteArrayOutputStream();
        this.signer = falconSigner;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof BCFalconPrivateKey)) {
            a.i("unknown private key passed to Falcon");
            return;
        }
        BCFalconPrivateKey bCFalconPrivateKey = (BCFalconPrivateKey) privateKey;
        FalconPrivateKeyParameters keyParams = bCFalconPrivateKey.getKeyParams();
        FalconParameters falconParameters = this.parameters;
        if (falconParameters != null) {
            String upperCase = Strings.toUpperCase(falconParameters.getName());
            if (!upperCase.equals(bCFalconPrivateKey.getAlgorithm())) {
                throw new InvalidKeyException("signature configured for ".concat(upperCase));
            }
        }
        SecureRandom secureRandom = this.random;
        FalconSigner falconSigner = this.signer;
        if (secureRandom != null) {
            falconSigner.init(true, new ParametersWithRandom(keyParams, secureRandom));
        } else {
            falconSigner.init(true, keyParams);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof BCFalconPublicKey)) {
            try {
                publicKey = new BCFalconPublicKey(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
            } catch (Exception e5) {
                throw new InvalidKeyException(k.j(e5, new StringBuilder("unknown public key passed to Falcon: ")), e5);
            }
        }
        BCFalconPublicKey bCFalconPublicKey = (BCFalconPublicKey) publicKey;
        FalconParameters falconParameters = this.parameters;
        if (falconParameters != null) {
            String upperCase = Strings.toUpperCase(falconParameters.getName());
            if (!upperCase.equals(bCFalconPublicKey.getAlgorithm())) {
                throw new InvalidKeyException("signature configured for ".concat(upperCase));
            }
        }
        this.signer.init(false, bCFalconPublicKey.getKeyParams());
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        try {
            byte[] byteArray = this.bOut.toByteArray();
            this.bOut.reset();
            return this.signer.generateSignature(byteArray);
        } catch (Exception e5) {
            a.f(e5);
            return null;
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b8) throws SignatureException {
        this.bOut.write(b8);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] byteArray = this.bOut.toByteArray();
        this.bOut.reset();
        return this.signer.verifySignature(byteArray, bArr);
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i11, int i12) throws SignatureException {
        this.bOut.write(bArr, i11, i12);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    public SignatureSpi(FalconSigner falconSigner) {
        super("FALCON");
        this.bOut = new ByteArrayOutputStream();
        this.signer = falconSigner;
        this.parameters = null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.random = secureRandom;
        engineInitSign(privateKey);
    }
}
