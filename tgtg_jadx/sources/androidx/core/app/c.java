package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f2578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2580d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2581e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2582f = false;

    public c(Activity activity) {
        this.f2578b = activity;
        this.f2579c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f2578b == activity) {
            this.f2578b = null;
            this.f2581e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f2581e || this.f2582f || this.f2580d) {
            return;
        }
        Object obj = this.f2577a;
        try {
            Object obj2 = d.f2585c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f2579c) {
                d.f2589g.postAtFrontOfQueue(new x0.f(2, d.f2584b.get(activity), obj2));
                this.f2582f = true;
                this.f2577a = null;
            }
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f2578b == activity) {
            this.f2580d = true;
        }
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
