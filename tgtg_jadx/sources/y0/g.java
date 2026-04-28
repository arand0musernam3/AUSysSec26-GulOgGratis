package y0;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f44563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44564b;

    public g(Map map, int i11) {
        map.getClass();
        this.f44563a = map;
        this.f44564b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f44563a, gVar.f44563a) && this.f44564b == gVar.f44564b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44564b) + (this.f44563a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StreamSpecQueryResult(streamSpecs=");
        sb2.append(this.f44563a);
        sb2.append(", maxSupportedFrameRate=");
        return k.o(sb2, this.f44564b, ')');
    }
}
