package g3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r8.a f19346b;

    public q2(long j9, r8.a aVar) {
        this.f19345a = j9;
        this.f19346b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return h4.b.b(this.f19345a, q2Var.f19345a) && Intrinsics.areEqual(this.f19346b, q2Var.f19346b);
    }

    public final int hashCode() {
        return this.f19346b.hashCode() + (Long.hashCode(this.f19345a) * 31);
    }

    public final String toString() {
        return "PointNRound(o=" + ((Object) h4.b.h(this.f19345a)) + ", r=" + this.f19346b + ')';
    }
}
