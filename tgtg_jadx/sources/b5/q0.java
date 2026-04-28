package b5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f5928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5930c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5936i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5938k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5939m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5940n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5941o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z0 f5943q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h0 f5931d = h0.Idle;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f1 f5942p = new f1(this);

    public q0(m0 m0Var) {
        this.f5928a = m0Var;
    }

    public final s1 a() {
        return this.f5928a.G.f5858d;
    }

    public final void b() {
        h0 h0Var = this.f5928a.H.f5931d;
        if (h0Var == h0.LayingOut || h0Var == h0.LookaheadLayingOut) {
            if (this.f5942p.B) {
                g(true);
            } else {
                f(true);
            }
        }
        if (h0Var == h0.LookaheadLayingOut) {
            z0 z0Var = this.f5943q;
            if (z0Var == null || !z0Var.f6034v) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j9) {
        z0 z0Var = this.f5943q;
        if (z0Var != null) {
            h0 h0Var = h0.LookaheadMeasuring;
            q0 q0Var = z0Var.f6019f;
            q0Var.f5931d = h0Var;
            m0 m0Var = q0Var.f5928a;
            q0Var.f5932e = false;
            z0Var.f6038z = j9;
            f2 snapshotObserver = ((c5.y) p0.a(m0Var)).getSnapshotObserver();
            y0 y0Var = z0Var.A;
            snapshotObserver.f5819a.d(m0Var, snapshotObserver.f5820b, y0Var);
            q0Var.f5933f = true;
            q0Var.f5934g = true;
            boolean zL = o.l(m0Var);
            f1 f1Var = q0Var.f5942p;
            if (zL) {
                f1Var.f5815w = true;
                f1Var.f5816x = true;
            } else {
                f1Var.f5814v = true;
            }
            q0Var.f5931d = h0.Idle;
        }
    }

    public final void d(int i11) {
        int i12 = this.l;
        this.l = i11;
        if ((i12 == 0) != (i11 == 0)) {
            m0 m0VarW = this.f5928a.w();
            q0 q0Var = m0VarW != null ? m0VarW.H : null;
            if (q0Var != null) {
                int i13 = q0Var.l;
                if (i11 == 0) {
                    q0Var.d(i13 - 1);
                } else {
                    q0Var.d(i13 + 1);
                }
            }
        }
    }

    public final void e(int i11) {
        int i12 = this.f5941o;
        this.f5941o = i11;
        if ((i12 == 0) != (i11 == 0)) {
            m0 m0VarW = this.f5928a.w();
            q0 q0Var = m0VarW != null ? m0VarW.H : null;
            if (q0Var != null) {
                int i13 = q0Var.f5941o;
                if (i11 == 0) {
                    q0Var.e(i13 - 1);
                } else {
                    q0Var.e(i13 + 1);
                }
            }
        }
    }

    public final void f(boolean z11) {
        if (this.f5938k != z11) {
            this.f5938k = z11;
            if (z11 && !this.f5937j) {
                d(this.l + 1);
            } else {
                if (z11 || this.f5937j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z11) {
        if (this.f5937j != z11) {
            this.f5937j = z11;
            if (z11 && !this.f5938k) {
                d(this.l + 1);
            } else {
                if (z11 || this.f5938k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z11) {
        if (this.f5940n != z11) {
            this.f5940n = z11;
            if (z11 && !this.f5939m) {
                e(this.f5941o + 1);
            } else {
                if (z11 || this.f5939m) {
                    return;
                }
                e(this.f5941o - 1);
            }
        }
    }

    public final void i(boolean z11) {
        if (this.f5939m != z11) {
            this.f5939m = z11;
            if (z11 && !this.f5940n) {
                e(this.f5941o + 1);
            } else {
                if (z11 || this.f5940n) {
                    return;
                }
                e(this.f5941o - 1);
            }
        }
    }

    public final void j() {
        f1 f1Var = this.f5942p;
        q0 q0Var = f1Var.f5799f;
        Object obj = f1Var.f5811s;
        m0 m0Var = this.f5928a;
        if ((obj != null || q0Var.a().G() != null) && f1Var.f5810r) {
            f1Var.f5810r = false;
            f1Var.f5811s = q0Var.a().G();
            m0 m0VarW = m0Var.w();
            if (m0VarW != null) {
                m0.Y(m0VarW, false, 7);
            }
        }
        z0 z0Var = this.f5943q;
        if (z0Var != null) {
            q0 q0Var2 = z0Var.f6019f;
            if (z0Var.f6037y == null) {
                v0 v0VarB1 = q0Var2.a().b1();
                v0VarB1.getClass();
                if (v0VarB1.f6007p.G() == null) {
                    return;
                }
            }
            if (z0Var.f6036x) {
                z0Var.f6036x = false;
                v0 v0VarB12 = q0Var2.a().b1();
                v0VarB12.getClass();
                z0Var.f6037y = v0VarB12.f6007p.G();
                if (o.l(m0Var)) {
                    m0 m0VarW2 = m0Var.w();
                    if (m0VarW2 != null) {
                        m0.Y(m0VarW2, false, 7);
                        return;
                    }
                    return;
                }
                m0 m0VarW3 = m0Var.w();
                if (m0VarW3 != null) {
                    m0.W(m0VarW3, false, 7);
                }
            }
        }
    }
}
