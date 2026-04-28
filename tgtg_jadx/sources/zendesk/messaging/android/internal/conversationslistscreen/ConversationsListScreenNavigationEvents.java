package zendesk.messaging.android.internal.conversationslistscreen;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenNavigationEvents;", "", "ConversationScreen", "NotificationPermissions", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenNavigationEvents$ConversationScreen;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenNavigationEvents$NotificationPermissions;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ConversationsListScreenNavigationEvents {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenNavigationEvents$ConversationScreen;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenNavigationEvents;", "conversationId", "", "<init>", "(Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationScreen implements ConversationsListScreenNavigationEvents {

        @NotNull
        private final String conversationId;

        public ConversationScreen(@NotNull String str) {
            str.getClass();
            this.conversationId = str;
        }

        public static /* synthetic */ ConversationScreen copy$default(ConversationScreen conversationScreen, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = conversationScreen.conversationId;
            }
            return conversationScreen.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final ConversationScreen copy(@NotNull String conversationId) {
            conversationId.getClass();
            return new ConversationScreen(conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConversationScreen) && Intrinsics.areEqual(this.conversationId, ((ConversationScreen) other).conversationId);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        public int hashCode() {
            return this.conversationId.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("ConversationScreen(conversationId=", this.conversationId, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenNavigationEvents$NotificationPermissions;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenNavigationEvents;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NotificationPermissions implements ConversationsListScreenNavigationEvents {

        @NotNull
        public static final NotificationPermissions INSTANCE = new NotificationPermissions();

        private NotificationPermissions() {
        }
    }
}
