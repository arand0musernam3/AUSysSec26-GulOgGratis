package f0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g3 implements i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0.l f16685a;

    public g3(e0.l lVar) {
        this.f16685a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g3) && Intrinsics.areEqual(this.f16685a, ((g3) obj).f16685a);
    }

    public final int hashCode() {
        e0.l lVar = this.f16685a;
        if (lVar == null) {
            return 0;
        }
        return Integer.hashCode(lVar.f15363a);
    }

    public final String toString() {
        return "Error(lastCameraError=" + this.f16685a + ')';
    }
}
