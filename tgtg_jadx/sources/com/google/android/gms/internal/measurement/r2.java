package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r2 f11809f = new r2(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f11811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f11812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11813d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11814e;

    public r2(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.f11810a = i11;
        this.f11811b = iArr;
        this.f11812c = objArr;
        this.f11814e = z11;
    }

    public static r2 a() {
        return new r2(0, new int[8], new Object[8], true);
    }

    public final void b(s5 s5Var) {
        b1 b1Var = (b1) s5Var.f11844b;
        if (this.f11810a != 0) {
            for (int i11 = 0; i11 < this.f11810a; i11++) {
                int i12 = this.f11811b[i11];
                Object obj = this.f11812c[i11];
                int i13 = i12 & 7;
                int i14 = i12 >>> 3;
                if (i13 == 0) {
                    b1Var.h(i14, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    b1Var.i(i14, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    b1Var.l(i14, (u0) obj);
                } else if (i13 == 3) {
                    b1Var.d(i14, 3);
                    ((r2) obj).b(s5Var);
                    b1Var.d(i14, 4);
                } else {
                    if (i13 != 5) {
                        org.bouncycastle.jce.provider.a.m(new zzaeg());
                        return;
                    }
                    b1Var.g(i14, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int iA;
        int iB;
        int iA2;
        int i11 = this.f11813d;
        if (i11 != -1) {
            return i11;
        }
        int iB2 = 0;
        for (int i12 = 0; i12 < this.f11810a; i12++) {
            int i13 = this.f11811b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f11812c[i12]).getClass();
                    iA2 = b1.a(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    u0 u0Var = (u0) this.f11812c[i12];
                    int iA3 = b1.a(i16);
                    int iC = u0Var.c();
                    iB2 = b3.i.b(iC, iC, iA3, iB2);
                } else if (i15 == 3) {
                    int iA4 = b1.a(i14 << 3);
                    iA = iA4 + iA4;
                    iB = ((r2) this.f11812c[i12]).c();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new zzaeg());
                    }
                    ((Integer) this.f11812c[i12]).getClass();
                    iA2 = b1.a(i14 << 3) + 4;
                }
                iB2 = iA2 + iB2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f11812c[i12]).longValue();
                iA = b1.a(i17);
                iB = b1.b(jLongValue);
            }
            iB2 = iB + iA + iB2;
        }
        this.f11813d = iB2;
        return iB2;
    }

    public final void d(int i11, Object obj) {
        if (!this.f11814e) {
            c50.w.d();
            return;
        }
        e(this.f11810a + 1);
        int[] iArr = this.f11811b;
        int i12 = this.f11810a;
        iArr[i12] = i11;
        this.f11812c[i12] = obj;
        this.f11810a = i12 + 1;
    }

    public final void e(int i11) {
        int[] iArr = this.f11811b;
        if (i11 > iArr.length) {
            int i12 = this.f11810a;
            int i13 = (i12 / 2) + i12;
            if (i13 >= i11) {
                i11 = i13;
            }
            if (i11 < 8) {
                i11 = 8;
            }
            this.f11811b = Arrays.copyOf(iArr, i11);
            this.f11812c = Arrays.copyOf(this.f11812c, i11);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof r2)) {
            r2 r2Var = (r2) obj;
            int i11 = this.f11810a;
            if (i11 == r2Var.f11810a) {
                int[] iArr = this.f11811b;
                int[] iArr2 = r2Var.f11811b;
                int i12 = 0;
                while (true) {
                    if (i12 >= i11) {
                        Object[] objArr = this.f11812c;
                        Object[] objArr2 = r2Var.f11812c;
                        int i13 = this.f11810a;
                        for (int i14 = 0; i14 < i13; i14++) {
                            if (objArr[i14].equals(objArr2[i14])) {
                            }
                        }
                        return true;
                    }
                    if (iArr[i12] != iArr2[i12]) {
                        break;
                    }
                    i12++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f11810a;
        int i12 = i11 + 527;
        int[] iArr = this.f11811b;
        int iHashCode = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i11; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = ((i12 * 31) + i13) * 31;
        Object[] objArr = this.f11812c;
        int i16 = this.f11810a;
        for (int i17 = 0; i17 < i16; i17++) {
            iHashCode = (iHashCode * 31) + objArr[i17].hashCode();
        }
        return i15 + iHashCode;
    }
}
