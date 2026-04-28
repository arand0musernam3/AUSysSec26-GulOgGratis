package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ub.a f14253f;

    public l1(String str, String str2, String str3, String str4, int i11, ub.a aVar) {
        if (str == null) {
            c50.w.l("Null appIdentifier");
            throw null;
        }
        this.f14248a = str;
        if (str2 == null) {
            c50.w.l("Null versionCode");
            throw null;
        }
        this.f14249b = str2;
        if (str3 == null) {
            c50.w.l("Null versionName");
            throw null;
        }
        this.f14250c = str3;
        if (str4 == null) {
            c50.w.l("Null installUuid");
            throw null;
        }
        this.f14251d = str4;
        this.f14252e = i11;
        this.f14253f = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.f14248a.equals(l1Var.f14248a) && this.f14249b.equals(l1Var.f14249b) && this.f14250c.equals(l1Var.f14250c) && this.f14251d.equals(l1Var.f14251d) && this.f14252e == l1Var.f14252e && this.f14253f.equals(l1Var.f14253f);
    }

    public final int hashCode() {
        return ((((((((((this.f14248a.hashCode() ^ 1000003) * 1000003) ^ this.f14249b.hashCode()) * 1000003) ^ this.f14250c.hashCode()) * 1000003) ^ this.f14251d.hashCode()) * 1000003) ^ this.f14252e) * 1000003) ^ this.f14253f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f14248a + ", versionCode=" + this.f14249b + ", versionName=" + this.f14250c + ", installUuid=" + this.f14251d + ", deliveryMechanism=" + this.f14252e + ", developmentPlatformProvider=" + this.f14253f + "}";
    }
}
