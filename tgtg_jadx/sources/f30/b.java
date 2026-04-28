package f30;

import android.app.PendingIntent;
import c50.w;
import j4.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f17273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17274b;

    public b(PendingIntent pendingIntent, boolean z11) {
        if (pendingIntent == null) {
            w.l("Null pendingIntent");
            throw null;
        }
        this.f17273a = pendingIntent;
        this.f17274b = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            b bVar = (b) ((a) obj);
            if (this.f17273a.equals(bVar.f17273a) && this.f17274b == bVar.f17274b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f17273a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f17274b ? 1237 : 1231);
    }

    public final String toString() {
        return s.o(e0.f.s("ReviewInfo{pendingIntent=", this.f17273a.toString(), ", isNoOp="), this.f17274b, "}");
    }
}
