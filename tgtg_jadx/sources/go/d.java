package go;

import com.app.tgtg.feature.charity.ui.help.CharityContactUsActivity;
import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import com.app.tgtg.model.remote.order.Order;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharityOrderActivity f20711b;

    public /* synthetic */ d(CharityOrderActivity charityOrderActivity, int i11) {
        this.f20710a = i11;
        this.f20711b = charityOrderActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f20710a;
        CharityOrderActivity charityOrderActivity = this.f20711b;
        switch (i11) {
            case 0:
                int i12 = CharityOrderActivity.f9162o;
                charityOrderActivity.finish();
                break;
            case 1:
                int i13 = CharityOrderActivity.f9162o;
                charityOrderActivity.C().m();
                break;
            case 2:
                int i14 = CharityOrderActivity.f9162o;
                Pair pair = new Pair(dv.a.CATEGORY, new dv.c("item_reserved"));
                dv.a aVar = dv.a.ITEM_TYPE;
                Order order = (Order) charityOrderActivity.C().f22215i.f45488a.getValue();
                charityOrderActivity.C().l(cv.i.SCREEN_HELPCENTER_CATEGORY, h0.g.E(pair, new Pair(aVar, new dv.c(order != null ? order.orderTypeMappedToItemTypeForTracking() : null))));
                v vVarC = charityOrderActivity.C();
                String strE = charityOrderActivity.C().e();
                vVarC.B.f26484a.a(new f70.b(CharityContactUsActivity.class, jb.u.x(new Pair("ORDER_ID", strE != null ? strE : null)), false, false, false, null, null, null, null, false, 1020));
                break;
            default:
                int i15 = CharityOrderActivity.f9162o;
                charityOrderActivity.getOnBackPressedDispatcher().d();
                break;
        }
        return Unit.f26487a;
    }
}
