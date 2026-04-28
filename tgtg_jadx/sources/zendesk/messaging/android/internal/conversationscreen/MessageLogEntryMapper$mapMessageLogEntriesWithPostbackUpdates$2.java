package zendesk.messaging.android.internal.conversationscreen;

import com.braze.h2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import v80.b0;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageAction;
import zendesk.conversationkit.android.model.MessageContent;
import zendesk.messaging.android.internal.conversationscreen.MessageLogEntryMapper;
import zendesk.messaging.android.internal.model.MessageLogEntry;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@z70.e(c = "zendesk.messaging.android.internal.conversationscreen.MessageLogEntryMapper$mapMessageLogEntriesWithPostbackUpdates$2", f = "MessageLogEntryMapper.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper$MessageLogEntryUpdatedPostback;", "<anonymous>", "(Lv80/b0;)Lzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper$MessageLogEntryUpdatedPostback;"}, k = 3, mv = {2, 1, 0})
@SourceDebugExtension({"SMAP\nMessageLogEntryMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageLogEntryMapper.kt\nzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper$mapMessageLogEntriesWithPostbackUpdates$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,634:1\n1869#2,2:635\n*S KotlinDebug\n*F\n+ 1 MessageLogEntryMapper.kt\nzendesk/messaging/android/internal/conversationscreen/MessageLogEntryMapper$mapMessageLogEntriesWithPostbackUpdates$2\n*L\n494#1:635,2\n*E\n"})
public final class MessageLogEntryMapper$mapMessageLogEntriesWithPostbackUpdates$2 extends z70.i implements Function2<b0, x70.c<? super MessageLogEntryMapper.MessageLogEntryUpdatedPostback>, Object> {
    final /* synthetic */ String $actionId;
    final /* synthetic */ ConversationScreenPostbackStatus $conversationScreenPostbackStatus;
    final /* synthetic */ Map<String, ConversationScreenPostbackStatus> $mapOfPostbackStatuses;
    final /* synthetic */ List<MessageLogEntry> $messageLogEntryList;
    int label;
    final /* synthetic */ MessageLogEntryMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MessageLogEntryMapper$mapMessageLogEntriesWithPostbackUpdates$2(Map<String, ConversationScreenPostbackStatus> map, String str, ConversationScreenPostbackStatus conversationScreenPostbackStatus, List<? extends MessageLogEntry> list, MessageLogEntryMapper messageLogEntryMapper, x70.c<? super MessageLogEntryMapper$mapMessageLogEntriesWithPostbackUpdates$2> cVar) {
        super(2, cVar);
        this.$mapOfPostbackStatuses = map;
        this.$actionId = str;
        this.$conversationScreenPostbackStatus = conversationScreenPostbackStatus;
        this.$messageLogEntryList = list;
        this.this$0 = messageLogEntryMapper;
    }

    @Override // z70.a
    public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
        return new MessageLogEntryMapper$mapMessageLogEntriesWithPostbackUpdates$2(this.$mapOfPostbackStatuses, this.$actionId, this.$conversationScreenPostbackStatus, this.$messageLogEntryList, this.this$0, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, x70.c<? super MessageLogEntryMapper.MessageLogEntryUpdatedPostback> cVar) {
        return ((MessageLogEntryMapper$mapMessageLogEntriesWithPostbackUpdates$2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ba0.g.M(obj);
        Pair<Map<String, ConversationScreenPostbackStatus>, Boolean> pairUpdatePostbackStatus$zendesk_messaging_messaging_android = PostbackMessageStatusUseCase.INSTANCE.updatePostbackStatus$zendesk_messaging_messaging_android(this.$mapOfPostbackStatuses, this.$actionId, this.$conversationScreenPostbackStatus);
        Map map = (Map) pairUpdatePostbackStatus$zendesk_messaging_messaging_android.f26485a;
        boolean zBooleanValue = ((Boolean) pairUpdatePostbackStatus$zendesk_messaging_messaging_android.f26486b).booleanValue();
        ArrayList arrayList = new ArrayList();
        List<MessageLogEntry> list = this.$messageLogEntryList;
        MessageLogEntryMapper messageLogEntryMapper = this.this$0;
        Map<String, ConversationScreenPostbackStatus> map2 = this.$mapOfPostbackStatuses;
        for (MessageLogEntry messageLogEntry : list) {
            if (messageLogEntry instanceof MessageLogEntry.MessageContainer) {
                MessageLogEntry.MessageContainer messageContainer = (MessageLogEntry.MessageContainer) messageLogEntry;
                MessageContent content = messageContainer.getMessage().getContent();
                if (content instanceof MessageContent.Text) {
                    MessageContent content2 = messageContainer.getMessage().getContent();
                    content2.getClass();
                    MessageContent.Text text = (MessageContent.Text) content2;
                    List<MessageAction> actions = text.getActions();
                    if (actions == null || actions.isEmpty()) {
                        arrayList.add(messageLogEntry);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        messageLogEntryMapper.processMessageActions(actions, map, arrayList2);
                        arrayList.add(MessageLogEntry.MessageContainer.copy$default(messageContainer, null, null, null, null, null, null, null, null, Message.copy$default(messageContainer.getMessage(), null, null, null, null, null, 0.0d, MessageContent.Text.copy$default(text, null, arrayList2, null, null, null, 29, null), null, null, null, null, 1983, null), null, 767, null));
                    }
                } else if (content instanceof MessageContent.Image) {
                    MessageContent content3 = messageContainer.getMessage().getContent();
                    content3.getClass();
                    MessageContent.Image image = (MessageContent.Image) content3;
                    List<MessageAction> actions2 = image.getActions();
                    if (actions2 == null || actions2.isEmpty()) {
                        arrayList.add(messageLogEntry);
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        messageLogEntryMapper.processMessageActions(actions2, map2, arrayList3);
                        arrayList.add(MessageLogEntry.MessageContainer.copy$default(messageContainer, null, null, null, null, null, null, null, null, Message.copy$default(messageContainer.getMessage(), null, null, null, null, null, 0.0d, MessageContent.Image.copy$default(image, null, null, null, null, 0L, arrayList3, null, null, null, null, null, 2015, null), null, null, null, null, 1983, null), null, 767, null));
                    }
                } else {
                    arrayList.add(messageLogEntry);
                }
            } else {
                arrayList.add(messageLogEntry);
            }
        }
        return new MessageLogEntryMapper.MessageLogEntryUpdatedPostback(arrayList, zBooleanValue, map);
    }
}
