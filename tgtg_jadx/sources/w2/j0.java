package w2;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f42945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42946b;

    public static long b(int i11, int i12, int i13, int i14, boolean z11) {
        int i15 = z11 ? i13 : i14;
        if (z11) {
            i13 = i14;
        }
        if (i11 < i12) {
            return m5.k0.b(i11, i11);
        }
        if (i11 == i12) {
            return i15 == 0 ? m5.k0.b(i12, i13 + i12) : m5.k0.b(i12, i12);
        }
        if (i11 < i12 + i15) {
            return i13 == 0 ? m5.k0.b(i12, i12) : m5.k0.b(i12, i13 + i12);
        }
        int i16 = (i11 - i15) + i13;
        return m5.k0.b(i16, i16);
    }

    public final long a(int i11, boolean z11) {
        int iMin;
        int iMax;
        int[] iArr = this.f42945a;
        int i12 = this.f42946b;
        if (i12 < 0) {
            iMin = i11;
            iMax = iMin;
        } else if (z11) {
            int iMax2 = i11;
            int i13 = 0;
            int i14 = iMax2;
            while (i13 < i12) {
                int i15 = i13 * 3;
                int i16 = iArr[i15];
                int i17 = iArr[i15 + 1];
                int i18 = iArr[i15 + 2];
                long jB = b(i14, i16, i17, i18, z11);
                long jB2 = b(iMax2, i16, i17, i18, z11);
                int i19 = m5.t0.f29649c;
                int iMin2 = Math.min((int) (jB >> 32), (int) (jB2 >> 32));
                iMax2 = Math.max((int) (jB & 4294967295L), (int) (jB2 & 4294967295L));
                i13++;
                i14 = iMin2;
            }
            iMin = i14;
            iMax = iMax2;
        } else {
            iMax = i11;
            iMin = iMax;
            for (int i21 = i12 - 1; -1 < i21; i21--) {
                int i22 = i21 * 3;
                int i23 = iArr[i22];
                int i24 = iArr[i22 + 1];
                int i25 = iArr[i22 + 2];
                long jB3 = b(iMin, i23, i24, i25, z11);
                long jB4 = b(iMax, i23, i24, i25, z11);
                int i26 = m5.t0.f29649c;
                iMin = Math.min((int) (jB3 >> 32), (int) (jB4 >> 32));
                iMax = Math.max((int) (jB3 & 4294967295L), (int) (jB4 & 4294967295L));
            }
        }
        return m5.k0.b(iMin, iMax);
    }

    public final void c(int i11, int i12, int i13) {
        if (i13 < 0) {
            c2.a.a("Expected newLen to be ≥ 0, was " + i13);
        }
        int iMin = Math.min(i11, i12);
        int iMax = Math.max(iMin, i12) - iMin;
        if (iMax >= 2 || iMax != i13) {
            int i14 = this.f42946b + 1;
            int[] iArr = this.f42945a;
            if (i14 > iArr.length / 3) {
                this.f42945a = Arrays.copyOf(this.f42945a, Math.max(i14 * 2, (iArr.length / 3) * 2) * 3);
            }
            int[] iArr2 = this.f42945a;
            int i15 = this.f42946b * 3;
            iArr2[i15] = iMin;
            iArr2[i15 + 1] = iMax;
            iArr2[i15 + 2] = i13;
            this.f42946b = i14;
        }
    }
}
