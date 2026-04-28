package o30;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d1 extends j0 implements RunnableFuture {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile t0 f31868i;

    public d1(Callable callable) {
        this.f31868i = new c1(this, callable);
    }

    @Override // o30.j
    public final void e() {
        t0 t0Var;
        if (p() && (t0Var = this.f31868i) != null) {
            t0Var.c();
        }
        this.f31868i = null;
    }

    @Override // o30.j
    public final String l() {
        t0 t0Var = this.f31868i;
        if (t0Var == null) {
            return super.l();
        }
        return "task=[" + t0Var + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        t0 t0Var = this.f31868i;
        if (t0Var != null) {
            t0Var.run();
        }
        this.f31868i = null;
    }
}
