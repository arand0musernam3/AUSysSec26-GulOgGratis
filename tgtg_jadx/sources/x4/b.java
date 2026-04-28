package x4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f43824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f43825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f43826c;

    public b() {
        c cVar = c.Lsq2;
        this.f43824a = new e(false, cVar);
        this.f43825b = new e(false, cVar);
    }

    public final void a(long j9, long j11) {
        this.f43824a.a(Float.intBitsToFloat((int) (j11 >> 32)), j9);
        this.f43825b.a(Float.intBitsToFloat((int) (j11 & 4294967295L)), j9);
    }
}
