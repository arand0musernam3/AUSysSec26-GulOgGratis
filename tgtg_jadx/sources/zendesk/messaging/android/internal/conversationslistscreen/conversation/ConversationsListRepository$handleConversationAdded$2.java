package zendesk.messaging.android.internal.conversationslistscreen.conversation;

import ba0.g;
import com.braze.h2;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import x70.c;
import y70.a;
import z70.e;
import z70.i;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.core.ui.android.internal.model.ConversationEntry;
import zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState;
import zendesk.messaging.android.internal.model.MessagingTheme;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@e(c = "zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository$handleConversationAdded$2", f = "ConversationsListRepository.kt", l = {87}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;", "<anonymous>", "(Lv80/b0;)Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;"}, k = 3, mv = {2, 1, 0})
public final class ConversationsListRepository$handleConversationAdded$2 extends i implements Function2<b0, c<? super ConversationsListScreenState>, Object> {
    final /* synthetic */ Conversation $conversation;
    final /* synthetic */ ConversationsListScreenState $state;
    int label;
    final /* synthetic */ ConversationsListRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationsListRepository$handleConversationAdded$2(ConversationsListRepository conversationsListRepository, Conversation conversation, ConversationsListScreenState conversationsListScreenState, c<? super ConversationsListRepository$handleConversationAdded$2> cVar) {
        super(2, cVar);
        this.this$0 = conversationsListRepository;
        this.$conversation = conversation;
        this.$state = conversationsListScreenState;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new ConversationsListRepository$handleConversationAdded$2(this.this$0, this.$conversation, this.$state, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, c<? super ConversationsListScreenState> cVar) {
        return ((ConversationsListRepository$handleConversationAdded$2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            g.M(obj);
            ConversationLogEntryMapper conversationLogEntryMapper = this.this$0.mapper;
            Conversation conversation = this.$conversation;
            MessagingTheme messagingTheme = this.$state.getMessagingTheme();
            this.label = 1;
            obj = conversationLogEntryMapper.mapToConversationEntry$zendesk_messaging_messaging_android(conversation, messagingTheme, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
        }
        Collection<ConversationEntry> collectionValues = this.this$0.conversationsListInMemoryCache.conversations().values();
        ConversationsListScreenState conversationsListScreenStateUpdateStateWithNewConversationEntryFromWebSocketEvent = this.this$0.updateStateWithNewConversationEntryFromWebSocketEvent((ConversationEntry) obj, this.$state, collectionValues);
        this.this$0.updateInMemoryConversations(conversationsListScreenStateUpdateStateWithNewConversationEntryFromWebSocketEvent.getConversations());
        return conversationsListScreenStateUpdateStateWithNewConversationEntryFromWebSocketEvent;
    }
}
