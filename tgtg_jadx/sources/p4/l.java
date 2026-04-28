package p4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34383c;

    public l(float f11) {
        super(3);
        this.f34383c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.f34383c, ((l) obj).f34383c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34383c);
    }

    public final String toString() {
        return r8.k.n(new StringBuilder("HorizontalTo(x="), this.f34383c, ')');
    }
}
