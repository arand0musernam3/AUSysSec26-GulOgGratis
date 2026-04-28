package o30;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import o00.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r0 implements ListenableFuture {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0 f31913b = new r0(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m1 f31914c = new m1(r0.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f31915a;

    public r0(Object obj) {
        this.f31915a = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        na0.a.b0(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e5) {
            f31914c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e5);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f31915a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f31915a + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f31915a;
    }
}
