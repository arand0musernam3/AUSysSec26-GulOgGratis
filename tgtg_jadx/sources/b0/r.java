package b0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0.u0 f5379c;

    public r(List list, int i11, s0.u0 u0Var) {
        list.getClass();
        u0Var.getClass();
        this.f5377a = list;
        this.f5378b = i11;
        this.f5379c = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.areEqual(this.f5377a, rVar.f5377a) && this.f5378b == rVar.f5378b && Intrinsics.areEqual(this.f5379c, rVar.f5379c);
    }

    public final int hashCode() {
        return this.f5379c.hashCode() + r8.k.b(this.f5378b, this.f5377a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MainCaptureParams(configs=" + this.f5377a + ", requestTemplate=" + ((Object) e0.m1.b(this.f5378b)) + ", sessionConfigOptions=" + this.f5379c + ')';
    }
}
