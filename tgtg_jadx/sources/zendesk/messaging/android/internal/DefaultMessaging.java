package zendesk.messaging.android.internal;

import android.content.Context;
import android.content.Intent;
import ba0.g;
import com.braze.h2;
import com.braze.models.FeatureFlag;
import com.braze.models.inappmessage.InAppMessageBase;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.x;
import x70.c;
import y80.j;
import z70.e;
import z70.i;
import zendesk.android.ZendeskCredentials;
import zendesk.android.events.AgentMessageSource;
import zendesk.android.events.ConversationServedByAgentDetails;
import zendesk.android.events.ConversationUnreadCountChange;
import zendesk.android.messaging.Messaging;
import zendesk.android.messaging.MessagingScreen;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.conversationkit.android.ConversationKitEvent;
import zendesk.conversationkit.android.internal.extension.ConversationKitKt;
import zendesk.conversationkit.android.internal.metadata.ConversationMetadataService;
import zendesk.conversationkit.android.model.ActivityData;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.ConversationStatus;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageKt;
import zendesk.conversationkit.android.model.MessageSourceType;
import zendesk.conversationkit.android.model.Participant;
import zendesk.conversationkit.android.model.ProactiveMessage;
import zendesk.conversationkit.android.model.ProactiveMessageStatus;
import zendesk.conversationkit.android.model.User;
import zendesk.core.android.internal.app.FeatureFlagManager;
import zendesk.core.ui.android.internal.app.ProcessLifecycleEventObserver;
import zendesk.logger.Logger;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageCleaner;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListStorageBuilder;
import zendesk.messaging.android.internal.di.MessagingComponent;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;
import zendesk.messaging.android.internal.extension.ConversationKtxKt;
import zendesk.messaging.android.internal.messagingscreen.MessagingActivityIntentBuilder;
import zendesk.messaging.android.internal.proactivemessaging.LocalNotificationHandler;
import zendesk.messaging.android.internal.proactivemessaging.ProactiveMessageEvent;
import zendesk.messaging.android.internal.validation.ConversationFieldManager;
import zendesk.messaging.android.push.PushNotifications;
import zendesk.messaging.android.push.internal.NotificationBuilder;
import zendesk.messaging.android.push.internal.NotificationDisplayedState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\b\u0000\u0018\u0000 \u0086\u00012\u00020\u0001:\u0002\u0086\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b#\u0010'J\u001f\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b#\u0010*J'\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b#\u0010+J)\u00100\u001a\u00020-2\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010&\u001a\u00020%2\u0006\u0010,\u001a\u00020(H\u0000¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u00020%H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00101\u001a\u00020%2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b1\u00105J#\u00109\u001a\u00020\"2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020706H\u0016¢\u0006\u0004\b9\u0010:J\u001d\u0010=\u001a\u00020\"2\f\u0010<\u001a\b\u0012\u0004\u0012\u0002030;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\"2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\"H\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\"H\u0016¢\u0006\u0004\bE\u0010DJ!\u0010K\u001a\u00020\"2\b\u0010F\u001a\u0004\u0018\u00010%2\u0006\u0010H\u001a\u00020GH\u0000¢\u0006\u0004\bI\u0010JJ\u0017\u0010N\u001a\u00020\"2\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\"H\u0082@¢\u0006\u0004\bP\u0010QJ\u0017\u0010T\u001a\u00020\"2\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010X\u001a\u00020\"2\u0006\u0010W\u001a\u00020VH\u0002¢\u0006\u0004\bX\u0010YJ \u0010\\\u001a\u00020\"2\u0006\u00104\u001a\u0002032\u0006\u0010[\u001a\u00020ZH\u0082@¢\u0006\u0004\b\\\u0010]J\u0017\u0010_\u001a\u00020\"2\u0006\u0010H\u001a\u00020^H\u0002¢\u0006\u0004\b_\u0010`J\u0017\u0010b\u001a\u00020\"2\u0006\u0010H\u001a\u00020aH\u0002¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\"H\u0002¢\u0006\u0004\bd\u0010DJ\u0017\u0010f\u001a\u00020\"2\u0006\u0010H\u001a\u00020eH\u0002¢\u0006\u0004\bf\u0010gJ'\u0010h\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010&\u001a\u00020%2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\bh\u0010iJ\u0017\u0010j\u001a\u00020\"2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\bj\u0010kJ\u001c\u0010l\u001a\u00020\"2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010%H\u0082@¢\u0006\u0004\bl\u0010mR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010nR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010o\u001a\u0004\bp\u0010qR\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010rR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010sR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010tR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010uR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010vR\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010w\u001a\u0004\bx\u0010yR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010z\u001a\u0004\b{\u0010|R\u001a\u0010\u0015\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010}\u001a\u0004\b~\u0010\u007fR\u001d\u0010\u0017\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0017\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010\u0083\u0001R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010\u0084\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010\u0085\u0001¨\u0006\u0087\u0001"}, d2 = {"Lzendesk/messaging/android/internal/DefaultMessaging;", "Lzendesk/android/messaging/Messaging;", "Lzendesk/android/ZendeskCredentials;", "credentials", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "Lzendesk/conversationkit/android/ConversationKit;", "conversationKit", "Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;", "processLifecycleObserver", "Lv80/b0;", "coroutineScope", "Lzendesk/messaging/android/internal/UnreadMessageCounter;", "unreadMessageCounter", "Lzendesk/messaging/android/internal/proactivemessaging/LocalNotificationHandler;", "localNotificationHandler", "Lzendesk/messaging/android/internal/di/MessagingComponent;", "messagingComponent", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListStorageBuilder;", "conversationsListStorageBuilder", "Lzendesk/messaging/android/internal/validation/ConversationFieldManager;", "conversationFieldManager", "Lzendesk/core/android/internal/app/FeatureFlagManager;", "featureFlagManager", "Lv80/x;", "mainCoroutineDispatcher", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "messagingEventDispatcher", "Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "analyticsProcessor", "<init>", "(Lzendesk/android/ZendeskCredentials;Lzendesk/android/messaging/model/MessagingSettings;Lzendesk/conversationkit/android/ConversationKit;Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;Lv80/b0;Lzendesk/messaging/android/internal/UnreadMessageCounter;Lzendesk/messaging/android/internal/proactivemessaging/LocalNotificationHandler;Lzendesk/messaging/android/internal/di/MessagingComponent;Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListStorageBuilder;Lzendesk/messaging/android/internal/validation/ConversationFieldManager;Lzendesk/core/android/internal/app/FeatureFlagManager;Lv80/x;Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;)V", "Landroid/content/Context;", "context", "", "showMessaging", "(Landroid/content/Context;)V", "", "intentFlags", "(Landroid/content/Context;I)V", "Lzendesk/android/messaging/MessagingScreen;", "screen", "(Landroid/content/Context;Lzendesk/android/messaging/MessagingScreen;)V", "(Landroid/content/Context;Lzendesk/android/messaging/MessagingScreen;I)V", "messagingScreen", "Landroid/content/Intent;", "messagingScreenIntent$zendesk_messaging_messaging_android", "(Landroid/content/Context;ILzendesk/android/messaging/MessagingScreen;)Landroid/content/Intent;", "messagingScreenIntent", "getUnreadMessageCount", "()I", "", "conversationId", "(Ljava/lang/String;)I", "", "", "fields", "setConversationFields", "(Ljava/util/Map;)V", "", "tags", "setConversationTags", "(Ljava/util/List;)V", "", FeatureFlag.ENABLED, "enableAnalyticsTracking", "(Z)V", "clearConversationFields", "()V", "clearConversationTags", "proactiveMessageId", "Lzendesk/messaging/android/internal/proactivemessaging/ProactiveMessageEvent;", "event", "handleProactiveMessageEvent$zendesk_messaging_messaging_android", "(Ljava/lang/Integer;Lzendesk/messaging/android/internal/proactivemessaging/ProactiveMessageEvent;)V", "handleProactiveMessageEvent", "Lzendesk/conversationkit/android/ConversationKitEvent$UserServedByAgent;", "conversationKitEvent", "handleConversationServedByAgent", "(Lzendesk/conversationkit/android/ConversationKitEvent$UserServedByAgent;)V", "resetConversationsListStorage", "(Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/model/ProactiveMessage;", "proactiveMessage", "handleProactiveMessageHasBeenDisplayed", "(Lzendesk/conversationkit/android/model/ProactiveMessage;)V", "", "throwable", "handleProactiveMessageCannotBeDisplayed", "(Ljava/lang/Throwable;)V", "Lzendesk/conversationkit/android/model/Message;", InAppMessageBase.MESSAGE, "handleMessageReceivedEvent", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/Message;Lx70/c;)Ljava/lang/Object;", "Lzendesk/conversationkit/android/ConversationKitEvent$UserUpdated;", "handleUserUpdatedEvent", "(Lzendesk/conversationkit/android/ConversationKitEvent$UserUpdated;)V", "Lzendesk/conversationkit/android/ConversationKitEvent$ActivityEventReceived;", "handleActivityEventReceived", "(Lzendesk/conversationkit/android/ConversationKitEvent$ActivityEventReceived;)V", "resetUnreadMessageCounter", "Lzendesk/conversationkit/android/ConversationKitEvent$PersistedUserReceived;", "handlePersistedUserReceivedEvent", "(Lzendesk/conversationkit/android/ConversationKitEvent$PersistedUserReceived;)V", "startMessaging", "(Landroid/content/Context;ILzendesk/android/messaging/MessagingScreen;)V", "dispatchUnreadMessageCountChanged", "(Ljava/lang/String;)V", "clearRemainingProactiveMessages", "(Ljava/lang/Integer;Lx70/c;)Ljava/lang/Object;", "Lzendesk/android/ZendeskCredentials;", "Lzendesk/android/messaging/model/MessagingSettings;", "getMessagingSettings$zendesk_messaging_messaging_android", "()Lzendesk/android/messaging/model/MessagingSettings;", "Lzendesk/conversationkit/android/ConversationKit;", "Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;", "Lv80/b0;", "Lzendesk/messaging/android/internal/UnreadMessageCounter;", "Lzendesk/messaging/android/internal/proactivemessaging/LocalNotificationHandler;", "Lzendesk/messaging/android/internal/di/MessagingComponent;", "getMessagingComponent$zendesk_messaging_messaging_android", "()Lzendesk/messaging/android/internal/di/MessagingComponent;", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListStorageBuilder;", "getConversationsListStorageBuilder$zendesk_messaging_messaging_android", "()Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListStorageBuilder;", "Lzendesk/messaging/android/internal/validation/ConversationFieldManager;", "getConversationFieldManager$zendesk_messaging_messaging_android", "()Lzendesk/messaging/android/internal/validation/ConversationFieldManager;", "Lzendesk/core/android/internal/app/FeatureFlagManager;", "getFeatureFlagManager$zendesk_messaging_messaging_android", "()Lzendesk/core/android/internal/app/FeatureFlagManager;", "Lv80/x;", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "Lzendesk/messaging/android/internal/analytics/AnalyticsProcessor;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultMessaging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultMessaging.kt\nzendesk/messaging/android/internal/DefaultMessaging\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,517:1\n1869#2,2:518\n1869#2,2:520\n827#2:523\n855#2,2:524\n1869#2,2:526\n1#3:522\n*S KotlinDebug\n*F\n+ 1 DefaultMessaging.kt\nzendesk/messaging/android/internal/DefaultMessaging\n*L\n241#1:518,2\n281#1:520,2\n503#1:523\n503#1:524,2\n504#1:526,2\n*E\n"})
public final class DefaultMessaging implements Messaging {

