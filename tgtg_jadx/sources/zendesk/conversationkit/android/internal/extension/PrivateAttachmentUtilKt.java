package zendesk.conversationkit.android.internal.extension;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import zendesk.core.android.internal.InternalZendeskApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"resolveAuthTokenForPrivateAttachment", "", "authorizationToken", "isPrivateAttachment", "", "zendesk.conversationkit_conversationkit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class PrivateAttachmentUtilKt {
    @InternalZendeskApi
    @Nullable
    public static final String resolveAuthTokenForPrivateAttachment(@Nullable String str, boolean z11) {
        if (z11) {
            return str;
        }
        return null;
    }
}
