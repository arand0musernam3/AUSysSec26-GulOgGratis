package vy;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f42597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f42598b;

    public o(r rVar, z zVar) {
        this.f42597a = rVar;
        this.f42598b = zVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (!this.f42597a.equals(((o) a0Var).f42597a)) {
            return false;
        }
        z zVar = this.f42598b;
        return zVar == null ? ((o) a0Var).f42598b == null : zVar.equals(((o) a0Var).f42598b);
    }

    public final int hashCode() {
        int iHashCode = (this.f42597a.hashCode() ^ 1000003) * 1000003;
        z zVar = this.f42598b;
        return iHashCode ^ (zVar == null ? 0 : zVar.hashCode());
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f42597a + ", productIdOrigin=" + this.f42598b + "}";
    }
}
