package r5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37695a;

    public static String a(int i11) {
        return i11 == -1 ? "Unspecified" : i11 == 0 ? "None" : i11 == 1 ? "Characters" : i11 == 2 ? "Words" : i11 == 3 ? "Sentences" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f37695a == ((n) obj).f37695a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37695a);
    }

    public final String toString() {
        return a(this.f37695a);
    }
}
