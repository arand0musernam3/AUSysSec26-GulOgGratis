package z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final le.v f46557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final le.v f46558b;

    static {
        int i11 = 3;
        x70.c cVar = null;
        f46557a = new le.v(i11, cVar, 1);
        f46558b = new le.v(i11, cVar, 2);
    }

    public static final long a(long j9) {
        return ba0.g.g(Float.isNaN(z5.q.b(j9)) ? 0.0f : z5.q.b(j9), Float.isNaN(z5.q.c(j9)) ? 0.0f : z5.q.c(j9));
    }
}
