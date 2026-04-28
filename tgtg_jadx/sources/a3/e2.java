package a3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 implements m2.l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f330a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f332c;

    public e2(l3 l3Var, boolean z11) {
        this.f332c = l3Var;
        this.f331b = z11;
    }

    @Override // m2.l1
    public final void a(long j9, j0 j0Var) {
        switch (this.f330a) {
            case 0:
                j2 j2Var = (j2) this.f332c;
                if (j2Var.e() != null) {
                    i0 i0VarF = j2Var.f();
                    i0VarF.getClass();
                    boolean z11 = this.f331b;
                    Object objB = j2Var.f402a.f559c.b((z11 ? i0VarF.f385a : i0VarF.f386b).f368c);
                    if (objB == null) {
                        c2.a.d("SelectionRegistrar should contain the current selection's selectableIds");
                        qc.y.m();
                        break;
                    } else {
                        s sVar = (s) objB;
                        z4.z zVarC = sVar.c();
                        if (zVarC == null) {
                            c2.a.d("Current selectable should have layout coordinates.");
                            qc.y.m();
                            break;
                        } else {
                            long jA = sVar.a(i0VarF, z11);
                            if ((9223372034707292159L & jA) != 9205357640488583168L) {
                                j2Var.f414n.setValue(new h4.b(j2Var.j().g(zVarC, m1.a(jA))));
                                j2Var.f415o.setValue(new h4.b(0L));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // m2.l1
    public final void b() {
        switch (this.f330a) {
            case 0:
                j2 j2Var = (j2) this.f332c;
                j2Var.f424x = true;
                j2Var.o();
                j2Var.f418r.setValue(null);
                j2Var.f419s.setValue(null);
                break;
            default:
                l3 l3Var = (l3) this.f332c;
                l3Var.f463q.setValue(null);
                l3Var.f464r.setValue(null);
                l3Var.t(true);
                break;
        }
    }

    @Override // m2.l1
    public final void c() {
        switch (this.f330a) {
            case 0:
                j2 j2Var = (j2) this.f332c;
                j2Var.f424x = true;
                j2Var.o();
                j2Var.f418r.setValue(null);
                j2Var.f419s.setValue(null);
                break;
            default:
                l3 l3Var = (l3) this.f332c;
                l3Var.f463q.setValue(null);
                l3Var.f464r.setValue(null);
                l3Var.t(true);
                break;
        }
    }

    @Override // m2.l1
    public final void d() {
        i0 i0VarF;
        z4.z zVarC;
        m2.a2 a2VarD;
        switch (this.f330a) {
            case 0:
                j2 j2Var = (j2) this.f332c;
                boolean z11 = this.f331b;
                if ((z11 ? (h4.b) j2Var.f416p.getValue() : (h4.b) j2Var.f417q.getValue()) != null && (i0VarF = j2Var.f()) != null) {
                    s sVarC = j2Var.c(z11 ? i0VarF.f385a : i0VarF.f386b);
                    if (sVarC != null && (zVarC = sVarC.c()) != null) {
                        long jA = sVarC.a(i0VarF, z11);
                        if ((9223372034707292159L & jA) != 9205357640488583168L) {
                            j2Var.f419s.setValue(new h4.b(j2Var.j().g(zVarC, m1.a(jA))));
                            j2Var.f418r.setValue(z11 ? m2.t0.SelectionStart : m2.t0.SelectionEnd);
                            j2Var.f424x = false;
                            j2Var.o();
                            break;
                        }
                    }
                }
                break;
            default:
                l3 l3Var = (l3) this.f332c;
                boolean z12 = this.f331b;
                l3Var.f463q.setValue(z12 ? m2.t0.SelectionStart : m2.t0.SelectionEnd);
                long jA2 = m1.a(l3Var.l(z12));
                m2.e1 e1Var = l3Var.f451d;
                if (e1Var != null && (a2VarD = e1Var.d()) != null) {
                    long jE = a2VarD.e(jA2);
                    l3Var.f460n = jE;
                    l3Var.f464r.setValue(new h4.b(jE));
                    l3Var.f462p = 0L;
                    l3Var.f465s = -1;
                    m2.e1 e1Var2 = l3Var.f451d;
                    if (e1Var2 != null) {
                        e1Var2.f28833q.setValue(Boolean.TRUE);
                    }
                    l3Var.t(false);
                    break;
                }
                break;
        }
    }

    @Override // m2.l1
    public final void e(long j9) {
        switch (this.f330a) {
            case 0:
                j2 j2Var = (j2) this.f332c;
                m3.k1 k1Var = j2Var.f414n;
                m3.k1 k1Var2 = j2Var.f415o;
                if (j2Var.e() != null) {
                    k1Var2.setValue(new h4.b(h4.b.f(((h4.b) k1Var2.getValue()).f21378a, j9)));
                    long jF = h4.b.f(((h4.b) k1Var.getValue()).f21378a, ((h4.b) k1Var2.getValue()).f21378a);
                    if (j2Var.n(jF, ((h4.b) k1Var.getValue()).f21378a, this.f331b, k0.f435h)) {
                        k1Var.setValue(new h4.b(jF));
                        k1Var2.setValue(new h4.b(0L));
                    }
                    break;
                }
                break;
            default:
                l3 l3Var = (l3) this.f332c;
                long jF2 = h4.b.f(l3Var.f462p, j9);
                l3Var.f462p = jF2;
                l3Var.f464r.setValue(new h4.b(h4.b.f(l3Var.f460n, jF2)));
                r5.y yVarN = l3Var.n();
                h4.b bVarI = l3Var.i();
                bVarI.getClass();
                l3.c(l3Var, yVarN, bVarI.f21378a, false, this.f331b, k0.f435h, true);
                l3Var.t(false);
                break;
        }
    }

    @Override // m2.l1
    public final void onCancel() {
        switch (this.f330a) {
            case 0:
                j2 j2Var = (j2) this.f332c;
                j2Var.f424x = true;
                j2Var.o();
                j2Var.f418r.setValue(null);
                j2Var.f419s.setValue(null);
                break;
        }
    }

    public e2(boolean z11, j2 j2Var) {
        this.f331b = z11;
        this.f332c = j2Var;
    }

    private final void f() {
    }

    private final void g(long j9, j0 j0Var) {
    }
}
