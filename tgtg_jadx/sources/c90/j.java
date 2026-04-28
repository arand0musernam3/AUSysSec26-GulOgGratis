package c90;

import v80.f0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f7841c;

    public j(Runnable runnable, long j9, boolean z11) {
        super(j9, z11);
        this.f7841c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7841c.run();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f7841c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(f0.s(runnable));
        sb2.append(", ");
        sb2.append(this.f7839a);
        sb2.append(", ");
        return l1.f(sb2, this.f7840b ? "Blocking" : "Non-blocking", ']');
    }
}
