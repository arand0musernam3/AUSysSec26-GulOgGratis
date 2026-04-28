package zendesk.conversationkit.android.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.collections.o0;
import kotlin.collections.x0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import zendesk.conversationkit.android.internal.rest.model.ConversationDto;
import zendesk.conversationkit.android.internal.rest.model.ConversationResponseDto;
import zendesk.conversationkit.android.internal.rest.model.MessageDto;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a`\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00042\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007H\u0000\u001a\f\u0010\u0010\u001a\u00020\u0001*\u00020\u0001H\u0000¨\u0006\u0011"}, d2 = {"toConversation", "Lzendesk/conversationkit/android/model/Conversation;", "Lzendesk/conversationkit/android/internal/rest/model/ConversationResponseDto;", "currentUserId", "", "Lzendesk/conversationkit/android/internal/rest/model/ConversationDto;", "appUsers", "", "Lzendesk/conversationkit/android/internal/rest/model/AppUserDto;", "altMessages", "", "Lzendesk/conversationkit/android/internal/rest/model/MessageDto;", "hasPrevious", "", "metadata", "", "enrichFormResponseFields", "zendesk.conversationkit_conversationkit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Conversation.kt\nzendesk/conversationkit/android/model/ConversationKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,198:1\n295#2,2:199\n1563#2:201\n1634#2,3:202\n1563#2:205\n1634#2,3:206\n1563#2:209\n1634#2,3:210\n*S KotlinDebug\n*F\n+ 1 Conversation.kt\nzendesk/conversationkit/android/model/ConversationKt\n*L\n176#1:199,2\n177#1:201\n177#1:202,3\n178#1:205\n178#1:206,3\n196#1:209\n196#1:210,3\n*E\n"})
public final class ConversationKt {
    @NotNull
    public static final Conversation enrichFormResponseFields(@NotNull Conversation conversation) {
        conversation.getClass();
        List<Message> messages = conversation.getMessages();
        ArrayList arrayList = new ArrayList(e0.o(messages, 10));
        Iterator<T> it = messages.iterator();
        while (it.hasNext()) {
            arrayList.add(MessageKt.enrichFormResponseFields((Message) it.next(), conversation));
        }
        return Conversation.copy$default(conversation, null, null, null, null, null, false, null, null, null, null, null, arrayList, false, null, null, null, null, 129023, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final zendesk.conversationkit.android.model.Conversation toConversation(@org.jetbrains.annotations.NotNull zendesk.conversationkit.android.internal.rest.model.ConversationDto r18, @org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, zendesk.conversationkit.android.internal.rest.model.AppUserDto> r20, @org.jetbrains.annotations.Nullable java.util.List<zendesk.conversationkit.android.internal.rest.model.MessageDto> r21, boolean r22, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r23) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.model.ConversationKt.toConversation(zendesk.conversationkit.android.internal.rest.model.ConversationDto, java.lang.String, java.util.Map, java.util.List, boolean, java.util.Map):zendesk.conversationkit.android.model.Conversation");
    }

    public static Conversation toConversation$default(ConversationDto conversationDto, String str, Map map, List list, boolean z11, Map map2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = o0.f26530a;
            map.getClass();
        }
        Map map3 = map;
        if ((i11 & 4) != 0) {
            list = conversationDto.getMessages();
        }
        List list2 = list;
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        boolean z12 = z11;
        if ((i11 & 16) != 0) {
            map2 = null;
        }
        return toConversation(conversationDto, str, map3, list2, z12, map2);
    }

    @NotNull
    public static final Conversation toConversation(@NotNull ConversationResponseDto conversationResponseDto, @NotNull String str) {
        conversationResponseDto.getClass();
        str.getClass();
        ConversationDto conversation = conversationResponseDto.getConversation();
        Map mapH = x0.h(conversationResponseDto.getAppUsers(), new Pair(conversationResponseDto.getAppUser().getId(), conversationResponseDto.getAppUser()));
        List<MessageDto> messages = conversationResponseDto.getMessages();
        Boolean hasPrevious = conversationResponseDto.getHasPrevious();
        return toConversation(conversation, str, mapH, messages, hasPrevious != null ? hasPrevious.booleanValue() : false, conversationResponseDto.getConversation().getMetadata());
    }
}
