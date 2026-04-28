package x80;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f44076a;

    public n(Throwable th2) {
        this.f44076a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return Intrinsics.areEqual(this.f44076a, ((n) obj).f44076a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f44076a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override // x80.o
    public final String toString() {
        return "Closed(" + this.f44076a + ')';
    }
}
