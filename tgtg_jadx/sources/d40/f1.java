package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14156b;

    public f1(String str, String str2) {
        this.f14155a = str;
        this.f14156b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g2) {
            f1 f1Var = (f1) ((g2) obj);
            if (this.f14155a.equals(f1Var.f14155a) && this.f14156b.equals(f1Var.f14156b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f14155a.hashCode() ^ 1000003) * 1000003) ^ this.f14156b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f14155a);
        sb2.append(", variantId=");
        return r8.k.p(sb2, this.f14156b, "}");
    }
}
