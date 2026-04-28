package zendesk.ui.android.conversation.carousel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pc.d;
import pc.h;
import zc.e;
import zc.i;
import zendesk.ui.android.R;
import zendesk.ui.android.common.button.ButtonRendering;
import zendesk.ui.android.common.button.ButtonState;
import zendesk.ui.android.common.button.ButtonView;
import zendesk.ui.android.conversation.carousel.CarouselAction;
import zendesk.ui.android.conversation.carousel.CarouselCellData;
import zendesk.ui.android.internal.ColorExtKt;
import zendesk.ui.android.internal.DimensionExtKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u0000 -2\u00020\u0001:\u0001-B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001eR\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lzendesk/ui/android/conversation/carousel/ArticleCarouselViewHolder;", "Lzendesk/ui/android/conversation/carousel/CarouselViewHolder;", "Landroid/view/View;", "view", "Lpc/d;", "imageLoader", "<init>", "(Landroid/view/View;Lpc/d;)V", "Lzendesk/ui/android/conversation/carousel/CarouselAction;", "action", "", "textColor", "backgroundColor", "", "isEnabled", "", "renderButton", "(Lzendesk/ui/android/conversation/carousel/CarouselAction;IIZ)V", "getTheArticleAttachmentCarouselBorderAlpha", "()V", "Lzendesk/ui/android/conversation/carousel/CarouselRendering;", "rendering", "Lzendesk/ui/android/conversation/carousel/CarouselCellData$Item;", "cellData", "bind", "(Lzendesk/ui/android/conversation/carousel/CarouselRendering;Lzendesk/ui/android/conversation/carousel/CarouselCellData$Item;)V", "Landroid/view/View;", "Lpc/d;", "Landroid/widget/LinearLayout;", "carouselContainer", "Landroid/widget/LinearLayout;", "Landroid/widget/TextView;", MessageBundle.TITLE_ENTRY, "Landroid/widget/TextView;", "desc", "Landroid/widget/ImageView;", "image", "Landroid/widget/ImageView;", "actionButtonContainer", "Lzc/e;", "imageLoadingDisposable", "Lzc/e;", "", "borderAlpha", "F", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCarouselViewPagerViewHolders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselViewPagerViewHolders.kt\nzendesk/ui/android/conversation/carousel/ArticleCarouselViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,215:1\n1869#2,2:216\n257#3,2:218\n257#3,2:220\n205#4,2:222\n*S KotlinDebug\n*F\n+ 1 CarouselViewPagerViewHolders.kt\nzendesk/ui/android/conversation/carousel/ArticleCarouselViewHolder\n*L\n78#1:216,2\n99#1:218,2\n106#1:220,2\n144#1:222,2\n*E\n"})
public final class ArticleCarouselViewHolder extends CarouselViewHolder {
    private static final int BUTTON_MARGIN_BOTTOM = 10;
    private static final int BUTTON_MARGIN_TOP = 2;

    @NotNull
    private final LinearLayout actionButtonContainer;
    private float borderAlpha;

    @NotNull
    private final LinearLayout carouselContainer;

    @NotNull
    private final TextView desc;

    @NotNull
    private final ImageView image;

    @NotNull
    private final d imageLoader;

    @Nullable
    private e imageLoadingDisposable;

    @NotNull
    private final TextView title;

