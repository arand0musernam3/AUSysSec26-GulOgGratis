package zendesk.android;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.conversationkit.android.model.AuthenticationType;
import zendesk.conversationkit.android.model.User;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"toZendeskUser", "Lzendesk/android/ZendeskUser;", "Lzendesk/conversationkit/android/model/User;", "toZendeskAuthenticationType", "Lzendesk/android/ZendeskAuthenticationType;", "Lzendesk/conversationkit/android/model/AuthenticationType;", "zendesk_zendesk-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ZendeskUserKt {
    @NotNull
    public static final ZendeskAuthenticationType toZendeskAuthenticationType(@NotNull AuthenticationType authenticationType) {
        authenticationType.getClass();
        if (authenticationType instanceof AuthenticationType.SessionToken) {
            return ZendeskAuthenticationType.SessionToken;
        }
        if (authenticationType instanceof AuthenticationType.Jwt) {
            return ZendeskAuthenticationType.Jwt;
        }
        if (authenticationType instanceof AuthenticationType.Unauthenticated) {
            return ZendeskAuthenticationType.Unauthenticated;
        }
        e40.a.f();
        return null;
    }

    @NotNull
    public static final ZendeskUser toZendeskUser(@NotNull User user) {
        user.getClass();
        return new ZendeskUser(user.getId(), user.getExternalId(), toZendeskAuthenticationType(user.getAuthenticationType()));
    }
}
