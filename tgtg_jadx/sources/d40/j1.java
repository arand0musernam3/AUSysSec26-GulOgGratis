package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14225a;

    public j1(String str) {
        this.f14225a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        return this.f14225a.equals(((j1) ((l2) obj)).f14225a);
    }

    public final int hashCode() {
        return this.f14225a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return r8.k.p(new StringBuilder("User{identifier="), this.f14225a, "}");
    }
}
