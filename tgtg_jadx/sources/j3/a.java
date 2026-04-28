package j3;

import android.graphics.Color;
import w6.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f24471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f24472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f24475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f24476f;

    public /* synthetic */ a(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f24471a = f11;
        this.f24472b = f12;
        this.f24473c = f13;
        this.f24474d = f14;
        this.f24475e = f15;
        this.f24476f = f16;
    }

    public static a a(int i11) {
        k kVar = k.f43259k;
        float fG = w6.a.g(Color.red(i11));
        float fG2 = w6.a.g(Color.green(i11));
        float fG3 = w6.a.g(Color.blue(i11));
        float[][] fArr = w6.a.f43235d;
        float[] fArr2 = fArr[0];
        float f11 = (fArr2[2] * fG3) + (fArr2[1] * fG2) + (fArr2[0] * fG);
        float[] fArr3 = fArr[1];
        float f12 = (fArr3[2] * fG3) + (fArr3[1] * fG2) + (fArr3[0] * fG);
        float[] fArr4 = fArr[2];
        float f13 = (fG3 * fArr4[2]) + (fG2 * fArr4[1]) + (fG * fArr4[0]);
        float[][] fArr5 = w6.a.f43232a;
        float[] fArr6 = fArr5[0];
        float f14 = (fArr6[2] * f13) + (fArr6[1] * f12) + (fArr6[0] * f11);
        float[] fArr7 = fArr5[1];
        float f15 = (fArr7[2] * f13) + (fArr7[1] * f12) + (fArr7[0] * f11);
        float[] fArr8 = fArr5[2];
        float f16 = (f13 * fArr8[2]) + (f12 * fArr8[1]) + (f11 * fArr8[0]);
        float[] fArr9 = kVar.f43266g;
        float f17 = kVar.f43268i;
        float f18 = kVar.f43263d;
        float f19 = kVar.f43260a;
        float f20 = fArr9[0] * f14;
        float f21 = fArr9[1] * f15;
        float f22 = fArr9[2] * f16;
        float f23 = kVar.f43267h;
        float fPow = (float) Math.pow(((double) (Math.abs(f20) * f23)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f21) * f23)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f22) * f23)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f20) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f21) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f22) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d3 = fSignum3;
        float f24 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d3)) / 11.0f;
        float f25 = ((float) (((double) (fSignum + fSignum2)) - (d3 * 2.0d))) / 9.0f;
        float f26 = fSignum2 * 20.0f;
        float f27 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f26)) / 20.0f;
        float f28 = (((fSignum * 40.0f) + f26) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f25, f24)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f29 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f28 * kVar.f43261b) / f19, kVar.f43269j * f18)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f31 = f19 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, kVar.f43265f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * kVar.f43264e) * kVar.f43262c) * ((float) Math.sqrt((f25 * f25) + (f24 * f24)))) / (f27 + 0.305f), 0.9d)) * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((r0 * f18) / f31);
        float f32 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f17 * fPow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d11 = f29;
        return new a(fAtan2, fPow5, fPow4, f32, fLog * ((float) Math.cos(d11)), fLog * ((float) Math.sin(d11)));
    }

    public static a b(float f11, float f12, float f13) {
        k kVar = k.f43259k;
        float f14 = kVar.f43263d;
        Math.sqrt(((double) f11) / 100.0d);
        float f15 = kVar.f43260a + 4.0f;
        float f16 = kVar.f43268i * f12;
        Math.sqrt(((f12 / ((float) Math.sqrt(r1))) * kVar.f43263d) / f15);
        float f17 = (1.7f * f11) / ((0.007f * f11) + 1.0f);
        float fLog = ((float) Math.log((((double) f16) * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (3.1415927f * f13) / 180.0f;
        return new a(f13, f12, f11, f17, fLog * ((float) Math.cos(d3)), fLog * ((float) Math.sin(d3)));
    }

    public int c(c cVar) {
        float f11 = this.f24472b;
        float fSqrt = (f11 == 0.0f || this.f24473c == 0.0f) ? 0.0f : f11 / ((float) Math.sqrt(r3 / 100.0f));
        float f12 = cVar.f24487a;
        float f13 = cVar.f24494h;
        float fPow = fSqrt / ((float) Math.pow(1.64f - ((float) Math.pow((float) Math.pow(0.29f, f12), 0.73f)), 1.1111112f));
        float f14 = (this.f24471a * 3.1415927f) / 180.0f;
        float fCos = (((float) Math.cos(2.0f + f14)) + 3.8f) * 0.25f;
        float fPow2 = cVar.f24488b * ((float) Math.pow(r3 / 100.0f, (1.0f / cVar.f24491e) / cVar.f24496j));
        float f15 = fCos * 3846.1538f * cVar.f24492f * cVar.f24490d;
        float f16 = fPow2 / cVar.f24489c;
        double d3 = f14;
        float fSin = (float) Math.sin(d3);
        float fCos2 = (float) Math.cos(d3);
        float f17 = (((0.305f + f16) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f15 * 23.0f)));
        float f18 = fCos2 * f17;
        float f19 = f17 * fSin;
        float f20 = f16 * 460.0f;
        float f21 = ((288.0f * f19) + ((451.0f * f18) + f20)) / 1403.0f;
        float f22 = ((f20 - (891.0f * f18)) - (261.0f * f19)) / 1403.0f;
        float f23 = ((f20 - (f18 * 220.0f)) - (f19 * 6300.0f)) / 1403.0f;
        float f24 = 100.0f / f13;
        double d11 = 2.3809524f;
        float fSignum = Math.signum(f21) * f24 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f21) * 27.13f) / (400.0f - Math.abs(f21))), d11));
        float fSignum2 = Math.signum(f22) * f24 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f22) * 27.13f) / (400.0f - Math.abs(f22))), d11));
        float fSignum3 = Math.signum(f23) * f24 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f23) * 27.13f) / (400.0f - Math.abs(f23))), d11));
        float[] fArr = cVar.f24493g;
        float f25 = fSignum / fArr[0];
        float f26 = fSignum2 / fArr[1];
        float f27 = fSignum3 / fArr[2];
        float[][] fArr2 = b.f24478b;
        float[] fArr3 = fArr2[0];
        float f28 = (fArr3[2] * f27) + (fArr3[1] * f26) + (fArr3[0] * f25);
        float[] fArr4 = fArr2[1];
        float f29 = (fArr4[2] * f27) + (fArr4[1] * f26) + (fArr4[0] * f25);
        float[] fArr5 = fArr2[2];
        return x6.c.a(f28, f29, (f27 * fArr5[2]) + (f26 * fArr5[1]) + (f25 * fArr5[0]));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(w6.k r20) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.a.d(w6.k):int");
    }
}
