package com.braze.ui.contentcards.recycler;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m0;
import androidx.recyclerview.widget.r2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/braze/ui/contentcards/recycler/SimpleItemTouchHelperCallback;", "Landroidx/recyclerview/widget/m0;", "Lcom/braze/ui/contentcards/recycler/ItemTouchHelperAdapter;", "adapter", "<init>", "(Lcom/braze/ui/contentcards/recycler/ItemTouchHelperAdapter;)V", "", "isLongPressDragEnabled", "()Z", "isItemViewSwipeEnabled", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/r2;", "viewHolder", "", "getMovementFlags", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/r2;)I", "target", "onMove", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/r2;Landroidx/recyclerview/widget/r2;)Z", "direction", "", "onSwiped", "(Landroidx/recyclerview/widget/r2;I)V", "Lcom/braze/ui/contentcards/recycler/ItemTouchHelperAdapter;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class SimpleItemTouchHelperCallback extends m0 {

    @NotNull
    private final ItemTouchHelperAdapter adapter;

    public SimpleItemTouchHelperCallback(@NotNull ItemTouchHelperAdapter itemTouchHelperAdapter) {
        itemTouchHelperAdapter.getClass();
        this.adapter = itemTouchHelperAdapter;
    }

    @Override // androidx.recyclerview.widget.m0
    public int getMovementFlags(@NotNull RecyclerView recyclerView, @NotNull r2 viewHolder) {
        recyclerView.getClass();
        viewHolder.getClass();
        return m0.makeMovementFlags(0, this.adapter.isItemDismissable(viewHolder.getBindingAdapterPosition()) ? 16 : 0);
    }

    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    public boolean isLongPressDragEnabled() {
        return false;
    }

    public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull r2 viewHolder, @NotNull r2 target) {
        recyclerView.getClass();
        viewHolder.getClass();
        target.getClass();
        return false;
    }

    public void onSwiped(@NotNull r2 viewHolder, int direction) {
        viewHolder.getClass();
        this.adapter.onItemDismiss(viewHolder.getBindingAdapterPosition());
    }
}
