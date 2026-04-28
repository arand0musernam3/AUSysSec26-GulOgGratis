package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f11860c;

    public t0(byte[] bArr) {
        bArr.getClass();
        this.f11860c = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.u0
    public final byte b(int i11) {
        return this.f11860c[i11];
    }

    @Override // com.google.android.gms.internal.measurement.u0
    public final int c() {
        return this.f11860c.length;
    }

    @Override // com.google.android.gms.internal.measurement.u0
    public final s0 d(int i11, int i12) {
        byte[] bArr = this.f11860c;
        int iN = u0.n(0, i12, bArr.length);
        return iN == 0 ? u0.f11915b : new r0(bArr, 0, iN);
    }

    @Override // com.google.android.gms.internal.measurement.u0
    public final void e(int i11, byte[] bArr) {
        System.arraycopy(this.f11860c, 0, bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.u0
    public final void g(b1 b1Var) {
        byte[] bArr = this.f11860c;
        b1Var.c(0, bArr.length, bArr);
    }

    @Override // com.google.android.gms.internal.measurement.u0
    public final boolean h(u0 u0Var) {
        boolean z11 = u0Var instanceof t0;
        byte[] bArr = this.f11860c;
        if (z11) {
            return Arrays.equals(bArr, ((t0) u0Var).f11860c);
        }
        boolean z12 = u0Var instanceof r0;
        if (!z12) {
            return u0Var.h(this);
        }
        r0 r0Var = (r0) u0Var;
        int i11 = r0Var.f11807e;
        int length = bArr.length;
        if (length > i11) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb2.append("Length too large: ");
            sb2.append(length);
            sb2.append(length);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (length <= i11) {
            if (z11) {
                return u0.o(0, bArr, 0, ((t0) u0Var).f11860c, length);
            }
            if (!z12) {
                return u0Var.d(0, length).equals(d(0, length));
            }
            return u0.o(0, bArr, r0Var.f11806d, r0Var.f11805c, length);
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(length).length() + 27 + String.valueOf(i11).length());
        sb3.append("Ran off end of other: 0, ");
        sb3.append(length);
        sb3.append(", ");
        sb3.append(i11);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.u0
    public final int i(int i11, int i12) {
        return r1.a(i11, this.f11860c, 0, i12);
    }
}
