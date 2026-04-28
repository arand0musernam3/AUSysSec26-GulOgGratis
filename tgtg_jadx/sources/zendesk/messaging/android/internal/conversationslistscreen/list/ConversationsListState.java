package zendesk.messaging.android.internal.conversationslistscreen.list;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.core.ui.android.internal.model.ConversationEntry;
import zendesk.messaging.android.internal.model.MessagingTheme;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001!B+\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÀ\u0003¢\u0006\u0002\b\u0014J\u000e\u0010\u0015\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b\u0016J\u000e\u0010\u0017\u001a\u00020\bHÀ\u0003¢\u0006\u0002\b\u0018J-\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListState;", "", "conversations", "", "Lzendesk/core/ui/android/internal/model/ConversationEntry;", "loadMoreStatus", "Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;", "messagingTheme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "<init>", "(Ljava/util/List;Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "getConversations$zendesk_messaging_messaging_android", "()Ljava/util/List;", "getLoadMoreStatus$zendesk_messaging_messaging_android", "()Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;", "getMessagingTheme$zendesk_messaging_messaging_android", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "toBuilder", "Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListState$Builder;", "component1", "component1$zendesk_messaging_messaging_android", "component2", "component2$zendesk_messaging_messaging_android", "component3", "component3$zendesk_messaging_messaging_android", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Builder", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ConversationsListState {

    @NotNull
    private final List<ConversationEntry> conversations;

    @NotNull
    private final ConversationEntry.LoadMoreStatus loadMoreStatus;

    @NotNull
    private final MessagingTheme messagingTheme;

    public ConversationsListState(List list, ConversationEntry.LoadMoreStatus loadMoreStatus, MessagingTheme messagingTheme, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? n0.f26529a : list, (i11 & 2) != 0 ? ConversationEntry.LoadMoreStatus.NONE : loadMoreStatus, (i11 & 4) != 0 ? MessagingTheme.INSTANCE.getDEFAULT() : messagingTheme);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationsListState copy$default(ConversationsListState conversationsListState, List list, ConversationEntry.LoadMoreStatus loadMoreStatus, MessagingTheme messagingTheme, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = conversationsListState.conversations;
        }
        if ((i11 & 2) != 0) {
            loadMoreStatus = conversationsListState.loadMoreStatus;
        }
        if ((i11 & 4) != 0) {
            messagingTheme = conversationsListState.messagingTheme;
        }
        return conversationsListState.copy(list, loadMoreStatus, messagingTheme);
    }

    @NotNull
    public final List<ConversationEntry> component1$zendesk_messaging_messaging_android() {
        return this.conversations;
    }

    @NotNull
    /* JADX INFO: renamed from: component2$zendesk_messaging_messaging_android, reason: from getter */
    public final ConversationEntry.LoadMoreStatus getLoadMoreStatus() {
        return this.loadMoreStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component3$zendesk_messaging_messaging_android, reason: from getter */
    public final MessagingTheme getMessagingTheme() {
        return this.messagingTheme;
    }

    @NotNull
    public final ConversationsListState copy(@NotNull List<? extends ConversationEntry> conversations, @NotNull ConversationEntry.LoadMoreStatus loadMoreStatus, @NotNull MessagingTheme messagingTheme) {
        conversations.getClass();
        loadMoreStatus.getClass();
        messagingTheme.getClass();
        return new ConversationsListState(conversations, loadMoreStatus, messagingTheme);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationsListState)) {
            return false;
        }
        ConversationsListState conversationsListState = (ConversationsListState) other;
        return Intrinsics.areEqual(this.conversations, conversationsListState.conversations) && this.loadMoreStatus == conversationsListState.loadMoreStatus && Intrinsics.areEqual(this.messagingTheme, conversationsListState.messagingTheme);
    }

    @NotNull
    public final List<ConversationEntry> getConversations$zendesk_messaging_messaging_android() {
        return this.conversations;
    }

    @NotNull
    public final ConversationEntry.LoadMoreStatus getLoadMoreStatus$zendesk_messaging_messaging_android() {
        return this.loadMoreStatus;
    }

    @NotNull
    public final MessagingTheme getMessagingTheme$zendesk_messaging_messaging_android() {
        return this.messagingTheme;
    }

    public int hashCode() {
        return this.messagingTheme.hashCode() + ((this.loadMoreStatus.hashCode() + (this.conversations.hashCode() * 31)) * 31);
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    @NotNull
    public String toString() {
        return "ConversationsListState(conversations=" + this.conversations + ", loadMoreStatus=" + this.loadMoreStatus + ", messagingTheme=" + this.messagingTheme + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListState$Builder;", "", "<init>", "()V", "state", "Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListState;", "(Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListState;)V", "listConversations", "conversations", "", "Lzendesk/core/ui/android/internal/model/ConversationEntry;", "loadMoreStatus", "Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;", "build", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private ConversationsListState state;

        public Builder() {
            this.state = new ConversationsListState(null, null, null, 7, null);
        }

        @NotNull
        /* JADX INFO: renamed from: build, reason: from getter */
        public final ConversationsListState getState() {
            return this.state;
        }

        @NotNull
        public final Builder listConversations(@NotNull List<? extends ConversationEntry> conversations) {
            conversations.getClass();
            this.state = ConversationsListState.copy$default(this.state, conversations, null, null, 6, null);
            return this;
        }

        @NotNull
        public final Builder loadMoreStatus(@NotNull ConversationEntry.LoadMoreStatus loadMoreStatus) {
            loadMoreStatus.getClass();
            this.state = ConversationsListState.copy$default(this.state, null, loadMoreStatus, null, 5, null);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull ConversationsListState conversationsListState) {
            this();
            conversationsListState.getClass();
            this.state = conversationsListState;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationsListState(@NotNull List<? extends ConversationEntry> list, @NotNull ConversationEntry.LoadMoreStatus loadMoreStatus, @NotNull MessagingTheme messagingTheme) {
        list.getClass();
        loadMoreStatus.getClass();
        messagingTheme.getClass();
        this.conversations = list;
        this.loadMoreStatus = loadMoreStatus;
        this.messagingTheme = messagingTheme;
    }

    public ConversationsListState() {
        this(null, null, null, 7, null);
    }
}
