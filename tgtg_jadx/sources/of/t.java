package of;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f32531a;

    public t(p pVar) {
        this.f32531a = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.areEqual(this.f32531a, ((t) obj).f32531a);
    }

    public final int hashCode() {
        return this.f32531a.hashCode();
    }

    public final String toString() {
        return "SaveSnapshot(snapshot=" + this.f32531a + ')';
    }
}
