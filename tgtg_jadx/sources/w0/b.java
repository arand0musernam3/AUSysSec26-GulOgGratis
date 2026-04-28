package w0;

import android.os.Handler;
import e6.i;
import e6.l;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ox.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements RunnableScheduledFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f42804a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f42805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable f42806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f42807d;

    public b(Handler handler, long j9, Callable callable) {
        this.f42805b = j9;
        this.f42806c = callable;
        this.f42807d = h.A(new t5.a(12, this, handler, callable, false));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        return this.f42807d.cancel(z11);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f42807d.f15782b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.f42805b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f42807d.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f42807d.f15782b.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        i iVar = (i) this.f42804a.getAndSet(null);
        if (iVar != null) {
            try {
                iVar.b(this.f42806c.call());
            } catch (Exception e5) {
                iVar.d(e5);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) {
        return this.f42807d.f15782b.get(j9, timeUnit);
    }
}
