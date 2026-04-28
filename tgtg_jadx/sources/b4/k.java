package b4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f5703b;

    public k(float f11, float f12) {
        this.f5702a = f11;
        this.f5703b = f12;
    }

    @Override // b4.f
    public final long a(long j9, long j11, z5.m mVar) {
        float f11 = (((int) (j11 >> 32)) - ((int) (j9 >> 32))) / 2.0f;
        float f12 = (((int) (j11 & 4294967295L)) - ((int) (j9 & 4294967295L))) / 2.0f;
        z5.m mVar2 = z5.m.Ltr;
        float f13 = this.f5702a;
        if (mVar != mVar2) {
            f13 *= -1;
        }
        float f14 = 1;
        float f15 = (f13 + f14) * f11;
        return (((long) Math.round((f14 + this.f5703b) * f12)) & 4294967295L) | (((long) Math.round(f15)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Float.compare(this.f5702a, kVar.f5702a) == 0 && Float.compare(this.f5703b, kVar.f5703b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5703b) + (Float.hashCode(this.f5702a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f5702a);
        sb2.append(", verticalBias=");
        return r8.k.n(sb2, this.f5703b, ')');
    }
}
