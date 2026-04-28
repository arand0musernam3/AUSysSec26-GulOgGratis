package ho;

import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import androidx.lifecycle.n1;
import ao.g3;
import b0.v;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.PushNotificationsSettings;
import com.app.tgtg.model.remote.item.ItemCategory;
import com.app.tgtg.model.remote.order.CancelOrderState;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderState;
import et.z;
import h2.b1;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import v80.f0;
import y80.a2;
import y80.g1;
import y80.h1;
import y80.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f22207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f22208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3 f22209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gs.a f22210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cv.b f22211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gt.j f22212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ko.b f22213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a2 f22214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h1 f22215i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a2 f22216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h1 f22217k;
    public final a2 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h1 f22218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m1 f22219n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g1 f22220o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a2 f22221p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h1 f22222q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a2 f22223r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h1 f22224s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a2 f22225t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final h1 f22226u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a2 f22227v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h1 f22228w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public n1 f22229x;

    public j(c1 c1Var, z zVar, g3 g3Var, gs.a aVar, cv.b bVar, gt.j jVar, ko.b bVar2) {
        c1Var.getClass();
        zVar.getClass();
        g3Var.getClass();
        aVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        this.f22207a = c1Var;
        this.f22208b = zVar;
        this.f22209c = g3Var;
        this.f22210d = aVar;
        this.f22211e = bVar;
        this.f22212f = jVar;
        this.f22213g = bVar2;
        a2 a2VarC = y80.r.c(null);
        this.f22214h = a2VarC;
        this.f22215i = new h1(a2VarC);
        a2 a2VarC2 = y80.r.c(null);
        this.f22216j = a2VarC2;
        this.f22217k = new h1(a2VarC2);
        a2 a2VarC3 = y80.r.c(null);
        this.l = a2VarC3;
        this.f22218m = new h1(a2VarC3);
        m1 m1VarB = y80.r.b(0, 0, null, 6);
        this.f22219n = m1VarB;
        this.f22220o = new g1(m1VarB);
        a2 a2VarC4 = y80.r.c(Boolean.TRUE);
        this.f22221p = a2VarC4;
        this.f22222q = new h1(a2VarC4);
        a2 a2VarC5 = y80.r.c(null);
        this.f22223r = a2VarC5;
        this.f22224s = new h1(a2VarC5);
        Boolean bool = Boolean.FALSE;
        a2 a2VarC6 = y80.r.c(bool);
        this.f22225t = a2VarC6;
        this.f22226u = new h1(a2VarC6);
        a2 a2VarC7 = y80.r.c(bool);
        this.f22227v = a2VarC7;
        this.f22228w = new h1(a2VarC7);
    }

    public final void a() {
        gs.a aVar = this.f22210d;
        boolean zA = aVar.a();
        x70.c cVar = null;
        if (zA != this.f22209c.m().wantsPushNotifications()) {
            cv.i iVar = cv.i.CORE_PUSH_OPTIN;
            dv.a aVar2 = dv.a.ANSWER;
            dv.d dVar = zA ? dv.d.OPT_IN : dv.d.OPT_OUT;
            Pair pair = new Pair(aVar2, new dv.c(dVar != null ? dVar.a() : null));
            dv.a aVar3 = dv.a.PLACEMENT;
            dv.d dVar2 = dv.d.ORDER_VIEW;
            Pair pair2 = new Pair(aVar3, new dv.c(dVar2 != null ? dVar2.a() : null));
            dv.a aVar4 = dv.a.TYPE;
            dv.d dVar3 = dv.d.GENERAL;
            l(iVar, h0.g.E(pair, pair2, new Pair(aVar4, new dv.c(dVar3 != null ? dVar3.a() : null))));
            f0.B(androidx.lifecycle.m1.d(this), null, null, new g(this, zA, cVar, 0), 3);
        }
        boolean zO = mv.d.o(aVar.f20826a);
        PushNotificationsSettings pushNotificationsSettingsB = aVar.b();
        if (zO != pushNotificationsSettingsB.getCalendarAlerts()) {
            cv.i iVar2 = cv.i.CORE_PUSH_OPTIN;
            dv.a aVar5 = dv.a.ANSWER;
            dv.d dVar4 = zO ? dv.d.OPT_IN : dv.d.OPT_OUT;
            Pair pair3 = new Pair(aVar5, new dv.c(dVar4 != null ? dVar4.a() : null));
            dv.a aVar6 = dv.a.PLACEMENT;
            dv.d dVar5 = dv.d.ORDER_VIEW;
            Pair pair4 = new Pair(aVar6, new dv.c(dVar5 != null ? dVar5.a() : null));
            dv.a aVar7 = dv.a.TYPE;
            dv.d dVar6 = dv.d.CALENDAR_ALERTS;
            l(iVar2, h0.g.E(pair3, pair4, new Pair(aVar7, new dv.c(dVar6 != null ? dVar6.a() : null))));
            pushNotificationsSettingsB.setCalendarAlerts(zO);
            f0.B(androidx.lifecycle.m1.d(this), null, null, new v(this, zO, cVar, 5), 3);
        }
    }

    public abstract void b(String str);

    public final n1 c() {
        n1 n1Var = this.f22229x;
        if (n1Var != null) {
            return n1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("collectionCounter");
        return null;
    }

    public final String d() {
        Order order = (Order) this.f22215i.f45488a.getValue();
        OrderState state = order != null ? order.getState() : null;
        int i11 = state == null ? -1 : f.$EnumSwitchMapping$0[state.ordinal()];
        if (i11 == 1) {
            return "SOMEONE_ELSE_IS_COLLECTING";
        }
        if (i11 == 2 || i11 == 3) {
            return "I_AM_COLLECTING_MY_PURCHASE";
        }
        return null;
    }

    public final String e() {
        OrderId orderId = (OrderId) this.f22207a.a("ORDER_ID");
        if (orderId != null) {
            return orderId.m217unboximpl();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(CancelOrderState cancelOrderState, Order order) {
        int i11 = f.$EnumSwitchMapping$1[cancelOrderState.ordinal()];
        if (i11 == 1) {
            b(order.m429getOrderIdreIZeYA());
            i(new qg.c("CANCEL_FAILED_ALREADY_CANCELLED"));
            return;
        }
        if (i11 == 2) {
            b(order.m429getOrderIdreIZeYA());
            i(new qg.c("CANCEL_FAILED_DEADLINE_EXCEEDED"));
            return;
        }
        if (i11 != 3) {
            i(new Exception("OrderId is null"));
            b(order.m429getOrderIdreIZeYA());
            return;
        }
        b(order.m429getOrderIdreIZeYA());
        h(OrderState.CANCELLED);
        f0.B(androidx.lifecycle.m1.d(this), null, null, new h(this, order, 0 == true ? 1 : 0, 0), 3);
        cv.i iVar = cv.i.OTHER_PURCHASE_CANCELLED;
        dv.a aVar = dv.a.ITEM_ID;
        String strM428getItemIdRWxzYZM = order.m428getItemIdRWxzYZM();
        if (strM428getItemIdRWxzYZM == null) {
            strM428getItemIdRWxzYZM = null;
        }
        Pair pair = new Pair(aVar, new dv.c(strM428getItemIdRWxzYZM));
        Pair pair2 = new Pair(dv.a.STORE_ID, new dv.c(order.m431getStoreIdQ2NXY1A()));
        Pair pair3 = new Pair(dv.a.ITEM_TYPE, new dv.c(order.orderTypeMappedToItemTypeForTracking()));
        dv.a aVar2 = dv.a.ITEM_CATEGORY;
        ItemCategory itemCategory = order.getItemCategory();
        dv.b bVarE = h0.g.E(pair, pair2, pair3, new Pair(aVar2, new dv.c(itemCategory != null ? itemCategory.name() : null)));
        cv.b bVar = this.f22211e;
        bVar.c(iVar, bVarE);
        cv.i iVar2 = cv.i.CORE_PURCHASE_CANCELLED;
        Pair pair4 = new Pair(dv.a.STORE_NAME, new dv.c(order.getStoreNameAndBranch()));
        String strM428getItemIdRWxzYZM2 = order.m428getItemIdRWxzYZM();
        bVar.c(iVar2, h0.g.E(pair4, new Pair(aVar, new dv.c(strM428getItemIdRWxzYZM2 != null ? strM428getItemIdRWxzYZM2 : null))));
    }

    public final void g(Order order) {
        order.getClass();
        this.f22229x = new n1(order);
    }

    public final void h(OrderState orderState) {
        f0.B(androidx.lifecycle.m1.d(this), null, null, new gf.g(this, orderState, null, 7), 3);
    }

    public final void i(Throwable th2) {
        th2.getClass();
        f0.B(androidx.lifecycle.m1.d(this), null, null, new gf.g(this, th2, null, 8), 3);
    }

    public final void j(boolean z11) {
        f0.B(androidx.lifecycle.m1.d(this), null, null, new g(this, z11, null, 1), 3);
    }

    public final void k(Order order) {
        f0.B(androidx.lifecycle.m1.d(this), null, null, new h(this, order, null, 1), 3);
    }

    public final void l(cv.i iVar, dv.b bVar) {
        iVar.getClass();
        this.f22211e.c(iVar, bVar);
    }

    public final void m() {
        f0.B(androidx.lifecycle.m1.d(this), null, null, new b1(this, null, 2), 3);
    }
}
