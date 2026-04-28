package x0;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class d implements ListenableFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListenableFuture f43622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e6.i f43623b;

    public d() {
        this.f43622a = ox.h.A(new m1.a(this));
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        this.f43622a.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        return this.f43622a.cancel(z11);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f43622a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f43622a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f43622a.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j9, TimeUnit timeUnit) {
        return this.f43622a.get(j9, timeUnit);
    }

    public d(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.f43622a = listenableFuture;
    }
}
