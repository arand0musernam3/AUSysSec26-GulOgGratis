package w4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43126a;

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f43126a == ((i) obj).f43126a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f43126a);
    }

    public final String toString() {
        return "IndirectPointerEventData(packedValue=" + this.f43126a + ')';
    }
}
