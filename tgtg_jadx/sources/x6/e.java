package x6;

import android.graphics.Path;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char f43877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f43878b;

    public e(e eVar) {
        this.f43877a = eVar.f43877a;
        float[] fArr = eVar.f43878b;
        this.f43878b = m0.c.W(fArr, fArr.length);
    }

    public static void a(Path path, float f11, float f12, float f13, float f14, float f15, float f16, float f17, boolean z11, boolean z12) {
        double d3;
        double d11;
        double radians = Math.toRadians(f17);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d12 = f11;
        double d13 = f12;
        double d14 = f15;
        double d15 = ((d13 * dSin) + (d12 * dCos)) / d14;
        double d16 = f16;
        double d17 = ((d13 * dCos) + (((double) (-f11)) * dSin)) / d16;
        double d18 = f14;
        double d19 = ((d18 * dSin) + (((double) f13) * dCos)) / d14;
        double d21 = ((d18 * dCos) + (((double) (-f13)) * dSin)) / d16;
        double d22 = d15 - d19;
        double d23 = d17 - d21;
        double d24 = (d15 + d19) / 2.0d;
        double d25 = (d17 + d21) / 2.0d;
        double d26 = (d23 * d23) + (d22 * d22);
        if (d26 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d27 = (1.0d / d26) - 0.25d;
        if (d27 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d26);
            float fSqrt = (float) (Math.sqrt(d26) / 1.99999d);
            a(path, f11, f12, f13, f14, f15 * fSqrt, fSqrt * f16, f17, z11, z12);
            return;
        }
        double dSqrt = Math.sqrt(d27);
        double d28 = dSqrt * d22;
        double d29 = dSqrt * d23;
        if (z11 == z12) {
            d3 = d24 - d29;
            d11 = d25 + d28;
        } else {
            d3 = d24 + d29;
            d11 = d25 - d28;
        }
        double dAtan2 = Math.atan2(d17 - d11, d15 - d3);
        double dAtan22 = Math.atan2(d21 - d11, d19 - d3) - dAtan2;
        if (z12 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d31 = d3 * d14;
        double d32 = d11 * d16;
        double d33 = (d31 * dCos) - (d32 * dSin);
        double d34 = (d32 * dCos) + (d31 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d35 = -d14;
        double d36 = d35 * dCos2;
        double d37 = d16 * dSin2;
        double d38 = (d36 * dSin3) - (d37 * dCos3);
        double d39 = d35 * dSin2;
        double d41 = d16 * dCos2;
        double d42 = dAtan22 / ((double) iCeil);
        double d43 = (dCos3 * d41) + (dSin3 * d39);
        double d44 = d12;
        double d45 = d13;
        int i11 = 0;
        double d46 = dAtan2;
        while (i11 < iCeil) {
            double d47 = d46 + d42;
            double dSin4 = Math.sin(d47);
            double dCos4 = Math.cos(d47);
            int i12 = iCeil;
            double d48 = (((d14 * dCos2) * dCos4) + d33) - (d37 * dSin4);
            double d49 = (d41 * dSin4) + (d14 * dSin2 * dCos4) + d34;
            double d51 = (d36 * dSin4) - (d37 * dCos4);
            double d52 = (dCos4 * d41) + (dSin4 * d39);
            double d53 = d47 - d46;
            double dTan = Math.tan(d53 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d53)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d38 * dSqrt2) + d44), (float) ((d43 * dSqrt2) + d45), (float) (d48 - (dSqrt2 * d51)), (float) (d49 - (dSqrt2 * d52)), (float) d48, (float) d49);
            i11++;
            d45 = d49;
            dCos2 = dCos2;
            d39 = d39;
            d46 = d47;
            d43 = d52;
            d44 = d48;
            iCeil = i12;
            d38 = d51;
            d42 = d42;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(e[] eVarArr, Path path) {
        int i11;
        float[] fArr;
        int i12;
        e eVar;
        int i13;
        char c3;
        float f11;
        float f12;
        e eVar2;
        boolean z11;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        e[] eVarArr2 = eVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = eVarArr2.length;
        int i14 = 0;
        int i15 = 0;
        char c7 = 'm';
        while (i15 < length) {
            e eVar3 = eVarArr2[i15];
            char c8 = eVar3.f43877a;
            float[] fArr3 = eVar3.f43878b;
            float f21 = fArr2[i14];
            float f22 = fArr2[1];
            float f23 = fArr2[2];
            float f24 = fArr2[3];
            float f25 = fArr2[4];
            int i16 = i14;
            float f26 = fArr2[5];
            switch (c8) {
                case 'A':
                case 'a':
                    i11 = 7;
                    break;
                case 'C':
                case 'c':
                    i11 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i11 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i11 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f25, f26);
                    f21 = f25;
                    f23 = f21;
                    f22 = f26;
                    f24 = f22;
                default:
                    i11 = 2;
                    break;
            }
            float f27 = f25;
            float f28 = f26;
            float f29 = f21;
            float f31 = f22;
            int i17 = i16;
            while (i17 < fArr3.length) {
                if (c8 == 'A') {
                    fArr = fArr3;
                    i12 = i17;
                    eVar = eVar3;
                    float f32 = f29;
                    float f33 = f31;
                    i13 = i15;
                    c3 = c8;
                    int i18 = i12 + 5;
                    int i19 = i12 + 6;
                    a(path, f32, f33, fArr[i18], fArr[i19], fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3] != 0.0f ? 1 : i16, fArr[i12 + 4] != 0.0f ? 1 : i16);
                    f23 = fArr[i18];
                    f11 = fArr[i19];
                    f24 = f11;
                    f12 = f23;
                } else if (c8 == 'C') {
                    fArr = fArr3;
                    i12 = i17;
                    i13 = i15;
                    eVar = eVar3;
                    c3 = c8;
                    int i21 = i12 + 2;
                    int i22 = i12 + 3;
                    int i23 = i12 + 4;
                    int i24 = i12 + 5;
                    path2.cubicTo(fArr[i12], fArr[i12 + 1], fArr[i21], fArr[i22], fArr[i23], fArr[i24]);
                    float f34 = fArr[i23];
                    float f35 = fArr[i24];
                    f23 = fArr[i21];
                    f24 = fArr[i22];
                    f11 = f35;
                    f12 = f34;
                } else if (c8 == 'H') {
                    fArr = fArr3;
                    i12 = i17;
                    eVar = eVar3;
                    c3 = c8;
                    f11 = f31;
                    i13 = i15;
                    path2.lineTo(fArr[i12], f11);
                    f12 = fArr[i12];
                } else if (c8 == 'Q') {
                    fArr = fArr3;
                    i12 = i17;
                    i13 = i15;
                    eVar = eVar3;
                    c3 = c8;
                    int i25 = i12 + 1;
                    int i26 = i12 + 2;
                    int i27 = i12 + 3;
                    path2.quadTo(fArr[i12], fArr[i25], fArr[i26], fArr[i27]);
                    float f36 = fArr[i12];
                    float f37 = fArr[i25];
                    float f38 = fArr[i26];
                    float f39 = fArr[i27];
                    f23 = f36;
                    f24 = f37;
                    f12 = f38;
                    f11 = f39;
                } else if (c8 == 'V') {
                    fArr = fArr3;
                    i12 = i17;
                    i13 = i15;
                    eVar = eVar3;
                    f12 = f29;
                    c3 = c8;
                    path2.lineTo(f12, fArr[i12]);
                    f11 = fArr[i12];
                } else if (c8 != 'a') {
                    if (c8 == 'c') {
                        fArr = fArr3;
                        i12 = i17;
                        int i28 = i12 + 2;
                        int i29 = i12 + 3;
                        int i31 = i12 + 4;
                        int i32 = i12 + 5;
                        path2.rCubicTo(fArr[i12], fArr[i12 + 1], fArr[i28], fArr[i29], fArr[i31], fArr[i32]);
                        float f40 = fArr[i28] + f29;
                        float f41 = fArr[i29] + f31;
                        f29 += fArr[i31];
                        f31 += fArr[i32];
                        f23 = f40;
                        f24 = f41;
                    } else if (c8 != 'h') {
                        if (c8 != 'q') {
                            if (c8 != 'v') {
                                if (c8 == 'L') {
                                    fArr = fArr3;
                                    i12 = i17;
                                    int i33 = i12 + 1;
                                    path2.lineTo(fArr[i12], fArr[i33]);
                                    f12 = fArr[i12];
                                    f11 = fArr[i33];
                                } else if (c8 == 'M') {
                                    fArr = fArr3;
                                    i12 = i17;
                                    f12 = fArr[i12];
                                    f11 = fArr[i12 + 1];
                                    if (i12 > 0) {
                                        path2.lineTo(f12, f11);
                                    } else {
                                        path2.moveTo(f12, f11);
                                        f27 = f12;
                                        f28 = f11;
                                    }
                                } else if (c8 != 'S') {
                                    if (c8 == 'T') {
                                        fArr = fArr3;
                                        i12 = i17;
                                        if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                            f29 = (f29 * 2.0f) - f23;
                                            f31 = (f31 * 2.0f) - f24;
                                        }
                                        int i34 = i12 + 1;
                                        path2.quadTo(f29, f31, fArr[i12], fArr[i34]);
                                        f12 = fArr[i12];
                                        f11 = fArr[i34];
                                        eVar = eVar3;
                                        f23 = f29;
                                        f24 = f31;
                                    } else if (c8 == 'l') {
                                        fArr = fArr3;
                                        i12 = i17;
                                        int i35 = i12 + 1;
                                        path2.rLineTo(fArr[i12], fArr[i35]);
                                        f29 += fArr[i12];
                                        f16 = fArr[i35];
                                    } else if (c8 == 'm') {
                                        fArr = fArr3;
                                        i12 = i17;
                                        float f42 = fArr[i12];
                                        f29 += f42;
                                        float f43 = fArr[i12 + 1];
                                        f31 += f43;
                                        if (i12 > 0) {
                                            path2.rLineTo(f42, f43);
                                        } else {
                                            path2.rMoveTo(f42, f43);
                                            eVar = eVar3;
                                            f12 = f29;
                                            f27 = f12;
                                            f11 = f31;
                                            f28 = f11;
                                        }
                                    } else if (c8 != 's') {
                                        if (c8 != 't') {
                                            fArr = fArr3;
                                            i12 = i17;
                                            eVar = eVar3;
                                            f12 = f29;
                                        } else {
                                            if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                                f19 = f29 - f23;
                                                f20 = f31 - f24;
                                            } else {
                                                f20 = 0.0f;
                                                f19 = 0.0f;
                                            }
                                            int i36 = i17 + 1;
                                            path2.rQuadTo(f19, f20, fArr3[i17], fArr3[i36]);
                                            float f44 = f19 + f29;
                                            float f45 = f20 + f31;
                                            float f46 = f29 + fArr3[i17];
                                            f31 += fArr3[i36];
                                            f24 = f45;
                                            fArr = fArr3;
                                            i12 = i17;
                                            eVar = eVar3;
                                            f12 = f46;
                                            f23 = f44;
                                        }
                                        f11 = f31;
                                    } else {
                                        if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                            f17 = f31 - f24;
                                            f18 = f29 - f23;
                                        } else {
                                            f18 = 0.0f;
                                            f17 = 0.0f;
                                        }
                                        int i37 = i17;
                                        int i38 = i37 + 1;
                                        int i39 = i37 + 2;
                                        int i41 = i37 + 3;
                                        fArr = fArr3;
                                        i12 = i37;
                                        path2.rCubicTo(f18, f17, fArr3[i37], fArr3[i38], fArr3[i39], fArr3[i41]);
                                        f13 = fArr[i12] + f29;
                                        f14 = fArr[i38] + f31;
                                        f29 += fArr[i39];
                                        f15 = fArr[i41];
                                    }
                                    i13 = i15;
                                    c3 = c8;
                                } else {
                                    fArr = fArr3;
                                    i12 = i17;
                                    if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                        f29 = (f29 * 2.0f) - f23;
                                        f31 = (f31 * 2.0f) - f24;
                                    }
                                    float f47 = f29;
                                    float f48 = f31;
                                    int i42 = i12 + 1;
                                    int i43 = i12 + 2;
                                    int i44 = i12 + 3;
                                    path2.cubicTo(f47, f48, fArr[i12], fArr[i42], fArr[i43], fArr[i44]);
                                    f23 = fArr[i12];
                                    f24 = fArr[i42];
                                    f12 = fArr[i43];
                                    f11 = fArr[i44];
                                }
                                i13 = i15;
                                eVar = eVar3;
                                c3 = c8;
                            } else {
                                fArr = fArr3;
                                i12 = i17;
                                path2.rLineTo(0.0f, fArr[i12]);
                                f16 = fArr[i12];
                            }
                            f31 += f16;
                        } else {
                            fArr = fArr3;
                            i12 = i17;
                            int i45 = i12 + 1;
                            int i46 = i12 + 2;
                            int i47 = i12 + 3;
                            path2.rQuadTo(fArr[i12], fArr[i45], fArr[i46], fArr[i47]);
                            f13 = fArr[i12] + f29;
                            f14 = fArr[i45] + f31;
                            f29 += fArr[i46];
                            f15 = fArr[i47];
                        }
                        f31 += f15;
                        f23 = f13;
                        f24 = f14;
                    } else {
                        fArr = fArr3;
                        i12 = i17;
                        path2.rLineTo(fArr[i12], 0.0f);
                        f29 += fArr[i12];
                    }
                    eVar = eVar3;
                    f12 = f29;
                    f11 = f31;
                    i13 = i15;
                    c3 = c8;
                } else {
                    fArr = fArr3;
                    i12 = i17;
                    int i48 = i12 + 5;
                    float f49 = fArr[i48] + f29;
                    int i49 = i12 + 6;
                    float f51 = fArr[i49] + f31;
                    float f52 = fArr[i12];
                    float f53 = fArr[i12 + 1];
                    float f54 = fArr[i12 + 2];
                    if (fArr[i12 + 3] != 0.0f) {
                        eVar2 = eVar3;
                        z11 = 1;
                    } else {
                        eVar2 = eVar3;
                        z11 = i16;
                    }
                    eVar = eVar2;
                    float f55 = f29;
                    c3 = c8;
                    float f56 = f31;
                    i13 = i15;
                    a(path, f55, f56, f49, f51, f52, f53, f54, z11, fArr[i12 + 4] != 0.0f ? 1 : i16);
                    f12 = f55 + fArr[i48];
                    f11 = f56 + fArr[i49];
                    f23 = f12;
                    f24 = f11;
                }
                i17 = i12 + i11;
                path2 = path;
                eVar3 = eVar;
                c8 = c3;
                i15 = i13;
                f29 = f12;
                f31 = f11;
                c7 = c8;
                fArr3 = fArr;
            }
            fArr2[i16] = f29;
            fArr2[1] = f31;
            fArr2[2] = f23;
            fArr2[3] = f24;
            fArr2[4] = f27;
            fArr2[5] = f28;
            c7 = eVar3.f43877a;
            i15++;
            eVarArr2 = eVarArr;
            path2 = path;
            i14 = i16;
        }
    }

    public e(char c3, float[] fArr) {
        this.f43877a = c3;
        this.f43878b = fArr;
    }
}
