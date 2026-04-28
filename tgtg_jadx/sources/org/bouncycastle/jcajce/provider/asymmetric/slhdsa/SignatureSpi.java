package org.bouncycastle.jcajce.provider.asymmetric.slhdsa;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature;
import org.bouncycastle.jce.provider.a;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSAPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSAPublicKeyParameters;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSASigner;

/* JADX INFO: loaded from: classes3.dex */
public class SignatureSpi extends BaseDeterministicOrRandomSignature {
    private final ByteArrayOutputStream bOut;
    private final SLHDSASigner signer;

    public static class Direct extends SignatureSpi {
        public Direct() {
            super(new SLHDSASigner());
        }
    }

    public SignatureSpi(SLHDSASigner sLHDSASigner) {
        super("SLH-DSA");
        this.bOut = new ByteArrayOutputStream();
        this.signer = sLHDSASigner;
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        if (!(this.keyParams instanceof SLHDSAPrivateKeyParameters)) {
            throw new SignatureException("engine initialized for verification");
        }
        try {
            try {
                return this.signer.generateSignature(this.bOut.toByteArray());
            } catch (Exception e5) {
                throw new SignatureException(e5.toString());
            }
        } finally {
            this.isInitState = true;
            this.bOut.reset();
        }
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        if (!(this.keyParams instanceof SLHDSAPublicKeyParameters)) {
            throw new SignatureException("engine initialized for signing");
        }
        try {
            return this.signer.verifySignature(this.bOut.toByteArray(), bArr);
        } finally {
            this.isInitState = true;
            this.bOut.reset();
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void reInitialize(boolean z11, CipherParameters cipherParameters) {
        this.signer.init(z11, cipherParameters);
        this.bOut.reset();
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void signInit(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        ((Signature) this).appRandom = secureRandom;
        if (privateKey instanceof BCSLHDSAPrivateKey) {
            this.keyParams = ((BCSLHDSAPrivateKey) privateKey).getKeyParams();
        } else {
            a.i("unknown private key passed to SLH-DSA");
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void updateEngine(byte b8) throws SignatureException {
        this.bOut.write(b8);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void verifyInit(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCSLHDSAPublicKey) {
            this.keyParams = ((BCSLHDSAPublicKey) publicKey).getKeyParams();
        } else {
            a.i("unknown public key passed to SLH-DSA");
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void updateEngine(byte[] bArr, int i11, int i12) throws SignatureException {
        this.bOut.write(bArr, i11, i12);
    }
}
