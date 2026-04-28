package androidx.core.app;

import android.app.Notification;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j9, CharSequence charSequence2) {
        return new Notification.MessagingStyle.Message(charSequence, j9, charSequence2);
    }

    public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
        return message.setData(str, uri);
    }
}
