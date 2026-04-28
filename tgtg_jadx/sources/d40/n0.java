package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f14286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f14290i;

    public n0(int i11, String str, int i12, long j9, long j11, boolean z11, int i13, String str2, String str3) {
        this.f14282a = i11;
        this.f14283b = str;
        this.f14284c = i12;
        this.f14285d = j9;
        this.f14286e = j11;
        this.f14287f = z11;
        this.f14288g = i13;
        this.f14289h = str2;
        this.f14290i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            n0 n0Var = (n0) ((v1) obj);
            if (this.f14282a == n0Var.f14282a && this.f14283b.equals(n0Var.f14283b) && this.f14284c == n0Var.f14284c && this.f14285d == n0Var.f14285d && this.f14286e == n0Var.f14286e && this.f14287f == n0Var.f14287f && this.f14288g == n0Var.f14288g && this.f14289h.equals(n0Var.f14289h) && this.f14290i.equals(n0Var.f14290i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f14282a ^ 1000003) * 1000003) ^ this.f14283b.hashCode()) * 1000003) ^ this.f14284c) * 1000003;
        long j9 = this.f14285d;
        int i11 = (iHashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j11 = this.f14286e;
        return ((((((((i11 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f14287f ? 1231 : 1237)) * 1000003) ^ this.f14288g) * 1000003) ^ this.f14289h.hashCode()) * 1000003) ^ this.f14290i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f14282a);
        sb2.append(", model=");
        sb2.append(this.f14283b);
        sb2.append(", cores=");
        sb2.append(this.f14284c);
        sb2.append(", ram=");
        sb2.append(this.f14285d);
        sb2.append(", diskSpace=");
        sb2.append(this.f14286e);
        sb2.append(", simulator=");
        sb2.append(this.f14287f);
        sb2.append(", state=");
        sb2.append(this.f14288g);
        sb2.append(", manufacturer=");
        sb2.append(this.f14289h);
        sb2.append(", modelClass=");
        return r8.k.p(sb2, this.f14290i, "}");
    }
}
