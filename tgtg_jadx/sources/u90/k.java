package u90;

import com.google.firebase.messaging.a0;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q90.i f40918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f40919b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f40920c;

    public k(n nVar, q90.i iVar) {
        this.f40920c = nVar;
        this.f40918a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0 a0Var;
        String strConcat = "OkHttp ".concat(this.f40920c.f40924b.f36505a.h());
        n nVar = this.f40920c;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            nVar.f40927e.i();
            boolean z11 = false;
            try {
                try {
                    try {
                        this.f40918a.b(nVar, nVar.i());
                        a0Var = nVar.f40923a.f36463a;
                    } catch (IOException e5) {
                        e = e5;
                        z11 = true;
                        if (z11) {
                            aa0.e eVar = aa0.e.f1191a;
                            aa0.e.f1191a.i(4, "Callback failure for ".concat(n.a(nVar)), e);
                        } else {
                            this.f40918a.e(nVar, e);
                        }
                        a0Var = nVar.f40923a.f36463a;
                    } catch (Throwable th2) {
                        th = th2;
                        z11 = true;
                        nVar.cancel();
                        if (!z11) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.f40918a.e(nVar, iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        a0Var = nVar.f40923a.f36463a;
                    }
                } catch (Throwable th3) {
                    a0 a0Var2 = nVar.f40923a.f36463a;
                    a0Var2.getClass();
                    a0.T(a0Var2, null, null, this, 3);
                    throw th3;
                }
            } catch (IOException e11) {
                e = e11;
            } catch (Throwable th4) {
                th = th4;
            }
            a0Var.getClass();
            a0.T(a0Var, null, null, this, 3);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
