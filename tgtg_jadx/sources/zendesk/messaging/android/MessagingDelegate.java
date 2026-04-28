package zendesk.messaging.android;

import com.braze.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lzendesk/messaging/android/MessagingDelegate;", "Lzendesk/android/messaging/MessagingDelegate;", "<init>", "()V", "shouldHandleUrl", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", "urlSource", "Lzendesk/messaging/android/UrlSource;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public class MessagingDelegate extends zendesk.android.messaging.MessagingDelegate {
    public boolean shouldHandleUrl(@NotNull String url, @NotNull UrlSource urlSource) {
        url.getClass();
        urlSource.getClass();
        return true;
    }
}
