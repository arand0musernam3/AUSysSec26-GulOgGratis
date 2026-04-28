package zendesk.messaging.android.internal.analytics;

import s70.c;
import zendesk.analyticskit.android.AnalyticsKit;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.core.ui.android.internal.local.LocaleProvider;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class AnalyticsProcessor_Factory implements c {
    private final c analyticsKitProvider;
    private final c conversationKitProvider;
    private final c localeProvider;
    private final c messagingSettingsProvider;

    private AnalyticsProcessor_Factory(c cVar, c cVar2, c cVar3, c cVar4) {
        this.analyticsKitProvider = cVar;
        this.conversationKitProvider = cVar2;
        this.localeProvider = cVar3;
        this.messagingSettingsProvider = cVar4;
    }

    public static AnalyticsProcessor_Factory create(c cVar, c cVar2, c cVar3, c cVar4) {
        return new AnalyticsProcessor_Factory(cVar, cVar2, cVar3, cVar4);
    }

    public static AnalyticsProcessor newInstance(AnalyticsKit analyticsKit, ConversationKit conversationKit, LocaleProvider localeProvider, MessagingSettings messagingSettings) {
        return new AnalyticsProcessor(analyticsKit, conversationKit, localeProvider, messagingSettings);
    }

    @Override // t70.a
    public AnalyticsProcessor get() {
        return newInstance((AnalyticsKit) this.analyticsKitProvider.get(), (ConversationKit) this.conversationKitProvider.get(), (LocaleProvider) this.localeProvider.get(), (MessagingSettings) this.messagingSettingsProvider.get());
    }
}
