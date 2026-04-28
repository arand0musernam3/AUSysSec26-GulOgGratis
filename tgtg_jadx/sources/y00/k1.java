package y00;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k1 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f44887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44888c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1 f44889d;

    public k1(l1 l1Var, String str, BlockingQueue blockingQueue) {
        this.f44889d = l1Var;
        com.google.android.gms.common.internal.i0.h(blockingQueue);
        this.f44886a = new Object();
        this.f44887b = blockingQueue;
        setName(str);
    }

    public final void a() {
        l1 l1Var = this.f44889d;
        synchronized (l1Var.f44912j) {
            try {
                if (!this.f44888c) {
                    l1Var.f44913k.release();
                    l1Var.f44912j.notifyAll();
                    if (this == l1Var.f44906d) {
                        l1Var.f44906d = null;
                    } else if (this == l1Var.f44907e) {
                        l1Var.f44907e = null;
                    } else {
                        w0 w0Var = ((n1) l1Var.f21216b).f44987f;
                        n1.m(w0Var);
                        w0Var.f45260g.a("Current scheduler thread is neither worker nor network");
                    }
                    this.f44888c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z11 = false;
        while (!z11) {
            try {
                this.f44889d.f44913k.acquire();
                z11 = true;
            } catch (InterruptedException e5) {
                w0 w0Var = ((n1) this.f44889d.f21216b).f44987f;
                n1.m(w0Var);
                w0Var.f45263j.b(e5, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f44887b;
                j1 j1Var = (j1) blockingQueue.poll();
                if (j1Var != null) {
                    Process.setThreadPriority(true != j1Var.f44872b ? 10 : threadPriority);
                    j1Var.run();
                } else {
                    Object obj = this.f44886a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f44889d.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e11) {
                                w0 w0Var2 = ((n1) this.f44889d.f21216b).f44987f;
                                n1.m(w0Var2);
                                w0Var2.f45263j.b(e11, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f44889d.f44912j) {
                        if (this.f44887b.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            a();
            throw th2;
        }
    }
}
