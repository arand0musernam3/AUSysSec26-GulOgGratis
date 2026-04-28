package pz;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.braze.Constants;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.measurement.w5;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f35666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GoogleApiAvailability f35667b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 1);
        this.f35667b = googleApiAvailability;
        this.f35666a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i11 = message.what;
        if (i11 != 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 39);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i11);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        int i12 = com.google.android.gms.common.a.f11047a;
        GoogleApiAvailability googleApiAvailability = this.f35667b;
        Context context = this.f35666a;
        int iB = googleApiAvailability.b(context, i12);
        AtomicBoolean atomicBoolean = e.f35655a;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            Intent intentA = googleApiAvailability.a(context, Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, iB);
            googleApiAvailability.f(context, iB, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
