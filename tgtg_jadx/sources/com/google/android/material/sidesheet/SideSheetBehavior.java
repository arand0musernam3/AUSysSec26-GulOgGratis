package com.google.android.material.sidesheet;

import a40.d0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import b0.h;
import c5.i2;
import com.app.tgtg.R;
import e0.f;
import g20.k;
import h0.g;
import j10.a;
import j4.s;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n20.j;
import n20.n;
import n20.o;
import s6.b;
import u00.d;
import z7.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends b implements g20.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f12580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f12581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f12582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f12583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i2 f12584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f12585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f12586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f12588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f12590k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12591m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12592n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12593o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public WeakReference f12594p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WeakReference f12595q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f12596r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public VelocityTracker f12597s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k f12598t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12599u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinkedHashSet f12600v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.google.android.material.bottomsheet.b f12601w;

    public SideSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        this.f12584e = new i2(this);
        this.f12586g = true;
        this.f12587h = 5;
        this.f12590k = 0.1f;
        this.f12596r = -1;
        this.f12600v = new LinkedHashSet();
        this.f12601w = new com.google.android.material.bottomsheet.b(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.V);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f12582c = g.p(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f12583d = o.c(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f12596r = resourceId;
            WeakReference weakReference = this.f12595q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f12595q = null;
            WeakReference weakReference2 = this.f12594p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        o oVar = this.f12583d;
        if (oVar != null) {
            j jVar = new j(oVar);
            this.f12581b = jVar;
            jVar.p(context);
            ColorStateList colorStateList = this.f12582c;
            if (colorStateList != null) {
                this.f12581b.t(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f12581b.setTint(typedValue.data);
            }
        }
        this.f12585f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f12586g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void A() {
        View view;
        WeakReference weakReference = this.f12594p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ViewCompat.W(view, 262144);
        ViewCompat.W(view, 1048576);
        final int i11 = 5;
        if (this.f12587h != 5) {
            ViewCompat.Y(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f2765y, null, new AccessibilityViewCommand() { // from class: o20.b
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public final boolean d(View view2) {
                    this.f31813a.w(i11);
                    return true;
                }
            });
        }
        final int i12 = 3;
        if (this.f12587h != 3) {
            ViewCompat.Y(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f2763w, null, new AccessibilityViewCommand() { // from class: o20.b
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public final boolean d(View view2) {
                    this.f31813a.w(i12);
                    return true;
                }
            });
        }
    }

    @Override // g20.b
    public final void a(androidx.activity.b bVar) {
        k kVar = this.f12598t;
        if (kVar == null) {
            return;
        }
        kVar.f18279f = bVar;
    }

    @Override // g20.b
    public final void b(androidx.activity.b bVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        k kVar = this.f12598t;
        if (kVar == null) {
            return;
        }
        d dVar = this.f12580a;
        int i11 = (dVar == null || dVar.B() == 0) ? 5 : 3;
        if (kVar.f18279f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        androidx.activity.b bVar2 = kVar.f18279f;
        kVar.f18279f = bVar;
        if (bVar2 != null) {
            kVar.d(i11, bVar.a(), bVar.b() == 0);
        }
        WeakReference weakReference = this.f12594p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f12594p.get();
        WeakReference weakReference2 = this.f12595q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.f12580a.Q(marginLayoutParams, (int) ((view.getScaleX() * this.l) + this.f12593o));
        view2.requestLayout();
    }

    @Override // g20.b
    public final void c() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        k kVar = this.f12598t;
        if (kVar == null) {
            return;
        }
        androidx.activity.b bVar = kVar.f18279f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        kVar.f18279f = null;
        int i11 = 5;
        if (bVar == null || Build.VERSION.SDK_INT < 34) {
            w(5);
            return;
        }
        d dVar = this.f12580a;
        if (dVar != null && dVar.B() != 0) {
            i11 = 3;
        }
        androidx.vectordrawable.graphics.drawable.e eVar = new androidx.vectordrawable.graphics.drawable.e(this, 10);
        WeakReference weakReference = this.f12595q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int iU = this.f12580a.u(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: o20.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f31815a.f12580a.Q(marginLayoutParams, k10.a.c(iU, valueAnimator.getAnimatedFraction(), 0));
                    view.requestLayout();
                }
            };
        }
        kVar.c(bVar, i11, eVar, animatorUpdateListener);
    }

    @Override // g20.b
    public final void d() {
        k kVar = this.f12598t;
        if (kVar == null) {
            return;
        }
        kVar.b();
    }

    @Override // s6.b
    public final void g(s6.e eVar) {
        this.f12594p = null;
        this.f12588i = null;
        this.f12598t = null;
    }

    @Override // s6.b
    public final void j() {
        this.f12594p = null;
        this.f12588i = null;
        this.f12598t = null;
    }

    @Override // s6.b
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && ViewCompat.j(view) == null) || !this.f12586g) {
            this.f12589j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f12597s) != null) {
            velocityTracker.recycle();
            this.f12597s = null;
        }
        if (this.f12597s == null) {
            this.f12597s = VelocityTracker.obtain();
        }
        this.f12597s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f12599u = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f12589j) {
            this.f12589j = false;
            return false;
        }
        return (this.f12589j || (eVar = this.f12588i) == null || !eVar.r(motionEvent)) ? false : true;
    }

    @Override // s6.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i11) {
        View view2;
        View view3;
        int iZ;
        int i12;
        View viewFindViewById;
        int i13 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f12594p;
        j jVar = this.f12581b;
        int i14 = 0;
        if (weakReference == null) {
            this.f12594p = new WeakReference(view);
            this.f12598t = new k(view);
            if (jVar != null) {
                view.setBackground(jVar);
                float elevation = this.f12585f;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                jVar.s(elevation);
            } else {
                ColorStateList colorStateList = this.f12582c;
                if (colorStateList != null) {
                    ViewCompat.f0(view, colorStateList);
                }
            }
            int i15 = this.f12587h == 5 ? 4 : 0;
            if (view.getVisibility() != i15) {
                view.setVisibility(i15);
            }
            A();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (ViewCompat.j(view) == null) {
                ViewCompat.d0(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i16 = Gravity.getAbsoluteGravity(((s6.e) view.getLayoutParams()).f38841c, i11) == 3 ? 1 : 0;
        d dVar = this.f12580a;
        if (dVar == null || dVar.B() != i16) {
            s6.e eVar = null;
            o oVar = this.f12583d;
            if (i16 == 0) {
                this.f12580a = new o20.a(this, i13);
                if (oVar != null) {
                    WeakReference weakReference2 = this.f12594p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof s6.e)) {
                        eVar = (s6.e) view3.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).rightMargin <= 0) {
                        n nVarH = oVar.h();
                        nVarH.g(0.0f);
                        nVarH.e(0.0f);
                        o oVarA = nVarH.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(oVarA);
                        }
                    }
                }
            } else {
                if (i16 != 1) {
                    i4.a.f(r8.k.h(i16, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                    return false;
                }
                this.f12580a = new o20.a(this, i14);
                if (oVar != null) {
                    WeakReference weakReference3 = this.f12594p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof s6.e)) {
                        eVar = (s6.e) view2.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).leftMargin <= 0) {
                        n nVarH2 = oVar.h();
                        nVarH2.f(0.0f);
                        nVarH2.d(0.0f);
                        o oVarA2 = nVarH2.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(oVarA2);
                        }
                    }
                }
            }
        }
        if (this.f12588i == null) {
            this.f12588i = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f12601w);
        }
        int iZ2 = this.f12580a.z(view);
        coordinatorLayout.r(i11, view);
        this.f12591m = coordinatorLayout.getWidth();
        this.f12592n = this.f12580a.A(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f12593o = marginLayoutParams != null ? this.f12580a.n(marginLayoutParams) : 0;
        int i17 = this.f12587h;
        if (i17 == 1 || i17 == 2) {
            iZ = iZ2 - this.f12580a.z(view);
        } else if (i17 == 3) {
            iZ = 0;
        } else {
            if (i17 != 5) {
                d0.d(this.f12587h, "Unexpected value: ");
                return false;
            }
            iZ = this.f12580a.w();
        }
        ViewCompat.M(view, iZ);
        if (this.f12595q == null && (i12 = this.f12596r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i12)) != null) {
            this.f12595q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f12600v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                org.bouncycastle.jce.provider.a.c();
                return false;
            }
        }
        return true;
    }

    @Override // s6.b
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i11, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i13, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // s6.b
    public final void r(View view, Parcelable parcelable) {
        int i11 = ((o20.d) parcelable).f31819c;
        if (i11 == 1 || i11 == 2) {
            i11 = 5;
        }
        this.f12587h = i11;
    }

    @Override // s6.b
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new o20.d(this);
    }

    @Override // s6.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f12587h == 1 && actionMasked == 0) {
            return true;
        }
        if (y()) {
            this.f12588i.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f12597s) != null) {
            velocityTracker.recycle();
            this.f12597s = null;
        }
        if (this.f12597s == null) {
            this.f12597s = VelocityTracker.obtain();
        }
        this.f12597s.addMovement(motionEvent);
        if (y() && actionMasked == 2 && !this.f12589j && y()) {
            float fAbs = Math.abs(this.f12599u - motionEvent.getX());
            e eVar = this.f12588i;
            if (fAbs > eVar.f47325b) {
                eVar.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.f12589j;
    }

    public final void w(int i11) {
        if (i11 == 1 || i11 == 2) {
            throw new IllegalArgumentException(r8.k.p(new StringBuilder("STATE_"), i11 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.f12594p;
        if (weakReference == null || weakReference.get() == null) {
            x(i11);
            return;
        }
        View view = (View) this.f12594p.get();
        h hVar = new h(this, i11, 5);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(hVar);
        } else {
            hVar.run();
        }
    }

    public final void x(int i11) {
        View view;
        if (this.f12587h == i11) {
            return;
        }
        this.f12587h = i11;
        WeakReference weakReference = this.f12594p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i12 = this.f12587h == 5 ? 4 : 0;
        if (view.getVisibility() != i12) {
            view.setVisibility(i12);
        }
        Iterator it = this.f12600v.iterator();
        if (it.hasNext()) {
            throw f.e(it);
        }
        A();
    }

    public final boolean y() {
        if (this.f12588i != null) {
            return this.f12586g || this.f12587h == 1;
        }
        return false;
    }

    public final void z(View view, int i11, boolean z11) {
        int iV;
        if (i11 == 3) {
            iV = this.f12580a.v();
        } else {
            if (i11 != 5) {
                i4.a.f(s.f(i11, "Invalid state to get outer edge offset: "));
                return;
            }
            iV = this.f12580a.w();
        }
        e eVar = this.f12588i;
        if (eVar == null || (!z11 ? eVar.s(view, iV, view.getTop()) : eVar.q(iV, view.getTop()))) {
            x(i11);
        } else {
            x(2);
            this.f12584e.b(i11);
        }
    }

    public SideSheetBehavior() {
        this.f12584e = new i2(this);
        this.f12586g = true;
        this.f12587h = 5;
        this.f12590k = 0.1f;
        this.f12596r = -1;
        this.f12600v = new LinkedHashSet();
        this.f12601w = new com.google.android.material.bottomsheet.b(this, 1);
    }
}
