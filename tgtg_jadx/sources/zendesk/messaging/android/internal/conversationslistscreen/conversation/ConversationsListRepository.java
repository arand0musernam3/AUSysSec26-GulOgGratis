package zendesk.messaging.android.internal.conversationslistscreen.conversation;

import com.braze.models.inappmessage.InAppMessageBase;
import e0.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.h0;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s80.b;
import v80.x;
import w70.a;
import x70.c;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.conversationkit.android.ConversationKitResult;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.ConversationsPagination;
import zendesk.conversationkit.android.model.Message;
import zendesk.core.ui.android.internal.model.ConversationEntry;
import zendesk.logger.Logger;
import zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState;
import zendesk.messaging.android.internal.conversationslistscreen.ConversationsListState;
import zendesk.messaging.android.internal.conversationslistscreen.CreateConversationState;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListInMemoryCache;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel;
import zendesk.messaging.android.internal.model.MessagingTheme;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0010\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 y2\u00020\u0001:\u0001yB+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b\u0015\u0010\u0016J<\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001aH\u0080@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010#\u001a\u00020 2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b!\u0010\"J,\u0010)\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\b\b\u0002\u0010%\u001a\u00020\u001a2\b\b\u0002\u0010&\u001a\u00020 H\u0080@¢\u0006\u0004\b'\u0010(J \u0010+\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b*\u0010\u0011J \u00100\u001a\b\u0012\u0004\u0012\u00020-0,2\b\b\u0002\u0010&\u001a\u00020 H\u0080@¢\u0006\u0004\b.\u0010/J,\u00106\u001a\b\u0012\u0004\u0012\u000203012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0013012\u0006\u0010\u000f\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b4\u00105J3\u0010>\u001a\b\u0012\u0004\u0012\u000203072\f\u00102\u001a\b\u0012\u0004\u0012\u000203072\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0000¢\u0006\u0004\b<\u0010=J.\u0010B\u001a\u00020\u000e2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0013012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\u001aH\u0080@¢\u0006\u0004\b@\u0010AJ:\u0010G\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020C2\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\u0013012\b\b\u0002\u0010?\u001a\u00020\u001aH\u0080@¢\u0006\u0004\bE\u0010FJ\u0016\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00130,H\u0080@¢\u0006\u0004\bH\u0010IJ+\u0010O\u001a\u00020\u000e2\b\b\u0002\u0010K\u001a\u00020\u001a2\b\b\u0002\u0010L\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\bM\u0010NJ\u001f\u0010Q\u001a\u0002032\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010P\u001a\u000203H\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010T\u001a\u0002032\u0006\u0010S\u001a\u000203H\u0002¢\u0006\u0004\bT\u0010UJ\u001d\u0010X\u001a\u00020W2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020301H\u0002¢\u0006\u0004\bX\u0010YJ3\u0010\\\u001a\b\u0012\u0004\u0012\u000203012\f\u00102\u001a\b\u0012\u0004\u0012\u0002030Z2\u0006\u0010[\u001a\u0002032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\\\u0010]J3\u0010^\u001a\b\u0012\u0004\u0012\u000203012\u0006\u0010\r\u001a\u00020\f2\f\u00102\u001a\b\u0012\u0004\u0012\u0002030Z2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b^\u0010_J-\u0010b\u001a\u00020\u000e2\u0006\u0010`\u001a\u0002032\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010a\u001a\b\u0012\u0004\u0012\u0002030ZH\u0002¢\u0006\u0004\bb\u0010cJ\u001e\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00130,2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\bd\u0010eJ1\u0010V\u001a\b\u0012\u0004\u0012\u000203012\f\u0010f\u001a\b\u0012\u0004\u0012\u000203012\f\u0010g\u001a\b\u0012\u0004\u0012\u00020301H\u0002¢\u0006\u0004\bV\u0010hJ#\u0010i\u001a\b\u0012\u0004\u0012\u000203012\f\u0010V\u001a\b\u0012\u0004\u0012\u00020301H\u0002¢\u0006\u0004\bi\u0010jJ3\u0010p\u001a\b\u0012\u0004\u0012\u000203072\f\u0010l\u001a\b\u0012\u0004\u0012\u0002030k2\u0006\u0010n\u001a\u00020m2\u0006\u0010o\u001a\u00020mH\u0002¢\u0006\u0004\bp\u0010qJ+\u0010s\u001a\b\u0012\u0004\u0012\u000203012\f\u00102\u001a\b\u0012\u0004\u0012\u000203012\u0006\u0010r\u001a\u000208H\u0002¢\u0006\u0004\bs\u0010tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010uR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010vR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010wR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010x¨\u0006z"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationsListRepository;", "", "Lzendesk/conversationkit/android/ConversationKit;", "conversationKit", "Lv80/x;", "defaultDispatcher", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationLogEntryMapper;", "mapper", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListInMemoryCache;", "conversationsListInMemoryCache", "<init>", "(Lzendesk/conversationkit/android/ConversationKit;Lv80/x;Lzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationLogEntryMapper;Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListInMemoryCache;)V", "", "conversationId", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;", "state", "handleConversationRemoved$zendesk_messaging_messaging_android", "(Ljava/lang/String;Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;Lx70/c;)Ljava/lang/Object;", "handleConversationRemoved", "Lzendesk/conversationkit/android/model/Conversation;", MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "handleConversationAdded$zendesk_messaging_messaging_android", "(Lzendesk/conversationkit/android/model/Conversation;Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;Lx70/c;)Ljava/lang/Object;", "handleConversationAdded", "Lzendesk/conversationkit/android/model/Message;", InAppMessageBase.MESSAGE, "", "shouldIncreaseCount", "shouldResetCount", "handleMessageChanged$zendesk_messaging_messaging_android", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/Message;Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;ZZLx70/c;)Ljava/lang/Object;", "handleMessageChanged", "", "getConversationsUnreadCounterCurrentNumber$zendesk_messaging_messaging_android", "(Ljava/lang/String;)I", "getConversationsUnreadCounterCurrentNumber", "conversationsListScreenState", "updateStateIfFailed", "offset", "refreshConversationsList$zendesk_messaging_messaging_android", "(Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;ZILx70/c;)Ljava/lang/Object;", "refreshConversationsList", "handleConversationReadReceived$zendesk_messaging_messaging_android", "handleConversationReadReceived", "Lzendesk/conversationkit/android/ConversationKitResult;", "Lzendesk/conversationkit/android/model/ConversationsPagination;", "fetchConversations$zendesk_messaging_messaging_android", "(ILx70/c;)Ljava/lang/Object;", "fetchConversations", "", "conversations", "Lzendesk/core/ui/android/internal/model/ConversationEntry;", "getConversationsEntryList$zendesk_messaging_messaging_android", "(Ljava/util/List;Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;Lx70/c;)Ljava/lang/Object;", "getConversationsEntryList", "Ls80/b;", "Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;", "loadMoreStatus", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "messagingTheme", "addLoadMoreEntry$zendesk_messaging_messaging_android", "(Ls80/b;Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;Lzendesk/messaging/android/internal/model/MessagingTheme;)Ls80/b;", "addLoadMoreEntry", "shouldLoadMore", "handlePaginationUpdate$zendesk_messaging_messaging_android", "(Ljava/util/List;Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;ZLx70/c;)Ljava/lang/Object;", "handlePaginationUpdate", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListState;", "conversationsListState", "conversationsListStateChange$zendesk_messaging_messaging_android", "(Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListState;Ljava/util/List;ZLx70/c;)Ljava/lang/Object;", "conversationsListStateChange", "createNewConversation$zendesk_messaging_messaging_android", "(Lx70/c;)Ljava/lang/Object;", "createNewConversation", "isSuccessful", "isLoading", "updateCreateConversationState$zendesk_messaging_messaging_android", "(ZZLzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;)Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;", "updateCreateConversationState", "updatedConversationEntryWithMessage", "getLatestConversationEntryUpdateWhetherShouldResetCount", "(ZLzendesk/core/ui/android/internal/model/ConversationEntry;)Lzendesk/core/ui/android/internal/model/ConversationEntry;", "updatedConversationEntry", "resetUnreadCounter", "(Lzendesk/core/ui/android/internal/model/ConversationEntry;)Lzendesk/core/ui/android/internal/model/ConversationEntry;", "mergeConversations", "", "updateInMemoryConversations", "(Ljava/util/List;)V", "", "updatedEntry", "updateConversationEntriesFromWebSocketEvent", "(Ljava/util/Collection;Lzendesk/core/ui/android/internal/model/ConversationEntry;Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;)Ljava/util/List;", "removeExistingConversationEntryFromWebSocketEvent", "(Ljava/lang/String;Ljava/util/Collection;Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;)Ljava/util/List;", "conversationEntry", "cachedConversations", "updateStateWithNewConversationEntryFromWebSocketEvent", "(Lzendesk/core/ui/android/internal/model/ConversationEntry;Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;Ljava/util/Collection;)Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;", "fetchConversation", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "initialConversations", "paginatedConversations", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "filterLoadMoreEntry", "(Ljava/util/List;)Ljava/util/List;", "", "conversationEntries", "Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMore;", "currentLoadMoreEntry", "newLoadMoreEntry", "evaluateLoadMoreStatusChange", "(Ljava/util/List;Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMore;Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMore;)Ls80/b;", "status", "updateLoadMoreEntry", "(Ljava/util/List;Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;)Ljava/util/List;", "Lzendesk/conversationkit/android/ConversationKit;", "Lv80/x;", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationLogEntryMapper;", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListInMemoryCache;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationsListRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationsListRepository.kt\nzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationsListRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,681:1\n1068#2:682\n1869#2,2:683\n1021#2,2:685\n1869#2,2:687\n1021#2,2:689\n1563#2:691\n1634#2,3:692\n827#2:695\n855#2,2:696\n1563#2:698\n1634#2,3:699\n*S KotlinDebug\n*F\n+ 1 ConversationsListRepository.kt\nzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationsListRepository\n*L\n250#1:682\n382#1:683,2\n401#1:685,2\n411#1:687,2\n420#1:689,2\n486#1:691\n486#1:692,3\n554#1:695\n554#1:696,2\n669#1:698\n669#1:699,3\n*E\n"})
public final class ConversationsListRepository {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String LOG_TAG = "ConversationsListRepository";

