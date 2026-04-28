package d40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends n2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f14088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f14090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f14091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m2 f14092k;
    public final s1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p1 f14093m;

    public b0(String str, String str2, int i11, String str3, String str4, String str5, String str6, String str7, String str8, m2 m2Var, s1 s1Var, p1 p1Var) {
        this.f14083b = str;
        this.f14084c = str2;
        this.f14085d = i11;
        this.f14086e = str3;
        this.f14087f = str4;
        this.f14088g = str5;
        this.f14089h = str6;
        this.f14090i = str7;
        this.f14091j = str8;
        this.f14092k = m2Var;
        this.l = s1Var;
        this.f14093m = p1Var;
    }

    public final a0 a() {
        a0 a0Var = new a0();
        a0Var.f14054a = this.f14083b;
        a0Var.f14055b = this.f14084c;
        a0Var.f14056c = this.f14085d;
        a0Var.f14057d = this.f14086e;
        a0Var.f14058e = this.f14087f;
        a0Var.f14059f = this.f14088g;
        a0Var.f14060g = this.f14089h;
        a0Var.f14061h = this.f14090i;
        a0Var.f14062i = this.f14091j;
        a0Var.f14063j = this.f14092k;
        a0Var.f14064k = this.l;
        a0Var.l = this.f14093m;
        a0Var.f14065m = (byte) 1;
        return a0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n2) {
            b0 b0Var = (b0) ((n2) obj);
            if (this.f14083b.equals(b0Var.f14083b) && this.f14084c.equals(b0Var.f14084c) && this.f14085d == b0Var.f14085d && this.f14086e.equals(b0Var.f14086e)) {
                String str = b0Var.f14087f;
                String str2 = this.f14087f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = b0Var.f14088g;
                    String str4 = this.f14088g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = b0Var.f14089h;
                        String str6 = this.f14089h;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.f14090i.equals(b0Var.f14090i) && this.f14091j.equals(b0Var.f14091j)) {
                                m2 m2Var = b0Var.f14092k;
                                m2 m2Var2 = this.f14092k;
                                if (m2Var2 != null ? m2Var2.equals(m2Var) : m2Var == null) {
                                    s1 s1Var = b0Var.l;
                                    s1 s1Var2 = this.l;
                                    if (s1Var2 != null ? s1Var2.equals(s1Var) : s1Var == null) {
                                        p1 p1Var = b0Var.f14093m;
                                        p1 p1Var2 = this.f14093m;
                                        if (p1Var2 != null ? p1Var2.equals(p1Var) : p1Var == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f14083b.hashCode() ^ 1000003) * 1000003) ^ this.f14084c.hashCode()) * 1000003) ^ this.f14085d) * 1000003) ^ this.f14086e.hashCode()) * 1000003;
        String str = this.f14087f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f14088g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f14089h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f14090i.hashCode()) * 1000003) ^ this.f14091j.hashCode()) * 1000003;
        m2 m2Var = this.f14092k;
        int iHashCode5 = (iHashCode4 ^ (m2Var == null ? 0 : m2Var.hashCode())) * 1000003;
        s1 s1Var = this.l;
        int iHashCode6 = (iHashCode5 ^ (s1Var == null ? 0 : s1Var.hashCode())) * 1000003;
        p1 p1Var = this.f14093m;
        return iHashCode6 ^ (p1Var != null ? p1Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f14083b + ", gmpAppId=" + this.f14084c + ", platform=" + this.f14085d + ", installationUuid=" + this.f14086e + ", firebaseInstallationId=" + this.f14087f + ", firebaseAuthenticationToken=" + this.f14088g + ", appQualitySessionId=" + this.f14089h + ", buildVersion=" + this.f14090i + ", displayVersion=" + this.f14091j + ", session=" + this.f14092k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.f14093m + "}";
    }
}
