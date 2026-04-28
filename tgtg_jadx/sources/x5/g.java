package x5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43846a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f43846a == ((g) obj).f43846a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43846a);
    }

    public final String toString() {
        int i11 = this.f43846a;
        return i11 == 0 ? "LineHeightStyle.Mode.Fixed" : i11 == 1 ? "LineHeightStyle.Mode.Minimum" : i11 == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
