package s0;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f38459a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f38460b;

    public v1(w1 w1Var) {
        this.f38460b = w1Var;
    }

    @Override // s0.w1
    public final void a(z1 z1Var, x1 x1Var) {
        if (this.f38459a.get()) {
            return;
        }
        this.f38460b.a(z1Var, x1Var);
    }

    public final void b() {
        this.f38459a.set(true);
    }
}
