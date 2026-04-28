package zendesk.ui.android.conversation.carousel;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, d2 = {"Lzendesk/ui/android/conversation/carousel/CarouselLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "Lzendesk/ui/android/conversation/carousel/CarouselRecyclerViewAdapter;", "adapter", "<init>", "(Landroid/content/Context;Lzendesk/ui/android/conversation/carousel/CarouselRecyclerViewAdapter;)V", "Landroidx/recyclerview/widget/RecyclerView$a;", "lp", "", "checkLayoutParams", "(Landroidx/recyclerview/widget/RecyclerView$a;)Z", "canScrollHorizontally", "()Z", "scrollEnabled", "", "setScroll$zendesk_ui_ui_android", "(Z)V", "setScroll", "", "margin", "setItemMargin$zendesk_ui_ui_android", "(I)V", "setItemMargin", "Lzendesk/ui/android/conversation/carousel/CarouselRecyclerViewAdapter;", "getAdapter", "()Lzendesk/ui/android/conversation/carousel/CarouselRecyclerViewAdapter;", "isScrollEnabled", "Z", "I", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CarouselLayoutManager extends LinearLayoutManager {
    public static final int $stable = 8;

    @NotNull
    private final CarouselRecyclerViewAdapter adapter;
    private boolean isScrollEnabled;
    private int margin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselLayoutManager(@NotNull Context context, @NotNull CarouselRecyclerViewAdapter carouselRecyclerViewAdapter) {
        super(context, 0, false);
        context.getClass();
        carouselRecyclerViewAdapter.getClass();
        this.adapter = carouselRecyclerViewAdapter;
        this.isScrollEnabled = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.y1
    /* JADX INFO: renamed from: canScrollHorizontally, reason: from getter */
    public boolean getIsScrollEnabled() {
        return this.isScrollEnabled;
    }

    @Override // androidx.recyclerview.widget.y1
    public boolean checkLayoutParams(@NotNull RecyclerView.a lp2) {
        int bindingAdapterPosition;
        lp2.getClass();
        try {
            bindingAdapterPosition = lp2.f3624a.getBindingAdapterPosition();
        } catch (Exception unused) {
            bindingAdapterPosition = -1;
        }
        if (this.adapter.getItemViewType(bindingAdapterPosition) != CarouselViewType.AVATAR.ordinal()) {
            ((ViewGroup.MarginLayoutParams) lp2).width = getWidth() - this.margin;
            return true;
        }
        ((ViewGroup.MarginLayoutParams) lp2).width = -2;
        return true;
    }

    @NotNull
    public final CarouselRecyclerViewAdapter getAdapter() {
        return this.adapter;
    }

    public final void setItemMargin$zendesk_ui_ui_android(int margin) {
        this.margin = margin;
    }

    public final void setScroll$zendesk_ui_ui_android(boolean scrollEnabled) {
        this.isScrollEnabled = scrollEnabled;
    }
}