    @NotNull
    private final View view;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    private ArticleCarouselViewHolder(View view, d dVar) {
        super(view);
        this.view = view;
        this.imageLoader = dVar;
        View viewFindViewById = view.findViewById(R.id.zuia_carousel_list_item_container);
        viewFindViewById.getClass();
        this.carouselContainer = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.zuia_carousel_list_item_title);
        viewFindViewById2.getClass();
        this.title = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.zuia_carousel_list_item_description);
        viewFindViewById3.getClass();
        this.desc = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.zuia_carousel_list_item_image);
        viewFindViewById4.getClass();
        this.image = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.zuia_carousel_list_item_article_button_container);
        viewFindViewById5.getClass();
        this.actionButtonContainer = (LinearLayout) viewFindViewById5;
        getTheArticleAttachmentCarouselBorderAlpha();
    }

    private final void getTheArticleAttachmentCarouselBorderAlpha() {
        TypedValue typedValue = new TypedValue();
        this.view.getContext().getResources().getValue(R.dimen.zuia_article_attachment_border_alpha, typedValue, true);
        this.borderAlpha = typedValue.getFloat();
    }

    private final void renderButton(CarouselAction action, int textColor, int backgroundColor, boolean isEnabled) {
        Context context = this.itemView.getContext();
        context.getClass();
        ButtonView buttonView = new ButtonView(context, null, 0, 6, null);
        buttonView.setId(R.id.zuia_button);
        buttonView.render(new a(action, backgroundColor, textColor, isEnabled, 1));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        Context context2 = this.view.getContext();
        context2.getClass();
        DimensionExtKt.resolveDimensionAttr(context2, new int[]{R.attr.messageCellRadiusSize});
        layoutParams.setMargins(0, DimensionExtKt.getPx(2), 0, DimensionExtKt.getPx(10));
        this.actionButtonContainer.addView(buttonView, layoutParams);
    }

    public static /* synthetic */ void renderButton$default(ArticleCarouselViewHolder articleCarouselViewHolder, CarouselAction carouselAction, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z11 = true;
        }
        articleCarouselViewHolder.renderButton(carouselAction, i11, i12, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonRendering renderButton$lambda$3(CarouselAction carouselAction, int i11, int i12, boolean z11, ButtonRendering buttonRendering) {
        buttonRendering.getClass();
        return buttonRendering.toBuilder().onButtonClicked(new y.a(carouselAction, 28)).state(new a(carouselAction, i11, i12, z11, 0)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderButton$lambda$3$lambda$1(CarouselAction carouselAction) {
        carouselAction.getClickListener().invoke(carouselAction);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonState renderButton$lambda$3$lambda$2(CarouselAction carouselAction, int i11, int i12, boolean z11, ButtonState buttonState) {
        buttonState.getClass();
        return ButtonState.copy$default(buttonState, carouselAction.getText(), carouselAction.getIsLoading(), Integer.valueOf(i11), Integer.valueOf(i12), null, z11, 16, null);
    }

    public final void bind(@NotNull CarouselRendering rendering, @NotNull CarouselCellData.Item cellData) {
        rendering.getClass();
        cellData.getClass();
        Drawable background = this.carouselContainer.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.mutate();
        }
        if (gradientDrawable != null) {
            gradientDrawable.setColor(rendering.getCardColor());
        }
        if (gradientDrawable != null) {
            gradientDrawable.setStroke(j80.c.b(this.carouselContainer.getResources().getDimension(R.dimen.zuia_inner_stroke_width)), ColorExtKt.adjustAlpha(rendering.getTextColor(), this.borderAlpha));
        }
        this.title.setText(cellData.getTitle());
        this.desc.setText(cellData.getDescription());
        this.title.setTextColor(rendering.getTextColor());
        this.desc.setTextColor(rendering.getTextColor());
        this.actionButtonContainer.removeAllViews();
        for (CarouselAction carouselAction : cellData.getActions()) {
            if (carouselAction instanceof CarouselAction.Unsupported) {
                renderButton(carouselAction, rendering.getActionDisabledTextColor(), rendering.getActionDisabledBackgroundColor(), false);
            } else {
                renderButton$default(this, carouselAction, rendering.getActionTextColor(), rendering.getActionBackgroundColor(), false, 8, null);
            }
        }
        e eVar = this.imageLoadingDisposable;
        if (eVar != null) {
            eVar.a();
        }
        String mediaUrl = cellData.getMediaUrl();
        ImageView imageView = this.image;
        if (mediaUrl == null) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        Context context = this.itemView.getContext();
        context.getClass();
        i iVar = new i(context);
        iVar.f47443c = cellData.getMediaUrl();
        iVar.b(this.image);
        this.imageLoadingDisposable = ((h) this.imageLoader).b(iVar.a());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lzendesk/ui/android/conversation/carousel/ArticleCarouselViewHolder$Companion;", "", "<init>", "()V", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroid/view/ViewGroup;", "parent", "Lpc/d;", "imageLoader", "Lzendesk/ui/android/conversation/carousel/ArticleCarouselViewHolder;", "create", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lpc/d;)Lzendesk/ui/android/conversation/carousel/ArticleCarouselViewHolder;", "", "BUTTON_MARGIN_TOP", "I", "BUTTON_MARGIN_BOTTOM", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ArticleCarouselViewHolder create(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup parent, @NotNull d imageLoader) {
            layoutInflater.getClass();
            parent.getClass();
            imageLoader.getClass();
            View viewInflate = layoutInflater.inflate(R.layout.zuia_view_carousel_item_article, parent, false);
            viewInflate.getClass();
            return new ArticleCarouselViewHolder(viewInflate, imageLoader, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ ArticleCarouselViewHolder(View view, d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, dVar);
    }
}
