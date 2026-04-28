package zendesk.ui.android.conversation.articleviewer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zendesk.logger.Logger;
import zendesk.messaging.android.internal.conversationscreen.n;
import zendesk.messaging.android.internal.conversationscreen.o;
import zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.ArticleAttachmentItem;
import zendesk.ui.android.conversation.articleviewer.articleheader.ArticleHeaderState;
import zendesk.ui.android.conversation.quickreply.QuickReplyOption;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR(\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00140\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000fR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000b0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u000fR\u001a\u0010 \u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/ArticleViewerRendering;", "", "Lzendesk/ui/android/conversation/articleviewer/ArticleViewerRendering$Builder;", "builder", "<init>", "(Lzendesk/ui/android/conversation/articleviewer/ArticleViewerRendering$Builder;)V", "()V", "toBuilder", "()Lzendesk/ui/android/conversation/articleviewer/ArticleViewerRendering$Builder;", "Lkotlin/Function1;", "Lzendesk/ui/android/conversation/quickreply/QuickReplyOption;", "", "onFeedbackBannerOptionClicked", "Lkotlin/jvm/functions/Function1;", "getOnFeedbackBannerOptionClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function1;", "Lzendesk/ui/android/conversation/articleviewer/articleheader/ArticleHeaderState$ButtonName;", "onMenuItemClicked", "getOnMenuItemClicked$zendesk_ui_ui_android", "", "", "shouldOverrideUrl", "getShouldOverrideUrl$zendesk_ui_ui_android", "Lkotlin/Function0;", "onRetryButtonClicked", "Lkotlin/jvm/functions/Function0;", "getOnRetryButtonClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentItem;", "onAttachmentItemClicked", "getOnAttachmentItemClicked$zendesk_ui_ui_android", "Lzendesk/ui/android/conversation/articleviewer/ArticleViewerState;", "state", "Lzendesk/ui/android/conversation/articleviewer/ArticleViewerState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/articleviewer/ArticleViewerState;", "Companion", "Builder", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ArticleViewerRendering {

    @NotNull
    private static final String LOG_TAG = "ArticleViewerRendering";

    @NotNull
    private final Function1<ArticleAttachmentItem, Unit> onAttachmentItemClicked;

    @NotNull
    private final Function1<QuickReplyOption, Unit> onFeedbackBannerOptionClicked;

    @NotNull
    private final Function1<ArticleHeaderState.ButtonName, Unit> onMenuItemClicked;

    @NotNull
    private final Function0<Unit> onRetryButtonClicked;

    @NotNull
    private final Function1<String, Boolean> shouldOverrideUrl;

    @NotNull
    private final ArticleViewerState state;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public ArticleViewerRendering(@NotNull Builder builder) {
        builder.getClass();
        this.onFeedbackBannerOptionClicked = builder.getOnFeedbackBannerOptionClicked$zendesk_ui_ui_android();
        this.onMenuItemClicked = builder.getOnMenuItemClicked$zendesk_ui_ui_android();
        this.shouldOverrideUrl = builder.getShouldOverrideUrl$zendesk_ui_ui_android();
        this.onRetryButtonClicked = builder.getOnRetryButtonClicked$zendesk_ui_ui_android();
        this.onAttachmentItemClicked = builder.getOnAttachmentItemClicked$zendesk_ui_ui_android();
        this.state = builder.getState();
    }

    @NotNull
    public final Function1<ArticleAttachmentItem, Unit> getOnAttachmentItemClicked$zendesk_ui_ui_android() {
        return this.onAttachmentItemClicked;
    }

    @NotNull
    public final Function1<QuickReplyOption, Unit> getOnFeedbackBannerOptionClicked$zendesk_ui_ui_android() {
        return this.onFeedbackBannerOptionClicked;
    }

    @NotNull
    public final Function1<ArticleHeaderState.ButtonName, Unit> getOnMenuItemClicked$zendesk_ui_ui_android() {
        return this.onMenuItemClicked;
    }

    @NotNull
    public final Function0<Unit> getOnRetryButtonClicked$zendesk_ui_ui_android() {
        return this.onRetryButtonClicked;
    }

    @NotNull
    public final Function1<String, Boolean> getShouldOverrideUrl$zendesk_ui_ui_android() {
        return this.shouldOverrideUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
    public final ArticleViewerState getState() {
        return this.state;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/ArticleViewerRendering$Companion;", "", "<init>", "()V", "LOG_TAG", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ArticleViewerRendering() {
        this(new Builder());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J!\u0010\n\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\r\u0010\u000bJ#\u0010\u0010\u001a\u00020\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ\u001b\u0010\u0012\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u0015\u0010\u000bJ!\u0010\u0018\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0007¢\u0006\u0004\b\u0018\u0010\u000bJ\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aR.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR0\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R.\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b)\u0010\u001d\"\u0004\b*\u0010\u001fR\"\u0010\u0018\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00060"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/ArticleViewerRendering$Builder;", "", "<init>", "()V", "Lzendesk/ui/android/conversation/articleviewer/ArticleViewerRendering;", "rendering", "(Lzendesk/ui/android/conversation/articleviewer/ArticleViewerRendering;)V", "Lkotlin/Function1;", "Lzendesk/ui/android/conversation/quickreply/QuickReplyOption;", "", "onFeedbackBannerOptionClicked", "(Lkotlin/jvm/functions/Function1;)Lzendesk/ui/android/conversation/articleviewer/ArticleViewerRendering$Builder;", "Lzendesk/ui/android/conversation/articleviewer/articleheader/ArticleHeaderState$ButtonName;", "onMenuItemClicked", "", "", "shouldOverrideUrl", "Lkotlin/Function0;", "onRetryButtonClicked", "(Lkotlin/jvm/functions/Function0;)Lzendesk/ui/android/conversation/articleviewer/ArticleViewerRendering$Builder;", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentItem;", "onAttachmentItemClicked", "Lzendesk/ui/android/conversation/articleviewer/ArticleViewerState;", "stateUpdate", "state", "build", "()Lzendesk/ui/android/conversation/articleviewer/ArticleViewerRendering;", "Lkotlin/jvm/functions/Function1;", "getOnFeedbackBannerOptionClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function1;", "setOnFeedbackBannerOptionClicked$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function1;)V", "getOnMenuItemClicked$zendesk_ui_ui_android", "setOnMenuItemClicked$zendesk_ui_ui_android", "getShouldOverrideUrl$zendesk_ui_ui_android", "setShouldOverrideUrl$zendesk_ui_ui_android", "Lkotlin/jvm/functions/Function0;", "getOnRetryButtonClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "setOnRetryButtonClicked$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function0;)V", "getOnAttachmentItemClicked$zendesk_ui_ui_android", "setOnAttachmentItemClicked$zendesk_ui_ui_android", "Lzendesk/ui/android/conversation/articleviewer/ArticleViewerState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/articleviewer/ArticleViewerState;", "setState$zendesk_ui_ui_android", "(Lzendesk/ui/android/conversation/articleviewer/ArticleViewerState;)V", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @NotNull
        private Function1<? super ArticleAttachmentItem, Unit> onAttachmentItemClicked;

        @NotNull
        private Function1<? super QuickReplyOption, Unit> onFeedbackBannerOptionClicked;

        @NotNull
        private Function1<? super ArticleHeaderState.ButtonName, Unit> onMenuItemClicked;

        @NotNull
        private Function0<Unit> onRetryButtonClicked;

        @NotNull
        private Function1<? super String, Boolean> shouldOverrideUrl;

        @NotNull
        private ArticleViewerState state;

        public Builder() {
            this.onFeedbackBannerOptionClicked = new o(29);
            this.onMenuItemClicked = new b(0);
            this.shouldOverrideUrl = new b(1);
            this.onRetryButtonClicked = new n(26);
            this.onAttachmentItemClicked = new b(2);
            this.state = new ArticleViewerState(null, null, 0, 0, 0, 0, 0, 0, false, false, null, 0, 0, 0, null, false, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onAttachmentItemClicked$lambda$4(ArticleAttachmentItem articleAttachmentItem) {
            articleAttachmentItem.getClass();
            Logger.w(ArticleViewerRendering.LOG_TAG, "onAttachmentItemClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onFeedbackBannerOptionClicked$lambda$0(QuickReplyOption quickReplyOption) {
            quickReplyOption.getClass();
            Logger.w(ArticleViewerRendering.LOG_TAG, "FeedbackBannerOptionClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onMenuItemClicked$lambda$1(ArticleHeaderState.ButtonName buttonName) {
            buttonName.getClass();
            Logger.w(ArticleViewerRendering.LOG_TAG, "onMenuItemClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onRetryButtonClicked$lambda$3() {
            Logger.w(ArticleViewerRendering.LOG_TAG, "onRetryButtonClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean shouldOverrideUrl$lambda$2(String str) {
            Logger.w(ArticleViewerRendering.LOG_TAG, "shouldOverrideUrl == null", new Object[0]);
            return false;
        }

        @NotNull
        public final ArticleViewerRendering build() {
            return new ArticleViewerRendering(this);
        }

        @NotNull
        public final Function1<ArticleAttachmentItem, Unit> getOnAttachmentItemClicked$zendesk_ui_ui_android() {
            return this.onAttachmentItemClicked;
        }

        @NotNull
        public final Function1<QuickReplyOption, Unit> getOnFeedbackBannerOptionClicked$zendesk_ui_ui_android() {
            return this.onFeedbackBannerOptionClicked;
        }

        @NotNull
        public final Function1<ArticleHeaderState.ButtonName, Unit> getOnMenuItemClicked$zendesk_ui_ui_android() {
            return this.onMenuItemClicked;
        }

        @NotNull
        public final Function0<Unit> getOnRetryButtonClicked$zendesk_ui_ui_android() {
            return this.onRetryButtonClicked;
        }

        @NotNull
        public final Function1<String, Boolean> getShouldOverrideUrl$zendesk_ui_ui_android() {
            return this.shouldOverrideUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
        public final ArticleViewerState getState() {
            return this.state;
        }

        @NotNull
        public final Builder onAttachmentItemClicked(@NotNull Function1<? super ArticleAttachmentItem, Unit> onAttachmentItemClicked) {
            onAttachmentItemClicked.getClass();
            this.onAttachmentItemClicked = onAttachmentItemClicked;
            return this;
        }

        @NotNull
        public final Builder onFeedbackBannerOptionClicked(@NotNull Function1<? super QuickReplyOption, Unit> onFeedbackBannerOptionClicked) {
            onFeedbackBannerOptionClicked.getClass();
            this.onFeedbackBannerOptionClicked = onFeedbackBannerOptionClicked;
            return this;
        }

        @NotNull
        public final Builder onMenuItemClicked(@NotNull Function1<? super ArticleHeaderState.ButtonName, Unit> onMenuItemClicked) {
            onMenuItemClicked.getClass();
            this.onMenuItemClicked = onMenuItemClicked;
            return this;
        }

        @NotNull
        public final Builder onRetryButtonClicked(@NotNull Function0<Unit> onRetryButtonClicked) {
            onRetryButtonClicked.getClass();
            this.onRetryButtonClicked = onRetryButtonClicked;
            return this;
        }

        public final void setOnAttachmentItemClicked$zendesk_ui_ui_android(@NotNull Function1<? super ArticleAttachmentItem, Unit> function1) {
            function1.getClass();
            this.onAttachmentItemClicked = function1;
        }

        public final void setOnFeedbackBannerOptionClicked$zendesk_ui_ui_android(@NotNull Function1<? super QuickReplyOption, Unit> function1) {
            function1.getClass();
            this.onFeedbackBannerOptionClicked = function1;
        }

        public final void setOnMenuItemClicked$zendesk_ui_ui_android(@NotNull Function1<? super ArticleHeaderState.ButtonName, Unit> function1) {
            function1.getClass();
            this.onMenuItemClicked = function1;
        }

        public final void setOnRetryButtonClicked$zendesk_ui_ui_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onRetryButtonClicked = function0;
        }

        public final void setShouldOverrideUrl$zendesk_ui_ui_android(@NotNull Function1<? super String, Boolean> function1) {
            function1.getClass();
            this.shouldOverrideUrl = function1;
        }

        public final void setState$zendesk_ui_ui_android(@NotNull ArticleViewerState articleViewerState) {
            articleViewerState.getClass();
            this.state = articleViewerState;
        }

        @NotNull
        public final Builder shouldOverrideUrl(@NotNull Function1<? super String, Boolean> shouldOverrideUrl) {
            shouldOverrideUrl.getClass();
            this.shouldOverrideUrl = shouldOverrideUrl;
            return this;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super ArticleViewerState, ArticleViewerState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (ArticleViewerState) stateUpdate.invoke(this.state);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull ArticleViewerRendering articleViewerRendering) {
            this();
            articleViewerRendering.getClass();
            this.onFeedbackBannerOptionClicked = articleViewerRendering.getOnFeedbackBannerOptionClicked$zendesk_ui_ui_android();
            this.shouldOverrideUrl = articleViewerRendering.getShouldOverrideUrl$zendesk_ui_ui_android();
            this.state = articleViewerRendering.getState();
        }

        public /* synthetic */ Builder(ArticleViewerRendering articleViewerRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new ArticleViewerRendering() : articleViewerRendering);
        }
    }
}
