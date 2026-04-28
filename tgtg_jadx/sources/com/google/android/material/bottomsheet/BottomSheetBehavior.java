package com.google.android.material.bottomsheet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.z;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.k0;
import c5.i2;
import com.app.tgtg.R;
import e20.i0;
import j4.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import n20.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends s6.b implements g20.b {
    public final i2 A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final boolean L;
    public boolean M;
    public int N;
    public z7.e O;
    public boolean P;
    public int Q;
    public boolean T;
    public final float V;
    public int W;
    public int X;
    public int Y;
    public WeakReference Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f12312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12315f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public VelocityTracker f12316f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12317g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public g20.g f12318g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12319h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public WeakReference f12320h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public int f12321h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n20.j f12322i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f12323i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ColorStateList f12324j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public boolean f12325j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f12326k;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public HashMap f12327k1;
    public final int l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final SparseIntArray f12328l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12329m;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public final b f12330m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f12331n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f12332o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f12333p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f12334q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f12335r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f12336s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f12337t;
    public final ArrayList t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f12338u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12339v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12340w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f12341x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o f12342y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f12343z;

    public BottomSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        int i11;
        this.f12310a = 0;
        this.f12311b = true;
        this.f12326k = -1;
        this.l = -1;
        this.A = new i2(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.V = 0.1f;
        this.t0 = new ArrayList();
        this.f12323i1 = -1;
        this.f12328l1 = new SparseIntArray();
        this.f12330m1 = new b(this, 0);
        this.f12319h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j10.a.f24414g);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f12324j = h0.g.p(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.f12342y = o.c(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        o oVar = this.f12342y;
        if (oVar != null) {
            n20.j jVar = new n20.j(oVar);
            this.f12322i = jVar;
            jVar.p(context);
            ColorStateList colorStateList = this.f12324j;
            if (colorStateList != null) {
                this.f12322i.t(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f12322i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(x(), 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.B.addUpdateListener(new a(this));
        this.H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f12326k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue == null || (i11 = typedValuePeekValue.data) != -1) {
            I(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        } else {
            I(i11);
        }
        H(typedArrayObtainStyledAttributes.getBoolean(9, false));
        this.f12331n = typedArrayObtainStyledAttributes.getBoolean(14, false);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(7, true);
        if (this.f12311b != z11) {
            this.f12311b = z11;
            if (this.Z != null) {
                w();
            }
            K((this.f12311b && this.N == 6) ? 3 : this.N);
            O(this.N, true);
            N();
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.L = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.f12310a = typedArrayObtainStyledAttributes.getInt(11, 0);
        float f11 = typedArrayObtainStyledAttributes.getFloat(8, 0.5f);
        if (f11 <= 0.0f || f11 >= 1.0f) {
            i4.a.f("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.F = f11;
        if (this.Z != null) {
            this.E = (int) ((1.0f - f11) * this.Y);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
            if (dimensionPixelOffset < 0) {
                i4.a.f("offset must be greater than or equal to 0");
                throw null;
            }
            this.C = dimensionPixelOffset;
            O(this.N, true);
        } else {
            int i12 = typedValuePeekValue2.data;
            if (i12 < 0) {
                i4.a.f("offset must be greater than or equal to 0");
                throw null;
            }
            this.C = i12;
            O(this.N, true);
        }
        this.f12313d = typedArrayObtainStyledAttributes.getInt(12, 500);
        this.f12332o = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.f12333p = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.f12334q = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.f12335r = typedArrayObtainStyledAttributes.getBoolean(21, true);
        this.f12336s = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.f12337t = typedArrayObtainStyledAttributes.getBoolean(16, false);
        this.f12338u = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.f12341x = typedArrayObtainStyledAttributes.getBoolean(24, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f12312c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View A(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View viewA = A(viewGroup.getChildAt(i11));
            if (viewA != null) {
                return viewA;
            }
        }
        return null;
    }

    public static BottomSheetBehavior B(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof s6.e)) {
            i4.a.f("The view is not a child of CoordinatorLayout");
            return null;
        }
        s6.b bVar = ((s6.e) layoutParams).f38839a;
        if (bVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) bVar;
        }
        i4.a.f("The view is not associated with BottomSheetBehavior");
        return null;
    }

    public static int C(int i11, int i12, int i13, int i14) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i12, i14);
        if (i13 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i13), 1073741824);
        }
        if (size != 0) {
            i13 = Math.min(size, i13);
        }
        return View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
    }

    public final int D() {
        if (this.f12311b) {
            return this.D;
        }
        return Math.max(this.C, this.f12335r ? 0 : this.f12340w);
    }

    public final int E(int i11) {
        if (i11 == 3) {
            return D();
        }
        if (i11 == 4) {
            return this.G;
        }
        if (i11 == 5) {
            return this.Y;
        }
        if (i11 == 6) {
            return this.E;
        }
        i4.a.f(s.f(i11, "Invalid state to get top offset: "));
        return 0;
    }

    public final boolean F() {
        WeakReference weakReference = this.Z;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.Z.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void G() {
        this.f12321h1 = -1;
        this.f12323i1 = -1;
        VelocityTracker velocityTracker = this.f12316f1;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f12316f1 = null;
        }
    }

    public final void H(boolean z11) {
        if (this.I != z11) {
            this.I = z11;
            if (!z11 && this.N == 5) {
                J(4);
            }
            N();
        }
    }

    public final void I(int i11) {
        boolean z11 = this.f12315f;
        if (i11 == -1) {
            if (z11) {
                return;
            } else {
                this.f12315f = true;
            }
        } else {
            if (!z11 && this.f12314e == i11) {
                return;
            }
            this.f12315f = false;
            this.f12314e = Math.max(0, i11);
        }
        Q();
    }

    public final void J(int i11) {
        if (i11 == 1 || i11 == 2) {
            throw new IllegalArgumentException(r8.k.p(new StringBuilder("STATE_"), i11 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.I && i11 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i11);
            return;
        }
        int i12 = (i11 == 6 && this.f12311b && E(i11) <= this.D) ? 3 : i11;
        WeakReference weakReference = this.Z;
        if (weakReference == null || weakReference.get() == null) {
            K(i11);
            return;
        }
        View view = (View) this.Z.get();
        k0 k0Var = new k0(this, view, i12, 1);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(k0Var);
        } else {
            k0Var.run();
        }
    }

    public final void K(int i11) {
        View view;
        if (this.N == i11) {
            return;
        }
        this.N = i11;
        if (i11 != 4 && i11 != 3 && i11 != 6) {
            boolean z11 = this.I;
        }
        WeakReference weakReference = this.Z;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i12 = 0;
        if (i11 == 3) {
            P(true);
        } else if (i11 == 6 || i11 == 5 || i11 == 4) {
            P(false);
        }
        O(i11, true);
        while (true) {
            ArrayList arrayList = this.t0;
            if (i12 >= arrayList.size()) {
                N();
                return;
            } else {
                ((c) arrayList.get(i12)).c(i11, view);
                i12++;
            }
        }
    }

    public final boolean L(View view, float f11) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f11 * this.V) + ((float) view.getTop())) - ((float) this.G)) / ((float) y()) > 0.5f;
    }

    public final void M(View view, int i11, boolean z11) {
        int iE = E(i11);
        z7.e eVar = this.O;
        if (eVar == null || (!z11 ? eVar.s(view, view.getLeft(), iE) : eVar.q(view.getLeft(), iE))) {
            K(i11);
            return;
        }
        K(2);
        O(i11, true);
        this.A.b(i11);
    }

    public final void N() {
        View view;
        WeakReference weakReference = this.Z;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ViewCompat.W(view, 524288);
        ViewCompat.W(view, 262144);
        ViewCompat.W(view, 1048576);
        SparseIntArray sparseIntArray = this.f12328l1;
        int i11 = sparseIntArray.get(0, -1);
        if (i11 != -1) {
            ViewCompat.W(view, i11);
            sparseIntArray.delete(0);
        }
        int i12 = 3;
        if (!this.f12311b && this.N != 6) {
            sparseIntArray.put(0, ViewCompat.a(view, view.getResources().getString(R.string.bottomsheet_action_expand_halfway), new z(this, i, i12)));
        }
        if (this.I) {
            int i13 = 5;
            if (this.N != 5) {
                ViewCompat.Y(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f2765y, null, new z(this, i13, i12));
            }
        }
        int i14 = this.N;
        int i15 = 4;
        if (i14 == 3) {
            ViewCompat.Y(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f2764x, null, new z(this, this.f12311b ? 4 : 6, i12));
            return;
        }
        if (i14 == 4) {
            ViewCompat.Y(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f2763w, null, new z(this, this.f12311b ? 3 : 6, i12));
        } else {
            if (i14 != 6) {
                return;
            }
            ViewCompat.Y(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f2764x, null, new z(this, i15, i12));
            ViewCompat.Y(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f2763w, null, new z(this, i12, i12));
        }
    }

    public final void O(int i11, boolean z11) {
        n20.j jVar;
        if (i11 == 2) {
            return;
        }
        boolean z12 = this.N == 3 && (this.f12341x || F());
        if (this.f12343z == z12 || (jVar = this.f12322i) == null) {
            return;
        }
        this.f12343z = z12;
        ValueAnimator valueAnimator = this.B;
        if (!z11 || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            jVar.u(this.f12343z ? x() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(jVar.f30345b.f30327j, z12 ? x() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void P(boolean z11) {
        WeakReference weakReference = this.Z;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z11) {
                if (this.f12327k1 != null) {
                    return;
                } else {
                    this.f12327k1 = new HashMap(childCount);
                }
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if (childAt != this.Z.get() && z11) {
                    this.f12327k1.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z11) {
                return;
            }
            this.f12327k1 = null;
        }
    }

    public final void Q() {
        View view;
        if (this.Z != null) {
            w();
            if (this.N != 4 || (view = (View) this.Z.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // g20.b
    public final void a(androidx.activity.b bVar) {
        g20.g gVar = this.f12318g1;
        if (gVar == null) {
            return;
        }
        gVar.f18279f = bVar;
    }

    @Override // g20.b
    public final void b(androidx.activity.b bVar) {
        g20.g gVar = this.f12318g1;
        if (gVar == null) {
            return;
        }
        if (gVar.f18279f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        androidx.activity.b bVar2 = gVar.f18279f;
        gVar.f18279f = bVar;
        if (bVar2 == null) {
            return;
        }
        gVar.c(bVar.a());
    }

    @Override // g20.b
    public final void c() {
        g20.g gVar = this.f12318g1;
        if (gVar == null) {
            return;
        }
        int i11 = gVar.f18277d;
        int i12 = gVar.f18276c;
        androidx.activity.b bVar = gVar.f18279f;
        gVar.f18279f = null;
        if (bVar == null || Build.VERSION.SDK_INT < 34) {
            J(this.I ? 5 : 4);
            return;
        }
        if (!this.I) {
            AnimatorSet animatorSetB = gVar.b();
            animatorSetB.setDuration(k10.a.c(i12, bVar.a(), i11));
            animatorSetB.start();
            J(4);
            return;
        }
        androidx.vectordrawable.graphics.drawable.e eVar = new androidx.vectordrawable.graphics.drawable.e(this, 3);
        View view = gVar.f18275b;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
        objectAnimatorOfFloat.setInterpolator(new u8.a(1));
        objectAnimatorOfFloat.setDuration(k10.a.c(i12, bVar.a(), i11));
        objectAnimatorOfFloat.addListener(new androidx.vectordrawable.graphics.drawable.e(gVar, 4));
        objectAnimatorOfFloat.addListener(eVar);
        objectAnimatorOfFloat.start();
    }

    @Override // g20.b
    public final void d() {
        g20.g gVar = this.f12318g1;
        if (gVar == null || gVar.a() == null) {
            return;
        }
        AnimatorSet animatorSetB = gVar.b();
        animatorSetB.setDuration(gVar.f18278e);
        animatorSetB.start();
    }

    @Override // s6.b
    public final void g(s6.e eVar) {
        this.Z = null;
        this.O = null;
        this.f12318g1 = null;
    }

    @Override // s6.b
    public final void j() {
        this.Z = null;
        this.O = null;
        this.f12318g1 = null;
    }

    @Override // s6.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i11;
        z7.e eVar;
        if (!view.isShown() || !this.K) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            G();
        }
        if (this.f12316f1 == null) {
            this.f12316f1 = VelocityTracker.obtain();
        }
        this.f12316f1.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x11 = (int) motionEvent.getX();
            int y5 = (int) motionEvent.getY();
            this.f12323i1 = y5;
            if (this.N != 2) {
                WeakReference weakReference = this.f12320h0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.p(view2, x11, y5)) {
                    this.f12321h1 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f12325j1 = true;
                }
            }
            this.P = this.f12321h1 == -1 && !coordinatorLayout.p(view, x11, this.f12323i1);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f12325j1 = false;
            this.f12321h1 = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (this.P || (eVar = this.O) == null || !eVar.r(motionEvent)) {
            WeakReference weakReference2 = this.f12320h0;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.P || this.N == 1 || coordinatorLayout.p(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i11 = this.f12323i1) == -1 || Math.abs(i11 - motionEvent.getY()) <= this.O.f47325b) {
                return false;
            }
        }
        return true;
    }

    @Override // s6.b
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i11) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i12 = 0;
        if (this.Z == null) {
            this.f12317g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z11 = (Build.VERSION.SDK_INT < 29 || this.f12331n || this.f12315f) ? false : true;
            if (this.f12332o || this.f12333p || this.f12334q || this.f12336s || this.f12337t || this.f12338u || z11) {
                i0.f(view, new c40.i(this, z11));
            }
            ViewCompat.q0(view, new n(view));
            this.Z = new WeakReference(view);
            this.f12318g1 = new g20.g(view);
            n20.j jVar = this.f12322i;
            if (jVar != null) {
                view.setBackground(jVar);
                float elevation = this.H;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                jVar.s(elevation);
            } else {
                ColorStateList colorStateList = this.f12324j;
                if (colorStateList != null) {
                    ViewCompat.f0(view, colorStateList);
                }
            }
            N();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.O == null) {
            this.O = new z7.e(coordinatorLayout.getContext(), coordinatorLayout, this.f12330m1);
        }
        int top = view.getTop();
        coordinatorLayout.r(i11, view);
        this.X = coordinatorLayout.getWidth();
        this.Y = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.W = height;
        int iMin = this.Y;
        int i13 = iMin - height;
        int i14 = this.f12340w;
        if (i13 < i14) {
            boolean z12 = this.f12335r;
            int i15 = this.l;
            if (z12) {
                if (i15 != -1) {
                    iMin = Math.min(iMin, i15);
                }
                this.W = iMin;
            } else {
                int iMin2 = iMin - i14;
                if (i15 != -1) {
                    iMin2 = Math.min(iMin2, i15);
                }
                this.W = iMin2;
            }
        }
        this.D = Math.max(0, this.Y - this.W);
        this.E = (int) ((1.0f - this.F) * this.Y);
        w();
        int i16 = this.N;
        if (i16 == 3) {
            ViewCompat.N(view, D());
        } else if (i16 == 6) {
            ViewCompat.N(view, this.E);
        } else if (this.I && i16 == 5) {
            ViewCompat.N(view, this.Y);
        } else if (i16 == 4) {
            ViewCompat.N(view, this.G);
        } else if (i16 == 1 || i16 == 2) {
            ViewCompat.N(view, top - view.getTop());
        }
        O(this.N, false);
        this.f12320h0 = new WeakReference(A(view));
        while (true) {
            ArrayList arrayList = this.t0;
            if (i12 >= arrayList.size()) {
                return true;
            }
            ((c) arrayList.get(i12)).a(view);
            i12++;
        }
    }

    @Override // s6.b
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(C(i11, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, this.f12326k, marginLayoutParams.width), C(i13, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.l, marginLayoutParams.height));
        return true;
    }

    @Override // s6.b
    public final boolean n(View view) {
        WeakReference weakReference = this.f12320h0;
        return (weakReference == null || view != weakReference.get() || this.N == 3 || this.M) ? false : true;
    }

    @Override // s6.b
    public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i11, int i12, int[] iArr, int i13) {
        if (i13 == 1) {
            return;
        }
        WeakReference weakReference = this.f12320h0;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i14 = top - i12;
        if (i12 > 0) {
            if (!this.T && !this.L && view2 == view3 && view2.canScrollVertically(1)) {
                this.M = true;
                return;
            }
            if (i14 < D()) {
                int iD = top - D();
                iArr[1] = iD;
                ViewCompat.N(view, -iD);
                K(3);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i12;
                ViewCompat.N(view, -i12);
                K(1);
            }
        } else if (i12 < 0) {
            boolean zCanScrollVertically = view2.canScrollVertically(-1);
            if (!this.T && !this.L && view2 == view3 && zCanScrollVertically) {
                this.M = true;
                return;
            }
            if (!zCanScrollVertically) {
                int i15 = this.G;
                if (i14 > i15 && !this.I) {
                    int i16 = top - i15;
                    iArr[1] = i16;
                    ViewCompat.N(view, -i16);
                    K(4);
                } else {
                    if (!this.K) {
                        return;
                    }
                    iArr[1] = i12;
                    ViewCompat.N(view, -i12);
                    K(1);
                }
            }
        }
        z(view.getTop());
        this.Q = i12;
        this.T = true;
        this.M = false;
    }

    @Override // s6.b
    public final void r(View view, Parcelable parcelable) {
        d dVar = (d) parcelable;
        int i11 = this.f12310a;
        if (i11 != 0) {
            if (i11 == -1 || (i11 & 1) == 1) {
                this.f12314e = dVar.f12348d;
            }
            if (i11 == -1 || (i11 & 2) == 2) {
                this.f12311b = dVar.f12349e;
            }
            if (i11 == -1 || (i11 & 4) == 4) {
                this.I = dVar.f12350f;
            }
            if (i11 == -1 || (i11 & 8) == 8) {
                this.J = dVar.f12351g;
            }
        }
        int i12 = dVar.f12347c;
        if (i12 == 1 || i12 == 2) {
            this.N = 4;
        } else {
            this.N = i12;
        }
    }

    @Override // s6.b
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new d(this);
    }

    @Override // s6.b
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i11, int i12) {
        this.Q = 0;
        this.T = false;
        return (i11 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // s6.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.D()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.K(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.f12320h0
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb5
            boolean r3 = r2.T
            if (r3 != 0) goto L1f
            goto Lb5
        L1f:
            int r3 = r2.Q
            r5 = 6
            if (r3 <= 0) goto L34
            boolean r3 = r2.f12311b
            if (r3 == 0) goto L2a
            goto Laf
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.E
            if (r3 <= r6) goto Laf
            goto Lae
        L34:
            boolean r3 = r2.I
            if (r3 == 0) goto L55
            android.view.VelocityTracker r3 = r2.f12316f1
            if (r3 != 0) goto L3e
            r3 = 0
            goto L4d
        L3e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.f12312c
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.f12316f1
            int r6 = r2.f12321h1
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.L(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.Q
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.f12311b
            if (r1 == 0) goto L74
            int r5 = r2.D
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L97
            goto Laf
        L74:
            int r1 = r2.E
            if (r3 >= r1) goto L83
            int r6 = r2.G
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto Lae
            goto Laf
        L83:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
            goto Lae
        L93:
            boolean r3 = r2.f12311b
            if (r3 == 0) goto L99
        L97:
            r0 = r6
            goto Laf
        L99:
            int r3 = r4.getTop()
            int r0 = r2.E
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
        Lae:
            r0 = r5
        Laf:
            r3 = 0
            r2.M(r4, r0, r3)
            r2.T = r3
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.u(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // s6.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i11 = this.N;
        if (i11 == 1 && actionMasked == 0) {
            return true;
        }
        z7.e eVar = this.O;
        if (eVar != null && (this.K || i11 == 1)) {
            eVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            G();
        }
        if (this.f12316f1 == null) {
            this.f12316f1 = VelocityTracker.obtain();
        }
        this.f12316f1.addMovement(motionEvent);
        if (this.O != null && ((this.K || this.N == 1) && actionMasked == 2 && !this.P)) {
            float fAbs = Math.abs(this.f12323i1 - motionEvent.getY());
            z7.e eVar2 = this.O;
            if (fAbs > eVar2.f47325b) {
                eVar2.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.P;
    }

    public final void w() {
        int iY = y();
        boolean z11 = this.f12311b;
        int i11 = this.Y;
        if (z11) {
            this.G = Math.max(i11 - iY, this.D);
        } else {
            this.G = i11 - iY;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float x() {
        /*
            r5 = this;
            n20.j r0 = r5.f12322i
            r1 = 0
            if (r0 == 0) goto L67
            java.lang.ref.WeakReference r0 = r5.Z
            if (r0 == 0) goto L67
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L67
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L67
            java.lang.ref.WeakReference r0 = r5.Z
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.F()
            if (r2 == 0) goto L67
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L67
            n20.j r2 = r5.f12322i
            float r2 = r2.m()
            r3 = 0
            android.view.RoundedCorner r3 = r0.getRoundedCorner(r3)
            if (r3 == 0) goto L45
            int r3 = r3.getRadius()
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L45
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L45
            float r3 = r3 / r2
            goto L46
        L45:
            r3 = r1
        L46:
            n20.j r2 = r5.f12322i
            float r2 = r2.n()
            r4 = 1
            android.view.RoundedCorner r0 = r0.getRoundedCorner(r4)
            if (r0 == 0) goto L62
            int r0 = r0.getRadius()
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L62
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L62
            float r1 = r0 / r2
        L62:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.x():float");
    }

    public final int y() {
        int i11;
        return this.f12315f ? Math.min(Math.max(this.f12317g, this.Y - ((this.X * 9) / 16)), this.W) + this.f12339v : (this.f12331n || this.f12332o || (i11 = this.f12329m) <= 0) ? this.f12314e + this.f12339v : Math.max(this.f12314e, i11 + this.f12319h);
    }

    public final void z(int i11) {
        View view = (View) this.Z.get();
        if (view != null) {
            ArrayList arrayList = this.t0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i12 = this.G;
            if (i11 <= i12 && i12 != D()) {
                D();
            }
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((c) arrayList.get(i13)).b(view);
            }
        }
    }

    public BottomSheetBehavior() {
        this.f12310a = 0;
        this.f12311b = true;
        this.f12326k = -1;
        this.l = -1;
        this.A = new i2(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = true;
        this.N = 4;
        this.V = 0.1f;
        this.t0 = new ArrayList();
        this.f12323i1 = -1;
        this.f12328l1 = new SparseIntArray();
        this.f12330m1 = new b(this, 0);
    }

    @Override // s6.b
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13, int[] iArr) {
    }
}
