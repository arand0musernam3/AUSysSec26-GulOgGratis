package at;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RuntimeException f4771a;

    public d0(RuntimeException runtimeException) {
        this.f4771a = runtimeException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.areEqual(this.f4771a, ((d0) obj).f4771a);
    }

    public final int hashCode() {
        return this.f4771a.hashCode();
    }

    public final String toString() {
        return "Error(throwable=" + this.f4771a + ")";
    }
}
