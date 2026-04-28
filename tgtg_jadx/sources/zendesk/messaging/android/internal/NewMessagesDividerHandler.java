package zendesk.messaging.android.internal;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qc.y;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.Participant;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lzendesk/messaging/android/internal/NewMessagesDividerHandler;", "", "<init>", "()V", "newMessageDivider", "", "", "Ljava/util/Date;", "getNewMessageDividerDate", "conversationId", "updateNewMessageDividerDate", "", MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "Lzendesk/conversationkit/android/model/Conversation;", "clearNewMessageDividerDate", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNewMessagesDividerHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewMessagesDividerHandler.kt\nzendesk/messaging/android/internal/NewMessagesDividerHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n230#2,2:72\n*S KotlinDebug\n*F\n+ 1 NewMessagesDividerHandler.kt\nzendesk/messaging/android/internal/NewMessagesDividerHandler\n*L\n36#1:72,2\n*E\n"})
public final class NewMessagesDividerHandler {

    @NotNull
    private final Map<String, Date> newMessageDivider = new LinkedHashMap();

    public final void clearNewMessageDividerDate(@NotNull String conversationId) {
        conversationId.getClass();
        this.newMessageDivider.remove(conversationId);
    }

    @Nullable
    public final Date getNewMessageDividerDate(@NotNull String conversationId) {
        conversationId.getClass();
        return this.newMessageDivider.get(conversationId);
    }

    public final void updateNewMessageDividerDate(@NotNull Conversation conversation) {
        conversation.getClass();
        Participant myself = conversation.getMyself();
        Date lastRead = myself != null ? myself.getLastRead() : null;
        if (!NewMessagesDividerHandlerKt.hasNewInboundMessages(conversation) || lastRead == null) {
            return;
        }
        Map<String, Date> map = this.newMessageDivider;
        String id2 = conversation.getId();
        for (Message message : conversation.getMessages()) {
            if (!message.isAuthoredBy(conversation.getMyself()) && message.getReceived().compareTo(lastRead) > 0) {
                map.put(id2, message.getReceived());
                return;
            }
        }
        y.h("Collection contains no element matching the predicate.");
    }
}
