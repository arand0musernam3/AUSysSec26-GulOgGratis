package zendesk.messaging.android.internal.validation;

import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConversationFieldRepository_Factory implements c {
    private final c conversationFieldServiceProvider;

    private ConversationFieldRepository_Factory(c cVar) {
        this.conversationFieldServiceProvider = cVar;
    }

    public static ConversationFieldRepository_Factory create(c cVar) {
        return new ConversationFieldRepository_Factory(cVar);
    }

    public static ConversationFieldRepository newInstance(ConversationFieldService conversationFieldService) {
        return new ConversationFieldRepository(conversationFieldService);
    }

    @Override // t70.a
    public ConversationFieldRepository get() {
        return newInstance((ConversationFieldService) this.conversationFieldServiceProvider.get());
    }
}
