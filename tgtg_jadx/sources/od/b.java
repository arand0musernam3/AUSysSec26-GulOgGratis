package od;

import fd.l;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f32432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f32433b;

    public b(l lVar, Map map) {
        this.f32432a = lVar;
        this.f32433b = android.support.v4.media.session.a.M(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f32432a, bVar.f32432a) && Intrinsics.areEqual(this.f32433b, bVar.f32433b);
    }

    public final int hashCode() {
        return this.f32433b.hashCode() + (this.f32432a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.f32432a + ", extras=" + this.f32433b + ")";
    }
}
