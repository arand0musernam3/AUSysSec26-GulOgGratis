package xg;

import mv.m0;
import y80.a2;
import y80.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f44301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f44302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2 f44303c;

    public x(y yVar, zg.a aVar) {
        yVar.getClass();
        aVar.getClass();
        this.f44301a = yVar;
        this.f44302b = y80.r.a(0, 2, x80.a.DROP_OLDEST);
        this.f44303c = y80.r.c(a0.f44258a);
    }

    public final void a(p30.b bVar) {
        m0 m0Var = sa0.a.f38953a;
        m0Var.h("Authentication");
        m0Var.a("Event: " + bVar, new Object[0]);
        this.f44302b.i(bVar);
    }
}
