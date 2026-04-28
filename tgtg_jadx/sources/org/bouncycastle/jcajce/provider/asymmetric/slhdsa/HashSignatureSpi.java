package org.bouncycastle.jcajce.provider.asymmetric.slhdsa;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature;
import org.bouncycastle.jce.provider.a;
import org.bouncycastle.pqc.crypto.slhdsa.HashSLHDSASigner;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSAPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSAPublicKeyParameters;

/* JADX INFO: loaded from: classes3.dex */
public class HashSignatureSpi extends BaseDeterministicOrRandomSignature {
    private final HashSLHDSASigner signer;

    public static class Direct extends HashSignatureSpi {
        public Direct() {
            super(new HashSLHDSASigner());
        }
    }

    public HashSignatureSpi(HashSLHDSASigner hashSLHDSASigner) {
        super("HASH-SLH-DSA");
        this.signer = hashSLHDSASigner;
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        if (!(this.keyParams instanceof SLHDSAPrivateKeyParameters)) {
            throw new SignatureException("engine initialized for verification");
        }
        try {
            try {
                return this.signer.generateSignature();
            } catch (Exception e5) {
                throw new SignatureException(e5.toString());
            }
        } finally {
            this.isInitState = true;
        }
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        if (!(this.keyParams instanceof SLHDSAPublicKeyParameters)) {
            throw new SignatureException("engine initialized for signing");
        }
        try {
            return this.signer.verifySignature(bArr);
        } finally {
            this.isInitState = true;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void reInitialize(boolean z11, CipherParameters cipherParameters) {
        this.signer.init(z11, cipherParameters);
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
        this.signer.update(b8);
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
        this.signer.update(bArr, i11, i12);
    }
}
