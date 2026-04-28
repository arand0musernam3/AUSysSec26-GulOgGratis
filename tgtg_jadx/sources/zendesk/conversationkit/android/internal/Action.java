package zendesk.conversationkit.android.internal;

import com.braze.models.inappmessage.InAppMessageBase;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w.a0;
import zendesk.conversationkit.android.ConnectionStatus;
import zendesk.conversationkit.android.model.ActivityData;
import zendesk.conversationkit.android.model.ActivityEvent;
import zendesk.conversationkit.android.model.ConversationStatus;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.ProactiveMessage;
import zendesk.conversationkit.android.model.User;
import zendesk.conversationkit.android.model.UserMerge;
import zendesk.conversationkit.android.model.VisitType;
import zendesk.conversationkit.android.model.attachments.DownloadAttachmentStatus;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:,\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001,0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[¨\u0006\\"}, d2 = {"Lzendesk/conversationkit/android/internal/Action;", "", "<init>", "()V", "RealtimeConnectionStatusUpdate", "MessageReceived", "LoadMoreMessages", "NetworkConnectionStatusUpdate", "CreateUser", "CheckForPersistedUser", "StartRealtimeConnection", "PauseRealtimeConnection", "RefreshUser", "LoginUser", "LogoutUser", "CreateConversation", "GetConversation", "UpdateConversationMetadata", "RefreshConversation", "PrepareMessage", "SendMessage", "PreparePushToken", "PushCacheIntegrationId", "UpdatePushToken", "SendActivityData", "ActivityEventReceived", "UpdateAppUserLocale", "PersistedUserRetrieve", "ConversationAdded", "ConversationRemoved", "ConversationUpdate", "GetConversations", "GetVisitType", "SetVisitType", "AddProactiveMessage", "GetProactiveMessage", "ClearProactiveMessage", "ProactiveMessageReferral", "UserMergeReceived", "AddConversationFields", "AddConversationTags", "ClearConversationFields", "ClearConversationTags", "SendPostbackAction", "DownloadAttachmentAction", "UpdateDownloadStatusAction", "GetWaitTimeForConversation", "ReAuthenticateSubscriptionAction", "Lzendesk/conversationkit/android/internal/Action$ActivityEventReceived;", "Lzendesk/conversationkit/android/internal/Action$AddConversationFields;", "Lzendesk/conversationkit/android/internal/Action$AddConversationTags;", "Lzendesk/conversationkit/android/internal/Action$AddProactiveMessage;", "Lzendesk/conversationkit/android/internal/Action$CheckForPersistedUser;", "Lzendesk/conversationkit/android/internal/Action$ClearConversationFields;", "Lzendesk/conversationkit/android/internal/Action$ClearConversationTags;", "Lzendesk/conversationkit/android/internal/Action$ClearProactiveMessage;", "Lzendesk/conversationkit/android/internal/Action$ConversationAdded;", "Lzendesk/conversationkit/android/internal/Action$ConversationRemoved;", "Lzendesk/conversationkit/android/internal/Action$ConversationUpdate;", "Lzendesk/conversationkit/android/internal/Action$CreateConversation;", "Lzendesk/conversationkit/android/internal/Action$CreateUser;", "Lzendesk/conversationkit/android/internal/Action$DownloadAttachmentAction;", "Lzendesk/conversationkit/android/internal/Action$GetConversation;", "Lzendesk/conversationkit/android/internal/Action$GetConversations;", "Lzendesk/conversationkit/android/internal/Action$GetProactiveMessage;", "Lzendesk/conversationkit/android/internal/Action$GetVisitType;", "Lzendesk/conversationkit/android/internal/Action$GetWaitTimeForConversation;", "Lzendesk/conversationkit/android/internal/Action$LoadMoreMessages;", "Lzendesk/conversationkit/android/internal/Action$LoginUser;", "Lzendesk/conversationkit/android/internal/Action$LogoutUser;", "Lzendesk/conversationkit/android/internal/Action$MessageReceived;", "Lzendesk/conversationkit/android/internal/Action$NetworkConnectionStatusUpdate;", "Lzendesk/conversationkit/android/internal/Action$PauseRealtimeConnection;", "Lzendesk/conversationkit/android/internal/Action$PersistedUserRetrieve;", "Lzendesk/conversationkit/android/internal/Action$PrepareMessage;", "Lzendesk/conversationkit/android/internal/Action$PreparePushToken;", "Lzendesk/conversationkit/android/internal/Action$ProactiveMessageReferral;", "Lzendesk/conversationkit/android/internal/Action$PushCacheIntegrationId;", "Lzendesk/conversationkit/android/internal/Action$ReAuthenticateSubscriptionAction;", "Lzendesk/conversationkit/android/internal/Action$RealtimeConnectionStatusUpdate;", "Lzendesk/conversationkit/android/internal/Action$RefreshConversation;", "Lzendesk/conversationkit/android/internal/Action$RefreshUser;", "Lzendesk/conversationkit/android/internal/Action$SendActivityData;", "Lzendesk/conversationkit/android/internal/Action$SendMessage;", "Lzendesk/conversationkit/android/internal/Action$SendPostbackAction;", "Lzendesk/conversationkit/android/internal/Action$SetVisitType;", "Lzendesk/conversationkit/android/internal/Action$StartRealtimeConnection;", "Lzendesk/conversationkit/android/internal/Action$UpdateAppUserLocale;", "Lzendesk/conversationkit/android/internal/Action$UpdateConversationMetadata;", "Lzendesk/conversationkit/android/internal/Action$UpdateDownloadStatusAction;", "Lzendesk/conversationkit/android/internal/Action$UpdatePushToken;", "Lzendesk/conversationkit/android/internal/Action$UserMergeReceived;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Action {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$ActivityEventReceived;", "Lzendesk/conversationkit/android/internal/Action;", "activityEvent", "Lzendesk/conversationkit/android/model/ActivityEvent;", "<init>", "(Lzendesk/conversationkit/android/model/ActivityEvent;)V", "getActivityEvent", "()Lzendesk/conversationkit/android/model/ActivityEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActivityEventReceived extends Action {

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
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$AddConversationFields;", "Lzendesk/conversationkit/android/internal/Action;", "fields", "", "", "", "<init>", "(Ljava/util/Map;)V", "getFields", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddConversationFields extends Action {

        @NotNull
        private final Map<String, Object> fields;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddConversationFields(@NotNull Map<String, ? extends Object> map) {
            super(null);
            map.getClass();
            this.fields = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AddConversationFields copy$default(AddConversationFields addConversationFields, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = addConversationFields.fields;
            }
            return addConversationFields.copy(map);
        }

        @NotNull
        public final Map<String, Object> component1() {
            return this.fields;
        }

        @NotNull
        public final AddConversationFields copy(@NotNull Map<String, ? extends Object> fields) {
            fields.getClass();
            return new AddConversationFields(fields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AddConversationFields) && Intrinsics.areEqual(this.fields, ((AddConversationFields) other).fields);
        }

        @NotNull
        public final Map<String, Object> getFields() {
            return this.fields;
        }

        public int hashCode() {
            return this.fields.hashCode();
        }

        @NotNull
        public String toString() {
            return "AddConversationFields(fields=" + this.fields + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$AddConversationTags;", "Lzendesk/conversationkit/android/internal/Action;", "tags", "", "", "<init>", "(Ljava/util/List;)V", "getTags", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddConversationTags extends Action {

        @NotNull
        private final List<String> tags;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddConversationTags(@NotNull List<String> list) {
            super(null);
            list.getClass();
            this.tags = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AddConversationTags copy$default(AddConversationTags addConversationTags, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = addConversationTags.tags;
            }
            return addConversationTags.copy(list);
        }

        @NotNull
        public final List<String> component1() {
            return this.tags;
        }

        @NotNull
        public final AddConversationTags copy(@NotNull List<String> tags) {
            tags.getClass();
            return new AddConversationTags(tags);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AddConversationTags) && Intrinsics.areEqual(this.tags, ((AddConversationTags) other).tags);
        }

        @NotNull
        public final List<String> getTags() {
            return this.tags;
        }

        public int hashCode() {
            return this.tags.hashCode();
        }

        @NotNull
        public String toString() {
            return e0.f.m("AddConversationTags(tags=", ")", this.tags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$AddProactiveMessage;", "Lzendesk/conversationkit/android/internal/Action;", "proactiveMessage", "Lzendesk/conversationkit/android/model/ProactiveMessage;", "<init>", "(Lzendesk/conversationkit/android/model/ProactiveMessage;)V", "getProactiveMessage", "()Lzendesk/conversationkit/android/model/ProactiveMessage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddProactiveMessage extends Action {

        @NotNull
        private final ProactiveMessage proactiveMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddProactiveMessage(@NotNull ProactiveMessage proactiveMessage) {
            super(null);
            proactiveMessage.getClass();
            this.proactiveMessage = proactiveMessage;
        }

        public static /* synthetic */ AddProactiveMessage copy$default(AddProactiveMessage addProactiveMessage, ProactiveMessage proactiveMessage, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                proactiveMessage = addProactiveMessage.proactiveMessage;
            }
            return addProactiveMessage.copy(proactiveMessage);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ProactiveMessage getProactiveMessage() {
            return this.proactiveMessage;
        }

        @NotNull
        public final AddProactiveMessage copy(@NotNull ProactiveMessage proactiveMessage) {
            proactiveMessage.getClass();
            return new AddProactiveMessage(proactiveMessage);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AddProactiveMessage) && Intrinsics.areEqual(this.proactiveMessage, ((AddProactiveMessage) other).proactiveMessage);
        }

        @NotNull
        public final ProactiveMessage getProactiveMessage() {
            return this.proactiveMessage;
        }

        public int hashCode() {
            return this.proactiveMessage.hashCode();
        }

        @NotNull
        public String toString() {
            return "AddProactiveMessage(proactiveMessage=" + this.proactiveMessage + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$CheckForPersistedUser;", "Lzendesk/conversationkit/android/internal/Action;", "<init>", "()V", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckForPersistedUser extends Action {

        @NotNull
        public static final CheckForPersistedUser INSTANCE = new CheckForPersistedUser();

        private CheckForPersistedUser() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$ClearConversationFields;", "Lzendesk/conversationkit/android/internal/Action;", "<init>", "()V", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClearConversationFields extends Action {

        @NotNull
        public static final ClearConversationFields INSTANCE = new ClearConversationFields();

        private ClearConversationFields() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$ClearConversationTags;", "Lzendesk/conversationkit/android/internal/Action;", "<init>", "()V", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClearConversationTags extends Action {

        @NotNull
        public static final ClearConversationTags INSTANCE = new ClearConversationTags();

        private ClearConversationTags() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$ClearProactiveMessage;", "Lzendesk/conversationkit/android/internal/Action;", "proactiveMessageId", "", "<init>", "(I)V", "getProactiveMessageId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ClearProactiveMessage extends Action {
        private final int proactiveMessageId;

        public ClearProactiveMessage(int i11) {
            super(null);
            this.proactiveMessageId = i11;
        }

        public static /* synthetic */ ClearProactiveMessage copy$default(ClearProactiveMessage clearProactiveMessage, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = clearProactiveMessage.proactiveMessageId;
            }
            return clearProactiveMessage.copy(i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getProactiveMessageId() {
            return this.proactiveMessageId;
        }

        @NotNull
        public final ClearProactiveMessage copy(int proactiveMessageId) {
            return new ClearProactiveMessage(proactiveMessageId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ClearProactiveMessage) && this.proactiveMessageId == ((ClearProactiveMessage) other).proactiveMessageId;
        }

        public final int getProactiveMessageId() {
            return this.proactiveMessageId;
        }

        public int hashCode() {
            return Integer.hashCode(this.proactiveMessageId);
        }

        @NotNull
        public String toString() {
            return k.h(this.proactiveMessageId, "ClearProactiveMessage(proactiveMessageId=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$ConversationAdded;", "Lzendesk/conversationkit/android/internal/Action;", "conversationId", "", "<init>", "(Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationAdded extends Action {

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
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$ConversationRemoved;", "Lzendesk/conversationkit/android/internal/Action;", "conversationId", "", "<init>", "(Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationRemoved extends Action {

        @NotNull
        private final String conversationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationRemoved(@NotNull String str) {
            super(null);
            str.getClass();
            this.conversationId = str;
        }

        public static /* synthetic */ ConversationRemoved copy$default(ConversationRemoved conversationRemoved, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = conversationRemoved.conversationId;
            }
            return conversationRemoved.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final ConversationRemoved copy(@NotNull String conversationId) {
            conversationId.getClass();
            return new ConversationRemoved(conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConversationRemoved) && Intrinsics.areEqual(this.conversationId, ((ConversationRemoved) other).conversationId);
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
            return a0.p("ConversationRemoved(conversationId=", this.conversationId, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$ConversationUpdate;", "Lzendesk/conversationkit/android/internal/Action;", "conversationId", "", "status", "Lzendesk/conversationkit/android/model/ConversationStatus;", "metadata", "", "", "<init>", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/ConversationStatus;Ljava/util/Map;)V", "getConversationId", "()Ljava/lang/String;", "getStatus", "()Lzendesk/conversationkit/android/model/ConversationStatus;", "getMetadata", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConversationUpdate extends Action {

        @NotNull
        private final String conversationId;

        @Nullable
        private final Map<String, Object> metadata;

        @NotNull
        private final ConversationStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationUpdate(@NotNull String str, @NotNull ConversationStatus conversationStatus, @Nullable Map<String, ? extends Object> map) {
            super(null);
            str.getClass();
            conversationStatus.getClass();
            this.conversationId = str;
            this.status = conversationStatus;
            this.metadata = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ConversationUpdate copy$default(ConversationUpdate conversationUpdate, String str, ConversationStatus conversationStatus, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = conversationUpdate.conversationId;
            }
            if ((i11 & 2) != 0) {
                conversationStatus = conversationUpdate.status;
            }
            if ((i11 & 4) != 0) {
                map = conversationUpdate.metadata;
            }
            return conversationUpdate.copy(str, conversationStatus, map);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ConversationStatus getStatus() {
            return this.status;
        }

        @Nullable
        public final Map<String, Object> component3() {
            return this.metadata;
        }

        @NotNull
        public final ConversationUpdate copy(@NotNull String conversationId, @NotNull ConversationStatus status, @Nullable Map<String, ? extends Object> metadata) {
            conversationId.getClass();
            status.getClass();
            return new ConversationUpdate(conversationId, status, metadata);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationUpdate)) {
                return false;
            }
            ConversationUpdate conversationUpdate = (ConversationUpdate) other;
            return Intrinsics.areEqual(this.conversationId, conversationUpdate.conversationId) && this.status == conversationUpdate.status && Intrinsics.areEqual(this.metadata, conversationUpdate.metadata);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @Nullable
        public final Map<String, Object> getMetadata() {
            return this.metadata;
        }

        @NotNull
        public final ConversationStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = (this.status.hashCode() + (this.conversationId.hashCode() * 31)) * 31;
            Map<String, Object> map = this.metadata;
            return iHashCode + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            return "ConversationUpdate(conversationId=" + this.conversationId + ", status=" + this.status + ", metadata=" + this.metadata + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$DownloadAttachmentAction;", "Lzendesk/conversationkit/android/internal/Action;", "conversationId", "", InAppMessageBase.MESSAGE, "Lzendesk/conversationkit/android/model/Message;", "<init>", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/Message;)V", "getConversationId", "()Ljava/lang/String;", "getMessage", "()Lzendesk/conversationkit/android/model/Message;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DownloadAttachmentAction extends Action {

        @NotNull
        private final String conversationId;

        @NotNull
        private final Message message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DownloadAttachmentAction(@NotNull String str, @NotNull Message message) {
            super(null);
            str.getClass();
            message.getClass();
            this.conversationId = str;
            this.message = message;
        }

        public static /* synthetic */ DownloadAttachmentAction copy$default(DownloadAttachmentAction downloadAttachmentAction, String str, Message message, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = downloadAttachmentAction.conversationId;
            }
            if ((i11 & 2) != 0) {
                message = downloadAttachmentAction.message;
            }
            return downloadAttachmentAction.copy(str, message);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        @NotNull
        public final DownloadAttachmentAction copy(@NotNull String conversationId, @NotNull Message message) {
            conversationId.getClass();
            message.getClass();
            return new DownloadAttachmentAction(conversationId, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadAttachmentAction)) {
                return false;
            }
            DownloadAttachmentAction downloadAttachmentAction = (DownloadAttachmentAction) other;
            return Intrinsics.areEqual(this.conversationId, downloadAttachmentAction.conversationId) && Intrinsics.areEqual(this.message, downloadAttachmentAction.message);
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
            return this.message.hashCode() + (this.conversationId.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "DownloadAttachmentAction(conversationId=" + this.conversationId + ", message=" + this.message + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$GetConversation;", "Lzendesk/conversationkit/android/internal/Action;", "conversationId", "", "<init>", "(Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GetConversation extends Action {

        @NotNull
        private final String conversationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetConversation(@NotNull String str) {
            super(null);
            str.getClass();
            this.conversationId = str;
        }

        public static /* synthetic */ GetConversation copy$default(GetConversation getConversation, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = getConversation.conversationId;
            }
            return getConversation.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final GetConversation copy(@NotNull String conversationId) {
            conversationId.getClass();
            return new GetConversation(conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetConversation) && Intrinsics.areEqual(this.conversationId, ((GetConversation) other).conversationId);
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
            return a0.p("GetConversation(conversationId=", this.conversationId, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$GetConversations;", "Lzendesk/conversationkit/android/internal/Action;", "offset", "", "fromCache", "", "<init>", "(IZ)V", "getOffset", "()I", "getFromCache", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GetConversations extends Action {
        private final boolean fromCache;
        private final int offset;

        public GetConversations(int i11, boolean z11) {
            super(null);
            this.offset = i11;
            this.fromCache = z11;
        }

        public static /* synthetic */ GetConversations copy$default(GetConversations getConversations, int i11, boolean z11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = getConversations.offset;
            }
            if ((i12 & 2) != 0) {
                z11 = getConversations.fromCache;
            }
            return getConversations.copy(i11, z11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getOffset() {
            return this.offset;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getFromCache() {
            return this.fromCache;
        }

        @NotNull
        public final GetConversations copy(int offset, boolean fromCache) {
            return new GetConversations(offset, fromCache);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetConversations)) {
                return false;
            }
            GetConversations getConversations = (GetConversations) other;
            return this.offset == getConversations.offset && this.fromCache == getConversations.fromCache;
        }

        public final boolean getFromCache() {
            return this.fromCache;
        }

        public final int getOffset() {
            return this.offset;
        }

        public int hashCode() {
            return Boolean.hashCode(this.fromCache) + (Integer.hashCode(this.offset) * 31);
        }

        @NotNull
        public String toString() {
            return "GetConversations(offset=" + this.offset + ", fromCache=" + this.fromCache + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$GetProactiveMessage;", "Lzendesk/conversationkit/android/internal/Action;", "proactiveMessageId", "", "<init>", "(I)V", "getProactiveMessageId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GetProactiveMessage extends Action {
        private final int proactiveMessageId;

        public GetProactiveMessage(int i11) {
            super(null);
            this.proactiveMessageId = i11;
        }

        public static /* synthetic */ GetProactiveMessage copy$default(GetProactiveMessage getProactiveMessage, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = getProactiveMessage.proactiveMessageId;
            }
            return getProactiveMessage.copy(i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getProactiveMessageId() {
            return this.proactiveMessageId;
        }

        @NotNull
        public final GetProactiveMessage copy(int proactiveMessageId) {
            return new GetProactiveMessage(proactiveMessageId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetProactiveMessage) && this.proactiveMessageId == ((GetProactiveMessage) other).proactiveMessageId;
        }

        public final int getProactiveMessageId() {
            return this.proactiveMessageId;
        }

        public int hashCode() {
            return Integer.hashCode(this.proactiveMessageId);
        }

        @NotNull
        public String toString() {
            return k.h(this.proactiveMessageId, "GetProactiveMessage(proactiveMessageId=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$GetVisitType;", "Lzendesk/conversationkit/android/internal/Action;", "<init>", "()V", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GetVisitType extends Action {

        @NotNull
        public static final GetVisitType INSTANCE = new GetVisitType();

        private GetVisitType() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$GetWaitTimeForConversation;", "Lzendesk/conversationkit/android/internal/Action;", "conversationId", "", "<init>", "(Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GetWaitTimeForConversation extends Action {

        @NotNull
        private final String conversationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetWaitTimeForConversation(@NotNull String str) {
            super(null);
            str.getClass();
            this.conversationId = str;
        }

        public static /* synthetic */ GetWaitTimeForConversation copy$default(GetWaitTimeForConversation getWaitTimeForConversation, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = getWaitTimeForConversation.conversationId;
            }
            return getWaitTimeForConversation.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final GetWaitTimeForConversation copy(@NotNull String conversationId) {
            conversationId.getClass();
            return new GetWaitTimeForConversation(conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetWaitTimeForConversation) && Intrinsics.areEqual(this.conversationId, ((GetWaitTimeForConversation) other).conversationId);
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
            return a0.p("GetWaitTimeForConversation(conversationId=", this.conversationId, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$LoadMoreMessages;", "Lzendesk/conversationkit/android/internal/Action;", "conversationId", "", "beforeTimestamp", "", "<init>", "(Ljava/lang/String;D)V", "getConversationId", "()Ljava/lang/String;", "getBeforeTimestamp", "()D", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LoadMoreMessages extends Action {
        private final double beforeTimestamp;

        @NotNull
        private final String conversationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadMoreMessages(@NotNull String str, double d3) {
            super(null);
            str.getClass();
            this.conversationId = str;
            this.beforeTimestamp = d3;
        }

        public static /* synthetic */ LoadMoreMessages copy$default(LoadMoreMessages loadMoreMessages, String str, double d3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = loadMoreMessages.conversationId;
            }
            if ((i11 & 2) != 0) {
                d3 = loadMoreMessages.beforeTimestamp;
            }
            return loadMoreMessages.copy(str, d3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final double getBeforeTimestamp() {
            return this.beforeTimestamp;
        }

        @NotNull
        public final LoadMoreMessages copy(@NotNull String conversationId, double beforeTimestamp) {
            conversationId.getClass();
            return new LoadMoreMessages(conversationId, beforeTimestamp);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadMoreMessages)) {
                return false;
            }
            LoadMoreMessages loadMoreMessages = (LoadMoreMessages) other;
            return Intrinsics.areEqual(this.conversationId, loadMoreMessages.conversationId) && Double.compare(this.beforeTimestamp, loadMoreMessages.beforeTimestamp) == 0;
        }

        public final double getBeforeTimestamp() {
            return this.beforeTimestamp;
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        public int hashCode() {
            return Double.hashCode(this.beforeTimestamp) + (this.conversationId.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "LoadMoreMessages(conversationId=" + this.conversationId + ", beforeTimestamp=" + this.beforeTimestamp + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$LoginUser;", "Lzendesk/conversationkit/android/internal/Action;", "jwt", "", "<init>", "(Ljava/lang/String;)V", "getJwt", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LoginUser extends Action {

        @NotNull
        private final String jwt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoginUser(@NotNull String str) {
            super(null);
            str.getClass();
            this.jwt = str;
        }

        public static /* synthetic */ LoginUser copy$default(LoginUser loginUser, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = loginUser.jwt;
            }
            return loginUser.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getJwt() {
            return this.jwt;
        }

        @NotNull
        public final LoginUser copy(@NotNull String jwt) {
            jwt.getClass();
            return new LoginUser(jwt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoginUser) && Intrinsics.areEqual(this.jwt, ((LoginUser) other).jwt);
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
            return a0.p("LoginUser(jwt=", this.jwt, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$LogoutUser;", "Lzendesk/conversationkit/android/internal/Action;", "<init>", "()V", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LogoutUser extends Action {

        @NotNull
        public static final LogoutUser INSTANCE = new LogoutUser();

        private LogoutUser() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$MessageReceived;", "Lzendesk/conversationkit/android/internal/Action;", "conversationId", "", InAppMessageBase.MESSAGE, "Lzendesk/conversationkit/android/model/Message;", "<init>", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/Message;)V", "getConversationId", "()Ljava/lang/String;", "getMessage", "()Lzendesk/conversationkit/android/model/Message;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MessageReceived extends Action {

        @NotNull
        private final String conversationId;

        @NotNull
        private final Message message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessageReceived(@NotNull String str, @NotNull Message message) {
            super(null);
            str.getClass();
            message.getClass();
            this.conversationId = str;
            this.message = message;
        }

        public static /* synthetic */ MessageReceived copy$default(MessageReceived messageReceived, String str, Message message, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = messageReceived.conversationId;
            }
            if ((i11 & 2) != 0) {
                message = messageReceived.message;
            }
            return messageReceived.copy(str, message);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        @NotNull
        public final MessageReceived copy(@NotNull String conversationId, @NotNull Message message) {
            conversationId.getClass();
            message.getClass();
            return new MessageReceived(conversationId, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageReceived)) {
                return false;
            }
            MessageReceived messageReceived = (MessageReceived) other;
            return Intrinsics.areEqual(this.conversationId, messageReceived.conversationId) && Intrinsics.areEqual(this.message, messageReceived.message);
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
            return this.message.hashCode() + (this.conversationId.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "MessageReceived(conversationId=" + this.conversationId + ", message=" + this.message + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$NetworkConnectionStatusUpdate;", "Lzendesk/conversationkit/android/internal/Action;", "connectionStatus", "Lzendesk/conversationkit/android/ConnectionStatus;", "<init>", "(Lzendesk/conversationkit/android/ConnectionStatus;)V", "getConnectionStatus", "()Lzendesk/conversationkit/android/ConnectionStatus;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NetworkConnectionStatusUpdate extends Action {

        @NotNull
        private final ConnectionStatus connectionStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkConnectionStatusUpdate(@NotNull ConnectionStatus connectionStatus) {
            super(null);
            connectionStatus.getClass();
            this.connectionStatus = connectionStatus;
        }

        public static /* synthetic */ NetworkConnectionStatusUpdate copy$default(NetworkConnectionStatusUpdate networkConnectionStatusUpdate, ConnectionStatus connectionStatus, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                connectionStatus = networkConnectionStatusUpdate.connectionStatus;
            }
            return networkConnectionStatusUpdate.copy(connectionStatus);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ConnectionStatus getConnectionStatus() {
            return this.connectionStatus;
        }

        @NotNull
        public final NetworkConnectionStatusUpdate copy(@NotNull ConnectionStatus connectionStatus) {
            connectionStatus.getClass();
            return new NetworkConnectionStatusUpdate(connectionStatus);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NetworkConnectionStatusUpdate) && this.connectionStatus == ((NetworkConnectionStatusUpdate) other).connectionStatus;
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
            return "NetworkConnectionStatusUpdate(connectionStatus=" + this.connectionStatus + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$PauseRealtimeConnection;", "Lzendesk/conversationkit/android/internal/Action;", "<init>", "()V", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PauseRealtimeConnection extends Action {

        @NotNull
        public static final PauseRealtimeConnection INSTANCE = new PauseRealtimeConnection();

        private PauseRealtimeConnection() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$PersistedUserRetrieve;", "Lzendesk/conversationkit/android/internal/Action;", "user", "Lzendesk/conversationkit/android/model/User;", "<init>", "(Lzendesk/conversationkit/android/model/User;)V", "getUser", "()Lzendesk/conversationkit/android/model/User;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PersistedUserRetrieve extends Action {

        @NotNull
        private final User user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PersistedUserRetrieve(@NotNull User user) {
            super(null);
            user.getClass();
            this.user = user;
        }

        public static /* synthetic */ PersistedUserRetrieve copy$default(PersistedUserRetrieve persistedUserRetrieve, User user, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                user = persistedUserRetrieve.user;
            }
            return persistedUserRetrieve.copy(user);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        @NotNull
        public final PersistedUserRetrieve copy(@NotNull User user) {
            user.getClass();
            return new PersistedUserRetrieve(user);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PersistedUserRetrieve) && Intrinsics.areEqual(this.user, ((PersistedUserRetrieve) other).user);
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
            return "PersistedUserRetrieve(user=" + this.user + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$PrepareMessage;", "Lzendesk/conversationkit/android/internal/Action;", InAppMessageBase.MESSAGE, "Lzendesk/conversationkit/android/model/Message;", "conversationId", "", "<init>", "(Lzendesk/conversationkit/android/model/Message;Ljava/lang/String;)V", "getMessage", "()Lzendesk/conversationkit/android/model/Message;", "getConversationId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrepareMessage extends Action {

        @NotNull
        private final String conversationId;

        @NotNull
        private final Message message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrepareMessage(@NotNull Message message, @NotNull String str) {
            super(null);
            message.getClass();
            str.getClass();
            this.message = message;
            this.conversationId = str;
        }

        public static /* synthetic */ PrepareMessage copy$default(PrepareMessage prepareMessage, Message message, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                message = prepareMessage.message;
            }
            if ((i11 & 2) != 0) {
                str = prepareMessage.conversationId;
            }
            return prepareMessage.copy(message, str);
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
        public final PrepareMessage copy(@NotNull Message message, @NotNull String conversationId) {
            message.getClass();
            conversationId.getClass();
            return new PrepareMessage(message, conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrepareMessage)) {
                return false;
            }
            PrepareMessage prepareMessage = (PrepareMessage) other;
            return Intrinsics.areEqual(this.message, prepareMessage.message) && Intrinsics.areEqual(this.conversationId, prepareMessage.conversationId);
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
            return "PrepareMessage(message=" + this.message + ", conversationId=" + this.conversationId + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$PreparePushToken;", "Lzendesk/conversationkit/android/internal/Action;", "pushToken", "", "<init>", "(Ljava/lang/String;)V", "getPushToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PreparePushToken extends Action {

        @NotNull
        private final String pushToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PreparePushToken(@NotNull String str) {
            super(null);
            str.getClass();
            this.pushToken = str;
        }

        public static /* synthetic */ PreparePushToken copy$default(PreparePushToken preparePushToken, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = preparePushToken.pushToken;
            }
            return preparePushToken.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPushToken() {
            return this.pushToken;
        }

        @NotNull
        public final PreparePushToken copy(@NotNull String pushToken) {
            pushToken.getClass();
            return new PreparePushToken(pushToken);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PreparePushToken) && Intrinsics.areEqual(this.pushToken, ((PreparePushToken) other).pushToken);
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
            return a0.p("PreparePushToken(pushToken=", this.pushToken, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$PushCacheIntegrationId;", "Lzendesk/conversationkit/android/internal/Action;", "integrationId", "", "<init>", "(Ljava/lang/String;)V", "getIntegrationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PushCacheIntegrationId extends Action {

        @NotNull
        private final String integrationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PushCacheIntegrationId(@NotNull String str) {
            super(null);
            str.getClass();
            this.integrationId = str;
        }

        public static /* synthetic */ PushCacheIntegrationId copy$default(PushCacheIntegrationId pushCacheIntegrationId, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = pushCacheIntegrationId.integrationId;
            }
            return pushCacheIntegrationId.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getIntegrationId() {
            return this.integrationId;
        }

        @NotNull
        public final PushCacheIntegrationId copy(@NotNull String integrationId) {
            integrationId.getClass();
            return new PushCacheIntegrationId(integrationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PushCacheIntegrationId) && Intrinsics.areEqual(this.integrationId, ((PushCacheIntegrationId) other).integrationId);
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
            return a0.p("PushCacheIntegrationId(integrationId=", this.integrationId, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$ReAuthenticateSubscriptionAction;", "Lzendesk/conversationkit/android/internal/Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ReAuthenticateSubscriptionAction extends Action {

        @NotNull
        public static final ReAuthenticateSubscriptionAction INSTANCE = new ReAuthenticateSubscriptionAction();

        private ReAuthenticateSubscriptionAction() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof ReAuthenticateSubscriptionAction);
        }

        public int hashCode() {
            return 554769582;
        }

        @NotNull
        public String toString() {
            return "ReAuthenticateSubscriptionAction";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$RealtimeConnectionStatusUpdate;", "Lzendesk/conversationkit/android/internal/Action;", "connectionStatus", "Lzendesk/conversationkit/android/ConnectionStatus;", "<init>", "(Lzendesk/conversationkit/android/ConnectionStatus;)V", "getConnectionStatus", "()Lzendesk/conversationkit/android/ConnectionStatus;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RealtimeConnectionStatusUpdate extends Action {

        @NotNull
        private final ConnectionStatus connectionStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RealtimeConnectionStatusUpdate(@NotNull ConnectionStatus connectionStatus) {
            super(null);
            connectionStatus.getClass();
            this.connectionStatus = connectionStatus;
        }

        public static /* synthetic */ RealtimeConnectionStatusUpdate copy$default(RealtimeConnectionStatusUpdate realtimeConnectionStatusUpdate, ConnectionStatus connectionStatus, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                connectionStatus = realtimeConnectionStatusUpdate.connectionStatus;
            }
            return realtimeConnectionStatusUpdate.copy(connectionStatus);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ConnectionStatus getConnectionStatus() {
            return this.connectionStatus;
        }

        @NotNull
        public final RealtimeConnectionStatusUpdate copy(@NotNull ConnectionStatus connectionStatus) {
            connectionStatus.getClass();
            return new RealtimeConnectionStatusUpdate(connectionStatus);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RealtimeConnectionStatusUpdate) && this.connectionStatus == ((RealtimeConnectionStatusUpdate) other).connectionStatus;
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
            return "RealtimeConnectionStatusUpdate(connectionStatus=" + this.connectionStatus + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$RefreshConversation;", "Lzendesk/conversationkit/android/internal/Action;", "conversationId", "", "<init>", "(Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RefreshConversation extends Action {

        @NotNull
        private final String conversationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefreshConversation(@NotNull String str) {
            super(null);
            str.getClass();
            this.conversationId = str;
        }

        public static /* synthetic */ RefreshConversation copy$default(RefreshConversation refreshConversation, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = refreshConversation.conversationId;
            }
            return refreshConversation.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final RefreshConversation copy(@NotNull String conversationId) {
            conversationId.getClass();
            return new RefreshConversation(conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RefreshConversation) && Intrinsics.areEqual(this.conversationId, ((RefreshConversation) other).conversationId);
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
            return a0.p("RefreshConversation(conversationId=", this.conversationId, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$RefreshUser;", "Lzendesk/conversationkit/android/internal/Action;", "<init>", "()V", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RefreshUser extends Action {

        @NotNull
        public static final RefreshUser INSTANCE = new RefreshUser();

        private RefreshUser() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$SendActivityData;", "Lzendesk/conversationkit/android/internal/Action;", "activityData", "Lzendesk/conversationkit/android/model/ActivityData;", "conversationId", "", "<init>", "(Lzendesk/conversationkit/android/model/ActivityData;Ljava/lang/String;)V", "getActivityData", "()Lzendesk/conversationkit/android/model/ActivityData;", "getConversationId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SendActivityData extends Action {

        @NotNull
        private final ActivityData activityData;

        @NotNull
        private final String conversationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendActivityData(@NotNull ActivityData activityData, @NotNull String str) {
            super(null);
            activityData.getClass();
            str.getClass();
            this.activityData = activityData;
            this.conversationId = str;
        }

        public static /* synthetic */ SendActivityData copy$default(SendActivityData sendActivityData, ActivityData activityData, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                activityData = sendActivityData.activityData;
            }
            if ((i11 & 2) != 0) {
                str = sendActivityData.conversationId;
            }
            return sendActivityData.copy(activityData, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ActivityData getActivityData() {
            return this.activityData;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final SendActivityData copy(@NotNull ActivityData activityData, @NotNull String conversationId) {
            activityData.getClass();
            conversationId.getClass();
            return new SendActivityData(activityData, conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SendActivityData)) {
                return false;
            }
            SendActivityData sendActivityData = (SendActivityData) other;
            return this.activityData == sendActivityData.activityData && Intrinsics.areEqual(this.conversationId, sendActivityData.conversationId);
        }

        @NotNull
        public final ActivityData getActivityData() {
            return this.activityData;
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        public int hashCode() {
            return this.conversationId.hashCode() + (this.activityData.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "SendActivityData(activityData=" + this.activityData + ", conversationId=" + this.conversationId + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$SendMessage;", "Lzendesk/conversationkit/android/internal/Action;", InAppMessageBase.MESSAGE, "Lzendesk/conversationkit/android/model/Message;", "conversationId", "", "<init>", "(Lzendesk/conversationkit/android/model/Message;Ljava/lang/String;)V", "getMessage", "()Lzendesk/conversationkit/android/model/Message;", "getConversationId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SendMessage extends Action {

        @NotNull
        private final String conversationId;

        @NotNull
        private final Message message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendMessage(@NotNull Message message, @NotNull String str) {
            super(null);
            message.getClass();
            str.getClass();
            this.message = message;
            this.conversationId = str;
        }

        public static /* synthetic */ SendMessage copy$default(SendMessage sendMessage, Message message, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                message = sendMessage.message;
            }
            if ((i11 & 2) != 0) {
                str = sendMessage.conversationId;
            }
            return sendMessage.copy(message, str);
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
        public final SendMessage copy(@NotNull Message message, @NotNull String conversationId) {
            message.getClass();
            conversationId.getClass();
            return new SendMessage(message, conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SendMessage)) {
                return false;
            }
            SendMessage sendMessage = (SendMessage) other;
            return Intrinsics.areEqual(this.message, sendMessage.message) && Intrinsics.areEqual(this.conversationId, sendMessage.conversationId);
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
            return "SendMessage(message=" + this.message + ", conversationId=" + this.conversationId + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$SendPostbackAction;", "Lzendesk/conversationkit/android/internal/Action;", "conversationId", "", "actionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "getActionId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SendPostbackAction extends Action {

        @NotNull
        private final String actionId;

        @NotNull
        private final String conversationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendPostbackAction(@NotNull String str, @NotNull String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.conversationId = str;
            this.actionId = str2;
        }

        public static /* synthetic */ SendPostbackAction copy$default(SendPostbackAction sendPostbackAction, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = sendPostbackAction.conversationId;
            }
            if ((i11 & 2) != 0) {
                str2 = sendPostbackAction.actionId;
            }
            return sendPostbackAction.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getActionId() {
            return this.actionId;
        }

        @NotNull
        public final SendPostbackAction copy(@NotNull String conversationId, @NotNull String actionId) {
            conversationId.getClass();
            actionId.getClass();
            return new SendPostbackAction(conversationId, actionId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SendPostbackAction)) {
                return false;
            }
            SendPostbackAction sendPostbackAction = (SendPostbackAction) other;
            return Intrinsics.areEqual(this.conversationId, sendPostbackAction.conversationId) && Intrinsics.areEqual(this.actionId, sendPostbackAction.actionId);
        }

        @NotNull
        public final String getActionId() {
            return this.actionId;
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        public int hashCode() {
            return this.actionId.hashCode() + (this.conversationId.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return org.bouncycastle.jcajce.provider.asymmetric.a.d("SendPostbackAction(conversationId=", this.conversationId, ", actionId=", this.actionId, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$SetVisitType;", "Lzendesk/conversationkit/android/internal/Action;", "visitType", "Lzendesk/conversationkit/android/model/VisitType;", "<init>", "(Lzendesk/conversationkit/android/model/VisitType;)V", "getVisitType", "()Lzendesk/conversationkit/android/model/VisitType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SetVisitType extends Action {

        @NotNull
        private final VisitType visitType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetVisitType(@NotNull VisitType visitType) {
            super(null);
            visitType.getClass();
            this.visitType = visitType;
        }

        public static /* synthetic */ SetVisitType copy$default(SetVisitType setVisitType, VisitType visitType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                visitType = setVisitType.visitType;
            }
            return setVisitType.copy(visitType);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final VisitType getVisitType() {
            return this.visitType;
        }

        @NotNull
        public final SetVisitType copy(@NotNull VisitType visitType) {
            visitType.getClass();
            return new SetVisitType(visitType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetVisitType) && this.visitType == ((SetVisitType) other).visitType;
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
            return "SetVisitType(visitType=" + this.visitType + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$StartRealtimeConnection;", "Lzendesk/conversationkit/android/internal/Action;", "<init>", "()V", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StartRealtimeConnection extends Action {

        @NotNull
        public static final StartRealtimeConnection INSTANCE = new StartRealtimeConnection();

        private StartRealtimeConnection() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$UpdateAppUserLocale;", "Lzendesk/conversationkit/android/internal/Action;", "deviceLocale", "", "<init>", "(Ljava/lang/String;)V", "getDeviceLocale", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateAppUserLocale extends Action {

        @NotNull
        private final String deviceLocale;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateAppUserLocale(@NotNull String str) {
            super(null);
            str.getClass();
            this.deviceLocale = str;
        }

        public static /* synthetic */ UpdateAppUserLocale copy$default(UpdateAppUserLocale updateAppUserLocale, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = updateAppUserLocale.deviceLocale;
            }
            return updateAppUserLocale.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDeviceLocale() {
            return this.deviceLocale;
        }

        @NotNull
        public final UpdateAppUserLocale copy(@NotNull String deviceLocale) {
            deviceLocale.getClass();
            return new UpdateAppUserLocale(deviceLocale);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateAppUserLocale) && Intrinsics.areEqual(this.deviceLocale, ((UpdateAppUserLocale) other).deviceLocale);
        }

        @NotNull
        public final String getDeviceLocale() {
            return this.deviceLocale;
        }

        public int hashCode() {
            return this.deviceLocale.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("UpdateAppUserLocale(deviceLocale=", this.deviceLocale, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$UpdateConversationMetadata;", "Lzendesk/conversationkit/android/internal/Action;", "metadata", "", "", "", "conversationId", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "getMetadata", "()Ljava/util/Map;", "getConversationId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateConversationMetadata extends Action {

        @NotNull
        private final String conversationId;

        @Nullable
        private final Map<String, Object> metadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateConversationMetadata(@Nullable Map<String, ? extends Object> map, @NotNull String str) {
            super(null);
            str.getClass();
            this.metadata = map;
            this.conversationId = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UpdateConversationMetadata copy$default(UpdateConversationMetadata updateConversationMetadata, Map map, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = updateConversationMetadata.metadata;
            }
            if ((i11 & 2) != 0) {
                str = updateConversationMetadata.conversationId;
            }
            return updateConversationMetadata.copy(map, str);
        }

        @Nullable
        public final Map<String, Object> component1() {
            return this.metadata;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @NotNull
        public final UpdateConversationMetadata copy(@Nullable Map<String, ? extends Object> metadata, @NotNull String conversationId) {
            conversationId.getClass();
            return new UpdateConversationMetadata(metadata, conversationId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateConversationMetadata)) {
                return false;
            }
            UpdateConversationMetadata updateConversationMetadata = (UpdateConversationMetadata) other;
            return Intrinsics.areEqual(this.metadata, updateConversationMetadata.metadata) && Intrinsics.areEqual(this.conversationId, updateConversationMetadata.conversationId);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @Nullable
        public final Map<String, Object> getMetadata() {
            return this.metadata;
        }

        public int hashCode() {
            Map<String, Object> map = this.metadata;
            return this.conversationId.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "UpdateConversationMetadata(metadata=" + this.metadata + ", conversationId=" + this.conversationId + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$UpdateDownloadStatusAction;", "Lzendesk/conversationkit/android/internal/Action;", "status", "Lzendesk/conversationkit/android/model/attachments/DownloadAttachmentStatus;", "<init>", "(Lzendesk/conversationkit/android/model/attachments/DownloadAttachmentStatus;)V", "getStatus", "()Lzendesk/conversationkit/android/model/attachments/DownloadAttachmentStatus;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateDownloadStatusAction extends Action {

        @NotNull
        private final DownloadAttachmentStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateDownloadStatusAction(@NotNull DownloadAttachmentStatus downloadAttachmentStatus) {
            super(null);
            downloadAttachmentStatus.getClass();
            this.status = downloadAttachmentStatus;
        }

        public static /* synthetic */ UpdateDownloadStatusAction copy$default(UpdateDownloadStatusAction updateDownloadStatusAction, DownloadAttachmentStatus downloadAttachmentStatus, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                downloadAttachmentStatus = updateDownloadStatusAction.status;
            }
            return updateDownloadStatusAction.copy(downloadAttachmentStatus);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DownloadAttachmentStatus getStatus() {
            return this.status;
        }

        @NotNull
        public final UpdateDownloadStatusAction copy(@NotNull DownloadAttachmentStatus status) {
            status.getClass();
            return new UpdateDownloadStatusAction(status);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateDownloadStatusAction) && Intrinsics.areEqual(this.status, ((UpdateDownloadStatusAction) other).status);
        }

        @NotNull
        public final DownloadAttachmentStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        @NotNull
        public String toString() {
            return "UpdateDownloadStatusAction(status=" + this.status + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$UpdatePushToken;", "Lzendesk/conversationkit/android/internal/Action;", "pushToken", "", "<init>", "(Ljava/lang/String;)V", "getPushToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdatePushToken extends Action {

        @NotNull
        private final String pushToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdatePushToken(@NotNull String str) {
            super(null);
            str.getClass();
            this.pushToken = str;
        }

        public static /* synthetic */ UpdatePushToken copy$default(UpdatePushToken updatePushToken, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = updatePushToken.pushToken;
            }
            return updatePushToken.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPushToken() {
            return this.pushToken;
        }

        @NotNull
        public final UpdatePushToken copy(@NotNull String pushToken) {
            pushToken.getClass();
            return new UpdatePushToken(pushToken);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdatePushToken) && Intrinsics.areEqual(this.pushToken, ((UpdatePushToken) other).pushToken);
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
            return a0.p("UpdatePushToken(pushToken=", this.pushToken, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$UserMergeReceived;", "Lzendesk/conversationkit/android/internal/Action;", Bayeux.KEY_DATA, "Lzendesk/conversationkit/android/model/UserMerge;", "<init>", "(Lzendesk/conversationkit/android/model/UserMerge;)V", "getData", "()Lzendesk/conversationkit/android/model/UserMerge;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UserMergeReceived extends Action {

        @NotNull
        private final UserMerge data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserMergeReceived(@NotNull UserMerge userMerge) {
            super(null);
            userMerge.getClass();
            this.data = userMerge;
        }

        public static /* synthetic */ UserMergeReceived copy$default(UserMergeReceived userMergeReceived, UserMerge userMerge, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                userMerge = userMergeReceived.data;
            }
            return userMergeReceived.copy(userMerge);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final UserMerge getData() {
            return this.data;
        }

        @NotNull
        public final UserMergeReceived copy(@NotNull UserMerge data) {
            data.getClass();
            return new UserMergeReceived(data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserMergeReceived) && Intrinsics.areEqual(this.data, ((UserMergeReceived) other).data);
        }

        @NotNull
        public final UserMerge getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        @NotNull
        public String toString() {
            return "UserMergeReceived(data=" + this.data + ")";
        }
    }

    public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Action() {
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$CreateConversation;", "Lzendesk/conversationkit/android/internal/Action;", "proactiveMessageId", "", "<init>", "(Ljava/lang/Integer;)V", "getProactiveMessageId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lzendesk/conversationkit/android/internal/Action$CreateConversation;", "equals", "", "other", "", "hashCode", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CreateConversation extends Action {

        @Nullable
        private final Integer proactiveMessageId;

        public /* synthetic */ CreateConversation(Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : num);
        }

        public static /* synthetic */ CreateConversation copy$default(CreateConversation createConversation, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = createConversation.proactiveMessageId;
            }
            return createConversation.copy(num);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getProactiveMessageId() {
            return this.proactiveMessageId;
        }

        @NotNull
        public final CreateConversation copy(@Nullable Integer proactiveMessageId) {
            return new CreateConversation(proactiveMessageId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CreateConversation) && Intrinsics.areEqual(this.proactiveMessageId, ((CreateConversation) other).proactiveMessageId);
        }

        @Nullable
        public final Integer getProactiveMessageId() {
            return this.proactiveMessageId;
        }

        public int hashCode() {
            Integer num = this.proactiveMessageId;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @NotNull
        public String toString() {
            return "CreateConversation(proactiveMessageId=" + this.proactiveMessageId + ")";
        }

        public CreateConversation(@Nullable Integer num) {
            super(null);
            this.proactiveMessageId = num;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CreateConversation() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$CreateUser;", "Lzendesk/conversationkit/android/internal/Action;", "proactiveMessageId", "", "<init>", "(Ljava/lang/Integer;)V", "getProactiveMessageId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lzendesk/conversationkit/android/internal/Action$CreateUser;", "equals", "", "other", "", "hashCode", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CreateUser extends Action {

        @Nullable
        private final Integer proactiveMessageId;

        public /* synthetic */ CreateUser(Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : num);
        }

        public static /* synthetic */ CreateUser copy$default(CreateUser createUser, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = createUser.proactiveMessageId;
            }
            return createUser.copy(num);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getProactiveMessageId() {
            return this.proactiveMessageId;
        }

        @NotNull
        public final CreateUser copy(@Nullable Integer proactiveMessageId) {
            return new CreateUser(proactiveMessageId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CreateUser) && Intrinsics.areEqual(this.proactiveMessageId, ((CreateUser) other).proactiveMessageId);
        }

        @Nullable
        public final Integer getProactiveMessageId() {
            return this.proactiveMessageId;
        }

        public int hashCode() {
            Integer num = this.proactiveMessageId;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @NotNull
        public String toString() {
            return "CreateUser(proactiveMessageId=" + this.proactiveMessageId + ")";
        }

        public CreateUser(@Nullable Integer num) {
            super(null);
            this.proactiveMessageId = num;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CreateUser() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lzendesk/conversationkit/android/internal/Action$ProactiveMessageReferral;", "Lzendesk/conversationkit/android/internal/Action;", "conversationId", "", "proactiveMessageId", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getConversationId", "()Ljava/lang/String;", "getProactiveMessageId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lzendesk/conversationkit/android/internal/Action$ProactiveMessageReferral;", "equals", "", "other", "", "hashCode", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProactiveMessageReferral extends Action {

        @NotNull
        private final String conversationId;

        @Nullable
        private final Integer proactiveMessageId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProactiveMessageReferral(@NotNull String str, @Nullable Integer num) {
            super(null);
            str.getClass();
            this.conversationId = str;
            this.proactiveMessageId = num;
        }

        public static /* synthetic */ ProactiveMessageReferral copy$default(ProactiveMessageReferral proactiveMessageReferral, String str, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = proactiveMessageReferral.conversationId;
            }
            if ((i11 & 2) != 0) {
                num = proactiveMessageReferral.proactiveMessageId;
            }
            return proactiveMessageReferral.copy(str, num);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getProactiveMessageId() {
            return this.proactiveMessageId;
        }

        @NotNull
        public final ProactiveMessageReferral copy(@NotNull String conversationId, @Nullable Integer proactiveMessageId) {
            conversationId.getClass();
            return new ProactiveMessageReferral(conversationId, proactiveMessageId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProactiveMessageReferral)) {
                return false;
            }
            ProactiveMessageReferral proactiveMessageReferral = (ProactiveMessageReferral) other;
            return Intrinsics.areEqual(this.conversationId, proactiveMessageReferral.conversationId) && Intrinsics.areEqual(this.proactiveMessageId, proactiveMessageReferral.proactiveMessageId);
        }

        @NotNull
        public final String getConversationId() {
            return this.conversationId;
        }

        @Nullable
        public final Integer getProactiveMessageId() {
            return this.proactiveMessageId;
        }

        public int hashCode() {
            int iHashCode = this.conversationId.hashCode() * 31;
            Integer num = this.proactiveMessageId;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            return "ProactiveMessageReferral(conversationId=" + this.conversationId + ", proactiveMessageId=" + this.proactiveMessageId + ")";
        }

        public /* synthetic */ ProactiveMessageReferral(String str, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : num);
        }
    }
}
