package w8;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements LifecycleOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f43280a = new f0(this, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Lifecycle.State f43281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Lifecycle.State f43282c;

    public a() {
        Lifecycle.State state = Lifecycle.State.INITIALIZED;
        this.f43281b = state;
        this.f43282c = state;
    }

    public final void a() {
        Lifecycle.State state = this.f43281b.ordinal() < this.f43282c.ordinal() ? this.f43281b : this.f43282c;
        f0 f0Var = this.f43280a;
        if (f0Var.f3435d == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
            return;
        }
        f0Var.i(state);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.f43280a;
    }
}
