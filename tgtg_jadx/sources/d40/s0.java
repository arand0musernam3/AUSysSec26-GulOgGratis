package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14347d;

    public s0(long j9, long j11, String str, String str2) {
        this.f14344a = j9;
        this.f14345b = j11;
        this.f14346c = str;
        this.f14347d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            s0 s0Var = (s0) ((w1) obj);
            if (this.f14344a == s0Var.f14344a && this.f14345b == s0Var.f14345b && this.f14346c.equals(s0Var.f14346c)) {
                String str = s0Var.f14347d;
                String str2 = this.f14347d;
                if (str2 != null ? str2.equals(str) : str == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f14344a;
        long j11 = this.f14345b;
        int iHashCode = (((((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f14346c.hashCode()) * 1000003;
        String str = this.f14347d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f14344a);
        sb2.append(", size=");
        sb2.append(this.f14345b);
        sb2.append(", name=");
        sb2.append(this.f14346c);
        sb2.append(", uuid=");
        return r8.k.p(sb2, this.f14347d, "}");
    }
}
