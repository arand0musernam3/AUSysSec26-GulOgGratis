package zendesk.messaging.android.internal.validation;

import s70.c;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.core.android.internal.app.FeatureFlagManager;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConversationFieldManager_Factory implements c {
    private final c conversationFieldValidatorProvider;
    private final c conversationKitProvider;
    private final c featureFlagManagerProvider;
    private final c messagingEventDispatcherProvider;

    private ConversationFieldManager_Factory(c cVar, c cVar2, c cVar3, c cVar4) {
        this.conversationFieldValidatorProvider = cVar;
        this.conversationKitProvider = cVar2;
        this.messagingEventDispatcherProvider = cVar3;
        this.featureFlagManagerProvider = cVar4;
    }

    public static ConversationFieldManager_Factory create(c cVar, c cVar2, c cVar3, c cVar4) {
        return new ConversationFieldManager_Factory(cVar, cVar2, cVar3, cVar4);
    }

    public static ConversationFieldManager newInstance(ConversationFieldValidator conversationFieldValidator, ConversationKit conversationKit, MessagingEventDispatcher messagingEventDispatcher, FeatureFlagManager featureFlagManager) {
        return new ConversationFieldManager(conversationFieldValidator, conversationKit, messagingEventDispatcher, featureFlagManager);
    }

    @Override // t70.a
    public ConversationFieldManager get() {
        return newInstance((ConversationFieldValidator) this.conversationFieldValidatorProvider.get(), (ConversationKit) this.conversationKitProvider.get(), (MessagingEventDispatcher) this.messagingEventDispatcherProvider.get(), (FeatureFlagManager) this.featureFlagManagerProvider.get());
    }
}
