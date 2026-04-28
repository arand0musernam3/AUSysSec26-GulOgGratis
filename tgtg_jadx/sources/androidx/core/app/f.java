package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static void a(NotificationChannel notificationChannel) {
        notificationChannel.canBubble();
    }

    public static String b(Context context) {
        return context.getOpPackageName();
    }

    public static void c(Notification.Builder builder, boolean z11) {
        builder.setAllowSystemGeneratedContextualActions(z11);
    }

    public static void d(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void e(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}
