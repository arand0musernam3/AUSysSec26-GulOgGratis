package zendesk.ui.android.conversation.articleviewer.feedbackbanner;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import zendesk.logger.Logger;
import zendesk.ui.android.conversation.articleviewer.b;
import zendesk.ui.android.conversation.quickreply.QuickReplyOption;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0015B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/feedbackbanner/ArticleFeedbackBannerRendering;", "", "Lzendesk/ui/android/conversation/articleviewer/feedbackbanner/ArticleFeedbackBannerRendering$Builder;", "builder", "<init>", "(Lzendesk/ui/android/conversation/articleviewer/feedbackbanner/ArticleFeedbackBannerRendering$Builder;)V", "()V", "toBuilder", "()Lzendesk/ui/android/conversation/articleviewer/feedbackbanner/ArticleFeedbackBannerRendering$Builder;", "Lkotlin/Function1;", "Lzendesk/ui/android/conversation/quickreply/QuickReplyOption;", "", "onFeedbackBannerOptionClicked", "Lkotlin/jvm/functions/Function1;", "getOnFeedbackBannerOptionClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function1;", "Lzendesk/ui/android/conversation/articleviewer/feedbackbanner/ArticleFeedbackBannerState;", "state", "Lzendesk/ui/android/conversation/articleviewer/feedbackbanner/ArticleFeedbackBannerState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/articleviewer/feedbackbanner/ArticleFeedbackBannerState;", "Companion", "Builder", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ArticleFeedbackBannerRendering {

    @NotNull
    private static final String LOG_TAG = "ArticleFeedbackBannerRendering";

    @NotNull
    private final Function1<QuickReplyOption, Unit> onFeedbackBannerOptionClicked;

    @NotNull
    private final ArticleFeedbackBannerState state;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public ArticleFeedbackBannerRendering(@NotNull Builder builder) {
        builder.getClass();
        this.onFeedbackBannerOptionClicked = builder.getOnFeedbackBannerOptionClicked$zendesk_ui_ui_android();
        this.state = builder.getState();
    }

    @NotNull
    public final Function1<QuickReplyOption, Unit> getOnFeedbackBannerOptionClicked$zendesk_ui_ui_android() {
        return this.onFeedbackBannerOptionClicked;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
    public final ArticleFeedbackBannerState getState() {
        return this.state;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/feedbackbanner/ArticleFeedbackBannerRendering$Companion;", "", "<init>", "()V", "LOG_TAG", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ArticleFeedbackBannerRendering() {
        this(new Builder());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J!\u0010\n\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u000e\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/feedbackbanner/ArticleFeedbackBannerRendering$Builder;", "", "<init>", "()V", "Lzendesk/ui/android/conversation/articleviewer/feedbackbanner/ArticleFeedbackBannerRendering;", "rendering", "(Lzendesk/ui/android/conversation/articleviewer/feedbackbanner/ArticleFeedbackBannerRendering;)V", "Lkotlin/Function1;", "Lzendesk/ui/android/conversation/quickreply/QuickReplyOption;", "", "onFeedbackBannerOptionClicked", "(Lkotlin/jvm/functions/Function1;)Lzendesk/ui/android/conversation/articleviewer/feedbackbanner/ArticleFeedbackBannerRendering$Builder;", "Lzendesk/ui/android/conversation/articleviewer/feedbackbanner/ArticleFeedbackBannerState;", "stateUpdate", "state", "build", "()Lzendesk/ui/android/conversation/articleviewer/feedbackbanner/ArticleFeedbackBannerRendering;", "Lkotlin/jvm/functions/Function1;", "getOnFeedbackBannerOptionClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function1;", "setOnFeedbackBannerOptionClicked$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function1;)V", "Lzendesk/ui/android/conversation/articleviewer/feedbackbanner/ArticleFeedbackBannerState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/articleviewer/feedbackbanner/ArticleFeedbackBannerState;", "setState$zendesk_ui_ui_android", "(Lzendesk/ui/android/conversation/articleviewer/feedbackbanner/ArticleFeedbackBannerState;)V", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @NotNull
        private Function1<? super QuickReplyOption, Unit> onFeedbackBannerOptionClicked;

        @NotNull
        private ArticleFeedbackBannerState state;

        public Builder() {
            this.onFeedbackBannerOptionClicked = new b(7);
            this.state = new ArticleFeedbackBannerState(0, 0, 0, null, 15, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onFeedbackBannerOptionClicked$lambda$0(QuickReplyOption quickReplyOption) {
            quickReplyOption.getClass();
            Logger.w(ArticleFeedbackBannerRendering.LOG_TAG, "FeedbackBannerOptionClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        @NotNull
        public final ArticleFeedbackBannerRendering build() {
            return new ArticleFeedbackBannerRendering(this);
        }

        @NotNull
        public final Function1<QuickReplyOption, Unit> getOnFeedbackBannerOptionClicked$zendesk_ui_ui_android() {
            return this.onFeedbackBannerOptionClicked;
        }

        @NotNull
        /* JADX INFO: renamed from: getState$zendesk_ui_ui_android, reason: from getter */
        public final ArticleFeedbackBannerState getState() {
            return this.state;
        }

        @NotNull
        public final Builder onFeedbackBannerOptionClicked(@NotNull Function1<? super QuickReplyOption, Unit> onFeedbackBannerOptionClicked) {
            onFeedbackBannerOptionClicked.getClass();
            this.onFeedbackBannerOptionClicked = onFeedbackBannerOptionClicked;
            return this;
        }

        public final void setOnFeedbackBannerOptionClicked$zendesk_ui_ui_android(@NotNull Function1<? super QuickReplyOption, Unit> function1) {
            function1.getClass();
            this.onFeedbackBannerOptionClicked = function1;
        }

        public final void setState$zendesk_ui_ui_android(@NotNull ArticleFeedbackBannerState articleFeedbackBannerState) {
            articleFeedbackBannerState.getClass();
            this.state = articleFeedbackBannerState;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super ArticleFeedbackBannerState, ArticleFeedbackBannerState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (ArticleFeedbackBannerState) stateUpdate.invoke(this.state);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull ArticleFeedbackBannerRendering articleFeedbackBannerRendering) {
            this();
            articleFeedbackBannerRendering.getClass();
            this.onFeedbackBannerOptionClicked = articleFeedbackBannerRendering.getOnFeedbackBannerOptionClicked$zendesk_ui_ui_android();
            this.state = articleFeedbackBannerRendering.getState();
        }

        public /* synthetic */ Builder(ArticleFeedbackBannerRendering articleFeedbackBannerRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new ArticleFeedbackBannerRendering() : articleFeedbackBannerRendering);
        }
    }
}
