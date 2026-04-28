package org.bouncycastle.pqc.crypto.mldsa;

import c50.w;
import i4.a;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class MLDSAPublicKeyParameters extends MLDSAKeyParameters {
    final byte[] rho;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    final byte[] f33549t1;

    public MLDSAPublicKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr, byte[] bArr2) {
        super(false, mLDSAParameters);
        if (bArr == null) {
            w.l("rho cannot be null");
            throw null;
        }
        if (bArr2 == null) {
            w.l("t1 cannot be null");
            throw null;
        }
        this.rho = Arrays.clone(bArr);
        this.f33549t1 = Arrays.clone(bArr2);
    }

    public byte[] getEncoded() {
        return getEncoded(this.rho, this.f33549t1);
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getT1() {
        return Arrays.clone(this.f33549t1);
    }

    public static byte[] getEncoded(byte[] bArr, byte[] bArr2) {
        return Arrays.concatenate(bArr, bArr2);
    }

    public MLDSAPublicKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr) {
        super(false, mLDSAParameters);
        this.rho = Arrays.copyOfRange(bArr, 0, 32);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 32, bArr.length);
        this.f33549t1 = bArrCopyOfRange;
        if (bArrCopyOfRange.length != 0) {
            return;
        }
        a.f("encoding too short");
        throw null;
    }
}
