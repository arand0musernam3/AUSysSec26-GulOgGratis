package zendesk.ui.android.conversation.carousel;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c2;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import m0.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.conversation.carousel.CarouselCellData;
import zendesk.ui.android.internal.ViewKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ#\u0010\u0017\u001a\u00020\r2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u001b\u0010)\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010%R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001e\u001a\u0004\b,\u0010-R\u001b\u00101\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001e\u001a\u0004\b0\u0010-R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010C\u001a\n B*\u0004\u0018\u00010A0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lzendesk/ui/android/conversation/carousel/CarouselCellView;", "Landroid/widget/FrameLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/carousel/CarouselCellState;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "state", "", "calculateAndSetListHeight", "(Lzendesk/ui/android/conversation/carousel/CarouselCellState;)V", "setUpNextAndPreviousButton", "checkCarouselsScrollingAndButtonVisibility", "()V", "checkTheCarouselLayoutDirection", "setupButtonFocusStates", "Lkotlin/Function1;", "renderingUpdate", "render", "(Lkotlin/jvm/functions/Function1;)V", "marginCount", "I", "Lzendesk/ui/android/conversation/carousel/CarouselCellState;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "Lu70/j;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/view/View;", "nextButton$delegate", "getNextButton", "()Landroid/view/View;", "nextButton", "prevButton$delegate", "getPrevButton", "prevButton", "Landroid/widget/ImageView;", "nextButtonIconView$delegate", "getNextButtonIconView", "()Landroid/widget/ImageView;", "nextButtonIconView", "prevButtonIconView$delegate", "getPrevButtonIconView", "prevButtonIconView", "Lzendesk/ui/android/conversation/carousel/CarouselRecyclerViewAdapter;", "adapter", "Lzendesk/ui/android/conversation/carousel/CarouselRecyclerViewAdapter;", "Lzendesk/ui/android/conversation/carousel/CarouselLayoutManager;", "layoutManager", "Lzendesk/ui/android/conversation/carousel/CarouselLayoutManager;", "Lzendesk/ui/android/conversation/carousel/CarouselItemDecoration;", "itemDecoration", "Lzendesk/ui/android/conversation/carousel/CarouselItemDecoration;", "Lzendesk/ui/android/conversation/carousel/CarouselSnapHelper;", "snapHelper", "Lzendesk/ui/android/conversation/carousel/CarouselSnapHelper;", "Lzendesk/ui/android/conversation/carousel/CenterSmoothScroller;", "smoothScroller", "Lzendesk/ui/android/conversation/carousel/CenterSmoothScroller;", "Landroid/content/res/Configuration;", "kotlin.jvm.PlatformType", "configuration", "Landroid/content/res/Configuration;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCarouselCellView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselCellView.kt\nzendesk/ui/android/conversation/carousel/CarouselCellView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,194:1\n1#2:195\n1740#3,3:196\n257#4,2:199\n257#4,2:201\n*S KotlinDebug\n*F\n+ 1 CarouselCellView.kt\nzendesk/ui/android/conversation/carousel/CarouselCellView\n*L\n80#1:196,3\n155#1:199,2\n156#1:201,2\n*E\n"})
public final class CarouselCellView extends FrameLayout implements Renderer<CarouselCellState> {
    public static final int $stable = 8;

    @NotNull
    private final CarouselRecyclerViewAdapter adapter;
    private final Configuration configuration;

    @NotNull
    private final CarouselItemDecoration itemDecoration;

    @NotNull
    private final CarouselLayoutManager layoutManager;
    private final int marginCount;

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
    private final CenterSmoothScroller smoothScroller;

    @NotNull
    private final CarouselSnapHelper snapHelper;

