package at;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f4773a;

    public e0(g0 g0Var) {
        this.f4773a = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && Intrinsics.areEqual(this.f4773a, ((e0) obj).f4773a);
    }

    public final int hashCode() {
        return this.f4773a.hashCode();
    }

    public final String toString() {
        return "Loading(lastUpdate=" + this.f4773a + ")";
    }
}
