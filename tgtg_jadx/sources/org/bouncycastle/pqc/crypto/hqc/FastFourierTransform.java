package org.bouncycastle.pqc.crypto.hqc;

/* JADX INFO: loaded from: classes3.dex */
class FastFourierTransform {
    public static void computeFFTBetas(int[] iArr, int i11) {
        int i12 = 0;
        while (true) {
            int i13 = i11 - 1;
            if (i12 >= i13) {
                return;
            }
            iArr[i12] = 1 << (i13 - i12);
            i12++;
        }
    }

    public static void computeFFTRec(int[] iArr, int[] iArr2, int i11, int i12, int i13, int[] iArr3, int i14, int i15) {
        int i16;
        int i17;
        int[] iArr4;
        int i18 = 1;
        int i19 = 1 << (i14 - 2);
        int i21 = i15 - 2;
        int i22 = 1 << i21;
        int[] iArr5 = new int[i19];
        int[] iArr6 = new int[i19];
        int[] iArr7 = new int[i21];
        int[] iArr8 = new int[i21];
        int[] iArr9 = new int[i22];
        int[] iArr10 = new int[i22];
        int[] iArr11 = new int[i22];
        int[] iArr12 = new int[(i15 - i14) + 1];
        if (i13 == 1) {
            for (int i23 = 0; i23 < i12; i23++) {
                iArr12[i23] = GFCalculator.mult(iArr3[i23], iArr2[1]);
            }
            iArr[0] = iArr2[0];
            for (int i24 = 0; i24 < i12; i24++) {
                for (int i25 = 0; i25 < i18; i25++) {
                    iArr[i18 + i25] = iArr[i25] ^ iArr12[i24];
                }
                i18 <<= 1;
            }
            return;
        }
        int i26 = i12 - 1;
        if (iArr3[i26] != 1) {
            int i27 = 1 << i13;
            i16 = 1;
            i17 = 0;
            int iMult = 1;
            while (true) {
                iArr4 = iArr8;
                if (i18 >= i27) {
                    break;
                }
                iMult = GFCalculator.mult(iMult, iArr3[i26]);
                iArr2[i18] = GFCalculator.mult(iMult, iArr2[i18]);
                i18++;
                iArr8 = iArr4;
            }
        } else {
            i16 = 1;
            i17 = 0;
            iArr4 = iArr8;
        }
        computeRadix(iArr5, iArr6, iArr2, i13, i14);
        for (int i28 = i17; i28 < i26; i28++) {
            int iMult2 = GFCalculator.mult(iArr3[i28], GFCalculator.inverse(iArr3[i26]));
            iArr7[i28] = iMult2;
            iArr4[i28] = GFCalculator.mult(iMult2, iMult2) ^ iArr7[i28];
        }
        computeSubsetSum(iArr9, iArr7, i26);
        int i29 = i13 - 1;
        int[] iArr13 = iArr4;
        computeFFTRec(iArr10, iArr5, (i11 + 1) / 2, i26, i29, iArr13, i14, i15);
        int i31 = i16 << (i26 & 15);
        if (i11 <= 3) {
            iArr[i17] = iArr10[i17];
            iArr[i31] = iArr10[i17] ^ iArr6[i17];
            for (int i32 = i16; i32 < i31; i32++) {
                int iMult3 = iArr10[i32] ^ GFCalculator.mult(iArr9[i32], iArr6[i17]);
                iArr[i32] = iMult3;
                iArr[i31 + i32] = iMult3 ^ iArr6[i17];
            }
            return;
        }
        computeFFTRec(iArr11, iArr6, i11 / 2, i26, i29, iArr13, i14, i15);
        int i33 = i17;
        System.arraycopy(iArr11, i33, iArr, i31, i31);
        iArr[i33] = iArr10[i33];
        iArr[i31] = iArr10[i33] ^ iArr[i31];
        for (int i34 = i16; i34 < i31; i34++) {
            int iMult4 = iArr10[i34] ^ GFCalculator.mult(iArr9[i34], iArr11[i34]);
            iArr[i34] = iMult4;
            int i35 = i31 + i34;
            iArr[i35] = iMult4 ^ iArr[i35];
        }
    }