    @NotNull
    private CarouselCellState state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselCellView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.marginCount = 2;
        this.state = new CarouselCellState(null, null, null, 7, null);
        this.recyclerView = ViewKt.lazyViewById(this, R.id.zuia_carousel_list);
        this.nextButton = ViewKt.lazyViewById(this, R.id.zuia_carousel_next_button);
        this.prevButton = ViewKt.lazyViewById(this, R.id.zuia_carousel_prev_button);
        this.nextButtonIconView = ViewKt.lazyViewById(this, R.id.zuia_carousel_next_button_icon_view);
        this.prevButtonIconView = ViewKt.lazyViewById(this, R.id.zuia_carousel_prev_button_icon_view);
        CarouselRecyclerViewAdapter carouselRecyclerViewAdapter = new CarouselRecyclerViewAdapter(context);
        this.adapter = carouselRecyclerViewAdapter;
        CarouselLayoutManager carouselLayoutManager = new CarouselLayoutManager(context, carouselRecyclerViewAdapter);
        this.layoutManager = carouselLayoutManager;
        CarouselItemDecoration carouselItemDecoration = new CarouselItemDecoration(context);
        this.itemDecoration = carouselItemDecoration;
        CarouselSnapHelper carouselSnapHelper = new CarouselSnapHelper(carouselLayoutManager);
        this.snapHelper = carouselSnapHelper;
        this.smoothScroller = new CenterSmoothScroller(context);
        this.configuration = getResources().getConfiguration();
        context.getTheme().applyStyle(R.style.ThemeOverlay_ZendeskComponents_TextCellStyle, false);
        View.inflate(context, R.layout.zuia_view_carousel_cell, this);
        getRecyclerView().setAdapter(carouselRecyclerViewAdapter);
        getRecyclerView().setLayoutManager(carouselLayoutManager);
        getRecyclerView().i(carouselItemDecoration);
        carouselSnapHelper.attachToRecyclerView(getRecyclerView());
        checkTheCarouselLayoutDirection();
    }

    private final void calculateAndSetListHeight(CarouselCellState state) {
        int dimensionPixelSize;
        Iterator it = k0.B(state.getCellData(), CarouselCellData.Item.class).iterator();
        if (!it.hasNext()) {
            i1.c();
            return;
        }
        int size = ((CarouselCellData.Item) it.next()).getActions().size();
        while (it.hasNext()) {
            int size2 = ((CarouselCellData.Item) it.next()).getActions().size();
            if (size < size2) {
                size = size2;
            }
        }
        ArrayList arrayListB = k0.B(state.getCellData(), CarouselCellData.Item.class);
        if (arrayListB.isEmpty()) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.zuia_carousel_height) - getResources().getDimensionPixelSize(R.dimen.zuia_carousel_image_height);
        } else {
            Iterator it2 = arrayListB.iterator();
            while (it2.hasNext()) {
                String mediaUrl = ((CarouselCellData.Item) it2.next()).getMediaUrl();
                if (mediaUrl != null && mediaUrl.length() != 0) {
                    dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.zuia_carousel_height);
                    break;
                }
            }
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.zuia_carousel_height) - getResources().getDimensionPixelSize(R.dimen.zuia_carousel_image_height);
        }
        int dimensionPixelSize2 = ((getResources().getDimensionPixelSize(R.dimen.zuia_carousel_text_size) + (getResources().getDimensionPixelSize(R.dimen.zuia_carousel_button_margin) * this.marginCount)) * size) + dimensionPixelSize;
        ViewGroup.LayoutParams layoutParams = getRecyclerView().getLayoutParams();
        layoutParams.height = dimensionPixelSize2;
        getRecyclerView().setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCarouselsScrollingAndButtonVisibility() {
        if (this.layoutManager.getItemCount() - 1 == 1) {
            getNextButton().setVisibility(8);
            getPrevButton().setVisibility(8);
            this.layoutManager.setScroll$zendesk_ui_ui_android(false);
        }
    }

    private final void checkTheCarouselLayoutDirection() {
        if (this.configuration.getLayoutDirection() == 1) {
            this.itemDecoration.setLayoutDirectionToRTL$zendesk_ui_ui_android();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getNextButton() {
        return (View) this.nextButton.getValue();
    }

    private final ImageView getNextButtonIconView() {
        return (ImageView) this.nextButtonIconView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getPrevButton() {
        return (View) this.prevButton.getValue();
    }

    private final ImageView getPrevButtonIconView() {
        return (ImageView) this.prevButtonIconView.getValue();
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.getValue();
    }

    private final void setUpNextAndPreviousButton(CarouselCellState state) {
        setupButtonFocusStates(state);
        final int i11 = 0;
        getNextButton().setOnClickListener(new View.OnClickListener(this) { // from class: zendesk.ui.android.conversation.carousel.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CarouselCellView f47820b;

            {
                this.f47820b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        CarouselCellView.setUpNextAndPreviousButton$lambda$3(this.f47820b, view);
                        break;
                    default:
                        CarouselCellView.setUpNextAndPreviousButton$lambda$4(this.f47820b, view);
                        break;
                }
            }
        });
        final int i12 = 1;
        getPrevButton().setOnClickListener(new View.OnClickListener(this) { // from class: zendesk.ui.android.conversation.carousel.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CarouselCellView f47820b;

            {
                this.f47820b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        CarouselCellView.setUpNextAndPreviousButton$lambda$3(this.f47820b, view);
                        break;
                    default:
                        CarouselCellView.setUpNextAndPreviousButton$lambda$4(this.f47820b, view);
                        break;
                }
            }
        });
        getRecyclerView().k(new c2() { // from class: zendesk.ui.android.conversation.carousel.CarouselCellView.setUpNextAndPreviousButton.3
            @Override // androidx.recyclerview.widget.c2
            public void onScrolled(RecyclerView recyclerView, int dx2, int dy2) {
                recyclerView.getClass();
                boolean z11 = CarouselCellView.this.layoutManager.findFirstCompletelyVisibleItemPosition() == 0 || CarouselCellView.this.layoutManager.findFirstCompletelyVisibleItemPosition() == 1;
                boolean z12 = CarouselCellView.this.layoutManager.findLastCompletelyVisibleItemPosition() == CarouselCellView.this.adapter.getItemCount() - 1;
                CarouselCellView.this.getPrevButton().setVisibility(!z11 ? 0 : 8);
                CarouselCellView.this.getNextButton().setVisibility(z12 ? 8 : 0);
                CarouselCellView.this.checkCarouselsScrollingAndButtonVisibility();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpNextAndPreviousButton$lambda$3(CarouselCellView carouselCellView, View view) {
        int iFindLastCompletelyVisibleItemPosition = carouselCellView.layoutManager.findLastCompletelyVisibleItemPosition();
        int iFindLastVisibleItemPosition = carouselCellView.layoutManager.findLastVisibleItemPosition();
        if (iFindLastVisibleItemPosition == iFindLastCompletelyVisibleItemPosition) {
            iFindLastVisibleItemPosition = iFindLastCompletelyVisibleItemPosition + 1;
        }
        carouselCellView.smoothScroller.setTargetPosition(iFindLastVisibleItemPosition);
        if (iFindLastVisibleItemPosition < carouselCellView.adapter.getItemCount()) {
            carouselCellView.layoutManager.startSmoothScroll(carouselCellView.smoothScroller);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpNextAndPreviousButton$lambda$4(CarouselCellView carouselCellView, View view) {
        int iFindFirstCompletelyVisibleItemPosition = carouselCellView.layoutManager.findFirstCompletelyVisibleItemPosition();
        int iFindFirstVisibleItemPosition = carouselCellView.layoutManager.findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == iFindFirstCompletelyVisibleItemPosition) {
            iFindFirstVisibleItemPosition = iFindFirstCompletelyVisibleItemPosition - 1;
        }
        carouselCellView.smoothScroller.setTargetPosition(iFindFirstVisibleItemPosition);
        if (iFindFirstVisibleItemPosition >= 0 || (carouselCellView.adapter.hasAvatar() && iFindFirstVisibleItemPosition >= 1)) {
            carouselCellView.layoutManager.startSmoothScroll(carouselCellView.smoothScroller);
        }
    }

    private final void setupButtonFocusStates(CarouselCellState state) {
        View nextButton = getNextButton();
        int i11 = R.drawable.zuia_ic_carousel_next_button_circle;
        int i12 = R.dimen.zuia_carousel_next_prev_stroke_width;
        int focusedStateBorderColor = state.getRendering().getFocusedStateBorderColor();
        Drawable drawable = getContext().getDrawable(R.drawable.zuia_ic_carousel_next_button_circle);
        drawable.getClass();
        ViewKt.addAccessibilityFocusedState(nextButton, i11, i12, focusedStateBorderColor, (GradientDrawable) drawable);
        View prevButton = getPrevButton();
        int i13 = R.drawable.zuia_ic_carousel_prev_button_circle;
        int i14 = R.dimen.zuia_carousel_next_prev_stroke_width;
        int focusedStateBorderColor2 = state.getRendering().getFocusedStateBorderColor();
        Drawable drawable2 = getContext().getDrawable(R.drawable.zuia_ic_carousel_prev_button_circle);
        drawable2.getClass();
        ViewKt.addAccessibilityFocusedState(prevButton, i13, i14, focusedStateBorderColor2, (GradientDrawable) drawable2);
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super CarouselCellState, ? extends CarouselCellState> renderingUpdate) {
        renderingUpdate.getClass();
        CarouselCellState carouselCellState = (CarouselCellState) renderingUpdate.invoke(this.state);
        this.state = carouselCellState;
        CarouselCellState carouselCellStateCopy$default = CarouselCellState.copy$default(this.state, CollectionsKt.d0(this.state.getCellData(), c0.c(new CarouselCellData.Avatar(carouselCellState.getAvatarImageState()))), null, null, 6, null);
        this.state = carouselCellStateCopy$default;
        this.layoutManager.setItemMargin$zendesk_ui_ui_android(carouselCellStateCopy$default.getRendering().getMargin());
        this.adapter.swapData(this.state);
        getNextButton().getBackground().mutate().setTint(this.state.getRendering().getNavigationButtonColor());
        getPrevButton().getBackground().mutate().setTint(this.state.getRendering().getNavigationButtonColor());
        getNextButtonIconView().setColorFilter(this.state.getRendering().getNavigationIconColor());
        getPrevButtonIconView().setColorFilter(this.state.getRendering().getNavigationIconColor());
        calculateAndSetListHeight(this.state);
        setUpNextAndPreviousButton(this.state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CarouselCellView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ CarouselCellView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CarouselCellView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
