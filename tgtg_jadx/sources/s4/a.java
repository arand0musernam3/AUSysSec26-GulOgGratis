package s4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38836a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f38836a == ((a) obj).f38836a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38836a);
    }

    public final String toString() {
        int i11 = this.f38836a;
        return i11 == 1 ? "Touch" : i11 == 2 ? "Keyboard" : "Error";
    }
}
