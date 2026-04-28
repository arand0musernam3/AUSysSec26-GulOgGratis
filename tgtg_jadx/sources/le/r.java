package le;

import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27750a;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return Intrinsics.areEqual(this.f27750a, ((r) obj).f27750a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27750a.hashCode();
    }

    public final String toString() {
        return a0.p("Url(url=", this.f27750a, ")");
    }
}
