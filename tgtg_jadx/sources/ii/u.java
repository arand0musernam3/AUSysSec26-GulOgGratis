package ii;

import android.app.Activity;
import com.app.tgtg.model.remote.order.OrderChanges;
import com.app.tgtg.model.remote.order.OrderType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f23976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OrderChanges f23977c;

    public /* synthetic */ u(Activity activity, OrderChanges orderChanges, int i11) {
        this.f23975a = i11;
        this.f23976b = activity;
        this.f23977c = orderChanges;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f23975a) {
            case 0:
                Activity activity = this.f23976b;
                if (activity != null) {
                    p30.b.w(activity, new io.a(this.f23977c.getOrder().m429getOrderIdreIZeYA(), null, OrderType.CHARITY, false, null, 122), null);
                }
                break;
            case 1:
                Activity activity2 = this.f23976b;
                if (activity2 != null) {
                    p30.b.w(activity2, new io.a(this.f23977c.getOrder().m429getOrderIdreIZeYA(), null, OrderType.CHARITY, false, null, 122), null);
                }
                break;
            default:
                Activity activity3 = this.f23976b;
                if (activity3 != null) {
                    p30.b.w(activity3, new io.a(this.f23977c.getOrder().m429getOrderIdreIZeYA(), null, OrderType.CHARITY, false, null, 122), null);
                }
                break;
        }
        return Unit.f26487a;
    }
}
