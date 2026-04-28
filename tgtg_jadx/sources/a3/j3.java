package a3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j3 implements m2.l1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m5.t0 f426b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l3 f428d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f425a = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j0 f427c = k0.f431d;

    public j3(l3 l3Var) {
        this.f428d = l3Var;
    }

    @Override // m2.l1
    public final void a(long j9, j0 j0Var) {
        long j11;
        m2.a2 a2VarD;
        m2.a2 a2VarD2;
        l3 l3Var = this.f428d;
        m3.k1 k1Var = l3Var.f463q;
        if (l3Var.k() && ((m2.t0) k1Var.getValue()) == null) {
            k1Var.setValue(m2.t0.SelectionEnd);
            l3Var.f465s = -1;
            this.f425a = true;
            this.f427c = j0Var;
            l3Var.o();
            m2.e1 e1Var = l3Var.f451d;
            if (e1Var == null || (a2VarD2 = e1Var.d()) == null || !a2VarD2.c(j9)) {
                j11 = j9;
                m2.e1 e1Var2 = l3Var.f451d;
                if (e1Var2 != null && (a2VarD = e1Var2.d()) != null) {
                    int i11 = l3Var.f449b.i(a2VarD.b(j11, true));
                    r5.y yVarE = l3.e(l3Var.n().f37714a, m5.k0.b(i11, i11));
                    l3Var.h(false);
                    r4.a aVar = l3Var.f457j;
                    if (aVar != null) {
                        aVar.a(9);
                    }
                    l3Var.f450c.invoke(yVarE);
                    l3Var.f468v = new m5.t0(yVarE.f37715b);
                }
                this.f425a = false;
            } else {
                if (l3Var.n().f37714a.f29538b.length() == 0) {
                    return;
                }
                l3Var.h(false);
                long jC = l3.c(l3Var, r5.y.b(l3Var.n(), null, m5.t0.f29648b, 5), j9, true, false, this.f427c, true);
                j11 = j9;
                l3Var.f461o = new m5.t0(jC);
                this.f426b = new m5.t0(jC);
            }
            l3Var.q(m2.u0.None);
            l3Var.f460n = j11;
            l3Var.f464r.setValue(new h4.b(j11));
            l3Var.f462p = 0L;
        }
    }

    @Override // m2.l1
    public final void b() {
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    @Override // m2.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r9) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.j3.e(long):void");
    }

    public final void f() {
        l3 l3Var = this.f428d;
        l3Var.f463q.setValue(null);
        l3Var.f464r.setValue(null);
        this.f427c = k0.f431d;
        l3Var.t(true);
        m5.t0 t0Var = this.f426b;
        boolean zD = m5.t0.d(t0Var != null ? t0Var.f29650a : l3Var.n().f37715b);
        l3Var.q(zD ? m2.u0.Cursor : m2.u0.Selection);
        m2.e1 e1Var = l3Var.f451d;
        if (e1Var != null) {
            e1Var.f28829m.setValue(Boolean.valueOf(!zD && m0.c.e0(l3Var, true)));
        }
        m2.e1 e1Var2 = l3Var.f451d;
        if (e1Var2 != null) {
            e1Var2.f28830n.setValue(Boolean.valueOf(!zD && m0.c.e0(l3Var, false)));
        }
        m2.e1 e1Var3 = l3Var.f451d;
        if (e1Var3 != null) {
            e1Var3.f28831o.setValue(Boolean.valueOf(zD && m0.c.e0(l3Var, true)));
        }
        if (this.f425a) {
            l3.b(l3Var, l3Var.f461o);
        }
        l3Var.f461o = null;
    }

    @Override // m2.l1
    public final void onCancel() {
        f();
    }

    @Override // m2.l1
    public final void c() {
    }

    @Override // m2.l1
    public final void d() {
    }
}
