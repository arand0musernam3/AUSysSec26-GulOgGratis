package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ib.w;
import jb.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4159a = w.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        w.d().a(f4159a, "Received intent " + intent);
        try {
            s sVarD = s.d(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            sVarD.getClass();
            synchronized (s.f24923m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = sVarD.f24932i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    sVarD.f24932i = pendingResultGoAsync;
                    if (sVarD.f24931h) {
                        pendingResultGoAsync.finish();
                        sVarD.f24932i = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (IllegalStateException e5) {
            w.d().c(f4159a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e5);
        }
    }
}
