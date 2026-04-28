package t1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f39488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f39489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f39490c;

    public m(float f11, float f12, float f13) {
        this.f39488a = f11;
        this.f39489b = f12;
        this.f39490c = f13;
    }

    @Override // t1.o
    public final float a(int i11) {
        if (i11 == 0) {
            return this.f39488a;
        }
        if (i11 == 1) {
            return this.f39489b;
        }
        if (i11 != 2) {
            return 0.0f;
        }
        return this.f39490c;
    }

    @Override // t1.o
    public final int b() {
        return 3;
    }

    @Override // t1.o
    public final o c() {
        return new m(0.0f, 0.0f, 0.0f);
    }

    @Override // t1.o
    public final void d() {
        this.f39488a = 0.0f;
        this.f39489b = 0.0f;
        this.f39490c = 0.0f;
    }

    @Override // t1.o
    public final void e(float f11, int i11) {
        if (i11 == 0) {
            this.f39488a = f11;
        } else if (i11 == 1) {
            this.f39489b = f11;
        } else {
            if (i11 != 2) {
                return;
            }
            this.f39490c = f11;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f39488a == this.f39488a && mVar.f39489b == this.f39489b && mVar.f39490c == this.f39490c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39490c) + r8.k.a(Float.hashCode(this.f39488a) * 31, this.f39489b, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f39488a + ", v2 = " + this.f39489b + ", v3 = " + this.f39490c;
    }
}
