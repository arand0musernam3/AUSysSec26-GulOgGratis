package y0;

import m0.i0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f44559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f44560b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i0 f44562d;

    public f(f fVar) {
        this.f44559a = fVar;
    }

    public final void a(i0 i0Var) {
        synchronized (this.f44560b) {
            this.f44561c = true;
            this.f44562d = i0Var;
        }
        f fVar = this.f44559a;
        if (fVar != null) {
            fVar.a(new mp.a(this, 22));
        } else {
            wd.a.r("ScreenFlashWrapper", "apply: screenFlash is null!");
            c();
        }
    }

    public final void b() {
        synchronized (this.f44560b) {
            try {
                if (this.f44561c) {
                    f fVar = this.f44559a;
                    if (fVar != null) {
                        fVar.b();
                    } else {
                        wd.a.r("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    wd.a.I("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.f44561c = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        synchronized (this.f44560b) {
            try {
                i0 i0Var = this.f44562d;
                if (i0Var != null) {
                    i0Var.j();
                }
                this.f44562d = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
