package s0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1.d f38379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0.c f38380b;

    public l0(i1.d dVar, w0.c cVar) {
        this.f38379a = dVar;
        this.f38380b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.areEqual(this.f38379a, l0Var.f38379a) && Intrinsics.areEqual(this.f38380b, l0Var.f38380b);
    }

    public final int hashCode() {
        return this.f38380b.hashCode() + (this.f38379a.hashCode() * 31);
    }

    public final String toString() {
        return "ListenerWrapper(listener=" + this.f38379a + ", executor=" + this.f38380b + ')';
    }
}
