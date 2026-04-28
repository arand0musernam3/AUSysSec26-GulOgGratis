package zendesk.ui.android.conversation.articleviewer.articleheader;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.conversation.articleviewer.articleheader.ArticleHeaderState;
import zendesk.ui.android.internal.ViewKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u000f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001b\u0010%\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u001b\u0010)\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010-R\u001b\u00101\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001c\u001a\u0004\b0\u0010-R\u001b\u00104\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u001c\u001a\u0004\b3\u0010-R\u0016\u00105\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/articleheader/ArticleHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/articleviewer/articleheader/ArticleHeaderRendering;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttrs", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View;", "view", "", "updateAccessibilityNodeInfo", "(Landroid/view/View;)V", "Lzendesk/ui/android/conversation/articleviewer/articleheader/ArticleHeaderState;", "state", "setupButtonFocusStates", "(Lzendesk/ui/android/conversation/articleviewer/articleheader/ArticleHeaderState;)V", "Lkotlin/Function1;", "renderingUpdate", "render", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/widget/FrameLayout;", "backButton$delegate", "Lu70/j;", "getBackButton", "()Landroid/widget/FrameLayout;", "backButton", "shareButton$delegate", "getShareButton", "shareButton", "closeButton$delegate", "getCloseButton", "closeButton", "headerView$delegate", "getHeaderView", "()Landroid/view/View;", "headerView", "Landroid/widget/ImageView;", "backButtonIconView$delegate", "getBackButtonIconView", "()Landroid/widget/ImageView;", "backButtonIconView", "shareButtonIconView$delegate", "getShareButtonIconView", "shareButtonIconView", "closeButtonIconView$delegate", "getCloseButtonIconView", "closeButtonIconView", "rendering", "Lzendesk/ui/android/conversation/articleviewer/articleheader/ArticleHeaderRendering;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nArticleHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArticleHeaderView.kt\nzendesk/ui/android/conversation/articleviewer/articleheader/ArticleHeaderView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,142:1\n257#2,2:143\n257#2,2:145\n*S KotlinDebug\n*F\n+ 1 ArticleHeaderView.kt\nzendesk/ui/android/conversation/articleviewer/articleheader/ArticleHeaderView\n*L\n82#1:143,2\n83#1:145,2\n*E\n"})
public final class ArticleHeaderView extends ConstraintLayout implements Renderer<ArticleHeaderRendering> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: backButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final j backButton;

    /* JADX INFO: renamed from: backButtonIconView$delegate, reason: from kotlin metadata */
    @NotNull
    private final j backButtonIconView;

    /* JADX INFO: renamed from: closeButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final j closeButton;

    /* JADX INFO: renamed from: closeButtonIconView$delegate, reason: from kotlin metadata */
    @NotNull
    private final j closeButtonIconView;

    /* JADX INFO: renamed from: headerView$delegate, reason: from kotlin metadata */
    @NotNull
    private final j headerView;

    @NotNull
    private ArticleHeaderRendering rendering;

    /* JADX INFO: renamed from: shareButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final j shareButton;

    /* JADX INFO: renamed from: shareButtonIconView$delegate, reason: from kotlin metadata */
    @NotNull
    private final j shareButtonIconView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticleHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.backButton = ViewKt.lazyViewById(this, R.id.zuia_article_back_button);
        this.shareButton = ViewKt.lazyViewById(this, R.id.zuia_article_share_button);
        this.closeButton = ViewKt.lazyViewById(this, R.id.zuia_article_close_button);
        this.headerView = ViewKt.lazyViewById(this, R.id.zuia_article_header);
        this.backButtonIconView = ViewKt.lazyViewById(this, R.id.zuia_back_button_icon_view);
        this.shareButtonIconView = ViewKt.lazyViewById(this, R.id.zuia_share_button_icon_view);
        this.closeButtonIconView = ViewKt.lazyViewById(this, R.id.zuia_close_button_icon_view);
        this.rendering = new ArticleHeaderRendering();
        View.inflate(context, R.layout.zuia_view_article_header, this);
    }

    private final FrameLayout getBackButton() {
        return (FrameLayout) this.backButton.getValue();
    }

    private final ImageView getBackButtonIconView() {
        return (ImageView) this.backButtonIconView.getValue();
    }

    private final FrameLayout getCloseButton() {
        return (FrameLayout) this.closeButton.getValue();
    }

    private final ImageView getCloseButtonIconView() {
        return (ImageView) this.closeButtonIconView.getValue();
    }

    private final View getHeaderView() {
        return (View) this.headerView.getValue();
    }

    private final FrameLayout getShareButton() {
        return (FrameLayout) this.shareButton.getValue();
    }

    private final ImageView getShareButtonIconView() {
        return (ImageView) this.shareButtonIconView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$0(ArticleHeaderView articleHeaderView, View view) {
        articleHeaderView.rendering.getOnMenuItemClicked$zendesk_ui_ui_android().invoke(ArticleHeaderState.ButtonName.BACK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$1(ArticleHeaderView articleHeaderView, View view) {
        articleHeaderView.rendering.getOnMenuItemClicked$zendesk_ui_ui_android().invoke(ArticleHeaderState.ButtonName.CLOSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$2(ArticleHeaderView articleHeaderView, View view) {
        articleHeaderView.rendering.getOnMenuItemClicked$zendesk_ui_ui_android().invoke(ArticleHeaderState.ButtonName.SHARE);
    }

    private final void setupButtonFocusStates(ArticleHeaderState state) {
        FrameLayout backButton = getBackButton();
        int i11 = R.drawable.zuia_ic_carousel_next_button_circle;
        int i12 = R.dimen.zuia_carousel_next_prev_stroke_width;
        int focusedBorderColor$zendesk_ui_ui_android = state.getFocusedBorderColor$zendesk_ui_ui_android();
        Drawable drawable = getContext().getDrawable(R.drawable.zuia_ic_carousel_next_button_circle);
        drawable.getClass();
        ViewKt.addAccessibilityFocusedState(backButton, i11, i12, focusedBorderColor$zendesk_ui_ui_android, (GradientDrawable) drawable);
        FrameLayout shareButton = getShareButton();
        int i13 = R.drawable.zuia_ic_carousel_prev_button_circle;
        int i14 = R.dimen.zuia_carousel_next_prev_stroke_width;
        int focusedBorderColor$zendesk_ui_ui_android2 = state.getFocusedBorderColor$zendesk_ui_ui_android();
        Drawable drawable2 = getContext().getDrawable(R.drawable.zuia_ic_carousel_prev_button_circle);
        drawable2.getClass();
        ViewKt.addAccessibilityFocusedState(shareButton, i13, i14, focusedBorderColor$zendesk_ui_ui_android2, (GradientDrawable) drawable2);
        FrameLayout closeButton = getCloseButton();
        int i15 = R.drawable.zuia_ic_carousel_prev_button_circle;
        int i16 = R.dimen.zuia_carousel_next_prev_stroke_width;
        int focusedBorderColor$zendesk_ui_ui_android3 = state.getFocusedBorderColor$zendesk_ui_ui_android();
        Drawable drawable3 = getContext().getDrawable(R.drawable.zuia_ic_carousel_prev_button_circle);
        drawable3.getClass();
        ViewKt.addAccessibilityFocusedState(closeButton, i15, i16, focusedBorderColor$zendesk_ui_ui_android3, (GradientDrawable) drawable3);
    }

    private final void updateAccessibilityNodeInfo(View view) {
        view.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: zendesk.ui.android.conversation.articleviewer.articleheader.ArticleHeaderView.updateAccessibilityNodeInfo.1
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
                host.getClass();
                info.getClass();
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.setClassName("android.widget.Button");
            }
        });
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super ArticleHeaderRendering, ? extends ArticleHeaderRendering> renderingUpdate) {
        renderingUpdate.getClass();
        ArticleHeaderState state = this.rendering.getState();
        ArticleHeaderRendering articleHeaderRendering = (ArticleHeaderRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = articleHeaderRendering;
        if (!Intrinsics.areEqual(state, articleHeaderRendering.getState())) {
            setupButtonFocusStates(this.rendering.getState());
            getHeaderView().setBackgroundColor(this.rendering.getState().getBackgroundColor$zendesk_ui_ui_android());
            getBackButtonIconView().setColorFilter(this.rendering.getState().getIconColor$zendesk_ui_ui_android());
            getShareButtonIconView().setColorFilter(this.rendering.getState().getIconColor$zendesk_ui_ui_android());
            getCloseButtonIconView().setColorFilter(this.rendering.getState().getIconColor$zendesk_ui_ui_android());
            getBackButton().getBackground().mutate().setTint(this.rendering.getState().getButtonBackgroundColor$zendesk_ui_ui_android());
            getShareButton().getBackground().mutate().setTint(this.rendering.getState().getButtonBackgroundColor$zendesk_ui_ui_android());
            getCloseButton().getBackground().mutate().setTint(this.rendering.getState().getButtonBackgroundColor$zendesk_ui_ui_android());
            updateAccessibilityNodeInfo(getBackButton());
            updateAccessibilityNodeInfo(getCloseButton());
            updateAccessibilityNodeInfo(getShareButton());
            ViewKt.expandTouchArea$default(getBackButton(), this, 0, 0, 0, 0, 30, null);
            ViewKt.expandTouchArea$default(getCloseButton(), this, 0, 0, 0, 0, 30, null);
            ViewKt.expandTouchArea$default(getShareButton(), this, 0, 0, 0, 0, 30, null);
            getShareButton().setVisibility(this.rendering.getState().getShowShareButton$zendesk_ui_ui_android() ? 0 : 8);
            getBackButton().setVisibility(this.rendering.getState().getShowBackButton$zendesk_ui_ui_android() ? 0 : 8);
        }
        final int i11 = 0;
        getBackButton().setOnClickListener(new View.OnClickListener(this) { // from class: zendesk.ui.android.conversation.articleviewer.articleheader.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ArticleHeaderView f47804b;

            {
                this.f47804b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ArticleHeaderView.render$lambda$0(this.f47804b, view);
                        break;
                    case 1:
                        ArticleHeaderView.render$lambda$1(this.f47804b, view);
                        break;
                    default:
                        ArticleHeaderView.render$lambda$2(this.f47804b, view);
                        break;
                }
            }
        });
        final int i12 = 1;
        getCloseButton().setOnClickListener(new View.OnClickListener(this) { // from class: zendesk.ui.android.conversation.articleviewer.articleheader.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ArticleHeaderView f47804b;

            {
                this.f47804b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ArticleHeaderView.render$lambda$0(this.f47804b, view);
                        break;
                    case 1:
                        ArticleHeaderView.render$lambda$1(this.f47804b, view);
                        break;
                    default:
                        ArticleHeaderView.render$lambda$2(this.f47804b, view);
                        break;
                }
            }
        });
        final int i13 = 2;
        getShareButton().setOnClickListener(new View.OnClickListener(this) { // from class: zendesk.ui.android.conversation.articleviewer.articleheader.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ArticleHeaderView f47804b;

            {
                this.f47804b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        ArticleHeaderView.render$lambda$0(this.f47804b, view);
                        break;
                    case 1:
                        ArticleHeaderView.render$lambda$1(this.f47804b, view);
                        break;
                    default:
                        ArticleHeaderView.render$lambda$2(this.f47804b, view);
                        break;
                }
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArticleHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArticleHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ ArticleHeaderView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArticleHeaderView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
