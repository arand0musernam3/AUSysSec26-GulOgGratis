package a3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x5.j f366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f368c;

    public h0(x5.j jVar, int i11, long j9) {
        this.f366a = jVar;
        this.f367b = i11;
        this.f368c = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f366a == h0Var.f366a && this.f367b == h0Var.f367b && this.f368c == h0Var.f368c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f368c) + r8.k.b(this.f367b, this.f366a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnchorInfo(direction=");
        sb2.append(this.f366a);
        sb2.append(", offset=");
        sb2.append(this.f367b);
        sb2.append(", selectableId=");
        return w.a0.r(sb2, this.f368c, ')');
    }
}
