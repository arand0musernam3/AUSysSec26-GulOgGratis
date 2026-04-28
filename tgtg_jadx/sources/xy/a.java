package xy;

import c50.w;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f44502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f44503b;

    public a(c cVar, long j9) {
        if (cVar == null) {
            w.l("Null status");
            throw null;
        }
        this.f44502a = cVar;
        this.f44503b = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f44502a.equals(aVar.f44502a) && this.f44503b == aVar.f44503b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f44502a.hashCode() ^ 1000003) * 1000003;
        long j9 = this.f44503b;
        return iHashCode ^ ((int) ((j9 >>> 32) ^ j9));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        sb2.append(this.f44502a);
        sb2.append(", nextRequestWaitMillis=");
        return a0.j(this.f44503b, "}", sb2);
    }
}
