package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v2 f3746b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(v2 v2Var, Context context, int i11) {
        super(context);
        this.f3745a = i11;
        this.f3746b = v2Var;
    }

    @Override // androidx.recyclerview.widget.y0
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        int i11;
        switch (this.f3745a) {
            case 0:
                i11 = displayMetrics.densityDpi;
                break;
            default:
                i11 = displayMetrics.densityDpi;
                break;
        }
        return 100.0f / i11;
    }

    @Override // androidx.recyclerview.widget.y0
    public int calculateTimeForScrolling(int i11) {
        switch (this.f3745a) {
            case 0:
                return Math.min(100, super.calculateTimeForScrolling(i11));
            default:
                return super.calculateTimeForScrolling(i11);
        }
    }

    @Override // androidx.recyclerview.widget.y0, androidx.recyclerview.widget.m2
    public final void onTargetFound(View view, n2 n2Var, k2 k2Var) {
        switch (this.f3745a) {
            case 0:
                h1 h1Var = (h1) this.f3746b;
                int[] iArrCalculateDistanceToFinalSnap = h1Var.calculateDistanceToFinalSnap(h1Var.mRecyclerView.getLayoutManager(), view);
                int i11 = iArrCalculateDistanceToFinalSnap[0];
                int i12 = iArrCalculateDistanceToFinalSnap[1];
                int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i11), Math.abs(i12)));
                if (iCalculateTimeForDeceleration > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.mDecelerateInterpolator;
                    k2Var.f3802a = i11;
                    k2Var.f3803b = i12;
                    k2Var.f3804c = iCalculateTimeForDeceleration;
                    k2Var.f3806e = decelerateInterpolator;
                    k2Var.f3807f = true;
                }
                break;
            default:
                v2 v2Var = this.f3746b;
                RecyclerView recyclerView = v2Var.mRecyclerView;
                if (recyclerView != null) {
                    int[] iArrCalculateDistanceToFinalSnap2 = v2Var.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
                    int i13 = iArrCalculateDistanceToFinalSnap2[0];
                    int i14 = iArrCalculateDistanceToFinalSnap2[1];
                    int iCalculateTimeForDeceleration2 = calculateTimeForDeceleration(Math.max(Math.abs(i13), Math.abs(i14)));
                    if (iCalculateTimeForDeceleration2 > 0) {
                        DecelerateInterpolator decelerateInterpolator2 = this.mDecelerateInterpolator;
                        k2Var.f3802a = i13;
                        k2Var.f3803b = i14;
                        k2Var.f3804c = iCalculateTimeForDeceleration2;
                        k2Var.f3806e = decelerateInterpolator2;
                        k2Var.f3807f = true;
                    }
                    break;
                }
                break;
        }
    }
}
