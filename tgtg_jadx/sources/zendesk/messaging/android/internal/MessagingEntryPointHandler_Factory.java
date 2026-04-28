package zendesk.messaging.android.internal;

import s70.c;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.conversationkit.android.ConversationKit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class MessagingEntryPointHandler_Factory implements c {
    private final c conversationKitProvider;
    private final c messagingSettingsProvider;

    private MessagingEntryPointHandler_Factory(c cVar, c cVar2) {
        this.conversationKitProvider = cVar;
        this.messagingSettingsProvider = cVar2;
    }

    public static MessagingEntryPointHandler_Factory create(c cVar, c cVar2) {
        return new MessagingEntryPointHandler_Factory(cVar, cVar2);
    }

    public static MessagingEntryPointHandler newInstance(ConversationKit conversationKit, MessagingSettings messagingSettings) {
        return new MessagingEntryPointHandler(conversationKit, messagingSettings);
    }

    @Override // t70.a
    public MessagingEntryPointHandler get() {
        return newInstance((ConversationKit) this.conversationKitProvider.get(), (MessagingSettings) this.messagingSettingsProvider.get());
    }
}
