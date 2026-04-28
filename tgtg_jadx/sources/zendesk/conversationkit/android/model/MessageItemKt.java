package zendesk.conversationkit.android.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import zendesk.conversationkit.android.internal.rest.model.MessageActionDto;
import zendesk.conversationkit.android.internal.rest.model.MessageItemDto;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toItem", "Lzendesk/conversationkit/android/model/MessageItem;", "Lzendesk/conversationkit/android/internal/rest/model/MessageItemDto;", "sourceType", "", "zendesk.conversationkit_conversationkit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageItem.kt\nzendesk/conversationkit/android/model/MessageItemKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1617#2,9:62\n1869#2:71\n1870#2:73\n1626#2:74\n1#3:72\n*S KotlinDebug\n*F\n+ 1 MessageItem.kt\nzendesk/conversationkit/android/model/MessageItemKt\n*L\n55#1:62,9\n55#1:71\n55#1:73\n55#1:74\n55#1:72\n*E\n"})
public final class MessageItemKt {
    @NotNull
    public static final MessageItem toItem(@NotNull MessageItemDto messageItemDto, @NotNull String str) {
        messageItemDto.getClass();
        str.getClass();
        String title = messageItemDto.getTitle();
        String description = messageItemDto.getDescription();
        List<MessageActionDto> actions = messageItemDto.getActions();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = actions.iterator();
        while (it.hasNext()) {
            MessageAction action = MessageActionKt.toAction((MessageActionDto) it.next(), str);
            if (action != null) {
                arrayList.add(action);
            }
        }
        return new MessageItem(title, description, arrayList, Intrinsics.areEqual(messageItemDto.getSize(), "large") ? MessageItemSize.LARGE : MessageItemSize.COMPACT, messageItemDto.getMetadata(), messageItemDto.getMediaUrl(), messageItemDto.getMediaType());
    }
}
