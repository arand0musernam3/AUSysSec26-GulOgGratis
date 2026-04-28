package b4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5698a;

    public g(float f11) {
        this.f5698a = f11;
    }

    @Override // b4.e
    public final int a(int i11, int i12, z5.m mVar) {
        return e0.f.a(1, this.f5698a, (i12 - i11) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Float.compare(this.f5698a, ((g) obj).f5698a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5698a);
    }

    public final String toString() {
        return r8.k.n(new StringBuilder("Horizontal(bias="), this.f5698a, ')');
    }
}
