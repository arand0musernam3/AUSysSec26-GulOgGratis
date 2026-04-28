package t1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f39400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39401b;

    public c1(x xVar, long j9) {
        this.f39400a = xVar;
        this.f39401b = j9;
    }

    @Override // t1.i
    public final x1 a(v1 v1Var) {
        return new d1(this.f39400a.a(v1Var), this.f39401b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return c1Var.f39401b == this.f39401b && Intrinsics.areEqual(c1Var.f39400a, this.f39400a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f39401b) + (this.f39400a.hashCode() * 31);
    }
}
