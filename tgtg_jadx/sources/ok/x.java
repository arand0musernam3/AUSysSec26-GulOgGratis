package ok;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements f70.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk.f f32637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f32638b;

    public x(nk.f fVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f32637a = fVar;
        this.f32638b = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.areEqual(this.f32637a, xVar.f32637a) && this.f32638b == xVar.f32638b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32638b) + (this.f32637a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenBottomSheet(type=" + this.f32637a + ", timestamp=" + this.f32638b + ")";
    }
}
