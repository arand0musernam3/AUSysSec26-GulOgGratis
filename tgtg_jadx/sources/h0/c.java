package h0;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f20960a = {19, 16, 13, 10, 0, -2, -4, -5, -6, -8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadFactory f20961b;

    static {
        ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        threadFactoryDefaultThreadFactory.getClass();
        f20961b = threadFactoryDefaultThreadFactory;
    }

    public static ScheduledExecutorService a(a aVar, int i11) {
        if (i11 <= 0) {
            i4.a.i(r8.k.h(i11, "Threads (", ") must be > 0"));
            return null;
        }
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(i11, aVar);
        scheduledExecutorServiceNewScheduledThreadPool.getClass();
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    public static b b(ThreadFactory threadFactory, String str) {
        threadFactory.getClass();
        return new b(threadFactory, str, w.b.q(0));
    }
}
