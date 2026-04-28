package zendesk.messaging.android;

import android.content.Context;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import yu.a;
import zendesk.android.ZendeskCredentials;
import zendesk.android.events.ZendeskEvent;
import zendesk.android.messaging.MessagingFactory;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.android.messaging.model.UserColors;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.core.android.internal.di.KotlinxSerializationModule;
import zendesk.core.ui.android.internal.app.ProcessLifecycleEventObserver;
import zendesk.messaging.android.internal.DefaultMessaging;
import zendesk.messaging.android.internal.UnreadMessageCounter;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListStorageBuilder;
import zendesk.messaging.android.internal.di.DaggerMessagingComponent;
import zendesk.messaging.android.internal.di.MessagingComponent;
import zendesk.messaging.android.internal.di.MessagingComponentKt;
import zendesk.messaging.android.internal.proactivemessaging.LocalNotificationHandler;
import zendesk.messaging.android.push.internal.NotificationProcessor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u000e"}, d2 = {"Lzendesk/messaging/android/DefaultMessagingFactory;", "Lzendesk/android/messaging/MessagingFactory;", MessagingComponentKt.USER_LIGHT_COLORS, "Lzendesk/android/messaging/model/UserColors;", MessagingComponentKt.USER_DARK_COLORS, "<init>", "(Lzendesk/android/messaging/model/UserColors;Lzendesk/android/messaging/model/UserColors;)V", "getUserLightColors", "()Lzendesk/android/messaging/model/UserColors;", "getUserDarkColors", "create", "Lzendesk/android/messaging/Messaging;", "params", "Lzendesk/android/messaging/MessagingFactory$CreateParams;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultMessagingFactory implements MessagingFactory {

    @Nullable
    private final UserColors userDarkColors;

    @Nullable
    private final UserColors userLightColors;

    public /* synthetic */ DefaultMessagingFactory(UserColors userColors, UserColors userColors2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : userColors, (i11 & 2) != 0 ? null : userColors2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date create$lambda$0() {
        return new Date();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zendesk.android.messaging.MessagingFactory
    @NotNull
    public zendesk.android.messaging.Messaging create(@NotNull MessagingFactory.CreateParams params) {
        params.getClass();
        MessagingComponent.Factory factory = DaggerMessagingComponent.factory();
        Context applicationContext = params.getContext().getApplicationContext();
        applicationContext.getClass();
        ZendeskCredentials credentials = params.getCredentials();
        String baseUrl = params.getBaseUrl();
        MessagingSettings messagingSettings = params.getMessagingSettings();
        Function1<ZendeskEvent, Unit> dispatchEvent = params.getDispatchEvent();
        b0 coroutineScope = params.getCoroutineScope();
        ConversationKit conversationKit = params.getConversationKit();
        UserColors userLightColors = params.getUserLightColors();
        if (userLightColors == null) {
            userLightColors = new UserColors(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        }
        UserColors userDarkColors = params.getUserDarkColors();
        if (userDarkColors == null) {
            userDarkColors = new UserColors(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        }
        MessagingComponent messagingComponentCreate = factory.create(applicationContext, credentials, baseUrl, messagingSettings, conversationKit, dispatchEvent, coroutineScope, userLightColors, userDarkColors, params.getFeatureFlagManager(), new a(28), new a(29), params.getProcessLifecycleEventObserver());
        ZendeskCredentials credentials2 = params.getCredentials();
        MessagingSettings messagingSettings2 = params.getMessagingSettings();
        ConversationKit conversationKit2 = params.getConversationKit();
        ProcessLifecycleEventObserver processLifecycleEventObserver = params.getProcessLifecycleEventObserver();
        b0 coroutineScope2 = params.getCoroutineScope();
        UnreadMessageCounter unreadMessageCounter = UnreadMessageCounter.INSTANCE;
        Context context = params.getContext();
        KotlinxSerializationModule kotlinxSerializationModule = KotlinxSerializationModule.INSTANCE;
        LocalNotificationHandler localNotificationHandler = new LocalNotificationHandler(new NotificationProcessor(null, kotlinxSerializationModule.provideJson(), 1, 0 == true ? 1 : 0), context);
        Context applicationContext2 = params.getContext().getApplicationContext();
        applicationContext2.getClass();
        return new DefaultMessaging(credentials2, messagingSettings2, conversationKit2, processLifecycleEventObserver, coroutineScope2, unreadMessageCounter, localNotificationHandler, messagingComponentCreate, new ConversationsListStorageBuilder(applicationContext2, null, params.getConversationKit().getConfig().getIntegration().getId(), kotlinxSerializationModule.provideJson(), 2, null), messagingComponentCreate.conversationFieldManager(), params.getFeatureFlagManager(), messagingComponentCreate.mainDispatcher(), messagingComponentCreate.messagingEventDispatcher(), messagingComponentCreate.analyticsProcessor());
    }

    @Override // zendesk.android.messaging.MessagingFactory
    @Nullable
    public UserColors getUserDarkColors() {
        return this.userDarkColors;
    }

    @Override // zendesk.android.messaging.MessagingFactory
    @Nullable
    public UserColors getUserLightColors() {
        return this.userLightColors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultMessagingFactory(@Nullable UserColors userColors) {
        this(userColors, null, 2, 0 == true ? 1 : 0);
    }

    public DefaultMessagingFactory(@Nullable UserColors userColors, @Nullable UserColors userColors2) {
        this.userLightColors = userColors;
        this.userDarkColors = userColors2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultMessagingFactory() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
