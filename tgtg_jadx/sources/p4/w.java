package p4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f34417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f34418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f34419f;

    public w(float f11, float f12, float f13, float f14) {
        super(1);
        this.f34416c = f11;
        this.f34417d = f12;
        this.f34418e = f13;
        this.f34419f = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f34416c, wVar.f34416c) == 0 && Float.compare(this.f34417d, wVar.f34417d) == 0 && Float.compare(this.f34418e, wVar.f34418e) == 0 && Float.compare(this.f34419f, wVar.f34419f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34419f) + r8.k.a(r8.k.a(Float.hashCode(this.f34416c) * 31, this.f34417d, 31), this.f34418e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
        sb2.append(this.f34416c);
        sb2.append(", dy1=");
        sb2.append(this.f34417d);
        sb2.append(", dx2=");
        sb2.append(this.f34418e);
        sb2.append(", dy2=");
        return r8.k.n(sb2, this.f34419f, ')');
    }
}