    @NotNull
    public static final String LOG_TAG = "DefaultMessaging";

    @NotNull
    public static final String MESSAGING_NAMESPACE = "zendesk.messaging.android";

    @NotNull
    private static final String MSG_AGENT_ID_KEY = "__zendesk_msg.agent.id";

    @NotNull
    public static final String NO_CONVERSATIONS_AVAILABLE_POST_LOGOUT = "No Conversation available in Storage after logging out";

    @NotNull
    private final AnalyticsProcessor analyticsProcessor;

    @NotNull
    private final ConversationFieldManager conversationFieldManager;

    @NotNull
    public final ConversationKit conversationKit;

    @Nullable
    private final ConversationsListStorageBuilder conversationsListStorageBuilder;

    @NotNull
    private final b0 coroutineScope;

    @NotNull
    public final ZendeskCredentials credentials;

    @NotNull
    private final FeatureFlagManager featureFlagManager;

    @NotNull
    private final LocalNotificationHandler localNotificationHandler;

    @NotNull
    private final x mainCoroutineDispatcher;

    @NotNull
    private final MessagingComponent messagingComponent;

    @NotNull
    private final MessagingEventDispatcher messagingEventDispatcher;

    @NotNull
    private final MessagingSettings messagingSettings;

    @NotNull
    private final ProcessLifecycleEventObserver processLifecycleObserver;

