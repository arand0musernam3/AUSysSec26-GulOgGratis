package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f11805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11807e;

    public r0(byte[] bArr, int i11, int i12) {
        u0.n(i11, i11 + i12, bArr.length);
        this.f11805c = bArr;
        this.f11806d = i11;
        this.f11807e = i12;
    }

    @Override // com.google.android.gms.internal.measurement.u0
    public final byte b(int i11) {
        return this.f11805c[this.f11806d + i11];
    }

    @Override // com.google.android.gms.internal.measurement.u0
    public final int c() {
        return this.f11807e;
    }

    @Override // com.google.android.gms.internal.measurement.u0
    public final s0 d(int i11, int i12) {
        int iN = u0.n(i11, i12, this.f11807e);
        if (iN == 0) {
            return u0.f11915b;
        }
        return new r0(this.f11805c, this.f11806d + i11, iN);
    }

    @Override // com.google.android.gms.internal.measurement.u0
    public final void e(int i11, byte[] bArr) {
        System.arraycopy(this.f11805c, this.f11806d, bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.u0
    public final void g(b1 b1Var) {
        b1Var.c(this.f11806d, this.f11807e, this.f11805c);
    }

    @Override // com.google.android.gms.internal.measurement.u0
    public final boolean h(u0 u0Var) {
        boolean z11 = u0Var instanceof t0;
        if (!z11 && !(u0Var instanceof r0)) {
            return u0Var.h(this);
        }
        int iC = u0Var.c();
        int i11 = this.f11807e;
        if (i11 > iC) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 18 + String.valueOf(i11).length());
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(i11);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i11 > u0Var.c()) {
            int iC2 = u0Var.c();
            StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 27 + String.valueOf(iC2).length());
            sb3.append("Ran off end of other: 0, ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(iC2);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f11805c;
        int i12 = this.f11806d;
        if (z11) {
            return u0.o(i12, bArr, 0, ((t0) u0Var).f11860c, i11);
        }
        if (!(u0Var instanceof r0)) {
            return u0Var.d(0, i11).equals(d(i12, i11 + i12));
        }
        r0 r0Var = (r0) u0Var;
        return u0.o(i12, bArr, r0Var.f11806d, r0Var.f11805c, i11);
    }

    @Override // com.google.android.gms.internal.measurement.u0
    public final int i(int i11, int i12) {
        return r1.a(i11, this.f11805c, this.f11806d, i12);
    }
}
