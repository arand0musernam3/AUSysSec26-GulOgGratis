package ts;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40472a;

    public y(int i11) {
        this.f40472a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && this.f40472a == ((y) obj).f40472a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40472a);
    }

    public final String toString() {
        return r8.k.h(this.f40472a, "PageChanged(page=", ")");
    }
}
