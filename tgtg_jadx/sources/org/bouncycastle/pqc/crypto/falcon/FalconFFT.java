package org.bouncycastle.pqc.crypto.falcon;

/* JADX INFO: loaded from: classes3.dex */
class FalconFFT {
    public static void FFT(double[] dArr, int i11, int i12) {
        int i13 = (1 << i12) >> 1;
        int i14 = 2;
        int i15 = 1;
        int i16 = i13;
        while (i15 < i12) {
            int i17 = i16 >> 1;
            int i18 = i14 >> 1;
            int i19 = 0;
            int i21 = 0;
            while (i19 < i18) {
                int i22 = i21 + i17 + i11;
                int i23 = (i14 + i19) << 1;
                double[] dArr2 = FPREngine.fpr_gm_tab;
                double d3 = dArr2[i23];
                double d11 = dArr2[i23 + 1];
                int i24 = i11 + i21;
                int i25 = i24 + i13;
                int i26 = i24 + i17;
                int i27 = i26 + i13;
                while (i24 < i22) {
                    double d12 = dArr[i24];
                    double d13 = dArr[i25];
                    double d14 = dArr[i26];
                    double d15 = dArr[i27];
                    double d16 = (d14 * d3) - (d15 * d11);
                    double d17 = (d15 * d3) + (d14 * d11);
                    dArr[i24] = d12 + d16;
                    dArr[i25] = d13 + d17;
                    dArr[i26] = d12 - d16;
                    dArr[i27] = d13 - d17;
                    i24++;
                    i25++;
                    i26++;
                    i27++;
                }
                i19++;
                i21 += i16;
            }
            i15++;
            i14 <<= 1;
            i16 = i17;
        }
    }

    public static void iFFT(double[] dArr, int i11, int i12) {
        int i13;
        int i14 = 1 << i12;
        int i15 = i14 >> 1;
        int i16 = i12;
        int i17 = 1;
        int i18 = i14;
        while (true) {
            i13 = 0;
            if (i16 <= 1) {
                break;
            }
            i18 >>= 1;
            int i19 = i17 << 1;
            int i21 = 0;
            while (i13 < i15) {
                int i22 = i13 + i17 + i11;
                int i23 = (i18 + i21) << 1;
                double[] dArr2 = FPREngine.fpr_gm_tab;
                double d3 = dArr2[i23];
                double d11 = -dArr2[i23 + 1];
                int i24 = i11 + i13;
                int i25 = i24 + i15;
                int i26 = i24 + i17;
                int i27 = i26 + i15;
                while (i24 < i22) {
                    double d12 = dArr[i24];
                    double d13 = dArr[i25];
                    double d14 = dArr[i26];
                    double d15 = dArr[i27];
                    dArr[i24] = d12 + d14;
                    dArr[i25] = d13 + d15;
                    double d16 = d12 - d14;
                    double d17 = d13 - d15;
                    dArr[i26] = (d16 * d3) - (d17 * d11);
                    dArr[i27] = (d17 * d3) + (d16 * d11);
                    i24++;
                    i25++;
                    i26++;
                    i27++;
                }
                i21++;
                i13 += i19;
            }
            i16--;
            i17 = i19;
        }
        if (i12 > 0) {
            double d18 = FPREngine.fpr_p2_tab[i12];
            while (i13 < i14) {
                int i28 = i11 + i13;
                dArr[i28] = dArr[i28] * d18;
                i13++;
            }
        }
    }

    public static void poly_LDL_fft(double[] dArr, int i11, double[] dArr2, int i12, double[] dArr3, int i13, int i14) {
        int i15 = (1 << i14) >> 1;
        int i16 = i15;
        int i17 = 0;
        int i18 = i12 + i15;
        int i19 = i12;
        while (i17 < i15) {
            double d3 = dArr[i11 + i17];
            double d11 = dArr[i11 + i16];
            double d12 = dArr2[i19];
            double d13 = dArr2[i18];
            double d14 = 1.0d / ((d11 * d11) + (d3 * d3));
            double d15 = d3 * d14;
            double d16 = d14 * (-d11);
            double d17 = (d12 * d15) - (d13 * d16);
            double d18 = (d15 * d13) + (d16 * d12);
            double d19 = (d18 * d13) + (d17 * d12);
            double d21 = (d12 * d18) + ((-d13) * d17);
            int i21 = i13 + i17;
            dArr3[i21] = dArr3[i21] - d19;
            int i22 = i13 + i16;
            dArr3[i22] = dArr3[i22] - d21;
            dArr2[i19] = d17;
            dArr2[i18] = -d18;
            i17++;
            i16++;
            i19++;
            i18++;
        }
    }

