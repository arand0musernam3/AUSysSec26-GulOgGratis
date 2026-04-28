package s0;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface i0 extends m0.k, m0.l1 {
    ListenableFuture a();

    @Override // m0.k
    default m0.q b() {
        return q();
    }

    default boolean d() {
        return b().k() == 0;
    }

    f0 f();

    default z h() {
        return c0.f38306a;
    }

    default boolean k() {
        return false;
    }

    void l(Collection collection);

    void m(ArrayList arrayList);

    default boolean o() {
        return true;
    }

    g0 q();

    default void n() {
    }

    default void i(z zVar) {
    }

    default void j(boolean z11) {
    }

    default void p(boolean z11) {
    }
}
