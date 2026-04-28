package x5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43852a;

    public static String a(int i11) {
        return i11 == 1 ? "Left" : i11 == 2 ? "Right" : i11 == 3 ? "Center" : i11 == 4 ? "Justify" : i11 == 5 ? "Start" : i11 == 6 ? "End" : i11 == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f43852a == ((k) obj).f43852a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43852a);
    }

    public final String toString() {
        return a(this.f43852a);
    }
}
