package lo;

import android.content.Intent;
import androidx.lifecycle.m1;
import bg.w0;
import com.app.tgtg.R;
import com.app.tgtg.feature.helpdesk.HelpCenterActivity;
import com.app.tgtg.feature.orderview.manufacture.ManufacturerOrderActivity;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderType;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManufacturerOrderActivity f27968b;

    public /* synthetic */ e(ManufacturerOrderActivity manufacturerOrderActivity, int i11) {
        this.f27967a = i11;
        this.f27968b = manufacturerOrderActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        hk.d dVarB;
        int i11 = this.f27967a;
        ?? r12 = 0;
        se.d dVar = null;
        se.d dVar2 = null;
        ManufacturerOrderActivity manufacturerOrderActivity = this.f27968b;
        switch (i11) {
            case 0:
                int i12 = ManufacturerOrderActivity.f9167q;
                manufacturerOrderActivity.getOnBackPressedDispatcher().d();
                return Unit.f26487a;
            case 1:
                int i13 = ManufacturerOrderActivity.f9167q;
                m mVarF0 = manufacturerOrderActivity.f0();
                mVarF0.getClass();
                String email = mVarF0.f27985f.m().getEmail();
                int i14 = 3;
                if (email == null || StringsKt.H(email)) {
                    f0.B(m1.d(mVarF0), null, null, new l(mVarF0, r12, i14), 3);
                } else {
                    f0.B(m1.d(mVarF0), null, null, new gf.g(mVarF0, manufacturerOrderActivity, r12, 26), 3);
                }
                return Unit.f26487a;
            case 2:
                int i15 = ManufacturerOrderActivity.f9167q;
                return new w0(manufacturerOrderActivity);
            case 3:
                int i16 = ManufacturerOrderActivity.f9167q;
                return v0.n.v(manufacturerOrderActivity);
            default:
                int i17 = ManufacturerOrderActivity.f9167q;
                Order order = (Order) manufacturerOrderActivity.f0().l.f45488a.getValue();
                if ((order != null ? order.getOrderType() : null) == OrderType.CATERING) {
                    boolean zW = manufacturerOrderActivity.f0().f27985f.w();
                    se.d dVar3 = manufacturerOrderActivity.f9175n;
                    if (zW) {
                        if (dVar3 != null) {
                            dVar = dVar3;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("helpDeskConstant");
                        }
                        dVar.getClass();
                        dVarB = se.d.F();
                    } else {
                        if (dVar3 != null) {
                            dVar2 = dVar3;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("helpDeskConstant");
                        }
                        dVar2.getClass();
                        dVarB = se.d.z();
                    }
                } else {
                    se.d dVar4 = manufacturerOrderActivity.f9175n;
                    if (dVar4 != null) {
                        r12 = dVar4;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("helpDeskConstant");
                    }
                    r12.getClass();
                    dVarB = se.d.B();
                }
                hk.c cVar = new hk.c(R.string.helpdesk_topic_my_order, hk.a.ORDER, d0.d(dVarB), (Order) manufacturerOrderActivity.f0().l.f45488a.getValue());
                Intent intent = new Intent(manufacturerOrderActivity, (Class<?>) HelpCenterActivity.class);
                intent.putExtra("helpcenter", cVar);
                intent.putExtra("OPENED_FROM", "Order");
                intent.putExtra("DESTINATION", ek.b.GO_TO_ORDER_HELP);
                manufacturerOrderActivity.startActivity(intent, mv.a.b(manufacturerOrderActivity));
                return Unit.f26487a;
        }
    }
}
