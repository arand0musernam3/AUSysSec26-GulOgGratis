package ii;

import android.app.Activity;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.response.OrdersData;
import g3.s0;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f23885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f23886c;

    public /* synthetic */ b0(List list, Activity activity, int i11) {
        this.f23884a = i11;
        this.f23885b = list;
        this.f23886c = activity;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f23884a) {
            case 0:
                f2.d dVar = (f2.d) obj;
                int iIntValue = ((Number) obj2).intValue();
                m3.n nVar = (m3.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i11 = (iIntValue2 & 6) == 0 ? (((m3.s) nVar).f(dVar) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((m3.s) nVar).d(iIntValue) ? 32 : 16;
                }
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(i11 & 1, (i11 & 147) != 146)) {
                    OrdersData ordersData = (OrdersData) this.f23885b.get(iIntValue);
                    sVar.a0(1120138116);
                    b4.t tVarA = f2.d.a(dVar, null, null, 7);
                    d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    b4.t tVarC = b4.a.c(tVarA, sVar);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar);
                    m3.i.C(iVarL, b5.i.f5842e, sVar);
                    m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar);
                    l.g(ordersData.getPeriod(), sVar, 0);
                    sVar.a0(175354592);
                    int i12 = 0;
                    for (Object obj5 : ordersData.getOrders()) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            kotlin.collections.d0.n();
                            throw null;
                        }
                        Order order = (Order) obj5;
                        Activity activity = this.f23886c;
                        boolean zH = sVar.h(activity) | sVar.h(order);
                        Object objM = sVar.M();
                        if (zH || objM == m3.m.f29332a) {
                            objM = new z(activity, order, 0);
                            sVar.k0(objM);
                        }
                        q.a(0, null, order, (Function0) objM, sVar);
                        if (i12 != ordersData.getOrders().size() - 1) {
                            sVar.a0(287510196);
                            s0.g(d2.c.B(b4.q.f5711a, lv.t.f28253g, 0.0f, 2), 1, lv.s.H, sVar, 438, 0);
                            sVar.q(false);
                        } else {
                            sVar.a0(287839819);
                            sVar.q(false);
                        }
                        i12 = i13;
                    }
                    e0.f.D(sVar, false, true, false);
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            default:
                f2.d dVar2 = (f2.d) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m3.n nVar2 = (m3.n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i14 = (iIntValue4 & 6) == 0 ? (((m3.s) nVar2).f(dVar2) ? 4 : 2) | iIntValue4 : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i14 |= ((m3.s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(i14 & 1, (i14 & 147) != 146)) {
                    Pair pair = (Pair) this.f23885b.get(iIntValue3);
                    sVar2.a0(-1949067124);
                    b4.t tVarA2 = f2.d.a(dVar2, null, null, 7);
                    d2.y yVarA2 = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    u3.i iVarL2 = sVar2.l();
                    b4.t tVarC2 = b4.a.c(tVarA2, sVar2);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(yVarA2, b5.i.f5843f, sVar2);
                    m3.i.C(iVarL2, b5.i.f5842e, sVar2);
                    m3.i.v(sVar2, Integer.valueOf(iHashCode2), b5.i.f5844g);
                    m3.i.z(sVar2, b5.i.f5845h);
                    m3.i.C(tVarC2, b5.i.f5841d, sVar2);
                    si.a.b(pair, sVar2, 0);
                    sVar2.a0(-1160555912);
                    int i15 = 0;
                    for (Object obj6 : (Iterable) pair.f26486b) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            kotlin.collections.d0.n();
                            throw null;
                        }
                        Order order2 = (Order) obj6;
                        Activity activity2 = this.f23886c;
                        boolean zH2 = sVar2.h(activity2) | sVar2.h(order2);
                        Object objM2 = sVar2.M();
                        if (zH2 || objM2 == m3.m.f29332a) {
                            objM2 = new z(activity2, order2, 1);
                            sVar2.k0(objM2);
                        }
                        q.a(0, null, order2, (Function0) objM2, sVar2);
                        si.a.a(i15, (List) pair.f26486b, sVar2, 0);
                        i15 = i16;
                    }
                    e0.f.D(sVar2, false, true, false);
                } else {
                    sVar2.U();
                }
                return Unit.f26487a;
        }
    }
}
