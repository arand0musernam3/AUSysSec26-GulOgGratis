package hm;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f22112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yn.g f22113c;

    public d(int i11, List list, yn.g gVar) {
        list.getClass();
        this.f22111a = i11;
        this.f22112b = list;
        this.f22113c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f22111a == dVar.f22111a && Intrinsics.areEqual(this.f22112b, dVar.f22112b) && Intrinsics.areEqual(this.f22113c, dVar.f22113c);
    }

    public final int hashCode() {
        return this.f22113c.hashCode() + e0.f.c(this.f22112b, Integer.hashCode(this.f22111a) * 31, 31);
    }

    public final String toString() {
        return "UnreadAndActiveOrders(unreadCount=" + this.f22111a + ", orders=" + this.f22112b + ", tooltipState=" + this.f22113c + ")";
    }
}
