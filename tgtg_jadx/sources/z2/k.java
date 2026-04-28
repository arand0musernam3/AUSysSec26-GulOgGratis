package z2;

import a3.j0;
import a3.k0;
import a3.n0;
import a3.s2;
import a3.t2;
import a3.z1;
import m2.l1;
import z4.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f46864a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f46865b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j0 f46866c = k0.f431d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f46867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s2 f46868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f46869f;

    public k(h hVar, s2 s2Var, long j9) {
        this.f46867d = hVar;
        this.f46868e = s2Var;
        this.f46869f = j9;
    }

    @Override // m2.l1
    public final void a(long j9, j0 j0Var) {
        this.f46866c = j0Var;
        z zVar = (z) this.f46867d.invoke();
        s2 s2Var = this.f46868e;
        if (zVar != null) {
            if (!zVar.n()) {
                return;
            }
            j0 j0Var2 = this.f46866c;
            z1 z1Var = s2Var.f562f;
            if (z1Var != null) {
                z1Var.invoke(Boolean.TRUE, zVar, new h4.b(j9), j0Var2);
            }
            this.f46864a = j9;
        }
        if (t2.a(s2Var, this.f46869f)) {
            this.f46865b = 0L;
        }
    }

    @Override // m2.l1
    public final void b() {
        n0 n0Var;
        long j9 = this.f46869f;
        s2 s2Var = this.f46868e;
        if (!t2.a(s2Var, j9) || (n0Var = s2Var.f564h) == null) {
            return;
        }
        n0Var.invoke();
    }

    @Override // m2.l1
    public final void e(long j9) {
        z zVar = (z) this.f46867d.invoke();
        if (zVar == null || !zVar.n()) {
            return;
        }
        s2 s2Var = this.f46868e;
        if (t2.a(s2Var, this.f46869f)) {
            long jF = h4.b.f(this.f46865b, j9);
            this.f46865b = jF;
            long jF2 = h4.b.f(this.f46864a, jF);
            if (s2Var.b(zVar, jF2, this.f46864a, this.f46866c, true)) {
                this.f46864a = jF2;
                this.f46865b = 0L;
            }
        }
    }

    @Override // m2.l1
    public final void onCancel() {
        n0 n0Var;
        long j9 = this.f46869f;
        s2 s2Var = this.f46868e;
        if (!t2.a(s2Var, j9) || (n0Var = s2Var.f564h) == null) {
            return;
        }
        n0Var.invoke();
    }

    @Override // m2.l1
    public final void c() {
    }

    @Override // m2.l1
    public final void d() {
    }
}
