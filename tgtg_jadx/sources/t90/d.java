package t90;

import java.util.logging.Level;
import java.util.logging.Logger;
import ky.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f39875a;

    public d(e eVar) {
        this.f39875a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVarB;
        long jNanoTime;
        a aVarB2;
        e eVar = this.f39875a;
        synchronized (eVar) {
            eVar.f39883g++;
            aVarB = eVar.b();
        }
        if (aVarB == null) {
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        while (true) {
            try {
                threadCurrentThread.setName(aVarB.f39863a);
                Logger logger = this.f39875a.f39878b;
                c cVar = aVarB.f39865c;
                cVar.getClass();
                boolean zIsLoggable = logger.isLoggable(Level.FINE);
                if (zIsLoggable) {
                    o oVar = cVar.f39869a.f39877a;
                    jNanoTime = System.nanoTime();
                    jf.e.n(logger, aVarB, cVar, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    long jA = aVarB.a();
                    if (zIsLoggable) {
                        o oVar2 = cVar.f39869a.f39877a;
                        jf.e.n(logger, aVarB, cVar, "finished run in " + jf.e.C(System.nanoTime() - jNanoTime));
                    }
                    e eVar2 = this.f39875a;
                    synchronized (eVar2) {
                        e.a(eVar2, aVarB, jA, true);
                        aVarB2 = eVar2.b();
                    }
                    if (aVarB2 == null) {
                        return;
                    } else {
                        aVarB = aVarB2;
                    }
                } catch (Throwable th2) {
                    if (zIsLoggable) {
                        o oVar3 = cVar.f39869a.f39877a;
                        jf.e.n(logger, aVarB, cVar, "failed a run in " + jf.e.C(System.nanoTime() - jNanoTime));
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    e eVar3 = this.f39875a;
                    synchronized (eVar3) {
                        e.a(eVar3, aVarB, -1L, false);
                        if (!(th3 instanceof InterruptedException)) {
                            throw th3;
                        }
                        Thread.currentThread().interrupt();
                        return;
                    }
                } finally {
                    threadCurrentThread.setName(name);
                }
            }
        }
    }
}
