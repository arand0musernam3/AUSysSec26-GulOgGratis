package s0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38367a;

    public k(Object obj) {
        this.f38367a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return this.f38367a.equals(((k) obj).f38367a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38367a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.f38367a + "}";
    }
}
