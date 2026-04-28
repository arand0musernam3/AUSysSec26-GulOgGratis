package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f14094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f14098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f14099f;

    public b1(Double d3, int i11, boolean z11, int i12, long j9, long j11) {
        this.f14094a = d3;
        this.f14095b = i11;
        this.f14096c = z11;
        this.f14097d = i12;
        this.f14098e = j9;
        this.f14099f = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2) {
            e2 e2Var = (e2) obj;
            Double d3 = this.f14094a;
            if (d3 != null ? d3.equals(((b1) e2Var).f14094a) : ((b1) e2Var).f14094a == null) {
                b1 b1Var = (b1) e2Var;
                if (this.f14095b == b1Var.f14095b && this.f14096c == b1Var.f14096c && this.f14097d == b1Var.f14097d && this.f14098e == b1Var.f14098e && this.f14099f == b1Var.f14099f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d3 = this.f14094a;
        int iHashCode = ((((((((d3 == null ? 0 : d3.hashCode()) ^ 1000003) * 1000003) ^ this.f14095b) * 1000003) ^ (this.f14096c ? 1231 : 1237)) * 1000003) ^ this.f14097d) * 1000003;
        long j9 = this.f14098e;
        long j11 = this.f14099f;
        return ((iHashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f14094a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f14095b);
        sb2.append(", proximityOn=");
        sb2.append(this.f14096c);
        sb2.append(", orientation=");
        sb2.append(this.f14097d);
        sb2.append(", ramUsed=");
        sb2.append(this.f14098e);
        sb2.append(", diskUsed=");
        return w.a0.j(this.f14099f, "}", sb2);
    }
}
