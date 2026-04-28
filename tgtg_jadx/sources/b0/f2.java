package b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5180a;

    public final boolean equals(Object obj) {
        if (obj instanceof f2) {
            return this.f5180a == ((f2) obj).f5180a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5180a);
    }

    public final String toString() {
        return w.a0.l("TorchMode(value=", this.f5180a, ')');
    }
}
