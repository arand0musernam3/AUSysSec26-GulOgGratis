package f0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f16759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0.w f16760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f16761c;

    public l2(q1 q1Var, i0.w wVar, x0 x0Var) {
        q1Var.getClass();
        this.f16759a = q1Var;
        this.f16760b = wVar;
        this.f16761c = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return Intrinsics.areEqual(this.f16759a, l2Var.f16759a) && Intrinsics.areEqual(this.f16760b, l2Var.f16760b) && Intrinsics.areEqual(this.f16761c, l2Var.f16761c);
    }

    public final int hashCode() {
        return this.f16761c.hashCode() + ((this.f16760b.hashCode() + (this.f16759a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ConfiguredCameraCaptureSession(session=" + this.f16759a + ", processor=" + this.f16760b + ", captureSequenceProcessor=" + this.f16761c + ')';
    }
}