    public static void computeRadix(int[] iArr, int[] iArr2, int[] iArr3, int i11, int i12) {
        if (i11 == 1) {
            iArr[0] = iArr3[0];
            iArr2[0] = iArr3[1];
            return;
        }
        if (i11 == 2) {
            iArr[0] = iArr3[0];
            int i13 = iArr3[2];
            int i14 = iArr3[3];
            int i15 = i13 ^ i14;
            iArr[1] = i15;
            iArr2[0] = i15 ^ iArr3[1];
            iArr2[1] = i14;
            return;
        }
        if (i11 == 3) {
            iArr[0] = iArr3[0];
            int i16 = iArr3[4];
            int i17 = iArr3[6];
            iArr[2] = i16 ^ i17;
            int i18 = iArr3[7];
            iArr[3] = i17 ^ i18;
            int i19 = iArr3[3];
            int i21 = iArr3[5];
            int i22 = (i19 ^ i21) ^ i18;
            iArr2[1] = i22;
            iArr2[2] = i21 ^ i17;
            iArr2[3] = i18;
            int i23 = (iArr3[2] ^ iArr[2]) ^ i22;
            iArr[1] = i23;
            iArr2[0] = i23 ^ iArr3[1];
            return;
        }
        if (i11 != 4) {
            computeRadixBig(iArr, iArr2, iArr3, i11, i12);
            return;
        }
        int i24 = iArr3[8];
        int i25 = iArr3[12];
        iArr[4] = i24 ^ i25;
        int i26 = iArr3[14];
        iArr[6] = i25 ^ i26;
        int i27 = iArr3[15];
        iArr[7] = i26 ^ i27;
        int i28 = iArr3[11];
        int i29 = iArr3[13];
        int i31 = i28 ^ i29;
        iArr2[5] = i31;
        iArr2[6] = i29 ^ i26;
        iArr2[7] = i27;
        int i32 = iArr3[10];
        int i33 = (i25 ^ i32) ^ i31;
        iArr[5] = i33;
        int i34 = iArr3[9];
        iArr2[4] = i33 ^ (i34 ^ i29);
        iArr[0] = iArr3[0];
        int i35 = (iArr3[7] ^ i28) ^ i27;
        iArr2[3] = i35;
        int i36 = (i26 ^ (iArr3[6] ^ i32)) ^ i35;
        iArr[3] = i36;
        int i37 = (iArr3[4] ^ iArr[4]) ^ i36;
        int i38 = iArr2[3];
        iArr[2] = i37 ^ i38;
        int i39 = iArr3[3];
        int i41 = (((iArr3[5] ^ i39) ^ i34) ^ i29) ^ i38;
        iArr2[1] = i41;
        iArr2[2] = i36 ^ (i39 ^ i41);
        int i42 = (iArr3[2] ^ iArr[2]) ^ i41;
        iArr[1] = i42;
        iArr2[0] = i42 ^ iArr3[1];
    }

