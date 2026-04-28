package q5;

import m2.c2;
import m90.z0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ky.b f36022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f36023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oz.m f36024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f36025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ky.o f36026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z0 f36027f;

    public j(ky.b bVar, a aVar) {
        oz.m mVar = k.f36028a;
        m mVar2 = new m(k.f36029b);
        ky.o oVar = new ky.o(15);
        this.f36022a = bVar;
        this.f36023b = aVar;
        this.f36024c = mVar;
        this.f36025d = mVar2;
        this.f36026e = oVar;
        this.f36027f = new z0(this, 13);
    }

    public final g0 a(d0 d0Var) {
        oz.m mVar = this.f36024c;
        c2 c2Var = new c2(14, this, d0Var);
        synchronized (((l20.c) mVar.f33836b)) {
            g0 g0Var = (g0) ((q1.b0) mVar.f33837c).c(d0Var);
            if (g0Var != null) {
                if (g0Var.a()) {
                    return g0Var;
                }
            }
            try {
                g0 g0Var2 = (g0) c2Var.invoke(new c2(15, mVar, d0Var));
                synchronized (((l20.c) mVar.f33836b)) {
                    if (((q1.b0) mVar.f33837c).c(d0Var) == null && g0Var2.a()) {
                        ((q1.b0) mVar.f33837c).d(d0Var, g0Var2);
                    }
                }
                return g0Var2;
            } catch (Exception e5) {
                wy.o.k("Could not load font", e5);
                return null;
            }
        }
    }

    public final g0 b(i iVar, r rVar, int i11, int i12) {
        a aVar = this.f36023b;
        aVar.getClass();
        int i13 = aVar.f35990a;
        r rVar2 = (i13 == 0 || i13 == Integer.MAX_VALUE) ? rVar : new r(n80.p.c(rVar.f36049a + i13, 1, 1000));
        this.f36022a.getClass();
        return a(new d0(iVar, rVar2, i11, i12, null));
    }
}
