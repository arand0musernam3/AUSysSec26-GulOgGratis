package zendesk.ui.android.conversation.carousel;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.y1;
import androidx.recyclerview.widget.z0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lzendesk/ui/android/conversation/carousel/CarouselSnapHelper;", "Landroidx/recyclerview/widget/z0;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "<init>", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "Landroidx/recyclerview/widget/y1;", "layoutManager", "Landroid/view/View;", "findSnapView", "(Landroidx/recyclerview/widget/y1;)Landroid/view/View;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CarouselSnapHelper extends z0 {
    public static final int $stable = 8;

    @NotNull
    private final LinearLayoutManager linearLayoutManager;

    public CarouselSnapHelper(@NotNull LinearLayoutManager linearLayoutManager) {
        linearLayoutManager.getClass();
        this.linearLayoutManager = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.v2
    @Nullable
    public View findSnapView(@NotNull y1 layoutManager) {
        layoutManager.getClass();
        if (this.linearLayoutManager.findFirstVisibleItemPosition() == 0 || this.linearLayoutManager.getItemCount() - 1 == this.linearLayoutManager.findLastVisibleItemPosition()) {
            return null;
        }
        if (layoutManager.canScrollVertically()) {
            return z0.b(layoutManager, d(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return z0.b(layoutManager, c(layoutManager));
        }
        return null;
    }
}
