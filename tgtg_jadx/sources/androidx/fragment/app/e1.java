package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements androidx.lifecycle.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f3180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f3181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f3182c;

    public e1(FragmentManager fragmentManager, s1 s1Var, Lifecycle lifecycle) {
        this.f3182c = fragmentManager;
        this.f3180a = s1Var;
        this.f3181b = lifecycle;
    }

    @Override // androidx.lifecycle.c0
    public final void onStateChanged(LifecycleOwner lifecycleOwner, androidx.lifecycle.w wVar) {
        Bundle bundle;
        FragmentManager fragmentManager = this.f3182c;
        Map map = fragmentManager.f3118m;
        if (wVar == androidx.lifecycle.w.ON_START && (bundle = (Bundle) map.get("cookies_v2_result")) != null) {
            this.f3180a.h(bundle);
            map.remove("cookies_v2_result");
            if (FragmentManager.L(2)) {
                Log.v("FragmentManager", "Clearing fragment result with key cookies_v2_result");
            }
        }
        if (wVar == androidx.lifecycle.w.ON_DESTROY) {
            this.f3181b.d(this);
            fragmentManager.f3119n.remove("cookies_v2_result");
        }
    }
}
