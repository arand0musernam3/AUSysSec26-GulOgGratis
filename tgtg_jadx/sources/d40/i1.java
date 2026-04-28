package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14201d;

    public i1(String str, int i11, String str2, boolean z11) {
        this.f14198a = i11;
        this.f14199b = str;
        this.f14200c = str2;
        this.f14201d = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k2) {
            i1 i1Var = (i1) ((k2) obj);
            if (this.f14198a == i1Var.f14198a && this.f14199b.equals(i1Var.f14199b) && this.f14200c.equals(i1Var.f14200c) && this.f14201d == i1Var.f14201d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f14198a ^ 1000003) * 1000003) ^ this.f14199b.hashCode()) * 1000003) ^ this.f14200c.hashCode()) * 1000003) ^ (this.f14201d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OperatingSystem{platform=");
        sb2.append(this.f14198a);
        sb2.append(", version=");
        sb2.append(this.f14199b);
        sb2.append(", buildVersion=");
        sb2.append(this.f14200c);
        sb2.append(", jailbroken=");
        return j4.s.o(sb2, this.f14201d, "}");
    }
}
