package ad;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f1224a;

    public e(h hVar) {
        this.f1224a = hVar;
    }

    @Override // ad.i
    public final Object a(pc.f fVar) {
        return this.f1224a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return Intrinsics.areEqual(this.f1224a, ((e) obj).f1224a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1224a.hashCode();
    }
}