    public static void poly_add(double[] dArr, int i11, double[] dArr2, int i12, int i13) {
        int i14 = 1 << i13;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = i11 + i15;
            dArr[i16] = dArr[i16] + dArr2[i12 + i15];
        }
    }

    public static void poly_add_muladj_fft(double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4, double[] dArr5, int i11) {
        int i12 = (1 << i11) >> 1;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i13 + i12;
            double d3 = dArr2[i13];
            double d11 = dArr2[i14];
            double d12 = dArr3[i13];
            double d13 = dArr3[i14];
            double d14 = dArr4[i13];
            double d15 = dArr4[i14];
            double d16 = dArr5[i13];
            double d17 = dArr5[i14];
            double d18 = (d11 * d15) + (d3 * d14);
            double d19 = (d11 * d14) - (d3 * d15);
            dArr[i13] = d18 + (d13 * d17) + (d12 * d16);
            dArr[i14] = d19 + ((d13 * d16) - (d12 * d17));
        }
    }

    public static void poly_adj_fft(double[] dArr, int i11, int i12) {
        int i13 = 1 << i12;
        for (int i14 = i13 >> 1; i14 < i13; i14++) {
            int i15 = i11 + i14;
            dArr[i15] = -dArr[i15];
        }
    }

    public static void poly_div_autoadj_fft(double[] dArr, int i11, double[] dArr2, int i12, int i13) {
        int i14 = (1 << i13) >> 1;
        for (int i15 = 0; i15 < i14; i15++) {
            double d3 = 1.0d / dArr2[i12 + i15];
            int i16 = i11 + i15;
            dArr[i16] = dArr[i16] * d3;
            int i17 = i16 + i14;
            dArr[i17] = dArr[i17] * d3;
        }
    }

    public static void poly_invnorm2_fft(double[] dArr, int i11, double[] dArr2, int i12, double[] dArr3, int i13, int i14) {
        int i15 = (1 << i14) >> 1;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = i12 + i16;
            double d3 = dArr2[i17];
            double d11 = dArr2[i17 + i15];
            int i18 = i13 + i16;
            double d12 = dArr3[i18];
            double d13 = dArr3[i18 + i15];
            double d14 = d12 * d12;
            double d15 = d13 * d13;
            dArr[i11 + i16] = 1.0d / (d15 + (d14 + ((d11 * d11) + (d3 * d3))));
        }
    }

    public static void poly_merge_fft(double[] dArr, int i11, double[] dArr2, int i12, double[] dArr3, int i13, int i14) {
        int i15 = 1 << i14;
        int i16 = i15 >> 1;
        int i17 = i15 >> 2;
        dArr[i11] = dArr2[i12];
        dArr[i11 + i16] = dArr3[i13];
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = i13 + i18;
            double d3 = dArr3[i19];
            double d11 = dArr3[i19 + i17];
            int i21 = (i18 + i16) << 1;
            double[] dArr4 = FPREngine.fpr_gm_tab;
            double d12 = dArr4[i21];
            double d13 = dArr4[i21 + 1];
            double d14 = (d3 * d12) - (d11 * d13);
            double d15 = (d11 * d12) + (d3 * d13);
            int i22 = i12 + i18;
            double d16 = dArr2[i22];
            double d17 = dArr2[i22 + i17];
            int i23 = i11 + (i18 << 1);
            dArr[i23] = d16 + d14;
            int i24 = i23 + 1;
            dArr[i23 + i16] = d17 + d15;
            dArr[i24] = d16 - d14;
            dArr[i24 + i16] = d17 - d15;
        }
    }

    public static void poly_mul_autoadj_fft(double[] dArr, int i11, double[] dArr2, int i12, int i13) {
        int i14 = (1 << i13) >> 1;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = i11 + i15;
            int i17 = i12 + i15;
            dArr[i16] = dArr[i16] * dArr2[i17];
            int i18 = i16 + i14;
            dArr[i18] = dArr[i18] * dArr2[i17];
        }
    }

    public static void poly_mul_fft(double[] dArr, int i11, double[] dArr2, int i12, int i13) {
        int i14 = (1 << i13) >> 1;
        int i15 = i11 + i14;
        int i16 = 0;
        int i17 = i11;
        int i18 = i12;
        while (i16 < i14) {
            double d3 = dArr[i17];
            double d11 = dArr[i15];
            double d12 = dArr2[i18];
            double d13 = dArr2[i18 + i14];
            dArr[i17] = (d3 * d12) - (d11 * d13);
            dArr[i15] = (d11 * d12) + (d3 * d13);
            i16++;
            i17++;
            i18++;
            i15++;
        }
    }

    public static void poly_muladj_fft(double[] dArr, int i11, double[] dArr2, int i12, int i13) {
        int i14 = (1 << i13) >> 1;
        int i15 = 0;
        int i16 = i11;
        while (i15 < i14) {
            double d3 = dArr[i16];
            int i17 = i16 + i14;
            double d11 = dArr[i17];
            int i18 = i12 + i15;
            double d12 = dArr2[i18];
            double d13 = dArr2[i18 + i14];
            dArr[i16] = (d11 * d13) + (d3 * d12);
            dArr[i17] = (d11 * d12) - (d3 * d13);
            i15++;
            i16++;
        }
    }

    public static void poly_mulconst(double[] dArr, int i11, double d3, int i12) {
        int i13 = 1 << i12;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i11 + i14;
            dArr[i15] = dArr[i15] * d3;
        }
    }

    public static void poly_mulselfadj_fft(double[] dArr, int i11, int i12) {
        int i13 = (1 << i12) >> 1;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i11 + i14;
            double d3 = dArr[i15];
            int i16 = i15 + i13;
            double d11 = dArr[i16];
            dArr[i15] = (d11 * d11) + (d3 * d3);
            dArr[i16] = 0.0d;
        }
    }

    public static void poly_neg(double[] dArr, int i11, int i12) {
        int i13 = 1 << i12;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i11 + i14;
            dArr[i15] = -dArr[i15];
        }
    }

    public static void poly_split_fft(double[] dArr, int i11, double[] dArr2, int i12, double[] dArr3, int i13, int i14) {
        int i15 = 1 << i14;
        int i16 = i15 >> 1;
        int i17 = i15 >> 2;
        dArr[i11] = dArr3[i13];
        dArr2[i12] = dArr3[i13 + i16];
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = i13 + (i18 << 1);
            double d3 = dArr3[i19];
            int i21 = i19 + 1;
            double d11 = dArr3[i19 + i16];
            double d12 = dArr3[i21];
            double d13 = dArr3[i21 + i16];
            int i22 = i11 + i18;
            dArr[i22] = (d3 + d12) * 0.5d;
            dArr[i22 + i17] = (d11 + d13) * 0.5d;
            double d14 = d3 - d12;
            double d15 = d11 - d13;
            int i23 = (i18 + i16) << 1;
            double[] dArr4 = FPREngine.fpr_gm_tab;
            double d16 = dArr4[i23];
            double d17 = -dArr4[i23 + 1];
            int i24 = i12 + i18;
            dArr2[i24] = ((d14 * d16) - (d15 * d17)) * 0.5d;
            dArr2[i24 + i17] = ((d15 * d16) + (d14 * d17)) * 0.5d;
        }
    }

    public static void poly_sub(double[] dArr, int i11, double[] dArr2, int i12, int i13) {
        int i14 = 1 << i13;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = i11 + i15;
            dArr[i16] = dArr[i16] - dArr2[i12 + i15];
        }
    }
}
