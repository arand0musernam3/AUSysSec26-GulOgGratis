package d40;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f14333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1 f14334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u0 f14335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f14336e;

    public r0(List list, t0 t0Var, p1 p1Var, u0 u0Var, List list2) {
        this.f14332a = list;
        this.f14333b = t0Var;
        this.f14334c = p1Var;
        this.f14335d = u0Var;
        this.f14336e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        List list = this.f14332a;
        if (list == null) {
            if (((r0) b2Var).f14332a != null) {
                return false;
            }
        } else if (!list.equals(((r0) b2Var).f14332a)) {
            return false;
        }
        x1 x1Var = this.f14333b;
        if (x1Var == null) {
            if (((r0) b2Var).f14333b != null) {
                return false;
            }
        } else if (!x1Var.equals(((r0) b2Var).f14333b)) {
            return false;
        }
        p1 p1Var = this.f14334c;
        if (p1Var == null) {
            if (((r0) b2Var).f14334c != null) {
                return false;
            }
        } else if (!p1Var.equals(((r0) b2Var).f14334c)) {
            return false;
        }
        r0 r0Var = (r0) b2Var;
        return this.f14335d.equals(r0Var.f14335d) && this.f14336e.equals(r0Var.f14336e);
    }

    public final int hashCode() {
        List list = this.f14332a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        x1 x1Var = this.f14333b;
        int iHashCode2 = (iHashCode ^ (x1Var == null ? 0 : x1Var.hashCode())) * 1000003;
        p1 p1Var = this.f14334c;
        return (((((p1Var != null ? p1Var.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f14335d.hashCode()) * 1000003) ^ this.f14336e.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Execution{threads=");
        sb2.append(this.f14332a);
        sb2.append(", exception=");
        sb2.append(this.f14333b);
        sb2.append(", appExitInfo=");
        sb2.append(this.f14334c);
        sb2.append(", signal=");
        sb2.append(this.f14335d);
        sb2.append(", binaries=");
        return e0.f.p(sb2, this.f14336e, "}");
    }
}
