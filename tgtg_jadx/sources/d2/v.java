package d2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z5.c f13945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13946b;

    public v(z4.z1 z1Var, long j9) {
        this.f13945a = z1Var;
        this.f13946b = j9;
    }

    @Override // d2.t
    public final b4.t a(b4.t tVar, b4.k kVar) {
        return tVar.then(new m(kVar, false, c5.m2.f7291a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.areEqual(this.f13945a, vVar.f13945a) && z5.a.c(this.f13946b, vVar.f13946b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f13946b) + (this.f13945a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f13945a + ", constraints=" + ((Object) z5.a.m(this.f13946b)) + ')';
    }
}
