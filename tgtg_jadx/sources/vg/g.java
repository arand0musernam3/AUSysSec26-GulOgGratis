package vg;

import com.app.tgtg.model.remote.user.response.Address;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f42320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Address f42321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f42322d;

    public /* synthetic */ g(String str, List list, Address address, d dVar, int i11) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : address, (i11 & 8) != 0 ? d.NONE : dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f42319a, gVar.f42319a) && Intrinsics.areEqual(this.f42320b, gVar.f42320b) && Intrinsics.areEqual(this.f42321c, gVar.f42321c) && this.f42322d == gVar.f42322d;
    }

    public final int hashCode() {
        int iHashCode = this.f42319a.hashCode() * 31;
        List list = this.f42320b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Address address = this.f42321c;
        int iHashCode3 = (iHashCode2 + (address == null ? 0 : address.hashCode())) * 31;
        d dVar = this.f42322d;
        return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "SearchState(query=" + this.f42319a + ", searchResults=" + this.f42320b + ", selectedAddress=" + this.f42321c + ", autoFillSource=" + this.f42322d + ")";
    }

    public g(String str, List list, Address address, d dVar) {
        str.getClass();
        this.f42319a = str;
        this.f42320b = list;
        this.f42321c = address;
        this.f42322d = dVar;
    }
}
