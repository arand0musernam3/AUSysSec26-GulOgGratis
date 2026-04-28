package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.app.tgtg.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
    public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
    public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
    private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
    static final int RELATIVE_DIR_FLAGS = 3158064;
    private static final Interpolator sDragScrollInterpolator = new l0(0);
    private static final Interpolator sDragViewScrollCapInterpolator = new l0(1);
    private int mCachedMaxScrollSpeed = -1;

    public static int convertToRelativeDirection(int i11, int i12) {
        int i13;
        int i14 = i11 & ABS_HORIZONTAL_DIR_FLAGS;
        if (i14 == 0) {
            return i11;
        }
        int i15 = i11 & (~i14);
        if (i12 == 0) {
            i13 = i14 << 2;
        } else {
            int i16 = i14 << 1;
            i15 |= (-789517) & i16;
            i13 = (i16 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
        }
        return i15 | i13;
    }

    @NonNull
    public static q0 getDefaultUIUtil() {
        return r0.f3899a;
    }

    public static int makeFlag(int i11, int i12) {
        return i12 << (i11 * 8);
    }

    public static int makeMovementFlags(int i11, int i12) {
        return makeFlag(2, i11) | makeFlag(1, i12) | makeFlag(0, i12 | i11);
    }

    public boolean canDropOver(@NonNull RecyclerView recyclerView, @NonNull r2 r2Var, @NonNull r2 r2Var2) {
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public r2 chooseDropTarget(@NonNull r2 r2Var, @NonNull List<r2> list, int i11, int i12) {
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int width = r2Var.itemView.getWidth() + i11;
        int height = r2Var.itemView.getHeight() + i12;
        int left2 = i11 - r2Var.itemView.getLeft();
        int top2 = i12 - r2Var.itemView.getTop();
        int size = list.size();
        r2 r2Var2 = null;
        int i13 = -1;
        for (int i14 = 0; i14 < size; i14++) {
            r2 r2Var3 = list.get(i14);
            if (left2 > 0 && (right = r2Var3.itemView.getRight() - width) < 0 && r2Var3.itemView.getRight() > r2Var.itemView.getRight() && (iAbs4 = Math.abs(right)) > i13) {
                r2Var2 = r2Var3;
                i13 = iAbs4;
            }
            if (left2 < 0 && (left = r2Var3.itemView.getLeft() - i11) > 0 && r2Var3.itemView.getLeft() < r2Var.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i13) {
                r2Var2 = r2Var3;
                i13 = iAbs3;
            }
            if (top2 < 0 && (top = r2Var3.itemView.getTop() - i12) > 0 && r2Var3.itemView.getTop() < r2Var.itemView.getTop() && (iAbs2 = Math.abs(top)) > i13) {
                r2Var2 = r2Var3;
                i13 = iAbs2;
            }
            if (top2 > 0 && (bottom = r2Var3.itemView.getBottom() - height) < 0 && r2Var3.itemView.getBottom() > r2Var.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i13) {
                r2Var2 = r2Var3;
                i13 = iAbs;
            }
        }
        return r2Var2;
    }

    public void clearView(@NonNull RecyclerView recyclerView, @NonNull r2 r2Var) {
        View view = r2Var.itemView;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            ViewCompat.h0(view, ((Float) tag).floatValue());
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public int convertToAbsoluteDirection(int i11, int i12) {
        int i13;
        int i14 = i11 & RELATIVE_DIR_FLAGS;
        if (i14 == 0) {
            return i11;
        }
        int i15 = i11 & (~i14);
        if (i12 == 0) {
            i13 = i14 >> 2;
        } else {
            int i16 = i14 >> 1;
            i15 |= (-3158065) & i16;
            i13 = (i16 & RELATIVE_DIR_FLAGS) >> 2;
        }
        return i15 | i13;
    }

    public final int getAbsoluteMovementFlags(RecyclerView recyclerView, r2 r2Var) {
        return convertToAbsoluteDirection(getMovementFlags(recyclerView, r2Var), recyclerView.getLayoutDirection());
    }

    public long getAnimationDuration(@NonNull RecyclerView recyclerView, int i11, float f11, float f12) {
        s1 itemAnimator = recyclerView.getItemAnimator();
        return itemAnimator == null ? i11 == 8 ? 200L : 250L : i11 == 8 ? itemAnimator.f3916e : itemAnimator.f3915d;
    }

    public int getBoundingBoxMargin() {
        return 0;
    }

    public float getMoveThreshold(@NonNull r2 r2Var) {
        return 0.5f;
    }

    public abstract int getMovementFlags(RecyclerView recyclerView, r2 r2Var);

    public float getSwipeThreshold(@NonNull r2 r2Var) {
        return 0.5f;
    }

    public boolean hasDragFlag(RecyclerView recyclerView, r2 r2Var) {
        return (getAbsoluteMovementFlags(recyclerView, r2Var) & 16711680) != 0;
    }

    public boolean hasSwipeFlag(RecyclerView recyclerView, r2 r2Var) {
        return (getAbsoluteMovementFlags(recyclerView, r2Var) & 65280) != 0;
    }

    public int interpolateOutOfBoundsScroll(@NonNull RecyclerView recyclerView, int i11, int i12, int i13, long j9) {
        if (this.mCachedMaxScrollSpeed == -1) {
            this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        int interpolation = (int) (sDragScrollInterpolator.getInterpolation(j9 <= 2000 ? j9 / 2000.0f : 1.0f) * ((int) (sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i12) * 1.0f) / i11)) * ((int) Math.signum(i12)) * this.mCachedMaxScrollSpeed)));
        return interpolation == 0 ? i12 > 0 ? 1 : -1 : interpolation;
    }

    public void onChildDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull r2 r2Var, float f11, float f12, int i11, boolean z11) {
        View view = r2Var.itemView;
        if (z11 && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            Float fValueOf = Float.valueOf(ViewCompat.o(view));
            int childCount = recyclerView.getChildCount();
            float f13 = 0.0f;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = recyclerView.getChildAt(i12);
                if (childAt != view) {
                    float fO = ViewCompat.o(childAt);
                    if (fO > f13) {
                        f13 = fO;
                    }
                }
            }
            ViewCompat.h0(view, f13 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f11);
        view.setTranslationY(f12);
    }

    public void onChildDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @SuppressLint({"UnknownNullness"}) r2 r2Var, float f11, float f12, int i11, boolean z11) {
        View view = r2Var.itemView;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, r2 r2Var, List<j0> list, int i11, float f11, float f12) {
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            j0 j0Var = list.get(i12);
            r2 r2Var2 = j0Var.f3780e;
            float f13 = j0Var.f3776a;
            float f14 = j0Var.f3778c;
            if (f13 == f14) {
                j0Var.f3784i = r2Var2.itemView.getTranslationX();
            } else {
                j0Var.f3784i = j4.s.a(f14, f13, j0Var.f3787m, f13);
            }
            float f15 = j0Var.f3777b;
            float f16 = j0Var.f3779d;
            if (f15 == f16) {
                j0Var.f3785j = r2Var2.itemView.getTranslationY();
            } else {
                j0Var.f3785j = j4.s.a(f16, f15, j0Var.f3787m, f15);
            }
            int iSave = canvas.save();
            onChildDraw(canvas, recyclerView, j0Var.f3780e, j0Var.f3784i, j0Var.f3785j, j0Var.f3781f, false);
            canvas.restoreToCount(iSave);
        }
        if (r2Var != null) {
            int iSave2 = canvas.save();
            onChildDraw(canvas, recyclerView, r2Var, f11, f12, i11, true);
            canvas.restoreToCount(iSave2);
        }
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, r2 r2Var, List<j0> list, int i11, float f11, float f12) {
        int size = list.size();
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            j0 j0Var = list.get(i12);
            int iSave = canvas.save();
            onChildDrawOver(canvas, recyclerView, j0Var.f3780e, j0Var.f3784i, j0Var.f3785j, j0Var.f3781f, false);
            canvas.restoreToCount(iSave);
        }
        if (r2Var != null) {
            int iSave2 = canvas.save();
            onChildDrawOver(canvas, recyclerView, r2Var, f11, f12, i11, true);
            canvas.restoreToCount(iSave2);
        }
        for (int i13 = size - 1; i13 >= 0; i13--) {
            j0 j0Var2 = list.get(i13);
            boolean z12 = j0Var2.l;
            if (z12 && !j0Var2.f3783h) {
                list.remove(i13);
            } else if (!z12) {
                z11 = true;
            }
        }
        if (z11) {
            recyclerView.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMoved(@NonNull RecyclerView recyclerView, @NonNull r2 r2Var, int i11, @NonNull r2 r2Var2, int i12, int i13, int i14) {
        y1 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof o0) {
            ((o0) layoutManager).prepareForDrop(r2Var.itemView, r2Var2.itemView, i13, i14);
            return;
        }
        if (layoutManager.canScrollHorizontally()) {
            if (layoutManager.getDecoratedLeft(r2Var2.itemView) <= recyclerView.getPaddingLeft()) {
                recyclerView.j0(i12);
            }
            if (layoutManager.getDecoratedRight(r2Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.j0(i12);
            }
        }
        if (layoutManager.canScrollVertically()) {
            if (layoutManager.getDecoratedTop(r2Var2.itemView) <= recyclerView.getPaddingTop()) {
                recyclerView.j0(i12);
            }
            if (layoutManager.getDecoratedBottom(r2Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.j0(i12);
            }
        }
    }

    public float getSwipeEscapeVelocity(float f11) {
        return f11;
    }

    public float getSwipeVelocityThreshold(float f11) {
        return f11;
    }

    public void onSelectedChanged(r2 r2Var, int i11) {
    }
}
