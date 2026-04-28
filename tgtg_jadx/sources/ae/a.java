package ae;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import fd.t;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f1238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f1239b;

    public a(c cVar, t tVar) {
        this.f1239b = cVar;
        fd.q qVar = tVar.f17595a;
        fd.j jVar = fd.p.f17575a;
        Object obj = qVar.f17580b.f39986n.f17570a.get(fd.p.f17578d);
        this.f1238a = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
    }

    public final void a(Context context) {
        long j9;
        double d3 = this.f1238a;
        if (d3 == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        c cVar = this.f1239b;
        t tVar = (t) ((WeakReference) cVar.f1243b).get();
        if (tVar == null) {
            cVar.l();
            return;
        }
        od.d dVarD = tVar.d();
        if (dVarD != null) {
            synchronized (dVarD.f32436c) {
                j9 = dVarD.f32434a.f8718a;
            }
            dVarD.a((long) (d3 * j9));
        }
    }

    public final void b(Context context) {
        long j9;
        if (this.f1238a == 1.0d) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        c cVar = this.f1239b;
        t tVar = (t) ((WeakReference) cVar.f1243b).get();
        if (tVar == null) {
            cVar.l();
            return;
        }
        od.d dVarD = tVar.d();
        if (dVarD != null) {
            synchronized (dVarD.f32436c) {
                j9 = dVarD.f32434a.f8718a;
            }
            dVarD.a(j9);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
