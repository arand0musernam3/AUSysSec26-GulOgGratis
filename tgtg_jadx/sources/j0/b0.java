package j0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24285a;

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            return Intrinsics.areEqual(this.f24285a, ((b0) obj).f24285a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f24285a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "OutputResult(result=" + this.f24285a + ')';
    }
}
