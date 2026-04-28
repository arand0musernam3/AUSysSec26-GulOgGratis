package v1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f41677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4.x0 f41678b;

    public a0(float f11, i4.x0 x0Var) {
        this.f41677a = f11;
        this.f41678b = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return z5.f.c(this.f41677a, a0Var.f41677a) && Intrinsics.areEqual(this.f41678b, a0Var.f41678b);
    }

    public final int hashCode() {
        return this.f41678b.hashCode() + (Float.hashCode(this.f41677a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BorderStroke(width=");
        r8.k.u(this.f41677a, ", brush=", sb2);
        sb2.append(this.f41678b);
        sb2.append(')');
        return sb2.toString();
    }
}
