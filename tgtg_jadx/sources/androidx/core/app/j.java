package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationManager;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static String a(NotificationChannel notificationChannel) {
        return notificationChannel.getConversationId();
    }

    public static NotificationChannel b(NotificationManager notificationManager, String str, String str2) {
        return notificationManager.getNotificationChannel(str, str2);
    }

    public static String c(NotificationChannel notificationChannel) {
        return notificationChannel.getParentChannelId();
    }

    public static String d(NotificationChannel notificationChannel) {
        return notificationChannel.getParentChannelId();
    }

    public static void e(NotificationChannel notificationChannel) {
        notificationChannel.isImportantConversation();
    }

    public static void f(NotificationChannel notificationChannel, String str, String str2) {
        notificationChannel.setConversationId(str, str2);
    }
}
