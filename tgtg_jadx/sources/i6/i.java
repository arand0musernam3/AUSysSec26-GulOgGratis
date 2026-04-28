package i6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f23429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f23430f;

    @Override // i6.e
    public final double a(double d3) {
        double d11 = this.f23430f;
        double d12 = this.f23429e;
        if (d3 < d11) {
            return (d11 * d3) / (((d11 - d3) * d12) + d3);
        }
        return ((d3 - 1.0d) * (1.0d - d11)) / ((1.0d - d3) - ((d11 - d3) * d12));
    }

    @Override // i6.e
    public final double b(double d3) {
        double d11 = this.f23430f;
        double d12 = this.f23429e;
        if (d3 < d11) {
            double d13 = d12 * d11 * d11;
            double d14 = ((d11 - d3) * d12) + d3;
            return d13 / (d14 * d14);
        }
        double d15 = d11 - 1.0d;
        double d16 = (((d11 - d3) * (-d12)) - d3) + 1.0d;
        return ((d15 * d12) * d15) / (d16 * d16);
    }
}
