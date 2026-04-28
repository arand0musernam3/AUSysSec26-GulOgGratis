package j5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24624a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f24624a == ((g) obj).f24624a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24624a);
    }

    public final String toString() {
        int i11 = this.f24624a;
        return i11 == 0 ? "Polite" : i11 == 1 ? "Assertive" : "Unknown";
    }
}
