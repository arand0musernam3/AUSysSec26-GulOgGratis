package ek;

import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import androidx.lifecycle.o0;
import ao.g3;
import at.c0;
import com.app.tgtg.model.remote.order.Order;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.d0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lek/q;", "Landroidx/lifecycle/l1;", "ek/o", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f16065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g3 f16066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cv.b f16067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final se.d f16068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gk.a f16069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c0 f16070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o0 f16071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o0 f16072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f16073i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f16074j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public hk.d f16075k;

    public q(c1 c1Var, g3 g3Var, cv.b bVar, se.d dVar, gk.a aVar, c0 c0Var) {
        hk.c cVarJ;
        c1Var.getClass();
        g3Var.getClass();
        bVar.getClass();
        aVar.getClass();
        c0Var.getClass();
        this.f16065a = c1Var;
        this.f16066b = g3Var;
        this.f16067c = bVar;
        this.f16068d = dVar;
        this.f16069e = aVar;
        this.f16070f = c0Var;
        o0 o0Var = new o0();
        this.f16071g = o0Var;
        this.f16072h = o0Var;
        boolean zIsCharityUser = g3Var.n().isCharityUser();
        this.f16073i = zIsCharityUser;
        hk.c cVarB = b();
        hk.c cVarK = dVar.K(cVarB != null ? cVarB.f22092d : null);
        if (zIsCharityUser) {
            hk.c cVarB2 = b();
            cVarJ = se.d.I(cVarB2 != null ? cVarB2.f22092d : null);
        } else {
            hk.c cVarB3 = b();
            cVarJ = dVar.J(cVarB3 != null ? cVarB3.f22092d : null);
        }
        hk.c cVarB4 = b();
        this.f16074j = d0.h(cVarK, cVarJ, dVar.L(cVarB4 != null ? cVarB4.f22092d : null));
    }

    public final hk.c a() {
        return (hk.c) this.f16065a.a("redirectToAnswer");
    }

    public final hk.c b() {
        return (hk.c) this.f16065a.a("helpcenter");
    }

    public final void c(o oVar) {
        hk.c cVarJ;
        boolean z11 = oVar instanceof m;
        se.d dVar = this.f16068d;
        if (z11) {
            hk.c cVarB = b();
            e(dVar.K(cVarB != null ? cVarB.f22092d : null));
        } else if (oVar instanceof i) {
            if (this.f16073i) {
                hk.c cVarB2 = b();
                Order order = cVarB2 != null ? cVarB2.f22092d : null;
                dVar.getClass();
                cVarJ = se.d.I(order);
            } else {
                hk.c cVarB3 = b();
                cVarJ = dVar.J(cVarB3 != null ? cVarB3.f22092d : null);
            }
            e(cVarJ);
        } else if (oVar instanceof k) {
            hk.c cVarB4 = b();
            e(dVar.L(cVarB4 != null ? cVarB4.f22092d : null));
        }
        this.f16071g.i(new qt.a(oVar));
    }

    public final void d() {
        Order order;
        Order order2;
        Order order3;
        Order order4;
        String strM429getOrderIdreIZeYA = null;
        strM429getOrderIdreIZeYA = null;
        String strM429getOrderIdreIZeYA2 = null;
        strM429getOrderIdreIZeYA = null;
        if (this.f16073i) {
            hk.c cVarB = b();
            c(new g(cVarB != null ? cVarB.f22092d : null));
        }
        f(cv.i.OTHER_HELPCENTER_CONTACT_CLICKED);
        hk.d dVar = this.f16075k;
        hk.b bVar = dVar != null ? dVar.f22102j : null;
        switch (bVar == null ? -1 : p.$EnumSwitchMapping$1[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                hk.c cVarB2 = b();
                Order order5 = cVarB2 != null ? cVarB2.f22092d : null;
                hk.c cVarB3 = b();
                if (cVarB3 != null && (order = cVarB3.f22092d) != null) {
                    strM429getOrderIdreIZeYA = order.m429getOrderIdreIZeYA();
                }
                c(new h(new wr.g(null, wr.b.BAD_ORDER_EXPERIENCE, true, null, order5, "helpDesk", strM429getOrderIdreIZeYA, 89)));
                break;
            case 4:
                hk.c cVarB4 = b();
                Order order6 = cVarB4 != null ? cVarB4.f22092d : null;
                hk.c cVarB5 = b();
                if (cVarB5 != null && (order2 = cVarB5.f22092d) != null) {
                    strM429getOrderIdreIZeYA2 = order2.m429getOrderIdreIZeYA();
                }
                c(new h(new wr.g(null, wr.b.BAD_ORDER_EXPERIENCE, false, null, order6, "helpDesk", strM429getOrderIdreIZeYA2, 89)));
                break;
            case 5:
                wr.b bVar2 = wr.b.CATERING_ISSUE;
                hk.c cVarB6 = b();
                String strM429getOrderIdreIZeYA3 = (cVarB6 == null || (order3 = cVarB6.f22092d) == null) ? null : order3.m429getOrderIdreIZeYA();
                hk.c cVarB7 = b();
                Order order7 = cVarB7 != null ? cVarB7.f22092d : null;
                wr.e eVar = wr.e.CATERING_PROBLEM;
                hk.c cVarB8 = b();
                c(new h(new wr.g(null, bVar2, false, eVar, order7, (cVarB8 != null ? cVarB8.f22092d : null) != null ? "order" : "helpDesk", strM429getOrderIdreIZeYA3, 85)));
                break;
            case 6:
                wr.b bVar3 = wr.b.NEXT_DAY_DELIVERY_ISSUE;
                hk.c cVarB9 = b();
                String strM429getOrderIdreIZeYA4 = (cVarB9 == null || (order4 = cVarB9.f22092d) == null) ? null : order4.m429getOrderIdreIZeYA();
                hk.c cVarB10 = b();
                Order order8 = cVarB10 != null ? cVarB10.f22092d : null;
                wr.e eVar2 = wr.e.NEXT_DAY_DELIVERY_PROBLEM;
                hk.c cVarB11 = b();
                c(new h(new wr.g(null, bVar3, false, eVar2, order8, (cVarB11 != null ? cVarB11.f22092d : null) != null ? "order" : "helpDesk", strM429getOrderIdreIZeYA4, 85)));
                break;
            default:
                c(new h(new wr.g(null, wr.b.CONSUMER_GENERAL_QUESTION, true, wr.e.NO_SELECTION, null, "helpDesk", null, 369)));
                break;
        }
    }

    public final void e(hk.c cVar) {
        this.f16065a.d(cVar, "helpcenter");
    }

    public final void f(cv.i iVar) {
        String str;
        Order order;
        hk.d dVar = this.f16075k;
        if (dVar == null || (str = dVar.l) == null) {
            return;
        }
        Pair pair = new Pair(dv.a.TOPIC, new dv.c(str));
        dv.a aVar = dv.a.ITEM_TYPE;
        hk.c cVarB = b();
        this.f16067c.c(iVar, h0.g.E(pair, new Pair(aVar, new dv.c((cVarB == null || (order = cVarB.f22092d) == null) ? null : order.orderTypeMappedToItemTypeForTracking()))));
    }
}
