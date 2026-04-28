package zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c2;
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
import zendesk.ui.android.conversation.carousel.CarouselSnapHelper;
import zendesk.ui.android.conversation.carousel.CenterSmoothScroller;
import zendesk.ui.android.internal.ViewKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0010J#\u0010\u0017\u001a\u00020\u000e2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u001b\u0010(\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010$R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010,R\u001b\u00100\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001d\u001a\u0004\b/\u0010,R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000201048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010B\u001a\n A*\u0004\u0018\u00010@0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselCellView;", "Landroid/widget/FrameLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselRendering;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselCellState;", "state", "", "setUpNextAndPreviousButton", "(Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselCellState;)V", "checkCarouselsScrollingAndButtonVisibility", "()V", "checkTheCarouselLayoutDirection", "setupButtonFocusStates", "Lkotlin/Function1;", "renderingUpdate", "render", "(Lkotlin/jvm/functions/Function1;)V", "rendering", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselRendering;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "Lu70/j;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/view/View;", "nextButton$delegate", "getNextButton", "()Landroid/view/View;", "nextButton", "prevButton$delegate", "getPrevButton", "prevButton", "Landroid/widget/ImageView;", "nextButtonIconView$delegate", "getNextButtonIconView", "()Landroid/widget/ImageView;", "nextButtonIconView", "prevButtonIconView$delegate", "getPrevButtonIconView", "prevButtonIconView", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselRecyclerViewAdapter;", "adapter", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselRecyclerViewAdapter;", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselLayoutManager;", "layoutManager", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselLayoutManager;", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselItemDecoration;", "itemDecoration", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselItemDecoration;", "Lzendesk/ui/android/conversation/carousel/CarouselSnapHelper;", "snapHelper", "Lzendesk/ui/android/conversation/carousel/CarouselSnapHelper;", "Lzendesk/ui/android/conversation/carousel/CenterSmoothScroller;", "smoothScroller", "Lzendesk/ui/android/conversation/carousel/CenterSmoothScroller;", "Landroid/content/res/Configuration;", "kotlin.jvm.PlatformType", "configuration", "Landroid/content/res/Configuration;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nArticleAttachmentCarouselCellView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArticleAttachmentCarouselCellView.kt\nzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselCellView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,164:1\n257#2,2:165\n257#2,2:167\n*S KotlinDebug\n*F\n+ 1 ArticleAttachmentCarouselCellView.kt\nzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselCellView\n*L\n125#1:165,2\n126#1:167,2\n*E\n"})
public final class ArticleAttachmentCarouselCellView extends FrameLayout implements Renderer<ArticleAttachmentCarouselRendering> {
    public static final int $stable = 8;

    @NotNull
    private final ArticleAttachmentCarouselRecyclerViewAdapter adapter;
    private final Configuration configuration;

    @NotNull
    private final ArticleAttachmentCarouselItemDecoration itemDecoration;

    @NotNull
    private final ArticleAttachmentCarouselLayoutManager<ArticleAttachmentCarouselRecyclerViewAdapter> layoutManager;

    /* JADX INFO: renamed from: nextButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final j nextButton;

    /* JADX INFO: renamed from: nextButtonIconView$delegate, reason: from kotlin metadata */
    @NotNull
    private final j nextButtonIconView;

    /* JADX INFO: renamed from: prevButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final j prevButton;

    /* JADX INFO: renamed from: prevButtonIconView$delegate, reason: from kotlin metadata */
    @NotNull
    private final j prevButtonIconView;

    /* JADX INFO: renamed from: recyclerView$delegate, reason: from kotlin metadata */
    @NotNull
    private final j recyclerView;

    @NotNull
    private ArticleAttachmentCarouselRendering rendering;

    @NotNull
    private final CenterSmoothScroller smoothScroller;

