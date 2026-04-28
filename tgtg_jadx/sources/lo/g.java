package lo;

import android.content.Intent;
import android.widget.Toast;
import com.app.tgtg.R;
import com.app.tgtg.feature.orderview.manufacture.ManufacturerOrderActivity;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.order.OrderState;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManufacturerOrderActivity f27973b;

    public /* synthetic */ g(ManufacturerOrderActivity manufacturerOrderActivity, int i11) {
        this.f27972a = i11;
        this.f27973b = manufacturerOrderActivity;
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        int i11 = this.f27972a;
        ManufacturerOrderActivity manufacturerOrderActivity = this.f27973b;
        switch (i11) {
            case 0:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    boolean z11 = th2 instanceof qg.c;
                    int i12 = R.string.generic_err_undefined_error;
                    if (z11) {
                        String str = ((qg.c) th2).f37051a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != -1204254625) {
                            if (iHashCode != 216372365) {
                                if (iHashCode == 323123197 && str.equals("CANCEL_FAILED_DEADLINE_EXCEEDED")) {
                                    i12 = R.string.cancel_order_error_deadline_exceeded;
                                }
                            } else if (str.equals("CANCEL_FAILED_ALREADY_CANCELLED")) {
                                i12 = R.string.cancel_order_error_already_cancelled;
                            }
                        } else if (str.equals("CANCEL_FAILED_ALREADY_REDEEMED")) {
                            i12 = R.string.cancel_order_error_already_redeemed;
                        }
                    }
                    Toast.makeText(manufacturerOrderActivity, manufacturerOrderActivity.getString(i12), 1).show();
                }
                break;
            default:
                OrderState orderState = (OrderState) obj;
                int i13 = orderState == null ? -1 : i.$EnumSwitchMapping$0[orderState.ordinal()];
                if (i13 == 1 || i13 == 2) {
                    Intent intent = manufacturerOrderActivity.getIntent();
                    String strB = manufacturerOrderActivity.f0().b();
                    intent.putExtra("orderId", strB != null ? OrderId.m209boximpl(strB) : null);
                    manufacturerOrderActivity.getIntent().putExtra("orderState", OrderState.REFUNDED_OR_CANCELLED);
                    manufacturerOrderActivity.setResult(AppConstants.RESULT_CODE_ORDER_CANCELLED, manufacturerOrderActivity.getIntent());
                }
                break;
        }
        return Unit.f26487a;
    }
}
