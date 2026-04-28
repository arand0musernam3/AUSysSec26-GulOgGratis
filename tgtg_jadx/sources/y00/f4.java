package y00;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f4 extends a4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f44757d;

    public f4(l4 l4Var) {
        super(l4Var);
        this.f44586c.f44936r++;
    }

    public final void q() {
        if (this.f44757d) {
            return;
        }
        com.braze.h2.b("Not initialized");
    }

    public final void r() {
        if (this.f44757d) {
            com.braze.h2.b("Can't initialize twice");
            return;
        }
        s();
        this.f44586c.f44937s++;
        this.f44757d = true;
    }

    public abstract void s();
}
