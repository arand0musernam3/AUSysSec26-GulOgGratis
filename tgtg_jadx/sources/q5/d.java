package q5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f36007a;

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return Intrinsics.areEqual(this.f36007a, ((d) obj).f36007a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f36007a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.f36007a + ')';
    }
}
