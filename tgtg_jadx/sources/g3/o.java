package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19196d;

    public o(long j9, long j11, long j12, long j13) {
        this.f19193a = j9;
        this.f19194b = j11;
        this.f19195c = j12;
        this.f19196d = j13;
    }

    public final o a(long j9, long j11, long j12, long j13) {
        if (j9 == 16) {
            j9 = this.f19193a;
        }
        return new o(j9, j11 != 16 ? j11 : this.f19194b, j12 != 16 ? j12 : this.f19195c, j13 != 16 ? j13 : this.f19196d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return i4.v.c(this.f19193a, oVar.f19193a) && i4.v.c(this.f19194b, oVar.f19194b) && i4.v.c(this.f19195c, oVar.f19195c) && i4.v.c(this.f19196d, oVar.f19196d);
    }

    public final int hashCode() {
        int i11 = i4.v.f23316i;
        u70.b0 b0Var = u70.c0.f40833b;
        return Long.hashCode(this.f19196d) + e0.f.b(e0.f.b(Long.hashCode(this.f19193a) * 31, 31, this.f19194b), 31, this.f19195c);
    }
}
