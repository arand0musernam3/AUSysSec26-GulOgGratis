package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f18809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f18810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f18811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f18812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f18813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f18814f;

    public i6(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f18809a = f11;
        this.f18810b = f12;
        this.f18811c = f13;
        this.f18812d = f14;
        this.f18813e = f15;
        this.f18814f = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i6)) {
            return false;
        }
        i6 i6Var = (i6) obj;
        return z5.f.c(this.f18809a, i6Var.f18809a) && z5.f.c(this.f18810b, i6Var.f18810b) && z5.f.c(this.f18811c, i6Var.f18811c) && z5.f.c(this.f18812d, i6Var.f18812d) && z5.f.c(this.f18814f, i6Var.f18814f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f18814f) + r8.k.a(r8.k.a(r8.k.a(Float.hashCode(this.f18809a) * 31, this.f18810b, 31), this.f18811c, 31), this.f18812d, 31);
    }
}
