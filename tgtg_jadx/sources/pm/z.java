package pm;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35569b;

    public z(List list, int i11) {
        this.f35568a = list;
        this.f35569b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.areEqual(this.f35568a, zVar.f35568a) && this.f35569b == zVar.f35569b;
    }

    public final int hashCode() {
        List list = this.f35568a;
        return Integer.hashCode(this.f35569b) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "MapSheetFullList(storeItemsList=" + this.f35568a + ", fullListCount=" + this.f35569b + ")";
    }
}
