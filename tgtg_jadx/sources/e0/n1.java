package e0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0.o f15386b;

    public n1(int i11, f0.o oVar) {
        this.f15385a = i11;
        this.f15386b = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return this.f15385a == n1Var.f15385a && Intrinsics.areEqual(this.f15386b, n1Var.f15386b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f15385a) * 31;
        f0.o oVar = this.f15386b;
        return iHashCode + (oVar == null ? 0 : oVar.hashCode());
    }

    public final String toString() {
        return "Result3A(status=" + ((Object) ("Status(value=" + this.f15385a + ')')) + ", frameMetadata=" + this.f15386b + ')';
    }
}
