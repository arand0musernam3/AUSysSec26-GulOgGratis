package t1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f39354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f39355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f39356c;

    public final long a(float f11, float f12, long j9) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f13 = f11 - this.f39354a;
        double d3 = j9 / 1000.0d;
        float f14 = this.f39356c;
        double d11 = ((double) f14) * ((double) f14);
        double d12 = this.f39355b;
        double d13 = ((double) (-f14)) * d12;
        if (f14 > 1.0f) {
            double dSqrt = Math.sqrt(d11 - ((double) 1)) * d12;
            double d14 = d13 + dSqrt;
            double d15 = d13 - dSqrt;
            double d16 = f13;
            double d17 = ((d15 * d16) - ((double) f12)) / (d15 - d14);
            double d18 = d16 - d17;
            double d19 = d15 * d3;
            double d21 = d3 * d14;
            dSin = (Math.exp(d21) * d17) + (Math.exp(d19) * d18);
            dExp = Math.exp(d19) * d18 * d15;
            dExp2 = Math.exp(d21) * d17 * d14;
        } else {
            if (f14 != 1.0f) {
                double d22 = 1;
                double dSqrt2 = Math.sqrt(d22 - d11) * d12;
                double d23 = f13;
                double d24 = (((-d13) * d23) + ((double) f12)) * (d22 / dSqrt2);
                double d25 = dSqrt2 * d3;
                double d26 = d3 * d13;
                dSin = ((Math.sin(d25) * d24) + (Math.cos(d25) * d23)) * Math.exp(d26);
                dCos = (((Math.cos(d25) * dSqrt2 * d24) + (Math.sin(d25) * (-dSqrt2) * d23)) * Math.exp(d26)) + (d13 * dSin);
                return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f39354a))) << 32);
            }
            double d27 = f13;
            double d28 = (d12 * d27) + ((double) f12);
            double d29 = (-d12) * d3;
            double d31 = (d3 * d28) + d27;
            dSin = Math.exp(d29) * d31;
            dExp = Math.exp(d29) * d31 * (-this.f39355b);
            dExp2 = Math.exp(d29) * d28;
        }
        dCos = dExp2 + dExp;
        return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f39354a))) << 32);
    }
}
