package org.bouncycastle.pqc.crypto.mlkem;

import com.braze.h2;
import i4.a;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class MLKEMPrivateKeyParameters extends MLKEMKeyParameters {
    public static final int BOTH = 0;
    public static final int EXPANDED_KEY = 2;
    public static final int SEED_ONLY = 1;
    final byte[] hpk;
    final byte[] nonce;
    private final int prefFormat;
    final byte[] rho;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final byte[] f33552s;
    final byte[] seed;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final byte[] f33553t;

    public MLKEMPrivateKeyParameters(MLKEMParameters mLKEMParameters, byte[] bArr, MLKEMPublicKeyParameters mLKEMPublicKeyParameters) {
        super(true, mLKEMParameters);
        MLKEMEngine engine = mLKEMParameters.getEngine();
        if (bArr.length == 64) {
            byte[][] bArrGenerateKemKeyPairInternal = engine.generateKemKeyPairInternal(Arrays.copyOfRange(bArr, 0, 32), Arrays.copyOfRange(bArr, 32, bArr.length));
            this.f33552s = bArrGenerateKemKeyPairInternal[2];
            this.hpk = bArrGenerateKemKeyPairInternal[3];
            this.nonce = bArrGenerateKemKeyPairInternal[4];
            this.f33553t = bArrGenerateKemKeyPairInternal[0];
            this.rho = bArrGenerateKemKeyPairInternal[1];
            this.seed = bArrGenerateKemKeyPairInternal[5];
        } else {
            this.f33552s = Arrays.copyOfRange(bArr, 0, engine.getKyberIndCpaSecretKeyBytes());
            int kyberIndCpaSecretKeyBytes = engine.getKyberIndCpaSecretKeyBytes();
            this.f33553t = Arrays.copyOfRange(bArr, kyberIndCpaSecretKeyBytes, (engine.getKyberIndCpaPublicKeyBytes() + kyberIndCpaSecretKeyBytes) - 32);
            int kyberIndCpaPublicKeyBytes = (engine.getKyberIndCpaPublicKeyBytes() - 32) + kyberIndCpaSecretKeyBytes;
            int i11 = kyberIndCpaPublicKeyBytes + 32;
            this.rho = Arrays.copyOfRange(bArr, kyberIndCpaPublicKeyBytes, i11);
            int i12 = kyberIndCpaPublicKeyBytes + 64;
            this.hpk = Arrays.copyOfRange(bArr, i11, i12);
            this.nonce = Arrays.copyOfRange(bArr, i12, kyberIndCpaPublicKeyBytes + 96);
            this.seed = null;
        }
        if (mLKEMPublicKeyParameters == null || (Arrays.constantTimeAreEqual(this.f33553t, mLKEMPublicKeyParameters.f33554t) && Arrays.constantTimeAreEqual(this.rho, mLKEMPublicKeyParameters.rho))) {
            this.prefFormat = this.seed != null ? 0 : 2;
        } else {
            a.f("passed in public key does not match private values");
            throw null;
        }
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(new byte[][]{this.f33552s, this.f33553t, this.rho, this.hpk, this.nonce});
    }

    public byte[] getHPK() {
        return Arrays.clone(this.hpk);
    }

    public byte[] getNonce() {
        return Arrays.clone(this.nonce);
    }

    public MLKEMPrivateKeyParameters getParametersWithFormat(int i11) {
        if (this.prefFormat == i11) {
            return this;
        }
        if (i11 == 0 || i11 == 1) {
            if (this.seed == null) {
                h2.b("no seed available");
                return null;
            }
        } else if (i11 != 2) {
            a.f("unknown format");
            return null;
        }
        return new MLKEMPrivateKeyParameters(this, i11);
    }

    public int getPreferredFormat() {
        return this.prefFormat;
    }

    public byte[] getPublicKey() {
        return MLKEMPublicKeyParameters.getEncoded(this.f33553t, this.rho);
    }

    public MLKEMPublicKeyParameters getPublicKeyParameters() {
        return new MLKEMPublicKeyParameters(getParameters(), this.f33553t, this.rho);
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getS() {
        return Arrays.clone(this.f33552s);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    public byte[] getT() {
        return Arrays.clone(this.f33553t);
    }

    public MLKEMPrivateKeyParameters(MLKEMParameters mLKEMParameters, byte[] bArr) {
        this(mLKEMParameters, bArr, null);
    }

    public MLKEMPrivateKeyParameters(MLKEMParameters mLKEMParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this(mLKEMParameters, bArr, bArr2, bArr3, bArr4, bArr5, null);
    }

    public MLKEMPrivateKeyParameters(MLKEMParameters mLKEMParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        super(true, mLKEMParameters);
        this.f33552s = Arrays.clone(bArr);
        this.hpk = Arrays.clone(bArr2);
        this.nonce = Arrays.clone(bArr3);
        this.f33553t = Arrays.clone(bArr4);
        this.rho = Arrays.clone(bArr5);
        this.seed = Arrays.clone(bArr6);
        this.prefFormat = 0;
    }

    private MLKEMPrivateKeyParameters(MLKEMPrivateKeyParameters mLKEMPrivateKeyParameters, int i11) {
        super(true, mLKEMPrivateKeyParameters.getParameters());
        this.f33552s = mLKEMPrivateKeyParameters.f33552s;
        this.f33553t = mLKEMPrivateKeyParameters.f33553t;
        this.rho = mLKEMPrivateKeyParameters.rho;
        this.hpk = mLKEMPrivateKeyParameters.hpk;
        this.nonce = mLKEMPrivateKeyParameters.nonce;
        this.seed = mLKEMPrivateKeyParameters.seed;
        this.prefFormat = i11;
    }
}
