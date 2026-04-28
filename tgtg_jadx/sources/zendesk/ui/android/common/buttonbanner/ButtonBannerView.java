package zendesk.ui.android.common.buttonbanner;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.messaging.android.internal.conversationscreen.o;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.internal.ColorExtKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002&'B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u001a\u001a\u00020\u001bH\u0014J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0014J\u001c\u0010\u001f\u001a\u00020\u001d2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030!H\u0016J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020\u001dH\u0002J\b\u0010$\u001a\u00020\u001dH\u0002J\b\u0010%\u001a\u00020\u001dH\u0002R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lzendesk/ui/android/common/buttonbanner/ButtonBannerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/common/buttonbanner/ButtonBannerRendering;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "rendering", "unreadMessagesView", "unreadMessagesViewAccessibility", AnnotatedPrivateKey.LABEL, "Landroid/widget/TextView;", "labelAccessibility", "Landroid/view/View;", "dismissButton", "Landroid/widget/ImageView;", "dismissButtonAccessibility", "arrowDown", "animatorSet", "Landroid/animation/AnimatorSet;", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "", "state", "render", "renderingUpdate", "Lkotlin/Function1;", "hideUnreadMessagesView", "showUnreadMessagesView", "toastDismissAnimation", "announceAccessibility", "SavedState", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nButtonBannerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ButtonBannerView.kt\nzendesk/ui/android/common/buttonbanner/ButtonBannerView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,288:1\n257#2,2:289\n257#2,2:291\n257#2,2:293\n257#2,2:295\n257#2,2:297\n257#2,2:299\n257#2,2:301\n257#2,2:303\n257#2,2:305\n*S KotlinDebug\n*F\n+ 1 ButtonBannerView.kt\nzendesk/ui/android/common/buttonbanner/ButtonBannerView\n*L\n154#1:289,2\n156#1:291,2\n162#1:293,2\n170#1:295,2\n176#1:297,2\n178#1:299,2\n199#1:301,2\n200#1:303,2\n202#1:305,2\n*E\n"})
public final class ButtonBannerView extends ConstraintLayout implements Renderer<ButtonBannerRendering> {

    @NotNull
    private static final String ALPHA_PROPERTY_NAME = "alpha";
    private static final float ALPHA_TRANSPARENT = 0.0f;
    private static final float ALPHA_VISIBLE = 1.0f;

    @NotNull
    private AnimatorSet animatorSet;

    @NotNull
    private final ImageView arrowDown;

    @NotNull
    private final ImageView dismissButton;

    @NotNull
    private final View dismissButtonAccessibility;

    @NotNull
    private final TextView label;

    @NotNull
    private final View labelAccessibility;

    @NotNull
    private ButtonBannerRendering rendering;

    @NotNull
    private final ConstraintLayout unreadMessagesView;

