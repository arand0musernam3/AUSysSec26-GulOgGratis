package f0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f17003a;

    public y1(r1 r1Var) {
        this.f17003a = r1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y1) && Intrinsics.areEqual(this.f17003a, ((y1) obj).f17003a);
    }

    public final int hashCode() {
        return this.f17003a.hashCode();
    }

    public final String toString() {
        return "CameraStateOpen(cameraDevice=" + this.f17003a + ')';
    }
}
