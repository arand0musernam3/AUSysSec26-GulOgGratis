package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.app.tgtg.model.local.AppConstants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set l = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, Integer.valueOf(AppConstants.RESULT_CODE_ORDER_COLLECTED))));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f3566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View[] f3567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseIntArray f3568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseIntArray f3569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w2.z f3570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f3571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3574k;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.f3564a = false;
        this.f3565b = -1;
        this.f3568e = new SparseIntArray();
        this.f3569f = new SparseIntArray();
        this.f3570g = new w2.z(8);
        this.f3571h = new Rect();
        this.f3572i = -1;
        this.f3573j = -1;
        this.f3574k = -1;
        C(y1.getProperties(context, attributeSet, i11, i12).f3971b);
    }

    public final int A(int i11, f2 f2Var, n2 n2Var) {
        boolean z11 = n2Var.f3832g;
        w2.z zVar = this.f3570g;
        if (!z11) {
            zVar.getClass();
            return 1;
        }
        int i12 = this.f3568e.get(i11, -1);
        if (i12 != -1) {
            return i12;
        }
        if (f2Var.b(i11) != -1) {
            zVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i11);
        return 1;
    }

    public final void B(View view, int i11, boolean z11) {
        int childMeasureSpec;
        int childMeasureSpec2;
        a aVar = (a) view.getLayoutParams();
        Rect rect = aVar.f3625b;
        int i12 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
        int i13 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
        int iX = x(aVar.f3575e, aVar.f3576f);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = y1.getChildMeasureSpec(iX, i11, i13, ((ViewGroup.MarginLayoutParams) aVar).width, false);
            childMeasureSpec = y1.getChildMeasureSpec(this.mOrientationHelper.l(), getHeightMode(), i12, ((ViewGroup.MarginLayoutParams) aVar).height, true);
        } else {
            int childMeasureSpec3 = y1.getChildMeasureSpec(iX, i11, i12, ((ViewGroup.MarginLayoutParams) aVar).height, false);
            int childMeasureSpec4 = y1.getChildMeasureSpec(this.mOrientationHelper.l(), getWidthMode(), i13, ((ViewGroup.MarginLayoutParams) aVar).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        RecyclerView.a aVar2 = (RecyclerView.a) view.getLayoutParams();
        if (z11 ? shouldReMeasureChild(view, childMeasureSpec2, childMeasureSpec, aVar2) : shouldMeasureChild(view, childMeasureSpec2, childMeasureSpec, aVar2)) {
            view.measure(childMeasureSpec2, childMeasureSpec);
        }
    }

    public final void C(int i11) {
        if (i11 == this.f3565b) {
            return;
        }
        this.f3564a = true;
        if (i11 < 1) {
            i4.a.f(j4.s.f(i11, "Span count should be at least 1. Provided "));
            return;
        }
        this.f3565b = i11;
        this.f3570g.w();
        requestLayout();
    }

    public final void D() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        r(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.y1
    public final boolean checkLayoutParams(RecyclerView.a aVar) {
        return aVar instanceof a;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(n2 n2Var, v0 v0Var, w1 w1Var) {
        int i11;
        int i12 = this.f3565b;
        for (int i13 = 0; i13 < this.f3565b && (i11 = v0Var.f3947d) >= 0 && i11 < n2Var.b() && i12 > 0; i13++) {
            ((f0) w1Var).a(v0Var.f3947d, Math.max(0, v0Var.f3950g));
            this.f3570g.getClass();
            i12--;
            v0Var.f3947d += v0Var.f3948e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(f2 f2Var, n2 n2Var, boolean z11, boolean z12) {
        int i11;
        int childCount;
        int childCount2 = getChildCount();
        int i12 = 1;
        if (z12) {
            childCount = getChildCount() - 1;
            i11 = -1;
            i12 = -1;
        } else {
            i11 = childCount2;
            childCount = 0;
        }
        int iB = n2Var.b();
        ensureLayoutState();
        int iK = this.mOrientationHelper.k();
        int iG = this.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        while (childCount != i11) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iB && z(position, f2Var, n2Var) == 0) {
                if (((RecyclerView.a) childAt.getLayoutParams()).f3624a.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.e(childAt) < iG && this.mOrientationHelper.b(childAt) >= iK) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i12;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.y1
    public final RecyclerView.a generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new a(-2, -1) : new a(-1, -2);
    }

    @Override // androidx.recyclerview.widget.y1
    public final RecyclerView.a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            a aVar = new a((ViewGroup.MarginLayoutParams) layoutParams);
            aVar.f3575e = -1;
            aVar.f3576f = 0;
            return aVar;
        }
        a aVar2 = new a(layoutParams);
        aVar2.f3575e = -1;
        aVar2.f3576f = 0;
        return aVar2;
    }

    @Override // androidx.recyclerview.widget.y1
    public final int getColumnCountForAccessibility(f2 f2Var, n2 n2Var) {
        if (this.mOrientation == 1) {
            return Math.min(this.f3565b, getItemCount());
        }
        if (n2Var.b() < 1) {
            return 0;
        }
        return y(n2Var.b() - 1, f2Var, n2Var) + 1;
    }

    @Override // androidx.recyclerview.widget.y1
    public final int getRowCountForAccessibility(f2 f2Var, n2 n2Var) {
        if (this.mOrientation == 0) {
            return Math.min(this.f3565b, getItemCount());
        }
        if (n2Var.b() < 1) {
            return 0;
        }
        return y(n2Var.b() - 1, f2Var, n2Var) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x023d  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void layoutChunk(androidx.recyclerview.widget.f2 r18, androidx.recyclerview.widget.n2 r19, androidx.recyclerview.widget.v0 r20, androidx.recyclerview.widget.u0 r21) {
        /*
            Method dump skipped, instruction units count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.layoutChunk(androidx.recyclerview.widget.f2, androidx.recyclerview.widget.n2, androidx.recyclerview.widget.v0, androidx.recyclerview.widget.u0):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(f2 f2Var, n2 n2Var, t0 t0Var, int i11) {
        super.onAnchorReady(f2Var, n2Var, t0Var, i11);
        D();
        if (n2Var.b() > 0 && !n2Var.f3832g) {
            boolean z11 = i11 == 1;
            int iZ = z(t0Var.f3921b, f2Var, n2Var);
            if (z11) {
                while (iZ > 0) {
                    int i12 = t0Var.f3921b;
                    if (i12 <= 0) {
                        break;
                    }
                    int i13 = i12 - 1;
                    t0Var.f3921b = i13;
                    iZ = z(i13, f2Var, n2Var);
                }
            } else {
                int iB = n2Var.b() - 1;
                int i14 = t0Var.f3921b;
                while (i14 < iB) {
                    int i15 = i14 + 1;
                    int iZ2 = z(i15, f2Var, n2Var);
                    if (iZ2 <= iZ) {
                        break;
                    }
                    i14 = i15;
                    iZ = iZ2;
                }
                t0Var.f3921b = i14;
            }
        }
        s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0110  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.f2 r26, androidx.recyclerview.widget.n2 r27) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.f2, androidx.recyclerview.widget.n2):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.y1
    public final void onInitializeAccessibilityNodeInfo(f2 f2Var, n2 n2Var, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(f2Var, n2Var, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.h0(GridView.class.getName());
        l1 l1Var = this.mRecyclerView.f3596m;
        if (l1Var == null || l1Var.getItemCount() <= 1) {
            return;
        }
        accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.V);
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onInitializeAccessibilityNodeInfoForItem(f2 f2Var, n2 n2Var, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof a)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        a aVar = (a) layoutParams;
        int iY = y(aVar.f3624a.getLayoutPosition(), f2Var, n2Var);
        int i11 = this.mOrientation;
        int i12 = aVar.f3575e;
        if (i11 == 0) {
            accessibilityNodeInfoCompat.k0(i7.e.a(i12, aVar.f3576f, iY, 1, false, false));
        } else {
            accessibilityNodeInfoCompat.k0(i7.e.a(iY, 1, i12, aVar.f3576f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onItemsAdded(RecyclerView recyclerView, int i11, int i12) {
        w2.z zVar = this.f3570g;
        zVar.w();
        ((SparseIntArray) zVar.f43084c).clear();
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onItemsChanged(RecyclerView recyclerView) {
        w2.z zVar = this.f3570g;
        zVar.w();
        ((SparseIntArray) zVar.f43084c).clear();
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onItemsMoved(RecyclerView recyclerView, int i11, int i12, int i13) {
        w2.z zVar = this.f3570g;
        zVar.w();
        ((SparseIntArray) zVar.f43084c).clear();
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onItemsRemoved(RecyclerView recyclerView, int i11, int i12) {
        w2.z zVar = this.f3570g;
        zVar.w();
        ((SparseIntArray) zVar.f43084c).clear();
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onItemsUpdated(RecyclerView recyclerView, int i11, int i12, Object obj) {
        w2.z zVar = this.f3570g;
        zVar.w();
        ((SparseIntArray) zVar.f43084c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.y1
    public final void onLayoutChildren(f2 f2Var, n2 n2Var) {
        boolean z11 = n2Var.f3832g;
        SparseIntArray sparseIntArray = this.f3569f;
        SparseIntArray sparseIntArray2 = this.f3568e;
        if (z11) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                a aVar = (a) getChildAt(i11).getLayoutParams();
                int layoutPosition = aVar.f3624a.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, aVar.f3576f);
                sparseIntArray.put(layoutPosition, aVar.f3575e);
            }
        }
        super.onLayoutChildren(f2Var, n2Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.y1
    public final void onLayoutCompleted(n2 n2Var) {
        View viewFindViewByPosition;
        super.onLayoutCompleted(n2Var);
        this.f3564a = false;
        int i11 = this.f3572i;
        if (i11 == -1 || (viewFindViewByPosition = findViewByPosition(i11)) == null) {
            return;
        }
        viewFindViewByPosition.sendAccessibilityEvent(67108864);
        this.f3572i = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a9 A[EDGE_INSN: B:206:0x01a9->B:122:0x01a9 BREAK  A[LOOP:2: B:126:0x01b9->B:135:0x01e2, LOOP_LABEL: LOOP:2: B:126:0x01b9->B:135:0x01e2], EDGE_INSN: B:213:0x01a9->B:122:0x01a9 BREAK  A[LOOP:5: B:148:0x0221->B:159:0x0251, LOOP_LABEL: LOOP:5: B:148:0x0221->B:159:0x0251]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x027e  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performAccessibilityAction(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    public final void r(int i11) {
        int i12;
        int[] iArr = this.f3566c;
        int i13 = this.f3565b;
        if (iArr == null || iArr.length != i13 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i13 + 1];
        }
        int i14 = 0;
        iArr[0] = 0;
        int i15 = i11 / i13;
        int i16 = i11 % i13;
        int i17 = 0;
        for (int i18 = 1; i18 <= i13; i18++) {
            i14 += i16;
            if (i14 <= 0 || i13 - i14 >= i16) {
                i12 = i15;
            } else {
                i12 = i15 + 1;
                i14 -= i13;
            }
            i17 += i12;
            iArr[i18] = i17;
        }
        this.f3566c = iArr;
    }

    public final void s() {
        View[] viewArr = this.f3567d;
        if (viewArr == null || viewArr.length != this.f3565b) {
            this.f3567d = new View[this.f3565b];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.y1
    public final int scrollHorizontallyBy(int i11, f2 f2Var, n2 n2Var) {
        D();
        s();
        return super.scrollHorizontallyBy(i11, f2Var, n2Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.y1
    public final int scrollVerticallyBy(int i11, f2 f2Var, n2 n2Var) {
        D();
        s();
        return super.scrollVerticallyBy(i11, f2Var, n2Var);
    }

    @Override // androidx.recyclerview.widget.y1
    public final void setMeasuredDimension(Rect rect, int i11, int i12) {
        int iChooseSize;
        int iChooseSize2;
        if (this.f3566c == null) {
            super.setMeasuredDimension(rect, i11, i12);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            iChooseSize2 = y1.chooseSize(i12, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f3566c;
            iChooseSize = y1.chooseSize(i11, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = y1.chooseSize(i11, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f3566c;
            iChooseSize2 = y1.chooseSize(i12, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z11) {
        if (z11) {
            com.braze.h2.a("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.setStackFromEnd(false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.y1
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f3564a;
    }

    public final int t(int i11) {
        int i12 = this.mOrientation;
        RecyclerView recyclerView = this.mRecyclerView;
        return i12 == 0 ? y(i11, recyclerView.f3579c, recyclerView.f3599n1) : z(i11, recyclerView.f3579c, recyclerView.f3599n1);
    }

    public final int u(int i11) {
        int i12 = this.mOrientation;
        RecyclerView recyclerView = this.mRecyclerView;
        return i12 == 1 ? y(i11, recyclerView.f3579c, recyclerView.f3599n1) : z(i11, recyclerView.f3579c, recyclerView.f3599n1);
    }

    public final HashSet v(int i11) {
        return w(u(i11), i11);
    }

    public final HashSet w(int i11, int i12) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.mRecyclerView;
        int iA = A(i12, recyclerView.f3579c, recyclerView.f3599n1);
        for (int i13 = i11; i13 < i11 + iA; i13++) {
            hashSet.add(Integer.valueOf(i13));
        }
        return hashSet;
    }

    public final int x(int i11, int i12) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f3566c;
            return iArr[i12 + i11] - iArr[i11];
        }
        int[] iArr2 = this.f3566c;
        int i13 = this.f3565b;
        return iArr2[i13 - i11] - iArr2[(i13 - i11) - i12];
    }

    public final int y(int i11, f2 f2Var, n2 n2Var) {
        boolean z11 = n2Var.f3832g;
        w2.z zVar = this.f3570g;
        if (!z11) {
            int i12 = this.f3565b;
            zVar.getClass();
            return w2.z.s(i11, i12);
        }
        int iB = f2Var.b(i11);
        if (iB != -1) {
            int i13 = this.f3565b;
            zVar.getClass();
            return w2.z.s(iB, i13);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i11);
        return 0;
    }

    public final int z(int i11, f2 f2Var, n2 n2Var) {
        boolean z11 = n2Var.f3832g;
        w2.z zVar = this.f3570g;
        if (!z11) {
            int i12 = this.f3565b;
            zVar.getClass();
            return i11 % i12;
        }
        int i13 = this.f3569f.get(i11, -1);
        if (i13 != -1) {
            return i13;
        }
        int iB = f2Var.b(i11);
        if (iB != -1) {
            int i14 = this.f3565b;
            zVar.getClass();
            return iB % i14;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i11);
        return 0;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class a extends RecyclerView.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3575e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3576f;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3575e = -1;
            this.f3576f = 0;
        }

        public a(int i11, int i12) {
            super(i11, i12);
            this.f3575e = -1;
            this.f3576f = 0;
        }
    }

    @Override // androidx.recyclerview.widget.y1
    public final RecyclerView.a generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    public GridLayoutManager(Context context, int i11, int i12) {
        super(context, i12, false);
        this.f3564a = false;
        this.f3565b = -1;
        this.f3568e = new SparseIntArray();
        this.f3569f = new SparseIntArray();
        this.f3570g = new w2.z(8);
        this.f3571h = new Rect();
        this.f3572i = -1;
        this.f3573j = -1;
        this.f3574k = -1;
        C(i11);
    }
}
