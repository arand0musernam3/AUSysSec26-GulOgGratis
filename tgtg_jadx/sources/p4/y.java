package p4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f34425d;

    public y(float f11, float f12) {
        super(1);
        this.f34424c = f11;
        this.f34425d = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f34424c, yVar.f34424c) == 0 && Float.compare(this.f34425d, yVar.f34425d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34425d) + (Float.hashCode(this.f34424c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb2.append(this.f34424c);
        sb2.append(", dy=");
        return r8.k.n(sb2, this.f34425d, ')');
    }
}
