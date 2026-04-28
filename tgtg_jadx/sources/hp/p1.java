package hp;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f22317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22318b;

    public p1(g gVar, long j9) {
        gVar.getClass();
        this.f22317a = gVar;
        this.f22318b = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return Intrinsics.areEqual(this.f22317a, p1Var.f22317a) && this.f22318b == p1Var.f22318b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22318b) + (this.f22317a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewedRecipeWithTimestamp(recipe=" + this.f22317a + ", viewedAt=" + this.f22318b + ")";
    }
}
