package d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f13801a = new b(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f13802b = new b(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f13803c = new d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f13804d = new d(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f13805e = new e(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f13806f = new e(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f13807g = new e(2);

    static {
        new e(1);
    }

    public static void a(int i11, int[] iArr, int[] iArr2, boolean z11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 : iArr) {
            i13 += i14;
        }
        float f11 = (i11 - i13) / 2;
        if (!z11) {
            int length = iArr.length;
            int i15 = 0;
            while (i12 < length) {
                int i16 = iArr[i12];
                iArr2[i15] = Math.round(f11);
                f11 += i16;
                i12++;
                i15++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i17 = iArr[length2];
            iArr2[length2] = Math.round(f11);
            f11 += i17;
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z11) {
        int i11 = 0;
        if (!z11) {
            int length = iArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i11 < length) {
                int i14 = iArr[i11];
                iArr2[i12] = i13;
                i13 += i14;
                i11++;
                i12++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i15 = iArr[length2];
            iArr2[length2] = i11;
            i11 += i15;
        }
    }

    public static void c(int i11, int[] iArr, int[] iArr2, boolean z11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 : iArr) {
            i13 += i14;
        }
        int i15 = i11 - i13;
        if (!z11) {
            int length = iArr.length;
            int i16 = 0;
            while (i12 < length) {
                int i17 = iArr[i12];
                iArr2[i16] = i15;
                i15 += i17;
                i12++;
                i16++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i18 = iArr[length2];
            iArr2[length2] = i15;
            i15 += i18;
        }
    }

    public static void d(int i11, int[] iArr, int[] iArr2, boolean z11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 : iArr) {
            i13 += i14;
        }
        float length = iArr.length == 0 ? 0.0f : (i11 - i13) / iArr.length;
        float f11 = length / 2;
        if (!z11) {
            int length2 = iArr.length;
            int i15 = 0;
            while (i12 < length2) {
                int i16 = iArr[i12];
                iArr2[i15] = Math.round(f11);
                f11 += i16 + length;
                i12++;
                i15++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i17 = iArr[length3];
            iArr2[length3] = Math.round(f11);
            f11 += i17 + length;
        }
    }

    public static void e(int i11, int[] iArr, int[] iArr2, boolean z11) {
        if (iArr.length == 0) {
            return;
        }
        int i12 = 0;
        int i13 = 0;
        for (int i14 : iArr) {
            i13 += i14;
        }
        float fMax = (i11 - i13) / Math.max(iArr.length - 1, 1);
        float f11 = (z11 && iArr.length == 1) ? fMax : 0.0f;
        if (z11) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i15 = iArr[length];
                iArr2[length] = Math.round(f11);
                f11 += i15 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i16 = 0;
        while (i12 < length2) {
            int i17 = iArr[i12];
            iArr2[i16] = Math.round(f11);
            f11 += i17 + fMax;
            i12++;
            i16++;
        }
    }

    public static void f(int i11, int[] iArr, int[] iArr2, boolean z11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 : iArr) {
            i13 += i14;
        }
        float length = (i11 - i13) / (iArr.length + 1);
        if (z11) {
            float f11 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i15 = iArr[length2];
                iArr2[length2] = Math.round(f11);
                f11 += i15 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f12 = length;
        int i16 = 0;
        while (i12 < length3) {
            int i17 = iArr[i12];
            iArr2[i16] = Math.round(f12);
            f12 += i17 + length;
            i12++;
            i16++;
        }
    }

    public static g g(float f11) {
        return new g(f11, true, new cn.u(8, (byte) 0));
    }

    public static g h(float f11, b4.i iVar) {
        return new g(f11, true, new a3.f1(iVar, 18));
    }
}
