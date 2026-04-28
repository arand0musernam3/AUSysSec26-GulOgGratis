package j2;

import b4.s;
import b5.b0;
import b5.m;
import b5.r1;
import b5.s1;
import kotlin.Unit;
import v80.f0;
import z1.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends s implements g5.a, b0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public z f24445o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f24446p;

    public static final h4.c L0(g gVar, s1 s1Var, r1 r1Var) {
        h4.c cVar;
        if (gVar.isAttached() && gVar.f24446p) {
            s1 s1VarF = m.f(gVar);
            if (!s1Var.n()) {
                s1Var = null;
            }
            if (s1Var != null && (cVar = (h4.c) r1Var.invoke()) != null) {
                return cVar.k(s1VarF.v(s1Var, false).f());
            }
        }
        return null;
    }

    @Override // g5.a
    public final Object S(s1 s1Var, r1 r1Var, z70.c cVar) {
        Object objN = f0.n(new af.a(this, s1Var, r1Var, new a0.g(this, s1Var, r1Var, 24), null, 1), cVar);
        return objN == y70.a.COROUTINE_SUSPENDED ? objN : Unit.f26487a;
    }

    @Override // b4.s
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // b5.b0
    public final void u(z4.z zVar) {
        this.f24446p = true;
    }
}
