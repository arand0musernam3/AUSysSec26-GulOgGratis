package o30;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends k0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ListenableFuture f31898i;

    public l0(ListenableFuture listenableFuture) {
        this.f31898i = listenableFuture;
    }

    @Override // o30.j, com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        this.f31898i.a(runnable, executor);
    }

    @Override // o30.j, java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        return this.f31898i.cancel(z11);
    }

    @Override // o30.j, java.util.concurrent.Future
    public final Object get() {
        return this.f31898i.get();
    }

    @Override // o30.j, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f31898i.isCancelled();
    }

    @Override // o30.j, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f31898i.isDone();
    }

    @Override // o30.j
    public final String toString() {
        return this.f31898i.toString();
    }

    @Override // o30.j, java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) {
        return this.f31898i.get(j9, timeUnit);
    }
}
