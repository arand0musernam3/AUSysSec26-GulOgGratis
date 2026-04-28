package t1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f39518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f39519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f39521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f39522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f39523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f39524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f39525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f39526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f39527j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f39528k;
    public final float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f39529m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f39530n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f39531o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f39532p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f39533q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f39534r;

    public q(int i11, float f11, float f12, float f13, float f14, float f15, float f16) {
        boolean z11;
        int i12;
        float f17;
        float f18;
        this.f39518a = f11;
        this.f39519b = f12;
        this.f39520c = f13;
        this.f39521d = f14;
        this.f39522e = f15;
        this.f39523f = f16;
        float f19 = f15 - f13;
        float f20 = f16 - f14;
        float f21 = 0.0f;
        int i13 = 1;
        boolean z12 = i11 == 1 || (i11 == 4 ? f20 > 0.0f : !(i11 != 5 || f20 >= 0.0f));
        float f22 = z12 ? -1.0f : 1.0f;
        this.f39529m = f22;
        float f23 = 1 / (f12 - f11);
        this.f39528k = f23;
        float[] fArr = new float[101];
        this.f39527j = fArr;
        boolean z13 = i11 == 3;
        if (z13 || Math.abs(f19) < 0.001f || Math.abs(f20) < 0.001f) {
            float fHypot = (float) Math.hypot(f20, f19);
            this.f39524g = fHypot;
            this.l = fHypot * f23;
            this.f39533q = f19 * f23;
            this.f39534r = f20 * f23;
            this.f39530n = Float.NaN;
            this.f39531o = Float.NaN;
            z11 = true;
        } else {
            this.f39530n = f19 * f22;
            this.f39531o = f20 * (-f22);
            this.f39533q = z12 ? f15 : f13;
            this.f39534r = z12 ? f14 : f16;
            float f24 = f15 - f13;
            float f25 = f14 - f16;
            float[] fArr2 = c.f39388i;
            int i14 = 90;
            float f26 = 90;
            float f27 = f25;
            float fHypot2 = 0.0f;
            float f28 = 0.0f;
            int i15 = 1;
            while (true) {
                i12 = i13;
                f17 = f21;
                double radians = (float) Math.toRadians((((double) i15) * 90.0d) / ((double) i14));
                float fSin = ((float) Math.sin(radians)) * f24;
                float fCos = ((float) Math.cos(radians)) * f25;
                float f29 = fSin - f28;
                f18 = f26;
                fHypot2 += (float) Math.hypot(f29, fCos - f27);
                fArr2[i15] = fHypot2;
                i14 = 90;
                if (i15 == 90) {
                    break;
                }
                i15++;
                f27 = fCos;
                f26 = f18;
                f21 = f17;
                f28 = fSin;
                i13 = i12;
            }
            this.f39524g = fHypot2;
            int i16 = i12;
            while (true) {
                fArr2[i16] = fArr2[i16] / fHypot2;
                if (i16 == 90) {
                    break;
                } else {
                    i16++;
                }
            }
            int length = fArr.length;
            for (int i17 = 0; i17 < length; i17++) {
                float f31 = i17 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr2, 0, 91, f31);
                if (iBinarySearch >= 0) {
                    fArr[i17] = iBinarySearch / f18;
                } else if (iBinarySearch == -1) {
                    fArr[i17] = f17;
                } else {
                    int i18 = -iBinarySearch;
                    int i19 = i18 - 2;
                    float f32 = i19;
                    float f33 = fArr2[i19];
                    fArr[i17] = (((f31 - f33) / (fArr2[i18 - 1] - f33)) + f32) / f18;
                }
            }
            this.l = this.f39524g * this.f39528k;
            z11 = z13;
        }
        this.f39532p = z11;
    }

    public final float a() {
        float f11 = this.f39530n * this.f39526i;
        return f11 * this.f39529m * (this.l / ((float) Math.hypot(f11, (-this.f39531o) * this.f39525h)));
    }

    public final float b() {
        float f11 = this.f39530n * this.f39526i;
        float f12 = (-this.f39531o) * this.f39525h;
        return f12 * this.f39529m * (this.l / ((float) Math.hypot(f11, f12)));
    }

    public final void c(float f11) {
        float f12 = (this.f39529m == -1.0f ? this.f39519b - f11 : f11 - this.f39518a) * this.f39528k;
        float fA = 0.0f;
        if (f12 > 0.0f) {
            fA = 1.0f;
            if (f12 < 1.0f) {
                float f13 = f12 * 100;
                int i11 = (int) f13;
                float[] fArr = this.f39527j;
                float f14 = fArr[i11];
                fA = j4.s.a(fArr[i11 + 1], f14, f13 - i11, f14);
            }
        }
        double d3 = fA * 1.5707964f;
        this.f39525h = (float) Math.sin(d3);
        this.f39526i = (float) Math.cos(d3);
    }
}
