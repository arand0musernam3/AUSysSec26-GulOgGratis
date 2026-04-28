package w6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k f43259k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f43260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f43261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f43262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f43263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f43264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f43265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f43266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f43267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f43268i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f43269j;

    static {
        float[] fArr = a.f43234c;
        float fN = (float) ((((double) a.n()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = a.f43232a;
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
        float f19 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fN) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d3 = fExp;
        if (d3 > 1.0d) {
            fExp = 1.0f;
        } else if (d3 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f16) * fExp) + 1.0f) - fExp, (((100.0f / f17) * fExp) + 1.0f) - fExp, (((100.0f / f18) * fExp) + 1.0f) - fExp};
        float f20 = 1.0f / ((5.0f * fN) + 1.0f);
        float f21 = f20 * f20 * f20 * f20;
        float f22 = 1.0f - f21;
        float fCbrt = (0.1f * f22 * f22 * ((float) Math.cbrt(((double) fN) * 5.0d))) + (f21 * fN);
        float fN2 = a.n() / fArr[1];
        double d11 = fN2;
        float fSqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f16)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f17)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f18)) / 100.0d, 0.42d)};
        float f23 = fArr7[0];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr7[1];
        float f26 = (f25 * 400.0f) / (f25 + 27.13f);
        float f27 = fArr7[2];
        float[] fArr8 = {f24, f26, (400.0f * f27) / (f27 + 27.13f)};
        f43259k = new k(fN2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f19, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public k(float f11, float f12, float f13, float f14, float f15, float f16, float[] fArr, float f17, float f18, float f19) {
        this.f43265f = f11;
        this.f43260a = f12;
        this.f43261b = f13;
        this.f43262c = f14;
        this.f43263d = f15;
        this.f43264e = f16;
        this.f43266g = fArr;
        this.f43267h = f17;
        this.f43268i = f18;
        this.f43269j = f19;
    }
}
