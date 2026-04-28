package zc;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.d0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends Lifecycle {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f47439b = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f47440c = new g();

    @Override // androidx.lifecycle.Lifecycle
    public final void a(d0 d0Var) {
        if (!(d0Var instanceof androidx.lifecycle.h)) {
            wy.o.g(d0Var, " must implement androidx.lifecycle.DefaultLifecycleObserver.");
            return;
        }
        androidx.lifecycle.h hVar = (androidx.lifecycle.h) d0Var;
        g gVar = f47440c;
        hVar.onCreate(gVar);
        hVar.onStart(gVar);
        hVar.onResume(gVar);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State b() {
        return Lifecycle.State.RESUMED;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void d(d0 d0Var) {
    }
}
