package d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends b4.s implements b5.g2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f13869o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13870p;

    @Override // b5.g2
    public final Object b(z5.c cVar, Object obj) {
        g2 g2Var = obj instanceof g2 ? (g2) obj : null;
        if (g2Var == null) {
            g2Var = new g2();
        }
        g2Var.f13793a = this.f13869o;
        g2Var.f13794b = this.f13870p;
        return g2Var;
    }
}
