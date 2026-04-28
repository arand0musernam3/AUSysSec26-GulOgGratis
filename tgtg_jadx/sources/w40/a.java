package w40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f43209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f43210e;

    public a(String str, String str2, String str3, b bVar, d dVar) {
        this.f43206a = str;
        this.f43207b = str2;
        this.f43208c = str3;
        this.f43209d = bVar;
        this.f43210e = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            String str = aVar.f43206a;
            String str2 = this.f43206a;
            if (str2 != null ? str2.equals(str) : str == null) {
                String str3 = aVar.f43207b;
                String str4 = this.f43207b;
                if (str4 != null ? str4.equals(str3) : str3 == null) {
                    String str5 = aVar.f43208c;
                    String str6 = this.f43208c;
                    if (str6 != null ? str6.equals(str5) : str5 == null) {
                        b bVar = aVar.f43209d;
                        b bVar2 = this.f43209d;
                        if (bVar2 != null ? bVar2.equals(bVar) : bVar == null) {
                            d dVar = aVar.f43210e;
                            d dVar2 = this.f43210e;
                            if (dVar2 != null ? dVar2.equals(dVar) : dVar == null) {
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
        String str = this.f43206a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f43207b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f43208c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f43209d;
        int iHashCode4 = (iHashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        d dVar = this.f43210e;
        return (dVar != null ? dVar.hashCode() : 0) ^ iHashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f43206a + ", fid=" + this.f43207b + ", refreshToken=" + this.f43208c + ", authToken=" + this.f43209d + ", responseCode=" + this.f43210e + "}";
    }
}
