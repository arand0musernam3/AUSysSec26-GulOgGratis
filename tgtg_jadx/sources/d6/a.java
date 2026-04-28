package d6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4.f f14425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14426b;

    public a(b4.f fVar, long j9) {
        this.f14425a = fVar;
        this.f14426b = j9;
    }

    @Override // d6.i0
    public final long e(z5.k kVar, long j9, z5.m mVar, long j11) {
        long jA = this.f14425a.a(0L, (((long) kVar.d()) << 32) | (((long) kVar.b()) & 4294967295L), mVar);
        long jA2 = this.f14425a.a(0L, j11, mVar);
        long j12 = (((long) (-((int) (jA2 >> 32)))) << 32) | (((long) (-((int) (jA2 & 4294967295L)))) & 4294967295L);
        long j13 = this.f14426b;
        return z5.j.d(z5.j.d(z5.j.d(kVar.c(), jA), j12), (((long) ((int) (j13 & 4294967295L))) & 4294967295L) | (((long) (((int) (j13 >> 32)) * (mVar == z5.m.Ltr ? 1 : -1))) << 32));
    }
}
