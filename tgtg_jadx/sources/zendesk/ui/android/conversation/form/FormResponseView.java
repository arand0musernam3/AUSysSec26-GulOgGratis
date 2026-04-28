package zendesk.ui.android.conversation.form;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.internal.ColorExtKt;
import zendesk.ui.android.internal.ViewKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0002R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lzendesk/ui/android/conversation/form/FormResponseView;", "Landroid/widget/LinearLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/form/FormResponseRendering;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "rendering", "spacing", "borderAlpha", "", "render", "", "renderingUpdate", "Lkotlin/Function1;", "getTheFormResponseBorderAlpha", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFormResponseView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormResponseView.kt\nzendesk/ui/android/conversation/form/FormResponseView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,106:1\n176#2,2:107\n190#3,2:109\n*S KotlinDebug\n*F\n+ 1 FormResponseView.kt\nzendesk/ui/android/conversation/form/FormResponseView\n*L\n52#1:107,2\n89#1:109,2\n*E\n"})
public final class FormResponseView extends LinearLayout implements Renderer<FormResponseRendering> {
    public static final int $stable = 8;
    private float borderAlpha;

    @NotNull
    private FormResponseRendering rendering;
    private final int spacing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormResponseView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new FormResponseRendering();
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.zuia_spacing_xsmall);
        this.spacing = dimensionPixelOffset;
        setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        setClipChildren(true);
        setOrientation(1);
        render(new e(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FormResponseRendering _init_$lambda$0(FormResponseRendering formResponseRendering) {
        formResponseRendering.getClass();
        return formResponseRendering;
    }

    private final void getTheFormResponseBorderAlpha() {
        TypedValue typedValue = new TypedValue();
        getResources().getValue(R.dimen.zuia_form_response_border_alpha, typedValue, true);
        this.borderAlpha = typedValue.getFloat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldResponseRendering render$lambda$3$lambda$2(FieldResponse fieldResponse, FormResponseView formResponseView, FieldResponseRendering fieldResponseRendering) {
        fieldResponseRendering.getClass();
        return fieldResponseRendering.toBuilder().state(new f(fieldResponse, formResponseView, 0)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldResponseState render$lambda$3$lambda$2$lambda$1(FieldResponse fieldResponse, FormResponseView formResponseView, FieldResponseState fieldResponseState) {
        fieldResponseState.getClass();
        return fieldResponseState.copy(fieldResponse.getLabel(), fieldResponse.getResponse(), formResponseView.rendering.getState().getTextColor$zendesk_ui_ui_android());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super FormResponseRendering, ? extends FormResponseRendering> renderingUpdate) {
        renderingUpdate.getClass();
        FormResponseState state = this.rendering.getState();
        FormResponseRendering formResponseRendering = (FormResponseRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = formResponseRendering;
        if (Intrinsics.areEqual(state, formResponseRendering.getState())) {
            return;
        }
        getTheFormResponseBorderAlpha();
        Context context = getContext();
        context.getClass();
        ViewKt.outlinedBoxBackground$default(this, ColorExtKt.adjustAlpha(ColorExtKt.resolveColorAttr(context, com.app.tgtg.R.attr.colorOnSurface), this.borderAlpha), 0.0f, 0.0f, this.rendering.getState().getBackgroundColor$zendesk_ui_ui_android(), 6, null);
        removeAllViews();
        for (FieldResponse fieldResponse : this.rendering.getState().getFieldResponses$zendesk_ui_ui_android()) {
            Context context2 = getContext();
            context2.getClass();
            FieldResponseView fieldResponseView = new FieldResponseView(context2, null, 2, 0 == true ? 1 : 0);
            fieldResponseView.render(new f(fieldResponse, this, 1));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int i11 = this.spacing;
            layoutParams.setMargins(i11, i11, i11, i11);
            addView(fieldResponseView, layoutParams);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormResponseView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormResponseView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ FormResponseView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormResponseView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
