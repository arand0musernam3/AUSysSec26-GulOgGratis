package zendesk.conversationkit.android.internal;

import com.braze.models.inappmessage.InAppMessageBase;
import j4.s;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w.a0;
import w2.l1;
import zendesk.conversationkit.android.ConnectionStatus;
import zendesk.conversationkit.android.ConversationKitResult;
import zendesk.conversationkit.android.model.ActivityEvent;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.ConversationsPagination;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.ProactiveMessage;
import zendesk.conversationkit.android.model.User;
import zendesk.conversationkit.android.model.VisitType;
import zendesk.conversationkit.android.model.WaitTimeData;
import zendesk.faye.internal.Bayeux;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:$\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001#()*+,-./0123456789:;<=>?@ABCDEFGHIJ¨\u0006K"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect;", "", "<init>", "()V", "None", "IncorrectAccessLevel", "UserAccessRevoked", "ConnectionChanged", "NetworkConnectionChanged", "RealtimeConnectionChanged", "CreateUserResult", "LoginUserResult", "AlreadyLoggedInResult", "LogoutUserResult", "CheckForPersistedUserResult", "RefreshUserResult", "CreateConversationResult", "GetConversationResult", "ProactiveMessageReferral", "RefreshConversationResult", "MessageReceived", "LoadMoreMessages", "MessagePrepared", "SendMessageResult", "PushTokenPrepared", "IntegrationIdCached", "PushTokenUpdateResult", "ActivityEventReceived", "PersistedUserReceived", "GetVisitType", "GetProactiveMessage", "ReAuthenticateUser", "ConversationAddedResult", "ConversationRemovedResult", "ConversationUpdatedResult", "GetConversationsResult", "SendPostbackResult", "AttachmentDownloadStarted", "OpenAttachmentFromFile", "FetchWaitTimeResult", "Lzendesk/conversationkit/android/internal/Effect$ActivityEventReceived;", "Lzendesk/conversationkit/android/internal/Effect$AlreadyLoggedInResult;", "Lzendesk/conversationkit/android/internal/Effect$AttachmentDownloadStarted;", "Lzendesk/conversationkit/android/internal/Effect$CheckForPersistedUserResult;", "Lzendesk/conversationkit/android/internal/Effect$ConversationAddedResult;", "Lzendesk/conversationkit/android/internal/Effect$ConversationRemovedResult;", "Lzendesk/conversationkit/android/internal/Effect$ConversationUpdatedResult;", "Lzendesk/conversationkit/android/internal/Effect$CreateConversationResult;", "Lzendesk/conversationkit/android/internal/Effect$CreateUserResult;", "Lzendesk/conversationkit/android/internal/Effect$FetchWaitTimeResult;", "Lzendesk/conversationkit/android/internal/Effect$GetConversationResult;", "Lzendesk/conversationkit/android/internal/Effect$GetConversationsResult;", "Lzendesk/conversationkit/android/internal/Effect$GetProactiveMessage;", "Lzendesk/conversationkit/android/internal/Effect$GetVisitType;", "Lzendesk/conversationkit/android/internal/Effect$IncorrectAccessLevel;", "Lzendesk/conversationkit/android/internal/Effect$IntegrationIdCached;", "Lzendesk/conversationkit/android/internal/Effect$LoadMoreMessages;", "Lzendesk/conversationkit/android/internal/Effect$LoginUserResult;", "Lzendesk/conversationkit/android/internal/Effect$LogoutUserResult;", "Lzendesk/conversationkit/android/internal/Effect$MessagePrepared;", "Lzendesk/conversationkit/android/internal/Effect$MessageReceived;", "Lzendesk/conversationkit/android/internal/Effect$NetworkConnectionChanged;", "Lzendesk/conversationkit/android/internal/Effect$None;", "Lzendesk/conversationkit/android/internal/Effect$OpenAttachmentFromFile;", "Lzendesk/conversationkit/android/internal/Effect$PersistedUserReceived;", "Lzendesk/conversationkit/android/internal/Effect$ProactiveMessageReferral;", "Lzendesk/conversationkit/android/internal/Effect$PushTokenPrepared;", "Lzendesk/conversationkit/android/internal/Effect$PushTokenUpdateResult;", "Lzendesk/conversationkit/android/internal/Effect$ReAuthenticateUser;", "Lzendesk/conversationkit/android/internal/Effect$RealtimeConnectionChanged;", "Lzendesk/conversationkit/android/internal/Effect$RefreshConversationResult;", "Lzendesk/conversationkit/android/internal/Effect$RefreshUserResult;", "Lzendesk/conversationkit/android/internal/Effect$SendMessageResult;", "Lzendesk/conversationkit/android/internal/Effect$SendPostbackResult;", "Lzendesk/conversationkit/android/internal/Effect$UserAccessRevoked;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Effect {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$ActivityEventReceived;", "Lzendesk/conversationkit/android/internal/Effect;", "activityEvent", "Lzendesk/conversationkit/android/model/ActivityEvent;", MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "Lzendesk/conversationkit/android/model/Conversation;", "<init>", "(Lzendesk/conversationkit/android/model/ActivityEvent;Lzendesk/conversationkit/android/model/Conversation;)V", "getActivityEvent", "()Lzendesk/conversationkit/android/model/ActivityEvent;", "getConversation", "()Lzendesk/conversationkit/android/model/Conversation;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActivityEventReceived extends Effect {

        @NotNull
        private final ActivityEvent activityEvent;

        @Nullable
        private final Conversation conversation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityEventReceived(@NotNull ActivityEvent activityEvent, @Nullable Conversation conversation) {
            super(null);
            activityEvent.getClass();
            this.activityEvent = activityEvent;
            this.conversation = conversation;
        }

        public static /* synthetic */ ActivityEventReceived copy$default(ActivityEventReceived activityEventReceived, ActivityEvent activityEvent, Conversation conversation, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                activityEvent = activityEventReceived.activityEvent;
            }
            if ((i11 & 2) != 0) {
                conversation = activityEventReceived.conversation;
            }
            return activityEventReceived.copy(activityEvent, conversation);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ActivityEvent getActivityEvent() {
            return this.activityEvent;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Conversation getConversation() {
            return this.conversation;
        }

        @NotNull
        public final ActivityEventReceived copy(@NotNull ActivityEvent activityEvent, @Nullable Conversation conversation) {
            activityEvent.getClass();
            return new ActivityEventReceived(activityEvent, conversation);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActivityEventReceived)) {
                return false;
            }
            ActivityEventReceived activityEventReceived = (ActivityEventReceived) other;
            return Intrinsics.areEqual(this.activityEvent, activityEventReceived.activityEvent) && Intrinsics.areEqual(this.conversation, activityEventReceived.conversation);
        }

        @NotNull
        public final ActivityEvent getActivityEvent() {
            return this.activityEvent;
        }

        @Nullable
        public final Conversation getConversation() {
            return this.conversation;
        }

        public int hashCode() {
            int iHashCode = this.activityEvent.hashCode() * 31;
            Conversation conversation = this.conversation;
            return iHashCode + (conversation == null ? 0 : conversation.hashCode());
        }

        @NotNull
        public String toString() {
            return "ActivityEventReceived(activityEvent=" + this.activityEvent + ", conversation=" + this.conversation + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$AlreadyLoggedInResult;", "Lzendesk/conversationkit/android/internal/Effect;", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "Lzendesk/conversationkit/android/model/User;", "<init>", "(Lzendesk/conversationkit/android/ConversationKitResult;)V", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AlreadyLoggedInResult extends Effect {

        @NotNull
        private final ConversationKitResult<User> result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlreadyLoggedInResult(@NotNull ConversationKitResult<User> conversationKitResult) {
            super(null);
            conversationKitResult.getClass();
            this.result = conversationKitResult;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AlreadyLoggedInResult copy$default(AlreadyLoggedInResult alreadyLoggedInResult, ConversationKitResult conversationKitResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversationKitResult = alreadyLoggedInResult.result;
            }
            return alreadyLoggedInResult.copy(conversationKitResult);
        }

        @NotNull
        public final ConversationKitResult<User> component1() {
            return this.result;
        }

        @NotNull
        public final AlreadyLoggedInResult copy(@NotNull ConversationKitResult<User> result) {
            result.getClass();
            return new AlreadyLoggedInResult(result);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AlreadyLoggedInResult) && Intrinsics.areEqual(this.result, ((AlreadyLoggedInResult) other).result);
        }

        @NotNull
        public final ConversationKitResult<User> getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        @NotNull
        public String toString() {
            return "AlreadyLoggedInResult(result=" + this.result + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$AttachmentDownloadStarted;", "Lzendesk/conversationkit/android/internal/Effect;", MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "Lzendesk/conversationkit/android/model/Conversation;", "<init>", "(Lzendesk/conversationkit/android/model/Conversation;)V", "getConversation", "()Lzendesk/conversationkit/android/model/Conversation;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AttachmentDownloadStarted extends Effect {

        @NotNull
        private final Conversation conversation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AttachmentDownloadStarted(@NotNull Conversation conversation) {
            super(null);
            conversation.getClass();
            this.conversation = conversation;
        }

        public static /* synthetic */ AttachmentDownloadStarted copy$default(AttachmentDownloadStarted attachmentDownloadStarted, Conversation conversation, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversation = attachmentDownloadStarted.conversation;
            }
            return attachmentDownloadStarted.copy(conversation);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Conversation getConversation() {
            return this.conversation;
        }

        @NotNull
        public final AttachmentDownloadStarted copy(@NotNull Conversation conversation) {
            conversation.getClass();
            return new AttachmentDownloadStarted(conversation);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AttachmentDownloadStarted) && Intrinsics.areEqual(this.conversation, ((AttachmentDownloadStarted) other).conversation);
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
            return "AttachmentDownloadStarted(conversation=" + this.conversation + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$CheckForPersistedUserResult;", "Lzendesk/conversationkit/android/internal/Effect;", "user", "Lzendesk/conversationkit/android/model/User;", "result", "Lzendesk/conversationkit/android/ConversationKitResult$Success;", "", Bayeux.KEY_CLIENT_ID, "", "<init>", "(Lzendesk/conversationkit/android/model/User;Lzendesk/conversationkit/android/ConversationKitResult$Success;Ljava/lang/String;)V", "getUser", "()Lzendesk/conversationkit/android/model/User;", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult$Success;", "getClientId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckForPersistedUserResult extends Effect {

        @NotNull
        private final String clientId;

        @NotNull
        private final ConversationKitResult.Success<Unit> result;

        @Nullable
        private final User user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CheckForPersistedUserResult(@Nullable User user, @NotNull ConversationKitResult.Success<Unit> success, @NotNull String str) {
            super(null);
            success.getClass();
            str.getClass();
            this.user = user;
            this.result = success;
            this.clientId = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CheckForPersistedUserResult copy$default(CheckForPersistedUserResult checkForPersistedUserResult, User user, ConversationKitResult.Success success, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                user = checkForPersistedUserResult.user;
            }
            if ((i11 & 2) != 0) {
                success = checkForPersistedUserResult.result;
            }
            if ((i11 & 4) != 0) {
                str = checkForPersistedUserResult.clientId;
            }
            return checkForPersistedUserResult.copy(user, success, str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        @NotNull
        public final ConversationKitResult.Success<Unit> component2() {
            return this.result;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getClientId() {
            return this.clientId;
        }

        @NotNull
        public final CheckForPersistedUserResult copy(@Nullable User user, @NotNull ConversationKitResult.Success<Unit> result, @NotNull String clientId) {
            result.getClass();
            clientId.getClass();
            return new CheckForPersistedUserResult(user, result, clientId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckForPersistedUserResult)) {
                return false;
            }
            CheckForPersistedUserResult checkForPersistedUserResult = (CheckForPersistedUserResult) other;
            return Intrinsics.areEqual(this.user, checkForPersistedUserResult.user) && Intrinsics.areEqual(this.result, checkForPersistedUserResult.result) && Intrinsics.areEqual(this.clientId, checkForPersistedUserResult.clientId);
        }

        @NotNull
        public final String getClientId() {
            return this.clientId;
        }

        @NotNull
        public final ConversationKitResult.Success<Unit> getResult() {
            return this.result;
        }

        @Nullable
        public final User getUser() {
            return this.user;
        }

        public int hashCode() {
            User user = this.user;
            return this.clientId.hashCode() + ((this.result.hashCode() + ((user == null ? 0 : user.hashCode()) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            User user = this.user;
            ConversationKitResult.Success<Unit> success = this.result;
            String str = this.clientId;
            StringBuilder sb2 = new StringBuilder("CheckForPersistedUserResult(user=");
            sb2.append(user);
            sb2.append(", result=");
            sb2.append(success);
            sb2.append(", clientId=");
            return k.p(sb2, str, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$ConnectionChanged;", "", "connectionStatus", "Lzendesk/conversationkit/android/ConnectionStatus;", "getConnectionStatus", "()Lzendesk/conversationkit/android/ConnectionStatus;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ConnectionChanged {
        @NotNull
        ConnectionStatus getConnectionStatus();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$ConversationAddedResult;", "Lzendesk/conversationkit/android/internal/Effect;", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "Lzendesk/conversationkit/android/model/Conversation;", "<init>", "(Lzendesk/conversationkit/android/ConversationKitResult;)V", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationAddedResult extends Effect {

        @NotNull
        private final ConversationKitResult<Conversation> result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationAddedResult(@NotNull ConversationKitResult<Conversation> conversationKitResult) {
            super(null);
            conversationKitResult.getClass();
            this.result = conversationKitResult;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ConversationAddedResult copy$default(ConversationAddedResult conversationAddedResult, ConversationKitResult conversationKitResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversationKitResult = conversationAddedResult.result;
            }
            return conversationAddedResult.copy(conversationKitResult);
        }

        @NotNull
        public final ConversationKitResult<Conversation> component1() {
            return this.result;
        }

        @NotNull
        public final ConversationAddedResult copy(@NotNull ConversationKitResult<Conversation> result) {
            result.getClass();
            return new ConversationAddedResult(result);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConversationAddedResult) && Intrinsics.areEqual(this.result, ((ConversationAddedResult) other).result);
        }

        @NotNull
        public final ConversationKitResult<Conversation> getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        @NotNull
        public String toString() {
            return "ConversationAddedResult(result=" + this.result + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$ConversationRemovedResult;", "Lzendesk/conversationkit/android/internal/Effect;", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "", "<init>", "(Lzendesk/conversationkit/android/ConversationKitResult;)V", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationRemovedResult extends Effect {

        @NotNull
        private final ConversationKitResult<String> result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationRemovedResult(@NotNull ConversationKitResult<String> conversationKitResult) {
            super(null);
            conversationKitResult.getClass();
            this.result = conversationKitResult;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ConversationRemovedResult copy$default(ConversationRemovedResult conversationRemovedResult, ConversationKitResult conversationKitResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversationKitResult = conversationRemovedResult.result;
            }
            return conversationRemovedResult.copy(conversationKitResult);
        }

        @NotNull
        public final ConversationKitResult<String> component1() {
            return this.result;
        }

        @NotNull
        public final ConversationRemovedResult copy(@NotNull ConversationKitResult<String> result) {
            result.getClass();
            return new ConversationRemovedResult(result);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConversationRemovedResult) && Intrinsics.areEqual(this.result, ((ConversationRemovedResult) other).result);
        }

        @NotNull
        public final ConversationKitResult<String> getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        @NotNull
        public String toString() {
            return "ConversationRemovedResult(result=" + this.result + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$ConversationUpdatedResult;", "Lzendesk/conversationkit/android/internal/Effect;", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "Lzendesk/conversationkit/android/model/Conversation;", "<init>", "(Lzendesk/conversationkit/android/ConversationKitResult;)V", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationUpdatedResult extends Effect {

        @NotNull
        private final ConversationKitResult<Conversation> result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationUpdatedResult(@NotNull ConversationKitResult<Conversation> conversationKitResult) {
            super(null);
            conversationKitResult.getClass();
            this.result = conversationKitResult;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ConversationUpdatedResult copy$default(ConversationUpdatedResult conversationUpdatedResult, ConversationKitResult conversationKitResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversationKitResult = conversationUpdatedResult.result;
            }
            return conversationUpdatedResult.copy(conversationKitResult);
        }

        @NotNull
        public final ConversationKitResult<Conversation> component1() {
            return this.result;
        }

        @NotNull
        public final ConversationUpdatedResult copy(@NotNull ConversationKitResult<Conversation> result) {
            result.getClass();
            return new ConversationUpdatedResult(result);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConversationUpdatedResult) && Intrinsics.areEqual(this.result, ((ConversationUpdatedResult) other).result);
        }

        @NotNull
        public final ConversationKitResult<Conversation> getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        @NotNull
        public String toString() {
            return "ConversationUpdatedResult(result=" + this.result + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$CreateConversationResult;", "Lzendesk/conversationkit/android/internal/Effect;", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "Lzendesk/conversationkit/android/model/Conversation;", "user", "Lzendesk/conversationkit/android/model/User;", "<init>", "(Lzendesk/conversationkit/android/ConversationKitResult;Lzendesk/conversationkit/android/model/User;)V", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "getUser", "()Lzendesk/conversationkit/android/model/User;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CreateConversationResult extends Effect {

        @NotNull
        private final ConversationKitResult<Conversation> result;

        @NotNull
        private final User user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreateConversationResult(@NotNull ConversationKitResult<Conversation> conversationKitResult, @NotNull User user) {
            super(null);
            conversationKitResult.getClass();
            user.getClass();
            this.result = conversationKitResult;
            this.user = user;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CreateConversationResult copy$default(CreateConversationResult createConversationResult, ConversationKitResult conversationKitResult, User user, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversationKitResult = createConversationResult.result;
            }
            if ((i11 & 2) != 0) {
                user = createConversationResult.user;
            }
            return createConversationResult.copy(conversationKitResult, user);
        }

        @NotNull
        public final ConversationKitResult<Conversation> component1() {
            return this.result;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        @NotNull
        public final CreateConversationResult copy(@NotNull ConversationKitResult<Conversation> result, @NotNull User user) {
            result.getClass();
            user.getClass();
            return new CreateConversationResult(result, user);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreateConversationResult)) {
                return false;
            }
            CreateConversationResult createConversationResult = (CreateConversationResult) other;
            return Intrinsics.areEqual(this.result, createConversationResult.result) && Intrinsics.areEqual(this.user, createConversationResult.user);
        }

        @NotNull
        public final ConversationKitResult<Conversation> getResult() {
            return this.result;
        }

        @NotNull
        public final User getUser() {
            return this.user;
        }

        public int hashCode() {
            return this.user.hashCode() + (this.result.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CreateConversationResult(result=" + this.result + ", user=" + this.user + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$FetchWaitTimeResult;", "Lzendesk/conversationkit/android/internal/Effect;", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "Lzendesk/conversationkit/android/model/WaitTimeData;", "<init>", "(Lzendesk/conversationkit/android/ConversationKitResult;)V", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FetchWaitTimeResult extends Effect {

        @NotNull
        private final ConversationKitResult<WaitTimeData> result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchWaitTimeResult(@NotNull ConversationKitResult<WaitTimeData> conversationKitResult) {
            super(null);
            conversationKitResult.getClass();
            this.result = conversationKitResult;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FetchWaitTimeResult copy$default(FetchWaitTimeResult fetchWaitTimeResult, ConversationKitResult conversationKitResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversationKitResult = fetchWaitTimeResult.result;
            }
            return fetchWaitTimeResult.copy(conversationKitResult);
        }

        @NotNull
        public final ConversationKitResult<WaitTimeData> component1() {
            return this.result;
        }

        @NotNull
        public final FetchWaitTimeResult copy(@NotNull ConversationKitResult<WaitTimeData> result) {
            result.getClass();
            return new FetchWaitTimeResult(result);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FetchWaitTimeResult) && Intrinsics.areEqual(this.result, ((FetchWaitTimeResult) other).result);
        }

        @NotNull
        public final ConversationKitResult<WaitTimeData> getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        @NotNull
        public String toString() {
            return "FetchWaitTimeResult(result=" + this.result + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$GetConversationResult;", "Lzendesk/conversationkit/android/internal/Effect;", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "Lzendesk/conversationkit/android/model/Conversation;", "shouldRefresh", "", "<init>", "(Lzendesk/conversationkit/android/ConversationKitResult;Z)V", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "getShouldRefresh", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GetConversationResult extends Effect {

        @NotNull
        private final ConversationKitResult<Conversation> result;
        private final boolean shouldRefresh;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetConversationResult(@NotNull ConversationKitResult<Conversation> conversationKitResult, boolean z11) {
            super(null);
            conversationKitResult.getClass();
            this.result = conversationKitResult;
            this.shouldRefresh = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GetConversationResult copy$default(GetConversationResult getConversationResult, ConversationKitResult conversationKitResult, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversationKitResult = getConversationResult.result;
            }
            if ((i11 & 2) != 0) {
                z11 = getConversationResult.shouldRefresh;
            }
            return getConversationResult.copy(conversationKitResult, z11);
        }

        @NotNull
        public final ConversationKitResult<Conversation> component1() {
            return this.result;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getShouldRefresh() {
            return this.shouldRefresh;
        }

        @NotNull
        public final GetConversationResult copy(@NotNull ConversationKitResult<Conversation> result, boolean shouldRefresh) {
            result.getClass();
            return new GetConversationResult(result, shouldRefresh);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetConversationResult)) {
                return false;
            }
            GetConversationResult getConversationResult = (GetConversationResult) other;
            return Intrinsics.areEqual(this.result, getConversationResult.result) && this.shouldRefresh == getConversationResult.shouldRefresh;
        }

        @NotNull
        public final ConversationKitResult<Conversation> getResult() {
            return this.result;
        }

        public final boolean getShouldRefresh() {
            return this.shouldRefresh;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldRefresh) + (this.result.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "GetConversationResult(result=" + this.result + ", shouldRefresh=" + this.shouldRefresh + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$GetConversationsResult;", "Lzendesk/conversationkit/android/internal/Effect;", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "Lzendesk/conversationkit/android/model/ConversationsPagination;", "<init>", "(Lzendesk/conversationkit/android/ConversationKitResult;)V", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GetConversationsResult extends Effect {

        @NotNull
        private final ConversationKitResult<ConversationsPagination> result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetConversationsResult(@NotNull ConversationKitResult<ConversationsPagination> conversationKitResult) {
            super(null);
            conversationKitResult.getClass();
            this.result = conversationKitResult;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GetConversationsResult copy$default(GetConversationsResult getConversationsResult, ConversationKitResult conversationKitResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversationKitResult = getConversationsResult.result;
            }
            return getConversationsResult.copy(conversationKitResult);
        }

        @NotNull
        public final ConversationKitResult<ConversationsPagination> component1() {
            return this.result;
        }

        @NotNull
        public final GetConversationsResult copy(@NotNull ConversationKitResult<ConversationsPagination> result) {
            result.getClass();
            return new GetConversationsResult(result);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetConversationsResult) && Intrinsics.areEqual(this.result, ((GetConversationsResult) other).result);
        }

        @NotNull
        public final ConversationKitResult<ConversationsPagination> getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        @NotNull
        public String toString() {
            return "GetConversationsResult(result=" + this.result + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$GetProactiveMessage;", "Lzendesk/conversationkit/android/internal/Effect;", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "Lzendesk/conversationkit/android/model/ProactiveMessage;", "<init>", "(Lzendesk/conversationkit/android/ConversationKitResult;)V", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GetProactiveMessage extends Effect {

        @NotNull
        private final ConversationKitResult<ProactiveMessage> result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetProactiveMessage(@NotNull ConversationKitResult<ProactiveMessage> conversationKitResult) {
            super(null);
            conversationKitResult.getClass();
            this.result = conversationKitResult;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GetProactiveMessage copy$default(GetProactiveMessage getProactiveMessage, ConversationKitResult conversationKitResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversationKitResult = getProactiveMessage.result;
            }
            return getProactiveMessage.copy(conversationKitResult);
        }

        @NotNull
        public final ConversationKitResult<ProactiveMessage> component1() {
            return this.result;
        }

        @NotNull
        public final GetProactiveMessage copy(@NotNull ConversationKitResult<ProactiveMessage> result) {
            result.getClass();
            return new GetProactiveMessage(result);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetProactiveMessage) && Intrinsics.areEqual(this.result, ((GetProactiveMessage) other).result);
        }

        @NotNull
        public final ConversationKitResult<ProactiveMessage> getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        @NotNull
        public String toString() {
            return "GetProactiveMessage(result=" + this.result + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$GetVisitType;", "Lzendesk/conversationkit/android/internal/Effect;", "visitType", "Lzendesk/conversationkit/android/model/VisitType;", "<init>", "(Lzendesk/conversationkit/android/model/VisitType;)V", "getVisitType", "()Lzendesk/conversationkit/android/model/VisitType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GetVisitType extends Effect {

        @NotNull
        private final VisitType visitType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetVisitType(@NotNull VisitType visitType) {
            super(null);
            visitType.getClass();
            this.visitType = visitType;
        }

        public static /* synthetic */ GetVisitType copy$default(GetVisitType getVisitType, VisitType visitType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                visitType = getVisitType.visitType;
            }
            return getVisitType.copy(visitType);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final VisitType getVisitType() {
            return this.visitType;
        }

        @NotNull
        public final GetVisitType copy(@NotNull VisitType visitType) {
            visitType.getClass();
            return new GetVisitType(visitType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetVisitType) && this.visitType == ((GetVisitType) other).visitType;
        }

        @NotNull
        public final VisitType getVisitType() {
            return this.visitType;
        }

        public int hashCode() {
            return this.visitType.hashCode();
        }

        @NotNull
        public String toString() {
            return "GetVisitType(visitType=" + this.visitType + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$IncorrectAccessLevel;", "Lzendesk/conversationkit/android/internal/Effect;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IncorrectAccessLevel extends Effect {

        @NotNull
        public static final IncorrectAccessLevel INSTANCE = new IncorrectAccessLevel();

        private IncorrectAccessLevel() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof IncorrectAccessLevel);
        }

        public int hashCode() {
            return 1173239763;
        }

        @NotNull
        public String toString() {
            return "IncorrectAccessLevel";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$IntegrationIdCached;", "Lzendesk/conversationkit/android/internal/Effect;", "integrationId", "", "<init>", "(Ljava/lang/String;)V", "getIntegrationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IntegrationIdCached extends Effect {

        @NotNull
        private final String integrationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IntegrationIdCached(@NotNull String str) {
            super(null);
            str.getClass();
            this.integrationId = str;
        }

        public static /* synthetic */ IntegrationIdCached copy$default(IntegrationIdCached integrationIdCached, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = integrationIdCached.integrationId;
            }
            return integrationIdCached.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getIntegrationId() {
            return this.integrationId;
        }

        @NotNull
        public final IntegrationIdCached copy(@NotNull String integrationId) {
            integrationId.getClass();
            return new IntegrationIdCached(integrationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IntegrationIdCached) && Intrinsics.areEqual(this.integrationId, ((IntegrationIdCached) other).integrationId);
        }

        @NotNull
        public final String getIntegrationId() {
            return this.integrationId;
        }

        public int hashCode() {
            return this.integrationId.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("IntegrationIdCached(integrationId=", this.integrationId, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$LoadMoreMessages;", "Lzendesk/conversationkit/android/internal/Effect;", "conversationId", "", MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "Lzendesk/conversationkit/android/model/Conversation;", "beforeTimestamp", "", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "", "Lzendesk/conversationkit/android/model/Message;", "<init>", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/Conversation;DLzendesk/conversationkit/android/ConversationKitResult;)V", "getConversationId", "()Ljava/lang/String;", "getConversation", "()Lzendesk/conversationkit/android/model/Conversation;", "getBeforeTimestamp", "()D", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LoadMoreMessages extends Effect {
        private final double beforeTimestamp;

        @Nullable
        private final Conversation conversation;

        @NotNull
        private final String conversationId;

        @NotNull
        private final ConversationKitResult<List<Message>> result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LoadMoreMessages(@NotNull String str, @Nullable Conversation conversation, double d3, @NotNull ConversationKitResult<? extends List<Message>> conversationKitResult) {
            super(null);
            str.getClass();
            conversationKitResult.getClass();
            this.conversationId = str;
            this.conversation = conversation;
            this.beforeTimestamp = d3;
            this.result = conversationKitResult;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LoadMoreMessages copy$default(LoadMoreMessages loadMoreMessages, String str, Conversation conversation, double d3, ConversationKitResult conversationKitResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = loadMoreMessages.conversationId;
            }
            if ((i11 & 2) != 0) {
                conversation = loadMoreMessages.conversation;
            }
            if ((i11 & 4) != 0) {
                d3 = loadMoreMessages.beforeTimestamp;
            }
            if ((i11 & 8) != 0) {
                conversationKitResult = loadMoreMessages.result;
            }
            ConversationKitResult conversationKitResult2 = conversationKitResult;
            return loadMoreMessages.copy(str, conversation, d3, conversationKitResult2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Conversation getConversation() {
            return this.conversation;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final double getBeforeTimestamp() {
            return this.beforeTimestamp;
        }

        @NotNull
        public final ConversationKitResult<List<Message>> component4() {
            return this.result;
        }

        @NotNull
        public final LoadMoreMessages copy(@NotNull String conversationId, @Nullable Conversation conversation, double beforeTimestamp, @NotNull ConversationKitResult<? extends List<Message>> result) {
            conversationId.getClass();
            result.getClass();
            return new LoadMoreMessages(conversationId, conversation, beforeTimestamp, result);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadMoreMessages)) {
                return false;
            }
            LoadMoreMessages loadMoreMessages = (LoadMoreMessages) other;
            return Intrinsics.areEqual(this.conversationId, loadMoreMessages.conversationId) && Intrinsics.areEqual(this.conversation, loadMoreMessages.conversation) && Double.compare(this.beforeTimestamp, loadMoreMessages.beforeTimestamp) == 0 && Intrinsics.areEqual(this.result, loadMoreMessages.result);
        }

        public final double getBeforeTimestamp() {
            return this.beforeTimestamp;
        }

        @Nullable
        public final Conversation getConversation() {
            return this.conversation;
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final ConversationKitResult<List<Message>> getResult() {
            return this.result;
        }

        public int hashCode() {
            int iHashCode = this.conversationId.hashCode() * 31;
            Conversation conversation = this.conversation;
            return this.result.hashCode() + s.b(this.beforeTimestamp, (iHashCode + (conversation == null ? 0 : conversation.hashCode())) * 31, 31);
        }

        @NotNull
        public String toString() {
            return "LoadMoreMessages(conversationId=" + this.conversationId + ", conversation=" + this.conversation + ", beforeTimestamp=" + this.beforeTimestamp + ", result=" + this.result + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$LoginUserResult;", "Lzendesk/conversationkit/android/internal/Effect;", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "Lzendesk/conversationkit/android/model/User;", "<init>", "(Lzendesk/conversationkit/android/ConversationKitResult;)V", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LoginUserResult extends Effect {

        @NotNull
        private final ConversationKitResult<User> result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoginUserResult(@NotNull ConversationKitResult<User> conversationKitResult) {
            super(null);
            conversationKitResult.getClass();
            this.result = conversationKitResult;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LoginUserResult copy$default(LoginUserResult loginUserResult, ConversationKitResult conversationKitResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversationKitResult = loginUserResult.result;
            }
            return loginUserResult.copy(conversationKitResult);
        }

        @NotNull
        public final ConversationKitResult<User> component1() {
            return this.result;
        }

        @NotNull
        public final LoginUserResult copy(@NotNull ConversationKitResult<User> result) {
            result.getClass();
            return new LoginUserResult(result);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoginUserResult) && Intrinsics.areEqual(this.result, ((LoginUserResult) other).result);
        }

        @NotNull
        public final ConversationKitResult<User> getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        @NotNull
        public String toString() {
            return "LoginUserResult(result=" + this.result + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$LogoutUserResult;", "Lzendesk/conversationkit/android/internal/Effect;", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "", "<init>", "(Lzendesk/conversationkit/android/ConversationKitResult;)V", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LogoutUserResult extends Effect {

        @NotNull
        private final ConversationKitResult<Object> result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LogoutUserResult(@NotNull ConversationKitResult<? extends Object> conversationKitResult) {
            super(null);
            conversationKitResult.getClass();
            this.result = conversationKitResult;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LogoutUserResult copy$default(LogoutUserResult logoutUserResult, ConversationKitResult conversationKitResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversationKitResult = logoutUserResult.result;
            }
            return logoutUserResult.copy(conversationKitResult);
        }

        @NotNull
        public final ConversationKitResult<Object> component1() {
            return this.result;
        }

        @NotNull
        public final LogoutUserResult copy(@NotNull ConversationKitResult<? extends Object> result) {
            result.getClass();
            return new LogoutUserResult(result);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LogoutUserResult) && Intrinsics.areEqual(this.result, ((LogoutUserResult) other).result);
        }

        @NotNull
        public final ConversationKitResult<Object> getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        @NotNull
        public String toString() {
            return "LogoutUserResult(result=" + this.result + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$MessagePrepared;", "Lzendesk/conversationkit/android/internal/Effect;", InAppMessageBase.MESSAGE, "Lzendesk/conversationkit/android/model/Message;", "conversationId", "", MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "Lzendesk/conversationkit/android/model/Conversation;", "shouldUpdateConversation", "", "metadata", "", "", "<init>", "(Lzendesk/conversationkit/android/model/Message;Ljava/lang/String;Lzendesk/conversationkit/android/model/Conversation;ZLjava/util/Map;)V", "getMessage", "()Lzendesk/conversationkit/android/model/Message;", "getConversationId", "()Ljava/lang/String;", "getConversation", "()Lzendesk/conversationkit/android/model/Conversation;", "getShouldUpdateConversation", "()Z", "getMetadata", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MessagePrepared extends Effect {

        @Nullable
        private final Conversation conversation;

        @NotNull
        private final String conversationId;

        @NotNull
        private final Message message;

        @Nullable
        private final Map<String, Object> metadata;
        private final boolean shouldUpdateConversation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessagePrepared(@NotNull Message message, @NotNull String str, @Nullable Conversation conversation, boolean z11, @Nullable Map<String, ? extends Object> map) {
            super(null);
            message.getClass();
            str.getClass();
            this.message = message;
            this.conversationId = str;
            this.conversation = conversation;
            this.shouldUpdateConversation = z11;
            this.metadata = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MessagePrepared copy$default(MessagePrepared messagePrepared, Message message, String str, Conversation conversation, boolean z11, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                message = messagePrepared.message;
            }
            if ((i11 & 2) != 0) {
                str = messagePrepared.conversationId;
            }
            if ((i11 & 4) != 0) {
                conversation = messagePrepared.conversation;
            }
            if ((i11 & 8) != 0) {
                z11 = messagePrepared.shouldUpdateConversation;
            }
            if ((i11 & 16) != 0) {
                map = messagePrepared.metadata;
            }
            Map map2 = map;
            Conversation conversation2 = conversation;
            return messagePrepared.copy(message, str, conversation2, z11, map2);
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

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Conversation getConversation() {
            return this.conversation;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getShouldUpdateConversation() {
            return this.shouldUpdateConversation;
        }

        @Nullable
        public final Map<String, Object> component5() {
            return this.metadata;
        }

        @NotNull
        public final MessagePrepared copy(@NotNull Message message, @NotNull String conversationId, @Nullable Conversation conversation, boolean shouldUpdateConversation, @Nullable Map<String, ? extends Object> metadata) {
            message.getClass();
            conversationId.getClass();
            return new MessagePrepared(message, conversationId, conversation, shouldUpdateConversation, metadata);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessagePrepared)) {
                return false;
            }
            MessagePrepared messagePrepared = (MessagePrepared) other;
            return Intrinsics.areEqual(this.message, messagePrepared.message) && Intrinsics.areEqual(this.conversationId, messagePrepared.conversationId) && Intrinsics.areEqual(this.conversation, messagePrepared.conversation) && this.shouldUpdateConversation == messagePrepared.shouldUpdateConversation && Intrinsics.areEqual(this.metadata, messagePrepared.metadata);
        }

        @Nullable
        public final Conversation getConversation() {
            return this.conversation;
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final Message getMessage() {
            return this.message;
        }

        @Nullable
        public final Map<String, Object> getMetadata() {
            return this.metadata;
        }

        public final boolean getShouldUpdateConversation() {
            return this.shouldUpdateConversation;
        }

        public int hashCode() {
            int iB = l1.b(this.message.hashCode() * 31, 31, this.conversationId);
            Conversation conversation = this.conversation;
            int iE = k.e((iB + (conversation == null ? 0 : conversation.hashCode())) * 31, 31, this.shouldUpdateConversation);
            Map<String, Object> map = this.metadata;
            return iE + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "MessagePrepared(message=" + this.message + ", conversationId=" + this.conversationId + ", conversation=" + this.conversation + ", shouldUpdateConversation=" + this.shouldUpdateConversation + ", metadata=" + this.metadata + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$NetworkConnectionChanged;", "Lzendesk/conversationkit/android/internal/Effect;", "Lzendesk/conversationkit/android/internal/Effect$ConnectionChanged;", "connectionStatus", "Lzendesk/conversationkit/android/ConnectionStatus;", "<init>", "(Lzendesk/conversationkit/android/ConnectionStatus;)V", "getConnectionStatus", "()Lzendesk/conversationkit/android/ConnectionStatus;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NetworkConnectionChanged extends Effect implements ConnectionChanged {

        @NotNull
        private final ConnectionStatus connectionStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkConnectionChanged(@NotNull ConnectionStatus connectionStatus) {
            super(null);
            connectionStatus.getClass();
            this.connectionStatus = connectionStatus;
        }

        public static /* synthetic */ NetworkConnectionChanged copy$default(NetworkConnectionChanged networkConnectionChanged, ConnectionStatus connectionStatus, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                connectionStatus = networkConnectionChanged.connectionStatus;
            }
            return networkConnectionChanged.copy(connectionStatus);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ConnectionStatus getConnectionStatus() {
            return this.connectionStatus;
        }

        @NotNull
        public final NetworkConnectionChanged copy(@NotNull ConnectionStatus connectionStatus) {
            connectionStatus.getClass();
            return new NetworkConnectionChanged(connectionStatus);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NetworkConnectionChanged) && this.connectionStatus == ((NetworkConnectionChanged) other).connectionStatus;
        }

        @Override // zendesk.conversationkit.android.internal.Effect.ConnectionChanged
        @NotNull
        public ConnectionStatus getConnectionStatus() {
            return this.connectionStatus;
        }

        public int hashCode() {
            return this.connectionStatus.hashCode();
        }

        @NotNull
        public String toString() {
            return "NetworkConnectionChanged(connectionStatus=" + this.connectionStatus + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$None;", "Lzendesk/conversationkit/android/internal/Effect;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class None extends Effect {

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof None);
        }

        public int hashCode() {
            return 767900528;
        }

        @NotNull
        public String toString() {
            return "None";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$OpenAttachmentFromFile;", "Lzendesk/conversationkit/android/internal/Effect;", "file", "Ljava/io/File;", "conversationId", "", "<init>", "(Ljava/io/File;Ljava/lang/String;)V", "getFile", "()Ljava/io/File;", "getConversationId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenAttachmentFromFile extends Effect {

        @NotNull
        private final String conversationId;

        @NotNull
        private final File file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenAttachmentFromFile(@NotNull File file, @NotNull String str) {
            super(null);
            file.getClass();
            str.getClass();
            this.file = file;
            this.conversationId = str;
        }

        public static /* synthetic */ OpenAttachmentFromFile copy$default(OpenAttachmentFromFile openAttachmentFromFile, File file, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                file = openAttachmentFromFile.file;
            }
            if ((i11 & 2) != 0) {
                str = openAttachmentFromFile.conversationId;
            }
            return openAttachmentFromFile.copy(file, str);
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
        public final OpenAttachmentFromFile copy(@NotNull File file, @NotNull String conversationId) {
            file.getClass();
            conversationId.getClass();
            return new OpenAttachmentFromFile(file, conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenAttachmentFromFile)) {
                return false;
            }
            OpenAttachmentFromFile openAttachmentFromFile = (OpenAttachmentFromFile) other;
            return Intrinsics.areEqual(this.file, openAttachmentFromFile.file) && Intrinsics.areEqual(this.conversationId, openAttachmentFromFile.conversationId);
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
            return "OpenAttachmentFromFile(file=" + this.file + ", conversationId=" + this.conversationId + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$PersistedUserReceived;", "Lzendesk/conversationkit/android/internal/Effect;", "user", "Lzendesk/conversationkit/android/model/User;", "<init>", "(Lzendesk/conversationkit/android/model/User;)V", "getUser", "()Lzendesk/conversationkit/android/model/User;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PersistedUserReceived extends Effect {

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
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$ProactiveMessageReferral;", "Lzendesk/conversationkit/android/internal/Effect;", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "Lzendesk/conversationkit/android/model/Conversation;", "shouldRefresh", "", "<init>", "(Lzendesk/conversationkit/android/ConversationKitResult;Z)V", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "getShouldRefresh", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProactiveMessageReferral extends Effect {

        @NotNull
        private final ConversationKitResult<Conversation> result;
        private final boolean shouldRefresh;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProactiveMessageReferral(@NotNull ConversationKitResult<Conversation> conversationKitResult, boolean z11) {
            super(null);
            conversationKitResult.getClass();
            this.result = conversationKitResult;
            this.shouldRefresh = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProactiveMessageReferral copy$default(ProactiveMessageReferral proactiveMessageReferral, ConversationKitResult conversationKitResult, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversationKitResult = proactiveMessageReferral.result;
            }
            if ((i11 & 2) != 0) {
                z11 = proactiveMessageReferral.shouldRefresh;
            }
            return proactiveMessageReferral.copy(conversationKitResult, z11);
        }

        @NotNull
        public final ConversationKitResult<Conversation> component1() {
            return this.result;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getShouldRefresh() {
            return this.shouldRefresh;
        }

        @NotNull
        public final ProactiveMessageReferral copy(@NotNull ConversationKitResult<Conversation> result, boolean shouldRefresh) {
            result.getClass();
            return new ProactiveMessageReferral(result, shouldRefresh);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProactiveMessageReferral)) {
                return false;
            }
            ProactiveMessageReferral proactiveMessageReferral = (ProactiveMessageReferral) other;
            return Intrinsics.areEqual(this.result, proactiveMessageReferral.result) && this.shouldRefresh == proactiveMessageReferral.shouldRefresh;
        }

        @NotNull
        public final ConversationKitResult<Conversation> getResult() {
            return this.result;
        }

        public final boolean getShouldRefresh() {
            return this.shouldRefresh;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldRefresh) + (this.result.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ProactiveMessageReferral(result=" + this.result + ", shouldRefresh=" + this.shouldRefresh + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$PushTokenPrepared;", "Lzendesk/conversationkit/android/internal/Effect;", "pushToken", "", "<init>", "(Ljava/lang/String;)V", "getPushToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PushTokenPrepared extends Effect {

        @NotNull
        private final String pushToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PushTokenPrepared(@NotNull String str) {
            super(null);
            str.getClass();
            this.pushToken = str;
        }

        public static /* synthetic */ PushTokenPrepared copy$default(PushTokenPrepared pushTokenPrepared, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = pushTokenPrepared.pushToken;
            }
            return pushTokenPrepared.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPushToken() {
            return this.pushToken;
        }

        @NotNull
        public final PushTokenPrepared copy(@NotNull String pushToken) {
            pushToken.getClass();
            return new PushTokenPrepared(pushToken);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PushTokenPrepared) && Intrinsics.areEqual(this.pushToken, ((PushTokenPrepared) other).pushToken);
        }

        @NotNull
        public final String getPushToken() {
            return this.pushToken;
        }

        public int hashCode() {
            return this.pushToken.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("PushTokenPrepared(pushToken=", this.pushToken, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$PushTokenUpdateResult;", "Lzendesk/conversationkit/android/internal/Effect;", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "", "pushToken", "", "<init>", "(Lzendesk/conversationkit/android/ConversationKitResult;Ljava/lang/String;)V", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "getPushToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PushTokenUpdateResult extends Effect {

        @NotNull
        private final String pushToken;

        @NotNull
        private final ConversationKitResult<Unit> result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PushTokenUpdateResult(@NotNull ConversationKitResult<Unit> conversationKitResult, @NotNull String str) {
            super(null);
            conversationKitResult.getClass();
            str.getClass();
            this.result = conversationKitResult;
            this.pushToken = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PushTokenUpdateResult copy$default(PushTokenUpdateResult pushTokenUpdateResult, ConversationKitResult conversationKitResult, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversationKitResult = pushTokenUpdateResult.result;
            }
            if ((i11 & 2) != 0) {
                str = pushTokenUpdateResult.pushToken;
            }
            return pushTokenUpdateResult.copy(conversationKitResult, str);
        }

        @NotNull
        public final ConversationKitResult<Unit> component1() {
            return this.result;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPushToken() {
            return this.pushToken;
        }

        @NotNull
        public final PushTokenUpdateResult copy(@NotNull ConversationKitResult<Unit> result, @NotNull String pushToken) {
            result.getClass();
            pushToken.getClass();
            return new PushTokenUpdateResult(result, pushToken);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PushTokenUpdateResult)) {
                return false;
            }
            PushTokenUpdateResult pushTokenUpdateResult = (PushTokenUpdateResult) other;
            return Intrinsics.areEqual(this.result, pushTokenUpdateResult.result) && Intrinsics.areEqual(this.pushToken, pushTokenUpdateResult.pushToken);
        }

        @NotNull
        public final String getPushToken() {
            return this.pushToken;
        }

        @NotNull
        public final ConversationKitResult<Unit> getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.pushToken.hashCode() + (this.result.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PushTokenUpdateResult(result=" + this.result + ", pushToken=" + this.pushToken + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$ReAuthenticateUser;", "Lzendesk/conversationkit/android/internal/Effect;", "jwt", "", "<init>", "(Ljava/lang/String;)V", "getJwt", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ReAuthenticateUser extends Effect {

        @NotNull
        private final String jwt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReAuthenticateUser(@NotNull String str) {
            super(null);
            str.getClass();
            this.jwt = str;
        }

        public static /* synthetic */ ReAuthenticateUser copy$default(ReAuthenticateUser reAuthenticateUser, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = reAuthenticateUser.jwt;
            }
            return reAuthenticateUser.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getJwt() {
            return this.jwt;
        }

        @NotNull
        public final ReAuthenticateUser copy(@NotNull String jwt) {
            jwt.getClass();
            return new ReAuthenticateUser(jwt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ReAuthenticateUser) && Intrinsics.areEqual(this.jwt, ((ReAuthenticateUser) other).jwt);
        }

        @NotNull
        public final String getJwt() {
            return this.jwt;
        }

        public int hashCode() {
            return this.jwt.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("ReAuthenticateUser(jwt=", this.jwt, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$RealtimeConnectionChanged;", "Lzendesk/conversationkit/android/internal/Effect;", "Lzendesk/conversationkit/android/internal/Effect$ConnectionChanged;", "connectionStatus", "Lzendesk/conversationkit/android/ConnectionStatus;", "<init>", "(Lzendesk/conversationkit/android/ConnectionStatus;)V", "getConnectionStatus", "()Lzendesk/conversationkit/android/ConnectionStatus;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RealtimeConnectionChanged extends Effect implements ConnectionChanged {

        @NotNull
        private final ConnectionStatus connectionStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RealtimeConnectionChanged(@NotNull ConnectionStatus connectionStatus) {
            super(null);
            connectionStatus.getClass();
            this.connectionStatus = connectionStatus;
        }

        public static /* synthetic */ RealtimeConnectionChanged copy$default(RealtimeConnectionChanged realtimeConnectionChanged, ConnectionStatus connectionStatus, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                connectionStatus = realtimeConnectionChanged.connectionStatus;
            }
            return realtimeConnectionChanged.copy(connectionStatus);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ConnectionStatus getConnectionStatus() {
            return this.connectionStatus;
        }

        @NotNull
        public final RealtimeConnectionChanged copy(@NotNull ConnectionStatus connectionStatus) {
            connectionStatus.getClass();
            return new RealtimeConnectionChanged(connectionStatus);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RealtimeConnectionChanged) && this.connectionStatus == ((RealtimeConnectionChanged) other).connectionStatus;
        }

        @Override // zendesk.conversationkit.android.internal.Effect.ConnectionChanged
        @NotNull
        public ConnectionStatus getConnectionStatus() {
            return this.connectionStatus;
        }

        public int hashCode() {
            return this.connectionStatus.hashCode();
        }

        @NotNull
        public String toString() {
            return "RealtimeConnectionChanged(connectionStatus=" + this.connectionStatus + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$SendMessageResult;", "Lzendesk/conversationkit/android/internal/Effect;", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "Lzendesk/conversationkit/android/model/Message;", "conversationId", "", InAppMessageBase.MESSAGE, MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "Lzendesk/conversationkit/android/model/Conversation;", "<init>", "(Lzendesk/conversationkit/android/ConversationKitResult;Ljava/lang/String;Lzendesk/conversationkit/android/model/Message;Lzendesk/conversationkit/android/model/Conversation;)V", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "getConversationId", "()Ljava/lang/String;", "getMessage", "()Lzendesk/conversationkit/android/model/Message;", "getConversation", "()Lzendesk/conversationkit/android/model/Conversation;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SendMessageResult extends Effect {

        @Nullable
        private final Conversation conversation;

        @NotNull
        private final String conversationId;

        @Nullable
        private final Message message;

        @NotNull
        private final ConversationKitResult<Message> result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendMessageResult(@NotNull ConversationKitResult<Message> conversationKitResult, @NotNull String str, @Nullable Message message, @Nullable Conversation conversation) {
            super(null);
            conversationKitResult.getClass();
            str.getClass();
            this.result = conversationKitResult;
            this.conversationId = str;
            this.message = message;
            this.conversation = conversation;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SendMessageResult copy$default(SendMessageResult sendMessageResult, ConversationKitResult conversationKitResult, String str, Message message, Conversation conversation, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversationKitResult = sendMessageResult.result;
            }
            if ((i11 & 2) != 0) {
                str = sendMessageResult.conversationId;
            }
            if ((i11 & 4) != 0) {
                message = sendMessageResult.message;
            }
            if ((i11 & 8) != 0) {
                conversation = sendMessageResult.conversation;
            }
            return sendMessageResult.copy(conversationKitResult, str, message, conversation);
        }

        @NotNull
        public final ConversationKitResult<Message> component1() {
            return this.result;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Conversation getConversation() {
            return this.conversation;
        }

        @NotNull
        public final SendMessageResult copy(@NotNull ConversationKitResult<Message> result, @NotNull String conversationId, @Nullable Message message, @Nullable Conversation conversation) {
            result.getClass();
            conversationId.getClass();
            return new SendMessageResult(result, conversationId, message, conversation);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SendMessageResult)) {
                return false;
            }
            SendMessageResult sendMessageResult = (SendMessageResult) other;
            return Intrinsics.areEqual(this.result, sendMessageResult.result) && Intrinsics.areEqual(this.conversationId, sendMessageResult.conversationId) && Intrinsics.areEqual(this.message, sendMessageResult.message) && Intrinsics.areEqual(this.conversation, sendMessageResult.conversation);
        }

        @Nullable
        public final Conversation getConversation() {
            return this.conversation;
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @Nullable
        public final Message getMessage() {
            return this.message;
        }

        @NotNull
        public final ConversationKitResult<Message> getResult() {
            return this.result;
        }

        public int hashCode() {
            int iB = l1.b(this.result.hashCode() * 31, 31, this.conversationId);
            Message message = this.message;
            int iHashCode = (iB + (message == null ? 0 : message.hashCode())) * 31;
            Conversation conversation = this.conversation;
            return iHashCode + (conversation != null ? conversation.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SendMessageResult(result=" + this.result + ", conversationId=" + this.conversationId + ", message=" + this.message + ", conversation=" + this.conversation + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$SendPostbackResult;", "Lzendesk/conversationkit/android/internal/Effect;", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "", "<init>", "(Lzendesk/conversationkit/android/ConversationKitResult;)V", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SendPostbackResult extends Effect {

        @NotNull
        private final ConversationKitResult<String> result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendPostbackResult(@NotNull ConversationKitResult<String> conversationKitResult) {
            super(null);
            conversationKitResult.getClass();
            this.result = conversationKitResult;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SendPostbackResult copy$default(SendPostbackResult sendPostbackResult, ConversationKitResult conversationKitResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversationKitResult = sendPostbackResult.result;
            }
            return sendPostbackResult.copy(conversationKitResult);
        }

        @NotNull
        public final ConversationKitResult<String> component1() {
            return this.result;
        }

        @NotNull
        public final SendPostbackResult copy(@NotNull ConversationKitResult<String> result) {
            result.getClass();
            return new SendPostbackResult(result);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SendPostbackResult) && Intrinsics.areEqual(this.result, ((SendPostbackResult) other).result);
        }

        @NotNull
        public final ConversationKitResult<String> getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        @NotNull
        public String toString() {
            return "SendPostbackResult(result=" + this.result + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$UserAccessRevoked;", "Lzendesk/conversationkit/android/internal/Effect;", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "", "<init>", "(Lzendesk/conversationkit/android/ConversationKitResult;)V", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UserAccessRevoked extends Effect {

        @NotNull
        private final ConversationKitResult<Object> result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserAccessRevoked(@NotNull ConversationKitResult<? extends Object> conversationKitResult) {
            super(null);
            conversationKitResult.getClass();
            this.result = conversationKitResult;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UserAccessRevoked copy$default(UserAccessRevoked userAccessRevoked, ConversationKitResult conversationKitResult, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversationKitResult = userAccessRevoked.result;
            }
            return userAccessRevoked.copy(conversationKitResult);
        }

        @NotNull
        public final ConversationKitResult<Object> component1() {
            return this.result;
        }

        @NotNull
        public final UserAccessRevoked copy(@NotNull ConversationKitResult<? extends Object> result) {
            result.getClass();
            return new UserAccessRevoked(result);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserAccessRevoked) && Intrinsics.areEqual(this.result, ((UserAccessRevoked) other).result);
        }

        @NotNull
        public final ConversationKitResult<Object> getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        @NotNull
        public String toString() {
            return "UserAccessRevoked(result=" + this.result + ")";
        }
    }

    public /* synthetic */ Effect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Effect() {
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$CreateUserResult;", "Lzendesk/conversationkit/android/internal/Effect;", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "Lzendesk/conversationkit/android/model/User;", "pendingPushToken", "", "<init>", "(Lzendesk/conversationkit/android/ConversationKitResult;Ljava/lang/String;)V", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "getPendingPushToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CreateUserResult extends Effect {

        @Nullable
        private final String pendingPushToken;

        @NotNull
        private final ConversationKitResult<User> result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreateUserResult(@NotNull ConversationKitResult<User> conversationKitResult, @Nullable String str) {
            super(null);
            conversationKitResult.getClass();
            this.result = conversationKitResult;
            this.pendingPushToken = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CreateUserResult copy$default(CreateUserResult createUserResult, ConversationKitResult conversationKitResult, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversationKitResult = createUserResult.result;
            }
            if ((i11 & 2) != 0) {
                str = createUserResult.pendingPushToken;
            }
            return createUserResult.copy(conversationKitResult, str);
        }

        @NotNull
        public final ConversationKitResult<User> component1() {
            return this.result;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPendingPushToken() {
            return this.pendingPushToken;
        }

        @NotNull
        public final CreateUserResult copy(@NotNull ConversationKitResult<User> result, @Nullable String pendingPushToken) {
            result.getClass();
            return new CreateUserResult(result, pendingPushToken);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreateUserResult)) {
                return false;
            }
            CreateUserResult createUserResult = (CreateUserResult) other;
            return Intrinsics.areEqual(this.result, createUserResult.result) && Intrinsics.areEqual(this.pendingPushToken, createUserResult.pendingPushToken);
        }

        @Nullable
        public final String getPendingPushToken() {
            return this.pendingPushToken;
        }

        @NotNull
        public final ConversationKitResult<User> getResult() {
            return this.result;
        }

        public int hashCode() {
            int iHashCode = this.result.hashCode() * 31;
            String str = this.pendingPushToken;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "CreateUserResult(result=" + this.result + ", pendingPushToken=" + this.pendingPushToken + ")";
        }

        public /* synthetic */ CreateUserResult(ConversationKitResult conversationKitResult, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(conversationKitResult, (i11 & 2) != 0 ? null : str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$RefreshUserResult;", "Lzendesk/conversationkit/android/internal/Effect;", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "Lzendesk/conversationkit/android/model/User;", "persistedConversation", "Lzendesk/conversationkit/android/model/Conversation;", "<init>", "(Lzendesk/conversationkit/android/ConversationKitResult;Lzendesk/conversationkit/android/model/Conversation;)V", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "getPersistedConversation", "()Lzendesk/conversationkit/android/model/Conversation;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RefreshUserResult extends Effect {

        @Nullable
        private final Conversation persistedConversation;

        @NotNull
        private final ConversationKitResult<User> result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefreshUserResult(@NotNull ConversationKitResult<User> conversationKitResult, @Nullable Conversation conversation) {
            super(null);
            conversationKitResult.getClass();
            this.result = conversationKitResult;
            this.persistedConversation = conversation;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RefreshUserResult copy$default(RefreshUserResult refreshUserResult, ConversationKitResult conversationKitResult, Conversation conversation, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversationKitResult = refreshUserResult.result;
            }
            if ((i11 & 2) != 0) {
                conversation = refreshUserResult.persistedConversation;
            }
            return refreshUserResult.copy(conversationKitResult, conversation);
        }

        @NotNull
        public final ConversationKitResult<User> component1() {
            return this.result;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Conversation getPersistedConversation() {
            return this.persistedConversation;
        }

        @NotNull
        public final RefreshUserResult copy(@NotNull ConversationKitResult<User> result, @Nullable Conversation persistedConversation) {
            result.getClass();
            return new RefreshUserResult(result, persistedConversation);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RefreshUserResult)) {
                return false;
            }
            RefreshUserResult refreshUserResult = (RefreshUserResult) other;
            return Intrinsics.areEqual(this.result, refreshUserResult.result) && Intrinsics.areEqual(this.persistedConversation, refreshUserResult.persistedConversation);
        }

        @Nullable
        public final Conversation getPersistedConversation() {
            return this.persistedConversation;
        }

        @NotNull
        public final ConversationKitResult<User> getResult() {
            return this.result;
        }

        public int hashCode() {
            int iHashCode = this.result.hashCode() * 31;
            Conversation conversation = this.persistedConversation;
            return iHashCode + (conversation == null ? 0 : conversation.hashCode());
        }

        @NotNull
        public String toString() {
            return "RefreshUserResult(result=" + this.result + ", persistedConversation=" + this.persistedConversation + ")";
        }

        public /* synthetic */ RefreshUserResult(ConversationKitResult conversationKitResult, Conversation conversation, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(conversationKitResult, (i11 & 2) != 0 ? null : conversation);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$RefreshConversationResult;", "Lzendesk/conversationkit/android/internal/Effect;", "result", "Lzendesk/conversationkit/android/ConversationKitResult;", "Lzendesk/conversationkit/android/model/Conversation;", "wasServedByAgent", "", "agentFirstMessage", "Lzendesk/conversationkit/android/model/Message;", "<init>", "(Lzendesk/conversationkit/android/ConversationKitResult;ZLzendesk/conversationkit/android/model/Message;)V", "getResult", "()Lzendesk/conversationkit/android/ConversationKitResult;", "getWasServedByAgent", "()Z", "getAgentFirstMessage", "()Lzendesk/conversationkit/android/model/Message;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RefreshConversationResult extends Effect {

        @Nullable
        private final Message agentFirstMessage;

        @NotNull
        private final ConversationKitResult<Conversation> result;
        private final boolean wasServedByAgent;

        public /* synthetic */ RefreshConversationResult(ConversationKitResult conversationKitResult, boolean z11, Message message, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(conversationKitResult, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : message);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RefreshConversationResult copy$default(RefreshConversationResult refreshConversationResult, ConversationKitResult conversationKitResult, boolean z11, Message message, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                conversationKitResult = refreshConversationResult.result;
            }
            if ((i11 & 2) != 0) {
                z11 = refreshConversationResult.wasServedByAgent;
            }
            if ((i11 & 4) != 0) {
                message = refreshConversationResult.agentFirstMessage;
            }
            return refreshConversationResult.copy(conversationKitResult, z11, message);
        }

        @NotNull
        public final ConversationKitResult<Conversation> component1() {
            return this.result;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getWasServedByAgent() {
            return this.wasServedByAgent;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Message getAgentFirstMessage() {
            return this.agentFirstMessage;
        }

        @NotNull
        public final RefreshConversationResult copy(@NotNull ConversationKitResult<Conversation> result, boolean wasServedByAgent, @Nullable Message agentFirstMessage) {
            result.getClass();
            return new RefreshConversationResult(result, wasServedByAgent, agentFirstMessage);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RefreshConversationResult)) {
                return false;
            }
            RefreshConversationResult refreshConversationResult = (RefreshConversationResult) other;
            return Intrinsics.areEqual(this.result, refreshConversationResult.result) && this.wasServedByAgent == refreshConversationResult.wasServedByAgent && Intrinsics.areEqual(this.agentFirstMessage, refreshConversationResult.agentFirstMessage);
        }

        @Nullable
        public final Message getAgentFirstMessage() {
            return this.agentFirstMessage;
        }

        @NotNull
        public final ConversationKitResult<Conversation> getResult() {
            return this.result;
        }

        public final boolean getWasServedByAgent() {
            return this.wasServedByAgent;
        }

        public int hashCode() {
            int iE = k.e(this.result.hashCode() * 31, 31, this.wasServedByAgent);
            Message message = this.agentFirstMessage;
            return iE + (message == null ? 0 : message.hashCode());
        }

        @NotNull
        public String toString() {
            return "RefreshConversationResult(result=" + this.result + ", wasServedByAgent=" + this.wasServedByAgent + ", agentFirstMessage=" + this.agentFirstMessage + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefreshConversationResult(@NotNull ConversationKitResult<Conversation> conversationKitResult, boolean z11, @Nullable Message message) {
            super(null);
            conversationKitResult.getClass();
            this.result = conversationKitResult;
            this.wasServedByAgent = z11;
            this.agentFirstMessage = message;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lzendesk/conversationkit/android/internal/Effect$MessageReceived;", "Lzendesk/conversationkit/android/internal/Effect;", InAppMessageBase.MESSAGE, "Lzendesk/conversationkit/android/model/Message;", "conversationId", "", MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "Lzendesk/conversationkit/android/model/Conversation;", "wasServedByAgent", "", "<init>", "(Lzendesk/conversationkit/android/model/Message;Ljava/lang/String;Lzendesk/conversationkit/android/model/Conversation;Z)V", "getMessage", "()Lzendesk/conversationkit/android/model/Message;", "getConversationId", "()Ljava/lang/String;", "getConversation", "()Lzendesk/conversationkit/android/model/Conversation;", "getWasServedByAgent", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MessageReceived extends Effect {

        @Nullable
        private final Conversation conversation;

        @NotNull
        private final String conversationId;

        @NotNull
        private final Message message;
        private final boolean wasServedByAgent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessageReceived(@NotNull Message message, @NotNull String str, @Nullable Conversation conversation, boolean z11) {
            super(null);
            message.getClass();
            str.getClass();
            this.message = message;
            this.conversationId = str;
            this.conversation = conversation;
            this.wasServedByAgent = z11;
        }

        public static /* synthetic */ MessageReceived copy$default(MessageReceived messageReceived, Message message, String str, Conversation conversation, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                message = messageReceived.message;
            }
            if ((i11 & 2) != 0) {
                str = messageReceived.conversationId;
            }
            if ((i11 & 4) != 0) {
                conversation = messageReceived.conversation;
            }
            if ((i11 & 8) != 0) {
                z11 = messageReceived.wasServedByAgent;
            }
            return messageReceived.copy(message, str, conversation, z11);
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

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Conversation getConversation() {
            return this.conversation;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getWasServedByAgent() {
            return this.wasServedByAgent;
        }

        @NotNull
        public final MessageReceived copy(@NotNull Message message, @NotNull String conversationId, @Nullable Conversation conversation, boolean wasServedByAgent) {
            message.getClass();
            conversationId.getClass();
            return new MessageReceived(message, conversationId, conversation, wasServedByAgent);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageReceived)) {
                return false;
            }
            MessageReceived messageReceived = (MessageReceived) other;
            return Intrinsics.areEqual(this.message, messageReceived.message) && Intrinsics.areEqual(this.conversationId, messageReceived.conversationId) && Intrinsics.areEqual(this.conversation, messageReceived.conversation) && this.wasServedByAgent == messageReceived.wasServedByAgent;
        }

        @Nullable
        public final Conversation getConversation() {
            return this.conversation;
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final Message getMessage() {
            return this.message;
        }

        public final boolean getWasServedByAgent() {
            return this.wasServedByAgent;
        }

        public int hashCode() {
            int iB = l1.b(this.message.hashCode() * 31, 31, this.conversationId);
            Conversation conversation = this.conversation;
            return Boolean.hashCode(this.wasServedByAgent) + ((iB + (conversation == null ? 0 : conversation.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "MessageReceived(message=" + this.message + ", conversationId=" + this.conversationId + ", conversation=" + this.conversation + ", wasServedByAgent=" + this.wasServedByAgent + ")";
        }

        public /* synthetic */ MessageReceived(Message message, String str, Conversation conversation, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(message, str, conversation, (i11 & 8) != 0 ? false : z11);
        }
    }
}
