package br;

import com.app.tgtg.feature.tabprofile.impact.orderList.OrderListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mv.a0;
import mv.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OrderListActivity f6619b;

    public /* synthetic */ d(OrderListActivity orderListActivity, int i11) {
        this.f6618a = i11;
        this.f6619b = orderListActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f6618a;
        OrderListActivity orderListActivity = this.f6619b;
        switch (i11) {
            case 0:
                int i12 = OrderListActivity.l;
                k kVar = orderListActivity.f9320h;
                if (kVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    kVar = null;
                }
                if (kVar.getItemCount() != 0) {
                    orderListActivity.f0();
                }
                orderListActivity.d0();
                break;
            case 1:
                int i13 = OrderListActivity.l;
                a0 a0Var = new a0();
                z zVar = z.DISCOVER;
                zVar.getClass();
                a0Var.f30138a = zVar;
                a0Var.f30144g = true;
                a0Var.c(orderListActivity);
                break;
            default:
                int i14 = OrderListActivity.l;
                a0 a0Var2 = new a0();
                z zVar2 = z.DISCOVER;
                zVar2.getClass();
                a0Var2.f30138a = zVar2;
                a0Var2.f30144g = true;
                a0Var2.c(orderListActivity);
                break;
        }
        return Unit.f26487a;
    }
}
