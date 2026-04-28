package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f2;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.n2;
import androidx.recyclerview.widget.y1;
import bg.u0;
import com.app.tgtg.R;
import h20.e;
import j4.s;
import r10.a;
import r10.b;
import r10.c;
import r10.d;
import r10.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class CarouselLayoutManager extends y1 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f12410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f12411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View.OnLayoutChangeListener f12412c;

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        new a();
        this.f12412c = new e(this, 1);
        this.f12410a = new g();
        requestLayout();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j10.a.f24415h);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            requestLayout();
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.recyclerview.widget.y1
    public final boolean canScrollHorizontally() {
        return e();
    }

    @Override // androidx.recyclerview.widget.y1
    public final boolean canScrollVertically() {
        return !e();
    }

    @Override // androidx.recyclerview.widget.y1
    public final int computeHorizontalScrollExtent(n2 n2Var) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.y1
    public final int computeHorizontalScrollOffset(n2 n2Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.y1
    public final int computeHorizontalScrollRange(n2 n2Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.l2
    public final PointF computeScrollVectorForPosition(int i11) {
        return null;
    }

    @Override // androidx.recyclerview.widget.y1
    public final int computeVerticalScrollExtent(n2 n2Var) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.y1
    public final int computeVerticalScrollOffset(n2 n2Var) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.y1
    public final int computeVerticalScrollRange(n2 n2Var) {
        return 0;
    }

    public final float d(float f11, float f12) {
        return f() ? f11 - f12 : f11 + f12;
    }

    public final boolean e() {
        return this.f12411b.f37534a == 0;
    }

    public final boolean f() {
        return e() && getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.y1
    public final RecyclerView.a generateDefaultLayoutParams() {
        return new RecyclerView.a(-2, -2);
    }

    @Override // androidx.recyclerview.widget.y1
    public final void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        rect.centerY();
        if (e()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.y1
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.y1
    public final void measureChildWithMargins(View view, int i11, int i12) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        Context context = recyclerView.getContext();
        g gVar = this.f12410a;
        float dimension = gVar.f37535a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        gVar.f37535a = dimension;
        float dimension2 = gVar.f37536b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        gVar.f37536b = dimension2;
        requestLayout();
        recyclerView.addOnLayoutChangeListener(this.f12412c);
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onDetachedFromWindow(RecyclerView recyclerView, f2 f2Var) {
        onDetachedFromWindow(recyclerView);
        recyclerView.removeOnLayoutChangeListener(this.f12412c);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    @Override // androidx.recyclerview.widget.y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onFocusSearchFailed(android.view.View r4, int r5, androidx.recyclerview.widget.f2 r6, androidx.recyclerview.widget.n2 r7) {
        /*
            r3 = this;
            int r6 = r3.getChildCount()
            if (r6 != 0) goto L8
            goto L96
        L8:
            r10.d r6 = r3.f12411b
            int r6 = r6.f37534a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L46
            r2 = 2
            if (r5 == r2) goto L3c
            r2 = 17
            if (r5 == r2) goto L4b
            r2 = 33
            if (r5 == r2) goto L48
            r2 = 66
            if (r5 == r2) goto L3e
            r2 = 130(0x82, float:1.82E-43)
            if (r5 == r2) goto L3a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown focus request:"
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "CarouselLayoutManager"
            android.util.Log.d(r6, r5)
        L38:
            r5 = r7
            goto L54
        L3a:
            if (r6 != r1) goto L38
        L3c:
            r5 = r1
            goto L54
        L3e:
            if (r6 != 0) goto L38
            boolean r5 = r3.f()
            if (r5 == 0) goto L3c
        L46:
            r5 = r0
            goto L54
        L48:
            if (r6 != r1) goto L38
            goto L46
        L4b:
            if (r6 != 0) goto L38
            boolean r5 = r3.f()
            if (r5 == 0) goto L46
            goto L3c
        L54:
            if (r5 != r7) goto L57
            goto L96
        L57:
            r6 = 0
            if (r5 != r0) goto L8b
            int r4 = r3.getPosition(r4)
            if (r4 != 0) goto L61
            goto L96
        L61:
            android.view.View r4 = r3.getChildAt(r6)
            int r4 = r3.getPosition(r4)
            int r4 = r4 - r1
            if (r4 < 0) goto L7a
            int r5 = r3.getItemCount()
            if (r4 < r5) goto L73
            goto L7a
        L73:
            r10.d r4 = r3.f12411b
            r4.d()
            r4 = 0
            throw r4
        L7a:
            boolean r4 = r3.f()
            if (r4 == 0) goto L86
            int r4 = r3.getChildCount()
            int r6 = r4 + (-1)
        L86:
            android.view.View r4 = r3.getChildAt(r6)
            return r4
        L8b:
            int r4 = r3.getPosition(r4)
            int r5 = r3.getItemCount()
            int r5 = r5 - r1
            if (r4 != r5) goto L98
        L96:
            r4 = 0
            return r4
        L98:
            int r4 = r3.getChildCount()
            int r4 = r4 - r1
            android.view.View r4 = r3.getChildAt(r4)
            int r4 = r3.getPosition(r4)
            int r4 = r4 + r1
            if (r4 < 0) goto Lb6
            int r5 = r3.getItemCount()
            if (r4 < r5) goto Laf
            goto Lb6
        Laf:
            r10.d r4 = r3.f12411b
            r4.d()
            r4 = 0
            throw r4
        Lb6:
            boolean r4 = r3.f()
            if (r4 == 0) goto Lbd
            goto Lc3
        Lbd:
            int r4 = r3.getChildCount()
            int r6 = r4 + (-1)
        Lc3:
            android.view.View r4 = r3.getChildAt(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.f2, androidx.recyclerview.widget.n2):android.view.View");
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onItemsAdded(RecyclerView recyclerView, int i11, int i12) {
        super.onItemsAdded(recyclerView, i11, i12);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onItemsChanged(RecyclerView recyclerView) {
        super.onItemsChanged(recyclerView);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onItemsRemoved(RecyclerView recyclerView, int i11, int i12) {
        super.onItemsRemoved(recyclerView, i11, i12);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onLayoutChildren(f2 f2Var, n2 n2Var) {
        if (n2Var.b() > 0) {
            if ((e() ? getWidth() : getHeight()) > 0.0f) {
                f();
                measureChildWithMargins(f2Var.d(0), 0, 0);
                throw null;
            }
        }
        removeAndRecycleAllViews(f2Var);
    }

    @Override // androidx.recyclerview.widget.y1
    public final void onLayoutCompleted(n2 n2Var) {
        if (getChildCount() == 0) {
            return;
        }
        getPosition(getChildAt(0));
    }

    @Override // androidx.recyclerview.widget.y1
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z11, boolean z12) {
        return false;
    }

    @Override // androidx.recyclerview.widget.y1
    public final int scrollHorizontallyBy(int i11, f2 f2Var, n2 n2Var) {
        if (!e() || getChildCount() == 0 || i11 == 0) {
            return 0;
        }
        measureChildWithMargins(f2Var.d(0), 0, 0);
        throw null;
    }

    @Override // androidx.recyclerview.widget.y1
    public final int scrollVerticallyBy(int i11, f2 f2Var, n2 n2Var) {
        if (!canScrollVertically() || getChildCount() == 0 || i11 == 0) {
            return 0;
        }
        measureChildWithMargins(f2Var.d(0), 0, 0);
        throw null;
    }

    public final void setOrientation(int i11) {
        d cVar;
        if (i11 != 0 && i11 != 1) {
            i4.a.f(s.f(i11, "invalid orientation:"));
            return;
        }
        assertNotInLayoutOrScroll(null);
        d dVar = this.f12411b;
        if (dVar == null || i11 != dVar.f37534a) {
            if (i11 == 0) {
                cVar = new c(this);
            } else {
                if (i11 != 1) {
                    i4.a.f("invalid orientation");
                    return;
                }
                cVar = new b(this);
            }
            this.f12411b = cVar;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.y1
    public final void smoothScrollToPosition(RecyclerView recyclerView, n2 n2Var, int i11) {
        u0 u0Var = new u0(this, recyclerView.getContext());
        u0Var.setTargetPosition(i11);
        startSmoothScroll(u0Var);
    }

    @Override // androidx.recyclerview.widget.y1
    public final void scrollToPosition(int i11) {
    }

    public CarouselLayoutManager() {
        g gVar = new g();
        new a();
        this.f12412c = new e(this, 1);
        this.f12410a = gVar;
        requestLayout();
        setOrientation(0);
    }
}
