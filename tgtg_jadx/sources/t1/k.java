package t1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f39470a;

    public k(float f11) {
        this.f39470a = f11;
    }

    @Override // t1.o
    public final float a(int i11) {
        if (i11 == 0) {
            return this.f39470a;
        }
        return 0.0f;
    }

    @Override // t1.o
    public final int b() {
        return 1;
    }

    @Override // t1.o
    public final o c() {
        return new k(0.0f);
    }

    @Override // t1.o
    public final void d() {
        this.f39470a = 0.0f;
    }

    @Override // t1.o
    public final void e(float f11, int i11) {
        if (i11 == 0) {
            this.f39470a = f11;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k) && ((k) obj).f39470a == this.f39470a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39470a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f39470a;
    }
}
