package i6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f23431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f23432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f23433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f23434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f23435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f23436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f23437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f23438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23439i;

    @Override // i6.l
    public final boolean a() {
        double d3 = ((double) this.f23435e) - this.f23433c;
        double d11 = this.f23432b;
        double d12 = this.f23436f;
        return Math.sqrt((((d11 * d3) * d3) + ((d12 * d12) * ((double) this.f23437g))) / d11) <= ((double) this.f23438h);
    }

    @Override // i6.l
    public final float b() {
        return 0.0f;
    }

    @Override // i6.l
    public final float getInterpolation(float f11) {
        double d3 = f11 - this.f23434d;
        if (d3 > 0.0d) {
            double d11 = this.f23432b;
            double d12 = this.f23431a;
            int iSqrt = (int) ((9.0d / ((Math.sqrt(d11 / ((double) this.f23437g)) * d3) * 4.0d)) + 1.0d);
            double d13 = d3 / ((double) iSqrt);
            int i11 = 0;
            while (i11 < iSqrt) {
                float f12 = this.f23435e;
                double d14 = f12;
                double d15 = this.f23433c;
                double d16 = d13;
                float f13 = this.f23436f;
                double d17 = f13;
                double d18 = ((-d11) * (d14 - d15)) - (d12 * d17);
                double d19 = this.f23437g;
                double d21 = (((d18 / d19) * d16) / 2.0d) + d17;
                double d22 = ((((-((((d16 * d21) / 2.0d) + d14) - d15)) * d11) - (d21 * d12)) / d19) * d16;
                float f14 = f13 + ((float) d22);
                this.f23436f = f14;
                float f15 = f12 + ((float) (((d22 / 2.0d) + d17) * d16));
                this.f23435e = f15;
                int i12 = this.f23439i;
                if (i12 > 0) {
                    if (f15 < 0.0f && (i12 & 1) == 1) {
                        this.f23435e = -f15;
                        this.f23436f = -f14;
                    }
                    float f16 = this.f23435e;
                    if (f16 > 1.0f && (i12 & 2) == 2) {
                        this.f23435e = 2.0f - f16;
                        this.f23436f = -this.f23436f;
                    }
                }
                i11++;
                d13 = d16;
            }
        }
        this.f23434d = f11;
        if (a()) {
            this.f23435e = (float) this.f23433c;
        }
        return this.f23435e;
    }
}
