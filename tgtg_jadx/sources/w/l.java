package w;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0.h0 f42714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0.e f42715b;

    public l(s0.h0 h0Var, m0.e eVar) {
        h0Var.getClass();
        this.f42714a = h0Var;
        this.f42715b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f42714a == lVar.f42714a && Intrinsics.areEqual(this.f42715b, lVar.f42715b);
    }

    public final int hashCode() {
        int iHashCode = this.f42714a.hashCode() * 31;
        m0.e eVar = this.f42715b;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "CombinedCameraState(state=" + this.f42714a + ", error=" + this.f42715b + ')';
    }
}
