package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14239f;

    public k0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f14234a = str;
        this.f14235b = str2;
        this.f14236c = str3;
        this.f14237d = str4;
        this.f14238e = str5;
        this.f14239f = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            k0 k0Var = (k0) ((u1) obj);
            if (this.f14234a.equals(k0Var.f14234a) && this.f14235b.equals(k0Var.f14235b)) {
                String str = k0Var.f14236c;
                String str2 = this.f14236c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = k0Var.f14237d;
                    String str4 = this.f14237d;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = k0Var.f14238e;
                        String str6 = this.f14238e;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            String str7 = k0Var.f14239f;
                            String str8 = this.f14239f;
                            if (str8 != null ? str8.equals(str7) : str7 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f14234a.hashCode() ^ 1000003) * 1000003) ^ this.f14235b.hashCode()) * 1000003;
        String str = this.f14236c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f14237d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f14238e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f14239f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f14234a);
        sb2.append(", version=");
        sb2.append(this.f14235b);
        sb2.append(", displayVersion=");
        sb2.append(this.f14236c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.f14237d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f14238e);
        sb2.append(", developmentPlatformVersion=");
        return r8.k.p(sb2, this.f14239f, "}");
    }
}
