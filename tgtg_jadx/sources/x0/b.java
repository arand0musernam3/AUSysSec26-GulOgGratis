package x0;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o30.m0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f43617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedBlockingQueue f43618d = new LinkedBlockingQueue(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CountDownLatch f43619e = new CountDownLatch(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ListenableFuture f43620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile ListenableFuture f43621g;

    public b(a aVar, ListenableFuture listenableFuture) {
        this.f43617c = aVar;
        listenableFuture.getClass();
        this.f43620f = listenableFuture;
    }

    public static Object b(LinkedBlockingQueue linkedBlockingQueue) {
        Object objTake;
        boolean z11 = false;
        while (true) {
            try {
                objTake = linkedBlockingQueue.take();
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
        return objTake;
    }

    @Override // x0.d, java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        boolean z12 = false;
        if (!this.f43622a.cancel(z11)) {
            return false;
        }
        while (true) {
            try {
                this.f43618d.put(Boolean.valueOf(z11));
                break;
            } catch (InterruptedException unused) {
                z12 = true;
            } catch (Throwable th2) {
                if (z12) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z12) {
            Thread.currentThread().interrupt();
        }
        ListenableFuture listenableFuture = this.f43620f;
        if (listenableFuture != null) {
            listenableFuture.cancel(z11);
        }
        ListenableFuture listenableFuture2 = this.f43621g;
        if (listenableFuture2 != null) {
            listenableFuture2.cancel(z11);
        }
        return true;
    }

    @Override // x0.d, java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.f43622a.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j9 = timeUnit2.convert(j9, timeUnit);
                timeUnit = timeUnit2;
            }
            ListenableFuture listenableFuture = this.f43620f;
            if (listenableFuture != null) {
                long jNanoTime = System.nanoTime();
                listenableFuture.get(j9, timeUnit);
                j9 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (!this.f43619e.await(j9, timeUnit)) {
                throw new TimeoutException();
            }
            j9 -= Math.max(0L, System.nanoTime() - jNanoTime2);
            ListenableFuture listenableFuture2 = this.f43621g;
            if (listenableFuture2 != null) {
                listenableFuture2.get(j9, timeUnit);
            }
        }
        return this.f43622a.get(j9, timeUnit);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, x0.a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.util.concurrent.ListenableFuture, x0.a] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.common.util.concurrent.ListenableFuture, x0.a] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r02;
        ?? r03 = 0;
        r03 = 0;
        r03 = 0;
        r03 = 0;
        r03 = 0;
        try {
            try {
                try {
                    try {
                        try {
                            ListenableFuture listenableFutureApply = this.f43617c.apply(g.b(this.f43620f));
                            this.f43621g = listenableFutureApply;
                            if (this.f43622a.isCancelled()) {
                                listenableFutureApply.cancel(((Boolean) b(this.f43618d)).booleanValue());
                                this.f43621g = null;
                            } else {
                                listenableFutureApply.a(new m0(this, listenableFutureApply, false, 17), w.b.F());
                            }
                        } catch (Exception e5) {
                            e6.i iVar = this.f43623b;
                            r02 = r03;
                            if (iVar != null) {
                                iVar.d(e5);
                                r02 = r03;
                            }
                        }
                    } catch (Error e11) {
                        e6.i iVar2 = this.f43623b;
                        r02 = r03;
                        if (iVar2 != null) {
                            iVar2.d(e11);
                            r02 = r03;
                        }
                    }
                } finally {
                    this.f43617c = r03;
                    this.f43620f = r03;
                    this.f43619e.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e12) {
                Throwable cause = e12.getCause();
                e6.i iVar3 = this.f43623b;
                if (iVar3 != null) {
                    iVar3.d(cause);
                }
            }
        } catch (UndeclaredThrowableException e13) {
            Throwable cause2 = e13.getCause();
            e6.i iVar4 = this.f43623b;
            r02 = r03;
            if (iVar4 != null) {
                iVar4.d(cause2);
                r02 = r03;
            }
        }
    }

    @Override // x0.d, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (!this.f43622a.isDone()) {
            ListenableFuture listenableFuture = this.f43620f;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.f43619e.await();
            ListenableFuture listenableFuture2 = this.f43621g;
            if (listenableFuture2 != null) {
                listenableFuture2.get();
            }
        }
        return this.f43622a.get();
    }
}
