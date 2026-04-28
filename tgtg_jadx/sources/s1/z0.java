package s1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f38734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1.x f38735b;

    public z0(float f11, t1.x xVar) {
        this.f38734a = f11;
        this.f38735b = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return Float.compare(this.f38734a, z0Var.f38734a) == 0 && Intrinsics.areEqual(this.f38735b, z0Var.f38735b);
    }

    public final int hashCode() {
        return this.f38735b.hashCode() + (Float.hashCode(this.f38734a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f38734a + ", animationSpec=" + this.f38735b + ')';
    }
}
