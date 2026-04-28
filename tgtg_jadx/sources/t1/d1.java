package t1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f39415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39416b;

    public d1(x1 x1Var, long j9) {
        this.f39415a = x1Var;
        this.f39416b = j9;
    }

    @Override // t1.x1
    public final boolean a() {
        return this.f39415a.a();
    }

    @Override // t1.x1
    public final long b(o oVar, o oVar2, o oVar3) {
        return this.f39415a.b(oVar, oVar2, oVar3) + this.f39416b;
    }

    @Override // t1.x1
    public final o e(long j9, o oVar, o oVar2, o oVar3) {
        long j11 = this.f39416b;
        return j9 < j11 ? oVar : this.f39415a.e(j9 - j11, oVar, oVar2, oVar3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return d1Var.f39416b == this.f39416b && Intrinsics.areEqual(d1Var.f39415a, this.f39415a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f39416b) + (this.f39415a.hashCode() * 31);
    }

    @Override // t1.x1
    public final o m(long j9, o oVar, o oVar2, o oVar3) {
        long j11 = this.f39416b;
        return j9 < j11 ? oVar3 : this.f39415a.m(j9 - j11, oVar, oVar2, oVar3);
    }
}
