package sr;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39102d;

    public g(int i11, int i12, int i13, int i14) {
        this.f39099a = i11;
        this.f39100b = i12;
        this.f39101c = i13;
        this.f39102d = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f39099a == gVar.f39099a && this.f39100b == gVar.f39100b && this.f39101c == gVar.f39101c && this.f39102d == gVar.f39102d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39102d) + r8.k.b(this.f39101c, r8.k.b(this.f39100b, Integer.hashCode(this.f39099a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = r8.k.r(this.f39099a, this.f39100b, "PhotoAlertText(title=", ", message=", ", negative=");
        sbR.append(this.f39101c);
        sbR.append(", positive=");
        sbR.append(this.f39102d);
        sbR.append(")");
        return sbR.toString();
    }
}
