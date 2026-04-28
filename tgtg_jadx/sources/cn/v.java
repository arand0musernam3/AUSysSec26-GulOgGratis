package cn;

import a3.p0;
import androidx.lifecycle.s1;
import ao.e1;
import bg.k0;
import com.app.tgtg.R;
import com.app.tgtg.feature.itemview.ui.ItemViewActivity;
import com.app.tgtg.model.remote.ParcelDeliveryOptionId;
import com.app.tgtg.model.remote.item.response.CategoryNavigationCard;
import com.app.tgtg.model.remote.order.response.CreateOrderResponse;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.PriceSpecification;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import com.braze.h2;
import d40.t1;
import g3.g7;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;
import m2.b2;
import m3.b1;
import nk.q0;
import nk.r0;
import nk.s0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8593d;

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, int i11) {
        this.f8590a = i11;
        this.f8591b = obj;
        this.f8592c = obj2;
        this.f8593d = obj3;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        b1 b1Var;
        b1 b1Var2;
        boolean z11;
        Price total;
        String userAddressId;
        int i11 = this.f8590a;
        int i12 = 9;
        b4.q qVar = b4.q.f5711a;
        m3.f fVar = m3.m.f29332a;
        Object obj5 = this.f8593d;
        Object obj6 = this.f8592c;
        Object obj7 = this.f8591b;
        switch (i11) {
            case 0:
                a aVar = (a) obj7;
                Function2 function2 = (Function2) obj6;
                Function2 function22 = (Function2) obj5;
                int iIntValue = ((Integer) obj2).intValue();
                m3.n nVar = (m3.n) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((f2.d) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= ((m3.s) nVar).d(iIntValue) ? 32 : 16;
                }
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    List list = aVar.f8469f;
                    CategoryNavigationCard categoryNavigationCard = (CategoryNavigationCard) aVar.f8464a.get(iIntValue);
                    String str = aVar.f8465b;
                    boolean zF = sVar.f(function2);
                    Object objM = sVar.M();
                    if (zF || objM == fVar) {
                        objM = new b3.n(1, function2);
                        sVar.k0(objM);
                    }
                    Function2 function23 = (Function2) objM;
                    boolean zF2 = sVar.f(function22);
                    Object objM2 = sVar.M();
                    if (zF2 || objM2 == fVar) {
                        objM2 = new b3.n(2, function22);
                        sVar.k0(objM2);
                    }
                    h0.g.c(iIntValue, list, categoryNavigationCard, str, function23, (Function2) objM2, sVar, (iIntValue2 >> 3) & 14);
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            case 1:
                String str2 = (String) obj7;
                g4.v vVar = (g4.v) obj6;
                Function1 function1 = (Function1) obj5;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                m3.n nVar2 = (m3.n) obj3;
                ((Integer) obj4).getClass();
                ((s1.l) obj).getClass();
                if (zBooleanValue) {
                    m3.s sVar2 = (m3.s) nVar2;
                    sVar2.a0(305544667);
                    b4.t tVarZ = d2.c.z(qVar, lv.t.f28253g);
                    u0 u0VarD = d2.p.d(b4.d.f5687e, false);
                    int iHashCode = Long.hashCode(sVar2.T);
                    u3.i iVarL = sVar2.l();
                    b4.t tVarC = b4.a.c(tVarZ, sVar2);
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
                    m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar2, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar2);
                    cp.a.o(str2, vVar, function1, sVar2, 0);
                    sVar2.q(true);
                    sVar2.q(false);
                } else {
                    m3.s sVar3 = (m3.s) nVar2;
                    sVar3.a0(305443080);
                    b3.i.y(qVar, lv.t.f28253g, sVar3, false);
                }
                return Unit.f26487a;
            case 2:
                g9.f0 f0Var = (g9.f0) obj7;
                ep.d0 d0Var = (ep.d0) obj6;
                b1 b1Var3 = (b1) obj5;
                ((Integer) obj4).getClass();
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                m3.s sVar4 = (m3.s) ((m3.n) obj3);
                boolean zH = sVar4.h(d0Var);
                Object objM3 = sVar4.M();
                if (zH || objM3 == fVar) {
                    objM3 = new ep.j(d0Var, 2);
                    sVar4.k0(objM3);
                }
                Function1 function12 = (Function1) objM3;
                Object objM4 = sVar4.M();
                if (objM4 == fVar) {
                    objM4 = new p0(b1Var3, 9);
                    sVar4.k0(objM4);
                }
                lp.d.r(f0Var, d0Var, function12, (Function1) objM4, sVar4, 3072);
                return Unit.f26487a;
            case 3:
                ItemViewActivity itemViewActivity = (ItemViewActivity) obj7;
                g7 g7Var = (g7) obj6;
                f2.c0 c0Var = (f2.c0) obj5;
                s0 s0Var = (s0) obj2;
                m3.n nVar3 = (m3.n) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                int i13 = ItemViewActivity.f9011k;
                ((s1.l) obj).getClass();
                s0Var.getClass();
                if (s0Var instanceof nk.p0) {
                    m3.s sVar5 = (m3.s) nVar3;
                    sVar5.a0(-1332706340);
                    sVar5.q(false);
                    Throwable th2 = ((nk.p0) s0Var).f31032a;
                    if ((th2 instanceof qg.a) && Intrinsics.areEqual(((qg.a) th2).f37046a, "ENTITY_DISABLED")) {
                        k0 k0Var = new k0(itemViewActivity);
                        k0Var.e(R.string.item_view_error_on_load_unavailable_store);
                        k0Var.c(android.R.string.ok);
                        k0Var.f6179j = false;
                        k0Var.f6180k = true;
                        k0Var.l = new b2(itemViewActivity, 18);
                        k0Var.f();
                    } else if (!itemViewActivity.isFinishing()) {
                        if (itemViewActivity.isTaskRoot()) {
                            new mv.a0().c(itemViewActivity);
                        } else {
                            itemViewActivity.finish();
                        }
                    }
                } else if (s0Var instanceof q0) {
                    m3.s sVar6 = (m3.s) nVar3;
                    sVar6.a0(-1332348290);
                    qk.j.a((q0) s0Var, itemViewActivity.E().f37190e, g7Var, c0Var, sVar6, ((iIntValue3 >> 3) & 14) | MLKEMEngine.KyberPolyBytes);
                    sVar6.q(false);
                } else {
                    if (!Intrinsics.areEqual(s0Var, r0.f31058a)) {
                        throw e0.f.v((m3.s) nVar3, 1203934007, false);
                    }
                    m3.s sVar7 = (m3.s) nVar3;
                    j4.s.y(1203958014, 0, sVar7, sVar7, false);
                }
                return Unit.f26487a;
            case 4:
                Function0 function0 = (Function0) obj7;
                Function2 function24 = (Function2) obj6;
                g9.f0 f0Var2 = (g9.f0) obj5;
                m3.n nVar4 = (m3.n) obj3;
                ((Integer) obj4).getClass();
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                s1 s1VarA = z8.a.a(nVar4);
                if (s1VarA == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                xl.m mVar = (xl.m) t1.K(Reflection.getOrCreateKotlinClass(xl.m.class), s1VarA, o30.e0.r(s1VarA, nVar4), s1VarA instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, nVar4);
                m3.s sVar8 = (m3.s) nVar4;
                boolean zH2 = sVar8.h(f0Var2);
                Object objM5 = sVar8.M();
                if (zH2 || objM5 == fVar) {
                    objM5 = new dq.g(f0Var2, i12);
                    sVar8.k0(objM5);
                }
                v0.n.h(null, mVar, function0, function24, (Function0) objM5, sVar8, 0);
                return Unit.f26487a;
            default:
                yi.r rVar = (yi.r) obj7;
                b1 b1Var4 = (b1) obj6;
                b1 b1Var5 = (b1) obj5;
                m3.n nVar5 = (m3.n) obj3;
                ((Integer) obj4).getClass();
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                b1 b1VarN = m3.i.n(rVar.v().f8349j, nVar5, 0);
                b1 b1VarN2 = m3.i.n(rVar.u().l, nVar5, 0);
                b1 b1VarN3 = m3.i.n(rVar.v().f8353o, nVar5, 0);
                b1 b1VarN4 = m3.i.n(rVar.v().f8357s, nVar5, 0);
                b1 b1VarN5 = m3.i.n(rVar.v().f8362x, nVar5, 0);
                b1 b1VarN6 = m3.i.n(rVar.u().f8220j, nVar5, 0);
                b1 b1VarN7 = m3.i.n(rVar.u().D, nVar5, 0);
                b1 b1VarN8 = m3.i.n(rVar.u().B, nVar5, 0);
                CreateOrderResponse.CreateOrderState createOrderState = (CreateOrderResponse.CreateOrderState) b1VarN5.getValue();
                m3.s sVar9 = (m3.s) nVar5;
                boolean zH3 = sVar9.h(rVar);
                Object objM6 = sVar9.M();
                x70.c cVar = null;
                if (zH3 || objM6 == fVar) {
                    b1Var = b1VarN2;
                    objM6 = new yi.j(rVar, cVar, 1);
                    sVar9.k0(objM6);
                } else {
                    b1Var = b1VarN2;
                }
                m3.i.h(createOrderState, (Function2) objM6, sVar9);
                CreateOrderResponse.CreateOrderState createOrderState2 = (CreateOrderResponse.CreateOrderState) b1VarN6.getValue();
                boolean zH4 = sVar9.h(rVar);
                Object objM7 = sVar9.M();
                if (zH4 || objM7 == fVar) {
                    objM7 = new yi.j(rVar, cVar, 2);
                    sVar9.k0(objM7);
                }
                m3.i.h(createOrderState2, (Function2) objM7, sVar9);
                Boolean bool = (Boolean) b1VarN8.getValue();
                bool.getClass();
                boolean zF3 = sVar9.f(b1VarN8) | sVar9.h(rVar);
                Object objM8 = sVar9.M();
                if (zF3 || objM8 == fVar) {
                    objM8 = new rf.c(rVar, b1VarN8, cVar, 24);
                    sVar9.k0(objM8);
                }
                m3.i.h(bool, (Function2) objM8, sVar9);
                Object objM9 = sVar9.M();
                if (objM9 == fVar) {
                    objM9 = m3.i.w(Boolean.FALSE);
                    sVar9.k0(objM9);
                }
                b1 b1Var6 = (b1) objM9;
                UserAddress userAddress = (UserAddress) b1Var.getValue();
                if (userAddress != null && (userAddressId = userAddress.getUserAddressId()) != null && rVar.u().X) {
                    rVar.u().X = false;
                    rVar.v().W = userAddressId;
                    cj.q qVarV = rVar.v();
                    ParcelDeliveryOptionId parcelDeliveryOptionId = (ParcelDeliveryOptionId) rVar.u().W.d();
                    qVarV.f8332a0 = parcelDeliveryOptionId != null ? parcelDeliveryOptionId.m229unboximpl() : null;
                    rVar.v().j();
                }
                PriceSpecification priceSpecification = (PriceSpecification) b1VarN.getValue();
                String currency = (priceSpecification == null || (total = priceSpecification.getTotal()) == null) ? null : total.getCurrency();
                if (currency == null || currency.length() == 0) {
                    b1Var2 = b1VarN4;
                    sVar9.a0(1545468813);
                    sVar9.q(false);
                } else {
                    sVar9.a0(1545053661);
                    b1 b1VarN9 = m3.i.n(rVar.v().f8351m, sVar9, 0);
                    List list2 = (List) b1VarN9.getValue();
                    boolean zH5 = sVar9.h(rVar) | sVar9.f(b1VarN9) | sVar9.f(b1VarN);
                    Object objM10 = sVar9.M();
                    if (zH5 || objM10 == fVar) {
                        b1Var2 = b1VarN4;
                        e1 e1Var = new e1(rVar, b1VarN9, b1VarN, cVar, 25);
                        sVar9.k0(e1Var);
                        objM10 = e1Var;
                    } else {
                        b1Var2 = b1VarN4;
                    }
                    m3.i.h(list2, (Function2) objM10, sVar9);
                    sVar9.q(false);
                }
                if (((Boolean) b1VarN7.getValue()).booleanValue()) {
                    sVar9.a0(1545536021);
                    boolean zH6 = sVar9.h(rVar);
                    Object objM11 = sVar9.M();
                    if (zH6 || objM11 == fVar) {
                        objM11 = new yi.b(rVar, 4);
                        sVar9.k0(objM11);
                    }
                    z11 = false;
                    o00.h0.d((Function0) objM11, sVar9, 0);
                    sVar9.q(false);
                } else {
                    z11 = false;
                    sVar9.a0(1545835853);
                    sVar9.q(false);
                }
                u0 u0VarD2 = d2.p.d(b4.d.f5683a, z11);
                int iHashCode2 = Long.hashCode(sVar9.T);
                u3.i iVarL2 = sVar9.l();
                b4.t tVarC2 = b4.a.c(qVar, sVar9);
                b5.j.R.getClass();
                b5.h hVar2 = b5.i.f5839b;
                sVar9.e0();
                if (sVar9.S) {
                    sVar9.k(hVar2);
                } else {
                    sVar9.n0();
                }
                m3.i.C(u0VarD2, b5.i.f5843f, sVar9);
                m3.i.C(iVarL2, b5.i.f5842e, sVar9);
                m3.i.v(sVar9, Integer.valueOf(iHashCode2), b5.i.f5844g);
                m3.i.z(sVar9, b5.i.f5845h);
                m3.i.C(tVarC2, b5.i.f5841d, sVar9);
                cj.q qVarV2 = rVar.v();
                cj.e0 e0VarU = rVar.u();
                boolean zH7 = sVar9.h(rVar);
                Object objM12 = sVar9.M();
                if (zH7 || objM12 == fVar) {
                    objM12 = new zl.c(rVar);
                    sVar9.k0(objM12);
                }
                KFunction kFunction = (KFunction) objM12;
                PriceSpecification priceSpecification2 = (PriceSpecification) b1VarN.getValue();
                boolean zBooleanValue2 = ((Boolean) b1Var2.getValue()).booleanValue();
                boolean zH8 = sVar9.h(rVar);
                Object objM13 = sVar9.M();
                if (zH8 || objM13 == fVar) {
                    objM13 = new yi.b(rVar, 5);
                    sVar9.k0(objM13);
                }
                Function0 function02 = (Function0) objM13;
                Function1 function13 = (Function1) kFunction;
                boolean zH9 = sVar9.h(rVar);
                Object objM14 = sVar9.M();
                if (zH9 || objM14 == fVar) {
                    objM14 = new yi.e(b1Var4, rVar);
                    sVar9.k0(objM14);
                }
                Function0 function03 = (Function0) objM14;
                boolean zF4 = sVar9.f(b1VarN3) | sVar9.f(b1Var2) | sVar9.h(rVar);
                Object objM15 = sVar9.M();
                if (zF4 || objM15 == fVar) {
                    objM15 = new yi.f(b1Var4, rVar, b1VarN3, b1Var2);
                    sVar9.k0(objM15);
                }
                Function0 function04 = (Function0) objM15;
                boolean zH10 = sVar9.h(rVar);
                Object objM16 = sVar9.M();
                if (zH10 || objM16 == fVar) {
                    objM16 = new yi.e(rVar, b1Var5, 1);
                    sVar9.k0(objM16);
                }
                Function0 function05 = (Function0) objM16;
                boolean zH11 = sVar9.h(rVar);
                Object objM17 = sVar9.M();
                if (zH11 || objM17 == fVar) {
                    objM17 = new yi.e(rVar, b1Var5, 2);
                    sVar9.k0(objM17);
                }
                Function0 function06 = (Function0) objM17;
                boolean zH12 = sVar9.h(rVar);
                Object objM18 = sVar9.M();
                int i14 = 6;
                if (zH12 || objM18 == fVar) {
                    objM18 = new yi.b(rVar, i14);
                    sVar9.k0(objM18);
                }
                Function0 function07 = (Function0) objM18;
                boolean zH13 = sVar9.h(rVar);
                Object objM19 = sVar9.M();
                if (zH13 || objM19 == fVar) {
                    objM19 = new br.h(rVar, 3);
                    sVar9.k0(objM19);
                }
                xi.d.c(priceSpecification2, qVarV2, e0VarU, function02, function13, function03, function04, function05, function06, zBooleanValue2, b1Var6, function07, (Function2) objM19, sVar9, 0);
                s1.y.d(!((Boolean) b1Var6.getValue()).booleanValue(), d2.u.f13938a.a(qVar, b4.d.f5690h), s1.r0.d(t1.c.k(300, 0, null, 6), 2), s1.r0.e(t1.c.k(300, 0, null, 6), 2), null, yi.t.f46025b, sVar9, 200064, 16);
                sVar9.q(true);
                b1 b1VarN10 = m3.i.n(rVar.v().G, sVar9, 0);
                boolean zH14 = sVar9.h(rVar);
                Object objM20 = sVar9.M();
                if (zH14 || objM20 == fVar) {
                    objM20 = new tm.d(rVar, b1Var6, cVar, 23);
                    sVar9.k0(objM20);
                }
                m3.i.h(b1VarN10, (Function2) objM20, sVar9);
                return Unit.f26487a;
        }
    }
}
