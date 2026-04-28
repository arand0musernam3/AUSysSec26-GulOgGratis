package of;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f32540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f32541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f32542d;

    public w(long j9, double d3, double d11, double d12) {
        this.f32539a = j9;
        this.f32540b = d3;
        this.f32541c = d11;
        this.f32542d = d12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f32539a == wVar.f32539a && Double.compare(this.f32540b, wVar.f32540b) == 0 && Double.compare(this.f32541c, wVar.f32541c) == 0 && Double.compare(this.f32542d, wVar.f32542d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f32542d) + j4.s.b(this.f32541c, j4.s.b(this.f32540b, Long.hashCode(this.f32539a) * 31, 31), 31);
    }

    public final String toString() {
        return "HistogramResult(count=" + this.f32539a + ", min=" + this.f32540b + ", max=" + this.f32541c + ", avg=" + this.f32542d + ')';
    }
}
