package o10;

import j4.s;
import n20.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends n20.f implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f31803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f31804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f31805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f31806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f31807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f31808g;

    @Override // n20.f
    public final void u(float f11, float f12, float f13, y yVar) {
        float f14;
        float f15;
        float f16 = this.f31805d;
        if (f16 == 0.0f) {
            yVar.d(f11, 0.0f);
            return;
        }
        float f17 = ((this.f31804c * 2.0f) + f16) / 2.0f;
        float f18 = f13 * this.f31803b;
        float f19 = f12 + this.f31807f;
        float fA = s.a(1.0f, f13, f17, this.f31806e * f13);
        if (fA / f17 >= 1.0f) {
            yVar.d(f11, 0.0f);
            return;
        }
        float f20 = this.f31808g;
        float f21 = f20 * f13;
        boolean z11 = f20 == -1.0f || Math.abs((f20 * 2.0f) - f16) < 0.1f;
        if (z11) {
            f14 = fA;
            f15 = 0.0f;
        } else {
            f15 = 1.75f;
            f14 = 0.0f;
        }
        float f22 = f17 + f18;
        float f23 = f14 + f18;
        float fSqrt = (float) Math.sqrt((f22 * f22) - (f23 * f23));
        float f24 = f19 - fSqrt;
        float f25 = f19 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f23));
        float f26 = (90.0f - degrees) + f15;
        yVar.d(f24, 0.0f);
        float f27 = f24 - f18;
        float f28 = f24 + f18;
        float f29 = f18 * 2.0f;
        yVar.a(f27, 0.0f, f28, f29, 270.0f, degrees);
        if (z11) {
            yVar.a(f19 - f17, (-f17) - f14, f19 + f17, f17 - f14, 180.0f - f26, (f26 * 2.0f) - 180.0f);
        } else {
            float f31 = this.f31804c;
            float f32 = f21 * 2.0f;
            float f33 = f31 + f32;
            float f34 = f19 - f17;
            yVar.a(f34, -(f21 + f31), f33 + f34, f31 + f21, 180.0f - f26, ((f26 * 2.0f) - 180.0f) / 2.0f);
            float f35 = f19 + f17;
            float f36 = this.f31804c;
            yVar.d(f35 - ((f36 / 2.0f) + f21), f36 + f21);
            float f37 = this.f31804c;
            yVar.a(f35 - (f32 + f37), -(f21 + f37), f35, f37 + f21, 90.0f, f26 - 90.0f);
        }
        yVar.a(f25 - f18, 0.0f, f25 + f18, f29, 270.0f - degrees, degrees);
        yVar.d(f11, 0.0f);
    }

    public final void y(float f11) {
        if (f11 >= 0.0f) {
            this.f31806e = f11;
        } else {
            i4.a.f("cradleVerticalOffset must be positive.");
        }
    }
}
