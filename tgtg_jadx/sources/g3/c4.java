package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f18414g;

    public c4(long j9, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f18408a = j9;
        this.f18409b = j11;
        this.f18410c = j12;
        this.f18411d = j13;
        this.f18412e = j14;
        this.f18413f = j15;
        this.f18414g = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj;
        return i4.v.c(this.f18408a, c4Var.f18408a) && i4.v.c(this.f18411d, c4Var.f18411d) && i4.v.c(this.f18409b, c4Var.f18409b) && i4.v.c(this.f18412e, c4Var.f18412e) && i4.v.c(this.f18410c, c4Var.f18410c) && i4.v.c(this.f18413f, c4Var.f18413f) && i4.v.c(this.f18414g, c4Var.f18414g);
    }

    public final int hashCode() {
        int i11 = i4.v.f23316i;
        u70.b0 b0Var = u70.c0.f40833b;
        return Long.hashCode(this.f18414g) + e0.f.b(e0.f.b(e0.f.b(e0.f.b(e0.f.b(Long.hashCode(this.f18408a) * 31, 31, this.f18411d), 31, this.f18409b), 31, this.f18412e), 31, this.f18410c), 31, this.f18413f);
    }
}
