package zendesk.ui.android.conversation.form;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lzendesk/ui/android/conversation/form/FieldResponseView;", "Landroid/widget/LinearLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/form/FieldResponseRendering;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "itemHeader", "Landroid/widget/TextView;", "itemText", "rendering", "render", "", "renderingUpdate", "Lkotlin/Function1;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FieldResponseView extends LinearLayout implements Renderer<FieldResponseRendering> {
    public static final int $stable = 8;

    @NotNull
    private final TextView itemHeader;

    @NotNull
    private final TextView itemText;

    @NotNull
    private FieldResponseRendering rendering;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldResponseView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        context.getClass();
        this.rendering = new FieldResponseRendering();
        View.inflate(context, R.layout.zuia_view_field_response, this);
        setOrientation(1);
        View viewFindViewById = findViewById(R.id.zuia_form_response_title);
        viewFindViewById.getClass();
        this.itemHeader = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.zuia_form_response_subtitle);
        viewFindViewById2.getClass();
        this.itemText = (TextView) viewFindViewById2;
        render(new zendesk.ui.android.conversation.articleviewer.b(26));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldResponseRendering _init_$lambda$0(FieldResponseRendering fieldResponseRendering) {
        fieldResponseRendering.getClass();
        return fieldResponseRendering;
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super FieldResponseRendering, ? extends FieldResponseRendering> renderingUpdate) {
        renderingUpdate.getClass();
        FieldResponseRendering fieldResponseRendering = (FieldResponseRendering) renderingUpdate.invoke(this.rendering);
        this.itemHeader.setTextColor(fieldResponseRendering.getState().getTextColor$zendesk_ui_ui_android());
        this.itemText.setTextColor(fieldResponseRendering.getState().getTextColor$zendesk_ui_ui_android());
        this.itemHeader.setText(fieldResponseRendering.getState().getTitle$zendesk_ui_ui_android());
        this.itemText.setText(fieldResponseRendering.getState().getResponse$zendesk_ui_ui_android());
        this.rendering = fieldResponseRendering;
    }

    public /* synthetic */ FieldResponseView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FieldResponseView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }
}
