package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import c5.m3;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements h7.s {
    public static boolean I1 = false;
    public static boolean J1 = false;
    public static final int[] K1 = {R.attr.nestedScrollingEnabled};
    public static final float L1 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean M1 = true;
    public static final boolean N1 = true;
    public static final Class[] O1;
    public static final l0 P1;
    public static final o2 Q1;
    public boolean A;
    public final ArrayList A1;
    public final AccessibilityManager B;
    public final i1 B1;
    public ArrayList C;
    public boolean C1;
    public boolean D;
    public int D1;
    public boolean E;
    public int E1;
    public int F;
    public final boolean F1;
    public int G;
    public final j1 G1;
    public q1 H;
    public final h7.h H1;
    public EdgeEffect I;
    public EdgeEffect J;
    public EdgeEffect K;
    public EdgeEffect L;
    public s1 M;
    public int N;
    public int O;
    public VelocityTracker P;
    public int Q;
    public int T;
    public int V;
    public int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h2 f3578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f2 f3579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j2 f3580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f3581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f3582f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final int f3583f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w2.z f3584g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final int f3585g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3586h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f3587h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final float f3588h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i1 f3589i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final float f3590i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f3591j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public boolean f3592j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Rect f3593k;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final q2 f3594k1;
    public final RectF l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public h0 f3595l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l1 f3596m;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public final f0 f3597m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public y1 f3598n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final n2 f3599n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f3600o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public c2 f3601o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f3602p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public ArrayList f3603p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f3604q;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public boolean f3605q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b2 f3606r;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public boolean f3607r1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3608s;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public final j1 f3609s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3610t;
    public a2 t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public boolean f3611t1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3612u;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public t2 f3613u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3614v;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public final int[] f3615v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3616w;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public h7.t f3617w1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f3618x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public final int[] f3619x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f3620y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public final int[] f3621y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f3622z;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public final int[] f3623z1;

    static {
        Class cls = Integer.TYPE;
        O1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        P1 = new l0(2);
        Q1 = new o2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerView(@NonNull Context context, AttributeSet attributeSet, int i11) throws NoSuchMethodException {
        char c3;
        char c7;
        char c8;
        TypedArray typedArray;
        int i12;
        Object[] objArr;
        Constructor constructor;
        super(context, attributeSet, i11);
        int i13 = 0;
        this.f3578b = new h2(this, i13);
        this.f3579c = new f2(this);
        this.f3584g = new w2.z(9);
        this.f3589i = new i1(this, i13);
        this.f3591j = new Rect();
        this.f3593k = new Rect();
        this.l = new RectF();
        this.f3600o = new ArrayList();
        this.f3602p = new ArrayList();
        this.f3604q = new ArrayList();
        this.f3614v = 0;
        this.D = false;
        this.E = false;
        this.F = 0;
        this.G = 0;
        this.H = Q1;
        this.M = new r();
        this.N = 0;
        this.O = -1;
        this.f3588h1 = Float.MIN_VALUE;
        this.f3590i1 = Float.MIN_VALUE;
        int i14 = 1;
        this.f3592j1 = true;
        this.f3594k1 = new q2(this);
        this.f3597m1 = N1 ? new f0() : null;
        n2 n2Var = new n2();
        n2Var.f3826a = -1;
        n2Var.f3827b = 0;
        n2Var.f3828c = 0;
        n2Var.f3829d = 1;
        n2Var.f3830e = 0;
        n2Var.f3831f = false;
        n2Var.f3832g = false;
        n2Var.f3833h = false;
        n2Var.f3834i = false;
        n2Var.f3835j = false;
        n2Var.f3836k = false;
        this.f3599n1 = n2Var;
        this.f3605q1 = false;
        this.f3607r1 = false;
        j1 j1Var = new j1(this);
        this.f3609s1 = j1Var;
        this.f3611t1 = false;
        this.f3615v1 = new int[2];
        this.f3619x1 = new int[2];
        this.f3621y1 = new int[2];
        this.f3623z1 = new int[2];
        this.A1 = new ArrayList();
        this.B1 = new i1(this, i14);
        this.D1 = 0;
        this.E1 = 0;
        this.G1 = new j1(this);
        this.H1 = new h7.h(getContext(), new j1(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3587h0 = viewConfiguration.getScaledTouchSlop();
        this.f3588h1 = viewConfiguration.getScaledHorizontalScrollFactor();
        this.f3590i1 = viewConfiguration.getScaledVerticalScrollFactor();
        this.f3583f1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3585g1 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3577a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.M.f3912a = j1Var;
        j1 j1Var2 = new j1(this);
        b bVar = new b();
        bVar.f3664b = new g6.e(30);
        bVar.f3665c = new ArrayList();
        bVar.f3666d = new ArrayList();
        bVar.f3663a = 0;
        bVar.f3667e = j1Var2;
        bVar.f3668f = new c(bVar);
        this.f3581e = bVar;
        this.f3582f = new k(new j1(this));
        if (ViewCompat.r(this) == 0) {
            ViewCompat.j0(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new t2(this));
        int[] iArr = x9.a.f44087a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, 0);
        ViewCompat.a0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i11, 0);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f3586h = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                i4.a.f("Trying to set fast scroller without both required drawables.".concat(D()));
                throw null;
            }
            Resources resources = getContext().getResources();
            c3 = 3;
            c8 = 2;
            c7 = 1;
            typedArray = typedArrayObtainStyledAttributes;
            i12 = 4;
            new e0(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.app.tgtg.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.app.tgtg.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.app.tgtg.R.dimen.fastscroll_margin));
        } else {
            c3 = 3;
            c7 = 1;
            c8 = 2;
            typedArray = typedArrayObtainStyledAttributes;
            i12 = 4;
        }
        typedArray.recycle();
        this.F1 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(y1.class);
                    try {
                        Constructor constructor2 = clsAsSubclass.getConstructor(O1);
                        objArr = new Object[i12];
                        objArr[0] = context;
                        objArr[c7] = attributeSet;
                        objArr[c8] = Integer.valueOf(i11);
                        objArr[c3] = 0;
                        constructor = constructor2;
                    } catch (NoSuchMethodException e5) {
                        try {
                            objArr = null;
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e11) {
                            e11.initCause(e5);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e11);
                        }
                    }
                    constructor.setAccessible(c7);
                    setLayoutManager((y1) constructor.newInstance(objArr));
                } catch (ClassCastException e12) {
                    a40.d0.j(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e12);
                    throw null;
                } catch (ClassNotFoundException e13) {
                    a40.d0.j(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e13);
                    throw null;
                } catch (IllegalAccessException e14) {
                    a40.d0.j(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e14);
                    throw null;
                } catch (InstantiationException e15) {
                    a40.d0.j(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e15);
                    throw null;
                } catch (InvocationTargetException e16) {
                    a40.d0.j(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e16);
                    throw null;
                }
            }
        }
        int[] iArr2 = K1;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i11, 0);
        ViewCompat.a0(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i11, 0);
        boolean z11 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        setTag(com.app.tgtg.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static RecyclerView I(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            RecyclerView recyclerViewI = I(viewGroup.getChildAt(i11));
            if (recyclerViewI != null) {
                return recyclerViewI;
            }
        }
        return null;
    }

    public static r2 O(View view) {
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).f3624a;
    }

    private h7.t getScrollingChildHelper() {
        if (this.f3617w1 == null) {
            this.f3617w1 = new h7.t(this);
        }
        return this.f3617w1;
    }

    public static void m(r2 r2Var) {
        WeakReference<RecyclerView> weakReference = r2Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == r2Var.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            r2Var.mNestedRecyclerView = null;
        }
    }

    public static int p(int i11, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i12) {
        if (i11 > 0 && edgeEffect != null && a.a.B(edgeEffect) != 0.0f) {
            int iRound = Math.round(a.a.G(edgeEffect, ((-i11) * 4.0f) / i12, 0.5f) * ((-i12) / 4.0f));
            if (iRound != i11) {
                edgeEffect.finish();
            }
            return i11 - iRound;
        }
        if (i11 >= 0 || edgeEffect2 == null || a.a.B(edgeEffect2) == 0.0f) {
            return i11;
        }
        float f11 = i12;
        int iRound2 = Math.round(a.a.G(edgeEffect2, (i11 * 4.0f) / f11, 0.5f) * (f11 / 4.0f));
        if (iRound2 != i11) {
            edgeEffect2.finish();
        }
        return i11 - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z11) {
        I1 = z11;
    }

    public static void setVerboseLoggingEnabled(boolean z11) {
        J1 = z11;
    }

    public final void A() {
        if (this.I != null) {
            return;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = this.H.createEdgeEffect(this, 0);
        this.I = edgeEffectCreateEdgeEffect;
        if (this.f3586h) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.K != null) {
            return;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = this.H.createEdgeEffect(this, 2);
        this.K = edgeEffectCreateEdgeEffect;
        if (this.f3586h) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void C() {
        if (this.J != null) {
            return;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = this.H.createEdgeEffect(this, 1);
        this.J = edgeEffectCreateEdgeEffect;
        if (this.f3586h) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String D() {
        return " " + super.toString() + ", adapter:" + this.f3596m + ", layout:" + this.f3598n + ", context:" + getContext();
    }

    public final void E(n2 n2Var) {
        if (getScrollState() != 2) {
            n2Var.getClass();
            return;
        }
        OverScroller overScroller = this.f3594k1.f3882c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        n2Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View F(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean G(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f3604q;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b2 b2Var = (b2) arrayList.get(i11);
            if (b2Var.d(motionEvent) && action != 3) {
                this.f3606r = b2Var;
                return true;
            }
        }
        return false;
    }

    public final void H(int[] iArr) {
        int iE = this.f3582f.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MIN_VALUE;
        for (int i13 = 0; i13 < iE; i13++) {
            r2 r2VarO = O(this.f3582f.d(i13));
            if (!r2VarO.shouldIgnore()) {
                int layoutPosition = r2VarO.getLayoutPosition();
                if (layoutPosition < i11) {
                    i11 = layoutPosition;
                }
                if (layoutPosition > i12) {
                    i12 = layoutPosition;
                }
            }
        }
        iArr[0] = i11;
        iArr[1] = i12;
    }

    public final r2 J(int i11) {
        r2 r2Var = null;
        if (this.D) {
            return null;
        }
        int iH = this.f3582f.h();
        for (int i12 = 0; i12 < iH; i12++) {
            r2 r2VarO = O(this.f3582f.g(i12));
            if (r2VarO != null && !r2VarO.isRemoved() && L(r2VarO) == i11) {
                if (!this.f3582f.f3795c.contains(r2VarO.itemView)) {
                    return r2VarO;
                }
                r2Var = r2VarO;
            }
        }
        return r2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean K(int r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.K(int, int, int, int):boolean");
    }

    public final int L(r2 r2Var) {
        if (r2Var.hasAnyOfTheFlags(524) || !r2Var.isBound()) {
            return -1;
        }
        int i11 = r2Var.mPosition;
        ArrayList arrayList = (ArrayList) this.f3581e.f3665c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) arrayList.get(i12);
            int i13 = aVar.f3650a;
            if (i13 != 1) {
                if (i13 == 2) {
                    int i14 = aVar.f3651b;
                    if (i14 <= i11) {
                        int i15 = aVar.f3653d;
                        if (i14 + i15 > i11) {
                            return -1;
                        }
                        i11 -= i15;
                    } else {
                        continue;
                    }
                } else if (i13 == 8) {
                    int i16 = aVar.f3651b;
                    if (i16 == i11) {
                        i11 = aVar.f3653d;
                    } else {
                        if (i16 < i11) {
                            i11--;
                        }
                        if (aVar.f3653d <= i11) {
                            i11++;
                        }
                    }
                }
            } else if (aVar.f3651b <= i11) {
                i11 += aVar.f3653d;
            }
        }
        return i11;
    }

    public final long M(r2 r2Var) {
        return this.f3596m.hasStableIds() ? r2Var.getItemId() : r2Var.mPosition;
    }

    public final r2 N(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return O(view);
        }
        m0.i1.k("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final Rect P(View view) {
        a aVar = (a) view.getLayoutParams();
        boolean z11 = aVar.f3626c;
        Rect rect = aVar.f3625b;
        if (z11) {
            n2 n2Var = this.f3599n1;
            if (!n2Var.f3832g || (!aVar.f3624a.isUpdated() && !aVar.f3624a.isInvalid())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.f3602p;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Rect rect2 = this.f3591j;
                    rect2.set(0, 0, 0, 0);
                    ((t1) arrayList.get(i11)).getItemOffsets(rect2, view, this, n2Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                aVar.f3626c = false;
                return rect;
            }
        }
        return rect;
    }

    public final boolean Q() {
        return !this.f3612u || this.D || this.f3581e.g();
    }

    public final boolean R() {
        return this.F > 0;
    }

    public final void S(int i11) {
        if (this.f3598n == null) {
            return;
        }
        setScrollState(2);
        this.f3598n.scrollToPosition(i11);
        awakenScrollBars();
    }

    public final void T() {
        int iH = this.f3582f.h();
        for (int i11 = 0; i11 < iH; i11++) {
            ((a) this.f3582f.g(i11).getLayoutParams()).f3626c = true;
        }
        ArrayList arrayList = this.f3579c.f3733c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            a aVar = (a) ((r2) arrayList.get(i12)).itemView.getLayoutParams();
            if (aVar != null) {
                aVar.f3626c = true;
            }
        }
    }

    public final void U(int i11, int i12, boolean z11) {
        int i13 = i11 + i12;
        int iH = this.f3582f.h();
        for (int i14 = 0; i14 < iH; i14++) {
            r2 r2VarO = O(this.f3582f.g(i14));
            if (r2VarO != null && !r2VarO.shouldIgnore()) {
                int i15 = r2VarO.mPosition;
                n2 n2Var = this.f3599n1;
                if (i15 >= i13) {
                    if (J1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i14 + " holder " + r2VarO + " now at position " + (r2VarO.mPosition - i12));
                    }
                    r2VarO.offsetPosition(-i12, z11);
                    n2Var.f3831f = true;
                } else if (i15 >= i11) {
                    if (J1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i14 + " holder " + r2VarO + " now REMOVED");
                    }
                    r2VarO.flagRemovedAndOffsetPosition(i11 - 1, -i12, z11);
                    n2Var.f3831f = true;
                }
            }
        }
        f2 f2Var = this.f3579c;
        ArrayList arrayList = f2Var.f3733c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            r2 r2Var = (r2) arrayList.get(size);
            if (r2Var != null) {
                int i16 = r2Var.mPosition;
                if (i16 >= i13) {
                    if (J1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + r2Var + " now at position " + (r2Var.mPosition - i12));
                    }
                    r2Var.offsetPosition(-i12, z11);
                } else if (i16 >= i11) {
                    r2Var.addFlags(8);
                    f2Var.h(size);
                }
            }
        }
        requestLayout();
    }

    public final void V() {
        this.F++;
    }

    public final void W(boolean z11) {
        int i11;
        AccessibilityManager accessibilityManager;
        int i12 = this.F - 1;
        this.F = i12;
        if (i12 < 1) {
            if (I1 && i12 < 0) {
                com.braze.h2.b("layout or scroll counter cannot go below zero.Some calls are not matching".concat(D()));
                return;
            }
            this.F = 0;
            if (z11) {
                int i13 = this.f3622z;
                this.f3622z = 0;
                if (i13 != 0 && (accessibilityManager = this.B) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(NewHope.SENDB_BYTES);
                    accessibilityEventObtain.setContentChangeTypes(i13);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.A1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    r2 r2Var = (r2) arrayList.get(size);
                    if (r2Var.itemView.getParent() == this && !r2Var.shouldIgnore() && (i11 = r2Var.mPendingAccessibilityState) != -1) {
                        r2Var.itemView.setImportantForAccessibility(i11);
                        r2Var.mPendingAccessibilityState = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void X(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.O) {
            int i11 = actionIndex == 0 ? 1 : 0;
            this.O = motionEvent.getPointerId(i11);
            int x11 = (int) (motionEvent.getX(i11) + 0.5f);
            this.V = x11;
            this.Q = x11;
            int y5 = (int) (motionEvent.getY(i11) + 0.5f);
            this.W = y5;
            this.T = y5;
        }
    }

    public final void Y() {
        if (this.f3611t1 || !this.f3608s) {
            return;
        }
        ViewCompat.U(this, this.B1);
        this.f3611t1 = true;
    }

    public final void Z() {
        boolean z11;
        boolean z12 = false;
        if (this.D) {
            b bVar = this.f3581e;
            bVar.k((ArrayList) bVar.f3665c);
            bVar.k((ArrayList) bVar.f3666d);
            bVar.f3663a = 0;
            if (this.E) {
                this.f3598n.onItemsChanged(this);
            }
        }
        boolean z13 = this.M != null && this.f3598n.supportsPredictiveItemAnimations();
        b bVar2 = this.f3581e;
        if (z13) {
            bVar2.j();
        } else {
            bVar2.c();
        }
        boolean z14 = this.f3605q1 || this.f3607r1;
        boolean z15 = this.f3612u && this.M != null && ((z11 = this.D) || z14 || this.f3598n.mRequestedSimpleAnimations) && (!z11 || this.f3596m.hasStableIds());
        n2 n2Var = this.f3599n1;
        n2Var.f3835j = z15;
        if (z15 && z14 && !this.D && this.M != null && this.f3598n.supportsPredictiveItemAnimations()) {
            z12 = true;
        }
        n2Var.f3836k = z12;
    }

    public final void a0(boolean z11) {
        this.E = z11 | this.E;
        this.D = true;
        int iH = this.f3582f.h();
        for (int i11 = 0; i11 < iH; i11++) {
            r2 r2VarO = O(this.f3582f.g(i11));
            if (r2VarO != null && !r2VarO.shouldIgnore()) {
                r2VarO.addFlags(6);
            }
        }
        T();
        f2 f2Var = this.f3579c;
        ArrayList arrayList = f2Var.f3733c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            r2 r2Var = (r2) arrayList.get(i12);
            if (r2Var != null) {
                r2Var.addFlags(6);
                r2Var.addChangePayload(null);
            }
        }
        l1 l1Var = f2Var.f3738h.f3596m;
        if (l1Var == null || !l1Var.hasStableIds()) {
            f2Var.g();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i11, int i12) {
        y1 y1Var = this.f3598n;
        if (y1Var == null || !y1Var.onAddFocusables(this, arrayList, i11, i12)) {
            super.addFocusables(arrayList, i11, i12);
        }
    }

    public final void b0(r2 r2Var, r1 r1Var) {
        r2Var.setFlags(0, 8192);
        boolean z11 = this.f3599n1.f3833h;
        w2.z zVar = this.f3584g;
        if (z11 && r2Var.isUpdated() && !r2Var.isRemoved() && !r2Var.shouldIgnore()) {
            ((q1.z) zVar.f43084c).h(M(r2Var), r2Var);
        }
        q1.k1 k1Var = (q1.k1) zVar.f43083b;
        e3 e3VarA = (e3) k1Var.get(r2Var);
        if (e3VarA == null) {
            e3VarA = e3.a();
            k1Var.put(r2Var, e3VarA);
        }
        e3VarA.f3722b = r1Var;
        e3VarA.f3721a |= 4;
    }

    public final void c0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.I.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof a) && this.f3598n.checkLayoutParams((a) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        y1 y1Var = this.f3598n;
        if (y1Var != null && y1Var.canScrollHorizontally()) {
            return this.f3598n.computeHorizontalScrollExtent(this.f3599n1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        y1 y1Var = this.f3598n;
        if (y1Var != null && y1Var.canScrollHorizontally()) {
            return this.f3598n.computeHorizontalScrollOffset(this.f3599n1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        y1 y1Var = this.f3598n;
        if (y1Var != null && y1Var.canScrollHorizontally()) {
            return this.f3598n.computeHorizontalScrollRange(this.f3599n1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        y1 y1Var = this.f3598n;
        if (y1Var != null && y1Var.canScrollVertically()) {
            return this.f3598n.computeVerticalScrollExtent(this.f3599n1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        y1 y1Var = this.f3598n;
        if (y1Var != null && y1Var.canScrollVertically()) {
            return this.f3598n.computeVerticalScrollOffset(this.f3599n1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        y1 y1Var = this.f3598n;
        if (y1Var != null && y1Var.canScrollVertically()) {
            return this.f3598n.computeVerticalScrollRange(this.f3599n1);
        }
        return 0;
    }

    public final int d0(float f11, int i11) {
        float height = f11 / getHeight();
        float width = i11 / getWidth();
        EdgeEffect edgeEffect = this.I;
        float f12 = 0.0f;
        if (edgeEffect == null || a.a.B(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.K;
            if (edgeEffect2 != null && a.a.B(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.K;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fG = a.a.G(edgeEffect3, width, height);
                    if (a.a.B(this.K) == 0.0f) {
                        this.K.onRelease();
                    }
                    f12 = fG;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.I;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f13 = -a.a.G(edgeEffect4, -width, 1.0f - height);
                if (a.a.B(this.I) == 0.0f) {
                    this.I.onRelease();
                }
                f12 = f13;
            }
            invalidate();
        }
        return Math.round(f12 * getWidth());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        y1 layoutManager = getLayoutManager();
        int itemCount = 0;
        if (layoutManager != null) {
            if (layoutManager.canScrollVertically()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        l0(0, measuredHeight, false);
                        return true;
                    }
                    l0(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zIsLayoutReversed = layoutManager.isLayoutReversed();
                    if (keyCode == 122) {
                        if (zIsLayoutReversed) {
                            itemCount = getAdapter().getItemCount();
                        }
                    } else if (!zIsLayoutReversed) {
                        itemCount = getAdapter().getItemCount();
                    }
                    m0(itemCount);
                    return true;
                }
            } else if (layoutManager.canScrollHorizontally()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        l0(measuredWidth, 0, false);
                        return true;
                    }
                    l0(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zIsLayoutReversed2 = layoutManager.isLayoutReversed();
                    if (keyCode2 == 122) {
                        if (zIsLayoutReversed2) {
                            itemCount = getAdapter().getItemCount();
                        }
                    } else if (!zIsLayoutReversed2) {
                        itemCount = getAdapter().getItemCount();
                    }
                    m0(itemCount);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f11, float f12, boolean z11) {
        return getScrollingChildHelper().a(f11, f12, z11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f11, float f12) {
        return getScrollingChildHelper().b(f11, f12);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i11, iArr, i12, 0, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr) {
        return getScrollingChildHelper().d(i11, iArr, i12, i13, i14, null, 0);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z11;
        super.draw(canvas);
        ArrayList arrayList = this.f3602p;
        int size = arrayList.size();
        boolean z12 = false;
        for (int i11 = 0; i11 < size; i11++) {
            ((t1) arrayList.get(i11)).onDrawOver(canvas, this, this.f3599n1);
        }
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z11 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f3586h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.I;
            z11 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f3586h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.J;
            z11 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f3586h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.K;
            z11 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.L;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3586h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.L;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z12 = true;
            }
            z11 |= z12;
            canvas.restoreToCount(iSave4);
        }
        if ((z11 || this.M == null || arrayList.size() <= 0 || !this.M.f()) ? z11 : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j9) {
        return super.drawChild(canvas, view, j9);
    }

    public final int e0(float f11, int i11) {
        float width = f11 / getWidth();
        float height = i11 / getHeight();
        EdgeEffect edgeEffect = this.J;
        float f12 = 0.0f;
        if (edgeEffect == null || a.a.B(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.L;
            if (edgeEffect2 != null && a.a.B(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.L;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fG = a.a.G(edgeEffect3, height, 1.0f - width);
                    if (a.a.B(this.L) == 0.0f) {
                        this.L.onRelease();
                    }
                    f12 = fG;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.J;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f13 = -a.a.G(edgeEffect4, -height, width);
                if (a.a.B(this.J) == 0.0f) {
                    this.J.onRelease();
                }
                f12 = f13;
            }
            invalidate();
        }
        return Math.round(f12 * getHeight());
    }

    public final void f0(t1 t1Var) {
        y1 y1Var = this.f3598n;
        if (y1Var != null) {
            y1Var.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f3602p;
        arrayList.remove(t1Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        T();
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x018e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0 A[ADDED_TO_REGION] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f3591j;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof a) {
            a aVar = (a) layoutParams;
            if (!aVar.f3626c) {
                Rect rect2 = aVar.f3625b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f3598n.requestChildRectangleOnScreen(this, view, this.f3591j, !this.f3612u, view2 == null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        y1 y1Var = this.f3598n;
        if (y1Var != null) {
            return y1Var.generateDefaultLayoutParams();
        }
        com.braze.h2.b("RecyclerView has no LayoutManager".concat(D()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        y1 y1Var = this.f3598n;
        if (y1Var != null) {
            return y1Var.generateLayoutParams(getContext(), attributeSet);
        }
        com.braze.h2.b("RecyclerView has no LayoutManager".concat(D()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public l1 getAdapter() {
        return this.f3596m;
    }

    @Override // android.view.View
    public int getBaseline() {
        y1 y1Var = this.f3598n;
        return y1Var != null ? y1Var.getBaseline() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i11, int i12) {
        return super.getChildDrawingOrder(i11, i12);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f3586h;
    }

    public t2 getCompatAccessibilityDelegate() {
        return this.f3613u1;
    }

    @NonNull
    public q1 getEdgeEffectFactory() {
        return this.H;
    }

    public s1 getItemAnimator() {
        return this.M;
    }

    public int getItemDecorationCount() {
        return this.f3602p.size();
    }

    public y1 getLayoutManager() {
        return this.f3598n;
    }

    public int getMaxFlingVelocity() {
        return this.f3585g1;
    }

    public int getMinFlingVelocity() {
        return this.f3583f1;
    }

    public long getNanoTime() {
        if (N1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public a2 getOnFlingListener() {
        return this.t0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3592j1;
    }

    @NonNull
    public e2 getRecycledViewPool() {
        return this.f3579c.c();
    }

    public int getScrollState() {
        return this.N;
    }

    public final void h(r2 r2Var) {
        View view = r2Var.itemView;
        boolean z11 = view.getParent() == this;
        this.f3579c.m(N(view));
        boolean zIsTmpDetached = r2Var.isTmpDetached();
        k kVar = this.f3582f;
        if (zIsTmpDetached) {
            kVar.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z11) {
            kVar.a(view, -1, true);
            return;
        }
        int iIndexOfChild = kVar.f3793a.f3791a.indexOfChild(view);
        if (iIndexOfChild < 0) {
            j4.d.o(view, "view is not a child, cannot hide ");
        } else {
            kVar.f3794b.j(iIndexOfChild);
            kVar.i(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h0(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.h0(int, int, android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(t1 t1Var) {
        y1 y1Var = this.f3598n;
        if (y1Var != null) {
            y1Var.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f3602p;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(t1Var);
        T();
        requestLayout();
    }

    public final void i0(int i11, int i12, int[] iArr) {
        r2 r2Var;
        n0();
        V();
        Trace.beginSection("RV Scroll");
        n2 n2Var = this.f3599n1;
        E(n2Var);
        f2 f2Var = this.f3579c;
        int iScrollHorizontallyBy = i11 != 0 ? this.f3598n.scrollHorizontallyBy(i11, f2Var, n2Var) : 0;
        int iScrollVerticallyBy = i12 != 0 ? this.f3598n.scrollVerticallyBy(i12, f2Var, n2Var) : 0;
        Trace.endSection();
        int iE = this.f3582f.e();
        for (int i13 = 0; i13 < iE; i13++) {
            View viewD = this.f3582f.d(i13);
            r2 r2VarN = N(viewD);
            if (r2VarN != null && (r2Var = r2VarN.mShadowingHolder) != null) {
                View view = r2Var.itemView;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        W(true);
        p0(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f3608s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f3618x;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f21621d;
    }

    public final void j(z1 z1Var) {
        if (this.C == null) {
            this.C = new ArrayList();
        }
        this.C.add(z1Var);
    }

    public final void j0(int i11) {
        if (this.f3618x) {
            return;
        }
        r0();
        y1 y1Var = this.f3598n;
        if (y1Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            y1Var.scrollToPosition(i11);
            awakenScrollBars();
        }
    }

    public final void k(c2 c2Var) {
        if (this.f3603p1 == null) {
            this.f3603p1 = new ArrayList();
        }
        this.f3603p1.add(c2Var);
    }

    public final boolean k0(EdgeEffect edgeEffect, int i11, int i12) {
        if (i11 > 0) {
            return true;
        }
        float fB = a.a.B(edgeEffect) * i12;
        float fAbs = Math.abs(-i11) * 0.35f;
        float f11 = this.f3577a * 0.015f;
        double dLog = Math.log(fAbs / f11);
        double d3 = L1;
        return ((float) (Math.exp((d3 / (d3 - 1.0d)) * dLog) * ((double) f11))) < fB;
    }

    public final void l(String str) {
        if (!R()) {
            if (this.G > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(D()));
            }
        } else if (str == null) {
            com.braze.h2.b("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(D()));
        } else {
            com.braze.h2.b(str);
        }
    }

    public final void l0(int i11, int i12, boolean z11) {
        y1 y1Var = this.f3598n;
        if (y1Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f3618x) {
            return;
        }
        if (!y1Var.canScrollHorizontally()) {
            i11 = 0;
        }
        if (!this.f3598n.canScrollVertically()) {
            i12 = 0;
        }
        if (i11 == 0 && i12 == 0) {
            return;
        }
        if (z11) {
            int i13 = i11 != 0 ? 1 : 0;
            if (i12 != 0) {
                i13 |= 2;
            }
            getScrollingChildHelper().g(i13, 1);
        }
        this.f3594k1.c(i11, i12, Integer.MIN_VALUE, null);
    }

    public final void m0(int i11) {
        if (this.f3618x) {
            return;
        }
        y1 y1Var = this.f3598n;
        if (y1Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            y1Var.smoothScrollToPosition(this, this.f3599n1, i11);
        }
    }

    public final void n() {
        int iH = this.f3582f.h();
        for (int i11 = 0; i11 < iH; i11++) {
            r2 r2VarO = O(this.f3582f.g(i11));
            if (!r2VarO.shouldIgnore()) {
                r2VarO.clearOldPosition();
            }
        }
        f2 f2Var = this.f3579c;
        ArrayList arrayList = f2Var.f3731a;
        ArrayList arrayList2 = f2Var.f3733c;
        int size = arrayList2.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((r2) arrayList2.get(i12)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            ((r2) arrayList.get(i13)).clearOldPosition();
        }
        ArrayList arrayList3 = f2Var.f3732b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i14 = 0; i14 < size3; i14++) {
                ((r2) f2Var.f3732b.get(i14)).clearOldPosition();
            }
        }
    }

    public final void n0() {
        int i11 = this.f3614v + 1;
        this.f3614v = i11;
        if (i11 != 1 || this.f3618x) {
            return;
        }
        this.f3616w = false;
    }

    public final void o(int i11, int i12) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect == null || edgeEffect.isFinished() || i11 <= 0) {
            zIsFinished = false;
        } else {
            this.I.onRelease();
            zIsFinished = this.I.isFinished();
        }
        EdgeEffect edgeEffect2 = this.K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i11 < 0) {
            this.K.onRelease();
            zIsFinished |= this.K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i12 > 0) {
            this.J.onRelease();
            zIsFinished |= this.J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.L;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i12 < 0) {
            this.L.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(int i11) {
        boolean zCanScrollHorizontally = this.f3598n.canScrollHorizontally();
        int i12 = zCanScrollHorizontally;
        if (this.f3598n.canScrollVertically()) {
            i12 = (zCanScrollHorizontally ? 1 : 0) | 2;
        }
        getScrollingChildHelper().g(i12, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.F = r0
            r1 = 1
            r5.f3608s = r1
            boolean r2 = r5.f3612u
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.f3612u = r1
            androidx.recyclerview.widget.f2 r1 = r5.f3579c
            r1.e()
            androidx.recyclerview.widget.y1 r1 = r5.f3598n
            if (r1 == 0) goto L23
            r1.dispatchAttachedToWindow(r5)
        L23:
            r5.f3611t1 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.N1
            if (r0 == 0) goto L79
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.h0.f3755e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.h0 r1 = (androidx.recyclerview.widget.h0) r1
            r5.f3595l1 = r1
            if (r1 != 0) goto L61
            androidx.recyclerview.widget.h0 r1 = new androidx.recyclerview.widget.h0
            r1.<init>()
            r5.f3595l1 = r1
            android.view.Display r1 = androidx.core.view.ViewCompat.n(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L53
            if (r1 == 0) goto L53
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L53
            goto L55
        L53:
            r1 = 1114636288(0x42700000, float:60.0)
        L55:
            androidx.recyclerview.widget.h0 r2 = r5.f3595l1
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f3759c = r3
            r0.set(r2)
        L61:
            androidx.recyclerview.widget.h0 r0 = r5.f3595l1
            java.util.ArrayList r0 = r0.f3757a
            boolean r1 = androidx.recyclerview.widget.RecyclerView.I1
            if (r1 == 0) goto L76
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L70
            goto L76
        L70:
            java.lang.String r0 = "RecyclerView already present in worker list!"
            com.braze.h2.b(r0)
            return
        L76:
            r0.add(r5)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        h0 h0Var;
        super.onDetachedFromWindow();
        s1 s1Var = this.M;
        if (s1Var != null) {
            s1Var.e();
        }
        r0();
        this.f3608s = false;
        y1 y1Var = this.f3598n;
        f2 f2Var = this.f3579c;
        if (y1Var != null) {
            y1Var.dispatchDetachedFromWindow(this, f2Var);
        }
        this.A1.clear();
        removeCallbacks(this.B1);
        this.f3584g.getClass();
        while (e3.f3720d.a() != null) {
        }
        ArrayList arrayList = f2Var.f3733c;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            o00.h0.q(((r2) arrayList.get(i11)).itemView);
        }
        f2Var.f(f2Var.f3738h.f3596m, false);
        Iterator it = new h7.z0(this).iterator();
        while (true) {
            h7.a1 a1Var = (h7.a1) it;
            if (!a1Var.hasNext()) {
                break;
            }
            ArrayList arrayList2 = o00.h0.y((View) a1Var.next()).f44024a;
            for (int iG = kotlin.collections.d0.g(arrayList2); -1 < iG; iG--) {
                ((m3) arrayList2.get(iG)).f7292a.d();
            }
        }
        if (!N1 || (h0Var = this.f3595l1) == null) {
            return;
        }
        boolean zRemove = h0Var.f3757a.remove(this);
        if (!I1 || zRemove) {
            this.f3595l1 = null;
        } else {
            com.braze.h2.b("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f3602p;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((t1) arrayList.get(i11)).onDraw(canvas, this, this.f3599n1);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i11;
        boolean z11;
        if (this.f3598n != null && !this.f3618x && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                float f11 = this.f3598n.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f3598n.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
                i11 = 0;
                z11 = false;
                f = f11;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.f3598n.canScrollVertically()) {
                    float f12 = -axisValue;
                    axisValue = 0.0f;
                    f = f12;
                } else if (!this.f3598n.canScrollHorizontally()) {
                    axisValue = 0.0f;
                }
                i11 = 26;
                z11 = this.F1;
            } else {
                axisValue = 0.0f;
                i11 = 0;
                z11 = false;
            }
            int i12 = (int) (f * this.f3590i1);
            int i13 = (int) (axisValue * this.f3588h1);
            if (z11) {
                OverScroller overScroller = this.f3594k1.f3882c;
                l0((overScroller.getFinalX() - overScroller.getCurrX()) + i13, (overScroller.getFinalY() - overScroller.getCurrY()) + i12, true);
            } else {
                y1 y1Var = this.f3598n;
                if (y1Var == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.f3618x) {
                    int[] iArr = this.f3623z1;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zCanScrollHorizontally = y1Var.canScrollHorizontally();
                    boolean zCanScrollVertically = this.f3598n.canScrollVertically();
                    int i14 = zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0;
                    float y5 = motionEvent.getY();
                    float x11 = motionEvent.getX();
                    int iD0 = i13 - d0(y5, i13);
                    int iE0 = i12 - e0(x11, i12);
                    getScrollingChildHelper().g(i14, 1);
                    if (w(zCanScrollHorizontally ? iD0 : 0, this.f3623z1, zCanScrollVertically ? iE0 : 0, 1, this.f3619x1)) {
                        iD0 -= iArr[0];
                        iE0 -= iArr[1];
                    }
                    h0(zCanScrollHorizontally ? iD0 : 0, zCanScrollVertically ? iE0 : 0, motionEvent, 1);
                    h0 h0Var = this.f3595l1;
                    if (h0Var != null && (iD0 != 0 || iE0 != 0)) {
                        h0Var.a(this, iD0, iE0);
                    }
                    q0(1);
                }
            }
            if (i11 != 0 && !z11) {
                this.H1.a(motionEvent, i11);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        boolean z12;
        if (!this.f3618x) {
            this.f3606r = null;
            if (G(motionEvent)) {
                VelocityTracker velocityTracker = this.P;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                q0(0);
                c0();
                setScrollState(0);
                return true;
            }
            y1 y1Var = this.f3598n;
            if (y1Var != null) {
                boolean zCanScrollHorizontally = y1Var.canScrollHorizontally();
                boolean zCanScrollVertically = this.f3598n.canScrollVertically();
                if (this.P == null) {
                    this.P = VelocityTracker.obtain();
                }
                this.P.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f3620y) {
                        this.f3620y = false;
                    }
                    this.O = motionEvent.getPointerId(0);
                    int x11 = (int) (motionEvent.getX() + 0.5f);
                    this.V = x11;
                    this.Q = x11;
                    int y5 = (int) (motionEvent.getY() + 0.5f);
                    this.W = y5;
                    this.T = y5;
                    EdgeEffect edgeEffect = this.I;
                    if (edgeEffect == null || a.a.B(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z11 = false;
                    } else {
                        a.a.G(this.I, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z11 = true;
                    }
                    EdgeEffect edgeEffect2 = this.K;
                    if (edgeEffect2 != null && a.a.B(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        a.a.G(this.K, 0.0f, motionEvent.getY() / getHeight());
                        z11 = true;
                    }
                    EdgeEffect edgeEffect3 = this.J;
                    if (edgeEffect3 != null && a.a.B(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        a.a.G(this.J, 0.0f, motionEvent.getX() / getWidth());
                        z11 = true;
                    }
                    EdgeEffect edgeEffect4 = this.L;
                    if (edgeEffect4 != null && a.a.B(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        a.a.G(this.L, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z11 = true;
                    }
                    if (z11 || this.N == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        q0(1);
                    }
                    int[] iArr = this.f3621y1;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    o0(0);
                } else if (actionMasked == 1) {
                    this.P.clear();
                    q0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.O);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.O + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x12 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y6 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.N != 1) {
                        int i11 = x12 - this.Q;
                        int i12 = y6 - this.T;
                        if (!zCanScrollHorizontally || Math.abs(i11) <= this.f3587h0) {
                            z12 = false;
                        } else {
                            this.V = x12;
                            z12 = true;
                        }
                        if (zCanScrollVertically && Math.abs(i12) > this.f3587h0) {
                            this.W = y6;
                            z12 = true;
                        }
                        if (z12) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.P;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    q0(0);
                    c0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.O = motionEvent.getPointerId(actionIndex);
                    int x13 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.V = x13;
                    this.Q = x13;
                    int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.W = y11;
                    this.T = y11;
                } else if (actionMasked == 6) {
                    X(motionEvent);
                }
                if (this.N == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        Trace.beginSection("RV OnLayout");
        t();
        Trace.endSection();
        this.f3612u = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        y1 y1Var = this.f3598n;
        if (y1Var == null) {
            r(i11, i12);
            return;
        }
        boolean zIsAutoMeasureEnabled = y1Var.isAutoMeasureEnabled();
        f2 f2Var = this.f3579c;
        boolean z11 = false;
        n2 n2Var = this.f3599n1;
        if (zIsAutoMeasureEnabled) {
            int mode = View.MeasureSpec.getMode(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            this.f3598n.onMeasure(f2Var, n2Var, i11, i12);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z11 = true;
            }
            this.C1 = z11;
            if (z11 || this.f3596m == null) {
                return;
            }
            if (n2Var.f3829d == 1) {
                u();
            }
            this.f3598n.setMeasureSpecs(i11, i12);
            n2Var.f3834i = true;
            v();
            this.f3598n.setMeasuredDimensionFromChildren(i11, i12);
            if (this.f3598n.shouldMeasureTwice()) {
                this.f3598n.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                n2Var.f3834i = true;
                v();
                this.f3598n.setMeasuredDimensionFromChildren(i11, i12);
            }
            this.D1 = getMeasuredWidth();
            this.E1 = getMeasuredHeight();
            return;
        }
        if (this.f3610t) {
            this.f3598n.onMeasure(f2Var, n2Var, i11, i12);
            return;
        }
        if (this.A) {
            n0();
            V();
            Z();
            W(true);
            if (n2Var.f3836k) {
                n2Var.f3832g = true;
            } else {
                this.f3581e.c();
                n2Var.f3832g = false;
            }
            this.A = false;
            p0(false);
        } else if (n2Var.f3836k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        l1 l1Var = this.f3596m;
        if (l1Var != null) {
            n2Var.f3830e = l1Var.getItemCount();
        } else {
            n2Var.f3830e = 0;
        }
        n0();
        this.f3598n.onMeasure(f2Var, n2Var, i11, i12);
        p0(false);
        n2Var.f3832g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i11, Rect rect) {
        if (R()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i11, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j2 j2Var = (j2) parcelable;
        this.f3580d = j2Var;
        super.onRestoreInstanceState(j2Var.f45418a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j2 j2Var = new j2(super.onSaveInstanceState());
        j2 j2Var2 = this.f3580d;
        if (j2Var2 != null) {
            j2Var.f3792c = j2Var2.f3792c;
            return j2Var;
        }
        y1 y1Var = this.f3598n;
        if (y1Var != null) {
            j2Var.f3792c = y1Var.onSaveInstanceState();
            return j2Var;
        }
        j2Var.f3792c = null;
        return j2Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 == i13 && i12 == i14) {
            return;
        }
        this.L = null;
        this.J = null;
        this.K = null;
        this.I = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x010f A[PHI: r1
      0x010f: PHI (r1v47 int) = (r1v31 int), (r1v51 int) binds: [B:56:0x00fa, B:61:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p0(boolean z11) {
        if (this.f3614v < 1) {
            if (I1) {
                com.braze.h2.b("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(D()));
                return;
            }
            this.f3614v = 1;
        }
        if (!z11 && !this.f3618x) {
            this.f3616w = false;
        }
        if (this.f3614v == 1) {
            if (z11 && this.f3616w && !this.f3618x && this.f3598n != null && this.f3596m != null) {
                t();
            }
            if (!this.f3618x) {
                this.f3616w = false;
            }
        }
        this.f3614v--;
    }

    public final void q() {
        if (!this.f3612u || this.D) {
            Trace.beginSection("RV FullInvalidate");
            t();
            Trace.endSection();
            return;
        }
        if (this.f3581e.g()) {
            b bVar = this.f3581e;
            int i11 = bVar.f3663a;
            if ((i11 & 4) == 0 || (i11 & 11) != 0) {
                if (bVar.g()) {
                    Trace.beginSection("RV FullInvalidate");
                    t();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            n0();
            V();
            this.f3581e.j();
            if (!this.f3616w) {
                int iE = this.f3582f.e();
                int i12 = 0;
                while (true) {
                    if (i12 < iE) {
                        r2 r2VarO = O(this.f3582f.d(i12));
                        if (r2VarO != null && !r2VarO.shouldIgnore() && r2VarO.isUpdated()) {
                            t();
                            break;
                        }
                        i12++;
                    } else {
                        this.f3581e.b();
                        break;
                    }
                }
            }
            p0(true);
            W(true);
            Trace.endSection();
        }
    }

    public final void q0(int i11) {
        getScrollingChildHelper().h(i11);
    }

    public final void r(int i11, int i12) {
        setMeasuredDimension(y1.chooseSize(i11, getPaddingRight() + getPaddingLeft(), ViewCompat.u(this)), y1.chooseSize(i12, getPaddingBottom() + getPaddingTop(), ViewCompat.t(this)));
    }

    public final void r0() {
        setScrollState(0);
        q2 q2Var = this.f3594k1;
        q2Var.f3886g.removeCallbacks(q2Var);
        q2Var.f3882c.abortAnimation();
        y1 y1Var = this.f3598n;
        if (y1Var != null) {
            y1Var.stopSmoothScroller();
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z11) {
        r2 r2VarO = O(view);
        if (r2VarO != null) {
            if (r2VarO.isTmpDetached()) {
                r2VarO.clearTmpDetachFlag();
            } else if (!r2VarO.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(r2VarO);
                j4.d.p(sb2, D());
                return;
            }
        } else if (I1) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            j4.d.p(sb3, D());
            return;
        }
        view.clearAnimation();
        s(view);
        super.removeDetachedView(view, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f3598n.onRequestChildFocus(this, this.f3599n1, view, view2) && view2 != null) {
            g0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        return this.f3598n.requestChildRectangleOnScreen(this, view, rect, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z11) {
        ArrayList arrayList = this.f3604q;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((b2) arrayList.get(i11)).e(z11);
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3614v != 0 || this.f3618x) {
            this.f3616w = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(View view) {
        r2 r2VarO = O(view);
        l1 l1Var = this.f3596m;
        if (l1Var != null && r2VarO != null) {
            l1Var.onViewDetachedFromWindow(r2VarO);
        }
        ArrayList arrayList = this.C;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((z1) this.C.get(size)).b(view);
            }
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i11, int i12) {
        y1 y1Var = this.f3598n;
        if (y1Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f3618x) {
            return;
        }
        boolean zCanScrollHorizontally = y1Var.canScrollHorizontally();
        boolean zCanScrollVertically = this.f3598n.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i11 = 0;
            }
            if (!zCanScrollVertically) {
                i12 = 0;
            }
            h0(i11, i12, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i11, int i12) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!R()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f3622z |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(t2 t2Var) {
        this.f3613u1 = t2Var;
        ViewCompat.b0(this, t2Var);
    }

    public void setAdapter(l1 l1Var) {
        setLayoutFrozen(false);
        l1 l1Var2 = this.f3596m;
        h2 h2Var = this.f3578b;
        if (l1Var2 != null) {
            l1Var2.unregisterAdapterDataObserver(h2Var);
            this.f3596m.onDetachedFromRecyclerView(this);
        }
        s1 s1Var = this.M;
        if (s1Var != null) {
            s1Var.e();
        }
        y1 y1Var = this.f3598n;
        f2 f2Var = this.f3579c;
        if (y1Var != null) {
            y1Var.removeAndRecycleAllViews(f2Var);
            this.f3598n.removeAndRecycleScrapInt(f2Var);
        }
        f2Var.f3731a.clear();
        f2Var.g();
        b bVar = this.f3581e;
        bVar.k((ArrayList) bVar.f3665c);
        bVar.k((ArrayList) bVar.f3666d);
        bVar.f3663a = 0;
        l1 l1Var3 = this.f3596m;
        this.f3596m = l1Var;
        if (l1Var != null) {
            l1Var.registerAdapterDataObserver(h2Var);
            l1Var.onAttachedToRecyclerView(this);
        }
        y1 y1Var2 = this.f3598n;
        if (y1Var2 != null) {
            y1Var2.onAdapterChanged(l1Var3, this.f3596m);
        }
        l1 l1Var4 = this.f3596m;
        f2Var.f3731a.clear();
        f2Var.g();
        f2Var.f(l1Var3, true);
        e2 e2VarC = f2Var.c();
        if (l1Var3 != null) {
            e2VarC.f3718b--;
        }
        if (e2VarC.f3718b == 0) {
            SparseArray sparseArray = e2VarC.f3717a;
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                d2 d2Var = (d2) sparseArray.valueAt(i11);
                Iterator it = d2Var.f3685a.iterator();
                while (it.hasNext()) {
                    o00.h0.q(((r2) it.next()).itemView);
                }
                d2Var.f3685a.clear();
            }
        }
        if (l1Var4 != null) {
            e2VarC.f3718b++;
        }
        f2Var.e();
        this.f3599n1.f3831f = true;
        a0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(p1 p1Var) {
        if (p1Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z11) {
        if (z11 != this.f3586h) {
            this.L = null;
            this.J = null;
            this.K = null;
            this.I = null;
        }
        this.f3586h = z11;
        super.setClipToPadding(z11);
        if (this.f3612u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull q1 q1Var) {
        q1Var.getClass();
        this.H = q1Var;
        this.L = null;
        this.J = null;
        this.K = null;
        this.I = null;
    }

    public void setHasFixedSize(boolean z11) {
        this.f3610t = z11;
    }

    public void setItemAnimator(s1 s1Var) {
        s1 s1Var2 = this.M;
        if (s1Var2 != null) {
            s1Var2.e();
            this.M.f3912a = null;
        }
        this.M = s1Var;
        if (s1Var != null) {
            s1Var.f3912a = this.f3609s1;
        }
    }

    public void setItemViewCacheSize(int i11) {
        f2 f2Var = this.f3579c;
        f2Var.f3735e = i11;
        f2Var.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z11) {
        suppressLayout(z11);
    }

    public void setLayoutManager(y1 y1Var) {
        RecyclerView recyclerView;
        if (y1Var == this.f3598n) {
            return;
        }
        r0();
        y1 y1Var2 = this.f3598n;
        f2 f2Var = this.f3579c;
        if (y1Var2 != null) {
            s1 s1Var = this.M;
            if (s1Var != null) {
                s1Var.e();
            }
            this.f3598n.removeAndRecycleAllViews(f2Var);
            this.f3598n.removeAndRecycleScrapInt(f2Var);
            f2Var.f3731a.clear();
            f2Var.g();
            if (this.f3608s) {
                this.f3598n.dispatchDetachedFromWindow(this, f2Var);
            }
            this.f3598n.setRecyclerView(null);
            this.f3598n = null;
        } else {
            f2Var.f3731a.clear();
            f2Var.g();
        }
        k kVar = this.f3582f;
        kVar.f3794b.i();
        ArrayList arrayList = kVar.f3795c;
        int size = arrayList.size();
        while (true) {
            size--;
            recyclerView = kVar.f3793a.f3791a;
            if (size < 0) {
                break;
            }
            r2 r2VarO = O((View) arrayList.get(size));
            if (r2VarO != null) {
                r2VarO.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            recyclerView.s(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f3598n = y1Var;
        if (y1Var != null) {
            if (y1Var.mRecyclerView != null) {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(y1Var);
                m0.i1.m(sb2, " is already attached to a RecyclerView:", y1Var.mRecyclerView.D());
                return;
            } else {
                y1Var.setRecyclerView(this);
                if (this.f3608s) {
                    this.f3598n.dispatchAttachedToWindow(this);
                }
            }
        }
        f2Var.n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            i4.a.f("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z11) {
        h7.t scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f21621d) {
            ViewCompat.r0(scrollingChildHelper.f21620c);
        }
        scrollingChildHelper.f21621d = z11;
    }

    public void setOnFlingListener(a2 a2Var) {
        this.t0 = a2Var;
    }

    @Deprecated
    public void setOnScrollListener(c2 c2Var) {
        this.f3601o1 = c2Var;
    }

    public void setPreserveFocusAfterLayout(boolean z11) {
        this.f3592j1 = z11;
    }

    public void setRecycledViewPool(e2 e2Var) {
        f2 f2Var = this.f3579c;
        RecyclerView recyclerView = f2Var.f3738h;
        f2Var.f(recyclerView.f3596m, false);
        if (f2Var.f3737g != null) {
            r2.f3718b--;
        }
        f2Var.f3737g = e2Var;
        if (e2Var != null && recyclerView.getAdapter() != null) {
            f2Var.f3737g.f3718b++;
        }
        f2Var.e();
    }

    public void setScrollState(int i11) {
        if (i11 == this.N) {
            return;
        }
        if (J1) {
            StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "setting scroll state to ", " from ");
            sbK.append(this.N);
            Log.d("RecyclerView", sbK.toString(), new Exception());
        }
        this.N = i11;
        if (i11 != 2) {
            q2 q2Var = this.f3594k1;
            q2Var.f3886g.removeCallbacks(q2Var);
            q2Var.f3882c.abortAnimation();
            y1 y1Var = this.f3598n;
            if (y1Var != null) {
                y1Var.stopSmoothScroller();
            }
        }
        y1 y1Var2 = this.f3598n;
        if (y1Var2 != null) {
            y1Var2.onScrollStateChanged(i11);
        }
        c2 c2Var = this.f3601o1;
        if (c2Var != null) {
            c2Var.onScrollStateChanged(this, i11);
        }
        ArrayList arrayList = this.f3603p1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((c2) this.f3603p1.get(size)).onScrollStateChanged(this, i11);
            }
        }
    }

    public void setScrollingTouchSlop(int i11) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i11 != 0) {
            if (i11 == 1) {
                this.f3587h0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i11 + "; using default value");
        }
        this.f3587h0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(p2 p2Var) {
        this.f3579c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i11) {
        return getScrollingChildHelper().g(i11, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z11) {
        if (z11 != this.f3618x) {
            l("Do not suppressLayout in layout or scroll");
            if (z11) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f3618x = true;
                this.f3620y = true;
                r0();
                return;
            }
            this.f3618x = false;
            if (this.f3616w && this.f3598n != null && this.f3596m != null) {
                requestLayout();
            }
            this.f3616w = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03b4  */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            Method dump skipped, instruction units count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t():void");
    }

    public final void u() {
        e3 e3Var;
        View viewF;
        n2 n2Var = this.f3599n1;
        n2Var.a(1);
        E(n2Var);
        n2Var.f3834i = false;
        n0();
        w2.z zVar = this.f3584g;
        q1.k1 k1Var = (q1.k1) zVar.f43083b;
        q1.k1 k1Var2 = (q1.k1) zVar.f43083b;
        k1Var.clear();
        q1.z zVar2 = (q1.z) zVar.f43084c;
        zVar2.a();
        V();
        Z();
        r2 r2VarN = null;
        View focusedChild = (this.f3592j1 && hasFocus() && this.f3596m != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewF = F(focusedChild)) != null) {
            r2VarN = N(viewF);
        }
        if (r2VarN == null) {
            n2Var.f3837m = -1L;
            n2Var.l = -1;
            n2Var.f3838n = -1;
        } else {
            n2Var.f3837m = this.f3596m.hasStableIds() ? r2VarN.getItemId() : -1L;
            n2Var.l = this.D ? -1 : r2VarN.isRemoved() ? r2VarN.mOldPosition : r2VarN.getAbsoluteAdapterPosition();
            View focusedChild2 = r2VarN.itemView;
            int id2 = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id2 = focusedChild2.getId();
                }
            }
            n2Var.f3838n = id2;
        }
        n2Var.f3833h = n2Var.f3835j && this.f3607r1;
        this.f3607r1 = false;
        this.f3605q1 = false;
        n2Var.f3832g = n2Var.f3836k;
        n2Var.f3830e = this.f3596m.getItemCount();
        H(this.f3615v1);
        if (n2Var.f3835j) {
            int iE = this.f3582f.e();
            for (int i11 = 0; i11 < iE; i11++) {
                r2 r2VarO = O(this.f3582f.d(i11));
                if (!r2VarO.shouldIgnore() && (!r2VarO.isInvalid() || this.f3596m.hasStableIds())) {
                    s1 s1Var = this.M;
                    s1.b(r2VarO);
                    r2VarO.getUnmodifiedPayloads();
                    s1Var.getClass();
                    r1 r1Var = new r1();
                    r1Var.a(r2VarO);
                    e3 e3VarA = (e3) k1Var2.get(r2VarO);
                    if (e3VarA == null) {
                        e3VarA = e3.a();
                        k1Var2.put(r2VarO, e3VarA);
                    }
                    e3VarA.f3722b = r1Var;
                    e3VarA.f3721a |= 4;
                    if (n2Var.f3833h && r2VarO.isUpdated() && !r2VarO.isRemoved() && !r2VarO.shouldIgnore() && !r2VarO.isInvalid()) {
                        zVar2.h(M(r2VarO), r2VarO);
                    }
                }
            }
        }
        if (n2Var.f3836k) {
            int iH = this.f3582f.h();
            for (int i12 = 0; i12 < iH; i12++) {
                r2 r2VarO2 = O(this.f3582f.g(i12));
                if (I1 && r2VarO2.mPosition == -1 && !r2VarO2.isRemoved()) {
                    com.braze.h2.b("view holder cannot have position -1 unless it is removed".concat(D()));
                    return;
                } else {
                    if (!r2VarO2.shouldIgnore()) {
                        r2VarO2.saveOldPosition();
                    }
                }
            }
            boolean z11 = n2Var.f3831f;
            n2Var.f3831f = false;
            this.f3598n.onLayoutChildren(this.f3579c, n2Var);
            n2Var.f3831f = z11;
            for (int i13 = 0; i13 < this.f3582f.e(); i13++) {
                r2 r2VarO3 = O(this.f3582f.d(i13));
                if (!r2VarO3.shouldIgnore() && ((e3Var = (e3) k1Var2.get(r2VarO3)) == null || (e3Var.f3721a & 4) == 0)) {
                    s1.b(r2VarO3);
                    boolean zHasAnyOfTheFlags = r2VarO3.hasAnyOfTheFlags(8192);
                    s1 s1Var2 = this.M;
                    r2VarO3.getUnmodifiedPayloads();
                    s1Var2.getClass();
                    r1 r1Var2 = new r1();
                    r1Var2.a(r2VarO3);
                    if (zHasAnyOfTheFlags) {
                        b0(r2VarO3, r1Var2);
                    } else {
                        e3 e3VarA2 = (e3) k1Var2.get(r2VarO3);
                        if (e3VarA2 == null) {
                            e3VarA2 = e3.a();
                            k1Var2.put(r2VarO3, e3VarA2);
                        }
                        e3VarA2.f3721a |= 2;
                        e3VarA2.f3722b = r1Var2;
                    }
                }
            }
            n();
        } else {
            n();
        }
        W(true);
        p0(false);
        n2Var.f3829d = 2;
    }

    public final void v() {
        n0();
        V();
        n2 n2Var = this.f3599n1;
        n2Var.a(6);
        this.f3581e.c();
        n2Var.f3830e = this.f3596m.getItemCount();
        n2Var.f3828c = 0;
        if (this.f3580d != null && this.f3596m.canRestoreState()) {
            Parcelable parcelable = this.f3580d.f3792c;
            if (parcelable != null) {
                this.f3598n.onRestoreInstanceState(parcelable);
            }
            this.f3580d = null;
        }
        n2Var.f3832g = false;
        this.f3598n.onLayoutChildren(this.f3579c, n2Var);
        n2Var.f3831f = false;
        n2Var.f3835j = n2Var.f3835j && this.M != null;
        n2Var.f3829d = 4;
        W(true);
        p0(false);
    }

    public final boolean w(int i11, int[] iArr, int i12, int i13, int[] iArr2) {
        return getScrollingChildHelper().c(i11, iArr, i12, i13, iArr2);
    }

    public final void x(int i11, int[] iArr, int i12, int i13, int i14, int[] iArr2, int i15) {
        getScrollingChildHelper().d(i11, iArr, i12, i13, i14, iArr2, i15);
    }

    public final void y(int i11, int i12) {
        this.G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i11, scrollY - i12);
        c2 c2Var = this.f3601o1;
        if (c2Var != null) {
            c2Var.onScrolled(this, i11, i12);
        }
        ArrayList arrayList = this.f3603p1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((c2) this.f3603p1.get(size)).onScrolled(this, i11, i12);
            }
        }
        this.G--;
    }

    public final void z() {
        if (this.L != null) {
            return;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = this.H.createEdgeEffect(this, 3);
        this.L = edgeEffectCreateEdgeEffect;
        if (this.f3586h) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r2 f3624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f3625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f3626c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f3627d;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3625b = new Rect();
            this.f3626c = true;
            this.f3627d = false;
        }

        public a(int i11, int i12) {
            super(i11, i12);
            this.f3625b = new Rect();
            this.f3626c = true;
            this.f3627d = false;
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3625b = new Rect();
            this.f3626c = true;
            this.f3627d = false;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3625b = new Rect();
            this.f3626c = true;
            this.f3627d = false;
        }

        public a(a aVar) {
            super((ViewGroup.LayoutParams) aVar);
            this.f3625b = new Rect();
            this.f3626c = true;
            this.f3627d = false;
        }
    }

    @Deprecated
    public void setRecyclerListener(g2 g2Var) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        y1 y1Var = this.f3598n;
        if (y1Var != null) {
            return y1Var.generateLayoutParams(layoutParams);
        }
        com.braze.h2.b("RecyclerView has no LayoutManager".concat(D()));
        return null;
    }

    public RecyclerView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.app.tgtg.R.attr.recyclerViewStyle);
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }
}
