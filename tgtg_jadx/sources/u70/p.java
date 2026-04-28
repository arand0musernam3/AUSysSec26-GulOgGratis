package u70;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f40849a;

    public p(Throwable th2) {
        th2.getClass();
        this.f40849a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return Intrinsics.areEqual(this.f40849a, ((p) obj).f40849a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40849a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f40849a + ')';
    }
}
