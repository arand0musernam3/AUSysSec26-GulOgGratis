package p4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34426c;

    public z(float f11) {
        super(3);
        this.f34426c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Float.compare(this.f34426c, ((z) obj).f34426c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34426c);
    }

    public final String toString() {
        return r8.k.n(new StringBuilder("RelativeVerticalTo(dy="), this.f34426c, ')');
    }
}
