package e10;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f15465a = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15466b = 0;

    public static void a(Activity activity, int i11, int i12, Intent intent) {
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(i11, intent, 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Null pending result returned when trying to deliver task result!");
            }
        } else {
            try {
                pendingIntentCreatePendingResult.send(i12);
            } catch (PendingIntent.CanceledException e5) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Exception sending pending result", e5);
                }
            }
        }
    }
}
