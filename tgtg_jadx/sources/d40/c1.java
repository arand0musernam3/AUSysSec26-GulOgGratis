package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14113a;

    public c1(String str) {
        this.f14113a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        return this.f14113a.equals(((c1) ((f2) obj)).f14113a);
    }

    public final int hashCode() {
        return this.f14113a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return r8.k.p(new StringBuilder("Log{content="), this.f14113a, "}");
    }
}
