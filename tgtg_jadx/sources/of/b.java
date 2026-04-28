package of;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f32483a;

    public b(n nVar) {
        this.f32483a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(this.f32483a, ((b) obj).f32483a);
    }

    public final int hashCode() {
        return this.f32483a.hashCode();
    }

    public final String toString() {
        return "AppendEvent(event=" + this.f32483a + ')';
    }
}
