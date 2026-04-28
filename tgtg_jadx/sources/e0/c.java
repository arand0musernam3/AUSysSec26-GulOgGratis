package e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15322a;

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f15322a == ((c) obj).f15322a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15322a);
    }

    public final String toString() {
        return w.a0.l("AudioRestrictionMode(value=", this.f15322a, ')');
    }
}
