package g4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19936a;

    public static String a(int i11) {
        return i11 == 1 ? "Next" : i11 == 2 ? "Previous" : i11 == 3 ? "Left" : i11 == 4 ? "Right" : i11 == 5 ? "Up" : i11 == 6 ? "Down" : i11 == 7 ? "Enter" : i11 == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f19936a == ((f) obj).f19936a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19936a);
    }

    public final String toString() {
        return a(this.f19936a);
    }
}
