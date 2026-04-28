package z4;

import android.os.Build;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat$Callback;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends WindowInsetsAnimationCompat$Callback implements Runnable, h7.w, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WindowInsetsCompat f47226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q1.t0 f47227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m3.h1 f47228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q1.o0 f47229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z3.r f47230i;

    public s() {
        super(1);
        q1.t0 t0Var = new q1.t0(9);
        e2.f47115a.getClass();
        t0Var.m(d2.f47105b, new h2("caption bar"));
        t0Var.m(d2.f47106c, new h2("display cutout"));
        t0Var.m(d2.f47107d, new h2("ime"));
        t0Var.m(d2.f47108e, new h2("mandatory system gestures"));
        t0Var.m(d2.f47109f, new h2("navigation bars"));
        t0Var.m(d2.f47110g, new h2("status bars"));
        t0Var.m(d2.f47111h, new h2("system gestures"));
        t0Var.m(d2.f47112i, new h2("tappable element"));
        t0Var.m(d2.f47113j, new h2("waterfall"));
        this.f47227f = t0Var;
        this.f47228g = new m3.h1(0);
        this.f47229h = new q1.o0(4);
        this.f47230i = new z3.r();
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final void b(h7.o1 o1Var) {
        boolean z11 = false;
        this.f47224c = false;
        int iD = o1Var.f21602a.d();
        this.f47225d &= ~iD;
        this.f47226e = null;
        e2 e2Var = (e2) g2.f47128a.b(iD);
        if (e2Var != null) {
            Object objD = this.f47227f.d(e2Var);
            objD.getClass();
            h2 h2Var = (h2) objD;
            h2Var.f47135c.i(0.0f);
            h2Var.f47137e.i(1.0f);
            h2Var.f47136d.i(0L);
            h2Var.f47135c.i(0.0f);
            h2Var.f47134b.setValue(Boolean.FALSE);
            h2Var.f47142j = -1L;
            h2Var.f47143k = -1L;
            m3.h1 h1Var = this.f47228g;
            h1Var.i(h1Var.h() + 1);
            synchronized (z3.l.f47038c) {
                q1.u0 u0Var = z3.l.f47045j.f46981h;
                if (u0Var != null) {
                    if (u0Var.c()) {
                        z11 = true;
                    }
                }
            }
            if (z11) {
                z3.l.a();
            }
        }
        super.b(o1Var);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final void c(h7.o1 o1Var) {
        this.f47224c = true;
        super.c(o1Var);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final WindowInsetsCompat d(WindowInsetsCompat windowInsetsCompat, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            h7.o1 o1Var = (h7.o1) list.get(i11);
            e2 e2Var = (e2) g2.f47128a.b(o1Var.f21602a.d());
            if (e2Var != null) {
                Object objD = this.f47227f.d(e2Var);
                objD.getClass();
                h2 h2Var = (h2) objD;
                if (((Boolean) h2Var.f47134b.getValue()).booleanValue()) {
                    h7.n1 n1Var = o1Var.f21602a;
                    h2Var.f47135c.i(n1Var.c());
                    h2Var.f47137e.i(n1Var.a());
                    h2Var.f47136d.i(n1Var.b());
                }
            }
        }
        f(windowInsetsCompat);
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final h7.f1 e(h7.o1 o1Var, h7.f1 f1Var) {
        WindowInsetsCompat windowInsetsCompat = this.f47226e;
        boolean z11 = false;
        this.f47224c = false;
        this.f47226e = null;
        if (o1Var.f21602a.b() > 0 && windowInsetsCompat != null) {
            int iD = o1Var.f21602a.d();
            this.f47225d |= iD;
            e2 e2Var = (e2) g2.f47128a.b(iD);
            if (e2Var != null) {
                Object objD = this.f47227f.d(e2Var);
                objD.getClass();
                h2 h2Var = (h2) objD;
                x6.d dVarE = windowInsetsCompat.e(iD);
                long j9 = (((long) dVarE.f43873a) << 48) | (((long) dVarE.f43874b) << 32) | (((long) dVarE.f43875c) << 16) | ((long) dVarE.f43876d);
                long j11 = h2Var.f47140h;
                if (!c0.h(j9, j11)) {
                    h2Var.f47142j = j11;
                    h2Var.f47143k = j9;
                    h2Var.f47134b.setValue(Boolean.TRUE);
                    h7.n1 n1Var = o1Var.f21602a;
                    h2Var.f47135c.i(n1Var.c());
                    h2Var.f47137e.i(n1Var.a());
                    h2Var.f47136d.i(n1Var.b());
                    m3.h1 h1Var = this.f47228g;
                    h1Var.i(h1Var.h() + 1);
                    synchronized (z3.l.f47038c) {
                        q1.u0 u0Var = z3.l.f47045j.f46981h;
                        if (u0Var != null) {
                            if (u0Var.c()) {
                                z11 = true;
                            }
                        }
                    }
                    if (z11) {
                        z3.l.a();
                    }
                }
            }
        }
        return super.e(o1Var, f1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(androidx.core.view.WindowInsetsCompat r28) {
        /*
            Method dump skipped, instruction units count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.s.f(androidx.core.view.WindowInsetsCompat):void");
    }

    @Override // h7.w
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        if (this.f47224c) {
            this.f47226e = windowInsetsCompat;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return windowInsetsCompat;
            }
        } else if (this.f47225d == 0) {
            f(windowInsetsCompat);
        }
        return windowInsetsCompat;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        ViewCompat.k0(view, this);
        ViewCompat.q0(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        ViewCompat.k0(view, null);
        ViewCompat.q0(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f47224c) {
            this.f47225d = 0;
            this.f47224c = false;
            WindowInsetsCompat windowInsetsCompat = this.f47226e;
            if (windowInsetsCompat != null) {
                f(windowInsetsCompat);
                this.f47226e = null;
            }
        }
    }
}
