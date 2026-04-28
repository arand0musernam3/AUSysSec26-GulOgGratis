package x5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43847a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f43847a == ((h) obj).f43847a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43847a);
    }

    public final String toString() {
        int i11 = this.f43847a;
        return i11 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i11 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i11 == 17 ? "LineHeightStyle.Trim.Both" : i11 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
