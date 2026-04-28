package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import ky.o;
import n10.c;
import s6.b;
import z7.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f12275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f12276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12279e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f12280f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f12281g = 0.5f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f12282h = new c(this);

    @Override // s6.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zP = this.f12277c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zP = coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f12277c = zP;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f12277c = false;
        }
        if (zP) {
            if (this.f12275a == null) {
                this.f12275a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f12282h);
            }
            if (!this.f12278d && this.f12275a.r(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // s6.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i11) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            ViewCompat.W(view, 1048576);
            if (w(view)) {
                ViewCompat.Y(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f2765y, null, new o(this, 4));
            }
        }
        return false;
    }

    @Override // s6.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f12275a == null) {
            return false;
        }
        if (this.f12278d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f12275a.k(motionEvent);
        return true;
    }

    public boolean w(View view) {
        return true;
    }
}
