package zendesk.messaging.android.internal.conversationslistscreen.conversation;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import s80.b;
import v80.b0;
import x70.c;
import z70.e;
import z70.i;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@e(c = "zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository$getConversationsEntryList$2", f = "ConversationsListRepository.kt", l = {473}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv80/b0;", "Ls80/b;", "Lzendesk/core/ui/android/internal/model/ConversationEntry;", "<anonymous>", "(Lv80/b0;)Ls80/b;"}, k = 3, mv = {2, 1, 0})
@SourceDebugExtension({"SMAP\nConversationsListRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationsListRepository.kt\nzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationsListRepository$getConversationsEntryList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,681:1\n1563#2:682\n1634#2,3:683\n1068#2:686\n*S KotlinDebug\n*F\n+ 1 ConversationsListRepository.kt\nzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationsListRepository$getConversationsEntryList$2\n*L\n472#1:682\n472#1:683,3\n474#1:686\n*E\n"})
public final class ConversationsListRepository$getConversationsEntryList$2 extends i implements Function2<b0, c<? super b>, Object> {
    final /* synthetic */ List<Conversation> $conversations;
    final /* synthetic */ ConversationsListScreenState $state;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ ConversationsListRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationsListRepository$getConversationsEntryList$2(List<Conversation> list, ConversationsListRepository conversationsListRepository, ConversationsListScreenState conversationsListScreenState, c<? super ConversationsListRepository$getConversationsEntryList$2> cVar) {
        super(2, cVar);
        this.$conversations = list;
        this.this$0 = conversationsListRepository;
        this.$state = conversationsListScreenState;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new ConversationsListRepository$getConversationsEntryList$2(this.$conversations, this.this$0, this.$state, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, c<? super b> cVar) {
        return ((ConversationsListRepository$getConversationsEntryList$2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x006b -> B:15:0x006c). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 1
            if (r1 == 0) goto L28
            if (r1 != r2) goto L21
            java.lang.Object r1 = r8.L$4
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r3 = r8.L$3
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r8.L$2
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r5 = r8.L$1
            zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState r5 = (zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState) r5
            java.lang.Object r6 = r8.L$0
            zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository r6 = (zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository) r6
            ba0.g.M(r9)
            goto L6c
        L21:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L28:
            ba0.g.M(r9)
            java.util.List<zendesk.conversationkit.android.model.Conversation> r9 = r8.$conversations
            zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository r1 = r8.this$0
            zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState r3 = r8.$state
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.e0.o(r9, r5)
            r4.<init>(r5)
            java.util.Iterator r9 = r9.iterator()
            r6 = r1
            r5 = r3
            r3 = r9
        L43:
            r1 = r4
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L72
            java.lang.Object r9 = r3.next()
            zendesk.conversationkit.android.model.Conversation r9 = (zendesk.conversationkit.android.model.Conversation) r9
            zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationLogEntryMapper r4 = zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository.access$getMapper$p(r6)
            zendesk.messaging.android.internal.model.MessagingTheme r7 = r5.getMessagingTheme()
            r8.L$0 = r6
            r8.L$1 = r5
            r8.L$2 = r1
            r8.L$3 = r3
            r8.L$4 = r1
            r8.label = r2
            java.lang.Object r9 = r4.mapToConversationEntry$zendesk_messaging_messaging_android(r9, r7, r8)
            if (r9 != r0) goto L6b
            return r0
        L6b:
            r4 = r1
        L6c:
            zendesk.core.ui.android.internal.model.ConversationEntry r9 = (zendesk.core.ui.android.internal.model.ConversationEntry) r9
            r1.add(r9)
            goto L43
        L72:
            java.util.List r1 = (java.util.List) r1
            zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository$getConversationsEntryList$2$invokeSuspend$$inlined$sortedByDescending$1 r9 = new zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository$getConversationsEntryList$2$invokeSuspend$$inlined$sortedByDescending$1
            r9.<init>()
            java.util.List r9 = kotlin.collections.CollectionsKt.l0(r1, r9)
            s80.b r9 = o30.f0.V(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository$getConversationsEntryList$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
