package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r2 {
    static final int FLAG_ADAPTER_FULLUPDATE = 1024;
    static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
    static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
    static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
    static final int FLAG_BOUND = 1;
    static final int FLAG_IGNORE = 128;
    static final int FLAG_INVALID = 4;
    static final int FLAG_MOVED = 2048;
    static final int FLAG_NOT_RECYCLABLE = 16;
    static final int FLAG_REMOVED = 8;
    static final int FLAG_RETURNED_FROM_SCRAP = 32;
    static final int FLAG_TMP_DETACHED = 256;
    static final int FLAG_UPDATE = 2;
    private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
    static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

    @NonNull
    public final View itemView;
    l1 mBindingAdapter;
    int mFlags;
    WeakReference<RecyclerView> mNestedRecyclerView;
    RecyclerView mOwnerRecyclerView;
    int mPosition = -1;
    int mOldPosition = -1;
    long mItemId = -1;
    int mItemViewType = -1;
    int mPreLayoutPosition = -1;
    r2 mShadowedHolder = null;
    r2 mShadowingHolder = null;
    List<Object> mPayloads = null;
    List<Object> mUnmodifiedPayloads = null;
    private int mIsRecyclableCount = 0;
    f2 mScrapContainer = null;
    boolean mInChangeScrap = false;
    private int mWasImportantForAccessibilityBeforeHidden = 0;
    int mPendingAccessibilityState = -1;

    public r2(View view) {
        if (view != null) {
            this.itemView = view;
        } else {
            i4.a.f("itemView may not be null");
            throw null;
        }
    }

    public void addChangePayload(Object obj) {
        if (obj == null) {
            addFlags(1024);
            return;
        }
        if ((1024 & this.mFlags) == 0) {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
            this.mPayloads.add(obj);
        }
    }

    public void addFlags(int i11) {
        this.mFlags = i11 | this.mFlags;
    }

    public void clearOldPosition() {
        this.mOldPosition = -1;
        this.mPreLayoutPosition = -1;
    }

    public void clearPayload() {
        List<Object> list = this.mPayloads;
        if (list != null) {
            list.clear();
        }
        this.mFlags &= -1025;
    }

    public void clearReturnedFromScrapFlag() {
        this.mFlags &= -33;
    }

    public void clearTmpDetachFlag() {
        this.mFlags &= -257;
    }

    public boolean doesTransientStatePreventRecycling() {
        return (this.mFlags & 16) == 0 && ViewCompat.F(this.itemView);
    }

    public void flagRemovedAndOffsetPosition(int i11, int i12, boolean z11) {
        addFlags(8);
        offsetPosition(i12, z11);
        this.mPosition = i11;
    }

    public final int getAbsoluteAdapterPosition() {
        RecyclerView recyclerView = this.mOwnerRecyclerView;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.L(this);
    }

    @Deprecated
    public final int getAdapterPosition() {
        return getBindingAdapterPosition();
    }

    public final l1 getBindingAdapter() {
        return this.mBindingAdapter;
    }

    public final int getBindingAdapterPosition() {
        RecyclerView recyclerView;
        l1 adapter;
        int iL;
        if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (iL = this.mOwnerRecyclerView.L(this)) == -1) {
            return -1;
        }
        return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, iL);
    }

    public final long getItemId() {
        return this.mItemId;
    }

    public final int getItemViewType() {
        return this.mItemViewType;
    }

    public final int getLayoutPosition() {
        int i11 = this.mPreLayoutPosition;
        return i11 == -1 ? this.mPosition : i11;
    }

    public final int getOldPosition() {
        return this.mOldPosition;
    }

    @Deprecated
    public final int getPosition() {
        int i11 = this.mPreLayoutPosition;
        return i11 == -1 ? this.mPosition : i11;
    }

    public List<Object> getUnmodifiedPayloads() {
        if ((this.mFlags & 1024) != 0) {
            return FULLUPDATE_PAYLOADS;
        }
        List<Object> list = this.mPayloads;
        return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
    }

    public boolean hasAnyOfTheFlags(int i11) {
        return (i11 & this.mFlags) != 0;
    }

    public boolean isAdapterPositionUnknown() {
        return (this.mFlags & 512) != 0 || isInvalid();
    }

    public boolean isAttachedToTransitionOverlay() {
        return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
    }

    public boolean isBound() {
        return (this.mFlags & 1) != 0;
    }

    public boolean isInvalid() {
        return (this.mFlags & 4) != 0;
    }

    public final boolean isRecyclable() {
        return (this.mFlags & 16) == 0 && !ViewCompat.F(this.itemView);
    }

    public boolean isRemoved() {
        return (this.mFlags & 8) != 0;
    }

    public boolean isScrap() {
        return this.mScrapContainer != null;
    }

    public boolean isTmpDetached() {
        return (this.mFlags & 256) != 0;
    }

    public boolean isUpdated() {
        return (this.mFlags & 2) != 0;
    }

    public boolean needsUpdate() {
        return (this.mFlags & 2) != 0;
    }

    public void offsetPosition(int i11, boolean z11) {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
        if (this.mPreLayoutPosition == -1) {
            this.mPreLayoutPosition = this.mPosition;
        }
        if (z11) {
            this.mPreLayoutPosition += i11;
        }
        this.mPosition += i11;
        if (this.itemView.getLayoutParams() != null) {
            ((RecyclerView.a) this.itemView.getLayoutParams()).f3626c = true;
        }
    }

    public void onEnteredHiddenState(RecyclerView recyclerView) {
        int i11 = this.mPendingAccessibilityState;
        if (i11 != -1) {
            this.mWasImportantForAccessibilityBeforeHidden = i11;
        } else {
            this.mWasImportantForAccessibilityBeforeHidden = this.itemView.getImportantForAccessibility();
        }
        if (!recyclerView.R()) {
            this.itemView.setImportantForAccessibility(4);
        } else {
            this.mPendingAccessibilityState = 4;
            recyclerView.A1.add(this);
        }
    }

    public void onLeftHiddenState(RecyclerView recyclerView) {
        int i11 = this.mWasImportantForAccessibilityBeforeHidden;
        if (recyclerView.R()) {
            this.mPendingAccessibilityState = i11;
            recyclerView.A1.add(this);
        } else {
            this.itemView.setImportantForAccessibility(i11);
        }
        this.mWasImportantForAccessibilityBeforeHidden = 0;
    }

    public void resetInternal() {
        if (RecyclerView.I1 && isTmpDetached()) {
            a40.d0.q("Attempting to reset temp-detached ViewHolder: ", this, ". ViewHolders should be fully detached before resetting.");
            return;
        }
        this.mFlags = 0;
        this.mPosition = -1;
        this.mOldPosition = -1;
        this.mItemId = -1L;
        this.mPreLayoutPosition = -1;
        this.mIsRecyclableCount = 0;
        this.mShadowedHolder = null;
        this.mShadowingHolder = null;
        clearPayload();
        this.mWasImportantForAccessibilityBeforeHidden = 0;
        this.mPendingAccessibilityState = -1;
        RecyclerView.m(this);
    }

    public void saveOldPosition() {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
    }

    public void setFlags(int i11, int i12) {
        this.mFlags = (i11 & i12) | (this.mFlags & (~i12));
    }

    public final void setIsRecyclable(boolean z11) {
        int i11 = this.mIsRecyclableCount;
        int i12 = z11 ? i11 - 1 : i11 + 1;
        this.mIsRecyclableCount = i12;
        if (i12 < 0) {
            this.mIsRecyclableCount = 0;
            if (RecyclerView.I1) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z11 && i12 == 1) {
            this.mFlags |= 16;
        } else if (z11 && i12 == 0) {
            this.mFlags &= -17;
        }
        if (RecyclerView.J1) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z11 + ":" + this);
        }
    }

    public void setScrapContainer(f2 f2Var, boolean z11) {
        this.mScrapContainer = f2Var;
        this.mInChangeScrap = z11;
    }

    public boolean shouldBeKeptAsChild() {
        return (this.mFlags & 16) != 0;
    }

    public boolean shouldIgnore() {
        return (this.mFlags & 128) != 0;
    }

    public void stopIgnoring() {
        this.mFlags &= -129;
    }

    public String toString() {
        StringBuilder sbR = e0.f.r(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        sbR.append(Integer.toHexString(hashCode()));
        sbR.append(" position=");
        sbR.append(this.mPosition);
        sbR.append(" id=");
        sbR.append(this.mItemId);
        sbR.append(", oldPos=");
        sbR.append(this.mOldPosition);
        sbR.append(", pLpos:");
        sbR.append(this.mPreLayoutPosition);
        StringBuilder sb2 = new StringBuilder(sbR.toString());
        if (isScrap()) {
            sb2.append(" scrap ");
            sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
        }
        if (isInvalid()) {
            sb2.append(" invalid");
        }
        if (!isBound()) {
            sb2.append(" unbound");
        }
        if (needsUpdate()) {
            sb2.append(" update");
        }
        if (isRemoved()) {
            sb2.append(" removed");
        }
        if (shouldIgnore()) {
            sb2.append(" ignored");
        }
        if (isTmpDetached()) {
            sb2.append(" tmpDetached");
        }
        if (!isRecyclable()) {
            sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
        }
        if (isAdapterPositionUnknown()) {
            sb2.append(" undefined adapter position");
        }
        if (this.itemView.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }

    public void unScrap() {
        this.mScrapContainer.m(this);
    }

    public boolean wasReturnedFromScrap() {
        return (this.mFlags & 32) != 0;
    }
}
