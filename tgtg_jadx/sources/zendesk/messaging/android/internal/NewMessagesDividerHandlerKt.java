package zendesk.messaging.android.internal;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.Participant;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"hasNewInboundMessages", "", "Lzendesk/conversationkit/android/model/Conversation;", "zendesk.messaging_messaging-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNewMessagesDividerHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewMessagesDividerHandler.kt\nzendesk/messaging/android/internal/NewMessagesDividerHandlerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n774#2:72\n865#2,2:73\n1999#2,14:75\n*S KotlinDebug\n*F\n+ 1 NewMessagesDividerHandler.kt\nzendesk/messaging/android/internal/NewMessagesDividerHandlerKt\n*L\n60#1:72\n60#1:73,2\n61#1:75,14\n*E\n"})
public final class NewMessagesDividerHandlerKt {
    public static final boolean hasNewInboundMessages(@NotNull Conversation conversation) {
        Object next;
        conversation.getClass();
        if (!conversation.getMessages().isEmpty()) {
            List<Message> messages = conversation.getMessages();
            ArrayList arrayList = new ArrayList();
            for (Object obj : messages) {
                if (!((Message) obj).isAuthoredBy(conversation.getMyself())) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    Date received = ((Message) next).getReceived();
                    do {
                        Object next2 = it.next();
                        Date received2 = ((Message) next2).getReceived();
                        if (received.compareTo(received2) < 0) {
                            next = next2;
                            received = received2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            Message message = (Message) next;
            Date received3 = message != null ? message.getReceived() : null;
            Participant myself = conversation.getMyself();
            Date lastRead = myself != null ? myself.getLastRead() : null;
            if (lastRead != null && received3 != null && lastRead.compareTo(received3) < 0) {
                return true;
            }
        }
        return false;
    }
}
