package b5;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f6015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6016b;

    public y() {
        this.f6015a = new int[10];
    }

    public int a(int i11) {
        int i12 = this.f6016b - 1;
        return i12 >= 0 ? this.f6015a[i12] : i11;
    }

    public int b() {
        int[] iArr = this.f6015a;
        int i11 = this.f6016b - 1;
        this.f6016b = i11;
        return iArr[i11];
    }

    public void c(int i11) {
        int[] iArrCopyOf = this.f6015a;
        if (this.f6016b >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f6015a = iArrCopyOf;
        }
        int i12 = this.f6016b;
        this.f6016b = i12 + 1;
        iArrCopyOf[i12] = i11;
    }

    public void d(int i11, int i12, int i13) {
        int i14 = this.f6016b;
        int[] iArrCopyOf = this.f6015a;
        int i15 = i14 + 3;
        if (i15 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f6015a = iArrCopyOf;
        }
        iArrCopyOf[i14] = i11 + i13;
        iArrCopyOf[i14 + 1] = i12 + i13;
        iArrCopyOf[i14 + 2] = i13;
        this.f6016b = i15;
    }

    public void e(int i11, int i12, int i13, int i14) {
        int i15 = this.f6016b;
        int[] iArrCopyOf = this.f6015a;
        int i16 = i15 + 4;
        if (i16 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f6015a = iArrCopyOf;
        }
        iArrCopyOf[i15] = i11;
        iArrCopyOf[i15 + 1] = i12;
        iArrCopyOf[i15 + 2] = i13;
        iArrCopyOf[i15 + 3] = i14;
        this.f6016b = i16;
    }

    public void f(int i11, int i12) {
        if (i11 < i12) {
            int i13 = i11 - 3;
            for (int i14 = i11; i14 < i12; i14 += 3) {
                int[] iArr = this.f6015a;
                int i15 = iArr[i14];
                int i16 = iArr[i12];
                if (i15 < i16 || (i15 == i16 && iArr[i14 + 1] <= iArr[i12 + 1])) {
                    i13 += 3;
                    g(i13, i14);
                }
            }
            g(i13 + 3, i12);
            f(i11, i13);
            f(i13 + 6, i12);
        }
    }

    public void g(int i11, int i12) {
        int[] iArr = this.f6015a;
        int i13 = iArr[i11];
        iArr[i11] = iArr[i12];
        iArr[i12] = i13;
        int i14 = i11 + 1;
        int i15 = i12 + 1;
        int i16 = iArr[i14];
        iArr[i14] = iArr[i15];
        iArr[i15] = i16;
        int i17 = i11 + 2;
        int i18 = i12 + 2;
        int i19 = iArr[i17];
        iArr[i17] = iArr[i18];
        iArr[i18] = i19;
    }

    public y(int i11) {
        this.f6015a = new int[i11];
    }
}
