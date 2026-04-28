package hp;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f22273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22274b;

    public f1(u0 u0Var, boolean z11) {
        this.f22273a = u0Var;
        this.f22274b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return Intrinsics.areEqual(this.f22273a, f1Var.f22273a) && this.f22274b == f1Var.f22274b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22274b) + (this.f22273a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectedRecipeTag(tag=" + this.f22273a + ", isSelected=" + this.f22274b + ")";
    }
}
