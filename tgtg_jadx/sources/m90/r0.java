package m90;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements Map.Entry, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f29847b;

    public r0(Object obj, Object obj2) {
        this.f29846a = obj;
        this.f29847b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.areEqual(this.f29846a, r0Var.f29846a) && Intrinsics.areEqual(this.f29847b, r0Var.f29847b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f29846a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f29847b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f29846a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f29847b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f29846a + ", value=" + this.f29847b + ')';
    }
}
