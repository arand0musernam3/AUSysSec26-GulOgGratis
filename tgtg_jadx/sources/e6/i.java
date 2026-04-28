package e6;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f15776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f15777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f15778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15779d;

    public final void a(Runnable runnable, Executor executor) {
        n nVar = this.f15778c;
        if (nVar != null) {
            nVar.a(runnable, executor);
        }
    }

    public final boolean b(Object obj) {
        this.f15779d = true;
        l lVar = this.f15777b;
        boolean z11 = lVar != null && lVar.f15782b.k(obj);
        if (z11) {
            this.f15776a = null;
            this.f15777b = null;
            this.f15778c = null;
        }
        return z11;
    }

    public final void c() {
        this.f15779d = true;
        l lVar = this.f15777b;
        if (lVar == null || !lVar.f15782b.cancel(true)) {
            return;
        }
        this.f15776a = null;
        this.f15777b = null;
        this.f15778c = null;
    }

    public final boolean d(Throwable th2) {
        this.f15779d = true;
        l lVar = this.f15777b;
        boolean z11 = lVar != null && lVar.f15782b.l(th2);
        if (z11) {
            this.f15776a = null;
            this.f15777b = null;
            this.f15778c = null;
        }
        return z11;
    }

    public final void finalize() {
        n nVar;
        l lVar = this.f15777b;
        if (lVar != null && !lVar.f15782b.isDone()) {
            lVar.b(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f15776a, 1));
        }
        if (this.f15779d || (nVar = this.f15778c) == null) {
            return;
        }
        nVar.k(null);
    }
}
