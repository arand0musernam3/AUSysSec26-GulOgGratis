package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f14240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f14241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1 f14242c;

    public k1(l1 l1Var, n1 n1Var, m1 m1Var) {
        this.f14240a = l1Var;
        this.f14241b = n1Var;
        this.f14242c = m1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return this.f14240a.equals(k1Var.f14240a) && this.f14241b.equals(k1Var.f14241b) && this.f14242c.equals(k1Var.f14242c);
    }

    public final int hashCode() {
        return ((((this.f14240a.hashCode() ^ 1000003) * 1000003) ^ this.f14241b.hashCode()) * 1000003) ^ this.f14242c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f14240a + ", osData=" + this.f14241b + ", deviceData=" + this.f14242c + "}";
    }
}
