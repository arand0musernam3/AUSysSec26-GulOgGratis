package zendesk.messaging.android.internal.conversationslistscreen.conversation;

import com.app.tgtg.model.local.AppConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import x70.c;
import z70.e;
import z70.i;
import zendesk.conversationkit.android.model.Message;
import zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@e(c = "zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository$handleMessageChanged$2", f = "ConversationsListRepository.kt", l = {AppConstants.RESULT_CODE_ORDER_CANCELLED, 127, AppConstants.RESULT_CODE_FLASH_SALES_SURVEY}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;", "<anonymous>", "(Lv80/b0;)Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;"}, k = 3, mv = {2, 1, 0})
public final class ConversationsListRepository$handleMessageChanged$2 extends i implements Function2<b0, c<? super ConversationsListScreenState>, Object> {
    final /* synthetic */ String $conversationId;
    final /* synthetic */ Message $message;
    final /* synthetic */ boolean $shouldIncreaseCount;
    final /* synthetic */ boolean $shouldResetCount;
    final /* synthetic */ ConversationsListScreenState $state;
    Object L$0;
    int label;
    final /* synthetic */ ConversationsListRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationsListRepository$handleMessageChanged$2(ConversationsListRepository conversationsListRepository, String str, ConversationsListScreenState conversationsListScreenState, Message message, boolean z11, boolean z12, c<? super ConversationsListRepository$handleMessageChanged$2> cVar) {
        super(2, cVar);
        this.this$0 = conversationsListRepository;
        this.$conversationId = str;
        this.$state = conversationsListScreenState;
        this.$message = message;
        this.$shouldIncreaseCount = z11;
        this.$shouldResetCount = z12;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new ConversationsListRepository$handleMessageChanged$2(this.this$0, this.$conversationId, this.$state, this.$message, this.$shouldIncreaseCount, this.$shouldResetCount, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, c<? super ConversationsListScreenState> cVar) {
        return ((ConversationsListRepository$handleMessageChanged$2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        if (r0 != r9) goto L29;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository$handleMessageChanged$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
