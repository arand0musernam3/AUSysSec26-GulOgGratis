package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f19478a = 125;

    public static final void a(final u7 u7Var, final u3.d dVar, final b4.t tVar, final boolean z11, boolean z12, boolean z13, Function1 function1, u3.d dVar2, m3.n nVar, final int i11) {
        final u3.d dVar3;
        final boolean z14;
        final boolean z15;
        final Function1 function12;
        Function1 function13;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-741495334);
        int i12 = i11 | (sVar.h(u7Var) ? 4 : 2) | (sVar.f(tVar) ? 256 : 128) | 1794048;
        if (sVar.R(i12 & 1, (4793491 & i12) != 4793490)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = new g2.q(17);
                sVar.k0(objM);
            }
            Function1 function14 = (Function1) objM;
            z1.r rVar = u7Var.f19587a;
            z1.r rVar2 = u7Var.f19587a;
            z1.h2 h2Var = z1.h2.Horizontal;
            boolean z16 = ((v7) rVar.f46653h.getValue()) == v7.Settled;
            sVar.a0(-869697757);
            sVar.q(false);
            b4.t tVarE = z1.k.e(tVar, rVar, h2Var, z16, null, 24);
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, true);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarE, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            b5.g gVar3 = b5.i.f5844g;
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                e0.f.y(iHashCode, sVar, iHashCode, gVar3);
            }
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            b4.t tVarB = d2.u.f13938a.b();
            d2.b bVar = d2.i.f13801a;
            b4.j jVar = b4.d.f5692j;
            d2.i2 i2VarA = d2.h2.a(bVar, jVar, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarB, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode2))) {
                e0.f.y(iHashCode2, sVar, iHashCode2, gVar3);
            }
            m3.i.C(tVarC2, gVar4, sVar);
            Object obj = d2.k2.f13824a;
            dVar.invoke(obj, sVar, 54);
            sVar.q(true);
            boolean zH = sVar.h(u7Var);
            Object objM2 = sVar.M();
            if (zH || objM2 == fVar) {
                objM2 = new an.b(u7Var, z11, 2);
                sVar.k0(objM2);
            }
            b4.t tVarH = i3.r.h(b4.q.f5711a, rVar2, h2Var, (Function2) objM2);
            d2.i2 i2VarA2 = d2.h2.a(bVar, jVar, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarH, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode3))) {
                e0.f.y(iHashCode3, sVar, iHashCode3, gVar3);
            }
            m3.i.C(tVarC3, gVar4, sVar);
            dVar3 = dVar2;
            dVar3.invoke(obj, sVar, 54);
            sVar.q(true);
            sVar.q(true);
            v7 v7Var = (v7) rVar2.f46653h.getValue();
            boolean zH2 = sVar.h(u7Var);
            Object objM3 = sVar.M();
            if (zH2 || objM3 == fVar) {
                function13 = function14;
                objM3 = new aa.l0(u7Var, function13, (x70.c) null, 22);
                sVar.k0(objM3);
            } else {
                function13 = function14;
            }
            m3.i.g(v7Var, function13, (Function2) objM3, sVar);
            function12 = function13;
            z14 = true;
            z15 = true;
        } else {
            dVar3 = dVar2;
            sVar.U();
            z14 = z12;
            z15 = z13;
            function12 = function1;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(dVar, tVar, z11, z14, z15, function12, dVar3, i11) { // from class: g3.r7

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ u3.d f19418b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b4.t f19419c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f19420d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f19421e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f19422f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Function1 f19423g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ u3.d f19424h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iF = m3.i.F(12586041);
                    s7.a(this.f19417a, this.f19418b, this.f19419c, this.f19420d, this.f19421e, this.f19422f, this.f19423g, this.f19424h, (m3.n) obj2, iF);
                    return Unit.f26487a;
                }
            };
        }
    }
}
