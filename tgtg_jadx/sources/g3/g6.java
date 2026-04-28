package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f18680a = 8;

    public static final void a(final y6 y6Var, final boolean z11, final Function0 function0, final i4.v0 v0Var, b4.t tVar, boolean z12, a6 a6Var, v1.a0 a0Var, d2.z1 z1Var, final Function2 function2, final Function2 function22, m3.n nVar, final int i11) {
        int i12;
        final b4.t tVar2;
        final boolean z13;
        final a6 a6Var2;
        final v1.a0 a0Var2;
        final d2.z1 z1Var2;
        int i13;
        a6 a6Var3;
        d2.z1 z1Var3;
        int i14;
        b4.t tVar3;
        v1.a0 a0Var3;
        boolean z14;
        d2.z1 z1Var4;
        long j9;
        long j11;
        long j12;
        boolean z15;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1532041126);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(y6Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z11) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function0) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(v0Var) ? NewHope.SENDB_BYTES : 1024;
        }
        int i15 = 221184 | i12;
        if ((1572864 & i11) == 0) {
            i15 = 745472 | i12;
        }
        if ((12582912 & i11) == 0) {
            i15 |= 4194304;
        }
        int i16 = 905969664 | i15;
        if (sVar.R(i16 & 1, (306783379 & i16) != 306783378)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                float f11 = c6.f18416a;
                p0 p0Var = (p0) sVar.j(r0.f19375a);
                a6 a6Var4 = p0Var.f19271g0;
                if (a6Var4 == null) {
                    l3.r rVar = l3.j0.f26986h;
                    long jD = r0.d(p0Var, rVar);
                    long jD2 = r0.d(p0Var, l3.j0.f26987i);
                    l3.r rVar2 = l3.j0.f26984f;
                    long jD3 = r0.d(p0Var, rVar2);
                    long j13 = i4.v.f23314g;
                    long jD4 = r0.d(p0Var, l3.j0.f26989k);
                    long jD5 = r0.d(p0Var, rVar2);
                    long jD6 = r0.d(p0Var, rVar);
                    l3.r rVar3 = l3.j0.f26980b;
                    long jD7 = r0.d(p0Var, rVar3);
                    float f12 = l3.j0.f26981c;
                    long jB = i4.v.b(f12, jD7);
                    long jD8 = r0.d(p0Var, rVar2);
                    i13 = -33030145;
                    float f13 = l3.j0.f26982d;
                    a6Var3 = new a6(jD, jD2, jD3, j13, jD4, jD5, jD6, jB, i4.v.b(f13, jD8), j13, i4.v.b(f12, r0.d(p0Var, rVar3)), i4.v.b(f13, r0.d(p0Var, rVar2)));
                    p0Var.f19271g0 = a6Var3;
                } else {
                    i13 = -33030145;
                    a6Var3 = a6Var4;
                }
                v1.a0 a0VarB = v1.n.b(c6.f18416a, z11 ? a6Var3.f18325c : !z11 ? a6Var3.f18328f : a6Var3.l);
                z1Var3 = c6.f18418c;
                i14 = i16 & i13;
                tVar3 = b4.q.f5711a;
                a0Var3 = a0VarB;
                z14 = true;
            } else {
                sVar.U();
                z14 = z12;
                a6Var3 = a6Var;
                a0Var3 = a0Var;
                z1Var3 = z1Var;
                i14 = i16 & (-33030145);
                tVar3 = tVar;
            }
            sVar.r();
            sVar.a0(-1579573323);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = w.a0.g(sVar);
            }
            b2.l lVar = (b2.l) objM;
            sVar.q(false);
            a6Var3.getClass();
            if (z14 && z11) {
                z1Var4 = z1Var3;
                j9 = a6Var3.f18323a;
            } else {
                z1Var4 = z1Var3;
                j9 = (!z14 || z11) ? (z14 || !z11) ? a6Var3.f18332j : a6Var3.f18329g : a6Var3.f18326d;
            }
            if (z14 && z11) {
                j11 = j9;
                j12 = a6Var3.f18324b;
            } else {
                j11 = j9;
                j12 = (!z14 || z11) ? (z14 || !z11) ? a6Var3.f18333k : a6Var3.f18330h : a6Var3.f18327e;
            }
            long j14 = j12;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = w.a0.s(0, sVar);
            }
            m3.h1 h1Var = (m3.h1) objM2;
            boolean zF = sVar.f(lVar);
            Object objM3 = sVar.M();
            if (zF || objM3 == fVar) {
                z15 = z14;
                objM3 = new d8.c(lVar, h1Var, null, 27);
                sVar.k0(objM3);
            } else {
                z15 = z14;
            }
            m3.i.h(lVar, (Function2) objM3, sVar);
            b4.t tVarA = d2.m2.a(z4.c0.l(y6Var.a(1.0f, tVar3, true), new cn.a0(h1Var, z11, 1)), p.f19256d, p.f19257e);
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = new g2.q(15);
                sVar.k0(objM4);
            }
            d2.z1 z1Var5 = z1Var4;
            boolean z16 = z15;
            q7.b(z11, function0, j5.r.c(tVarA, false, (Function1) objM4), z16, v0Var, j11, j14, 0.0f, a0Var3, lVar, u3.e.e(-1208080836, sVar, new d6(function2, function22, z1Var5)), sVar, ((i14 >> 6) & 7168) | ((i14 >> 3) & 126) | (57344 & (i14 << 3)), MLKEMEngine.KyberPolyBytes);
            a6Var2 = a6Var3;
            z13 = z16;
            a0Var2 = a0Var3;
            z1Var2 = z1Var5;
            tVar2 = tVar3;
        } else {
            sVar.U();
            tVar2 = tVar;
            z13 = z12;
            a6Var2 = a6Var;
            a0Var2 = a0Var;
            z1Var2 = z1Var;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: g3.e6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g6.a(y6Var, z11, function0, v0Var, tVar2, z13, a6Var2, a0Var2, z1Var2, function2, function22, (m3.n) obj, m3.i.F(i11 | 1));
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void b(Function2 function2, Function2 function22, d2.z1 z1Var, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1069265073);
        int i12 = (sVar.h(function2) ? 4 : 2) | i11 | (sVar.h(function22) ? 32 : 16) | (sVar.f(z1Var) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            b4.k kVar = b4.d.f5687e;
            b4.t tVarY = d2.c.y(b4.q.f5711a, z1Var);
            z4.u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarY, sVar);
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
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            r9.a(na.a(l3.j0.f26983e, sVar), u3.e.e(-1372614088, sVar, new an.d(function2, function22, s0.D(l3.f0.FastSpatial, sVar), 14)), sVar, 48);
            sVar.q(true);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new d6(function2, function22, z1Var, i11);
        }
    }

    public static final void c(b4.t tVar, float f11, u3.d dVar, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(2041406825);
        int i12 = (sVar.f(tVar) ? 4 : 2) | i11 | 48;
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            f11 = c6.f18416a;
            b4.t tVarJ = d2.c.J(d2.m2.b(k2.c.b(tVar), 0.0f, l3.j0.f26979a, 1), d2.i1.Min);
            d2.i2 i2VarA = d2.h2.a(d2.i.g(-f11), b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarJ, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            b5.g gVar = b5.i.f5844g;
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                e0.f.y(iHashCode, sVar, iHashCode, gVar);
            }
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new y6();
                sVar.k0(objM);
            }
            dVar.invoke((y6) objM, sVar, 54);
            sVar.q(true);
        } else {
            sVar.U();
        }
        float f12 = f11;
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.h(tVar, f12, dVar, i11, 2);
        }
    }
}
