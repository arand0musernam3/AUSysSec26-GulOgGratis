package x0;

import com.google.common.util.concurrent.ListenableFuture;
import e6.l;
import e6.n;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static Object a(Future future) {
        pd.g.n("Future was expected to be done, " + future, future.isDone());
        return b(future);
    }

    public static Object b(Future future) {
        Object obj;
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

    public static i c(Object obj) {
        return obj == null ? i.f43629c : new i(obj, 0);
    }

    public static ListenableFuture d(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        e6.i iVar = new e6.i();
        iVar.f15778c = new n();
        l lVar = new l(iVar);
        iVar.f15777b = lVar;
        iVar.f15776a = a0.class;
        try {
            e(false, listenableFuture, iVar, w.b.F());
            iVar.f15776a = "nonCancellationPropagating[" + listenableFuture + "]";
        } catch (Exception e5) {
            lVar.b(e5);
        }
        return lVar;
    }

    public static void e(boolean z11, ListenableFuture listenableFuture, e6.i iVar, w0.a aVar) {
        listenableFuture.getClass();
        iVar.getClass();
        aVar.getClass();
        listenableFuture.a(new f(0, listenableFuture, new e(iVar, 0)), aVar);
        if (z11) {
            iVar.a(new a8.f(listenableFuture, 20), w.b.F());
        }
    }

    public static b f(ListenableFuture listenableFuture, a aVar, Executor executor) {
        b bVar = new b(aVar, listenableFuture);
        listenableFuture.a(bVar, executor);
        return bVar;
    }
}
