package qa;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f36659a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f36660b;

    public d(ViewGroup viewGroup) {
        this.f36660b = viewGroup;
    }

    @Override // qa.z, qa.w
    public final void b() {
        s.g(this.f36660b, false);
    }

    @Override // qa.z, qa.w
    public final void c(y yVar) {
        if (!this.f36659a) {
            s.g(this.f36660b, false);
        }
        yVar.F(this);
    }

    @Override // qa.z, qa.w
    public final void f() {
        s.g(this.f36660b, true);
    }

    @Override // qa.z, qa.w
    public final void g(y yVar) {
        s.g(this.f36660b, false);
        this.f36659a = true;
    }
}