    @NotNull
    private final CarouselSnapHelper snapHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticleAttachmentCarouselCellView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.rendering = new ArticleAttachmentCarouselRendering();
        this.recyclerView = ViewKt.lazyViewById(this, R.id.zuia_attachment_carousel_list);
        this.nextButton = ViewKt.lazyViewById(this, R.id.zuia_attachment_carousel_next_button);
        this.prevButton = ViewKt.lazyViewById(this, R.id.zuia_attachment_carousel_prev_button);
        this.nextButtonIconView = ViewKt.lazyViewById(this, R.id.zuia_attachment_carousel_next_button_icon_view);
        this.prevButtonIconView = ViewKt.lazyViewById(this, R.id.zuia_attachment_carousel_prev_button_icon_view);
        ArticleAttachmentCarouselRecyclerViewAdapter articleAttachmentCarouselRecyclerViewAdapter = new ArticleAttachmentCarouselRecyclerViewAdapter();
        this.adapter = articleAttachmentCarouselRecyclerViewAdapter;
        ArticleAttachmentCarouselLayoutManager<ArticleAttachmentCarouselRecyclerViewAdapter> articleAttachmentCarouselLayoutManager = new ArticleAttachmentCarouselLayoutManager<>(context, articleAttachmentCarouselRecyclerViewAdapter);
        this.layoutManager = articleAttachmentCarouselLayoutManager;
        ArticleAttachmentCarouselItemDecoration articleAttachmentCarouselItemDecoration = new ArticleAttachmentCarouselItemDecoration(context);
        this.itemDecoration = articleAttachmentCarouselItemDecoration;
        CarouselSnapHelper carouselSnapHelper = new CarouselSnapHelper(articleAttachmentCarouselLayoutManager);
        this.snapHelper = carouselSnapHelper;
        this.smoothScroller = new CenterSmoothScroller(context);
        this.configuration = getResources().getConfiguration();
        View.inflate(context, R.layout.zuia_view_attachment_carousel_article, this);
        getRecyclerView().setAdapter(articleAttachmentCarouselRecyclerViewAdapter);
        getRecyclerView().setLayoutManager(articleAttachmentCarouselLayoutManager);
        getRecyclerView().i(articleAttachmentCarouselItemDecoration);
        getRecyclerView().setAdapter(articleAttachmentCarouselRecyclerViewAdapter);
        carouselSnapHelper.attachToRecyclerView(getRecyclerView());
        checkTheCarouselLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCarouselsScrollingAndButtonVisibility() {
        boolean z11 = true;
        boolean z12 = this.layoutManager.findFirstCompletelyVisibleItemPosition() == 0;
        boolean z13 = this.layoutManager.findLastCompletelyVisibleItemPosition() == this.layoutManager.getItemCount() - 1;
        getNextButton().setVisibility(!z13 ? 0 : 8);
        getPrevButton().setVisibility(z12 ? 8 : 0);
        if (z12 && z13) {
            z11 = false;
        }
        this.layoutManager.setScroll$zendesk_ui_ui_android(z11);
    }

    private final void checkTheCarouselLayoutDirection() {
        if (this.configuration.getLayoutDirection() == 1) {
            this.itemDecoration.setLayoutDirectionToRTL$zendesk_ui_ui_android();
        }
    }

    private final View getNextButton() {
        return (View) this.nextButton.getValue();
    }

    private final ImageView getNextButtonIconView() {
        return (ImageView) this.nextButtonIconView.getValue();
    }

    private final View getPrevButton() {
        return (View) this.prevButton.getValue();
    }

    private final ImageView getPrevButtonIconView() {
        return (ImageView) this.prevButtonIconView.getValue();
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.getValue();
    }

