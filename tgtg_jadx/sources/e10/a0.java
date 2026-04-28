package e10;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f15467d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f15469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15470c;

    public final void a(Task task) {
        if (this.f15470c) {
            return;
        }
        int i11 = 1;
        this.f15470c = true;
        Activity activity = getActivity();
        activity.getFragmentManager().beginTransaction().remove(this).commit();
        int i12 = this.f15468a;
        if (task == null) {
            a.a(activity, i12, 0, new Intent());
            return;
        }
        int i13 = a.f15466b;
        if (activity.isFinishing()) {
            if (Log.isLoggable("AutoResolveHelper", 3)) {
                Log.d("AutoResolveHelper", "Ignoring task result for, Activity is finishing.");
                return;
            }
            return;
        }
        Exception exception = task.getException();
        if (exception instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) exception).f11049a.e(i12, activity);
                return;
            } catch (IntentSender.SendIntentException e5) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Error starting pending intent!", e5);
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent();
        if (task.isSuccessful()) {
            l lVar = (l) task.getResult();
            lVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            lVar.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            intent.putExtra("com.google.android.gms.wallet.PaymentData", bArrMarshall);
            i11 = -1;
        } else if (exception instanceof ApiException) {
            ApiException apiException = (ApiException) exception;
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(apiException.f11049a.f11059a, apiException.getMessage(), null, null));
        } else {
            if (Log.isLoggable("AutoResolveHelper", 6)) {
                Log.e("AutoResolveHelper", "Unexpected non API exception!", exception);
            }
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!", null, null));
        }
        a.a(activity, i12, i11, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15468a = getArguments().getInt("requestCode");
        if (a.f15465a != getArguments().getLong("initializationElapsedRealtime")) {
            this.f15469b = null;
        } else {
            this.f15469b = (z) z.f15572e.get(getArguments().getInt("resolveCallId"));
        }
        boolean z11 = false;
        if (bundle != null && bundle.getBoolean("delivered")) {
            z11 = true;
        }
        this.f15470c = z11;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        z zVar = this.f15469b;
        if (zVar == null || zVar.f15575b != this) {
            return;
        }
        zVar.f15575b = null;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        z zVar = this.f15469b;
        if (zVar != null) {
            zVar.f15575b = this;
            zVar.a();
        } else {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Sending canceled result for garbage collected task!");
            }
            a(null);
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.f15470c);
        z zVar = this.f15469b;
        if (zVar == null || zVar.f15575b != this) {
            return;
        }
        zVar.f15575b = null;
    }
}
