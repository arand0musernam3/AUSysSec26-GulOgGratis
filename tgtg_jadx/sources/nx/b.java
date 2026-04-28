package nx;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import ax.a0;
import ax.m0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import tx.c0;
import tx.f0;
import tx.n0;
import tx.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31412a;

    public /* synthetic */ b(int i11) {
        this.f31412a = i11;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i11 = this.f31412a;
        activity.getClass();
        switch (i11) {
            case 0:
                l50.a aVar = f0.f40508d;
                l50.a.z(m0.APP_EVENTS, c.f31413a, "onActivityCreated");
                c.f31414b.execute(new bx.c(14));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i11 = this.f31412a;
        activity.getClass();
        switch (i11) {
            case 0:
                l50.a aVar = f0.f40508d;
                l50.a.z(m0.APP_EVENTS, c.f31413a, "onActivityDestroyed");
                ex.d dVar = ex.d.f16511a;
                Set set = yx.a.f46339a;
                if (!set.contains(ex.d.class)) {
                    try {
                        ex.g gVarA = ex.g.f16525f.a();
                        if (!set.contains(gVarA)) {
                            try {
                                gVarA.f16531e.remove(Integer.valueOf(activity.hashCode()));
                            } catch (Throwable th2) {
                                yx.a.a(gVarA, th2);
                            }
                        }
                    } catch (Throwable th3) {
                        yx.a.a(ex.d.class, th3);
                        return;
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i11 = this.f31412a;
        activity.getClass();
        switch (i11) {
            case 0:
                l50.a aVar = f0.f40508d;
                m0 m0Var = m0.APP_EVENTS;
                String str = c.f31413a;
                l50.a.z(m0Var, str, "onActivityPaused");
                AtomicInteger atomicInteger = c.f31418f;
                int i12 = 0;
                if (atomicInteger.decrementAndGet() < 0) {
                    atomicInteger.set(0);
                    Log.w(str, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
                }
                c.a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strK = n0.k(activity);
                ex.d dVar = ex.d.f16511a;
                Set set = yx.a.f46339a;
                if (!set.contains(ex.d.class)) {
                    try {
                        if (ex.d.f16516f.get()) {
                            ex.g.f16525f.a().c(activity);
                            ex.j jVar = ex.d.f16514d;
                            if (jVar != null && !set.contains(jVar)) {
                                try {
                                    if (((Activity) jVar.f16547b.get()) != null) {
                                        try {
                                            Timer timer = jVar.f16548c;
                                            if (timer != null) {
                                                timer.cancel();
                                            }
                                            jVar.f16548c = null;
                                        } catch (Exception e5) {
                                            Log.e(ex.j.f16545e, "Error unscheduling indexing job", e5);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    yx.a.a(jVar, th2);
                                }
                            }
                            SensorManager sensorManager = ex.d.f16513c;
                            if (sensorManager != null) {
                                sensorManager.unregisterListener(ex.d.f16512b);
                            }
                            break;
                        }
                    } catch (Throwable th3) {
                        yx.a.a(ex.d.class, th3);
                    }
                }
                c.f31414b.execute(new a(i12, jCurrentTimeMillis, strK));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i11 = this.f31412a;
        activity.getClass();
        switch (i11) {
            case 0:
                l50.a aVar = f0.f40508d;
                l50.a.z(m0.APP_EVENTS, c.f31413a, "onActivityResumed");
                c.l = new WeakReference(activity);
                c.f31418f.incrementAndGet();
                c.a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                c.f31422j = jCurrentTimeMillis;
                String strK = n0.k(activity);
                ex.k kVar = ex.d.f16512b;
                ex.d dVar = ex.d.f16511a;
                Set set = yx.a.f46339a;
                if (!set.contains(ex.d.class)) {
                    try {
                        if (ex.d.f16516f.get()) {
                            ex.g.f16525f.a().a(activity);
                            Context applicationContext = activity.getApplicationContext();
                            String strB = a0.b();
                            z zVarB = c0.b(strB);
                            if (zVarB == null || !zVarB.f40591i) {
                                set.contains(dVar);
                            } else {
                                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                                if (sensorManager != null) {
                                    ex.d.f16513c = sensorManager;
                                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                                    ex.j jVar = new ex.j(activity);
                                    ex.d.f16514d = jVar;
                                    a50.d dVar2 = new a50.d(zVarB, 14, strB);
                                    if (!set.contains(kVar)) {
                                        try {
                                            kVar.f16550a = dVar2;
                                        } catch (Throwable th2) {
                                            yx.a.a(kVar, th2);
                                        }
                                    }
                                    sensorManager.registerListener(kVar, defaultSensor, 2);
                                    if (zVarB.f40591i) {
                                        jVar.c();
                                    }
                                    break;
                                }
                            }
                            yx.a.f46339a.contains(dVar);
                            break;
                        }
                    } catch (Throwable th3) {
                        yx.a.a(ex.d.class, th3);
                    }
                }
                if (!yx.a.f46339a.contains(cx.a.class)) {
                    try {
                        if (cx.a.f13459b) {
                            CopyOnWriteArraySet copyOnWriteArraySet = cx.c.f13461d;
                            if (!new HashSet(cx.c.a()).isEmpty()) {
                                HashMap map = cx.d.f13465e;
                                cx.a.b(activity);
                                break;
                            }
                        }
                    } catch (Exception unused) {
                    } catch (Throwable th4) {
                        yx.a.a(cx.a.class, th4);
                    }
                }
                rx.d.d(activity);
                String str = c.f31424m;
                if (str != null && StringsKt.z(str, "ProxyBillingActivity", false) && !Intrinsics.areEqual(strK, "ProxyBillingActivity")) {
                    c.f31415c.execute(new bx.c(13));
                }
                c.f31414b.execute(new b0.d(activity.getApplicationContext(), strK, jCurrentTimeMillis));
                c.f31424m = strK;
                break;
            default:
                h hVarA = h.f31434b.a();
                if (hVarA != null) {
                    hVarA.b(activity);
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i11 = this.f31412a;
        activity.getClass();
        bundle.getClass();
        switch (i11) {
            case 0:
                l50.a aVar = f0.f40508d;
                l50.a.z(m0.APP_EVENTS, c.f31413a, "onActivitySaveInstanceState");
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i11 = this.f31412a;
        activity.getClass();
        switch (i11) {
            case 0:
                c.f31423k++;
                l50.a aVar = f0.f40508d;
                l50.a.z(m0.APP_EVENTS, c.f31413a, "onActivityStarted");
                break;
            default:
                h hVarA = h.f31434b.a();
                if (hVarA != null) {
                    hVarA.b(activity);
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i11 = this.f31412a;
        activity.getClass();
        switch (i11) {
            case 0:
                l50.a aVar = f0.f40508d;
                l50.a.z(m0.APP_EVENTS, c.f31413a, "onActivityStopped");
                String str = bx.m.f6734c;
                se.b bVar = bx.j.f6723a;
                if (!yx.a.f46339a.contains(bx.j.class)) {
                    try {
                        bx.j.f6724b.execute(new bx.c(2));
                    } catch (Throwable th2) {
                        yx.a.a(bx.j.class, th2);
                    }
                }
                c.f31423k--;
                break;
        }
    }
}
