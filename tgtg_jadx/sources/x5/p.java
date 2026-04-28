package x5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f43859c = new p(1.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f43860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f43861b;

    public p(float f11, float f12) {
        this.f43860a = f11;
        this.f43861b = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f43860a == pVar.f43860a && this.f43861b == pVar.f43861b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f43861b) + (Float.hashCode(this.f43860a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f43860a);
        sb2.append(", skewX=");
        return r8.k.n(sb2, this.f43861b, ')');
    }
}
