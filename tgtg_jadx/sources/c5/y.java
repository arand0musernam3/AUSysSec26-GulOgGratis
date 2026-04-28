package c5;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.node.Owner;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import com.app.tgtg.R;
import com.app.tgtg.model.local.AppConstants;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends ViewGroup implements Owner, b5.k2, w4.h, androidx.lifecycle.h, b5.b2, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, g4.j {
    public static Class Q1;
    public static Method R1;
    public static Method S1;
    public static final q1.o0 T1 = new q1.o0();
    public static bx.c U1;
    public static Method V1;
    public final h A;
    public MotionEvent A1;
    public final i4.e B;
    public long B1;
    public final c4.l C;
    public final w2.z C1;
    public final q1.o0 D;
    public final q1.o0 D1;
    public q1.o0 E;
    public float E1;
    public boolean F;
    public float F1;
    public boolean G;
    public final a8.f G1;
    public final w4.j H;
    public final k H1;
    public final ae.c I;
    public boolean I1;
    public final m3.k1 J;
    public final i2 J1;
    public final com.google.firebase.messaging.a0 K;
    public final t K1;
    public final c4.d L;
    public final o1 L1;
    public boolean M;
    public boolean M1;
    public final j N;
    public final h7.c N1;
    public final i O;
    public View O1;
    public final b5.f2 P;
    public final u P1;
    public boolean Q;
    public i1 T;
    public z5.a V;
    public boolean W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f7431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t4.a f7433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b5.o0 f7434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r2 f7435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s2 f7436f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final int[] f7437f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w3.c f7438g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final float[] f7439g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kotlin.collections.t f7440h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final b5.c1 f7441h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final float[] f7442h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f7443i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final float[] f7444i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m3.k1 f7445j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public long f7446j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f7447k;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f7448k1;
    public final boolean l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public long f7449l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g4.p f7450m;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public final m3.k1 f7451m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CoroutineContext f7452n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final m3.i0 f7453n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e4.b f7454o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public Function1 f7455o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q2 f7456p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final r5.c0 f7457p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i4.u f7458q;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public final r5.z f7459q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g1 f7460r;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public final AtomicReference f7461r1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z4.s f7462s;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public final z1 f7463s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b5.m0 f7464t;
    public long t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public final j2 f7465t1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final q1.g0 f7466u;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public final m3.k1 f7467u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k5.b f7468v;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public final m3.k1 f7469v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f7470w;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public final y1 f7471w1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j5.v f7472x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public final s4.c f7473x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f0 f7474y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public final a5.b f7475y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public d4.e f7476z;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public final y0 f7477z1;

    public y(Context context, CoroutineContext coroutineContext) {
        super(context);
        this.f7431a = 9205357640488583168L;
        int i11 = 1;
        this.f7432b = true;
        this.f7434d = new b5.o0();
        this.f7438g = w3.a.f43092a;
        this.f7440h = new kotlin.collections.t();
        int i12 = 0;
        this.f7443i = new k(this, i12);
        z5.e eVarD = xz.b.d(context);
        m3.f fVar = m3.f.f29273e;
        this.f7445j = new m3.k1(eVarD, fVar);
        int i13 = Build.VERSION.SDK_INT;
        boolean z11 = i13 >= 35;
        this.l = z11;
        j5.f fVar2 = new j5.f();
        this.f7450m = new g4.p(this, this);
        this.f7452n = coroutineContext;
        this.f7454o = new e4.b(new q(3, this, y.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0, 0));
        this.f7456p = new q2();
        this.f7458q = new i4.u();
        this.f7460r = new g1(ViewConfiguration.get(context));
        this.f7462s = new z4.s();
        b5.m0 m0Var = new b5.m0(3);
        m0Var.f0(z4.p1.f47197b);
        m0Var.c0(getDensity());
        m0Var.h0(getViewConfiguration());
        m0Var.g0(new w(this).then(((g4.p) getFocusOwner()).f19966e).then(m67getDragAndDropManager().f15730c));
        this.f7464t = m0Var;
        q1.g0 g0Var = q1.p.f35804a;
        this.f7466u = new q1.g0();
        m68getLayoutNodes();
        this.f7468v = new k5.b();
        this.f7470w = this;
        this.f7472x = new j5.v(getRoot(), fVar2, m68getLayoutNodes());
        f0 f0Var = new f0(this);
        this.f7474y = f0Var;
        this.f7476z = new d4.e(this, new b40.d(0, this, p0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 3));
        this.A = new h(context);
        this.B = new i4.e(this);
        this.C = new c4.l();
        this.D = new q1.o0();
        this.H = new w4.j();
        b5.m0 root = getRoot();
        ae.c cVar = new ae.c();
        cVar.f1243b = root;
        cVar.f1244c = new w4.c(root.G.f5857c);
        cVar.f1245d = new m1.a(25);
        cVar.f1246e = new b5.v();
        this.I = cVar;
        this.J = m3.i.w(new Configuration(context.getResources().getConfiguration()));
        this.K = new com.google.firebase.messaging.a0(this, getAutofillTree());
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw b3.i.D("Autofill service could not be located.");
        }
        this.L = new c4.d(new se.b(autofillManager, 9), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.N = new j(context);
        this.O = new i(m66getClipboardManager());
        this.P = new b5.f2(new o(this, i));
        this.f7441h0 = new b5.c1(getRoot());
        long j9 = Integer.MAX_VALUE;
        this.t0 = (j9 & 4294967295L) | (j9 << 32);
        this.f7437f1 = new int[]{0, 0};
        float[] fArrA = i4.l0.a();
        this.f7439g1 = fArrA;
        this.f7442h1 = i4.l0.a();
        this.f7444i1 = i4.l0.a();
        this.f7446j1 = -1L;
        this.f7449l1 = 9187343241974906880L;
        this.f7451m1 = m3.i.w(null);
        this.f7453n1 = m3.i.q(new t(this, i));
        r5.c0 c0Var = new r5.c0(getView(), this);
        this.f7457p1 = c0Var;
        p0.f7315a.getClass();
        this.f7459q1 = new r5.z(c0Var);
        this.f7461r1 = new AtomicReference(null);
        this.f7463s1 = new z1(getTextInputService());
        this.f7465t1 = new j2();
        this.f7467u1 = new m3.k1(na0.a.g0(context), fVar);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = g4.h.f19944a;
        z5.m mVar = layoutDirection != 0 ? layoutDirection != 1 ? null : z5.m.Rtl : z5.m.Ltr;
        this.f7469v1 = m3.i.w(mVar == null ? z5.m.Ltr : mVar);
        this.f7471w1 = new y1(i11, this);
        this.f7473x1 = new s4.c(isInTouchMode() ? 1 : 2, new o(this, i12));
        a5.b bVar = new a5.b();
        new o3.e(new b5.c[16], 0);
        new o3.e(new se.b[16], 0);
        new o3.e(new b5.m0[16], 0);
        new o3.e(new se.b[16], 0);
        this.f7475y1 = bVar;
        y0 y0Var = new y0();
        new defpackage.a(y0Var, 6);
        j3 j3Var = j3.Shown;
        this.f7477z1 = y0Var;
        this.C1 = new w2.z(20);
        this.D1 = new q1.o0();
        this.G1 = new a8.f(this, 3);
        this.H1 = new k(this, i11);
        this.J1 = new i2(context, new o(this, i11));
        this.K1 = new t(this, i11);
        this.L1 = i13 < 29 ? new p1(fArrA) : new q1();
        addOnAttachStateChangeListener(this.f7476z);
        setWillNotDraw(false);
        setFocusable(true);
        o0.f7306a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ViewCompat.b0(this, f0Var);
        setOnDragListener(m67getDragAndDropManager());
        getRoot().d(this);
        if (i13 >= 29) {
            j0.f7261a.a(this);
        }
        if (z11) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.f7447k = view;
            addView(view, -1);
        }
        this.N1 = i13 >= 31 ? new h7.c() : null;
        this.P1 = new u(this);
    }

    public static final void b(y yVar, int i11, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iB;
        f0 f0Var = yVar.f7474y;
        if (Intrinsics.areEqual(str, f0Var.B)) {
            int iB2 = f0Var.f7216z.b(i11);
            if (iB2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iB2);
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(str, f0Var.C) || (iB = f0Var.A.b(i11)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n get_viewTreeOwners() {
        return (n) this.f7451m1.getValue();
    }

    public static void h(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof y) {
                ((y) childAt).x();
            } else if (childAt instanceof ViewGroup) {
                h((ViewGroup) childAt);
            }
        }
    }

    public static long i(int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == Integer.MIN_VALUE) {
            u70.b0 b0Var = u70.c0.f40833b;
            return (((long) 0) << 32) | ((long) size);
        }
        if (mode == 0) {
            u70.b0 b0Var2 = u70.c0.f40833b;
            return (((long) 0) << 32) | ((long) Integer.MAX_VALUE);
        }
        if (mode != 1073741824) {
            qc.y.e();
            return 0L;
        }
        long j9 = size;
        u70.b0 b0Var3 = u70.c0.f40833b;
        return j9 | (j9 << 32);
    }

    public static View k(int i11, View view) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (Intrinsics.areEqual(declaredMethod.invoke(view, null), Integer.valueOf(i11))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View viewK = k(i11, viewGroup.getChildAt(i12));
                    if (viewK != null) {
                        return viewK;
                    }
                }
            }
        }
        return null;
    }

    public static void n(b5.m0 m0Var) {
        m0Var.E();
        o3.e eVarA = m0Var.A();
        Object[] objArr = eVarA.f31830a;
        int i11 = eVarA.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            n((b5.m0) objArr[i12]);
        }
    }

    public static boolean p(MotionEvent motionEvent) {
        boolean z11 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z11) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i11 = 1; i11 < pointerCount; i11++) {
                z11 = (Float.floatToRawIntBits(motionEvent.getX(i11)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i11)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !v2.f7396a.a(motionEvent, i11));
                if (z11) {
                    break;
                }
            }
        }
        return z11;
    }

    private void setDensity(z5.c cVar) {
        this.f7445j.setValue(cVar);
    }

    private void setFontFamilyResolver(q5.h hVar) {
        this.f7467u1.setValue(hVar);
    }

    private void setLayoutDirection(z5.m mVar) {
        this.f7469v1.setValue(mVar);
    }

    private final void set_viewTreeOwners(n nVar) {
        this.f7451m1.setValue(nVar);
    }

    public final void A(b5.m0 m0Var, boolean z11, boolean z12) {
        b5.q0 q0Var = m0Var.H;
        b5.c1 c1Var = this.f7441h0;
        if (!z11) {
            c1Var.getClass();
            int i11 = b5.b1.$EnumSwitchMapping$0[q0Var.f5931d.ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
                return;
            }
            if (i11 != 5) {
                e40.a.f();
                return;
            }
            b5.m0 m0VarW = m0Var.w();
            boolean z13 = m0VarW == null || m0VarW.J();
            if (!z12) {
                if (m0Var.r()) {
                    return;
                }
                if (m0Var.q() && m0Var.J() == z13 && m0Var.J() == q0Var.f5942p.f5813u) {
                    return;
                }
            }
            b5.f1 f1Var = q0Var.f5942p;
            f1Var.f5815w = true;
            f1Var.f5816x = true;
            if (!m0Var.T && f1Var.f5813u && z13) {
                if ((m0VarW == null || !m0VarW.q()) && (m0VarW == null || !m0VarW.r())) {
                    c1Var.f5763b.a(m0Var, b5.z.Placement);
                }
                if (c1Var.f5765d) {
                    return;
                }
                F(null);
                return;
            }
            return;
        }
        a8.h hVar = c1Var.f5763b;
        int i12 = b5.b1.$EnumSwitchMapping$0[q0Var.f5931d.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    return;
                }
                if (i12 != 4 && i12 != 5) {
                    e40.a.f();
                    return;
                }
            }
            if ((q0Var.f5932e || q0Var.f5933f) && !z12) {
                return;
            }
            q0Var.f5933f = true;
            q0Var.f5934g = true;
            b5.f1 f1Var2 = q0Var.f5942p;
            f1Var2.f5815w = true;
            f1Var2.f5816x = true;
            if (m0Var.T) {
                return;
            }
            b5.m0 m0VarW2 = m0Var.w();
            if (Intrinsics.areEqual(m0Var.K(), Boolean.TRUE) && ((m0VarW2 == null || !m0VarW2.H.f5932e) && (m0VarW2 == null || !m0VarW2.H.f5933f))) {
                hVar.a(m0Var, b5.z.LookaheadPlacement);
            } else if (m0Var.J() && ((m0VarW2 == null || !m0VarW2.q()) && (m0VarW2 == null || !m0VarW2.r()))) {
                hVar.a(m0Var, b5.z.Placement);
            }
            if (c1Var.f5765d) {
                return;
            }
            F(null);
        }
    }

    public final void B() {
        f0 f0Var = this.f7474y;
        f0Var.f7212v = true;
        if (f0Var.m() && !f0Var.G) {
            f0Var.G = true;
            f0Var.f7198g.post(f0Var.I);
        }
        d4.e eVar = this.f7476z;
        eVar.f14038g = true;
        if (!eVar.f() || eVar.f14044n) {
            return;
        }
        eVar.f14044n = true;
        eVar.f14040i.post(eVar.f14045o);
    }

    public final void C() {
        if (this.f7448k1) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f7446j1) {
            this.f7446j1 = jCurrentAnimationTimeMillis;
            o1 o1Var = this.L1;
            float[] fArr = this.f7442h1;
            o1Var.a(this, fArr);
            d2.e(fArr, this.f7444i1);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f7437f1;
            view.getLocationOnScreen(iArr);
            float f11 = iArr[0];
            float f12 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f7449l1 = (((long) Float.floatToRawIntBits(f11 - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f12 - iArr[1])) & 4294967295L);
        }
    }

    public final void D(MotionEvent motionEvent) {
        this.f7446j1 = AnimationUtils.currentAnimationTimeMillis();
        o1 o1Var = this.L1;
        float[] fArr = this.f7442h1;
        o1Var.a(this, fArr);
        d2.e(fArr, this.f7444i1);
        float x11 = motionEvent.getX();
        float y5 = motionEvent.getY();
        long jB = i4.l0.b((((long) Float.floatToRawIntBits(x11)) << 32) | (((long) Float.floatToRawIntBits(y5)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.f7449l1 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    public final boolean E() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(AppConstants.RESULT_CODE_ORDER_COLLECTED, null);
    }

    public final void F(b5.m0 m0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (m0Var != null) {
            while (m0Var != null && m0Var.s() == b5.j0.InMeasureBlock) {
                if (!this.W) {
                    b5.m0 m0VarW = m0Var.w();
                    if (m0VarW == null) {
                        break;
                    }
                    long j9 = m0VarW.G.f5857c.f47186d;
                    if (z5.a.g(j9) && z5.a.f(j9)) {
                        break;
                    }
                }
                m0Var = m0Var.w();
            }
            if (m0Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long G(long j9) {
        C();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) - Float.intBitsToFloat((int) (this.f7449l1 >> 32));
        return i4.l0.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 & 4294967295L)) - Float.intBitsToFloat((int) (this.f7449l1 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.f7444i1);
    }

    public final int H(MotionEvent motionEvent) {
        Object obj;
        if (this.M1) {
            this.M1 = false;
            int metaState = motionEvent.getMetaState();
            this.f7456p.getClass();
            y3.f7480a.setValue(new w4.c0(metaState));
        }
        w4.j jVar = this.H;
        ub.a aVarC = jVar.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        ae.c cVar = this.I;
        if (aVarC == null) {
            if (!cVar.f1242a) {
                ((q1.z) ((m1.a) cVar.f1245d).f28697a).a();
                ((w4.c) cVar.f1244c).c();
            }
            return 0;
        }
        List list = (List) aVarC.f40981b;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i11 = size - 1;
                obj = list.get(size);
                if (((w4.x) obj).f43199e && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i11 < 0) {
                    break;
                }
                size = i11;
            }
            obj = null;
        } else {
            obj = null;
        }
        w4.x xVar = (w4.x) obj;
        if (xVar != null) {
            this.f7431a = xVar.f43198d;
        }
        int iF = cVar.f(aVarC, this, q(motionEvent));
        aVarC.f40982c = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iF & 1) != 0) {
            return iF;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        jVar.f43132c.delete(pointerId);
        jVar.f43131b.delete(pointerId);
        return iF;
    }

    public final void I(MotionEvent motionEvent, int i11, long j9, boolean z11) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i11 != 9 && i11 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerPropertiesArr[i12] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i13 = 0; i13 < pointerCount; i13++) {
            pointerCoordsArr[i13] = new MotionEvent.PointerCoords();
        }
        int i14 = 0;
        while (i14 < pointerCount) {
            int i15 = ((actionIndex < 0 || i14 < actionIndex) ? 0 : 1) + i14;
            motionEvent.getPointerProperties(i15, pointerPropertiesArr[i14]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i14];
            motionEvent.getPointerCoords(i15, pointerCoords);
            float f11 = pointerCoords.x;
            long jT = t((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f11)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jT >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jT & 4294967295L));
            i14++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j9 : motionEvent.getDownTime(), j9, i11, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z11 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        ub.a aVarC = this.H.c(motionEventObtain, this);
        aVarC.getClass();
        this.I.f(aVarC, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y70.a J(kotlin.jvm.functions.Function2 r6, z70.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof c5.x
            if (r0 == 0) goto L13
            r0 = r7
            c5.x r0 = (c5.x) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            c5.x r0 = new c5.x
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f7403j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 == r3) goto L2a
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
        L28:
            r6 = 0
            return r6
        L2a:
            ba0.g.M(r7)
            goto L48
        L2e:
            ba0.g.M(r7)
            c5.o r7 = new c5.o
            r2 = 3
            r7.<init>(r5, r2)
            r0.l = r3
            al.n r2 = new al.n
            r3 = 0
            java.util.concurrent.atomic.AtomicReference r4 = r5.f7461r1
            r2.<init>(r7, r4, r6, r3)
            java.lang.Object r6 = v80.f0.n(r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            qc.y.m()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.y.J(kotlin.jvm.functions.Function2, z70.c):y70.a");
    }

    public final void K(Configuration configuration) {
        m3.k1 k1Var;
        Configuration configuration2 = getConfiguration();
        if (Intrinsics.areEqual(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(xz.b.d(getContext()));
        }
        s sVar = p0.f7315a;
        if ((configuration2.diff(configuration) & (-1342235264)) != 0 && (k1Var = this.f7456p.f7350b) != null) {
            k1Var.setValue(d2.a(this));
        }
        int i11 = Build.VERSION.SDK_INT;
        if ((i11 >= 31 ? configuration2.fontWeightAdjustment : 0) != (i11 >= 31 ? configuration.fontWeightAdjustment : 0)) {
            setFontFamilyResolver(na0.a.g0(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L() {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.y.L():void");
    }

    public final void M(float f11) {
        if (this.l) {
            if (f11 > 0.0f) {
                if (Float.isNaN(this.E1) || f11 > this.E1) {
                    this.E1 = f11;
                    return;
                }
                return;
            }
            if (f11 < 0.0f) {
                if (Float.isNaN(this.F1) || f11 < this.F1) {
                    this.F1 = f11;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g4.j
    public final void a(g4.c0 c0Var, g4.g0 g0Var) {
        b5.l1 l1Var;
        b5.l1 l1Var2;
        if (c0Var != 0) {
            b4.s sVar = (b4.s) c0Var;
            if (!sVar.getNode().isAttached()) {
                y4.a.b("visitAncestors called on an unattached node");
            }
            b4.s node = sVar.getNode();
            b5.m0 m0VarG = b5.m.g(c0Var);
            LinkedHashSet linkedHashSet = null;
            ArrayList arrayList = null;
            while (m0VarG != null) {
                if ((m0VarG.G.f5860f.getAggregateChildKindSet$ui() & 2097152) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui() & 2097152) != 0) {
                            b4.s sVarB = node;
                            o3.e eVar = null;
                            while (sVarB != null) {
                                if (sVarB instanceof t4.c) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(sVarB);
                                } else if ((sVarB.getKindSet$ui() & 2097152) != 0 && (sVarB instanceof b5.n)) {
                                    int i11 = 0;
                                    for (b4.s child$ui = ((b5.n) sVarB).f5892p; child$ui != null; child$ui = child$ui.getChild$ui()) {
                                        if ((child$ui.getKindSet$ui() & 2097152) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                sVarB = child$ui;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new o3.e(new b4.s[16], 0);
                                                }
                                                if (sVarB != null) {
                                                    eVar.b(sVarB);
                                                    sVarB = null;
                                                }
                                                eVar.b(child$ui);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                sVarB = b5.m.b(eVar);
                            }
                        }
                        node = node.getParent$ui();
                    }
                }
                m0VarG = m0VarG.w();
                node = (m0VarG == null || (l1Var2 = m0VarG.G) == null) ? null : l1Var2.f5859e;
            }
            if (arrayList == null) {
                return;
            }
            if (g0Var != null) {
                if (!g0Var.getNode().isAttached()) {
                    y4.a.b("visitAncestors called on an unattached node");
                }
                b4.s node2 = g0Var.getNode();
                b5.m0 m0VarG2 = b5.m.g(g0Var);
                LinkedHashSet linkedHashSet2 = null;
                while (m0VarG2 != null) {
                    if ((m0VarG2.G.f5860f.getAggregateChildKindSet$ui() & 2097152) != 0) {
                        while (node2 != null) {
                            if ((node2.getKindSet$ui() & 2097152) != 0) {
                                b4.s sVarB2 = node2;
                                o3.e eVar2 = null;
                                while (sVarB2 != null) {
                                    if (sVarB2 instanceof t4.c) {
                                        if (linkedHashSet2 == null) {
                                            linkedHashSet2 = new LinkedHashSet();
                                        }
                                        linkedHashSet2.add(sVarB2);
                                    } else if ((sVarB2.getKindSet$ui() & 2097152) != 0 && (sVarB2 instanceof b5.n)) {
                                        int i12 = 0;
                                        for (b4.s child$ui2 = ((b5.n) sVarB2).f5892p; child$ui2 != null; child$ui2 = child$ui2.getChild$ui()) {
                                            if ((child$ui2.getKindSet$ui() & 2097152) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    sVarB2 = child$ui2;
                                                } else {
                                                    if (eVar2 == null) {
                                                        eVar2 = new o3.e(new b4.s[16], 0);
                                                    }
                                                    if (sVarB2 != null) {
                                                        eVar2.b(sVarB2);
                                                        sVarB2 = null;
                                                    }
                                                    eVar2.b(child$ui2);
                                                }
                                            }
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    sVarB2 = b5.m.b(eVar2);
                                }
                            }
                            node2 = node2.getParent$ui();
                        }
                    }
                    m0VarG2 = m0VarG2.w();
                    node2 = (m0VarG2 == null || (l1Var = m0VarG2.G) == null) ? null : l1Var.f5859e;
                }
                linkedHashSet = linkedHashSet2;
            }
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                t4.c cVar = (t4.c) arrayList.get(i13);
                if (!(linkedHashSet != null ? linkedHashSet.contains(cVar) : false)) {
                    cVar.d0();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i11, int i12) {
        g4.g0 g0Var = ((g4.p) getFocusOwner()).f19964c;
        if (!g0Var.isAttached()) {
            return;
        }
        if (!g0Var.getNode().isAttached()) {
            y4.a.b("visitSubtreeIf called on an unattached node");
        }
        o3.e eVar = new o3.e(new b4.s[16], 0);
        b4.s child$ui = g0Var.getNode().getChild$ui();
        if (child$ui == null) {
            b5.m.a(eVar, g0Var.getNode());
        } else {
            eVar.b(child$ui);
        }
        while (true) {
            int i13 = eVar.f31832c;
            if (i13 == 0) {
                return;
            }
            b4.s sVar = (b4.s) eVar.l(i13 - 1);
            if ((sVar.getAggregateChildKindSet$ui() & 1024) != 0) {
                for (b4.s child$ui2 = sVar; child$ui2 != null && child$ui2.isAttached(); child$ui2 = child$ui2.getChild$ui()) {
                    if ((child$ui2.getKindSet$ui() & 1024) != 0) {
                        b4.s sVarB = child$ui2;
                        o3.e eVar2 = null;
                        while (sVarB != null) {
                            if (sVarB instanceof g4.g0) {
                                g4.g0 g0Var2 = (g4.g0) sVarB;
                                if (g0Var2.isAttached() && g0Var2.N0().f19974a) {
                                    super.addFocusables(arrayList, i11, i12);
                                    g4.g0 g0Var3 = ((g4.p) getFocusOwner()).f19964c;
                                    if (g0Var3.isAttached()) {
                                        if (!g0Var3.getNode().isAttached()) {
                                            y4.a.b("visitSubtreeIf called on an unattached node");
                                        }
                                        o3.e eVar3 = new o3.e(new b4.s[16], 0);
                                        b4.s child$ui3 = g0Var3.getNode().getChild$ui();
                                        if (child$ui3 == null) {
                                            b5.m.a(eVar3, g0Var3.getNode());
                                        } else {
                                            eVar3.b(child$ui3);
                                        }
                                        while (true) {
                                            int i14 = eVar3.f31832c;
                                            if (i14 == 0) {
                                                break;
                                            }
                                            b4.s sVar2 = (b4.s) eVar3.l(i14 - 1);
                                            if ((sVar2.getAggregateChildKindSet$ui() & 1024) != 0) {
                                                for (b4.s child$ui4 = sVar2; child$ui4 != null && child$ui4.isAttached(); child$ui4 = child$ui4.getChild$ui()) {
                                                    if ((child$ui4.getKindSet$ui() & 1024) != 0) {
                                                        b4.s sVarB2 = child$ui4;
                                                        o3.e eVar4 = null;
                                                        while (sVarB2 != null) {
                                                            if (sVarB2 instanceof g4.g0) {
                                                                g4.g0 g0Var4 = (g4.g0) sVarB2;
                                                                if (g0Var4.isAttached()) {
                                                                    g4.t tVarN0 = g0Var4.N0();
                                                                    if (g0Var4.isAttached() && !g0Var4.f19939o && tVarN0.f19974a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((sVarB2.getKindSet$ui() & 1024) != 0 && (sVarB2 instanceof b5.n)) {
                                                                int i15 = 0;
                                                                for (b4.s child$ui5 = ((b5.n) sVarB2).f5892p; child$ui5 != null; child$ui5 = child$ui5.getChild$ui()) {
                                                                    if ((child$ui5.getKindSet$ui() & 1024) != 0) {
                                                                        i15++;
                                                                        if (i15 == 1) {
                                                                            sVarB2 = child$ui5;
                                                                        } else {
                                                                            if (eVar4 == null) {
                                                                                eVar4 = new o3.e(new b4.s[16], 0);
                                                                            }
                                                                            if (sVarB2 != null) {
                                                                                eVar4.b(sVarB2);
                                                                                sVarB2 = null;
                                                                            }
                                                                            eVar4.b(child$ui5);
                                                                        }
                                                                    }
                                                                }
                                                                if (i15 == 1) {
                                                                }
                                                            }
                                                            sVarB2 = b5.m.b(eVar4);
                                                        }
                                                    }
                                                }
                                            }
                                            b5.m.a(eVar3, sVar2);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((sVarB.getKindSet$ui() & 1024) != 0 && (sVarB instanceof b5.n)) {
                                int i16 = 0;
                                for (b4.s child$ui6 = ((b5.n) sVarB).f5892p; child$ui6 != null; child$ui6 = child$ui6.getChild$ui()) {
                                    if ((child$ui6.getKindSet$ui() & 1024) != 0) {
                                        i16++;
                                        if (i16 == 1) {
                                            sVarB = child$ui6;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new o3.e(new b4.s[16], 0);
                                            }
                                            if (sVarB != null) {
                                                eVar2.b(sVarB);
                                                sVarB = null;
                                            }
                                            eVar2.b(child$ui6);
                                        }
                                    }
                                }
                                if (i16 == 1) {
                                }
                            }
                            sVarB = b5.m.b(eVar2);
                        }
                    }
                }
            }
            b5.m.a(eVar, sVar);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i11, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        j5.n nVarY;
        Function1 function1;
        Function1 function12;
        c4.d dVar = this.L;
        if (dVar != null) {
            int size = sparseArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = sparseArray.keyAt(i11);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                j5.p pVar = (j5.p) dVar.f7026b.f24704c.b(iKeyAt);
                if (pVar != null && (nVarY = ((b5.m0) pVar).y()) != null) {
                    j5.a aVar = (j5.a) j5.w.d(nVarY, j5.m.f24663g);
                    if (aVar != null && (function12 = (Function1) aVar.f24610b) != null) {
                    }
                    j5.a aVar2 = (j5.a) j5.w.d(nVarY, j5.m.f24664h);
                    if (aVar2 != null && (function1 = (Function1) aVar2.f24610b) != null) {
                    }
                }
            }
        }
        com.google.firebase.messaging.a0 a0Var = this.K;
        if (a0Var != null) {
            c4.l lVar = (c4.l) a0Var.f12780c;
            if (lVar.f7038a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i12 = 0; i12 < size2; i12++) {
                int iKeyAt2 = sparseArray.keyAt(i12);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (lVar.f7038a.get(Integer.valueOf(iKeyAt2)) != null) {
                        org.bouncycastle.jce.provider.a.c();
                        return;
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new u70.n("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new u70.n("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new u70.n("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i11) {
        return this.f7474y.d(i11, this.f7431a, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i11) {
        return this.f7474y.d(i11, this.f7431a, true);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View view;
        View view2;
        if (!isAttachedToWindow()) {
            n(getRoot());
        }
        u(true);
        z3.l.j().m();
        this.F = true;
        i4.u uVar = this.f7458q;
        i4.c cVar = uVar.f23304a;
        Canvas canvas2 = cVar.f23230a;
        cVar.f23230a = canvas;
        View view3 = null;
        getRoot().i(cVar, null);
        uVar.f23304a.f23230a = canvas2;
        q1.o0 o0Var = this.D;
        if (o0Var.e()) {
            int i11 = o0Var.f35722b;
            for (int i12 = 0; i12 < i11; i12++) {
                ((f2) ((b5.c2) o0Var.b(i12))).g();
            }
        }
        int i13 = w3.f7402a;
        o0Var.j();
        this.F = false;
        q1.o0 o0Var2 = this.E;
        if (o0Var2 != null) {
            o0Var.i(o0Var2);
            o0Var2.j();
        }
        if (this.l) {
            m1.a(this, this.E1);
            View view4 = this.f7447k;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("frameRateCategoryView");
                view = null;
            } else {
                view = view4;
            }
            m1.a(view, this.F1);
            if (!Float.isNaN(this.F1)) {
                if (view4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("frameRateCategoryView");
                    view2 = null;
                } else {
                    view2 = view4;
                }
                view2.invalidate();
                if (view4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("frameRateCategoryView");
                } else {
                    view3 = view4;
                }
                drawChild(canvas, view3, getDrawingTime());
            }
            this.E1 = Float.NaN;
            this.F1 = Float.NaN;
        }
        getRectManager().a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0526 A[PHI: r6
      0x0526: PHI (r6v51 ??) = (r6v75 ??), (r6v76 ??), (r6v77 ??) binds: [B:300:0x04e3, B:302:0x04e7, B:317:0x051f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0727 A[PHI: r5
      0x0727: PHI (r5v38 ??) = (r5v87 ??), (r5v88 ??), (r5v89 ??) binds: [B:433:0x06e8, B:435:0x06ec, B:450:0x0722] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r4v32, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r5v60, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v79 */
    /* JADX WARN: Type inference failed for: r5v80 */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Type inference failed for: r5v82 */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r5v89 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v55, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r6v71 */
    /* JADX WARN: Type inference failed for: r6v72 */
    /* JADX WARN: Type inference failed for: r6v73 */
    /* JADX WARN: Type inference failed for: r6v74 */
    /* JADX WARN: Type inference failed for: r6v75 */
    /* JADX WARN: Type inference failed for: r6v76 */
    /* JADX WARN: Type inference failed for: r6v77 */
    /* JADX WARN: Type inference failed for: r7v39 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r43) {
        /*
            Method dump skipped, instruction units count: 2102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.y.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0157  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.y.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((g4.p) getFocusOwner()).f(keyEvent, new b5.r1(2, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f7456p.getClass();
        y3.f7480a.setValue(new w4.c0(metaState));
        return ((g4.p) getFocusOwner()).f(keyEvent, g4.k.f19951a) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        b5.l1 l1Var;
        if (isFocused()) {
            g4.p pVar = (g4.p) getFocusOwner();
            if (pVar.f19965d.f19950e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                g4.g0 g0VarB = g4.d.b(pVar.f19964c);
                if (g0VarB != null) {
                    if (!g0VarB.getNode().isAttached()) {
                        y4.a.b("visitAncestors called on an unattached node");
                    }
                    b4.s node = g0VarB.getNode();
                    b5.m0 m0VarG = b5.m.g(g0VarB);
                    while (m0VarG != null) {
                        if ((m0VarG.G.f5860f.getAggregateChildKindSet$ui() & 131072) != 0) {
                            while (node != null) {
                                if ((node.getKindSet$ui() & 131072) != 0) {
                                    b4.s sVarB = node;
                                    o3.e eVar = null;
                                    while (sVarB != null) {
                                        if ((sVarB.getKindSet$ui() & 131072) != 0 && (sVarB instanceof b5.n)) {
                                            int i11 = 0;
                                            for (b4.s child$ui = ((b5.n) sVarB).f5892p; child$ui != null; child$ui = child$ui.getChild$ui()) {
                                                if ((child$ui.getKindSet$ui() & 131072) != 0) {
                                                    i11++;
                                                    if (i11 == 1) {
                                                        sVarB = child$ui;
                                                    } else {
                                                        if (eVar == null) {
                                                            eVar = new o3.e(new b4.s[16], 0);
                                                        }
                                                        if (sVarB != null) {
                                                            eVar.b(sVarB);
                                                            sVarB = null;
                                                        }
                                                        eVar.b(child$ui);
                                                    }
                                                }
                                            }
                                            if (i11 == 1) {
                                            }
                                        }
                                        sVarB = b5.m.b(eVar);
                                    }
                                }
                                node = node.getParent$ui();
                            }
                        }
                        m0VarG = m0VarG.w();
                        node = (m0VarG == null || (l1Var = m0VarG.G) == null) ? null : l1Var.f5859e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            i0.f7249a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object n1Var;
        g4.g0 g0VarH;
        if (this.I1) {
            k kVar = this.H1;
            removeCallbacks(kVar);
            MotionEvent motionEvent2 = this.A1;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.I1 = false;
            } else {
                kVar.run();
            }
        }
        if (!p(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || r(motionEvent))) {
            int iM = m(motionEvent);
            int i11 = 1;
            if ((iM & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z11 = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z12 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z11 && z12) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (n1Var = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    n1Var = new n1(i11);
                }
                if (Intrinsics.areEqual(n1Var, new n1(i11)) && (g0VarH = ((g4.p) getFocusOwner()).h()) != null) {
                    b5.s1 s1VarF = b5.m.f(g0VarH);
                    if (!z4.c0.i(s1VarF).v(s1VarF, true).a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        ((g4.p) getFocusOwner()).b(false);
                    }
                }
            }
            if ((iM & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final View findViewByAccessibilityIdTraversal(int i11) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return k(i11, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i11));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i11) {
        h4.c cVarA;
        if (view == null || this.f7441h0.f5764c) {
            return super.focusSearch(view, i11);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i11);
        if (viewFindNextFocus == null || !p0.a(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            g4.g0 g0VarB = g4.d.b(((g4.p) getFocusOwner()).f19964c);
            cVarA = g0VarB != null ? g4.d.c(g0VarB) : null;
            if (cVarA == null) {
                cVarA = g4.h.a(view, this);
            }
        } else {
            cVarA = g4.h.a(view, this);
        }
        g4.f fVarD = g4.h.d(i11);
        int i12 = fVarD != null ? fVarD.f19936a : 6;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (((g4.p) getFocusOwner()).g(i12, cVarA, new r(objectRef)) == null) {
            return view;
        }
        T t9 = objectRef.element;
        if (t9 == 0) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i11);
            }
        } else if (viewFindNextFocus == null || i12 == 1 || i12 == 2 || g4.o0.g(g4.d.c((g4.g0) t9), g4.h.a(viewFindNextFocus, this), cVarA, i12)) {
            return this;
        }
        return viewFindNextFocus;
    }

    @NotNull
    public final i1 getAndroidViewsHandler$ui() {
        if (this.T == null) {
            i1 i1Var = new i1(getContext());
            this.T = i1Var;
            addView(i1Var, -1);
            requestLayout();
        }
        i1 i1Var2 = this.T;
        i1Var2.getClass();
        return i1Var2;
    }

    @Nullable
    public c4.h getAutofill() {
        return this.K;
    }

    @Nullable
    public c4.k getAutofillManager() {
        return this.L;
    }

    @NotNull
    public c4.l getAutofillTree() {
        return this.C;
    }

    @NotNull
    public final Configuration getConfiguration() {
        return (Configuration) this.J.getValue();
    }

    @NotNull
    public final d4.e getContentCaptureManager$ui() {
        return this.f7476z;
    }

    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f7452n;
    }

    @NotNull
    public z5.c getDensity() {
        return (z5.c) this.f7445j.getValue();
    }

    @Nullable
    public h4.c getEmbeddedViewFocusRect() {
        if (isFocused()) {
            g4.g0 g0VarB = g4.d.b(((g4.p) getFocusOwner()).f19964c);
            if (g0VarB != null) {
                return g4.d.c(g0VarB);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return g4.h.a(viewFindFocus, this);
        }
        return null;
    }

    @NotNull
    public g4.l getFocusOwner() {
        return this.f7450m;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        h4.c embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f21380a);
            rect.top = Math.round(embeddedViewFocusRect.f21381b);
            rect.right = Math.round(embeddedViewFocusRect.f21382c);
            rect.bottom = Math.round(embeddedViewFocusRect.f21383d);
            return;
        }
        if (Intrinsics.areEqual(((g4.p) getFocusOwner()).g(6, null, s.f7361b), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @NotNull
    public q5.h getFontFamilyResolver() {
        return (q5.h) this.f7467u1.getValue();
    }

    @NotNull
    public q5.g getFontLoader() {
        return this.f7465t1;
    }

    @Nullable
    public final r2 getFrameEndScheduler$ui() {
        return this.f7435e;
    }

    @NotNull
    public i4.e0 getGraphicsContext() {
        return this.B;
    }

    @NotNull
    public r4.a getHapticFeedBack() {
        return this.f7471w1;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f7441h0.f5763b.s() || !this.f7440h.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @NotNull
    public s4.b getInputModeManager() {
        return this.f7473x1;
    }

    @NotNull
    public final z4.s getInsetsListener() {
        return this.f7462s;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.f7446j1;
    }

    @Override // android.view.View, android.view.ViewParent
    @NotNull
    public z5.m getLayoutDirection() {
        return (z5.m) this.f7469v1.getValue();
    }

    public long getMeasureIteration() {
        b5.c1 c1Var = this.f7441h0;
        if (!c1Var.f5764c) {
            y4.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return c1Var.f5768g;
    }

    @NotNull
    public a5.b getModifierLocalManager() {
        return this.f7475y1;
    }

    @Nullable
    public y getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @NotNull
    public z4.l1 getPlacementScope() {
        z4.f0 f0Var = z4.n1.f47190a;
        return new z4.r0(this, 1);
    }

    @NotNull
    public w4.t getPointerIconService() {
        return this.P1;
    }

    @Nullable
    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final t4.a m62getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.f7433c;
    }

    @NotNull
    public k5.b getRectManager() {
        return this.f7468v;
    }

    @NotNull
    public w3.c getRetainedValuesStore() {
        return this.f7438g;
    }

    @NotNull
    public b5.m0 getRoot() {
        return this.f7464t;
    }

    @NotNull
    public b5.k2 getRootForTest() {
        return this.f7470w;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        h7.c cVar;
        if (Build.VERSION.SDK_INT < 31 || (cVar = this.N1) == null) {
            return false;
        }
        return ((Boolean) ((m3.k1) cVar.f21523b).getValue()).booleanValue();
    }

    @NotNull
    public j5.v getSemanticsOwner() {
        return this.f7472x;
    }

    @NotNull
    public b5.o0 getSharedDrawScope() {
        return this.f7434d;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? l1.f7284a.a(this) : this.Q;
    }

    @NotNull
    public b5.f2 getSnapshotObserver() {
        return this.P;
    }

    @NotNull
    public f3 getSoftwareKeyboardController() {
        return this.f7463s1;
    }

    @NotNull
    public r5.z getTextInputService() {
        return this.f7459q1;
    }

    @NotNull
    public i3 getTextToolbar() {
        return this.f7477z1;
    }

    @Nullable
    public final b5.j2 getUncaughtExceptionHandler$ui() {
        return null;
    }

    @NotNull
    public u3 getViewConfiguration() {
        return this.f7460r;
    }

    @Nullable
    public final n getViewTreeOwners() {
        return (n) this.f7453n1.getValue();
    }

    @NotNull
    public x3 getWindowInfo() {
        return this.f7456p;
    }

    @Nullable
    public final c4.d get_autofillManager$ui() {
        return this.L;
    }

    public final b5.c2 j(Function2 function2, b5.o1 o1Var, l4.b bVar) {
        o3.e eVar;
        Reference referencePoll;
        Object obj;
        if (bVar != null) {
            return new f2(bVar, null, this, function2, o1Var);
        }
        do {
            w2.z zVar = this.C1;
            ReferenceQueue referenceQueue = (ReferenceQueue) zVar.f43084c;
            eVar = (o3.e) zVar.f43083b;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                eVar.j(referencePoll);
            }
        } while (referencePoll != null);
        while (true) {
            int i11 = eVar.f31832c;
            if (i11 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) eVar.l(i11 - 1)).get();
            if (obj != null) {
                break;
            }
        }
        b5.c2 c2Var = (b5.c2) obj;
        if (c2Var == null) {
            return new f2(getGraphicsContext().c(), getGraphicsContext(), this, function2, o1Var);
        }
        f2 f2Var = (f2) c2Var;
        i4.e0 e0Var = f2Var.f7219b;
        if (e0Var == null) {
            throw b3.i.D("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!f2Var.f7218a.f27290s) {
            y4.a.a("layer should have been released before reuse");
        }
        f2Var.f7218a = e0Var.c();
        f2Var.f7224g = false;
        f2Var.f7221d = function2;
        f2Var.f7222e = o1Var;
        f2Var.f7233q = false;
        f2Var.f7234r = false;
        f2Var.f7235s = true;
        i4.l0.d(f2Var.f7225h);
        float[] fArr = f2Var.f7226i;
        if (fArr != null) {
            i4.l0.d(fArr);
        }
        f2Var.f7231o = i4.z0.f23335b;
        f2Var.f7236t = false;
        long j9 = Integer.MAX_VALUE;
        f2Var.f7223f = (j9 & 4294967295L) | (j9 << 32);
        f2Var.f7232p = null;
        f2Var.f7230n = 0;
        return c2Var;
    }

    public final void l(b5.m0 m0Var, boolean z11) {
        this.f7441h0.f(m0Var, z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.y.m(android.view.MotionEvent):int");
    }

    public final void o(b5.m0 m0Var) {
        this.f7441h0.p(m0Var, false);
        o3.e eVarA = m0Var.A();
        Object[] objArr = eVarA.f31830a;
        int i11 = eVarA.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            o((b5.m0) objArr[i12]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        w3.c cVar;
        Lifecycle lifecycle;
        Object obj;
        super.onAttachedToWindow();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 30) {
            setShowLayoutBounds(d2.c());
        }
        this.f7462s.onViewAttachedToWindow(this);
        int i12 = 0;
        if (i11 > 28) {
            if (U1 == null) {
                bx.c cVar2 = new bx.c(5);
                U1 = cVar2;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (Q1 == null) {
                        Q1 = Class.forName("android.os.SystemProperties");
                    }
                    if (S1 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = Q1;
                        S1 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = S1;
                    if (method != null) {
                        method.invoke(null, cVar2);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            q1.o0 o0Var = T1;
            synchronized (o0Var) {
                o0Var.g(this);
            }
        }
        this.f7456p.f7351c.setValue(Boolean.valueOf(hasWindowFocus()));
        q2 q2Var = this.f7456p;
        t tVar = new t(this, i12);
        if (q2Var.f7350b == null) {
            q2Var.f7349a = tVar;
        }
        m3.k1 k1Var = this.f7456p.f7350b;
        if (k1Var != null) {
            k1Var.setValue(d2.a(this));
        }
        o(getRoot());
        n(getRoot());
        getSnapshotObserver().f5819a.e();
        com.google.firebase.messaging.a0 a0Var = this.K;
        if (a0Var != null) {
            c4.j jVar = c4.j.f7037a;
            jVar.getClass();
            ((AutofillManager) a0Var.f12781d).registerCallback(jVar);
        }
        LifecycleOwner lifecycleOwnerA = androidx.lifecycle.m1.a(this);
        ea.f fVarS = y9.w.s(this);
        androidx.lifecycle.s1 s1VarB = androidx.lifecycle.m1.b(this);
        r2 r2Var = this.f7435e;
        if (lifecycleOwnerA == null || s1VarB == null || r2Var == null) {
            cVar = null;
        } else {
            ViewModelStore viewModelStore = s1VarB.getViewModelStore();
            androidx.lifecycle.p1 p1Var = new androidx.lifecycle.p1();
            y8.a aVar = y8.a.f45423b;
            viewModelStore.getClass();
            aVar.getClass();
            com.google.firebase.messaging.a0 a0Var2 = new com.google.firebase.messaging.a0(viewModelStore, p1Var, aVar);
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(t2.class);
            orCreateKotlinClass.getClass();
            String qualifiedName = orCreateKotlinClass.getQualifiedName();
            if (qualifiedName == null) {
                i4.a.f("Local and anonymous classes can not be ViewModels");
                return;
            }
            t2 t2Var = (t2) a0Var2.M("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
            Object parent = getParent();
            parent.getClass();
            int id2 = ((View) parent).getId();
            q1.g0 g0Var = t2Var.f7382a;
            Object objB = g0Var.b(id2);
            if (objB == null) {
                objB = new q1.o0(1);
                g0Var.i(id2, objB);
            }
            q1.o0 o0Var2 = (q1.o0) objB;
            Object[] objArr = o0Var2.f35721a;
            int i13 = o0Var2.f35722b;
            while (true) {
                if (i12 >= i13) {
                    obj = null;
                    break;
                }
                obj = objArr[i12];
                if (!((s2) obj).f7376c) {
                    break;
                } else {
                    i12++;
                }
            }
            s2 s2Var = (s2) obj;
            if (s2Var == null) {
                s2Var = new s2();
                o0Var2.g(s2Var);
            }
            s2Var.f7376c = true;
            this.f7436f = s2Var;
            cVar = s2Var.f7375b;
        }
        if (cVar == null) {
            cVar = w3.a.f43092a;
        }
        this.f7438g = cVar;
        n viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (lifecycleOwnerA != null && fVarS != null && (lifecycleOwnerA != viewTreeOwners.f7294a || fVarS != viewTreeOwners.f7295b || s1VarB != viewTreeOwners.f7296c))) {
            if (lifecycleOwnerA == null) {
                com.braze.h2.b("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            if (fVarS == null) {
                com.braze.h2.b("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                return;
            }
            if (viewTreeOwners != null && (lifecycle = viewTreeOwners.f7294a.getLifecycle()) != null) {
                lifecycle.d(this);
            }
            lifecycleOwnerA.getLifecycle().a(this);
            n nVar = new n(lifecycleOwnerA, fVarS, s1VarB);
            set_viewTreeOwners(nVar);
            Function1 function1 = this.f7455o1;
            if (function1 != null) {
                function1.invoke(nVar);
            }
            this.f7455o1 = null;
        }
        this.f7473x1.f38837a.setValue(new s4.a(isInTouchMode() ? 1 : 2));
        n viewTreeOwners2 = getViewTreeOwners();
        Lifecycle lifecycle2 = viewTreeOwners2 != null ? viewTreeOwners2.f7294a.getLifecycle() : null;
        if (lifecycle2 == null) {
            throw b3.i.D("No lifecycle owner exists");
        }
        lifecycle2.a(this);
        lifecycle2.a(this.f7476z);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            m0.f7290a.b(this);
        }
        c4.d dVar = this.L;
        if (dVar != null) {
            ((g4.p) getFocusOwner()).f19968g.g(dVar);
            getSemanticsOwner().f24705d.g(dVar);
        }
        ((g4.p) getFocusOwner()).f19968g.g(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        b4.v vVar = (b4.v) this.f7461r1.get();
        x0 x0Var = (x0) (vVar != null ? vVar.f5726b : null);
        if (x0Var == null) {
            return this.f7457p1.f37655d;
        }
        b4.v vVar2 = (b4.v) x0Var.f7408d.get();
        k2 k2Var = (k2) (vVar2 != null ? vVar2.f5726b : null);
        return k2Var != null && (k2Var.f7273e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        K(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i11;
        b4.v vVar = (b4.v) this.f7461r1.get();
        x0 x0Var = (x0) (vVar != null ? vVar.f5726b : null);
        if (x0Var != null) {
            b4.v vVar2 = (b4.v) x0Var.f7408d.get();
            k2 k2Var = (k2) (vVar2 != null ? vVar2.f5726b : null);
            if (k2Var == null) {
                return null;
            }
            synchronized (k2Var.f7271c) {
                if (k2Var.f7273e) {
                    return null;
                }
                InputConnection inputConnectionA = k2Var.f7269a.a(editorInfo);
                androidx.fragment.app.r rVar = new androidx.fragment.app.r(k2Var, 9);
                InputConnection qVar = Build.VERSION.SDK_INT >= 34 ? new r5.q(inputConnectionA, rVar) : new r5.p(inputConnectionA, rVar);
                k2Var.f7272d.b(new b5.s2(qVar));
                return qVar;
            }
        }
        r5.c0 c0Var = this.f7457p1;
        if (!c0Var.f37655d) {
            return null;
        }
        r5.m mVar = c0Var.f37659h;
        r5.y yVar = c0Var.f37658g;
        int i12 = mVar.f37693e;
        boolean z11 = mVar.f37689a;
        if (i12 == 1) {
            i11 = z11 ? 6 : 0;
        } else if (i12 == 0) {
            i11 = 1;
        } else if (i12 == 2) {
            i11 = 2;
        } else if (i12 == 6) {
            i11 = 5;
        } else if (i12 == 5) {
            i11 = 7;
        } else if (i12 == 3) {
            i11 = 3;
        } else if (i12 == 4) {
            i11 = 4;
        } else {
            if (i12 != 7) {
                com.braze.h2.b("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i11;
        int i13 = mVar.f37692d;
        if (i13 == 1) {
            editorInfo.inputType = 1;
        } else if (i13 == 2) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions = i11 | Integer.MIN_VALUE;
        } else if (i13 == 3) {
            editorInfo.inputType = 2;
        } else if (i13 == 4) {
            editorInfo.inputType = 3;
        } else if (i13 == 5) {
            editorInfo.inputType = 17;
        } else if (i13 == 6) {
            editorInfo.inputType = 33;
        } else if (i13 == 7) {
            editorInfo.inputType = 129;
        } else if (i13 == 8) {
            editorInfo.inputType = 18;
        } else {
            if (i13 != 9) {
                com.braze.h2.b("Invalid Keyboard Type");
                return null;
            }
            editorInfo.inputType = 8194;
        }
        if (!z11) {
            int i14 = editorInfo.inputType;
            if ((i14 & 1) == 1) {
                editorInfo.inputType = i14 | 131072;
                if (i12 == 1) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
        }
        int i15 = editorInfo.inputType;
        if ((i15 & 1) == 1) {
            int i16 = mVar.f37690b;
            if (i16 == 1) {
                editorInfo.inputType = i15 | 4096;
            } else if (i16 == 2) {
                editorInfo.inputType = i15 | 8192;
            } else if (i16 == 3) {
                editorInfo.inputType = i15 | BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
            }
            if (mVar.f37691c) {
                editorInfo.inputType |= 32768;
            }
        }
        long j9 = yVar.f37715b;
        int i17 = m5.t0.f29649c;
        editorInfo.initialSelStart = (int) (j9 >> 32);
        editorInfo.initialSelEnd = (int) (j9 & 4294967295L);
        o00.x0.D(editorInfo, yVar.f37714a.f29538b);
        editorInfo.imeOptions |= 33554432;
        if (l8.j.d()) {
            l8.j.a().i(editorInfo);
        }
        r5.u uVar = new r5.u(c0Var.f37658g, new jd.f(c0Var, 22), c0Var.f37659h.f37691c);
        c0Var.f37660i.add(new WeakReference(uVar));
        return uVar;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        d4.e eVar = this.f7476z;
        eVar.getClass();
        b7.a.n(eVar, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7462s.onViewDetachedFromWindow(this);
        if (this.l) {
            View view = this.f7447k;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("frameRateCategoryView");
                view = null;
            }
            removeView(view);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 > 28) {
            q1.o0 o0Var = T1;
            synchronized (o0Var) {
                o0Var.k(this);
            }
        }
        z3.x xVar = getSnapshotObserver().f5819a;
        gn.q qVar = xVar.f47083h;
        if (qVar != null) {
            qVar.a();
        }
        xVar.a();
        q2 q2Var = this.f7456p;
        if (q2Var.f7350b == null) {
            q2Var.f7349a = null;
        }
        n viewTreeOwners = getViewTreeOwners();
        Lifecycle lifecycle = viewTreeOwners != null ? viewTreeOwners.f7294a.getLifecycle() : null;
        if (lifecycle == null) {
            throw b3.i.D("No lifecycle owner exists");
        }
        lifecycle.d(this.f7476z);
        lifecycle.d(this);
        com.google.firebase.messaging.a0 a0Var = this.K;
        if (a0Var != null) {
            c4.j jVar = c4.j.f7037a;
            jVar.getClass();
            ((AutofillManager) a0Var.f12781d).unregisterCallback(jVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        s2 s2Var = this.f7436f;
        if (s2Var != null) {
            s2Var.f7376c = false;
        }
        this.f7436f = null;
        if (i11 >= 31) {
            m0.f7290a.a(this);
        }
        c4.d dVar = this.L;
        if (dVar != null) {
            getSemanticsOwner().f24705d.k(dVar);
            ((g4.p) getFocusOwner()).f19968g.k(dVar);
        }
        k5.b rectManager = getRectManager();
        b4.b bVar = rectManager.f25964g;
        if (bVar != null) {
            b4.c.f5682a.removeCallbacks(bVar);
            rectManager.f25964g = null;
        }
        ((g4.p) getFocusOwner()).f19968g.k(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z11, int i11, Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        if (z11 || hasFocus()) {
            return;
        }
        g4.p pVar = (g4.p) getFocusOwner();
        g4.i0.a(pVar.f19964c, true);
        if (pVar.h() != null) {
            g4.g0 g0VarH = pVar.h();
            pVar.k(null);
            if (g0VarH != null) {
                g0VarH.M0(g4.b0.Active, g4.b0.Inactive);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f7446j1 = 0L;
        L();
        int i11 = Build.VERSION.SDK_INT;
        if (32 > i11 || i11 >= 34) {
            return;
        }
        K(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        this.f7446j1 = 0L;
        this.f7441h0.j(this.K1);
        this.V = null;
        L();
        if (this.T != null) {
            getAndroidViewsHandler$ui().layout(0, 0, i13 - i11, i14 - i12);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        b5.c1 c1Var = this.f7441h0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                o(getRoot());
            }
            long jI = i(i11);
            u70.b0 b0Var = u70.c0.f40833b;
            long jI2 = i(i12);
            long jQ = y9.w.q((int) (jI >>> 32), (int) (jI & 4294967295L), (int) (jI2 >>> 32), (int) (4294967295L & jI2));
            z5.a aVar = this.V;
            if (aVar == null) {
                this.V = new z5.a(jQ);
                this.W = false;
            } else if (!z5.a.c(aVar.f47271a, jQ)) {
                this.W = true;
            }
            c1Var.q(jQ);
            c1Var.l();
            setMeasuredDimension(getRoot().H.f5942p.f47183a, getRoot().H.f5942p.f47184b);
            if (this.T != null) {
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().H.f5942p.f47183a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().H.f5942p.f47184b, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r12, int r13) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.y.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i11) {
        w4.s sVar;
        int toolType = motionEvent.getToolType(i11);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (sVar = ((u) getPointerIconService()).f7383a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i11);
        }
        Context context = getContext();
        return sVar instanceof w4.a ? PointerIcon.getSystemIcon(context, ((w4.a) sVar).f43096b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // androidx.lifecycle.h
    public final void onResume(LifecycleOwner lifecycleOwner) {
        m3.g gVarV;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(d2.c());
        }
        s2 s2Var = this.f7436f;
        if (s2Var != null) {
            r2 r2Var = this.f7435e;
            r2Var.getClass();
            se.d dVar = s2Var.f7374a;
            e20.j0 j0Var = (e20.j0) dVar.f39013b;
            if (!j0Var.f15673a || j0Var.f15675c) {
                return;
            }
            try {
                gVarV = ((l4) r2Var).f7287a.v(new defpackage.a(s2Var, 7));
            } catch (CancellationException unused) {
                e20.j0 j0Var2 = (e20.j0) dVar.f39013b;
                if (!j0Var2.f15674b) {
                    if (j0Var2.f15675c) {
                        x3.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    j0Var2.a();
                    j0Var2.f15675c = true;
                }
                gVarV = null;
            }
            m3.g gVar = s2Var.f7377d;
            if (gVar != null) {
                gVar.cancel();
            }
            s2Var.f7377d = gVarV;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i11) {
        if (this.f7432b) {
            int[] iArr = g4.h.f19944a;
            z5.m mVar = i11 != 0 ? i11 != 1 ? null : z5.m.Rtl : z5.m.Ltr;
            if (mVar == null) {
                mVar = z5.m.Ltr;
            }
            setLayoutDirection(mVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        h7.c cVar;
        if (Build.VERSION.SDK_INT < 31 || (cVar = this.N1) == null) {
            return;
        }
        cVar.f(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        L();
    }

    @Override // androidx.lifecycle.h
    public final void onStop(LifecycleOwner lifecycleOwner) {
        s2 s2Var = this.f7436f;
        if (s2Var != null) {
            e20.j0 j0Var = (e20.j0) s2Var.f7374a.f39013b;
            if (j0Var.f15673a && !j0Var.f15675c) {
                m3.g gVar = s2Var.f7377d;
                if (gVar != null) {
                    gVar.cancel();
                }
                s2Var.f7377d = null;
                return;
            }
            if (j0Var.f15674b) {
                return;
            }
            if (!j0Var.f15675c) {
                x3.a.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!((q1.t0) j0Var.f15676d).e()) {
                x3.a.a("Attempted to start retaining exited values with pending exited values");
            }
            j0Var.f15675c = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z11) {
        this.f7473x1.f38837a.setValue(new s4.a(z11 ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        d4.e eVar = this.f7476z;
        eVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            b7.a.a(eVar, longSparseArray);
        } else {
            eVar.f14032a.post(new com.google.firebase.messaging.r(6, eVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z11) {
        boolean zC;
        this.f7456p.f7351c.setValue(Boolean.valueOf(z11));
        this.M1 = true;
        super.onWindowFocusChanged(z11);
        if (!z11 || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zC = d2.c())) {
            return;
        }
        setShowLayoutBounds(zC);
        n(getRoot());
    }

    public final boolean q(MotionEvent motionEvent) {
        float x11 = motionEvent.getX();
        float y5 = motionEvent.getY();
        return 0.0f <= x11 && x11 <= ((float) getWidth()) && 0.0f <= y5 && y5 <= ((float) getHeight());
    }

    public final boolean r(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.A1) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i11, Rect rect) {
        if (!isFocused()) {
            g4.f fVarD = g4.h.d(i11);
            int i12 = fVarD != null ? fVarD.f19936a : 7;
            Boolean boolG = ((g4.p) getFocusOwner()).g(i12, rect != null ? i4.g0.E(rect) : null, new v(i12, 0));
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.areEqual(boolG, bool)) {
                if (!Intrinsics.areEqual(((g4.p) getFocusOwner()).g(i12, null, new v(i12, 1)), bool)) {
                    if (!hasFocus()) {
                        return false;
                    }
                    if (i12 == 1 || i12 == 2) {
                        return ((g4.p) getFocusOwner()).j(i12);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void s(float[] fArr) {
        C();
        i4.l0.g(fArr, this.f7442h1);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f7449l1 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f7449l1 & 4294967295L));
        s sVar = p0.f7315a;
        float[] fArr2 = this.f7439g1;
        i4.l0.d(fArr2);
        i4.l0.h(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        p0.c(fArr, fArr2);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j9) {
        this.f7474y.f7196e = j9;
    }

    public final void setConfiguration(@NotNull Configuration configuration) {
        this.J.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(@NotNull d4.e eVar) {
        this.f7476z = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public void setCoroutineContext(@NotNull CoroutineContext coroutineContext) {
        this.f7452n = coroutineContext;
        b4.s sVar = getRoot().G.f5860f;
        if (sVar instanceof w4.m0) {
            ((w4.m0) sVar).N0();
        }
        if (!sVar.getNode().isAttached()) {
            y4.a.b("visitSubtreeIf called on an unattached node");
        }
        o3.e eVar = new o3.e(new b4.s[16], 0);
        b4.s child$ui = sVar.getNode().getChild$ui();
        if (child$ui == null) {
            b5.m.a(eVar, sVar.getNode());
        } else {
            eVar.b(child$ui);
        }
        while (true) {
            int i11 = eVar.f31832c;
            if (i11 == 0) {
                return;
            }
            b4.s sVar2 = (b4.s) eVar.l(i11 - 1);
            if ((sVar2.getAggregateChildKindSet$ui() & 16) != 0) {
                for (b4.s child$ui2 = sVar2; child$ui2 != null && child$ui2.isAttached(); child$ui2 = child$ui2.getChild$ui()) {
                    if ((child$ui2.getKindSet$ui() & 16) != 0) {
                        ?? B = child$ui2;
                        ?? eVar2 = 0;
                        while (B != 0) {
                            if (B instanceof b5.i2) {
                                b5.i2 i2Var = (b5.i2) B;
                                if (i2Var instanceof w4.m0) {
                                    ((w4.m0) i2Var).N0();
                                }
                            } else if ((B.getKindSet$ui() & 16) != 0 && (B instanceof b5.n)) {
                                b4.s child$ui3 = ((b5.n) B).f5892p;
                                int i12 = 0;
                                B = B;
                                eVar2 = eVar2;
                                while (child$ui3 != null) {
                                    if ((child$ui3.getKindSet$ui() & 16) != 0) {
                                        i12++;
                                        eVar2 = eVar2;
                                        if (i12 == 1) {
                                            B = child$ui3;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new o3.e(new b4.s[16], 0);
                                            }
                                            if (B != 0) {
                                                eVar2.b(B);
                                                B = 0;
                                            }
                                            eVar2.b(child$ui3);
                                        }
                                    }
                                    child$ui3 = child$ui3.getChild$ui();
                                    B = B;
                                    eVar2 = eVar2;
                                }
                                if (i12 == 1) {
                                }
                            }
                            B = b5.m.b(eVar2);
                        }
                    }
                }
            }
            b5.m.a(eVar, sVar2);
        }
    }

    public final void setFrameEndScheduler$ui(@Nullable r2 r2Var) {
        this.f7435e = r2Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j9) {
        this.f7446j1 = j9;
    }

    public final void setOnViewTreeOwnersAvailable(@NotNull Function1<? super n, Unit> function1) {
        n viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            function1.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f7455o1 = function1;
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m63setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(@Nullable t4.a aVar) {
        this.f7433c = aVar;
    }

    public void setShowLayoutBounds(boolean z11) {
        this.Q = z11;
    }

    public void setUncaughtExceptionHandler(@Nullable b5.j2 j2Var) {
        this.f7441h0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final long t(long j9) {
        C();
        long jB = i4.l0.b(j9, this.f7442h1);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f7449l1 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f7449l1 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void u(boolean z11) {
        t tVar;
        b5.c1 c1Var = this.f7441h0;
        if (c1Var.f5763b.s() || ((o3.e) c1Var.f5766e.f43083b).f31832c != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z11) {
                try {
                    tVar = this.K1;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } else {
                tVar = null;
            }
            if (c1Var.j(tVar)) {
                requestLayout();
            }
            c1Var.a(false);
            if (this.G) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.G = false;
            }
            Trace.endSection();
        }
    }

    public final void v(b5.m0 m0Var, long j9) {
        b5.c1 c1Var = this.f7441h0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            c1Var.k(m0Var, j9);
            if (!c1Var.f5763b.s()) {
                c1Var.a(false);
                if (this.G) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.G = false;
                }
            }
            getRectManager().a();
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean w(int i11) {
        if (i11 == 7 || i11 == 8) {
            return false;
        }
        Integer numC = g4.h.c(i11);
        if (numC == null) {
            throw b3.i.D("Invalid focus direction");
        }
        int iIntValue = numC.intValue();
        g4.g0 g0VarH = ((g4.p) getFocusOwner()).h();
        if (g0VarH == null) {
            com.braze.h2.b("findNextViewInEmbeddedView called when owner does not have anything focused.");
            return false;
        }
        Integer numC2 = g4.h.c(i11);
        if (numC2 == null) {
            throw b3.i.D("Invalid focus direction");
        }
        int iIntValue2 = numC2.intValue();
        c6.d0 d0Var = b5.m.g(g0VarH).f5879p;
        View interopView = d0Var != null ? d0Var.getInteropView() : null;
        View viewFindFocus = findFocus();
        FocusFinder focusFinder = FocusFinder.getInstance();
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
        if (viewFindNextFocus == null || interopView == null || !p0.a(interopView, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (viewFindNextFocus != null) {
            return g4.h.b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00aa, code lost:
    
        r4.m(0, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x() {
        /*
            r11 = this;
            boolean r0 = r11.M
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L4a
            b5.f2 r0 = r11.getSnapshotObserver()
            z3.x r0 = r0.f5819a
            b5.d r3 = b5.d.f5783o
            java.lang.Object r4 = r0.f47082g
            monitor-enter(r4)
            o3.e r0 = r0.f47081f     // Catch: java.lang.Throwable -> L38
            int r5 = r0.f31832c     // Catch: java.lang.Throwable -> L38
            r6 = r2
            r7 = r6
        L17:
            java.lang.Object[] r8 = r0.f31830a
            if (r6 >= r5) goto L3d
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L38
            z3.w r8 = (z3.w) r8     // Catch: java.lang.Throwable -> L38
            r8.d(r3)     // Catch: java.lang.Throwable -> L38
            q1.t0 r8 = r8.f47069f     // Catch: java.lang.Throwable -> L38
            boolean r8 = r8.f()     // Catch: java.lang.Throwable -> L38
            if (r8 != 0) goto L2d
            int r7 = r7 + 1
            goto L3a
        L2d:
            if (r7 <= 0) goto L3a
            java.lang.Object[] r8 = r0.f31830a     // Catch: java.lang.Throwable -> L38
            int r9 = r6 - r7
            r10 = r8[r6]     // Catch: java.lang.Throwable -> L38
            r8[r9] = r10     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            r0 = move-exception
            goto L48
        L3a:
            int r6 = r6 + 1
            goto L17
        L3d:
            int r3 = r5 - r7
            java.util.Arrays.fill(r8, r3, r5, r1)     // Catch: java.lang.Throwable -> L38
            r0.f31832c = r3     // Catch: java.lang.Throwable -> L38
            monitor-exit(r4)
            r11.M = r2
            goto L4a
        L48:
            monitor-exit(r4)
            throw r0
        L4a:
            c5.i1 r0 = r11.T
            if (r0 == 0) goto L51
            h(r0)
        L51:
            c4.d r0 = r11.L
            if (r0 == 0) goto L71
            q1.h0 r3 = r0.f7032h
            int r4 = r3.f35809d
            if (r4 != 0) goto L6a
            boolean r4 = r0.f7033i
            if (r4 == 0) goto L6a
            se.b r4 = r0.f7025a
            java.lang.Object r4 = r4.f39010b
            android.view.autofill.AutofillManager r4 = (android.view.autofill.AutofillManager) r4
            r4.commit()
            r0.f7033i = r2
        L6a:
            int r3 = r3.f35809d
            if (r3 == 0) goto L71
            r3 = 1
            r0.f7033i = r3
        L71:
            q1.o0 r0 = r11.D1
            boolean r0 = r0.e()
            if (r0 == 0) goto Lae
            q1.o0 r0 = r11.D1
            java.lang.Object r0 = r0.b(r2)
            if (r0 == 0) goto Lae
            q1.o0 r0 = r11.D1
            int r0 = r0.f35722b
            r3 = r2
        L86:
            q1.o0 r4 = r11.D1
            if (r3 >= r0) goto Laa
            java.lang.Object r4 = r4.b(r3)
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            q1.o0 r5 = r11.D1
            if (r3 < 0) goto La6
            int r6 = r5.f35722b
            if (r3 >= r6) goto La6
            java.lang.Object[] r5 = r5.f35721a
            r6 = r5[r3]
            r5[r3] = r1
            if (r4 == 0) goto La3
            r4.invoke()
        La3:
            int r3 = r3 + 1
            goto L86
        La6:
            r5.f(r3)
            throw r1
        Laa:
            r4.m(r2, r0)
            goto L71
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.y.x():void");
    }

    public final void y(b5.m0 m0Var) {
        f0 f0Var = this.f7474y;
        f0Var.f7212v = true;
        if (f0Var.m()) {
            f0Var.o(m0Var);
        }
        d4.e eVar = this.f7476z;
        eVar.f14038g = true;
        if (eVar.f()) {
            eVar.f14039h.h(Unit.f26487a);
        }
    }

    public final void z(b5.m0 m0Var, boolean z11, boolean z12, boolean z13) {
        b5.m0 m0VarW;
        b5.m0 m0VarW2;
        b5.c1 c1Var = this.f7441h0;
        if (!z11) {
            if (c1Var.p(m0Var, z12) && z13) {
                F(m0Var);
                return;
            }
            return;
        }
        a8.h hVar = c1Var.f5763b;
        b5.m0 m0Var2 = m0Var.f5873i;
        b5.q0 q0Var = m0Var.H;
        if (m0Var2 == null) {
            y4.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i11 = b5.b1.$EnumSwitchMapping$0[q0Var.f5931d.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3 || i11 == 4) {
                c1Var.f5769h.b(new b5.a1(m0Var, true, z12));
                return;
            }
            if (i11 != 5) {
                e40.a.f();
                return;
            }
            if (!q0Var.f5932e || z12) {
                q0Var.f5932e = true;
                q0Var.f5942p.f5814v = true;
                if (m0Var.T) {
                    return;
                }
                if ((Intrinsics.areEqual(m0Var.K(), Boolean.TRUE) || b5.c1.h(m0Var)) && ((m0VarW = m0Var.w()) == null || !m0VarW.H.f5932e)) {
                    hVar.a(m0Var, b5.z.LookaheadMeasurement);
                } else if ((m0Var.J() || b5.c1.i(m0Var)) && ((m0VarW2 = m0Var.w()) == null || !m0VarW2.r())) {
                    hVar.a(m0Var, b5.z.Measurement);
                }
                if (c1Var.f5765d || !z13) {
                    return;
                }
                F(m0Var);
            }
        }
    }

    @NotNull
    public h getAccessibilityManager() {
        return this.A;
    }

    @NotNull
    /* JADX INFO: renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public i m65getClipboard() {
        return this.O;
    }

    @NotNull
    /* JADX INFO: renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public j m66getClipboardManager() {
        return this.N;
    }

    @NotNull
    /* JADX INFO: renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public e4.b m67getDragAndDropManager() {
        return this.f7454o;
    }

    @NotNull
    /* JADX INFO: renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public q1.g0 m68getLayoutNodes() {
        return this.f7466u;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, int i12) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i11;
        layoutParamsGenerateDefaultLayoutParams.height = i12;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @u70.d
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m61getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @u70.d
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    @NotNull
    public View getView() {
        return this;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i11, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(@Nullable b5.j2 j2Var) {
    }
}
