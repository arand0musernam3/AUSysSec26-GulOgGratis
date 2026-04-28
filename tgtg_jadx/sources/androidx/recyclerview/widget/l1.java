package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l1 {
    private final m1 mObservable = new m1();
    private boolean mHasStableIds = false;
    private k1 mStateRestorationPolicy = k1.ALLOW;

    public final void bindViewHolder(@NonNull r2 r2Var, int i11) {
        boolean z11 = r2Var.mBindingAdapter == null;
        if (z11) {
            r2Var.mPosition = i11;
            if (hasStableIds()) {
                r2Var.mItemId = getItemId(i11);
            }
            r2Var.setFlags(1, 519);
            if (d7.g.a()) {
                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(r2Var.mItemViewType)));
            }
        }
        r2Var.mBindingAdapter = this;
        if (RecyclerView.I1) {
            if (r2Var.itemView.getParent() == null && r2Var.itemView.isAttachedToWindow() != r2Var.isTmpDetached()) {
                throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + r2Var.isTmpDetached() + ", attached to window: " + r2Var.itemView.isAttachedToWindow() + ", holder: " + r2Var);
            }
            if (r2Var.itemView.getParent() == null && r2Var.itemView.isAttachedToWindow()) {
                j4.d.e(r2Var, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                return;
            }
        }
        onBindViewHolder(r2Var, i11, r2Var.getUnmodifiedPayloads());
        if (z11) {
            r2Var.clearPayload();
            ViewGroup.LayoutParams layoutParams = r2Var.itemView.getLayoutParams();
            if (layoutParams instanceof RecyclerView.a) {
                ((RecyclerView.a) layoutParams).f3626c = true;
            }
            Trace.endSection();
        }
    }

    public boolean canRestoreState() {
        int iOrdinal = this.mStateRestorationPolicy.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
        } else if (getItemCount() <= 0) {
            return false;
        }
        return true;
    }

    @NonNull
    public final r2 createViewHolder(@NonNull ViewGroup viewGroup, int i11) {
        try {
            if (d7.g.a()) {
                Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i11)));
            }
            r2 r2VarOnCreateViewHolder = onCreateViewHolder(viewGroup, i11);
            if (r2VarOnCreateViewHolder.itemView.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            r2VarOnCreateViewHolder.mItemViewType = i11;
            Trace.endSection();
            return r2VarOnCreateViewHolder;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public int findRelativeAdapterPositionIn(@NonNull l1 l1Var, @NonNull r2 r2Var, int i11) {
        if (l1Var == this) {
            return i11;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i11) {
        return -1L;
    }

    public int getItemViewType(int i11) {
        return 0;
    }

    @NonNull
    public final k1 getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public final boolean hasObservers() {
        return this.mObservable.a();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyDataSetChanged() {
        this.mObservable.b();
    }

    public final void notifyItemChanged(int i11) {
        this.mObservable.d(i11, 1, null);
    }

    public final void notifyItemInserted(int i11) {
        this.mObservable.e(i11, 1);
    }

    public final void notifyItemMoved(int i11, int i12) {
        this.mObservable.c(i11, i12);
    }

    public final void notifyItemRangeChanged(int i11, int i12) {
        this.mObservable.d(i11, i12, null);
    }

    public final void notifyItemRangeInserted(int i11, int i12) {
        this.mObservable.e(i11, i12);
    }

    public final void notifyItemRangeRemoved(int i11, int i12) {
        this.mObservable.f(i11, i12);
    }

    public final void notifyItemRemoved(int i11) {
        this.mObservable.f(i11, 1);
    }

    public abstract void onBindViewHolder(r2 r2Var, int i11);

    public void onBindViewHolder(@NonNull r2 r2Var, int i11, @NonNull List<Object> list) {
        onBindViewHolder(r2Var, i11);
    }

    public abstract r2 onCreateViewHolder(ViewGroup viewGroup, int i11);

    public boolean onFailedToRecycleView(@NonNull r2 r2Var) {
        return false;
    }

    public void registerAdapterDataObserver(@NonNull n1 n1Var) {
        this.mObservable.registerObserver(n1Var);
    }

    public void setHasStableIds(boolean z11) {
        if (hasObservers()) {
            com.braze.h2.b("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            this.mHasStableIds = z11;
        }
    }

    public void setStateRestorationPolicy(@NonNull k1 k1Var) {
        this.mStateRestorationPolicy = k1Var;
        this.mObservable.g();
    }

    public void unregisterAdapterDataObserver(@NonNull n1 n1Var) {
        this.mObservable.unregisterObserver(n1Var);
    }

    public final void notifyItemRangeChanged(int i11, int i12, Object obj) {
        this.mObservable.d(i11, i12, obj);
    }

    public final void notifyItemChanged(int i11, Object obj) {
        this.mObservable.d(i11, 1, obj);
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
    }

    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
    }

    public void onViewAttachedToWindow(@NonNull r2 r2Var) {
    }

    public void onViewDetachedFromWindow(@NonNull r2 r2Var) {
    }

    public void onViewRecycled(@NonNull r2 r2Var) {
    }
}
