package c40;

import c50.w;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7057f;

    public b(String str, String str2, String str3, String str4, long j9) {
        if (str == null) {
            w.l("Null rolloutId");
            throw null;
        }
        this.f7053b = str;
        if (str2 == null) {
            w.l("Null parameterKey");
            throw null;
        }
        this.f7054c = str2;
        this.f7055d = str3;
        if (str4 == null) {
            w.l("Null variantId");
            throw null;
        }
        this.f7056e = str4;
        this.f7057f = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        b bVar = (b) ((p) obj);
        return this.f7053b.equals(bVar.f7053b) && this.f7054c.equals(bVar.f7054c) && this.f7055d.equals(bVar.f7055d) && this.f7056e.equals(bVar.f7056e) && this.f7057f == bVar.f7057f;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f7053b.hashCode() ^ 1000003) * 1000003) ^ this.f7054c.hashCode()) * 1000003) ^ this.f7055d.hashCode()) * 1000003) ^ this.f7056e.hashCode()) * 1000003;
        long j9 = this.f7057f;
        return iHashCode ^ ((int) ((j9 >>> 32) ^ j9));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f7053b);
        sb2.append(", parameterKey=");
        sb2.append(this.f7054c);
        sb2.append(", parameterValue=");
        sb2.append(this.f7055d);
        sb2.append(", variantId=");
        sb2.append(this.f7056e);
        sb2.append(", templateVersion=");
        return a0.j(this.f7057f, "}", sb2);
    }
}
