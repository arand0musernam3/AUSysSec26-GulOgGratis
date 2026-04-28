package q5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36035a;

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f36035a == ((o) obj).f36035a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36035a);
    }

    public final String toString() {
        int i11 = this.f36035a;
        return i11 == 0 ? "None" : i11 == 1 ? "Weight" : i11 == 2 ? "Style" : i11 == 65535 ? "All" : "Invalid";
    }
}
