package zendesk.messaging.android.internal.validation.di;

import o00.x0;
import oa0.o0;
import s70.c;
import zendesk.messaging.android.internal.validation.ConversationFieldService;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConversationFieldModule_ProvideConversationFieldServiceFactory implements c {
    private final ConversationFieldModule module;
    private final c retrofitProvider;

    private ConversationFieldModule_ProvideConversationFieldServiceFactory(ConversationFieldModule conversationFieldModule, c cVar) {
        this.module = conversationFieldModule;
        this.retrofitProvider = cVar;
    }

    public static ConversationFieldModule_ProvideConversationFieldServiceFactory create(ConversationFieldModule conversationFieldModule, c cVar) {
        return new ConversationFieldModule_ProvideConversationFieldServiceFactory(conversationFieldModule, cVar);
    }

    public static ConversationFieldService provideConversationFieldService(ConversationFieldModule conversationFieldModule, o0 o0Var) {
        ConversationFieldService conversationFieldServiceProvideConversationFieldService = conversationFieldModule.provideConversationFieldService(o0Var);
        x0.o(conversationFieldServiceProvideConversationFieldService);
        return conversationFieldServiceProvideConversationFieldService;
    }

    @Override // t70.a
    public ConversationFieldService get() {
        return provideConversationFieldService(this.module, (o0) this.retrofitProvider.get());
    }
}
