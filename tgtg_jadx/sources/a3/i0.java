package a3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f387c;

    public i0(h0 h0Var, h0 h0Var2, boolean z11) {
        this.f385a = h0Var;
        this.f386b = h0Var2;
        this.f387c = z11;
    }

    public static i0 a(i0 i0Var, h0 h0Var, h0 h0Var2, boolean z11, int i11) {
        if ((i11 & 1) != 0) {
            h0Var = i0Var.f385a;
        }
        if ((i11 & 2) != 0) {
            h0Var2 = i0Var.f386b;
        }
        if ((i11 & 4) != 0) {
            z11 = i0Var.f387c;
        }
        i0Var.getClass();
        return new i0(h0Var, h0Var2, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.areEqual(this.f385a, i0Var.f385a) && Intrinsics.areEqual(this.f386b, i0Var.f386b) && this.f387c == i0Var.f387c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f387c) + ((this.f386b.hashCode() + (this.f385a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Selection(start=");
        sb2.append(this.f385a);
        sb2.append(", end=");
        sb2.append(this.f386b);
        sb2.append(", handlesCrossed=");
        return r8.k.q(sb2, this.f387c, ')');
    }
}
