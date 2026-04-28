package v30;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends e6.h implements ScheduledFuture {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ScheduledFuture f41968h;

    public h(g gVar) {
        this.f41968h = gVar.a(new m1.a(this));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f41968h.compareTo(delayed);
    }

    @Override // e6.h
    public final void d() {
        ScheduledFuture scheduledFuture = this.f41968h;
        Object obj = this.f15773a;
        scheduledFuture.cancel((obj instanceof e6.a) && ((e6.a) obj).f15753a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f41968h.getDelay(timeUnit);
    }
}
