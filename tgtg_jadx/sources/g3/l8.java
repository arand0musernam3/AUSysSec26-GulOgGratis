package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f19040c;

    public l8(float f11, float f12, float f13) {
        this.f19038a = f11;
        this.f19039b = f12;
        this.f19040c = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8)) {
            return false;
        }
        l8 l8Var = (l8) obj;
        return z5.f.c(this.f19038a, l8Var.f19038a) && z5.f.c(this.f19039b, l8Var.f19039b) && z5.f.c(this.f19040c, l8Var.f19040c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f19040c) + r8.k.a(Float.hashCode(this.f19038a) * 31, this.f19039b, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabPosition(left=");
        float f11 = this.f19038a;
        r8.k.u(f11, ", right=", sb2);
        float f12 = this.f19039b;
        sb2.append((Object) z5.f.d(f11 + f12));
        sb2.append(", width=");
        sb2.append((Object) z5.f.d(f12));
        sb2.append(", contentWidth=");
        sb2.append((Object) z5.f.d(this.f19040c));
        sb2.append(')');
        return sb2.toString();
    }
}
