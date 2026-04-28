package w8;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements LifecycleOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lifecycle f43288a;

    public f(Lifecycle lifecycle) {
        this.f43288a = lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.f43288a;
    }
}
