package nk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p0 extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f31032a;

    public p0(Throwable th2) {
        th2.getClass();
        this.f31032a = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && Intrinsics.areEqual(this.f31032a, ((p0) obj).f31032a);
    }

    public final int hashCode() {
        return this.f31032a.hashCode();
    }

    public final String toString() {
        return e0.f.l("Error(error=", ")", this.f31032a);
    }
}
