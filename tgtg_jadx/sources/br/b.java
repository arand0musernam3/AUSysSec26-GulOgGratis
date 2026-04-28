package br;

import androidx.activity.result.ActivityResultCallback;
import com.app.tgtg.feature.tabprofile.impact.orderList.OrderListActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements ActivityResultCallback, oa.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OrderListActivity f6615a;

    public /* synthetic */ b(OrderListActivity orderListActivity) {
        this.f6615a = orderListActivity;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void a(Object obj) {
        OrderListActivity.a0(this.f6615a, (h.a) obj);
    }

    @Override // oa.h
    public void onRefresh() {
        int i11 = OrderListActivity.l;
        OrderListActivity orderListActivity = this.f6615a;
        k kVar = orderListActivity.f9320h;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            kVar = null;
        }
        if (kVar.getItemCount() != 0) {
            orderListActivity.f0();
        }
        orderListActivity.d0();
    }
}
