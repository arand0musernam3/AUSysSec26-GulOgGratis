package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.navigation.NavigationView;
import g20.f;
import h20.t;
import j8.b;
import j8.c;
import java.util.ArrayList;
import java.util.Objects;
import r8.k;
import se.d;
import z7.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final int[] E = {R.attr.colorPrimaryDark};
    public static final int[] F = {R.attr.layout_gravity};
    public static final boolean G;
    public final ArrayList A;
    public Rect B;
    public Matrix C;
    public final d D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f3070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f3074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f3075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f3076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.drawerlayout.widget.a f3077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.drawerlayout.widget.a f3078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3080k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3082n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3083o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3084p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3085q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j8.d f3086r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f3087s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f3088t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f3089u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f3090v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f3091w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f3092x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f3093y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f3094z;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f3096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f3097c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3098d;

        public a(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3095a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.F);
            this.f3095a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        G = Build.VERSION.SDK_INT >= 29;
    }

    public DrawerLayout(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        new c(0);
        this.f3072c = -1728053248;
        this.f3074e = new Paint();
        this.l = true;
        this.f3081m = 3;
        this.f3082n = 3;
        this.f3083o = 3;
        this.f3084p = 3;
        this.D = new d(this, 20);
        setDescendantFocusability(262144);
        float f11 = getResources().getDisplayMetrics().density;
        this.f3071b = (int) ((64.0f * f11) + 0.5f);
        float f12 = f11 * 400.0f;
        androidx.drawerlayout.widget.a aVar = new androidx.drawerlayout.widget.a(this, 3);
        this.f3077h = aVar;
        androidx.drawerlayout.widget.a aVar2 = new androidx.drawerlayout.widget.a(this, 5);
        this.f3078i = aVar2;
        e eVar = new e(getContext(), this, aVar);
        eVar.f47325b = (int) (eVar.f47325b * 1.0f);
        this.f3075f = eVar;
        eVar.f47339q = 1;
        eVar.f47336n = f12;
        aVar.f3100b = eVar;
        e eVar2 = new e(getContext(), this, aVar2);
        eVar2.f47325b = (int) (1.0f * eVar2.f47325b);
        this.f3076g = eVar2;
        eVar2.f47339q = 2;
        eVar2.f47336n = f12;
        aVar2.f3100b = eVar2;
        setFocusableInTouchMode(true);
        ViewCompat.i0(this, 1);
        ViewCompat.b0(this, new b(this));
        setMotionEventSplittingEnabled(false);
        if (ViewCompat.p(this)) {
            setOnApplyWindowInsetsListener(new j8.a());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(E);
            try {
                this.f3090v = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, i8.a.f23500a, i11, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.f3070a = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f3070a = getResources().getDimension(com.app.tgtg.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.A = new ArrayList();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public static boolean h(View view) {
        return ((a) view.getLayoutParams()).f3095a == 0;
    }

    public static boolean i(View view) {
        if (j(view)) {
            return (((a) view.getLayoutParams()).f3098d & 1) == 1;
        }
        j4.d.m("View ", view, " is not a drawer");
        return false;
    }

    public static boolean j(View view) {
        int absoluteGravity = Gravity.getAbsoluteGravity(((a) view.getLayoutParams()).f3095a, ViewCompat.s(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public final boolean a(int i11, View view) {
        return (g(view) & i11) == i11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i11, int i12) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i13 = 0;
        boolean z11 = false;
        while (true) {
            arrayList2 = this.A;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (!j(childAt)) {
                arrayList2.add(childAt);
            } else if (i(childAt)) {
                childAt.addFocusables(arrayList, i11, i12);
                z11 = true;
            }
            i13++;
        }
        if (!z11) {
            int size = arrayList2.size();
            for (int i14 = 0; i14 < size; i14++) {
                View view = (View) arrayList2.get(i14);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i11, i12);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        View childAt;
        super.addView(view, i11, layoutParams);
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i12);
            if ((((a) childAt.getLayoutParams()).f3098d & 1) == 1) {
                break;
            } else {
                i12++;
            }
        }
        if (childAt != null || j(view)) {
            ViewCompat.i0(view, 4);
        } else {
            ViewCompat.i0(view, 1);
        }
    }

    public final void b(View view, boolean z11) {
        if (!j(view)) {
            j4.d.m("View ", view, " is not a sliding drawer");
            return;
        }
        a aVar = (a) view.getLayoutParams();
        if (this.l) {
            aVar.f3096b = 0.0f;
            aVar.f3098d = 0;
        } else if (z11) {
            aVar.f3098d |= 4;
            if (a(3, view)) {
                this.f3075f.s(view, -view.getWidth(), view.getTop());
            } else {
                this.f3076g.s(view, getWidth(), view.getTop());
            }
        } else {
            float f11 = ((a) view.getLayoutParams()).f3096b;
            float width = view.getWidth();
            int i11 = ((int) (width * 0.0f)) - ((int) (f11 * width));
            if (!a(3, view)) {
                i11 = -i11;
            }
            view.offsetLeftAndRight(i11);
            l(view, 0.0f);
            o(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public final void c(boolean z11) {
        int childCount = getChildCount();
        boolean zS = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            a aVar = (a) childAt.getLayoutParams();
            if (j(childAt) && (!z11 || aVar.f3097c)) {
                zS |= a(3, childAt) ? this.f3075f.s(childAt, -childAt.getWidth(), childAt.getTop()) : this.f3076g.s(childAt, getWidth(), childAt.getTop());
                aVar.f3097c = false;
            }
        }
        androidx.drawerlayout.widget.a aVar2 = this.f3077h;
        aVar2.f3102d.removeCallbacks(aVar2.f3101c);
        androidx.drawerlayout.widget.a aVar3 = this.f3078i;
        aVar3.f3102d.removeCallbacks(aVar3.f3101c);
        if (zS) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof a) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i11 = 0; i11 < childCount; i11++) {
            fMax = Math.max(fMax, ((a) getChildAt(i11).getLayoutParams()).f3096b);
        }
        this.f3073d = fMax;
        boolean zG = this.f3075f.g();
        boolean zG2 = this.f3076g.g();
        if (zG || zG2) {
            ViewCompat.T(this);
        }
    }

    public final View d(int i11) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, ViewCompat.s(this)) & 7;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if ((g(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f3073d <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x11 = motionEvent.getX();
        float y5 = motionEvent.getY();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            View childAt = getChildAt(i11);
            if (this.B == null) {
                this.B = new Rect();
            }
            childAt.getHitRect(this.B);
            if (this.B.contains((int) x11, (int) y5) && !h(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.C == null) {
                            this.C = new Matrix();
                        }
                        matrix.invert(this.C);
                        motionEventObtain.transform(this.C);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j9) {
        Drawable background;
        int height = getHeight();
        boolean zH = h(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i11 = 0;
        if (zH) {
            int childCount = getChildCount();
            int i12 = 0;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && j(childAt) && childAt.getHeight() >= height) {
                    if (a(3, childAt)) {
                        int right = childAt.getRight();
                        if (right > i12) {
                            i12 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i12, 0, width, getHeight());
            i11 = i12;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j9);
        canvas.restoreToCount(iSave);
        float f11 = this.f3073d;
        if (f11 > 0.0f && zH) {
            int i14 = this.f3072c;
            Paint paint = this.f3074e;
            paint.setColor((((int) ((((-16777216) & i14) >>> 24) * f11)) << 24) | (i14 & 16777215));
            canvas.drawRect(i11, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    public final View e() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (j(childAt)) {
                if (!j(childAt)) {
                    j4.d.m("View ", childAt, " is not a drawer");
                    return null;
                }
                if (((a) childAt.getLayoutParams()).f3096b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public final int f(View view) {
        if (!j(view)) {
            j4.d.m("View ", view, " is not a drawer");
            return 0;
        }
        int i11 = ((a) view.getLayoutParams()).f3095a;
        int iS = ViewCompat.s(this);
        if (i11 == 3) {
            int i12 = this.f3081m;
            if (i12 != 3) {
                return i12;
            }
            int i13 = iS == 0 ? this.f3083o : this.f3084p;
            if (i13 != 3) {
                return i13;
            }
            return 0;
        }
        if (i11 == 5) {
            int i14 = this.f3082n;
            if (i14 != 3) {
                return i14;
            }
            int i15 = iS == 0 ? this.f3084p : this.f3083o;
            if (i15 != 3) {
                return i15;
            }
            return 0;
        }
        if (i11 == 8388611) {
            int i16 = this.f3083o;
            if (i16 != 3) {
                return i16;
            }
            int i17 = iS == 0 ? this.f3081m : this.f3082n;
            if (i17 != 3) {
                return i17;
            }
            return 0;
        }
        if (i11 != 8388613) {
            return 0;
        }
        int i18 = this.f3084p;
        if (i18 != 3) {
            return i18;
        }
        int i19 = iS == 0 ? this.f3082n : this.f3081m;
        if (i19 != 3) {
            return i19;
        }
        return 0;
    }

    public final int g(View view) {
        return Gravity.getAbsoluteGravity(((a) view.getLayoutParams()).f3095a, ViewCompat.s(this));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = new a(-1, -1);
        aVar.f3095a = 0;
        return aVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            a aVar = (a) layoutParams;
            a aVar2 = new a(aVar);
            aVar2.f3095a = 0;
            aVar2.f3095a = aVar.f3095a;
            return aVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            a aVar3 = new a((ViewGroup.MarginLayoutParams) layoutParams);
            aVar3.f3095a = 0;
            return aVar3;
        }
        a aVar4 = new a(layoutParams);
        aVar4.f3095a = 0;
        return aVar4;
    }

    public float getDrawerElevation() {
        return this.f3070a;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f3090v;
    }

    public final void k(View view) {
        if (!j(view)) {
            j4.d.m("View ", view, " is not a sliding drawer");
            return;
        }
        a aVar = (a) view.getLayoutParams();
        if (this.l) {
            aVar.f3096b = 1.0f;
            aVar.f3098d = 1;
            n(view, true);
            m(view);
        } else {
            aVar.f3098d |= 2;
            if (a(3, view)) {
                this.f3075f.s(view, 0, view.getTop());
            } else {
                this.f3076g.s(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void l(View view, float f11) {
        a aVar = (a) view.getLayoutParams();
        if (f11 == aVar.f3096b) {
            return;
        }
        aVar.f3096b = f11;
        ArrayList arrayList = this.f3087s;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((j8.d) this.f3087s.get(size)).getClass();
            }
        }
    }

    public final void m(View view) {
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.f2765y;
        ViewCompat.W(view, accessibilityActionCompat.b());
        if (!i(view) || f(view) == 2) {
            return;
        }
        ViewCompat.Y(view, accessibilityActionCompat, null, this.D);
    }

    public final void n(View view, boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((z11 || j(childAt)) && !(z11 && childAt == view)) {
                ViewCompat.i0(childAt, 4);
            } else {
                ViewCompat.i0(childAt, 1);
            }
        }
    }

    public final void o(int i11, View view) {
        int i12;
        View rootView;
        int i13 = this.f3075f.f47324a;
        int i14 = this.f3076g.f47324a;
        if (i13 == 1 || i14 == 1) {
            i12 = 1;
        } else {
            i12 = 2;
            if (i13 != 2 && i14 != 2) {
                i12 = 0;
            }
        }
        if (view != null && i11 == 0) {
            float f11 = ((a) view.getLayoutParams()).f3096b;
            if (f11 == 0.0f) {
                a aVar = (a) view.getLayoutParams();
                if ((aVar.f3098d & 1) == 1) {
                    aVar.f3098d = 0;
                    ArrayList arrayList = this.f3087s;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            NavigationView navigationView = ((t) ((j8.d) this.f3087s.get(size))).f21358a;
                            if (view == navigationView) {
                                navigationView.f12525w.b();
                                if (navigationView.f12521s && navigationView.f12520r != 0) {
                                    navigationView.f12520r = 0;
                                    navigationView.h(navigationView.getWidth(), navigationView.getHeight());
                                }
                            }
                        }
                    }
                    n(view, false);
                    m(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f11 == 1.0f) {
                a aVar2 = (a) view.getLayoutParams();
                if ((aVar2.f3098d & 1) == 0) {
                    aVar2.f3098d = 1;
                    ArrayList arrayList2 = this.f3087s;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            NavigationView navigationView2 = ((t) ((j8.d) this.f3087s.get(size2))).f21358a;
                            if (view == navigationView2) {
                                f fVar = navigationView2.f12525w;
                                Objects.requireNonNull(fVar);
                                view.post(new d1.e(fVar, 17));
                            }
                        }
                    }
                    n(view, true);
                    m(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i12 != this.f3079j) {
            this.f3079j = i12;
            ArrayList arrayList3 = this.f3087s;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((j8.d) this.f3087s.get(size3)).getClass();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.l = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f3094z || this.f3090v == null) {
            return;
        }
        Object obj = this.f3093y;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f3090v.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f3090v.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            z7.e r1 = r8.f3075f
            boolean r2 = r1.r(r9)
            z7.e r3 = r8.f3076g
            boolean r3 = r3.r(r9)
            r2 = r2 | r3
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L65
            if (r0 == r3) goto L5e
            r9 = 2
            if (r0 == r9) goto L1e
            r9 = 3
            if (r0 == r9) goto L5e
            goto L63
        L1e:
            float[] r9 = r1.f47327d
            int r9 = r9.length
            r0 = r4
        L22:
            if (r0 >= r9) goto L63
            int r5 = r1.f47334k
            int r6 = r3 << r0
            r5 = r5 & r6
            if (r5 == 0) goto L5b
            float[] r5 = r1.f47329f
            r5 = r5[r0]
            float[] r6 = r1.f47327d
            r6 = r6[r0]
            float r5 = r5 - r6
            float[] r6 = r1.f47330g
            r6 = r6[r0]
            float[] r7 = r1.f47328e
            r7 = r7[r0]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r1.f47325b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L5b
            androidx.drawerlayout.widget.a r9 = r8.f3077h
            androidx.drawerlayout.widget.DrawerLayout r0 = r9.f3102d
            a8.f r9 = r9.f3101c
            r0.removeCallbacks(r9)
            androidx.drawerlayout.widget.a r9 = r8.f3078i
            androidx.drawerlayout.widget.DrawerLayout r0 = r9.f3102d
            a8.f r9 = r9.f3101c
            r0.removeCallbacks(r9)
            goto L63
        L5b:
            int r0 = r0 + 1
            goto L22
        L5e:
            r8.c(r3)
            r8.f3085q = r4
        L63:
            r9 = r4
            goto L8b
        L65:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.f3088t = r0
            r8.f3089u = r9
            float r5 = r8.f3073d
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L88
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r1.h(r0, r9)
            if (r9 == 0) goto L88
            boolean r9 = h(r9)
            if (r9 == 0) goto L88
            r9 = r3
            goto L89
        L88:
            r9 = r4
        L89:
            r8.f3085q = r4
        L8b:
            if (r2 != 0) goto Lae
            if (r9 != 0) goto Lae
            int r9 = r8.getChildCount()
            r0 = r4
        L94:
            if (r0 >= r9) goto La8
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$a r1 = (androidx.drawerlayout.widget.DrawerLayout.a) r1
            boolean r1 = r1.f3097c
            if (r1 == 0) goto La5
            goto Lae
        La5:
            int r0 = r0 + 1
            goto L94
        La8:
            boolean r9 = r8.f3085q
            if (r9 == 0) goto Lad
            goto Lae
        Lad:
            return r4
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (i11 != 4 || e() == null) {
            return super.onKeyDown(i11, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 != 4) {
            return super.onKeyUp(i11, keyEvent);
        }
        View viewE = e();
        if (viewE != null && f(viewE) == 0) {
            c(false);
        }
        return viewE != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        WindowInsets rootWindowInsets;
        float f11;
        int i15;
        boolean z12 = true;
        this.f3080k = true;
        int i16 = i13 - i11;
        int childCount = getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                if (h(childAt)) {
                    int i18 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                    childAt.layout(i18, ((ViewGroup.MarginLayoutParams) aVar).topMargin, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) aVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(3, childAt)) {
                        float f12 = measuredWidth;
                        i15 = (-measuredWidth) + ((int) (aVar.f3096b * f12));
                        f11 = (measuredWidth + i15) / f12;
                    } else {
                        float f13 = measuredWidth;
                        f11 = (i16 - r11) / f13;
                        i15 = i16 - ((int) (aVar.f3096b * f13));
                    }
                    boolean z13 = f11 != aVar.f3096b ? z12 : false;
                    int i19 = aVar.f3095a & 112;
                    if (i19 == 16) {
                        int i21 = i14 - i12;
                        int i22 = (i21 - measuredHeight) / 2;
                        int i23 = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                        if (i22 < i23) {
                            i22 = i23;
                        } else {
                            int i24 = i22 + measuredHeight;
                            int i25 = i21 - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                            if (i24 > i25) {
                                i22 = i25 - measuredHeight;
                            }
                        }
                        childAt.layout(i15, i22, measuredWidth + i15, measuredHeight + i22);
                    } else if (i19 != 80) {
                        int i26 = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                        childAt.layout(i15, i26, measuredWidth + i15, measuredHeight + i26);
                    } else {
                        int i27 = i14 - i12;
                        childAt.layout(i15, (i27 - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i15, i27 - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin);
                    }
                    if (z13) {
                        l(childAt, f11);
                    }
                    int i28 = aVar.f3096b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i28) {
                        childAt.setVisibility(i28);
                    }
                }
            }
            i17++;
            z12 = true;
        }
        if (G && (rootWindowInsets = getRootWindowInsets()) != null) {
            x6.d dVarH = WindowInsetsCompat.v(rootWindowInsets).h();
            e eVar = this.f3075f;
            eVar.f47337o = Math.max(eVar.f47338p, dVarH.f43873a);
            e eVar2 = this.f3076g;
            eVar2.f47337o = Math.max(eVar2.f47338p, dVarH.f43875c);
        }
        this.f3080k = false;
        this.l = false;
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                i4.a.f("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
                return;
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z11 = this.f3093y != null && ViewCompat.p(this);
        int iS = ViewCompat.s(this);
        int childCount = getChildCount();
        boolean z12 = false;
        boolean z13 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                if (z11) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(aVar.f3095a, iS);
                    boolean zP = ViewCompat.p(childAt);
                    Object obj = this.f3093y;
                    if (zP) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) obj;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) obj;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) aVar).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) aVar).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) aVar).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (h(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - ((ViewGroup.MarginLayoutParams) aVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) aVar).topMargin) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, 1073741824));
                } else {
                    if (!j(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i13 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    float fO = ViewCompat.o(childAt);
                    float f11 = this.f3070a;
                    if (fO != f11) {
                        ViewCompat.h0(childAt, f11);
                    }
                    int iG = g(childAt);
                    int i14 = iG & 7;
                    boolean z14 = i14 == 3;
                    if ((z14 && z12) || (!z14 && z13)) {
                        throw new IllegalStateException(k.p(new StringBuilder("Child drawer has absolute gravity "), (iG & 3) != 3 ? (iG & 5) == 5 ? "RIGHT" : Integer.toHexString(i14) : "LEFT", " but this DrawerLayout already has a drawer view along that edge"));
                    }
                    if (z14) {
                        z12 = true;
                    } else {
                        z13 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i11, this.f3071b + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin, ((ViewGroup.MarginLayoutParams) aVar).width), ViewGroup.getChildMeasureSpec(i12, ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, ((ViewGroup.MarginLayoutParams) aVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewD;
        if (!(parcelable instanceof j8.e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j8.e eVar = (j8.e) parcelable;
        super.onRestoreInstanceState(eVar.f45418a);
        int i11 = eVar.f24760c;
        if (i11 != 0 && (viewD = d(i11)) != null) {
            k(viewD);
        }
        int i12 = eVar.f24761d;
        if (i12 != 3) {
            setDrawerLockMode(i12, 3);
        }
        int i13 = eVar.f24762e;
        if (i13 != 3) {
            setDrawerLockMode(i13, 5);
        }
        int i14 = eVar.f24763f;
        if (i14 != 3) {
            setDrawerLockMode(i14, 8388611);
        }
        int i15 = eVar.f24764g;
        if (i15 != 3) {
            setDrawerLockMode(i15, 8388613);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j8.e eVar = new j8.e(super.onSaveInstanceState());
        eVar.f24760c = 0;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            a aVar = (a) getChildAt(i11).getLayoutParams();
            int i12 = aVar.f3098d;
            boolean z11 = i12 == 1;
            boolean z12 = i12 == 2;
            if (z11 || z12) {
                eVar.f24760c = aVar.f3095a;
                break;
            }
        }
        eVar.f24761d = this.f3081m;
        eVar.f24762e = this.f3082n;
        eVar.f24763f = this.f3083o;
        eVar.f24764g = this.f3084p;
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            z7.e r0 = r6.f3075f
            r0.k(r7)
            z7.e r1 = r6.f3076g
            r1.k(r7)
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L70
            if (r1 == r3) goto L20
            r7 = 3
            if (r1 == r7) goto L1a
            return r3
        L1a:
            r6.c(r3)
            r6.f3085q = r2
            return r3
        L20:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.h(r4, r5)
            if (r4 == 0) goto L6b
            boolean r4 = h(r4)
            if (r4 == 0) goto L6b
            float r4 = r6.f3088t
            float r1 = r1 - r4
            float r4 = r6.f3089u
            float r7 = r7 - r4
            int r0 = r0.f47325b
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r7 = r7 + r1
            int r0 = r0 * r0
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L6b
            int r7 = r6.getChildCount()
            r0 = r2
        L4c:
            if (r0 >= r7) goto L61
            android.view.View r1 = r6.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$a r4 = (androidx.drawerlayout.widget.DrawerLayout.a) r4
            int r4 = r4.f3098d
            r4 = r4 & r3
            if (r4 != r3) goto L5e
            goto L62
        L5e:
            int r0 = r0 + 1
            goto L4c
        L61:
            r1 = 0
        L62:
            if (r1 == 0) goto L6b
            int r7 = r6.f(r1)
            r0 = 2
            if (r7 != r0) goto L6c
        L6b:
            r2 = r3
        L6c:
            r6.c(r2)
            return r3
        L70:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f3088t = r0
            r6.f3089u = r7
            r6.f3085q = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z11) {
        super.requestDisallowInterceptTouchEvent(z11);
        if (z11) {
            c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3080k) {
            return;
        }
        super.requestLayout();
    }

    public void setChildInsets(Object obj, boolean z11) {
        this.f3093y = obj;
        this.f3094z = z11;
        setWillNotDraw(!z11 && getBackground() == null);
        requestLayout();
    }

    public void setDrawerElevation(float f11) {
        this.f3070a = f11;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (j(childAt)) {
                ViewCompat.h0(childAt, this.f3070a);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(j8.d dVar) {
        ArrayList arrayList;
        j8.d dVar2 = this.f3086r;
        if (dVar2 != null && (arrayList = this.f3087s) != null) {
            arrayList.remove(dVar2);
        }
        if (dVar != null) {
            if (this.f3087s == null) {
                this.f3087s = new ArrayList();
            }
            this.f3087s.add(dVar);
        }
        this.f3086r = dVar;
    }

    public void setDrawerLockMode(int i11, int i12) {
        View viewD;
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, ViewCompat.s(this));
        if (i12 == 3) {
            this.f3081m = i11;
        } else if (i12 == 5) {
            this.f3082n = i11;
        } else if (i12 == 8388611) {
            this.f3083o = i11;
        } else if (i12 == 8388613) {
            this.f3084p = i11;
        }
        if (i11 != 0) {
            (absoluteGravity == 3 ? this.f3075f : this.f3076g).a();
        }
        if (i11 != 1) {
            if (i11 == 2 && (viewD = d(absoluteGravity)) != null) {
                k(viewD);
                return;
            }
            return;
        }
        View viewD2 = d(absoluteGravity);
        if (viewD2 != null) {
            b(viewD2, true);
        }
    }

    public void setDrawerShadow(int i11, int i12) {
        setDrawerShadow(getContext().getDrawable(i11), i12);
    }

    public void setDrawerTitle(int i11, CharSequence charSequence) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, ViewCompat.s(this));
        if (absoluteGravity == 3) {
            this.f3091w = charSequence;
        } else if (absoluteGravity == 5) {
            this.f3092x = charSequence;
        }
    }

    public void setScrimColor(int i11) {
        this.f3072c = i11;
        invalidate();
    }

    public void setStatusBarBackground(int i11) {
        this.f3090v = i11 != 0 ? getContext().getDrawable(i11) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i11) {
        this.f3090v = new ColorDrawable(i11);
        invalidate();
    }

    public void setDrawerShadow(Drawable drawable, int i11) {
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f3090v = drawable;
        invalidate();
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i11) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public void setDrawerLockMode(int i11) {
        setDrawerLockMode(i11, 3);
        setDrawerLockMode(i11, 5);
    }

    public void setDrawerLockMode(int i11, @NonNull View view) {
        if (j(view)) {
            setDrawerLockMode(i11, ((a) view.getLayoutParams()).f3095a);
        } else {
            j4.d.m("View ", view, " is not a drawer with appropriate layout_gravity");
        }
    }

    public DrawerLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.app.tgtg.R.attr.drawerLayoutStyle);
    }

    public DrawerLayout(@NonNull Context context) {
        this(context, null);
    }
}
