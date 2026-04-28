package a40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f713c;

    public c(String str, String str2, String str3) {
        if (str == null) {
            c50.w.l("Null crashlyticsInstallId");
            throw null;
        }
        this.f711a = str;
        this.f712b = str2;
        this.f713c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f711a.equals(cVar.f711a)) {
                String str = cVar.f712b;
                String str2 = this.f712b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = cVar.f713c;
                    String str4 = this.f713c;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f711a.hashCode() ^ 1000003) * 1000003;
        String str = this.f712b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f713c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f711a);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f712b);
        sb2.append(", firebaseAuthenticationToken=");
        return r8.k.p(sb2, this.f713c, "}");
    }
}
