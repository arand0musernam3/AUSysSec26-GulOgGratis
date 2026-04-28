package lv;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q5.l f28211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q5.l f28212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q5.l f28213c;

    public q0(q5.l lVar, q5.l lVar2, q5.l lVar3) {
        this.f28211a = lVar;
        this.f28212b = lVar2;
        this.f28213c = lVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.areEqual(this.f28211a, q0Var.f28211a) && Intrinsics.areEqual(this.f28212b, q0Var.f28212b) && Intrinsics.areEqual(this.f28213c, q0Var.f28213c);
    }

    public final int hashCode() {
        return this.f28213c.f36030f.hashCode() + e0.f.c(this.f28212b.f36030f, this.f28211a.f36030f.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FontSet(main=" + this.f28211a + ", displayHeadingOld=" + this.f28212b + ", displayHeadingNew=" + this.f28213c + ")";
    }
}
