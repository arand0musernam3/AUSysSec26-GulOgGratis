package zendesk.ui.android.conversation.articleviewer.articlecontent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import zendesk.logger.Logger;
import zendesk.messaging.android.internal.conversationscreen.n;
import zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.ArticleAttachmentItem;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentState;
import zendesk.ui.android.conversation.articleviewer.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR(\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R&\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000fR\u001a\u0010\u001d\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentRendering;", "", "Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentRendering$Builder;", "builder", "<init>", "(Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentRendering$Builder;)V", "()V", "toBuilder", "()Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentRendering$Builder;", "Lkotlin/Function1;", "", "", "shouldOverrideUrl", "Lkotlin/jvm/functions/Function1;", "getShouldOverrideUrl$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function1;", "Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState$ArticleLoadingStatus;", "", "onLoadingUpdated", "getOnLoadingUpdated$zendesk_ui_ui_android", "Lkotlin/Function0;", "onRetryButtonClicked", "Lkotlin/jvm/functions/Function0;", "getOnRetryButtonClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentItem;", "onAttachmentItemClicked", "getOnAttachmentItemClicked$zendesk_ui_ui_android", "Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState;", "state", "Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState;", "Companion", "Builder", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ArticleContentRendering {

    @NotNull
    private static final String LOG_TAG = "ArticleContentRendering";

    @NotNull
    private final Function1<ArticleAttachmentItem, Unit> onAttachmentItemClicked;

    @NotNull
    private final Function1<ArticleContentState.ArticleLoadingStatus, Unit> onLoadingUpdated;

    @NotNull
    private final Function0<Unit> onRetryButtonClicked;

    @NotNull
    private final Function1<String, Boolean> shouldOverrideUrl;

    @NotNull
    private final ArticleContentState state;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public ArticleContentRendering(@NotNull Builder builder) {
        builder.getClass();
        this.shouldOverrideUrl = builder.getShouldOverrideUrl$zendesk_ui_ui_android();
        this.onLoadingUpdated = builder.getOnLoadingUpdated$zendesk_ui_ui_android();
        this.onRetryButtonClicked = builder.getOnRetryButtonClicked$zendesk_ui_ui_android();
        this.onAttachmentItemClicked = builder.getOnAttachmentItemClicked$zendesk_ui_ui_android();
        this.state = builder.getState();
    }

    @NotNull
    public final Function1<ArticleAttachmentItem, Unit> getOnAttachmentItemClicked$zendesk_ui_ui_android() {
        return this.onAttachmentItemClicked;
    }

    @NotNull
    public final Function1<ArticleContentState.ArticleLoadingStatus, Unit> getOnLoadingUpdated$zendesk_ui_ui_android() {
        return this.onLoadingUpdated;
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
    public final ArticleContentState getState() {
        return this.state;
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentRendering$Companion;", "", "<init>", "()V", "LOG_TAG", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ArticleContentRendering() {
        this(new Builder());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J#\u0010\n\u001a\u00020\u00002\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0004\b\u0013\u0010\u000bJ!\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0004\b\u0016\u0010\u000bJ\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018R0\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R.\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR\"\u0010\u0016\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentRendering$Builder;", "", "<init>", "()V", "Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentRendering;", "rendering", "(Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentRendering;)V", "Lkotlin/Function1;", "", "", "shouldOverrideUrl", "(Lkotlin/jvm/functions/Function1;)Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentRendering$Builder;", "Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState$ArticleLoadingStatus;", "", "onLoadingUpdated", "Lkotlin/Function0;", "onRetryButtonClicked", "(Lkotlin/jvm/functions/Function0;)Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentRendering$Builder;", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentItem;", "onAttachmentItemClicked", "Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState;", "stateUpdate", "state", "build", "()Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentRendering;", "Lkotlin/jvm/functions/Function1;", "getShouldOverrideUrl$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function1;", "setShouldOverrideUrl$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function1;)V", "getOnLoadingUpdated$zendesk_ui_ui_android", "setOnLoadingUpdated$zendesk_ui_ui_android", "Lkotlin/jvm/functions/Function0;", "getOnRetryButtonClicked$zendesk_ui_ui_android", "()Lkotlin/jvm/functions/Function0;", "setOnRetryButtonClicked$zendesk_ui_ui_android", "(Lkotlin/jvm/functions/Function0;)V", "getOnAttachmentItemClicked$zendesk_ui_ui_android", "setOnAttachmentItemClicked$zendesk_ui_ui_android", "Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState;", "getState$zendesk_ui_ui_android", "()Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState;", "setState$zendesk_ui_ui_android", "(Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentState;)V", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        @NotNull
        private Function1<? super ArticleAttachmentItem, Unit> onAttachmentItemClicked;

        @NotNull
        private Function1<? super ArticleContentState.ArticleLoadingStatus, Unit> onLoadingUpdated;

        @NotNull
        private Function0<Unit> onRetryButtonClicked;

        @NotNull
        private Function1<? super String, Boolean> shouldOverrideUrl;

        @NotNull
        private ArticleContentState state;

        public Builder() {
            this.shouldOverrideUrl = new b(3);
            this.onLoadingUpdated = new b(4);
            this.onRetryButtonClicked = new n(27);
            this.onAttachmentItemClicked = new b(5);
            this.state = new ArticleContentState(null, 0, 0, 0, null, null, 0, 0, 0, 511, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onAttachmentItemClicked$lambda$3(ArticleAttachmentItem articleAttachmentItem) {
            articleAttachmentItem.getClass();
            Logger.w(ArticleContentRendering.LOG_TAG, "onAttachmentItemClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onLoadingUpdated$lambda$1(ArticleContentState.ArticleLoadingStatus articleLoadingStatus) {
            articleLoadingStatus.getClass();
            Logger.w(ArticleContentRendering.LOG_TAG, "onLoadingUpdated == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onRetryButtonClicked$lambda$2() {
            Logger.w(ArticleContentRendering.LOG_TAG, "onRetryButtonClicked == null", new Object[0]);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean shouldOverrideUrl$lambda$0(String str) {
            Logger.w(ArticleContentRendering.LOG_TAG, "onUrlClicked == null", new Object[0]);
            return false;
        }

        @NotNull
        public final ArticleContentRendering build() {
            return new ArticleContentRendering(this);
        }

        @NotNull
        public final Function1<ArticleAttachmentItem, Unit> getOnAttachmentItemClicked$zendesk_ui_ui_android() {
            return this.onAttachmentItemClicked;
        }

        @NotNull
        public final Function1<ArticleContentState.ArticleLoadingStatus, Unit> getOnLoadingUpdated$zendesk_ui_ui_android() {
            return this.onLoadingUpdated;
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
        public final ArticleContentState getState() {
            return this.state;
        }

        @NotNull
        public final Builder onAttachmentItemClicked(@NotNull Function1<? super ArticleAttachmentItem, Unit> onAttachmentItemClicked) {
            onAttachmentItemClicked.getClass();
            this.onAttachmentItemClicked = onAttachmentItemClicked;
            return this;
        }

        @NotNull
        public final Builder onLoadingUpdated(@NotNull Function1<? super ArticleContentState.ArticleLoadingStatus, Unit> onLoadingUpdated) {
            onLoadingUpdated.getClass();
            this.onLoadingUpdated = onLoadingUpdated;
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

        public final void setOnLoadingUpdated$zendesk_ui_ui_android(@NotNull Function1<? super ArticleContentState.ArticleLoadingStatus, Unit> function1) {
            function1.getClass();
            this.onLoadingUpdated = function1;
        }

        public final void setOnRetryButtonClicked$zendesk_ui_ui_android(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.onRetryButtonClicked = function0;
        }

        public final void setShouldOverrideUrl$zendesk_ui_ui_android(@NotNull Function1<? super String, Boolean> function1) {
            function1.getClass();
            this.shouldOverrideUrl = function1;
        }

        public final void setState$zendesk_ui_ui_android(@NotNull ArticleContentState articleContentState) {
            articleContentState.getClass();
            this.state = articleContentState;
        }

        @NotNull
        public final Builder shouldOverrideUrl(@NotNull Function1<? super String, Boolean> shouldOverrideUrl) {
            shouldOverrideUrl.getClass();
            this.shouldOverrideUrl = shouldOverrideUrl;
            return this;
        }

        @NotNull
        public final Builder state(@NotNull Function1<? super ArticleContentState, ArticleContentState> stateUpdate) {
            stateUpdate.getClass();
            this.state = (ArticleContentState) stateUpdate.invoke(this.state);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull ArticleContentRendering articleContentRendering) {
            this();
            articleContentRendering.getClass();
            this.shouldOverrideUrl = articleContentRendering.getShouldOverrideUrl$zendesk_ui_ui_android();
            this.state = articleContentRendering.getState();
        }

        public /* synthetic */ Builder(ArticleContentRendering articleContentRendering, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new ArticleContentRendering() : articleContentRendering);
        }
    }
}
