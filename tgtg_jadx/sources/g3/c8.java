package g3;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c8 extends b4.s implements b5.c0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m3.c3 f18419o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f18420p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f18421q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public t1.b1 f18422r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public t1.b f18423s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t1.b f18424t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public z5.f f18425u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public z5.f f18426v;

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo58measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        float f11;
        t1.v1 v1Var = t1.c.l;
        if (((List) this.f18419o.getValue()).isEmpty()) {
            return z4.w0.f(w0Var, 0, 0, new g2.q(18));
        }
        boolean z11 = this.f18421q;
        m3.c3 c3Var = this.f18419o;
        float f12 = z11 ? ((l8) ((List) c3Var.getValue()).get(this.f18420p)).f19040c : ((l8) ((List) c3Var.getValue()).get(this.f18420p)).f19039b;
        z5.f fVar = this.f18426v;
        x70.c cVar = null;
        if (fVar != null) {
            t1.b bVar = this.f18424t;
            if (bVar == null) {
                bVar = new t1.b(fVar, v1Var, null, 12);
                this.f18424t = bVar;
            }
            if (z5.f.c(f12, ((z5.f) bVar.f39361e.getValue()).f47277a)) {
                f11 = f12;
            } else {
                f11 = f12;
                v80.f0.B(getCoroutineScope(), null, null, new b8(bVar, f12, this, cVar, 0), 3);
            }
        } else {
            f11 = f12;
            this.f18426v = new z5.f(f11);
        }
        float f13 = ((l8) ((List) this.f18419o.getValue()).get(this.f18420p)).f19038a;
        z5.f fVar2 = this.f18425u;
        if (fVar2 != null) {
            t1.b bVar2 = this.f18423s;
            if (bVar2 == null) {
                bVar2 = new t1.b(fVar2, v1Var, null, 12);
                this.f18423s = bVar2;
            }
            if (!z5.f.c(f13, ((z5.f) bVar2.f39361e.getValue()).f47277a)) {
                v80.f0.B(getCoroutineScope(), null, null, new b8(bVar2, f13, this, cVar, 1), 3);
            }
        } else {
            this.f18425u = new z5.f(f13);
        }
        z5.m layoutDirection = w0Var.getLayoutDirection();
        z5.m mVar = z5.m.Ltr;
        t1.b bVar3 = this.f18423s;
        if (layoutDirection != mVar) {
            if (bVar3 != null) {
                f13 = ((z5.f) bVar3.d()).f47277a;
            }
            f13 = -f13;
        } else if (bVar3 != null) {
            f13 = ((z5.f) bVar3.d()).f47277a;
        }
        t1.b bVar4 = this.f18424t;
        if (bVar4 != null) {
            f11 = ((z5.f) bVar4.d()).f47277a;
        }
        z4.m1 m1VarD = t0Var.D(z5.a.b(j9, w0Var.q0(f11), w0Var.q0(f11), 0, 0, 12));
        return z4.w0.f(w0Var, m1VarD.f47183a, m1VarD.f47184b, new l3(m1VarD, w0Var, f13, 1));
    }
}
