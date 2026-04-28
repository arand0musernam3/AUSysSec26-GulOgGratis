package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class h1 extends v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e1 f3761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d1 f3762b;

    public static int a(View view, f1 f1Var) {
        return ((f1Var.c(view) / 2) + f1Var.e(view)) - ((f1Var.l() / 2) + f1Var.k());
    }

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

    public final f1 c(y1 y1Var) {
        d1 d1Var = this.f3762b;
        if (d1Var == null || d1Var.f3728a != y1Var) {
            this.f3762b = new d1(y1Var);
        }
        return this.f3762b;
    }

    @Override // androidx.recyclerview.widget.v2
    public final int[] calculateDistanceToFinalSnap(y1 y1Var, View view) {
        int[] iArr = new int[2];
        if (y1Var.getIsScrollEnabled()) {
            iArr[0] = a(view, c(y1Var));
        } else {
            iArr[0] = 0;
        }
        if (y1Var.canScrollVertically()) {
            iArr[1] = a(view, d(y1Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.v2
    public final m2 createScroller(y1 y1Var) {
        if (y1Var instanceof l2) {
            return new g1(this, this.mRecyclerView.getContext(), 0);
        }
        return null;
    }

    public final f1 d(y1 y1Var) {
        e1 e1Var = this.f3761a;
        if (e1Var == null || e1Var.f3728a != y1Var) {
            this.f3761a = new e1(y1Var);
        }
        return this.f3761a;
    }

    @Override // androidx.recyclerview.widget.v2
    public View findSnapView(y1 y1Var) {
        if (y1Var.canScrollVertically()) {
            return b(y1Var, d(y1Var));
        }
        if (y1Var.getIsScrollEnabled()) {
            return b(y1Var, c(y1Var));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.v2
    public final int findTargetSnapPosition(y1 y1Var, int i11, int i12) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = y1Var.getItemCount();
        if (itemCount != 0) {
            View view = null;
            f1 f1VarD = y1Var.canScrollVertically() ? d(y1Var) : y1Var.getIsScrollEnabled() ? c(y1Var) : null;
            if (f1VarD != null) {
                int childCount = y1Var.getChildCount();
                boolean z11 = false;
                int i13 = Integer.MAX_VALUE;
                int i14 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = y1Var.getChildAt(i15);
                    if (childAt != null) {
                        int iA = a(childAt, f1VarD);
                        if (iA <= 0 && iA > i14) {
                            view2 = childAt;
                            i14 = iA;
                        }
                        if (iA >= 0 && iA < i13) {
                            view = childAt;
                            i13 = iA;
                        }
                    }
                }
                boolean z12 = !y1Var.getIsScrollEnabled() ? i12 <= 0 : i11 <= 0;
                if (z12 && view != null) {
                    return y1Var.getPosition(view);
                }
                if (!z12 && view2 != null) {
                    return y1Var.getPosition(view2);
                }
                if (z12) {
                    view = view2;
                }
                if (view != null) {
                    int position = y1Var.getPosition(view);
                    int itemCount2 = y1Var.getItemCount();
                    if ((y1Var instanceof l2) && (pointFComputeScrollVectorForPosition = ((l2) y1Var).computeScrollVectorForPosition(itemCount2 - 1)) != null && (pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f)) {
                        z11 = true;
                    }
                    int i16 = position + (z11 == z12 ? -1 : 1);
                    if (i16 >= 0 && i16 < itemCount) {
                        return i16;
                    }
                }
            }
        }
        return -1;
    }
}
