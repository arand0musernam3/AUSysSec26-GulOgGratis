package d6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14501e;

    /* JADX WARN: Illegal instructions before constructor call */
    public j0(boolean z11, boolean z12, boolean z13, k0 k0Var, boolean z14) {
        m3.e0 e0Var = r.f14523a;
        int i11 = !z11 ? 262152 : 262144;
        i11 = k0Var == k0.SecureOn ? i11 | 8192 : i11;
        this(z14 ? i11 : i11 | 512, k0Var == k0.Inherit, z12, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f14497a == j0Var.f14497a && this.f14498b == j0Var.f14498b && this.f14499c == j0Var.f14499c && this.f14500d == j0Var.f14500d && this.f14501e == j0Var.f14501e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + r8.k.e(r8.k.e(r8.k.e(r8.k.e(this.f14497a * 31, 31, this.f14498b), 31, this.f14499c), 31, this.f14500d), 31, this.f14501e);
    }

    public j0(boolean z11, int i11) {
        this((i11 & 1) != 0 ? false : z11, true, true, k0.Inherit, (i11 & 8) != 0);
    }

    public j0(int i11) {
        this((i11 & 1) == 0, true, true, k0.Inherit, (i11 & 32) != 0);
    }

    public j0(int i11, boolean z11, boolean z12, boolean z13) {
        this.f14497a = i11;
        this.f14498b = z11;
        this.f14499c = z12;
        this.f14500d = z13;
        this.f14501e = true;
    }
}
