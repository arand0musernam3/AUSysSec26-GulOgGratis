package m2;

import a3.p3;
import android.content.Context;
import androidx.lifecycle.m1;
import c5.f1;
import c5.x1;
import com.app.tgtg.model.remote.ParcelDeliveryOptionId;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.CharityItem;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionsLocal;
import com.app.tgtg.model.remote.order.response.CreateOrderResponse;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28879d;

    public /* synthetic */ h0(Object obj, Object obj2, Object obj3, int i11) {
        this.f28876a = i11;
        this.f28877b = obj;
        this.f28878c = obj2;
        this.f28879d = obj3;
    }

    private final Object a(Object obj) {
        boolean z11;
        x2.w wVar = (x2.w) this.f28877b;
        v80.b0 b0Var = (v80.b0) this.f28878c;
        Context context = (Context) this.f28879d;
        o2.a aVar = (o2.a) obj;
        aVar.a();
        j1 j1Var = j1.Cut;
        boolean z12 = !m5.t0.d(wVar.f43781a.d().f41929d) && wVar.m();
        x70.c cVar = null;
        p3 p3Var = new p3(b0Var, new x2.z(wVar, cVar, 0), 1);
        x2.b0 b0Var2 = x2.b0.None;
        g0.D(aVar, context.getResources(), j1Var, z12, new x2.y(0, p3Var, cVar, wVar, b0Var2));
        int i11 = 1;
        g0.D(aVar, context.getResources(), j1.Copy, !m5.t0.d(wVar.f43781a.d().f41929d), new x2.y(0, new p3(b0Var, new x2.z(wVar, cVar, i11), i11), cVar, wVar, b0Var2));
        j1 j1Var2 = j1.Paste;
        if (!wVar.m()) {
            z11 = false;
        } else if (wVar.f43804y.f7069a) {
            z11 = true;
        } else {
            Function0 function0 = wVar.f43792m;
            if (function0 != null && function0.invoke() != null) {
                org.bouncycastle.jce.provider.a.c();
            }
            z11 = false;
        }
        g0.D(aVar, context.getResources(), j1Var2, z11, new x2.y(0, new p3(b0Var, new x2.z(wVar, cVar, 2), 1), cVar, wVar, b0Var2));
        j1 j1Var3 = j1.SelectAll;
        w2.s1 s1Var = wVar.f43781a;
        boolean z13 = m5.t0.e(s1Var.d().f41929d) != s1Var.d().f41928c.length();
        g0.D(aVar, context.getResources(), j1Var3, z13, new x2.y(0, new g(wVar, 8), new g(wVar, 7), wVar, x2.b0.Selection));
        g0.D(aVar, context.getResources(), j1.Autofill, wVar.m() && m5.t0.d(wVar.f43781a.d().f41929d), new x2.y(0, new g(wVar, 9), cVar, wVar, b0Var2));
        aVar.a();
        return Unit.f26487a;
    }

    private final Object b(Object obj) {
        final yi.r rVar = (yi.r) this.f28877b;
        m3.b1 b1Var = (m3.b1) this.f28878c;
        m3.b1 b1Var2 = (m3.b1) this.f28879d;
        g9.c0 c0Var = (g9.c0) obj;
        c0Var.getClass();
        final int i11 = 0;
        zz.f.m(c0Var, aj.e.CHARITY.a(), new u3.d(new i80.o() { // from class: yi.d
            @Override // i80.o
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                s1.l lVar = (s1.l) obj2;
                g9.l lVar2 = (g9.l) obj3;
                m3.n nVar = (m3.n) obj4;
                Integer num = (Integer) obj5;
                switch (i11) {
                    case 0:
                        num.getClass();
                        lVar.getClass();
                        lVar2.getClass();
                        r rVar2 = rVar;
                        List list = (List) m3.i.n(rVar2.v().f8351m, nVar, 0).getValue();
                        m3.s sVar = (m3.s) nVar;
                        boolean zH = sVar.h(rVar2);
                        Object objM = sVar.M();
                        m3.f fVar = m3.m.f29332a;
                        if (zH || objM == fVar) {
                            objM = new j(rVar2, null, 0);
                            sVar.k0(objM);
                        }
                        m3.i.h(list, (Function2) objM, sVar);
                        f1 f1Var = (f1) sVar.j(x1.f7425r);
                        BasicItem basicItemF = rVar2.v().f();
                        basicItemF.getClass();
                        CharityItem charityItem = (CharityItem) basicItemF;
                        boolean zH2 = sVar.h(rVar2);
                        Object objM2 = sVar.M();
                        if (zH2 || objM2 == fVar) {
                            objM2 = new b(rVar2, 2);
                            sVar.k0(objM2);
                        }
                        Function0 function0 = (Function0) objM2;
                        boolean zH3 = sVar.h(rVar2) | sVar.h(f1Var);
                        Object objM3 = sVar.M();
                        if (zH3 || objM3 == fVar) {
                            objM3 = new us.j(26, rVar2, f1Var);
                            sVar.k0(objM3);
                        }
                        Function0 function02 = (Function0) objM3;
                        boolean zH4 = sVar.h(rVar2);
                        Object objM4 = sVar.M();
                        if (zH4 || objM4 == fVar) {
                            objM4 = new b(rVar2, 3);
                            sVar.k0(objM4);
                        }
                        w.b.b(null, charityItem, function0, function02, (Function0) objM4, sVar, 0);
                        break;
                    case 1:
                        num.getClass();
                        lVar.getClass();
                        lVar2.getClass();
                        r rVar3 = rVar;
                        if (((Boolean) m3.i.n(rVar3.u().f8231v, nVar, 0).getValue()).booleanValue()) {
                            cj.e0 e0VarU = rVar3.u();
                            v80.f0.B(m1.d(e0VarU), null, null, new cj.r(e0VarU, null, 3), 3);
                            rVar3.w();
                        }
                        BottomSheetBehavior bottomSheetBehavior = rVar3.f46021m;
                        if (bottomSheetBehavior != null) {
                            bottomSheetBehavior.J(3);
                        }
                        m3.s sVar2 = (m3.s) nVar;
                        Object objM5 = sVar2.M();
                        m3.f fVar2 = m3.m.f29332a;
                        if (objM5 == fVar2) {
                            objM5 = k.f46009a;
                            sVar2.k0(objM5);
                        }
                        i80.n nVar2 = (i80.n) ((KFunction) objM5);
                        Object objM6 = sVar2.M();
                        if (objM6 == fVar2) {
                            objM6 = new w2.g0(19);
                            sVar2.k0(objM6);
                        }
                        c6.l.b(nVar2, null, (Function1) objM6, sVar2, 390, 2);
                        break;
                    case 2:
                        w.a0.A(num, lVar, lVar2);
                        m3.s sVar3 = (m3.s) nVar;
                        Object objM7 = sVar3.M();
                        m3.f fVar3 = m3.m.f29332a;
                        if (objM7 == fVar3) {
                            objM7 = m3.i.o(kotlin.coroutines.g.f26549a, sVar3);
                            sVar3.k0(objM7);
                        }
                        v80.b0 b0Var = (v80.b0) objM7;
                        r rVar4 = rVar;
                        b1 b1VarN = m3.i.n(rVar4.u().f8223n, sVar3, 0);
                        b1 b1VarN2 = m3.i.n(rVar4.u().Z, sVar3, 0);
                        DeliveryOptionsLocal deliveryOptionsLocal = (DeliveryOptionsLocal) b1VarN.getValue();
                        ParcelDeliveryOptionId parcelDeliveryOptionId = (ParcelDeliveryOptionId) b1VarN2.getValue();
                        String strM229unboximpl = parcelDeliveryOptionId != null ? parcelDeliveryOptionId.m229unboximpl() : null;
                        boolean zI = rVar4.u().i();
                        boolean zH5 = sVar3.h(rVar4) | sVar3.h(b0Var);
                        Object objM8 = sVar3.M();
                        if (zH5 || objM8 == fVar3) {
                            objM8 = new bn.c0(12, rVar4, b0Var);
                            sVar3.k0(objM8);
                        }
                        i80.n nVar3 = (i80.n) objM8;
                        boolean zH6 = sVar3.h(b0Var) | sVar3.h(rVar4);
                        Object objM9 = sVar3.M();
                        if (zH6 || objM9 == fVar3) {
                            objM9 = new xq.a(3, b0Var, rVar4);
                            sVar3.k0(objM9);
                        }
                        wi.p.c(deliveryOptionsLocal, strM229unboximpl, zI, nVar3, (Function1) objM9, sVar3, 0);
                        break;
                    default:
                        num.getClass();
                        lVar.getClass();
                        lVar2.getClass();
                        r rVar5 = rVar;
                        b1 b1VarN3 = m3.i.n(rVar5.v().f8362x, nVar, 0);
                        b1 b1VarN4 = m3.i.n(rVar5.u().f8220j, nVar, 0);
                        BottomSheetBehavior bottomSheetBehavior2 = rVar5.f46021m;
                        if (bottomSheetBehavior2 != null) {
                            bottomSheetBehavior2.J(3);
                        }
                        CreateOrderResponse.CreateOrderState createOrderState = (CreateOrderResponse.CreateOrderState) b1VarN4.getValue();
                        if (createOrderState == null) {
                            createOrderState = (CreateOrderResponse.CreateOrderState) b1VarN3.getValue();
                        }
                        ItemType itemTypeG = rVar5.v().g();
                        m3.s sVar4 = (m3.s) nVar;
                        boolean zF = sVar4.f(b1VarN3) | sVar4.h(rVar5);
                        Object objM10 = sVar4.M();
                        if (zF || objM10 == m3.m.f29332a) {
                            objM10 = new us.j(27, rVar5, b1VarN3);
                            sVar4.k0(objM10);
                        }
                        xi.f.a(createOrderState, itemTypeG, (Function0) objM10, sVar4, 0);
                        break;
                }
                return Unit.f26487a;
            }
        }, true, 368798206));
        zz.f.m(c0Var, aj.e.CHECKOUT.a(), new u3.d(new cn.v(rVar, b1Var, b1Var2, 5), true, -370465035));
        final int i12 = 1;
        zz.f.m(c0Var, aj.e.PARCEL_ADDRESS_ENTRY.a(), new u3.d(new i80.o() { // from class: yi.d
            @Override // i80.o
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                s1.l lVar = (s1.l) obj2;
                g9.l lVar2 = (g9.l) obj3;
                m3.n nVar = (m3.n) obj4;
                Integer num = (Integer) obj5;
                switch (i12) {
                    case 0:
                        num.getClass();
                        lVar.getClass();
                        lVar2.getClass();
                        r rVar2 = rVar;
                        List list = (List) m3.i.n(rVar2.v().f8351m, nVar, 0).getValue();
                        m3.s sVar = (m3.s) nVar;
                        boolean zH = sVar.h(rVar2);
                        Object objM = sVar.M();
                        m3.f fVar = m3.m.f29332a;
                        if (zH || objM == fVar) {
                            objM = new j(rVar2, null, 0);
                            sVar.k0(objM);
                        }
                        m3.i.h(list, (Function2) objM, sVar);
                        f1 f1Var = (f1) sVar.j(x1.f7425r);
                        BasicItem basicItemF = rVar2.v().f();
                        basicItemF.getClass();
                        CharityItem charityItem = (CharityItem) basicItemF;
                        boolean zH2 = sVar.h(rVar2);
                        Object objM2 = sVar.M();
                        if (zH2 || objM2 == fVar) {
                            objM2 = new b(rVar2, 2);
                            sVar.k0(objM2);
                        }
                        Function0 function0 = (Function0) objM2;
                        boolean zH3 = sVar.h(rVar2) | sVar.h(f1Var);
                        Object objM3 = sVar.M();
                        if (zH3 || objM3 == fVar) {
                            objM3 = new us.j(26, rVar2, f1Var);
                            sVar.k0(objM3);
                        }
                        Function0 function02 = (Function0) objM3;
                        boolean zH4 = sVar.h(rVar2);
                        Object objM4 = sVar.M();
                        if (zH4 || objM4 == fVar) {
                            objM4 = new b(rVar2, 3);
                            sVar.k0(objM4);
                        }
                        w.b.b(null, charityItem, function0, function02, (Function0) objM4, sVar, 0);
                        break;
                    case 1:
                        num.getClass();
                        lVar.getClass();
                        lVar2.getClass();
                        r rVar3 = rVar;
                        if (((Boolean) m3.i.n(rVar3.u().f8231v, nVar, 0).getValue()).booleanValue()) {
                            cj.e0 e0VarU = rVar3.u();
                            v80.f0.B(m1.d(e0VarU), null, null, new cj.r(e0VarU, null, 3), 3);
                            rVar3.w();
                        }
                        BottomSheetBehavior bottomSheetBehavior = rVar3.f46021m;
                        if (bottomSheetBehavior != null) {
                            bottomSheetBehavior.J(3);
                        }
                        m3.s sVar2 = (m3.s) nVar;
                        Object objM5 = sVar2.M();
                        m3.f fVar2 = m3.m.f29332a;
                        if (objM5 == fVar2) {
                            objM5 = k.f46009a;
                            sVar2.k0(objM5);
                        }
                        i80.n nVar2 = (i80.n) ((KFunction) objM5);
                        Object objM6 = sVar2.M();
                        if (objM6 == fVar2) {
                            objM6 = new w2.g0(19);
                            sVar2.k0(objM6);
                        }
                        c6.l.b(nVar2, null, (Function1) objM6, sVar2, 390, 2);
                        break;
                    case 2:
                        w.a0.A(num, lVar, lVar2);
                        m3.s sVar3 = (m3.s) nVar;
                        Object objM7 = sVar3.M();
                        m3.f fVar3 = m3.m.f29332a;
                        if (objM7 == fVar3) {
                            objM7 = m3.i.o(kotlin.coroutines.g.f26549a, sVar3);
                            sVar3.k0(objM7);
                        }
                        v80.b0 b0Var = (v80.b0) objM7;
                        r rVar4 = rVar;
                        b1 b1VarN = m3.i.n(rVar4.u().f8223n, sVar3, 0);
                        b1 b1VarN2 = m3.i.n(rVar4.u().Z, sVar3, 0);
                        DeliveryOptionsLocal deliveryOptionsLocal = (DeliveryOptionsLocal) b1VarN.getValue();
                        ParcelDeliveryOptionId parcelDeliveryOptionId = (ParcelDeliveryOptionId) b1VarN2.getValue();
                        String strM229unboximpl = parcelDeliveryOptionId != null ? parcelDeliveryOptionId.m229unboximpl() : null;
                        boolean zI = rVar4.u().i();
                        boolean zH5 = sVar3.h(rVar4) | sVar3.h(b0Var);
                        Object objM8 = sVar3.M();
                        if (zH5 || objM8 == fVar3) {
                            objM8 = new bn.c0(12, rVar4, b0Var);
                            sVar3.k0(objM8);
                        }
                        i80.n nVar3 = (i80.n) objM8;
                        boolean zH6 = sVar3.h(b0Var) | sVar3.h(rVar4);
                        Object objM9 = sVar3.M();
                        if (zH6 || objM9 == fVar3) {
                            objM9 = new xq.a(3, b0Var, rVar4);
                            sVar3.k0(objM9);
                        }
                        wi.p.c(deliveryOptionsLocal, strM229unboximpl, zI, nVar3, (Function1) objM9, sVar3, 0);
                        break;
                    default:
                        num.getClass();
                        lVar.getClass();
                        lVar2.getClass();
                        r rVar5 = rVar;
                        b1 b1VarN3 = m3.i.n(rVar5.v().f8362x, nVar, 0);
                        b1 b1VarN4 = m3.i.n(rVar5.u().f8220j, nVar, 0);
                        BottomSheetBehavior bottomSheetBehavior2 = rVar5.f46021m;
                        if (bottomSheetBehavior2 != null) {
                            bottomSheetBehavior2.J(3);
                        }
                        CreateOrderResponse.CreateOrderState createOrderState = (CreateOrderResponse.CreateOrderState) b1VarN4.getValue();
                        if (createOrderState == null) {
                            createOrderState = (CreateOrderResponse.CreateOrderState) b1VarN3.getValue();
                        }
                        ItemType itemTypeG = rVar5.v().g();
                        m3.s sVar4 = (m3.s) nVar;
                        boolean zF = sVar4.f(b1VarN3) | sVar4.h(rVar5);
                        Object objM10 = sVar4.M();
                        if (zF || objM10 == m3.m.f29332a) {
                            objM10 = new us.j(27, rVar5, b1VarN3);
                            sVar4.k0(objM10);
                        }
                        xi.f.a(createOrderState, itemTypeG, (Function0) objM10, sVar4, 0);
                        break;
                }
                return Unit.f26487a;
            }
        }, true, -674322570));
        final int i13 = 2;
        zz.f.m(c0Var, aj.e.PARCEL_PICKUP_OPTIONS.a(), new u3.d(new i80.o() { // from class: yi.d
            @Override // i80.o
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                s1.l lVar = (s1.l) obj2;
                g9.l lVar2 = (g9.l) obj3;
                m3.n nVar = (m3.n) obj4;
                Integer num = (Integer) obj5;
                switch (i13) {
                    case 0:
                        num.getClass();
                        lVar.getClass();
                        lVar2.getClass();
                        r rVar2 = rVar;
                        List list = (List) m3.i.n(rVar2.v().f8351m, nVar, 0).getValue();
                        m3.s sVar = (m3.s) nVar;
                        boolean zH = sVar.h(rVar2);
                        Object objM = sVar.M();
                        m3.f fVar = m3.m.f29332a;
                        if (zH || objM == fVar) {
                            objM = new j(rVar2, null, 0);
                            sVar.k0(objM);
                        }
                        m3.i.h(list, (Function2) objM, sVar);
                        f1 f1Var = (f1) sVar.j(x1.f7425r);
                        BasicItem basicItemF = rVar2.v().f();
                        basicItemF.getClass();
                        CharityItem charityItem = (CharityItem) basicItemF;
                        boolean zH2 = sVar.h(rVar2);
                        Object objM2 = sVar.M();
                        if (zH2 || objM2 == fVar) {
                            objM2 = new b(rVar2, 2);
                            sVar.k0(objM2);
                        }
                        Function0 function0 = (Function0) objM2;
                        boolean zH3 = sVar.h(rVar2) | sVar.h(f1Var);
                        Object objM3 = sVar.M();
                        if (zH3 || objM3 == fVar) {
                            objM3 = new us.j(26, rVar2, f1Var);
                            sVar.k0(objM3);
                        }
                        Function0 function02 = (Function0) objM3;
                        boolean zH4 = sVar.h(rVar2);
                        Object objM4 = sVar.M();
                        if (zH4 || objM4 == fVar) {
                            objM4 = new b(rVar2, 3);
                            sVar.k0(objM4);
                        }
                        w.b.b(null, charityItem, function0, function02, (Function0) objM4, sVar, 0);
                        break;
                    case 1:
                        num.getClass();
                        lVar.getClass();
                        lVar2.getClass();
                        r rVar3 = rVar;
                        if (((Boolean) m3.i.n(rVar3.u().f8231v, nVar, 0).getValue()).booleanValue()) {
                            cj.e0 e0VarU = rVar3.u();
                            v80.f0.B(m1.d(e0VarU), null, null, new cj.r(e0VarU, null, 3), 3);
                            rVar3.w();
                        }
                        BottomSheetBehavior bottomSheetBehavior = rVar3.f46021m;
                        if (bottomSheetBehavior != null) {
                            bottomSheetBehavior.J(3);
                        }
                        m3.s sVar2 = (m3.s) nVar;
                        Object objM5 = sVar2.M();
                        m3.f fVar2 = m3.m.f29332a;
                        if (objM5 == fVar2) {
                            objM5 = k.f46009a;
                            sVar2.k0(objM5);
                        }
                        i80.n nVar2 = (i80.n) ((KFunction) objM5);
                        Object objM6 = sVar2.M();
                        if (objM6 == fVar2) {
                            objM6 = new w2.g0(19);
                            sVar2.k0(objM6);
                        }
                        c6.l.b(nVar2, null, (Function1) objM6, sVar2, 390, 2);
                        break;
                    case 2:
                        w.a0.A(num, lVar, lVar2);
                        m3.s sVar3 = (m3.s) nVar;
                        Object objM7 = sVar3.M();
                        m3.f fVar3 = m3.m.f29332a;
                        if (objM7 == fVar3) {
                            objM7 = m3.i.o(kotlin.coroutines.g.f26549a, sVar3);
                            sVar3.k0(objM7);
                        }
                        v80.b0 b0Var = (v80.b0) objM7;
                        r rVar4 = rVar;
                        b1 b1VarN = m3.i.n(rVar4.u().f8223n, sVar3, 0);
                        b1 b1VarN2 = m3.i.n(rVar4.u().Z, sVar3, 0);
                        DeliveryOptionsLocal deliveryOptionsLocal = (DeliveryOptionsLocal) b1VarN.getValue();
                        ParcelDeliveryOptionId parcelDeliveryOptionId = (ParcelDeliveryOptionId) b1VarN2.getValue();
                        String strM229unboximpl = parcelDeliveryOptionId != null ? parcelDeliveryOptionId.m229unboximpl() : null;
                        boolean zI = rVar4.u().i();
                        boolean zH5 = sVar3.h(rVar4) | sVar3.h(b0Var);
                        Object objM8 = sVar3.M();
                        if (zH5 || objM8 == fVar3) {
                            objM8 = new bn.c0(12, rVar4, b0Var);
                            sVar3.k0(objM8);
                        }
                        i80.n nVar3 = (i80.n) objM8;
                        boolean zH6 = sVar3.h(b0Var) | sVar3.h(rVar4);
                        Object objM9 = sVar3.M();
                        if (zH6 || objM9 == fVar3) {
                            objM9 = new xq.a(3, b0Var, rVar4);
                            sVar3.k0(objM9);
                        }
                        wi.p.c(deliveryOptionsLocal, strM229unboximpl, zI, nVar3, (Function1) objM9, sVar3, 0);
                        break;
                    default:
                        num.getClass();
                        lVar.getClass();
                        lVar2.getClass();
                        r rVar5 = rVar;
                        b1 b1VarN3 = m3.i.n(rVar5.v().f8362x, nVar, 0);
                        b1 b1VarN4 = m3.i.n(rVar5.u().f8220j, nVar, 0);
                        BottomSheetBehavior bottomSheetBehavior2 = rVar5.f46021m;
                        if (bottomSheetBehavior2 != null) {
                            bottomSheetBehavior2.J(3);
                        }
                        CreateOrderResponse.CreateOrderState createOrderState = (CreateOrderResponse.CreateOrderState) b1VarN4.getValue();
                        if (createOrderState == null) {
                            createOrderState = (CreateOrderResponse.CreateOrderState) b1VarN3.getValue();
                        }
                        ItemType itemTypeG = rVar5.v().g();
                        m3.s sVar4 = (m3.s) nVar;
                        boolean zF = sVar4.f(b1VarN3) | sVar4.h(rVar5);
                        Object objM10 = sVar4.M();
                        if (zF || objM10 == m3.m.f29332a) {
                            objM10 = new us.j(27, rVar5, b1VarN3);
                            sVar4.k0(objM10);
                        }
                        xi.f.a(createOrderState, itemTypeG, (Function0) objM10, sVar4, 0);
                        break;
                }
                return Unit.f26487a;
            }
        }, true, -978180105));
        final int i14 = 3;
        zz.f.m(c0Var, aj.e.ERROR_VIEW.a(), new u3.d(new i80.o() { // from class: yi.d
            @Override // i80.o
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                s1.l lVar = (s1.l) obj2;
                g9.l lVar2 = (g9.l) obj3;
                m3.n nVar = (m3.n) obj4;
                Integer num = (Integer) obj5;
                switch (i14) {
                    case 0:
                        num.getClass();
                        lVar.getClass();
                        lVar2.getClass();
                        r rVar2 = rVar;
                        List list = (List) m3.i.n(rVar2.v().f8351m, nVar, 0).getValue();
                        m3.s sVar = (m3.s) nVar;
                        boolean zH = sVar.h(rVar2);
                        Object objM = sVar.M();
                        m3.f fVar = m3.m.f29332a;
                        if (zH || objM == fVar) {
                            objM = new j(rVar2, null, 0);
                            sVar.k0(objM);
                        }
                        m3.i.h(list, (Function2) objM, sVar);
                        f1 f1Var = (f1) sVar.j(x1.f7425r);
                        BasicItem basicItemF = rVar2.v().f();
                        basicItemF.getClass();
                        CharityItem charityItem = (CharityItem) basicItemF;
                        boolean zH2 = sVar.h(rVar2);
                        Object objM2 = sVar.M();
                        if (zH2 || objM2 == fVar) {
                            objM2 = new b(rVar2, 2);
                            sVar.k0(objM2);
                        }
                        Function0 function0 = (Function0) objM2;
                        boolean zH3 = sVar.h(rVar2) | sVar.h(f1Var);
                        Object objM3 = sVar.M();
                        if (zH3 || objM3 == fVar) {
                            objM3 = new us.j(26, rVar2, f1Var);
                            sVar.k0(objM3);
                        }
                        Function0 function02 = (Function0) objM3;
                        boolean zH4 = sVar.h(rVar2);
                        Object objM4 = sVar.M();
                        if (zH4 || objM4 == fVar) {
                            objM4 = new b(rVar2, 3);
                            sVar.k0(objM4);
                        }
                        w.b.b(null, charityItem, function0, function02, (Function0) objM4, sVar, 0);
                        break;
                    case 1:
                        num.getClass();
                        lVar.getClass();
                        lVar2.getClass();
                        r rVar3 = rVar;
                        if (((Boolean) m3.i.n(rVar3.u().f8231v, nVar, 0).getValue()).booleanValue()) {
                            cj.e0 e0VarU = rVar3.u();
                            v80.f0.B(m1.d(e0VarU), null, null, new cj.r(e0VarU, null, 3), 3);
                            rVar3.w();
                        }
                        BottomSheetBehavior bottomSheetBehavior = rVar3.f46021m;
                        if (bottomSheetBehavior != null) {
                            bottomSheetBehavior.J(3);
                        }
                        m3.s sVar2 = (m3.s) nVar;
                        Object objM5 = sVar2.M();
                        m3.f fVar2 = m3.m.f29332a;
                        if (objM5 == fVar2) {
                            objM5 = k.f46009a;
                            sVar2.k0(objM5);
                        }
                        i80.n nVar2 = (i80.n) ((KFunction) objM5);
                        Object objM6 = sVar2.M();
                        if (objM6 == fVar2) {
                            objM6 = new w2.g0(19);
                            sVar2.k0(objM6);
                        }
                        c6.l.b(nVar2, null, (Function1) objM6, sVar2, 390, 2);
                        break;
                    case 2:
                        w.a0.A(num, lVar, lVar2);
                        m3.s sVar3 = (m3.s) nVar;
                        Object objM7 = sVar3.M();
                        m3.f fVar3 = m3.m.f29332a;
                        if (objM7 == fVar3) {
                            objM7 = m3.i.o(kotlin.coroutines.g.f26549a, sVar3);
                            sVar3.k0(objM7);
                        }
                        v80.b0 b0Var = (v80.b0) objM7;
                        r rVar4 = rVar;
                        b1 b1VarN = m3.i.n(rVar4.u().f8223n, sVar3, 0);
                        b1 b1VarN2 = m3.i.n(rVar4.u().Z, sVar3, 0);
                        DeliveryOptionsLocal deliveryOptionsLocal = (DeliveryOptionsLocal) b1VarN.getValue();
                        ParcelDeliveryOptionId parcelDeliveryOptionId = (ParcelDeliveryOptionId) b1VarN2.getValue();
                        String strM229unboximpl = parcelDeliveryOptionId != null ? parcelDeliveryOptionId.m229unboximpl() : null;
                        boolean zI = rVar4.u().i();
                        boolean zH5 = sVar3.h(rVar4) | sVar3.h(b0Var);
                        Object objM8 = sVar3.M();
                        if (zH5 || objM8 == fVar3) {
                            objM8 = new bn.c0(12, rVar4, b0Var);
                            sVar3.k0(objM8);
                        }
                        i80.n nVar3 = (i80.n) objM8;
                        boolean zH6 = sVar3.h(b0Var) | sVar3.h(rVar4);
                        Object objM9 = sVar3.M();
                        if (zH6 || objM9 == fVar3) {
                            objM9 = new xq.a(3, b0Var, rVar4);
                            sVar3.k0(objM9);
                        }
                        wi.p.c(deliveryOptionsLocal, strM229unboximpl, zI, nVar3, (Function1) objM9, sVar3, 0);
                        break;
                    default:
                        num.getClass();
                        lVar.getClass();
                        lVar2.getClass();
                        r rVar5 = rVar;
                        b1 b1VarN3 = m3.i.n(rVar5.v().f8362x, nVar, 0);
                        b1 b1VarN4 = m3.i.n(rVar5.u().f8220j, nVar, 0);
                        BottomSheetBehavior bottomSheetBehavior2 = rVar5.f46021m;
                        if (bottomSheetBehavior2 != null) {
                            bottomSheetBehavior2.J(3);
                        }
                        CreateOrderResponse.CreateOrderState createOrderState = (CreateOrderResponse.CreateOrderState) b1VarN4.getValue();
                        if (createOrderState == null) {
                            createOrderState = (CreateOrderResponse.CreateOrderState) b1VarN3.getValue();
                        }
                        ItemType itemTypeG = rVar5.v().g();
                        m3.s sVar4 = (m3.s) nVar;
                        boolean zF = sVar4.f(b1VarN3) | sVar4.h(rVar5);
                        Object objM10 = sVar4.M();
                        if (zF || objM10 == m3.m.f29332a) {
                            objM10 = new us.j(27, rVar5, b1VarN3);
                            sVar4.k0(objM10);
                        }
                        xi.f.a(createOrderState, itemTypeG, (Function0) objM10, sVar4, 0);
                        break;
                }
                return Unit.f26487a;
            }
        }, true, -1282037640));
        return Unit.f26487a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0ac6  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 3156
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.h0.invoke(java.lang.Object):java.lang.Object");
    }
}
