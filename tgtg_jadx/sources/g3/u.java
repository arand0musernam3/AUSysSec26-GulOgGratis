package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19543d;

    public u(long j9, long j11, long j12, long j13) {
        this.f19540a = j9;
        this.f19541b = j11;
        this.f19542c = j12;
        this.f19543d = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return i4.v.c(this.f19540a, uVar.f19540a) && i4.v.c(this.f19541b, uVar.f19541b) && i4.v.c(this.f19542c, uVar.f19542c) && i4.v.c(this.f19543d, uVar.f19543d);
    }

    public final int hashCode() {
        int i11 = i4.v.f23316i;
        u70.b0 b0Var = u70.c0.f40833b;
        return Long.hashCode(this.f19543d) + e0.f.b(e0.f.b(Long.hashCode(this.f19540a) * 31, 31, this.f19541b), 31, this.f19542c);
    }
}
