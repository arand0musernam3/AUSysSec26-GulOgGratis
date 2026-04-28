package a90;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class z implements kotlin.coroutines.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f1060a;

    public z(ThreadLocal threadLocal) {
        this.f1060a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.areEqual(this.f1060a, ((z) obj).f1060a);
    }

    public final int hashCode() {
        return this.f1060a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f1060a + ')';
    }
}
