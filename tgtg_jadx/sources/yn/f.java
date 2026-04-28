package yn;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46283a;

    public f(int i11) {
        this.f46283a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f46283a == ((f) obj).f46283a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f46283a);
    }

    public final String toString() {
        return r8.k.h(this.f46283a, "Secondary(numberOfOrders=", ")");
    }
}
