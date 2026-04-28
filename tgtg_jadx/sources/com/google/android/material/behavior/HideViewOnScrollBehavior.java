package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c5.o3;
import com.app.tgtg.R;
import e0.f;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jb.u;
import n10.a;
import ox.h;
import r8.k;
import s6.b;
import s6.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class HideViewOnScrollBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f12264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AccessibilityManager f12265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f12266c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TimeInterpolator f12270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TimeInterpolator f12271h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ViewPropertyAnimator f12274k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f12267d = new LinkedHashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12272i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12273j = 2;

    public HideViewOnScrollBehavior() {
    }

    @Override // s6.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i11) {
        if (this.f12265b == null) {
            this.f12265b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f12265b;
        if (accessibilityManager != null && this.f12266c == null) {
            a aVar = new a(this, view, 1);
            this.f12266c = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new o3(this, 4));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i12 = ((e) view.getLayoutParams()).f38841c;
        if (i12 == 80 || i12 == 81) {
            w(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i12, i11);
            w((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.f12272i = this.f12264a.D(view, marginLayoutParams);
        this.f12268e = h.P(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f12269f = h.P(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f12270g = h.Q(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, k10.a.f25733d);
        this.f12271h = h.Q(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, k10.a.f25732c);
        return false;
    }

    @Override // s6.b
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13, int[] iArr) {
        if (i11 <= 0) {
            if (i11 < 0) {
                x(view);
                return;
            }
            return;
        }
        if (this.f12273j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.f12265b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f12274k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f12273j = 1;
            Iterator it = this.f12267d.iterator();
            if (it.hasNext()) {
                throw f.e(it);
            }
            this.f12274k = this.f12264a.H(this.f12272i, view).setInterpolator(this.f12271h).setDuration(this.f12269f).setListener(new androidx.vectordrawable.graphics.drawable.e(this, 9));
        }
    }

    @Override // s6.b
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i11, int i12) {
        return i11 == 2;
    }

    public final void w(int i11) {
        u uVar = this.f12264a;
        if (uVar == null || uVar.G() != i11) {
            if (i11 == 0) {
                this.f12264a = new n10.b(2);
                return;
            }
            if (i11 == 1) {
                this.f12264a = new n10.b(0);
            } else if (i11 == 2) {
                this.f12264a = new n10.b(1);
            } else {
                i4.a.f(k.h(i11, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
            }
        }
    }

    public final void x(View view) {
        if (this.f12273j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f12274k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f12273j = 2;
        Iterator it = this.f12267d.iterator();
        if (it.hasNext()) {
            throw f.e(it);
        }
        this.f12264a.getClass();
        this.f12274k = this.f12264a.H(0, view).setInterpolator(this.f12270g).setDuration(this.f12268e).setListener(new androidx.vectordrawable.graphics.drawable.e(this, 9));
    }

    public HideViewOnScrollBehavior(@NonNull Context context, AttributeSet attributeSet) {
    }
}
