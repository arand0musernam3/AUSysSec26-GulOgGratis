package zendesk.ui.android.conversation.carousel;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n2;
import androidx.recyclerview.widget.r2;
import androidx.recyclerview.widget.t1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.ui.android.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lzendesk/ui/android/conversation/carousel/CarouselItemDecoration;", "Landroidx/recyclerview/widget/t1;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/n2;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/n2;)V", "setLayoutDirectionToRTL$zendesk_ui_ui_android", "()V", "setLayoutDirectionToRTL", "Landroid/content/Context;", "", "endMargin", "I", "", "isDefaultLayoutDirection", "Z", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CarouselItemDecoration extends t1 {
    public static final int $stable = 8;

    @NotNull
    private final Context context;
    private int endMargin;
    private boolean isDefaultLayoutDirection;

    public CarouselItemDecoration(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.endMargin = context.getResources().getDimensionPixelSize(R.dimen.zuia_carousel_end_padding);
        this.isDefaultLayoutDirection = true;
    }

    @Override // androidx.recyclerview.widget.t1
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull n2 state) {
        outRect.getClass();
        view.getClass();
        parent.getClass();
        state.getClass();
        if (parent.getAdapter() == null) {
            return;
        }
        r2 r2VarO = RecyclerView.O(view);
        if ((r2VarO != null ? r2VarO.getAbsoluteAdapterPosition() : -1) == r3.getItemCount() - 1) {
            boolean z11 = this.isDefaultLayoutDirection;
            int i11 = this.endMargin;
            if (z11) {
                outRect.right = i11;
            } else {
                outRect.left = i11;
            }
        }
    }

    public final void setLayoutDirectionToRTL$zendesk_ui_ui_android() {
        this.isDefaultLayoutDirection = false;
    }
}
