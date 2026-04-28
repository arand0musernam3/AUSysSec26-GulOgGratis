package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class y0 extends m2 {
    private static final boolean DEBUG = false;
    private static final float MILLISECONDS_PER_INCH = 25.0f;
    public static final int SNAP_TO_ANY = 0;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_START = -1;
    private static final float TARGET_SEEK_EXTRA_SCROLL_RATIO = 1.2f;
    private static final int TARGET_SEEK_SCROLL_DISTANCE_PX = 10000;
    private final DisplayMetrics mDisplayMetrics;
    private float mMillisPerPixel;

    @SuppressLint({"UnknownNullness"})
    protected PointF mTargetVector;
    protected final LinearInterpolator mLinearInterpolator = new LinearInterpolator();
    protected final DecelerateInterpolator mDecelerateInterpolator = new DecelerateInterpolator();
    private boolean mHasCalculatedMillisPerPixel = false;
    protected int mInterimTargetDx = 0;
    protected int mInterimTargetDy = 0;

    public y0(Context context) {
        this.mDisplayMetrics = context.getResources().getDisplayMetrics();
    }

    public int calculateDtToFit(int i11, int i12, int i13, int i14, int i15) {
        if (i15 == -1) {
            return i13 - i11;
        }
        if (i15 != 0) {
            if (i15 == 1) {
                return i14 - i12;
            }
            i4.a.f("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        int i16 = i13 - i11;
        if (i16 > 0) {
            return i16;
        }
        int i17 = i14 - i12;
        if (i17 < 0) {
            return i17;
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    public int calculateDxToMakeVisible(View view, int i11) {
        y1 layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            return 0;
        }
        RecyclerView.a aVar = (RecyclerView.a) view.getLayoutParams();
        return calculateDtToFit(layoutManager.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) aVar).leftMargin, layoutManager.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) aVar).rightMargin, layoutManager.getPaddingLeft(), layoutManager.getWidth() - layoutManager.getPaddingRight(), i11);
    }

    @SuppressLint({"UnknownNullness"})
    public int calculateDyToMakeVisible(View view, int i11) {
        y1 layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollVertically()) {
            return 0;
        }
        RecyclerView.a aVar = (RecyclerView.a) view.getLayoutParams();
        return calculateDtToFit(layoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) aVar).topMargin, layoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, layoutManager.getPaddingTop(), layoutManager.getHeight() - layoutManager.getPaddingBottom(), i11);
    }

    @SuppressLint({"UnknownNullness"})
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
    }

    public int calculateTimeForDeceleration(int i11) {
        return (int) Math.ceil(((double) calculateTimeForScrolling(i11)) / 0.3356d);
    }

    public int calculateTimeForScrolling(int i11) {
        float fAbs = Math.abs(i11);
        if (!this.mHasCalculatedMillisPerPixel) {
            this.mMillisPerPixel = calculateSpeedPerPixel(this.mDisplayMetrics);
            this.mHasCalculatedMillisPerPixel = true;
        }
        return (int) Math.ceil(fAbs * this.mMillisPerPixel);
    }

    public int getHorizontalSnapPreference() {
        PointF pointF = this.mTargetVector;
        if (pointF == null) {
            return 0;
        }
        float f11 = pointF.x;
        if (f11 == 0.0f) {
            return 0;
        }
        return f11 > 0.0f ? 1 : -1;
    }

    public int getVerticalSnapPreference() {
        PointF pointF = this.mTargetVector;
        if (pointF == null) {
            return 0;
        }
        float f11 = pointF.y;
        if (f11 == 0.0f) {
            return 0;
        }
        return f11 > 0.0f ? 1 : -1;
    }

    @Override // androidx.recyclerview.widget.m2
    @SuppressLint({"UnknownNullness"})
    public void onSeekTargetStep(int i11, int i12, n2 n2Var, k2 k2Var) {
        if (getChildCount() == 0) {
            stop();
            return;
        }
        int i13 = this.mInterimTargetDx;
        int i14 = i13 - i11;
        if (i13 * i14 <= 0) {
            i14 = 0;
        }
        this.mInterimTargetDx = i14;
        int i15 = this.mInterimTargetDy;
        int i16 = i15 - i12;
        int i17 = i15 * i16 > 0 ? i16 : 0;
        this.mInterimTargetDy = i17;
        if (i14 == 0 && i17 == 0) {
            updateActionForInterimTarget(k2Var);
        }
    }

    @Override // androidx.recyclerview.widget.m2
    public void onStop() {
        this.mInterimTargetDy = 0;
        this.mInterimTargetDx = 0;
        this.mTargetVector = null;
    }

    @Override // androidx.recyclerview.widget.m2
    @SuppressLint({"UnknownNullness"})
    public void onTargetFound(View view, n2 n2Var, k2 k2Var) {
        int iCalculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
        int iCalculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((iCalculateDyToMakeVisible * iCalculateDyToMakeVisible) + (iCalculateDxToMakeVisible * iCalculateDxToMakeVisible)));
        if (iCalculateTimeForDeceleration > 0) {
            DecelerateInterpolator decelerateInterpolator = this.mDecelerateInterpolator;
            k2Var.f3802a = -iCalculateDxToMakeVisible;
            k2Var.f3803b = -iCalculateDyToMakeVisible;
            k2Var.f3804c = iCalculateTimeForDeceleration;
            k2Var.f3806e = decelerateInterpolator;
            k2Var.f3807f = true;
        }
    }

    @SuppressLint({"UnknownNullness"})
    public void updateActionForInterimTarget(k2 k2Var) {
        PointF pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(getTargetPosition());
        if (pointFComputeScrollVectorForPosition == null || (pointFComputeScrollVectorForPosition.x == 0.0f && pointFComputeScrollVectorForPosition.y == 0.0f)) {
            k2Var.f3805d = getTargetPosition();
            stop();
            return;
        }
        normalize(pointFComputeScrollVectorForPosition);
        this.mTargetVector = pointFComputeScrollVectorForPosition;
        this.mInterimTargetDx = (int) (pointFComputeScrollVectorForPosition.x * 10000.0f);
        this.mInterimTargetDy = (int) (pointFComputeScrollVectorForPosition.y * 10000.0f);
        int iCalculateTimeForScrolling = calculateTimeForScrolling(TARGET_SEEK_SCROLL_DISTANCE_PX);
        int i11 = (int) (this.mInterimTargetDx * TARGET_SEEK_EXTRA_SCROLL_RATIO);
        int i12 = (int) (this.mInterimTargetDy * TARGET_SEEK_EXTRA_SCROLL_RATIO);
        int i13 = (int) (iCalculateTimeForScrolling * TARGET_SEEK_EXTRA_SCROLL_RATIO);
        LinearInterpolator linearInterpolator = this.mLinearInterpolator;
        k2Var.f3802a = i11;
        k2Var.f3803b = i12;
        k2Var.f3804c = i13;
        k2Var.f3806e = linearInterpolator;
        k2Var.f3807f = true;
    }

    @Override // androidx.recyclerview.widget.m2
    public void onStart() {
    }
}
