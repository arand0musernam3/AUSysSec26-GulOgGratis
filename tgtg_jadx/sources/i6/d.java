package i6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f23409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f23410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f23411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f23412h;

    public d(String str) {
        super(0);
        this.f23416b = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f23409e = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i11 = iIndexOf2 + 1;
        int iIndexOf3 = str.indexOf(44, i11);
        this.f23410f = Double.parseDouble(str.substring(i11, iIndexOf3).trim());
        int i12 = iIndexOf3 + 1;
        int iIndexOf4 = str.indexOf(44, i12);
        this.f23411g = Double.parseDouble(str.substring(i12, iIndexOf4).trim());
        int i13 = iIndexOf4 + 1;
        this.f23412h = Double.parseDouble(str.substring(i13, str.indexOf(41, i13)).trim());
    }

    @Override // i6.e
    public final double a(double d3) {
        if (d3 <= 0.0d) {
            return 0.0d;
        }
        if (d3 >= 1.0d) {
            return 1.0d;
        }
        double d11 = 0.5d;
        double d12 = 0.5d;
        while (d11 > 0.01d) {
            d11 *= 0.5d;
            d12 = e(d12) < d3 ? d12 + d11 : d12 - d11;
        }
        double d13 = d12 - d11;
        double dE = e(d13);
        double d14 = d12 + d11;
        double dE2 = e(d14);
        double dF = f(d13);
        return (((d3 - dE) * (f(d14) - dF)) / (dE2 - dE)) + dF;
    }

    @Override // i6.e
    public final double b(double d3) {
        double d11 = 0.5d;
        double d12 = 0.5d;
        while (d11 > 1.0E-4d) {
            d11 *= 0.5d;
            d12 = e(d12) < d3 ? d12 + d11 : d12 - d11;
        }
        double d13 = d12 - d11;
        double d14 = d12 + d11;
        return (f(d14) - f(d13)) / (e(d14) - e(d13));
    }

    public final double e(double d3) {
        double d11 = 1.0d - d3;
        double d12 = 3.0d * d11;
        double d13 = d11 * d12 * d3;
        double d14 = d12 * d3 * d3;
        return (this.f23411g * d14) + (this.f23409e * d13) + (d3 * d3 * d3);
    }

    public final double f(double d3) {
        double d11 = 1.0d - d3;
        double d12 = 3.0d * d11;
        double d13 = d11 * d12 * d3;
        double d14 = d12 * d3 * d3;
        return (this.f23412h * d14) + (this.f23410f * d13) + (d3 * d3 * d3);
    }
}
