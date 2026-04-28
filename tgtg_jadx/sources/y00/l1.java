package y00;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l1 extends w1 {
    public static final AtomicLong l = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k1 f44906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k1 f44907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PriorityBlockingQueue f44908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedBlockingQueue f44909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i1 f44910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i1 f44911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f44912j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Semaphore f44913k;

    public l1(n1 n1Var) {
        super(n1Var);
        this.f44912j = new Object();
        this.f44913k = new Semaphore(2);
        this.f44908f = new PriorityBlockingQueue();
        this.f44909g = new LinkedBlockingQueue();
        this.f44910h = new i1(this, "Thread death: Uncaught exception on worker thread");
        this.f44911i = new i1(this, "Thread death: Uncaught exception on network thread");
    }

    public final void A(Runnable runnable) {
        r();
        C(new j1(this, runnable, true, "Task exception on worker thread"));
    }

    public final void B(Runnable runnable) {
        r();
        j1 j1Var = new j1(this, runnable, false, "Task exception on network thread");
        synchronized (this.f44912j) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f44909g;
                linkedBlockingQueue.add(j1Var);
                k1 k1Var = this.f44907e;
                if (k1Var == null) {
                    k1 k1Var2 = new k1(this, "Measurement Network", linkedBlockingQueue);
                    this.f44907e = k1Var2;
                    k1Var2.setUncaughtExceptionHandler(this.f44911i);
                    this.f44907e.start();
                } else {
                    Object obj = k1Var.f44886a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void C(j1 j1Var) {
        synchronized (this.f44912j) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f44908f;
                priorityBlockingQueue.add(j1Var);
                k1 k1Var = this.f44906d;
                if (k1Var == null) {
                    k1 k1Var2 = new k1(this, "Measurement Worker", priorityBlockingQueue);
                    this.f44906d = k1Var2;
                    k1Var2.setUncaughtExceptionHandler(this.f44910h);
                    this.f44906d.start();
                } else {
                    Object obj = k1Var.f44886a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // h2.s0
    public final void p() {
        if (Thread.currentThread() == this.f44906d) {
            return;
        }
        com.braze.h2.b("Call expected from worker thread");
    }

    @Override // y00.w1
    public final boolean q() {
        return false;
    }

    public final void t() {
        if (Thread.currentThread() == this.f44907e) {
            return;
        }
        com.braze.h2.b("Call expected from network thread");
    }

    public final void u() {
        if (Thread.currentThread() != this.f44906d) {
            return;
        }
        com.braze.h2.b("Call not expected from worker thread");
    }

    public final boolean v() {
        return Thread.currentThread() == this.f44906d;
    }

    public final j1 w(Callable callable) {
        r();
        j1 j1Var = new j1(this, callable, false);
        if (Thread.currentThread() != this.f44906d) {
            C(j1Var);
            return j1Var;
        }
        if (!this.f44908f.isEmpty()) {
            w0 w0Var = ((n1) this.f21216b).f44987f;
            n1.m(w0Var);
            w0Var.f45263j.a("Callable skipped the worker queue.");
        }
        j1Var.run();
        return j1Var;
    }

    public final j1 x(Callable callable) {
        r();
        j1 j1Var = new j1(this, callable, true);
        if (Thread.currentThread() == this.f44906d) {
            j1Var.run();
            return j1Var;
        }
        C(j1Var);
        return j1Var;
    }

    public final void y(Runnable runnable) {
        r();
        com.google.android.gms.common.internal.i0.h(runnable);
        C(new j1(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object z(AtomicReference atomicReference, long j9, String str, Runnable runnable) {
        synchronized (atomicReference) {
            l1 l1Var = ((n1) this.f21216b).f44988g;
            n1.m(l1Var);
            l1Var.y(runnable);
            try {
                atomicReference.wait(j9);
            } catch (InterruptedException unused) {
                w0 w0Var = ((n1) this.f21216b).f44987f;
                n1.m(w0Var);
                u0 u0Var = w0Var.f45263j;
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                u0Var.a(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            w0 w0Var2 = ((n1) this.f21216b).f44987f;
            n1.m(w0Var2);
            w0Var2.f45263j.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }
}
