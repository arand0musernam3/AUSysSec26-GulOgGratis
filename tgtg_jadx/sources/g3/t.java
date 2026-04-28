package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f19492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f19493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f19494e;

    public t(float f11, float f12, float f13, float f14, float f15) {
        this.f19490a = f11;
        this.f19491b = f12;
        this.f19492c = f13;
        this.f19493d = f14;
        this.f19494e = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return z5.f.c(this.f19490a, tVar.f19490a) && z5.f.c(this.f19491b, tVar.f19491b) && z5.f.c(this.f19492c, tVar.f19492c) && z5.f.c(this.f19493d, tVar.f19493d) && z5.f.c(this.f19494e, tVar.f19494e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f19494e) + r8.k.a(r8.k.a(r8.k.a(Float.hashCode(this.f19490a) * 31, this.f19491b, 31), this.f19492c, 31), this.f19493d, 31);
    }
}
