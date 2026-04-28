package g4;

import q1.j1;
import q1.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f19946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c5.y f19947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f19948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u0 f19949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19950e;

    public i(p pVar, c5.y yVar) {
        this.f19946a = pVar;
        this.f19947b = yVar;
        u0 u0Var = j1.f35777a;
        this.f19948c = new u0();
        this.f19949d = new u0();
    }

    public final void a() {
        if (this.f19950e) {
            return;
        }
        b40.d dVar = new b40.d(0, this, i.class, "invalidateNodes", "invalidateNodes()V", 0, 7);
        q1.o0 o0Var = this.f19947b.D1;
        if (o0Var.c(dVar) < 0) {
            o0Var.g(dVar);
        }
        this.f19950e = true;
    }
}
