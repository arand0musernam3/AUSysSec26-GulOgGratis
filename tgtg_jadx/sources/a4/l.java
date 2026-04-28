package a4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f689b;

    public l(Integer num, int i11) {
        this.f688a = i11;
        this.f689b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f688a == lVar.f688a && Intrinsics.areEqual(this.f689b, lVar.f689b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f688a) * 31;
        Integer num = this.f689b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f688a + ", dataOffset=" + this.f689b + ')';
    }
}
