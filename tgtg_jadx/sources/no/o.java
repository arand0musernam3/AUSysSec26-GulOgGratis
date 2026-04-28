package no;

import androidx.lifecycle.m1;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import com.app.tgtg.model.remote.order.Order;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.b1;
import mv.r0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SurpriseBagOrderActivity f31271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f31272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f31273d;

    public /* synthetic */ o(SurpriseBagOrderActivity surpriseBagOrderActivity, b1 b1Var, b1 b1Var2, int i11) {
        this.f31270a = i11;
        this.f31271b = surpriseBagOrderActivity;
        this.f31272c = b1Var;
        this.f31273d = b1Var2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Boolean hasDynamicPrice;
        int i11 = this.f31270a;
        b1 b1Var = this.f31273d;
        b1 b1Var2 = this.f31272c;
        SurpriseBagOrderActivity surpriseBagOrderActivity = this.f31271b;
        switch (i11) {
            case 0:
                int i12 = SurpriseBagOrderActivity.f9178y;
                Order order = (Order) surpriseBagOrderActivity.C().f22215i.f45488a.getValue();
                if ((order == null || (hasDynamicPrice = order.getHasDynamicPrice()) == null) ? false : hasDynamicPrice.booleanValue()) {
                    b1Var2.setValue(Boolean.FALSE);
                    b1Var.setValue(Boolean.TRUE);
                } else {
                    surpriseBagOrderActivity.C().q();
                    b1Var2.setValue(Boolean.FALSE);
                }
                break;
            case 1:
                int i13 = SurpriseBagOrderActivity.f9178y;
                if (r0.u(surpriseBagOrderActivity)) {
                    m0 m0VarC = surpriseBagOrderActivity.C();
                    m0VarC.getClass();
                    v80.f0.B(m1.d(m0VarC), null, null, new b0(m0VarC, null, 1), 3);
                    m0 m0VarC2 = surpriseBagOrderActivity.C();
                    cv.i iVar = cv.i.ACTION_DEACTIVATE_INVITATION;
                    dv.a aVar = dv.a.ORDER_ID;
                    Order order2 = (Order) surpriseBagOrderActivity.C().f22215i.f45488a.getValue();
                    m0VarC2.l(iVar, h0.g.E(new Pair(aVar, new dv.c(order2 != null ? order2.m429getOrderIdreIZeYA() : null))));
                    surpriseBagOrderActivity.C().l(cv.i.BRAZE_ACTION_DELEGATION_OWNER_RETURNED, null);
                } else {
                    b1Var2.setValue(oo.f.DISABLE_INVITATION);
                }
                b1Var.setValue(Boolean.FALSE);
                break;
            case 2:
                int i14 = SurpriseBagOrderActivity.f9178y;
                if (r0.u(surpriseBagOrderActivity)) {
                    b1Var.setValue(Boolean.TRUE);
                } else {
                    b1Var2.setValue(oo.f.GENERIC);
                }
                break;
            default:
                int i15 = SurpriseBagOrderActivity.f9178y;
                if (surpriseBagOrderActivity.K()) {
                    b1Var2.setValue(Boolean.TRUE);
                } else {
                    b1Var.setValue(oo.f.GENERIC);
                }
                break;
        }
        return Unit.f26487a;
    }
}
