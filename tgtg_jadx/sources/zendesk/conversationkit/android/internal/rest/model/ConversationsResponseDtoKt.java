package zendesk.conversationkit.android.internal.rest.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import zendesk.conversationkit.android.model.ConversationKt;
import zendesk.conversationkit.android.model.ConversationsPagination;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toConversationsPagination", "Lzendesk/conversationkit/android/model/ConversationsPagination;", "Lzendesk/conversationkit/android/internal/rest/model/ConversationsResponseDto;", "currentUserId", "", "zendesk.conversationkit_conversationkit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationsResponseDto.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationsResponseDto.kt\nzendesk/conversationkit/android/internal/rest/model/ConversationsResponseDtoKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1563#2:60\n1634#2,3:61\n*S KotlinDebug\n*F\n+ 1 ConversationsResponseDto.kt\nzendesk/conversationkit/android/internal/rest/model/ConversationsResponseDtoKt\n*L\n49#1:60\n49#1:61,3\n*E\n"})
public final class ConversationsResponseDtoKt {
    @NotNull
    public static final ConversationsPagination toConversationsPagination(@NotNull ConversationsResponseDto conversationsResponseDto, @NotNull String str) {
        conversationsResponseDto.getClass();
        str.getClass();
        List<ConversationDto> conversations = conversationsResponseDto.getConversations();
        ArrayList arrayList = new ArrayList(e0.o(conversations, 10));
        Iterator<T> it = conversations.iterator();
        while (it.hasNext()) {
            String str2 = str;
            arrayList.add(ConversationKt.enrichFormResponseFields(ConversationKt.toConversation$default((ConversationDto) it.next(), str2, null, null, false, null, 30, null)));
            str = str2;
        }
        return new ConversationsPagination(arrayList, conversationsResponseDto.getConversationsPagination().getHasMore());
    }
}
