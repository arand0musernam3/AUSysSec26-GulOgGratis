package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a7 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile a7 f11244h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f11245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppMeasurementSdk f11246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile a6 f11250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile long f11251g;

    public a7(Context context, Bundle bundle) {
        v6 v6Var = new v6(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), v6Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f11245a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f11246b = new AppMeasurementSdk(this);
        this.f11247c = new ArrayList();
        int i11 = 0;
        try {
            if (y00.c2.b(context, y00.c2.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, a7.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f11249e = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        a(new p6(this, context, bundle, i11));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new z6(this));
        }
    }

    public static a7 c(Context context, Bundle bundle) {
        com.google.android.gms.common.internal.i0.h(context);
        if (f11244h == null) {
            synchronized (a7.class) {
                try {
                    if (f11244h == null) {
                        f11244h = new a7(context, bundle == null ? new Bundle() : new Bundle(bundle));
                    }
                } finally {
                }
            }
        }
        return f11244h;
    }

    public final void a(w6 w6Var) {
        this.f11245a.execute(w6Var);
    }

    public final void b(Exception exc, boolean z11, boolean z12) {
        this.f11249e |= z11;
        if (z11) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z12) {
            a(new m6(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final long d() {
        x5 x5Var = new x5();
        a(new s6(this, x5Var, 2));
        Long l = (Long) x5.C(x5Var.b(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i11 = this.f11248d + 1;
        this.f11248d = i11;
        return jNextLong + ((long) i11);
    }
}
