package s1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f38528a;

    static {
        long j9 = Integer.MIN_VALUE;
        f38528a = (j9 & 4294967295L) | (j9 << 32);
    }

    public static b4.t a(b4.t tVar, t1.x xVar, int i11) {
        if ((i11 & 1) != 0) {
            long j9 = 1;
            xVar = t1.c.j(0.0f, 400.0f, new z5.l((j9 & 4294967295L) | (j9 << 32)), 1);
        }
        return f4.g.c(tVar).then(new e1(xVar));
    }
}
