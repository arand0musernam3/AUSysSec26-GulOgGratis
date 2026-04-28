package st;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f39278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f39279b;

    public b(double d3, double d11) {
        this.f39278a = d3;
        this.f39279b = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Double.compare(this.f39278a, bVar.f39278a) == 0 && Double.compare(this.f39279b, bVar.f39279b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f39279b) + (Double.hashCode(this.f39278a) * 31);
    }

    public final String toString() {
        return "MyLatLng(latitude=" + this.f39278a + ", longitude=" + this.f39279b + ")";
    }
}
