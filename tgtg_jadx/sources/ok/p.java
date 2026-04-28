package ok;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f32617a;

    public p(s0 s0Var) {
        this.f32617a = s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.areEqual(this.f32617a, ((p) obj).f32617a);
    }

    public final int hashCode() {
        return this.f32617a.hashCode();
    }

    public final String toString() {
        return "TrackingAction(action=" + this.f32617a + ")";
    }
}
