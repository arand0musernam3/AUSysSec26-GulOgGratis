package lo;

import com.app.tgtg.feature.orderview.manufacture.ManufacturerOrderActivity;
import com.app.tgtg.model.remote.order.Order;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManufacturerOrderActivity f27970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Order f27971c;

    public /* synthetic */ f(ManufacturerOrderActivity manufacturerOrderActivity, Order order, int i11, int i12) {
        this.f27969a = i12;
        this.f27970b = manufacturerOrderActivity;
        this.f27971c = order;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f27969a;
        Order order = this.f27971c;
        ManufacturerOrderActivity manufacturerOrderActivity = this.f27970b;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        int i12 = ManufacturerOrderActivity.f9167q;
        switch (i11) {
            case 0:
                manufacturerOrderActivity.c0(order, nVar, m3.i.F(1));
                break;
            case 1:
                manufacturerOrderActivity.e0(order, nVar, m3.i.F(1));
                break;
            default:
                manufacturerOrderActivity.d0(order, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
