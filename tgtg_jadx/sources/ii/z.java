package ii;

import android.app.Activity;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f24026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Order f24027c;

    public /* synthetic */ z(Activity activity, Order order, int i11) {
        this.f24025a = i11;
        this.f24026b = activity;
        this.f24027c = order;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f24025a) {
            case 0:
                Activity activity = this.f24026b;
                if (activity != null) {
                    p30.b.w(activity, new io.a(this.f24027c.m429getOrderIdreIZeYA(), null, OrderType.CHARITY, false, null, 122), null);
                }
                break;
            default:
                Activity activity2 = this.f24026b;
                if (activity2 != null) {
                    p30.b.w(activity2, new io.a(this.f24027c.m429getOrderIdreIZeYA(), null, OrderType.CHARITY, false, null, 122), null);
                }
                break;
        }
        return Unit.f26487a;
    }
}
