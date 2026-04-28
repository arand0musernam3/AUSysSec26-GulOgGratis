package d1;

import c1.n;
import c50.w;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f13670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f13671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f13672c;

    public b(n nVar, n nVar2, ArrayList arrayList) {
        if (nVar == null) {
            w.l("Null primarySurfaceEdge");
            throw null;
        }
        this.f13670a = nVar;
        if (nVar2 == null) {
            w.l("Null secondarySurfaceEdge");
            throw null;
        }
        this.f13671b = nVar2;
        this.f13672c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f13670a.equals(bVar.f13670a) && this.f13671b.equals(bVar.f13671b) && this.f13672c.equals(bVar.f13672c);
    }

    public final int hashCode() {
        return ((((this.f13670a.hashCode() ^ 1000003) * 1000003) ^ this.f13671b.hashCode()) * 1000003) ^ this.f13672c.hashCode();
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.f13670a + ", secondarySurfaceEdge=" + this.f13671b + ", outConfigs=" + this.f13672c + "}";
    }
}
