package s1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f38556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f38557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1.x f38558c;

    public c1(float f11, long j9, t1.x xVar) {
        this.f38556a = f11;
        this.f38557b = j9;
        this.f38558c = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Float.compare(this.f38556a, c1Var.f38556a) == 0 && i4.z0.a(this.f38557b, c1Var.f38557b) && Intrinsics.areEqual(this.f38558c, c1Var.f38558c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f38556a) * 31;
        int i11 = i4.z0.f23336c;
        return this.f38558c.hashCode() + e0.f.b(iHashCode, 31, this.f38557b);
    }

    public final String toString() {
        return "Scale(scale=" + this.f38556a + ", transformOrigin=" + ((Object) i4.z0.b(this.f38557b)) + ", animationSpec=" + this.f38558c + ')';
    }
}
