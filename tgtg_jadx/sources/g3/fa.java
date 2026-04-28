package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18633f;

    public fa(long j9, long j11, long j12, long j13, long j14, long j15) {
        this.f18628a = j9;
        this.f18629b = j11;
        this.f18630c = j12;
        this.f18631d = j13;
        this.f18632e = j14;
        this.f18633f = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fa)) {
            return false;
        }
        fa faVar = (fa) obj;
        return i4.v.c(this.f18628a, faVar.f18628a) && i4.v.c(this.f18629b, faVar.f18629b) && i4.v.c(this.f18630c, faVar.f18630c) && i4.v.c(this.f18631d, faVar.f18631d) && i4.v.c(this.f18632e, faVar.f18632e) && i4.v.c(this.f18633f, faVar.f18633f);
    }

    public final int hashCode() {
        int i11 = i4.v.f23316i;
        u70.b0 b0Var = u70.c0.f40833b;
        return Long.hashCode(this.f18633f) + e0.f.b(e0.f.b(e0.f.b(e0.f.b(Long.hashCode(this.f18628a) * 31, 31, this.f18629b), 31, this.f18630c), 31, this.f18631d), 31, this.f18632e);
    }
}
