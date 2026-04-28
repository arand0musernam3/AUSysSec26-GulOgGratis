package ud;

import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41055a;

    public /* synthetic */ a(int i11) {
        this.f41055a = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f41055a == ((a) obj).f41055a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41055a);
    }

    public final String toString() {
        return k.h(this.f41055a, "Pixels(px=", ")");
    }
}