    @NotNull
    private final ConversationKit conversationKit;

    @NotNull
    private final ConversationsListInMemoryCache conversationsListInMemoryCache;

    @NotNull
    private final x defaultDispatcher;

    @NotNull
    private final ConversationLogEntryMapper mapper;

    public ConversationsListRepository(@NotNull ConversationKit conversationKit, @NotNull x xVar, @NotNull ConversationLogEntryMapper conversationLogEntryMapper, @NotNull ConversationsListInMemoryCache conversationsListInMemoryCache) {
        conversationKit.getClass();
        xVar.getClass();
        conversationLogEntryMapper.getClass();
        conversationsListInMemoryCache.getClass();
        this.conversationKit = conversationKit;
        this.defaultDispatcher = xVar;
        this.mapper = conversationLogEntryMapper;
        this.conversationsListInMemoryCache = conversationsListInMemoryCache;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object conversationsListStateChange$zendesk_messaging_messaging_android$default(ConversationsListRepository conversationsListRepository, ConversationsListScreenState conversationsListScreenState, ConversationsListState conversationsListState, List list, boolean z11, c cVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list = n0.f26529a;
        }
        List list2 = list;
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return conversationsListRepository.conversationsListStateChange$zendesk_messaging_messaging_android(conversationsListScreenState, conversationsListState, list2, z11, cVar);
    }

