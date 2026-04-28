package u40;

import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f40741c;

    public a(String str, long j9, long j11) {
        this.f40739a = str;
        this.f40740b = j9;
        this.f40741c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f40739a.equals(aVar.f40739a) && this.f40740b == aVar.f40740b && this.f40741c == aVar.f40741c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f40739a.hashCode() ^ 1000003) * 1000003;
        long j9 = this.f40740b;
        long j11 = this.f40741c;
        return ((iHashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f40739a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f40740b);
        sb2.append(", tokenCreationTimestamp=");
        return a0.j(this.f40741c, "}", sb2);
    }
}
