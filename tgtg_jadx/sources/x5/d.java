package x5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43839a;

    public static String a(int i11) {
        return i11 == 1 ? "Hyphens.None" : i11 == 2 ? "Hyphens.Auto" : i11 == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f43839a == ((d) obj).f43839a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43839a);
    }

    public final String toString() {
        return a(this.f43839a);
    }
}
