package h2;

import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f21041s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f21042t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v80.b0 f21043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4.e0 f21044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cw.b f21045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t1.x f21046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t1.x f21047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t1.x f21048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m3.k1 f21050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m3.k1 f21051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m3.k1 f21052j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m3.k1 f21053k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f21054m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l4.b f21055n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t1.b f21056o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t1.b f21057p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m3.k1 f21058q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f21059r;

    static {
        long j9 = Integer.MAX_VALUE;
        f21041s = (j9 & 4294967295L) | (j9 << 32);
    }

    public b0(v80.b0 b0Var, i4.e0 e0Var, cw.b bVar) {
        this.f21043a = b0Var;
        this.f21044b = e0Var;
        this.f21045c = bVar;
        Boolean bool = Boolean.FALSE;
        this.f21050h = m3.i.w(bool);
        this.f21051i = m3.i.w(bool);
        this.f21052j = m3.i.w(bool);
        this.f21053k = m3.i.w(bool);
        long j9 = f21041s;
        this.l = j9;
        this.f21054m = 0L;
        this.f21055n = e0Var != null ? e0Var.c() : null;
        this.f21056o = new t1.b(new z5.j(0L), t1.c.f39394p, null, 12);
        Float fValueOf = Float.valueOf(1.0f);
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        this.f21057p = new t1.b(fValueOf, t1.c.f39389j, null, 12);
        this.f21058q = m3.i.w(new z5.j(0L));
        this.f21059r = j9;
    }

    public final void a() {
        l4.b bVar = this.f21055n;
        t1.x xVar = this.f21046d;
        boolean zBooleanValue = ((Boolean) this.f21051i.getValue()).booleanValue();
        v80.b0 b0Var = this.f21043a;
        x70.c cVar = null;
        if (zBooleanValue || xVar == null || bVar == null) {
            if (b()) {
                if (bVar != null) {
                    bVar.e(1.0f);
                }
                v80.f0.B(b0Var, null, null, new y(this, cVar, 0), 3);
                return;
            }
            return;
        }
        d(true);
        boolean zB = b();
        boolean z11 = !zB;
        if (!zB) {
            bVar.e(0.0f);
        }
        v80.f0.B(b0Var, null, null, new ep.a0(z11, this, xVar, bVar, (x70.c) null, 3), 3);
    }

    public final boolean b() {
        return ((Boolean) this.f21052j.getValue()).booleanValue();
    }

    public final void c() {
        i4.e0 e0Var;
        boolean zBooleanValue = ((Boolean) this.f21050h.getValue()).booleanValue();
        v80.b0 b0Var = this.f21043a;
        x70.c cVar = null;
        if (zBooleanValue) {
            f(false);
            v80.f0.B(b0Var, null, null, new y(this, cVar, 2), 3);
        }
        if (((Boolean) this.f21051i.getValue()).booleanValue()) {
            d(false);
            v80.f0.B(b0Var, null, null, new y(this, cVar, 3), 3);
        }
        if (b()) {
            e(false);
            v80.f0.B(b0Var, null, null, new y(this, cVar, 4), 3);
        }
        this.f21049g = false;
        g(0L);
        this.l = f21041s;
        l4.b bVar = this.f21055n;
        if (bVar != null && (e0Var = this.f21044b) != null) {
            e0Var.a(bVar);
        }
        this.f21055n = null;
        this.f21046d = null;
        this.f21048f = null;
        this.f21047e = null;
    }

    public final void d(boolean z11) {
        this.f21051i.setValue(Boolean.valueOf(z11));
    }

    public final void e(boolean z11) {
        this.f21052j.setValue(Boolean.valueOf(z11));
    }

    public final void f(boolean z11) {
        this.f21050h.setValue(Boolean.valueOf(z11));
    }

    public final void g(long j9) {
        this.f21058q.setValue(new z5.j(j9));
    }
}
