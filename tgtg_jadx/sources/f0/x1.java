package f0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0.l f16982a;

    public x1(e0.l lVar) {
        this.f16982a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x1) && Intrinsics.areEqual(this.f16982a, ((x1) obj).f16982a);
    }

    public final int hashCode() {
        e0.l lVar = this.f16982a;
        if (lVar == null) {
            return 0;
        }
        return Integer.hashCode(lVar.f15363a);
    }

    public final String toString() {
        return "CameraStateClosing(cameraErrorCode=" + this.f16982a + ')';
    }
}
