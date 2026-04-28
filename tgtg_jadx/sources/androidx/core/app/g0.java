package androidx.core.app;

import android.app.Notification;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class g0 {
    public static /* synthetic */ int a() {
        int i11 = Build.VERSION.SDK_INT;
        return i11 < 36 ? i11 * 100000 : Build.VERSION.SDK_INT_FULL;
    }

    public static /* synthetic */ Notification.ProgressStyle b() {
        return new Notification.ProgressStyle();
    }
}
