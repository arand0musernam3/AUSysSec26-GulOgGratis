package d7;

import qa.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b40.a f14561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14562c;

    public final void a() {
        synchronized (this) {
            try {
                if (this.f14560a) {
                    return;
                }
                this.f14560a = true;
                this.f14562c = true;
                b40.a aVar = this.f14561b;
                if (aVar != null) {
                    try {
                        Runnable runnable = (Runnable) aVar.f5733b;
                        y yVar = (y) aVar.f5734c;
                        Runnable runnable2 = (Runnable) aVar.f5735d;
                        if (runnable == null) {
                            yVar.cancel();
                            runnable2.run();
                        } else {
                            runnable.run();
                        }
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f14562c = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                synchronized (this) {
                    this.f14562c = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }
}
