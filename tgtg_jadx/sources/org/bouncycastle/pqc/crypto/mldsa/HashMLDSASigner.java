package org.bouncycastle.pqc.crypto.mldsa;

import com.braze.h2;
import i4.a;
import j4.s;
import java.io.IOException;
import java.security.SecureRandom;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.ParametersWithContext;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.DigestUtils;

/* JADX INFO: loaded from: classes3.dex */
public class HashMLDSASigner implements Signer {
    private static final byte[] EMPTY_CONTEXT = new byte[0];
    private Digest digest;
    private MLDSAEngine engine;
    private MLDSAPrivateKeyParameters privKey;
    private MLDSAPublicKeyParameters pubKey;
    private SecureRandom random;

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws DataLengthException, CryptoException {
        byte[] bArr = new byte[32];
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr);
        }
        MLDSAEngine mLDSAEngine = this.engine;
        byte[] bArrGenerateMu = mLDSAEngine.generateMu(mLDSAEngine.shake256Digest);
        MLDSAEngine mLDSAEngine2 = this.engine;
        SHAKEDigest shake256Digest = mLDSAEngine2.getShake256Digest();
        MLDSAPrivateKeyParameters mLDSAPrivateKeyParameters = this.privKey;
        return mLDSAEngine2.generateSignature(bArrGenerateMu, shake256Digest, mLDSAPrivateKeyParameters.rho, mLDSAPrivateKeyParameters.f33544k, mLDSAPrivateKeyParameters.t0, mLDSAPrivateKeyParameters.f33545s1, mLDSAPrivateKeyParameters.f33546s2, bArr);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z11, CipherParameters cipherParameters) {
        byte[] context = EMPTY_CONTEXT;
        if (cipherParameters instanceof ParametersWithContext) {
            ParametersWithContext parametersWithContext = (ParametersWithContext) cipherParameters;
            context = parametersWithContext.getContext();
            cipherParameters = parametersWithContext.getParameters();
            if (context.length > 255) {
                a.f("context too long");
                return;
            }
        }
        if (z11) {
            this.pubKey = null;
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.privKey = (MLDSAPrivateKeyParameters) parametersWithRandom.getParameters();
                this.random = parametersWithRandom.getRandom();
            } else {
                this.privKey = (MLDSAPrivateKeyParameters) cipherParameters;
                this.random = null;
            }
            MLDSAEngine engine = this.privKey.getParameters().getEngine(this.random);
            this.engine = engine;
            engine.initSign(this.privKey.f33548tr, true, context);
        } else {
            MLDSAPublicKeyParameters mLDSAPublicKeyParameters = (MLDSAPublicKeyParameters) cipherParameters;
            this.pubKey = mLDSAPublicKeyParameters;
            this.privKey = null;
            this.random = null;
            MLDSAEngine engine2 = mLDSAPublicKeyParameters.getParameters().getEngine(null);
            this.engine = engine2;
            MLDSAPublicKeyParameters mLDSAPublicKeyParameters2 = this.pubKey;
            engine2.initVerify(mLDSAPublicKeyParameters2.rho, mLDSAPublicKeyParameters2.f33549t1, true, context);
        }
        SHAKEDigest sHAKEDigest = this.engine.shake256Digest;
        this.digest = sHAKEDigest;
        try {
            byte[] encoded = DigestUtils.getDigestOid(sHAKEDigest.getAlgorithmName()).getEncoded(ASN1Encoding.DER);
            this.digest.update(encoded, 0, encoded.length);
        } catch (IOException e5) {
            h2.b(s.g(e5, new StringBuilder("oid encoding failed: ")));
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b8) {
        this.digest.update(b8);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        MLDSAEngine mLDSAEngine = this.engine;
        byte[] bArrGenerateMu = mLDSAEngine.generateMu(mLDSAEngine.shake256Digest);
        MLDSAEngine mLDSAEngine2 = this.engine;
        int length = bArr.length;
        SHAKEDigest shake256Digest = mLDSAEngine2.getShake256Digest();
        MLDSAPublicKeyParameters mLDSAPublicKeyParameters = this.pubKey;
        return mLDSAEngine2.verifyInternalMuSignature(bArrGenerateMu, bArr, length, shake256Digest, mLDSAPublicKeyParameters.rho, mLDSAPublicKeyParameters.f33549t1);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i11, int i12) {
        this.digest.update(bArr, i11, i12);
    }
}
