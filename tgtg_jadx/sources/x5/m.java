package x5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43857a;

    public static String a(int i11) {
        return i11 == 1 ? "Ltr" : i11 == 2 ? "Rtl" : i11 == 3 ? "Content" : i11 == 4 ? "ContentOrLtr" : i11 == 5 ? "ContentOrRtl" : i11 == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f43857a == ((m) obj).f43857a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43857a);
    }

    public final String toString() {
        return a(this.f43857a);
    }
}