    @NotNull
    private final ConstraintLayout unreadMessagesViewAccessibility;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonBannerViewType.values().length];
            try {
                iArr[ButtonBannerViewType.NEW_MESSAGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonBannerViewType.SEE_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonBannerViewType.FAILED_BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new ButtonBannerRendering();
        this.animatorSet = new AnimatorSet();
        context.getTheme().applyStyle(R.style.ThemeOverlay_ZendeskComponents_UnreadMessagesStyle, false);
        View.inflate(context, R.layout.zuia_view_unread_messages, this);
        View viewFindViewById = findViewById(R.id.zuia_unread_messages_view);
        viewFindViewById.getClass();
        this.unreadMessagesView = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.zuia_unread_messages_accessibility);
        viewFindViewById2.getClass();
        this.unreadMessagesViewAccessibility = (ConstraintLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.zuia_unread_messages_label);
        viewFindViewById3.getClass();
        this.label = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.zuia_unread_messages_label_accessibility);
        viewFindViewById4.getClass();
        this.labelAccessibility = viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.zuia_dismiss);
        viewFindViewById5.getClass();
        this.dismissButton = (ImageView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.zuia_dismiss_accessibility);
        viewFindViewById6.getClass();
        this.dismissButtonAccessibility = viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.zuia_arrow_down);
        viewFindViewById7.getClass();
        this.arrowDown = (ImageView) viewFindViewById7;
        setVisibility(8);
        render(new o(24));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonBannerRendering _init_$lambda$0(ButtonBannerRendering buttonBannerRendering) {
        buttonBannerRendering.getClass();
        return buttonBannerRendering;
    }

    private final void announceAccessibility() {
        if (this.rendering.getState().getViewType$zendesk_ui_ui_android() == ButtonBannerViewType.FAILED_BANNER) {
            String string = getContext().getString(R.string.zuia_postback_error_banner_accessibility_label, String.valueOf(this.rendering.getState().getStyledText$zendesk_ui_ui_android()));
            string.getClass();
            ViewCompat.d0(this.label, string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideUnreadMessagesView() {
        animate().alpha(ALPHA_TRANSPARENT).withEndAction(new a(this, 1)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$1(ButtonBannerView buttonBannerView, View view) {
        buttonBannerView.rendering.getOnViewClicked$zendesk_ui_ui_android().invoke();
        buttonBannerView.hideUnreadMessagesView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$6$lambda$3(ButtonBannerView buttonBannerView, View view) {
        buttonBannerView.rendering.getOnViewDismissed$zendesk_ui_ui_android().invoke();
        buttonBannerView.hideUnreadMessagesView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$6$lambda$4(ButtonBannerView buttonBannerView, View view) {
        buttonBannerView.rendering.getOnViewDismissed$zendesk_ui_ui_android().invoke();
        buttonBannerView.animatorSet.cancel();
        buttonBannerView.hideUnreadMessagesView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$6$lambda$5(ButtonBannerView buttonBannerView, View view) {
        buttonBannerView.rendering.getOnViewDismissed$zendesk_ui_ui_android().invoke();
        buttonBannerView.animatorSet.cancel();
        buttonBannerView.hideUnreadMessagesView();
    }

    private final void showUnreadMessagesView() {
        animate().alpha(ALPHA_VISIBLE).withStartAction(new a(this, 0)).start();
    }

    private final void toastDismissAnimation() {
        long integer = getResources().getInteger(R.integer.zuia_button_banner_animation_delay);
        long integer2 = getResources().getInteger(R.integer.zuia_button_banner_animation_duration);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, ALPHA_PROPERTY_NAME, ALPHA_VISIBLE, ALPHA_TRANSPARENT);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(integer);
        animatorSet.setDuration(integer2);
        animatorSet.play(objectAnimatorOfFloat);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: zendesk.ui.android.common.buttonbanner.ButtonBannerView$toastDismissAnimation$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                animation.getClass();
                this.this$0.rendering.getOnViewDismissed$zendesk_ui_ui_android().invoke();
                this.this$0.setVisibility(8);
            }
        });
        animatorSet.start();
        this.animatorSet = animatorSet;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable state) {
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        setVisibility(savedState.getVisibility());
    }

    @Override // android.view.View
    @NotNull
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), getVisibility());
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super ButtonBannerRendering, ? extends ButtonBannerRendering> renderingUpdate) {
        int iResolveColorAttr;
        int iResolveColorAttr2;
        int iResolveColorAttr3;
        int iResolveColorAttr4;
        int iResolveColorAttr5;
        int iResolveColorAttr6;
        renderingUpdate.getClass();
        this.rendering = (ButtonBannerRendering) renderingUpdate.invoke(this.rendering);
        final int i11 = 0;
        this.labelAccessibility.setOnClickListener(new View.OnClickListener(this) { // from class: zendesk.ui.android.common.buttonbanner.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ButtonBannerView f47787b;

            {
                this.f47787b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ButtonBannerView.render$lambda$1(this.f47787b, view);
                        break;
                    case 1:
                        this.f47787b.hideUnreadMessagesView();
                        break;
                    case 2:
                        ButtonBannerView.render$lambda$6$lambda$3(this.f47787b, view);
                        break;
                    case 3:
                        ButtonBannerView.render$lambda$6$lambda$4(this.f47787b, view);
                        break;
                    default:
                        ButtonBannerView.render$lambda$6$lambda$5(this.f47787b, view);
                        break;
                }
            }
        });
        ImageView imageView = this.dismissButton;
        Integer buttonsBackgroundColor$zendesk_ui_ui_android = this.rendering.getState().getButtonsBackgroundColor$zendesk_ui_ui_android();
        if (buttonsBackgroundColor$zendesk_ui_ui_android != null) {
            iResolveColorAttr = buttonsBackgroundColor$zendesk_ui_ui_android.intValue();
        } else {
            Context context = getContext();
            context.getClass();
            iResolveColorAttr = ColorExtKt.resolveColorAttr(context, R.attr.unreadMessagesButtonsBackgroundColor);
        }
        imageView.setColorFilter(iResolveColorAttr);
        final int i12 = 1;
        this.dismissButtonAccessibility.setOnClickListener(new View.OnClickListener(this) { // from class: zendesk.ui.android.common.buttonbanner.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ButtonBannerView f47787b;

            {
                this.f47787b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ButtonBannerView.render$lambda$1(this.f47787b, view);
                        break;
                    case 1:
                        this.f47787b.hideUnreadMessagesView();
                        break;
                    case 2:
                        ButtonBannerView.render$lambda$6$lambda$3(this.f47787b, view);
                        break;
                    case 3:
                        ButtonBannerView.render$lambda$6$lambda$4(this.f47787b, view);
                        break;
                    default:
                        ButtonBannerView.render$lambda$6$lambda$5(this.f47787b, view);
                        break;
                }
            }
        });
        Drawable drawable = getContext().getDrawable(R.drawable.zuia_unread_messages_background);
        drawable.getClass();
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.zuia_new_messages_second_background);
        drawableFindDrawableByLayerId.getClass();
        GradientDrawable gradientDrawable = (GradientDrawable) drawableFindDrawableByLayerId;
        Integer backgroundColor$zendesk_ui_ui_android = this.rendering.getState().getBackgroundColor$zendesk_ui_ui_android();
        if (backgroundColor$zendesk_ui_ui_android != null) {
            iResolveColorAttr2 = backgroundColor$zendesk_ui_ui_android.intValue();
        } else {
            Context context2 = getContext();
            context2.getClass();
            iResolveColorAttr2 = ColorExtKt.resolveColorAttr(context2, R.attr.unreadMessagesBackgroundColor);
        }
        gradientDrawable.setColor(iResolveColorAttr2);
        this.unreadMessagesView.setBackground(layerDrawable);
        TextView textView = this.label;
        Integer textColor$zendesk_ui_ui_android = this.rendering.getState().getTextColor$zendesk_ui_ui_android();
        if (textColor$zendesk_ui_ui_android != null) {
            iResolveColorAttr3 = textColor$zendesk_ui_ui_android.intValue();
        } else {
            Context context3 = getContext();
            context3.getClass();
            iResolveColorAttr3 = ColorExtKt.resolveColorAttr(context3, R.attr.unreadMessagesLabelColor);
        }
        textView.setTextColor(iResolveColorAttr3);
        if (this.rendering.getState().getText$zendesk_ui_ui_android() != null && (!StringsKt.H(r6))) {
            this.label.setText(this.rendering.getState().getText$zendesk_ui_ui_android());
        }
        ButtonBannerViewType viewType$zendesk_ui_ui_android = this.rendering.getState().getViewType$zendesk_ui_ui_android();
        if (viewType$zendesk_ui_ui_android != null) {
            int i13 = WhenMappings.$EnumSwitchMapping$0[viewType$zendesk_ui_ui_android.ordinal()];
            if (i13 == 1) {
                this.arrowDown.setVisibility(8);
                this.dismissButton.setVisibility(0);
                ImageView imageView2 = this.dismissButton;
                Integer iconColor$zendesk_ui_ui_android = this.rendering.getState().getIconColor$zendesk_ui_ui_android();
                if (iconColor$zendesk_ui_ui_android != null) {
                    iResolveColorAttr4 = iconColor$zendesk_ui_ui_android.intValue();
                } else {
                    Context context4 = getContext();
                    context4.getClass();
                    iResolveColorAttr4 = ColorExtKt.resolveColorAttr(context4, R.attr.unreadMessagesButtonsBackgroundColor);
                }
                imageView2.setColorFilter(iResolveColorAttr4);
                this.dismissButtonAccessibility.setVisibility(0);
                final int i14 = 2;
                this.dismissButtonAccessibility.setOnClickListener(new View.OnClickListener(this) { // from class: zendesk.ui.android.common.buttonbanner.b

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ButtonBannerView f47787b;

                    {
                        this.f47787b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i14) {
                            case 0:
                                ButtonBannerView.render$lambda$1(this.f47787b, view);
                                break;
                            case 1:
                                this.f47787b.hideUnreadMessagesView();
                                break;
                            case 2:
                                ButtonBannerView.render$lambda$6$lambda$3(this.f47787b, view);
                                break;
                            case 3:
                                ButtonBannerView.render$lambda$6$lambda$4(this.f47787b, view);
                                break;
                            default:
                                ButtonBannerView.render$lambda$6$lambda$5(this.f47787b, view);
                                break;
                        }
                    }
                });
            } else if (i13 == 2) {
                this.arrowDown.setVisibility(0);
                ImageView imageView3 = this.arrowDown;
                Integer iconColor$zendesk_ui_ui_android2 = this.rendering.getState().getIconColor$zendesk_ui_ui_android();
                if (iconColor$zendesk_ui_ui_android2 != null) {
                    iResolveColorAttr5 = iconColor$zendesk_ui_ui_android2.intValue();
                } else {
                    Context context5 = getContext();
                    context5.getClass();
                    iResolveColorAttr5 = ColorExtKt.resolveColorAttr(context5, R.attr.unreadMessagesButtonsBackgroundColor);
                }
                imageView3.setColorFilter(iResolveColorAttr5);
                this.dismissButton.setVisibility(8);
                this.dismissButtonAccessibility.setVisibility(8);
            } else {
                if (i13 != 3) {
                    e40.a.f();
                    return;
                }
                Drawable drawable2 = getContext().getDrawable(R.drawable.zuia_button_banner_background);
                drawable2.getClass();
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable2;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.zuia_banner_background);
                drawableFindDrawableByLayerId2.getClass();
                GradientDrawable gradientDrawable2 = (GradientDrawable) drawableFindDrawableByLayerId2;
                Integer backgroundColor$zendesk_ui_ui_android2 = this.rendering.getState().getBackgroundColor$zendesk_ui_ui_android();
                if (backgroundColor$zendesk_ui_ui_android2 != null) {
                    iResolveColorAttr6 = backgroundColor$zendesk_ui_ui_android2.intValue();
                } else {
                    Context context6 = getContext();
                    context6.getClass();
                    iResolveColorAttr6 = ColorExtKt.resolveColorAttr(context6, R.attr.unreadMessagesBackgroundColor);
                }
                gradientDrawable2.setColor(iResolveColorAttr6);
                this.unreadMessagesView.setBackground(layerDrawable2);
                this.label.getLayoutParams().width = getContext().getResources().getDimensionPixelSize(R.dimen.zuia_postback_error_banner_width);
                this.label.setText(this.rendering.getState().getStyledText$zendesk_ui_ui_android());
                this.arrowDown.setVisibility(8);
                this.dismissButton.setVisibility(0);
                this.dismissButtonAccessibility.setVisibility(0);
                final int i15 = 3;
                this.dismissButtonAccessibility.setOnClickListener(new View.OnClickListener(this) { // from class: zendesk.ui.android.common.buttonbanner.b

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ButtonBannerView f47787b;

                    {
                        this.f47787b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i15) {
                            case 0:
                                ButtonBannerView.render$lambda$1(this.f47787b, view);
                                break;
                            case 1:
                                this.f47787b.hideUnreadMessagesView();
                                break;
                            case 2:
                                ButtonBannerView.render$lambda$6$lambda$3(this.f47787b, view);
                                break;
                            case 3:
                                ButtonBannerView.render$lambda$6$lambda$4(this.f47787b, view);
                                break;
                            default:
                                ButtonBannerView.render$lambda$6$lambda$5(this.f47787b, view);
                                break;
                        }
                    }
                });
                final int i16 = 4;
                this.dismissButton.setOnClickListener(new View.OnClickListener(this) { // from class: zendesk.ui.android.common.buttonbanner.b

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ButtonBannerView f47787b;

                    {
                        this.f47787b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i16) {
                            case 0:
                                ButtonBannerView.render$lambda$1(this.f47787b, view);
                                break;
                            case 1:
                                this.f47787b.hideUnreadMessagesView();
                                break;
                            case 2:
                                ButtonBannerView.render$lambda$6$lambda$3(this.f47787b, view);
                                break;
                            case 3:
                                ButtonBannerView.render$lambda$6$lambda$4(this.f47787b, view);
                                break;
                            default:
                                ButtonBannerView.render$lambda$6$lambda$5(this.f47787b, view);
                                break;
                        }
                    }
                });
                if (this.rendering.getState().getShouldAnimate$zendesk_ui_ui_android()) {
                    announceAccessibility();
                    toastDismissAnimation();
                }
            }
        }
        if (Intrinsics.areEqual(this.rendering.getState().isVisible$zendesk_ui_ui_android(), Boolean.TRUE)) {
            showUnreadMessagesView();
        } else {
            hideUnreadMessagesView();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lzendesk/ui/android/common/buttonbanner/ButtonBannerView$Companion;", "", "<init>", "()V", "ALPHA_TRANSPARENT", "", "ALPHA_VISIBLE", "ALPHA_PROPERTY_NAME", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lzendesk/ui/android/common/buttonbanner/ButtonBannerView$SavedState;", "Landroid/view/View$BaseSavedState;", "state", "Landroid/os/Parcelable;", "visibility", "", "<init>", "(Landroid/os/Parcelable;I)V", "getState", "()Landroid/os/Parcelable;", "getVisibility", "()I", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        @NotNull
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();

        @Nullable
        private final Parcelable state;
        private final int visibility;

        public SavedState(@Nullable Parcelable parcelable, int i11) {
            super(parcelable);
            this.state = parcelable;
            this.visibility = i11;
        }

        @Nullable
        public final Parcelable getState() {
            return this.state;
        }

        public final int getVisibility() {
            return this.visibility;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeParcelable(this.state, flags);
            dest.writeInt(this.visibility);
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ ButtonBannerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonBannerView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
