package m3;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends u3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v80.l f29258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function1 f29259b;

    @Override // u3.b
    public final void a() {
        this.f29259b = null;
        this.f29258a = null;
    }

    @Override // u3.b
    public final void b(Throwable th2) {
        v80.l lVar = this.f29258a;
        if (lVar != null) {
            u70.o oVar = u70.q.f40850b;
            lVar.resumeWith(ba0.g.j(th2));
        }
    }
}
