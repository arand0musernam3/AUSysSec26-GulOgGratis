package m5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29574a;

    public static String a(int i11) {
        return i11 == 0 ? "EmojiSupportMatch.Default" : i11 == 1 ? "EmojiSupportMatch.None" : i11 == 2 ? "EmojiSupportMatch.All" : w.a0.l("Invalid(value=", i11, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f29574a == ((l) obj).f29574a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29574a);
    }

    public final String toString() {
        return a(this.f29574a);
    }
}
