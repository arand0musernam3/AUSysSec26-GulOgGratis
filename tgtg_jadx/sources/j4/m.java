package j4;

import i4.g0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f24574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f24575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float[] f24576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float[] f24577g;

    static {
        float[] fArrG = k.g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, k.c(a.f24525b.f24526a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f24574d = fArrG;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f24575e = fArr;
        f24576f = k.f(fArrG);
        f24577g = k.f(fArr);
    }

    @Override // j4.c
    public final float a(int i11) {
        return i11 == 0 ? 1.0f : 0.5f;
    }

    @Override // j4.c
    public final float b(int i11) {
        return i11 == 0 ? 0.0f : -0.5f;
    }

    @Override // j4.c
    public final long d(float f11, float f12, float f13) {
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        if (f12 > 0.5f) {
            f12 = 0.5f;
        }
        if (f13 < -0.5f) {
            f13 = -0.5f;
        }
        float f14 = f13 <= 0.5f ? f13 : 0.5f;
        float[] fArr = f24577g;
        float f15 = (fArr[6] * f14) + (fArr[3] * f12) + (fArr[0] * f11);
        float f16 = (fArr[7] * f14) + (fArr[4] * f12) + (fArr[1] * f11);
        float f17 = (fArr[8] * f14) + (fArr[5] * f12) + (fArr[2] * f11);
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float f20 = f17 * f17 * f17;
        float[] fArr2 = f24576f;
        return (((long) Float.floatToRawIntBits((fArr2[7] * f20) + (fArr2[4] * f19) + (fArr2[1] * f18))) & 4294967295L) | (((long) Float.floatToRawIntBits((fArr2[6] * f20) + ((fArr2[3] * f19) + (fArr2[0] * f18)))) << 32);
    }

    @Override // j4.c
    public final float e(float f11, float f12, float f13) {
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        if (f12 > 0.5f) {
            f12 = 0.5f;
        }
        if (f13 < -0.5f) {
            f13 = -0.5f;
        }
        float f14 = f13 <= 0.5f ? f13 : 0.5f;
        float[] fArr = f24577g;
        float f15 = (fArr[6] * f14) + (fArr[3] * f12) + (fArr[0] * f11);
        float f16 = (fArr[7] * f14) + (fArr[4] * f12) + (fArr[1] * f11);
        float f17 = (fArr[8] * f14) + (fArr[5] * f12) + (fArr[2] * f11);
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float f20 = f17 * f17 * f17;
        float[] fArr2 = f24576f;
        return (fArr2[8] * f20) + (fArr2[5] * f19) + (fArr2[2] * f18);
    }

    @Override // j4.c
    public final long f(float f11, float f12, float f13, float f14, c cVar) {
        float[] fArr = f24574d;
        float f15 = (fArr[6] * f13) + (fArr[3] * f12) + (fArr[0] * f11);
        float f16 = (fArr[7] * f13) + (fArr[4] * f12) + (fArr[1] * f11);
        float f17 = (fArr[8] * f13) + (fArr[5] * f12) + (fArr[2] * f11);
        float fN = ba0.g.n(f15);
        float fN2 = ba0.g.n(f16);
        float fN3 = ba0.g.n(f17);
        float[] fArr2 = f24575e;
        return g0.b((fArr2[6] * fN3) + (fArr2[3] * fN2) + (fArr2[0] * fN), (fArr2[7] * fN3) + (fArr2[4] * fN2) + (fArr2[1] * fN), (fArr2[8] * fN3) + (fArr2[5] * fN2) + (fArr2[2] * fN), f14, cVar);
    }
}
