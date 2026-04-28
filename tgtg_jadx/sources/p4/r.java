package p4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f34399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f34400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f34401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f34402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f34403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f34404i;

    public r(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
        super(3);
        this.f34398c = f11;
        this.f34399d = f12;
        this.f34400e = f13;
        this.f34401f = z11;
        this.f34402g = z12;
        this.f34403h = f14;
        this.f34404i = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f34398c, rVar.f34398c) == 0 && Float.compare(this.f34399d, rVar.f34399d) == 0 && Float.compare(this.f34400e, rVar.f34400e) == 0 && this.f34401f == rVar.f34401f && this.f34402g == rVar.f34402g && Float.compare(this.f34403h, rVar.f34403h) == 0 && Float.compare(this.f34404i, rVar.f34404i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34404i) + r8.k.a(r8.k.e(r8.k.e(r8.k.a(r8.k.a(Float.hashCode(this.f34398c) * 31, this.f34399d, 31), this.f34400e, 31), 31, this.f34401f), 31, this.f34402g), this.f34403h, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb2.append(this.f34398c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f34399d);
        sb2.append(", theta=");
        sb2.append(this.f34400e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f34401f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f34402g);
        sb2.append(", arcStartDx=");
        sb2.append(this.f34403h);
        sb2.append(", arcStartDy=");
        return r8.k.n(sb2, this.f34404i, ')');
    }
}
