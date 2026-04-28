package nn;

import d2.m2;
import d2.z;
import g3.r9;
import i4.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import lv.v;
import m3.b1;
import m3.h1;
import m90.z0;
import s1.r0;
import s1.y;
import t1.w;
import v80.b0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31139a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f31140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h1 f31141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f31142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f31143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f31144f;

    public /* synthetic */ f(b1 b1Var, c cVar, h1 h1Var, b0 b0Var, b1 b1Var2) {
        this.f31143e = b1Var;
        this.f31140b = cVar;
        this.f31141c = h1Var;
        this.f31142d = b0Var;
        this.f31144f = b1Var2;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b4.t tVarI;
        m3.s sVar;
        b4.q qVar;
        boolean z11;
        m3.f fVar;
        b1 b1Var;
        b1 b1Var2;
        m3.f fVar2;
        String str;
        String str2;
        final b0 b0Var;
        b0 b0Var2;
        m3.f fVar3;
        boolean z12;
        m3.f fVar4;
        b0 b0Var3;
        switch (this.f31139a) {
            case 0:
                z zVar = (z) obj;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                zVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((m3.s) nVar).f(zVar) ? 4 : 2;
                }
                m3.s sVar2 = (m3.s) nVar;
                if (sVar2.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    y.b(zVar, !((Boolean) r13.getValue()).booleanValue(), null, null, r0.j(t1.c.k(1000, 0, w.f39594b, 2), 12), null, u3.e.e(754263006, sVar2, new f(this.f31140b, this.f31141c, this.f31142d, this.f31143e, this.f31144f)), sVar2, (iIntValue & 14) | 1572864, 22);
                } else {
                    sVar2.U();
                }
                break;
            default:
                m3.n nVar2 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                b4.q qVar2 = b4.q.f5711a;
                b4.t tVarT = m2.t(m2.d(qVar2, 1.0f), 3);
                c cVar = this.f31140b;
                b4.t tVarJ = v1.n.j(tVarT, cVar.f31119h, g0.f23254b);
                i4.r rVar = cVar.f31120i;
                if (rVar == null || (tVarI = v1.n.i(qVar2, rVar, 0.0f, 6)) == null) {
                    tVarI = qVar2;
                }
                b4.t tVarThen = tVarJ.then(tVarI);
                u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                m3.s sVar3 = (m3.s) nVar2;
                int iHashCode = Long.hashCode(sVar3.T);
                u3.i iVarL = sVar3.l();
                b4.t tVarC = b4.a.c(tVarThen, nVar2);
                b5.j.R.getClass();
                b5.h hVar = b5.i.f5839b;
                sVar3.e0();
                if (sVar3.S) {
                    sVar3.k(hVar);
                } else {
                    sVar3.n0();
                }
                b5.g gVar = b5.i.f5843f;
                m3.i.C(u0VarD, gVar, nVar2);
                b5.g gVar2 = b5.i.f5842e;
                m3.i.C(iVarL, gVar2, nVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                b5.g gVar3 = b5.i.f5844g;
                m3.i.v(nVar2, numValueOf, gVar3);
                b5.d dVar = b5.i.f5845h;
                m3.i.z(nVar2, dVar);
                b5.g gVar4 = b5.i.f5841d;
                m3.i.C(tVarC, gVar4, nVar2);
                b4.t tVarD = m2.d(qVar2, 1.0f);
                float f11 = lv.t.f28254h;
                float fE = d70.a.e(nVar2, this.f31141c.h()) + f11;
                float f12 = lv.t.f28253g;
                b4.t tVarC2 = d2.c.C(tVarD, f11, fE, f11, f12);
                d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5695n, nVar2, 48);
                int iHashCode2 = Long.hashCode(sVar3.T);
                u3.i iVarL2 = sVar3.l();
                b4.t tVarC3 = b4.a.c(tVarC2, nVar2);
                sVar3.e0();
                if (sVar3.S) {
                    sVar3.k(hVar);
                } else {
                    sVar3.n0();
                }
                m3.i.C(yVarA, gVar, nVar2);
                m3.i.C(iVarL2, gVar2, nVar2);
                m3.i.v(nVar2, Integer.valueOf(iHashCode2), gVar3);
                m3.i.z(nVar2, dVar);
                m3.i.C(tVarC3, gVar4, nVar2);
                String str3 = cVar.f31117f;
                if (str3 == null) {
                    sVar3.a0(-734558163);
                    sVar3.q(false);
                    qVar = qVar2;
                    z11 = false;
                    sVar = sVar3;
                } else {
                    sVar3.a0(-734558162);
                    String str4 = cVar.f31118g;
                    String str5 = str4 == null ? str3 : str4;
                    sVar = sVar3;
                    cg.j.n(qVar2, str3, str5, 0L, 0L, nVar2, 6, 24);
                    qVar = qVar2;
                    z11 = false;
                    sVar.q(false);
                }
                b4.t tVarD2 = m2.d(qVar, 1.0f);
                float f13 = lv.t.f28251e;
                r9.d(cVar.f31112a, d2.c.D(tVarD2, 0.0f, f13, 0.0f, 0.0f, 13), cVar.f31115d, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28264c, nVar2, 48, 12582912, 130040);
                b4.t tVarD3 = d2.c.D(m2.d(qVar, 1.0f), 0.0f, f13, 0.0f, 0.0f, 13);
                boolean zF = sVar.f(cVar);
                Object objM = sVar.M();
                m3.f fVar5 = m3.m.f29332a;
                if (zF || objM == fVar5) {
                    objM = new z0(cVar, 6);
                    sVar.k0(objM);
                }
                b4.q qVar3 = qVar;
                r9.d(cVar.f31113b, j5.r.c(tVarD3, false, (Function1) objM), cVar.f31116e, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28274n, nVar2, 0, 12582912, 130040);
                final a aVar = cVar.f31122k;
                b0 b0Var4 = this.f31142d;
                final b1 b1Var3 = this.f31143e;
                final b1 b1Var4 = this.f31144f;
                if (aVar == null) {
                    sVar.a0(-733096265);
                    sVar.q(false);
                    b0Var2 = b0Var4;
                    b1Var2 = b1Var3;
                    b1Var = b1Var4;
                    z12 = false;
                    fVar3 = fVar5;
                } else {
                    sVar.a0(-733096264);
                    b4.t tVarD4 = d2.c.D(qVar3, 0.0f, f12, 0.0f, 0.0f, 13);
                    lv.q qVar4 = aVar.f31109c;
                    String str6 = aVar.f31107a;
                    String str7 = aVar.f31108b;
                    boolean zH = sVar.h(b0Var4) | sVar.f(aVar);
                    Object objM2 = sVar.M();
                    if (zH) {
                        fVar = fVar5;
                    } else {
                        fVar = fVar5;
                        if (objM2 != fVar) {
                            fVar2 = fVar;
                            b1Var2 = b1Var3;
                            b1Var = b1Var4;
                            str = str7;
                            b0Var = b0Var4;
                            str2 = str6;
                        }
                        b0Var2 = b0Var;
                        fVar3 = fVar2;
                        z12 = false;
                        v0.n.l(tVarD4, str2, str, qVar4, null, false, false, null, null, (Function0) objM2, nVar2, 6, 496);
                        sVar.q(false);
                    }
                    final int i11 = 0;
                    fVar2 = fVar;
                    str = str7;
                    b0Var = b0Var4;
                    str2 = str6;
                    Function0 function0 = new Function0() { // from class: nn.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i11) {
                                case 0:
                                    a.a.o(b0Var, b1Var3, b1Var4, aVar);
                                    break;
                                default:
                                    a.a.o(b0Var, b1Var3, b1Var4, aVar);
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    b1Var2 = b1Var3;
                    b1Var = b1Var4;
                    sVar.k0(function0);
                    objM2 = function0;
                    b0Var2 = b0Var;
                    fVar3 = fVar2;
                    z12 = false;
                    v0.n.l(tVarD4, str2, str, qVar4, null, false, false, null, null, (Function0) objM2, nVar2, 6, 496);
                    sVar.q(false);
                }
                final a aVar2 = cVar.l;
                if (aVar2 == null) {
                    sVar.a0(-732366091);
                    sVar.q(z12);
                    b0Var3 = b0Var2;
                    fVar4 = fVar3;
                } else {
                    sVar.a0(-732366090);
                    b4.t tVarD5 = d2.c.D(qVar3, 0.0f, f12, 0.0f, 0.0f, 13);
                    lv.q qVar5 = aVar2.f31109c;
                    String str8 = aVar2.f31107a;
                    String str9 = aVar2.f31108b;
                    final b0 b0Var5 = b0Var2;
                    boolean zH2 = sVar.h(b0Var5) | sVar.f(aVar2);
                    Object objM3 = sVar.M();
                    m3.f fVar6 = fVar3;
                    if (zH2 || objM3 == fVar6) {
                        final int i12 = 1;
                        final b1 b1Var5 = b1Var2;
                        final b1 b1Var6 = b1Var;
                        Function0 function02 = new Function0() { // from class: nn.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i12) {
                                    case 0:
                                        a.a.o(b0Var5, b1Var5, b1Var6, aVar2);
                                        break;
                                    default:
                                        a.a.o(b0Var5, b1Var5, b1Var6, aVar2);
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        b0Var5 = b0Var5;
                        sVar.k0(function02);
                        objM3 = function02;
                    }
                    fVar4 = fVar6;
                    b0Var3 = b0Var5;
                    v0.n.n(tVarD5, str8, str9, qVar5, null, false, false, null, null, (Function0) objM3, nVar2, 6, 496);
                    sVar.q(z12);
                }
                a aVar3 = cVar.f31123m;
                if (aVar3 == null) {
                    sVar.a0(-731634274);
                    sVar.q(z12);
                } else {
                    sVar.a0(-731634273);
                    b4.t tVarD6 = d2.c.D(qVar3, 0.0f, lv.t.f28249c, 0.0f, 0.0f, 13);
                    lv.q qVar6 = aVar3.f31109c;
                    String str10 = aVar3.f31107a;
                    String str11 = aVar3.f31108b;
                    b0 b0Var6 = b0Var3;
                    boolean zH3 = sVar.h(b0Var6) | sVar.f(cVar);
                    Object objM4 = sVar.M();
                    if (zH3 || objM4 == fVar4) {
                        androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c cVar2 = new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c(15, cVar, b0Var6, b1Var2, b1Var);
                        sVar.k0(cVar2);
                        objM4 = cVar2;
                    }
                    v0.n.o(tVarD6, str10, str11, qVar6, null, false, (Function0) objM4, nVar2, 6, 0, 1008);
                    sVar.q(z12);
                }
                sVar.q(true);
                sVar.q(true);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ f(c cVar, h1 h1Var, b0 b0Var, b1 b1Var, b1 b1Var2) {
        this.f31140b = cVar;
        this.f31141c = h1Var;
        this.f31142d = b0Var;
        this.f31143e = b1Var;
        this.f31144f = b1Var2;
    }
}
