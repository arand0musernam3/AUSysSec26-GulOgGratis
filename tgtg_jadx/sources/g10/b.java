package g10;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import e10.l;
import fd.j;
import h.g;
import m0.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends ActivityResultContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Status f18117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PendingIntent f18118b;

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent a(Context context, Object obj) {
        PendingIntent pendingIntent = this.f18118b;
        pendingIntent.getClass();
        IntentSender intentSender = pendingIntent.getIntentSender();
        intentSender.getClass();
        return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", new g(intentSender, null, 0, 0));
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final j b(Context context, Object obj) {
        a aVar;
        a aVar2;
        Task task = (Task) obj;
        if (!task.m()) {
            i4.a.f("The task has to be executed before using this API to resolve its result.");
            return null;
        }
        Exception exception = task.getException();
        if (exception instanceof ApiException) {
            this.f18117a = ((ApiException) exception).f11049a;
            if (exception instanceof ResolvableApiException) {
                this.f18118b = ((ResolvableApiException) exception).f11049a.f11061c;
            }
        }
        if (this.f18118b != null) {
            return null;
        }
        if (task.isSuccessful()) {
            aVar2 = new a(task.getResult(), Status.f11054e);
        } else {
            if (task.l()) {
                aVar = new a(null, new Status(16, "The task has been canceled.", null, null));
            } else {
                Status status = this.f18117a;
                if (status != null) {
                    aVar2 = new a(null, status);
                } else {
                    aVar = new a(null, Status.f11056g);
                }
            }
            aVar2 = aVar;
        }
        return new j(aVar2, 1);
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object c(int i11, Intent intent) {
        l lVar;
        Status status = Status.f11056g;
        if (i11 == 1) {
            int i12 = e10.a.f15466b;
            Status status2 = intent == null ? null : (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
            if (status2 != null) {
                status = status2;
            }
            return new a(null, status);
        }
        if (i11 != -1) {
            return i11 != 0 ? new a(null, status) : new a(null, Status.f11058i);
        }
        if (intent != null) {
            Parcelable.Creator<l> creator = l.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
            lVar = (l) (byteArrayExtra == null ? null : c.a0(byteArrayExtra, creator));
        } else {
            lVar = null;
        }
        return lVar != null ? new a(lVar, Status.f11054e) : new a(null, status);
    }
}
