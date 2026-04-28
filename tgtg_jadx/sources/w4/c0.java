package w4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43114a;

    public /* synthetic */ c0(int i11) {
        this.f43114a = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            return this.f43114a == ((c0) obj).f43114a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43114a);
    }

    public final String toString() {
        return w.a0.l("PointerKeyboardModifiers(packedValue=", this.f43114a, ')');
    }
}
