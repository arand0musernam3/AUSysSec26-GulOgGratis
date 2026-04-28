package f0;

import android.hardware.camera2.CameraManager;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0.n f16926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CameraManager f16928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a90.d f16929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r80.a f16930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y80.a2 f16931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y80.h1 f16932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y80.m1 f16933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y80.g1 f16934i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y80.c f16935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v80.b2 f16936k;

    public v0(t70.a aVar, h0.n nVar, String str, v80.i1 i1Var) {
        aVar.getClass();
        str.getClass();
        this.f16926a = nVar;
        this.f16927b = str;
        this.f16928c = (CameraManager) aVar.get();
        a90.d dVarB = v80.f0.b(kotlin.coroutines.e.c(new v80.d2(i1Var), nVar.f20988h.plus(new v80.a0("CXCP-CameraStatusMonitor"))));
        this.f16929d = dVarB;
        this.f16930e = w.b.p(false);
        y80.a2 a2VarC = y80.r.c(j0.l.f24300a);
        this.f16931f = a2VarC;
        this.f16932g = new y80.h1(a2VarC);
        x70.c cVar = null;
        y80.m1 m1VarB = y80.r.b(0, 0, null, 7);
        this.f16933h = m1VarB;
        this.f16934i = new y80.g1(m1VarB);
        this.f16935j = y80.r.f(new d8.c(this, cVar, 16));
        this.f16936k = v80.f0.B(dVarB, null, null, new a3.b2(this, cVar, 17), 3);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f16930e.a()) {
            this.f16936k.a(null);
            v80.f0.j(this.f16929d, null);
        }
    }
}
