package m3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f29444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f29445b;

    public t0(Integer num, Object obj) {
        this.f29444a = num;
        this.f29445b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.areEqual(this.f29444a, t0Var.f29444a) && Intrinsics.areEqual(this.f29445b, t0Var.f29445b);
    }

    public final int hashCode() {
        int iHashCode = this.f29444a.hashCode() * 31;
        Object obj = this.f29445b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f29444a + ", right=" + this.f29445b + ')';
    }
}
