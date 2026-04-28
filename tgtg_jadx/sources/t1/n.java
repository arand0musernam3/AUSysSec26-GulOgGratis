package t1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f39496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f39497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f39498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f39499d;

    public n(float f11, float f12, float f13, float f14) {
        this.f39496a = f11;
        this.f39497b = f12;
        this.f39498c = f13;
        this.f39499d = f14;
    }

    @Override // t1.o
    public final float a(int i11) {
        if (i11 == 0) {
            return this.f39496a;
        }
        if (i11 == 1) {
            return this.f39497b;
        }
        if (i11 == 2) {
            return this.f39498c;
        }
        if (i11 != 3) {
            return 0.0f;
        }
        return this.f39499d;
    }

    @Override // t1.o
    public final int b() {
        return 4;
    }

    @Override // t1.o
    public final o c() {
        return new n(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // t1.o
    public final void d() {
        this.f39496a = 0.0f;
        this.f39497b = 0.0f;
        this.f39498c = 0.0f;
        this.f39499d = 0.0f;
    }

    @Override // t1.o
    public final void e(float f11, int i11) {
        if (i11 == 0) {
            this.f39496a = f11;
            return;
        }
        if (i11 == 1) {
            this.f39497b = f11;
        } else if (i11 == 2) {
            this.f39498c = f11;
        } else {
            if (i11 != 3) {
                return;
            }
            this.f39499d = f11;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return nVar.f39496a == this.f39496a && nVar.f39497b == this.f39497b && nVar.f39498c == this.f39498c && nVar.f39499d == this.f39499d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39499d) + r8.k.a(r8.k.a(Float.hashCode(this.f39496a) * 31, this.f39497b, 31), this.f39498c, 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f39496a + ", v2 = " + this.f39497b + ", v3 = " + this.f39498c + ", v4 = " + this.f39499d;
    }
}
