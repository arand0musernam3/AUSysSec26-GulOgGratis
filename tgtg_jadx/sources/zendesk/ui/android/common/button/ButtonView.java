package zendesk.ui.android.common.button;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.vectordrawable.graphics.drawable.c;
import androidx.vectordrawable.graphics.drawable.h;
import com.google.android.material.button.MaterialButton;
import jb.u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n20.f;
import n20.m;
import n20.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.messaging.android.internal.conversationscreen.o;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.internal.ColorExtKt;
import zendesk.ui.android.internal.ThrottledOnClickListenerKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lzendesk/ui/android/common/button/ButtonView;", "Lcom/google/android/material/button/MaterialButton;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/common/button/ButtonRendering;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "renderingUpdate", "", "render", "(Lkotlin/jvm/functions/Function1;)V", "stopAnimation$zendesk_ui_ui_android", "()V", "stopAnimation", "Landroidx/vectordrawable/graphics/drawable/h;", "loadingAnimation", "Landroidx/vectordrawable/graphics/drawable/h;", "Landroidx/vectordrawable/graphics/drawable/c;", "animationLoopCallback", "Landroidx/vectordrawable/graphics/drawable/c;", "rendering", "Lzendesk/ui/android/common/button/ButtonRendering;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ButtonView extends MaterialButton implements Renderer<ButtonRendering> {
    public static final int $stable = 8;

    @NotNull
    private final c animationLoopCallback;

    @Nullable
    private final h loadingAnimation;

    @NotNull
    private ButtonRendering rendering;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.loadingAnimation = h.a(context, R.drawable.zuia_animation_loading_juggle);
        this.animationLoopCallback = new c() { // from class: zendesk.ui.android.common.button.ButtonView$animationLoopCallback$1
            private static final void onAnimationEnd$lambda$0(ButtonView buttonView) {
                h hVar = buttonView.loadingAnimation;
                if (hVar != null) {
                    hVar.start();
                }
            }

            @Override // androidx.vectordrawable.graphics.drawable.c
            public void onAnimationEnd(Drawable drawable) {
                drawable.getClass();
                if (this.this$0.rendering.getState().isLoading()) {
                    onAnimationEnd$lambda$0(this.this$0);
                }
            }
        };
        this.rendering = new ButtonRendering();
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        render(new o(23));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonRendering _init_$lambda$0(ButtonRendering buttonRendering) {
        buttonRendering.getClass();
        return buttonRendering;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$1(ButtonView buttonView) {
        buttonView.rendering.getOnButtonClicked$zendesk_ui_ui_android().invoke();
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$4$lambda$3(ButtonView buttonView, int i11) {
        buttonView.loadingAnimation.setColorFilter(u.A(i11, x6.a.SRC_ATOP));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$6(ButtonView buttonView, int i11, float f11) {
        if (buttonView.getLineCount() >= i11) {
            m mVar = new m();
            m mVar2 = new m();
            m mVar3 = new m();
            m mVar4 = new m();
            n20.a aVar = new n20.a(0.0f);
            n20.a aVar2 = new n20.a(0.0f);
            n20.a aVar3 = new n20.a(0.0f);
            n20.a aVar4 = new n20.a(0.0f);
            f fVar = new f(0);
            f fVar2 = new f(0);
            f fVar3 = new f(0);
            f fVar4 = new f(0);
            n nVar = new n();
            nVar.f30376a = mVar;
            nVar.f30377b = mVar2;
            nVar.f30378c = mVar3;
            nVar.f30379d = mVar4;
            nVar.f30380e = aVar;
            nVar.f30381f = aVar2;
            nVar.f30382g = aVar3;
            nVar.f30383h = aVar4;
            nVar.f30384i = fVar;
            nVar.f30385j = fVar2;
            nVar.f30386k = fVar3;
            nVar.l = fVar4;
            nVar.b(f11);
            buttonView.setShapeAppearanceModel(nVar.a());
        }
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super ButtonRendering, ? extends ButtonRendering> renderingUpdate) {
        int iResolveColorAttr;
        renderingUpdate.getClass();
        ButtonRendering buttonRendering = (ButtonRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = buttonRendering;
        setText(buttonRendering.getState().isLoading() ? "" : this.rendering.getState().getText());
        setOnClickListener(ThrottledOnClickListenerKt.throttledOnClickListener$default(0L, new y.a(this, 23), 1, null));
        Integer backgroundColor = this.rendering.getState().getBackgroundColor();
        if (backgroundColor != null) {
            iResolveColorAttr = backgroundColor.intValue();
        } else {
            Context context = getContext();
            context.getClass();
            iResolveColorAttr = ColorExtKt.resolveColorAttr(context, com.app.tgtg.R.attr.colorAccent);
        }
        setBackgroundColor(iResolveColorAttr);
        Integer textColor = this.rendering.getState().getTextColor();
        if (textColor != null) {
            setTextColor(textColor.intValue());
        }
        setElevation(0.0f);
        setClickable(!this.rendering.getState().isLoading());
        if (this.loadingAnimation == null) {
            return;
        }
        if (this.rendering.getState().isLoading() && this.loadingAnimation.isRunning()) {
            return;
        }
        Integer loadingColor = this.rendering.getState().getLoadingColor();
        if (loadingColor != null) {
            post(new b0.h(this, loadingColor.intValue(), 8));
        }
        int i11 = 0;
        if (this.rendering.getState().isLoading()) {
            setMinimumWidth(getWidth());
            setContentDescription(getResources().getString(R.string.zuia_accessibility_loading_label));
            setIcon(this.loadingAnimation);
            this.loadingAnimation.b(this.animationLoopCallback);
            this.loadingAnimation.start();
        } else {
            setMinimumWidth(0);
            setTextScaleX(1.0f);
            setContentDescription(null);
            setIcon(null);
            this.loadingAnimation.setCallback(null);
            this.loadingAnimation.stop();
        }
        setClickable(this.rendering.getState().isClickable());
        TypedValue typedValue = new TypedValue();
        getContext().getResources().getValue(R.dimen.zuia_carousel_button_corner_size, typedValue, true);
        post(new a(this, getResources().getInteger(R.integer.zuia_button_line_count), typedValue.getFloat(), i11));
    }

    public final void stopAnimation$zendesk_ui_ui_android() {
        h hVar = this.loadingAnimation;
        if (hVar != null) {
            hVar.setCallback(null);
        }
        h hVar2 = this.loadingAnimation;
        if (hVar2 != null) {
            hVar2.stop();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ ButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? R.attr.formButtonStyle : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
