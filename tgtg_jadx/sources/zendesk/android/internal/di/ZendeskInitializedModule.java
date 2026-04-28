package zendesk.android.internal.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.android.messaging.Messaging;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.core.android.internal.app.FeatureFlagManager;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0007J\b\u0010\r\u001a\u00020\u0003H\u0007J\b\u0010\u000e\u001a\u00020\u0007H\u0007J\b\u0010\u000f\u001a\u00020\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lzendesk/android/internal/di/ZendeskInitializedModule;", "", "conversationKit", "Lzendesk/conversationkit/android/ConversationKit;", AnalyticsProcessor.CHANNEL, "Lzendesk/android/messaging/Messaging;", "featureFlagManager", "Lzendesk/core/android/internal/app/FeatureFlagManager;", "settings", "Lzendesk/android/messaging/model/MessagingSettings;", "<init>", "(Lzendesk/conversationkit/android/ConversationKit;Lzendesk/android/messaging/Messaging;Lzendesk/core/android/internal/app/FeatureFlagManager;Lzendesk/android/messaging/model/MessagingSettings;)V", "providesMessaging", "providesConversationKit", "providesFeatureFlagManager", "providesSettings", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ZendeskInitializedModule {

    @NotNull
    private final ConversationKit conversationKit;

    @NotNull
    private final FeatureFlagManager featureFlagManager;

    @NotNull
    private final Messaging messaging;

    @NotNull
    private final MessagingSettings settings;

    public ZendeskInitializedModule(@NotNull ConversationKit conversationKit, @NotNull Messaging messaging, @NotNull FeatureFlagManager featureFlagManager, @NotNull MessagingSettings messagingSettings) {
        conversationKit.getClass();
        messaging.getClass();
        featureFlagManager.getClass();
        messagingSettings.getClass();
        this.conversationKit = conversationKit;
        this.messaging = messaging;
        this.featureFlagManager = featureFlagManager;
        this.settings = messagingSettings;
    }

    @ZendeskInitializedComponentScope
    @NotNull
    /* JADX INFO: renamed from: providesConversationKit, reason: from getter */
    public final ConversationKit getConversationKit() {
        return this.conversationKit;
    }

    @ZendeskInitializedComponentScope
    @NotNull
    /* JADX INFO: renamed from: providesFeatureFlagManager, reason: from getter */
    public final FeatureFlagManager getFeatureFlagManager() {
        return this.featureFlagManager;
    }

    @ZendeskInitializedComponentScope
    @NotNull
    /* JADX INFO: renamed from: providesMessaging, reason: from getter */
    public final Messaging getMessaging() {
        return this.messaging;
    }

    @ZendeskInitializedComponentScope
    @NotNull
    /* JADX INFO: renamed from: providesSettings, reason: from getter */
    public final MessagingSettings getSettings() {
        return this.settings;
    }
}
