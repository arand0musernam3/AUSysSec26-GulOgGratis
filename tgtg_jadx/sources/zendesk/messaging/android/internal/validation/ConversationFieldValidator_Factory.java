package zendesk.messaging.android.internal.validation;

import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConversationFieldValidator_Factory implements c {
    private final c conversationFieldRepositoryProvider;
    private final c rulesProvider;

    private ConversationFieldValidator_Factory(c cVar, c cVar2) {
        this.rulesProvider = cVar;
        this.conversationFieldRepositoryProvider = cVar2;
    }

    public static ConversationFieldValidator_Factory create(c cVar, c cVar2) {
        return new ConversationFieldValidator_Factory(cVar, cVar2);
    }

    public static ConversationFieldValidator newInstance(ValidationRules validationRules, ConversationFieldRepository conversationFieldRepository) {
        return new ConversationFieldValidator(validationRules, conversationFieldRepository);
    }

    @Override // t70.a
    public ConversationFieldValidator get() {
        return newInstance((ValidationRules) this.rulesProvider.get(), (ConversationFieldRepository) this.conversationFieldRepositoryProvider.get());
    }
}
