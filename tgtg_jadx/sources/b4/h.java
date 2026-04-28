package b4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5699a;

    public h(float f11) {
        this.f5699a = f11;
    }

    @Override // b4.f
    public final long a(long j9, long j11, z5.m mVar) {
        long j12 = (((long) (((int) (j11 >> 32)) - ((int) (j9 >> 32)))) << 32) | (((long) (((int) (j11 & 4294967295L)) - ((int) (j9 & 4294967295L)))) & 4294967295L);
        float f11 = 1;
        float f12 = (this.f5699a + f11) * (((int) (j12 >> 32)) / 2.0f);
        return (((long) Math.round((f11 - 1.0f) * (((int) (j12 & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) Math.round(f12)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Float.compare(this.f5699a, ((h) obj).f5699a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f5699a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f5699a + ", verticalBias=-1.0)";
    }
}
