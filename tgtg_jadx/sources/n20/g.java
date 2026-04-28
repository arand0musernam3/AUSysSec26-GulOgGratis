package n20;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f30309b;

    public g(float f11) {
        super(0);
        this.f30309b = f11 - 0.001f;
    }

    @Override // n20.f
    public final void u(float f11, float f12, float f13, y yVar) {
        double d3 = this.f30309b;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d3) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d3, 2.0d) - Math.pow(fSqrt, 2.0d));
        yVar.e(f12 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d3) - d3))) + fSqrt2, 270.0f, 0.0f);
        yVar.d(f12, (float) (-((Math.sqrt(2.0d) * d3) - d3)));
        yVar.d(f12 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d3) - d3))) + fSqrt2);
    }
}
