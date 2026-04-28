package x0;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class i implements ListenableFuture {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f43629c = new i(null, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f43631b;

    public /* synthetic */ i(Object obj, int i11) {
        this.f43630a = i11;
        this.f43631b = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e5) {
            wd.a.s("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e5);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        switch (this.f43630a) {
            case 0:
                return this.f43631b;
            default:
                throw new ExecutionException((Throwable) this.f43631b);
        }
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
        switch (this.f43630a) {
            case 0:
                return super.toString() + "[status=SUCCESS, result=[" + this.f43631b + "]]";
            default:
                return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) this.f43631b) + "]]";
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
