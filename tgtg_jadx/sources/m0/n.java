package m0;

import com.google.android.gms.internal.measurement.te;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Executor, ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f28568c = new m(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28569a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ScheduledThreadPoolExecutor f28570b;

    public n() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, f28568c);
        scheduledThreadPoolExecutor.setKeepAliveTime(0L, TimeUnit.MILLISECONDS);
        scheduledThreadPoolExecutor.setRejectedExecutionHandler(new com.appsflyer.internal.h(1));
        this.f28570b = scheduledThreadPoolExecutor;
    }

    public final void a(te teVar) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        teVar.getClass();
        synchronized (this.f28569a) {
            try {
                if (this.f28570b.isShutdown()) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, f28568c);
                    scheduledThreadPoolExecutor2.setKeepAliveTime(0L, TimeUnit.MILLISECONDS);
                    scheduledThreadPoolExecutor2.setRejectedExecutionHandler(new com.appsflyer.internal.h(1));
                    this.f28570b = scheduledThreadPoolExecutor2;
                }
                scheduledThreadPoolExecutor = this.f28570b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        scheduledThreadPoolExecutor.setCorePoolSize(Math.max(1, teVar.h().size()));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j9, TimeUnit timeUnit) {
        boolean zAwaitTermination;
        synchronized (this.f28569a) {
            zAwaitTermination = this.f28570b.awaitTermination(j9, timeUnit);
        }
        return zAwaitTermination;
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z11 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z11) {
                    shutdownNow();
                    z11 = true;
                }
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f28569a) {
            this.f28570b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        List listInvokeAll;
        synchronized (this.f28569a) {
            listInvokeAll = this.f28570b.invokeAll(collection);
        }
        return listInvokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        Object objInvokeAny;
        synchronized (this.f28569a) {
            objInvokeAny = this.f28570b.invokeAny(collection);
        }
        return objInvokeAny;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        boolean zIsShutdown;
        synchronized (this.f28569a) {
            zIsShutdown = this.f28570b.isShutdown();
        }
        return zIsShutdown;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        boolean zIsTerminated;
        synchronized (this.f28569a) {
            zIsTerminated = this.f28570b.isTerminated();
        }
        return zIsTerminated;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j9, TimeUnit timeUnit) {
        ScheduledFuture<?> scheduledFutureSchedule;
        synchronized (this.f28569a) {
            scheduledFutureSchedule = this.f28570b.schedule(runnable, j9, timeUnit);
        }
        return scheduledFutureSchedule;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j9, long j11, TimeUnit timeUnit) {
        ScheduledFuture<?> scheduledFutureScheduleAtFixedRate;
        synchronized (this.f28569a) {
            scheduledFutureScheduleAtFixedRate = this.f28570b.scheduleAtFixedRate(runnable, j9, j11, timeUnit);
        }
        return scheduledFutureScheduleAtFixedRate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j9, long j11, TimeUnit timeUnit) {
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        synchronized (this.f28569a) {
            scheduledFutureScheduleWithFixedDelay = this.f28570b.scheduleWithFixedDelay(runnable, j9, j11, timeUnit);
        }
        return scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        synchronized (this.f28569a) {
            this.f28570b.shutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        List<Runnable> listShutdownNow;
        synchronized (this.f28569a) {
            listShutdownNow = this.f28570b.shutdownNow();
        }
        return listShutdownNow;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        Future futureSubmit;
        synchronized (this.f28569a) {
            futureSubmit = this.f28570b.submit(callable);
        }
        return futureSubmit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j9, TimeUnit timeUnit) {
        List listInvokeAll;
        synchronized (this.f28569a) {
            listInvokeAll = this.f28570b.invokeAll(collection, j9, timeUnit);
        }
        return listInvokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j9, TimeUnit timeUnit) {
        Object objInvokeAny;
        synchronized (this.f28569a) {
            objInvokeAny = this.f28570b.invokeAny(collection, j9, timeUnit);
        }
        return objInvokeAny;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j9, TimeUnit timeUnit) {
        ScheduledFuture scheduledFutureSchedule;
        synchronized (this.f28569a) {
            scheduledFutureSchedule = this.f28570b.schedule(callable, j9, timeUnit);
        }
        return scheduledFutureSchedule;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        Future futureSubmit;
        synchronized (this.f28569a) {
            futureSubmit = this.f28570b.submit(runnable, obj);
        }
        return futureSubmit;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        Future<?> futureSubmit;
        synchronized (this.f28569a) {
            futureSubmit = this.f28570b.submit(runnable);
        }
        return futureSubmit;
    }
}
