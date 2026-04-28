package m5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f29631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f29632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f29633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0 f29634d;

    public r0(l0 l0Var, l0 l0Var2, l0 l0Var3, l0 l0Var4) {
        this.f29631a = l0Var;
        this.f29632b = l0Var2;
        this.f29633c = l0Var3;
        this.f29634d = l0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.areEqual(this.f29631a, r0Var.f29631a) && Intrinsics.areEqual(this.f29632b, r0Var.f29632b) && Intrinsics.areEqual(this.f29633c, r0Var.f29633c) && Intrinsics.areEqual(this.f29634d, r0Var.f29634d);
    }

    public final int hashCode() {
        l0 l0Var = this.f29631a;
        int iHashCode = (l0Var != null ? l0Var.hashCode() : 0) * 31;
        l0 l0Var2 = this.f29632b;
        int iHashCode2 = (iHashCode + (l0Var2 != null ? l0Var2.hashCode() : 0)) * 31;
        l0 l0Var3 = this.f29633c;
        int iHashCode3 = (iHashCode2 + (l0Var3 != null ? l0Var3.hashCode() : 0)) * 31;
        l0 l0Var4 = this.f29634d;
        return iHashCode3 + (l0Var4 != null ? l0Var4.hashCode() : 0);
    }
}
