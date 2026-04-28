package lo;

import android.content.Intent;
import androidx.activity.result.ActivityResultCallback;
import androidx.lifecycle.m1;
import b0.a1;
import com.app.tgtg.feature.orderview.manufacture.ManufacturerOrderActivity;
import com.app.tgtg.model.remote.OrderId;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements OnCompleteListener, ActivityResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ManufacturerOrderActivity f27953a;

    public /* synthetic */ a(ManufacturerOrderActivity manufacturerOrderActivity) {
        this.f27953a = manufacturerOrderActivity;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void a(Object obj) {
        f30.a aVar;
        OrderId orderId;
        h.a aVar2 = (h.a) obj;
        int i11 = ManufacturerOrderActivity.f9167q;
        aVar2.getClass();
        Intent intent = aVar2.f20936b;
        x70.c cVar = null;
        String strM217unboximpl = (intent == null || (orderId = (OrderId) intent.getParcelableExtra("ORDER_ID")) == null) ? null : orderId.m217unboximpl();
        Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("ORDER_RATING", 0)) : null;
        Intent intent2 = new Intent();
        intent2.putExtra("ORDER_ID", strM217unboximpl != null ? OrderId.m209boximpl(strM217unboximpl) : null);
        intent2.putExtra("ORDER_RATING", numValueOf);
        ManufacturerOrderActivity manufacturerOrderActivity = this.f27953a;
        manufacturerOrderActivity.setResult(128, intent2);
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            m mVarF0 = manufacturerOrderActivity.f0();
            mVarF0.getClass();
            f0.B(m1.d(mVarF0), null, null, new a1(mVarF0, iIntValue, cVar, 7), 3);
        }
        if (numValueOf == null || numValueOf.intValue() != 5 || (aVar = manufacturerOrderActivity.l) == null) {
            return;
        }
        Object value = manufacturerOrderActivity.f9174m.getValue();
        value.getClass();
        ((f30.d) value).a(manufacturerOrderActivity, aVar);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i11 = ManufacturerOrderActivity.f9167q;
        task.getClass();
        if (task.isSuccessful()) {
            this.f27953a.l = (f30.a) task.getResult();
        }
    }
}
