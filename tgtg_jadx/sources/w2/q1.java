package w2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v2.b f43030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f43031b;

    public q1(v2.b bVar, j0 j0Var) {
        this.f43030a = bVar;
        this.f43031b = j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return Intrinsics.areEqual(this.f43030a, q1Var.f43030a) && Intrinsics.areEqual(this.f43031b, q1Var.f43031b);
    }

    public final int hashCode() {
        return this.f43031b.hashCode() + (this.f43030a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f43030a) + ", offsetMapping=" + this.f43031b + ')';
    }
}
