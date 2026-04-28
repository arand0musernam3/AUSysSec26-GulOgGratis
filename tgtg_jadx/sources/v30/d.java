package v30;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f41957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f41958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f41959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f41960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f41961f;

    public /* synthetic */ d(f fVar, Runnable runnable, long j9, long j11, TimeUnit timeUnit, int i11) {
        this.f41956a = i11;
        this.f41957b = fVar;
        this.f41958c = runnable;
        this.f41959d = j9;
        this.f41960e = j11;
        this.f41961f = timeUnit;
    }

    @Override // v30.g
    public final ScheduledFuture a(m1.a aVar) {
        switch (this.f41956a) {
            case 0:
                f fVar = this.f41957b;
                return fVar.f41967b.scheduleAtFixedRate(new e(fVar, this.f41958c, aVar, 0), this.f41959d, this.f41960e, this.f41961f);
            default:
                f fVar2 = this.f41957b;
                return fVar2.f41967b.scheduleWithFixedDelay(new e(fVar2, this.f41958c, aVar, 2), this.f41959d, this.f41960e, this.f41961f);
        }
    }
}
