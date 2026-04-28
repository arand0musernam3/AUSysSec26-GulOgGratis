package jb;

import ao.p2;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f24882a = ib.w.f("WorkerWrapper");

    public static final Object a(ListenableFuture listenableFuture, ib.v vVar, z70.i iVar) {
        Object obj;
        try {
            if (!listenableFuture.isDone()) {
                v80.l lVar = new v80.l(1, y70.f.b(iVar));
                lVar.t();
                listenableFuture.a(new x0.f(listenableFuture, lVar), ib.k.INSTANCE);
                lVar.v(new p2(10, vVar, listenableFuture));
                Object objS = lVar.s();
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                return objS;
            }
            boolean z11 = false;
            while (true) {
                try {
                    obj = listenableFuture.get();
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
        } catch (ExecutionException e5) {
            Throwable cause = e5.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
