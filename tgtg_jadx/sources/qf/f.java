package qf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f37044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pf.a f37045b;

    public f(g gVar, pf.a aVar) {
        gVar.getClass();
        this.f37044a = gVar;
        this.f37045b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f37044a == fVar.f37044a && Intrinsics.areEqual(this.f37045b, fVar.f37045b);
    }

    public final int hashCode() {
        int iHashCode = this.f37044a.hashCode() * 31;
        pf.a aVar = this.f37045b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "WriteQueueMessage(type=" + this.f37044a + ", event=" + this.f37045b + ')';
    }
}
