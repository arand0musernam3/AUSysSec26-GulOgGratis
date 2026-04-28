package d2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2 f13892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2 f13893b;

    public q2(y2 y2Var, y2 y2Var2) {
        this.f13892a = y2Var;
        this.f13893b = y2Var2;
    }

    @Override // d2.y2
    public final int a(z5.c cVar, z5.m mVar) {
        return Math.max(this.f13892a.a(cVar, mVar), this.f13893b.a(cVar, mVar));
    }

    @Override // d2.y2
    public final int b(z5.c cVar, z5.m mVar) {
        return Math.max(this.f13892a.b(cVar, mVar), this.f13893b.b(cVar, mVar));
    }

    @Override // d2.y2
    public final int c(z5.c cVar) {
        return Math.max(this.f13892a.c(cVar), this.f13893b.c(cVar));
    }

    @Override // d2.y2
    public final int d(z5.c cVar) {
        return Math.max(this.f13892a.d(cVar), this.f13893b.d(cVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return Intrinsics.areEqual(q2Var.f13892a, this.f13892a) && Intrinsics.areEqual(q2Var.f13893b, this.f13893b);
    }

    public final int hashCode() {
        return (this.f13893b.hashCode() * 31) + this.f13892a.hashCode();
    }

    public final String toString() {
        return "(" + this.f13892a + " ∪ " + this.f13893b + ')';
    }
}
