package gt;

import com.app.tgtg.model.remote.order.OrderState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OrderState f20845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20846c;

    public /* synthetic */ f(Object obj, OrderState orderState, String str, int i11) {
        this.f20844a = i11;
        this.f20845b = orderState;
        this.f20846c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        ha.c cVarV0;
        switch (this.f20844a) {
            case 0:
                OrderState orderState = this.f20845b;
                String str = this.f20846c;
                ha.a aVar = (ha.a) obj;
                aVar.getClass();
                cVarV0 = aVar.v0("UPDATE brieforder SET orderState = ? WHERE orderId = ?");
                try {
                    orderState.getClass();
                    cVarV0.C(1, orderState.name());
                    cVarV0.C(2, str);
                    cVarV0.q0();
                    cVarV0.close();
                    return Unit.f26487a;
                } finally {
                }
            default:
                OrderState orderState2 = this.f20845b;
                String str2 = this.f20846c;
                ha.a aVar2 = (ha.a) obj;
                aVar2.getClass();
                cVarV0 = aVar2.v0("UPDATE orders SET state = ? WHERE orderId = ?");
                try {
                    orderState2.getClass();
                    cVarV0.C(1, orderState2.name());
                    cVarV0.C(2, str2);
                    cVarV0.q0();
                    int iE = ox.h.E(aVar2);
                    cVarV0.close();
                    return Integer.valueOf(iE);
                } finally {
                }
        }
    }
}
