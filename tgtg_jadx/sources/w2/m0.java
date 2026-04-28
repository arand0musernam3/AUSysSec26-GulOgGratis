package w2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f42983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1 f42984b;

    public m0(t1 t1Var, t1 t1Var2) {
        this.f42983a = t1Var;
        this.f42984b = t1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f42983a == m0Var.f42983a && this.f42984b == m0Var.f42984b;
    }

    public final int hashCode() {
        return this.f42984b.hashCode() + (this.f42983a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.f42983a + ", endAffinity=" + this.f42984b + ')';
    }
}
