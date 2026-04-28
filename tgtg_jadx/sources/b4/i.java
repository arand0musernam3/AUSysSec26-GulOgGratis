package b4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5700a;

    public i(float f11) {
        this.f5700a = f11;
    }

    @Override // b4.e
    public final int a(int i11, int i12, z5.m mVar) {
        float f11 = (i12 - i11) / 2.0f;
        z5.m mVar2 = z5.m.Ltr;
        float f12 = this.f5700a;
        if (mVar != mVar2) {
            f12 *= -1;
        }
        return e0.f.a(1, f12, f11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Float.compare(this.f5700a, ((i) obj).f5700a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5700a);
    }

    public final String toString() {
        return r8.k.n(new StringBuilder("Horizontal(bias="), this.f5700a, ')');
    }
}
