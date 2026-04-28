package org.bouncycastle.pqc.crypto.cmce;

/* JADX INFO: loaded from: classes3.dex */
abstract class GF {
    public abstract short gf_frac(short s7, short s8);

    public abstract short gf_inv(short s7);

    public final short gf_iszero(short s7) {
        return (short) ((s7 - 1) >> 31);
    }

    public abstract short gf_mul(short s7, short s8);

    public abstract int gf_mul_ext(short s7, short s8);

    public abstract void gf_mul_poly(int i11, int[] iArr, short[] sArr, short[] sArr2, short[] sArr3, int[] iArr2);

    public abstract short gf_reduce(int i11);

    public abstract short gf_sq(short s7);

    public abstract int gf_sq_ext(short s7);

    public abstract void gf_sqr_poly(int i11, int[] iArr, short[] sArr, short[] sArr2, int[] iArr2);
}
