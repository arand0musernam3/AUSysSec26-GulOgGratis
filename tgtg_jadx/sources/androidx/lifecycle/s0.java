package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends j {
    final /* synthetic */ t0 this$0;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class a extends j {
        final /* synthetic */ t0 this$0;

        public a(t0 t0Var) {
            this.this$0 = t0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            t0 t0Var = this.this$0;
            int i11 = t0Var.f3513a + 1;
            t0Var.f3513a = i11;
            if (i11 == 1 && t0Var.f3516d) {
                t0Var.f3518f.g(w.ON_START);
                t0Var.f3516d = false;
            }
        }
    }

    public s0(t0 t0Var) {
        this.this$0 = t0Var;
    }

    @Override // androidx.lifecycle.j, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i11 = a1.f3413b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((a1) fragmentFindFragmentByTag).f3414a = this.this$0.f3520h;
        }
    }

    @Override // androidx.lifecycle.j, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        t0 t0Var = this.this$0;
        int i11 = t0Var.f3514b - 1;
        t0Var.f3514b = i11;
        if (i11 == 0) {
            Handler handler = t0Var.f3517e;
            handler.getClass();
            handler.postDelayed(t0Var.f3519g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        r0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.j, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        t0 t0Var = this.this$0;
        int i11 = t0Var.f3513a - 1;
        t0Var.f3513a = i11;
        if (i11 == 0 && t0Var.f3515c) {
            t0Var.f3518f.g(w.ON_STOP);
            t0Var.f3516d = true;
        }
    }
}
