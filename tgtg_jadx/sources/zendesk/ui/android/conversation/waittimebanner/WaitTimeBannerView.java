package zendesk.ui.android.conversation.waittimebanner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import i4.g0;
import i4.v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m3.b1;
import m3.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.conversation.waittimebanner.WaitTimeBannerType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006\"²\u0006\u000e\u0010!\u001a\u00020 8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerView;", "Landroid/widget/FrameLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerRendering;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttrs", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lkotlin/Function1;", "renderingUpdate", "", "render", "(Lkotlin/jvm/functions/Function1;)V", "rendering", "Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerRendering;", "onBackgroundDefaultColor", "I", "Lm3/b1;", "Li4/v;", "onBackgroundColor", "Lm3/b1;", "backgroundDefaultColor", "backgroundColor", "focusedBorderDefaultColor", "focusedBorderColor", "Lzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerType;", "bannerType", "", "isFocused", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WaitTimeBannerView extends FrameLayout implements Renderer<WaitTimeBannerRendering> {
    public static final int $stable = 8;

    @NotNull
    private final b1 backgroundColor;
    private final int backgroundDefaultColor;

    @NotNull
    private final b1 bannerType;

    @NotNull
    private final b1 focusedBorderColor;
    private final int focusedBorderDefaultColor;

    @NotNull
    private final b1 onBackgroundColor;
    private final int onBackgroundDefaultColor;

    @NotNull
    private WaitTimeBannerRendering rendering;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaitTimeBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new WaitTimeBannerRendering();
        int color = context.getColor(R.color.default_color_on_background);
        this.onBackgroundDefaultColor = color;
        this.onBackgroundColor = i.w(new v(g0.c(color)));
        int color2 = context.getColor(R.color.default_color_background);
        this.backgroundDefaultColor = color2;
        this.backgroundColor = i.w(new v(g0.c(color2)));
        int color3 = context.getColor(R.color.default_color_on_action_background);
        this.focusedBorderDefaultColor = color3;
        this.focusedBorderColor = i.w(new v(g0.c(color3)));
        this.bannerType = i.w(WaitTimeBannerType.Cleared.INSTANCE);
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setId(R.id.zuia_wait_time_banner_compose_view);
        composeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        composeView.setContent(new u3.d(new WaitTimeBannerView$composeView$1$1(this), true, 219617718));
        addView(composeView);
        render(new a(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WaitTimeBannerRendering _init_$lambda$1(WaitTimeBannerRendering waitTimeBannerRendering) {
        waitTimeBannerRendering.getClass();
        return waitTimeBannerRendering;
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super WaitTimeBannerRendering, ? extends WaitTimeBannerRendering> renderingUpdate) {
        renderingUpdate.getClass();
        WaitTimeBannerRendering waitTimeBannerRendering = (WaitTimeBannerRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = waitTimeBannerRendering;
        this.backgroundColor.setValue(new v(g0.c(waitTimeBannerRendering.getState().getBackgroundColor$zendesk_ui_ui_android())));
        this.onBackgroundColor.setValue(new v(g0.c(this.rendering.getState().getOnBackgroundColor$zendesk_ui_ui_android())));
        this.focusedBorderColor.setValue(new v(g0.c(this.rendering.getState().getFocusedBorderColor$zendesk_ui_ui_android())));
        this.bannerType.setValue(this.rendering.getState().getType$zendesk_ui_ui_android());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WaitTimeBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WaitTimeBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ WaitTimeBannerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WaitTimeBannerView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
