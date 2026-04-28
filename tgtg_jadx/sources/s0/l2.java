package s0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 implements m0.u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f38384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0.u0 f38385c;

    public l2(long j9, m0.u0 u0Var) {
        pd.g.i("Timeout must be non-negative.", j9 >= 0);
        this.f38384b = j9;
        this.f38385c = u0Var;
    }

    @Override // m0.u0
    public final long a() {
        return this.f38384b;
    }

    @Override // m0.u0
    public final m0.t0 b(ic.a aVar) {
        m0.t0 t0VarB = this.f38385c.b(aVar);
        long j9 = this.f38384b;
        return (j9 <= 0 || aVar.f23774b < j9 - t0VarB.f28602a) ? t0VarB : m0.t0.f28599d;
    }
}
