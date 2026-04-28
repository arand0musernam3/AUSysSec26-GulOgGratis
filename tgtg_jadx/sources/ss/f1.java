package ss;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f1 extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f39175a;

    public f1(Throwable th2) {
        th2.getClass();
        this.f39175a = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && Intrinsics.areEqual(this.f39175a, ((f1) obj).f39175a);
    }

    public final int hashCode() {
        return this.f39175a.hashCode();
    }

    public final String toString() {
        return e0.f.l("Error(throwable=", ")", this.f39175a);
    }
}
