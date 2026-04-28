package zendesk.ui.android.conversation.messagesdivider;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qb.r;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0017H\u0016R\u000e\u0010\r\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lzendesk/ui/android/conversation/messagesdivider/MessagesDividerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/messagesdivider/MessagesDividerRendering;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dividerView", "messageDividerText", "Landroid/widget/TextView;", "messageDividerEnd", "Landroid/view/View;", "messageDividerStart", "rendering", "render", "", "renderingUpdate", "Lkotlin/Function1;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessagesDividerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessagesDividerView.kt\nzendesk/ui/android/conversation/messagesdivider/MessagesDividerView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
public final class MessagesDividerView extends ConstraintLayout implements Renderer<MessagesDividerRendering> {
    public static final int $stable = 8;

    @NotNull
    private final ConstraintLayout dividerView;

    @NotNull
    private final View messageDividerEnd;

    @NotNull
    private final View messageDividerStart;

    @NotNull
    private final TextView messageDividerText;

    @NotNull
    private MessagesDividerRendering rendering;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesDividerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new MessagesDividerRendering();
        View.inflate(context, R.layout.zuia_view_messages_divider, this);
        View viewFindViewById = findViewById(R.id.zui_message_divider_text);
        viewFindViewById.getClass();
        this.messageDividerText = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.zui_divider_view_start);
        viewFindViewById2.getClass();
        this.messageDividerStart = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.zui_divider_view_end);
        viewFindViewById3.getClass();
        this.messageDividerEnd = viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.zui_message_divider);
        viewFindViewById4.getClass();
        this.dividerView = (ConstraintLayout) viewFindViewById4;
        render(new r(22));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessagesDividerRendering _init_$lambda$0(MessagesDividerRendering messagesDividerRendering) {
        messagesDividerRendering.getClass();
        return messagesDividerRendering;
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super MessagesDividerRendering, ? extends MessagesDividerRendering> renderingUpdate) {
        renderingUpdate.getClass();
        MessagesDividerRendering messagesDividerRendering = (MessagesDividerRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = messagesDividerRendering;
        Integer dividerColor = messagesDividerRendering.getState().getDividerColor();
        if (dividerColor != null) {
            this.messageDividerStart.setBackgroundColor(dividerColor.intValue());
        }
        Integer dividerColor2 = this.rendering.getState().getDividerColor();
        if (dividerColor2 != null) {
            this.messageDividerEnd.setBackgroundColor(dividerColor2.intValue());
        }
        this.messageDividerText.setText(this.rendering.getState().getText());
        Integer textStyle = this.rendering.getState().getTextStyle();
        if (textStyle != null) {
            this.messageDividerText.setTextAppearance(textStyle.intValue());
        }
        Integer textColor = this.rendering.getState().getTextColor();
        if (textColor != null) {
            this.messageDividerText.setTextColor(textColor.intValue());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessagesDividerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessagesDividerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ MessagesDividerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessagesDividerView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
