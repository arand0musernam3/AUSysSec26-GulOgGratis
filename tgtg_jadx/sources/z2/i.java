package z2;

import a3.s0;
import a3.s2;
import kotlin.jvm.internal.Intrinsics;
import m3.e2;
import m5.q0;
import q1.k0;
import w4.g0;
import w4.h0;
import w4.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s2 f46857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f46859d = l.f46870c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a3.s f46860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b4.t f46861f;

    public i(long j9, s2 s2Var, long j11) {
        this.f46856a = j9;
        this.f46857b = s2Var;
        this.f46858c = j11;
        h hVar = new h(this, 2);
        k kVar = new k(hVar, s2Var, j9);
        od.f fVar = new od.f(hVar, s2Var, j9);
        j jVar = new j(fVar, kVar);
        w4.n nVar = h0.f43125a;
        g0 g0Var = new g0(fVar, kVar, jVar, 4);
        w4.s.f43173a.getClass();
        this.f46861f = u.g(g0Var, u.f43175b);
    }

    public final void a(q0 q0Var) {
        s0 s0Var;
        q0 q0Var2 = this.f46859d.f46872b;
        if (q0Var2 != null && !Intrinsics.areEqual(q0Var2.f29617a.f29603a, q0Var.f29617a.f29603a) && (s0Var = this.f46857b.f565i) != null) {
            s0Var.invoke(Long.valueOf(this.f46856a));
        }
        this.f46859d = l.a(this.f46859d, null, q0Var, 1);
    }

    @Override // m3.e2
    public final void b() {
        a3.s sVar = this.f46860e;
        if (sVar != null) {
            this.f46857b.d(sVar);
            this.f46860e = null;
        }
    }

    @Override // m3.e2
    public final void c() {
        a3.s sVar = this.f46860e;
        if (sVar != null) {
            this.f46857b.d(sVar);
            this.f46860e = null;
        }
    }

    @Override // m3.e2
    public final void d() {
        h hVar = new h(this, 0);
        h hVar2 = new h(this, 1);
        long j9 = this.f46856a;
        a3.s sVar = new a3.s(j9, hVar, hVar2);
        s2 s2Var = this.f46857b;
        k0 k0Var = s2Var.f559c;
        if (j9 == 0) {
            c2.a.a("The selectable contains an invalid id: " + j9);
        }
        if (k0Var.a(j9)) {
            c2.a.a("Another selectable with the id: " + sVar + ".selectableId has already subscribed.");
        }
        k0Var.h(j9, sVar);
        s2Var.f558b.add(sVar);
        s2Var.f557a = false;
        this.f46860e = sVar;
    }
}
