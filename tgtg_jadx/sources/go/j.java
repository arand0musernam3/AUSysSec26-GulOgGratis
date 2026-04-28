package go;

import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import com.app.tgtg.model.remote.order.Order;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharityOrderActivity f20729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Order f20730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20731d;

    public /* synthetic */ j(CharityOrderActivity charityOrderActivity, Order order, int i11, int i12) {
        this.f20728a = i12;
        this.f20729b = charityOrderActivity;
        this.f20730c = order;
        this.f20731d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f20728a;
        int i12 = this.f20731d;
        Order order = this.f20730c;
        CharityOrderActivity charityOrderActivity = this.f20729b;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        int i13 = CharityOrderActivity.f9162o;
        switch (i11) {
            case 0:
                charityOrderActivity.P(order, nVar, m3.i.F(i12 | 1));
                break;
            default:
                charityOrderActivity.O(order, nVar, m3.i.F(i12 | 1));
                break;
        }
        return Unit.f26487a;
    }
}
