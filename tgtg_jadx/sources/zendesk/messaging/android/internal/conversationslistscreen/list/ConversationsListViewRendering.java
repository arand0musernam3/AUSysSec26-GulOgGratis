package zendesk.messaging.android.internal.conversationslistscreen.list;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import zendesk.core.ui.android.internal.model.ConversationEntry;
import zendesk.messaging.android.internal.conversationscreen.n;
import zendesk.messaging.android.internal.conversationscreen.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001 B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0006\u0010\u001f\u001a\u00020\u0003R$\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\bj\u0002`\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\n0\u0017j\u0002`\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListViewRendering;", "", "builder", "Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListViewRendering$Builder;", "<init>", "(Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListViewRendering$Builder;)V", "()V", "onListItemClickLambda", "Lkotlin/Function1;", "Lzendesk/core/ui/android/internal/model/ConversationEntry$ConversationItem;", "", "Lzendesk/messaging/android/internal/conversationslistscreen/list/OnListItemClickLambda;", "getOnListItemClickLambda$zendesk_messaging_messaging_android", "()Lkotlin/jvm/functions/Function1;", "onRetryClickLambda", "Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMore;", "Lzendesk/messaging/android/internal/conversationslistscreen/list/OnRetryItemClickLambda;", "getOnRetryClickLambda$zendesk_messaging_messaging_android", "loadMoreStatus", "Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;", "getLoadMoreStatus$zendesk_messaging_messaging_android", "()Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;", "onLoadMoreListener", "Lkotlin/Function0;", "Lzendesk/messaging/android/internal/conversationslistscreen/list/OnLastItemScrolled;", "getOnLoadMoreListener$zendesk_messaging_messaging_android", "()Lkotlin/jvm/functions/Function0;", "state", "Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListState;", "getState$zendesk_messaging_messaging_android", "()Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListState;", "toBuilder", "Builder", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationsListViewRendering {

    @NotNull
    private final ConversationEntry.LoadMoreStatus loadMoreStatus;

    @NotNull
    private final Function1<ConversationEntry.ConversationItem, Unit> onListItemClickLambda;

    @NotNull
    private final Function0<Unit> onLoadMoreListener;

    @NotNull
    private final Function1<ConversationEntry.LoadMore, Unit> onRetryClickLambda;

    @NotNull
    private final ConversationsListState state;

    public ConversationsListViewRendering(@NotNull Builder builder) {
        builder.getClass();
        this.onListItemClickLambda = builder.getOnListItemClickLambda$zendesk_messaging_messaging_android();
        this.onRetryClickLambda = builder.getOnRetryItemClickLambda$zendesk_messaging_messaging_android();
        this.loadMoreStatus = builder.getLoadMoreStatus();
        this.onLoadMoreListener = builder.getOnLastItemScrolled$zendesk_messaging_messaging_android();
        this.state = builder.getState();
    }

    @NotNull
    /* JADX INFO: renamed from: getLoadMoreStatus$zendesk_messaging_messaging_android, reason: from getter */
    public final ConversationEntry.LoadMoreStatus getLoadMoreStatus() {
        return this.loadMoreStatus;
    }

    @NotNull
    public final Function1<ConversationEntry.ConversationItem, Unit> getOnListItemClickLambda$zendesk_messaging_messaging_android() {
        return this.onListItemClickLambda;
    }

    @NotNull
    public final Function0<Unit> getOnLoadMoreListener$zendesk_messaging_messaging_android() {
        return this.onLoadMoreListener;
    }

    @NotNull
    public final Function1<ConversationEntry.LoadMore, Unit> getOnRetryClickLambda$zendesk_messaging_messaging_android() {
        return this.onRetryClickLambda;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$zendesk_messaging_messaging_android, reason: from getter */
    public final ConversationsListState getState() {
        return this.state;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    public ConversationsListViewRendering() {
        this(new Builder());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u001a\u0010\"\u001a\u00020\u00002\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0\bJ\u001e\u0010\u0007\u001a\u00020\u00002\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000bJ\u001e\u0010\u0010\u001a\u00020\u00002\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\bj\u0002`\u0012J\u0018\u0010)\u001a\u00020\u00002\u0010\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\n0\u001cj\u0002`\u001dJ\u0006\u0010*\u001a\u00020\u0005R*\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\bj\u0002`\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u0016X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\n0\u001cj\u0002`\u001dX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListViewRendering$Builder;", "", "<init>", "()V", "rendering", "Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListViewRendering;", "(Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListViewRendering;)V", "onListItemClickLambda", "Lkotlin/Function1;", "Lzendesk/core/ui/android/internal/model/ConversationEntry$ConversationItem;", "", "Lzendesk/messaging/android/internal/conversationslistscreen/list/OnListItemClickLambda;", "getOnListItemClickLambda$zendesk_messaging_messaging_android", "()Lkotlin/jvm/functions/Function1;", "setOnListItemClickLambda$zendesk_messaging_messaging_android", "(Lkotlin/jvm/functions/Function1;)V", "onRetryItemClickLambda", "Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMore;", "Lzendesk/messaging/android/internal/conversationslistscreen/list/OnRetryItemClickLambda;", "getOnRetryItemClickLambda$zendesk_messaging_messaging_android", "setOnRetryItemClickLambda$zendesk_messaging_messaging_android", "loadMoreStatus", "Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;", "getLoadMoreStatus$zendesk_messaging_messaging_android", "()Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;", "setLoadMoreStatus$zendesk_messaging_messaging_android", "(Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMoreStatus;)V", "onLastItemScrolled", "Lkotlin/Function0;", "Lzendesk/messaging/android/internal/conversationslistscreen/list/OnLastItemScrolled;", "getOnLastItemScrolled$zendesk_messaging_messaging_android", "()Lkotlin/jvm/functions/Function0;", "setOnLastItemScrolled$zendesk_messaging_messaging_android", "(Lkotlin/jvm/functions/Function0;)V", "state", "Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListState;", "getState$zendesk_messaging_messaging_android", "()Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListState;", "setState$zendesk_messaging_messaging_android", "(Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListState;)V", "stateUpdate", "loadMoreListener", "build", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private ConversationEntry.LoadMoreStatus loadMoreStatus;

        @NotNull
        private Function0<Unit> onLastItemScrolled;

        @NotNull
        private Function1<? super ConversationEntry.ConversationItem, Unit> onListItemClickLambda;

        @NotNull
        private Function1<? super ConversationEntry.LoadMore, Unit> onRetryItemClickLambda;

        @NotNull
        private ConversationsListState state;

        public Builder() {
            this.onListItemClickLambda = new o(21);
            this.onRetryItemClickLambda = new o(22);
            this.loadMoreStatus = ConversationEntry.LoadMoreStatus.NONE;
            this.onLastItemScrolled = new n(19);
            this.state = new ConversationsListState(null, null, null, 7, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onListItemClickLambda$lambda$0(ConversationEntry.ConversationItem conversationItem) {
            conversationItem.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onRetryItemClickLambda$lambda$1(ConversationEntry.LoadMore loadMore) {
            loadMore.getClass();
            return Unit.f26487a;
        }

        @NotNull
        public final ConversationsListViewRendering build() {
            return new ConversationsListViewRendering(this);
        }

        @NotNull
        /* JADX INFO: renamed from: getLoadMoreStatus$zendesk_messaging_messaging_android, reason: from getter */
        public final ConversationEntry.LoadMoreStatus getLoadMoreStatus() {
            return this.loadMoreStatus;
        }

        @NotNull
        public final Function0<Unit> getOnLastItemScrolled$zendesk_messaging_messaging_android() {
            return this.onLastItemScrolled;
        }

        @NotNull
        public final Function1<ConversationEntry.ConversationItem, Unit> getOnListItemClickLambda$zendesk_messaging_messaging_android() {
            return this.onListItemClickLambda;
        }

        @NotNull
        public final Function1<ConversationEntry.LoadMore, Unit> getOnRetryItemClickLambda$zendesk_messaging_messaging_android() {
            return this.onRetryItemClickLambda;
        }

        @NotNull
        /* JADX INFO: renamed from: getState$zendesk_messaging_messaging_android, reason: from getter */
        public final ConversationsListState getState() {
            return this.state;
        }

        @NotNull
        public final Builder loadMoreListener(@NotNull Function0<Unit> onLastItemScrolled) {
            onLastItemScrolled.getClass();
            this.onLastItemScrolled = onLastItemScrolled;
            return this;
        }

        @NotNull
        public final Builder onListItemClickLambda(@NotNull Function1<? super ConversationEntry.ConversationItem, Unit> onListItemClickLambda) {
            onListItemClickLambda.getClass();
            this.onListItemClickLambda = onListItemClickLambda;
            return this;
        }

        @NotNull
        public final Builder onRetryItemClickLambda(@NotNull Function1<? super ConversationEntry.LoadMore, Unit> onRetryItemClickLambda) {
            onRetryItemClickLambda.getClass();
            this.onRetryItemClickLambda = onRetryItemClickLambda;
            return this;
        }

        public final void setLoadMoreStatus$zendesk_messaging_messaging_android(@NotNull ConversationEntry.LoadMoreStatus loadMoreStatus) {
            loadMoreStatus.getClass();
            this.loadMoreStatus = loadMoreStatus;
        }

        public final void setOnLastItemScrolled$zendesk_messaging_messaging_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onLastItemScrolled = function0;
        }

        public final void setOnListItemClickLambda$zendesk_messaging_messaging_android(@NotNull Function1<? super ConversationEntry.ConversationItem, Unit> function1) {
            function1.getClass();
            this.onListItemClickLambda = function1;
        }

        public final void setOnRetryItemClickLambda$zendesk_messaging_messaging_android(@NotNull Function1<? super ConversationEntry.LoadMore, Unit> function1) {
            function1.getClass();
            this.onRetryItemClickLambda = function1;
        }

        public final void setState$zendesk_messaging_messaging_android(@NotNull ConversationsListState conversationsListState) {
            conversationsListState.getClass();
            this.state = conversationsListState;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super ConversationsListState, ConversationsListState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (ConversationsListState) stateUpdate.invoke(this.state);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull ConversationsListViewRendering conversationsListViewRendering) {
            this();
            conversationsListViewRendering.getClass();
            this.onListItemClickLambda = conversationsListViewRendering.getOnListItemClickLambda$zendesk_messaging_messaging_android();
            this.onRetryItemClickLambda = conversationsListViewRendering.getOnRetryClickLambda$zendesk_messaging_messaging_android();
            this.loadMoreStatus = conversationsListViewRendering.getLoadMoreStatus();
            this.state = conversationsListViewRendering.getState();
        }

        public /* synthetic */ Builder(ConversationsListViewRendering conversationsListViewRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new ConversationsListViewRendering() : conversationsListViewRendering);
        }
    }
}
