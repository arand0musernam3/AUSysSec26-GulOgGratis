package v40;

import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f42005h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f42007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f42010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f42011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f42012g;

    static {
        a aVar = new a();
        aVar.f42002f = 0L;
        aVar.f42004h = (byte) (aVar.f42004h | 2);
        aVar.b(d.ATTEMPT_MIGRATION);
        aVar.f42001e = 0L;
        aVar.f42004h = (byte) (aVar.f42004h | 1);
        aVar.a();
    }

    public b(String str, d dVar, String str2, String str3, long j9, long j11, String str4) {
        this.f42006a = str;
        this.f42007b = dVar;
        this.f42008c = str2;
        this.f42009d = str3;
        this.f42010e = j9;
        this.f42011f = j11;
        this.f42012g = str4;
    }

    public final a a() {
        a aVar = new a();
        aVar.f41997a = this.f42006a;
        aVar.f41998b = this.f42007b;
        aVar.f41999c = this.f42008c;
        aVar.f42000d = this.f42009d;
        aVar.f42001e = this.f42010e;
        aVar.f42002f = this.f42011f;
        aVar.f42003g = this.f42012g;
        aVar.f42004h = (byte) 3;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            String str = bVar.f42006a;
            String str2 = this.f42006a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f42007b.equals(bVar.f42007b)) {
                    String str3 = bVar.f42008c;
                    String str4 = this.f42008c;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = bVar.f42009d;
                        String str6 = this.f42009d;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.f42010e == bVar.f42010e && this.f42011f == bVar.f42011f) {
                                String str7 = bVar.f42012g;
                                String str8 = this.f42012g;
                                if (str8 != null ? str8.equals(str7) : str7 == null) {
                                    return true;
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
        String str = this.f42006a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f42007b.hashCode()) * 1000003;
        String str2 = this.f42008c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f42009d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j9 = this.f42010e;
        int i11 = (iHashCode3 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j11 = this.f42011f;
        int i12 = (i11 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f42012g;
        return (str4 != null ? str4.hashCode() : 0) ^ i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f42006a);
        sb2.append(", registrationStatus=");
        sb2.append(this.f42007b);
        sb2.append(", authToken=");
        sb2.append(this.f42008c);
        sb2.append(", refreshToken=");
        sb2.append(this.f42009d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f42010e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f42011f);
        sb2.append(", fisError=");
        return k.p(sb2, this.f42012g, "}");
    }
}
