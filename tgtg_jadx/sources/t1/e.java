package t1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface e {
    boolean a();

    long b();

    v1 c();

    o d(long j9);

    default boolean e(long j9) {
        return j9 >= b();
    }

    Object f(long j9);

    Object g();
}
