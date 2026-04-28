package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Lifecycle.State f3429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c0 f3430b;

    public final void a(LifecycleOwner lifecycleOwner, w wVar) {
        Lifecycle.State stateA = wVar.a();
        Lifecycle.State state = this.f3429a;
        state.getClass();
        if (stateA != null && stateA.compareTo(state) < 0) {
            state = stateA;
        }
        this.f3429a = state;
        this.f3430b.onStateChanged(lifecycleOwner, wVar);
        this.f3429a = stateA;
    }
}
