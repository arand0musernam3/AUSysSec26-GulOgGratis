package o30;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f31939b;

    public /* synthetic */ y0(int i11, Runnable runnable) {
        this.f31938a = i11;
        this.f31939b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31938a) {
            case 0:
                this.f31939b.run();
                break;
            case 1:
                this.f31939b.run();
                break;
            case 2:
                this.f31939b.run();
                break;
            case 3:
                try {
                    this.f31939b.run();
                } catch (Exception e5) {
                    w0.e.u("Executor", "Background execution failure.", e5);
                    return;
                }
                break;
            default:
                Process.setThreadPriority(0);
                this.f31939b.run();
                break;
        }
    }

    public String toString() {
        switch (this.f31938a) {
            case 0:
                return this.f31939b.toString();
            case 1:
                return this.f31939b.toString();
            default:
                return super.toString();
        }
    }
}
