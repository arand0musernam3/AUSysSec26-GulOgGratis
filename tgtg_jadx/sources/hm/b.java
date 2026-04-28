package hm;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yn.g f22109b;

    public b(List list, yn.g gVar) {
        list.getClass();
        this.f22108a = list;
        this.f22109b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f22108a, bVar.f22108a) && Intrinsics.areEqual(this.f22109b, bVar.f22109b);
    }

    public final int hashCode() {
        return this.f22109b.hashCode() + (this.f22108a.hashCode() * 31);
    }

    public final String toString() {
        return "OnlyActiveOrders(orders=" + this.f22108a + ", tooltipState=" + this.f22109b + ")";
    }
}
