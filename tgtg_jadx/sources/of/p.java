package of;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f32525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f32526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f32527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f32528d;

    public p(Map map, Map map2, Map map3, List list) {
        this.f32525a = map;
        this.f32526b = map2;
        this.f32527c = map3;
        this.f32528d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.f32525a, pVar.f32525a) && Intrinsics.areEqual(this.f32526b, pVar.f32526b) && Intrinsics.areEqual(this.f32527c, pVar.f32527c) && Intrinsics.areEqual(this.f32528d, pVar.f32528d);
    }

    public final int hashCode() {
        Map map = this.f32525a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map map2 = this.f32526b;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.f32527c;
        int iHashCode3 = (iHashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        List list = this.f32528d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "DiagnosticsSnapshot(tags=" + this.f32525a + ", counters=" + this.f32526b + ", histograms=" + this.f32527c + ", events=" + this.f32528d + ')';
    }
}
