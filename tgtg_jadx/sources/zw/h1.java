package zw;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h1 implements Cloneable {
    public Boolean A;
    public Boolean B;
    public q1 C;
    public Float D;
    public String E;
    public y0 F;
    public String G;
    public q1 H;
    public Float I;
    public q1 J;
    public Float K;
    public g1 L;
    public c1 M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f48204a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q1 f48205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y0 f48206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f48207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q1 f48208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Float f48209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k0 f48210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a1 f48211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b1 f48212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Float f48213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k0[] f48214k;
    public k0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Float f48215m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a0 f48216n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f48217o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k0 f48218p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Integer f48219q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z0 f48220r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public e1 f48221s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f1 f48222t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public d1 f48223u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Boolean f48224v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public x f48225w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f48226x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f48227y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f48228z;

    public static h1 a() {
        h1 h1Var = new h1();
        h1Var.f48204a = -1L;
        a0 a0Var = a0.f48151b;
        h1Var.f48205b = a0Var;
        y0 y0Var = y0.NonZero;
        h1Var.f48206c = y0Var;
        Float fValueOf = Float.valueOf(1.0f);
        h1Var.f48207d = fValueOf;
        h1Var.f48208e = null;
        h1Var.f48209f = fValueOf;
        h1Var.f48210g = new k0(1.0f);
        h1Var.f48211h = a1.Butt;
        h1Var.f48212i = b1.Miter;
        h1Var.f48213j = Float.valueOf(4.0f);
        h1Var.f48214k = null;
        h1Var.l = new k0(0.0f);
        h1Var.f48215m = fValueOf;
        h1Var.f48216n = a0Var;
        h1Var.f48217o = null;
        h1Var.f48218p = new k0(12.0f, e2.f48190pt);
        h1Var.f48219q = 400;
        h1Var.f48220r = z0.Normal;
        h1Var.f48221s = e1.None;
        h1Var.f48222t = f1.LTR;
        h1Var.f48223u = d1.Start;
        Boolean bool = Boolean.TRUE;
        h1Var.f48224v = bool;
        h1Var.f48225w = null;
        h1Var.f48226x = null;
        h1Var.f48227y = null;
        h1Var.f48228z = null;
        h1Var.A = bool;
        h1Var.B = bool;
        h1Var.C = a0Var;
        h1Var.D = fValueOf;
        h1Var.E = null;
        h1Var.F = y0Var;
        h1Var.G = null;
        h1Var.H = null;
        h1Var.I = fValueOf;
        h1Var.J = null;
        h1Var.K = fValueOf;
        h1Var.L = g1.None;
        h1Var.M = c1.auto;
        return h1Var;
    }

    public final Object clone() {
        h1 h1Var = (h1) super.clone();
        k0[] k0VarArr = this.f48214k;
        if (k0VarArr != null) {
            h1Var.f48214k = (k0[]) k0VarArr.clone();
        }
        return h1Var;
    }
}
