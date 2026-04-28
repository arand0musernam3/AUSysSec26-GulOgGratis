package t1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f39482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f39483b;

    public l(float f11, float f12) {
        this.f39482a = f11;
        this.f39483b = f12;
    }

    @Override // t1.o
    public final float a(int i11) {
        if (i11 == 0) {
            return this.f39482a;
        }
        if (i11 != 1) {
            return 0.0f;
        }
        return this.f39483b;
    }

    @Override // t1.o
    public final int b() {
        return 2;
    }

    @Override // t1.o
    public final o c() {
        return new l(0.0f, 0.0f);
    }

    @Override // t1.o
    public final void d() {
        this.f39482a = 0.0f;
        this.f39483b = 0.0f;
    }

    @Override // t1.o
    public final void e(float f11, int i11) {
        if (i11 == 0) {
            this.f39482a = f11;
        } else {
            if (i11 != 1) {
                return;
            }
            this.f39483b = f11;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.f39482a == this.f39482a && lVar.f39483b == this.f39483b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39483b) + (Float.hashCode(this.f39482a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f39482a + ", v2 = " + this.f39483b;
    }
}
