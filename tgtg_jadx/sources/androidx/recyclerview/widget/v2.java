package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v2 extends a2 {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final c2 mScrollListener = new u2(this);

    public void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            c2 c2Var = this.mScrollListener;
            ArrayList arrayList = recyclerView2.f3603p1;
            if (arrayList != null) {
                arrayList.remove(c2Var);
            }
            this.mRecyclerView.setOnFlingListener(null);
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                com.braze.h2.b("An instance of OnFlingListener already set.");
                return;
            }
            this.mRecyclerView.k(this.mScrollListener);
            this.mRecyclerView.setOnFlingListener(this);
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    public abstract int[] calculateDistanceToFinalSnap(y1 y1Var, View view);

    @SuppressLint({"UnknownNullness"})
    public int[] calculateScrollDistance(int i11, int i12) {
        this.mGravityScroller.fling(0, 0, i11, i12, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    public m2 createScroller(@NonNull y1 y1Var) {
        return createSnapScroller(y1Var);
    }

    @Deprecated
    public y0 createSnapScroller(@NonNull y1 y1Var) {
        if (y1Var instanceof l2) {
            return new g1(this, this.mRecyclerView.getContext(), 1);
        }
        return null;
    }

    public abstract View findSnapView(y1 y1Var);

    public abstract int findTargetSnapPosition(y1 y1Var, int i11, int i12);

    @Override // androidx.recyclerview.widget.a2
    public boolean onFling(int i11, int i12) {
        m2 m2VarCreateScroller;
        int iFindTargetSnapPosition;
        y1 layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        if ((Math.abs(i12) <= minFlingVelocity && Math.abs(i11) <= minFlingVelocity) || !(layoutManager instanceof l2) || (m2VarCreateScroller = createScroller(layoutManager)) == null || (iFindTargetSnapPosition = findTargetSnapPosition(layoutManager, i11, i12)) == -1) {
            return false;
        }
        m2VarCreateScroller.setTargetPosition(iFindTargetSnapPosition);
        layoutManager.startSmoothScroll(m2VarCreateScroller);
        return true;
    }

    public void snapToTargetExistingView() {
        y1 layoutManager;
        View viewFindSnapView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewFindSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        int i11 = iArrCalculateDistanceToFinalSnap[0];
        if (i11 == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.l0(i11, iArrCalculateDistanceToFinalSnap[1], false);
    }
}
