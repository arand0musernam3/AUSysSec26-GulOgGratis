package p4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f34421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f34422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f34423f;

    public x(float f11, float f12, float f13, float f14) {
        super(2);
        this.f34420c = f11;
        this.f34421d = f12;
        this.f34422e = f13;
        this.f34423f = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f34420c, xVar.f34420c) == 0 && Float.compare(this.f34421d, xVar.f34421d) == 0 && Float.compare(this.f34422e, xVar.f34422e) == 0 && Float.compare(this.f34423f, xVar.f34423f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34423f) + r8.k.a(r8.k.a(Float.hashCode(this.f34420c) * 31, this.f34421d, 31), this.f34422e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb2.append(this.f34420c);
        sb2.append(", dy1=");
        sb2.append(this.f34421d);
        sb2.append(", dx2=");
        sb2.append(this.f34422e);
        sb2.append(", dy2=");
        return r8.k.n(sb2, this.f34423f, ')');
    }
}
