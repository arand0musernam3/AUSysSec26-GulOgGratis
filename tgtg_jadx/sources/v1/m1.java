package v1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d2.b2 f41790b;

    public m1() {
        long jD = i4.g0.d(4284900966L);
        d2.b2 b2VarC = d2.c.c(0.0f, 0.0f, 3);
        this.f41789a = jD;
        this.f41790b = b2VarC;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(m1.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        m1 m1Var = (m1) obj;
        return i4.v.c(this.f41789a, m1Var.f41789a) && Intrinsics.areEqual(this.f41790b, m1Var.f41790b);
    }

    public final int hashCode() {
        int i11 = i4.v.f23316i;
        u70.b0 b0Var = u70.c0.f40833b;
        return this.f41790b.hashCode() + (Long.hashCode(this.f41789a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverscrollConfiguration(glowColor=");
        r8.k.x(this.f41789a, ", drawPadding=", sb2);
        sb2.append(this.f41790b);
        sb2.append(')');
        return sb2.toString();
    }
}
