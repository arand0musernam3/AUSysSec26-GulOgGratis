package g3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d6.k0 f19692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19694c;

    public w3(boolean z11, int i11) {
        z11 = (i11 & 1) != 0 ? true : z11;
        this.f19692a = d6.k0.Inherit;
        this.f19693b = z11;
        this.f19694c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj;
        return this.f19692a == w3Var.f19692a && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && this.f19694c == w3Var.f19694c && this.f19693b == w3Var.f19693b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19694c) + r8.k.e(this.f19692a.hashCode() * 31, 29791, this.f19693b);
    }
}
