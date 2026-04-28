package g3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m3.e0 f19360a = new m3.e0(new fw.b(26));

    public static final void a(b4.t tVar, i4.v0 v0Var, long j9, long j11, float f11, float f12, v1.a0 a0Var, final Function2 function2, m3.n nVar, int i11, int i12) {
        if ((i12 & 1) != 0) {
            tVar = b4.q.f5711a;
        }
        if ((i12 & 2) != 0) {
            v0Var = i4.g0.f23254b;
        }
        if ((i12 & 4) != 0) {
            j9 = ((p0) ((m3.s) nVar).j(r0.f19375a)).f19281p;
        }
        if ((i12 & 8) != 0) {
            j11 = r0.b(j9, nVar);
        }
        if ((i12 & 16) != 0) {
            f11 = 0;
        }
        if ((i12 & 32) != 0) {
            f12 = 0;
        }
        if ((i12 & 64) != 0) {
            a0Var = null;
        }
        m3.s sVar = (m3.s) nVar;
        m3.e0 e0Var = f19360a;
        final float f13 = f11 + ((z5.f) sVar.j(e0Var)).f47277a;
        m3.v1[] v1VarArr = {b3.i.u(j11, v0.f19606a), e0Var.a(new z5.f(f13))};
        final long j12 = j9;
        final i4.v0 v0Var2 = v0Var;
        final v1.a0 a0Var2 = a0Var;
        final float f14 = f12;
        final b4.t tVar2 = tVar;
        m3.i.b(v1VarArr, u3.e.e(421772006, sVar, new Function2() { // from class: g3.n7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                m3.n nVar2 = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b4.t tVarD = q7.d(tVar2, v0Var2, q7.e(j12, f13, sVar2), a0Var2, ((z5.c) sVar2.j(c5.x1.f7416h)).c0(f14));
                    Object objM = sVar2.M();
                    m3.f fVar = m3.m.f29332a;
                    if (objM == fVar) {
                        objM = new g2.q(16);
                        sVar2.k0(objM);
                    }
                    b4.t tVarC = j5.r.c(tVarD, false, (Function1) objM);
                    Unit unit = Unit.f26487a;
                    Object objM2 = sVar2.M();
                    if (objM2 == fVar) {
                        objM2 = a1.f18304c;
                        sVar2.k0(objM2);
                    }
                    b4.t tVarA = w4.h0.a(tVarC, unit, (PointerInputEventHandler) objM2);
                    z4.u0 u0VarD = d2.p.d(b4.d.f5683a, true);
                    int iHashCode = Long.hashCode(sVar2.T);
                    u3.i iVarL = sVar2.l();
                    b4.t tVarC2 = b4.a.c(tVarA, sVar2);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(u0VarD, b5.i.f5843f, sVar2);
                    m3.i.C(iVarL, b5.i.f5842e, sVar2);
                    b5.g gVar = b5.i.f5844g;
                    if (sVar2.S || !Intrinsics.areEqual(sVar2.M(), Integer.valueOf(iHashCode))) {
                        e0.f.y(iHashCode, sVar2, iHashCode, gVar);
                    }
                    m3.i.C(tVarC2, b5.i.f5841d, sVar2);
                    w.a0.w(0, function2, sVar2, true);
                } else {
                    sVar2.U();
                }
                return Unit.f26487a;
            }
        }), sVar, 56);
    }

    public static final void b(final boolean z11, final Function0 function0, final b4.t tVar, final boolean z12, final i4.v0 v0Var, final long j9, long j11, float f11, final v1.a0 a0Var, b2.l lVar, final u3.d dVar, m3.n nVar, int i11, int i12) {
        final b2.l lVar2;
        long jB = (i12 & 64) != 0 ? r0.b(j9, nVar) : j11;
        float f12 = 0;
        final float f13 = (i12 & 256) != 0 ? 0 : f11;
        m3.s sVar = (m3.s) nVar;
        if (lVar == null) {
            sVar.a0(1528105640);
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = w.a0.g(sVar);
            }
            sVar.q(false);
            lVar2 = (b2.l) objM;
        } else {
            sVar.a0(-227801585);
            sVar.q(false);
            lVar2 = lVar;
        }
        m3.s sVar2 = (m3.s) nVar;
        m3.e0 e0Var = f19360a;
        final float f14 = ((z5.f) sVar2.j(e0Var)).f47277a + f12;
        m3.i.b(new m3.v1[]{b3.i.u(jB, v0.f19606a), e0Var.a(new z5.f(f14))}, u3.e.e(1508735219, sVar2, new Function2() { // from class: g3.o7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                m3.n nVar2 = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar3 = (m3.s) nVar2;
                if (sVar3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z4.o oVar = o2.f19198a;
                    b4.t tVarG = i3.r.g(k2.c.a(q7.d(tVar.then(z2.f19875b), v0Var, q7.e(j9, f14, sVar3), a0Var, ((z5.c) sVar3.j(c5.x1.f7416h)).c0(f13)), z11, lVar2, s5.a(0.0f, 7, 0L, false), z12, null, function0));
                    z4.u0 u0VarD = d2.p.d(b4.d.f5683a, true);
                    int iHashCode = Long.hashCode(sVar3.T);
                    u3.i iVarL = sVar3.l();
                    b4.t tVarC = b4.a.c(tVarG, sVar3);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(hVar);
                    } else {
                        sVar3.n0();
                    }
                    m3.i.C(u0VarD, b5.i.f5843f, sVar3);
                    m3.i.C(iVarL, b5.i.f5842e, sVar3);
                    b5.g gVar = b5.i.f5844g;
                    if (sVar3.S || !Intrinsics.areEqual(sVar3.M(), Integer.valueOf(iHashCode))) {
                        e0.f.y(iHashCode, sVar3, iHashCode, gVar);
                    }
                    m3.i.C(tVarC, b5.i.f5841d, sVar3);
                    r8.k.w(0, dVar, sVar3, true);
                } else {
                    sVar3.U();
                }
                return Unit.f26487a;
            }
        }), sVar2, 56);
    }

    public static final void c(final Function0 function0, final b4.t tVar, boolean z11, final i4.v0 v0Var, final long j9, long j11, float f11, final v1.a0 a0Var, b2.l lVar, final u3.d dVar, m3.n nVar, int i11, int i12) {
        final b2.l lVar2;
        final boolean z12 = (i12 & 4) != 0 ? true : z11;
        long jB = (i12 & 32) != 0 ? r0.b(j9, nVar) : j11;
        float f12 = 0;
        final float f13 = (i12 & 128) != 0 ? 0 : f11;
        b2.l lVar3 = (i12 & 512) != 0 ? null : lVar;
        if (lVar3 == null) {
            m3.s sVar = (m3.s) nVar;
            sVar.a0(-1701074900);
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = w.a0.g(sVar);
            }
            sVar.q(false);
            lVar2 = (b2.l) objM;
        } else {
            m3.s sVar2 = (m3.s) nVar;
            sVar2.a0(2023335947);
            sVar2.q(false);
            lVar2 = lVar3;
        }
        m3.s sVar3 = (m3.s) nVar;
        m3.e0 e0Var = f19360a;
        final float f14 = ((z5.f) sVar3.j(e0Var)).f47277a + f12;
        m3.i.b(new m3.v1[]{b3.i.u(jB, v0.f19606a), e0Var.a(new z5.f(f14))}, u3.e.e(849208527, sVar3, new Function2() { // from class: g3.p7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                m3.n nVar2 = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar4 = (m3.s) nVar2;
                if (sVar4.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z4.o oVar = o2.f19198a;
                    b4.t tVarG = i3.r.g(androidx.compose.foundation.b.b(q7.d(tVar.then(z2.f19875b), v0Var, q7.e(j9, f14, sVar4), a0Var, ((z5.c) sVar4.j(c5.x1.f7416h)).c0(f13)), lVar2, s5.a(0.0f, 7, 0L, false), z12, null, null, function0, 24));
                    z4.u0 u0VarD = d2.p.d(b4.d.f5683a, true);
                    int iHashCode = Long.hashCode(sVar4.T);
                    u3.i iVarL = sVar4.l();
                    b4.t tVarC = b4.a.c(tVarG, sVar4);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar4.e0();
                    if (sVar4.S) {
                        sVar4.k(hVar);
                    } else {
                        sVar4.n0();
                    }
                    m3.i.C(u0VarD, b5.i.f5843f, sVar4);
                    m3.i.C(iVarL, b5.i.f5842e, sVar4);
                    b5.g gVar = b5.i.f5844g;
                    if (sVar4.S || !Intrinsics.areEqual(sVar4.M(), Integer.valueOf(iHashCode))) {
                        e0.f.y(iHashCode, sVar4, iHashCode, gVar);
                    }
                    m3.i.C(tVarC, b5.i.f5841d, sVar4);
                    r8.k.w(0, dVar, sVar4, true);
                } else {
                    sVar4.U();
                }
                return Unit.f26487a;
            }
        }), sVar3, 56);
    }

    public static final b4.t d(b4.t tVar, i4.v0 v0Var, long j9, v1.a0 a0Var, float f11) {
        i4.v0 v0Var2;
        b4.t tVarQ;
        b4.t tVarL = b4.q.f5711a;
        if (f11 > 0.0f) {
            v0Var2 = v0Var;
            tVarQ = i4.g0.q(tVarL, 0.0f, 0.0f, 0.0f, f11, v0Var2, 124895);
        } else {
            v0Var2 = v0Var;
            tVarQ = tVarL;
        }
        b4.t tVarThen = tVar.then(tVarQ);
        if (a0Var != null) {
            tVarL = v1.n.l(tVarL, a0Var.f41677a, a0Var.f41678b, v0Var2);
        }
        return f4.g.b(v1.n.j(tVarThen.then(tVarL), j9, v0Var2), v0Var2);
    }

    public static final long e(long j9, float f11, m3.s sVar) {
        p0 p0Var = (p0) sVar.j(r0.f19375a);
        boolean zBooleanValue = ((Boolean) sVar.j(r0.f19376b)).booleanValue();
        long j11 = p0Var.f19281p;
        return (i4.v.c(j9, j11) && zBooleanValue) ? z5.f.c(f11, (float) 0) ? j11 : i4.g0.k(i4.v.b(((((float) Math.log(f11 + 1)) * 4.5f) + 2.0f) / 100.0f, p0Var.f19285t), j11) : j9;
    }
}
