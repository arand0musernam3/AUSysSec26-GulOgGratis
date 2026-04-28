package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z0 extends v2 {
    private static final float INVALID_DISTANCE = 1.0f;
    private f1 mHorizontalHelper;
    private f1 mVerticalHelper;

    public static View b(y1 y1Var, f1 f1Var) {
        int childCount = y1Var.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iL = (f1Var.l() / 2) + f1Var.k();
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = y1Var.getChildAt(i12);
            int iAbs = Math.abs(((f1Var.c(childAt) / 2) + f1Var.e(childAt)) - iL);
            if (iAbs < i11) {
                view = childAt;
                i11 = iAbs;
            }
        }
        return view;
    }

    public final int a(y1 y1Var, f1 f1Var, int i11, int i12) {
        int[] iArrCalculateScrollDistance = calculateScrollDistance(i11, i12);
        int childCount = y1Var.getChildCount();
        float f11 = INVALID_DISTANCE;
        if (childCount != 0) {
            View view = null;
            int i13 = Integer.MIN_VALUE;
            int i14 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = y1Var.getChildAt(i15);
                int position = y1Var.getPosition(childAt);
                if (position != -1) {
                    if (position < i14) {
                        view = childAt;
                        i14 = position;
                    }
                    if (position > i13) {
                        view2 = childAt;
                        i13 = position;
                    }
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(f1Var.b(view), f1Var.b(view2)) - Math.min(f1Var.e(view), f1Var.e(view2));
                if (iMax != 0) {
                    f11 = (iMax * INVALID_DISTANCE) / ((i13 - i14) + 1);
                }
            }
        }
        if (f11 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArrCalculateScrollDistance[0]) > Math.abs(iArrCalculateScrollDistance[1]) ? iArrCalculateScrollDistance[0] : iArrCalculateScrollDistance[1]) / f11);
    }

    public final f1 c(y1 y1Var) {
        f1 f1Var = this.mHorizontalHelper;
        if (f1Var == null || f1Var.f3728a != y1Var) {
            this.mHorizontalHelper = new d1(y1Var);
        }
        return this.mHorizontalHelper;
    }

    @Override // androidx.recyclerview.widget.v2
    public int[] calculateDistanceToFinalSnap(@NonNull y1 y1Var, @NonNull View view) {
        int[] iArr = new int[2];
        if (y1Var.canScrollHorizontally()) {
            f1 f1VarC = c(y1Var);
            iArr[0] = ((f1VarC.c(view) / 2) + f1VarC.e(view)) - ((f1VarC.l() / 2) + f1VarC.k());
        } else {
            iArr[0] = 0;
        }
        if (!y1Var.canScrollVertically()) {
            iArr[1] = 0;
            return iArr;
        }
        f1 f1VarD = d(y1Var);
        iArr[1] = ((f1VarD.c(view) / 2) + f1VarD.e(view)) - ((f1VarD.l() / 2) + f1VarD.k());
        return iArr;
    }

    public final f1 d(y1 y1Var) {
        f1 f1Var = this.mVerticalHelper;
        if (f1Var == null || f1Var.f3728a != y1Var) {
            this.mVerticalHelper = new e1(y1Var);
        }
        return this.mVerticalHelper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.v2
    public int findTargetSnapPosition(y1 y1Var, int i11, int i12) {
        int itemCount;
        View viewFindSnapView;
        int position;
        int i13;
        PointF pointFComputeScrollVectorForPosition;
        int iA;
        int iA2;
        if ((y1Var instanceof l2) && (itemCount = y1Var.getItemCount()) != 0 && (viewFindSnapView = findSnapView(y1Var)) != null && (position = y1Var.getPosition(viewFindSnapView)) != -1 && (pointFComputeScrollVectorForPosition = ((l2) y1Var).computeScrollVectorForPosition(itemCount - 1)) != null) {
            if (y1Var.canScrollHorizontally()) {
                iA = a(y1Var, c(y1Var), i11, 0);
                if (pointFComputeScrollVectorForPosition.x < 0.0f) {
                    iA = -iA;
                }
            } else {
                iA = 0;
            }
            if (y1Var.canScrollVertically()) {
                iA2 = a(y1Var, d(y1Var), 0, i12);
                if (pointFComputeScrollVectorForPosition.y < 0.0f) {
                    iA2 = -iA2;
                }
            } else {
                iA2 = 0;
            }
            if (y1Var.canScrollVertically()) {
                iA = iA2;
            }
            if (iA != 0) {
                int i14 = position + iA;
                int i15 = i14 >= 0 ? i14 : 0;
                return i15 >= itemCount ? i13 : i15;
            }
        }
        return -1;
    }
}
