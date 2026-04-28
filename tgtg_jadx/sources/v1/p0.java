package v1;

import b5.l2;
import b5.q2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends b5.n implements l2, b5.s, b5.k, b5.y1, q2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f41814w = new b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b2.l f41815q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Function1 f41816r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b2.d f41817s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public h2.u0 f41818t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public z4.z f41819u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final g4.c0 f41820v;

    public p0(b2.l lVar, int i11, Function1 function1) {
        this.f41815q = lVar;
        this.f41816r = function1;
        g4.g0 g0Var = new g4.g0(i11, 10, new c6.y(2, this, p0.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 4));
        L0(g0Var);
        this.f41820v = g0Var;
    }

    public final void O0(b2.l lVar, b2.j jVar) {
        if (!isAttached()) {
            lVar.c(jVar);
            return;
        }
        v80.i1 i1Var = (v80.i1) getCoroutineScope().getCoroutineContext().get(v80.h1.f42106a);
        v80.f0.B(getCoroutineScope(), null, null, new tg.g(lVar, jVar, i1Var != null ? i1Var.J(new ry.b(20, lVar, jVar)) : null, null, 5), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void P0() {
        b5.l1 l1Var;
        if (isAttached()) {
            if (!getNode().isAttached()) {
                y4.a.b("visitAncestors called on an unattached node");
            }
            b4.s parent$ui = getNode().getParent$ui();
            b5.m0 m0VarG = b5.m.g(this);
            while (m0VarG != null) {
                if ((m0VarG.G.f5860f.getAggregateChildKindSet$ui() & 262144) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & 262144) != 0) {
                            ?? B = parent$ui;
                            ?? eVar = 0;
                            while (B != 0) {
                                if (B instanceof q2) {
                                    if (Intrinsics.areEqual(q0.f41825o, ((q2) B).g())) {
                                        return;
                                    }
                                } else if ((B.getKindSet$ui() & 262144) != 0 && (B instanceof b5.n)) {
                                    b4.s child$ui = ((b5.n) B).f5892p;
                                    int i11 = 0;
                                    B = B;
                                    eVar = eVar;
                                    while (child$ui != null) {
                                        if ((child$ui.getKindSet$ui() & 262144) != 0) {
                                            i11++;
                                            eVar = eVar;
                                            if (i11 == 1) {
                                                B = child$ui;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new o3.e(new b4.s[16], 0);
                                                }
                                                if (B != 0) {
                                                    eVar.b(B);
                                                    B = 0;
                                                }
                                                eVar.b(child$ui);
                                            }
                                        }
                                        child$ui = child$ui.getChild$ui();
                                        B = B;
                                        eVar = eVar;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                B = b5.m.b(eVar);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                m0VarG = m0VarG.w();
                parent$ui = (m0VarG == null || (l1Var = m0VarG.G) == null) ? null : l1Var.f5859e;
            }
        }
    }

    public final void Q0(b2.l lVar) {
        b2.d dVar;
        if (Intrinsics.areEqual(this.f41815q, lVar)) {
            return;
        }
        b2.l lVar2 = this.f41815q;
        if (lVar2 != null && (dVar = this.f41817s) != null) {
            lVar2.c(new b2.e(dVar));
        }
        this.f41817s = null;
        this.f41815q = lVar;
    }

    @Override // b5.q2
    public final Object g() {
        return f41814w;
    }

    @Override // b4.s
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // b5.l2
    public final void h0(j5.b0 b0Var) {
        boolean zC = ((g4.g0) this.f41820v).Q0().c();
        KProperty[] kPropertyArr = j5.z.f24734a;
        j5.a0 a0Var = j5.x.f24717k;
        KProperty kProperty = j5.z.f24734a[4];
        b0Var.b(a0Var, Boolean.valueOf(zC));
        b0Var.b(j5.m.f24678w, new j5.a(null, new b40.d(0, this, p0.class, "requestFocus", "requestFocus()Z", 0, 18)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b5.y1
    public final void l0() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        b5.o.m(this, new us.j(3, objectRef, this));
        h2.u0 u0Var = (h2.u0) objectRef.element;
        if (((g4.g0) this.f41820v).Q0().c()) {
            h2.u0 u0Var2 = this.f41818t;
            if (u0Var2 != null) {
                u0Var2.b();
            }
            if (u0Var != null) {
                u0Var.a();
            } else {
                u0Var = null;
            }
            this.f41818t = u0Var;
        }
    }

    @Override // b4.s
    public final void onReset() {
        h2.u0 u0Var = this.f41818t;
        if (u0Var != null) {
            u0Var.b();
        }
        this.f41818t = null;
    }

    @Override // b5.s
    public final void v(z4.z zVar) {
        this.f41819u = zVar;
        if (((g4.g0) this.f41820v).Q0().c()) {
            if (!zVar.n()) {
                P0();
                return;
            }
            z4.z zVar2 = this.f41819u;
            if (zVar2 == null || !zVar2.n()) {
                return;
            }
            P0();
        }
    }

    public /* synthetic */ p0(b2.l lVar, w2.z0 z0Var, int i11) {
        this(lVar, 1, (i11 & 4) != 0 ? null : z0Var);
    }
}
