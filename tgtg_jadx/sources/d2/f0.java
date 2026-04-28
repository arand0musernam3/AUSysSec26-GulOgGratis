package d2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2 f13778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2 f13779b;

    public f0(y2 y2Var, y2 y2Var2) {
        this.f13778a = y2Var;
        this.f13779b = y2Var2;
    }

    @Override // d2.y2
    public final int a(z5.c cVar, z5.m mVar) {
        int iA = this.f13778a.a(cVar, mVar) - this.f13779b.a(cVar, mVar);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // d2.y2
    public final int b(z5.c cVar, z5.m mVar) {
        int iB = this.f13778a.b(cVar, mVar) - this.f13779b.b(cVar, mVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // d2.y2
    public final int c(z5.c cVar) {
        int iC = this.f13778a.c(cVar) - this.f13779b.c(cVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // d2.y2
    public final int d(z5.c cVar) {
        int iD = this.f13778a.d(cVar) - this.f13779b.d(cVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.areEqual(f0Var.f13778a, this.f13778a) && Intrinsics.areEqual(f0Var.f13779b, this.f13779b);
    }

    public final int hashCode() {
        return this.f13779b.hashCode() + (this.f13778a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f13778a + " - " + this.f13779b + ')';
    }
}
