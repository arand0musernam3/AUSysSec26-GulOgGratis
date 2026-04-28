package org.bouncycastle.pqc.crypto.mldsa;

import com.braze.h2;
import i4.a;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class MLDSAPrivateKeyParameters extends MLDSAKeyParameters {
    public static final int BOTH = 0;
    public static final int EXPANDED_KEY = 2;
    public static final int SEED_ONLY = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final byte[] f33544k;
    private final int prefFormat;
    final byte[] rho;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    final byte[] f33545s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    final byte[] f33546s2;
    private final byte[] seed;
    final byte[] t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private final byte[] f33547t1;

    /* JADX INFO: renamed from: tr, reason: collision with root package name */
    final byte[] f33548tr;

    public MLDSAPrivateKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr, MLDSAPublicKeyParameters mLDSAPublicKeyParameters) {
        super(true, mLDSAParameters);
        MLDSAEngine engine = mLDSAParameters.getEngine(null);
        if (bArr.length == 32) {
            byte[][] bArrGenerateKeyPairInternal = engine.generateKeyPairInternal(bArr);
            this.rho = bArrGenerateKeyPairInternal[0];
            this.f33544k = bArrGenerateKeyPairInternal[1];
            this.f33548tr = bArrGenerateKeyPairInternal[2];
            this.f33545s1 = bArrGenerateKeyPairInternal[3];
            this.f33546s2 = bArrGenerateKeyPairInternal[4];
            this.t0 = bArrGenerateKeyPairInternal[5];
            this.f33547t1 = bArrGenerateKeyPairInternal[6];
            this.seed = bArrGenerateKeyPairInternal[7];
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 32);
            this.rho = bArrCopyOfRange;
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 32, 64);
            this.f33544k = bArrCopyOfRange2;
            byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr, 64, 128);
            this.f33548tr = bArrCopyOfRange3;
            int dilithiumL = (engine.getDilithiumL() * engine.getDilithiumPolyEtaPackedBytes()) + 128;
            byte[] bArrCopyOfRange4 = Arrays.copyOfRange(bArr, 128, dilithiumL);
            this.f33545s1 = bArrCopyOfRange4;
            int dilithiumK = (engine.getDilithiumK() * engine.getDilithiumPolyEtaPackedBytes()) + dilithiumL;
            byte[] bArrCopyOfRange5 = Arrays.copyOfRange(bArr, dilithiumL, dilithiumK);
            this.f33546s2 = bArrCopyOfRange5;
            byte[] bArrCopyOfRange6 = Arrays.copyOfRange(bArr, dilithiumK, (engine.getDilithiumK() * 416) + dilithiumK);
            this.t0 = bArrCopyOfRange6;
            this.f33547t1 = engine.deriveT1(bArrCopyOfRange, bArrCopyOfRange2, bArrCopyOfRange3, bArrCopyOfRange4, bArrCopyOfRange5, bArrCopyOfRange6);
            this.seed = null;
        }
        if (mLDSAPublicKeyParameters == null || Arrays.constantTimeAreEqual(this.f33547t1, mLDSAPublicKeyParameters.getT1())) {
            this.prefFormat = this.seed != null ? 0 : 2;
        } else {
            a.f("passed in public key does not match private values");
            throw null;
        }
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(new byte[][]{this.rho, this.f33544k, this.f33548tr, this.f33545s1, this.f33546s2, this.t0});
    }

    public byte[] getK() {
        return Arrays.clone(this.f33544k);
    }

    public MLDSAPrivateKeyParameters getParametersWithFormat(int i11) {
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
        return new MLDSAPrivateKeyParameters(this, i11);
    }

    public int getPreferredFormat() {
        return this.prefFormat;
    }

    public byte[] getPrivateKey() {
        return getEncoded();
    }

    public byte[] getPublicKey() {
        return MLDSAPublicKeyParameters.getEncoded(this.rho, this.f33547t1);
    }

    public MLDSAPublicKeyParameters getPublicKeyParameters() {
        if (this.f33547t1 == null) {
            return null;
        }
        return new MLDSAPublicKeyParameters(getParameters(), this.rho, this.f33547t1);
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getS1() {
        return Arrays.clone(this.f33545s1);
    }

    public byte[] getS2() {
        return Arrays.clone(this.f33546s2);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    public byte[] getT0() {
        return Arrays.clone(this.t0);
    }

    public byte[] getT1() {
        return Arrays.clone(this.f33547t1);
    }

    public byte[] getTr() {
        return Arrays.clone(this.f33548tr);
    }

    public MLDSAPrivateKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr) {
        this(mLDSAParameters, bArr, null);
    }

    public MLDSAPrivateKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        this(mLDSAParameters, bArr, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, null);
    }

    public MLDSAPrivateKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8) {
        super(true, mLDSAParameters);
        this.rho = Arrays.clone(bArr);
        this.f33544k = Arrays.clone(bArr2);
        this.f33548tr = Arrays.clone(bArr3);
        this.f33545s1 = Arrays.clone(bArr4);
        this.f33546s2 = Arrays.clone(bArr5);
        this.t0 = Arrays.clone(bArr6);
        this.f33547t1 = Arrays.clone(bArr7);
        this.seed = Arrays.clone(bArr8);
        this.prefFormat = bArr8 != null ? 0 : 2;
    }

    private MLDSAPrivateKeyParameters(MLDSAPrivateKeyParameters mLDSAPrivateKeyParameters, int i11) {
        super(true, mLDSAPrivateKeyParameters.getParameters());
        this.rho = mLDSAPrivateKeyParameters.rho;
        this.f33544k = mLDSAPrivateKeyParameters.f33544k;
        this.f33548tr = mLDSAPrivateKeyParameters.f33548tr;
        this.f33545s1 = mLDSAPrivateKeyParameters.f33545s1;
        this.f33546s2 = mLDSAPrivateKeyParameters.f33546s2;
        this.t0 = mLDSAPrivateKeyParameters.t0;
        this.f33547t1 = mLDSAPrivateKeyParameters.f33547t1;
        this.seed = mLDSAPrivateKeyParameters.seed;
        this.prefFormat = i11;
    }
}
