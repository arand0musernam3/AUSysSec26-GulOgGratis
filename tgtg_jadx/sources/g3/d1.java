package g3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1 f18440a = new d1();

    public final void a(z6 z6Var, m3.n nVar, int i11) {
        boolean z11;
        fa faVar;
        ja jaVar;
        b4.t i1Var;
        boolean z12;
        ka state;
        boolean z13;
        boolean z14;
        float f11 = z6Var.f19895h;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(2137486921);
        int i12 = i11 | (sVar.f(z6Var) ? 4 : 2);
        int i13 = 0;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            fa faVar2 = z6Var.f19898k;
            ja jaVar2 = z6Var.l;
            if (Float.isNaN(f11) || (Float.floatToRawIntBits(f11) & Integer.MAX_VALUE) >= 2139095040) {
                i4.a.f("The expandedHeight is expected to be specified and finite");
                return;
            }
            boolean zF = sVar.f(faVar2) | sVar.f(jaVar2);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zF || objM == fVar) {
                objM = m3.i.q(new c1(z6Var, 0));
                sVar.k0(objM);
            }
            m3.c3 c3VarA = s1.d1.a(((i4.v) ((m3.c3) objM).getValue()).f23317a, s0.D(l3.f0.DefaultEffects, sVar), null, sVar, 0, 12);
            u3.d dVarE = u3.e.e(-1658896622, sVar, new y0(z6Var, i13));
            b4.q qVar = b4.q.f5711a;
            if (jaVar2 == null || jaVar2.c()) {
                z11 = false;
                faVar = faVar2;
                jaVar = jaVar2;
                sVar.a0(690083313);
                sVar.q(false);
                i1Var = qVar;
            } else {
                sVar.a0(689468335);
                jaVar = jaVar2;
                z1.h2 h2Var = z1.h2.Vertical;
                int i14 = i12 & 14;
                if (i14 == 4) {
                    z14 = false;
                    z13 = true;
                } else {
                    z13 = false;
                    z14 = false;
                }
                Object objM2 = sVar.M();
                if (z13 || objM2 == fVar) {
                    objM2 = new c50.p(z6Var, 26);
                    sVar.k0(objM2);
                }
                le.v vVar = z1.j1.f46557a;
                m3.b1 b1VarB = m3.i.B((Function1) objM2, sVar);
                Object objM3 = sVar.M();
                if (objM3 == fVar) {
                    z1.c0 c0Var = new z1.c0(new sn.c(b1VarB, 13));
                    sVar.k0(c0Var);
                    objM3 = c0Var;
                }
                z1.c0 c0Var2 = (z1.c0) objM3;
                boolean z15 = i14 == 4 ? true : z14;
                Object objM4 = sVar.M();
                if (z15 || objM4 == fVar) {
                    objM4 = new b1(z6Var, null);
                    sVar.k0(objM4);
                }
                faVar = faVar2;
                i1Var = new z1.i1(c0Var2, h2Var, (188 & 4) != 0 ? true : z14, null, z14, z1.j1.f46557a, (i80.n) objM4, z14);
                z11 = z14;
                sVar.q(z11);
            }
            b4.t tVarThen = z6Var.f19888a.then(i1Var);
            boolean zF2 = sVar.f(c3VarA);
            Object objM5 = sVar.M();
            if (zF2 || objM5 == fVar) {
                objM5 = new dp.r(c3VarA, 1);
                sVar.k0(objM5);
            }
            b4.t tVarD = f4.g.d(tVarThen, (Function1) objM5);
            Object objM6 = sVar.M();
            if (objM6 == fVar) {
                objM6 = new g2.q(7);
                sVar.k0(objM6);
            }
            b4.t tVarC = j5.r.c(tVarD, z11, (Function1) objM6);
            Unit unit = Unit.f26487a;
            Object objM7 = sVar.M();
            if (objM7 == fVar) {
                objM7 = a1.f18303b;
                sVar.k0(objM7);
            }
            b4.t tVarA = w4.h0.a(tVarC, unit, (PointerInputEventHandler) objM7);
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, z11);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarA, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            b5.g gVar = b5.i.f5844g;
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                e0.f.y(iHashCode, sVar, iHashCode, gVar);
            }
            m3.i.C(tVarC2, b5.i.f5841d, sVar);
            b4.t tVarC3 = f4.g.c(d2.c.K(qVar, z6Var.f19897j));
            m3.e0 e0Var = i.f18791a;
            if (jaVar == null || (state = jaVar.getState()) == null) {
                z12 = true;
            } else {
                z12 = true;
                b4.t tVarQ = z4.c0.q(tVarC3, new d(state, 1));
                if (tVarQ != null) {
                    tVarC3 = tVarQ;
                }
            }
            boolean z16 = (i12 & 14) == 4 ? z12 : false;
            Object objM8 = sVar.M();
            if (z16 || objM8 == fVar) {
                objM8 = new z0(z6Var, 0);
                sVar.k0(objM8);
            }
            i3.u uVar = (i3.u) objM8;
            long j9 = faVar.f18630c;
            long j11 = faVar.f18631d;
            long j12 = faVar.f18632e;
            long j13 = faVar.f18633f;
            boolean z17 = z12;
            u3.d dVar = z6Var.f19889b;
            m5.u0 u0Var = z6Var.f19890c;
            m5.u0 u0Var2 = z6Var.f19891d;
            d2.e eVar = d2.i.f13805e;
            b4.t tVar = tVarC3;
            b4.i iVar = z6Var.f19892e;
            Function2 function2 = z6Var.f19893f;
            float f12 = z6Var.f19895h;
            d2.z1 z1Var = z6Var.f19896i;
            Object objM9 = sVar.M();
            if (objM9 == fVar) {
                objM9 = new fw.b(16);
                sVar.k0(objM9);
            }
            i.d(tVar, uVar, j9, j11, j13, j12, dVar, u0Var, u0Var2, (Function0) objM9, eVar, iVar, function2, dVarE, f12, z1Var, sVar, 0);
            sVar = sVar;
            sVar.q(z17);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.u2(this, z6Var, i11, 20);
        }
    }
}
