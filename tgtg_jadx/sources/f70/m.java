package f70;

import com.app.tgtg.R;
import j4.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f17495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f17496b;

    public m(double d3, double d11) {
        this.f17495a = d3;
        this.f17496b = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Double.compare(this.f17495a, mVar.f17495a) == 0 && Double.compare(this.f17496b, mVar.f17496b) == 0;
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.map_error_loading) + s.b(this.f17496b, Double.hashCode(this.f17495a) * 31, 31);
    }

    public final String toString() {
        return "OpenMap(latitude=" + this.f17495a + ", longitude=" + this.f17496b + ", errorMessageRes=" + R.string.map_error_loading + ")";
    }
}
