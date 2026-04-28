package zendesk.messaging.android.internal.conversationslistscreen;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zendesk.core.ui.android.internal.model.ConversationEntry;
import zendesk.messaging.android.internal.conversationscreen.n;
import zendesk.messaging.android.internal.conversationscreen.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0006\u0010'\u001a\u00020\u0003R\u001e\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0010j\u0002`\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR$\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0010j\u0002`\u0019X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u001e\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\u001cX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\fR\u001e\u0010\u001e\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\u001fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\fR\u001e\u0010!\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\fR\u0014\u0010#\u001a\u00020$X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenRendering;", "", "builder", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenRendering$Builder;", "<init>", "(Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenRendering$Builder;)V", "()V", "onBackButtonClicked", "Lkotlin/Function0;", "", "Lzendesk/messaging/android/internal/conversationslistscreen/OnClickLambda;", "getOnBackButtonClicked$zendesk_messaging_messaging_android", "()Lkotlin/jvm/functions/Function0;", "onCreateConvoButtonClicked", "getOnCreateConvoButtonClicked$zendesk_messaging_messaging_android", "onListItemClickLambda", "Lkotlin/Function1;", "Lzendesk/core/ui/android/internal/model/ConversationEntry$ConversationItem;", "Lzendesk/messaging/android/internal/conversationslistscreen/OnListItemClickLambda;", "getOnListItemClickLambda$zendesk_messaging_messaging_android", "()Lkotlin/jvm/functions/Function1;", "onRetryButtonClicked", "getOnRetryButtonClicked$zendesk_messaging_messaging_android", "onRetryPaginationClick", "Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMore;", "Lzendesk/messaging/android/internal/conversationslistscreen/OnRetryPaginationClickLambda;", "getOnRetryPaginationClick$zendesk_messaging_messaging_android", "onMessageReceivedAuthorAnnounced", "Lzendesk/messaging/android/internal/conversationslistscreen/OnEventLambda;", "getOnMessageReceivedAuthorAnnounced$zendesk_messaging_messaging_android", "onStartPagingLambda", "Lzendesk/messaging/android/internal/conversationslistscreen/OnStartPagingLambda;", "getOnStartPagingLambda$zendesk_messaging_messaging_android", "onDismissCreateConversationError", "getOnDismissCreateConversationError$zendesk_messaging_messaging_android", "state", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;", "getState$zendesk_messaging_messaging_android", "()Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;", "toBuilder", "Builder", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationsListScreenRendering {

    @NotNull
    private final Function0<Unit> onBackButtonClicked;

    @NotNull
    private final Function0<Unit> onCreateConvoButtonClicked;

    @NotNull
    private final Function0<Unit> onDismissCreateConversationError;

    @NotNull
    private final Function1<ConversationEntry.ConversationItem, Unit> onListItemClickLambda;

    @NotNull
    private final Function0<Unit> onMessageReceivedAuthorAnnounced;

    @NotNull
    private final Function0<Unit> onRetryButtonClicked;

    @NotNull
    private final Function1<ConversationEntry.LoadMore, Unit> onRetryPaginationClick;

    @NotNull
    private final Function0<Unit> onStartPagingLambda;

    @NotNull
    private final ConversationsListScreenState state;

    public ConversationsListScreenRendering(@NotNull Builder builder) {
        builder.getClass();
        this.onBackButtonClicked = builder.getOnBackButtonClicked$zendesk_messaging_messaging_android();
        this.onCreateConvoButtonClicked = builder.getOnCreateConvoButtonClicked$zendesk_messaging_messaging_android();
        this.onListItemClickLambda = builder.getOnListItemClickLambda$zendesk_messaging_messaging_android();
        this.onRetryButtonClicked = builder.getOnRetryButtonClicked$zendesk_messaging_messaging_android();
        this.onRetryPaginationClick = builder.getOnRetryPaginationClicked$zendesk_messaging_messaging_android();
        this.onMessageReceivedAuthorAnnounced = builder.getOnMessageReceivedAuthorAnnounced$zendesk_messaging_messaging_android();
        this.onStartPagingLambda = builder.getOnStartPagingLambda$zendesk_messaging_messaging_android();
        this.onDismissCreateConversationError = builder.getOnDismissCreateConversationError$zendesk_messaging_messaging_android();
        this.state = builder.getState();
    }

    @NotNull
    public final Function0<Unit> getOnBackButtonClicked$zendesk_messaging_messaging_android() {
        return this.onBackButtonClicked;
    }

    @NotNull
    public final Function0<Unit> getOnCreateConvoButtonClicked$zendesk_messaging_messaging_android() {
        return this.onCreateConvoButtonClicked;
    }

    @NotNull
    public final Function0<Unit> getOnDismissCreateConversationError$zendesk_messaging_messaging_android() {
        return this.onDismissCreateConversationError;
    }

    @NotNull
    public final Function1<ConversationEntry.ConversationItem, Unit> getOnListItemClickLambda$zendesk_messaging_messaging_android() {
        return this.onListItemClickLambda;
    }

    @NotNull
    public final Function0<Unit> getOnMessageReceivedAuthorAnnounced$zendesk_messaging_messaging_android() {
        return this.onMessageReceivedAuthorAnnounced;
    }

    @NotNull
    public final Function0<Unit> getOnRetryButtonClicked$zendesk_messaging_messaging_android() {
        return this.onRetryButtonClicked;
    }

    @NotNull
    public final Function1<ConversationEntry.LoadMore, Unit> getOnRetryPaginationClick$zendesk_messaging_messaging_android() {
        return this.onRetryPaginationClick;
    }

    @NotNull
    public final Function0<Unit> getOnStartPagingLambda$zendesk_messaging_messaging_android() {
        return this.onStartPagingLambda;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$zendesk_messaging_messaging_android, reason: from getter */
    public final ConversationsListScreenState getState() {
        return this.state;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    public ConversationsListScreenRendering() {
        this(new Builder());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00002\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\nJ\u0018\u00103\u001a\u00020\u00002\u0010\u00104\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\nJ\u001e\u00105\u001a\u00020\u00002\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013j\u0002`\u0015J\u0018\u0010*\u001a\u00020\u00002\u0010\u0010*\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\nJ\u0018\u0010\u001a\u001a\u00020\u00002\u0010\u00104\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\nJ\u001e\u0010\u001d\u001a\u00020\u00002\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\t0\u0013j\u0002`\u001fJ\u0018\u00106\u001a\u00020\u00002\u0010\u0010&\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`'J\u0018\u0010\"\u001a\u00020\u00002\u0010\u00107\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`#J\u001a\u0010-\u001a\u00020\u00002\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0\u0013J\u0006\u00109\u001a\u00020\u0005R$\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013j\u0002`\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR*\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\t0\u0013j\u0002`\u001fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R$\u0010\"\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`#X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000eR$\u0010&\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`'X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR$\u0010*\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u001a\u0010-\u001a\u00020.X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u0006:"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenRendering$Builder;", "", "<init>", "()V", "rendering", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenRendering;", "(Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenRendering;)V", "onBackButtonClicked", "Lkotlin/Function0;", "", "Lzendesk/messaging/android/internal/conversationslistscreen/OnClickLambda;", "getOnBackButtonClicked$zendesk_messaging_messaging_android", "()Lkotlin/jvm/functions/Function0;", "setOnBackButtonClicked$zendesk_messaging_messaging_android", "(Lkotlin/jvm/functions/Function0;)V", "onCreateConvoButtonClicked", "getOnCreateConvoButtonClicked$zendesk_messaging_messaging_android", "setOnCreateConvoButtonClicked$zendesk_messaging_messaging_android", "onListItemClickLambda", "Lkotlin/Function1;", "Lzendesk/core/ui/android/internal/model/ConversationEntry$ConversationItem;", "Lzendesk/messaging/android/internal/conversationslistscreen/OnListItemClickLambda;", "getOnListItemClickLambda$zendesk_messaging_messaging_android", "()Lkotlin/jvm/functions/Function1;", "setOnListItemClickLambda$zendesk_messaging_messaging_android", "(Lkotlin/jvm/functions/Function1;)V", "onRetryButtonClicked", "getOnRetryButtonClicked$zendesk_messaging_messaging_android", "setOnRetryButtonClicked$zendesk_messaging_messaging_android", "onRetryPaginationClicked", "Lzendesk/core/ui/android/internal/model/ConversationEntry$LoadMore;", "Lzendesk/messaging/android/internal/conversationslistscreen/OnRetryPaginationClickLambda;", "getOnRetryPaginationClicked$zendesk_messaging_messaging_android", "setOnRetryPaginationClicked$zendesk_messaging_messaging_android", "onMessageReceivedAuthorAnnounced", "Lzendesk/messaging/android/internal/conversationslistscreen/OnEventLambda;", "getOnMessageReceivedAuthorAnnounced$zendesk_messaging_messaging_android", "setOnMessageReceivedAuthorAnnounced$zendesk_messaging_messaging_android", "onStartPagingLambda", "Lzendesk/messaging/android/internal/conversationslistscreen/OnStartPagingLambda;", "getOnStartPagingLambda$zendesk_messaging_messaging_android", "setOnStartPagingLambda$zendesk_messaging_messaging_android", "onDismissCreateConversationError", "getOnDismissCreateConversationError$zendesk_messaging_messaging_android", "setOnDismissCreateConversationError$zendesk_messaging_messaging_android", "state", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;", "getState$zendesk_messaging_messaging_android", "()Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;", "setState$zendesk_messaging_messaging_android", "(Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenState;)V", "onCreateConversationClicked", "onClickLambda", "onListConversationClicked", "onStartPaging", "onEventLambda", "stateUpdate", "build", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private Function0<Unit> onBackButtonClicked;

        @NotNull
        private Function0<Unit> onCreateConvoButtonClicked;

        @NotNull
        private Function0<Unit> onDismissCreateConversationError;

        @NotNull
        private Function1<? super ConversationEntry.ConversationItem, Unit> onListItemClickLambda;

        @NotNull
        private Function0<Unit> onMessageReceivedAuthorAnnounced;

        @NotNull
        private Function0<Unit> onRetryButtonClicked;

        @NotNull
        private Function1<? super ConversationEntry.LoadMore, Unit> onRetryPaginationClicked;

        @NotNull
        private Function0<Unit> onStartPagingLambda;

        @NotNull
        private ConversationsListScreenState state;

        public Builder() {
            this.onBackButtonClicked = new n(13);
            int i11 = 14;
            this.onCreateConvoButtonClicked = new n(i11);
            this.onListItemClickLambda = new o(i11);
            int i12 = 15;
            this.onRetryButtonClicked = new n(i12);
            this.onRetryPaginationClicked = new o(i12);
            this.onMessageReceivedAuthorAnnounced = new n(16);
            this.onStartPagingLambda = new n(17);
            this.onDismissCreateConversationError = new n(18);
            this.state = new ConversationsListScreenState(null, null, null, null, false, false, null, null, false, null, null, false, 0, null, null, 0, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onListItemClickLambda$lambda$2(ConversationEntry.ConversationItem conversationItem) {
            conversationItem.getClass();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onRetryPaginationClicked$lambda$4(ConversationEntry.LoadMore loadMore) {
            loadMore.getClass();
            return Unit.f26487a;
        }

        @NotNull
        public final ConversationsListScreenRendering build() {
            return new ConversationsListScreenRendering(this);
        }

        @NotNull
        public final Function0<Unit> getOnBackButtonClicked$zendesk_messaging_messaging_android() {
            return this.onBackButtonClicked;
        }

        @NotNull
        public final Function0<Unit> getOnCreateConvoButtonClicked$zendesk_messaging_messaging_android() {
            return this.onCreateConvoButtonClicked;
        }

        @NotNull
        public final Function0<Unit> getOnDismissCreateConversationError$zendesk_messaging_messaging_android() {
            return this.onDismissCreateConversationError;
        }

        @NotNull
        public final Function1<ConversationEntry.ConversationItem, Unit> getOnListItemClickLambda$zendesk_messaging_messaging_android() {
            return this.onListItemClickLambda;
        }

        @NotNull
        public final Function0<Unit> getOnMessageReceivedAuthorAnnounced$zendesk_messaging_messaging_android() {
            return this.onMessageReceivedAuthorAnnounced;
        }

        @NotNull
        public final Function0<Unit> getOnRetryButtonClicked$zendesk_messaging_messaging_android() {
            return this.onRetryButtonClicked;
        }

        @NotNull
        public final Function1<ConversationEntry.LoadMore, Unit> getOnRetryPaginationClicked$zendesk_messaging_messaging_android() {
            return this.onRetryPaginationClicked;
        }

        @NotNull
        public final Function0<Unit> getOnStartPagingLambda$zendesk_messaging_messaging_android() {
            return this.onStartPagingLambda;
        }

        @NotNull
        /* JADX INFO: renamed from: getState$zendesk_messaging_messaging_android, reason: from getter */
        public final ConversationsListScreenState getState() {
            return this.state;
        }

        @NotNull
        public final Builder onBackButtonClicked(@NotNull Function0<Unit> onBackButtonClicked) {
            onBackButtonClicked.getClass();
            this.onBackButtonClicked = onBackButtonClicked;
            return this;
        }

        @NotNull
        public final Builder onCreateConversationClicked(@NotNull Function0<Unit> onClickLambda) {
            onClickLambda.getClass();
            this.onCreateConvoButtonClicked = onClickLambda;
            return this;
        }

        @NotNull
        public final Builder onDismissCreateConversationError(@NotNull Function0<Unit> onDismissCreateConversationError) {
            onDismissCreateConversationError.getClass();
            this.onDismissCreateConversationError = onDismissCreateConversationError;
            return this;
        }

        @NotNull
        public final Builder onListConversationClicked(@NotNull Function1<? super ConversationEntry.ConversationItem, Unit> onListItemClickLambda) {
            onListItemClickLambda.getClass();
            this.onListItemClickLambda = onListItemClickLambda;
            return this;
        }

        @NotNull
        public final Builder onMessageReceivedAuthorAnnounced(@NotNull Function0<Unit> onEventLambda) {
            onEventLambda.getClass();
            this.onMessageReceivedAuthorAnnounced = onEventLambda;
            return this;
        }

        @NotNull
        public final Builder onRetryButtonClicked(@NotNull Function0<Unit> onClickLambda) {
            onClickLambda.getClass();
            this.onRetryButtonClicked = onClickLambda;
            return this;
        }

        @NotNull
        public final Builder onRetryPaginationClicked(@NotNull Function1<? super ConversationEntry.LoadMore, Unit> onClickLambda) {
            onClickLambda.getClass();
            this.onRetryPaginationClicked = onClickLambda;
            return this;
        }

        @NotNull
        public final Builder onStartPaging(@NotNull Function0<Unit> onStartPagingLambda) {
            onStartPagingLambda.getClass();
            this.onStartPagingLambda = onStartPagingLambda;
            return this;
        }

        public final void setOnBackButtonClicked$zendesk_messaging_messaging_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onBackButtonClicked = function0;
        }

        public final void setOnCreateConvoButtonClicked$zendesk_messaging_messaging_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onCreateConvoButtonClicked = function0;
        }

        public final void setOnDismissCreateConversationError$zendesk_messaging_messaging_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onDismissCreateConversationError = function0;
        }

        public final void setOnListItemClickLambda$zendesk_messaging_messaging_android(@NotNull Function1<? super ConversationEntry.ConversationItem, Unit> function1) {
            function1.getClass();
            this.onListItemClickLambda = function1;
        }

        public final void setOnMessageReceivedAuthorAnnounced$zendesk_messaging_messaging_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onMessageReceivedAuthorAnnounced = function0;
        }

        public final void setOnRetryButtonClicked$zendesk_messaging_messaging_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onRetryButtonClicked = function0;
        }

        public final void setOnRetryPaginationClicked$zendesk_messaging_messaging_android(@NotNull Function1<? super ConversationEntry.LoadMore, Unit> function1) {
            function1.getClass();
            this.onRetryPaginationClicked = function1;
        }

        public final void setOnStartPagingLambda$zendesk_messaging_messaging_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onStartPagingLambda = function0;
        }

        public final void setState$zendesk_messaging_messaging_android(@NotNull ConversationsListScreenState conversationsListScreenState) {
            conversationsListScreenState.getClass();
            this.state = conversationsListScreenState;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super ConversationsListScreenState, ConversationsListScreenState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (ConversationsListScreenState) stateUpdate.invoke(this.state);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull ConversationsListScreenRendering conversationsListScreenRendering) {
            this();
            conversationsListScreenRendering.getClass();
            this.onBackButtonClicked = conversationsListScreenRendering.getOnBackButtonClicked$zendesk_messaging_messaging_android();
            this.onCreateConvoButtonClicked = conversationsListScreenRendering.getOnCreateConvoButtonClicked$zendesk_messaging_messaging_android();
            this.onListItemClickLambda = conversationsListScreenRendering.getOnListItemClickLambda$zendesk_messaging_messaging_android();
            this.onRetryButtonClicked = conversationsListScreenRendering.getOnRetryButtonClicked$zendesk_messaging_messaging_android();
            this.onRetryPaginationClicked = conversationsListScreenRendering.getOnRetryPaginationClick$zendesk_messaging_messaging_android();
            this.onStartPagingLambda = conversationsListScreenRendering.getOnStartPagingLambda$zendesk_messaging_messaging_android();
            this.onDismissCreateConversationError = conversationsListScreenRendering.getOnDismissCreateConversationError$zendesk_messaging_messaging_android();
            this.state = conversationsListScreenRendering.getState();
        }

        public /* synthetic */ Builder(ConversationsListScreenRendering conversationsListScreenRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new ConversationsListScreenRendering() : conversationsListScreenRendering);
        }
    }
}
