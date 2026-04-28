package nj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f30958a;

    public v(Throwable th2) {
        th2.getClass();
        this.f30958a = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.areEqual(this.f30958a, ((v) obj).f30958a);
    }

    public final int hashCode() {
        return this.f30958a.hashCode();
    }

    public final String toString() {
        return e0.f.l("Error(throwable=", ")", this.f30958a);
    }
}
