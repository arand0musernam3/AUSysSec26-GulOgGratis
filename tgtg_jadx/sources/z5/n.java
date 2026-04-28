package z5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements a6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f47287a;

    public n(float f11) {
        this.f47287a = f11;
    }

    @Override // a6.a
    public final float a(float f11) {
        return f11 / this.f47287a;
    }

    @Override // a6.a
    public final float b(float f11) {
        return f11 * this.f47287a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Float.compare(this.f47287a, ((n) obj).f47287a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f47287a);
    }

    public final String toString() {
        return r8.k.n(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f47287a, ')');
    }
}
