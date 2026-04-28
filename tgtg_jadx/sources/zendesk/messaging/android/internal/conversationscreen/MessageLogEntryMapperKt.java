package zendesk.messaging.android.internal.conversationscreen;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageContent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a)\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzendesk/conversationkit/android/model/Message;", "Lkotlin/Function1;", "", "quotedMessageFinder", "overrideWithQuotedMessageDetails", "(Lzendesk/conversationkit/android/model/Message;Lkotlin/jvm/functions/Function1;)Lzendesk/conversationkit/android/model/Message;", "zendesk.messaging_messaging-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MessageLogEntryMapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Message overrideWithQuotedMessageDetails(Message message, Function1<? super String, Message> function1) {
        Message message2;
        MessageContent content = message.getContent();
        return ((content instanceof MessageContent.FormResponse) && (message2 = (Message) function1.invoke(((MessageContent.FormResponse) content).getQuotedMessageId())) != null) ? Message.copy$default(message, null, message2.getAuthor(), null, message2.getCreated(), message2.getReceived(), 0.0d, null, null, null, null, null, 2021, null) : message;
    }
}
