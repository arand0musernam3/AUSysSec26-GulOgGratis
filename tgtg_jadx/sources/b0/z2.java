package b0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v80.q f5534b;

    public z2(int i11, v80.q qVar) {
        qVar.getClass();
        this.f5533a = i11;
        this.f5534b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj;
        return this.f5533a == z2Var.f5533a && Intrinsics.areEqual(this.f5534b, z2Var.f5534b);
    }

    public final int hashCode() {
        return this.f5534b.hashCode() + (Integer.hashCode(this.f5533a) * 31);
    }

    public final String toString() {
        return "RequestSignal(requestNo=" + this.f5533a + ", signal=" + this.f5534b + ')';
    }
}
