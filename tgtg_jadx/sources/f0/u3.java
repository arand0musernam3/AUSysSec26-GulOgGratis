package f0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u3 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f4 f16922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f16923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0.v f16924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k0 f16925d;

    public u3(f4 f4Var, List list, i0.v vVar, k0 k0Var) {
        this.f16922a = f4Var;
        this.f16923b = list;
        this.f16924c = vVar;
        this.f16925d = k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return Intrinsics.areEqual(this.f16922a, u3Var.f16922a) && Intrinsics.areEqual(this.f16923b, u3Var.f16923b) && Intrinsics.areEqual(this.f16924c, u3Var.f16924c) && Intrinsics.areEqual(this.f16925d, u3Var.f16925d);
    }

    public final int hashCode() {
        return this.f16925d.hashCode() + r8.k.e((this.f16924c.hashCode() + e0.f.c(this.f16923b, this.f16922a.hashCode() * 31, 31)) * 31, 31, false);
    }

    public final String toString() {
        return "RequestOpen(virtualCamera=" + this.f16922a + ", sharedCameraIds=" + this.f16923b + ", graphListener=" + this.f16924c + ", isPrewarm=false, isForegroundObserver=" + this.f16925d + ')';
    }
}
