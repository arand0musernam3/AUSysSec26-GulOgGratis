package com.google.android.gms.internal.measurement;

import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f11474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h1 f11475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WeakHashMap f11476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c5.a1 f11477d;

    static {
        k30.m.l(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        f11474a = new AtomicReference(k30.d0.f25887j);
        f11475b = new h1(17);
        f11476c = new WeakHashMap();
        f11477d = new c5.a1(2);
        new ArrayDeque();
        new ArrayDeque();
    }

    public static yf a() {
        xf xfVarC = c();
        yf yfVar = xfVarC.f12043b;
        if (yfVar != null && yfVar != of.f11732g) {
            return yfVar;
        }
        zzvr zzvrVar = mf.f11637g;
        UUID uuidB = jf.f11525c.b();
        String strA = bf.a(uuidB);
        k30.m mVar = (k30.m) f11474a.get();
        if (!mVar.isEmpty()) {
            mVar.forEach(new lf(0));
        }
        return new mf(uuidB, strA, mf.f11637g, xfVarC);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.yf b(com.google.android.gms.internal.measurement.xf r5, com.google.android.gms.internal.measurement.yf r6) {
        /*
            r5.getClass()
            com.google.android.gms.internal.measurement.yf r0 = r5.f12043b
            if (r0 != r6) goto L9
            goto L7a
        L9:
            if (r0 != 0) goto L43
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L16
            boolean r1 = android.os.Trace.isEnabled()
            goto L41
        L16:
            com.google.android.gms.internal.measurement.pd r1 = com.google.android.gms.internal.measurement.qd.f11801a
            r1.getClass()
            com.google.android.gms.internal.measurement.h1 r1 = com.google.android.gms.internal.measurement.hf.f11475b
            r1.getClass()
            java.lang.String r1 = "tiktok_systrace"
            java.lang.String r2 = "false"
            java.lang.reflect.Method r3 = com.google.android.gms.internal.measurement.rd.f11831a     // Catch: java.lang.Exception -> L33
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}     // Catch: java.lang.Exception -> L33
            r4 = 0
            java.lang.Object r1 = r3.invoke(r4, r1)     // Catch: java.lang.Exception -> L33
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L33
            r2 = r1
            goto L3b
        L33:
            r1 = move-exception
            java.lang.String r3 = "SystemProperties"
            java.lang.String r4 = "get error"
            android.util.Log.e(r3, r4, r1)
        L3b:
            java.lang.String r1 = "true"
            boolean r1 = r2.equals(r1)
        L41:
            r5.f12042a = r1
        L43:
            boolean r1 = r5.f12042a
            if (r1 == 0) goto L75
            if (r0 == 0) goto L70
            if (r6 == 0) goto L6d
            r1 = r0
            com.google.android.gms.internal.measurement.bf r1 = (com.google.android.gms.internal.measurement.bf) r1
            com.google.android.gms.internal.measurement.bf r1 = r1.f11290a
            if (r1 != r6) goto L5c
            boolean r1 = com.google.android.gms.internal.measurement.g1.g(r0)
            if (r1 != 0) goto L5c
            android.os.Trace.endSection()
            goto L75
        L5c:
            r1 = r6
            com.google.android.gms.internal.measurement.bf r1 = (com.google.android.gms.internal.measurement.bf) r1
            com.google.android.gms.internal.measurement.bf r1 = r1.f11290a
            if (r0 != r1) goto L6d
            boolean r1 = com.google.android.gms.internal.measurement.g1.g(r6)
            if (r1 != 0) goto L6d
            com.google.android.gms.internal.measurement.g1.h(r6)
            goto L75
        L6d:
            com.google.android.gms.internal.measurement.g1.f(r0)
        L70:
            if (r6 == 0) goto L75
            com.google.android.gms.internal.measurement.g1.e(r6)
        L75:
            if (r0 == r6) goto L7a
            r5.f12043b = r6
            return r0
        L7a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.hf.b(com.google.android.gms.internal.measurement.xf, com.google.android.gms.internal.measurement.yf):com.google.android.gms.internal.measurement.yf");
    }

    public static xf c() {
        return (xf) f11477d.get();
    }
}
