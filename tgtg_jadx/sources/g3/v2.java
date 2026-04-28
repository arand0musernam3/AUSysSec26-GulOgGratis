package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f19618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f19619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f19620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f19621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f19622i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f19623j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f19624k;
    public final long l;

    public v2(long j9, long j11, long j12, long j13, long j14, long j15) {
        long j16 = i4.v.f23315h;
        this.f19614a = j9;
        this.f19615b = j11;
        this.f19616c = j12;
        this.f19617d = j13;
        this.f19618e = j14;
        this.f19619f = j15;
        this.f19620g = j16;
        this.f19621h = j16;
        this.f19622i = j16;
        this.f19623j = j16;
        this.f19624k = j16;
        this.l = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return i4.v.c(this.f19614a, v2Var.f19614a) && i4.v.c(this.f19620g, v2Var.f19620g) && i4.v.c(this.f19615b, v2Var.f19615b) && i4.v.c(this.f19616c, v2Var.f19616c) && i4.v.c(this.f19617d, v2Var.f19617d) && i4.v.c(this.f19618e, v2Var.f19618e) && i4.v.c(this.f19619f, v2Var.f19619f) && i4.v.c(this.f19621h, v2Var.f19621h) && i4.v.c(this.f19622i, v2Var.f19622i) && i4.v.c(this.f19623j, v2Var.f19623j) && i4.v.c(this.f19624k, v2Var.f19624k) && i4.v.c(this.l, v2Var.l);
    }

    public final int hashCode() {
        int i11 = i4.v.f23316i;
        u70.b0 b0Var = u70.c0.f40833b;
        return Long.hashCode(this.l) + e0.f.b(e0.f.b(e0.f.b(e0.f.b(e0.f.b(e0.f.b(e0.f.b(e0.f.b(e0.f.b(e0.f.b(Long.hashCode(this.f19614a) * 31, 31, this.f19620g), 31, this.f19615b), 31, this.f19616c), 31, this.f19617d), 31, this.f19618e), 31, this.f19619f), 31, this.f19621h), 31, this.f19622i), 31, this.f19623j), 31, this.f19624k);
    }
}
