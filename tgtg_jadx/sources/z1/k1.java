package z1;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends f1 {
    public c0 I;
    public h2 J;
    public boolean K;
    public i80.n L;
    public i80.n M;
    public boolean N;

    @Override // z1.f1
    public final Object S0(d1 d1Var, e1 e1Var) {
        c0 c0Var = this.I;
        v1.j1 j1Var = v1.j1.UserInput;
        tg.g gVar = new tg.g(d1Var, this, null, 28);
        c0Var.getClass();
        Object objN = v80.f0.n(new tg.g(c0Var, j1Var, gVar, null, 25), e1Var);
        if (objN != y70.a.COROUTINE_SUSPENDED) {
            objN = Unit.f26487a;
        }
        return objN == y70.a.COROUTINE_SUSPENDED ? objN : Unit.f26487a;
    }

    @Override // z1.f1
    public final void X0(long j9) {
        if (!isAttached() || Intrinsics.areEqual(this.L, j1.f46557a)) {
            return;
        }
        v80.f0.B(getCoroutineScope(), null, v80.d0.UNDISPATCHED, new f0.q2(this, j9, (x70.c) null), 1);
    }

    @Override // z1.f1
    public final void Y0(p0 p0Var) {
        if (!isAttached() || Intrinsics.areEqual(this.M, j1.f46558b)) {
            return;
        }
        v80.f0.B(getCoroutineScope(), null, v80.d0.UNDISPATCHED, new tg.g(this, p0Var, null, 29), 1);
    }

    @Override // z1.f1
    public final boolean d1() {
        return this.K;
    }
}
