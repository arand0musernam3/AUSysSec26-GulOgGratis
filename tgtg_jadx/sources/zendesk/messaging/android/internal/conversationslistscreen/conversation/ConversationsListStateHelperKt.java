package zendesk.messaging.android.internal.conversationslistscreen.conversation;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import o30.f0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s80.b;
import zendesk.conversationkit.android.ConnectionStatus;
import zendesk.core.ui.android.internal.model.ConversationEntry;
import zendesk.logger.Logger;
import zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenState;
import zendesk.messaging.android.internal.conversationslistscreen.ConversationsListState;
import zendesk.messaging.android.internal.conversationslistscreen.CreateConversationState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aI\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"", "cause", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;", "conversationsListScreenState", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListState;", "conversationsListState", "errorState", "(Ljava/lang/Throwable;Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListState;)Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;", "Ls80/b;", "Lzendesk/core/ui/android/internal/model/ConversationEntry;", "conversationsList", "(Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;Ls80/b;)Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;", "", "", "shouldLoadMore", "", "currentPaginationOffset", "Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;", "loadMoreStatus", "conversationsListWithListState", "(Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListState;Ljava/util/List;ZILzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;)Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;", "listState", "(Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListState;)Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;", "Lzendesk/conversationkit/android/ConnectionStatus;", "connectionStatus", "(Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;Lzendesk/conversationkit/android/ConnectionStatus;)Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;", "Lzendesk/messaging/android/internal/conversationslistscreen/CreateConversationState;", "createConversationState", "updateCreateConversationState", "(Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;Lzendesk/messaging/android/internal/conversationslistscreen/CreateConversationState;)Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;", "", "LOG_TAG", "Ljava/lang/String;", "zendesk.messaging_messaging-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationsListStateHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationsListStateHelper.kt\nzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationsListStateHelperKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
public final class ConversationsListStateHelperKt {

    @NotNull
    private static final String LOG_TAG = "ConversationsListStateHelper";

