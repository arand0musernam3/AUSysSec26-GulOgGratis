package e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15354a;

    public final boolean equals(Object obj) {
        if (obj instanceof i0) {
            return this.f15354a == ((i0) obj).f15354a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15354a);
    }

    public final String toString() {
        int i11 = this.f15354a;
        return i11 == 1 ? "SUPPORTED" : i11 == 2 ? "UNSUPPORTED" : "UNKNOWN";
    }
}
