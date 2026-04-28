package m3;

import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface c {
    void c(int i11, Object obj);

    void d(Object obj);

    void f();

    void g(int i11, int i12, int i13);

    void h(int i11, int i12);

    void j();

    default void l(Object obj, Function2 function2) {
        function2.invoke(p(), obj);
    }

    void n(int i11, Object obj);

    Object p();

    default void o() {
    }
}
