package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.j;
import androidx.constraintlayout.widget.q;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.i;
import e0.f;
import h7.v;
import i6.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l20.c;
import mr.h;
import n6.g;
import o00.x0;
import p6.b;
import q6.a;
import q6.a0;
import q6.b0;
import q6.c0;
import q6.d0;
import q6.e0;
import q6.g0;
import q6.m;
import q6.n;
import q6.p;
import q6.r;
import q6.s;
import q6.t;
import q6.u;
import q6.x;
import q6.y;
import q6.z;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements v {

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static boolean f2261u1;
    public int A;
    public int B;
    public boolean C;
    public float D;
    public float E;
    public long F;
    public float G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public CopyOnWriteArrayList K;
    public int L;
    public long M;
    public float N;
    public int O;
    public float P;
    public boolean Q;
    public int T;
    public int V;
    public int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d0 f2262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f2263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f2264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2267f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f2268f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2269g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public float f2270g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2271h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f2272h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final e f2273h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2274i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public boolean f2275i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2276j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public x f2277j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f2278k;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public h f2279k1;
    public long l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final Rect f2280l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f2281m;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f2282m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f2283n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public z f2284n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f2285o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public final q6.v f2286o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f2287p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public boolean f2288p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f2289q;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public final RectF f2290q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2291r;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public View f2292r1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2293s;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public Matrix f2294s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public y f2295t;
    public int t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public final ArrayList f2296t1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2297u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public u f2298v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2299w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b f2300x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final t f2301y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public a f2302z;

    public MotionLayout(@NonNull Context context) {
        super(context);
        this.f2264c = null;
        this.f2265d = 0.0f;
        this.f2266e = -1;
        this.f2267f = -1;
        this.f2269g = -1;
        this.f2271h = 0;
        this.f2274i = 0;
        this.f2276j = true;
        this.f2278k = new HashMap();
        this.l = 0L;
        this.f2281m = 1.0f;
        this.f2283n = 0.0f;
        this.f2285o = 0.0f;
        this.f2289q = 0.0f;
        this.f2293s = false;
        this.f2297u = 0;
        this.f2299w = false;
        this.f2300x = new b();
        this.f2301y = new t(this);
        this.C = false;
        this.H = false;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = 0;
        this.M = -1L;
        this.N = 0.0f;
        this.O = 0;
        this.P = 0.0f;
        this.Q = false;
        this.f2273h1 = new e(1);
        this.f2275i1 = false;
        this.f2279k1 = null;
        new HashMap();
        this.f2280l1 = new Rect();
        this.f2282m1 = false;
        this.f2284n1 = z.UNDEFINED;
        this.f2286o1 = new q6.v(this);
        this.f2288p1 = false;
        this.f2290q1 = new RectF();
        this.f2292r1 = null;
        this.f2294s1 = null;
        this.f2296t1 = new ArrayList();
        v(null);
    }

    public static Rect j(MotionLayout motionLayout, g gVar) {
        Rect rect = motionLayout.f2280l1;
        rect.top = gVar.u();
        rect.left = gVar.t();
        rect.right = gVar.s() + rect.left;
        rect.bottom = gVar.m() + rect.top;
        return rect;
    }

    public final void A() {
        o(1.0f);
        this.f2279k1 = null;
    }

    public final void B(int i11) {
        androidx.constraintlayout.widget.z zVar;
        if (!isAttachedToWindow()) {
            if (this.f2277j1 == null) {
                this.f2277j1 = new x(this);
            }
            this.f2277j1.f36335d = i11;
            return;
        }
        d0 d0Var = this.f2262a;
        if (d0Var != null && (zVar = d0Var.f36118b) != null) {
            int i12 = this.f2267f;
            float f11 = -1;
            androidx.constraintlayout.widget.x xVar = (androidx.constraintlayout.widget.x) ((SparseArray) zVar.f2543c).get(i11);
            if (xVar == null) {
                i12 = i11;
            } else {
                ArrayList arrayList = xVar.f2534b;
                int i13 = xVar.f2535c;
                if (f11 != -1.0f && f11 != -1.0f) {
                    Iterator it = arrayList.iterator();
                    androidx.constraintlayout.widget.y yVar = null;
                    while (true) {
                        if (it.hasNext()) {
                            androidx.constraintlayout.widget.y yVar2 = (androidx.constraintlayout.widget.y) it.next();
                            if (yVar2.a(f11, f11)) {
                                if (i12 == yVar2.f2540e) {
                                    break;
                                } else {
                                    yVar = yVar2;
                                }
                            }
                        } else if (yVar != null) {
                            i12 = yVar.f2540e;
                        }
                    }
                } else if (i13 != i12) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (i12 == ((androidx.constraintlayout.widget.y) it2.next()).f2540e) {
                            break;
                        }
                    }
                    i12 = i13;
                }
            }
            if (i12 != -1) {
                i11 = i12;
            }
        }
        int i14 = this.f2267f;
        if (i14 == i11) {
            return;
        }
        if (this.f2266e == i11) {
            o(0.0f);
            return;
        }
        if (this.f2269g == i11) {
            o(1.0f);
            return;
        }
        this.f2269g = i11;
        if (i14 != -1) {
            setTransition(i14, i11);
            o(1.0f);
            this.f2285o = 0.0f;
            A();
            return;
        }
        this.f2299w = false;
        this.f2289q = 1.0f;
        this.f2283n = 0.0f;
        this.f2285o = 0.0f;
        this.f2287p = getNanoTime();
        this.l = getNanoTime();
        this.f2291r = false;
        this.f2263b = null;
        d0 d0Var2 = this.f2262a;
        this.f2281m = (d0Var2.f36119c != null ? r6.f36093h : d0Var2.f36126j) / 1000.0f;
        this.f2266e = -1;
        d0Var2.n(-1, this.f2269g);
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        HashMap map = this.f2278k;
        map.clear();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            map.put(childAt, new p(childAt));
            sparseArray.put(childAt.getId(), (p) map.get(childAt));
        }
        this.f2293s = true;
        q qVarB = this.f2262a.b(i11);
        q6.v vVar = this.f2286o1;
        vVar.e(null, qVarB);
        y();
        vVar.a();
        int childCount2 = getChildCount();
        for (int i16 = 0; i16 < childCount2; i16++) {
            View childAt2 = getChildAt(i16);
            p pVar = (p) map.get(childAt2);
            if (pVar != null) {
                a0 a0Var = pVar.f36281f;
                a0Var.f36064c = 0.0f;
                a0Var.f36065d = 0.0f;
                a0Var.e(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                n nVar = pVar.f36283h;
                nVar.getClass();
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                nVar.f36260c = childAt2.getVisibility();
                nVar.f36262e = childAt2.getVisibility() != 0 ? 0.0f : childAt2.getAlpha();
                nVar.f36263f = childAt2.getElevation();
                nVar.f36264g = childAt2.getRotation();
                nVar.f36265h = childAt2.getRotationX();
                nVar.f36258a = childAt2.getRotationY();
                nVar.f36266i = childAt2.getScaleX();
                nVar.f36267j = childAt2.getScaleY();
                nVar.f36268k = childAt2.getPivotX();
                nVar.l = childAt2.getPivotY();
                nVar.f36269m = childAt2.getTranslationX();
                nVar.f36270n = childAt2.getTranslationY();
                nVar.f36271o = childAt2.getTranslationZ();
            }
        }
        int width = getWidth();
        int height = getHeight();
        for (int i17 = 0; i17 < childCount; i17++) {
            p pVar2 = (p) map.get(getChildAt(i17));
            if (pVar2 != null) {
                this.f2262a.e(pVar2);
                pVar2.g(width, height, getNanoTime());
            }
        }
        c0 c0Var = this.f2262a.f36119c;
        float f12 = c0Var != null ? c0Var.f36094i : 0.0f;
        if (f12 != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i18 = 0; i18 < childCount; i18++) {
                a0 a0Var2 = ((p) map.get(getChildAt(i18))).f36282g;
                float f13 = a0Var2.f36067f + a0Var2.f36066e;
                fMin = Math.min(fMin, f13);
                fMax = Math.max(fMax, f13);
            }
            for (int i19 = 0; i19 < childCount; i19++) {
                p pVar3 = (p) map.get(getChildAt(i19));
                a0 a0Var3 = pVar3.f36282g;
                float f14 = a0Var3.f36066e;
                float f15 = a0Var3.f36067f;
                pVar3.f36288n = 1.0f / (1.0f - f12);
                pVar3.f36287m = f12 - ((((f14 + f15) - fMin) * f12) / (fMax - fMin));
            }
        }
        this.f2283n = 0.0f;
        this.f2285o = 0.0f;
        this.f2293s = true;
        invalidate();
    }

    public final void C(int i11, q qVar) {
        d0 d0Var = this.f2262a;
        if (d0Var != null) {
            d0Var.f36123g.put(i11, qVar);
        }
        this.f2286o1.e(this.f2262a.b(this.f2266e), this.f2262a.b(this.f2269g));
        y();
        if (this.f2267f == i11) {
            qVar.b(this);
        }
    }

    public final void D(int i11, View... viewArr) {
        d0 d0Var = this.f2262a;
        if (d0Var == null) {
            Log.e("MotionLayout", " no motionScene");
            return;
        }
        q2 q2Var = d0Var.f36132q;
        String str = (String) q2Var.f48336d;
        ArrayList arrayList = new ArrayList();
        g0 g0Var = null;
        for (g0 g0Var2 : (ArrayList) q2Var.f48334b) {
            if (g0Var2.f36193a == i11) {
                for (View view : viewArr) {
                    if (g0Var2.b(view)) {
                        arrayList.add(view);
                    }
                }
                if (arrayList.isEmpty()) {
                    g0Var = g0Var2;
                } else {
                    View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                    MotionLayout motionLayout = (MotionLayout) q2Var.f48333a;
                    int currentState = motionLayout.getCurrentState();
                    if (g0Var2.f36197e != 2) {
                        if (currentState == -1) {
                            Log.w(str, "No support for ViewTransition within transition yet. Currently: ".concat(motionLayout.toString()));
                        } else {
                            d0 d0Var2 = motionLayout.f2262a;
                            q qVarB = d0Var2 == null ? null : d0Var2.b(currentState);
                            if (qVarB != null) {
                                g0Var = g0Var2;
                                g0Var.a(q2Var, (MotionLayout) q2Var.f48333a, currentState, qVarB, viewArr2);
                            }
                        }
                        g0Var = g0Var2;
                    } else {
                        g0Var = g0Var2;
                        g0Var.a(q2Var, (MotionLayout) q2Var.f48333a, currentState, null, viewArr2);
                    }
                    arrayList.clear();
                }
            }
        }
        if (g0Var == null) {
            Log.e(str, " Could not find ViewTransition");
        }
    }

    @Override // h7.u
    public final void c(int i11, View view) {
        e0 e0Var;
        int i12;
        d0 d0Var = this.f2262a;
        if (d0Var != null) {
            float f11 = this.G;
            if (f11 == 0.0f) {
                return;
            }
            float f12 = this.D / f11;
            float f13 = this.E / f11;
            c0 c0Var = d0Var.f36119c;
            if (c0Var == null || (e0Var = c0Var.l) == null) {
                return;
            }
            float[] fArr = e0Var.f36148n;
            e0Var.f36147m = false;
            MotionLayout motionLayout = e0Var.f36152r;
            float progress = motionLayout.getProgress();
            e0Var.f36152r.t(e0Var.f36139d, progress, e0Var.f36143h, e0Var.f36142g, fArr);
            float f14 = e0Var.f36146k;
            float f15 = f14 != 0.0f ? (f12 * f14) / fArr[0] : (f13 * e0Var.l) / fArr[1];
            if (!Float.isNaN(f15)) {
                progress += f15 / 3.0f;
            }
            if (progress == 0.0f || progress == 1.0f || (i12 = e0Var.f36138c) == 3) {
                return;
            }
            motionLayout.z(((double) progress) >= 0.5d ? 1.0f : 0.0f, f15, i12);
        }
    }

    @Override // h7.v
    public final void d(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        if (this.C || i11 != 0 || i12 != 0) {
            iArr[0] = iArr[0] + i13;
            iArr[1] = iArr[1] + i14;
        }
        this.C = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x031c A[PHI: r13
      0x031c: PHI (r13v16 float) = (r13v15 float), (r13v20 float) binds: [B:120:0x02f8, B:125:0x0305] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r40) {
        /*
            Method dump skipped, instruction units count: 1370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override // h7.u
    public final boolean f(View view, View view2, int i11, int i12) {
        c0 c0Var;
        e0 e0Var;
        d0 d0Var = this.f2262a;
        return (d0Var == null || (c0Var = d0Var.f36119c) == null || (e0Var = c0Var.l) == null || (e0Var.f36157w & 2) != 0) ? false : true;
    }

    @Override // h7.u
    public final void g(View view, View view2, int i11, int i12) {
        this.F = getNanoTime();
        this.G = 0.0f;
        this.D = 0.0f;
        this.E = 0.0f;
    }

    public int[] getConstraintSetIds() {
        d0 d0Var = this.f2262a;
        if (d0Var == null) {
            return null;
        }
        SparseArray sparseArray = d0Var.f36123g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = sparseArray.keyAt(i11);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.f2267f;
    }

    public ArrayList<c0> getDefinedTransitions() {
        d0 d0Var = this.f2262a;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f36120d;
    }

    public a getDesignTool() {
        if (this.f2302z == null) {
            this.f2302z = new a();
        }
        return this.f2302z;
    }

    public int getEndState() {
        return this.f2269g;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f2285o;
    }

    public d0 getScene() {
        return this.f2262a;
    }

    public int getStartState() {
        return this.f2266e;
    }

    public float getTargetPosition() {
        return this.f2289q;
    }

    public Bundle getTransitionState() {
        if (this.f2277j1 == null) {
            this.f2277j1 = new x(this);
        }
        x xVar = this.f2277j1;
        MotionLayout motionLayout = xVar.f36336e;
        xVar.f36335d = motionLayout.f2269g;
        xVar.f36334c = motionLayout.f2266e;
        xVar.f36333b = motionLayout.getVelocity();
        xVar.f36332a = motionLayout.getProgress();
        x xVar2 = this.f2277j1;
        xVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", xVar2.f36332a);
        bundle.putFloat("motion.velocity", xVar2.f36333b);
        bundle.putInt("motion.StartState", xVar2.f36334c);
        bundle.putInt("motion.EndState", xVar2.f36335d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        d0 d0Var = this.f2262a;
        if (d0Var != null) {
            this.f2281m = (d0Var.f36119c != null ? r2.f36093h : d0Var.f36126j) / 1000.0f;
        }
        return (long) (this.f2281m * 1000.0f);
    }

    public float getVelocity() {
        return this.f2265d;
    }

    @Override // h7.u
    public final void h(View view, int i11, int i12, int[] iArr, int i13) {
        c0 c0Var;
        boolean z11;
        float f11;
        e0 e0Var;
        float f12;
        e0 e0Var2;
        e0 e0Var3;
        e0 e0Var4;
        int i14;
        d0 d0Var = this.f2262a;
        if (d0Var == null || (c0Var = d0Var.f36119c) == null || (z11 = c0Var.f36099o)) {
            return;
        }
        int i15 = -1;
        if (z11 || (e0Var4 = c0Var.l) == null || (i14 = e0Var4.f36140e) == -1 || view.getId() == i14) {
            c0 c0Var2 = d0Var.f36119c;
            if ((c0Var2 == null || (e0Var3 = c0Var2.l) == null) ? false : e0Var3.f36155u) {
                e0 e0Var5 = c0Var.l;
                if (e0Var5 != null && (e0Var5.f36157w & 4) != 0) {
                    i15 = i12;
                }
                float f13 = this.f2283n;
                if ((f13 == 1.0f || f13 == 0.0f) && view.canScrollVertically(i15)) {
                    return;
                }
            }
            e0 e0Var6 = c0Var.l;
            if (e0Var6 == null || (e0Var6.f36157w & 1) == 0) {
                f11 = 0.0f;
            } else {
                float f14 = i11;
                float f15 = i12;
                c0 c0Var3 = d0Var.f36119c;
                if (c0Var3 == null || (e0Var2 = c0Var3.l) == null) {
                    f11 = 0.0f;
                    f12 = 0.0f;
                } else {
                    float[] fArr = e0Var2.f36148n;
                    f11 = 0.0f;
                    e0Var2.f36152r.t(e0Var2.f36139d, e0Var2.f36152r.getProgress(), e0Var2.f36143h, e0Var2.f36142g, fArr);
                    float f16 = e0Var2.f36146k;
                    if (f16 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f12 = (f14 * f16) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f12 = (f15 * e0Var2.l) / fArr[1];
                    }
                }
                float f17 = this.f2285o;
                if ((f17 <= f11 && f12 < f11) || (f17 >= 1.0f && f12 > f11)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new s((ViewGroup) view, 2));
                    return;
                }
            }
            float f18 = this.f2283n;
            long nanoTime = getNanoTime();
            float f19 = i11;
            this.D = f19;
            float f20 = i12;
            this.E = f20;
            this.G = (float) ((nanoTime - this.F) * 1.0E-9d);
            this.F = nanoTime;
            c0 c0Var4 = d0Var.f36119c;
            if (c0Var4 != null && (e0Var = c0Var4.l) != null) {
                float[] fArr2 = e0Var.f36148n;
                MotionLayout motionLayout = e0Var.f36152r;
                float progress = motionLayout.getProgress();
                if (!e0Var.f36147m) {
                    e0Var.f36147m = true;
                    motionLayout.setProgress(progress);
                }
                e0Var.f36152r.t(e0Var.f36139d, progress, e0Var.f36143h, e0Var.f36142g, fArr2);
                if (Math.abs((e0Var.l * fArr2[1]) + (e0Var.f36146k * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f21 = e0Var.f36146k;
                float fMax = Math.max(Math.min(progress + (f21 != f11 ? (f19 * f21) / fArr2[0] : (f20 * e0Var.l) / fArr2[1]), 1.0f), f11);
                if (fMax != motionLayout.getProgress()) {
                    motionLayout.setProgress(fMax);
                }
            }
            if (f18 != this.f2283n) {
                iArr[0] = i11;
                iArr[1] = i12;
            }
            q(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.C = true;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void loadLayoutDescription(int i11) {
        c0 c0Var;
        if (i11 == 0) {
            this.f2262a = null;
            return;
        }
        try {
            d0 d0Var = new d0(getContext(), this, i11);
            this.f2262a = d0Var;
            int i12 = -1;
            if (this.f2267f == -1) {
                this.f2267f = d0Var.g();
                this.f2266e = this.f2262a.g();
                c0 c0Var2 = this.f2262a.f36119c;
                if (c0Var2 != null) {
                    i12 = c0Var2.f36088c;
                }
                this.f2269g = i12;
            }
            if (!isAttachedToWindow()) {
                this.f2262a = null;
                return;
            }
            try {
                Display display = getDisplay();
                if (display != null) {
                    display.getRotation();
                }
                d0 d0Var2 = this.f2262a;
                if (d0Var2 != null) {
                    q qVarB = d0Var2.b(this.f2267f);
                    this.f2262a.m(this);
                    if (qVarB != null) {
                        qVarB.b(this);
                    }
                    this.f2266e = this.f2267f;
                }
                w();
                x xVar = this.f2277j1;
                if (xVar != null) {
                    if (this.f2282m1) {
                        post(new s(this, 0));
                        return;
                    } else {
                        xVar.a();
                        return;
                    }
                }
                d0 d0Var3 = this.f2262a;
                if (d0Var3 == null || (c0Var = d0Var3.f36119c) == null || c0Var.f36098n != 4) {
                    return;
                }
                A();
                setState(z.SETUP);
                setState(z.MOVING);
            } catch (Exception e5) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e5);
            }
        } catch (Exception e11) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e11);
        }
    }

    public final void o(float f11) {
        d0 d0Var = this.f2262a;
        if (d0Var == null) {
            return;
        }
        float f12 = this.f2285o;
        float f13 = this.f2283n;
        if (f12 != f13 && this.f2291r) {
            this.f2285o = f13;
        }
        float f14 = this.f2285o;
        if (f14 == f11) {
            return;
        }
        this.f2299w = false;
        this.f2289q = f11;
        this.f2281m = (d0Var.f36119c != null ? r3.f36093h : d0Var.f36126j) / 1000.0f;
        setProgress(f11);
        this.f2263b = null;
        this.f2264c = this.f2262a.d();
        this.f2291r = false;
        this.l = getNanoTime();
        this.f2293s = true;
        this.f2283n = f14;
        this.f2285o = f14;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        c0 c0Var;
        int i11;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        d0 d0Var = this.f2262a;
        if (d0Var != null && (i11 = this.f2267f) != -1) {
            q qVarB = d0Var.b(i11);
            this.f2262a.m(this);
            if (qVarB != null) {
                qVarB.b(this);
            }
            this.f2266e = this.f2267f;
        }
        w();
        x xVar = this.f2277j1;
        if (xVar != null) {
            if (this.f2282m1) {
                post(new s(this, 1));
                return;
            } else {
                xVar.a();
                return;
            }
        }
        d0 d0Var2 = this.f2262a;
        if (d0Var2 == null || (c0Var = d0Var2.f36119c) == null || c0Var.f36098n != 4) {
            return;
        }
        A();
        setState(z.SETUP);
        setState(z.MOVING);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0125  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) throws Throwable {
        MotionLayout motionLayout;
        this.f2275i1 = true;
        try {
            if (this.f2262a == null) {
                super.onLayout(z11, i11, i12, i13, i14);
                this.f2275i1 = false;
                return;
            }
            motionLayout = this;
            int i15 = i13 - i11;
            int i16 = i14 - i12;
            try {
                if (motionLayout.A != i15 || motionLayout.B != i16) {
                    y();
                    q(true);
                }
                motionLayout.A = i15;
                motionLayout.B = i16;
                motionLayout.f2275i1 = false;
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            motionLayout = this;
        }
        Throwable th4 = th;
        motionLayout.f2275i1 = false;
        throw th4;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        boolean z11;
        if (this.f2262a == null) {
            super.onMeasure(i11, i12);
            return;
        }
        boolean z12 = true;
        boolean z13 = (this.f2271h == i11 && this.f2274i == i12) ? false : true;
        if (this.f2288p1) {
            this.f2288p1 = false;
            w();
            x();
            z13 = true;
        }
        if (this.mDirtyHierarchy) {
            z13 = true;
        }
        this.f2271h = i11;
        this.f2274i = i12;
        int iG = this.f2262a.g();
        c0 c0Var = this.f2262a.f36119c;
        int i13 = c0Var == null ? -1 : c0Var.f36088c;
        q6.v vVar = this.f2286o1;
        if ((!z13 && iG == vVar.f36327e && i13 == vVar.f36328f) || this.f2266e == -1) {
            if (z13) {
                super.onMeasure(i11, i12);
            }
            z11 = true;
        } else {
            super.onMeasure(i11, i12);
            vVar.e(this.f2262a.b(iG), this.f2262a.b(i13));
            vVar.f();
            vVar.f36327e = iG;
            vVar.f36328f = i13;
            z11 = false;
        }
        if (this.Q || z11) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int iS = this.mLayoutWidget.s() + getPaddingRight() + getPaddingLeft();
            int iM = this.mLayoutWidget.m() + paddingBottom;
            int i14 = this.t0;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                iS = (int) ((this.f2270g1 * (this.W - r1)) + this.T);
                requestLayout();
            }
            int i15 = this.f2268f1;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                iM = (int) ((this.f2270g1 * (this.f2272h0 - r2)) + this.V);
                requestLayout();
            }
            setMeasuredDimension(iS, iM);
        }
        float fSignum = Math.signum(this.f2289q - this.f2285o);
        long nanoTime = getNanoTime();
        r rVar = this.f2263b;
        float interpolation = this.f2285o + (!(rVar instanceof b) ? (((nanoTime - this.f2287p) * fSignum) * 1.0E-9f) / this.f2281m : 0.0f);
        if (this.f2291r) {
            interpolation = this.f2289q;
        }
        if ((fSignum <= 0.0f || interpolation < this.f2289q) && (fSignum > 0.0f || interpolation > this.f2289q)) {
            z12 = false;
        } else {
            interpolation = this.f2289q;
        }
        if (rVar != null && !z12) {
            interpolation = this.f2299w ? rVar.getInterpolation((nanoTime - this.l) * 1.0E-9f) : rVar.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.f2289q) || (fSignum <= 0.0f && interpolation <= this.f2289q)) {
            interpolation = this.f2289q;
        }
        this.f2270g1 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.f2264c;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        float f11 = interpolation;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            p pVar = (p) this.f2278k.get(childAt);
            if (pVar != null) {
                pVar.d(f11, nanoTime2, childAt, this.f2273h1);
            }
        }
        if (this.Q) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f11, float f12) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i11) {
        e0 e0Var;
        d0 d0Var = this.f2262a;
        if (d0Var != null) {
            boolean zIsRtl = isRtl();
            d0Var.f36131p = zIsRtl;
            c0 c0Var = d0Var.f36119c;
            if (c0Var == null || (e0Var = c0Var.l) == null) {
                return;
            }
            e0Var.c(zIsRtl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0568  */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v25 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instruction units count: 1993
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof q6.q) {
            q6.q qVar = (q6.q) view;
            if (this.K == null) {
                this.K = new CopyOnWriteArrayList();
            }
            this.K.add(qVar);
            if (qVar.f36301i) {
                if (this.I == null) {
                    this.I = new ArrayList();
                }
                this.I.add(qVar);
            }
            if (qVar.f36302j) {
                if (this.J == null) {
                    this.J = new ArrayList();
                }
                this.J.add(qVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.I;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.J;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void p(boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            p pVar = (p) this.f2278k.get(getChildAt(i11));
            if (pVar != null && "button".equals(x0.w(pVar.f36277b)) && pVar.A != null) {
                int i12 = 0;
                while (true) {
                    m[] mVarArr = pVar.A;
                    if (i12 < mVarArr.length) {
                        mVarArr[i12].g(pVar.f36277b, z11 ? -100.0f : 100.0f);
                        i12++;
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void parseLayoutDescription(int i11) {
        this.mConstraintLayoutSpec = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00db A[PHI: r3
      0x00db: PHI (r3v50 float) = (r3v49 float), (r3v51 float), (r3v51 float) binds: [B:47:0x00a9, B:58:0x00cf, B:60:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(boolean r21) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.q(boolean):void");
    }

    public final void r() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2;
        if ((this.f2295t == null && ((copyOnWriteArrayList2 = this.K) == null || copyOnWriteArrayList2.isEmpty())) || this.P == this.f2283n) {
            return;
        }
        if (this.O != -1 && (copyOnWriteArrayList = this.K) != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((y) it.next()).getClass();
            }
        }
        this.O = -1;
        this.P = this.f2283n;
        y yVar = this.f2295t;
        if (yVar != null) {
            yVar.a();
        }
        CopyOnWriteArrayList copyOnWriteArrayList3 = this.K;
        if (copyOnWriteArrayList3 != null) {
            Iterator it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                ((y) it2.next()).a();
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        d0 d0Var;
        c0 c0Var;
        if (!this.Q && this.f2267f == -1 && (d0Var = this.f2262a) != null && (c0Var = d0Var.f36119c) != null) {
            int i11 = c0Var.f36101q;
            if (i11 == 0) {
                return;
            }
            if (i11 == 2) {
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    ((p) this.f2278k.get(getChildAt(i12))).f36279d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public final void s() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.f2295t != null || ((copyOnWriteArrayList = this.K) != null && !copyOnWriteArrayList.isEmpty())) && this.O == -1) {
            this.O = this.f2267f;
            ArrayList arrayList = this.f2296t1;
            int iIntValue = !arrayList.isEmpty() ? ((Integer) j4.s.d(1, arrayList)).intValue() : -1;
            int i11 = this.f2267f;
            if (iIntValue != i11 && i11 != -1) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        x();
        h hVar = this.f2279k1;
        if (hVar != null) {
            hVar.run();
            this.f2279k1 = null;
        }
    }

    public void setDebugMode(int i11) {
        this.f2297u = i11;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z11) {
        this.f2282m1 = z11;
    }

    public void setInteractionEnabled(boolean z11) {
        this.f2276j = z11;
    }

    public void setInterpolatedProgress(float f11) {
        if (this.f2262a != null) {
            setState(z.MOVING);
            Interpolator interpolatorD = this.f2262a.d();
            if (interpolatorD != null) {
                setProgress(interpolatorD.getInterpolation(f11));
                return;
            }
        }
        setProgress(f11);
    }

    public void setOnHide(float f11) {
        ArrayList arrayList = this.J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((q6.q) this.J.get(i11)).setProgress(f11);
            }
        }
    }

    public void setOnShow(float f11) {
        ArrayList arrayList = this.I;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((q6.q) this.I.get(i11)).setProgress(f11);
            }
        }
    }

    public void setProgress(float f11) {
        if (f11 < 0.0f || f11 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f2277j1 == null) {
                this.f2277j1 = new x(this);
            }
            this.f2277j1.f36332a = f11;
            return;
        }
        if (f11 <= 0.0f) {
            if (this.f2285o == 1.0f && this.f2267f == this.f2269g) {
                setState(z.MOVING);
            }
            this.f2267f = this.f2266e;
            if (this.f2285o == 0.0f) {
                setState(z.FINISHED);
            }
        } else if (f11 >= 1.0f) {
            if (this.f2285o == 0.0f && this.f2267f == this.f2266e) {
                setState(z.MOVING);
            }
            this.f2267f = this.f2269g;
            if (this.f2285o == 1.0f) {
                setState(z.FINISHED);
            }
        } else {
            this.f2267f = -1;
            setState(z.MOVING);
        }
        if (this.f2262a == null) {
            return;
        }
        this.f2291r = true;
        this.f2289q = f11;
        this.f2283n = f11;
        this.f2287p = -1L;
        this.l = -1L;
        this.f2263b = null;
        this.f2293s = true;
        invalidate();
    }

    public void setScene(d0 d0Var) {
        e0 e0Var;
        this.f2262a = d0Var;
        boolean zIsRtl = isRtl();
        d0Var.f36131p = zIsRtl;
        c0 c0Var = d0Var.f36119c;
        if (c0Var != null && (e0Var = c0Var.l) != null) {
            e0Var.c(zIsRtl);
        }
        y();
    }

    public void setStartState(int i11) {
        if (isAttachedToWindow()) {
            this.f2267f = i11;
            return;
        }
        if (this.f2277j1 == null) {
            this.f2277j1 = new x(this);
        }
        x xVar = this.f2277j1;
        xVar.f36334c = i11;
        xVar.f36335d = i11;
    }

    public void setState(z zVar) {
        z zVar2 = z.FINISHED;
        if (zVar == zVar2 && this.f2267f == -1) {
            return;
        }
        z zVar3 = this.f2284n1;
        this.f2284n1 = zVar;
        z zVar4 = z.MOVING;
        if (zVar3 == zVar4 && zVar == zVar4) {
            r();
        }
        int iOrdinal = zVar3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && zVar == zVar2) {
                s();
                return;
            }
            return;
        }
        if (zVar == zVar4) {
            r();
        }
        if (zVar == zVar2) {
            s();
        }
    }

    public void setTransition(int i11) {
        c0 c0Var;
        d0 d0Var = this.f2262a;
        if (d0Var != null) {
            Iterator it = d0Var.f36120d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c0Var = null;
                    break;
                } else {
                    c0Var = (c0) it.next();
                    if (c0Var.f36086a == i11) {
                        break;
                    }
                }
            }
            this.f2266e = c0Var.f36089d;
            this.f2269g = c0Var.f36088c;
            if (!isAttachedToWindow()) {
                if (this.f2277j1 == null) {
                    this.f2277j1 = new x(this);
                }
                x xVar = this.f2277j1;
                xVar.f36334c = this.f2266e;
                xVar.f36335d = this.f2269g;
                return;
            }
            int i12 = this.f2267f;
            float f11 = i12 == this.f2266e ? 0.0f : i12 == this.f2269g ? 1.0f : Float.NaN;
            d0 d0Var2 = this.f2262a;
            d0Var2.f36119c = c0Var;
            e0 e0Var = c0Var.l;
            if (e0Var != null) {
                e0Var.c(d0Var2.f36131p);
            }
            this.f2286o1.e(this.f2262a.b(this.f2266e), this.f2262a.b(this.f2269g));
            y();
            if (this.f2285o != f11) {
                if (f11 == 0.0f) {
                    p(true);
                    this.f2262a.b(this.f2266e).b(this);
                } else if (f11 == 1.0f) {
                    p(false);
                    this.f2262a.b(this.f2269g).b(this);
                }
            }
            this.f2285o = Float.isNaN(f11) ? 0.0f : f11;
            if (!Float.isNaN(f11)) {
                setProgress(f11);
            } else {
                Log.v("MotionLayout", x0.u().concat(" transitionToStart "));
                o(0.0f);
            }
        }
    }

    public void setTransitionDuration(int i11) {
        d0 d0Var = this.f2262a;
        if (d0Var == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        c0 c0Var = d0Var.f36119c;
        if (c0Var != null) {
            c0Var.f36093h = Math.max(i11, 8);
        } else {
            d0Var.f36126j = i11;
        }
    }

    public void setTransitionListener(y yVar) {
        this.f2295t = yVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f2277j1 == null) {
            this.f2277j1 = new x(this);
        }
        x xVar = this.f2277j1;
        xVar.getClass();
        xVar.f36332a = bundle.getFloat("motion.progress");
        xVar.f36333b = bundle.getFloat("motion.velocity");
        xVar.f36334c = bundle.getInt("motion.StartState");
        xVar.f36335d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.f2277j1.a();
        }
    }

    public final void t(int i11, float f11, float f12, float f13, float[] fArr) {
        double[] dArr;
        View viewById = getViewById(i11);
        p pVar = (p) this.f2278k.get(viewById);
        if (pVar == null) {
            Log.w("MotionLayout", "WARNING could not find view id " + (viewById == null ? j4.s.f(i11, "") : viewById.getContext().getResources().getResourceName(i11)));
            return;
        }
        a0 a0Var = pVar.f36281f;
        float[] fArr2 = pVar.f36296v;
        float fA = pVar.a(f11, fArr2);
        xz.b[] bVarArr = pVar.f36285j;
        int i12 = 0;
        if (bVarArr != null) {
            double d3 = fA;
            bVarArr[0].x(d3, pVar.f36291q);
            pVar.f36285j[0].v(d3, pVar.f36290p);
            float f14 = fArr2[0];
            while (true) {
                dArr = pVar.f36291q;
                if (i12 >= dArr.length) {
                    break;
                }
                dArr[i12] = dArr[i12] * ((double) f14);
                i12++;
            }
            i6.b bVar = pVar.f36286k;
            if (bVar != null) {
                double[] dArr2 = pVar.f36290p;
                if (dArr2.length > 0) {
                    bVar.v(d3, dArr2);
                    pVar.f36286k.x(d3, pVar.f36291q);
                    int[] iArr = pVar.f36289o;
                    double[] dArr3 = pVar.f36291q;
                    double[] dArr4 = pVar.f36290p;
                    a0Var.getClass();
                    a0.f(f12, f13, fArr, iArr, dArr3, dArr4);
                }
            } else {
                int[] iArr2 = pVar.f36289o;
                double[] dArr5 = pVar.f36290p;
                a0Var.getClass();
                a0.f(f12, f13, fArr, iArr2, dArr, dArr5);
            }
        } else {
            a0 a0Var2 = pVar.f36282g;
            float f15 = a0Var2.f36066e - a0Var.f36066e;
            float f16 = a0Var2.f36067f - a0Var.f36067f;
            float f17 = a0Var2.f36068g - a0Var.f36068g;
            float f18 = (a0Var2.f36069h - a0Var.f36069h) + f16;
            fArr[0] = ((f17 + f15) * f12) + ((1.0f - f12) * f15);
            fArr[1] = (f18 * f13) + ((1.0f - f13) * f16);
        }
        viewById.getY();
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return x0.v(context, this.f2266e) + "->" + x0.v(context, this.f2269g) + " (pos:" + this.f2285o + " Dpos/Dt:" + this.f2265d;
    }

    public final boolean u(float f11, float f12, View view, MotionEvent motionEvent) {
        boolean z11;
        boolean zOnTouchEvent;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (u((r3.getLeft() + f11) - view.getScrollX(), (r3.getTop() + f12) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
        } else {
            z11 = false;
        }
        if (!z11) {
            RectF rectF = this.f2290q1;
            rectF.set(f11, f12, (view.getRight() + f11) - view.getLeft(), (view.getBottom() + f12) - view.getTop());
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f13 = -f11;
                float f14 = -f12;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f13, f14);
                    zOnTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f13, -f14);
                } else {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(f13, f14);
                    if (this.f2294s1 == null) {
                        this.f2294s1 = new Matrix();
                    }
                    matrix.invert(this.f2294s1);
                    motionEventObtain.transform(this.f2294s1);
                    zOnTouchEvent = view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zOnTouchEvent) {
                    return true;
                }
            }
        }
        return z11;
    }

    public final void v(AttributeSet attributeSet) {
        d0 d0Var;
        f2261u1 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.v.f2520o);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z11 = true;
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 2) {
                    this.f2262a = new d0(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.f2267f = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.f2289q = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f2293s = true;
                } else if (index == 0) {
                    z11 = typedArrayObtainStyledAttributes.getBoolean(index, z11);
                } else if (index == 5) {
                    if (this.f2297u == 0) {
                        this.f2297u = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.f2297u = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.f2262a == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z11) {
                this.f2262a = null;
            }
        }
        if (this.f2297u != 0) {
            d0 d0Var2 = this.f2262a;
            if (d0Var2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int iG = d0Var2.g();
                d0 d0Var3 = this.f2262a;
                q qVarB = d0Var3.b(d0Var3.g());
                String strV = x0.v(getContext(), iG);
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    int id2 = childAt.getId();
                    if (id2 == -1) {
                        StringBuilder sbS = f.s("CHECK: ", strV, " ALL VIEWS SHOULD HAVE ID's ");
                        sbS.append(childAt.getClass().getName());
                        sbS.append(" does not!");
                        Log.w("MotionLayout", sbS.toString());
                    }
                    if (qVarB.j(id2) == null) {
                        StringBuilder sbS2 = f.s("CHECK: ", strV, " NO CONSTRAINTS for ");
                        sbS2.append(x0.w(childAt));
                        Log.w("MotionLayout", sbS2.toString());
                    }
                }
                Integer[] numArr = (Integer[]) qVarB.f2494g.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i13 = 0; i13 < length; i13++) {
                    iArr[i13] = numArr[i13].intValue();
                }
                for (int i14 = 0; i14 < length; i14++) {
                    int i15 = iArr[i14];
                    String strV2 = x0.v(getContext(), i15);
                    if (findViewById(iArr[i14]) == null) {
                        Log.w("MotionLayout", "CHECK: " + strV + " NO View matches id " + strV2);
                    }
                    if (qVarB.i(i15).f2407e.f2418d == -1) {
                        Log.w("MotionLayout", org.bouncycastle.jcajce.provider.asymmetric.a.d("CHECK: ", strV, "(", strV2, ") no LAYOUT_HEIGHT"));
                    }
                    if (qVarB.i(i15).f2407e.f2416c == -1) {
                        Log.w("MotionLayout", org.bouncycastle.jcajce.provider.asymmetric.a.d("CHECK: ", strV, "(", strV2, ") no LAYOUT_HEIGHT"));
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                for (c0 c0Var : this.f2262a.f36120d) {
                    if (c0Var == this.f2262a.f36119c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (c0Var.f36089d == c0Var.f36088c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i16 = c0Var.f36089d;
                    int i17 = c0Var.f36088c;
                    String strV3 = x0.v(getContext(), i16);
                    String strV4 = x0.v(getContext(), i17);
                    if (sparseIntArray.get(i16) == i17) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + strV3 + "->" + strV4);
                    }
                    if (sparseIntArray2.get(i17) == i16) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + strV3 + "->" + strV4);
                    }
                    sparseIntArray.put(i16, i17);
                    sparseIntArray2.put(i17, i16);
                    if (this.f2262a.b(i16) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + strV3);
                    }
                    if (this.f2262a.b(i17) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + strV3);
                    }
                }
            }
        }
        if (this.f2267f != -1 || (d0Var = this.f2262a) == null) {
            return;
        }
        this.f2267f = d0Var.g();
        this.f2266e = this.f2262a.g();
        c0 c0Var2 = this.f2262a.f36119c;
        this.f2269g = c0Var2 != null ? c0Var2.f36088c : -1;
    }

    public final void w() {
        c0 c0Var;
        e0 e0Var;
        View viewFindViewById;
        d0 d0Var = this.f2262a;
        if (d0Var == null) {
            return;
        }
        if (d0Var.a(this.f2267f, this)) {
            requestLayout();
            return;
        }
        int i11 = this.f2267f;
        if (i11 != -1) {
            d0 d0Var2 = this.f2262a;
            ArrayList<c0> arrayList = d0Var2.f36122f;
            ArrayList<c0> arrayList2 = d0Var2.f36120d;
            for (c0 c0Var2 : arrayList2) {
                if (c0Var2.f36097m.size() > 0) {
                    Iterator it = c0Var2.f36097m.iterator();
                    while (it.hasNext()) {
                        ((b0) it.next()).b(this);
                    }
                }
            }
            for (c0 c0Var3 : arrayList) {
                if (c0Var3.f36097m.size() > 0) {
                    Iterator it2 = c0Var3.f36097m.iterator();
                    while (it2.hasNext()) {
                        ((b0) it2.next()).b(this);
                    }
                }
            }
            for (c0 c0Var4 : arrayList2) {
                if (c0Var4.f36097m.size() > 0) {
                    Iterator it3 = c0Var4.f36097m.iterator();
                    while (it3.hasNext()) {
                        ((b0) it3.next()).a(this, i11, c0Var4);
                    }
                }
            }
            for (c0 c0Var5 : arrayList) {
                if (c0Var5.f36097m.size() > 0) {
                    Iterator it4 = c0Var5.f36097m.iterator();
                    while (it4.hasNext()) {
                        ((b0) it4.next()).a(this, i11, c0Var5);
                    }
                }
            }
        }
        if (!this.f2262a.o() || (c0Var = this.f2262a.f36119c) == null || (e0Var = c0Var.l) == null) {
            return;
        }
        MotionLayout motionLayout = e0Var.f36152r;
        int i12 = e0Var.f36139d;
        if (i12 != -1) {
            viewFindViewById = motionLayout.findViewById(i12);
            if (viewFindViewById == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + x0.v(motionLayout.getContext(), e0Var.f36139d));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new i(2));
            nestedScrollView.setOnScrollChangeListener(new c(9));
        }
    }

    public final void x() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (this.f2295t == null && ((copyOnWriteArrayList = this.K) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        ArrayList<Integer> arrayList = this.f2296t1;
        for (Integer num : arrayList) {
            if (this.f2295t != null) {
                num.getClass();
            }
            CopyOnWriteArrayList<y> copyOnWriteArrayList2 = this.K;
            if (copyOnWriteArrayList2 != null) {
                for (y yVar : copyOnWriteArrayList2) {
                    num.getClass();
                    yVar.getClass();
                }
            }
        }
        arrayList.clear();
    }

    public final void y() {
        this.f2286o1.f();
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(float r18, float r19, int r20) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.z(float, float, int):void");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i11, int i12, int i13) {
        setState(z.SETUP);
        this.f2267f = i11;
        this.f2266e = -1;
        this.f2269g = -1;
        j jVar = this.mConstraintLayoutSpec;
        if (jVar != null) {
            jVar.b(i12, i13, i11);
            return;
        }
        d0 d0Var = this.f2262a;
        if (d0Var != null) {
            d0Var.b(i11).b(this);
        }
    }

    public void setProgress(float f11, float f12) {
        if (!isAttachedToWindow()) {
            if (this.f2277j1 == null) {
                this.f2277j1 = new x(this);
            }
            x xVar = this.f2277j1;
            xVar.f36332a = f11;
            xVar.f36333b = f12;
            return;
        }
        setProgress(f11);
        setState(z.MOVING);
        this.f2265d = f12;
        if (f12 != 0.0f) {
            o(f12 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f11 == 0.0f || f11 == 1.0f) {
                return;
            }
            o(f11 > 0.5f ? 1.0f : 0.0f);
        }
    }

    public MotionLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2264c = null;
        this.f2265d = 0.0f;
        this.f2266e = -1;
        this.f2267f = -1;
        this.f2269g = -1;
        this.f2271h = 0;
        this.f2274i = 0;
        this.f2276j = true;
        this.f2278k = new HashMap();
        this.l = 0L;
        this.f2281m = 1.0f;
        this.f2283n = 0.0f;
        this.f2285o = 0.0f;
        this.f2289q = 0.0f;
        this.f2293s = false;
        this.f2297u = 0;
        this.f2299w = false;
        this.f2300x = new b();
        this.f2301y = new t(this);
        this.C = false;
        this.H = false;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = 0;
        this.M = -1L;
        this.N = 0.0f;
        this.O = 0;
        this.P = 0.0f;
        this.Q = false;
        this.f2273h1 = new e(1);
        this.f2275i1 = false;
        this.f2279k1 = null;
        new HashMap();
        this.f2280l1 = new Rect();
        this.f2282m1 = false;
        this.f2284n1 = z.UNDEFINED;
        this.f2286o1 = new q6.v(this);
        this.f2288p1 = false;
        this.f2290q1 = new RectF();
        this.f2292r1 = null;
        this.f2294s1 = null;
        this.f2296t1 = new ArrayList();
        v(attributeSet);
    }

    public MotionLayout(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f2264c = null;
        this.f2265d = 0.0f;
        this.f2266e = -1;
        this.f2267f = -1;
        this.f2269g = -1;
        this.f2271h = 0;
        this.f2274i = 0;
        this.f2276j = true;
        this.f2278k = new HashMap();
        this.l = 0L;
        this.f2281m = 1.0f;
        this.f2283n = 0.0f;
        this.f2285o = 0.0f;
        this.f2289q = 0.0f;
        this.f2293s = false;
        this.f2297u = 0;
        this.f2299w = false;
        this.f2300x = new b();
        this.f2301y = new t(this);
        this.C = false;
        this.H = false;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = 0;
        this.M = -1L;
        this.N = 0.0f;
        this.O = 0;
        this.P = 0.0f;
        this.Q = false;
        this.f2273h1 = new e(1);
        this.f2275i1 = false;
        this.f2279k1 = null;
        new HashMap();
        this.f2280l1 = new Rect();
        this.f2282m1 = false;
        this.f2284n1 = z.UNDEFINED;
        this.f2286o1 = new q6.v(this);
        this.f2288p1 = false;
        this.f2290q1 = new RectF();
        this.f2292r1 = null;
        this.f2294s1 = null;
        this.f2296t1 = new ArrayList();
        v(attributeSet);
    }

    public void setTransition(int i11, int i12) {
        if (!isAttachedToWindow()) {
            if (this.f2277j1 == null) {
                this.f2277j1 = new x(this);
            }
            x xVar = this.f2277j1;
            xVar.f36334c = i11;
            xVar.f36335d = i12;
            return;
        }
        d0 d0Var = this.f2262a;
        if (d0Var != null) {
            this.f2266e = i11;
            this.f2269g = i12;
            d0Var.n(i11, i12);
            this.f2286o1.e(this.f2262a.b(i11), this.f2262a.b(i12));
            y();
            this.f2285o = 0.0f;
            o(0.0f);
        }
    }

    public void setTransition(c0 c0Var) {
        e0 e0Var;
        d0 d0Var = this.f2262a;
        d0Var.f36119c = c0Var;
        if (c0Var != null && (e0Var = c0Var.l) != null) {
            e0Var.c(d0Var.f36131p);
        }
        setState(z.SETUP);
        int i11 = this.f2267f;
        c0 c0Var2 = this.f2262a.f36119c;
        if (i11 == (c0Var2 == null ? -1 : c0Var2.f36088c)) {
            this.f2285o = 1.0f;
            this.f2283n = 1.0f;
            this.f2289q = 1.0f;
        } else {
            this.f2285o = 0.0f;
            this.f2283n = 0.0f;
            this.f2289q = 0.0f;
        }
        this.f2287p = (c0Var.f36102r & 1) != 0 ? -1L : getNanoTime();
        int iG = this.f2262a.g();
        d0 d0Var2 = this.f2262a;
        c0 c0Var3 = d0Var2.f36119c;
        int i12 = c0Var3 != null ? c0Var3.f36088c : -1;
        if (iG == this.f2266e && i12 == this.f2269g) {
            return;
        }
        this.f2266e = iG;
        this.f2269g = i12;
        d0Var2.n(iG, i12);
        q qVarB = this.f2262a.b(this.f2266e);
        q qVarB2 = this.f2262a.b(this.f2269g);
        q6.v vVar = this.f2286o1;
        vVar.e(qVarB, qVarB2);
        int i13 = this.f2266e;
        int i14 = this.f2269g;
        vVar.f36327e = i13;
        vVar.f36328f = i14;
        vVar.f();
        y();
    }

    @Override // h7.u
    public final void e(View view, int i11, int i12, int i13, int i14, int i15) {
    }
}
