package zendesk.messaging.android.internal.conversationslistscreen.conversation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z70.c;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@e(c = "zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationLogEntryMapper", f = "ConversationLogEntryMapper.kt", l = {297}, m = "updateConversationEntryWithNewMessage$zendesk_messaging_messaging_android")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class ConversationLogEntryMapper$updateConversationEntryWithNewMessage$1 extends c {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConversationLogEntryMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationLogEntryMapper$updateConversationEntryWithNewMessage$1(ConversationLogEntryMapper conversationLogEntryMapper, x70.c<? super ConversationLogEntryMapper$updateConversationEntryWithNewMessage$1> cVar) {
        super(cVar);
        this.this$0 = conversationLogEntryMapper;
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateConversationEntryWithNewMessage$zendesk_messaging_messaging_android(null, null, null, null, false, 0, null, this);
    }
}
