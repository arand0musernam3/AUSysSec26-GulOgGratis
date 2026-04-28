package e7;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15838a;

    public j(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f15838a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f15838a);
        super.run();
    }
}
