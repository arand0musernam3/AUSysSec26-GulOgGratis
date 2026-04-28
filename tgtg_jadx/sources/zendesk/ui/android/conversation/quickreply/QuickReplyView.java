package zendesk.ui.android.conversation.quickreply;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pm.m;
import rk.z;
import sb0.b;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lzendesk/ui/android/conversation/quickreply/QuickReplyView;", "Landroid/widget/FrameLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/quickreply/QuickReplyRendering;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "chipContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "chipFlow", "Landroidx/constraintlayout/helper/widget/Flow;", "rendering", "render", "", "renderingUpdate", "Lkotlin/Function1;", "setupQuickReplies", "removeQuickReplies", "addQuickReplyOption", "Landroid/view/View;", "id", "", TextBundle.TEXT_ENTRY, "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QuickReplyView extends FrameLayout implements Renderer<QuickReplyRendering> {
    public static final int $stable = 8;

    @NotNull
    private final ConstraintLayout chipContainer;

    @NotNull
    private final Flow chipFlow;

    @NotNull
    private QuickReplyRendering rendering;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickReplyView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new QuickReplyRendering();
        View.inflate(context, R.layout.zuia_view_quick_reply, this);
        View viewFindViewById = findViewById(R.id.zuia_quick_reply_chip_container);
        viewFindViewById.getClass();
        this.chipContainer = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.zuia_quick_reply_chip_flow);
        viewFindViewById2.getClass();
        this.chipFlow = (Flow) viewFindViewById2;
        render(new z(7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuickReplyRendering _init_$lambda$0(QuickReplyRendering quickReplyRendering) {
        quickReplyRendering.getClass();
        return quickReplyRendering;
    }

    private final View addQuickReplyOption(String id2, String text) {
        Context context = getContext();
        context.getClass();
        QuickReplyOptionView quickReplyOptionView = new QuickReplyOptionView(context, null, 0, 0, 14, null);
        quickReplyOptionView.render(new b(id2, text, this, 0));
        return quickReplyOptionView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuickReplyOptionRendering addQuickReplyOption$lambda$5$lambda$4(String str, String str2, QuickReplyView quickReplyView, QuickReplyOptionRendering quickReplyOptionRendering) {
        quickReplyOptionRendering.getClass();
        return quickReplyOptionRendering.toBuilder().state(new b(str, str2, quickReplyView, 1)).onOptionClicked(new m(quickReplyView, 6)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuickReplyOptionState addQuickReplyOption$lambda$5$lambda$4$lambda$1(String str, String str2, QuickReplyView quickReplyView, QuickReplyOptionState quickReplyOptionState) {
        quickReplyOptionState.getClass();
        return quickReplyOptionState.copy(str, str2, quickReplyView.rendering.getState().getColor$zendesk_ui_ui_android(), quickReplyView.rendering.getState().getBackgroundColor$zendesk_ui_ui_android());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addQuickReplyOption$lambda$5$lambda$4$lambda$3(QuickReplyView quickReplyView, String str, String str2) {
        str.getClass();
        str2.getClass();
        Function1<QuickReplyOption, Unit> onOptionClicked$zendesk_ui_ui_android = quickReplyView.rendering.getOnOptionClicked$zendesk_ui_ui_android();
        if (onOptionClicked$zendesk_ui_ui_android != null) {
            onOptionClicked$zendesk_ui_ui_android.invoke(new QuickReplyOption(str, str2));
        }
        int childCount = quickReplyView.chipContainer.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = quickReplyView.chipContainer.getChildAt(i11);
            QuickReplyOptionView quickReplyOptionView = childAt instanceof QuickReplyOptionView ? (QuickReplyOptionView) childAt : null;
            if (quickReplyOptionView != null && !quickReplyOptionView.isSelected() && quickReplyOptionView.getChildCount() > 0) {
                quickReplyOptionView.getChildAt(0).setEnabled(false);
            }
        }
        return Unit.f26487a;
    }

    private final void removeQuickReplies() {
        int childCount = this.chipContainer.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return;
            }
            View childAt = this.chipContainer.getChildAt(childCount);
            if (!Intrinsics.areEqual(childAt, this.chipFlow)) {
                this.chipContainer.removeView(childAt);
            }
        }
    }

    private final void setupQuickReplies() {
        List<QuickReplyOption> quickReplyOptions$zendesk_ui_ui_android = this.rendering.getState().getQuickReplyOptions$zendesk_ui_ui_android();
        int[] iArr = new int[quickReplyOptions$zendesk_ui_ui_android.size()];
        int size = quickReplyOptions$zendesk_ui_ui_android.size();
        for (int i11 = 0; i11 < size; i11++) {
            View viewAddQuickReplyOption = addQuickReplyOption(quickReplyOptions$zendesk_ui_ui_android.get(i11).getId(), quickReplyOptions$zendesk_ui_ui_android.get(i11).getText());
            viewAddQuickReplyOption.setId(View.generateViewId());
            this.chipContainer.addView(viewAddQuickReplyOption);
            iArr[i11] = viewAddQuickReplyOption.getId();
        }
        this.chipFlow.setReferencedIds(iArr);
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super QuickReplyRendering, ? extends QuickReplyRendering> renderingUpdate) {
        renderingUpdate.getClass();
        QuickReplyState state = this.rendering.getState();
        QuickReplyRendering quickReplyRendering = (QuickReplyRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = quickReplyRendering;
        if (Intrinsics.areEqual(state, quickReplyRendering.getState())) {
            return;
        }
        removeQuickReplies();
        setupQuickReplies();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickReplyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickReplyView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ QuickReplyView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickReplyView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
