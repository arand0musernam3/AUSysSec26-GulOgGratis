package v80;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f42147a;

    public q0(ScheduledFuture scheduledFuture) {
        this.f42147a = scheduledFuture;
    }

    @Override // v80.r0
    public final void a() {
        this.f42147a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f42147a + ']';
    }
}
