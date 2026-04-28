package x4;

import com.braze.h2;
import ex.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f43828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a[] f43830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f43832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f43833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f43834h;

    public e(boolean z11, c cVar) {
        this.f43827a = z11;
        this.f43828b = cVar;
        if (z11 && cVar.equals(c.Lsq2)) {
            h2.b("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int i11 = d.$EnumSwitchMapping$0[cVar.ordinal()];
        int i12 = 2;
        if (i11 != 1) {
            if (i11 != 2) {
                e40.a.f();
                throw null;
            }
            i12 = 3;
        }
        this.f43829c = i12;
        this.f43830d = new a[20];
        this.f43832f = new float[20];
        this.f43833g = new float[20];
        this.f43834h = new float[3];
    }

    public final void a(float f11, long j9) {
        int i11 = (this.f43831e + 1) % 20;
        this.f43831e = i11;
        a[] aVarArr = this.f43830d;
        a aVar = aVarArr[i11];
        if (aVar != null) {
            aVar.f43822a = j9;
            aVar.f43823b = f11;
        } else {
            a aVar2 = new a();
            aVar2.f43822a = j9;
            aVar2.f43823b = f11;
            aVarArr[i11] = aVar2;
        }
    }

    public final float b(float f11) {
        c cVar;
        float[] fArr;
        float[] fArr2;
        float f12;
        boolean z11;
        int i11;
        float fSignum;
        float f13 = f11;
        float f14 = 0.0f;
        if (f13 <= 0.0f) {
            y4.a.b("maximumVelocity should be a positive value. You specified=" + f13);
        }
        int i12 = this.f43831e;
        a[] aVarArr = this.f43830d;
        a aVar = aVarArr[i12];
        if (aVar == null) {
            f12 = 0.0f;
        } else {
            int i13 = 0;
            a aVar2 = aVar;
            while (true) {
                a aVar3 = aVarArr[i12];
                boolean z12 = this.f43827a;
                cVar = this.f43828b;
                fArr = this.f43832f;
                fArr2 = this.f43833g;
                if (aVar3 == null) {
                    f12 = f14;
                    z11 = z12;
                    i11 = 1;
                    break;
                }
                long j9 = aVar.f43822a;
                f12 = f14;
                int i14 = i12;
                long j11 = aVar3.f43822a;
                float f15 = j9 - j11;
                z11 = z12;
                i11 = 1;
                float fAbs = Math.abs(j11 - aVar2.f43822a);
                aVar2 = (cVar == c.Lsq2 || z11) ? aVar3 : aVar;
                if (f15 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i13] = aVar3.f43823b;
                fArr2[i13] = -f15;
                i12 = (i14 == 0 ? 20 : i14) - 1;
                i13++;
                if (i13 >= 20) {
                    break;
                }
                f14 = f12;
            }
            if (i13 >= this.f43829c) {
                int i15 = d.$EnumSwitchMapping$0[cVar.ordinal()];
                if (i15 == i11) {
                    int i16 = i13 - i11;
                    float f16 = fArr2[i16];
                    int i17 = i16;
                    float fAbs2 = f12;
                    while (i17 > 0) {
                        int i18 = i17 - 1;
                        float f17 = fArr2[i18];
                        if (f16 != f17) {
                            float f18 = (z11 ? -fArr[i18] : fArr[i17] - fArr[i18]) / (f16 - f17);
                            fAbs2 += Math.abs(f18) * (f18 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i17 == i16) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i17--;
                        f16 = f17;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                } else {
                    if (i15 != 2) {
                        e40.a.f();
                        return 0.0f;
                    }
                    try {
                        float[] fArr3 = this.f43834h;
                        i.E(fArr2, fArr, i13, fArr3);
                        fSignum = fArr3[i11];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f12;
                    }
                }
                f14 = fSignum * 1000;
            } else {
                f14 = f12;
            }
        }
        if (f14 == f12 || Float.isNaN(f14)) {
            return f12;
        }
        if (f14 <= f12) {
            f13 = -f13;
            if (f14 >= f13) {
                return f14;
            }
        } else if (f14 <= f13) {
            f13 = f14;
        }
        return f13;
    }

    public e() {
        this(true, c.Impulse);
    }
}
