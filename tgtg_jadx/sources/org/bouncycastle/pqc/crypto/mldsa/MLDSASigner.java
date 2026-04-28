package org.bouncycastle.pqc.crypto.mldsa;

import java.security.SecureRandom;
import m0.i1;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* JADX INFO: loaded from: classes3.dex */
public class MLDSASigner implements Signer {
    private static final byte[] EMPTY_CONTEXT = new byte[0];
    private MLDSAEngine engine;
    private SHAKEDigest msgDigest;
    private MLDSAPrivateKeyParameters privKey;
    private MLDSAPublicKeyParameters pubKey;
    private SecureRandom random;

    public byte[] generateMu() throws DataLengthException, CryptoException {
        byte[] bArrGenerateMu = this.engine.generateMu(this.msgDigest);
        reset();
        return bArrGenerateMu;
    }

    public byte[] generateMuSignature(byte[] bArr) throws DataLengthException, CryptoException {
        if (bArr.length != 64) {
            i1.t("mu value must be 64 bytes");
            return null;
        }
        byte[] bArr2 = new byte[32];
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr2);
        }
        this.msgDigest.reset();
        MLDSAEngine mLDSAEngine = this.engine;
        SHAKEDigest sHAKEDigest = this.msgDigest;
        MLDSAPrivateKeyParameters mLDSAPrivateKeyParameters = this.privKey;
        byte[] bArrGenerateSignature = mLDSAEngine.generateSignature(bArr, sHAKEDigest, mLDSAPrivateKeyParameters.rho, mLDSAPrivateKeyParameters.f33544k, mLDSAPrivateKeyParameters.t0, mLDSAPrivateKeyParameters.f33545s1, mLDSAPrivateKeyParameters.f33546s2, bArr2);
        reset();
        return bArrGenerateSignature;
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws DataLengthException, CryptoException {
        byte[] bArr = new byte[32];
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr);
        }
        byte[] bArrGenerateMu = this.engine.generateMu(this.msgDigest);
        MLDSAEngine mLDSAEngine = this.engine;
        SHAKEDigest sHAKEDigest = this.msgDigest;
        MLDSAPrivateKeyParameters mLDSAPrivateKeyParameters = this.privKey;
        byte[] bArrGenerateSignature = mLDSAEngine.generateSignature(bArrGenerateMu, sHAKEDigest, mLDSAPrivateKeyParameters.rho, mLDSAPrivateKeyParameters.f33544k, mLDSAPrivateKeyParameters.t0, mLDSAPrivateKeyParameters.f33545s1, mLDSAPrivateKeyParameters.f33546s2, bArr);
        reset();
        return bArrGenerateSignature;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r0 r6
      0x001c: PHI (r0v1 byte[]) = (r0v0 byte[]), (r0v2 byte[]) binds: [B:3:0x0004, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]
      0x001c: PHI (r6v1 org.bouncycastle.crypto.CipherParameters) = (r6v0 org.bouncycastle.crypto.CipherParameters), (r6v9 org.bouncycastle.crypto.CipherParameters) binds: [B:3:0x0004, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // org.bouncycastle.crypto.Signer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(boolean r5, org.bouncycastle.crypto.CipherParameters r6) {
        /*
            r4 = this;
            byte[] r0 = org.bouncycastle.pqc.crypto.mldsa.MLDSASigner.EMPTY_CONTEXT
            boolean r1 = r6 instanceof org.bouncycastle.crypto.params.ParametersWithContext
            if (r1 == 0) goto L1c
            org.bouncycastle.crypto.params.ParametersWithContext r6 = (org.bouncycastle.crypto.params.ParametersWithContext) r6
            byte[] r0 = r6.getContext()
            org.bouncycastle.crypto.CipherParameters r6 = r6.getParameters()
            int r1 = r0.length
            r2 = 255(0xff, float:3.57E-43)
            if (r1 > r2) goto L16
            goto L1c
        L16:
            java.lang.String r5 = "context too long"
        L18:
            i4.a.f(r5)
            return
        L1c:
            r1 = 0
            r2 = 0
            if (r5 == 0) goto L53
            r4.pubKey = r2
            boolean r5 = r6 instanceof org.bouncycastle.crypto.params.ParametersWithRandom
            if (r5 == 0) goto L37
            org.bouncycastle.crypto.params.ParametersWithRandom r6 = (org.bouncycastle.crypto.params.ParametersWithRandom) r6
            org.bouncycastle.crypto.CipherParameters r5 = r6.getParameters()
            org.bouncycastle.pqc.crypto.mldsa.MLDSAPrivateKeyParameters r5 = (org.bouncycastle.pqc.crypto.mldsa.MLDSAPrivateKeyParameters) r5
            r4.privKey = r5
            java.security.SecureRandom r5 = r6.getRandom()
            r4.random = r5
            goto L3d
        L37:
            org.bouncycastle.pqc.crypto.mldsa.MLDSAPrivateKeyParameters r6 = (org.bouncycastle.pqc.crypto.mldsa.MLDSAPrivateKeyParameters) r6
            r4.privKey = r6
            r4.random = r2
        L3d:
            org.bouncycastle.pqc.crypto.mldsa.MLDSAPrivateKeyParameters r5 = r4.privKey
            org.bouncycastle.pqc.crypto.mldsa.MLDSAParameters r5 = r5.getParameters()
            java.security.SecureRandom r6 = r4.random
            org.bouncycastle.pqc.crypto.mldsa.MLDSAEngine r6 = r5.getEngine(r6)
            r4.engine = r6
            org.bouncycastle.pqc.crypto.mldsa.MLDSAPrivateKeyParameters r2 = r4.privKey
            byte[] r2 = r2.f33548tr
            r6.initSign(r2, r1, r0)
            goto L6e
        L53:
            org.bouncycastle.pqc.crypto.mldsa.MLDSAPublicKeyParameters r6 = (org.bouncycastle.pqc.crypto.mldsa.MLDSAPublicKeyParameters) r6
            r4.pubKey = r6
            r4.privKey = r2
            r4.random = r2
            org.bouncycastle.pqc.crypto.mldsa.MLDSAParameters r5 = r6.getParameters()
            org.bouncycastle.pqc.crypto.mldsa.MLDSAEngine r6 = r5.getEngine(r2)
            r4.engine = r6
            org.bouncycastle.pqc.crypto.mldsa.MLDSAPublicKeyParameters r2 = r4.pubKey
            byte[] r3 = r2.rho
            byte[] r2 = r2.f33549t1
            r6.initVerify(r3, r2, r1, r0)
        L6e:
            boolean r5 = r5.isPreHash()
            if (r5 != 0) goto L78
            r4.reset()
            return
        L78:
            java.lang.String r5 = "\"pure\" ml-dsa must use non pre-hash parameters"
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.mldsa.MLDSASigner.init(boolean, org.bouncycastle.crypto.CipherParameters):void");
    }

    public byte[] internalGenerateSignature(byte[] bArr, byte[] bArr2) {
        MLDSAEngine engine = this.privKey.getParameters().getEngine(this.random);
        engine.initSign(this.privKey.f33548tr, false, null);
        int length = bArr.length;
        MLDSAPrivateKeyParameters mLDSAPrivateKeyParameters = this.privKey;
        return engine.signInternal(bArr, length, mLDSAPrivateKeyParameters.rho, mLDSAPrivateKeyParameters.f33544k, mLDSAPrivateKeyParameters.t0, mLDSAPrivateKeyParameters.f33545s1, mLDSAPrivateKeyParameters.f33546s2, bArr2);
    }

    public boolean internalVerifySignature(byte[] bArr, byte[] bArr2) {
        MLDSAEngine engine = this.pubKey.getParameters().getEngine(this.random);
        MLDSAPublicKeyParameters mLDSAPublicKeyParameters = this.pubKey;
        engine.initVerify(mLDSAPublicKeyParameters.rho, mLDSAPublicKeyParameters.f33549t1, false, null);
        SHAKEDigest shake256Digest = engine.getShake256Digest();
        shake256Digest.update(bArr, 0, bArr.length);
        int length = bArr2.length;
        MLDSAPublicKeyParameters mLDSAPublicKeyParameters2 = this.pubKey;
        return engine.verifyInternal(bArr2, length, shake256Digest, mLDSAPublicKeyParameters2.rho, mLDSAPublicKeyParameters2.f33549t1);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.msgDigest = this.engine.getShake256Digest();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b8) {
        this.msgDigest.update(b8);
    }

    public boolean verifyMu(byte[] bArr) {
        if (bArr.length != 64) {
            i1.t("mu value must be 64 bytes");
            return false;
        }
        boolean zVerifyInternalMu = this.engine.verifyInternalMu(bArr);
        reset();
        return zVerifyInternalMu;
    }

    public boolean verifyMuSignature(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 64) {
            i1.t("mu value must be 64 bytes");
            return false;
        }
        this.msgDigest.reset();
        MLDSAEngine mLDSAEngine = this.engine;
        int length = bArr2.length;
        SHAKEDigest sHAKEDigest = this.msgDigest;
        MLDSAPublicKeyParameters mLDSAPublicKeyParameters = this.pubKey;
        boolean zVerifyInternalMuSignature = mLDSAEngine.verifyInternalMuSignature(bArr, bArr2, length, sHAKEDigest, mLDSAPublicKeyParameters.rho, mLDSAPublicKeyParameters.f33549t1);
        reset();
        return zVerifyInternalMuSignature;
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        MLDSAEngine mLDSAEngine = this.engine;
        int length = bArr.length;
        SHAKEDigest sHAKEDigest = this.msgDigest;
        MLDSAPublicKeyParameters mLDSAPublicKeyParameters = this.pubKey;
        boolean zVerifyInternal = mLDSAEngine.verifyInternal(bArr, length, sHAKEDigest, mLDSAPublicKeyParameters.rho, mLDSAPublicKeyParameters.f33549t1);
        reset();
        return zVerifyInternal;
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i11, int i12) {
        this.msgDigest.update(bArr, i11, i12);
    }
}
