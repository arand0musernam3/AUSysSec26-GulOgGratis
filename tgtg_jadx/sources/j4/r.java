package j4;

import i4.g0;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f24586r = new d(6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f24587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f24588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f24589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f24590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f24591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f24592i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f24593j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j f24594k;
    public final q l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f24595m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f24596n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q f24597o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f24598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f24599q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x025d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(java.lang.String r33, float[] r34, j4.u r35, float[] r36, j4.j r37, j4.j r38, float r39, float r40, j4.t r41, int r42) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.r.<init>(java.lang.String, float[], j4.u, float[], j4.j, j4.j, float, float, j4.t, int):void");
    }

    @Override // j4.c
    public final float a(int i11) {
        return this.f24589f;
    }

    @Override // j4.c
    public final float b(int i11) {
        return this.f24588e;
    }

    @Override // j4.c
    public final boolean c() {
        return this.f24599q;
    }

    @Override // j4.c
    public final long d(float f11, float f12, float f13) {
        double d3 = f11;
        n nVar = this.f24598p;
        float fA = (float) nVar.a(d3);
        float fA2 = (float) nVar.a(f12);
        float fA3 = (float) nVar.a(f13);
        float[] fArr = this.f24592i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f14 = (fArr[6] * fA3) + (fArr[3] * fA2) + (fArr[0] * fA);
        return (((long) Float.floatToRawIntBits((fArr[7] * fA3) + (fArr[4] * fA2) + (fArr[1] * fA))) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
    }

    @Override // j4.c
    public final float e(float f11, float f12, float f13) {
        double d3 = f11;
        n nVar = this.f24598p;
        float fA = (float) nVar.a(d3);
        float fA2 = (float) nVar.a(f12);
        float fA3 = (float) nVar.a(f13);
        float[] fArr = this.f24592i;
        return (fArr[8] * fA3) + (fArr[5] * fA2) + (fArr[2] * fA);
    }

    @Override // j4.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        r rVar = (r) obj;
        if (Float.compare(rVar.f24588e, this.f24588e) != 0 || Float.compare(rVar.f24589f, this.f24589f) != 0 || !Intrinsics.areEqual(this.f24587d, rVar.f24587d) || !Arrays.equals(this.f24591h, rVar.f24591h)) {
            return false;
        }
        t tVar = rVar.f24590g;
        t tVar2 = this.f24590g;
        if (tVar2 != null) {
            return Intrinsics.areEqual(tVar2, tVar);
        }
        if (tVar == null) {
            return true;
        }
        if (Intrinsics.areEqual(this.f24594k, rVar.f24594k)) {
            return Intrinsics.areEqual(this.f24596n, rVar.f24596n);
        }
        return false;
    }

    @Override // j4.c
    public final long f(float f11, float f12, float f13, float f14, c cVar) {
        float[] fArr = this.f24593j;
        float f15 = (fArr[6] * f13) + (fArr[3] * f12) + (fArr[0] * f11);
        float f16 = (fArr[7] * f13) + (fArr[4] * f12) + (fArr[1] * f11);
        float f17 = (fArr[8] * f13) + (fArr[5] * f12) + (fArr[2] * f11);
        n nVar = this.f24595m;
        return g0.b((float) nVar.a(f15), (float) nVar.a(f16), (float) nVar.a(f17), f14, cVar);
    }

    @Override // j4.c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f24591h) + ((this.f24587d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f11 = this.f24588e;
        int iFloatToIntBits = (iHashCode + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        float f12 = this.f24589f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f12 == 0.0f ? 0 : Float.floatToIntBits(f12))) * 31;
        t tVar = this.f24590g;
        int iHashCode2 = iFloatToIntBits2 + (tVar != null ? tVar.hashCode() : 0);
        if (tVar == null) {
            return this.f24596n.hashCode() + ((this.f24594k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    public r(String str, float[] fArr, u uVar, final t tVar, int i11) {
        j jVar;
        j jVar2;
        double d3 = tVar.f24600a;
        boolean z11 = d3 == -3.0d;
        double d11 = tVar.f24606g;
        double d12 = tVar.f24605f;
        if (z11) {
            final int i12 = 4;
            jVar = new j() { // from class: j4.p
                @Override // j4.j
                public final double a(double d13) {
                    int i13 = i12;
                    t tVar2 = tVar;
                    switch (i13) {
                        case 0:
                            float[] fArr2 = e.f24536a;
                            return e.a(tVar2, d13);
                        case 1:
                            float[] fArr3 = e.f24536a;
                            return e.c(tVar2, d13);
                        case 2:
                            double d14 = tVar2.f24601b;
                            return d13 >= tVar2.f24604e ? Math.pow((d14 * d13) + tVar2.f24602c, tVar2.f24600a) : d13 * tVar2.f24603d;
                        case 3:
                            double d15 = tVar2.f24601b;
                            double d16 = tVar2.f24602c;
                            double d17 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e ? Math.pow((d15 * d13) + d16, tVar2.f24600a) + tVar2.f24605f : (d17 * d13) + tVar2.f24606g;
                        case 4:
                            float[] fArr4 = e.f24536a;
                            return e.b(tVar2, d13);
                        case 5:
                            float[] fArr5 = e.f24536a;
                            return e.d(tVar2, d13);
                        case 6:
                            double d18 = tVar2.f24601b;
                            double d19 = tVar2.f24602c;
                            double d21 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e * d21 ? (Math.pow(d13, 1.0d / tVar2.f24600a) - d19) / d18 : d13 / d21;
                        default:
                            double d22 = tVar2.f24601b;
                            double d23 = tVar2.f24602c;
                            double d24 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e * d24 ? (Math.pow(d13 - tVar2.f24605f, 1.0d / tVar2.f24600a) - d23) / d22 : (d13 - tVar2.f24606g) / d24;
                    }
                }
            };
        } else if (d3 == -2.0d) {
            final int i13 = 5;
            jVar = new j() { // from class: j4.p
                @Override // j4.j
                public final double a(double d13) {
                    int i132 = i13;
                    t tVar2 = tVar;
                    switch (i132) {
                        case 0:
                            float[] fArr2 = e.f24536a;
                            return e.a(tVar2, d13);
                        case 1:
                            float[] fArr3 = e.f24536a;
                            return e.c(tVar2, d13);
                        case 2:
                            double d14 = tVar2.f24601b;
                            return d13 >= tVar2.f24604e ? Math.pow((d14 * d13) + tVar2.f24602c, tVar2.f24600a) : d13 * tVar2.f24603d;
                        case 3:
                            double d15 = tVar2.f24601b;
                            double d16 = tVar2.f24602c;
                            double d17 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e ? Math.pow((d15 * d13) + d16, tVar2.f24600a) + tVar2.f24605f : (d17 * d13) + tVar2.f24606g;
                        case 4:
                            float[] fArr4 = e.f24536a;
                            return e.b(tVar2, d13);
                        case 5:
                            float[] fArr5 = e.f24536a;
                            return e.d(tVar2, d13);
                        case 6:
                            double d18 = tVar2.f24601b;
                            double d19 = tVar2.f24602c;
                            double d21 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e * d21 ? (Math.pow(d13, 1.0d / tVar2.f24600a) - d19) / d18 : d13 / d21;
                        default:
                            double d22 = tVar2.f24601b;
                            double d23 = tVar2.f24602c;
                            double d24 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e * d24 ? (Math.pow(d13 - tVar2.f24605f, 1.0d / tVar2.f24600a) - d23) / d22 : (d13 - tVar2.f24606g) / d24;
                    }
                }
            };
        } else if (d12 == 0.0d && d11 == 0.0d) {
            final int i14 = 6;
            jVar = new j() { // from class: j4.p
                @Override // j4.j
                public final double a(double d13) {
                    int i132 = i14;
                    t tVar2 = tVar;
                    switch (i132) {
                        case 0:
                            float[] fArr2 = e.f24536a;
                            return e.a(tVar2, d13);
                        case 1:
                            float[] fArr3 = e.f24536a;
                            return e.c(tVar2, d13);
                        case 2:
                            double d14 = tVar2.f24601b;
                            return d13 >= tVar2.f24604e ? Math.pow((d14 * d13) + tVar2.f24602c, tVar2.f24600a) : d13 * tVar2.f24603d;
                        case 3:
                            double d15 = tVar2.f24601b;
                            double d16 = tVar2.f24602c;
                            double d17 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e ? Math.pow((d15 * d13) + d16, tVar2.f24600a) + tVar2.f24605f : (d17 * d13) + tVar2.f24606g;
                        case 4:
                            float[] fArr4 = e.f24536a;
                            return e.b(tVar2, d13);
                        case 5:
                            float[] fArr5 = e.f24536a;
                            return e.d(tVar2, d13);
                        case 6:
                            double d18 = tVar2.f24601b;
                            double d19 = tVar2.f24602c;
                            double d21 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e * d21 ? (Math.pow(d13, 1.0d / tVar2.f24600a) - d19) / d18 : d13 / d21;
                        default:
                            double d22 = tVar2.f24601b;
                            double d23 = tVar2.f24602c;
                            double d24 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e * d24 ? (Math.pow(d13 - tVar2.f24605f, 1.0d / tVar2.f24600a) - d23) / d22 : (d13 - tVar2.f24606g) / d24;
                    }
                }
            };
        } else {
            final int i15 = 7;
            jVar = new j() { // from class: j4.p
                @Override // j4.j
                public final double a(double d13) {
                    int i132 = i15;
                    t tVar2 = tVar;
                    switch (i132) {
                        case 0:
                            float[] fArr2 = e.f24536a;
                            return e.a(tVar2, d13);
                        case 1:
                            float[] fArr3 = e.f24536a;
                            return e.c(tVar2, d13);
                        case 2:
                            double d14 = tVar2.f24601b;
                            return d13 >= tVar2.f24604e ? Math.pow((d14 * d13) + tVar2.f24602c, tVar2.f24600a) : d13 * tVar2.f24603d;
                        case 3:
                            double d15 = tVar2.f24601b;
                            double d16 = tVar2.f24602c;
                            double d17 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e ? Math.pow((d15 * d13) + d16, tVar2.f24600a) + tVar2.f24605f : (d17 * d13) + tVar2.f24606g;
                        case 4:
                            float[] fArr4 = e.f24536a;
                            return e.b(tVar2, d13);
                        case 5:
                            float[] fArr5 = e.f24536a;
                            return e.d(tVar2, d13);
                        case 6:
                            double d18 = tVar2.f24601b;
                            double d19 = tVar2.f24602c;
                            double d21 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e * d21 ? (Math.pow(d13, 1.0d / tVar2.f24600a) - d19) / d18 : d13 / d21;
                        default:
                            double d22 = tVar2.f24601b;
                            double d23 = tVar2.f24602c;
                            double d24 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e * d24 ? (Math.pow(d13 - tVar2.f24605f, 1.0d / tVar2.f24600a) - d23) / d22 : (d13 - tVar2.f24606g) / d24;
                    }
                }
            };
        }
        if (d3 == -3.0d) {
            final int i16 = 0;
            jVar2 = new j() { // from class: j4.p
                @Override // j4.j
                public final double a(double d13) {
                    int i132 = i16;
                    t tVar2 = tVar;
                    switch (i132) {
                        case 0:
                            float[] fArr2 = e.f24536a;
                            return e.a(tVar2, d13);
                        case 1:
                            float[] fArr3 = e.f24536a;
                            return e.c(tVar2, d13);
                        case 2:
                            double d14 = tVar2.f24601b;
                            return d13 >= tVar2.f24604e ? Math.pow((d14 * d13) + tVar2.f24602c, tVar2.f24600a) : d13 * tVar2.f24603d;
                        case 3:
                            double d15 = tVar2.f24601b;
                            double d16 = tVar2.f24602c;
                            double d17 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e ? Math.pow((d15 * d13) + d16, tVar2.f24600a) + tVar2.f24605f : (d17 * d13) + tVar2.f24606g;
                        case 4:
                            float[] fArr4 = e.f24536a;
                            return e.b(tVar2, d13);
                        case 5:
                            float[] fArr5 = e.f24536a;
                            return e.d(tVar2, d13);
                        case 6:
                            double d18 = tVar2.f24601b;
                            double d19 = tVar2.f24602c;
                            double d21 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e * d21 ? (Math.pow(d13, 1.0d / tVar2.f24600a) - d19) / d18 : d13 / d21;
                        default:
                            double d22 = tVar2.f24601b;
                            double d23 = tVar2.f24602c;
                            double d24 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e * d24 ? (Math.pow(d13 - tVar2.f24605f, 1.0d / tVar2.f24600a) - d23) / d22 : (d13 - tVar2.f24606g) / d24;
                    }
                }
            };
        } else if (d3 == -2.0d) {
            final int i17 = 1;
            jVar2 = new j() { // from class: j4.p
                @Override // j4.j
                public final double a(double d13) {
                    int i132 = i17;
                    t tVar2 = tVar;
                    switch (i132) {
                        case 0:
                            float[] fArr2 = e.f24536a;
                            return e.a(tVar2, d13);
                        case 1:
                            float[] fArr3 = e.f24536a;
                            return e.c(tVar2, d13);
                        case 2:
                            double d14 = tVar2.f24601b;
                            return d13 >= tVar2.f24604e ? Math.pow((d14 * d13) + tVar2.f24602c, tVar2.f24600a) : d13 * tVar2.f24603d;
                        case 3:
                            double d15 = tVar2.f24601b;
                            double d16 = tVar2.f24602c;
                            double d17 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e ? Math.pow((d15 * d13) + d16, tVar2.f24600a) + tVar2.f24605f : (d17 * d13) + tVar2.f24606g;
                        case 4:
                            float[] fArr4 = e.f24536a;
                            return e.b(tVar2, d13);
                        case 5:
                            float[] fArr5 = e.f24536a;
                            return e.d(tVar2, d13);
                        case 6:
                            double d18 = tVar2.f24601b;
                            double d19 = tVar2.f24602c;
                            double d21 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e * d21 ? (Math.pow(d13, 1.0d / tVar2.f24600a) - d19) / d18 : d13 / d21;
                        default:
                            double d22 = tVar2.f24601b;
                            double d23 = tVar2.f24602c;
                            double d24 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e * d24 ? (Math.pow(d13 - tVar2.f24605f, 1.0d / tVar2.f24600a) - d23) / d22 : (d13 - tVar2.f24606g) / d24;
                    }
                }
            };
        } else if (d12 == 0.0d && d11 == 0.0d) {
            final int i18 = 2;
            jVar2 = new j() { // from class: j4.p
                @Override // j4.j
                public final double a(double d13) {
                    int i132 = i18;
                    t tVar2 = tVar;
                    switch (i132) {
                        case 0:
                            float[] fArr2 = e.f24536a;
                            return e.a(tVar2, d13);
                        case 1:
                            float[] fArr3 = e.f24536a;
                            return e.c(tVar2, d13);
                        case 2:
                            double d14 = tVar2.f24601b;
                            return d13 >= tVar2.f24604e ? Math.pow((d14 * d13) + tVar2.f24602c, tVar2.f24600a) : d13 * tVar2.f24603d;
                        case 3:
                            double d15 = tVar2.f24601b;
                            double d16 = tVar2.f24602c;
                            double d17 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e ? Math.pow((d15 * d13) + d16, tVar2.f24600a) + tVar2.f24605f : (d17 * d13) + tVar2.f24606g;
                        case 4:
                            float[] fArr4 = e.f24536a;
                            return e.b(tVar2, d13);
                        case 5:
                            float[] fArr5 = e.f24536a;
                            return e.d(tVar2, d13);
                        case 6:
                            double d18 = tVar2.f24601b;
                            double d19 = tVar2.f24602c;
                            double d21 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e * d21 ? (Math.pow(d13, 1.0d / tVar2.f24600a) - d19) / d18 : d13 / d21;
                        default:
                            double d22 = tVar2.f24601b;
                            double d23 = tVar2.f24602c;
                            double d24 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e * d24 ? (Math.pow(d13 - tVar2.f24605f, 1.0d / tVar2.f24600a) - d23) / d22 : (d13 - tVar2.f24606g) / d24;
                    }
                }
            };
        } else {
            final int i19 = 3;
            jVar2 = new j() { // from class: j4.p
                @Override // j4.j
                public final double a(double d13) {
                    int i132 = i19;
                    t tVar2 = tVar;
                    switch (i132) {
                        case 0:
                            float[] fArr2 = e.f24536a;
                            return e.a(tVar2, d13);
                        case 1:
                            float[] fArr3 = e.f24536a;
                            return e.c(tVar2, d13);
                        case 2:
                            double d14 = tVar2.f24601b;
                            return d13 >= tVar2.f24604e ? Math.pow((d14 * d13) + tVar2.f24602c, tVar2.f24600a) : d13 * tVar2.f24603d;
                        case 3:
                            double d15 = tVar2.f24601b;
                            double d16 = tVar2.f24602c;
                            double d17 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e ? Math.pow((d15 * d13) + d16, tVar2.f24600a) + tVar2.f24605f : (d17 * d13) + tVar2.f24606g;
                        case 4:
                            float[] fArr4 = e.f24536a;
                            return e.b(tVar2, d13);
                        case 5:
                            float[] fArr5 = e.f24536a;
                            return e.d(tVar2, d13);
                        case 6:
                            double d18 = tVar2.f24601b;
                            double d19 = tVar2.f24602c;
                            double d21 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e * d21 ? (Math.pow(d13, 1.0d / tVar2.f24600a) - d19) / d18 : d13 / d21;
                        default:
                            double d22 = tVar2.f24601b;
                            double d23 = tVar2.f24602c;
                            double d24 = tVar2.f24603d;
                            return d13 >= tVar2.f24604e * d24 ? (Math.pow(d13 - tVar2.f24605f, 1.0d / tVar2.f24600a) - d23) / d22 : (d13 - tVar2.f24606g) / d24;
                    }
                }
            };
        }
        this(str, fArr, uVar, null, jVar, jVar2, 0.0f, 1.0f, tVar, i11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r(String str, float[] fArr, u uVar, final double d3, float f11, float f12, int i11) {
        j jVar;
        j jVar2 = f24586r;
        if (d3 == 1.0d) {
            jVar = jVar2;
        } else {
            final int i12 = 0;
            jVar = new j() { // from class: j4.o
                @Override // j4.j
                public final double a(double d11) {
                    switch (i12) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d3);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d3);
                    }
                }
            };
        }
        if (d3 != 1.0d) {
            final int i13 = 1;
            jVar2 = new j() { // from class: j4.o
                @Override // j4.j
                public final double a(double d11) {
                    switch (i13) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d3);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d3);
                    }
                }
            };
        }
        j jVar3 = jVar2;
        this(str, fArr, uVar, null, jVar, jVar3, f11, f12, new t(d3, 1.0d, 0.0d, 0.0d, 0.0d), i11);
    }
}
