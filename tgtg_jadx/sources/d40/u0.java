package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14370c;

    public u0(String str, String str2, long j9) {
        this.f14368a = str;
        this.f14369b = str2;
        this.f14370c = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            u0 u0Var = (u0) ((y1) obj);
            if (this.f14368a.equals(u0Var.f14368a) && this.f14369b.equals(u0Var.f14369b) && this.f14370c == u0Var.f14370c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f14368a.hashCode() ^ 1000003) * 1000003) ^ this.f14369b.hashCode()) * 1000003;
        long j9 = this.f14370c;
        return iHashCode ^ ((int) ((j9 >>> 32) ^ j9));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f14368a);
        sb2.append(", code=");
        sb2.append(this.f14369b);
        sb2.append(", address=");
        return w.a0.j(this.f14370c, "}", sb2);
    }
}