    public static void computeRadixBig(int[] iArr, int[] iArr2, int[] iArr3, int i11, int i12) {
        int i13 = 1 << (i11 - 2);
        int i14 = 1 << (i12 - 2);
        int i15 = (i14 * 2) + 1;
        int[] iArr4 = new int[i15];
        int[] iArr5 = new int[i15];
        int[] iArr6 = new int[i14];
        int[] iArr7 = new int[i14];
        int[] iArr8 = new int[i14];
        int[] iArr9 = new int[i14];
        int i16 = i13 * 3;
        int i17 = i13 * 2;
        Utils.copyBytes(iArr3, i16, iArr4, 0, i17);
        Utils.copyBytes(iArr3, i16, iArr4, i13, i17);
        Utils.copyBytes(iArr3, 0, iArr5, 0, i13 * 4);
        for (int i18 = 0; i18 < i13; i18++) {
            int i19 = iArr4[i18] ^ iArr3[i17 + i18];
            iArr4[i18] = i19;
            int i21 = i13 + i18;
            iArr5[i21] = iArr5[i21] ^ i19;
        }
        int i22 = i11 - 1;
        computeRadix(iArr6, iArr7, iArr4, i22, i12);
        computeRadix(iArr8, iArr9, iArr5, i22, i12);
        Utils.copyBytes(iArr8, 0, iArr, 0, i17);
        Utils.copyBytes(iArr6, 0, iArr, i13, i17);
        Utils.copyBytes(iArr9, 0, iArr2, 0, i17);
        Utils.copyBytes(iArr7, 0, iArr2, i13, i17);
    }

    public static void computeSubsetSum(int[] iArr, int[] iArr2, int i11) {
        iArr[0] = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = 0;
            while (true) {
                int i14 = 1 << i12;
                if (i13 < i14) {
                    iArr[i14 + i13] = iArr2[i12] ^ iArr[i13];
                    i13++;
                }
            }
        }
    }

    public static void fastFourierTransform(int[] iArr, int[] iArr2, int i11, int i12) {
        int i13 = 1 << i12;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[7];
        int[] iArr6 = new int[128];
        int[] iArr7 = new int[128];
        int[] iArr8 = new int[7];
        int[] iArr9 = new int[128];
        computeFFTBetas(iArr8, 8);
        computeSubsetSum(iArr9, iArr8, 7);
        computeRadix(iArr3, iArr4, iArr2, i12, i12);
        for (int i14 = 0; i14 < 7; i14++) {
            int i15 = iArr8[i14];
            iArr5[i14] = GFCalculator.mult(i15, i15) ^ iArr8[i14];
        }
        int i16 = i12 - 1;
        computeFFTRec(iArr6, iArr3, (i11 + 1) / 2, 7, i16, iArr5, i12, 8);
        computeFFTRec(iArr7, iArr4, i11 / 2, 7, i16, iArr5, i12, 8);
        System.arraycopy(iArr7, 0, iArr, 128, 128);
        iArr[0] = iArr6[0];
        iArr[128] = iArr[128] ^ iArr6[0];
        for (int i17 = 1; i17 < 128; i17++) {
            int iMult = iArr6[i17] ^ GFCalculator.mult(iArr9[i17], iArr7[i17]);
            iArr[i17] = iMult;
            int i18 = 128 + i17;
            iArr[i18] = iMult ^ iArr[i18];
        }
    }

    public static void fastFourierTransformGetError(byte[] bArr, int[] iArr, int i11, int[] iArr2) {
        int[] iArr3 = new int[7];
        int[] iArr4 = new int[i11];
        computeFFTBetas(iArr3, 8);
        computeSubsetSum(iArr4, iArr3, 7);
        byte unsigned16Bits = (byte) (bArr[0] ^ (Utils.toUnsigned16Bits((-iArr[0]) >> 15) ^ 1));
        bArr[0] = unsigned16Bits;
        bArr[0] = (byte) (unsigned16Bits ^ (Utils.toUnsigned16Bits((-iArr[i11]) >> 15) ^ 1));
        for (int i12 = 1; i12 < i11; i12++) {
            int i13 = 255 - iArr2[iArr4[i12]];
            bArr[i13] = (byte) (bArr[i13] ^ (Math.abs((-iArr[i12]) >> 15) ^ 1));
            int i14 = 255 - iArr2[iArr4[i12] ^ 1];
            bArr[i14] = (byte) (bArr[i14] ^ (Math.abs((-iArr[i11 + i12]) >> 15) ^ 1));
        }
    }
}