    @NotNull
    public static final ConversationsListScreenState connectionStatus(@NotNull ConversationsListScreenState conversationsListScreenState, @NotNull ConnectionStatus connectionStatus) {
        conversationsListScreenState.getClass();
        connectionStatus.getClass();
        ConversationsListScreenState conversationsListScreenStateCopy = conversationsListScreenState.copy((Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1) != 0 ? conversationsListScreenState.messagingTheme : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 2) != 0 ? conversationsListScreenState.title : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4) != 0 ? conversationsListScreenState.description : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8) != 0 ? conversationsListScreenState.logoUrl : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 16) != 0 ? conversationsListScreenState.isMultiConvoEnabled : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32) != 0 ? conversationsListScreenState.canUserCreateMoreConversations : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 64) != 0 ? conversationsListScreenState.conversations : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 128) != 0 ? conversationsListScreenState.connectionStatus : connectionStatus, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 256) != 0 ? conversationsListScreenState.showDeniedPermission : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 512) != 0 ? conversationsListScreenState.createConversationState : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1024) != 0 ? conversationsListScreenState.conversationsListState : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & NewHope.SENDB_BYTES) != 0 ? conversationsListScreenState.shouldLoadMore : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4096) != 0 ? conversationsListScreenState.currentPaginationOffset : 0, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8192) != 0 ? conversationsListScreenState.loadMoreStatus : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? conversationsListScreenState.receivedMessageAuthor : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32768) != 0 ? conversationsListScreenState.receivedMessageUnreadCount : 0);
        Logger.d(LOG_TAG, "ConnectionStatusChanged received: " + connectionStatus, new Object[0]);
        return conversationsListScreenStateCopy;
    }

    @NotNull
    public static final ConversationsListScreenState conversationsList(@NotNull ConversationsListScreenState conversationsListScreenState, @NotNull b bVar) {
        conversationsListScreenState.getClass();
        bVar.getClass();
        ConversationsListScreenState conversationsListScreenStateCopy = conversationsListScreenState.copy((Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1) != 0 ? conversationsListScreenState.messagingTheme : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 2) != 0 ? conversationsListScreenState.title : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4) != 0 ? conversationsListScreenState.description : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8) != 0 ? conversationsListScreenState.logoUrl : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 16) != 0 ? conversationsListScreenState.isMultiConvoEnabled : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32) != 0 ? conversationsListScreenState.canUserCreateMoreConversations : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 64) != 0 ? conversationsListScreenState.conversations : bVar, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 128) != 0 ? conversationsListScreenState.connectionStatus : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 256) != 0 ? conversationsListScreenState.showDeniedPermission : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 512) != 0 ? conversationsListScreenState.createConversationState : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1024) != 0 ? conversationsListScreenState.conversationsListState : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & NewHope.SENDB_BYTES) != 0 ? conversationsListScreenState.shouldLoadMore : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4096) != 0 ? conversationsListScreenState.currentPaginationOffset : 0, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8192) != 0 ? conversationsListScreenState.loadMoreStatus : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? conversationsListScreenState.receivedMessageAuthor : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32768) != 0 ? conversationsListScreenState.receivedMessageUnreadCount : 0);
        Logger.d(LOG_TAG, "conversationsList update", new Object[0]);
        return conversationsListScreenStateCopy;
    }

    @NotNull
    public static final ConversationsListScreenState conversationsListWithListState(@NotNull ConversationsListScreenState conversationsListScreenState, @NotNull ConversationsListState conversationsListState, @NotNull List<? extends ConversationEntry> list, boolean z11, int i11, @NotNull ConversationEntry.LoadMoreStatus loadMoreStatus) {
        conversationsListScreenState.getClass();
        conversationsListState.getClass();
        list.getClass();
        loadMoreStatus.getClass();
        ConversationsListScreenState conversationsListScreenStateCopy = conversationsListScreenState.copy((Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1) != 0 ? conversationsListScreenState.messagingTheme : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 2) != 0 ? conversationsListScreenState.title : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4) != 0 ? conversationsListScreenState.description : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8) != 0 ? conversationsListScreenState.logoUrl : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 16) != 0 ? conversationsListScreenState.isMultiConvoEnabled : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32) != 0 ? conversationsListScreenState.canUserCreateMoreConversations : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 64) != 0 ? conversationsListScreenState.conversations : f0.V(list), (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 128) != 0 ? conversationsListScreenState.connectionStatus : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 256) != 0 ? conversationsListScreenState.showDeniedPermission : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 512) != 0 ? conversationsListScreenState.createConversationState : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1024) != 0 ? conversationsListScreenState.conversationsListState : conversationsListState, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & NewHope.SENDB_BYTES) != 0 ? conversationsListScreenState.shouldLoadMore : z11, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4096) != 0 ? conversationsListScreenState.currentPaginationOffset : i11, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8192) != 0 ? conversationsListScreenState.loadMoreStatus : loadMoreStatus, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? conversationsListScreenState.receivedMessageAuthor : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32768) != 0 ? conversationsListScreenState.receivedMessageUnreadCount : 0);
        Logger.d(LOG_TAG, "conversationsList with listState: " + conversationsListState, new Object[0]);
        return conversationsListScreenStateCopy;
    }

    public static /* synthetic */ ConversationsListScreenState conversationsListWithListState$default(ConversationsListScreenState conversationsListScreenState, ConversationsListState conversationsListState, List list, boolean z11, int i11, ConversationEntry.LoadMoreStatus loadMoreStatus, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            i11 = 0;
        }
        int i13 = i11;
        if ((i12 & 32) != 0) {
            loadMoreStatus = ConversationEntry.LoadMoreStatus.NONE;
        }
        return conversationsListWithListState(conversationsListScreenState, conversationsListState, list, z11, i13, loadMoreStatus);
    }

    @NotNull
    public static final ConversationsListScreenState errorState(@Nullable Throwable th2, @NotNull ConversationsListScreenState conversationsListScreenState, @NotNull ConversationsListState conversationsListState) {
        conversationsListScreenState.getClass();
        conversationsListState.getClass();
        ConversationsListScreenState conversationsListScreenStateListState = listState(conversationsListScreenState, conversationsListState);
        Logger.e(LOG_TAG, "errorState", th2, new Object[0]);
        return conversationsListScreenStateListState;
    }

    @NotNull
    public static final ConversationsListScreenState listState(@NotNull ConversationsListScreenState conversationsListScreenState, @NotNull ConversationsListState conversationsListState) {
        conversationsListScreenState.getClass();
        conversationsListState.getClass();
        ConversationsListScreenState conversationsListScreenStateCopy = conversationsListScreenState.copy((Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1) != 0 ? conversationsListScreenState.messagingTheme : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 2) != 0 ? conversationsListScreenState.title : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4) != 0 ? conversationsListScreenState.description : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8) != 0 ? conversationsListScreenState.logoUrl : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 16) != 0 ? conversationsListScreenState.isMultiConvoEnabled : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32) != 0 ? conversationsListScreenState.canUserCreateMoreConversations : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 64) != 0 ? conversationsListScreenState.conversations : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 128) != 0 ? conversationsListScreenState.connectionStatus : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 256) != 0 ? conversationsListScreenState.showDeniedPermission : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 512) != 0 ? conversationsListScreenState.createConversationState : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1024) != 0 ? conversationsListScreenState.conversationsListState : conversationsListState, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & NewHope.SENDB_BYTES) != 0 ? conversationsListScreenState.shouldLoadMore : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4096) != 0 ? conversationsListScreenState.currentPaginationOffset : 0, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8192) != 0 ? conversationsListScreenState.loadMoreStatus : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? conversationsListScreenState.receivedMessageAuthor : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32768) != 0 ? conversationsListScreenState.receivedMessageUnreadCount : 0);
        Logger.d(LOG_TAG, "listState: " + conversationsListState, new Object[0]);
        return conversationsListScreenStateCopy;
    }

    @NotNull
    public static final ConversationsListScreenState updateCreateConversationState(@NotNull ConversationsListScreenState conversationsListScreenState, @NotNull CreateConversationState createConversationState) {
        conversationsListScreenState.getClass();
        createConversationState.getClass();
        ConversationsListScreenState conversationsListScreenStateCopy = conversationsListScreenState.copy((Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1) != 0 ? conversationsListScreenState.messagingTheme : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 2) != 0 ? conversationsListScreenState.title : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4) != 0 ? conversationsListScreenState.description : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8) != 0 ? conversationsListScreenState.logoUrl : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 16) != 0 ? conversationsListScreenState.isMultiConvoEnabled : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32) != 0 ? conversationsListScreenState.canUserCreateMoreConversations : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 64) != 0 ? conversationsListScreenState.conversations : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 128) != 0 ? conversationsListScreenState.connectionStatus : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 256) != 0 ? conversationsListScreenState.showDeniedPermission : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 512) != 0 ? conversationsListScreenState.createConversationState : createConversationState, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1024) != 0 ? conversationsListScreenState.conversationsListState : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & NewHope.SENDB_BYTES) != 0 ? conversationsListScreenState.shouldLoadMore : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4096) != 0 ? conversationsListScreenState.currentPaginationOffset : 0, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8192) != 0 ? conversationsListScreenState.loadMoreStatus : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? conversationsListScreenState.receivedMessageAuthor : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32768) != 0 ? conversationsListScreenState.receivedMessageUnreadCount : 0);
        Logger.d(LOG_TAG, "Create New Conversation State: " + createConversationState, new Object[0]);
        return conversationsListScreenStateCopy;
    }
}
