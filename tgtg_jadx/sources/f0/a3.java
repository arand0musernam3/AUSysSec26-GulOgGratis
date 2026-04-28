package f0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f16566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0.l f16567b;

    public a3(h hVar, e0.l lVar, int i11) {
        hVar = (i11 & 1) != 0 ? null : hVar;
        lVar = (i11 & 2) != 0 ? null : lVar;
        this.f16566a = hVar;
        this.f16567b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return Intrinsics.areEqual(this.f16566a, a3Var.f16566a) && Intrinsics.areEqual(this.f16567b, a3Var.f16567b);
    }

    public final int hashCode() {
        h hVar = this.f16566a;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        e0.l lVar = this.f16567b;
        return iHashCode + (lVar != null ? Integer.hashCode(lVar.f15363a) : 0);
    }

    public final String toString() {
        return "OpenCameraResult(cameraState=" + this.f16566a + ", errorCode=" + this.f16567b + ')';
    }
}
