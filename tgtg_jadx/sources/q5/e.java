package q5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f36013a;

    public e(a0 a0Var) {
        this.f36013a = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.areEqual(this.f36013a, ((e) obj).f36013a) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        return this.f36013a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.f36013a + ", loaderKey=null)";
    }
}
