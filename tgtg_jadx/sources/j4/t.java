package j4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f24600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f24601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f24602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f24603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f24604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f24605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f24606g;

    public t(double d3, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f24600a = d3;
        this.f24601b = d11;
        this.f24602c = d12;
        this.f24603d = d13;
        this.f24604e = d14;
        this.f24605f = d15;
        this.f24606g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d3)) {
            i4.a.f("Parameters cannot be NaN");
            throw null;
        }
        if (d3 == -2.0d || d3 == -3.0d) {
            return;
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d3 == 0.0d)) {
            i4.a.f("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            i4.a.f("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d11 == 0.0d || d3 == 0.0d) && d13 == 0.0d) {
            i4.a.f("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d13 < 0.0d) {
            i4.a.f("The transfer function must be increasing");
            throw null;
        }
        if (d11 < 0.0d || d3 < 0.0d) {
            i4.a.f("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Double.compare(this.f24600a, tVar.f24600a) == 0 && Double.compare(this.f24601b, tVar.f24601b) == 0 && Double.compare(this.f24602c, tVar.f24602c) == 0 && Double.compare(this.f24603d, tVar.f24603d) == 0 && Double.compare(this.f24604e, tVar.f24604e) == 0 && Double.compare(this.f24605f, tVar.f24605f) == 0 && Double.compare(this.f24606g, tVar.f24606g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f24606g) + s.b(this.f24605f, s.b(this.f24604e, s.b(this.f24603d, s.b(this.f24602c, s.b(this.f24601b, Double.hashCode(this.f24600a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f24600a + ", a=" + this.f24601b + ", b=" + this.f24602c + ", c=" + this.f24603d + ", d=" + this.f24604e + ", e=" + this.f24605f + ", f=" + this.f24606g + ')';
    }

    public /* synthetic */ t(double d3, double d11, double d12, double d13, double d14) {
        this(d3, d11, d12, d13, d14, 0.0d, 0.0d);
    }
}
