package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends v2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f11614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f11615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f11616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicReference f11617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicLong f11618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f11619h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile v2 f11620b;

    static {
        String str = Build.FINGERPRINT;
        f11614c = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        f11615d = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        f11616e = "eng".equals(str3) || "userdebug".equals(str3);
        f11617f = new AtomicReference();
        f11618g = new AtomicLong();
        f11619h = new ConcurrentLinkedQueue();
    }

    public static void m() {
        while (true) {
            l lVar = (l) f11619h.poll();
            if (lVar == null) {
                return;
            }
            f11618g.getAndDecrement();
            m mVar = lVar.f11578a;
            jg jgVar = lVar.f11579b;
            ng ngVar = jgVar.f11531c;
            if ((ngVar != null && Boolean.TRUE.equals(ngVar.k(mg.f11645g))) || mVar.e(jgVar.f11529a)) {
                mVar.f(jgVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.v2
    public final boolean e(Level level) {
        return this.f11620b == null || this.f11620b.e(level);
    }

    @Override // com.google.android.gms.internal.measurement.v2
    public final void f(jg jgVar) {
        if (this.f11620b != null) {
            this.f11620b.f(jgVar);
            return;
        }
        if (f11618g.incrementAndGet() > 20) {
            f11619h.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f11619h.offer(new l(this, jgVar));
        if (this.f11620b != null) {
            m();
        }
    }

    @Override // com.google.android.gms.internal.measurement.v2
    public final void i(RuntimeException runtimeException, jg jgVar) {
        if (this.f11620b != null) {
            this.f11620b.i(runtimeException, jgVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
