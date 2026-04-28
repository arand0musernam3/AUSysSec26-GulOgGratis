package c5;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f7250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f7251b;

    public i1(@NotNull Context context) {
        super(context);
        setClipChildren(false);
        this.f7250a = new HashMap();
        this.f7251b = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @NotNull
    public final HashMap<c6.j, b5.m0> getHolderToLayoutNode() {
        return this.f7250a;
    }

    @NotNull
    public final HashMap<b5.m0, c6.j> getLayoutNodeToHolder() {
        return this.f7251b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        for (c6.j jVar : this.f7250a.keySet()) {
            jVar.layout(jVar.getLeft(), jVar.getTop(), jVar.getRight(), jVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        int i13;
        if (!(View.MeasureSpec.getMode(i11) == 1073741824)) {
            y4.a.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i12) == 1073741824)) {
            y4.a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
        for (c6.j jVar : this.f7250a.keySet()) {
            int i14 = jVar.f7719v;
            if (i14 != Integer.MIN_VALUE && (i13 = jVar.f7720w) != Integer.MIN_VALUE) {
                jVar.measure(i14, i13);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            b5.m0 m0Var = (b5.m0) this.f7250a.get(childAt);
            if (childAt.isLayoutRequested() && m0Var != null) {
                b5.m0.Y(m0Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
