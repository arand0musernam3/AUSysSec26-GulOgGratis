package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends j0 implements c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LifecycleOwner f3453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k0 f3454f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, LifecycleOwner lifecycleOwner, p0 p0Var) {
        super(k0Var, p0Var);
        this.f3454f = k0Var;
        this.f3453e = lifecycleOwner;
    }

    @Override // androidx.lifecycle.j0
    public final void b() {
        this.f3453e.getLifecycle().d(this);
    }

    @Override // androidx.lifecycle.j0
    public final boolean c(LifecycleOwner lifecycleOwner) {
        return this.f3453e == lifecycleOwner;
    }

    @Override // androidx.lifecycle.j0
    public final boolean d() {
        return this.f3453e.getLifecycle().b().a(Lifecycle.State.STARTED);
    }

    @Override // androidx.lifecycle.c0
    public final void onStateChanged(LifecycleOwner lifecycleOwner, w wVar) {
        LifecycleOwner lifecycleOwner2 = this.f3453e;
        Lifecycle.State stateB = lifecycleOwner2.getLifecycle().b();
        if (stateB == Lifecycle.State.DESTROYED) {
            this.f3454f.j(this.f3460a);
            return;
        }
        Lifecycle.State state = null;
        while (state != stateB) {
            a(d());
            state = stateB;
            stateB = lifecycleOwner2.getLifecycle().b();
        }
    }
}
