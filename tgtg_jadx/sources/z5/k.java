package z5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f47281e = new k(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47285d;

    public k(int i11, int i12, int i13, int i14) {
        this.f47282a = i11;
        this.f47283b = i12;
        this.f47284c = i13;
        this.f47285d = i14;
    }

    public final long a() {
        int iD = (d() / 2) + this.f47282a;
        return (((long) ((b() / 2) + this.f47283b)) & 4294967295L) | (((long) iD) << 32);
    }

    public final int b() {
        return this.f47285d - this.f47283b;
    }

    public final long c() {
        return (((long) this.f47282a) << 32) | (((long) this.f47283b) & 4294967295L);
    }

    public final int d() {
        return this.f47284c - this.f47282a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f47282a == kVar.f47282a && this.f47283b == kVar.f47283b && this.f47284c == kVar.f47284c && this.f47285d == kVar.f47285d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f47285d) + r8.k.b(this.f47284c, r8.k.b(this.f47283b, Integer.hashCode(this.f47282a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f47282a);
        sb2.append(", ");
        sb2.append(this.f47283b);
        sb2.append(", ");
        sb2.append(this.f47284c);
        sb2.append(", ");
        return r8.k.o(sb2, this.f47285d, ')');
    }
}
