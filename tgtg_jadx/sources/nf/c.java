package nf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f30824a;

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return Intrinsics.areEqual(this.f30824a, ((c) obj).f30824a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f30824a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Pending(value=" + this.f30824a + ')';
    }
}
