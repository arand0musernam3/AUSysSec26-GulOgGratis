package z3;

import kotlin.jvm.functions.Function1;
import t1.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    @Override // z3.c
    public final c C(Function1 function1, Function1 function12) {
        return (c) ((g) l.e(new h1(new a(0, function12, function1), 6)));
    }

    @Override // z3.c, z3.g
    public final void c() {
        synchronized (l.f47038c) {
            o();
        }
    }

    @Override // z3.c, z3.g
    public final void k() {
        v.g();
        throw null;
    }

    @Override // z3.c, z3.g
    public final void l() {
        v.g();
        throw null;
    }

    @Override // z3.c, z3.g
    public final void m() {
        l.a();
    }

    @Override // z3.c, z3.g
    public final g u(Function1 function1) {
        return (f) ((g) l.e(new h1(new gn.n(function1, 9), 6)));
    }

    @Override // z3.c
    public final v w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
