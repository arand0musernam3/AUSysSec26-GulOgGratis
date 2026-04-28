package d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f13748d;

    public b2(float f11, float f12, float f13, float f14) {
        this.f13745a = f11;
        this.f13746b = f12;
        this.f13747c = f13;
        this.f13748d = f14;
        if (!((f11 >= 0.0f) & (f12 >= 0.0f) & (f13 >= 0.0f)) || !(f14 >= 0.0f)) {
            e2.a.a("Padding must be non-negative");
        }
    }

    @Override // d2.z1
    public final float a() {
        return this.f13748d;
    }

    @Override // d2.z1
    public final float b(z5.m mVar) {
        return mVar == z5.m.Ltr ? this.f13747c : this.f13745a;
    }

    @Override // d2.z1
    public final float c() {
        return this.f13746b;
    }

    @Override // d2.z1
    public final float d(z5.m mVar) {
        return mVar == z5.m.Ltr ? this.f13745a : this.f13747c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return z5.f.c(this.f13745a, b2Var.f13745a) && z5.f.c(this.f13746b, b2Var.f13746b) && z5.f.c(this.f13747c, b2Var.f13747c) && z5.f.c(this.f13748d, b2Var.f13748d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f13748d) + r8.k.a(r8.k.a(Float.hashCode(this.f13745a) * 31, this.f13746b, 31), this.f13747c, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaddingValues(start=");
        r8.k.u(this.f13745a, ", top=", sb2);
        r8.k.u(this.f13746b, ", end=", sb2);
        r8.k.u(this.f13747c, ", bottom=", sb2);
        sb2.append((Object) z5.f.d(this.f13748d));
        sb2.append(')');
        return sb2.toString();
    }
}
