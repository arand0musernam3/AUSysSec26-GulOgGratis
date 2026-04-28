package i6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final double[] f23387s = new double[91];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f23388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f23389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f23390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f23391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f23392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f23393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f23394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f23395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f23396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f23397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f23398k;
    public double l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f23399m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f23400n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double f23401o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double f23402p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f23403q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f23404r;

    public final double a() {
        double d3 = this.f23397j * this.f23402p;
        double dHypot = this.f23400n / Math.hypot(d3, (-this.f23398k) * this.f23401o);
        return this.f23403q ? (-d3) * dHypot : d3 * dHypot;
    }

    public final double b() {
        double d3 = this.f23397j * this.f23402p;
        double d11 = (-this.f23398k) * this.f23401o;
        double dHypot = this.f23400n / Math.hypot(d3, d11);
        return this.f23403q ? (-d11) * dHypot : d11 * dHypot;
    }

    public final double c(double d3) {
        double d11 = (d3 - this.f23390c) * this.f23396i;
        double d12 = this.f23392e;
        return ((this.f23393f - d12) * d11) + d12;
    }

    public final double d(double d3) {
        double d11 = (d3 - this.f23390c) * this.f23396i;
        double d12 = this.f23394g;
        return ((this.f23395h - d12) * d11) + d12;
    }

    public final double e() {
        return (this.f23397j * this.f23401o) + this.l;
    }

    public final double f() {
        return (this.f23398k * this.f23402p) + this.f23399m;
    }

    public final void g(double d3) {
        double d11 = (this.f23403q ? this.f23391d - d3 : d3 - this.f23390c) * this.f23396i;
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            d12 = 1.0d;
            if (d11 < 1.0d) {
                double[] dArr = this.f23388a;
                double length = d11 * ((double) (dArr.length - 1));
                int i11 = (int) length;
                double d13 = dArr[i11];
                d12 = ((dArr[i11 + 1] - d13) * (length - ((double) i11))) + d13;
            }
        }
        double d14 = d12 * 1.5707963267948966d;
        this.f23401o = Math.sin(d14);
        this.f23402p = Math.cos(d14);
    }
}
