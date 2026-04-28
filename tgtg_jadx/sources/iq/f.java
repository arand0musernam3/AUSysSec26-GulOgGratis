package iq;

import com.app.tgtg.model.remote.order.Order;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m3.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Order f24108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h1 f24109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f24110d;

    public /* synthetic */ f(Order order, h1 h1Var, Function1 function1, int i11) {
        this.f24107a = i11;
        this.f24108b = order;
        this.f24109c = h1Var;
        this.f24110d = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f24107a) {
            case 0:
                int iIntValue = num.intValue();
                Order order = this.f24108b;
                if (order == null || !order.isRated()) {
                    this.f24109c.i(iIntValue);
                    this.f24110d.invoke(num);
                }
                break;
            default:
                int iIntValue2 = num.intValue();
                Order order2 = this.f24108b;
                if (order2 != null && !order2.isRated()) {
                    this.f24109c.i(iIntValue2);
                    this.f24110d.invoke(num);
                    order2.setRated(true);
                }
                break;
        }
        return Unit.f26487a;
    }
}
