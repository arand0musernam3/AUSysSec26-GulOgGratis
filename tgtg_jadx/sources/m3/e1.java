package m3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29268a;

    public e1(String str) {
        this.f29268a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1) && Intrinsics.areEqual(this.f29268a, ((e1) obj).f29268a);
    }

    public final int hashCode() {
        return this.f29268a.hashCode();
    }

    public final String toString() {
        return w2.l1.f(new StringBuilder("OpaqueKey(key="), this.f29268a, ')');
    }
}
