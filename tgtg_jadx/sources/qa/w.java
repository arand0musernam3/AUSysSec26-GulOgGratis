package qa;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface w {
    void a(y yVar);

    void b();

    void c(y yVar);

    default void d(y yVar) {
        a(yVar);
    }

    default void e(y yVar) {
        c(yVar);
    }

    void f();

    void g(y yVar);
}
