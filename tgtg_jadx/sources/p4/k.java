package p4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f34365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f34366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f34367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f34368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f34369h;

    public k(float f11, float f12, float f13, float f14, float f15, float f16) {
        super(2);
        this.f34364c = f11;
        this.f34365d = f12;
        this.f34366e = f13;
        this.f34367f = f14;
        this.f34368g = f15;
        this.f34369h = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Float.compare(this.f34364c, kVar.f34364c) == 0 && Float.compare(this.f34365d, kVar.f34365d) == 0 && Float.compare(this.f34366e, kVar.f34366e) == 0 && Float.compare(this.f34367f, kVar.f34367f) == 0 && Float.compare(this.f34368g, kVar.f34368g) == 0 && Float.compare(this.f34369h, kVar.f34369h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34369h) + r8.k.a(r8.k.a(r8.k.a(r8.k.a(Float.hashCode(this.f34364c) * 31, this.f34365d, 31), this.f34366e, 31), this.f34367f, 31), this.f34368g, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
        sb2.append(this.f34364c);
        sb2.append(", y1=");
        sb2.append(this.f34365d);
        sb2.append(", x2=");
        sb2.append(this.f34366e);
        sb2.append(", y2=");
        sb2.append(this.f34367f);
        sb2.append(", x3=");
        sb2.append(this.f34368g);
        sb2.append(", y3=");
        return r8.k.n(sb2, this.f34369h, ')');
    }
}
