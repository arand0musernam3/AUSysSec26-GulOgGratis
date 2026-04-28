package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14394e;

    public x0(long j9, String str, String str2, long j11, int i11) {
        this.f14390a = j9;
        this.f14391b = str;
        this.f14392c = str2;
        this.f14393d = j11;
        this.f14394e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z1) {
            x0 x0Var = (x0) ((z1) obj);
            if (this.f14390a == x0Var.f14390a && this.f14391b.equals(x0Var.f14391b)) {
                String str = x0Var.f14392c;
                String str2 = this.f14392c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f14393d == x0Var.f14393d && this.f14394e == x0Var.f14394e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f14390a;
        int iHashCode = (((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ this.f14391b.hashCode()) * 1000003;
        String str = this.f14392c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f14393d;
        return ((iHashCode2 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f14394e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f14390a);
        sb2.append(", symbol=");
        sb2.append(this.f14391b);
        sb2.append(", file=");
        sb2.append(this.f14392c);
        sb2.append(", offset=");
        sb2.append(this.f14393d);
        sb2.append(", importance=");
        return r8.k.i(this.f14394e, "}", sb2);
    }
}
