package wf;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f43412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f43413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f43414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f43415e;

    public a(String str, Map map, Map map2, Map map3, Map map4) {
        str.getClass();
        this.f43411a = str;
        this.f43412b = map;
        this.f43413c = map2;
        this.f43414d = map3;
        this.f43415e = map4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f43411a, aVar.f43411a) && Intrinsics.areEqual(this.f43412b, aVar.f43412b) && Intrinsics.areEqual(this.f43413c, aVar.f43413c) && Intrinsics.areEqual(this.f43414d, aVar.f43414d) && Intrinsics.areEqual(this.f43415e, aVar.f43415e);
    }

    public final int hashCode() {
        int iHashCode = this.f43411a.hashCode() * 31;
        Map map = this.f43412b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f43413c;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.f43414d;
        int iHashCode4 = (iHashCode3 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map map4 = this.f43415e;
        return iHashCode4 + (map4 != null ? map4.hashCode() : 0);
    }

    public final String toString() {
        return "Event(eventType=" + this.f43411a + ", eventProperties=" + this.f43412b + ", userProperties=" + this.f43413c + ", groups=" + this.f43414d + ", groupProperties=" + this.f43415e + ')';
    }
}
