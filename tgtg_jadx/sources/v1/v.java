package v1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i4.f f41851a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i4.c f41852b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k4.b f41853c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i4.h f41854d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.areEqual(this.f41851a, vVar.f41851a) && Intrinsics.areEqual(this.f41852b, vVar.f41852b) && Intrinsics.areEqual(this.f41853c, vVar.f41853c) && Intrinsics.areEqual(this.f41854d, vVar.f41854d);
    }

    public final int hashCode() {
        i4.f fVar = this.f41851a;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        i4.c cVar = this.f41852b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        k4.b bVar = this.f41853c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        i4.h hVar = this.f41854d;
        return iHashCode3 + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f41851a + ", canvas=" + this.f41852b + ", canvasDrawScope=" + this.f41853c + ", borderPath=" + this.f41854d + ')';
    }
}
