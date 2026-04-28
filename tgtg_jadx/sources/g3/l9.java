package g3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4.i f19041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b4.i f19042b;

    public l9() {
        b4.i iVar = b4.d.f5694m;
        this.f19041a = iVar;
        this.f19042b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9)) {
            return false;
        }
        l9 l9Var = (l9) obj;
        return Intrinsics.areEqual(this.f19041a, l9Var.f19041a) && Intrinsics.areEqual(this.f19042b, l9Var.f19042b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f19042b.f5700a) + r8.k.a(Boolean.hashCode(false) * 31, this.f19041a.f5700a, 31);
    }

    public final String toString() {
        return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.f19041a + ", expandedAlignment=" + this.f19042b + ')';
    }
}
