package gj;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20501a;

    public i(int i11) {
        this.f20501a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f20501a == ((i) obj).f20501a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20501a);
    }

    public final String toString() {
        return r8.k.h(this.f20501a, "CollectionTimeStartChanged(hour=", ")");
    }
}
