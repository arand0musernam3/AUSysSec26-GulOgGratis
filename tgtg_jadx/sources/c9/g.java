package c9;

import a40.d0;
import android.util.Log;
import he.e0;
import he.f0;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends FutureTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7811a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7812b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, f fVar) {
        super(fVar);
        this.f7812b = aVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        switch (this.f7811a) {
            case 0:
                a aVar = (a) this.f7812b;
                AtomicBoolean atomicBoolean = aVar.f7806d;
                try {
                    Object obj = get();
                    if (atomicBoolean.get()) {
                        return;
                    }
                    aVar.a(obj);
                    return;
                } catch (InterruptedException e5) {
                    Log.w("AsyncTask", e5);
                    return;
                } catch (CancellationException unused) {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    aVar.a(null);
                    return;
                } catch (ExecutionException e11) {
                    d0.o("An error occurred while executing doInBackground()", e11.getCause());
                    return;
                } catch (Throwable th2) {
                    d0.o("An error occurred while executing doInBackground()", th2);
                    return;
                }
            default:
                try {
                    if (!isCancelled()) {
                        try {
                            ((f0) this.f7812b).d((e0) get());
                        } catch (InterruptedException | ExecutionException e12) {
                            ((f0) this.f7812b).d(new e0(e12));
                        }
                        break;
                    }
                    return;
                } finally {
                    this.f7812b = null;
                }
        }
    }

    public /* synthetic */ g(Callable callable) {
        super(callable);
    }
}
