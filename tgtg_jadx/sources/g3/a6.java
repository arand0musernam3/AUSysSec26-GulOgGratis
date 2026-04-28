package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f18329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f18330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f18331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f18332j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f18333k;
    public final long l;

    public a6(long j9, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22) {
        this.f18323a = j9;
        this.f18324b = j11;
        this.f18325c = j12;
        this.f18326d = j13;
        this.f18327e = j14;
        this.f18328f = j15;
        this.f18329g = j16;
        this.f18330h = j17;
        this.f18331i = j18;
        this.f18332j = j19;
        this.f18333k = j21;
        this.l = j22;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a6.class != obj.getClass()) {
            return false;
        }
        a6 a6Var = (a6) obj;
        return i4.v.c(this.f18325c, a6Var.f18325c) && i4.v.c(this.f18324b, a6Var.f18324b) && i4.v.c(this.f18323a, a6Var.f18323a) && i4.v.c(this.f18328f, a6Var.f18328f) && i4.v.c(this.f18327e, a6Var.f18327e) && i4.v.c(this.f18326d, a6Var.f18326d) && i4.v.c(this.f18331i, a6Var.f18331i) && i4.v.c(this.f18330h, a6Var.f18330h) && i4.v.c(this.f18329g, a6Var.f18329g) && i4.v.c(this.l, a6Var.l) && i4.v.c(this.f18333k, a6Var.f18333k) && i4.v.c(this.f18332j, a6Var.f18332j);
    }

    public final int hashCode() {
        int i11 = i4.v.f23316i;
        u70.b0 b0Var = u70.c0.f40833b;
        return Long.hashCode(this.f18332j) + e0.f.b(e0.f.b(e0.f.b(e0.f.b(e0.f.b(e0.f.b(e0.f.b(e0.f.b(e0.f.b(e0.f.b(Long.hashCode(this.f18325c) * 31, 31, this.f18324b), 31, this.f18323a), 31, this.f18328f), 31, this.f18327e), 31, this.f18326d), 31, this.f18331i), 31, this.f18330h), 31, this.f18329g), 31, this.l), 31, this.f18333k);
    }
}
