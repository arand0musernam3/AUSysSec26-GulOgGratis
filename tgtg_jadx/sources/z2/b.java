package z2;

import m5.k0;
import m5.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static b f46797h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z5.m f46798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f46799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z5.d f46800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q5.h f46801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u0 f46802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f46803f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f46804g = Float.NaN;

    public b(z5.m mVar, u0 u0Var, z5.d dVar, q5.h hVar) {
        this.f46798a = mVar;
        this.f46799b = u0Var;
        this.f46800c = dVar;
        this.f46801d = hVar;
        this.f46802e = k0.k(u0Var, mVar);
    }

    public final long a(int i11, long j9) {
        int iJ;
        float f11 = this.f46804g;
        float f12 = this.f46803f;
        if (Float.isNaN(f11) || Float.isNaN(f12)) {
            String str = c.f46805a;
            long jB = z5.b.b(0, 0, 15);
            u0 u0Var = this.f46802e;
            z5.d dVar = this.f46800c;
            float fB = k0.a(str, u0Var, jB, dVar, this.f46801d, null, 1, 96).b();
            float fB2 = k0.a(c.f46806b, this.f46802e, z5.b.b(0, 0, 15), dVar, this.f46801d, null, 2, 96).b() - fB;
            this.f46804g = fB;
            this.f46803f = fB2;
            f12 = fB2;
            f11 = fB;
        }
        if (i11 != 1) {
            int iRound = Math.round((f12 * (i11 - 1)) + f11);
            iJ = iRound >= 0 ? iRound : 0;
            int iH = z5.a.h(j9);
            if (iJ > iH) {
                iJ = iH;
            }
        } else {
            iJ = z5.a.j(j9);
        }
        return z5.b.a(z5.a.k(j9), z5.a.i(j9), iJ, z5.a.h(j9));
    }
}
