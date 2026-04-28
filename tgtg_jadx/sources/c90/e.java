package c90;

import a90.w;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import v80.a1;
import v80.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends a1 implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f7834b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f7835c;

    static {
        l lVar = l.f7848b;
        int i11 = w.f1052a;
        if (64 >= i11) {
            i11 = 64;
        }
        f7835c = lVar.z0(a90.g.l(i11, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        u0(kotlin.coroutines.g.f26549a, runnable);
    }

    @Override // v80.x
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // v80.x
    public final void u0(CoroutineContext coroutineContext, Runnable runnable) {
        f7835c.u0(coroutineContext, runnable);
    }

    @Override // v80.x
    public final void x0(CoroutineContext coroutineContext, Runnable runnable) {
        f7835c.x0(coroutineContext, runnable);
    }

    @Override // v80.x
    public final x z0(int i11) {
        return l.f7848b.z0(i11);
    }
}
