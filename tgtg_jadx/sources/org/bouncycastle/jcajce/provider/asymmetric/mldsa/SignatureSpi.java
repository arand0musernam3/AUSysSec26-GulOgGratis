package org.bouncycastle.jcajce.provider.asymmetric.mldsa;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.jcajce.MLDSAProxyPrivateKey;
import org.bouncycastle.jcajce.interfaces.MLDSAPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature;
import org.bouncycastle.jcajce.spec.MLDSAParameterSpec;
import org.bouncycastle.jce.provider.a;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAParameters;
import org.bouncycastle.pqc.crypto.mldsa.MLDSASigner;
import org.bouncycastle.pqc.crypto.util.PublicKeyFactory;

/* JADX INFO: loaded from: classes3.dex */
public class SignatureSpi extends BaseDeterministicOrRandomSignature {
    protected MLDSAParameters parameters;
    protected MLDSASigner signer;

    public static class MLDSA extends SignatureSpi {
        public MLDSA() {
            super(new MLDSASigner());
        }
    }

    public static class MLDSA44 extends SignatureSpi {
        public MLDSA44() {
            super(new MLDSASigner(), MLDSAParameters.ml_dsa_44);
        }
    }

    public static class MLDSA65 extends SignatureSpi {
        public MLDSA65() {
            super(new MLDSASigner(), MLDSAParameters.ml_dsa_65);
        }
    }

    public static class MLDSA87 extends SignatureSpi {
        public MLDSA87() throws NoSuchAlgorithmException {
            super(new MLDSASigner(), MLDSAParameters.ml_dsa_87);
        }
    }

    public static class MLDSACalcMu extends SignatureSpi {
        public MLDSACalcMu() {
            super(new MLDSASigner());
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, java.security.SignatureSpi
        public byte[] engineSign() throws SignatureException {
            try {
                return this.signer.generateMu();
            } catch (Exception e5) {
                a.f(e5);
                return null;
            }
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, java.security.SignatureSpi
        public boolean engineVerify(byte[] bArr) throws SignatureException {
            return this.signer.verifyMu(bArr);
        }
    }

    public SignatureSpi(MLDSASigner mLDSASigner, MLDSAParameters mLDSAParameters) {
        super(MLDSAParameterSpec.fromName(mLDSAParameters.getName()).getName());
        this.signer = mLDSASigner;
        this.parameters = mLDSAParameters;
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        try {
            return this.signer.generateSignature();
        } catch (Exception e5) {
            a.f(e5);
            return null;
        }
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        return this.signer.verifySignature(bArr);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void reInitialize(boolean z11, CipherParameters cipherParameters) {
        this.signer.init(z11, cipherParameters);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void signInit(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        ((Signature) this).appRandom = secureRandom;
        if (privateKey instanceof BCMLDSAPrivateKey) {
            BCMLDSAPrivateKey bCMLDSAPrivateKey = (BCMLDSAPrivateKey) privateKey;
            this.keyParams = bCMLDSAPrivateKey.getKeyParams();
            MLDSAParameters mLDSAParameters = this.parameters;
            if (mLDSAParameters != null) {
                String name = MLDSAParameterSpec.fromName(mLDSAParameters.getName()).getName();
                if (!name.equals(bCMLDSAPrivateKey.getAlgorithm())) {
                    throw new InvalidKeyException("signature configured for ".concat(name));
                }
                return;
            }
            return;
        }
        if (!(privateKey instanceof MLDSAProxyPrivateKey) || !(this instanceof MLDSACalcMu)) {
            a.i("unknown private key passed to ML-DSA");
            return;
        }
        MLDSAPublicKey publicKey = ((MLDSAProxyPrivateKey) privateKey).getPublicKey();
        try {
            this.keyParams = PublicKeyFactory.createKey(publicKey.getEncoded());
            MLDSAParameters mLDSAParameters2 = this.parameters;
            if (mLDSAParameters2 != null) {
                String name2 = MLDSAParameterSpec.fromName(mLDSAParameters2.getName()).getName();
                if (!name2.equals(publicKey.getAlgorithm())) {
                    throw new InvalidKeyException("signature configured for ".concat(name2));
                }
            }
        } catch (IOException e5) {
            throw new InvalidKeyException(e5.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void updateEngine(byte b8) throws SignatureException {
        this.signer.update(b8);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void verifyInit(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof BCMLDSAPublicKey)) {
            a.i("unknown public key passed to ML-DSA");
            return;
        }
        BCMLDSAPublicKey bCMLDSAPublicKey = (BCMLDSAPublicKey) publicKey;
        this.keyParams = bCMLDSAPublicKey.getKeyParams();
        MLDSAParameters mLDSAParameters = this.parameters;
        if (mLDSAParameters != null) {
            String name = MLDSAParameterSpec.fromName(mLDSAParameters.getName()).getName();
            if (!name.equals(bCMLDSAPublicKey.getAlgorithm())) {
                throw new InvalidKeyException("signature configured for ".concat(name));
            }
        }
    }

    public static class MLDSAExtMu extends SignatureSpi {
        private ByteArrayOutputStream bOut;

        public MLDSAExtMu() {
            super(new MLDSASigner());
            this.bOut = new ByteArrayOutputStream(64);
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, java.security.SignatureSpi
        public byte[] engineSign() throws SignatureException {
            try {
                byte[] byteArray = this.bOut.toByteArray();
                this.bOut.reset();
                return this.signer.generateMuSignature(byteArray);
            } catch (DataLengthException e5) {
                throw new SignatureException(e5.getMessage());
            } catch (Exception e11) {
                a.f(e11);
                return null;
            }
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, java.security.SignatureSpi
        public boolean engineVerify(byte[] bArr) throws SignatureException {
            byte[] byteArray = this.bOut.toByteArray();
            this.bOut.reset();
            try {
                return this.signer.verifyMuSignature(byteArray, bArr);
            } catch (DataLengthException e5) {
                throw new SignatureException(e5.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
        public void updateEngine(byte b8) throws SignatureException {
            this.bOut.write(b8);
        }

        @Override // org.bouncycastle.jcajce.provider.asymmetric.mldsa.SignatureSpi, org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
        public void updateEngine(byte[] bArr, int i11, int i12) throws SignatureException {
            this.bOut.write(bArr, i11, i12);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void updateEngine(byte[] bArr, int i11, int i12) throws SignatureException {
        this.signer.update(bArr, i11, i12);
    }

    public SignatureSpi(MLDSASigner mLDSASigner) {
        super("MLDSA");
        this.signer = mLDSASigner;
        this.parameters = null;
    }
}
