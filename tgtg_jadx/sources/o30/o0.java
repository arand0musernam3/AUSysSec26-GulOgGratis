package o30;

import com.braze.h2;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o0 {
    public static a a(ListenableFuture listenableFuture, Class cls, b0 b0Var, Executor executor) {
        int i11 = c.l;
        a aVar = new a(listenableFuture, cls, b0Var);
        listenableFuture.a(aVar, wd.a.E(executor, aVar));
        return aVar;
    }

    public static Object b(Future future) {
        Object obj;
        if (!future.isDone()) {
            h2.b(nx.d.A("Future was expected to be done: %s", future));
            return null;
        }
        boolean z11 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static q0 c(Exception exc) {
        q0 q0Var = new q0();
        q0Var.n(exc);
        return q0Var;
    }

    public static r0 d(Object obj) {
        return obj == null ? r0.f31913b : new r0(obj);
    }

    public static ListenableFuture e(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        n0 n0Var = new n0();
        n0Var.f31902h = listenableFuture;
        listenableFuture.a(n0Var, g0.INSTANCE);
        return n0Var;
    }

    public static t f(ListenableFuture listenableFuture, b0 b0Var, Executor executor) {
        int i11 = v.f31928k;
        t tVar = new t(listenableFuture, b0Var);
        listenableFuture.a(tVar, wd.a.E(executor, tVar));
        return tVar;
    }
}
