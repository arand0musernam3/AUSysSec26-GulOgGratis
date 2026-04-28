package p4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34411c;

    public t(float f11) {
        super(3);
        this.f34411c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Float.compare(this.f34411c, ((t) obj).f34411c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34411c);
    }

    public final String toString() {
        return r8.k.n(new StringBuilder("RelativeHorizontalTo(dx="), this.f34411c, ')');
    }
}
