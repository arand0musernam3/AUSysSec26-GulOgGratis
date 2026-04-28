package d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j1 extends b4.s implements b5.c0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13817o;

    public abstract long L0(z4.t0 t0Var, long j9);

    public abstract boolean M0();

    public int maxIntrinsicHeight(z4.u uVar, z4.t tVar, int i11) {
        switch (this.f13817o) {
        }
        return tVar.b(i11);
    }

    @Override // b5.c0
    public int maxIntrinsicWidth(z4.u uVar, z4.t tVar, int i11) {
        switch (this.f13817o) {
        }
        return tVar.y(i11);
    }

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public z4.v0 mo58measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        long jL0 = L0(t0Var, j9);
        if (M0()) {
            jL0 = z5.b.e(j9, jL0);
        }
        z4.m1 m1VarD = t0Var.D(jL0);
        return z4.w0.f(w0Var, m1VarD.f47183a, m1VarD.f47184b, new k(m1VarD, 2));
    }

    public int minIntrinsicHeight(z4.u uVar, z4.t tVar, int i11) {
        switch (this.f13817o) {
        }
        return tVar.V(i11);
    }

    @Override // b5.c0
    public int minIntrinsicWidth(z4.u uVar, z4.t tVar, int i11) {
        switch (this.f13817o) {
        }
        return tVar.w(i11);
    }
}
