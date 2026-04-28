package r5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37696a;

    public static String a(int i11) {
        return i11 == 0 ? "Unspecified" : i11 == 1 ? "Text" : i11 == 2 ? "Ascii" : i11 == 3 ? "Number" : i11 == 4 ? "Phone" : i11 == 5 ? "Uri" : i11 == 6 ? "Email" : i11 == 7 ? "Password" : i11 == 8 ? "NumberPassword" : i11 == 9 ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f37696a == ((o) obj).f37696a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37696a);
    }

    public final String toString() {
        return a(this.f37696a);
    }
}
