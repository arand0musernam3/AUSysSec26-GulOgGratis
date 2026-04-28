package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.vectordrawable.graphics.drawable.e;
import c5.o3;
import com.app.tgtg.R;
import e0.f;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n10.a;
import ox.h;
import s6.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TimeInterpolator f12256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TimeInterpolator f12257e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AccessibilityManager f12259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f12260h;
    public ViewPropertyAnimator l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f12253a = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12258f = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f12261i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12262j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12263k = 0;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // s6.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i11) {
        this.f12258f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f12254b = h.P(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f12255c = h.P(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f12256d = h.Q(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, k10.a.f25733d);
        this.f12257e = h.Q(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, k10.a.f25732c);
        if (this.f12259g == null) {
            this.f12259g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f12259g;
        if (accessibilityManager != null && this.f12260h == null) {
            a aVar = new a(this, view, 0);
            this.f12260h = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new o3(this, 3));
        }
        return false;
    }

    @Override // s6.b
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i11 <= 0) {
            if (i11 < 0) {
                w(view);
                return;
            }
            return;
        }
        if (this.f12262j == 1) {
            return;
        }
        if (this.f12261i && (accessibilityManager = this.f12259g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f12262j = 1;
        Iterator it = this.f12253a.iterator();
        if (it.hasNext()) {
            throw f.e(it);
        }
        this.l = view.animate().translationY(this.f12258f + this.f12263k).setInterpolator(this.f12257e).setDuration(this.f12255c).setListener(new e(this, 8));
    }

    @Override // s6.b
    public boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i11, int i12) {
        return i11 == 2;
    }

    public final void w(View view) {
        if (this.f12262j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f12262j = 2;
        Iterator it = this.f12253a.iterator();
        if (it.hasNext()) {
            throw f.e(it);
        }
        this.l = view.animate().translationY(0).setInterpolator(this.f12256d).setDuration(this.f12254b).setListener(new e(this, 8));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
