package zendesk.conversationkit.android;

import com.braze.Constants;
import com.braze.models.inappmessage.InAppMessageBase;
import e0.f;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;
import w2.l1;
import zendesk.conversationkit.android.model.ActivityEvent;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageActionSize;
import zendesk.conversationkit.android.model.MessageSourceType;
import zendesk.conversationkit.android.model.ProactiveMessageStatus;
import zendesk.conversationkit.android.model.User;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0018\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0018\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123¨\u00064"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent;", "", "<init>", "()V", "ConnectionStatusChanged", "UserAccessRevoked", "UserUpdated", "LogoutUserCompleted", "MessageReceived", "UserServedByAgent", "SendMessageFailed", "OpenWebViewMessageReceived", "LoadMoreMessages", "MessageUpdated", "ConversationUpdated", "ConversationUpdatedFailure", "PushTokenPrepared", "PushTokenUpdateResult", "ActivityEventReceived", "PersistedUserReceived", "ProactiveMessageStatusChanged", "ConversationAddedSuccess", "ConversationAddedFailure", "ConversationRemovedSuccess", "ConversationRemovedFailure", "PostbackFailure", "PostbackSuccess", "OpenFileAttachment", "Lzendesk/conversationkit/android/ConversationKitEvent$ActivityEventReceived;", "Lzendesk/conversationkit/android/ConversationKitEvent$ConnectionStatusChanged;", "Lzendesk/conversationkit/android/ConversationKitEvent$ConversationAddedFailure;", "Lzendesk/conversationkit/android/ConversationKitEvent$ConversationAddedSuccess;", "Lzendesk/conversationkit/android/ConversationKitEvent$ConversationRemovedFailure;", "Lzendesk/conversationkit/android/ConversationKitEvent$ConversationRemovedSuccess;", "Lzendesk/conversationkit/android/ConversationKitEvent$ConversationUpdated;", "Lzendesk/conversationkit/android/ConversationKitEvent$ConversationUpdatedFailure;", "Lzendesk/conversationkit/android/ConversationKitEvent$LoadMoreMessages;", "Lzendesk/conversationkit/android/ConversationKitEvent$LogoutUserCompleted;", "Lzendesk/conversationkit/android/ConversationKitEvent$MessageReceived;", "Lzendesk/conversationkit/android/ConversationKitEvent$MessageUpdated;", "Lzendesk/conversationkit/android/ConversationKitEvent$OpenFileAttachment;", "Lzendesk/conversationkit/android/ConversationKitEvent$OpenWebViewMessageReceived;", "Lzendesk/conversationkit/android/ConversationKitEvent$PersistedUserReceived;", "Lzendesk/conversationkit/android/ConversationKitEvent$PostbackFailure;", "Lzendesk/conversationkit/android/ConversationKitEvent$PostbackSuccess;", "Lzendesk/conversationkit/android/ConversationKitEvent$ProactiveMessageStatusChanged;", "Lzendesk/conversationkit/android/ConversationKitEvent$PushTokenPrepared;", "Lzendesk/conversationkit/android/ConversationKitEvent$PushTokenUpdateResult;", "Lzendesk/conversationkit/android/ConversationKitEvent$SendMessageFailed;", "Lzendesk/conversationkit/android/ConversationKitEvent$UserAccessRevoked;", "Lzendesk/conversationkit/android/ConversationKitEvent$UserServedByAgent;", "Lzendesk/conversationkit/android/ConversationKitEvent$UserUpdated;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ConversationKitEvent {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$ActivityEventReceived;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "activityEvent", "Lzendesk/conversationkit/android/model/ActivityEvent;", "<init>", "(Lzendesk/conversationkit/android/model/ActivityEvent;)V", "getActivityEvent", "()Lzendesk/conversationkit/android/model/ActivityEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActivityEventReceived extends ConversationKitEvent {

        @NotNull
        private final ActivityEvent activityEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityEventReceived(@NotNull ActivityEvent activityEvent) {
            super(null);
            activityEvent.getClass();
            this.activityEvent = activityEvent;
        }

        public static /* synthetic */ ActivityEventReceived copy$default(ActivityEventReceived activityEventReceived, ActivityEvent activityEvent, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                activityEvent = activityEventReceived.activityEvent;
            }
            return activityEventReceived.copy(activityEvent);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ActivityEvent getActivityEvent() {
            return this.activityEvent;
        }

        @NotNull
        public final ActivityEventReceived copy(@NotNull ActivityEvent activityEvent) {
            activityEvent.getClass();
            return new ActivityEventReceived(activityEvent);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ActivityEventReceived) && Intrinsics.areEqual(this.activityEvent, ((ActivityEventReceived) other).activityEvent);
        }

        @NotNull
        public final ActivityEvent getActivityEvent() {
            return this.activityEvent;
        }

        public int hashCode() {
            return this.activityEvent.hashCode();
        }

        @NotNull
        public String toString() {
            return "ActivityEventReceived(activityEvent=" + this.activityEvent + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$ConnectionStatusChanged;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "connectionStatus", "Lzendesk/conversationkit/android/ConnectionStatus;", "<init>", "(Lzendesk/conversationkit/android/ConnectionStatus;)V", "getConnectionStatus", "()Lzendesk/conversationkit/android/ConnectionStatus;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConnectionStatusChanged extends ConversationKitEvent {

        @NotNull
        private final ConnectionStatus connectionStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConnectionStatusChanged(@NotNull ConnectionStatus connectionStatus) {
            super(null);
            connectionStatus.getClass();
            this.connectionStatus = connectionStatus;
        }

        public static /* synthetic */ ConnectionStatusChanged copy$default(ConnectionStatusChanged connectionStatusChanged, ConnectionStatus connectionStatus, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                connectionStatus = connectionStatusChanged.connectionStatus;
            }
            return connectionStatusChanged.copy(connectionStatus);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ConnectionStatus getConnectionStatus() {
            return this.connectionStatus;
        }

        @NotNull
        public final ConnectionStatusChanged copy(@NotNull ConnectionStatus connectionStatus) {
            connectionStatus.getClass();
            return new ConnectionStatusChanged(connectionStatus);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConnectionStatusChanged) && this.connectionStatus == ((ConnectionStatusChanged) other).connectionStatus;
        }

        @NotNull
        public final ConnectionStatus getConnectionStatus() {
            return this.connectionStatus;
        }

        public int hashCode() {
            return this.connectionStatus.hashCode();
        }

        @NotNull
        public String toString() {
            return "ConnectionStatusChanged(connectionStatus=" + this.connectionStatus + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$ConversationAddedFailure;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationAddedFailure extends ConversationKitEvent {

        @NotNull
        private final Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationAddedFailure(@NotNull Throwable th2) {
            super(null);
            th2.getClass();
            this.cause = th2;
        }

        public static /* synthetic */ ConversationAddedFailure copy$default(ConversationAddedFailure conversationAddedFailure, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = conversationAddedFailure.cause;
            }
            return conversationAddedFailure.copy(th2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final ConversationAddedFailure copy(@NotNull Throwable cause) {
            cause.getClass();
            return new ConversationAddedFailure(cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConversationAddedFailure) && Intrinsics.areEqual(this.cause, ((ConversationAddedFailure) other).cause);
        }

        @NotNull
        public final Throwable getCause() {
            return this.cause;
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @NotNull
        public String toString() {
            return f.l("ConversationAddedFailure(cause=", ")", this.cause);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$ConversationAddedSuccess;", "Lzendesk/conversationkit/android/ConversationKitEvent;", MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "Lzendesk/conversationkit/android/model/Conversation;", "<init>", "(Lzendesk/conversationkit/android/model/Conversation;)V", "getConversation", "()Lzendesk/conversationkit/android/model/Conversation;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationAddedSuccess extends ConversationKitEvent {

        @NotNull
        private final Conversation conversation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationAddedSuccess(@NotNull Conversation conversation) {
            super(null);
            conversation.getClass();
            this.conversation = conversation;
        }

        public static /* synthetic */ ConversationAddedSuccess copy$default(ConversationAddedSuccess conversationAddedSuccess, Conversation conversation, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversation = conversationAddedSuccess.conversation;
            }
            return conversationAddedSuccess.copy(conversation);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Conversation getConversation() {
            return this.conversation;
        }

        @NotNull
        public final ConversationAddedSuccess copy(@NotNull Conversation conversation) {
            conversation.getClass();
            return new ConversationAddedSuccess(conversation);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConversationAddedSuccess) && Intrinsics.areEqual(this.conversation, ((ConversationAddedSuccess) other).conversation);
        }

        @NotNull
        public final Conversation getConversation() {
            return this.conversation;
        }

        public int hashCode() {
            return this.conversation.hashCode();
        }

        @NotNull
        public String toString() {
            return "ConversationAddedSuccess(conversation=" + this.conversation + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$ConversationRemovedFailure;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationRemovedFailure extends ConversationKitEvent {

        @NotNull
        private final Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationRemovedFailure(@NotNull Throwable th2) {
            super(null);
            th2.getClass();
            this.cause = th2;
        }

        public static /* synthetic */ ConversationRemovedFailure copy$default(ConversationRemovedFailure conversationRemovedFailure, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = conversationRemovedFailure.cause;
            }
            return conversationRemovedFailure.copy(th2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final ConversationRemovedFailure copy(@NotNull Throwable cause) {
            cause.getClass();
            return new ConversationRemovedFailure(cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConversationRemovedFailure) && Intrinsics.areEqual(this.cause, ((ConversationRemovedFailure) other).cause);
        }

        @NotNull
        public final Throwable getCause() {
            return this.cause;
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @NotNull
        public String toString() {
            return f.l("ConversationRemovedFailure(cause=", ")", this.cause);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$ConversationRemovedSuccess;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "conversationId", "", "<init>", "(Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationRemovedSuccess extends ConversationKitEvent {

        @NotNull
        private final String conversationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationRemovedSuccess(@NotNull String str) {
            super(null);
            str.getClass();
            this.conversationId = str;
        }

        public static /* synthetic */ ConversationRemovedSuccess copy$default(ConversationRemovedSuccess conversationRemovedSuccess, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = conversationRemovedSuccess.conversationId;
            }
            return conversationRemovedSuccess.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final ConversationRemovedSuccess copy(@NotNull String conversationId) {
            conversationId.getClass();
            return new ConversationRemovedSuccess(conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConversationRemovedSuccess) && Intrinsics.areEqual(this.conversationId, ((ConversationRemovedSuccess) other).conversationId);
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
            return a0.p("ConversationRemovedSuccess(conversationId=", this.conversationId, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$ConversationUpdated;", "Lzendesk/conversationkit/android/ConversationKitEvent;", MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "Lzendesk/conversationkit/android/model/Conversation;", "<init>", "(Lzendesk/conversationkit/android/model/Conversation;)V", "getConversation", "()Lzendesk/conversationkit/android/model/Conversation;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationUpdated extends ConversationKitEvent {

        @NotNull
        private final Conversation conversation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationUpdated(@NotNull Conversation conversation) {
            super(null);
            conversation.getClass();
            this.conversation = conversation;
        }

        public static /* synthetic */ ConversationUpdated copy$default(ConversationUpdated conversationUpdated, Conversation conversation, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversation = conversationUpdated.conversation;
            }
            return conversationUpdated.copy(conversation);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Conversation getConversation() {
            return this.conversation;
        }

        @NotNull
        public final ConversationUpdated copy(@NotNull Conversation conversation) {
            conversation.getClass();
            return new ConversationUpdated(conversation);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConversationUpdated) && Intrinsics.areEqual(this.conversation, ((ConversationUpdated) other).conversation);
        }

        @NotNull
        public final Conversation getConversation() {
            return this.conversation;
        }

        public int hashCode() {
            return this.conversation.hashCode();
        }

        @NotNull
        public String toString() {
            return "ConversationUpdated(conversation=" + this.conversation + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$ConversationUpdatedFailure;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationUpdatedFailure extends ConversationKitEvent {

        @NotNull
        private final Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationUpdatedFailure(@NotNull Throwable th2) {
            super(null);
            th2.getClass();
            this.cause = th2;
        }

        public static /* synthetic */ ConversationUpdatedFailure copy$default(ConversationUpdatedFailure conversationUpdatedFailure, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = conversationUpdatedFailure.cause;
            }
            return conversationUpdatedFailure.copy(th2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final ConversationUpdatedFailure copy(@NotNull Throwable cause) {
            cause.getClass();
            return new ConversationUpdatedFailure(cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConversationUpdatedFailure) && Intrinsics.areEqual(this.cause, ((ConversationUpdatedFailure) other).cause);
        }

        @NotNull
        public final Throwable getCause() {
            return this.cause;
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @NotNull
        public String toString() {
            return f.l("ConversationUpdatedFailure(cause=", ")", this.cause);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$LoadMoreMessages;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "listOfMessages", "", "Lzendesk/conversationkit/android/model/Message;", "conversationId", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getListOfMessages", "()Ljava/util/List;", "getConversationId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LoadMoreMessages extends ConversationKitEvent {

        @NotNull
        private final String conversationId;

        @NotNull
        private final List<Message> listOfMessages;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadMoreMessages(@NotNull List<Message> list, @NotNull String str) {
            super(null);
            list.getClass();
            str.getClass();
            this.listOfMessages = list;
            this.conversationId = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LoadMoreMessages copy$default(LoadMoreMessages loadMoreMessages, List list, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = loadMoreMessages.listOfMessages;
            }
            if ((i11 & 2) != 0) {
                str = loadMoreMessages.conversationId;
            }
            return loadMoreMessages.copy(list, str);
        }

        @NotNull
        public final List<Message> component1() {
            return this.listOfMessages;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final LoadMoreMessages copy(@NotNull List<Message> listOfMessages, @NotNull String conversationId) {
            listOfMessages.getClass();
            conversationId.getClass();
            return new LoadMoreMessages(listOfMessages, conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadMoreMessages)) {
                return false;
            }
            LoadMoreMessages loadMoreMessages = (LoadMoreMessages) other;
            return Intrinsics.areEqual(this.listOfMessages, loadMoreMessages.listOfMessages) && Intrinsics.areEqual(this.conversationId, loadMoreMessages.conversationId);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final List<Message> getListOfMessages() {
            return this.listOfMessages;
        }

        public int hashCode() {
            return this.conversationId.hashCode() + (this.listOfMessages.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "LoadMoreMessages(listOfMessages=" + this.listOfMessages + ", conversationId=" + this.conversationId + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$LogoutUserCompleted;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "", "<init>", "(Lzendesk/conversationkit/android/ConversationKitResult;)V", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LogoutUserCompleted extends ConversationKitEvent {

        @NotNull
        private final ConversationKitResult<Unit> result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LogoutUserCompleted(@NotNull ConversationKitResult<Unit> conversationKitResult) {
            super(null);
            conversationKitResult.getClass();
            this.result = conversationKitResult;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LogoutUserCompleted copy$default(LogoutUserCompleted logoutUserCompleted, ConversationKitResult conversationKitResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversationKitResult = logoutUserCompleted.result;
            }
            return logoutUserCompleted.copy(conversationKitResult);
        }

        @NotNull
        public final ConversationKitResult<Unit> component1() {
            return this.result;
        }

        @NotNull
        public final LogoutUserCompleted copy(@NotNull ConversationKitResult<Unit> result) {
            result.getClass();
            return new LogoutUserCompleted(result);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LogoutUserCompleted) && Intrinsics.areEqual(this.result, ((LogoutUserCompleted) other).result);
        }

        @NotNull
        public final ConversationKitResult<Unit> getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        @NotNull
        public String toString() {
            return "LogoutUserCompleted(result=" + this.result + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$MessageReceived;", "Lzendesk/conversationkit/android/ConversationKitEvent;", InAppMessageBase.MESSAGE, "Lzendesk/conversationkit/android/model/Message;", "conversationId", "", "<init>", "(Lzendesk/conversationkit/android/model/Message;Ljava/lang/String;)V", "getMessage", "()Lzendesk/conversationkit/android/model/Message;", "getConversationId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MessageReceived extends ConversationKitEvent {

        @NotNull
        private final String conversationId;

        @NotNull
        private final Message message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessageReceived(@NotNull Message message, @NotNull String str) {
            super(null);
            message.getClass();
            str.getClass();
            this.message = message;
            this.conversationId = str;
        }

        public static /* synthetic */ MessageReceived copy$default(MessageReceived messageReceived, Message message, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                message = messageReceived.message;
            }
            if ((i11 & 2) != 0) {
                str = messageReceived.conversationId;
            }
            return messageReceived.copy(message, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final MessageReceived copy(@NotNull Message message, @NotNull String conversationId) {
            message.getClass();
            conversationId.getClass();
            return new MessageReceived(message, conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageReceived)) {
                return false;
            }
            MessageReceived messageReceived = (MessageReceived) other;
            return Intrinsics.areEqual(this.message, messageReceived.message) && Intrinsics.areEqual(this.conversationId, messageReceived.conversationId);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final Message getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.conversationId.hashCode() + (this.message.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "MessageReceived(message=" + this.message + ", conversationId=" + this.conversationId + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$MessageUpdated;", "Lzendesk/conversationkit/android/ConversationKitEvent;", InAppMessageBase.MESSAGE, "Lzendesk/conversationkit/android/model/Message;", "conversationId", "", "<init>", "(Lzendesk/conversationkit/android/model/Message;Ljava/lang/String;)V", "getMessage", "()Lzendesk/conversationkit/android/model/Message;", "getConversationId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MessageUpdated extends ConversationKitEvent {

        @NotNull
        private final String conversationId;

        @NotNull
        private final Message message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessageUpdated(@NotNull Message message, @NotNull String str) {
            super(null);
            message.getClass();
            str.getClass();
            this.message = message;
            this.conversationId = str;
        }

        public static /* synthetic */ MessageUpdated copy$default(MessageUpdated messageUpdated, Message message, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                message = messageUpdated.message;
            }
            if ((i11 & 2) != 0) {
                str = messageUpdated.conversationId;
            }
            return messageUpdated.copy(message, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final MessageUpdated copy(@NotNull Message message, @NotNull String conversationId) {
            message.getClass();
            conversationId.getClass();
            return new MessageUpdated(message, conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageUpdated)) {
                return false;
            }
            MessageUpdated messageUpdated = (MessageUpdated) other;
            return Intrinsics.areEqual(this.message, messageUpdated.message) && Intrinsics.areEqual(this.conversationId, messageUpdated.conversationId);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final Message getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.conversationId.hashCode() + (this.message.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "MessageUpdated(message=" + this.message + ", conversationId=" + this.conversationId + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$OpenFileAttachment;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "file", "Ljava/io/File;", "conversationId", "", "<init>", "(Ljava/io/File;Ljava/lang/String;)V", "getFile", "()Ljava/io/File;", "getConversationId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenFileAttachment extends ConversationKitEvent {

        @NotNull
        private final String conversationId;

        @NotNull
        private final File file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenFileAttachment(@NotNull File file, @NotNull String str) {
            super(null);
            file.getClass();
            str.getClass();
            this.file = file;
            this.conversationId = str;
        }

        public static /* synthetic */ OpenFileAttachment copy$default(OpenFileAttachment openFileAttachment, File file, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                file = openFileAttachment.file;
            }
            if ((i11 & 2) != 0) {
                str = openFileAttachment.conversationId;
            }
            return openFileAttachment.copy(file, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final OpenFileAttachment copy(@NotNull File file, @NotNull String conversationId) {
            file.getClass();
            conversationId.getClass();
            return new OpenFileAttachment(file, conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenFileAttachment)) {
                return false;
            }
            OpenFileAttachment openFileAttachment = (OpenFileAttachment) other;
            return Intrinsics.areEqual(this.file, openFileAttachment.file) && Intrinsics.areEqual(this.conversationId, openFileAttachment.conversationId);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final File getFile() {
            return this.file;
        }

        public int hashCode() {
            return this.conversationId.hashCode() + (this.file.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "OpenFileAttachment(file=" + this.file + ", conversationId=" + this.conversationId + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$OpenWebViewMessageReceived;", "Lzendesk/conversationkit/android/ConversationKitEvent;", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", "size", "Lzendesk/conversationkit/android/model/MessageActionSize;", "conversationId", "source", "Lzendesk/conversationkit/android/model/MessageSourceType;", "<init>", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/MessageActionSize;Ljava/lang/String;Lzendesk/conversationkit/android/model/MessageSourceType;)V", "getUrl", "()Ljava/lang/String;", "getSize", "()Lzendesk/conversationkit/android/model/MessageActionSize;", "getConversationId", "getSource", "()Lzendesk/conversationkit/android/model/MessageSourceType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenWebViewMessageReceived extends ConversationKitEvent {

        @NotNull
        private final String conversationId;

        @NotNull
        private final MessageActionSize size;

        @NotNull
        private final MessageSourceType source;

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenWebViewMessageReceived(@NotNull String str, @NotNull MessageActionSize messageActionSize, @NotNull String str2, @NotNull MessageSourceType messageSourceType) {
            super(null);
            str.getClass();
            messageActionSize.getClass();
            str2.getClass();
            messageSourceType.getClass();
            this.url = str;
            this.size = messageActionSize;
            this.conversationId = str2;
            this.source = messageSourceType;
        }

        public static /* synthetic */ OpenWebViewMessageReceived copy$default(OpenWebViewMessageReceived openWebViewMessageReceived, String str, MessageActionSize messageActionSize, String str2, MessageSourceType messageSourceType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = openWebViewMessageReceived.url;
            }
            if ((i11 & 2) != 0) {
                messageActionSize = openWebViewMessageReceived.size;
            }
            if ((i11 & 4) != 0) {
                str2 = openWebViewMessageReceived.conversationId;
            }
            if ((i11 & 8) != 0) {
                messageSourceType = openWebViewMessageReceived.source;
            }
            return openWebViewMessageReceived.copy(str, messageActionSize, str2, messageSourceType);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final MessageActionSize getSize() {
            return this.size;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final MessageSourceType getSource() {
            return this.source;
        }

        @NotNull
        public final OpenWebViewMessageReceived copy(@NotNull String url, @NotNull MessageActionSize size, @NotNull String conversationId, @NotNull MessageSourceType source) {
            url.getClass();
            size.getClass();
            conversationId.getClass();
            source.getClass();
            return new OpenWebViewMessageReceived(url, size, conversationId, source);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenWebViewMessageReceived)) {
                return false;
            }
            OpenWebViewMessageReceived openWebViewMessageReceived = (OpenWebViewMessageReceived) other;
            return Intrinsics.areEqual(this.url, openWebViewMessageReceived.url) && this.size == openWebViewMessageReceived.size && Intrinsics.areEqual(this.conversationId, openWebViewMessageReceived.conversationId) && this.source == openWebViewMessageReceived.source;
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final MessageActionSize getSize() {
            return this.size;
        }

        @NotNull
        public final MessageSourceType getSource() {
            return this.source;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.source.hashCode() + l1.b((this.size.hashCode() + (this.url.hashCode() * 31)) * 31, 31, this.conversationId);
        }

        @NotNull
        public String toString() {
            return "OpenWebViewMessageReceived(url=" + this.url + ", size=" + this.size + ", conversationId=" + this.conversationId + ", source=" + this.source + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$PersistedUserReceived;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "user", "Lzendesk/conversationkit/android/model/User;", "<init>", "(Lzendesk/conversationkit/android/model/User;)V", "getUser", "()Lzendesk/conversationkit/android/model/User;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PersistedUserReceived extends ConversationKitEvent {

        @NotNull
        private final User user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PersistedUserReceived(@NotNull User user) {
            super(null);
            user.getClass();
            this.user = user;
        }

        public static /* synthetic */ PersistedUserReceived copy$default(PersistedUserReceived persistedUserReceived, User user, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                user = persistedUserReceived.user;
            }
            return persistedUserReceived.copy(user);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        @NotNull
        public final PersistedUserReceived copy(@NotNull User user) {
            user.getClass();
            return new PersistedUserReceived(user);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PersistedUserReceived) && Intrinsics.areEqual(this.user, ((PersistedUserReceived) other).user);
        }

        @NotNull
        public final User getUser() {
            return this.user;
        }

        public int hashCode() {
            return this.user.hashCode();
        }

        @NotNull
        public String toString() {
            return "PersistedUserReceived(user=" + this.user + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$PostbackFailure;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PostbackFailure extends ConversationKitEvent {

        @NotNull
        private final Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PostbackFailure(@NotNull Throwable th2) {
            super(null);
            th2.getClass();
            this.cause = th2;
        }

        public static /* synthetic */ PostbackFailure copy$default(PostbackFailure postbackFailure, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = postbackFailure.cause;
            }
            return postbackFailure.copy(th2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final PostbackFailure copy(@NotNull Throwable cause) {
            cause.getClass();
            return new PostbackFailure(cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PostbackFailure) && Intrinsics.areEqual(this.cause, ((PostbackFailure) other).cause);
        }

        @NotNull
        public final Throwable getCause() {
            return this.cause;
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @NotNull
        public String toString() {
            return f.l("PostbackFailure(cause=", ")", this.cause);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$PostbackSuccess;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "actionId", "", "<init>", "(Ljava/lang/String;)V", "getActionId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PostbackSuccess extends ConversationKitEvent {

        @NotNull
        private final String actionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PostbackSuccess(@NotNull String str) {
            super(null);
            str.getClass();
            this.actionId = str;
        }

        public static /* synthetic */ PostbackSuccess copy$default(PostbackSuccess postbackSuccess, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = postbackSuccess.actionId;
            }
            return postbackSuccess.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getActionId() {
            return this.actionId;
        }

        @NotNull
        public final PostbackSuccess copy(@NotNull String actionId) {
            actionId.getClass();
            return new PostbackSuccess(actionId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PostbackSuccess) && Intrinsics.areEqual(this.actionId, ((PostbackSuccess) other).actionId);
        }

        @NotNull
        public final String getActionId() {
            return this.actionId;
        }

        public int hashCode() {
            return this.actionId.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("PostbackSuccess(actionId=", this.actionId, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$ProactiveMessageStatusChanged;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "status", "Lzendesk/conversationkit/android/model/ProactiveMessageStatus;", "<init>", "(Lzendesk/conversationkit/android/model/ProactiveMessageStatus;)V", "getStatus", "()Lzendesk/conversationkit/android/model/ProactiveMessageStatus;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProactiveMessageStatusChanged extends ConversationKitEvent {

        @NotNull
        private final ProactiveMessageStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProactiveMessageStatusChanged(@NotNull ProactiveMessageStatus proactiveMessageStatus) {
            super(null);
            proactiveMessageStatus.getClass();
            this.status = proactiveMessageStatus;
        }

        public static /* synthetic */ ProactiveMessageStatusChanged copy$default(ProactiveMessageStatusChanged proactiveMessageStatusChanged, ProactiveMessageStatus proactiveMessageStatus, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                proactiveMessageStatus = proactiveMessageStatusChanged.status;
            }
            return proactiveMessageStatusChanged.copy(proactiveMessageStatus);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ProactiveMessageStatus getStatus() {
            return this.status;
        }

        @NotNull
        public final ProactiveMessageStatusChanged copy(@NotNull ProactiveMessageStatus status) {
            status.getClass();
            return new ProactiveMessageStatusChanged(status);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ProactiveMessageStatusChanged) && Intrinsics.areEqual(this.status, ((ProactiveMessageStatusChanged) other).status);
        }

        @NotNull
        public final ProactiveMessageStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        @NotNull
        public String toString() {
            return "ProactiveMessageStatusChanged(status=" + this.status + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$PushTokenPrepared;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "pushNotificationToken", "", "<init>", "(Ljava/lang/String;)V", "getPushNotificationToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PushTokenPrepared extends ConversationKitEvent {

        @NotNull
        private final String pushNotificationToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PushTokenPrepared(@NotNull String str) {
            super(null);
            str.getClass();
            this.pushNotificationToken = str;
        }

        public static /* synthetic */ PushTokenPrepared copy$default(PushTokenPrepared pushTokenPrepared, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = pushTokenPrepared.pushNotificationToken;
            }
            return pushTokenPrepared.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPushNotificationToken() {
            return this.pushNotificationToken;
        }

        @NotNull
        public final PushTokenPrepared copy(@NotNull String pushNotificationToken) {
            pushNotificationToken.getClass();
            return new PushTokenPrepared(pushNotificationToken);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PushTokenPrepared) && Intrinsics.areEqual(this.pushNotificationToken, ((PushTokenPrepared) other).pushNotificationToken);
        }

        @NotNull
        public final String getPushNotificationToken() {
            return this.pushNotificationToken;
        }

        public int hashCode() {
            return this.pushNotificationToken.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("PushTokenPrepared(pushNotificationToken=", this.pushNotificationToken, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$PushTokenUpdateResult;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "", "pushNotificationToken", "", "<init>", "(Lzendesk/conversationkit/android/ConversationKitResult;Ljava/lang/String;)V", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "getPushNotificationToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PushTokenUpdateResult extends ConversationKitEvent {

        @NotNull
        private final String pushNotificationToken;

        @NotNull
        private final ConversationKitResult<Unit> result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PushTokenUpdateResult(@NotNull ConversationKitResult<Unit> conversationKitResult, @NotNull String str) {
            super(null);
            conversationKitResult.getClass();
            str.getClass();
            this.result = conversationKitResult;
            this.pushNotificationToken = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PushTokenUpdateResult copy$default(PushTokenUpdateResult pushTokenUpdateResult, ConversationKitResult conversationKitResult, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversationKitResult = pushTokenUpdateResult.result;
            }
            if ((i11 & 2) != 0) {
                str = pushTokenUpdateResult.pushNotificationToken;
            }
            return pushTokenUpdateResult.copy(conversationKitResult, str);
        }

        @NotNull
        public final ConversationKitResult<Unit> component1() {
            return this.result;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPushNotificationToken() {
            return this.pushNotificationToken;
        }

        @NotNull
        public final PushTokenUpdateResult copy(@NotNull ConversationKitResult<Unit> result, @NotNull String pushNotificationToken) {
            result.getClass();
            pushNotificationToken.getClass();
            return new PushTokenUpdateResult(result, pushNotificationToken);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PushTokenUpdateResult)) {
                return false;
            }
            PushTokenUpdateResult pushTokenUpdateResult = (PushTokenUpdateResult) other;
            return Intrinsics.areEqual(this.result, pushTokenUpdateResult.result) && Intrinsics.areEqual(this.pushNotificationToken, pushTokenUpdateResult.pushNotificationToken);
        }

        @NotNull
        public final String getPushNotificationToken() {
            return this.pushNotificationToken;
        }

        @NotNull
        public final ConversationKitResult<Unit> getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.pushNotificationToken.hashCode() + (this.result.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PushTokenUpdateResult(result=" + this.result + ", pushNotificationToken=" + this.pushNotificationToken + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$SendMessageFailed;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SendMessageFailed extends ConversationKitEvent {

        @NotNull
        private final Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendMessageFailed(@NotNull Throwable th2) {
            super(null);
            th2.getClass();
            this.cause = th2;
        }

        public static /* synthetic */ SendMessageFailed copy$default(SendMessageFailed sendMessageFailed, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = sendMessageFailed.cause;
            }
            return sendMessageFailed.copy(th2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final SendMessageFailed copy(@NotNull Throwable cause) {
            cause.getClass();
            return new SendMessageFailed(cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SendMessageFailed) && Intrinsics.areEqual(this.cause, ((SendMessageFailed) other).cause);
        }

        @NotNull
        public final Throwable getCause() {
            return this.cause;
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @NotNull
        public String toString() {
            return f.l("SendMessageFailed(cause=", ")", this.cause);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$UserAccessRevoked;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UserAccessRevoked extends ConversationKitEvent {

        @NotNull
        private final Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserAccessRevoked(@NotNull Throwable th2) {
            super(null);
            th2.getClass();
            this.cause = th2;
        }

        public static /* synthetic */ UserAccessRevoked copy$default(UserAccessRevoked userAccessRevoked, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = userAccessRevoked.cause;
            }
            return userAccessRevoked.copy(th2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final UserAccessRevoked copy(@NotNull Throwable cause) {
            cause.getClass();
            return new UserAccessRevoked(cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserAccessRevoked) && Intrinsics.areEqual(this.cause, ((UserAccessRevoked) other).cause);
        }

        @NotNull
        public final Throwable getCause() {
            return this.cause;
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @NotNull
        public String toString() {
            return f.l("UserAccessRevoked(cause=", ")", this.cause);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$UserServedByAgent;", "Lzendesk/conversationkit/android/ConversationKitEvent;", InAppMessageBase.MESSAGE, "Lzendesk/conversationkit/android/model/Message;", "conversationId", "", "<init>", "(Lzendesk/conversationkit/android/model/Message;Ljava/lang/String;)V", "getMessage", "()Lzendesk/conversationkit/android/model/Message;", "getConversationId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UserServedByAgent extends ConversationKitEvent {

        @NotNull
        private final String conversationId;

        @NotNull
        private final Message message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserServedByAgent(@NotNull Message message, @NotNull String str) {
            super(null);
            message.getClass();
            str.getClass();
            this.message = message;
            this.conversationId = str;
        }

        public static /* synthetic */ UserServedByAgent copy$default(UserServedByAgent userServedByAgent, Message message, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                message = userServedByAgent.message;
            }
            if ((i11 & 2) != 0) {
                str = userServedByAgent.conversationId;
            }
            return userServedByAgent.copy(message, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final UserServedByAgent copy(@NotNull Message message, @NotNull String conversationId) {
            message.getClass();
            conversationId.getClass();
            return new UserServedByAgent(message, conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserServedByAgent)) {
                return false;
            }
            UserServedByAgent userServedByAgent = (UserServedByAgent) other;
            return Intrinsics.areEqual(this.message, userServedByAgent.message) && Intrinsics.areEqual(this.conversationId, userServedByAgent.conversationId);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final Message getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.conversationId.hashCode() + (this.message.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "UserServedByAgent(message=" + this.message + ", conversationId=" + this.conversationId + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitEvent$UserUpdated;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "user", "Lzendesk/conversationkit/android/model/User;", "<init>", "(Lzendesk/conversationkit/android/model/User;)V", "getUser", "()Lzendesk/conversationkit/android/model/User;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UserUpdated extends ConversationKitEvent {

        @NotNull
        private final User user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserUpdated(@NotNull User user) {
            super(null);
            user.getClass();
            this.user = user;
        }

        public static /* synthetic */ UserUpdated copy$default(UserUpdated userUpdated, User user, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                user = userUpdated.user;
            }
            return userUpdated.copy(user);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        @NotNull
        public final UserUpdated copy(@NotNull User user) {
            user.getClass();
            return new UserUpdated(user);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserUpdated) && Intrinsics.areEqual(this.user, ((UserUpdated) other).user);
        }

        @NotNull
        public final User getUser() {
            return this.user;
        }

        public int hashCode() {
            return this.user.hashCode();
        }

        @NotNull
        public String toString() {
            return "UserUpdated(user=" + this.user + ")";
        }
    }

    public /* synthetic */ ConversationKitEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ConversationKitEvent() {
    }
}
