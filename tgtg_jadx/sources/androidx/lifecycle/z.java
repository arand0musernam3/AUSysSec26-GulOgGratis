package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends x implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lifecycle f3550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f3551b;

    public z(Lifecycle lifecycle, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.f3550a = lifecycle;
        this.f3551b = coroutineContext;
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            v80.f0.i(coroutineContext, null);
        }
    }

    @Override // v80.b0
    public final CoroutineContext getCoroutineContext() {
        return this.f3551b;
    }

    @Override // androidx.lifecycle.c0
    public final void onStateChanged(LifecycleOwner lifecycleOwner, w wVar) {
        Lifecycle lifecycle = this.f3550a;
        if (lifecycle.b().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            lifecycle.d(this);
            v80.f0.i(this.f3551b, null);
        }
    }
}
