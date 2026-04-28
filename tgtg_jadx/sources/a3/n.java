package a3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements d6.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4.f f488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f490c = 0;

    public n(b4.f fVar, t tVar) {
        this.f488a = fVar;
        this.f489b = tVar;
    }

    @Override // d6.i0
    public final long e(z5.k kVar, long j9, z5.m mVar, long j11) {
        long jA = this.f489b.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.f490c;
        }
        this.f490c = jA;
        return z5.j.d(z5.j.d(kVar.c(), a.a.J(jA)), this.f488a.a(j11, 0L, mVar));
    }
}
