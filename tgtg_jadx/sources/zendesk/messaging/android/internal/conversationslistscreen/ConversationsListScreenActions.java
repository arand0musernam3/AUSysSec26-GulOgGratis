package zendesk.messaging.android.internal.conversationslistscreen;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions;", "", "LoadConversations", "CreateConversation", "DismissCreateConversationError", "Retry", "ResetLoadMoreStatus", "ResetReceivedMessageAuthor", "OpenConversation", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions$CreateConversation;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions$DismissCreateConversationError;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions$LoadConversations;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions$OpenConversation;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions$ResetLoadMoreStatus;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions$ResetReceivedMessageAuthor;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions$Retry;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ConversationsListScreenActions {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions$CreateConversation;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CreateConversation implements ConversationsListScreenActions {

        @NotNull
        public static final CreateConversation INSTANCE = new CreateConversation();

        private CreateConversation() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions$DismissCreateConversationError;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DismissCreateConversationError implements ConversationsListScreenActions {

        @NotNull
        public static final DismissCreateConversationError INSTANCE = new DismissCreateConversationError();

        private DismissCreateConversationError() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions$LoadConversations;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LoadConversations implements ConversationsListScreenActions {

        @NotNull
        public static final LoadConversations INSTANCE = new LoadConversations();

        private LoadConversations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions$OpenConversation;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OpenConversation implements ConversationsListScreenActions {

        @NotNull
        public static final OpenConversation INSTANCE = new OpenConversation();

        private OpenConversation() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions$ResetLoadMoreStatus;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ResetLoadMoreStatus implements ConversationsListScreenActions {

        @NotNull
        public static final ResetLoadMoreStatus INSTANCE = new ResetLoadMoreStatus();

        private ResetLoadMoreStatus() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions$ResetReceivedMessageAuthor;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ResetReceivedMessageAuthor implements ConversationsListScreenActions {

        @NotNull
        public static final ResetReceivedMessageAuthor INSTANCE = new ResetReceivedMessageAuthor();

        private ResetReceivedMessageAuthor() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions$Retry;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenActions;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Retry implements ConversationsListScreenActions {

        @NotNull
        public static final Retry INSTANCE = new Retry();

        private Retry() {
        }
    }
}
