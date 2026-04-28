package m3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f29314a;

    public /* synthetic */ k2(n nVar) {
        this.f29314a = nVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k2) {
            return Intrinsics.areEqual(this.f29314a, ((k2) obj).f29314a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29314a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f29314a + ')';
    }
}
