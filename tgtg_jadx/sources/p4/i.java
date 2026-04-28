package p4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f34351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f34352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f34353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f34354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f34355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f34356i;

    public i(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
        super(3);
        this.f34350c = f11;
        this.f34351d = f12;
        this.f34352e = f13;
        this.f34353f = z11;
        this.f34354g = z12;
        this.f34355h = f14;
        this.f34356i = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f34350c, iVar.f34350c) == 0 && Float.compare(this.f34351d, iVar.f34351d) == 0 && Float.compare(this.f34352e, iVar.f34352e) == 0 && this.f34353f == iVar.f34353f && this.f34354g == iVar.f34354g && Float.compare(this.f34355h, iVar.f34355h) == 0 && Float.compare(this.f34356i, iVar.f34356i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34356i) + r8.k.a(r8.k.e(r8.k.e(r8.k.a(r8.k.a(Float.hashCode(this.f34350c) * 31, this.f34351d, 31), this.f34352e, 31), 31, this.f34353f), 31, this.f34354g), this.f34355h, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb2.append(this.f34350c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f34351d);
        sb2.append(", theta=");
        sb2.append(this.f34352e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f34353f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f34354g);
        sb2.append(", arcStartX=");
        sb2.append(this.f34355h);
        sb2.append(", arcStartY=");
        return r8.k.n(sb2, this.f34356i, ')');
    }
}
