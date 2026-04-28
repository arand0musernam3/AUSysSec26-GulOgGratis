package d2;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.app.tgtg.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final WeakHashMap f13983w = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f13984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f13985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f13986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f13987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f13988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f13989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f13990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f13991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f13992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v2 f13993j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m3.k1 f13994k;
    public final q2 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v2 f13995m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v2 f13996n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final v2 f13997o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v2 f13998p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v2 f13999q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v2 f14000r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v2 f14001s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f14002t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14003u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a1 f14004v;

    public z2(View view) {
        a aVarB = b.b(h7.h2.a(), "captionBar");
        this.f13984a = aVarB;
        a aVarB2 = b.b(h7.h2.b(), "displayCutout");
        this.f13985b = aVarB2;
        a aVarB3 = b.b(h7.h2.c(), "ime");
        this.f13986c = aVarB3;
        a aVarB4 = b.b(h7.h2.e(), "mandatorySystemGestures");
        this.f13987d = aVarB4;
        a aVarB5 = b.b(h7.h2.f(), "navigationBars");
        this.f13988e = aVarB5;
        a aVarB6 = b.b(h7.h2.g(), "statusBars");
        this.f13989f = aVarB6;
        a aVarB7 = b.b(h7.h2.h(), "systemBars");
        this.f13990g = aVarB7;
        a aVarB8 = b.b(h7.h2.i(), "systemGestures");
        this.f13991h = aVarB8;
        a aVarB9 = b.b(h7.h2.j(), "tappableElement");
        this.f13992i = aVarB9;
        x6.d dVar = x6.d.f43872e;
        v2 v2Var = new v2(c.H(dVar), "waterfall");
        this.f13993j = v2Var;
        this.f13994k = m3.i.w(null);
        this.l = new q2(new q2(aVarB7, aVarB3), aVarB2);
        new q2(new q2(new q2(aVarB9, aVarB4), aVarB8), v2Var);
        this.f13995m = b.d(h7.h2.a(), "captionBarIgnoringVisibility");
        this.f13996n = b.d(h7.h2.f(), "navigationBarsIgnoringVisibility");
        this.f13997o = b.d(h7.h2.g(), "statusBarsIgnoringVisibility");
        this.f13998p = b.d(h7.h2.h(), "systemBarsIgnoringVisibility");
        this.f13999q = b.d(h7.h2.j(), "tappableElementIgnoringVisibility");
        this.f14000r = new v2(c.H(dVar), "imeAnimationTarget");
        this.f14001s = new v2(c.H(dVar), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f14002t = bool != null ? bool.booleanValue() : false;
        this.f14004v = new a1(this);
        WindowInsetsCompat windowInsetsCompatY = ViewCompat.y(view);
        if (windowInsetsCompatY != null) {
            aVarB.f(windowInsetsCompatY.s(h7.h2.a()));
            aVarB2.f(windowInsetsCompatY.s(h7.h2.b()));
            aVarB3.f(windowInsetsCompatY.s(h7.h2.c()));
            aVarB4.f(windowInsetsCompatY.s(h7.h2.e()));
            aVarB5.f(windowInsetsCompatY.s(h7.h2.f()));
            aVarB6.f(windowInsetsCompatY.s(h7.h2.g()));
            aVarB7.f(windowInsetsCompatY.s(h7.h2.h()));
            aVarB8.f(windowInsetsCompatY.s(h7.h2.i()));
            aVarB9.f(windowInsetsCompatY.s(h7.h2.j()));
        }
    }

    public static void b(z2 z2Var, WindowInsetsCompat windowInsetsCompat) {
        x6.d dVarF;
        boolean z11 = false;
        z2Var.f13984a.g(windowInsetsCompat, 0);
        z2Var.f13986c.g(windowInsetsCompat, 0);
        z2Var.f13985b.g(windowInsetsCompat, 0);
        z2Var.f13988e.g(windowInsetsCompat, 0);
        z2Var.f13989f.g(windowInsetsCompat, 0);
        z2Var.f13990g.g(windowInsetsCompat, 0);
        z2Var.f13991h.g(windowInsetsCompat, 0);
        z2Var.f13992i.g(windowInsetsCompat, 0);
        z2Var.f13987d.g(windowInsetsCompat, 0);
        z2Var.f13995m.f(c.H(windowInsetsCompat.f(h7.h2.a())));
        z2Var.f13996n.f(c.H(windowInsetsCompat.f(h7.h2.f())));
        z2Var.f13997o.f(c.H(windowInsetsCompat.f(h7.h2.g())));
        z2Var.f13998p.f(c.H(windowInsetsCompat.f(h7.h2.h())));
        z2Var.f13999q.f(c.H(windowInsetsCompat.f(h7.h2.j())));
        h7.j jVarD = windowInsetsCompat.d();
        v2 v2Var = z2Var.f13993j;
        if (jVarD == null || (dVarF = jVarD.f()) == null) {
            dVarF = x6.d.f43872e;
        }
        v2Var.f(c.H(dVarF));
        i4.h hVar = null;
        if (jVarD != null) {
            Path pathG = Build.VERSION.SDK_INT >= 31 ? b7.a.g(jVarD.f21566a) : null;
            if (pathG != null) {
                hVar = new i4.h(pathG);
            }
        }
        z2Var.f13994k.setValue(hVar);
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

    public final void a(View view) {
        if (this.f14003u == 0) {
            a1 a1Var = this.f14004v;
            ViewCompat.k0(view, a1Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(a1Var);
            ViewCompat.q0(view, a1Var);
        }
        this.f14003u++;
    }
}
