package zendesk.messaging.android.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.android.messaging.UrlSource;
import zendesk.core.ui.android.internal.model.MessageSourceType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lzendesk/messaging/android/internal/StubUriHandler;", "Lzendesk/messaging/android/internal/UriHandler;", "<init>", "()V", "onUriClicked", "", "uri", "", "urlSource", "Lzendesk/android/messaging/UrlSource;", "isPrivateAttachment", "", "sourceType", "Lzendesk/core/ui/android/internal/model/MessageSourceType;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StubUriHandler implements UriHandler {

    @NotNull
    public static final StubUriHandler INSTANCE = new StubUriHandler();

    private StubUriHandler() {
    }

    @Override // zendesk.messaging.android.internal.UriHandler
    public void onUriClicked(@NotNull String uri, @NotNull UrlSource urlSource, boolean isPrivateAttachment, @NotNull MessageSourceType sourceType) {
        uri.getClass();
        urlSource.getClass();
        sourceType.getClass();
    }
}
