package z5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f47272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f47273b;

    public d(float f11, float f12) {
        this.f47272a = f11;
        this.f47273b = f12;
    }

    @Override // z5.c
    public final float X() {
        return this.f47273b;
    }

    @Override // z5.c
    public final float a() {
        return this.f47272a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f47272a, dVar.f47272a) == 0 && Float.compare(this.f47273b, dVar.f47273b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f47273b) + (Float.hashCode(this.f47272a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.f47272a);
        sb2.append(", fontScale=");
        return r8.k.n(sb2, this.f47273b, ')');
    }
}
