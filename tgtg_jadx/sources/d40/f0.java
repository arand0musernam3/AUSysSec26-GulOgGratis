package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14154b;

    public f0(String str, String str2) {
        this.f14153a = str;
        this.f14154b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        f0 f0Var = (f0) ((q1) obj);
        return this.f14153a.equals(f0Var.f14153a) && this.f14154b.equals(f0Var.f14154b);
    }

    public final int hashCode() {
        return ((this.f14153a.hashCode() ^ 1000003) * 1000003) ^ this.f14154b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f14153a);
        sb2.append(", value=");
        return r8.k.p(sb2, this.f14154b, "}");
    }
}
