package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y1 {
    boolean mAutoMeasure;
    k mChildHelper;
    private int mHeight;
    private int mHeightMode;
    d3 mHorizontalBoundCheck;
    private final c3 mHorizontalBoundCheckCallback;
    boolean mIsAttachedToWindow;
    private boolean mItemPrefetchEnabled;
    private boolean mMeasurementCacheEnabled;
    int mPrefetchMaxCountObserved;
    boolean mPrefetchMaxObservedInInitialPrefetch;
    RecyclerView mRecyclerView;
    boolean mRequestedSimpleAnimations;
    m2 mSmoothScroller;
    d3 mVerticalBoundCheck;
    private final c3 mVerticalBoundCheckCallback;
    private int mWidth;
    private int mWidthMode;

    public y1() {
        u1 u1Var = new u1(this);
        this.mHorizontalBoundCheckCallback = u1Var;
        v1 v1Var = new v1(this);
        this.mVerticalBoundCheckCallback = v1Var;
        this.mHorizontalBoundCheck = new d3(u1Var);
        this.mVerticalBoundCheck = new d3(v1Var);
        this.mRequestedSimpleAnimations = false;
        this.mIsAttachedToWindow = false;
        this.mAutoMeasure = false;
        this.mMeasurementCacheEnabled = true;
        this.mItemPrefetchEnabled = true;
    }

    public static boolean b(int i11, int i12, int i13) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (i13 > 0 && i11 != i13) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i11;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i11;
        }
        return true;
    }

    public static int chooseSize(int i11, int i12, int i13) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i12, i13) : size : Math.min(size, Math.max(i12, i13));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L1d
            if (r7 < 0) goto L12
        L10:
            r5 = r3
            goto L30
        L12:
            if (r7 != r1) goto L1a
            if (r5 == r2) goto L22
            if (r5 == 0) goto L1a
            if (r5 == r3) goto L22
        L1a:
            r5 = r6
            r7 = r5
            goto L30
        L1d:
            if (r7 < 0) goto L20
            goto L10
        L20:
            if (r7 != r1) goto L24
        L22:
            r7 = r4
            goto L30
        L24:
            if (r7 != r0) goto L1a
            if (r5 == r2) goto L2e
            if (r5 != r3) goto L2b
            goto L2e
        L2b:
            r7 = r4
            r5 = r6
            goto L30
        L2e:
            r7 = r4
            r5 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.y1.getChildMeasureSpec(int, int, int, int, boolean):int");
    }

    public static x1 getProperties(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        x1 x1Var = new x1();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x9.a.f44087a, i11, i12);
        x1Var.f3970a = typedArrayObtainStyledAttributes.getInt(0, 1);
        x1Var.f3971b = typedArrayObtainStyledAttributes.getInt(10, 1);
        x1Var.f3972c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        x1Var.f3973d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return x1Var;
    }

    public final void a(View view, int i11, boolean z11) {
        r2 r2VarO = RecyclerView.O(view);
        if (z11 || r2VarO.isRemoved()) {
            q1.k1 k1Var = (q1.k1) this.mRecyclerView.f3584g.f43083b;
            e3 e3VarA = (e3) k1Var.get(r2VarO);
            if (e3VarA == null) {
                e3VarA = e3.a();
                k1Var.put(r2VarO, e3VarA);
            }
            e3VarA.f3721a |= 1;
        } else {
            this.mRecyclerView.f3584g.C(r2VarO);
        }
        RecyclerView.a aVar = (RecyclerView.a) view.getLayoutParams();
        if (r2VarO.wasReturnedFromScrap() || r2VarO.isScrap()) {
            if (r2VarO.isScrap()) {
                r2VarO.unScrap();
            } else {
                r2VarO.clearReturnedFromScrapFlag();
            }
            this.mChildHelper.b(view, i11, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            k kVar = this.mChildHelper;
            if (parent == recyclerView) {
                int iJ = kVar.j(view);
                if (i11 == -1) {
                    i11 = this.mChildHelper.e();
                }
                if (iJ == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.D());
                }
                if (iJ != i11) {
                    this.mRecyclerView.f3598n.moveView(iJ, i11);
                }
            } else {
                kVar.a(view, i11, false);
                aVar.f3626c = true;
                m2 m2Var = this.mSmoothScroller;
                if (m2Var != null && m2Var.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
        }
        if (aVar.f3627d) {
            if (RecyclerView.J1) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + aVar.f3624a);
            }
            r2VarO.itemView.invalidate();
            aVar.f3627d = false;
        }
    }

    @SuppressLint({"UnknownNullness"})
    public void addDisappearingView(View view) {
        addDisappearingView(view, -1);
    }

    @SuppressLint({"UnknownNullness"})
    public void addView(View view) {
        addView(view, -1);
    }

    public void assertInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || recyclerView.R()) {
            return;
        }
        if (str == null) {
            com.braze.h2.b("Cannot call this method unless RecyclerView is computing a layout or scrolling".concat(recyclerView.D()));
        } else {
            com.braze.h2.b(str.concat(recyclerView.D()));
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.l(str);
        }
    }

    public void attachView(@NonNull View view, int i11, RecyclerView.a aVar) {
        r2 r2VarO = RecyclerView.O(view);
        boolean zIsRemoved = r2VarO.isRemoved();
        RecyclerView recyclerView = this.mRecyclerView;
        if (zIsRemoved) {
            q1.k1 k1Var = (q1.k1) recyclerView.f3584g.f43083b;
            e3 e3VarA = (e3) k1Var.get(r2VarO);
            if (e3VarA == null) {
                e3VarA = e3.a();
                k1Var.put(r2VarO, e3VarA);
            }
            e3VarA.f3721a |= 1;
        } else {
            recyclerView.f3584g.C(r2VarO);
        }
        this.mChildHelper.b(view, i11, aVar, r2VarO.isRemoved());
    }

    public final void c(f2 f2Var, int i11, View view) {
        r2 r2VarO = RecyclerView.O(view);
        if (r2VarO.shouldIgnore()) {
            if (RecyclerView.J1) {
                Log.d("RecyclerView", "ignoring view " + r2VarO);
                return;
            }
            return;
        }
        if (r2VarO.isInvalid() && !r2VarO.isRemoved() && !this.mRecyclerView.f3596m.hasStableIds()) {
            removeViewAt(i11);
            f2Var.j(r2VarO);
        } else {
            detachViewAt(i11);
            f2Var.k(view);
            this.mRecyclerView.f3584g.C(r2VarO);
        }
    }

    public void calculateItemDecorationsForChild(@NonNull View view, @NonNull Rect rect) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.P(view));
        }
    }

    public abstract boolean canScrollHorizontally();

    public abstract boolean canScrollVertically();

    public boolean checkLayoutParams(RecyclerView.a aVar) {
        return aVar != null;
    }

    public abstract int computeHorizontalScrollExtent(n2 n2Var);

    public abstract int computeHorizontalScrollOffset(n2 n2Var);

    public abstract int computeHorizontalScrollRange(n2 n2Var);

    public abstract int computeVerticalScrollExtent(n2 n2Var);

    public abstract int computeVerticalScrollOffset(n2 n2Var);

    public abstract int computeVerticalScrollRange(n2 n2Var);

    public void detachAndScrapAttachedViews(@NonNull f2 f2Var) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            c(f2Var, childCount, getChildAt(childCount));
        }
    }

    public void detachAndScrapView(@NonNull View view, @NonNull f2 f2Var) {
        c(f2Var, this.mChildHelper.j(view), view);
    }

    public void detachAndScrapViewAt(int i11, @NonNull f2 f2Var) {
        c(f2Var, i11, getChildAt(i11));
    }

    public void detachView(@NonNull View view) {
        int iJ = this.mChildHelper.j(view);
        if (iJ >= 0) {
            this.mChildHelper.c(iJ);
        }
    }

    public void detachViewAt(int i11) {
        getChildAt(i11);
        this.mChildHelper.c(i11);
    }

    public void dispatchAttachedToWindow(RecyclerView recyclerView) {
        this.mIsAttachedToWindow = true;
        onAttachedToWindow(recyclerView);
    }

    public void dispatchDetachedFromWindow(RecyclerView recyclerView, f2 f2Var) {
        this.mIsAttachedToWindow = false;
        onDetachedFromWindow(recyclerView, f2Var);
    }

    @SuppressLint({"UnknownNullness"})
    public void endAnimation(View view) {
        s1 s1Var = this.mRecyclerView.M;
        if (s1Var != null) {
            s1Var.d(RecyclerView.O(view));
        }
    }

    public View findContainingItemView(@NonNull View view) {
        View viewF;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (viewF = recyclerView.F(view)) == null || this.mChildHelper.f3795c.contains(viewF)) {
            return null;
        }
        return viewF;
    }

    public View findViewByPosition(int i11) {
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            r2 r2VarO = RecyclerView.O(childAt);
            if (r2VarO != null && r2VarO.getLayoutPosition() == i11 && !r2VarO.shouldIgnore() && (this.mRecyclerView.f3599n1.f3832g || !r2VarO.isRemoved())) {
                return childAt;
            }
        }
        return null;
    }

    public abstract RecyclerView.a generateDefaultLayoutParams();

    @SuppressLint({"UnknownNullness"})
    public RecyclerView.a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof RecyclerView.a ? new RecyclerView.a((RecyclerView.a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new RecyclerView.a((ViewGroup.MarginLayoutParams) layoutParams) : new RecyclerView.a(layoutParams);
    }

    public int getBaseline() {
        return -1;
    }

    public int getBottomDecorationHeight(@NonNull View view) {
        return ((RecyclerView.a) view.getLayoutParams()).f3625b.bottom;
    }

    public View getChildAt(int i11) {
        k kVar = this.mChildHelper;
        if (kVar != null) {
            return kVar.d(i11);
        }
        return null;
    }

    public int getChildCount() {
        k kVar = this.mChildHelper;
        if (kVar != null) {
            return kVar.e();
        }
        return 0;
    }

    public boolean getClipToPadding() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.f3586h;
    }

    public int getColumnCountForAccessibility(@NonNull f2 f2Var, @NonNull n2 n2Var) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || recyclerView.f3596m == null || !canScrollHorizontally()) {
            return 1;
        }
        return this.mRecyclerView.f3596m.getItemCount();
    }

    public int getDecoratedBottom(@NonNull View view) {
        return getBottomDecorationHeight(view) + view.getBottom();
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        boolean z11 = RecyclerView.I1;
        RecyclerView.a aVar = (RecyclerView.a) view.getLayoutParams();
        Rect rect2 = aVar.f3625b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) aVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) aVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) aVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin);
    }

    public int getDecoratedLeft(@NonNull View view) {
        return view.getLeft() - getLeftDecorationWidth(view);
    }

    public int getDecoratedMeasuredHeight(@NonNull View view) {
        Rect rect = ((RecyclerView.a) view.getLayoutParams()).f3625b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public int getDecoratedMeasuredWidth(@NonNull View view) {
        Rect rect = ((RecyclerView.a) view.getLayoutParams()).f3625b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public int getDecoratedRight(@NonNull View view) {
        return getRightDecorationWidth(view) + view.getRight();
    }

    public int getDecoratedTop(@NonNull View view) {
        return view.getTop() - getTopDecorationHeight(view);
    }

    public View getFocusedChild() {
        View focusedChild;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.f3795c.contains(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getHeightMode() {
        return this.mHeightMode;
    }

    public int getItemCount() {
        RecyclerView recyclerView = this.mRecyclerView;
        l1 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    public int getItemViewType(@NonNull View view) {
        return RecyclerView.O(view).getItemViewType();
    }

    public int getLayoutDirection() {
        return this.mRecyclerView.getLayoutDirection();
    }

    public int getLeftDecorationWidth(@NonNull View view) {
        return ((RecyclerView.a) view.getLayoutParams()).f3625b.left;
    }

    public int getMinimumHeight() {
        return ViewCompat.t(this.mRecyclerView);
    }

    public int getMinimumWidth() {
        return ViewCompat.u(this.mRecyclerView);
    }

    public int getPaddingBottom() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public int getPaddingEnd() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return ViewCompat.w(recyclerView);
        }
        return 0;
    }

    public int getPaddingLeft() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int getPaddingRight() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public int getPaddingStart() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return ViewCompat.x(recyclerView);
        }
        return 0;
    }

    public int getPaddingTop() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int getPosition(@NonNull View view) {
        return ((RecyclerView.a) view.getLayoutParams()).f3624a.getLayoutPosition();
    }

    public int getRightDecorationWidth(@NonNull View view) {
        return ((RecyclerView.a) view.getLayoutParams()).f3625b.right;
    }

    public int getRowCountForAccessibility(@NonNull f2 f2Var, @NonNull n2 n2Var) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || recyclerView.f3596m == null || !canScrollVertically()) {
            return 1;
        }
        return this.mRecyclerView.f3596m.getItemCount();
    }

    public int getSelectionModeForAccessibility(@NonNull f2 f2Var, @NonNull n2 n2Var) {
        return 0;
    }

    public int getTopDecorationHeight(@NonNull View view) {
        return ((RecyclerView.a) view.getLayoutParams()).f3625b.top;
    }

    public void getTransformedBoundingBox(@NonNull View view, boolean z11, @NonNull Rect rect) {
        Matrix matrix;
        if (z11) {
            Rect rect2 = ((RecyclerView.a) view.getLayoutParams()).f3625b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.mRecyclerView.l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getWidthMode() {
        return this.mWidthMode;
    }

    public boolean hasFlexibleChildInBothOrientations() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i11).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFocus() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.hasFocus();
    }

    public void ignoreView(@NonNull View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.mRecyclerView;
        if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
            i4.a.f("View should be fully attached to be ignored".concat(this.mRecyclerView.D()));
            return;
        }
        r2 r2VarO = RecyclerView.O(view);
        r2VarO.addFlags(128);
        this.mRecyclerView.f3584g.D(r2VarO);
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttachedToWindow;
    }

    public abstract boolean isAutoMeasureEnabled();

    public boolean isFocused() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.isFocused();
    }

    public final boolean isItemPrefetchEnabled() {
        return this.mItemPrefetchEnabled;
    }

    public boolean isLayoutHierarchical(@NonNull f2 f2Var, @NonNull n2 n2Var) {
        return false;
    }

    public boolean isLayoutReversed() {
        return false;
    }

    public boolean isMeasurementCacheEnabled() {
        return this.mMeasurementCacheEnabled;
    }

    public boolean isSmoothScrolling() {
        m2 m2Var = this.mSmoothScroller;
        return m2Var != null && m2Var.isRunning();
    }

    public boolean isViewPartiallyVisible(@NonNull View view, boolean z11, boolean z12) {
        boolean z13 = this.mHorizontalBoundCheck.b(view) && this.mVerticalBoundCheck.b(view);
        return z11 ? z13 : !z13;
    }

    public void layoutDecorated(@NonNull View view, int i11, int i12, int i13, int i14) {
        Rect rect = ((RecyclerView.a) view.getLayoutParams()).f3625b;
        view.layout(i11 + rect.left, i12 + rect.top, i13 - rect.right, i14 - rect.bottom);
    }

    public void layoutDecoratedWithMargins(@NonNull View view, int i11, int i12, int i13, int i14) {
        RecyclerView.a aVar = (RecyclerView.a) view.getLayoutParams();
        Rect rect = aVar.f3625b;
        view.layout(i11 + rect.left + ((ViewGroup.MarginLayoutParams) aVar).leftMargin, i12 + rect.top + ((ViewGroup.MarginLayoutParams) aVar).topMargin, (i13 - rect.right) - ((ViewGroup.MarginLayoutParams) aVar).rightMargin, (i14 - rect.bottom) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin);
    }

    public void measureChild(@NonNull View view, int i11, int i12) {
        RecyclerView.a aVar = (RecyclerView.a) view.getLayoutParams();
        Rect rectP = this.mRecyclerView.P(view);
        int i13 = rectP.left + rectP.right + i11;
        int i14 = rectP.top + rectP.bottom + i12;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i13, ((ViewGroup.MarginLayoutParams) aVar).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i14, ((ViewGroup.MarginLayoutParams) aVar).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, aVar)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void measureChildWithMargins(@NonNull View view, int i11, int i12) {
        RecyclerView.a aVar = (RecyclerView.a) view.getLayoutParams();
        Rect rectP = this.mRecyclerView.P(view);
        int i13 = rectP.left + rectP.right + i11;
        int i14 = rectP.top + rectP.bottom + i12;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + i13, ((ViewGroup.MarginLayoutParams) aVar).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + i14, ((ViewGroup.MarginLayoutParams) aVar).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, aVar)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void moveView(int i11, int i12) {
        View childAt = getChildAt(i11);
        if (childAt != null) {
            detachViewAt(i11);
            attachView(childAt, i12);
        } else {
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i11 + this.mRecyclerView.toString());
        }
    }

    public void offsetChildrenHorizontal(int i11) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            int iE = recyclerView.f3582f.e();
            for (int i12 = 0; i12 < iE; i12++) {
                recyclerView.f3582f.d(i12).offsetLeftAndRight(i11);
            }
        }
    }

    public void offsetChildrenVertical(int i11) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            int iE = recyclerView.f3582f.e();
            for (int i12 = 0; i12 < iE; i12++) {
                recyclerView.f3582f.d(i12).offsetTopAndBottom(i11);
            }
        }
    }

    public boolean onAddFocusables(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i11, int i12) {
        return false;
    }

    public abstract void onDetachedFromWindow(RecyclerView recyclerView, f2 f2Var);

    public abstract View onFocusSearchFailed(View view, int i11, f2 f2Var, n2 n2Var);

    public void onInitializeAccessibilityEvent(@NonNull f2 f2Var, @NonNull n2 n2Var, @NonNull AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z11 = true;
        if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
            z11 = false;
        }
        accessibilityEvent.setScrollable(z11);
        l1 l1Var = this.mRecyclerView.f3596m;
        if (l1Var != null) {
            accessibilityEvent.setItemCount(l1Var.getItemCount());
        }
    }

    public void onInitializeAccessibilityNodeInfo(f2 f2Var, n2 n2Var, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
            accessibilityNodeInfoCompat.a(8192);
            accessibilityNodeInfoCompat.L0(true);
            accessibilityNodeInfoCompat.u0(true);
        }
        if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
            accessibilityNodeInfoCompat.a(4096);
            accessibilityNodeInfoCompat.L0(true);
            accessibilityNodeInfoCompat.u0(true);
        }
        accessibilityNodeInfoCompat.j0(i7.d.a(getRowCountForAccessibility(f2Var, n2Var), getColumnCountForAccessibility(f2Var, n2Var), getSelectionModeForAccessibility(f2Var, n2Var), isLayoutHierarchical(f2Var, n2Var)));
    }

    public void onInitializeAccessibilityNodeInfoForItem(@NonNull f2 f2Var, @NonNull n2 n2Var, @NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.k0(i7.e.a(canScrollVertically() ? getPosition(view) : 0, 1, canScrollHorizontally() ? getPosition(view) : 0, 1, false, false));
    }

    public View onInterceptFocusSearch(@NonNull View view, int i11) {
        return null;
    }

    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i11, int i12, Object obj) {
        onItemsUpdated(recyclerView, i11, i12);
    }

    public abstract void onLayoutChildren(f2 f2Var, n2 n2Var);

    public abstract void onLayoutCompleted(n2 n2Var);

    public void onMeasure(@NonNull f2 f2Var, @NonNull n2 n2Var, int i11, int i12) {
        this.mRecyclerView.r(i11, i12);
    }

    @Deprecated
    public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull View view, View view2) {
        return isSmoothScrolling() || recyclerView.R();
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public void onSmoothScrollerStopped(m2 m2Var) {
        if (this.mSmoothScroller == m2Var) {
            this.mSmoothScroller = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066 A[PHI: r8
      0x0066: PHI (r8v8 int) = (r8v5 int), (r8v18 int) binds: [B:27:0x0082, B:19:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean performAccessibilityAction(@androidx.annotation.NonNull androidx.recyclerview.widget.f2 r8, @androidx.annotation.NonNull androidx.recyclerview.widget.n2 r9, int r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.y1.performAccessibilityAction(androidx.recyclerview.widget.f2, androidx.recyclerview.widget.n2, int, android.os.Bundle):boolean");
    }

    public boolean performAccessibilityActionForItem(@NonNull View view, int i11, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityActionForItem(recyclerView.f3579c, recyclerView.f3599n1, view, i11, bundle);
    }

    public void postOnAnimation(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            ViewCompat.U(recyclerView, runnable);
        }
    }

    public void removeAllViews() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            this.mChildHelper.k(childCount);
        }
    }

    public void removeAndRecycleAllViews(@NonNull f2 f2Var) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (!RecyclerView.O(getChildAt(childCount)).shouldIgnore()) {
                removeAndRecycleViewAt(childCount, f2Var);
            }
        }
    }

    public void removeAndRecycleScrapInt(f2 f2Var) {
        ArrayList arrayList;
        int size = f2Var.f3731a.size();
        int i11 = size - 1;
        while (true) {
            arrayList = f2Var.f3731a;
            if (i11 < 0) {
                break;
            }
            View view = ((r2) arrayList.get(i11)).itemView;
            r2 r2VarO = RecyclerView.O(view);
            if (!r2VarO.shouldIgnore()) {
                r2VarO.setIsRecyclable(false);
                if (r2VarO.isTmpDetached()) {
                    this.mRecyclerView.removeDetachedView(view, false);
                }
                s1 s1Var = this.mRecyclerView.M;
                if (s1Var != null) {
                    s1Var.d(r2VarO);
                }
                r2VarO.setIsRecyclable(true);
                r2 r2VarO2 = RecyclerView.O(view);
                r2VarO2.mScrapContainer = null;
                r2VarO2.mInChangeScrap = false;
                r2VarO2.clearReturnedFromScrapFlag();
                f2Var.j(r2VarO2);
            }
            i11--;
        }
        arrayList.clear();
        ArrayList arrayList2 = f2Var.f3732b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.mRecyclerView.invalidate();
        }
    }

    public void removeAndRecycleView(@NonNull View view, @NonNull f2 f2Var) {
        removeView(view);
        f2Var.i(view);
    }

    public void removeAndRecycleViewAt(int i11, @NonNull f2 f2Var) {
        View childAt = getChildAt(i11);
        removeViewAt(i11);
        f2Var.i(childAt);
    }

    public boolean removeCallbacks(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.removeCallbacks(runnable);
        }
        return false;
    }

    public void removeDetachedView(@NonNull View view) {
        this.mRecyclerView.removeDetachedView(view, false);
    }

    @SuppressLint({"UnknownNullness"})
    public void removeView(View view) {
        k kVar = this.mChildHelper;
        j1 j1Var = kVar.f3793a;
        int i11 = kVar.f3796d;
        if (i11 == 1) {
            com.braze.h2.b("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i11 == 2) {
            com.braze.h2.b("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            kVar.f3796d = 1;
            kVar.f3797e = view;
            int iIndexOfChild = j1Var.f3791a.indexOfChild(view);
            if (iIndexOfChild < 0) {
                kVar.f3796d = 0;
                kVar.f3797e = null;
                return;
            }
            if (kVar.f3794b.h(iIndexOfChild)) {
                kVar.l(view);
            }
            j1Var.k(iIndexOfChild);
            kVar.f3796d = 0;
            kVar.f3797e = null;
        } catch (Throwable th2) {
            kVar.f3796d = 0;
            kVar.f3797e = null;
            throw th2;
        }
    }

    public void removeViewAt(int i11) {
        if (getChildAt(i11) != null) {
            this.mChildHelper.k(i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean requestChildRectangleOnScreen(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r9, @androidx.annotation.NonNull android.view.View r10, @androidx.annotation.NonNull android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.getPaddingLeft()
            int r1 = r8.getPaddingTop()
            int r2 = r8.getWidth()
            int r3 = r8.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r8.getHeight()
            int r4 = r8.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L60
            if (r2 == 0) goto L5b
            goto L68
        L5b:
            int r2 = java.lang.Math.max(r6, r10)
            goto L68
        L60:
            if (r6 == 0) goto L63
            goto L67
        L63:
            int r6 = java.lang.Math.min(r4, r2)
        L67:
            r2 = r6
        L68:
            if (r1 == 0) goto L6b
            goto L6f
        L6b:
            int r1 = java.lang.Math.min(r5, r11)
        L6f:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb6
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L80
            goto Lbb
        L80:
            int r1 = r8.getPaddingLeft()
            int r2 = r8.getPaddingTop()
            int r3 = r8.getWidth()
            int r4 = r8.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r8.getHeight()
            int r5 = r8.getPaddingBottom()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.mRecyclerView
            android.graphics.Rect r5 = r5.f3591j
            r8.getDecoratedBoundsWithMargins(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lbb
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lbb
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lbb
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lb6
            goto Lbb
        Lb6:
            if (r11 != 0) goto Lbc
            if (r10 == 0) goto Lbb
            goto Lbc
        Lbb:
            return r0
        Lbc:
            if (r12 == 0) goto Lc2
            r9.scrollBy(r11, r10)
            return r7
        Lc2:
            r9.l0(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.y1.requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public void requestLayout() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void requestSimpleAnimationsInNextLayout() {
        this.mRequestedSimpleAnimations = true;
    }

    public abstract int scrollHorizontallyBy(int i11, f2 f2Var, n2 n2Var);

    public abstract void scrollToPosition(int i11);

    public abstract int scrollVerticallyBy(int i11, f2 f2Var, n2 n2Var);

    @Deprecated
    public void setAutoMeasureEnabled(boolean z11) {
        this.mAutoMeasure = z11;
    }

    public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
        setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void setItemPrefetchEnabled(boolean z11) {
        if (z11 != this.mItemPrefetchEnabled) {
            this.mItemPrefetchEnabled = z11;
            this.mPrefetchMaxCountObserved = 0;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.f3579c.n();
            }
        }
    }

    public void setMeasureSpecs(int i11, int i12) {
        this.mWidth = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        this.mWidthMode = mode;
        if (mode == 0 && !RecyclerView.M1) {
            this.mWidth = 0;
        }
        this.mHeight = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i12);
        this.mHeightMode = mode2;
        if (mode2 != 0 || RecyclerView.M1) {
            return;
        }
        this.mHeight = 0;
    }

    public void setMeasuredDimension(Rect rect, int i11, int i12) {
        setMeasuredDimension(chooseSize(i11, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i12, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
    }

    public void setMeasuredDimensionFromChildren(int i11, int i12) {
        int childCount = getChildCount();
        if (childCount == 0) {
            this.mRecyclerView.r(i11, i12);
            return;
        }
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MIN_VALUE;
        int i16 = Integer.MAX_VALUE;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            Rect rect = this.mRecyclerView.f3591j;
            getDecoratedBoundsWithMargins(childAt, rect);
            int i18 = rect.left;
            if (i18 < i16) {
                i16 = i18;
            }
            int i19 = rect.right;
            if (i19 > i13) {
                i13 = i19;
            }
            int i21 = rect.top;
            if (i21 < i14) {
                i14 = i21;
            }
            int i22 = rect.bottom;
            if (i22 > i15) {
                i15 = i22;
            }
        }
        this.mRecyclerView.f3591j.set(i16, i14, i13, i15);
        setMeasuredDimension(this.mRecyclerView.f3591j, i11, i12);
    }

    public void setMeasurementCacheEnabled(boolean z11) {
        this.mMeasurementCacheEnabled = z11;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.mRecyclerView = null;
            this.mChildHelper = null;
            this.mWidth = 0;
            this.mHeight = 0;
        } else {
            this.mRecyclerView = recyclerView;
            this.mChildHelper = recyclerView.f3582f;
            this.mWidth = recyclerView.getWidth();
            this.mHeight = recyclerView.getHeight();
        }
        this.mWidthMode = 1073741824;
        this.mHeightMode = 1073741824;
    }

    public boolean shouldMeasureChild(View view, int i11, int i12, RecyclerView.a aVar) {
        return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && b(view.getWidth(), i11, ((ViewGroup.MarginLayoutParams) aVar).width) && b(view.getHeight(), i12, ((ViewGroup.MarginLayoutParams) aVar).height)) ? false : true;
    }

    public boolean shouldMeasureTwice() {
        return false;
    }

    public boolean shouldReMeasureChild(View view, int i11, int i12, RecyclerView.a aVar) {
        return (this.mMeasurementCacheEnabled && b(view.getMeasuredWidth(), i11, ((ViewGroup.MarginLayoutParams) aVar).width) && b(view.getMeasuredHeight(), i12, ((ViewGroup.MarginLayoutParams) aVar).height)) ? false : true;
    }

    public abstract void smoothScrollToPosition(RecyclerView recyclerView, n2 n2Var, int i11);

    @SuppressLint({"UnknownNullness"})
    public void startSmoothScroll(m2 m2Var) {
        m2 m2Var2 = this.mSmoothScroller;
        if (m2Var2 != null && m2Var != m2Var2 && m2Var2.isRunning()) {
            this.mSmoothScroller.stop();
        }
        this.mSmoothScroller = m2Var;
        m2Var.start(this.mRecyclerView, this);
    }

    public void stopIgnoringView(@NonNull View view) {
        r2 r2VarO = RecyclerView.O(view);
        r2VarO.stopIgnoring();
        r2VarO.resetInternal();
        r2VarO.addFlags(4);
    }

    public void stopSmoothScroller() {
        m2 m2Var = this.mSmoothScroller;
        if (m2Var != null) {
            m2Var.stop();
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i11, int i12) {
    }

    @SuppressLint({"UnknownNullness"})
    public void addDisappearingView(View view, int i11) {
        a(view, i11, true);
    }

    @SuppressLint({"UnknownNullness"})
    public void addView(View view, int i11) {
        a(view, i11, false);
    }

    public boolean performAccessibilityActionForItem(@NonNull f2 f2Var, @NonNull n2 n2Var, @NonNull View view, int i11, Bundle bundle) {
        return false;
    }

    public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull n2 n2Var, @NonNull View view, View view2) {
        return onRequestChildFocus(recyclerView, view, view2);
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
    }

    @Deprecated
    public void onDetachedFromWindow(RecyclerView recyclerView) {
    }

    public void onItemsChanged(@NonNull RecyclerView recyclerView) {
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public void onScrollStateChanged(int i11) {
    }

    @SuppressLint({"UnknownNullness"})
    public RecyclerView.a generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new RecyclerView.a(context, attributeSet);
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        r2 r2VarO = RecyclerView.O(view);
        if (r2VarO == null || r2VarO.isRemoved()) {
            return;
        }
        k kVar = this.mChildHelper;
        if (kVar.f3795c.contains(r2VarO.itemView)) {
            return;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfoForItem(recyclerView.f3579c, recyclerView.f3599n1, view, accessibilityNodeInfoCompat);
    }

    public void collectInitialPrefetchPositions(int i11, w1 w1Var) {
    }

    public void onAdapterChanged(l1 l1Var, l1 l1Var2) {
    }

    public void setMeasuredDimension(int i11, int i12) {
        this.mRecyclerView.setMeasuredDimension(i11, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000c A[PHI: r3
      0x000c: PHI (r3v5 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x0010, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
        /*
            int r1 = r1 - r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L10
            if (r3 < 0) goto Le
        Lc:
            r2 = r0
            goto L1e
        Le:
            r3 = r2
            goto L1e
        L10:
            if (r3 < 0) goto L13
            goto Lc
        L13:
            r4 = -1
            if (r3 != r4) goto L18
            r3 = r1
            goto Lc
        L18:
            r4 = -2
            if (r3 != r4) goto Le
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1
        L1e:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.y1.getChildMeasureSpec(int, int, int, boolean):int");
    }

    public void attachView(@NonNull View view, int i11) {
        attachView(view, i11, (RecyclerView.a) view.getLayoutParams());
    }

    public void attachView(@NonNull View view) {
        attachView(view, -1);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityEvent(recyclerView.f3579c, recyclerView.f3599n1, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfo(recyclerView.f3579c, recyclerView.f3599n1, accessibilityNodeInfoCompat);
    }

    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i11, int i12) {
    }

    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i11, int i12) {
    }

    public void collectAdjacentPrefetchPositions(int i11, int i12, n2 n2Var, w1 w1Var) {
    }

    public void onItemsMoved(@NonNull RecyclerView recyclerView, int i11, int i12, int i13) {
    }

    public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z11) {
        return requestChildRectangleOnScreen(recyclerView, view, rect, z11, false);
    }

    public boolean performAccessibilityAction(int i11, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityAction(recyclerView.f3579c, recyclerView.f3599n1, i11, bundle);
    }
}
