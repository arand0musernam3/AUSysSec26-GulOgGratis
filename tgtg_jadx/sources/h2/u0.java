package h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f21232b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u0 f21235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21236f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21233c = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m3.k1 f21237g = m3.i.w(null);

    public u0(Object obj, v0 v0Var) {
        this.f21231a = obj;
        this.f21232b = v0Var;
    }

    public final u0 a() {
        if (this.f21236f) {
            c2.a.c("Pin should not be called on an already disposed item ");
        }
        if (this.f21234d == 0) {
            this.f21232b.f21239a.add(this);
            u0 u0Var = (u0) this.f21237g.getValue();
            if (u0Var != null) {
                u0Var.a();
            } else {
                u0Var = null;
            }
            this.f21235e = u0Var;
        }
        this.f21234d++;
        return this;
    }

    public final void b() {
        if (this.f21236f) {
            return;
        }
        if (this.f21234d <= 0) {
            c2.a.c("Release should only be called once");
        }
        int i11 = this.f21234d - 1;
        this.f21234d = i11;
        if (i11 == 0) {
            this.f21232b.f21239a.remove(this);
            u0 u0Var = this.f21235e;
            if (u0Var != null) {
                u0Var.b();
            }
            this.f21235e = null;
        }
    }
}
