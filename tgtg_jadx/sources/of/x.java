package of;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f32544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f32545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f32546d;

    public x(long j9, double d3, double d11, double d12) {
        this.f32543a = j9;
        this.f32544b = d3;
        this.f32545c = d11;
        this.f32546d = d12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f32543a == xVar.f32543a && Double.compare(this.f32544b, xVar.f32544b) == 0 && Double.compare(this.f32545c, xVar.f32545c) == 0 && Double.compare(this.f32546d, xVar.f32546d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f32546d) + j4.s.b(this.f32545c, j4.s.b(this.f32544b, Long.hashCode(this.f32543a) * 31, 31), 31);
    }

    public final String toString() {
        return "HistogramSnapshot(count=" + this.f32543a + ", min=" + this.f32544b + ", max=" + this.f32545c + ", sum=" + this.f32546d + ')';
    }
}
