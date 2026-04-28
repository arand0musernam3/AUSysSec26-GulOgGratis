package s0;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f38328a = new e0();

    void a(u1 u1Var);

    void b();

    void c(int i11);

    ListenableFuture d(ArrayList arrayList, int i11, int i12);

    ListenableFuture e(boolean z11);

    u0 f();

    void g(u0 u0Var);

    void i();

    default ListenableFuture j(int i11) {
        return x0.g.c(new d0());
    }

    default void h(y0.f fVar) {
    }
}
