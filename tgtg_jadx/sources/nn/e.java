package nn;

import bg.a1;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import d2.m2;
import d2.w;
import d2.y;
import d40.t1;
import g3.s0;
import g3.v;
import g3.w6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.c3;
import m3.h1;
import o30.e0;
import s1.z;
import v80.b0;
import z4.c0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31129a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f31130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c3 f31131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f31132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f31133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f31134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f31135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f31136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f31137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f31138j;

    public /* synthetic */ e(BasicItem basicItem, Function1 function1, Function1 function12, xj.k kVar, Function0 function0, Function1 function13, b1 b1Var, b1 b1Var2, w6 w6Var) {
        this.f31132d = basicItem;
        this.f31133e = function1;
        this.f31134f = function12;
        this.f31135g = kVar;
        this.f31136h = function0;
        this.f31137i = function13;
        this.f31130b = b1Var;
        this.f31131c = b1Var2;
        this.f31138j = w6Var;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z11;
        BasicItem basicItem;
        b1 b1Var;
        boolean z12;
        vj.c cVar;
        int i11 = this.f31129a;
        b4.q qVar = b4.q.f5711a;
        m3.f fVar = m3.m.f29332a;
        Object obj4 = this.f31138j;
        c3 c3Var = this.f31131c;
        Object obj5 = this.f31137i;
        Object obj6 = this.f31136h;
        Object obj7 = this.f31135g;
        Object obj8 = this.f31134f;
        Object obj9 = this.f31133e;
        Object obj10 = this.f31132d;
        final int i12 = 0;
        switch (i11) {
            case 0:
                c cVar2 = (c) obj10;
                h1 h1Var = (h1) obj6;
                b0 b0Var = (b0) obj5;
                b1 b1Var2 = (b1) obj7;
                c3 c3Var2 = (c3) obj9;
                c3 c3Var3 = (c3) obj8;
                u3.d dVar = (u3.d) obj4;
                m3.n nVar = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((z) obj).getClass();
                b4.t tVarT = m2.t(m2.d(qVar, 1.0f), 3);
                float f11 = lv.t.f28253g;
                b4.t tVarC = d2.c.C(tVarT, f11, f11, f11, lv.t.f28251e);
                u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                m3.s sVar = (m3.s) nVar;
                int iHashCode = Long.hashCode(sVar.T);
                u3.i iVarL = sVar.l();
                b4.t tVarC2 = b4.a.c(tVarC, nVar);
                b5.j.R.getClass();
                b5.h hVar = b5.i.f5839b;
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                b5.g gVar = b5.i.f5843f;
                m3.i.C(u0VarD, gVar, nVar);
                b5.g gVar2 = b5.i.f5842e;
                m3.i.C(iVarL, gVar2, nVar);
                Integer numValueOf = Integer.valueOf(iHashCode);
                b5.g gVar3 = b5.i.f5844g;
                m3.i.v(nVar, numValueOf, gVar3);
                b5.d dVar2 = b5.i.f5845h;
                m3.i.z(nVar, dVar2);
                b5.g gVar4 = b5.i.f5841d;
                m3.i.C(tVarC2, gVar4, nVar);
                b4.t tVarA = f4.g.a(m2.t(m2.d(qVar, 1.0f), 3), ((Number) c3Var.getValue()).floatValue());
                l2.f fVarB = l2.g.b(e0.s(nVar, R.dimen.profile_card_corner_radius));
                v vVarQ = s0.q(cVar2.f31121j, 0.0f, 0.0f, 0.0f, 62);
                b1 b1Var3 = this.f31130b;
                s0.b(tVarA, fVarB, null, vVarQ, null, u3.e.e(982209462, nVar, new f(b1Var3, cVar2, h1Var, b0Var, b1Var2)), nVar, 196608, 20);
                b4.t tVarT2 = m2.t(m2.d(qVar, 1.0f), 3);
                Object objM = sVar.M();
                if (objM == fVar) {
                    objM = new co.t(h1Var, 8);
                    sVar.k0(objM);
                }
                b4.t tVarO = c0.o(tVarT2, (Function1) objM);
                d2.d dVar3 = d2.i.f13803c;
                b4.i iVar = b4.d.f5694m;
                y yVarA = w.a(dVar3, iVar, nVar, 0);
                int iHashCode2 = Long.hashCode(sVar.T);
                u3.i iVarL2 = sVar.l();
                b4.t tVarC3 = b4.a.c(tVarO, nVar);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                m3.i.C(yVarA, gVar, nVar);
                m3.i.C(iVarL2, gVar2, nVar);
                m3.i.v(nVar, Integer.valueOf(iHashCode2), gVar3);
                m3.i.z(nVar, dVar2);
                m3.i.C(tVarC3, gVar4, nVar);
                d2.p.a(m2.e(qVar, ((Number) c3Var2.getValue()).floatValue()), nVar, 0);
                b4.t tVarI = f4.g.i(m2.t(m2.d(qVar, 1.0f), 3), ((Number) c3Var3.getValue()).floatValue());
                y yVarA2 = w.a(dVar3, iVar, nVar, 0);
                int iHashCode3 = Long.hashCode(sVar.T);
                u3.i iVarL3 = sVar.l();
                b4.t tVarC4 = b4.a.c(tVarI, nVar);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                m3.i.C(yVarA2, gVar, nVar);
                m3.i.C(iVarL3, gVar2, nVar);
                m3.i.v(nVar, Integer.valueOf(iHashCode3), gVar3);
                m3.i.z(nVar, dVar2);
                m3.i.C(tVarC4, gVar4, nVar);
                dVar.invoke(nVar, 0);
                sVar.q(true);
                sVar.q(true);
                if (((Boolean) b1Var3.getValue()).booleanValue()) {
                    sVar.a0(753729562);
                    sVar.q(false);
                } else {
                    sVar.a0(753488351);
                    d2.p.a(b4.a.a(m2.e(m2.d(qVar, 1.0f), d70.a.e(nVar, h1Var.h())), c5.m2.f7291a, new em.d(2)), nVar, 0);
                    sVar.q(false);
                }
                sVar.q(true);
                break;
            default:
                final BasicItem basicItem2 = (BasicItem) obj10;
                final Function1 function1 = (Function1) obj9;
                Function1 function12 = (Function1) obj8;
                xj.k kVar = (xj.k) obj7;
                Function0 function0 = (Function0) obj6;
                Function1 function13 = (Function1) obj5;
                w6 w6Var = (w6) obj4;
                m3.n nVar2 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((z) obj).getClass();
                if (basicItem2 instanceof FlashSalesItem) {
                    m3.s sVar2 = (m3.s) nVar2;
                    sVar2.a0(1050969965);
                    FlashSalesItem flashSalesItem = (FlashSalesItem) basicItem2;
                    boolean zF = sVar2.f(function1) | sVar2.h(basicItem2);
                    Object objM2 = sVar2.M();
                    if (zF || objM2 == fVar) {
                        objM2 = new Function1() { // from class: yj.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj11) {
                                BasicItem basicItem3 = (BasicItem) obj11;
                                switch (i12) {
                                    case 0:
                                        basicItem3.getClass();
                                        function1.invoke(basicItem2);
                                        break;
                                    default:
                                        basicItem3.getClass();
                                        function1.invoke(basicItem2);
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar2.k0(objM2);
                    }
                    Function1 function14 = (Function1) objM2;
                    boolean zF2 = sVar2.f(function12) | sVar2.h(basicItem2);
                    Object objM3 = sVar2.M();
                    if (zF2 || objM3 == fVar) {
                        objM3 = new eg.k(function12, basicItem2, 4);
                        sVar2.k0(objM3);
                    }
                    bx.k.a(null, flashSalesItem, false, function14, (Function0) objM3, sVar2, 0, 5);
                    sVar2.q(false);
                } else {
                    m3.s sVar3 = (m3.s) nVar2;
                    sVar3.a0(1051379878);
                    boolean zE = kVar.f44411f.e();
                    b4.t tVarB = d2.c.B(qVar, lv.t.f28251e, 0.0f, 2);
                    basicItem2.getClass();
                    boolean zE2 = kVar.f44407b.e(basicItem2);
                    b1 b1Var4 = this.f31130b;
                    boolean zBooleanValue = ((Boolean) b1Var4.getValue()).booleanValue();
                    boolean zF3 = sVar3.f(function1) | sVar3.h(basicItem2);
                    Object objM4 = sVar3.M();
                    if (zF3 || objM4 == fVar) {
                        z11 = zE2;
                        final int i13 = 1;
                        objM4 = new Function1() { // from class: yj.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj11) {
                                BasicItem basicItem3 = (BasicItem) obj11;
                                switch (i13) {
                                    case 0:
                                        basicItem3.getClass();
                                        function1.invoke(basicItem2);
                                        break;
                                    default:
                                        basicItem3.getClass();
                                        function1.invoke(basicItem2);
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar3.k0(objM4);
                    } else {
                        z11 = zE2;
                    }
                    Function1 function15 = (Function1) objM4;
                    boolean zF4 = sVar3.f(function12) | sVar3.h(basicItem2);
                    Object objM5 = sVar3.M();
                    if (zF4 || objM5 == fVar) {
                        objM5 = new eg.k(function12, basicItem2, 5);
                        sVar3.k0(objM5);
                    }
                    Function0 function02 = (Function0) objM5;
                    boolean zH = sVar3.h(kVar) | sVar3.h(basicItem2) | sVar3.f(function0) | sVar3.f(function13);
                    Object objM6 = sVar3.M();
                    if (zH || objM6 == fVar) {
                        basicItem = basicItem2;
                        objM6 = new a1(kVar, basicItem, function0, function13, b1Var4, 10);
                        b1Var = b1Var4;
                        sVar3.k0(objM6);
                    } else {
                        b1Var = b1Var4;
                        basicItem = basicItem2;
                    }
                    BasicItem basicItem3 = basicItem;
                    t1.m(tVarB, basicItem3, false, z11, zBooleanValue, zE, function15, function02, (Function1) objM6, sVar3, 6, 4);
                    vj.c cVar3 = (vj.c) c3Var.getValue();
                    if (cVar3 == null) {
                        sVar3.a0(1053554310);
                        z12 = false;
                        sVar3.q(false);
                    } else {
                        sVar3.a0(1053554311);
                        String str = kVar.J;
                        if (str == null ? false : ItemId.m201equalsimpl0(str, basicItem3.getInformation().mo340getItemIdFvU5WIY())) {
                            sVar3.a0(523614745);
                            boolean zBooleanValue2 = ((Boolean) b1Var.getValue()).booleanValue();
                            boolean zH2 = sVar3.h(kVar);
                            Object objM7 = sVar3.M();
                            if (zH2 || objM7 == fVar) {
                                objM7 = new yj.d(kVar, 0);
                                sVar3.k0(objM7);
                            }
                            Function0 function03 = (Function0) objM7;
                            boolean zH3 = sVar3.h(kVar) | sVar3.h(basicItem3) | sVar3.f(function13);
                            Object objM8 = sVar3.M();
                            if (zH3 || objM8 == fVar) {
                                objM8 = new lp.v(kVar, basicItem3, function13, b1Var);
                                sVar3.k0(objM8);
                            }
                            Function2 function2 = (Function2) objM8;
                            boolean zH4 = sVar3.h(kVar) | sVar3.h(basicItem3) | sVar3.h(cVar3) | sVar3.f(function13);
                            Object objM9 = sVar3.M();
                            if (zH4 || objM9 == fVar) {
                                objM9 = new cg.d(kVar, basicItem3, cVar3, function13, b1Var, 7);
                                cVar = cVar3;
                                sVar3.k0(objM9);
                            } else {
                                cVar = cVar3;
                            }
                            yj.a.e(w6Var, zBooleanValue2, cVar, function03, function2, (Function0) objM9, sVar3, 0);
                            z12 = false;
                            sVar3.q(false);
                        } else {
                            z12 = false;
                            sVar3.a0(525564614);
                            sVar3.q(false);
                        }
                        sVar3.q(z12);
                    }
                    sVar3.q(z12);
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ e(c cVar, c3 c3Var, b1 b1Var, h1 h1Var, b0 b0Var, b1 b1Var2, c3 c3Var2, c3 c3Var3, u3.d dVar) {
        this.f31132d = cVar;
        this.f31131c = c3Var;
        this.f31130b = b1Var;
        this.f31136h = h1Var;
        this.f31137i = b0Var;
        this.f31135g = b1Var2;
        this.f31133e = c3Var2;
        this.f31134f = c3Var3;
        this.f31138j = dVar;
    }
}
