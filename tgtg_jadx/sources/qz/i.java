package qz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37354a;

    public i(j jVar) {
        this.f37354a = jVar;
    }

    public static j b(Activity activity) {
        q0 q0Var;
        r0 r0Var;
        com.google.android.gms.common.internal.i0.i(activity, "Activity must not be null");
        if (!(activity instanceof androidx.fragment.app.o0)) {
            WeakHashMap weakHashMap = q0.f37384b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (q0Var = (q0) weakReference.get()) != null) {
                return q0Var;
            }
            try {
                q0 q0Var2 = (q0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (q0Var2 == null || q0Var2.isRemoving()) {
                    q0Var2 = new q0();
                    activity.getFragmentManager().beginTransaction().add(q0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(q0Var2));
                return q0Var2;
            } catch (ClassCastException e5) {
                wy.o.k("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e5);
                return null;
            }
        }
        androidx.fragment.app.o0 o0Var = (androidx.fragment.app.o0) activity;
        WeakHashMap weakHashMap2 = r0.f37386b;
        FragmentManager supportFragmentManager = o0Var.getSupportFragmentManager();
        WeakHashMap weakHashMap3 = r0.f37386b;
        WeakReference weakReference2 = (WeakReference) weakHashMap3.get(o0Var);
        if (weakReference2 != null && (r0Var = (r0) weakReference2.get()) != null) {
            return r0Var;
        }
        try {
            r0 r0Var2 = (r0) supportFragmentManager.findFragmentByTag("SLifecycleFragmentImpl");
            if (r0Var2 == null || r0Var2.isRemoving()) {
                r0Var2 = new r0();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.e(0, r0Var2, "SLifecycleFragmentImpl", 1);
                aVar.i(true, true);
            }
            weakHashMap3.put(o0Var, new WeakReference(r0Var2));
            return r0Var2;
        } catch (ClassCastException e11) {
            wy.o.k("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e11);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qz.j] */
    public final Activity a() {
        Activity activityE = this.f37354a.e();
        com.google.android.gms.common.internal.i0.h(activityE);
        return activityE;
    }

    public abstract void h();

    public void e() {
    }

    public void g() {
    }

    public void d(Bundle bundle) {
    }

    public void f(Bundle bundle) {
    }

    public void c(int i11, int i12, Intent intent) {
    }
}
