package o30;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class t0 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l8.n f31924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l8.n f31925b;

    static {
        int i11 = 1;
        f31924a = new l8.n(i11);
        f31925b = new l8.n(i11);
    }

    public abstract void a(Throwable th2);

    public abstract void b(Object obj);

    public final void c() {
        l8.n nVar = f31925b;
        l8.n nVar2 = f31924a;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            s0 s0Var = new s0(this);
            s0.a(s0Var, Thread.currentThread());
            if (compareAndSet(runnable, s0Var)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(nVar2)) == nVar) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    public abstract Object e();

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        s0 s0Var = null;
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            boolean z12 = runnable instanceof s0;
            l8.n nVar = f31925b;
            if (!z12 && runnable != nVar) {
                break;
            }
            if (z12) {
                s0Var = (s0) runnable;
            }
            i11++;
            if (i11 <= 1000) {
                Thread.yield();
            } else if (runnable == nVar || compareAndSet(runnable, nVar)) {
                z11 = Thread.interrupted() || z11;
                LockSupport.park(s0Var);
            }
            runnable = (Runnable) get();
        }
        if (z11) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objE = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            l8.n nVar = f31924a;
            if (!zD) {
                try {
                    objE = e();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, nVar)) {
                            g(threadCurrentThread);
                        }
                        if (zD) {
                            return;
                        }
                        a(th2);
                        return;
                    } finally {
                        if (!compareAndSet(threadCurrentThread, nVar)) {
                            g(threadCurrentThread);
                        }
                        if (!zD) {
                            b(null);
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f31924a) {
            str = "running=[DONE]";
        } else if (runnable instanceof s0) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbR = e0.f.r(str, ", ");
        sbR.append(f());
        return sbR.toString();
    }
}
