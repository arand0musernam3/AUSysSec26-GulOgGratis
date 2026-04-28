package vy;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f42620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f42621b;

    public v(h0 h0Var, g0 g0Var) {
        this.f42620a = h0Var;
        this.f42621b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            h0 h0Var = this.f42620a;
            if (h0Var != null ? h0Var.equals(((v) i0Var).f42620a) : ((v) i0Var).f42620a == null) {
                g0 g0Var = this.f42621b;
                if (g0Var != null ? g0Var.equals(((v) i0Var).f42621b) : ((v) i0Var).f42621b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        h0 h0Var = this.f42620a;
        int iHashCode = ((h0Var == null ? 0 : h0Var.hashCode()) ^ 1000003) * 1000003;
        g0 g0Var = this.f42621b;
        return (g0Var != null ? g0Var.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f42620a + ", mobileSubtype=" + this.f42621b + "}";
    }
}
