package androidx.coordinatorlayout.widget;

import a60.r;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.r1;
import com.app.tgtg.R;
import com.braze.h2;
import com.google.firebase.messaging.a0;
import g7.b;
import h7.u;
import h7.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q1.k1;
import r6.a;
import s6.c;
import s6.d;
import s6.e;
import s6.f;
import s6.g;
import s6.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements u, v {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f2544t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Class[] f2545u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ThreadLocal f2546v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final r f2547w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f2548x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f2550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f2552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f2553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f2554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f2557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f2558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f2559k;
    public f l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2560m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public WindowInsetsCompat f2561n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2562o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f2563p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f2564q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public jd.f f2565r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r1 f2566s;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f2544t = r02 != null ? r02.getName() : null;
        f2547w = new r(23);
        f2545u = new Class[]{Context.class, AttributeSet.class};
        f2546v = new ThreadLocal();
        f2548x = new b(12);
    }

    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet, int i11) {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i11);
        this.f2549a = new ArrayList();
        this.f2550b = new a0(24);
        this.f2551c = new ArrayList();
        this.f2552d = new ArrayList();
        this.f2553e = new int[2];
        this.f2554f = new int[2];
        this.f2566s = new r1();
        int[] iArr = a.f37732a;
        TypedArray typedArrayObtainStyledAttributes = i11 == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, R.style.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i11, 0);
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i11 == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            context2 = context;
            coordinatorLayout = this;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArrayObtainStyledAttributes, i11, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.f2557i = intArray;
            float f11 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i12 = 0; i12 < length; i12++) {
                coordinatorLayout.f2557i[i12] = (int) (r11[i12] * f11);
            }
        }
        coordinatorLayout.f2563p = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new d(this));
        if (ViewCompat.q(this) == 0) {
            ViewCompat.i0(this, 1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) f2548x.a();
        return rect == null ? new Rect() : rect;
    }

    public static void m(int i11, Rect rect, Rect rect2, e eVar, int i12, int i13) {
        int i14 = eVar.f38841c;
        if (i14 == 0) {
            i14 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i14, i11);
        int i15 = eVar.f38842d;
        if ((i15 & 7) == 0) {
            i15 |= 8388611;
        }
        if ((i15 & 112) == 0) {
            i15 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i15, i11);
        int i16 = absoluteGravity & 7;
        int i17 = absoluteGravity & 112;
        int i18 = absoluteGravity2 & 7;
        int i19 = absoluteGravity2 & 112;
        int iWidth = i18 != 1 ? i18 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i19 != 16 ? i19 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i16 == 1) {
            iWidth -= i12 / 2;
        } else if (i16 != 5) {
            iWidth -= i12;
        }
        if (i17 == 16) {
            iHeight -= i13 / 2;
        } else if (i17 != 80) {
            iHeight -= i13;
        }
        rect2.set(iWidth, iHeight, i12 + iWidth, i13 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e o(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f38840b) {
            if (view instanceof s6.a) {
                s6.b behavior = ((s6.a) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                eVar.b(behavior);
                eVar.f38840b = true;
                return eVar;
            }
            c cVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                cVar = (c) superclass.getAnnotation(c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    eVar.b((s6.b) cVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e5) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e5);
                }
            }
            eVar.f38840b = true;
        }
        return eVar;
    }

    public static void w(int i11, View view) {
        e eVar = (e) view.getLayoutParams();
        int i12 = eVar.f38847i;
        if (i12 != i11) {
            ViewCompat.M(view, i11 - i12);
            eVar.f38847i = i11;
        }
    }

    public static void x(int i11, View view) {
        e eVar = (e) view.getLayoutParams();
        int i12 = eVar.f38848j;
        if (i12 != i11) {
            ViewCompat.N(view, i11 - i12);
            eVar.f38848j = i11;
        }
    }

    public final void b(e eVar, Rect rect, int i11, int i12) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i11) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i12) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(iMax, iMax2, i11 + iMax, i12 + iMax2);
    }

    @Override // h7.u
    public final void c(int i11, View view) {
        r1 r1Var = this.f2566s;
        if (i11 == 1) {
            r1Var.f3901b = 0;
        } else {
            r1Var.f3900a = 0;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i11)) {
                s6.b bVar = eVar.f38839a;
                if (bVar != null) {
                    bVar.u(this, childAt, view, i11);
                }
                if (i11 == 0) {
                    eVar.f38850m = false;
                } else if (i11 == 1) {
                    eVar.f38851n = false;
                }
                eVar.f38852o = false;
            }
        }
        this.f2559k = null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // h7.v
    public final void d(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        s6.b bVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z11 = false;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i15) && (bVar = eVar.f38839a) != null) {
                    int[] iArr2 = this.f2553e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.p(this, childAt, i12, i13, i14, iArr2);
                    iMax = i13 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i14 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z11 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z11) {
            q(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j9) {
        s6.b bVar = ((e) view.getLayoutParams()).f38839a;
        if (bVar != null) {
            bVar.getClass();
        }
        return super.drawChild(canvas, view, j9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2563p;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // h7.u
    public final void e(View view, int i11, int i12, int i13, int i14, int i15) {
        d(view, i11, i12, i13, i14, 0, this.f2554f);
    }

    @Override // h7.u
    public final boolean f(View view, View view2, int i11, int i12) {
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                s6.b bVar = eVar.f38839a;
                if (bVar != null) {
                    boolean zT = bVar.t(this, childAt, view, view2, i11, i12);
                    z11 |= zT;
                    if (i12 == 0) {
                        eVar.f38850m = zT;
                    } else if (i12 == 1) {
                        eVar.f38851n = zT;
                    }
                } else if (i12 == 0) {
                    eVar.f38850m = false;
                } else if (i12 == 1) {
                    eVar.f38851n = false;
                }
            }
        }
        return z11;
    }

    @Override // h7.u
    public final void g(View view, View view2, int i11, int i12) {
        r1 r1Var = this.f2566s;
        if (i12 == 1) {
            r1Var.f3901b = i11;
        } else {
            r1Var.f3900a = i11;
        }
        this.f2559k = view2;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            ((e) getChildAt(i13).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.f2549a);
    }

    public final WindowInsetsCompat getLastWindowInsets() {
        return this.f2561n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r1 r1Var = this.f2566s;
        return r1Var.f3901b | r1Var.f3900a;
    }

    public Drawable getStatusBarBackground() {
        return this.f2563p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // h7.u
    public final void h(View view, int i11, int i12, int[] iArr, int i13) {
        s6.b bVar;
        int childCount = getChildCount();
        boolean z11 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i13) && (bVar = eVar.f38839a) != null) {
                    int[] iArr2 = this.f2553e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.o(this, childAt, view, i11, i12, iArr2, i13);
                    iMax = i11 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i12 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z11 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z11) {
            q(1);
        }
    }

    public final void i(View view) {
        List list = (List) ((k1) this.f2550b.f12780c).get(view);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            View view2 = (View) list.get(i11);
            s6.b bVar = ((e) view2.getLayoutParams()).f38839a;
            if (bVar != null) {
                bVar.h(this, view2, view);
            }
        }
    }

    public final void j(View view, Rect rect, boolean z11) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z11) {
            l(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList k(View view) {
        k1 k1Var = (k1) this.f2550b.f12780c;
        int i11 = k1Var.f35782c;
        ArrayList arrayList = null;
        for (int i12 = 0; i12 < i11; i12++) {
            ArrayList arrayList2 = (ArrayList) k1Var.j(i12);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(k1Var.g(i12));
            }
        }
        ArrayList arrayList3 = this.f2552d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void l(View view, Rect rect) {
        ThreadLocal threadLocal = h.f38857a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = h.f38857a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        h.a(this, view, matrix);
        ThreadLocal threadLocal3 = h.f38858b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int n(int i11) {
        int[] iArr = this.f2557i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i11);
            return 0;
        }
        if (i11 >= 0 && i11 < iArr.length) {
            return iArr[i11];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i11 + " out of range for " + this);
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(false);
        if (this.f2560m) {
            if (this.l == null) {
                this.l = new f(this, 0);
            }
            getViewTreeObserver().addOnPreDrawListener(this.l);
        }
        if (this.f2561n == null && ViewCompat.p(this)) {
            ViewCompat.Z(this);
        }
        this.f2556h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.f2560m && this.l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.l);
        }
        View view = this.f2559k;
        if (view != null) {
            c(0, view);
        }
        this.f2556h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f2562o || this.f2563p == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.f2561n;
        int iL = windowInsetsCompat != null ? windowInsetsCompat.l() : 0;
        if (iL > 0) {
            this.f2563p.setBounds(0, 0, getWidth(), iL);
            this.f2563p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v(true);
        }
        boolean zT = t(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zT;
        }
        v(true);
        return zT;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        s6.b bVar;
        int iS = ViewCompat.s(this);
        ArrayList arrayList = this.f2549a;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            View view = (View) arrayList.get(i15);
            if (view.getVisibility() != 8 && ((bVar = ((e) view.getLayoutParams()).f38839a) == null || !bVar.l(this, view, iS))) {
                r(iS, view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0188  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    s6.b bVar = eVar.f38839a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f11, float f12) {
        s6.b bVar;
        int childCount = getChildCount();
        boolean zN = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f38839a) != null) {
                    zN |= bVar.n(view);
                }
            }
        }
        return zN;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        h(view, i11, i12, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        e(view, i11, i12, i13, i14, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i11) {
        g(view, view2, i11, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f45418a);
        SparseArray sparseArray = gVar.f38856c;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int id2 = childAt.getId();
            s6.b bVar = o(childAt).f38839a;
            if (id2 != -1 && bVar != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                bVar.r(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableS;
        g gVar = new g(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int id2 = childAt.getId();
            s6.b bVar = ((e) childAt.getLayoutParams()).f38839a;
            if (id2 != -1 && bVar != null && (parcelableS = bVar.s(childAt)) != null) {
                sparseArray.append(id2, parcelableS);
            }
        }
        gVar.f38856c = sparseArray;
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i11) {
        return f(view, view2, i11, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(0, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.f2558j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.t(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f2558j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            s6.e r6 = (s6.e) r6
            s6.b r6 = r6.f38839a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f2558j
            boolean r6 = r6.v(r0, r7, r1)
        L2a:
            android.view.View r7 = r0.f2558j
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.v(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(View view, int i11, int i12) {
        b bVar = f2548x;
        Rect rectA = a();
        l(view, rectA);
        try {
            return rectA.contains(i11, i12);
        } finally {
            rectA.setEmpty();
            bVar.c(rectA);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(int r23) {
        /*
            Method dump skipped, instruction units count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.q(int):void");
    }

    public final void r(int i11, View view) {
        Rect rectA;
        Rect rectA2;
        e eVar = (e) view.getLayoutParams();
        View view2 = eVar.f38849k;
        if (view2 == null && eVar.f38844f != -1) {
            h2.b("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        b bVar = f2548x;
        if (view2 != null) {
            rectA = a();
            rectA2 = a();
            try {
                l(view2, rectA);
                e eVar2 = (e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m(i11, rectA, rectA2, eVar2, measuredWidth, measuredHeight);
                b(eVar2, rectA2, measuredWidth, measuredHeight);
                view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
                return;
            } finally {
                rectA.setEmpty();
                bVar.c(rectA);
                rectA2.setEmpty();
                bVar.c(rectA2);
            }
        }
        int i12 = eVar.f38843e;
        if (i12 < 0) {
            e eVar3 = (e) view.getLayoutParams();
            rectA = a();
            rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin);
            if (this.f2561n != null && ViewCompat.p(this) && !ViewCompat.p(view)) {
                rectA.left = this.f2561n.j() + rectA.left;
                rectA.top = this.f2561n.l() + rectA.top;
                rectA.right -= this.f2561n.k();
                rectA.bottom -= this.f2561n.i();
            }
            rectA2 = a();
            int i13 = eVar3.f38841c;
            if ((i13 & 7) == 0) {
                i13 |= 8388611;
            }
            if ((i13 & 112) == 0) {
                i13 |= 48;
            }
            Gravity.apply(i13, view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i11);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
            return;
        }
        e eVar4 = (e) view.getLayoutParams();
        int i14 = eVar4.f38841c;
        if (i14 == 0) {
            i14 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i14, i11);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i11 == 1) {
            i12 = width - i12;
        }
        int iN = n(i12) - measuredWidth2;
        if (i15 == 1) {
            iN += measuredWidth2 / 2;
        } else if (i15 == 5) {
            iN += measuredWidth2;
        }
        int i17 = i16 != 16 ? i16 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, Math.min(iN, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, Math.min(i17, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        s6.b bVar = ((e) view.getLayoutParams()).f38839a;
        if (bVar == null || !bVar.q(this, view, rect, z11)) {
            return super.requestChildRectangleOnScreen(view, rect, z11);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z11) {
        super.requestDisallowInterceptTouchEvent(z11);
        if (!z11 || this.f2555g) {
            return;
        }
        v(false);
        this.f2555g = true;
    }

    public final void s(View view, int i11, int i12, int i13) {
        measureChildWithMargins(view, i11, i12, i13, 0);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z11) {
        super.setFitsSystemWindows(z11);
        y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2564q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f2563p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f2563p = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f2563p.setState(getDrawableState());
                }
                this.f2563p.setLayoutDirection(ViewCompat.s(this));
                this.f2563p.setVisible(getVisibility() == 0, false);
                this.f2563p.setCallback(this);
            }
            ViewCompat.T(this);
        }
    }

    public void setStatusBarBackgroundColor(int i11) {
        setStatusBarBackground(new ColorDrawable(i11));
    }

    public void setStatusBarBackgroundResource(int i11) {
        setStatusBarBackground(i11 != 0 ? getContext().getDrawable(i11) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        boolean z11 = i11 == 0;
        Drawable drawable = this.f2563p;
        if (drawable == null || drawable.isVisible() == z11) {
            return;
        }
        this.f2563p.setVisible(z11, false);
    }

    public final boolean t(MotionEvent motionEvent, int i11) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f2551c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i12) : i12));
        }
        r rVar = f2547w;
        if (rVar != null) {
            Collections.sort(arrayList, rVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zK = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            s6.b bVar = ((e) view.getLayoutParams()).f38839a;
            if (zK && actionMasked != 0) {
                if (bVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i11 == 0) {
                        bVar.k(this, view, motionEventObtain);
                    } else if (i11 == 1) {
                        bVar.v(this, view, motionEventObtain);
                    }
                }
            } else if (!zK && bVar != null) {
                if (i11 == 0) {
                    zK = bVar.k(this, view, motionEvent);
                } else if (i11 == 1) {
                    zK = bVar.v(this, view, motionEvent);
                }
                if (zK) {
                    this.f2558j = view;
                }
            }
        }
        arrayList.clear();
        return zK;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u():void");
    }

    public final void v(boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            s6.b bVar = ((e) childAt.getLayoutParams()).f38839a;
            if (bVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z11) {
                    bVar.k(this, childAt, motionEventObtain);
                } else {
                    bVar.v(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            ((e) getChildAt(i12).getLayoutParams()).getClass();
        }
        this.f2558j = null;
        this.f2555g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2563p;
    }

    public final void y() {
        if (!ViewCompat.p(this)) {
            ViewCompat.k0(this, null);
            return;
        }
        if (this.f2565r == null) {
            this.f2565r = new jd.f(this, 25);
        }
        ViewCompat.k0(this, this.f2565r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(@NonNull Context context) {
        this(context, null);
    }
}
