package br;

import com.app.tgtg.feature.tabprofile.impact.orderList.OrderListActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OrderListActivity f6621b;

    public /* synthetic */ e(OrderListActivity orderListActivity, int i11) {
        this.f6620a = i11;
        this.f6621b = orderListActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6620a) {
            case 0:
                return this.f6621b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f6621b.getViewModelStore();
            default:
                return this.f6621b.getDefaultViewModelCreationExtras();
        }
    }
}
