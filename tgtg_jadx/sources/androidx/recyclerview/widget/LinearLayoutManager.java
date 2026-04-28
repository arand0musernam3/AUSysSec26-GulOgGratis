package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends y1 implements o0, l2 {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final t0 mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final u0 mLayoutChunkResult;
    private v0 mLayoutState;
    int mOrientation;
    f1 mOrientationHelper;
    x0 mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new t0();
        this.mLayoutChunkResult = new u0();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        x1 properties = y1.getProperties(context, attributeSet, i11, i12);
        setOrientation(properties.f3970a);
        setReverseLayout(properties.f3972c);
        setStackFromEnd(properties.f3973d);
    }

    @Override // androidx.recyclerview.widget.y1
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(@NonNull n2 n2Var, @NonNull int[] iArr) {
        int i11;
        int extraLayoutSpace = getExtraLayoutSpace(n2Var);
        if (this.mLayoutState.f3949f == -1) {
            i11 = 0;
        } else {
            i11 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i11;
    }

    @Override // androidx.recyclerview.widget.y1
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.y1
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.y1
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i11, int i12, n2 n2Var, w1 w1Var) {
        if (this.mOrientation != 0) {
            i11 = i12;
        }
        if (getChildCount() == 0 || i11 == 0) {
            return;
        }
        ensureLayoutState();
        o(i11 > 0 ? 1 : -1, Math.abs(i11), true, n2Var);
        collectPrefetchPositionsForLayoutState(n2Var, this.mLayoutState, w1Var);
    }

    @Override // androidx.recyclerview.widget.y1
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i11, w1 w1Var) {
        boolean z11;
        int i12;
        x0 x0Var = this.mPendingSavedState;
        if (x0Var == null || (i12 = x0Var.f3967a) < 0) {
            n();
            z11 = this.mShouldReverseLayout;
            i12 = this.mPendingScrollPosition;
            if (i12 == -1) {
                i12 = z11 ? i11 - 1 : 0;
            }
        } else {
            z11 = x0Var.f3969c;
        }
        int i13 = z11 ? -1 : 1;
        for (int i14 = 0; i14 < this.mInitialPrefetchItemCount && i12 >= 0 && i12 < i11; i14++) {
            ((f0) w1Var).a(i12, 0);
            i12 += i13;
        }
    }

    public void collectPrefetchPositionsForLayoutState(n2 n2Var, v0 v0Var, w1 w1Var) {
        int i11 = v0Var.f3947d;
        if (i11 < 0 || i11 >= n2Var.b()) {
            return;
        }
        ((f0) w1Var).a(i11, Math.max(0, v0Var.f3950g));
    }

    @Override // androidx.recyclerview.widget.y1
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(n2 n2Var) {
        return d(n2Var);
    }

    @Override // androidx.recyclerview.widget.y1
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(n2 n2Var) {
        return e(n2Var);
    }

    @Override // androidx.recyclerview.widget.y1
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(n2 n2Var) {
        return f(n2Var);
    }

    @Override // androidx.recyclerview.widget.l2
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i11) {
        if (getChildCount() == 0) {
            return null;
        }
        int i12 = (i11 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i12, 0.0f) : new PointF(0.0f, i12);
    }

    @Override // androidx.recyclerview.widget.y1
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(n2 n2Var) {
        return d(n2Var);
    }

    @Override // androidx.recyclerview.widget.y1
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(n2 n2Var) {
        return e(n2Var);
    }

    @Override // androidx.recyclerview.widget.y1
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(n2 n2Var) {
        return f(n2Var);
    }

    public int convertFocusDirectionToLayoutDirection(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 17 ? i11 != 33 ? i11 != 66 ? (i11 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    public v0 createLayoutState() {
        v0 v0Var = new v0();
        v0Var.f3944a = true;
        v0Var.f3951h = 0;
        v0Var.f3952i = 0;
        v0Var.f3954k = null;
        return v0Var;
    }

    public final int d(n2 n2Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return d.b(n2Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public final int e(n2 n2Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return d.c(n2Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public final int f(n2 n2Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return d.d(n2Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public int fill(f2 f2Var, v0 v0Var, n2 n2Var, boolean z11) {
        int i11;
        int i12 = v0Var.f3946c;
        int i13 = v0Var.f3950g;
        if (i13 != Integer.MIN_VALUE) {
            if (i12 < 0) {
                v0Var.f3950g = i13 + i12;
            }
            l(f2Var, v0Var);
        }
        int i14 = v0Var.f3946c + v0Var.f3951h;
        u0 u0Var = this.mLayoutChunkResult;
        while (true) {
            if ((!v0Var.l && i14 <= 0) || (i11 = v0Var.f3947d) < 0 || i11 >= n2Var.b()) {
                break;
            }
            u0Var.f3930a = 0;
            u0Var.f3931b = false;
            u0Var.f3932c = false;
            u0Var.f3933d = false;
            layoutChunk(f2Var, n2Var, v0Var, u0Var);
            if (!u0Var.f3931b) {
                int i15 = v0Var.f3945b;
                int i16 = u0Var.f3930a;
                v0Var.f3945b = (v0Var.f3949f * i16) + i15;
                if (!u0Var.f3932c || v0Var.f3954k != null || !n2Var.f3832g) {
                    v0Var.f3946c -= i16;
                    i14 -= i16;
                }
                int i17 = v0Var.f3950g;
                if (i17 != Integer.MIN_VALUE) {
                    int i18 = i17 + i16;
                    v0Var.f3950g = i18;
                    int i19 = v0Var.f3946c;
                    if (i19 < 0) {
                        v0Var.f3950g = i18 + i19;
                    }
                    l(f2Var, v0Var);
                }
                if (z11 && u0Var.f3933d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i12 - v0Var.f3946c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z11, boolean z12) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z11, z12) : findOneVisibleChild(getChildCount() - 1, -1, z11, z12);
    }

    public View findFirstVisibleChildClosestToStart(boolean z11, boolean z12) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z11, z12) : findOneVisibleChild(0, getChildCount(), z11, z12);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i11, int i12) {
        int i13;
        int i14;
        ensureLayoutState();
        if (i12 <= i11 && i12 >= i11) {
            return getChildAt(i11);
        }
        if (this.mOrientationHelper.e(getChildAt(i11)) < this.mOrientationHelper.k()) {
            i13 = 16644;
            i14 = 16388;
        } else {
            i13 = 4161;
            i14 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i11, i12, i13, i14) : this.mVerticalBoundCheck.a(i11, i12, i13, i14);
    }

    public View findOneVisibleChild(int i11, int i12, boolean z11, boolean z12) {
        ensureLayoutState();
        int i13 = z11 ? 24579 : 320;
        int i14 = z12 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i11, i12, i13, i14) : this.mVerticalBoundCheck.a(i11, i12, i13, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View findReferenceChild(androidx.recyclerview.widget.f2 r17, androidx.recyclerview.widget.n2 r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.ensureLayoutState()
            int r1 = r0.getChildCount()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.getChildCount()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            androidx.recyclerview.widget.f1 r7 = r0.mOrientationHelper
            int r7 = r7.k()
            androidx.recyclerview.widget.f1 r8 = r0.mOrientationHelper
            int r8 = r8.g()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.getChildAt(r1)
            int r13 = r0.getPosition(r12)
            androidx.recyclerview.widget.f1 r14 = r0.mOrientationHelper
            int r14 = r14.e(r12)
            androidx.recyclerview.widget.f1 r15 = r0.mOrientationHelper
            int r15 = r15.b(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$a r13 = (androidx.recyclerview.widget.RecyclerView.a) r13
            androidx.recyclerview.widget.r2 r13 = r13.f3624a
            boolean r13 = r13.isRemoved()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            return r9
        L7f:
            if (r10 == 0) goto L82
            return r10
        L82:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.findReferenceChild(androidx.recyclerview.widget.f2, androidx.recyclerview.widget.n2, boolean, boolean):android.view.View");
    }

    @Override // androidx.recyclerview.widget.y1
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i11) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i11 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i11) {
                return childAt;
            }
        }
        return super.findViewByPosition(i11);
    }

    public final int g(int i11, f2 f2Var, n2 n2Var, boolean z11) {
        int iG;
        int iG2 = this.mOrientationHelper.g() - i11;
        if (iG2 <= 0) {
            return 0;
        }
        int i12 = -scrollBy(-iG2, f2Var, n2Var);
        int i13 = i11 + i12;
        if (!z11 || (iG = this.mOrientationHelper.g() - i13) <= 0) {
            return i12;
        }
        this.mOrientationHelper.o(iG);
        return iG + i12;
    }

    @Override // androidx.recyclerview.widget.y1
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.a generateDefaultLayoutParams() {
        return new RecyclerView.a(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(n2 n2Var) {
        if (n2Var.f3826a != -1) {
            return this.mOrientationHelper.l();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public final int h(int i11, f2 f2Var, n2 n2Var, boolean z11) {
        int iK;
        int iK2 = i11 - this.mOrientationHelper.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i12 = -scrollBy(iK2, f2Var, n2Var);
        int i13 = i11 + i12;
        if (!z11 || (iK = i13 - this.mOrientationHelper.k()) <= 0) {
            return i12;
        }
        this.mOrientationHelper.o(-iK);
        return i12 - iK;
    }

    public final View i() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    @Override // androidx.recyclerview.widget.y1
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.y1
    public boolean isLayoutReversed() {
        return this.mReverseLayout;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public final View j() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    public final void k() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.e(childAt));
        }
        Log.d(TAG, "==============");
    }

    public final void l(f2 f2Var, v0 v0Var) {
        if (!v0Var.f3944a || v0Var.l) {
            return;
        }
        int i11 = v0Var.f3950g;
        int i12 = v0Var.f3952i;
        if (v0Var.f3949f == -1) {
            int childCount = getChildCount();
            if (i11 < 0) {
                return;
            }
            int iF = (this.mOrientationHelper.f() - i11) + i12;
            if (this.mShouldReverseLayout) {
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (this.mOrientationHelper.e(childAt) < iF || this.mOrientationHelper.n(childAt) < iF) {
                        m(f2Var, 0, i13);
                        return;
                    }
                }
                return;
            }
            int i14 = childCount - 1;
            for (int i15 = i14; i15 >= 0; i15--) {
                View childAt2 = getChildAt(i15);
                if (this.mOrientationHelper.e(childAt2) < iF || this.mOrientationHelper.n(childAt2) < iF) {
                    m(f2Var, i14, i15);
                    return;
                }
            }
            return;
        }
        if (i11 < 0) {
            return;
        }
        int i16 = i11 - i12;
        int childCount2 = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt3 = getChildAt(i17);
                if (this.mOrientationHelper.b(childAt3) > i16 || this.mOrientationHelper.m(childAt3) > i16) {
                    m(f2Var, 0, i17);
                    return;
                }
            }
            return;
        }
        int i18 = childCount2 - 1;
        for (int i19 = i18; i19 >= 0; i19--) {
            View childAt4 = getChildAt(i19);
            if (this.mOrientationHelper.b(childAt4) > i16 || this.mOrientationHelper.m(childAt4) > i16) {
                m(f2Var, i18, i19);
                return;
            }
        }
    }

    public void layoutChunk(f2 f2Var, n2 n2Var, v0 v0Var, u0 u0Var) {
        int i11;
        int i12;
        int paddingLeft;
        int i13;
        int iD;
        View viewB = v0Var.b(f2Var);
        if (viewB == null) {
            u0Var.f3931b = true;
            return;
        }
        RecyclerView.a aVar = (RecyclerView.a) viewB.getLayoutParams();
        List list = v0Var.f3954k;
        boolean z11 = this.mShouldReverseLayout;
        int i14 = v0Var.f3949f;
        if (list == null) {
            if (z11 == (i14 == -1)) {
                addView(viewB);
            } else {
                addView(viewB, 0);
            }
        } else {
            if (z11 == (i14 == -1)) {
                addDisappearingView(viewB);
            } else {
                addDisappearingView(viewB, 0);
            }
        }
        measureChildWithMargins(viewB, 0, 0);
        u0Var.f3930a = this.mOrientationHelper.c(viewB);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iD = getWidth() - getPaddingRight();
                paddingLeft = iD - this.mOrientationHelper.d(viewB);
            } else {
                paddingLeft = getPaddingLeft();
                iD = this.mOrientationHelper.d(viewB) + paddingLeft;
            }
            int i15 = v0Var.f3949f;
            int i16 = v0Var.f3945b;
            int i17 = u0Var.f3930a;
            if (i15 == -1) {
                i13 = i16 - i17;
                i11 = i16;
            } else {
                i11 = i17 + i16;
                i13 = i16;
            }
            i12 = iD;
        } else {
            int paddingTop = getPaddingTop();
            int iD2 = this.mOrientationHelper.d(viewB) + paddingTop;
            int i18 = v0Var.f3949f;
            int i19 = v0Var.f3945b;
            int i21 = u0Var.f3930a;
            if (i18 == -1) {
                int i22 = i19 - i21;
                i12 = i19;
                i11 = iD2;
                paddingLeft = i22;
            } else {
                int i23 = i19 + i21;
                i11 = iD2;
                i12 = i23;
                paddingLeft = i19;
            }
            i13 = paddingTop;
        }
        layoutDecoratedWithMargins(viewB, paddingLeft, i13, i12, i11);
        if (aVar.f3624a.isRemoved() || aVar.f3624a.isUpdated()) {
            u0Var.f3932c = true;
        }
        u0Var.f3933d = viewB.hasFocusable();
    }

    public final void m(f2 f2Var, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        if (i12 <= i11) {
            while (i11 > i12) {
                removeAndRecycleViewAt(i11, f2Var);
                i11--;
            }
        } else {
            for (int i13 = i12 - 1; i13 >= i11; i13--) {
                removeAndRecycleViewAt(i13, f2Var);
            }
        }
    }

    public final void n() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    public final void o(int i11, int i12, boolean z11, n2 n2Var) {
        int iK;
        this.mLayoutState.l = resolveIsInfinite();
        this.mLayoutState.f3949f = i11;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(n2Var, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z12 = i11 == 1;
        v0 v0Var = this.mLayoutState;
        int i13 = z12 ? iMax2 : iMax;
        v0Var.f3951h = i13;
        if (!z12) {
            iMax = iMax2;
        }
        v0Var.f3952i = iMax;
        if (z12) {
            v0Var.f3951h = this.mOrientationHelper.h() + i13;
            View viewI = i();
            v0 v0Var2 = this.mLayoutState;
            v0Var2.f3948e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(viewI);
            v0 v0Var3 = this.mLayoutState;
            v0Var2.f3947d = position + v0Var3.f3948e;
            v0Var3.f3945b = this.mOrientationHelper.b(viewI);
            iK = this.mOrientationHelper.b(viewI) - this.mOrientationHelper.g();
        } else {
            View viewJ = j();
            v0 v0Var4 = this.mLayoutState;
            v0Var4.f3951h = this.mOrientationHelper.k() + v0Var4.f3951h;
            v0 v0Var5 = this.mLayoutState;
            v0Var5.f3948e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(viewJ);
            v0 v0Var6 = this.mLayoutState;
            v0Var5.f3947d = position2 + v0Var6.f3948e;
            v0Var6.f3945b = this.mOrientationHelper.e(viewJ);
            iK = (-this.mOrientationHelper.e(viewJ)) + this.mOrientationHelper.k();
        }
        v0 v0Var7 = this.mLayoutState;
        v0Var7.f3946c = i12;
        if (z11) {
            v0Var7.f3946c = i12 - iK;
        }
        v0Var7.f3950g = iK;
    }

    @Override // androidx.recyclerview.widget.y1
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, f2 f2Var) {
        onDetachedFromWindow(recyclerView);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(f2Var);
            f2Var.f3731a.clear();
            f2Var.g();
        }
    }

    @Override // androidx.recyclerview.widget.y1
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i11, f2 f2Var, n2 n2Var) {
        int iConvertFocusDirectionToLayoutDirection;
        n();
        if (getChildCount() != 0 && (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i11)) != Integer.MIN_VALUE) {
            ensureLayoutState();
            o(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.l() * MAX_SCROLL_FACTOR), false, n2Var);
            v0 v0Var = this.mLayoutState;
            v0Var.f3950g = Integer.MIN_VALUE;
            v0Var.f3944a = false;
            fill(f2Var, v0Var, n2Var, true);
            boolean z11 = this.mShouldReverseLayout;
            View viewFindOnePartiallyOrCompletelyInvisibleChild = iConvertFocusDirectionToLayoutDirection == -1 ? z11 ? findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1) : findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : z11 ? findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
            View viewJ = iConvertFocusDirectionToLayoutDirection == -1 ? j() : i();
            if (!viewJ.hasFocusable()) {
                return viewFindOnePartiallyOrCompletelyInvisibleChild;
            }
            if (viewFindOnePartiallyOrCompletelyInvisibleChild != null) {
                return viewJ;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.y1
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.y1
    public void onInitializeAccessibilityNodeInfo(@NonNull f2 f2Var, @NonNull n2 n2Var, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(f2Var, n2Var, accessibilityNodeInfoCompat);
        l1 l1Var = this.mRecyclerView.f3596m;
        if (l1Var == null || l1Var.getItemCount() <= 0) {
            return;
        }
        accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.B);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ad  */
    @Override // androidx.recyclerview.widget.y1
    @android.annotation.SuppressLint({"UnknownNullness"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayoutChildren(androidx.recyclerview.widget.f2 r17, androidx.recyclerview.widget.n2 r18) {
        /*
            Method dump skipped, instruction units count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.onLayoutChildren(androidx.recyclerview.widget.f2, androidx.recyclerview.widget.n2):void");
    }

    @Override // androidx.recyclerview.widget.y1
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(n2 n2Var) {
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.c();
    }

    @Override // androidx.recyclerview.widget.y1
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof x0) {
            x0 x0Var = (x0) parcelable;
            this.mPendingSavedState = x0Var;
            if (this.mPendingScrollPosition != -1) {
                x0Var.f3967a = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.y1
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        x0 x0Var = this.mPendingSavedState;
        if (x0Var != null) {
            x0 x0Var2 = new x0();
            x0Var2.f3967a = x0Var.f3967a;
            x0Var2.f3968b = x0Var.f3968b;
            x0Var2.f3969c = x0Var.f3969c;
            return x0Var2;
        }
        x0 x0Var3 = new x0();
        if (getChildCount() <= 0) {
            x0Var3.f3967a = -1;
            return x0Var3;
        }
        ensureLayoutState();
        boolean z11 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        x0Var3.f3969c = z11;
        if (z11) {
            View viewI = i();
            x0Var3.f3968b = this.mOrientationHelper.g() - this.mOrientationHelper.b(viewI);
            x0Var3.f3967a = getPosition(viewI);
            return x0Var3;
        }
        View viewJ = j();
        x0Var3.f3967a = getPosition(viewJ);
        x0Var3.f3968b = this.mOrientationHelper.e(viewJ) - this.mOrientationHelper.k();
        return x0Var3;
    }

    public final void p(int i11, int i12) {
        this.mLayoutState.f3946c = this.mOrientationHelper.g() - i12;
        v0 v0Var = this.mLayoutState;
        v0Var.f3948e = this.mShouldReverseLayout ? -1 : 1;
        v0Var.f3947d = i11;
        v0Var.f3949f = 1;
        v0Var.f3945b = i12;
        v0Var.f3950g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.y1
    public boolean performAccessibilityAction(int i11, Bundle bundle) {
        int iMin;
        if (super.performAccessibilityAction(i11, bundle)) {
            return true;
        }
        if (i11 == 16908343 && bundle != null) {
            if (this.mOrientation == 1) {
                int i12 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i12 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.mRecyclerView;
                iMin = Math.min(i12, getRowCountForAccessibility(recyclerView.f3579c, recyclerView.f3599n1) - 1);
            } else {
                int i13 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i13 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.mRecyclerView;
                iMin = Math.min(i13, getColumnCountForAccessibility(recyclerView2.f3579c, recyclerView2.f3599n1) - 1);
            }
            if (iMin >= 0) {
                scrollToPositionWithOffset(iMin, 0);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.o0
    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i11, int i12) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        n();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b8 = position < position2 ? (byte) 1 : (byte) -1;
        boolean z11 = this.mShouldReverseLayout;
        f1 f1Var = this.mOrientationHelper;
        if (z11) {
            if (b8 == 1) {
                scrollToPositionWithOffset(position2, f1Var.g() - (this.mOrientationHelper.c(view) + this.mOrientationHelper.e(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, f1Var.g() - this.mOrientationHelper.b(view2));
                return;
            }
        }
        if (b8 == -1) {
            scrollToPositionWithOffset(position2, f1Var.e(view2));
        } else {
            scrollToPositionWithOffset(position2, f1Var.b(view2) - this.mOrientationHelper.c(view));
        }
    }

    public final void q(int i11, int i12) {
        this.mLayoutState.f3946c = i12 - this.mOrientationHelper.k();
        v0 v0Var = this.mLayoutState;
        v0Var.f3947d = i11;
        v0Var.f3948e = this.mShouldReverseLayout ? 1 : -1;
        v0Var.f3949f = -1;
        v0Var.f3945b = i12;
        v0Var.f3950g = Integer.MIN_VALUE;
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.i() == 0 && this.mOrientationHelper.f() == 0;
    }

    public int scrollBy(int i11, f2 f2Var, n2 n2Var) {
        if (getChildCount() == 0 || i11 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f3944a = true;
        int i12 = i11 > 0 ? 1 : -1;
        int iAbs = Math.abs(i11);
        o(i12, iAbs, true, n2Var);
        v0 v0Var = this.mLayoutState;
        int iFill = fill(f2Var, v0Var, n2Var, false) + v0Var.f3950g;
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i11 = i12 * iFill;
        }
        this.mOrientationHelper.o(-i11);
        this.mLayoutState.f3953j = i11;
        return i11;
    }

    @Override // androidx.recyclerview.widget.y1
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i11, f2 f2Var, n2 n2Var) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i11, f2Var, n2Var);
    }

    @Override // androidx.recyclerview.widget.y1
    public void scrollToPosition(int i11) {
        this.mPendingScrollPosition = i11;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        x0 x0Var = this.mPendingSavedState;
        if (x0Var != null) {
            x0Var.f3967a = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i11, int i12) {
        this.mPendingScrollPosition = i11;
        this.mPendingScrollPositionOffset = i12;
        x0 x0Var = this.mPendingSavedState;
        if (x0Var != null) {
            x0Var.f3967a = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.y1
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i11, f2 f2Var, n2 n2Var) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i11, f2Var, n2Var);
    }

    public void setInitialPrefetchItemCount(int i11) {
        this.mInitialPrefetchItemCount = i11;
    }

    public void setOrientation(int i11) {
        if (i11 != 0 && i11 != 1) {
            i4.a.f(j4.s.f(i11, "invalid orientation:"));
            return;
        }
        assertNotInLayoutOrScroll(null);
        if (i11 != this.mOrientation || this.mOrientationHelper == null) {
            f1 f1VarA = f1.a(this, i11);
            this.mOrientationHelper = f1VarA;
            this.mAnchorInfo.f3920a = f1VarA;
            this.mOrientation = i11;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z11) {
        this.mRecycleChildrenOnDetach = z11;
    }

    public void setReverseLayout(boolean z11) {
        assertNotInLayoutOrScroll(null);
        if (z11 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z11;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z11) {
        this.mSmoothScrollbarEnabled = z11;
    }

    public void setStackFromEnd(boolean z11) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z11) {
            return;
        }
        this.mStackFromEnd = z11;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.y1
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.y1
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, n2 n2Var, int i11) {
        y0 y0Var = new y0(recyclerView.getContext());
        y0Var.setTargetPosition(i11);
        startSmoothScroll(y0Var);
    }

    @Override // androidx.recyclerview.widget.y1
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iE = this.mOrientationHelper.e(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i11 = 1; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                int position2 = getPosition(childAt);
                int iE2 = this.mOrientationHelper.e(childAt);
                if (position2 < position) {
                    k();
                    StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                    sb2.append(iE2 < iE);
                    throw new RuntimeException(sb2.toString());
                }
                if (iE2 > iE) {
                    k();
                    a40.d0.k("detected invalid location");
                    return;
                }
            }
            return;
        }
        for (int i12 = 1; i12 < getChildCount(); i12++) {
            View childAt2 = getChildAt(i12);
            int position3 = getPosition(childAt2);
            int iE3 = this.mOrientationHelper.e(childAt2);
            if (position3 < position) {
                k();
                StringBuilder sb3 = new StringBuilder("detected invalid position. loc invalid? ");
                sb3.append(iE3 < iE);
                throw new RuntimeException(sb3.toString());
            }
            if (iE3 < iE) {
                k();
                a40.d0.k("detected invalid location");
                return;
            }
        }
    }

    public LinearLayoutManager(Context context, int i11, boolean z11) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new t0();
        this.mLayoutChunkResult = new u0();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i11);
        setReverseLayout(z11);
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public void onAnchorReady(f2 f2Var, n2 n2Var, t0 t0Var, int i11) {
    }
}
