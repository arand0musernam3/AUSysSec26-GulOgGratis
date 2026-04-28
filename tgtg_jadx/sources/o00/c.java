package o00;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f31627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f31628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f31629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final WeakHashMap f31630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c5.a1 f31631e;

    static {
        x.l(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        f31627a = true;
        f31628b = new AtomicReference(f0.f31655i);
        f31629c = new h();
        f31630d = new WeakHashMap();
        f31631e = new c5.a1(9);
        new ArrayDeque();
        new ArrayDeque();
    }

    public static void a(m mVar, f fVar, int i11) {
        f fVar2;
        f fVar3;
        f fVar4;
        boolean zEquals;
        f fVar5 = mVar.f31706b;
        if (fVar5 == fVar && (i11 == 2 || i11 == 4 || fVar5 == null)) {
            return;
        }
        if (fVar5 == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                zEquals = Trace.isEnabled();
            } else {
                f31629c.getClass();
                String str = "false";
                try {
                    str = (String) b.f31621a.invoke(null, "tiktok_systrace", "false");
                } catch (Exception e5) {
                    Log.e("SystemProperties", "get error", e5);
                }
                zEquals = "true".equals(str);
            }
            mVar.f31705a = zEquals;
        }
        jd.f fVar6 = mVar.f31708d;
        if (mVar.f31705a) {
            if (fVar6 != null) {
                int i12 = i11 - 1;
                if (i12 == 0) {
                    fVar3 = fVar;
                    fVar4 = null;
                } else if (i12 != 2) {
                    fVar3 = fVar;
                    fVar4 = fVar5;
                } else {
                    fVar4 = fVar5;
                    fVar3 = null;
                }
                if (fVar4 != null) {
                    Trace.endSection();
                    Trace.endSection();
                }
                if (fVar3 != null) {
                    Trace.beginSection(fVar3.f31653a);
                    Trace.beginSection("<missing root>");
                }
            } else {
                if (fVar5 != null) {
                    fVar2 = fVar != null ? fVar : null;
                    Thread.currentThread();
                    Trace.endSection();
                    Trace.endSection();
                } else {
                    fVar2 = fVar;
                }
                if (fVar2 != null) {
                    Thread.currentThread();
                    Trace.beginSection(fVar2.f31653a);
                    Trace.beginSection("<missing root>");
                }
            }
        }
        if (fVar5 == fVar) {
            return;
        }
        if (fVar == null) {
            fVar = null;
        }
        mVar.f31706b = fVar;
        if (i11 == 2) {
            if (fVar6 != null) {
                fVar6.f24983b = fVar;
            } else {
                c50.w.l("Coroutine is executing but trace storage is not being set.");
            }
        }
    }
}
