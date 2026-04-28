package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m2 {
    private y1 mLayoutManager;
    private boolean mPendingInitialRun;
    private RecyclerView mRecyclerView;
    private final k2 mRecyclingAction;
    private boolean mRunning;
    private boolean mStarted;
    private int mTargetPosition = -1;
    private View mTargetView;

    public m2() {
        k2 k2Var = new k2();
        k2Var.f3805d = -1;
        k2Var.f3807f = false;
        k2Var.f3808g = 0;
        k2Var.f3802a = 0;
        k2Var.f3803b = 0;
        k2Var.f3804c = Integer.MIN_VALUE;
        k2Var.f3806e = null;
        this.mRecyclingAction = k2Var;
    }

    public PointF computeScrollVectorForPosition(int i11) {
        Object layoutManager = getLayoutManager();
        if (layoutManager instanceof l2) {
            return ((l2) layoutManager).computeScrollVectorForPosition(i11);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + l2.class.getCanonicalName());
        return null;
    }

    public View findViewByPosition(int i11) {
        return this.mRecyclerView.f3598n.findViewByPosition(i11);
    }

    public int getChildCount() {
        return this.mRecyclerView.f3598n.getChildCount();
    }

    public int getChildPosition(View view) {
        this.mRecyclerView.getClass();
        r2 r2VarO = RecyclerView.O(view);
        if (r2VarO != null) {
            return r2VarO.getLayoutPosition();
        }
        return -1;
    }

    public y1 getLayoutManager() {
        return this.mLayoutManager;
    }

    public int getTargetPosition() {
        return this.mTargetPosition;
    }

    @Deprecated
    public void instantScrollToPosition(int i11) {
        this.mRecyclerView.j0(i11);
    }

    public boolean isPendingInitialRun() {
        return this.mPendingInitialRun;
    }

    public boolean isRunning() {
        return this.mRunning;
    }

    public void normalize(@NonNull PointF pointF) {
        float f11 = pointF.x;
        float f12 = pointF.y;
        float fSqrt = (float) Math.sqrt((f12 * f12) + (f11 * f11));
        pointF.x /= fSqrt;
        pointF.y /= fSqrt;
    }

    public void onAnimation(int i11, int i12) {
        PointF pointFComputeScrollVectorForPosition;
        RecyclerView recyclerView = this.mRecyclerView;
        if (this.mTargetPosition == -1 || recyclerView == null) {
            stop();
        }
        if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
            float f11 = pointFComputeScrollVectorForPosition.x;
            if (f11 != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                recyclerView.i0((int) Math.signum(f11), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
            }
        }
        this.mPendingInitialRun = false;
        View view = this.mTargetView;
        if (view != null) {
            if (getChildPosition(view) == this.mTargetPosition) {
                onTargetFound(this.mTargetView, recyclerView.f3599n1, this.mRecyclingAction);
                this.mRecyclingAction.a(recyclerView);
                stop();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.mTargetView = null;
            }
        }
        if (this.mRunning) {
            onSeekTargetStep(i11, i12, recyclerView.f3599n1, this.mRecyclingAction);
            k2 k2Var = this.mRecyclingAction;
            boolean z11 = k2Var.f3805d >= 0;
            k2Var.a(recyclerView);
            if (z11 && this.mRunning) {
                this.mPendingInitialRun = true;
                recyclerView.f3594k1.b();
            }
        }
    }

    public void onChildAttachedToWindow(View view) {
        if (getChildPosition(view) == getTargetPosition()) {
            this.mTargetView = view;
            if (RecyclerView.J1) {
                Log.d("RecyclerView", "smooth scroll target view has been attached");
            }
        }
    }

    public abstract void onSeekTargetStep(int i11, int i12, n2 n2Var, k2 k2Var);

    public abstract void onStart();

    public abstract void onStop();

    public abstract void onTargetFound(View view, n2 n2Var, k2 k2Var);

    public void setTargetPosition(int i11) {
        this.mTargetPosition = i11;
    }

    public void start(RecyclerView recyclerView, y1 y1Var) {
        q2 q2Var = recyclerView.f3594k1;
        q2Var.f3886g.removeCallbacks(q2Var);
        q2Var.f3882c.abortAnimation();
        if (this.mStarted) {
            Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        this.mRecyclerView = recyclerView;
        this.mLayoutManager = y1Var;
        int i11 = this.mTargetPosition;
        if (i11 == -1) {
            i4.a.f("Invalid target position");
            return;
        }
        recyclerView.f3599n1.f3826a = i11;
        this.mRunning = true;
        this.mPendingInitialRun = true;
        this.mTargetView = findViewByPosition(getTargetPosition());
        onStart();
        this.mRecyclerView.f3594k1.b();
        this.mStarted = true;
    }

    public final void stop() {
        if (this.mRunning) {
            this.mRunning = false;
            onStop();
            this.mRecyclerView.f3599n1.f3826a = -1;
            this.mTargetView = null;
            this.mTargetPosition = -1;
            this.mPendingInitialRun = false;
            this.mLayoutManager.onSmoothScrollerStopped(this);
            this.mLayoutManager = null;
            this.mRecyclerView = null;
        }
    }
}
