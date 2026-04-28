package no;

import android.content.Intent;
import androidx.activity.result.ActivityResultCallback;
import androidx.lifecycle.m1;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.OrderId;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements OnCompleteListener, ActivityResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SurpriseBagOrderActivity f31232b;

    public /* synthetic */ k(SurpriseBagOrderActivity surpriseBagOrderActivity, int i11) {
        this.f31231a = i11;
        this.f31232b = surpriseBagOrderActivity;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void a(Object obj) {
        f30.a aVar;
        OrderId orderId;
        int i11 = this.f31231a;
        SurpriseBagOrderActivity surpriseBagOrderActivity = this.f31232b;
        h.a aVar2 = (h.a) obj;
        switch (i11) {
            case 1:
                int i12 = SurpriseBagOrderActivity.f9178y;
                aVar2.getClass();
                int i13 = aVar2.f20935a;
                if (i13 == 1001) {
                    surpriseBagOrderActivity.setResult(AppConstants.RESULT_CODE_SUPPORT_MSG_SENT);
                    surpriseBagOrderActivity.getOnBackPressedDispatcher().d();
                    break;
                } else if (i13 == 1002) {
                    surpriseBagOrderActivity.setResult(AppConstants.RESULT_CODE_AUTO_REFUND);
                    surpriseBagOrderActivity.getOnBackPressedDispatcher().d();
                    break;
                }
                break;
            default:
                int i14 = SurpriseBagOrderActivity.f9178y;
                aVar2.getClass();
                Intent intent = aVar2.f20936b;
                String strM217unboximpl = (intent == null || (orderId = (OrderId) intent.getParcelableExtra("ORDER_ID")) == null) ? null : orderId.m217unboximpl();
                Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("ORDER_RATING", 0)) : null;
                Intent intent2 = new Intent();
                intent2.putExtra("ORDER_ID", strM217unboximpl != null ? OrderId.m209boximpl(strM217unboximpl) : null);
                intent2.putExtra("ORDER_RATING", numValueOf);
                surpriseBagOrderActivity.setResult(128, intent2);
                surpriseBagOrderActivity.f9189u = true;
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    m0 m0VarC = surpriseBagOrderActivity.C();
                    m0VarC.getClass();
                    v80.f0.B(m1.d(m0VarC), null, null, new z(m0VarC, iIntValue, (x70.c) null), 3);
                }
                if (numValueOf != null && numValueOf.intValue() == 5 && (aVar = surpriseBagOrderActivity.f9183o) != null) {
                    Object value = surpriseBagOrderActivity.f9182n.getValue();
                    value.getClass();
                    ((f30.d) value).a(surpriseBagOrderActivity, aVar);
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i11 = SurpriseBagOrderActivity.f9178y;
        task.getClass();
        if (task.isSuccessful()) {
            this.f31232b.f9183o = (f30.a) task.getResult();
        }
    }
}
