package zendesk.android.events;

import b3.i;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import e0.f;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.d;
import w.a0;
import w2.l1;
import zendesk.core.android.internal.InternalZendeskApi;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0018\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0018\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123¨\u00064"}, d2 = {"Lzendesk/android/events/ZendeskEvent;", "", "<init>", "()V", "UnreadMessageCountChanged", "AuthenticationFailed", "FieldValidationFailed", "ConnectionStatusChanged", "SendMessageFailed", "ConversationAdded", "MessagesShown", "ConversationStarted", "ConversationOpened", "ProactiveMessageDisplayed", "NewConversationButtonClicked", "ProactiveMessageClicked", "ConversationWithAgentRequested", "ConversationAgentAssigned", "ConversationServedByAgent", "PostbackButtonClicked", "ConversationExtensionOpened", "ConversationExtensionDisplayed", "MessagingOpened", "MessagingClosed", "ArticleClicked", "ArticleBrowserClicked", "NotificationDisplayed", "NotificationOpened", "Lzendesk/android/events/ZendeskEvent$ArticleBrowserClicked;", "Lzendesk/android/events/ZendeskEvent$ArticleClicked;", "Lzendesk/android/events/ZendeskEvent$AuthenticationFailed;", "Lzendesk/android/events/ZendeskEvent$ConnectionStatusChanged;", "Lzendesk/android/events/ZendeskEvent$ConversationAdded;", "Lzendesk/android/events/ZendeskEvent$ConversationAgentAssigned;", "Lzendesk/android/events/ZendeskEvent$ConversationExtensionDisplayed;", "Lzendesk/android/events/ZendeskEvent$ConversationExtensionOpened;", "Lzendesk/android/events/ZendeskEvent$ConversationOpened;", "Lzendesk/android/events/ZendeskEvent$ConversationServedByAgent;", "Lzendesk/android/events/ZendeskEvent$ConversationStarted;", "Lzendesk/android/events/ZendeskEvent$ConversationWithAgentRequested;", "Lzendesk/android/events/ZendeskEvent$FieldValidationFailed;", "Lzendesk/android/events/ZendeskEvent$MessagesShown;", "Lzendesk/android/events/ZendeskEvent$MessagingClosed;", "Lzendesk/android/events/ZendeskEvent$MessagingOpened;", "Lzendesk/android/events/ZendeskEvent$NewConversationButtonClicked;", "Lzendesk/android/events/ZendeskEvent$NotificationDisplayed;", "Lzendesk/android/events/ZendeskEvent$NotificationOpened;", "Lzendesk/android/events/ZendeskEvent$PostbackButtonClicked;", "Lzendesk/android/events/ZendeskEvent$ProactiveMessageClicked;", "Lzendesk/android/events/ZendeskEvent$ProactiveMessageDisplayed;", "Lzendesk/android/events/ZendeskEvent$SendMessageFailed;", "Lzendesk/android/events/ZendeskEvent$UnreadMessageCountChanged;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ZendeskEvent {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/android/events/ZendeskEvent$AuthenticationFailed;", "Lzendesk/android/events/ZendeskEvent;", StatusResponseUtils.RESULT_ERROR, "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AuthenticationFailed extends ZendeskEvent {

        @NotNull
        private final Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthenticationFailed(@NotNull Throwable th2) {
            super(null);
            th2.getClass();
            this.error = th2;
        }

        public static /* synthetic */ AuthenticationFailed copy$default(AuthenticationFailed authenticationFailed, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = authenticationFailed.error;
            }
            return authenticationFailed.copy(th2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        @NotNull
        public final AuthenticationFailed copy(@NotNull Throwable error) {
            error.getClass();
            return new AuthenticationFailed(error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AuthenticationFailed) && Intrinsics.areEqual(this.error, ((AuthenticationFailed) other).error);
        }

        @NotNull
        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return f.l("AuthenticationFailed(error=", ")", this.error);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/android/events/ZendeskEvent$ConnectionStatusChanged;", "Lzendesk/android/events/ZendeskEvent;", "connectionStatus", "Lzendesk/android/events/ConnectionStatus;", "<init>", "(Lzendesk/android/events/ConnectionStatus;)V", "getConnectionStatus", "()Lzendesk/android/events/ConnectionStatus;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConnectionStatusChanged extends ZendeskEvent {

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
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/android/events/ZendeskEvent$ConversationAdded;", "Lzendesk/android/events/ZendeskEvent;", "conversationId", "", "<init>", "(Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationAdded extends ZendeskEvent {

        @NotNull
        private final String conversationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationAdded(@NotNull String str) {
            super(null);
            str.getClass();
            this.conversationId = str;
        }

        public static /* synthetic */ ConversationAdded copy$default(ConversationAdded conversationAdded, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = conversationAdded.conversationId;
            }
            return conversationAdded.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final ConversationAdded copy(@NotNull String conversationId) {
            conversationId.getClass();
            return new ConversationAdded(conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConversationAdded) && Intrinsics.areEqual(this.conversationId, ((ConversationAdded) other).conversationId);
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
            return a0.p("ConversationAdded(conversationId=", this.conversationId, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lzendesk/android/events/ZendeskEvent$FieldValidationFailed;", "Lzendesk/android/events/ZendeskEvent;", "errors", "", "", "<init>", "(Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FieldValidationFailed extends ZendeskEvent {

        @NotNull
        private final List<Throwable> errors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FieldValidationFailed(@NotNull List<? extends Throwable> list) {
            super(null);
            list.getClass();
            this.errors = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FieldValidationFailed copy$default(FieldValidationFailed fieldValidationFailed, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = fieldValidationFailed.errors;
            }
            return fieldValidationFailed.copy(list);
        }

        @NotNull
        public final List<Throwable> component1() {
            return this.errors;
        }

        @NotNull
        public final FieldValidationFailed copy(@NotNull List<? extends Throwable> errors) {
            errors.getClass();
            return new FieldValidationFailed(errors);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FieldValidationFailed) && Intrinsics.areEqual(this.errors, ((FieldValidationFailed) other).errors);
        }

        @NotNull
        public final List<Throwable> getErrors() {
            return this.errors;
        }

        public int hashCode() {
            return this.errors.hashCode();
        }

        @NotNull
        public String toString() {
            return f.m("FieldValidationFailed(errors=", ")", this.errors);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/android/events/ZendeskEvent$SendMessageFailed;", "Lzendesk/android/events/ZendeskEvent;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SendMessageFailed extends ZendeskEvent {

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

    public /* synthetic */ ZendeskEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ZendeskEvent() {
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lzendesk/android/events/ZendeskEvent$UnreadMessageCountChanged;", "Lzendesk/android/events/ZendeskEvent;", "id", "", "timestamp", "", Bayeux.KEY_DATA, "Lzendesk/android/events/ConversationUnreadCountChange;", "currentUnreadCount", "", "<init>", "(Ljava/lang/String;JLzendesk/android/events/ConversationUnreadCountChange;I)V", "getId", "()Ljava/lang/String;", "getTimestamp", "()J", "getData", "()Lzendesk/android/events/ConversationUnreadCountChange;", "getCurrentUnreadCount$annotations", "()V", "getCurrentUnreadCount", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnreadMessageCountChanged extends ZendeskEvent {
        private final int currentUnreadCount;

        @NotNull
        private final ConversationUnreadCountChange data;

        @NotNull
        private final String id;
        private final long timestamp;

        public /* synthetic */ UnreadMessageCountChanged(String str, long j9, ConversationUnreadCountChange conversationUnreadCountChange, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? UUID.randomUUID().toString() : str, j9, conversationUnreadCountChange, i11);
        }

        public static /* synthetic */ UnreadMessageCountChanged copy$default(UnreadMessageCountChanged unreadMessageCountChanged, String str, long j9, ConversationUnreadCountChange conversationUnreadCountChange, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = unreadMessageCountChanged.id;
            }
            if ((i12 & 2) != 0) {
                j9 = unreadMessageCountChanged.timestamp;
            }
            if ((i12 & 4) != 0) {
                conversationUnreadCountChange = unreadMessageCountChanged.data;
            }
            if ((i12 & 8) != 0) {
                i11 = unreadMessageCountChanged.currentUnreadCount;
            }
            return unreadMessageCountChanged.copy(str, j9, conversationUnreadCountChange, i11);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ConversationUnreadCountChange getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getCurrentUnreadCount() {
            return this.currentUnreadCount;
        }

        @NotNull
        public final UnreadMessageCountChanged copy(@NotNull String id2, long timestamp, @NotNull ConversationUnreadCountChange data, int currentUnreadCount) {
            id2.getClass();
            data.getClass();
            return new UnreadMessageCountChanged(id2, timestamp, data, currentUnreadCount);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UnreadMessageCountChanged)) {
                return false;
            }
            UnreadMessageCountChanged unreadMessageCountChanged = (UnreadMessageCountChanged) other;
            return Intrinsics.areEqual(this.id, unreadMessageCountChanged.id) && this.timestamp == unreadMessageCountChanged.timestamp && Intrinsics.areEqual(this.data, unreadMessageCountChanged.data) && this.currentUnreadCount == unreadMessageCountChanged.currentUnreadCount;
        }

        public final int getCurrentUnreadCount() {
            return this.currentUnreadCount;
        }

        @NotNull
        public final ConversationUnreadCountChange getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Integer.hashCode(this.currentUnreadCount) + ((this.data.hashCode() + f.b(this.id.hashCode() * 31, 31, this.timestamp)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            long j9 = this.timestamp;
            ConversationUnreadCountChange conversationUnreadCountChange = this.data;
            int i11 = this.currentUnreadCount;
            StringBuilder sbN = i.n(j9, "UnreadMessageCountChanged(id=", str, ", timestamp=");
            sbN.append(", data=");
            sbN.append(conversationUnreadCountChange);
            sbN.append(", currentUnreadCount=");
            sbN.append(i11);
            sbN.append(")");
            return sbN.toString();
        }

        @d
        public static /* synthetic */ void getCurrentUnreadCount$annotations() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InternalZendeskApi
        public UnreadMessageCountChanged(@NotNull String str, long j9, @NotNull ConversationUnreadCountChange conversationUnreadCountChange, int i11) {
            super(null);
            str.getClass();
            conversationUnreadCountChange.getClass();
            this.id = str;
            this.timestamp = j9;
            this.data = conversationUnreadCountChange;
            this.currentUnreadCount = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lzendesk/android/events/ZendeskEvent$ConversationOpened;", "Lzendesk/android/events/ZendeskEvent;", "id", "", "conversationId", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getConversationId", "getTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationOpened extends ZendeskEvent {

        @Nullable
        private final String conversationId;

        @NotNull
        private final String id;
        private final long timestamp;

        public /* synthetic */ ConversationOpened(String str, String str2, long j9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, j9);
        }

        public static /* synthetic */ ConversationOpened copy$default(ConversationOpened conversationOpened, String str, String str2, long j9, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = conversationOpened.id;
            }
            if ((i11 & 2) != 0) {
                str2 = conversationOpened.conversationId;
            }
            if ((i11 & 4) != 0) {
                j9 = conversationOpened.timestamp;
            }
            return conversationOpened.copy(str, str2, j9);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        public final ConversationOpened copy(@NotNull String id2, @Nullable String conversationId, long timestamp) {
            id2.getClass();
            return new ConversationOpened(id2, conversationId, timestamp);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationOpened)) {
                return false;
            }
            ConversationOpened conversationOpened = (ConversationOpened) other;
            return Intrinsics.areEqual(this.id, conversationOpened.id) && Intrinsics.areEqual(this.conversationId, conversationOpened.conversationId) && this.timestamp == conversationOpened.timestamp;
        }

        @Nullable
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.conversationId;
            return Long.hashCode(this.timestamp) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return a0.j(this.timestamp, ")", f.t("ConversationOpened(id=", this.id, ", conversationId=", this.conversationId, ", timestamp="));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationOpened(@NotNull String str, @Nullable String str2, long j9) {
            super(null);
            str.getClass();
            this.id = str;
            this.conversationId = str2;
            this.timestamp = j9;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lzendesk/android/events/ZendeskEvent$MessagingClosed;", "Lzendesk/android/events/ZendeskEvent;", "id", "", "timestamp", "", "<init>", "(Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MessagingClosed extends ZendeskEvent {

        @NotNull
        private final String id;
        private final long timestamp;

        public /* synthetic */ MessagingClosed(String str, long j9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UUID.randomUUID().toString() : str, j9);
        }

        public static /* synthetic */ MessagingClosed copy$default(MessagingClosed messagingClosed, String str, long j9, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = messagingClosed.id;
            }
            if ((i11 & 2) != 0) {
                j9 = messagingClosed.timestamp;
            }
            return messagingClosed.copy(str, j9);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        public final MessagingClosed copy(@NotNull String id2, long timestamp) {
            id2.getClass();
            return new MessagingClosed(id2, timestamp);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessagingClosed)) {
                return false;
            }
            MessagingClosed messagingClosed = (MessagingClosed) other;
            return Intrinsics.areEqual(this.id, messagingClosed.id) && this.timestamp == messagingClosed.timestamp;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp) + (this.id.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sbN = i.n(this.timestamp, "MessagingClosed(id=", this.id, ", timestamp=");
            sbN.append(")");
            return sbN.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InternalZendeskApi
        public MessagingClosed(@NotNull String str, long j9) {
            super(null);
            str.getClass();
            this.id = str;
            this.timestamp = j9;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lzendesk/android/events/ZendeskEvent$MessagingOpened;", "Lzendesk/android/events/ZendeskEvent;", "id", "", "timestamp", "", "<init>", "(Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MessagingOpened extends ZendeskEvent {

        @NotNull
        private final String id;
        private final long timestamp;

        public /* synthetic */ MessagingOpened(String str, long j9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UUID.randomUUID().toString() : str, j9);
        }

        public static /* synthetic */ MessagingOpened copy$default(MessagingOpened messagingOpened, String str, long j9, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = messagingOpened.id;
            }
            if ((i11 & 2) != 0) {
                j9 = messagingOpened.timestamp;
            }
            return messagingOpened.copy(str, j9);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        public final MessagingOpened copy(@NotNull String id2, long timestamp) {
            id2.getClass();
            return new MessagingOpened(id2, timestamp);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessagingOpened)) {
                return false;
            }
            MessagingOpened messagingOpened = (MessagingOpened) other;
            return Intrinsics.areEqual(this.id, messagingOpened.id) && this.timestamp == messagingOpened.timestamp;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp) + (this.id.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sbN = i.n(this.timestamp, "MessagingOpened(id=", this.id, ", timestamp=");
            sbN.append(")");
            return sbN.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InternalZendeskApi
        public MessagingOpened(@NotNull String str, long j9) {
            super(null);
            str.getClass();
            this.id = str;
            this.timestamp = j9;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lzendesk/android/events/ZendeskEvent$ArticleBrowserClicked;", "Lzendesk/android/events/ZendeskEvent;", "id", "", "timestamp", "", Bayeux.KEY_DATA, "Lzendesk/android/events/ArticleBrowserClickedDetails;", "<init>", "(Ljava/lang/String;JLzendesk/android/events/ArticleBrowserClickedDetails;)V", "getId", "()Ljava/lang/String;", "getTimestamp", "()J", "getData", "()Lzendesk/android/events/ArticleBrowserClickedDetails;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ArticleBrowserClicked extends ZendeskEvent {

        @NotNull
        private final ArticleBrowserClickedDetails data;

        @NotNull
        private final String id;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InternalZendeskApi
        public ArticleBrowserClicked(@NotNull String str, long j9, @NotNull ArticleBrowserClickedDetails articleBrowserClickedDetails) {
            super(null);
            str.getClass();
            articleBrowserClickedDetails.getClass();
            this.id = str;
            this.timestamp = j9;
            this.data = articleBrowserClickedDetails;
        }

        public static /* synthetic */ ArticleBrowserClicked copy$default(ArticleBrowserClicked articleBrowserClicked, String str, long j9, ArticleBrowserClickedDetails articleBrowserClickedDetails, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = articleBrowserClicked.id;
            }
            if ((i11 & 2) != 0) {
                j9 = articleBrowserClicked.timestamp;
            }
            if ((i11 & 4) != 0) {
                articleBrowserClickedDetails = articleBrowserClicked.data;
            }
            return articleBrowserClicked.copy(str, j9, articleBrowserClickedDetails);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ArticleBrowserClickedDetails getData() {
            return this.data;
        }

        @NotNull
        public final ArticleBrowserClicked copy(@NotNull String id2, long timestamp, @NotNull ArticleBrowserClickedDetails data) {
            id2.getClass();
            data.getClass();
            return new ArticleBrowserClicked(id2, timestamp, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ArticleBrowserClicked)) {
                return false;
            }
            ArticleBrowserClicked articleBrowserClicked = (ArticleBrowserClicked) other;
            return Intrinsics.areEqual(this.id, articleBrowserClicked.id) && this.timestamp == articleBrowserClicked.timestamp && Intrinsics.areEqual(this.data, articleBrowserClicked.data);
        }

        @NotNull
        public final ArticleBrowserClickedDetails getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.data.hashCode() + f.b(this.id.hashCode() * 31, 31, this.timestamp);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            long j9 = this.timestamp;
            ArticleBrowserClickedDetails articleBrowserClickedDetails = this.data;
            StringBuilder sbN = i.n(j9, "ArticleBrowserClicked(id=", str, ", timestamp=");
            sbN.append(", data=");
            sbN.append(articleBrowserClickedDetails);
            sbN.append(")");
            return sbN.toString();
        }

        public /* synthetic */ ArticleBrowserClicked(String str, long j9, ArticleBrowserClickedDetails articleBrowserClickedDetails, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UUID.randomUUID().toString() : str, j9, articleBrowserClickedDetails);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lzendesk/android/events/ZendeskEvent$ArticleClicked;", "Lzendesk/android/events/ZendeskEvent;", "id", "", "timestamp", "", Bayeux.KEY_DATA, "Lzendesk/android/events/ArticleClickedDetails;", "<init>", "(Ljava/lang/String;JLzendesk/android/events/ArticleClickedDetails;)V", "getId", "()Ljava/lang/String;", "getTimestamp", "()J", "getData", "()Lzendesk/android/events/ArticleClickedDetails;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ArticleClicked extends ZendeskEvent {

        @NotNull
        private final ArticleClickedDetails data;

        @NotNull
        private final String id;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InternalZendeskApi
        public ArticleClicked(@NotNull String str, long j9, @NotNull ArticleClickedDetails articleClickedDetails) {
            super(null);
            str.getClass();
            articleClickedDetails.getClass();
            this.id = str;
            this.timestamp = j9;
            this.data = articleClickedDetails;
        }

        public static /* synthetic */ ArticleClicked copy$default(ArticleClicked articleClicked, String str, long j9, ArticleClickedDetails articleClickedDetails, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = articleClicked.id;
            }
            if ((i11 & 2) != 0) {
                j9 = articleClicked.timestamp;
            }
            if ((i11 & 4) != 0) {
                articleClickedDetails = articleClicked.data;
            }
            return articleClicked.copy(str, j9, articleClickedDetails);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ArticleClickedDetails getData() {
            return this.data;
        }

        @NotNull
        public final ArticleClicked copy(@NotNull String id2, long timestamp, @NotNull ArticleClickedDetails data) {
            id2.getClass();
            data.getClass();
            return new ArticleClicked(id2, timestamp, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ArticleClicked)) {
                return false;
            }
            ArticleClicked articleClicked = (ArticleClicked) other;
            return Intrinsics.areEqual(this.id, articleClicked.id) && this.timestamp == articleClicked.timestamp && Intrinsics.areEqual(this.data, articleClicked.data);
        }

        @NotNull
        public final ArticleClickedDetails getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.data.hashCode() + f.b(this.id.hashCode() * 31, 31, this.timestamp);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            long j9 = this.timestamp;
            ArticleClickedDetails articleClickedDetails = this.data;
            StringBuilder sbN = i.n(j9, "ArticleClicked(id=", str, ", timestamp=");
            sbN.append(", data=");
            sbN.append(articleClickedDetails);
            sbN.append(")");
            return sbN.toString();
        }

        public /* synthetic */ ArticleClicked(String str, long j9, ArticleClickedDetails articleClickedDetails, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UUID.randomUUID().toString() : str, j9, articleClickedDetails);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lzendesk/android/events/ZendeskEvent$ConversationAgentAssigned;", "Lzendesk/android/events/ZendeskEvent;", "id", "", "timestamp", "", Bayeux.KEY_DATA, "Lzendesk/android/events/ConversationAgentAssignedDetails;", "<init>", "(Ljava/lang/String;JLzendesk/android/events/ConversationAgentAssignedDetails;)V", "getId", "()Ljava/lang/String;", "getTimestamp", "()J", "getData", "()Lzendesk/android/events/ConversationAgentAssignedDetails;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationAgentAssigned extends ZendeskEvent {

        @NotNull
        private final ConversationAgentAssignedDetails data;

        @NotNull
        private final String id;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InternalZendeskApi
        public ConversationAgentAssigned(@NotNull String str, long j9, @NotNull ConversationAgentAssignedDetails conversationAgentAssignedDetails) {
            super(null);
            str.getClass();
            conversationAgentAssignedDetails.getClass();
            this.id = str;
            this.timestamp = j9;
            this.data = conversationAgentAssignedDetails;
        }

        public static /* synthetic */ ConversationAgentAssigned copy$default(ConversationAgentAssigned conversationAgentAssigned, String str, long j9, ConversationAgentAssignedDetails conversationAgentAssignedDetails, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = conversationAgentAssigned.id;
            }
            if ((i11 & 2) != 0) {
                j9 = conversationAgentAssigned.timestamp;
            }
            if ((i11 & 4) != 0) {
                conversationAgentAssignedDetails = conversationAgentAssigned.data;
            }
            return conversationAgentAssigned.copy(str, j9, conversationAgentAssignedDetails);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ConversationAgentAssignedDetails getData() {
            return this.data;
        }

        @NotNull
        public final ConversationAgentAssigned copy(@NotNull String id2, long timestamp, @NotNull ConversationAgentAssignedDetails data) {
            id2.getClass();
            data.getClass();
            return new ConversationAgentAssigned(id2, timestamp, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationAgentAssigned)) {
                return false;
            }
            ConversationAgentAssigned conversationAgentAssigned = (ConversationAgentAssigned) other;
            return Intrinsics.areEqual(this.id, conversationAgentAssigned.id) && this.timestamp == conversationAgentAssigned.timestamp && Intrinsics.areEqual(this.data, conversationAgentAssigned.data);
        }

        @NotNull
        public final ConversationAgentAssignedDetails getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.data.hashCode() + f.b(this.id.hashCode() * 31, 31, this.timestamp);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            long j9 = this.timestamp;
            ConversationAgentAssignedDetails conversationAgentAssignedDetails = this.data;
            StringBuilder sbN = i.n(j9, "ConversationAgentAssigned(id=", str, ", timestamp=");
            sbN.append(", data=");
            sbN.append(conversationAgentAssignedDetails);
            sbN.append(")");
            return sbN.toString();
        }

        public /* synthetic */ ConversationAgentAssigned(String str, long j9, ConversationAgentAssignedDetails conversationAgentAssignedDetails, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UUID.randomUUID().toString() : str, j9, conversationAgentAssignedDetails);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lzendesk/android/events/ZendeskEvent$ConversationExtensionDisplayed;", "Lzendesk/android/events/ZendeskEvent;", "id", "", "timestamp", "", Bayeux.KEY_DATA, "Lzendesk/android/events/ConversationExtensionDisplayedDetails;", "<init>", "(Ljava/lang/String;JLzendesk/android/events/ConversationExtensionDisplayedDetails;)V", "getId", "()Ljava/lang/String;", "getTimestamp", "()J", "getData", "()Lzendesk/android/events/ConversationExtensionDisplayedDetails;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationExtensionDisplayed extends ZendeskEvent {

        @NotNull
        private final ConversationExtensionDisplayedDetails data;

        @NotNull
        private final String id;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InternalZendeskApi
        public ConversationExtensionDisplayed(@NotNull String str, long j9, @NotNull ConversationExtensionDisplayedDetails conversationExtensionDisplayedDetails) {
            super(null);
            str.getClass();
            conversationExtensionDisplayedDetails.getClass();
            this.id = str;
            this.timestamp = j9;
            this.data = conversationExtensionDisplayedDetails;
        }

        public static /* synthetic */ ConversationExtensionDisplayed copy$default(ConversationExtensionDisplayed conversationExtensionDisplayed, String str, long j9, ConversationExtensionDisplayedDetails conversationExtensionDisplayedDetails, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = conversationExtensionDisplayed.id;
            }
            if ((i11 & 2) != 0) {
                j9 = conversationExtensionDisplayed.timestamp;
            }
            if ((i11 & 4) != 0) {
                conversationExtensionDisplayedDetails = conversationExtensionDisplayed.data;
            }
            return conversationExtensionDisplayed.copy(str, j9, conversationExtensionDisplayedDetails);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ConversationExtensionDisplayedDetails getData() {
            return this.data;
        }

        @NotNull
        public final ConversationExtensionDisplayed copy(@NotNull String id2, long timestamp, @NotNull ConversationExtensionDisplayedDetails data) {
            id2.getClass();
            data.getClass();
            return new ConversationExtensionDisplayed(id2, timestamp, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationExtensionDisplayed)) {
                return false;
            }
            ConversationExtensionDisplayed conversationExtensionDisplayed = (ConversationExtensionDisplayed) other;
            return Intrinsics.areEqual(this.id, conversationExtensionDisplayed.id) && this.timestamp == conversationExtensionDisplayed.timestamp && Intrinsics.areEqual(this.data, conversationExtensionDisplayed.data);
        }

        @NotNull
        public final ConversationExtensionDisplayedDetails getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.data.hashCode() + f.b(this.id.hashCode() * 31, 31, this.timestamp);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            long j9 = this.timestamp;
            ConversationExtensionDisplayedDetails conversationExtensionDisplayedDetails = this.data;
            StringBuilder sbN = i.n(j9, "ConversationExtensionDisplayed(id=", str, ", timestamp=");
            sbN.append(", data=");
            sbN.append(conversationExtensionDisplayedDetails);
            sbN.append(")");
            return sbN.toString();
        }

        public /* synthetic */ ConversationExtensionDisplayed(String str, long j9, ConversationExtensionDisplayedDetails conversationExtensionDisplayedDetails, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UUID.randomUUID().toString() : str, j9, conversationExtensionDisplayedDetails);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lzendesk/android/events/ZendeskEvent$ConversationExtensionOpened;", "Lzendesk/android/events/ZendeskEvent;", "id", "", "timestamp", "", Bayeux.KEY_DATA, "Lzendesk/android/events/ConversationExtensionOpenedDetails;", "<init>", "(Ljava/lang/String;JLzendesk/android/events/ConversationExtensionOpenedDetails;)V", "getId", "()Ljava/lang/String;", "getTimestamp", "()J", "getData", "()Lzendesk/android/events/ConversationExtensionOpenedDetails;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationExtensionOpened extends ZendeskEvent {

        @NotNull
        private final ConversationExtensionOpenedDetails data;

        @NotNull
        private final String id;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InternalZendeskApi
        public ConversationExtensionOpened(@NotNull String str, long j9, @NotNull ConversationExtensionOpenedDetails conversationExtensionOpenedDetails) {
            super(null);
            str.getClass();
            conversationExtensionOpenedDetails.getClass();
            this.id = str;
            this.timestamp = j9;
            this.data = conversationExtensionOpenedDetails;
        }

        public static /* synthetic */ ConversationExtensionOpened copy$default(ConversationExtensionOpened conversationExtensionOpened, String str, long j9, ConversationExtensionOpenedDetails conversationExtensionOpenedDetails, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = conversationExtensionOpened.id;
            }
            if ((i11 & 2) != 0) {
                j9 = conversationExtensionOpened.timestamp;
            }
            if ((i11 & 4) != 0) {
                conversationExtensionOpenedDetails = conversationExtensionOpened.data;
            }
            return conversationExtensionOpened.copy(str, j9, conversationExtensionOpenedDetails);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ConversationExtensionOpenedDetails getData() {
            return this.data;
        }

        @NotNull
        public final ConversationExtensionOpened copy(@NotNull String id2, long timestamp, @NotNull ConversationExtensionOpenedDetails data) {
            id2.getClass();
            data.getClass();
            return new ConversationExtensionOpened(id2, timestamp, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationExtensionOpened)) {
                return false;
            }
            ConversationExtensionOpened conversationExtensionOpened = (ConversationExtensionOpened) other;
            return Intrinsics.areEqual(this.id, conversationExtensionOpened.id) && this.timestamp == conversationExtensionOpened.timestamp && Intrinsics.areEqual(this.data, conversationExtensionOpened.data);
        }

        @NotNull
        public final ConversationExtensionOpenedDetails getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.data.hashCode() + f.b(this.id.hashCode() * 31, 31, this.timestamp);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            long j9 = this.timestamp;
            ConversationExtensionOpenedDetails conversationExtensionOpenedDetails = this.data;
            StringBuilder sbN = i.n(j9, "ConversationExtensionOpened(id=", str, ", timestamp=");
            sbN.append(", data=");
            sbN.append(conversationExtensionOpenedDetails);
            sbN.append(")");
            return sbN.toString();
        }

        public /* synthetic */ ConversationExtensionOpened(String str, long j9, ConversationExtensionOpenedDetails conversationExtensionOpenedDetails, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UUID.randomUUID().toString() : str, j9, conversationExtensionOpenedDetails);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lzendesk/android/events/ZendeskEvent$ConversationServedByAgent;", "Lzendesk/android/events/ZendeskEvent;", "id", "", "timestamp", "", Bayeux.KEY_DATA, "Lzendesk/android/events/ConversationServedByAgentDetails;", "<init>", "(Ljava/lang/String;JLzendesk/android/events/ConversationServedByAgentDetails;)V", "getId", "()Ljava/lang/String;", "getTimestamp", "()J", "getData", "()Lzendesk/android/events/ConversationServedByAgentDetails;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationServedByAgent extends ZendeskEvent {

        @NotNull
        private final ConversationServedByAgentDetails data;

        @NotNull
        private final String id;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InternalZendeskApi
        public ConversationServedByAgent(@NotNull String str, long j9, @NotNull ConversationServedByAgentDetails conversationServedByAgentDetails) {
            super(null);
            str.getClass();
            conversationServedByAgentDetails.getClass();
            this.id = str;
            this.timestamp = j9;
            this.data = conversationServedByAgentDetails;
        }

        public static /* synthetic */ ConversationServedByAgent copy$default(ConversationServedByAgent conversationServedByAgent, String str, long j9, ConversationServedByAgentDetails conversationServedByAgentDetails, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = conversationServedByAgent.id;
            }
            if ((i11 & 2) != 0) {
                j9 = conversationServedByAgent.timestamp;
            }
            if ((i11 & 4) != 0) {
                conversationServedByAgentDetails = conversationServedByAgent.data;
            }
            return conversationServedByAgent.copy(str, j9, conversationServedByAgentDetails);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ConversationServedByAgentDetails getData() {
            return this.data;
        }

        @NotNull
        public final ConversationServedByAgent copy(@NotNull String id2, long timestamp, @NotNull ConversationServedByAgentDetails data) {
            id2.getClass();
            data.getClass();
            return new ConversationServedByAgent(id2, timestamp, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationServedByAgent)) {
                return false;
            }
            ConversationServedByAgent conversationServedByAgent = (ConversationServedByAgent) other;
            return Intrinsics.areEqual(this.id, conversationServedByAgent.id) && this.timestamp == conversationServedByAgent.timestamp && Intrinsics.areEqual(this.data, conversationServedByAgent.data);
        }

        @NotNull
        public final ConversationServedByAgentDetails getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.data.hashCode() + f.b(this.id.hashCode() * 31, 31, this.timestamp);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            long j9 = this.timestamp;
            ConversationServedByAgentDetails conversationServedByAgentDetails = this.data;
            StringBuilder sbN = i.n(j9, "ConversationServedByAgent(id=", str, ", timestamp=");
            sbN.append(", data=");
            sbN.append(conversationServedByAgentDetails);
            sbN.append(")");
            return sbN.toString();
        }

        public /* synthetic */ ConversationServedByAgent(String str, long j9, ConversationServedByAgentDetails conversationServedByAgentDetails, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UUID.randomUUID().toString() : str, j9, conversationServedByAgentDetails);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lzendesk/android/events/ZendeskEvent$ConversationStarted;", "Lzendesk/android/events/ZendeskEvent;", "id", "", "conversationId", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getConversationId", "getTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationStarted extends ZendeskEvent {

        @NotNull
        private final String conversationId;

        @NotNull
        private final String id;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationStarted(@NotNull String str, @NotNull String str2, long j9) {
            super(null);
            str.getClass();
            str2.getClass();
            this.id = str;
            this.conversationId = str2;
            this.timestamp = j9;
        }

        public static /* synthetic */ ConversationStarted copy$default(ConversationStarted conversationStarted, String str, String str2, long j9, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = conversationStarted.id;
            }
            if ((i11 & 2) != 0) {
                str2 = conversationStarted.conversationId;
            }
            if ((i11 & 4) != 0) {
                j9 = conversationStarted.timestamp;
            }
            return conversationStarted.copy(str, str2, j9);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        public final ConversationStarted copy(@NotNull String id2, @NotNull String conversationId, long timestamp) {
            id2.getClass();
            conversationId.getClass();
            return new ConversationStarted(id2, conversationId, timestamp);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationStarted)) {
                return false;
            }
            ConversationStarted conversationStarted = (ConversationStarted) other;
            return Intrinsics.areEqual(this.id, conversationStarted.id) && Intrinsics.areEqual(this.conversationId, conversationStarted.conversationId) && this.timestamp == conversationStarted.timestamp;
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp) + l1.b(this.id.hashCode() * 31, 31, this.conversationId);
        }

        @NotNull
        public String toString() {
            return a0.j(this.timestamp, ")", f.t("ConversationStarted(id=", this.id, ", conversationId=", this.conversationId, ", timestamp="));
        }

        public /* synthetic */ ConversationStarted(String str, String str2, long j9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, j9);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lzendesk/android/events/ZendeskEvent$ConversationWithAgentRequested;", "Lzendesk/android/events/ZendeskEvent;", "id", "", "timestamp", "", Bayeux.KEY_DATA, "Lzendesk/android/events/ConversationWithAgentRequestedDetails;", "<init>", "(Ljava/lang/String;JLzendesk/android/events/ConversationWithAgentRequestedDetails;)V", "getId", "()Ljava/lang/String;", "getTimestamp", "()J", "getData", "()Lzendesk/android/events/ConversationWithAgentRequestedDetails;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationWithAgentRequested extends ZendeskEvent {

        @NotNull
        private final ConversationWithAgentRequestedDetails data;

        @NotNull
        private final String id;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InternalZendeskApi
        public ConversationWithAgentRequested(@NotNull String str, long j9, @NotNull ConversationWithAgentRequestedDetails conversationWithAgentRequestedDetails) {
            super(null);
            str.getClass();
            conversationWithAgentRequestedDetails.getClass();
            this.id = str;
            this.timestamp = j9;
            this.data = conversationWithAgentRequestedDetails;
        }

        public static /* synthetic */ ConversationWithAgentRequested copy$default(ConversationWithAgentRequested conversationWithAgentRequested, String str, long j9, ConversationWithAgentRequestedDetails conversationWithAgentRequestedDetails, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = conversationWithAgentRequested.id;
            }
            if ((i11 & 2) != 0) {
                j9 = conversationWithAgentRequested.timestamp;
            }
            if ((i11 & 4) != 0) {
                conversationWithAgentRequestedDetails = conversationWithAgentRequested.data;
            }
            return conversationWithAgentRequested.copy(str, j9, conversationWithAgentRequestedDetails);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ConversationWithAgentRequestedDetails getData() {
            return this.data;
        }

        @NotNull
        public final ConversationWithAgentRequested copy(@NotNull String id2, long timestamp, @NotNull ConversationWithAgentRequestedDetails data) {
            id2.getClass();
            data.getClass();
            return new ConversationWithAgentRequested(id2, timestamp, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationWithAgentRequested)) {
                return false;
            }
            ConversationWithAgentRequested conversationWithAgentRequested = (ConversationWithAgentRequested) other;
            return Intrinsics.areEqual(this.id, conversationWithAgentRequested.id) && this.timestamp == conversationWithAgentRequested.timestamp && Intrinsics.areEqual(this.data, conversationWithAgentRequested.data);
        }

        @NotNull
        public final ConversationWithAgentRequestedDetails getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.data.hashCode() + f.b(this.id.hashCode() * 31, 31, this.timestamp);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            long j9 = this.timestamp;
            ConversationWithAgentRequestedDetails conversationWithAgentRequestedDetails = this.data;
            StringBuilder sbN = i.n(j9, "ConversationWithAgentRequested(id=", str, ", timestamp=");
            sbN.append(", data=");
            sbN.append(conversationWithAgentRequestedDetails);
            sbN.append(")");
            return sbN.toString();
        }

        public /* synthetic */ ConversationWithAgentRequested(String str, long j9, ConversationWithAgentRequestedDetails conversationWithAgentRequestedDetails, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UUID.randomUUID().toString() : str, j9, conversationWithAgentRequestedDetails);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lzendesk/android/events/ZendeskEvent$NewConversationButtonClicked;", "Lzendesk/android/events/ZendeskEvent;", "id", "", "timestamp", "", Bayeux.KEY_DATA, "Lzendesk/android/events/NewConversationButtonClickedDetails;", "<init>", "(Ljava/lang/String;JLzendesk/android/events/NewConversationButtonClickedDetails;)V", "getId", "()Ljava/lang/String;", "getTimestamp", "()J", "getData", "()Lzendesk/android/events/NewConversationButtonClickedDetails;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NewConversationButtonClicked extends ZendeskEvent {

        @NotNull
        private final NewConversationButtonClickedDetails data;

        @NotNull
        private final String id;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InternalZendeskApi
        public NewConversationButtonClicked(@NotNull String str, long j9, @NotNull NewConversationButtonClickedDetails newConversationButtonClickedDetails) {
            super(null);
            str.getClass();
            newConversationButtonClickedDetails.getClass();
            this.id = str;
            this.timestamp = j9;
            this.data = newConversationButtonClickedDetails;
        }

        public static /* synthetic */ NewConversationButtonClicked copy$default(NewConversationButtonClicked newConversationButtonClicked, String str, long j9, NewConversationButtonClickedDetails newConversationButtonClickedDetails, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = newConversationButtonClicked.id;
            }
            if ((i11 & 2) != 0) {
                j9 = newConversationButtonClicked.timestamp;
            }
            if ((i11 & 4) != 0) {
                newConversationButtonClickedDetails = newConversationButtonClicked.data;
            }
            return newConversationButtonClicked.copy(str, j9, newConversationButtonClickedDetails);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final NewConversationButtonClickedDetails getData() {
            return this.data;
        }

        @NotNull
        public final NewConversationButtonClicked copy(@NotNull String id2, long timestamp, @NotNull NewConversationButtonClickedDetails data) {
            id2.getClass();
            data.getClass();
            return new NewConversationButtonClicked(id2, timestamp, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NewConversationButtonClicked)) {
                return false;
            }
            NewConversationButtonClicked newConversationButtonClicked = (NewConversationButtonClicked) other;
            return Intrinsics.areEqual(this.id, newConversationButtonClicked.id) && this.timestamp == newConversationButtonClicked.timestamp && Intrinsics.areEqual(this.data, newConversationButtonClicked.data);
        }

        @NotNull
        public final NewConversationButtonClickedDetails getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.data.hashCode() + f.b(this.id.hashCode() * 31, 31, this.timestamp);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            long j9 = this.timestamp;
            NewConversationButtonClickedDetails newConversationButtonClickedDetails = this.data;
            StringBuilder sbN = i.n(j9, "NewConversationButtonClicked(id=", str, ", timestamp=");
            sbN.append(", data=");
            sbN.append(newConversationButtonClickedDetails);
            sbN.append(")");
            return sbN.toString();
        }

        public /* synthetic */ NewConversationButtonClicked(String str, long j9, NewConversationButtonClickedDetails newConversationButtonClickedDetails, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UUID.randomUUID().toString() : str, j9, newConversationButtonClickedDetails);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lzendesk/android/events/ZendeskEvent$NotificationDisplayed;", "Lzendesk/android/events/ZendeskEvent;", "id", "", "timestamp", "", Bayeux.KEY_DATA, "Lzendesk/android/events/NotificationDisplayedDetails;", "<init>", "(Ljava/lang/String;JLzendesk/android/events/NotificationDisplayedDetails;)V", "getId", "()Ljava/lang/String;", "getTimestamp", "()J", "getData", "()Lzendesk/android/events/NotificationDisplayedDetails;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NotificationDisplayed extends ZendeskEvent {

        @NotNull
        private final NotificationDisplayedDetails data;

        @NotNull
        private final String id;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InternalZendeskApi
        public NotificationDisplayed(@NotNull String str, long j9, @NotNull NotificationDisplayedDetails notificationDisplayedDetails) {
            super(null);
            str.getClass();
            notificationDisplayedDetails.getClass();
            this.id = str;
            this.timestamp = j9;
            this.data = notificationDisplayedDetails;
        }

        public static /* synthetic */ NotificationDisplayed copy$default(NotificationDisplayed notificationDisplayed, String str, long j9, NotificationDisplayedDetails notificationDisplayedDetails, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = notificationDisplayed.id;
            }
            if ((i11 & 2) != 0) {
                j9 = notificationDisplayed.timestamp;
            }
            if ((i11 & 4) != 0) {
                notificationDisplayedDetails = notificationDisplayed.data;
            }
            return notificationDisplayed.copy(str, j9, notificationDisplayedDetails);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final NotificationDisplayedDetails getData() {
            return this.data;
        }

        @NotNull
        public final NotificationDisplayed copy(@NotNull String id2, long timestamp, @NotNull NotificationDisplayedDetails data) {
            id2.getClass();
            data.getClass();
            return new NotificationDisplayed(id2, timestamp, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotificationDisplayed)) {
                return false;
            }
            NotificationDisplayed notificationDisplayed = (NotificationDisplayed) other;
            return Intrinsics.areEqual(this.id, notificationDisplayed.id) && this.timestamp == notificationDisplayed.timestamp && Intrinsics.areEqual(this.data, notificationDisplayed.data);
        }

        @NotNull
        public final NotificationDisplayedDetails getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.data.hashCode() + f.b(this.id.hashCode() * 31, 31, this.timestamp);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            long j9 = this.timestamp;
            NotificationDisplayedDetails notificationDisplayedDetails = this.data;
            StringBuilder sbN = i.n(j9, "NotificationDisplayed(id=", str, ", timestamp=");
            sbN.append(", data=");
            sbN.append(notificationDisplayedDetails);
            sbN.append(")");
            return sbN.toString();
        }

        public /* synthetic */ NotificationDisplayed(String str, long j9, NotificationDisplayedDetails notificationDisplayedDetails, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UUID.randomUUID().toString() : str, j9, notificationDisplayedDetails);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lzendesk/android/events/ZendeskEvent$NotificationOpened;", "Lzendesk/android/events/ZendeskEvent;", "id", "", "timestamp", "", Bayeux.KEY_DATA, "Lzendesk/android/events/NotificationOpenedDetails;", "<init>", "(Ljava/lang/String;JLzendesk/android/events/NotificationOpenedDetails;)V", "getId", "()Ljava/lang/String;", "getTimestamp", "()J", "getData", "()Lzendesk/android/events/NotificationOpenedDetails;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NotificationOpened extends ZendeskEvent {

        @NotNull
        private final NotificationOpenedDetails data;

        @NotNull
        private final String id;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InternalZendeskApi
        public NotificationOpened(@NotNull String str, long j9, @NotNull NotificationOpenedDetails notificationOpenedDetails) {
            super(null);
            str.getClass();
            notificationOpenedDetails.getClass();
            this.id = str;
            this.timestamp = j9;
            this.data = notificationOpenedDetails;
        }

        public static /* synthetic */ NotificationOpened copy$default(NotificationOpened notificationOpened, String str, long j9, NotificationOpenedDetails notificationOpenedDetails, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = notificationOpened.id;
            }
            if ((i11 & 2) != 0) {
                j9 = notificationOpened.timestamp;
            }
            if ((i11 & 4) != 0) {
                notificationOpenedDetails = notificationOpened.data;
            }
            return notificationOpened.copy(str, j9, notificationOpenedDetails);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final NotificationOpenedDetails getData() {
            return this.data;
        }

        @NotNull
        public final NotificationOpened copy(@NotNull String id2, long timestamp, @NotNull NotificationOpenedDetails data) {
            id2.getClass();
            data.getClass();
            return new NotificationOpened(id2, timestamp, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotificationOpened)) {
                return false;
            }
            NotificationOpened notificationOpened = (NotificationOpened) other;
            return Intrinsics.areEqual(this.id, notificationOpened.id) && this.timestamp == notificationOpened.timestamp && Intrinsics.areEqual(this.data, notificationOpened.data);
        }

        @NotNull
        public final NotificationOpenedDetails getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.data.hashCode() + f.b(this.id.hashCode() * 31, 31, this.timestamp);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            long j9 = this.timestamp;
            NotificationOpenedDetails notificationOpenedDetails = this.data;
            StringBuilder sbN = i.n(j9, "NotificationOpened(id=", str, ", timestamp=");
            sbN.append(", data=");
            sbN.append(notificationOpenedDetails);
            sbN.append(")");
            return sbN.toString();
        }

        public /* synthetic */ NotificationOpened(String str, long j9, NotificationOpenedDetails notificationOpenedDetails, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UUID.randomUUID().toString() : str, j9, notificationOpenedDetails);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lzendesk/android/events/ZendeskEvent$PostbackButtonClicked;", "Lzendesk/android/events/ZendeskEvent;", "id", "", "timestamp", "", Bayeux.KEY_DATA, "Lzendesk/android/events/PostbackButtonClickedDetails;", "<init>", "(Ljava/lang/String;JLzendesk/android/events/PostbackButtonClickedDetails;)V", "getId", "()Ljava/lang/String;", "getTimestamp", "()J", "getData", "()Lzendesk/android/events/PostbackButtonClickedDetails;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PostbackButtonClicked extends ZendeskEvent {

        @NotNull
        private final PostbackButtonClickedDetails data;

        @NotNull
        private final String id;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InternalZendeskApi
        public PostbackButtonClicked(@NotNull String str, long j9, @NotNull PostbackButtonClickedDetails postbackButtonClickedDetails) {
            super(null);
            str.getClass();
            postbackButtonClickedDetails.getClass();
            this.id = str;
            this.timestamp = j9;
            this.data = postbackButtonClickedDetails;
        }

        public static /* synthetic */ PostbackButtonClicked copy$default(PostbackButtonClicked postbackButtonClicked, String str, long j9, PostbackButtonClickedDetails postbackButtonClickedDetails, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = postbackButtonClicked.id;
            }
            if ((i11 & 2) != 0) {
                j9 = postbackButtonClicked.timestamp;
            }
            if ((i11 & 4) != 0) {
                postbackButtonClickedDetails = postbackButtonClicked.data;
            }
            return postbackButtonClicked.copy(str, j9, postbackButtonClickedDetails);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final PostbackButtonClickedDetails getData() {
            return this.data;
        }

        @NotNull
        public final PostbackButtonClicked copy(@NotNull String id2, long timestamp, @NotNull PostbackButtonClickedDetails data) {
            id2.getClass();
            data.getClass();
            return new PostbackButtonClicked(id2, timestamp, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PostbackButtonClicked)) {
                return false;
            }
            PostbackButtonClicked postbackButtonClicked = (PostbackButtonClicked) other;
            return Intrinsics.areEqual(this.id, postbackButtonClicked.id) && this.timestamp == postbackButtonClicked.timestamp && Intrinsics.areEqual(this.data, postbackButtonClicked.data);
        }

        @NotNull
        public final PostbackButtonClickedDetails getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.data.hashCode() + f.b(this.id.hashCode() * 31, 31, this.timestamp);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            long j9 = this.timestamp;
            PostbackButtonClickedDetails postbackButtonClickedDetails = this.data;
            StringBuilder sbN = i.n(j9, "PostbackButtonClicked(id=", str, ", timestamp=");
            sbN.append(", data=");
            sbN.append(postbackButtonClickedDetails);
            sbN.append(")");
            return sbN.toString();
        }

        public /* synthetic */ PostbackButtonClicked(String str, long j9, PostbackButtonClickedDetails postbackButtonClickedDetails, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UUID.randomUUID().toString() : str, j9, postbackButtonClickedDetails);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lzendesk/android/events/ZendeskEvent$ProactiveMessageClicked;", "Lzendesk/android/events/ZendeskEvent;", "id", "", "timestamp", "", Bayeux.KEY_DATA, "Lzendesk/android/events/ProactiveMessageClickedDetails;", "<init>", "(Ljava/lang/String;JLzendesk/android/events/ProactiveMessageClickedDetails;)V", "getId", "()Ljava/lang/String;", "getTimestamp", "()J", "getData", "()Lzendesk/android/events/ProactiveMessageClickedDetails;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProactiveMessageClicked extends ZendeskEvent {

        @NotNull
        private final ProactiveMessageClickedDetails data;

        @NotNull
        private final String id;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InternalZendeskApi
        public ProactiveMessageClicked(@NotNull String str, long j9, @NotNull ProactiveMessageClickedDetails proactiveMessageClickedDetails) {
            super(null);
            str.getClass();
            proactiveMessageClickedDetails.getClass();
            this.id = str;
            this.timestamp = j9;
            this.data = proactiveMessageClickedDetails;
        }

        public static /* synthetic */ ProactiveMessageClicked copy$default(ProactiveMessageClicked proactiveMessageClicked, String str, long j9, ProactiveMessageClickedDetails proactiveMessageClickedDetails, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = proactiveMessageClicked.id;
            }
            if ((i11 & 2) != 0) {
                j9 = proactiveMessageClicked.timestamp;
            }
            if ((i11 & 4) != 0) {
                proactiveMessageClickedDetails = proactiveMessageClicked.data;
            }
            return proactiveMessageClicked.copy(str, j9, proactiveMessageClickedDetails);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ProactiveMessageClickedDetails getData() {
            return this.data;
        }

        @NotNull
        public final ProactiveMessageClicked copy(@NotNull String id2, long timestamp, @NotNull ProactiveMessageClickedDetails data) {
            id2.getClass();
            data.getClass();
            return new ProactiveMessageClicked(id2, timestamp, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProactiveMessageClicked)) {
                return false;
            }
            ProactiveMessageClicked proactiveMessageClicked = (ProactiveMessageClicked) other;
            return Intrinsics.areEqual(this.id, proactiveMessageClicked.id) && this.timestamp == proactiveMessageClicked.timestamp && Intrinsics.areEqual(this.data, proactiveMessageClicked.data);
        }

        @NotNull
        public final ProactiveMessageClickedDetails getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.data.hashCode() + f.b(this.id.hashCode() * 31, 31, this.timestamp);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            long j9 = this.timestamp;
            ProactiveMessageClickedDetails proactiveMessageClickedDetails = this.data;
            StringBuilder sbN = i.n(j9, "ProactiveMessageClicked(id=", str, ", timestamp=");
            sbN.append(", data=");
            sbN.append(proactiveMessageClickedDetails);
            sbN.append(")");
            return sbN.toString();
        }

        public /* synthetic */ ProactiveMessageClicked(String str, long j9, ProactiveMessageClickedDetails proactiveMessageClickedDetails, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UUID.randomUUID().toString() : str, j9, proactiveMessageClickedDetails);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lzendesk/android/events/ZendeskEvent$ProactiveMessageDisplayed;", "Lzendesk/android/events/ZendeskEvent;", "id", "", "timestamp", "", Bayeux.KEY_DATA, "Lzendesk/android/events/ProactiveMessageDisplayedDetails;", "<init>", "(Ljava/lang/String;JLzendesk/android/events/ProactiveMessageDisplayedDetails;)V", "getId", "()Ljava/lang/String;", "getTimestamp", "()J", "getData", "()Lzendesk/android/events/ProactiveMessageDisplayedDetails;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProactiveMessageDisplayed extends ZendeskEvent {

        @NotNull
        private final ProactiveMessageDisplayedDetails data;

        @NotNull
        private final String id;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InternalZendeskApi
        public ProactiveMessageDisplayed(@NotNull String str, long j9, @NotNull ProactiveMessageDisplayedDetails proactiveMessageDisplayedDetails) {
            super(null);
            str.getClass();
            proactiveMessageDisplayedDetails.getClass();
            this.id = str;
            this.timestamp = j9;
            this.data = proactiveMessageDisplayedDetails;
        }

        public static /* synthetic */ ProactiveMessageDisplayed copy$default(ProactiveMessageDisplayed proactiveMessageDisplayed, String str, long j9, ProactiveMessageDisplayedDetails proactiveMessageDisplayedDetails, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = proactiveMessageDisplayed.id;
            }
            if ((i11 & 2) != 0) {
                j9 = proactiveMessageDisplayed.timestamp;
            }
            if ((i11 & 4) != 0) {
                proactiveMessageDisplayedDetails = proactiveMessageDisplayed.data;
            }
            return proactiveMessageDisplayed.copy(str, j9, proactiveMessageDisplayedDetails);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ProactiveMessageDisplayedDetails getData() {
            return this.data;
        }

        @NotNull
        public final ProactiveMessageDisplayed copy(@NotNull String id2, long timestamp, @NotNull ProactiveMessageDisplayedDetails data) {
            id2.getClass();
            data.getClass();
            return new ProactiveMessageDisplayed(id2, timestamp, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProactiveMessageDisplayed)) {
                return false;
            }
            ProactiveMessageDisplayed proactiveMessageDisplayed = (ProactiveMessageDisplayed) other;
            return Intrinsics.areEqual(this.id, proactiveMessageDisplayed.id) && this.timestamp == proactiveMessageDisplayed.timestamp && Intrinsics.areEqual(this.data, proactiveMessageDisplayed.data);
        }

        @NotNull
        public final ProactiveMessageDisplayedDetails getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.data.hashCode() + f.b(this.id.hashCode() * 31, 31, this.timestamp);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            long j9 = this.timestamp;
            ProactiveMessageDisplayedDetails proactiveMessageDisplayedDetails = this.data;
            StringBuilder sbN = i.n(j9, "ProactiveMessageDisplayed(id=", str, ", timestamp=");
            sbN.append(", data=");
            sbN.append(proactiveMessageDisplayedDetails);
            sbN.append(")");
            return sbN.toString();
        }

        public /* synthetic */ ProactiveMessageDisplayed(String str, long j9, ProactiveMessageDisplayedDetails proactiveMessageDisplayedDetails, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UUID.randomUUID().toString() : str, j9, proactiveMessageDisplayedDetails);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lzendesk/android/events/ZendeskEvent$MessagesShown;", "Lzendesk/android/events/ZendeskEvent;", "id", "", "conversationId", "timestamp", "", "messages", "", "Lzendesk/android/events/ZendeskMessage;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V", "getId", "()Ljava/lang/String;", "getConversationId", "getTimestamp", "()J", "getMessages", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MessagesShown extends ZendeskEvent {

        @NotNull
        private final String conversationId;

        @NotNull
        private final String id;

        @NotNull
        private final List<ZendeskMessage> messages;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessagesShown(@NotNull String str, @NotNull String str2, long j9, @NotNull List<ZendeskMessage> list) {
            super(null);
            str.getClass();
            str2.getClass();
            list.getClass();
            this.id = str;
            this.conversationId = str2;
            this.timestamp = j9;
            this.messages = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MessagesShown copy$default(MessagesShown messagesShown, String str, String str2, long j9, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = messagesShown.id;
            }
            if ((i11 & 2) != 0) {
                str2 = messagesShown.conversationId;
            }
            if ((i11 & 4) != 0) {
                j9 = messagesShown.timestamp;
            }
            if ((i11 & 8) != 0) {
                list = messagesShown.messages;
            }
            List list2 = list;
            return messagesShown.copy(str, str2, j9, list2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        public final List<ZendeskMessage> component4() {
            return this.messages;
        }

        @NotNull
        public final MessagesShown copy(@NotNull String id2, @NotNull String conversationId, long timestamp, @NotNull List<ZendeskMessage> messages) {
            id2.getClass();
            conversationId.getClass();
            messages.getClass();
            return new MessagesShown(id2, conversationId, timestamp, messages);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessagesShown)) {
                return false;
            }
            MessagesShown messagesShown = (MessagesShown) other;
            return Intrinsics.areEqual(this.id, messagesShown.id) && Intrinsics.areEqual(this.conversationId, messagesShown.conversationId) && this.timestamp == messagesShown.timestamp && Intrinsics.areEqual(this.messages, messagesShown.messages);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final List<ZendeskMessage> getMessages() {
            return this.messages;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.messages.hashCode() + f.b(l1.b(this.id.hashCode() * 31, 31, this.conversationId), 31, this.timestamp);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.conversationId;
            long j9 = this.timestamp;
            List<ZendeskMessage> list = this.messages;
            StringBuilder sbT = f.t("MessagesShown(id=", str, ", conversationId=", str2, ", timestamp=");
            sbT.append(j9);
            sbT.append(", messages=");
            sbT.append(list);
            sbT.append(")");
            return sbT.toString();
        }

        public /* synthetic */ MessagesShown(String str, String str2, long j9, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, j9, list);
        }
    }
}
