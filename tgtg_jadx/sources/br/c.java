package br;

import androidx.recyclerview.widget.RecyclerView;
import com.app.tgtg.customview.GenericErrorView;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.feature.tabprofile.impact.orderList.OrderListActivity;
import com.app.tgtg.model.local.GenericErrors;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pg.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OrderListActivity f6617b;

    public /* synthetic */ c(OrderListActivity orderListActivity, int i11) {
        this.f6616a = i11;
        this.f6617b = orderListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f6616a;
        k kVar = null;
        pg.c cVar = null;
        OrderListActivity orderListActivity = this.f6617b;
        switch (i11) {
            case 0:
                List list = (List) obj;
                int i12 = OrderListActivity.l;
                list.getClass();
                orderListActivity.e0();
                if (!list.isEmpty()) {
                    k kVar2 = orderListActivity.f9320h;
                    if (kVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        kVar2 = null;
                    }
                    kVar2.getClass();
                    ArrayList arrayList = kVar2.f6635a;
                    arrayList.getClass();
                    int size = arrayList.size();
                    arrayList.addAll(list);
                    kVar2.notifyItemRangeInserted(size, list.size());
                    pg.c cVar2 = orderListActivity.f9318f;
                    if (cVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cVar2 = null;
                    }
                    ((RecyclerView) cVar2.f34805f).setVisibility(0);
                    pg.c cVar3 = orderListActivity.f9318f;
                    if (cVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cVar3 = null;
                    }
                    ((GenericErrorView) cVar3.f34803d).setVisibility(8);
                    pg.c cVar4 = orderListActivity.f9318f;
                    if (cVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cVar4 = null;
                    }
                    ((RecyclerView) cVar4.f34805f).setVisibility(0);
                    pg.c cVar5 = orderListActivity.f9318f;
                    if (cVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cVar5 = null;
                    }
                    ((u) cVar5.f34802c).f35181e.setText(String.valueOf(ft.c.o().getMagicBagCount()));
                }
                k kVar3 = orderListActivity.f9320h;
                if (kVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    kVar = kVar3;
                }
                if (kVar.getItemCount() == 0) {
                    orderListActivity.g0(new GenericErrors.NoOrders(new d(orderListActivity, 2)));
                }
                break;
            case 1:
                int i13 = OrderListActivity.l;
                if (((Boolean) obj).booleanValue() && orderListActivity.b0().f6664j == null) {
                    pg.c cVar6 = orderListActivity.f9318f;
                    if (cVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        cVar = cVar6;
                    }
                    ((TGTGLoadingView) cVar.f34804e).setVisibility(0);
                } else {
                    orderListActivity.c0();
                }
                break;
            default:
                GenericErrors genericErrors = (GenericErrors) obj;
                int i14 = OrderListActivity.l;
                genericErrors.getClass();
                if (genericErrors instanceof GenericErrors.NoOrders) {
                    orderListActivity.g0(new GenericErrors.NoOrders(new d(orderListActivity, 1)));
                } else {
                    orderListActivity.g0(genericErrors);
                }
                break;
        }
        return Unit.f26487a;
    }
}
