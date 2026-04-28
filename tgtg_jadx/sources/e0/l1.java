package e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15365a;

    public final boolean equals(Object obj) {
        if (obj instanceof l1) {
            return this.f15365a == ((l1) obj).f15365a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15365a);
    }

    public final String toString() {
        return "RequestNumber(value=" + this.f15365a + ')';
    }
}
