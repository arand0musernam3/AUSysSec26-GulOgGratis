package a3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g3 implements m2.l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l3 f362a;

    public g3(l3 l3Var) {
        this.f362a = l3Var;
    }

    @Override // m2.l1
    public final void a(long j9, j0 j0Var) {
        m2.a2 a2VarD;
        l3 l3Var = this.f362a;
        long jA = m1.a(l3Var.l(true));
        m2.e1 e1Var = l3Var.f451d;
        if (e1Var == null || (a2VarD = e1Var.d()) == null) {
            return;
        }
        long jE = a2VarD.e(jA);
        l3Var.f460n = jE;
        l3Var.f464r.setValue(new h4.b(jE));
        l3Var.f462p = 0L;
        l3Var.f463q.setValue(m2.t0.Cursor);
        l3Var.t(false);
    }

    @Override // m2.l1
    public final void b() {
        l3 l3Var = this.f362a;
        l3Var.f463q.setValue(null);
        l3Var.f464r.setValue(null);
    }

    @Override // m2.l1
    public final void c() {
        l3 l3Var = this.f362a;
        l3Var.f463q.setValue(null);
        l3Var.f464r.setValue(null);
    }

    @Override // m2.l1
    public final void e(long j9) {
        m2.a2 a2VarD;
        r4.a aVar;
        l3 l3Var = this.f362a;
        l3Var.f462p = h4.b.f(l3Var.f462p, j9);
        m2.e1 e1Var = l3Var.f451d;
        if (e1Var == null || (a2VarD = e1Var.d()) == null) {
            return;
        }
        l3Var.f464r.setValue(new h4.b(h4.b.f(l3Var.f460n, l3Var.f462p)));
        r5.s sVar = l3Var.f449b;
        h4.b bVarI = l3Var.i();
        bVarI.getClass();
        int i11 = sVar.i(a2VarD.b(bVarI.f21378a, true));
        long jB = m5.k0.b(i11, i11);
        if (m5.t0.c(jB, l3Var.n().f37715b)) {
            return;
        }
        m2.e1 e1Var2 = l3Var.f451d;
        if ((e1Var2 == null || ((Boolean) e1Var2.f28833q.getValue()).booleanValue()) && (aVar = l3Var.f457j) != null) {
            aVar.a(9);
        }
        l3Var.f450c.invoke(l3.e(l3Var.n().f37714a, jB));
        l3Var.f468v = new m5.t0(jB);
    }

    @Override // m2.l1
    public final void d() {
    }

    @Override // m2.l1
    public final void onCancel() {
    }
}
