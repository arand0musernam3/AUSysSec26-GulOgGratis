package ty;

import b3.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f40611a;

    public b(Integer num) {
        this.f40611a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.f40611a.equals(((b) obj).f40611a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40611a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return i.m(new StringBuilder("ProductData{productId="), this.f40611a, "}");
    }
}
