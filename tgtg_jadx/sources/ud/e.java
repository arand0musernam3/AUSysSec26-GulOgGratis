package ud;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f41057a;

    public e(h hVar) {
        this.f41057a = hVar;
    }

    @Override // ud.i
    public final Object a(x70.c cVar) {
        return this.f41057a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.areEqual(this.f41057a, ((e) obj).f41057a);
    }

    public final int hashCode() {
        return this.f41057a.hashCode();
    }

    public final String toString() {
        return "RealSizeResolver(size=" + this.f41057a + ")";
    }
}
