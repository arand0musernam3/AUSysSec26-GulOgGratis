package b5;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b4.s implements c0, r, l2, i2, a5.c, g2, b0, s, g4.g, g4.u, g4.x, e2, f4.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b4.r f5760o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public HashSet f5761p;

    @Override // b5.i2
    public final void F() {
        b4.r rVar = this.f5760o;
        rVar.getClass();
        com.google.firebase.messaging.a0 a0Var = ((w4.b0) rVar).f43105d;
        w4.z zVar = (w4.z) a0Var.f12780c;
        w4.b0 b0Var = (w4.b0) a0Var.f12782e;
        if (zVar == w4.z.Dispatching) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            w4.a0 a0Var2 = new w4.a0(b0Var, 0);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            a0Var2.invoke(motionEventObtain);
            motionEventObtain.recycle();
            a0Var.f12780c = w4.z.Unknown;
            b0Var.f43104c = false;
            a0Var.f12781d = null;
        }
    }

    @Override // b5.r
    public final void K() {
        o.h(this);
    }

    public final void L0(boolean z11) {
        if (!isAttached()) {
            y4.a.b("initializeModifier called on unattached node");
        }
        b4.r rVar = this.f5760o;
        getKindSet$ui();
        if ((getKindSet$ui() & 4) != 0 && !z11) {
            m.e(this, 2).k1();
        }
        if ((getKindSet$ui() & 2) != 0) {
            d dVar = e.f5793a;
            n2 n2Var = m.g(this).G.f5859e;
            n2Var.getClass();
            if (n2Var.f5906o) {
                s1 coordinator$ui = getCoordinator$ui();
                coordinator$ui.getClass();
                ((e0) coordinator$ui).F1(this);
                c2 c2Var = coordinator$ui.M;
                if (c2Var != null) {
                    ((c5.f2) c2Var).c();
                }
            }
            if (!z11) {
                m.e(this, 2).k1();
                m.g(this).F();
            }
        }
        if (rVar instanceof f2.a0) {
            f2.a0 a0Var = (f2.a0) rVar;
            m0 m0VarG = m.g(this);
            switch (a0Var.f17058a) {
                case 0:
                    ((f2.c0) a0Var.f17059b).f17098k = m0VarG;
                    break;
                case 1:
                    ((g2.b0) a0Var.f17059b).f18135j = m0VarG;
                    break;
                default:
                    ((i2.e0) a0Var.f17059b).f22842y.setValue(m0VarG);
                    break;
            }
        }
        getKindSet$ui();
        getKindSet$ui();
        if ((getKindSet$ui() & 256) != 0 && (rVar instanceof x2.g)) {
            d dVar2 = e.f5793a;
            n2 n2Var2 = m.g(this).G.f5859e;
            n2Var2.getClass();
            if (n2Var2.f5906o) {
                m.g(this).F();
            }
        }
        if ((getKindSet$ui() & 16) != 0 && (rVar instanceof w4.b0)) {
            ((w4.b0) rVar).f43105d.f12779b = getCoordinator$ui();
        }
        if ((getKindSet$ui() & 8) != 0) {
            ((c5.y) m.h(this)).B();
        }
    }

    public final void M0() {
        if (!isAttached()) {
            y4.a.b("unInitializeModifier called on unattached node");
        }
        getKindSet$ui();
        if ((getKindSet$ui() & 8) != 0) {
            ((c5.y) m.h(this)).B();
        }
    }

    @Override // b5.i2
    public final void N() {
        b4.r rVar = this.f5760o;
        rVar.getClass();
        ((w4.b0) rVar).f43105d.getClass();
    }

    @Override // a5.c
    public final a5.a U() {
        return a5.a.f815a;
    }

    @Override // f4.a
    public final z5.c a() {
        return m.g(this).f5889z;
    }

    @Override // b5.g2
    public final Object b(z5.c cVar, Object obj) {
        b4.r rVar = this.f5760o;
        rVar.getClass();
        return ((z4.j1) rVar).b(cVar, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // a5.c
    public final Object b0(se.b bVar) {
        l1 l1Var;
        this.f5761p.add(bVar);
        if (!getNode().isAttached()) {
            y4.a.b("visitAncestors called on an unattached node");
        }
        b4.s parent$ui = getNode().getParent$ui();
        m0 m0VarG = m.g(this);
        while (m0VarG != null) {
            if ((m0VarG.G.f5860f.getAggregateChildKindSet$ui() & 32) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 32) != 0) {
                        ?? B = parent$ui;
                        ?? eVar = 0;
                        while (B != 0) {
                            if (B instanceof a5.c) {
                                a5.c cVar = (a5.c) B;
                                if (cVar.U().a()) {
                                    cVar.U().b();
                                    throw null;
                                }
                            } else if ((B.getKindSet$ui() & 32) != 0 && (B instanceof n)) {
                                b4.s child$ui = ((n) B).f5892p;
                                int i11 = 0;
                                B = B;
                                eVar = eVar;
                                while (child$ui != null) {
                                    if ((child$ui.getKindSet$ui() & 32) != 0) {
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
                            B = m.b(eVar);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            m0VarG = m0VarG.w();
            parent$ui = (m0VarG == null || (l1Var = m0VarG.G) == null) ? null : l1Var.f5859e;
        }
        return ((Function0) bVar.f39010b).invoke();
    }

    @Override // f4.a
    public final long d() {
        return b0.z.z(m.e(this, 128).f47185c);
    }

    @Override // g4.g
    public final void e0(g4.z zVar) {
        b4.r rVar = this.f5760o;
        y4.a.b("onFocusEvent called on wrong node");
        rVar.getClass();
        throw new ClassCastException();
    }

    @Override // f4.a
    public final z5.m getLayoutDirection() {
        return m.g(this).A;
    }

    @Override // b5.l2
    public final void h0(j5.b0 b0Var) {
        int i11;
        b4.r rVar = this.f5760o;
        rVar.getClass();
        j5.n nVarH0 = ((j5.q) rVar).H0();
        b0Var.getClass();
        j5.n nVar = (j5.n) b0Var;
        q1.t0 t0Var = nVar.f24682a;
        if (nVarH0.f24684c) {
            nVar.f24684c = true;
        }
        if (nVarH0.f24685d) {
            nVar.f24685d = true;
        }
        q1.t0 t0Var2 = nVarH0.f24682a;
        Object[] objArr = t0Var2.f35753b;
        Object[] objArr2 = t0Var2.f35754c;
        long[] jArr = t0Var2.f35752a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j9 = jArr[i12];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i12 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((255 & j9) < 128) {
                        int i16 = (i12 << 3) + i15;
                        Object obj = objArr[i16];
                        Object obj2 = objArr2[i16];
                        j5.a0 a0Var = (j5.a0) obj;
                        if (!t0Var.a(a0Var)) {
                            t0Var.m(a0Var, obj2);
                        } else if (obj2 instanceof j5.a) {
                            Object objD = t0Var.d(a0Var);
                            objD.getClass();
                            j5.a aVar = (j5.a) objD;
                            i11 = i13;
                            String str = aVar.f24609a;
                            if (str == null) {
                                str = ((j5.a) obj2).f24609a;
                            }
                            u70.f fVar = aVar.f24610b;
                            if (fVar == null) {
                                fVar = ((j5.a) obj2).f24610b;
                            }
                            t0Var.m(a0Var, new j5.a(str, fVar));
                        }
                        i11 = i13;
                    } else {
                        i11 = i13;
                    }
                    j9 >>= i11;
                    i15++;
                    i13 = i11;
                }
                if (i14 != i13) {
                    return;
                }
            }
            if (i12 == length) {
                return;
            } else {
                i12++;
            }
        }
    }

    @Override // b5.c0
    public final int maxIntrinsicHeight(z4.u uVar, z4.t tVar, int i11) {
        b4.r rVar = this.f5760o;
        rVar.getClass();
        return ((z4.g0) rVar).mo964measure3p2s80s(new z4.y(uVar, uVar.getLayoutDirection()), new u1(tVar, z4.x0.Max, z4.y0.Height, 2), z5.b.b(i11, 0, 13)).getHeight();
    }

    @Override // b5.c0
    public final int maxIntrinsicWidth(z4.u uVar, z4.t tVar, int i11) {
        b4.r rVar = this.f5760o;
        rVar.getClass();
        return ((z4.g0) rVar).mo964measure3p2s80s(new z4.y(uVar, uVar.getLayoutDirection()), new u1(tVar, z4.x0.Max, z4.y0.Width, 2), z5.b.b(0, i11, 7)).b();
    }

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo58measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        b4.r rVar = this.f5760o;
        rVar.getClass();
        return ((z4.g0) rVar).mo964measure3p2s80s(w0Var, t0Var, j9);
    }

    @Override // b5.c0
    public final int minIntrinsicHeight(z4.u uVar, z4.t tVar, int i11) {
        b4.r rVar = this.f5760o;
        rVar.getClass();
        return ((z4.g0) rVar).mo964measure3p2s80s(new z4.y(uVar, uVar.getLayoutDirection()), new u1(tVar, z4.x0.Min, z4.y0.Height, 2), z5.b.b(i11, 0, 13)).getHeight();
    }

    @Override // b5.c0
    public final int minIntrinsicWidth(z4.u uVar, z4.t tVar, int i11) {
        b4.r rVar = this.f5760o;
        rVar.getClass();
        return ((z4.g0) rVar).mo964measure3p2s80s(new z4.y(uVar, uVar.getLayoutDirection()), new u1(tVar, z4.x0.Min, z4.y0.Width, 2), z5.b.b(0, i11, 7)).b();
    }

    @Override // b5.r
    public final void n(o0 o0Var) {
        b4.r rVar = this.f5760o;
        rVar.getClass();
        o0Var.b();
    }

    @Override // b4.s
    public final void onAttach() {
        L0(true);
    }

    @Override // b5.l, b5.i2
    public final void onDensityChange() {
        if (this.f5760o instanceof w4.b0) {
            F();
        }
    }

    @Override // b4.s
    public final void onDetach() {
        M0();
    }

    @Override // b5.i2
    public final void p0(w4.n nVar, w4.o oVar, long j9) {
        boolean z11;
        boolean z12;
        boolean z13;
        b4.r rVar = this.f5760o;
        rVar.getClass();
        com.google.firebase.messaging.a0 a0Var = ((w4.b0) rVar).f43105d;
        w4.b0 b0Var = (w4.b0) a0Var.f12782e;
        List list = nVar.f43165a;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            w4.v vVar = (w4.v) list.get(i11);
            if (w4.u.b(vVar) || w4.u.d(vVar)) {
                z11 = false;
                break;
            }
        }
        z11 = true;
        if (!z11) {
            z12 = false;
            break;
        }
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            if (((w4.v) list.get(i12)).b()) {
                z12 = false;
                break;
            }
        }
        z12 = true;
        if (b0Var.f43104c) {
            z13 = true;
        } else {
            int size3 = list.size();
            int i13 = 0;
            while (true) {
                if (i13 < size3) {
                    w4.v vVar2 = (w4.v) list.get(i13);
                    if (w4.u.b(vVar2) || w4.u.d(vVar2)) {
                        break;
                    } else {
                        i13++;
                    }
                } else if (z12) {
                    break;
                } else {
                    z13 = false;
                }
            }
            z13 = true;
        }
        if (((w4.z) a0Var.f12780c) != w4.z.NotDispatching) {
            if (oVar == w4.o.Initial && z13) {
                a0Var.f12781d = nVar;
                a0Var.D(nVar, !z11 || b0Var.f43104c);
            }
            if (oVar == w4.o.Main && z11 && Intrinsics.areEqual(nVar, (w4.n) a0Var.f12781d) && b0Var.f43104c) {
                int size4 = list.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    ((w4.v) list.get(i14)).a();
                }
            }
            if (oVar == w4.o.Final && !z13 && !Intrinsics.areEqual(nVar, (w4.n) a0Var.f12781d)) {
                a0Var.D(nVar, true);
            }
        }
        if (oVar == w4.o.Final) {
            int size5 = list.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size5) {
                    a0Var.f12780c = w4.z.Unknown;
                    ((w4.b0) a0Var.f12782e).f43104c = false;
                    a0Var.f12781d = null;
                    break;
                } else if (!w4.u.d((w4.v) list.get(i15))) {
                    break;
                } else {
                    i15++;
                }
            }
            if (Intrinsics.areEqual(nVar, (w4.n) a0Var.f12781d) && z11) {
                int size6 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size6) {
                        break;
                    }
                    if (!((w4.v) list.get(i16)).b()) {
                        i16++;
                    } else if (!b0Var.f43104c) {
                        a0Var.Z(nVar);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i17 = 0; i17 < size7; i17++) {
                    ((w4.v) list.get(i17)).a();
                }
            }
        }
    }

    public final String toString() {
        return this.f5760o.toString();
    }

    @Override // b5.s
    public final void v(z4.z zVar) {
        b4.r rVar = this.f5760o;
        rVar.getClass();
        ((x2.g) rVar).v(zVar);
    }

    @Override // b5.i2
    public final boolean v0() {
        b4.r rVar = this.f5760o;
        rVar.getClass();
        ((w4.b0) rVar).f43105d.getClass();
        return true;
    }

    @Override // g4.u
    public final void x(g4.r rVar) {
        b4.r rVar2 = this.f5760o;
        y4.a.b("applyFocusProperties called on wrong node");
        rVar2.getClass();
        throw new ClassCastException();
    }

    @Override // b5.b0
    public final void k(long j9) {
    }

    @Override // b5.b0
    public final void u(z4.z zVar) {
    }
}
