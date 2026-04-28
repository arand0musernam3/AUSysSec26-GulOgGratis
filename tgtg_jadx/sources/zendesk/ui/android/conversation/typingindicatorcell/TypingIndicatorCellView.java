package zendesk.ui.android.conversation.typingindicatorcell;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.vectordrawable.graphics.drawable.e;
import androidx.vectordrawable.graphics.drawable.h;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t1.w1;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.internal.ImageViewExtensionKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lzendesk/ui/android/conversation/typingindicatorcell/TypingIndicatorCellView;", "Landroid/widget/FrameLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/typingindicatorcell/TypingIndicatorCellRendering;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttrs", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "configureAnimation", "()V", "Lkotlin/Function1;", "renderingUpdate", "render", "(Lkotlin/jvm/functions/Function1;)V", "stopAnimation$zendesk_ui_ui_android", "stopAnimation", "rendering", "Lzendesk/ui/android/conversation/typingindicatorcell/TypingIndicatorCellRendering;", "Landroidx/vectordrawable/graphics/drawable/h;", "animatedVectorDrawable", "Landroidx/vectordrawable/graphics/drawable/h;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTypingIndicatorCellView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypingIndicatorCellView.kt\nzendesk/ui/android/conversation/typingindicatorcell/TypingIndicatorCellView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
public final class TypingIndicatorCellView extends FrameLayout implements Renderer<TypingIndicatorCellRendering> {
    public static final int $stable = 8;

    @Nullable
    private h animatedVectorDrawable;

    @NotNull
    private TypingIndicatorCellRendering rendering;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypingIndicatorCellView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new TypingIndicatorCellRendering();
        context.getTheme().applyStyle(R.style.ThemeOverlay_ZendeskComponents_TypingIndicatorCellStyle, false);
        View.inflate(context, R.layout.zuia_view_typing_indicator_cell, this);
        render(new w1(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypingIndicatorCellRendering _init_$lambda$0(TypingIndicatorCellRendering typingIndicatorCellRendering) {
        typingIndicatorCellRendering.getClass();
        return typingIndicatorCellRendering;
    }

    private final void configureAnimation() {
        View viewFindViewById = findViewById(R.id.zuia_typing_indicator);
        viewFindViewById.getClass();
        ImageView imageView = (ImageView) viewFindViewById;
        h hVar = this.animatedVectorDrawable;
        if (hVar != null) {
            hVar.stop();
        }
        this.animatedVectorDrawable = ImageViewExtensionKt.applyLoopingAnimatedVectorDrawable(imageView, R.drawable.zuia_animation_typing_indicator);
        Integer dotColor$zendesk_ui_ui_android = this.rendering.getState().getDotColor$zendesk_ui_ui_android();
        if (dotColor$zendesk_ui_ui_android != null) {
            int iIntValue = dotColor$zendesk_ui_ui_android.intValue();
            h hVar2 = this.animatedVectorDrawable;
            if (hVar2 != null) {
                hVar2.setTint(iIntValue);
            }
        }
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super TypingIndicatorCellRendering, ? extends TypingIndicatorCellRendering> renderingUpdate) {
        Integer backgroundColor$zendesk_ui_ui_android;
        renderingUpdate.getClass();
        this.rendering = (TypingIndicatorCellRendering) renderingUpdate.invoke(this.rendering);
        setBackgroundResource(R.drawable.zuia_message_cell_inbound_shape_single);
        if (getBackground() != null && (backgroundColor$zendesk_ui_ui_android = this.rendering.getState().getBackgroundColor$zendesk_ui_ui_android()) != null) {
            int iIntValue = backgroundColor$zendesk_ui_ui_android.intValue();
            Drawable background = getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(iIntValue);
            }
        }
        configureAnimation();
    }

    public final void stopAnimation$zendesk_ui_ui_android() {
        h hVar = this.animatedVectorDrawable;
        if (hVar != null) {
            Drawable drawable = hVar.f4052a;
            if (drawable != null) {
                ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            } else {
                e eVar = hVar.f4049d;
                if (eVar != null) {
                    hVar.f4047b.f4042b.removeListener(eVar);
                    hVar.f4049d = null;
                }
                ArrayList arrayList = hVar.f4050e;
                if (arrayList != null) {
                    arrayList.clear();
                }
            }
        }
        h hVar2 = this.animatedVectorDrawable;
        if (hVar2 != null) {
            hVar2.stop();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypingIndicatorCellView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypingIndicatorCellView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ TypingIndicatorCellView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypingIndicatorCellView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
