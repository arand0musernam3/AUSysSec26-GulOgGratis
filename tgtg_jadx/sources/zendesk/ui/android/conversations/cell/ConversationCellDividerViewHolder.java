package zendesk.ui.android.conversations.cell;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.ui.android.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bR\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lzendesk/ui/android/conversations/cell/ConversationCellDividerViewHolder;", "", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "cellDividerView", "onBind", "", "dividerColor", "", "onBind$zendesk_ui_ui_android", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationCellDividerViewHolder {
    public static final int $stable = 8;

    @NotNull
    private final View cellDividerView;

    public ConversationCellDividerViewHolder(@NotNull View view) {
        view.getClass();
        View viewFindViewById = view.findViewById(R.id.zuia_conversation_divider);
        viewFindViewById.getClass();
        this.cellDividerView = viewFindViewById;
    }

    public final void onBind$zendesk_ui_ui_android(int dividerColor) {
        this.cellDividerView.setBackgroundColor(dividerColor);
    }
}
