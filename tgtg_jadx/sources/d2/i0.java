package d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f13811d;

    public i0(float f11, float f12, float f13, float f14) {
        this.f13808a = f11;
        this.f13809b = f12;
        this.f13810c = f13;
        this.f13811d = f14;
    }

    @Override // d2.y2
    public final int a(z5.c cVar, z5.m mVar) {
        return cVar.q0(this.f13808a);
    }

    @Override // d2.y2
    public final int b(z5.c cVar, z5.m mVar) {
        return cVar.q0(this.f13810c);
    }

    @Override // d2.y2
    public final int c(z5.c cVar) {
        return cVar.q0(this.f13811d);
    }

    @Override // d2.y2
    public final int d(z5.c cVar) {
        return cVar.q0(this.f13809b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return z5.f.c(this.f13808a, i0Var.f13808a) && z5.f.c(this.f13809b, i0Var.f13809b) && z5.f.c(this.f13810c, i0Var.f13810c) && z5.f.c(this.f13811d, i0Var.f13811d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f13811d) + r8.k.a(r8.k.a(Float.hashCode(this.f13808a) * 31, this.f13809b, 31), this.f13810c, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets(left=");
        r8.k.u(this.f13808a, ", top=", sb2);
        r8.k.u(this.f13809b, ", right=", sb2);
        r8.k.u(this.f13810c, ", bottom=", sb2);
        sb2.append((Object) z5.f.d(this.f13811d));
        sb2.append(')');
        return sb2.toString();
    }
}
