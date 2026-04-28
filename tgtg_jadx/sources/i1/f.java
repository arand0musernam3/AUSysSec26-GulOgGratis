package i1;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.d0;
import androidx.lifecycle.q0;
import androidx.lifecycle.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f22770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LifecycleOwner f22771b;

    public f(LifecycleOwner lifecycleOwner, g gVar) {
        this.f22771b = lifecycleOwner;
        this.f22770a = gVar;
    }

    @q0(w.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        this.f22770a.l(lifecycleOwner);
    }

    @q0(w.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        this.f22770a.g(lifecycleOwner);
    }

    @q0(w.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        this.f22770a.h(lifecycleOwner);
    }
}
