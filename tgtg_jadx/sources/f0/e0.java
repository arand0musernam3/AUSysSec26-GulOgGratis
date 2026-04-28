package f0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f16619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f16620b;

    public e0(r1 r1Var, h hVar) {
        this.f16619a = r1Var;
        this.f16620b = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.areEqual(this.f16619a, e0Var.f16619a) && Intrinsics.areEqual(this.f16620b, e0Var.f16620b);
    }

    public final int hashCode() {
        r1 r1Var = this.f16619a;
        int iHashCode = (r1Var == null ? 0 : r1Var.hashCode()) * 31;
        h hVar = this.f16620b;
        return iHashCode + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        return "AwaitOpenCameraResult(cameraDeviceWrapper=" + this.f16619a + ", androidCameraState=" + this.f16620b + ')';
    }
}
