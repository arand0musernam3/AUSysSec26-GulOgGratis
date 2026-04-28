package g3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f18924a = 12;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f18925b = 14;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f18926c = 6;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z4.q f18927d = new z4.q(0, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z4.q f18928e = new z4.q(1, null);

    public static final void a(b4.t tVar, long j9, long j11, m3.n nVar, int i11) {
        long jB;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1428256508);
        int i12 = i11 | (sVar.e(j9) ? 32 : 16) | 3200;
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                jB = r0.b(j9, sVar);
            } else {
                sVar.U();
                jB = j11;
            }
            sVar.r();
            float f11 = l3.g.f26959b;
            sVar.a0(-1050967433);
            i4.v0 v0VarB = m6.b(l3.g.f26958a, sVar);
            sVar.q(false);
            b4.t tVarThen = v1.n.j(d2.m2.a(tVar, f11, f11), j9, v0VarB).then(b4.q.f5711a);
            d2.i2 i2VarA = d2.h2.a(d2.i.f13805e, b4.d.f5693k, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarThen, sVar);
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
            sVar.a0(1338769290);
            sVar.q(false);
            sVar.q(true);
        } else {
            sVar.U();
            jB = j11;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cn.f0(tVar, j9, jB, i11, 1);
        }
    }

    public static final void b(u3.d dVar, b4.t tVar, u3.d dVar2, m3.n nVar, int i11) {
        i80.n nVar2;
        i80.n nVar3;
        b4.t tVar2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1693825945);
        int i12 = i11 | 48;
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = j.f18856b;
                sVar.k0(objM);
            }
            z4.u0 u0Var = (z4.u0) objM;
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0Var, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            b5.g gVar3 = b5.i.f5844g;
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                e0.f.y(iHashCode, sVar, iHashCode, gVar3);
            }
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            b4.t tVarM = z4.c0.m(qVar, "anchor");
            z4.u0 u0VarD = d2.p.d(b4.d.f5687e, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarM, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode2))) {
                e0.f.y(iHashCode2, sVar, iHashCode2, gVar3);
            }
            m3.i.C(tVarC2, gVar4, sVar);
            d2.u uVar = d2.u.f13938a;
            nVar3 = dVar2;
            nVar3.invoke(uVar, sVar, 54);
            sVar.q(true);
            b4.t tVarM2 = z4.c0.m(qVar, "badge");
            z4.u0 u0VarD2 = d2.p.d(b4.d.f5683a, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarM2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode3))) {
                e0.f.y(iHashCode3, sVar, iHashCode3, gVar3);
            }
            m3.i.C(tVarC3, gVar4, sVar);
            nVar2 = dVar;
            nVar2.invoke(uVar, sVar, 54);
            sVar.q(true);
            sVar.q(true);
            tVar2 = qVar;
        } else {
            nVar2 = dVar;
            nVar3 = dVar2;
            sVar.U();
            tVar2 = tVar;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.d(nVar2, tVar2, nVar3, i11, 12);
        }
    }
}
