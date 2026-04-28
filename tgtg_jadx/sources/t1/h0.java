package t1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f39452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f39453b;

    public h0(Float f11, u uVar) {
        this.f39452a = f11;
        this.f39453b = uVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.areEqual((Object) h0Var.f39452a, (Object) this.f39452a) && Intrinsics.areEqual(h0Var.f39453b, this.f39453b);
    }

    public final int hashCode() {
        return this.f39453b.hashCode() + r8.k.b(0, this.f39452a.hashCode() * 31, 31);
    }
}
