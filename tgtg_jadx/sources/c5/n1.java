package c5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7298a;

    public /* synthetic */ n1(int i11) {
        this.f7298a = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n1) {
            return this.f7298a == ((n1) obj).f7298a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7298a);
    }

    public final String toString() {
        return w.a0.l("AutoClearFocusBehavior(value=", this.f7298a, ')');
    }
}
