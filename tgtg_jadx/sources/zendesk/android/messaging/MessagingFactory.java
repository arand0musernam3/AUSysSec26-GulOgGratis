package zendesk.android.messaging;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import zendesk.android.ZendeskCredentials;
import zendesk.android.events.ZendeskEvent;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.android.messaging.model.UserColors;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.core.android.internal.InternalZendeskApi;
import zendesk.core.android.internal.app.FeatureFlagManager;
import zendesk.core.ui.android.internal.app.ProcessLifecycleEventObserver;
import zendesk.messaging.android.internal.di.MessagingComponentKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\fJ\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\r"}, d2 = {"Lzendesk/android/messaging/MessagingFactory;", "", MessagingComponentKt.USER_LIGHT_COLORS, "Lzendesk/android/messaging/model/UserColors;", "getUserLightColors", "()Lzendesk/android/messaging/model/UserColors;", MessagingComponentKt.USER_DARK_COLORS, "getUserDarkColors", "create", "Lzendesk/android/messaging/Messaging;", "params", "Lzendesk/android/messaging/MessagingFactory$CreateParams;", "CreateParams", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MessagingFactory {
    @NotNull
    Messaging create(@NotNull CreateParams params);

    @Nullable
    UserColors getUserDarkColors();

    @Nullable
    UserColors getUserLightColors();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @InternalZendeskApi
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001Bu\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u00103\u001a\u0004\b6\u00105R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lzendesk/android/messaging/MessagingFactory$CreateParams;", "", "Landroid/content/Context;", "context", "Lzendesk/android/ZendeskCredentials;", "credentials", "", "baseUrl", "Lzendesk/conversationkit/android/ConversationKit;", "conversationKit", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "Lv80/b0;", "coroutineScope", "Lkotlin/Function1;", "Lzendesk/android/events/ZendeskEvent;", "", "dispatchEvent", "Lzendesk/core/android/internal/app/FeatureFlagManager;", "featureFlagManager", "Lzendesk/android/messaging/model/UserColors;", MessagingComponentKt.USER_LIGHT_COLORS, MessagingComponentKt.USER_DARK_COLORS, "Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;", "processLifecycleEventObserver", "<init>", "(Landroid/content/Context;Lzendesk/android/ZendeskCredentials;Ljava/lang/String;Lzendesk/conversationkit/android/ConversationKit;Lzendesk/android/messaging/model/MessagingSettings;Lv80/b0;Lkotlin/jvm/functions/Function1;Lzendesk/core/android/internal/app/FeatureFlagManager;Lzendesk/android/messaging/model/UserColors;Lzendesk/android/messaging/model/UserColors;Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lzendesk/android/ZendeskCredentials;", "getCredentials", "()Lzendesk/android/ZendeskCredentials;", "Ljava/lang/String;", "getBaseUrl", "()Ljava/lang/String;", "Lzendesk/conversationkit/android/ConversationKit;", "getConversationKit", "()Lzendesk/conversationkit/android/ConversationKit;", "Lzendesk/android/messaging/model/MessagingSettings;", "getMessagingSettings", "()Lzendesk/android/messaging/model/MessagingSettings;", "Lv80/b0;", "getCoroutineScope", "()Lv80/b0;", "Lkotlin/jvm/functions/Function1;", "getDispatchEvent", "()Lkotlin/jvm/functions/Function1;", "Lzendesk/core/android/internal/app/FeatureFlagManager;", "getFeatureFlagManager", "()Lzendesk/core/android/internal/app/FeatureFlagManager;", "Lzendesk/android/messaging/model/UserColors;", "getUserLightColors", "()Lzendesk/android/messaging/model/UserColors;", "getUserDarkColors", "Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;", "getProcessLifecycleEventObserver", "()Lzendesk/core/ui/android/internal/app/ProcessLifecycleEventObserver;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CreateParams {

        @NotNull
        private final String baseUrl;

        @NotNull
        private final Context context;

        @NotNull
        private final ConversationKit conversationKit;

        @NotNull
        private final b0 coroutineScope;

        @NotNull
        private final ZendeskCredentials credentials;

        @NotNull
        private final Function1<ZendeskEvent, Unit> dispatchEvent;

        @NotNull
        private final FeatureFlagManager featureFlagManager;

        @NotNull
        private final MessagingSettings messagingSettings;

        @NotNull
        private final ProcessLifecycleEventObserver processLifecycleEventObserver;

        @Nullable
        private final UserColors userDarkColors;

        @Nullable
        private final UserColors userLightColors;

        /* JADX WARN: Multi-variable type inference failed */
        public CreateParams(@NotNull Context context, @NotNull ZendeskCredentials zendeskCredentials, @NotNull String str, @NotNull ConversationKit conversationKit, @NotNull MessagingSettings messagingSettings, @NotNull b0 b0Var, @NotNull Function1<? super ZendeskEvent, Unit> function1, @NotNull FeatureFlagManager featureFlagManager, @Nullable UserColors userColors, @Nullable UserColors userColors2, @NotNull ProcessLifecycleEventObserver processLifecycleEventObserver) {
            context.getClass();
            zendeskCredentials.getClass();
            str.getClass();
            conversationKit.getClass();
            messagingSettings.getClass();
            b0Var.getClass();
            function1.getClass();
            featureFlagManager.getClass();
            processLifecycleEventObserver.getClass();
            this.context = context;
            this.credentials = zendeskCredentials;
            this.baseUrl = str;
            this.conversationKit = conversationKit;
            this.messagingSettings = messagingSettings;
            this.coroutineScope = b0Var;
            this.dispatchEvent = function1;
            this.featureFlagManager = featureFlagManager;
            this.userLightColors = userColors;
            this.userDarkColors = userColors2;
            this.processLifecycleEventObserver = processLifecycleEventObserver;
        }

        @NotNull
        public final String getBaseUrl() {
            return this.baseUrl;
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @NotNull
        public final ConversationKit getConversationKit() {
            return this.conversationKit;
        }

        @NotNull
        public final b0 getCoroutineScope() {
            return this.coroutineScope;
        }

        @NotNull
        public final ZendeskCredentials getCredentials() {
            return this.credentials;
        }

        @NotNull
        public final Function1<ZendeskEvent, Unit> getDispatchEvent() {
            return this.dispatchEvent;
        }

        @NotNull
        public final FeatureFlagManager getFeatureFlagManager() {
            return this.featureFlagManager;
        }

        @NotNull
        public final MessagingSettings getMessagingSettings() {
            return this.messagingSettings;
        }

        @NotNull
        public final ProcessLifecycleEventObserver getProcessLifecycleEventObserver() {
            return this.processLifecycleEventObserver;
        }

        @Nullable
        public final UserColors getUserDarkColors() {
            return this.userDarkColors;
        }

        @Nullable
        public final UserColors getUserLightColors() {
            return this.userLightColors;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ CreateParams(Context context, ZendeskCredentials zendeskCredentials, String str, ConversationKit conversationKit, MessagingSettings messagingSettings, b0 b0Var, Function1 function1, FeatureFlagManager featureFlagManager, UserColors userColors, UserColors userColors2, ProcessLifecycleEventObserver processLifecycleEventObserver, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            ProcessLifecycleEventObserver processLifecycleEventObserver2;
            UserColors userColors3;
            userColors = (i11 & 256) != 0 ? null : userColors;
            if ((i11 & 512) != 0) {
                processLifecycleEventObserver2 = processLifecycleEventObserver;
                userColors3 = null;
            } else {
                processLifecycleEventObserver2 = processLifecycleEventObserver;
                userColors3 = userColors2;
            }
            this(context, zendeskCredentials, str, conversationKit, messagingSettings, b0Var, function1, featureFlagManager, userColors, userColors3, processLifecycleEventObserver2);
        }
    }
}