    @NotNull
    private final UnreadMessageCounter unreadMessageCounter;

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.DefaultMessaging$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.DefaultMessaging$1", f = "DefaultMessaging.kt", l = {90}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass1 extends i implements Function2<b0, c<? super Unit>, Object> {
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return DefaultMessaging.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                y80.i iVarIsInForeground = DefaultMessaging.this.processLifecycleObserver.isInForeground();
                final DefaultMessaging defaultMessaging = DefaultMessaging.this;
                j jVar = new j() { // from class: zendesk.messaging.android.internal.DefaultMessaging.1.1
                    public final Object emit(boolean z11, c<? super Unit> cVar) {
                        if (z11) {
                            Logger.d(DefaultMessaging.LOG_TAG, "App is in the foreground, resuming ConversationKit", new Object[0]);
                            Object objResume = defaultMessaging.conversationKit.resume(cVar);
                            return objResume == y70.a.COROUTINE_SUSPENDED ? objResume : Unit.f26487a;
                        }
                        Logger.d(DefaultMessaging.LOG_TAG, "App is in the background, pausing ConversationKit", new Object[0]);
                        Object objPause = defaultMessaging.conversationKit.pause(cVar);
                        return objPause == y70.a.COROUTINE_SUSPENDED ? objPause : Unit.f26487a;
                    }

                    @Override // y80.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                        return emit(((Boolean) obj2).booleanValue(), (c<? super Unit>) cVar);
                    }
                };
                this.label = 1;
                if (iVarIsInForeground.collect(jVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.DefaultMessaging$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.DefaultMessaging$2", f = "DefaultMessaging.kt", l = {101}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass2 extends i implements Function2<b0, c<? super Unit>, Object> {
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return DefaultMessaging.this.new AnonymousClass2(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                y80.i pushNotificationToken$zendesk_messaging_messaging_android = PushNotifications.INSTANCE.getPushNotificationToken$zendesk_messaging_messaging_android();
                final DefaultMessaging defaultMessaging = DefaultMessaging.this;
                j jVar = new j() { // from class: zendesk.messaging.android.internal.DefaultMessaging.2.1
                    public final Object emit(String str, c<? super Unit> cVar) {
                        Object objUpdatePushNotificationToken = defaultMessaging.conversationKit.updatePushNotificationToken(str, cVar);
                        return objUpdatePushNotificationToken == y70.a.COROUTINE_SUSPENDED ? objUpdatePushNotificationToken : Unit.f26487a;
                    }

                    @Override // y80.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                        return emit((String) obj2, (c<? super Unit>) cVar);
                    }
                };
                this.label = 1;
                if (pushNotificationToken$zendesk_messaging_messaging_android.collect(jVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.DefaultMessaging$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.DefaultMessaging$3", f = "DefaultMessaging.kt", l = {106}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass3 extends i implements Function2<b0, c<? super Unit>, Object> {
        int label;

        public AnonymousClass3(c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return DefaultMessaging.this.new AnonymousClass3(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass3) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                y80.i notificationDisplayed$zendesk_messaging_messaging_android = PushNotifications.INSTANCE.getNotificationDisplayed$zendesk_messaging_messaging_android();
                final DefaultMessaging defaultMessaging = DefaultMessaging.this;
                j jVar = new j() { // from class: zendesk.messaging.android.internal.DefaultMessaging.3.1
                    public final Object emit(NotificationDisplayedState notificationDisplayedState, c<? super Unit> cVar) {
                        if (notificationDisplayedState instanceof NotificationDisplayedState.Displayed) {
                            NotificationDisplayedState.Displayed displayed = (NotificationDisplayedState.Displayed) notificationDisplayedState;
                            MessagingEventDispatcher.handleNotificationDisplayedEvent$zendesk_messaging_messaging_android$default(defaultMessaging.messagingEventDispatcher, displayed.getConversationId(), displayed.getMessageReceivedTimestamp(), null, 0L, 12, null);
                            PushNotifications.INSTANCE.resetNotificationDisplayedState$zendesk_messaging_messaging_android();
                        }
                        return Unit.f26487a;
                    }

                    @Override // y80.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                        return emit((NotificationDisplayedState) obj2, (c<? super Unit>) cVar);
                    }
                };
                this.label = 1;
                if (notificationDisplayed$zendesk_messaging_messaging_android.collect(jVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.DefaultMessaging$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.DefaultMessaging$4", f = "DefaultMessaging.kt", l = {118}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass4 extends i implements Function2<b0, c<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: zendesk.messaging.android.internal.DefaultMessaging$4$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @e(c = "zendesk.messaging.android.internal.DefaultMessaging$4$1", f = "DefaultMessaging.kt", l = {119}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
        public static final class AnonymousClass1 extends i implements Function2<b0, c<? super Unit>, Object> {
            int label;
            final /* synthetic */ DefaultMessaging this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DefaultMessaging defaultMessaging, c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.this$0 = defaultMessaging;
            }

            @Override // z70.a
            public final c<Unit> create(Object obj, c<?> cVar) {
                return new AnonymousClass1(this.this$0, cVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
                return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
            }

            @Override // z70.a
            public final Object invokeSuspend(Object obj) {
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    g.M(obj);
                    y80.i eventFlow = ConversationKitKt.getEventFlow(this.this$0.conversationKit);
                    final DefaultMessaging defaultMessaging = this.this$0;
                    j jVar = new j() { // from class: zendesk.messaging.android.internal.DefaultMessaging.4.1.1

                        /* JADX INFO: renamed from: zendesk.messaging.android.internal.DefaultMessaging$4$1$1$1, reason: invalid class name and collision with other inner class name */
                        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
                        @e(c = "zendesk.messaging.android.internal.DefaultMessaging$4$1$1$1", f = "DefaultMessaging.kt", l = {}, m = "invokeSuspend")
                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
                        public static final class C00341 extends i implements Function2<b0, c<? super Unit>, Object> {
                            final /* synthetic */ String $body;
                            final /* synthetic */ String $campaignId;
                            final /* synthetic */ int $id;
                            final /* synthetic */ ProactiveMessage $localNotification;
                            final /* synthetic */ String $title;
                            int label;
                            final /* synthetic */ DefaultMessaging this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C00341(DefaultMessaging defaultMessaging, int i11, String str, String str2, String str3, ProactiveMessage proactiveMessage, c<? super C00341> cVar) {
                                super(2, cVar);
                                this.this$0 = defaultMessaging;
                                this.$id = i11;
                                this.$title = str;
                                this.$body = str2;
                                this.$campaignId = str3;
                                this.$localNotification = proactiveMessage;
                            }

                            @Override // z70.a
                            public final c<Unit> create(Object obj, c<?> cVar) {
                                return new C00341(this.this$0, this.$id, this.$title, this.$body, this.$campaignId, this.$localNotification, cVar);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
                                return ((C00341) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
                            }

                            @Override // z70.a
                            public final Object invokeSuspend(Object obj) {
                                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                                if (this.label != 0) {
                                    h2.b("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                g.M(obj);
                                try {
                                    this.this$0.localNotificationHandler.displayLocalNotification(this.$id, this.$title, this.$body, w0.b(new Pair(NotificationBuilder.PROACTIVE_CAMPAIGN_ID, this.$campaignId)));
                                    if (this.this$0.localNotificationHandler.areNotificationsEnabled()) {
                                        MessagingEventDispatcher.handleProactiveMessageDisplayedEvent$zendesk_messaging_messaging_android$default(this.this$0.messagingEventDispatcher, null, 0L, this.$id, this.$campaignId, 3, null);
                                    }
                                    this.this$0.handleProactiveMessageHasBeenDisplayed(this.$localNotification);
                                } catch (Throwable th2) {
                                    this.this$0.handleProactiveMessageCannotBeDisplayed(th2);
                                }
                                return Unit.f26487a;
                            }
                        }

                        public final Object emit(ConversationKitEvent conversationKitEvent, c<? super Unit> cVar) {
                            if (conversationKitEvent instanceof ConversationKitEvent.MessageReceived) {
                                ConversationKitEvent.MessageReceived messageReceived = (ConversationKitEvent.MessageReceived) conversationKitEvent;
                                Object objHandleMessageReceivedEvent = defaultMessaging.handleMessageReceivedEvent(messageReceived.getConversationId(), messageReceived.getMessage(), cVar);
                                return objHandleMessageReceivedEvent == y70.a.COROUTINE_SUSPENDED ? objHandleMessageReceivedEvent : Unit.f26487a;
                            }
                            if (conversationKitEvent instanceof ConversationKitEvent.ActivityEventReceived) {
                                defaultMessaging.handleActivityEventReceived((ConversationKitEvent.ActivityEventReceived) conversationKitEvent);
                            } else if (conversationKitEvent instanceof ConversationKitEvent.UserUpdated) {
                                defaultMessaging.handleUserUpdatedEvent((ConversationKitEvent.UserUpdated) conversationKitEvent);
                            } else if (conversationKitEvent instanceof ConversationKitEvent.PersistedUserReceived) {
                                defaultMessaging.handlePersistedUserReceivedEvent((ConversationKitEvent.PersistedUserReceived) conversationKitEvent);
                            } else {
                                if ((conversationKitEvent instanceof ConversationKitEvent.LogoutUserCompleted) || (conversationKitEvent instanceof ConversationKitEvent.UserAccessRevoked)) {
                                    defaultMessaging.resetUnreadMessageCounter();
                                    Object objResetConversationsListStorage = defaultMessaging.resetConversationsListStorage(cVar);
                                    return objResetConversationsListStorage == y70.a.COROUTINE_SUSPENDED ? objResetConversationsListStorage : Unit.f26487a;
                                }
                                if (conversationKitEvent instanceof ConversationKitEvent.ProactiveMessageStatusChanged) {
                                    ConversationKitEvent.ProactiveMessageStatusChanged proactiveMessageStatusChanged = (ConversationKitEvent.ProactiveMessageStatusChanged) conversationKitEvent;
                                    if (proactiveMessageStatusChanged.getStatus() instanceof ProactiveMessageStatus.NotificationWillDisplay) {
                                        ProactiveMessageStatus status = proactiveMessageStatusChanged.getStatus();
                                        status.getClass();
                                        ProactiveMessage proactiveMessage = ((ProactiveMessageStatus.NotificationWillDisplay) status).getProactiveMessage();
                                        f0.B(defaultMessaging.coroutineScope, null, null, new C00341(defaultMessaging, proactiveMessage.getId(), proactiveMessage.getTitle(), proactiveMessage.getBody(), proactiveMessage.getCampaignId(), proactiveMessage, null), 3);
                                    }
                                } else if (conversationKitEvent instanceof ConversationKitEvent.UserServedByAgent) {
                                    defaultMessaging.handleConversationServedByAgent((ConversationKitEvent.UserServedByAgent) conversationKitEvent);
                                }
                            }
                            return Unit.f26487a;
                        }

                        @Override // y80.j
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, c cVar) {
                            return emit((ConversationKitEvent) obj2, (c<? super Unit>) cVar);
                        }
                    };
                    this.label = 1;
                    if (eventFlow.collect(jVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g.M(obj);
                }
                return Unit.f26487a;
            }
        }

        public AnonymousClass4(c<? super AnonymousClass4> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return DefaultMessaging.this.new AnonymousClass4(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass4) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                x xVar = DefaultMessaging.this.mainCoroutineDispatcher;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DefaultMessaging.this, null);
                this.label = 1;
                if (f0.K(xVar, anonymousClass1, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.DefaultMessaging$clearConversationFields$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.DefaultMessaging$clearConversationFields$1", f = "DefaultMessaging.kt", l = {432}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C03761 extends i implements Function2<b0, c<? super Unit>, Object> {
        Object L$0;
        int label;

        public C03761(c<? super C03761> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return DefaultMessaging.this.new C03761(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C03761) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                ConversationMetadataService conversationMetadataService = DefaultMessaging.this.conversationKit.getConversationMetadataService();
                this.L$0 = conversationMetadataService;
                this.label = 1;
                if (conversationMetadataService.removeConversationFields(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.DefaultMessaging$clearConversationTags$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.DefaultMessaging$clearConversationTags$1", f = "DefaultMessaging.kt", l = {440}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C03771 extends i implements Function2<b0, c<? super Unit>, Object> {
        Object L$0;
        int label;

        public C03771(c<? super C03771> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return DefaultMessaging.this.new C03771(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C03771) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                ConversationMetadataService conversationMetadataService = DefaultMessaging.this.conversationKit.getConversationMetadataService();
                this.L$0 = conversationMetadataService;
                this.label = 1;
                if (conversationMetadataService.removeConversationTags(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.DefaultMessaging$clearRemainingProactiveMessages$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.DefaultMessaging", f = "DefaultMessaging.kt", l = {505}, m = "clearRemainingProactiveMessages")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03781 extends z70.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C03781(c<? super C03781> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultMessaging.this.clearRemainingProactiveMessages(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.DefaultMessaging$enableAnalyticsTracking$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.DefaultMessaging$enableAnalyticsTracking$1", f = "DefaultMessaging.kt", l = {425}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C03791 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ boolean $enabled;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03791(boolean z11, c<? super C03791> cVar) {
            super(2, cVar);
            this.$enabled = z11;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return DefaultMessaging.this.new C03791(this.$enabled, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C03791) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                AnalyticsProcessor analyticsProcessor = DefaultMessaging.this.analyticsProcessor;
                boolean z11 = this.$enabled;
                this.label = 1;
                if (analyticsProcessor.enableInternalAnalytics(z11, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.DefaultMessaging$handleActivityEventReceived$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.DefaultMessaging$handleActivityEventReceived$1", f = "DefaultMessaging.kt", l = {260}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C03801 extends i implements Function2<b0, c<? super Unit>, Object> {
        int label;

        public C03801(c<? super C03801> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return DefaultMessaging.this.new C03801(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C03801) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            List<Conversation> conversations;
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                ConversationKit conversationKit = DefaultMessaging.this.conversationKit;
                this.label = 1;
                obj = conversationKit.getCurrentUser(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            User user = (User) obj;
            Conversation conversationLatestUpdatedTopConversation = (user == null || (conversations = user.getConversations()) == null) ? null : ConversationKtxKt.latestUpdatedTopConversation(conversations, ConversationStatus.ACTIVE);
            if (conversationLatestUpdatedTopConversation != null) {
                DefaultMessaging.this.dispatchUnreadMessageCountChanged(conversationLatestUpdatedTopConversation.getId());
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.DefaultMessaging$handleMessageReceivedEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.DefaultMessaging", f = "DefaultMessaging.kt", l = {229}, m = "handleMessageReceivedEvent")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C03811 extends z70.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C03811(c<? super C03811> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultMessaging.this.handleMessageReceivedEvent(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.DefaultMessaging$setConversationFields$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.DefaultMessaging$setConversationFields$1", f = "DefaultMessaging.kt", l = {411}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C03821 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ Map<String, Object> $fields;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03821(Map<String, ? extends Object> map, c<? super C03821> cVar) {
            super(2, cVar);
            this.$fields = map;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return DefaultMessaging.this.new C03821(this.$fields, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C03821) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                ConversationFieldManager conversationFieldManager = DefaultMessaging.this.getConversationFieldManager();
                Map<String, ? extends Object> map = this.$fields;
                this.label = 1;
                if (conversationFieldManager.handleConversationFields(map, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.DefaultMessaging$setConversationTags$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.DefaultMessaging$setConversationTags$1", f = "DefaultMessaging.kt", l = {418}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C03831 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ List<String> $tags;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03831(List<String> list, c<? super C03831> cVar) {
            super(2, cVar);
            this.$tags = list;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return DefaultMessaging.this.new C03831(this.$tags, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C03831) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                ConversationMetadataService conversationMetadataService = DefaultMessaging.this.conversationKit.getConversationMetadataService();
                List<String> list = this.$tags;
                this.L$0 = conversationMetadataService;
                this.label = 1;
                if (conversationMetadataService.addConversationTags(list, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    public DefaultMessaging(@NotNull ZendeskCredentials zendeskCredentials, @NotNull MessagingSettings messagingSettings, @NotNull ConversationKit conversationKit, @NotNull ProcessLifecycleEventObserver processLifecycleEventObserver, @NotNull b0 b0Var, @NotNull UnreadMessageCounter unreadMessageCounter, @NotNull LocalNotificationHandler localNotificationHandler, @NotNull MessagingComponent messagingComponent, @Nullable ConversationsListStorageBuilder conversationsListStorageBuilder, @NotNull ConversationFieldManager conversationFieldManager, @NotNull FeatureFlagManager featureFlagManager, @NotNull x xVar, @NotNull MessagingEventDispatcher messagingEventDispatcher, @NotNull AnalyticsProcessor analyticsProcessor) {
        zendeskCredentials.getClass();
        messagingSettings.getClass();
        conversationKit.getClass();
        processLifecycleEventObserver.getClass();
        b0Var.getClass();
        unreadMessageCounter.getClass();
        localNotificationHandler.getClass();
        messagingComponent.getClass();
        conversationFieldManager.getClass();
        featureFlagManager.getClass();
        xVar.getClass();
        messagingEventDispatcher.getClass();
        analyticsProcessor.getClass();
        this.credentials = zendeskCredentials;
        this.messagingSettings = messagingSettings;
        this.conversationKit = conversationKit;
        this.processLifecycleObserver = processLifecycleEventObserver;
        this.coroutineScope = b0Var;
        this.unreadMessageCounter = unreadMessageCounter;
        this.localNotificationHandler = localNotificationHandler;
        this.messagingComponent = messagingComponent;
        this.conversationsListStorageBuilder = conversationsListStorageBuilder;
        this.conversationFieldManager = conversationFieldManager;
        this.featureFlagManager = featureFlagManager;
        this.mainCoroutineDispatcher = xVar;
        this.messagingEventDispatcher = messagingEventDispatcher;
        this.analyticsProcessor = analyticsProcessor;
        f0.B(b0Var, null, null, new AnonymousClass1(null), 3);
        f0.B(b0Var, null, null, new AnonymousClass2(null), 3);
        f0.B(b0Var, null, null, new AnonymousClass3(null), 3);
        f0.B(b0Var, null, null, new AnonymousClass4(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clearRemainingProactiveMessages(java.lang.Integer r8, x70.c<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zendesk.messaging.android.internal.DefaultMessaging.C03781
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.messaging.android.internal.DefaultMessaging$clearRemainingProactiveMessages$1 r0 = (zendesk.messaging.android.internal.DefaultMessaging.C03781) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.DefaultMessaging$clearRemainingProactiveMessages$1 r0 = new zendesk.messaging.android.internal.DefaultMessaging$clearRemainingProactiveMessages$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r8 = r0.L$0
            java.util.Iterator r8 = (java.util.Iterator) r8
            ba0.g.M(r9)
            goto L67
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L32:
            ba0.g.M(r9)
            zendesk.messaging.android.internal.proactivemessaging.LocalNotificationHandler r9 = r7.localNotificationHandler
            java.util.List r9 = r9.getLocalNotificationsIds()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L44:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L63
            java.lang.Object r4 = r9.next()
            r5 = r4
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r8 != 0) goto L58
            goto L5f
        L58:
            int r6 = r8.intValue()
            if (r5 != r6) goto L5f
            goto L44
        L5f:
            r2.add(r4)
            goto L44
        L63:
            java.util.Iterator r8 = r2.iterator()
        L67:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L84
            java.lang.Object r9 = r8.next()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            zendesk.conversationkit.android.ConversationKit r2 = r7.conversationKit
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = r2.clearProactiveMessage(r9, r0)
            if (r9 != r1) goto L67
            return r1
        L84:
            zendesk.messaging.android.internal.proactivemessaging.LocalNotificationHandler r8 = r7.localNotificationHandler
            r8.clearLocalNotifications()
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.DefaultMessaging.clearRemainingProactiveMessages(java.lang.Integer, x70.c):java.lang.Object");
    }

    public static /* synthetic */ Object clearRemainingProactiveMessages$default(DefaultMessaging defaultMessaging, Integer num, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        return defaultMessaging.clearRemainingProactiveMessages(num, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchUnreadMessageCountChanged(String conversationId) {
        MessagingEventDispatcher.handleUnreadMessageCountChanged$zendesk_messaging_messaging_android$default(this.messagingEventDispatcher, null, 0L, new ConversationUnreadCountChange(this.unreadMessageCounter.getTotalUnreadMessageCount(), conversationId, this.unreadMessageCounter.getUnreadMessageCount(conversationId)), this.unreadMessageCounter.getTotalUnreadMessageCount(), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleActivityEventReceived(ConversationKitEvent.ActivityEventReceived event) {
        if (event.getActivityEvent().getActivityData() == ActivityData.CONVERSATION_READ) {
            this.unreadMessageCounter.resetConversationUnread(event.getActivityEvent().getConversationId());
            f0.B(this.coroutineScope, null, null, new C03801(null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleConversationServedByAgent(ConversationKitEvent.UserServedByAgent conversationKitEvent) {
        Message message = conversationKitEvent.getMessage();
        String conversationId = conversationKitEvent.getConversationId();
        boolean zIsFromSourceType = MessageKt.isFromSourceType(message.getContent(), MessageSourceType.AGENT);
        MessagingEventDispatcher.handleConversationServedByAgent$zendesk_messaging_messaging_android$default(this.messagingEventDispatcher, null, 0L, new ConversationServedByAgentDetails(message.getAuthor().getDisplayName(), String.valueOf(MessageKt.agentIdFromMetadata(message, "__zendesk_msg.agent.id")), zIsFromSourceType ? AgentMessageSource.AGENT_WORKSPACE : AgentMessageSource.AGENT_COPILOT, conversationId), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleMessageReceivedEvent(java.lang.String r5, zendesk.conversationkit.android.model.Message r6, x70.c<? super kotlin.Unit> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof zendesk.messaging.android.internal.DefaultMessaging.C03811
            if (r0 == 0) goto L13
            r0 = r7
            zendesk.messaging.android.internal.DefaultMessaging$handleMessageReceivedEvent$1 r0 = (zendesk.messaging.android.internal.DefaultMessaging.C03811) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.DefaultMessaging$handleMessageReceivedEvent$1 r0 = new zendesk.messaging.android.internal.DefaultMessaging$handleMessageReceivedEvent$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.L$1
            r6 = r5
            zendesk.conversationkit.android.model.Message r6 = (zendesk.conversationkit.android.model.Message) r6
            java.lang.Object r5 = r0.L$0
            java.lang.String r5 = (java.lang.String) r5
            ba0.g.M(r7)
            goto L49
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L37:
            ba0.g.M(r7)
            zendesk.conversationkit.android.ConversationKit r7 = r4.conversationKit
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r7.getCurrentUser(r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            zendesk.conversationkit.android.model.User r7 = (zendesk.conversationkit.android.model.User) r7
            if (r7 == 0) goto L56
            zendesk.conversationkit.android.model.Author r6 = r6.getAuthor()
            boolean r6 = zendesk.conversationkit.android.model.UserKt.isNotAuthoredBySameUser(r7, r6)
            goto L57
        L56:
            r6 = 0
        L57:
            if (r6 == 0) goto L61
            zendesk.messaging.android.internal.UnreadMessageCounter r6 = r4.unreadMessageCounter
            r6.increase(r5)
            r4.dispatchUnreadMessageCountChanged(r5)
        L61:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.DefaultMessaging.handleMessageReceivedEvent(java.lang.String, zendesk.conversationkit.android.model.Message, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePersistedUserReceivedEvent(ConversationKitEvent.PersistedUserReceived event) {
        for (Conversation conversation : event.getUser().getConversations()) {
            UnreadMessageCounter unreadMessageCounter = this.unreadMessageCounter;
            String id2 = conversation.getId();
            Participant myself = conversation.getMyself();
            unreadMessageCounter.update(id2, myself != null ? myself.getUnreadCount() : 0);
        }
        Conversation conversationLatestUpdatedTopConversation = ConversationKtxKt.latestUpdatedTopConversation(event.getUser().getConversations(), ConversationStatus.ACTIVE);
        if (conversationLatestUpdatedTopConversation != null) {
            dispatchUnreadMessageCountChanged(conversationLatestUpdatedTopConversation.getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleProactiveMessageCannotBeDisplayed(Throwable throwable) {
        this.conversationKit.dispatchEvent(new ConversationKitEvent.ProactiveMessageStatusChanged(new ProactiveMessageStatus.NotificationCannotBeDisplayed(throwable)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleProactiveMessageHasBeenDisplayed(ProactiveMessage proactiveMessage) {
        this.conversationKit.dispatchEvent(new ConversationKitEvent.ProactiveMessageStatusChanged(new ProactiveMessageStatus.NotificationHasBeenDisplayed(proactiveMessage)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleUserUpdatedEvent(ConversationKitEvent.UserUpdated event) {
        for (Conversation conversation : event.getUser().getConversations()) {
            UnreadMessageCounter unreadMessageCounter = this.unreadMessageCounter;
            String id2 = conversation.getId();
            Participant myself = conversation.getMyself();
            unreadMessageCounter.update(id2, myself != null ? myself.getUnreadCount() : 0);
        }
        Conversation conversationLatestUpdatedTopConversation = ConversationKtxKt.latestUpdatedTopConversation(event.getUser().getConversations(), ConversationStatus.ACTIVE);
        if (conversationLatestUpdatedTopConversation != null) {
            dispatchUnreadMessageCountChanged(conversationLatestUpdatedTopConversation.getId());
        }
    }

    public static /* synthetic */ Intent messagingScreenIntent$zendesk_messaging_messaging_android$default(DefaultMessaging defaultMessaging, Context context, int i11, MessagingScreen messagingScreen, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return defaultMessaging.messagingScreenIntent$zendesk_messaging_messaging_android(context, i11, messagingScreen);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object resetConversationsListStorage(c<? super Unit> cVar) {
        ConversationsListLocalStorageCleaner conversationsListLocalStorageCleanerBuild;
        if (this.messagingSettings.isMultiConversationsEnabled()) {
            Logger.d(LOG_TAG, "Conversations list cache cleaned up", new Object[0]);
            ConversationsListStorageBuilder conversationsListStorageBuilder = this.conversationsListStorageBuilder;
            if (conversationsListStorageBuilder != null && (conversationsListLocalStorageCleanerBuild = conversationsListStorageBuilder.build()) != null) {
                Object objClear = conversationsListLocalStorageCleanerBuild.clear(cVar);
                return objClear == y70.a.COROUTINE_SUSPENDED ? objClear : Unit.f26487a;
            }
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetUnreadMessageCounter() {
        this.unreadMessageCounter.reset();
        dispatchUnreadMessageCountChanged(NO_CONVERSATIONS_AVAILABLE_POST_LOGOUT);
    }

    private final void startMessaging(Context context, int intentFlags, MessagingScreen screen) {
        Logger.i(LOG_TAG, "Showing the messaging Screen", new Object[0]);
        MessagingEventDispatcher.handleMessagingOpenedEvent$zendesk_messaging_messaging_android$default(this.messagingEventDispatcher, null, 0L, 3, null);
        context.startActivity(new MessagingActivityIntentBuilder(context, this.credentials, null, screen, 4, null).withFlags(intentFlags).getIntent());
    }

    @Override // zendesk.android.messaging.Messaging
    public void clearConversationFields() {
        f0.B(this.coroutineScope, null, null, new C03761(null), 3);
    }

    @Override // zendesk.android.messaging.Messaging
    public void clearConversationTags() {
        f0.B(this.coroutineScope, null, null, new C03771(null), 3);
    }

    @Override // zendesk.android.messaging.Messaging
    public void enableAnalyticsTracking(boolean enabled) {
        f0.B(this.coroutineScope, null, null, new C03791(enabled, null), 3);
    }

    @NotNull
    /* JADX INFO: renamed from: getConversationFieldManager$zendesk_messaging_messaging_android, reason: from getter */
    public final ConversationFieldManager getConversationFieldManager() {
        return this.conversationFieldManager;
    }

    @Nullable
    /* JADX INFO: renamed from: getConversationsListStorageBuilder$zendesk_messaging_messaging_android, reason: from getter */
    public final ConversationsListStorageBuilder getConversationsListStorageBuilder() {
        return this.conversationsListStorageBuilder;
    }

    @NotNull
    /* JADX INFO: renamed from: getFeatureFlagManager$zendesk_messaging_messaging_android, reason: from getter */
    public final FeatureFlagManager getFeatureFlagManager() {
        return this.featureFlagManager;
    }

    @NotNull
    /* JADX INFO: renamed from: getMessagingComponent$zendesk_messaging_messaging_android, reason: from getter */
    public final MessagingComponent getMessagingComponent() {
        return this.messagingComponent;
    }

    @NotNull
    /* JADX INFO: renamed from: getMessagingSettings$zendesk_messaging_messaging_android, reason: from getter */
    public final MessagingSettings getMessagingSettings() {
        return this.messagingSettings;
    }

    @Override // zendesk.android.messaging.Messaging
    public int getUnreadMessageCount(@NotNull String conversationId) {
        conversationId.getClass();
        return this.unreadMessageCounter.getUnreadMessageCount(conversationId);
    }

    public final void handleProactiveMessageEvent$zendesk_messaging_messaging_android(@Nullable Integer proactiveMessageId, @NotNull ProactiveMessageEvent event) {
        event.getClass();
        f0.B(this.coroutineScope, null, null, new DefaultMessaging$handleProactiveMessageEvent$1(proactiveMessageId, this, event, null), 3);
    }

    @NotNull
    public final Intent messagingScreenIntent$zendesk_messaging_messaging_android(@NotNull Context context, int intentFlags, @NotNull MessagingScreen messagingScreen) {
        context.getClass();
        messagingScreen.getClass();
        return new MessagingActivityIntentBuilder(context, this.credentials, null, messagingScreen, 4, null).withFlags(intentFlags).getIntent();
    }

    @Override // zendesk.android.messaging.Messaging
    public void setConversationFields(@NotNull Map<String, ? extends Object> fields) {
        fields.getClass();
        f0.B(this.coroutineScope, null, null, new C03821(fields, null), 3);
    }

    @Override // zendesk.android.messaging.Messaging
    public void setConversationTags(@NotNull List<String> tags) {
        tags.getClass();
        f0.B(this.coroutineScope, null, null, new C03831(tags, null), 3);
    }

    @Override // zendesk.android.messaging.Messaging
    public void showMessaging(@NotNull Context context) {
        context.getClass();
        startMessaging(context, 0, new MessagingScreen.MostRecentActiveConversation(MessagingScreen.ExitAction.ReturnToConversationList));
    }

    @Override // zendesk.android.messaging.Messaging
    public int getUnreadMessageCount() {
        return this.unreadMessageCounter.getTotalUnreadMessageCount();
    }

    @Override // zendesk.android.messaging.Messaging
    public void showMessaging(@NotNull Context context, int intentFlags) {
        context.getClass();
        startMessaging(context, intentFlags, new MessagingScreen.MostRecentActiveConversation(MessagingScreen.ExitAction.ReturnToConversationList));
    }

    @Override // zendesk.android.messaging.Messaging
    public void showMessaging(@NotNull Context context, @NotNull MessagingScreen screen) {
        context.getClass();
        screen.getClass();
        startMessaging(context, 0, screen);
    }

    @Override // zendesk.android.messaging.Messaging
    public void showMessaging(@NotNull Context context, @NotNull MessagingScreen screen, int intentFlags) {
        context.getClass();
        screen.getClass();
        startMessaging(context, intentFlags, screen);
    }

    public /* synthetic */ DefaultMessaging(ZendeskCredentials zendeskCredentials, MessagingSettings messagingSettings, ConversationKit conversationKit, ProcessLifecycleEventObserver processLifecycleEventObserver, b0 b0Var, UnreadMessageCounter unreadMessageCounter, LocalNotificationHandler localNotificationHandler, MessagingComponent messagingComponent, ConversationsListStorageBuilder conversationsListStorageBuilder, ConversationFieldManager conversationFieldManager, FeatureFlagManager featureFlagManager, x xVar, MessagingEventDispatcher messagingEventDispatcher, AnalyticsProcessor analyticsProcessor, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(zendeskCredentials, messagingSettings, conversationKit, processLifecycleEventObserver, b0Var, (i11 & 32) != 0 ? UnreadMessageCounter.INSTANCE : unreadMessageCounter, localNotificationHandler, messagingComponent, (i11 & 256) != 0 ? null : conversationsListStorageBuilder, conversationFieldManager, featureFlagManager, xVar, messagingEventDispatcher, analyticsProcessor);
    }
}