    private final b evaluateLoadMoreStatusChange(List<ConversationEntry> conversationEntries, ConversationEntry.LoadMore currentLoadMoreEntry, ConversationEntry.LoadMore newLoadMoreEntry) {
        if (newLoadMoreEntry.getStatus() != currentLoadMoreEntry.getStatus()) {
            conversationEntries = updateLoadMoreEntry(conversationEntries, newLoadMoreEntry.getStatus());
        }
        return f0.V(conversationEntries);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchConversation(String str, c<? super ConversationKitResult<Conversation>> cVar) {
        return this.conversationKit.getConversation(str, cVar);
    }

    public static /* synthetic */ Object fetchConversations$zendesk_messaging_messaging_android$default(ConversationsListRepository conversationsListRepository, int i11, c cVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return conversationsListRepository.fetchConversations$zendesk_messaging_messaging_android(i11, cVar);
    }

    private final List<ConversationEntry> filterLoadMoreEntry(List<? extends ConversationEntry> mergeConversations) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : mergeConversations) {
            if (!Intrinsics.areEqual(((ConversationEntry) obj).getId(), ConversationEntry.INSTANCE.getLOAD_MORE_ID())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConversationEntry getLatestConversationEntryUpdateWhetherShouldResetCount(boolean shouldResetCount, ConversationEntry updatedConversationEntryWithMessage) {
        return shouldResetCount ? resetUnreadCounter(updatedConversationEntryWithMessage) : updatedConversationEntryWithMessage;
    }

    public static /* synthetic */ Object handleMessageChanged$zendesk_messaging_messaging_android$default(ConversationsListRepository conversationsListRepository, String str, Message message, ConversationsListScreenState conversationsListScreenState, boolean z11, boolean z12, c cVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        if ((i11 & 16) != 0) {
            z12 = false;
        }
        return conversationsListRepository.handleMessageChanged$zendesk_messaging_messaging_android(str, message, conversationsListScreenState, z11, z12, cVar);
    }

    private final List<ConversationEntry> mergeConversations(List<? extends ConversationEntry> initialConversations, List<? extends ConversationEntry> paginatedConversations) {
        return CollectionsKt.d0(paginatedConversations, initialConversations);
    }

    public static /* synthetic */ Object refreshConversationsList$zendesk_messaging_messaging_android$default(ConversationsListRepository conversationsListRepository, ConversationsListScreenState conversationsListScreenState, boolean z11, int i11, c cVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return conversationsListRepository.refreshConversationsList$zendesk_messaging_messaging_android(conversationsListScreenState, z11, i11, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ConversationEntry> removeExistingConversationEntryFromWebSocketEvent(String conversationId, Collection<? extends ConversationEntry> conversations, ConversationsListScreenState state) {
        ArrayList arrayList = new ArrayList();
        for (ConversationEntry conversationEntry : conversations) {
            if (!Intrinsics.areEqual(conversationEntry.getId(), conversationId)) {
                arrayList.add(this.mapper.updateConversationEntryWithLatestTimeStamp$zendesk_messaging_messaging_android(conversationEntry, state.getMessagingTheme()));
            }
        }
        if (arrayList.size() > 1) {
            h0.r(arrayList, new Comparator() { // from class: zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository$removeExistingConversationEntryFromWebSocketEvent$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t9, T t11) {
                    return a.a(((ConversationEntry) t11).getDateTimeStamp(), ((ConversationEntry) t9).getDateTimeStamp());
                }
            });
        }
        return CollectionsKt.r0(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConversationEntry resetUnreadCounter(ConversationEntry updatedConversationEntry) {
        updatedConversationEntry.getClass();
        return ConversationEntry.ConversationItem.copy$default((ConversationEntry.ConversationItem) updatedConversationEntry, null, null, null, null, null, null, null, null, 0, null, 0, 0, 0, 0, 0, 0, 0, 130815, null);
    }

    private final List<ConversationEntry> updateConversationEntriesFromWebSocketEvent(Collection<? extends ConversationEntry> conversations, ConversationEntry updatedEntry, ConversationsListScreenState state) {
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (ConversationEntry conversationEntry : conversations) {
            if (Intrinsics.areEqual(conversationEntry.getId(), updatedEntry.getId())) {
                arrayList.add(updatedEntry);
                z11 = true;
            } else {
                arrayList.add(this.mapper.updateConversationEntryWithLatestTimeStamp$zendesk_messaging_messaging_android(conversationEntry, state.getMessagingTheme()));
            }
        }
        if (!z11) {
            arrayList.add(updatedEntry);
        }
        if (arrayList.size() > 1) {
            h0.r(arrayList, new Comparator() { // from class: zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository$updateConversationEntriesFromWebSocketEvent$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t9, T t11) {
                    return a.a(((ConversationEntry) t11).getDateTimeStamp(), ((ConversationEntry) t9).getDateTimeStamp());
                }
            });
        }
        return CollectionsKt.r0(arrayList);
    }

    public static /* synthetic */ ConversationsListScreenState updateCreateConversationState$zendesk_messaging_messaging_android$default(ConversationsListRepository conversationsListRepository, boolean z11, boolean z12, ConversationsListScreenState conversationsListScreenState, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        return conversationsListRepository.updateCreateConversationState$zendesk_messaging_messaging_android(z11, z12, conversationsListScreenState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateInMemoryConversations(List<? extends ConversationEntry> mergeConversations) {
        this.conversationsListInMemoryCache.clearAll();
        this.conversationsListInMemoryCache.updateConversations(mergeConversations);
    }

    private final List<ConversationEntry> updateLoadMoreEntry(List<? extends ConversationEntry> conversations, ConversationEntry.LoadMoreStatus status) {
        ConversationEntry.LoadMoreStatus loadMoreStatus;
        ArrayList arrayList = new ArrayList(e0.o(conversations, 10));
        for (Object objCopy$default : conversations) {
            if (objCopy$default instanceof ConversationEntry.LoadMore) {
                loadMoreStatus = status;
                objCopy$default = ConversationEntry.LoadMore.copy$default((ConversationEntry.LoadMore) objCopy$default, null, 0, 0, loadMoreStatus, null, 23, null);
            } else {
                loadMoreStatus = status;
            }
            arrayList.add(objCopy$default);
            status = loadMoreStatus;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConversationsListScreenState updateStateWithNewConversationEntryFromWebSocketEvent(ConversationEntry conversationEntry, ConversationsListScreenState state, Collection<? extends ConversationEntry> cachedConversations) {
        return ConversationsListStateHelperKt.conversationsList(state, f0.V(updateConversationEntriesFromWebSocketEvent(cachedConversations, conversationEntry, state)));
    }

    @NotNull
    public final b addLoadMoreEntry$zendesk_messaging_messaging_android(@NotNull b conversations, @NotNull ConversationEntry.LoadMoreStatus loadMoreStatus, @NotNull MessagingTheme messagingTheme) {
        conversations.getClass();
        loadMoreStatus.getClass();
        messagingTheme.getClass();
        ArrayList arrayList = new ArrayList(conversations);
        ConversationEntry conversationEntryMapToLoadMoreEntry$zendesk_messaging_messaging_android = this.mapper.mapToLoadMoreEntry$zendesk_messaging_messaging_android(loadMoreStatus, messagingTheme);
        ArrayList arrayList2 = new ArrayList(e0.o(conversations, 10));
        Iterator<E> it = conversations.iterator();
        while (it.hasNext()) {
            ConversationEntry conversationEntry = (ConversationEntry) it.next();
            if (Intrinsics.areEqual(conversationEntryMapToLoadMoreEntry$zendesk_messaging_messaging_android.getId(), conversationEntry.getId()) && (conversationEntryMapToLoadMoreEntry$zendesk_messaging_messaging_android instanceof ConversationEntry.LoadMore) && (conversationEntry instanceof ConversationEntry.LoadMore)) {
                return evaluateLoadMoreStatusChange(arrayList, (ConversationEntry.LoadMore) conversationEntry, (ConversationEntry.LoadMore) conversationEntryMapToLoadMoreEntry$zendesk_messaging_messaging_android);
            }
            arrayList2.add(Unit.f26487a);
        }
        if (loadMoreStatus != ConversationEntry.LoadMoreStatus.NONE) {
            arrayList.add(conversationEntryMapToLoadMoreEntry$zendesk_messaging_messaging_android);
        }
        return f0.V(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object conversationsListStateChange$zendesk_messaging_messaging_android(@org.jetbrains.annotations.NotNull zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState r11, @org.jetbrains.annotations.NotNull zendesk.messaging.android.internal.conversationslistscreen.ConversationsListState r12, @org.jetbrains.annotations.NotNull java.util.List<zendesk.conversationkit.android.model.Conversation> r13, boolean r14, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository$conversationsListStateChange$1
            if (r0 == 0) goto L13
            r0 = r15
            zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository$conversationsListStateChange$1 r0 = (zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository$conversationsListStateChange$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository$conversationsListStateChange$1 r0 = new zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository$conversationsListStateChange$1
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L35
            boolean r14 = r0.Z$0
            java.lang.Object r11 = r0.L$1
            r12 = r11
            zendesk.messaging.android.internal.conversationslistscreen.ConversationsListState r12 = (zendesk.messaging.android.internal.conversationslistscreen.ConversationsListState) r12
            java.lang.Object r11 = r0.L$0
            zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState r11 = (zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState) r11
            ba0.g.M(r15)
        L31:
            r2 = r11
            r3 = r12
            r5 = r14
            goto L4e
        L35:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r11)
            r11 = 0
            return r11
        L3c:
            ba0.g.M(r15)
            r0.L$0 = r11
            r0.L$1 = r12
            r0.Z$0 = r14
            r0.label = r3
            java.lang.Object r15 = r10.getConversationsEntryList$zendesk_messaging_messaging_android(r13, r11, r0)
            if (r15 != r1) goto L31
            return r1
        L4e:
            r4 = r15
            java.util.List r4 = (java.util.List) r4
            boolean r11 = r4.isEmpty()
            if (r11 != 0) goto L66
            zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListInMemoryCache r11 = r10.conversationsListInMemoryCache
            r11.updateConversations(r4)
            r8 = 48
            r9 = 0
            r6 = 0
            r7 = 0
            zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState r11 = zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListStateHelperKt.conversationsListWithListState$default(r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        L66:
            zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState r11 = zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListStateHelperKt.listState(r2, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository.conversationsListStateChange$zendesk_messaging_messaging_android(zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState, zendesk.messaging.android.internal.conversationslistscreen.ConversationsListState, java.util.List, boolean, x70.c):java.lang.Object");
    }

    @Nullable
    public final Object createNewConversation$zendesk_messaging_messaging_android(@NotNull c<? super ConversationKitResult<Conversation>> cVar) {
        return ConversationKit.DefaultImpls.createConversation$default(this.conversationKit, null, cVar, 1, null);
    }

    @Nullable
    public final Object fetchConversations$zendesk_messaging_messaging_android(int i11, @NotNull c<? super ConversationKitResult<ConversationsPagination>> cVar) {
        return ConversationKit.DefaultImpls.getConversations$default(this.conversationKit, i11, false, cVar, 2, null);
    }

    @Nullable
    public final Object getConversationsEntryList$zendesk_messaging_messaging_android(@NotNull List<Conversation> list, @NotNull ConversationsListScreenState conversationsListScreenState, @NotNull c<? super List<? extends ConversationEntry>> cVar) {
        return v80.f0.K(this.defaultDispatcher, new ConversationsListRepository$getConversationsEntryList$2(list, this, conversationsListScreenState, null), cVar);
    }

    public final int getConversationsUnreadCounterCurrentNumber$zendesk_messaging_messaging_android(@NotNull String conversationId) {
        conversationId.getClass();
        ConversationEntry conversationById = this.conversationsListInMemoryCache.getConversationById(conversationId);
        if (conversationById == null) {
            return 0;
        }
        return ((ConversationEntry.ConversationItem) conversationById).getUnreadMessages();
    }

    @Nullable
    public final Object handleConversationAdded$zendesk_messaging_messaging_android(@NotNull Conversation conversation, @NotNull ConversationsListScreenState conversationsListScreenState, @NotNull c<? super ConversationsListScreenState> cVar) {
        Logger.d(LOG_TAG, f.k("ConversationAdded Event. Id = ", conversation.getId()), new Object[0]);
        return v80.f0.K(this.defaultDispatcher, new ConversationsListRepository$handleConversationAdded$2(this, conversation, conversationsListScreenState, null), cVar);
    }

    @Nullable
    public final Object handleConversationReadReceived$zendesk_messaging_messaging_android(@NotNull String str, @NotNull ConversationsListScreenState conversationsListScreenState, @NotNull c<? super ConversationsListScreenState> cVar) {
        Logger.d(LOG_TAG, f.k("Conversation Activity Read Event. Id = ", str), new Object[0]);
        return v80.f0.K(this.defaultDispatcher, new ConversationsListRepository$handleConversationReadReceived$2(this, str, conversationsListScreenState, null), cVar);
    }

    @Nullable
    public final Object handleConversationRemoved$zendesk_messaging_messaging_android(@NotNull String str, @NotNull ConversationsListScreenState conversationsListScreenState, @NotNull c<? super ConversationsListScreenState> cVar) {
        Logger.d(LOG_TAG, f.k("ConversationRemoved Event. Id = ", str), new Object[0]);
        return v80.f0.K(this.defaultDispatcher, new ConversationsListRepository$handleConversationRemoved$2(conversationsListScreenState, this, str, null), cVar);
    }

    @Nullable
    public final Object handleMessageChanged$zendesk_messaging_messaging_android(@NotNull String str, @NotNull Message message, @NotNull ConversationsListScreenState conversationsListScreenState, boolean z11, boolean z12, @NotNull c<? super ConversationsListScreenState> cVar) {
        Logger.d(LOG_TAG, f.k("Message Changed Event received. Id = ", str), new Object[0]);
        return v80.f0.K(this.defaultDispatcher, new ConversationsListRepository$handleMessageChanged$2(this, str, conversationsListScreenState, message, z11, z12, null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handlePaginationUpdate$zendesk_messaging_messaging_android(@org.jetbrains.annotations.NotNull java.util.List<zendesk.conversationkit.android.model.Conversation> r25, @org.jetbrains.annotations.NotNull zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState r26, boolean r27, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState> r28) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r2 = r28
            boolean r3 = r2 instanceof zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository$handlePaginationUpdate$1
            if (r3 == 0) goto L19
            r3 = r2
            zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository$handlePaginationUpdate$1 r3 = (zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository$handlePaginationUpdate$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.label = r4
            goto L1e
        L19:
            zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository$handlePaginationUpdate$1 r3 = new zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository$handlePaginationUpdate$1
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.result
            y70.a r4 = y70.a.COROUTINE_SUSPENDED
            int r5 = r3.label
            r6 = 1
            if (r5 == 0) goto L3d
            if (r5 != r6) goto L36
            boolean r1 = r3.Z$0
            java.lang.Object r3 = r3.L$0
            zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState r3 = (zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState) r3
            ba0.g.M(r2)
            r17 = r1
            r5 = r3
            goto L55
        L36:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r1)
            r1 = 0
            return r1
        L3d:
            ba0.g.M(r2)
            r3.L$0 = r1
            r2 = r27
            r3.Z$0 = r2
            r3.label = r6
            r5 = r25
            java.lang.Object r3 = r0.getConversationsEntryList$zendesk_messaging_messaging_android(r5, r1, r3)
            if (r3 != r4) goto L51
            return r4
        L51:
            r5 = r1
            r17 = r2
            r2 = r3
        L55:
            java.util.List r2 = (java.util.List) r2
            s80.b r1 = r5.getConversations()
            java.util.List r1 = r0.mergeConversations(r1, r2)
            java.util.List r1 = r0.filterLoadMoreEntry(r1)
            zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListInMemoryCache r2 = r0.conversationsListInMemoryCache
            r2.updateConversations(r1)
            zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListInMemoryCache r1 = r0.conversationsListInMemoryCache
            java.util.Map r1 = r1.conversations()
            java.util.Collection r1 = r1.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            s80.b r12 = o30.f0.V(r1)
            zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListInMemoryCache r1 = r0.conversationsListInMemoryCache
            java.util.Map r1 = r1.conversations()
            int r18 = r1.size()
            r22 = 59327(0xe7bf, float:8.3135E-41)
            r23 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState r1 = zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState.copy$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository.handlePaginationUpdate$zendesk_messaging_messaging_android(java.util.List, zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState, boolean, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0073 A[Catch: Exception -> 0x00dd, TRY_LEAVE, TryCatch #0 {Exception -> 0x00dd, blocks: (B:28:0x006d, B:30:0x0073, B:40:0x00df, B:42:0x00e3, B:44:0x00ec, B:47:0x00fa, B:48:0x00ff, B:25:0x005c), top: B:54:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df A[Catch: Exception -> 0x00dd, TRY_ENTER, TryCatch #0 {Exception -> 0x00dd, blocks: (B:28:0x006d, B:30:0x0073, B:40:0x00df, B:42:0x00e3, B:44:0x00ec, B:47:0x00fa, B:48:0x00ff, B:25:0x005c), top: B:54:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshConversationsList$zendesk_messaging_messaging_android(@org.jetbrains.annotations.NotNull zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState r17, boolean r18, int r19, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState> r20) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository.refreshConversationsList$zendesk_messaging_messaging_android(zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState, boolean, int, x70.c):java.lang.Object");
    }

    @NotNull
    public final ConversationsListScreenState updateCreateConversationState$zendesk_messaging_messaging_android(boolean isSuccessful, boolean isLoading, @NotNull ConversationsListScreenState state) {
        state.getClass();
        return ConversationsListStateHelperKt.updateCreateConversationState(state, isSuccessful ? CreateConversationState.SUCCESS : isLoading ? CreateConversationState.LOADING : CreateConversationState.FAILED);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationsListRepository$Companion;", "", "<init>", "()V", "LOG_TAG", "", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
