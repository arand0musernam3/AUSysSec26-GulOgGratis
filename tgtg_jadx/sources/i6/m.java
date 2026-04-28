package i6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f23441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f23442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f23443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f23444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f23445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f23446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f23447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f23448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f23449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23450j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f23451k;
    public float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f23452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f23453n;

    @Override // i6.l
    public final boolean a() {
        return b() < 1.0E-5f && Math.abs(this.f23449i - this.f23452m) < 1.0E-5f;
    }

    @Override // i6.l
    public final float b() {
        boolean z11 = this.f23451k;
        float f11 = this.f23453n;
        return z11 ? -c(f11) : c(f11);
    }

    public final float c(float f11) {
        float f12;
        float f13;
        float f14 = this.f23444d;
        if (f11 <= f14) {
            f12 = this.f23441a;
            f13 = this.f23442b;
        } else {
            int i11 = this.f23450j;
            if (i11 == 1) {
                return 0.0f;
            }
            f11 -= f14;
            f14 = this.f23445e;
            if (f11 >= f14) {
                if (i11 == 2) {
                    return 0.0f;
                }
                float f15 = f11 - f14;
                float f16 = this.f23446f;
                if (f15 >= f16) {
                    return 0.0f;
                }
                float f17 = this.f23443c;
                return f17 - ((f15 * f17) / f16);
            }
            f12 = this.f23442b;
            f13 = this.f23443c;
        }
        return (((f13 - f12) * f11) / f14) + f12;
    }

    public final void d(float f11, float f12, float f13, float f14, float f15) {
        this.f23449i = f12;
        if (f11 == 0.0f) {
            f11 = 1.0E-4f;
        }
        float f16 = f11 / f13;
        float f17 = (f16 * f11) / 2.0f;
        if (f11 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f12 - ((((-f11) / f13) * f11) / 2.0f)) * f13);
            if (fSqrt < f14) {
                this.f23450j = 2;
                this.f23441a = f11;
                this.f23442b = fSqrt;
                this.f23443c = 0.0f;
                float f18 = (fSqrt - f11) / f13;
                this.f23444d = f18;
                this.f23445e = fSqrt / f13;
                this.f23447g = ((f11 + fSqrt) * f18) / 2.0f;
                this.f23448h = f12;
                this.f23449i = f12;
                return;
            }
            this.f23450j = 3;
            this.f23441a = f11;
            this.f23442b = f14;
            this.f23443c = f14;
            float f19 = (f14 - f11) / f13;
            this.f23444d = f19;
            float f20 = f14 / f13;
            this.f23446f = f20;
            float f21 = ((f11 + f14) * f19) / 2.0f;
            float f22 = (f20 * f14) / 2.0f;
            this.f23445e = ((f12 - f21) - f22) / f14;
            this.f23447g = f21;
            this.f23448h = f12 - f22;
            this.f23449i = f12;
            return;
        }
        if (f17 >= f12) {
            this.f23450j = 1;
            this.f23441a = f11;
            this.f23442b = 0.0f;
            this.f23447g = f12;
            this.f23444d = (2.0f * f12) / f11;
            return;
        }
        float f23 = f12 - f17;
        float f24 = f23 / f11;
        if (f24 + f16 < f15) {
            this.f23450j = 2;
            this.f23441a = f11;
            this.f23442b = f11;
            this.f23443c = 0.0f;
            this.f23447g = f23;
            this.f23448h = f12;
            this.f23444d = f24;
            this.f23445e = f16;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f11 * f11) / 2.0f) + (f13 * f12));
        float f25 = (fSqrt2 - f11) / f13;
        this.f23444d = f25;
        float f26 = fSqrt2 / f13;
        this.f23445e = f26;
        if (fSqrt2 < f14) {
            this.f23450j = 2;
            this.f23441a = f11;
            this.f23442b = fSqrt2;
            this.f23443c = 0.0f;
            this.f23444d = f25;
            this.f23445e = f26;
            this.f23447g = ((f11 + fSqrt2) * f25) / 2.0f;
            this.f23448h = f12;
            return;
        }
        this.f23450j = 3;
        this.f23441a = f11;
        this.f23442b = f14;
        this.f23443c = f14;
        float f27 = (f14 - f11) / f13;
        this.f23444d = f27;
        float f28 = f14 / f13;
        this.f23446f = f28;
        float f29 = ((f11 + f14) * f27) / 2.0f;
        float f31 = (f28 * f14) / 2.0f;
        this.f23445e = ((f12 - f29) - f31) / f14;
        this.f23447g = f29;
        this.f23448h = f12 - f31;
        this.f23449i = f12;
    }

    @Override // i6.l
    public final float getInterpolation(float f11) {
        float f12;
        float f13 = this.f23444d;
        if (f11 <= f13) {
            float f14 = this.f23441a;
            f12 = ((((this.f23442b - f14) * f11) * f11) / (f13 * 2.0f)) + (f14 * f11);
        } else {
            int i11 = this.f23450j;
            if (i11 == 1) {
                f12 = this.f23447g;
            } else {
                float f15 = f11 - f13;
                float f16 = this.f23445e;
                if (f15 < f16) {
                    float f17 = this.f23447g;
                    float f18 = this.f23442b;
                    f12 = ((((this.f23443c - f18) * f15) * f15) / (f16 * 2.0f)) + (f18 * f15) + f17;
                } else if (i11 == 2) {
                    f12 = this.f23448h;
                } else {
                    float f19 = f15 - f16;
                    float f20 = this.f23446f;
                    if (f19 <= f20) {
                        float f21 = this.f23448h;
                        float f22 = this.f23443c * f19;
                        f12 = (f21 + f22) - ((f22 * f19) / (f20 * 2.0f));
                    } else {
                        f12 = this.f23449i;
                    }
                }
            }
        }
        this.f23452m = f12;
        this.f23453n = f11;
        boolean z11 = this.f23451k;
        float f23 = this.l;
        return z11 ? f23 - f12 : f23 + f12;
    }
}
