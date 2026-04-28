package w4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43096b;

    public a(int i11) {
        this.f43096b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.f43096b == ((a) obj).f43096b;
    }

    public final int hashCode() {
        return this.f43096b;
    }

    public final String toString() {
        return r8.k.o(new StringBuilder("AndroidPointerIcon(type="), this.f43096b, ')');
    }
}
