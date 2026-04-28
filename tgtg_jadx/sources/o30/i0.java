package o30;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends AtomicReference implements Executor, Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f31887e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k8.d f31888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f31889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f31890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Thread f31891d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == h0.CANCELLED) {
            this.f31889b = null;
            this.f31888a = null;
            return;
        }
        this.f31891d = Thread.currentThread();
        try {
            k8.d dVar = this.f31888a;
            Objects.requireNonNull(dVar);
            j30.g gVar = (j30.g) dVar.f26135c;
            if (((Thread) gVar.f24502b) == this.f31891d) {
                this.f31888a = null;
                if (((Runnable) gVar.f24503c) != null) {
                    throw new IllegalStateException();
                }
                gVar.f24503c = runnable;
                Executor executor = this.f31889b;
                Objects.requireNonNull(executor);
                gVar.f24504d = executor;
                this.f31889b = null;
            } else {
                Executor executor2 = this.f31889b;
                Objects.requireNonNull(executor2);
                this.f31889b = null;
                this.f31890c = runnable;
                executor2.execute(this);
            }
            this.f31891d = null;
        } catch (Throwable th2) {
            this.f31891d = null;
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread != this.f31891d) {
            Runnable runnable = this.f31890c;
            Objects.requireNonNull(runnable);
            this.f31890c = null;
            runnable.run();
            return;
        }
        j30.g gVar = new j30.g(17, (char) 0);
        gVar.f24502b = threadCurrentThread;
        k8.d dVar = this.f31888a;
        Objects.requireNonNull(dVar);
        dVar.f26135c = gVar;
        this.f31888a = null;
        try {
            Runnable runnable2 = this.f31890c;
            Objects.requireNonNull(runnable2);
            this.f31890c = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = (Runnable) gVar.f24503c;
                if (runnable3 == null || (executor = (Executor) gVar.f24504d) == null) {
                    break;
                }
                gVar.f24503c = null;
                gVar.f24504d = null;
                executor.execute(runnable3);
            }
        } finally {
            gVar.f24502b = null;
        }
    }
}
