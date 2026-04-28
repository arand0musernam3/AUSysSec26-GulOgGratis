package e0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0.a f15401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f15402b;

    public r0(k0.a aVar, k0 k0Var) {
        this.f15401a = aVar;
        this.f15402b = k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.areEqual(this.f15401a, r0Var.f15401a) && Intrinsics.areEqual(this.f15402b, r0Var.f15402b);
    }

    public final int hashCode() {
        return this.f15402b.hashCode() + (this.f15401a.hashCode() * 31);
    }

    public final String toString() {
        return "InputRequest(image=" + this.f15401a + ", frameInfo=" + this.f15402b + ')';
    }
}
