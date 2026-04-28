package f0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 implements e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0.l f16596a;

    public c3(e0.l lVar) {
        this.f16596a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c3) && Intrinsics.areEqual(this.f16596a, ((c3) obj).f16596a);
    }

    public final int hashCode() {
        e0.l lVar = this.f16596a;
        if (lVar == null) {
            return 0;
        }
        return Integer.hashCode(lVar.f15363a);
    }

    public final String toString() {
        return "Error(lastCameraError=" + this.f16596a + ')';
    }
}
