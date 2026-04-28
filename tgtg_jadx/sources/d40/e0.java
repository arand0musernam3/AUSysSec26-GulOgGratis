package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14145c;

    public e0(String str, String str2, String str3) {
        this.f14143a = str;
        this.f14144b = str2;
        this.f14145c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1) {
            e0 e0Var = (e0) ((o1) obj);
            if (this.f14143a.equals(e0Var.f14143a) && this.f14144b.equals(e0Var.f14144b) && this.f14145c.equals(e0Var.f14145c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f14143a.hashCode() ^ 1000003) * 1000003) ^ this.f14144b.hashCode()) * 1000003) ^ this.f14145c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f14143a);
        sb2.append(", libraryName=");
        sb2.append(this.f14144b);
        sb2.append(", buildId=");
        return r8.k.p(sb2, this.f14145c, "}");
    }
}
