package c6;

import a3.f2;
import a3.v1;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.Owner;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.r1;
import b5.e2;
import b5.l1;
import b5.m0;
import b5.q2;
import c5.g4;
import com.app.tgtg.R;
import i4.g0;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends ViewGroup implements h7.v, m3.j, e2, h7.w {
    public static final b A = b.f7673b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v4.d f7699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f7700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Owner f7701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function0 f7702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Function0 f7704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Function0 f7705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b4.t f7706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Function1 f7707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z5.c f7708j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Function1 f7709k;
    public LifecycleOwner l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ea.f f7710m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int[] f7711n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f7712o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public WindowInsetsCompat f7713p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Function1 f7714q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f7715r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f7716s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Function1 f7717t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f7718u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7719v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7720w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final r1 f7721x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f7722y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final m0 f7723z;

    public j(Context context, m3.x xVar, int i11, v4.d dVar, View view, Owner owner) {
        super(context);
        this.f7699a = dVar;
        this.f7700b = view;
        this.f7701c = owner;
        if (xVar != null) {
            LinkedHashMap linkedHashMap = g4.f7242a;
            setTag(R.id.androidx_compose_ui_view_composition_context, xVar);
        }
        int i12 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        d0 d0Var = (d0) this;
        ViewCompat.q0(this, new a(d0Var, i12));
        ViewCompat.k0(this, this);
        this.f7702d = h.f7695d;
        this.f7704f = h.f7694c;
        this.f7705g = h.f7693b;
        b4.q qVar = b4.q.f5711a;
        this.f7706h = qVar;
        this.f7708j = z20.b.d();
        int i13 = 2;
        this.f7711n = new int[2];
        this.f7712o = 0L;
        int i14 = 1;
        this.f7715r = new i(d0Var, i14);
        this.f7716s = new i(d0Var, i12);
        this.f7718u = new int[2];
        this.f7719v = Integer.MIN_VALUE;
        this.f7720w = Integer.MIN_VALUE;
        this.f7721x = new r1();
        m0 m0Var = new m0(3);
        m0Var.f5879p = d0Var;
        b4.t tVarC = j5.r.c(v4.f.a(qVar, l.f7724a, dVar), true, b.f7675d);
        w4.b0 b0Var = new w4.b0();
        b0Var.f43102a = new d(d0Var, i13);
        f2 f2Var = new f2();
        f2 f2Var2 = b0Var.f43103b;
        if (f2Var2 != null) {
            f2Var2.f346b = null;
        }
        b0Var.f43103b = f2Var;
        f2Var.f346b = b0Var;
        setOnRequestDisallowInterceptTouchEvent$ui(f2Var);
        b4.t tVarThen = z4.c0.o(f4.g.d(tVarC.then(b0Var), new f(d0Var, m0Var, d0Var)), new c(d0Var, m0Var, i13)).then(new s(new d(d0Var, i14)));
        m0Var.g0(this.f7706h.then(tVarThen));
        this.f7707i = new b4.x(7, m0Var, tVarThen);
        m0Var.c0(this.f7708j);
        this.f7709k = new androidx.fragment.app.r(m0Var, 10);
        m0Var.N = new c(d0Var, m0Var, i12);
        m0Var.O = new d(d0Var, i12);
        m0Var.f0(new e(d0Var, m0Var));
        this.f7723z = m0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b5.f2 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            y4.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((c5.y) this.f7701c).getSnapshotObserver();
    }

    public static final int j(d0 d0Var, int i11, int i12, int i13) {
        return (i13 >= 0 || i11 == i12) ? View.MeasureSpec.makeMeasureSpec(n80.p.c(i13, i11, i12), 1073741824) : (i13 != -2 || i12 == Integer.MAX_VALUE) ? (i13 != -1 || i12 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    public static x6.d k(x6.d dVar, int i11, int i12, int i13, int i14) {
        int i15 = dVar.f43873a - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = dVar.f43874b - i12;
        if (i16 < 0) {
            i16 = 0;
        }
        int i17 = dVar.f43875c - i13;
        if (i17 < 0) {
            i17 = 0;
        }
        int i18 = dVar.f43876d - i14;
        return x6.d.b(i15, i16, i17, i18 >= 0 ? i18 : 0);
    }

    @Override // m3.j
    public final void a() {
        this.f7705g.invoke();
    }

    @Override // m3.j
    public final void b() {
        this.f7704f.invoke();
        removeAllViewsInLayout();
    }

    @Override // h7.u
    public final void c(int i11, View view) {
        r1 r1Var = this.f7721x;
        if (i11 == 1) {
            r1Var.f3901b = 0;
        } else {
            r1Var.f3900a = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r2v12 */
    @Override // h7.v
    public final void d(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        char c3;
        long j9;
        v4.i iVar;
        q2 q2Var;
        l1 l1Var;
        ?? B;
        if (this.f7700b.isNestedScrollingEnabled()) {
            byte b8 = -1;
            float f11 = -1;
            char c7 = ' ';
            long j11 = 4294967295L;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i11 * f11)) << 32) | (((long) Float.floatToRawIntBits(i12 * f11)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i14 * f11)) & 4294967295L) | (((long) Float.floatToRawIntBits(i13 * f11)) << 32);
            int i16 = i15 == 0 ? 1 : 2;
            v4.i iVar2 = this.f7699a.f41979a;
            if (iVar2 == null || !iVar2.isAttached()) {
                c3 = ' ';
                j9 = 4294967295L;
                iVar = null;
            } else {
                if (!iVar2.getNode().isAttached()) {
                    y4.a.b("visitAncestors called on an unattached node");
                }
                b4.s parent$ui = iVar2.getNode().getParent$ui();
                m0 m0VarG = b5.m.g(iVar2);
                loop0: while (true) {
                    if (m0VarG == null) {
                        c3 = c7;
                        j9 = j11;
                        q2Var = null;
                        break;
                    }
                    c3 = c7;
                    if ((m0VarG.G.f5860f.getAggregateChildKindSet$ui() & 262144) != 0) {
                        while (parent$ui != null) {
                            if ((parent$ui.getKindSet$ui() & 262144) != 0) {
                                ?? r12 = parent$ui;
                                ?? r18 = 0;
                                while (r12 != 0) {
                                    byte b11 = b8;
                                    if (r12 instanceof q2) {
                                        q2 q2Var2 = (q2) r12;
                                        j9 = j11;
                                        if (Intrinsics.areEqual(iVar2.g(), q2Var2.g()) && v4.i.class == q2Var2.getClass()) {
                                            q2Var = q2Var2;
                                            break loop0;
                                        }
                                    } else {
                                        j9 = j11;
                                        if ((r12.getKindSet$ui() & 262144) != 0 && (r12 instanceof b5.n)) {
                                            b4.s child$ui = ((b5.n) r12).f5892p;
                                            int i17 = 0;
                                            B = r12;
                                            r18 = r18;
                                            while (child$ui != null) {
                                                if ((child$ui.getKindSet$ui() & 262144) != 0) {
                                                    i17++;
                                                    if (i17 == 1) {
                                                        B = child$ui;
                                                    } else {
                                                        ?? eVar = r18 == 0 ? new o3.e(new b4.s[16], 0) : r18;
                                                        if (B != 0) {
                                                            eVar.b(B);
                                                            B = 0;
                                                        }
                                                        eVar.b(child$ui);
                                                        r18 = eVar;
                                                    }
                                                }
                                                child$ui = child$ui.getChild$ui();
                                                B = B;
                                                r18 = r18;
                                            }
                                            if (i17 == 1) {
                                            }
                                        }
                                        b8 = b11;
                                        j11 = j9;
                                        r12 = B;
                                        r18 = r18;
                                    }
                                    B = b5.m.b(r18);
                                    b8 = b11;
                                    j11 = j9;
                                    r12 = B;
                                    r18 = r18;
                                }
                            }
                            parent$ui = parent$ui.getParent$ui();
                            b8 = b8;
                            j11 = j11;
                        }
                    }
                    byte b12 = b8;
                    long j12 = j11;
                    m0VarG = m0VarG.w();
                    parent$ui = (m0VarG == null || (l1Var = m0VarG.G) == null) ? null : l1Var.f5859e;
                    c7 = c3;
                    b8 = b12;
                    j11 = j12;
                }
                iVar = (v4.i) q2Var;
            }
            long jO0 = iVar != null ? iVar.o0(i16, jFloatToRawIntBits, jFloatToRawIntBits2) : 0L;
            iArr[0] = j80.c.b(Float.intBitsToFloat((int) (jO0 >> c3))) * (-1);
            iArr[1] = j80.c.b(Float.intBitsToFloat((int) (jO0 & j9))) * (-1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    @Override // h7.u
    public final void e(View view, int i11, int i12, int i13, int i14, int i15) {
        v4.i iVar;
        q2 q2Var;
        l1 l1Var;
        ?? B;
        if (this.f7700b.isNestedScrollingEnabled()) {
            float f11 = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i11 * f11)) << 32) | (((long) Float.floatToRawIntBits(i12 * f11)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i13 * f11)) << 32) | (((long) Float.floatToRawIntBits(i14 * f11)) & 4294967295L);
            int i16 = i15 == 0 ? 1 : 2;
            v4.i iVar2 = this.f7699a.f41979a;
            if (iVar2 == null || !iVar2.isAttached()) {
                iVar = null;
            } else {
                if (!iVar2.getNode().isAttached()) {
                    y4.a.b("visitAncestors called on an unattached node");
                }
                b4.s parent$ui = iVar2.getNode().getParent$ui();
                m0 m0VarG = b5.m.g(iVar2);
                loop0: while (true) {
                    if (m0VarG == null) {
                        q2Var = null;
                        break;
                    }
                    int i17 = 262144;
                    if ((m0VarG.G.f5860f.getAggregateChildKindSet$ui() & 262144) != 0) {
                        while (parent$ui != null) {
                            if ((parent$ui.getKindSet$ui() & i17) != 0) {
                                ?? r11 = parent$ui;
                                ?? eVar = 0;
                                while (r11 != 0) {
                                    if (r11 instanceof q2) {
                                        q2 q2Var2 = (q2) r11;
                                        if (Intrinsics.areEqual(iVar2.g(), q2Var2.g()) && v4.i.class == q2Var2.getClass()) {
                                            q2Var = q2Var2;
                                            break loop0;
                                        }
                                    } else {
                                        if ((r11.getKindSet$ui() & i17) != 0 && (r11 instanceof b5.n)) {
                                            b4.s child$ui = ((b5.n) r11).f5892p;
                                            int i18 = 0;
                                            B = r11;
                                            eVar = eVar;
                                            while (child$ui != null) {
                                                if ((child$ui.getKindSet$ui() & i17) != 0) {
                                                    i18++;
                                                    eVar = eVar;
                                                    if (i18 == 1) {
                                                        B = child$ui;
                                                    } else {
                                                        if (eVar == 0) {
                                                            eVar = new o3.e(new b4.s[16], 0);
                                                        }
                                                        if (B != 0) {
                                                            eVar.b(B);
                                                            B = 0;
                                                        }
                                                        eVar.b(child$ui);
                                                    }
                                                }
                                                child$ui = child$ui.getChild$ui();
                                                i17 = 262144;
                                                B = B;
                                                eVar = eVar;
                                            }
                                            if (i18 == 1) {
                                            }
                                        }
                                        i17 = 262144;
                                        r11 = B;
                                        eVar = eVar;
                                    }
                                    B = b5.m.b(eVar);
                                    i17 = 262144;
                                    r11 = B;
                                    eVar = eVar;
                                }
                            }
                            parent$ui = parent$ui.getParent$ui();
                            i17 = 262144;
                        }
                    }
                    m0VarG = m0VarG.w();
                    parent$ui = (m0VarG == null || (l1Var = m0VarG.G) == null) ? null : l1Var.f5859e;
                }
                iVar = (v4.i) q2Var;
            }
            if (iVar != null) {
                iVar.o0(i16, jFloatToRawIntBits, jFloatToRawIntBits2);
            }
        }
    }

    @Override // h7.u
    public final boolean f(View view, View view2, int i11, int i12) {
        return ((i11 & 2) == 0 && (i11 & 1) == 0) ? false : true;
    }

    @Override // h7.u
    public final void g(View view, View view2, int i11, int i12) {
        r1 r1Var = this.f7721x;
        if (i12 == 1) {
            r1Var.f3901b = i11;
        } else {
            r1Var.f3900a = i11;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f7718u;
        getLocationInWindow(iArr);
        int i11 = iArr[0];
        region.op(i11, iArr[1], getWidth() + i11, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @NotNull
    public final z5.c getDensity() {
        return this.f7708j;
    }

    @Nullable
    public final View getInteropView() {
        return this.f7700b;
    }

    @NotNull
    public final m0 getLayoutNode() {
        return this.f7723z;
    }

    @Override // android.view.View
    @Nullable
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f7700b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Nullable
    public final LifecycleOwner getLifecycleOwner() {
        return this.l;
    }

    @NotNull
    public final b4.t getModifier() {
        return this.f7706h;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r1 r1Var = this.f7721x;
        return r1Var.f3901b | r1Var.f3900a;
    }

    @Nullable
    public final Function1<z5.c, Unit> getOnDensityChanged$ui() {
        return this.f7709k;
    }

    @Nullable
    public final Function1<b4.t, Unit> getOnModifierChanged$ui() {
        return this.f7707i;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.f7717t;
    }

    @NotNull
    public final Function0<Unit> getRelease() {
        return this.f7705g;
    }

    @NotNull
    public final Function0<Unit> getReset() {
        return this.f7704f;
    }

    @Nullable
    public final ea.f getSavedStateRegistryOwner() {
        return this.f7710m;
    }

    @NotNull
    public final Function0<Unit> getUpdate() {
        return this.f7702d;
    }

    @NotNull
    public final View getView() {
        return this.f7700b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r7v15 */
    @Override // h7.u
    public final void h(View view, int i11, int i12, int[] iArr, int i13) {
        char c3;
        long j9;
        l1 l1Var;
        byte b8;
        ?? r16;
        ?? B;
        long j11;
        long j12;
        if (this.f7700b.isNestedScrollingEnabled()) {
            byte b11 = -1;
            float f11 = -1;
            char c7 = ' ';
            long j13 = 4294967295L;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i12 * f11)) & 4294967295L) | (((long) Float.floatToRawIntBits(i11 * f11)) << 32);
            int i14 = i13 == 0 ? 1 : 2;
            v4.i iVar = this.f7699a.f41979a;
            v4.i iVar2 = null;
            q2 q2Var = null;
            if (iVar == null || !iVar.isAttached()) {
                c3 = ' ';
                j9 = 4294967295L;
            } else {
                if (!iVar.getNode().isAttached()) {
                    y4.a.b("visitAncestors called on an unattached node");
                }
                b4.s parent$ui = iVar.getNode().getParent$ui();
                m0 m0VarG = b5.m.g(iVar);
                loop0: while (true) {
                    if (m0VarG == null) {
                        c3 = c7;
                        break;
                    }
                    if ((m0VarG.G.f5860f.getAggregateChildKindSet$ui() & 262144) != 0) {
                        while (parent$ui != null) {
                            if ((parent$ui.getKindSet$ui() & 262144) != 0) {
                                ?? r162 = 0;
                                ?? r14 = parent$ui;
                                while (r14 != 0) {
                                    c3 = c7;
                                    if (r14 instanceof q2) {
                                        q2 q2Var2 = (q2) r14;
                                        b8 = b11;
                                        if (Intrinsics.areEqual(iVar.g(), q2Var2.g()) && v4.i.class == q2Var2.getClass()) {
                                            q2Var = q2Var2;
                                            break loop0;
                                        }
                                    } else {
                                        b8 = b11;
                                        if ((r14.getKindSet$ui() & 262144) != 0 && (r14 instanceof b5.n)) {
                                            b4.s child$ui = ((b5.n) r14).f5892p;
                                            int i15 = 0;
                                            B = r14;
                                            r16 = r162;
                                            while (child$ui != null) {
                                                B = B;
                                                if ((child$ui.getKindSet$ui() & 262144) == 0) {
                                                    j12 = j13;
                                                } else {
                                                    i15++;
                                                    if (i15 == 1) {
                                                        B = child$ui;
                                                        j12 = j13;
                                                    } else {
                                                        j12 = j13;
                                                        ?? eVar = r16 == 0 ? new o3.e(new b4.s[16], 0) : r16;
                                                        if (B != 0) {
                                                            eVar.b(B);
                                                            B = 0;
                                                        }
                                                        eVar.b(child$ui);
                                                        r16 = eVar;
                                                    }
                                                }
                                                child$ui = child$ui.getChild$ui();
                                                j13 = j12;
                                                B = B;
                                                r16 = r16;
                                            }
                                            j11 = j13;
                                            r16 = r16;
                                            if (i15 == 1) {
                                            }
                                            c7 = c3;
                                            b11 = b8;
                                            j13 = j11;
                                            r14 = B;
                                            r162 = r16;
                                        }
                                        B = b5.m.b(r16);
                                        c7 = c3;
                                        b11 = b8;
                                        j13 = j11;
                                        r14 = B;
                                        r162 = r16;
                                    }
                                    j11 = j13;
                                    r16 = r162;
                                    B = b5.m.b(r16);
                                    c7 = c3;
                                    b11 = b8;
                                    j13 = j11;
                                    r14 = B;
                                    r162 = r16;
                                }
                            }
                            parent$ui = parent$ui.getParent$ui();
                            c7 = c7;
                            b11 = b11;
                            j13 = j13;
                        }
                    }
                    char c8 = c7;
                    byte b12 = b11;
                    long j14 = j13;
                    m0VarG = m0VarG.w();
                    parent$ui = (m0VarG == null || (l1Var = m0VarG.G) == null) ? null : l1Var.f5859e;
                    c7 = c8;
                    b11 = b12;
                    j13 = j14;
                }
                j9 = j13;
                iVar2 = (v4.i) q2Var;
            }
            long J = iVar2 != null ? iVar2.J(i14, jFloatToRawIntBits) : 0L;
            iArr[0] = j80.c.b(Float.intBitsToFloat((int) (J >> c3))) * (-1);
            iArr[1] = j80.c.b(Float.intBitsToFloat((int) (J & j9))) * (-1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f7722y) {
            this.f7723z.D();
            return null;
        }
        this.f7700b.postOnAnimation(new b4.b(2, this.f7716s));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f7700b.isNestedScrollingEnabled();
    }

    public final WindowInsetsCompat l(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat.m()) {
            b5.x xVar = this.f7723z.G.f5857c;
            if (xVar.n()) {
                long J = a.a.J(xVar.S(0L));
                int i11 = (int) (J >> 32);
                if (i11 < 0) {
                    i11 = 0;
                }
                int i12 = (int) (J & 4294967295L);
                if (i12 < 0) {
                    i12 = 0;
                }
                long jU = z4.c0.i(xVar).u();
                int i13 = (int) (jU >> 32);
                int i14 = (int) (jU & 4294967295L);
                long j9 = xVar.f47185c;
                long J2 = a.a.J(xVar.S((((long) Float.floatToRawIntBits((int) (j9 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j9 & 4294967295L))) & 4294967295L)));
                int i15 = i13 - ((int) (J2 >> 32));
                if (i15 < 0) {
                    i15 = 0;
                }
                int i16 = i14 - ((int) (4294967295L & J2));
                int i17 = i16 >= 0 ? i16 : 0;
                if (i11 != 0 || i12 != 0 || i15 != 0 || i17 != 0) {
                    return windowInsetsCompat.o(i11, i12, i15, i17);
                }
            }
        }
        return windowInsetsCompat;
    }

    @Override // h7.w
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.f7713p = new WindowInsetsCompat(windowInsetsCompat);
        return l(windowInsetsCompat);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7715r.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f7722y) {
            this.f7723z.D();
        } else {
            this.f7700b.postOnAnimation(new b4.b(2, this.f7716s));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().f5819a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        this.f7700b.layout(0, 0, i13 - i11, i14 - i12);
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        View view = this.f7700b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i11, i12);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f7719v = i11;
        this.f7720w = i12;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        if (!this.f7700b.isNestedScrollingEnabled()) {
            return false;
        }
        f0.B(this.f7699a.c(), null, null, new g(z11, this, ba0.g.g(f11 * (-1.0f), f12 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f11, float f12) {
        if (!this.f7700b.isNestedScrollingEnabled()) {
            return false;
        }
        f0.B(this.f7699a.c(), null, null, new v1(this, ba0.g.g(f11 * (-1.0f), f12 * (-1.0f)), (x70.c) null, 2), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i11) {
        super.onWindowVisibilityChanged(i11);
    }

    @Override // b5.e2
    public final boolean p() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        Function1 function1 = this.f7714q;
        if (function1 == null) {
            return true;
        }
        function1.invoke(rect != null ? g0.E(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z11) {
        Function1 function1 = this.f7717t;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z11));
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    public final void setDensity(@NotNull z5.c cVar) {
        if (cVar != this.f7708j) {
            this.f7708j = cVar;
            Function1 function1 = this.f7709k;
            if (function1 != null) {
                function1.invoke(cVar);
            }
        }
    }

    public final void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.l) {
            this.l = lifecycleOwner;
            setTag(R.id.view_tree_lifecycle_owner, lifecycleOwner);
        }
    }

    public final void setModifier(@NotNull b4.t tVar) {
        if (tVar != this.f7706h) {
            this.f7706h = tVar;
            Function1 function1 = this.f7707i;
            if (function1 != null) {
                function1.invoke(tVar);
            }
        }
    }

    public final void setOnDensityChanged$ui(@Nullable Function1<? super z5.c, Unit> function1) {
        this.f7709k = function1;
    }

    public final void setOnModifierChanged$ui(@Nullable Function1<? super b4.t, Unit> function1) {
        this.f7707i = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(@Nullable Function1<? super Boolean, Unit> function1) {
        this.f7717t = function1;
    }

    public final void setRelease(@NotNull Function0<Unit> function0) {
        this.f7705g = function0;
    }

    public final void setReset(@NotNull Function0<Unit> function0) {
        this.f7704f = function0;
    }

    public final void setSavedStateRegistryOwner(@Nullable ea.f fVar) {
        if (fVar != this.f7710m) {
            this.f7710m = fVar;
            setTag(R.id.view_tree_saved_state_registry_owner, fVar);
        }
    }

    public final void setUpdate(@NotNull Function0<Unit> function0) {
        this.f7702d = function0;
        this.f7703e = true;
        this.f7715r.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
