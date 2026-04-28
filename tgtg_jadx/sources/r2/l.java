package r2;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static void a(PendingIntent pendingIntent) {
        try {
            pendingIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
        } catch (PendingIntent.CanceledException e5) {
            Log.e("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e5);
        }
    }
}
