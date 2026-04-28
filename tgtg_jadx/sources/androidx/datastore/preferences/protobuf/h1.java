package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h1 f2981f = new h1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f2983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f2984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2985d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2986e;

    public h1(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.f2982a = i11;
        this.f2983b = iArr;
        this.f2984c = objArr;
        this.f2986e = z11;
    }

    public final void a(int i11) {
        int[] iArr = this.f2983b;
        if (i11 > iArr.length) {
            int i12 = this.f2982a;
            int i13 = (i12 / 2) + i12;
            if (i13 >= i11) {
                i11 = i13;
            }
            if (i11 < 8) {
                i11 = 8;
            }
            this.f2983b = Arrays.copyOf(iArr, i11);
            this.f2984c = Arrays.copyOf(this.f2984c, i11);
        }
    }

    public final int b() {
        int iH;
        int iJ;
        int iH2;
        int i11 = this.f2985d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f2982a; i13++) {
            int i14 = this.f2983b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 != 0) {
                if (i16 == 1) {
                    ((Long) this.f2984c[i13]).getClass();
                    iH2 = l.h(i15) + 8;
                } else if (i16 == 2) {
                    iH2 = l.f(i15, (f) this.f2984c[i13]);
                } else if (i16 == 3) {
                    iH = l.h(i15) * 2;
                    iJ = ((h1) this.f2984c[i13]).b();
                } else {
                    if (i16 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.b());
                    }
                    ((Integer) this.f2984c[i13]).getClass();
                    iH2 = l.h(i15) + 4;
                }
                i12 = iH2 + i12;
            } else {
                long jLongValue = ((Long) this.f2984c[i13]).longValue();
                iH = l.h(i15);
                iJ = l.j(jLongValue);
            }
            i12 = iJ + iH + i12;
        }
        this.f2985d = i12;
        return i12;
    }

    public final void c(int i11, Object obj) {
        if (!this.f2986e) {
            c50.w.d();
            return;
        }
        a(this.f2982a + 1);
        int[] iArr = this.f2983b;
        int i12 = this.f2982a;
        iArr[i12] = i11;
        this.f2984c[i12] = obj;
        this.f2982a = i12 + 1;
    }

    public final void d(i0 i0Var) {
        if (this.f2982a == 0) {
            return;
        }
        i0Var.getClass();
        l lVar = (l) i0Var.f2990a;
        for (int i11 = 0; i11 < this.f2982a; i11++) {
            int i12 = this.f2983b[i11];
            Object obj = this.f2984c[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                lVar.E(i13, ((Long) obj).longValue());
            } else if (i14 == 1) {
                lVar.t(i13, ((Long) obj).longValue());
            } else if (i14 == 2) {
                i0Var.a(i13, (f) obj);
            } else if (i14 == 3) {
                lVar.B(i13, 3);
                ((h1) obj).d(i0Var);
                lVar.B(i13, 4);
            } else {
                if (i14 != 5) {
                    org.bouncycastle.jce.provider.a.m(InvalidProtocolBufferException.b());
                    return;
                }
                lVar.r(i13, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        int i11 = this.f2982a;
        if (i11 == h1Var.f2982a) {
            int[] iArr = this.f2983b;
            int[] iArr2 = h1Var.f2983b;
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    Object[] objArr = this.f2984c;
                    Object[] objArr2 = h1Var.f2984c;
                    int i13 = this.f2982a;
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
        return false;
    }

    public final int hashCode() {
        int i11 = this.f2982a;
        int i12 = (527 + i11) * 31;
        int[] iArr = this.f2983b;
        int iHashCode = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i11; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i12 + i13) * 31;
        Object[] objArr = this.f2984c;
        int i16 = this.f2982a;
        for (int i17 = 0; i17 < i16; i17++) {
            iHashCode = (iHashCode * 31) + objArr[i17].hashCode();
        }
        return i15 + iHashCode;
    }
}
