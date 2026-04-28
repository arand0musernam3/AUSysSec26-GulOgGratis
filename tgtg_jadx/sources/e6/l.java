package e6;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements ListenableFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f15781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f15782b = new k(this);

    public l(i iVar) {
        this.f15781a = new WeakReference(iVar);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        this.f15782b.a(runnable, executor);
    }

    public final boolean b(Throwable th2) {
        return this.f15782b.l(th2);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        i iVar = (i) this.f15781a.get();
        boolean zCancel = this.f15782b.cancel(z11);
        if (zCancel && iVar != null) {
            iVar.f15776a = null;
            iVar.f15777b = null;
            iVar.f15778c.k(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f15782b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15782b.f15773a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f15782b.isDone();
    }

    public final String toString() {
        return this.f15782b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) {
        return this.f15782b.get(j9, timeUnit);
    }
}
