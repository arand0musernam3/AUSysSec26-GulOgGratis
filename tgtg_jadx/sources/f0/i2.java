package f0;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 implements j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f16719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f16720b;

    public i2(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        this.f16719a = map;
        this.f16720b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return Intrinsics.areEqual(this.f16719a, i2Var.f16719a) && Intrinsics.areEqual(this.f16720b, i2Var.f16720b);
    }

    public final int hashCode() {
        return this.f16720b.hashCode() + (this.f16719a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(deferred=" + this.f16719a + ", outputSurfaceMap=" + this.f16720b + ')';
    }
}
