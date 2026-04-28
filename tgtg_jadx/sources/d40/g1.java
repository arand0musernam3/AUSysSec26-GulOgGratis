package d40;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14167a;

    public g1(List list) {
        this.f14167a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        return this.f14167a.equals(((g1) ((i2) obj)).f14167a);
    }

    public final int hashCode() {
        return this.f14167a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return e0.f.p(new StringBuilder("RolloutsState{rolloutAssignments="), this.f14167a, "}");
    }
}
