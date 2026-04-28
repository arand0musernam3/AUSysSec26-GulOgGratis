package br;

import com.app.tgtg.feature.tabprofile.impact.orderList.OrderListActivity;
import com.app.tgtg.model.remote.order.OrderType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public interface a extends ov.a {
    static void b(a aVar, String str, String str2, OrderType orderType, int i11) {
        String str3 = (i11 & 1) != 0 ? null : str;
        String str4 = (i11 & 2) != 0 ? null : str2;
        OrderListActivity orderListActivity = (OrderListActivity) aVar;
        orderListActivity.getClass();
        orderType.getClass();
        p30.b.w(orderListActivity, new io.a(str3, str4, orderType, false, f70.i.ORDER_LIST, 88), orderListActivity.f9322j);
    }
}
