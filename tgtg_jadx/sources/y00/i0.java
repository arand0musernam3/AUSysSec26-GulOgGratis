package y00;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i0 extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44850c;

    public i0(n1 n1Var) {
        super(n1Var);
        ((n1) this.f21216b).A++;
    }

    public final void q() {
        if (this.f44850c) {
            return;
        }
        com.braze.h2.b("Not initialized");
    }

    public final void r() {
        if (this.f44850c) {
            com.braze.h2.b("Can't initialize twice");
        } else {
            if (s()) {
                return;
            }
            ((n1) this.f21216b).C.incrementAndGet();
            this.f44850c = true;
        }
    }

    public abstract boolean s();
}
