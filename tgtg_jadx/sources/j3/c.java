package j3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f24486k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f24487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f24488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f24491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f24492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f24493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f24494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f24495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f24496j;

    static {
        float[] fArr = b.f24479c;
        float fPow = (float) (((Math.pow(0.5689655172413793d, 3.0d) * 100.0d) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f24477a;
        float f11 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f12 = fArr3[0] * f11;
        float f13 = fArr[1];
        float f14 = (fArr3[1] * f13) + f12;
        float f15 = fArr[2];
        float f16 = (fArr3[2] * f15) + f14;
        float[] fArr4 = fArr2[1];
        float f17 = (fArr4[2] * f15) + (fArr4[1] * f13) + (fArr4[0] * f11);
        float[] fArr5 = fArr2[2];
        float f18 = (f15 * fArr5[2]) + (f13 * fArr5[1]) + (f11 * fArr5[0]);
        float f19 = ((double) 1.0f) >= 0.9d ? 0.69000006f : 0.6549999f;
        float fExp = (1.0f - (((float) Math.exp(((-fPow) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d3 = fExp;
        if (d3 > 1.0d) {
            fExp = 1.0f;
        } else if (d3 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f16) * fExp) + 1.0f) - fExp, (((100.0f / f17) * fExp) + 1.0f) - fExp, (((100.0f / f18) * fExp) + 1.0f) - fExp};
        float f20 = 1.0f / ((5.0f * fPow) + 1.0f);
        float f21 = f20 * f20 * f20 * f20;
        float f22 = 1.0f - f21;
        float fCbrt = (0.1f * f22 * f22 * ((float) Math.cbrt(((double) fPow) * 5.0d))) + (f21 * fPow);
        double d11 = 50.0f;
        float fPow2 = ((float) (d11 > 8.0d ? Math.pow((d11 + 16.0d) / 116.0d, 3.0d) * 100.0d : (d11 / 903.2962962962963d) * 100.0d)) / fArr[1];
        double d12 = fPow2;
        float fSqrt = ((float) Math.sqrt(d12)) + 1.48f;
        float fPow3 = 0.725f / ((float) Math.pow(d12, 0.2f));
        double d13 = 0.42f;
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * fCbrt) * f16) / 100.0f, d13), (float) Math.pow(((fArr6[1] * fCbrt) * f17) / 100.0f, d13), (float) Math.pow(((fArr6[2] * fCbrt) * f18) / 100.0f, d13)};
        float f23 = fArr7[0];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr7[1];
        float f26 = (f25 * 400.0f) / (f25 + 27.13f);
        float f27 = fArr7[2];
        float[] fArr8 = {f24, f26, (400.0f * f27) / (f27 + 27.13f)};
        f24486k = new c(fPow2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow3, fPow3, fPow3, f19, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25f), fSqrt);
    }

    public c(float f11, float f12, float f13, float f14, float f15, float f16, float[] fArr, float f17, float f18, float f19) {
        this.f24487a = f11;
        this.f24488b = f12;
        this.f24489c = f13;
        this.f24490d = f14;
        this.f24491e = f15;
        this.f24492f = f16;
        this.f24493g = fArr;
        this.f24494h = f17;
        this.f24495i = f18;
        this.f24496j = f19;
    }
}
