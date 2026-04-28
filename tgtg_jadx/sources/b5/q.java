package b5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f5925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f5926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f5927d;

    public q(float f11, float f12, float f13, float f14) {
        this.f5924a = f11;
        this.f5925b = f12;
        this.f5926c = f13;
        this.f5927d = f14;
        if (f11 < 0.0f) {
            y4.a.a("Left must be non-negative");
        }
        if (f12 < 0.0f) {
            y4.a.a("Top must be non-negative");
        }
        if (f13 < 0.0f) {
            y4.a.a("Right must be non-negative");
        }
        if (f14 >= 0.0f) {
            return;
        }
        y4.a.a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return z5.f.c(this.f5924a, qVar.f5924a) && z5.f.c(this.f5925b, qVar.f5925b) && z5.f.c(this.f5926c, qVar.f5926c) && z5.f.c(this.f5927d, qVar.f5927d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + r8.k.a(r8.k.a(r8.k.a(Float.hashCode(this.f5924a) * 31, this.f5925b, 31), this.f5926c, 31), this.f5927d, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DpTouchBoundsExpansion(start=");
        r8.k.u(this.f5924a, ", top=", sb2);
        r8.k.u(this.f5925b, ", end=", sb2);
        r8.k.u(this.f5926c, ", bottom=", sb2);
        sb2.append((Object) z5.f.d(this.f5927d));
        sb2.append(", isLayoutDirectionAware=true)");
        return sb2.toString();
    }
}
