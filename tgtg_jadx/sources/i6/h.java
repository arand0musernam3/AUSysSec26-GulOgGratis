package i6;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends xz.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double[] f23425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double[][] f23426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double[][] f23427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double[] f23428g;

    public h(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f23428g = new double[length2];
        int i11 = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i11, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i12 = 0; i12 < length2; i12++) {
            int i13 = 0;
            while (i13 < i11) {
                int i14 = i13 + 1;
                double d3 = dArr[i14] - dArr[i13];
                double[] dArr5 = dArr3[i13];
                double d11 = (dArr2[i14][i12] - dArr2[i13][i12]) / d3;
                dArr5[i12] = d11;
                if (i13 == 0) {
                    dArr4[i13][i12] = d11;
                } else {
                    dArr4[i13][i12] = (dArr3[i13 - 1][i12] + d11) * 0.5d;
                }
                i13 = i14;
            }
            dArr4[i11][i12] = dArr3[length - 2][i12];
        }
        for (int i15 = 0; i15 < i11; i15++) {
            for (int i16 = 0; i16 < length2; i16++) {
                double d12 = dArr3[i15][i16];
                if (d12 == 0.0d) {
                    dArr4[i15][i16] = 0.0d;
                    dArr4[i15 + 1][i16] = 0.0d;
                } else {
                    double d13 = dArr4[i15][i16] / d12;
                    int i17 = i15 + 1;
                    double d14 = dArr4[i17][i16] / d12;
                    double dHypot = Math.hypot(d13, d14);
                    if (dHypot > 9.0d) {
                        double d15 = 3.0d / dHypot;
                        double[] dArr6 = dArr4[i15];
                        double[] dArr7 = dArr3[i15];
                        dArr6[i16] = d13 * d15 * dArr7[i16];
                        dArr4[i17][i16] = d15 * d14 * dArr7[i16];
                    }
                }
            }
        }
        this.f23425d = dArr;
        this.f23426e = dArr2;
        this.f23427f = dArr4;
    }

    public static double R(double d3, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d11 * d11;
        double d17 = d11 * 6.0d;
        double d18 = 6.0d * d16 * d12;
        double d19 = (d18 + ((d17 * d13) + (((-6.0d) * d16) * d13))) - (d17 * d12);
        double d21 = 3.0d * d3;
        return (d3 * d14) + (((((d21 * d14) * d16) + (((d21 * d15) * d16) + d19)) - (((2.0d * d3) * d15) * d11)) - (((4.0d * d3) * d14) * d11));
    }

    public static double T(double d3, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d11 * d11;
        double d17 = d16 * d11;
        double d18 = 3.0d * d16;
        double d19 = d17 * 2.0d * d12;
        double d21 = ((d19 + ((d18 * d13) + (((-2.0d) * d17) * d13))) - (d18 * d12)) + d12;
        double d22 = d3 * d15;
        double d23 = (d22 * d17) + d21;
        double d24 = d3 * d14;
        return (d24 * d11) + ((((d17 * d24) + d23) - (d22 * d16)) - (((d3 * 2.0d) * d14) * d16));
    }

    public final double S(double d3) {
        double[] dArr = this.f23425d;
        int length = dArr.length;
        double d11 = dArr[0];
        if (d3 >= d11) {
            d11 = dArr[length - 1];
            if (d3 < d11) {
                d11 = d3;
            }
        }
        int i11 = 0;
        while (i11 < length - 1) {
            int i12 = i11 + 1;
            double d12 = dArr[i12];
            if (d11 <= d12) {
                double d13 = dArr[i11];
                double d14 = d12 - d13;
                double[][] dArr2 = this.f23426e;
                double d15 = dArr2[i11][0];
                double d16 = dArr2[i12][0];
                double[][] dArr3 = this.f23427f;
                return R(d14, (d11 - d13) / d14, d15, d16, dArr3[i11][0], dArr3[i12][0]) / d14;
            }
            i11 = i12;
        }
        return 0.0d;
    }

    @Override // xz.b
    public final double u(double d3) {
        double d11;
        double d12;
        double dS;
        double[] dArr = this.f23425d;
        int length = dArr.length;
        double d13 = dArr[0];
        double[][] dArr2 = this.f23426e;
        if (d3 <= d13) {
            d11 = dArr2[0][0];
            d12 = d3 - d13;
            dS = S(d13);
        } else {
            int i11 = length - 1;
            double d14 = dArr[i11];
            if (d3 < d14) {
                int i12 = 0;
                while (i12 < i11) {
                    double d15 = dArr[i12];
                    if (d3 == d15) {
                        return dArr2[i12][0];
                    }
                    int i13 = i12 + 1;
                    double d16 = dArr[i13];
                    if (d3 < d16) {
                        double d17 = d16 - d15;
                        double d18 = (d3 - d15) / d17;
                        double d19 = dArr2[i12][0];
                        double d21 = dArr2[i13][0];
                        double[][] dArr3 = this.f23427f;
                        return T(d17, d18, d19, d21, dArr3[i12][0], dArr3[i13][0]);
                    }
                    i12 = i13;
                }
                return 0.0d;
            }
            d11 = dArr2[i11][0];
            d12 = d3 - d14;
            dS = S(d14);
        }
        return (dS * d12) + d11;
    }

    @Override // xz.b
    public final void v(double d3, double[] dArr) {
        double[] dArr2 = this.f23425d;
        int length = dArr2.length;
        double[][] dArr3 = this.f23426e;
        int i11 = 0;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        double[] dArr4 = this.f23428g;
        if (d3 <= d11) {
            x(d11, dArr4);
            for (int i12 = 0; i12 < length2; i12++) {
                dArr[i12] = ((d3 - dArr2[0]) * dArr4[i12]) + dArr3[0][i12];
            }
            return;
        }
        int i13 = length - 1;
        double d12 = dArr2[i13];
        if (d3 >= d12) {
            x(d12, dArr4);
            while (i11 < length2) {
                dArr[i11] = ((d3 - dArr2[i13]) * dArr4[i11]) + dArr3[i13][i11];
                i11++;
            }
            return;
        }
        int i14 = 0;
        while (i14 < i13) {
            if (d3 == dArr2[i14]) {
                for (int i15 = 0; i15 < length2; i15++) {
                    dArr[i15] = dArr3[i14][i15];
                }
            }
            int i16 = i14 + 1;
            double d13 = dArr2[i16];
            if (d3 < d13) {
                double d14 = dArr2[i14];
                double d15 = d13 - d14;
                double d16 = (d3 - d14) / d15;
                while (i11 < length2) {
                    double d17 = dArr3[i14][i11];
                    double d18 = dArr3[i16][i11];
                    double[][] dArr5 = this.f23427f;
                    dArr[i11] = T(d15, d16, d17, d18, dArr5[i14][i11], dArr5[i16][i11]);
                    i11++;
                }
                return;
            }
            i14 = i16;
        }
    }

    @Override // xz.b
    public final void w(double d3, float[] fArr) {
        double[] dArr = this.f23425d;
        int length = dArr.length;
        double[][] dArr2 = this.f23426e;
        int i11 = 0;
        int length2 = dArr2[0].length;
        double d11 = dArr[0];
        double[] dArr3 = this.f23428g;
        if (d3 <= d11) {
            x(d11, dArr3);
            for (int i12 = 0; i12 < length2; i12++) {
                fArr[i12] = (float) (((d3 - dArr[0]) * dArr3[i12]) + dArr2[0][i12]);
            }
            return;
        }
        int i13 = length - 1;
        double d12 = dArr[i13];
        if (d3 >= d12) {
            x(d12, dArr3);
            while (i11 < length2) {
                fArr[i11] = (float) (((d3 - dArr[i13]) * dArr3[i11]) + dArr2[i13][i11]);
                i11++;
            }
            return;
        }
        int i14 = 0;
        while (i14 < i13) {
            if (d3 == dArr[i14]) {
                for (int i15 = 0; i15 < length2; i15++) {
                    fArr[i15] = (float) dArr2[i14][i15];
                }
            }
            int i16 = i14 + 1;
            double d13 = dArr[i16];
            if (d3 < d13) {
                double d14 = dArr[i14];
                double d15 = d13 - d14;
                double d16 = (d3 - d14) / d15;
                while (i11 < length2) {
                    double d17 = dArr2[i14][i11];
                    double d18 = dArr2[i16][i11];
                    double[][] dArr4 = this.f23427f;
                    fArr[i11] = (float) T(d15, d16, d17, d18, dArr4[i14][i11], dArr4[i16][i11]);
                    i11++;
                }
                return;
            }
            i14 = i16;
        }
    }

    @Override // xz.b
    public final void x(double d3, double[] dArr) {
        double[] dArr2 = this.f23425d;
        int length = dArr2.length;
        double[][] dArr3 = this.f23426e;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        if (d3 > d11) {
            d11 = dArr2[length - 1];
            if (d3 < d11) {
                d11 = d3;
            }
        }
        int i11 = 0;
        while (i11 < length - 1) {
            int i12 = i11 + 1;
            double d12 = dArr2[i12];
            if (d11 <= d12) {
                double d13 = dArr2[i11];
                double d14 = d12 - d13;
                double d15 = (d11 - d13) / d14;
                for (int i13 = 0; i13 < length2; i13++) {
                    double d16 = dArr3[i11][i13];
                    double d17 = dArr3[i12][i13];
                    double[][] dArr4 = this.f23427f;
                    dArr[i13] = R(d14, d15, d16, d17, dArr4[i11][i13], dArr4[i12][i13]) / d14;
                }
                return;
            }
            i11 = i12;
        }
    }

    @Override // xz.b
    public final double[] z() {
        return this.f23425d;
    }
}