    private final void setUpNextAndPreviousButton(ArticleAttachmentCarouselCellState state) {
        checkCarouselsScrollingAndButtonVisibility();
        setupButtonFocusStates(state);
        final int i11 = 0;
        getNextButton().setOnClickListener(new View.OnClickListener(this) { // from class: zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ArticleAttachmentCarouselCellView f47800b;

            {
                this.f47800b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ArticleAttachmentCarouselCellView.setUpNextAndPreviousButton$lambda$0(this.f47800b, view);
                        break;
                    default:
                        ArticleAttachmentCarouselCellView.setUpNextAndPreviousButton$lambda$1(this.f47800b, view);
                        break;
                }
            }
        });
        final int i12 = 1;
        getPrevButton().setOnClickListener(new View.OnClickListener(this) { // from class: zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ArticleAttachmentCarouselCellView f47800b;

            {
                this.f47800b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ArticleAttachmentCarouselCellView.setUpNextAndPreviousButton$lambda$0(this.f47800b, view);
                        break;
                    default:
                        ArticleAttachmentCarouselCellView.setUpNextAndPreviousButton$lambda$1(this.f47800b, view);
                        break;
                }
            }
        });
        getRecyclerView().k(new c2() { // from class: zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.ArticleAttachmentCarouselCellView.setUpNextAndPreviousButton.3
            @Override // androidx.recyclerview.widget.c2
            public void onScrolled(RecyclerView recyclerView, int dx2, int dy2) {
                recyclerView.getClass();
                ArticleAttachmentCarouselCellView.this.checkCarouselsScrollingAndButtonVisibility();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpNextAndPreviousButton$lambda$0(ArticleAttachmentCarouselCellView articleAttachmentCarouselCellView, View view) {
        int iFindLastCompletelyVisibleItemPosition = articleAttachmentCarouselCellView.layoutManager.findLastCompletelyVisibleItemPosition();
        int iFindLastVisibleItemPosition = articleAttachmentCarouselCellView.layoutManager.findLastVisibleItemPosition();
        if (iFindLastVisibleItemPosition == iFindLastCompletelyVisibleItemPosition) {
            iFindLastVisibleItemPosition = iFindLastCompletelyVisibleItemPosition + 1;
        }
        articleAttachmentCarouselCellView.smoothScroller.setTargetPosition(iFindLastVisibleItemPosition);
        if (iFindLastVisibleItemPosition < articleAttachmentCarouselCellView.adapter.getItemCount()) {
            articleAttachmentCarouselCellView.layoutManager.startSmoothScroll(articleAttachmentCarouselCellView.smoothScroller);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpNextAndPreviousButton$lambda$1(ArticleAttachmentCarouselCellView articleAttachmentCarouselCellView, View view) {
        int iFindFirstCompletelyVisibleItemPosition = articleAttachmentCarouselCellView.layoutManager.findFirstCompletelyVisibleItemPosition();
        int iFindFirstVisibleItemPosition = articleAttachmentCarouselCellView.layoutManager.findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == iFindFirstCompletelyVisibleItemPosition) {
            iFindFirstVisibleItemPosition = iFindFirstCompletelyVisibleItemPosition - 1;
        }
        articleAttachmentCarouselCellView.smoothScroller.setTargetPosition(iFindFirstVisibleItemPosition);
        if (iFindFirstVisibleItemPosition >= 0) {
            articleAttachmentCarouselCellView.layoutManager.startSmoothScroll(articleAttachmentCarouselCellView.smoothScroller);
        }
    }

    private final void setupButtonFocusStates(ArticleAttachmentCarouselCellState state) {
        View nextButton = getNextButton();
        int i11 = R.drawable.zuia_ic_carousel_next_button_circle;
        int i12 = R.dimen.zuia_carousel_next_prev_stroke_width;
        int focusedStateBorderColor = state.getFocusedStateBorderColor();
        Drawable drawable = getContext().getDrawable(R.drawable.zuia_ic_carousel_next_button_circle);
        drawable.getClass();
        ViewKt.addAccessibilityFocusedState(nextButton, i11, i12, focusedStateBorderColor, (GradientDrawable) drawable);
        View prevButton = getPrevButton();
        int i13 = R.drawable.zuia_ic_carousel_prev_button_circle;
        int i14 = R.dimen.zuia_carousel_next_prev_stroke_width;
        int focusedStateBorderColor2 = state.getFocusedStateBorderColor();
        Drawable drawable2 = getContext().getDrawable(R.drawable.zuia_ic_carousel_prev_button_circle);
        drawable2.getClass();
        ViewKt.addAccessibilityFocusedState(prevButton, i13, i14, focusedStateBorderColor2, (GradientDrawable) drawable2);
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super ArticleAttachmentCarouselRendering, ? extends ArticleAttachmentCarouselRendering> renderingUpdate) {
        renderingUpdate.getClass();
        ArticleAttachmentCarouselCellState state = this.rendering.getState();
        ArticleAttachmentCarouselRendering articleAttachmentCarouselRendering = (ArticleAttachmentCarouselRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = articleAttachmentCarouselRendering;
        if (!Intrinsics.areEqual(state, articleAttachmentCarouselRendering.getState())) {
            this.adapter.swapData(this.rendering.getState());
            getNextButton().getBackground().mutate().setTint(this.rendering.getState().getNavigationButtonBackgroundColor());
            getPrevButton().getBackground().mutate().setTint(this.rendering.getState().getNavigationButtonBackgroundColor());
            getNextButtonIconView().setColorFilter(this.rendering.getState().getTextColor());
            getPrevButtonIconView().setColorFilter(this.rendering.getState().getTextColor());
            setUpNextAndPreviousButton(this.rendering.getState());
        }
        this.adapter.setOnAttachmentItemClicked(this.rendering.getOnAttachmentItemClicked$zendesk_ui_ui_android());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArticleAttachmentCarouselCellView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ ArticleAttachmentCarouselCellView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArticleAttachmentCarouselCellView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
