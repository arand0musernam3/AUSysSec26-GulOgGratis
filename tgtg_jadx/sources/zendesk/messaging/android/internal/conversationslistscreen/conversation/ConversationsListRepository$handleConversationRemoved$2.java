package zendesk.messaging.android.internal.conversationslistscreen.conversation;

import ba0.g;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o30.f0;
import v80.b0;
import x70.c;
import y70.a;
import z70.e;
import z70.i;
import zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@e(c = "zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository$handleConversationRemoved$2", f = "ConversationsListRepository.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;", "<anonymous>", "(Lv80/b0;)Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;"}, k = 3, mv = {2, 1, 0})
public final class ConversationsListRepository$handleConversationRemoved$2 extends i implements Function2<b0, c<? super ConversationsListScreenState>, Object> {
    final /* synthetic */ String $conversationId;
    final /* synthetic */ ConversationsListScreenState $state;
    int label;
    final /* synthetic */ ConversationsListRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationsListRepository$handleConversationRemoved$2(ConversationsListScreenState conversationsListScreenState, ConversationsListRepository conversationsListRepository, String str, c<? super ConversationsListRepository$handleConversationRemoved$2> cVar) {
        super(2, cVar);
        this.$state = conversationsListScreenState;
        this.this$0 = conversationsListRepository;
        this.$conversationId = str;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new ConversationsListRepository$handleConversationRemoved$2(this.$state, this.this$0, this.$conversationId, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, c<? super ConversationsListScreenState> cVar) {
        return ((ConversationsListRepository$handleConversationRemoved$2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g.M(obj);
        ConversationsListScreenState conversationsListScreenState = this.$state;
        ConversationsListRepository conversationsListRepository = this.this$0;
        ConversationsListScreenState conversationsListScreenStateConversationsList = ConversationsListStateHelperKt.conversationsList(conversationsListScreenState, f0.V(conversationsListRepository.removeExistingConversationEntryFromWebSocketEvent(this.$conversationId, conversationsListRepository.conversationsListInMemoryCache.conversations().values(), this.$state)));
        this.this$0.updateInMemoryConversations(conversationsListScreenStateConversationsList.getConversations());
        return conversationsListScreenStateConversationsList;
    }
}
