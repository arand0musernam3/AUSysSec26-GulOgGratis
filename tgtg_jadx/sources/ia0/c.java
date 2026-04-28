package ia0;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        d dVarR;
        while (true) {
            try {
                androidx.constraintlayout.widget.z zVar = d.f23614h;
                reentrantLock = d.f23616j;
                reentrantLock.lock();
                try {
                    dVarR = qb.e.r();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (dVarR == d.f23615i) {
                d.f23615i = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (dVarR != null) {
                    dVarR.l();
                }
            }
        }
    }
}
