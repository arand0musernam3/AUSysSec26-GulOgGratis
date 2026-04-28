package zendesk.messaging.android.internal.conversationslistscreen;

import b3.i;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;
import zendesk.conversationkit.android.ConnectionStatus;
import zendesk.core.ui.android.internal.model.ConversationEntry;
import zendesk.messaging.android.internal.model.MessagingTheme;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b>\b\u0080\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b+\u0010%J\u0010\u0010,\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b0\u0010%J\u0010\u00101\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b5\u0010!J\u0010\u00106\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b6\u00102Jº\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0016HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b9\u0010!J\u0010\u0010:\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b:\u00102J\u001a\u0010<\u001a\u00020\b2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bB\u0010!R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bC\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010D\u001a\u0004\b\t\u0010%R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bE\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010F\u001a\u0004\bG\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\bI\u0010*R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010D\u001a\u0004\bJ\u0010%R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bL\u0010-R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010M\u001a\u0004\bN\u0010/R\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010D\u001a\u0004\bO\u0010%R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010P\u001a\u0004\bQ\u00102R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010R\u001a\u0004\bS\u00104R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010@\u001a\u0004\bT\u0010!R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u001b\u0010P\u001a\u0004\bU\u00102¨\u0006V"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;", "", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "messagingTheme", "", MessageBundle.TITLE_ENTRY, "description", "logoUrl", "", "isMultiConvoEnabled", "canUserCreateMoreConversations", "Ls80/b;", "Lzendesk/core/ui/android/internal/model/ConversationEntry;", "conversations", "Lzendesk/conversationkit/android/ConnectionStatus;", "connectionStatus", "showDeniedPermission", "Lzendesk/messaging/android/internal/conversationslistscreen/CreateConversationState;", "createConversationState", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListState;", "conversationsListState", "shouldLoadMore", "", "currentPaginationOffset", "Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;", "loadMoreStatus", "receivedMessageAuthor", "receivedMessageUnreadCount", "<init>", "(Lzendesk/messaging/android/internal/model/MessagingTheme;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLs80/b;Lzendesk/conversationkit/android/ConnectionStatus;ZLzendesk/messaging/android/internal/conversationslistscreen/CreateConversationState;Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListState;ZILzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;Ljava/lang/String;I)V", "component1", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Z", "component6", "component7", "()Ls80/b;", "component8", "()Lzendesk/conversationkit/android/ConnectionStatus;", "component9", "component10", "()Lzendesk/messaging/android/internal/conversationslistscreen/CreateConversationState;", "component11", "()Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListState;", "component12", "component13", "()I", "component14", "()Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;", "component15", "component16", "copy", "(Lzendesk/messaging/android/internal/model/MessagingTheme;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLs80/b;Lzendesk/conversationkit/android/ConnectionStatus;ZLzendesk/messaging/android/internal/conversationslistscreen/CreateConversationState;Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListState;ZILzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;Ljava/lang/String;I)Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "getMessagingTheme", "Ljava/lang/String;", "getTitle", "getDescription", "getLogoUrl", "Z", "getCanUserCreateMoreConversations", "Ls80/b;", "getConversations", "Lzendesk/conversationkit/android/ConnectionStatus;", "getConnectionStatus", "getShowDeniedPermission", "Lzendesk/messaging/android/internal/conversationslistscreen/CreateConversationState;", "getCreateConversationState", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListState;", "getConversationsListState", "getShouldLoadMore", "I", "getCurrentPaginationOffset", "Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;", "getLoadMoreStatus", "getReceivedMessageAuthor", "getReceivedMessageUnreadCount", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ConversationsListScreenState {
    private final boolean canUserCreateMoreConversations;

    @Nullable
    private final ConnectionStatus connectionStatus;

    @NotNull
    private final s80.b conversations;

    @NotNull
    private final ConversationsListState conversationsListState;

    @NotNull
    private final CreateConversationState createConversationState;
    private final int currentPaginationOffset;

    @NotNull
    private final String description;
    private final boolean isMultiConvoEnabled;

    @NotNull
    private final ConversationEntry.LoadMoreStatus loadMoreStatus;

    @NotNull
    private final String logoUrl;

    @NotNull
    private final MessagingTheme messagingTheme;

    @Nullable
    private final String receivedMessageAuthor;
    private final int receivedMessageUnreadCount;
    private final boolean shouldLoadMore;
    private final boolean showDeniedPermission;

    @NotNull
    private final String title;

    public ConversationsListScreenState(MessagingTheme messagingTheme, String str, String str2, String str3, boolean z11, boolean z12, s80.b bVar, ConnectionStatus connectionStatus, boolean z13, CreateConversationState createConversationState, ConversationsListState conversationsListState, boolean z14, int i11, ConversationEntry.LoadMoreStatus loadMoreStatus, String str4, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? MessagingTheme.INSTANCE.getDEFAULT() : messagingTheme, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? "" : str2, (i13 & 8) == 0 ? str3 : "", (i13 & 16) != 0 ? false : z11, (i13 & 32) != 0 ? false : z12, (i13 & 64) != 0 ? t80.g.f39858c : bVar, (i13 & 128) != 0 ? null : connectionStatus, (i13 & 256) != 0 ? false : z13, (i13 & 512) != 0 ? CreateConversationState.IDLE : createConversationState, (i13 & 1024) != 0 ? ConversationsListState.IDLE : conversationsListState, (i13 & NewHope.SENDB_BYTES) != 0 ? false : z14, (i13 & 4096) != 0 ? 0 : i11, (i13 & 8192) != 0 ? ConversationEntry.LoadMoreStatus.NONE : loadMoreStatus, (i13 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? null : str4, (i13 & 32768) != 0 ? 0 : i12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MessagingTheme getMessagingTheme() {
        return this.messagingTheme;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final CreateConversationState getCreateConversationState() {
        return this.createConversationState;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final ConversationsListState getConversationsListState() {
        return this.conversationsListState;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getShouldLoadMore() {
        return this.shouldLoadMore;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getCurrentPaginationOffset() {
        return this.currentPaginationOffset;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final ConversationEntry.LoadMoreStatus getLoadMoreStatus() {
        return this.loadMoreStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getReceivedMessageAuthor() {
        return this.receivedMessageAuthor;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getReceivedMessageUnreadCount() {
        return this.receivedMessageUnreadCount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsMultiConvoEnabled() {
        return this.isMultiConvoEnabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getCanUserCreateMoreConversations() {
        return this.canUserCreateMoreConversations;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final s80.b getConversations() {
        return this.conversations;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ConnectionStatus getConnectionStatus() {
        return this.connectionStatus;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getShowDeniedPermission() {
        return this.showDeniedPermission;
    }

    @NotNull
    public final ConversationsListScreenState copy(@NotNull MessagingTheme messagingTheme, @NotNull String title, @NotNull String description, @NotNull String logoUrl, boolean isMultiConvoEnabled, boolean canUserCreateMoreConversations, @NotNull s80.b conversations, @Nullable ConnectionStatus connectionStatus, boolean showDeniedPermission, @NotNull CreateConversationState createConversationState, @NotNull ConversationsListState conversationsListState, boolean shouldLoadMore, int currentPaginationOffset, @NotNull ConversationEntry.LoadMoreStatus loadMoreStatus, @Nullable String receivedMessageAuthor, int receivedMessageUnreadCount) {
        messagingTheme.getClass();
        title.getClass();
        description.getClass();
        logoUrl.getClass();
        conversations.getClass();
        createConversationState.getClass();
        conversationsListState.getClass();
        loadMoreStatus.getClass();
        return new ConversationsListScreenState(messagingTheme, title, description, logoUrl, isMultiConvoEnabled, canUserCreateMoreConversations, conversations, connectionStatus, showDeniedPermission, createConversationState, conversationsListState, shouldLoadMore, currentPaginationOffset, loadMoreStatus, receivedMessageAuthor, receivedMessageUnreadCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationsListScreenState)) {
            return false;
        }
        ConversationsListScreenState conversationsListScreenState = (ConversationsListScreenState) other;
        return Intrinsics.areEqual(this.messagingTheme, conversationsListScreenState.messagingTheme) && Intrinsics.areEqual(this.title, conversationsListScreenState.title) && Intrinsics.areEqual(this.description, conversationsListScreenState.description) && Intrinsics.areEqual(this.logoUrl, conversationsListScreenState.logoUrl) && this.isMultiConvoEnabled == conversationsListScreenState.isMultiConvoEnabled && this.canUserCreateMoreConversations == conversationsListScreenState.canUserCreateMoreConversations && Intrinsics.areEqual(this.conversations, conversationsListScreenState.conversations) && this.connectionStatus == conversationsListScreenState.connectionStatus && this.showDeniedPermission == conversationsListScreenState.showDeniedPermission && this.createConversationState == conversationsListScreenState.createConversationState && this.conversationsListState == conversationsListScreenState.conversationsListState && this.shouldLoadMore == conversationsListScreenState.shouldLoadMore && this.currentPaginationOffset == conversationsListScreenState.currentPaginationOffset && this.loadMoreStatus == conversationsListScreenState.loadMoreStatus && Intrinsics.areEqual(this.receivedMessageAuthor, conversationsListScreenState.receivedMessageAuthor) && this.receivedMessageUnreadCount == conversationsListScreenState.receivedMessageUnreadCount;
    }

    public final boolean getCanUserCreateMoreConversations() {
        return this.canUserCreateMoreConversations;
    }

    @Nullable
    public final ConnectionStatus getConnectionStatus() {
        return this.connectionStatus;
    }

    @NotNull
    public final s80.b getConversations() {
        return this.conversations;
    }

    @NotNull
    public final ConversationsListState getConversationsListState() {
        return this.conversationsListState;
    }

    @NotNull
    public final CreateConversationState getCreateConversationState() {
        return this.createConversationState;
    }

    public final int getCurrentPaginationOffset() {
        return this.currentPaginationOffset;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final ConversationEntry.LoadMoreStatus getLoadMoreStatus() {
        return this.loadMoreStatus;
    }

    @NotNull
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @NotNull
    public final MessagingTheme getMessagingTheme() {
        return this.messagingTheme;
    }

    @Nullable
    public final String getReceivedMessageAuthor() {
        return this.receivedMessageAuthor;
    }

    public final int getReceivedMessageUnreadCount() {
        return this.receivedMessageUnreadCount;
    }

    public final boolean getShouldLoadMore() {
        return this.shouldLoadMore;
    }

    public final boolean getShowDeniedPermission() {
        return this.showDeniedPermission;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.conversations.hashCode() + k.e(k.e(l1.b(l1.b(l1.b(this.messagingTheme.hashCode() * 31, 31, this.title), 31, this.description), 31, this.logoUrl), 31, this.isMultiConvoEnabled), 31, this.canUserCreateMoreConversations)) * 31;
        ConnectionStatus connectionStatus = this.connectionStatus;
        int iHashCode2 = (this.loadMoreStatus.hashCode() + k.b(this.currentPaginationOffset, k.e((this.conversationsListState.hashCode() + ((this.createConversationState.hashCode() + k.e((iHashCode + (connectionStatus == null ? 0 : connectionStatus.hashCode())) * 31, 31, this.showDeniedPermission)) * 31)) * 31, 31, this.shouldLoadMore), 31)) * 31;
        String str = this.receivedMessageAuthor;
        return Integer.hashCode(this.receivedMessageUnreadCount) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final boolean isMultiConvoEnabled() {
        return this.isMultiConvoEnabled;
    }

    @NotNull
    public String toString() {
        MessagingTheme messagingTheme = this.messagingTheme;
        String str = this.title;
        String str2 = this.description;
        String str3 = this.logoUrl;
        boolean z11 = this.isMultiConvoEnabled;
        boolean z12 = this.canUserCreateMoreConversations;
        s80.b bVar = this.conversations;
        ConnectionStatus connectionStatus = this.connectionStatus;
        boolean z13 = this.showDeniedPermission;
        CreateConversationState createConversationState = this.createConversationState;
        ConversationsListState conversationsListState = this.conversationsListState;
        boolean z14 = this.shouldLoadMore;
        int i11 = this.currentPaginationOffset;
        ConversationEntry.LoadMoreStatus loadMoreStatus = this.loadMoreStatus;
        String str4 = this.receivedMessageAuthor;
        int i12 = this.receivedMessageUnreadCount;
        StringBuilder sb2 = new StringBuilder("ConversationsListScreenState(messagingTheme=");
        sb2.append(messagingTheme);
        sb2.append(", title=");
        sb2.append(str);
        sb2.append(", description=");
        s.A(sb2, str2, ", logoUrl=", str3, ", isMultiConvoEnabled=");
        i.C(sb2, z11, ", canUserCreateMoreConversations=", z12, ", conversations=");
        sb2.append(bVar);
        sb2.append(", connectionStatus=");
        sb2.append(connectionStatus);
        sb2.append(", showDeniedPermission=");
        sb2.append(z13);
        sb2.append(", createConversationState=");
        sb2.append(createConversationState);
        sb2.append(", conversationsListState=");
        sb2.append(conversationsListState);
        sb2.append(", shouldLoadMore=");
        sb2.append(z14);
        sb2.append(", currentPaginationOffset=");
        sb2.append(i11);
        sb2.append(", loadMoreStatus=");
        sb2.append(loadMoreStatus);
        sb2.append(", receivedMessageAuthor=");
        sb2.append(str4);
        sb2.append(", receivedMessageUnreadCount=");
        sb2.append(i12);
        sb2.append(")");
        return sb2.toString();
    }

    public ConversationsListScreenState(@NotNull MessagingTheme messagingTheme, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z11, boolean z12, @NotNull s80.b bVar, @Nullable ConnectionStatus connectionStatus, boolean z13, @NotNull CreateConversationState createConversationState, @NotNull ConversationsListState conversationsListState, boolean z14, int i11, @NotNull ConversationEntry.LoadMoreStatus loadMoreStatus, @Nullable String str4, int i12) {
        messagingTheme.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        bVar.getClass();
        createConversationState.getClass();
        conversationsListState.getClass();
        loadMoreStatus.getClass();
        this.messagingTheme = messagingTheme;
        this.title = str;
        this.description = str2;
        this.logoUrl = str3;
        this.isMultiConvoEnabled = z11;
        this.canUserCreateMoreConversations = z12;
        this.conversations = bVar;
        this.connectionStatus = connectionStatus;
        this.showDeniedPermission = z13;
        this.createConversationState = createConversationState;
        this.conversationsListState = conversationsListState;
        this.shouldLoadMore = z14;
        this.currentPaginationOffset = i11;
        this.loadMoreStatus = loadMoreStatus;
        this.receivedMessageAuthor = str4;
        this.receivedMessageUnreadCount = i12;
    }

    public ConversationsListScreenState() {
        this(null, null, null, null, false, false, null, null, false, null, null, false, 0, null, null, 0, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
    }
}
