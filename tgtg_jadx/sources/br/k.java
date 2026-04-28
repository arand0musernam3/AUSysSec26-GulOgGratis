package br;

import a90.p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.r2;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabprofile.impact.orderList.OrderListActivity;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.order.MonthlyOrders;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderState;
import com.braze.h2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import pg.d3;
import pg.m3;
import pg.p1;
import pg.w2;
import v80.b2;
import v80.f0;
import v80.p0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f6644j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Serializable f6645k;
    public final Object l;

    public k(ov.a aVar, ArrayList arrayList) {
        this.f6635a = arrayList;
        this.f6636b = 1;
        this.f6637c = 2;
        this.f6638d = 3;
        this.f6639e = 4;
        this.f6640f = 5;
        this.f6641g = 6;
    }

    public static void b(k kVar, String str, Integer num, OrderState orderState, int i11) {
        List<Order> orderList;
        List<Order> orderList2;
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            orderState = null;
        }
        kVar.getClass();
        str.getClass();
        ArrayList arrayList = (ArrayList) kVar.f6645k;
        if (arrayList == null || arrayList.size() != 0) {
            arrayList.getClass();
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                if (((ov.b) arrayList.get(i12)).f33761a != null) {
                    MonthlyOrders monthlyOrders = (MonthlyOrders) ((ov.b) arrayList.get(i12)).f33761a;
                    Integer numValueOf = (monthlyOrders == null || (orderList2 = monthlyOrders.getOrderList()) == null) ? null : Integer.valueOf(orderList2.size());
                    numValueOf.getClass();
                    int iIntValue = numValueOf.intValue();
                    for (int i13 = 0; i13 < iIntValue; i13++) {
                        MonthlyOrders monthlyOrders2 = (MonthlyOrders) ((ov.b) arrayList.get(i12)).f33761a;
                        Order order = (monthlyOrders2 == null || (orderList = monthlyOrders2.getOrderList()) == null) ? null : orderList.get(i13);
                        String strM429getOrderIdreIZeYA = order != null ? order.m429getOrderIdreIZeYA() : null;
                        if (strM429getOrderIdreIZeYA == null ? false : OrderId.m213equalsimpl0(strM429getOrderIdreIZeYA, str)) {
                            if (orderState != null) {
                                order.setState(orderState);
                            }
                            if (num != null) {
                                order.setRated(true);
                                order.setOverallRating(num);
                            }
                            kVar.notifyItemChanged(i12);
                        }
                    }
                }
            }
        }
    }

    public final void a() {
        ArrayList arrayList = this.f6635a;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f6642h = false;
            return;
        }
        if (this.f6642h) {
            int size = arrayList.size() - 1;
            arrayList.remove(size);
            notifyItemRemoved(size);
        }
        this.f6642h = false;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int getItemCount() {
        ArrayList arrayList = this.f6635a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int getItemViewType(int i11) {
        ov.b bVar;
        ov.b bVar2;
        ov.b bVar3;
        ov.b bVar4;
        ov.b bVar5;
        ov.b bVar6;
        ov.b bVar7;
        boolean z11 = this.f6642h;
        ov.c cVar = null;
        ArrayList arrayList = this.f6635a;
        if (z11) {
            if (ov.c.LOADING_ITEM == ((arrayList == null || (bVar7 = (ov.b) arrayList.get(i11)) == null) ? null : bVar7.f33762b)) {
                return 0;
            }
        }
        if (ov.c.BASE_ITEM != ((arrayList == null || (bVar6 = (ov.b) arrayList.get(i11)) == null) ? null : bVar6.f33762b)) {
            if (ov.c.ITEM_EXTRA_1 == ((arrayList == null || (bVar5 = (ov.b) arrayList.get(i11)) == null) ? null : bVar5.f33762b)) {
                return this.f6637c;
            }
            if (ov.c.ITEM_EXTRA_2 == ((arrayList == null || (bVar4 = (ov.b) arrayList.get(i11)) == null) ? null : bVar4.f33762b)) {
                return this.f6638d;
            }
            if (ov.c.ITEM_EXTRA_3 == ((arrayList == null || (bVar3 = (ov.b) arrayList.get(i11)) == null) ? null : bVar3.f33762b)) {
                return this.f6639e;
            }
            if (ov.c.ITEM_EXTRA_4 == ((arrayList == null || (bVar2 = (ov.b) arrayList.get(i11)) == null) ? null : bVar2.f33762b)) {
                return this.f6640f;
            }
            ov.c cVar2 = ov.c.ITEM_EXTRA_5;
            if (arrayList != null && (bVar = (ov.b) arrayList.get(i11)) != null) {
                cVar = bVar.f33762b;
            }
            if (cVar2 == cVar) {
                return this.f6641g;
            }
        }
        return this.f6636b;
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021d  */
    @Override // androidx.recyclerview.widget.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.r2 r27, int r28) {
        /*
            Method dump skipped, instruction units count: 2144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: br.k.onBindViewHolder(androidx.recyclerview.widget.r2, int):void");
    }

    @Override // androidx.recyclerview.widget.l1
    public final r2 onCreateViewHolder(ViewGroup viewGroup, int i11) {
        r2 eVar;
        r2 dVar;
        int i12 = this.f6643i;
        int i13 = this.f6636b;
        Object obj = this.f6644j;
        switch (i12) {
            case 0:
                viewGroup.getClass();
                if (i11 == i13) {
                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
                    int i14 = w2.f35251w;
                    DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
                    w2 w2Var = (w2) a8.k.Z(layoutInflaterFrom, R.layout.order_list_month_item, null, false, null);
                    w2Var.getClass();
                    eVar = new j(w2Var, (OrderListActivity) obj, (d) this.l);
                } else if (i11 != 0) {
                    h2.b("view not set");
                } else {
                    LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(viewGroup.getContext());
                    int i15 = d3.f34837s;
                    DataBinderMapperImpl dataBinderMapperImpl2 = a8.c.f965a;
                    d3 d3Var = (d3) a8.k.Z(layoutInflaterFrom2, R.layout.recycler_item_loading, null, false, null);
                    d3Var.getClass();
                    View view = d3Var.f986f;
                    view.getClass();
                    eVar = new ov.e(view);
                }
                break;
            default:
                nm.e eVar2 = (nm.e) obj;
                viewGroup.getClass();
                if (i11 == i13) {
                    LayoutInflater layoutInflaterFrom3 = LayoutInflater.from(viewGroup.getContext());
                    int i16 = p1.J;
                    DataBinderMapperImpl dataBinderMapperImpl3 = a8.c.f965a;
                    p1 p1Var = (p1) a8.k.Z(layoutInflaterFrom3, R.layout.list_item_view, null, false, null);
                    p1Var.getClass();
                    dVar = new j(p1Var, eVar2, (String) this.f6645k);
                } else if (i11 == this.f6637c) {
                    LayoutInflater layoutInflaterFrom4 = LayoutInflater.from(viewGroup.getContext());
                    int i17 = pg.i.G;
                    DataBinderMapperImpl dataBinderMapperImpl4 = a8.c.f965a;
                    pg.i iVar = (pg.i) a8.k.Z(layoutInflaterFrom4, R.layout.browse_flash_sales_item, viewGroup, false, null);
                    iVar.getClass();
                    dVar = new mm.c(this, iVar, eVar2);
                } else if (i11 != this.f6638d) {
                    h2.b("view not set");
                } else {
                    LayoutInflater layoutInflaterFrom5 = LayoutInflater.from(viewGroup.getContext());
                    int i18 = m3.K;
                    DataBinderMapperImpl dataBinderMapperImpl5 = a8.c.f965a;
                    m3 m3Var = (m3) a8.k.Z(layoutInflaterFrom5, R.layout.table_reservation_item_in_browse_list, viewGroup, false, null);
                    m3Var.getClass();
                    dVar = new mm.d(m3Var, eVar2, (String) this.f6645k);
                }
                break;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.l1
    public void onViewAttachedToWindow(r2 r2Var) {
        b2 b2Var;
        switch (this.f6643i) {
            case 1:
                ov.d dVar = (ov.d) r2Var;
                dVar.getClass();
                super.onViewAttachedToWindow(dVar);
                x70.c cVar = null;
                mm.c cVar2 = dVar instanceof mm.c ? (mm.c) dVar : null;
                if (cVar2 != null) {
                    b2 b2Var2 = cVar2.f29992b;
                    if (b2Var2 != null && b2Var2.g() && (b2Var = cVar2.f29992b) != null) {
                        b2Var.a(null);
                    }
                    long j9 = cVar2.f29993c;
                    if (j9 > 0) {
                        cVar2.f29992b = mv.d.v((a90.d) cVar2.f29995e.l, j9, new m2.b2(cVar2, 1), new is.h(cVar2, cVar, 7), 2);
                    }
                }
                break;
            default:
                super.onViewAttachedToWindow(r2Var);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.l1
    public void onViewDetachedFromWindow(r2 r2Var) {
        b2 b2Var;
        b2 b2Var2;
        switch (this.f6643i) {
            case 1:
                ov.d dVar = (ov.d) r2Var;
                dVar.getClass();
                super.onViewDetachedFromWindow(dVar);
                mm.c cVar = dVar instanceof mm.c ? (mm.c) dVar : null;
                if (cVar != null && (b2Var = cVar.f29992b) != null && b2Var.g() && (b2Var2 = cVar.f29992b) != null) {
                    b2Var2.a(null);
                    break;
                }
                break;
            default:
                super.onViewDetachedFromWindow(r2Var);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(nm.e eVar, ArrayList arrayList) {
        this((ov.a) eVar, arrayList);
        this.f6643i = 1;
        this.f6644j = eVar;
        c90.f fVar = p0.f42144a;
        this.l = f0.b(p.f1044a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(OrderListActivity orderListActivity, ArrayList arrayList, d dVar) {
        this(orderListActivity, arrayList);
        this.f6643i = 0;
        this.f6644j = orderListActivity;
        this.f6645k = arrayList;
        this.l = dVar;
    }
}
