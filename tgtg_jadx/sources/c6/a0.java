package c6;

import b5.y1;
import g4.g0;
import h2.u0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends b5.n implements y1, b5.k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g0 f7671q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u0 f7672r;

    public a0() {
        g0 g0Var = new g0(0, 9, new y(2, this, a0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0));
        L0(g0Var);
        this.f7671q = g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b5.y1
    public final void l0() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        b5.o.m(this, new z(objectRef, this));
        u0 u0Var = (u0) objectRef.element;
        if (this.f7671q.Q0().c()) {
            u0 u0Var2 = this.f7672r;
            if (u0Var2 != null) {
                u0Var2.b();
            }
            if (u0Var != null) {
                u0Var.a();
            } else {
                u0Var = null;
            }
            this.f7672r = u0Var;
        }
    }
}
