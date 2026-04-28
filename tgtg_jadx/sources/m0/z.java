package m0;

import android.os.Handler;
import java.util.concurrent.Executor;
import s0.o1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements y0.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s0.g f28639b = new s0.g("camerax.core.appConfig.cameraFactoryProvider", w.f.class, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s0.g f28640c = new s0.g("camerax.core.appConfig.deviceSurfaceManagerProvider", v.a.class, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s0.g f28641d = new s0.g("camerax.core.appConfig.useCaseConfigFactoryProvider", v.b.class, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s0.g f28642e = new s0.g("camerax.core.appConfig.cameraExecutor", Executor.class, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s0.g f28643f = new s0.g("camerax.core.appConfig.schedulerHandler", Handler.class, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s0.g f28644g = new s0.g("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s0.g f28645h = new s0.g("camerax.core.appConfig.availableCamerasLimiter", s.class, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s0.g f28646i = new s0.g("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final s0.g f28647j = new s0.g("camerax.core.appConfig.cameraProviderInitRetryPolicy", u0.class, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final s0.g f28648k = new s0.g("camerax.core.appConfig.quirksSettings", o1.class, null);
    public static final s0.g l = new s0.g("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0.l1 f28649a;

    public z(s0.l1 l1Var) {
        this.f28649a = l1Var;
    }

    public final s e() {
        return (s) this.f28649a.i(f28645h, null);
    }

    @Override // s0.s1
    public final s0.u0 getConfig() {
        return this.f28649a;
    }

    public final w.f h() {
        return (w.f) this.f28649a.i(f28639b, null);
    }

    public final long s() {
        return ((Long) this.f28649a.i(f28646i, -1L)).longValue();
    }

    public final v.a v() {
        return (v.a) this.f28649a.i(f28640c, null);
    }

    public final v.b x() {
        return (v.b) this.f28649a.i(f28641d, null);
    }
}
