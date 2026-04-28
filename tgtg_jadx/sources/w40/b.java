package w40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f43213c;

    public b(String str, long j9, e eVar) {
        this.f43211a = str;
        this.f43212b = j9;
        this.f43213c = eVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            String str = bVar.f43211a;
            String str2 = this.f43211a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f43212b == bVar.f43212b) {
                    e eVar = bVar.f43213c;
                    e eVar2 = this.f43213c;
                    if (eVar2 != null ? eVar2.equals(eVar) : eVar == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f43211a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j9 = this.f43212b;
        int i11 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003;
        e eVar = this.f43213c;
        return (eVar != null ? eVar.hashCode() : 0) ^ i11;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f43211a + ", tokenExpirationTimestamp=" + this.f43212b + ", responseCode=" + this.f43213c + "}";
    }
}
