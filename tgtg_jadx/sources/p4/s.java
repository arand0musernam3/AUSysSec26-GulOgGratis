package p4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f34406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f34407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f34408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f34409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f34410h;

    public s(float f11, float f12, float f13, float f14, float f15, float f16) {
        super(2);
        this.f34405c = f11;
        this.f34406d = f12;
        this.f34407e = f13;
        this.f34408f = f14;
        this.f34409g = f15;
        this.f34410h = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f34405c, sVar.f34405c) == 0 && Float.compare(this.f34406d, sVar.f34406d) == 0 && Float.compare(this.f34407e, sVar.f34407e) == 0 && Float.compare(this.f34408f, sVar.f34408f) == 0 && Float.compare(this.f34409g, sVar.f34409g) == 0 && Float.compare(this.f34410h, sVar.f34410h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34410h) + r8.k.a(r8.k.a(r8.k.a(r8.k.a(Float.hashCode(this.f34405c) * 31, this.f34406d, 31), this.f34407e, 31), this.f34408f, 31), this.f34409g, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
        sb2.append(this.f34405c);
        sb2.append(", dy1=");
        sb2.append(this.f34406d);
        sb2.append(", dx2=");
        sb2.append(this.f34407e);
        sb2.append(", dy2=");
        sb2.append(this.f34408f);
        sb2.append(", dx3=");
        sb2.append(this.f34409g);
        sb2.append(", dy3=");
        return r8.k.n(sb2, this.f34410h, ')');
    }
}
