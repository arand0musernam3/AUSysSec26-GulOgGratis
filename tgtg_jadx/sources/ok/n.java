package ok;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f32614a;

    public n(o0 o0Var) {
        this.f32614a = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.areEqual(this.f32614a, ((n) obj).f32614a);
    }

    public final int hashCode() {
        return this.f32614a.hashCode();
    }

    public final String toString() {
        return "RouterCommands(action=" + this.f32614a + ")";
    }
}
