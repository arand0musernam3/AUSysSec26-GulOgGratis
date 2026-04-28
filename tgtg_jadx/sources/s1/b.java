package s1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f38527a;

    static {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float[] fArr = new float[101];
        f38527a = fArr;
        float[] fArr2 = new float[101];
        float f20 = 0.0f;
        int i11 = 0;
        float f21 = 0.0f;
        while (true) {
            float f22 = 1.0f;
            if (i11 >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f23 = i11 / 100;
            float f24 = 1.0f;
            while (true) {
                f11 = ((f24 - f20) / 2.0f) + f20;
                f12 = f22 - f11;
                f13 = f11 * 3.0f * f12;
                f14 = f11 * f11 * f11;
                float f25 = (((f11 * 0.35000002f) + (f12 * 0.175f)) * f13) + f14;
                f15 = f22;
                if (Math.abs(f25 - f23) < 1.0E-5d) {
                    break;
                }
                if (f25 > f23) {
                    f24 = f11;
                } else {
                    f20 = f11;
                }
                f22 = f15;
            }
            float f26 = 0.5f;
            fArr[i11] = (((f12 * 0.5f) + f11) * f13) + f14;
            float f27 = f15;
            while (true) {
                f16 = ((f27 - f21) / 2.0f) + f21;
                f17 = f15 - f16;
                f18 = f16 * 3.0f * f17;
                f19 = f16 * f16 * f16;
                float f28 = (((f17 * f26) + f16) * f18) + f19;
                float f29 = f27;
                if (Math.abs(f28 - f23) >= 1.0E-5d) {
                    if (f28 > f23) {
                        f27 = f16;
                    } else {
                        f21 = f16;
                        f27 = f29;
                    }
                    f26 = 0.5f;
                }
            }
            fArr2[i11] = (((f16 * 0.35000002f) + (f17 * 0.175f)) * f18) + f19;
            i11++;
        }
    }

    public static a a(float f11) {
        float f12 = 0.0f;
        float f13 = 1.0f;
        float fB = n80.p.b(f11, 0.0f, 1.0f);
        float f14 = 100;
        int i11 = (int) (f14 * fB);
        if (i11 < 100) {
            float f15 = i11 / f14;
            int i12 = i11 + 1;
            float f16 = i12 / f14;
            float[] fArr = f38527a;
            float f17 = fArr[i11];
            float f18 = (fArr[i12] - f17) / (f16 - f15);
            float fA = j4.s.a(fB, f15, f18, f17);
            f12 = f18;
            f13 = fA;
        }
        return new a(f13, f12);
    }
}
