package o30;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v0 extends h0.g implements ScheduledFuture, ListenableFuture, Future {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f31931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScheduledFuture f31932g;

    public v0(j jVar, ScheduledFuture scheduledFuture) {
        super(13);
        this.f31931f = jVar;
        this.f31932g = scheduledFuture;
    }

    public final boolean H(boolean z11) {
        return this.f31931f.cancel(z11);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        this.f31931f.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        boolean zH = H(z11);
        if (zH) {
            this.f31932g.cancel(z11);
        }
        return zH;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f31932g.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f31931f.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f31932g.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f31931f.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f31931f.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) {
        return this.f31931f.get(j9, timeUnit);
    }
}
