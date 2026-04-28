package pm;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f35565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f35566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f35567c;

    public y(z zVar, List list, k kVar) {
        this.f35565a = zVar;
        this.f35566b = list;
        this.f35567c = kVar;
    }

    public static y a(y yVar, z zVar, List list, k kVar, int i11) {
        if ((i11 & 1) != 0) {
            zVar = yVar.f35565a;
        }
        if ((i11 & 2) != 0) {
            list = yVar.f35566b;
        }
        if ((i11 & 4) != 0) {
            kVar = yVar.f35567c;
        }
        yVar.getClass();
        return new y(zVar, list, kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.areEqual(this.f35565a, yVar.f35565a) && Intrinsics.areEqual(this.f35566b, yVar.f35566b) && Intrinsics.areEqual(this.f35567c, yVar.f35567c);
    }

    public final int hashCode() {
        z zVar = this.f35565a;
        int iHashCode = (zVar == null ? 0 : zVar.hashCode()) * 31;
        List list = this.f35566b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        k kVar = this.f35567c;
        return iHashCode2 + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        return "MapBottomSheetData(fullList=" + this.f35565a + ", itemList=" + this.f35566b + ", errorInfo=" + this.f35567c + ")";
    }
}
