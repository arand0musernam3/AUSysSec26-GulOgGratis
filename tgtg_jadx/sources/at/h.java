package at;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends p30.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RuntimeException f4784j;

    public h(RuntimeException runtimeException) {
        super(2);
        this.f4784j = runtimeException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.areEqual(this.f4784j, ((h) obj).f4784j);
    }

    @Override // p30.b
    public final int hashCode() {
        return this.f4784j.hashCode();
    }

    @Override // p30.b
    public final String toString() {
        return "ReceivedError(error=" + this.f4784j + ")";
    }
}
