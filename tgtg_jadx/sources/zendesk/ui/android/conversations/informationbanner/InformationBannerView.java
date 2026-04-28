package zendesk.ui.android.conversations.informationbanner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import i4.g0;
import i4.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m3.b1;
import m3.i;
import m3.n;
import m3.s;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u3.d;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.conversation.form.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lzendesk/ui/android/conversations/informationbanner/InformationBannerView;", "Landroid/widget/FrameLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversations/informationbanner/InformationBannerRendering;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttrs", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lkotlin/Function1;", "renderingUpdate", "", "render", "(Lkotlin/jvm/functions/Function1;)V", "rendering", "Lzendesk/ui/android/conversations/informationbanner/InformationBannerRendering;", "Lm3/b1;", "", TextBundle.TEXT_ENTRY, "Lm3/b1;", "textDefaultColor", "I", "Li4/v;", "textColor", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InformationBannerView extends FrameLayout implements Renderer<InformationBannerRendering> {
    public static final int $stable = 8;

    @NotNull
    private InformationBannerRendering rendering;

    @NotNull
    private final b1 text;

    @NotNull
    private final b1 textColor;
    private final int textDefaultColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InformationBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        InformationBannerRendering informationBannerRendering = new InformationBannerRendering(null, 1, null);
        this.rendering = informationBannerRendering;
        this.text = i.w(informationBannerRendering.getState().getText());
        int color = context.getColor(R.color.default_color_on_background);
        this.textDefaultColor = color;
        this.textColor = i.w(new v(g0.c(color)));
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setId(R.id.zuia_information_banner_compose_view);
        composeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        composeView.setFocusable(true);
        composeView.setContent(new d(new Function2<n, Integer, Unit>() { // from class: zendesk.ui.android.conversations.informationbanner.InformationBannerView$composeView$1$1
            public final void invoke(n nVar, int i13) {
                if ((i13 & 3) == 2) {
                    s sVar = (s) nVar;
                    if (sVar.B()) {
                        sVar.U();
                        return;
                    }
                }
                InformationBannerKt.m1017InformationBanner3IgeMak((String) this.this$0.text.getValue(), ((v) this.this$0.textColor.getValue()).f23317a, null, nVar, 0, 4);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((n) obj, ((Number) obj2).intValue());
                return Unit.f26487a;
            }
        }, true, -436592475));
        addView(composeView);
        render(new e(8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InformationBannerRendering _init_$lambda$1(InformationBannerRendering informationBannerRendering) {
        informationBannerRendering.getClass();
        return informationBannerRendering;
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super InformationBannerRendering, ? extends InformationBannerRendering> renderingUpdate) {
        renderingUpdate.getClass();
        InformationBannerRendering informationBannerRendering = (InformationBannerRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = informationBannerRendering;
        this.text.setValue(informationBannerRendering.getState().getText());
        this.textColor.setValue(new v(g0.c(this.rendering.getState().getTextColor$zendesk_ui_ui_android())));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InformationBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InformationBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ InformationBannerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InformationBannerView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
