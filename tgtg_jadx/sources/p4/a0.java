package p4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34249c;

    public a0(float f11) {
        super(3);
        this.f34249c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Float.compare(this.f34249c, ((a0) obj).f34249c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34249c);
    }

    public final String toString() {
        return r8.k.n(new StringBuilder("VerticalTo(y="), this.f34249c, ')');
    }
}
