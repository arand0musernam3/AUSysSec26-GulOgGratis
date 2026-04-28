package j4;

import i4.g0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24573d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, int i11, int i12, long j9) {
        super(i11, j9, str);
        this.f24573d = i12;
    }

    @Override // j4.c
    public final float a(int i11) {
        switch (this.f24573d) {
            case 0:
                return i11 == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // j4.c
    public final float b(int i11) {
        switch (this.f24573d) {
            case 0:
                return i11 == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // j4.c
    public final long d(float f11, float f12, float f13) {
        switch (this.f24573d) {
            case 0:
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
                if (f11 > 100.0f) {
                    f11 = 100.0f;
                }
                if (f12 < -128.0f) {
                    f12 = -128.0f;
                }
                if (f12 > 128.0f) {
                    f12 = 128.0f;
                }
                float f14 = (f11 + 16.0f) / 116.0f;
                float f15 = (f12 * 0.002f) + f14;
                float f16 = f15 > 0.20689656f ? f15 * f15 * f15 : (f15 - 0.13793103f) * 0.12841855f;
                float f17 = f14 > 0.20689656f ? f14 * f14 * f14 : (f14 - 0.13793103f) * 0.12841855f;
                float[] fArr = k.f24572e;
                return (((long) Float.floatToRawIntBits(f17 * fArr[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f16 * fArr[0])) << 32);
            default:
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                if (f11 > 2.0f) {
                    f11 = 2.0f;
                }
                if (f12 < -2.0f) {
                    f12 = -2.0f;
                }
                return (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f12 <= 2.0f ? f12 : 2.0f)) & 4294967295L);
        }
    }

    @Override // j4.c
    public final float e(float f11, float f12, float f13) {
        switch (this.f24573d) {
            case 0:
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
                if (f11 > 100.0f) {
                    f11 = 100.0f;
                }
                if (f13 < -128.0f) {
                    f13 = -128.0f;
                }
                if (f13 > 128.0f) {
                    f13 = 128.0f;
                }
                float f14 = ((f11 + 16.0f) / 116.0f) - (f13 * 0.005f);
                return (f14 > 0.20689656f ? f14 * f14 * f14 : 0.12841855f * (f14 - 0.13793103f)) * k.f24572e[2];
            default:
                if (f13 < -2.0f) {
                    f13 = -2.0f;
                }
                if (f13 > 2.0f) {
                    return 2.0f;
                }
                return f13;
        }
    }

    @Override // j4.c
    public final long f(float f11, float f12, float f13, float f14, c cVar) {
        switch (this.f24573d) {
            case 0:
                float[] fArr = k.f24572e;
                float f15 = f11 / fArr[0];
                float f16 = f12 / fArr[1];
                float f17 = f13 / fArr[2];
                float fCbrt = f15 > 0.008856452f ? (float) Math.cbrt(f15) : (f15 * 7.787037f) + 0.13793103f;
                float fCbrt2 = f16 > 0.008856452f ? (float) Math.cbrt(f16) : (f16 * 7.787037f) + 0.13793103f;
                float f18 = (116.0f * fCbrt2) - 16.0f;
                float f19 = (fCbrt - fCbrt2) * 500.0f;
                float fCbrt3 = (fCbrt2 - (f17 > 0.008856452f ? (float) Math.cbrt(f17) : (f17 * 7.787037f) + 0.13793103f)) * 200.0f;
                if (f18 < 0.0f) {
                    f18 = 0.0f;
                }
                if (f18 > 100.0f) {
                    f18 = 100.0f;
                }
                if (f19 < -128.0f) {
                    f19 = -128.0f;
                }
                if (f19 > 128.0f) {
                    f19 = 128.0f;
                }
                if (fCbrt3 < -128.0f) {
                    fCbrt3 = -128.0f;
                }
                return g0.b(f18, f19, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f14, cVar);
            default:
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                if (f11 > 2.0f) {
                    f11 = 2.0f;
                }
                if (f12 < -2.0f) {
                    f12 = -2.0f;
                }
                if (f12 > 2.0f) {
                    f12 = 2.0f;
                }
                if (f13 < -2.0f) {
                    f13 = -2.0f;
                }
                return g0.b(f11, f12, f13 <= 2.0f ? f13 : 2.0f, f14, cVar);
        }
    }
}
