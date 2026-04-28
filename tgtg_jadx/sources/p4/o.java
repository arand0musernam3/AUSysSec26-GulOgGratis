package p4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f34389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f34390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f34391f;

    public o(float f11, float f12, float f13, float f14) {
        super(1);
        this.f34388c = f11;
        this.f34389d = f12;
        this.f34390e = f13;
        this.f34391f = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f34388c, oVar.f34388c) == 0 && Float.compare(this.f34389d, oVar.f34389d) == 0 && Float.compare(this.f34390e, oVar.f34390e) == 0 && Float.compare(this.f34391f, oVar.f34391f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34391f) + r8.k.a(r8.k.a(Float.hashCode(this.f34388c) * 31, this.f34389d, 31), this.f34390e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
        sb2.append(this.f34388c);
        sb2.append(", y1=");
        sb2.append(this.f34389d);
        sb2.append(", x2=");
        sb2.append(this.f34390e);
        sb2.append(", y2=");
        return r8.k.n(sb2, this.f34391f, ')');
    }
}
