package v80;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends a1 implements k0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f42070b;

    public b1(Executor executor) {
        Method method;
        this.f42070b = executor;
        Method method2 = a90.a.f1005a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = a90.a.f1005a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // v80.k0
    public final r0 L(long j9, Runnable runnable, CoroutineContext coroutineContext) {
        Executor executor = this.f42070b;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j9, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e5) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e5);
                f0.i(coroutineContext, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new q0(scheduledFutureSchedule) : g0.f42097i.L(j9, runnable, coroutineContext);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f42070b;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b1) && ((b1) obj).f42070b == this.f42070b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f42070b);
    }

    @Override // v80.k0
    public final void r(long j9, l lVar) {
        Executor executor = this.f42070b;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            x0.f fVar = new x0.f(18, this, lVar);
            CoroutineContext coroutineContext = lVar.f42119e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(fVar, j9, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e5) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e5);
                f0.i(coroutineContext, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            lVar.w(new i(scheduledFutureSchedule, 0));
        } else {
            g0.f42097i.r(j9, lVar);
        }
    }

    @Override // v80.x
    public final String toString() {
        return this.f42070b.toString();
    }

    @Override // v80.x
    public final void u0(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.f42070b.execute(runnable);
        } catch (RejectedExecutionException e5) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e5);
            f0.i(coroutineContext, cancellationException);
            c90.f fVar = p0.f42144a;
            c90.e.f7834b.u0(coroutineContext, runnable);
        }
    }
}
