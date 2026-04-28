package x5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43865a;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f43865a == ((r) obj).f43865a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43865a);
    }

    public final String toString() {
        int i11 = this.f43865a;
        return i11 == 1 ? "Linearity.Linear" : i11 == 2 ? "Linearity.FontHinting" : i11 == 3 ? "Linearity.None" : "Invalid";
    }
}
