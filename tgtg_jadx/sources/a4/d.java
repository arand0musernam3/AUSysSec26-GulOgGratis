package a4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f683b;

    public d(int i11, nx.d dVar, Integer num) {
        this.f682a = i11;
        this.f683b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f682a == dVar.f682a && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f683b, dVar.f683b);
    }

    public final int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f682a) * 31) + 0) * 31;
        Integer num = this.f683b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f682a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.f683b + ')';
    }
}
