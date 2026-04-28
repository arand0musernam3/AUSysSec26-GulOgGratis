package org.bouncycastle.pqc.legacy.math.linearalgebra;

import a40.d0;
import b3.i;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import i4.a;
import j4.d;
import java.math.BigInteger;
import java.util.Random;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.bouncycastle.util.Arrays;
import org.brotli.dec.BrotliInputStream;
import w.a0;

/* JADX INFO: loaded from: classes3.dex */
public class GF2Polynomial {
    private int blocks;
    private int len;
    private int[] value;
    private static Random rand = new Random();
    private static final boolean[] parity = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private static final short[] squaringTable = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};
    private static final int[] bitMask = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, NewHope.SENDB_BYTES, 4096, 8192, BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824, Integer.MIN_VALUE, 0};
    private static final int[] reverseRightMask = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};

    public GF2Polynomial(int i11, BigInteger bigInteger) {
        i11 = i11 < 1 ? 1 : i11;
        int i12 = ((i11 - 1) >> 5) + 1;
        this.blocks = i12;
        this.value = new int[i12];
        this.len = i11;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            byteArray = bArr;
        }
        int length2 = byteArray.length & 3;
        int length3 = (byteArray.length - 1) >> 2;
        for (int i13 = 0; i13 < length2; i13++) {
            int[] iArr = this.value;
            iArr[length3] = iArr[length3] | ((byteArray[i13] & 255) << (((length2 - 1) - i13) << 3));
        }
        for (int i14 = 0; i14 <= ((byteArray.length - 4) >> 2); i14++) {
            int length4 = (byteArray.length - 1) - (i14 << 2);
            int[] iArr2 = this.value;
            int i15 = byteArray[length4] & 255;
            iArr2[i14] = i15;
            int i16 = i15 | ((byteArray[length4 - 1] << 8) & 65280);
            iArr2[i14] = i16;
            int i17 = i16 | ((byteArray[length4 - 2] << 16) & 16711680);
            iArr2[i14] = i17;
            iArr2[i14] = ((byteArray[length4 - 3] << 24) & RoundCornerImageView.DEFAULT_STROKE_COLOR) | i17;
        }
        int i18 = this.len;
        if ((i18 & 31) != 0) {
            int[] iArr3 = this.value;
            int i19 = this.blocks - 1;
            iArr3[i19] = reverseRightMask[i18 & 31] & iArr3[i19];
        }
        reduceN();
    }

    private void doShiftBlocksLeft(int i11) {
        int i12 = this.blocks;
        int[] iArr = this.value;
        if (i12 > iArr.length) {
            int[] iArr2 = new int[i12];
            System.arraycopy(iArr, 0, iArr2, i11, i12 - i11);
            this.value = iArr2;
            return;
        }
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            int[] iArr3 = this.value;
            iArr3[i13] = iArr3[i13 - i11];
        }
        for (int i14 = 0; i14 < i11; i14++) {
            this.value[i14] = 0;
        }
    }

    private GF2Polynomial karaMult(GF2Polynomial gF2Polynomial) {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.len << 1);
        int i11 = this.len;
        if (i11 <= 32) {
            gF2Polynomial2.value = mult32(this.value[0], gF2Polynomial.value[0]);
            return gF2Polynomial2;
        }
        if (i11 <= 64) {
            gF2Polynomial2.value = mult64(this.value, gF2Polynomial.value);
            return gF2Polynomial2;
        }
        if (i11 <= 128) {
            gF2Polynomial2.value = mult128(this.value, gF2Polynomial.value);
            return gF2Polynomial2;
        }
        if (i11 <= 256) {
            gF2Polynomial2.value = mult256(this.value, gF2Polynomial.value);
            return gF2Polynomial2;
        }
        if (i11 <= 512) {
            gF2Polynomial2.value = mult512(this.value, gF2Polynomial.value);
            return gF2Polynomial2;
        }
        int i12 = bitMask[IntegerFunctions.floorLog(i11 - 1)];
        int i13 = ((i12 - 1) >> 5) + 1;
        GF2Polynomial gF2PolynomialLower = lower(i13);
        GF2Polynomial gF2PolynomialUpper = upper(i13);
        GF2Polynomial gF2PolynomialLower2 = gF2Polynomial.lower(i13);
        GF2Polynomial gF2PolynomialUpper2 = gF2Polynomial.upper(i13);
        GF2Polynomial gF2PolynomialKaraMult = gF2PolynomialUpper.karaMult(gF2PolynomialUpper2);
        GF2Polynomial gF2PolynomialKaraMult2 = gF2PolynomialLower.karaMult(gF2PolynomialLower2);
        gF2PolynomialLower.addToThis(gF2PolynomialUpper);
        gF2PolynomialLower2.addToThis(gF2PolynomialUpper2);
        GF2Polynomial gF2PolynomialKaraMult3 = gF2PolynomialLower.karaMult(gF2PolynomialLower2);
        gF2Polynomial2.shiftLeftAddThis(gF2PolynomialKaraMult, i12 << 1);
        gF2Polynomial2.shiftLeftAddThis(gF2PolynomialKaraMult, i12);
        gF2Polynomial2.shiftLeftAddThis(gF2PolynomialKaraMult3, i12);
        gF2Polynomial2.shiftLeftAddThis(gF2PolynomialKaraMult2, i12);
        gF2Polynomial2.addToThis(gF2PolynomialKaraMult2);
        return gF2Polynomial2;
    }

    private GF2Polynomial lower(int i11) {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(i11 << 5);
        System.arraycopy(this.value, 0, gF2Polynomial.value, 0, Math.min(i11, this.blocks));
        return gF2Polynomial;
    }

    private static int[] mult128(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        int[] iArr4 = new int[2];
        System.arraycopy(iArr, 0, iArr4, 0, Math.min(2, iArr.length));
        int[] iArr5 = new int[2];
        if (iArr.length > 2) {
            System.arraycopy(iArr, 2, iArr5, 0, Math.min(2, iArr.length - 2));
        }
        int[] iArr6 = new int[2];
        System.arraycopy(iArr2, 0, iArr6, 0, Math.min(2, iArr2.length));
        int[] iArr7 = new int[2];
        if (iArr2.length > 2) {
            System.arraycopy(iArr2, 2, iArr7, 0, Math.min(2, iArr2.length - 2));
        }
        if (iArr5[1] == 0 && iArr7[1] == 0) {
            int i11 = iArr5[0];
            if (i11 != 0 || iArr7[0] != 0) {
                int[] iArrMult32 = mult32(i11, iArr7[0]);
                int i12 = iArr3[5];
                int i13 = iArrMult32[1];
                iArr3[5] = i12 ^ i13;
                int i14 = iArr3[4];
                int i15 = iArrMult32[0];
                iArr3[4] = i14 ^ i15;
                iArr3[3] = iArr3[3] ^ i13;
                iArr3[2] = i15 ^ iArr3[2];
            }
        } else {
            int[] iArrMult64 = mult64(iArr5, iArr7);
            int i16 = iArr3[7];
            int i17 = iArrMult64[3];
            iArr3[7] = i16 ^ i17;
            int i18 = iArr3[6];
            int i19 = iArrMult64[2];
            iArr3[6] = i18 ^ i19;
            int i21 = iArr3[5];
            int i22 = iArrMult64[1];
            iArr3[5] = i21 ^ (i17 ^ i22);
            int i23 = iArr3[4];
            int i24 = iArrMult64[0];
            iArr3[4] = i23 ^ (i24 ^ i19);
            iArr3[3] = iArr3[3] ^ i22;
            iArr3[2] = i24 ^ iArr3[2];
        }
        iArr5[0] = iArr5[0] ^ iArr4[0];
        iArr5[1] = iArr5[1] ^ iArr4[1];
        int i25 = iArr7[0] ^ iArr6[0];
        iArr7[0] = i25;
        int i26 = iArr7[1] ^ iArr6[1];
        iArr7[1] = i26;
        if (iArr5[1] == 0 && i26 == 0) {
            int[] iArrMult322 = mult32(iArr5[0], i25);
            iArr3[3] = iArr3[3] ^ iArrMult322[1];
            iArr3[2] = iArrMult322[0] ^ iArr3[2];
        } else {
            int[] iArrMult642 = mult64(iArr5, iArr7);
            iArr3[5] = iArr3[5] ^ iArrMult642[3];
            iArr3[4] = iArr3[4] ^ iArrMult642[2];
            iArr3[3] = iArr3[3] ^ iArrMult642[1];
            iArr3[2] = iArrMult642[0] ^ iArr3[2];
        }
        if (iArr4[1] == 0 && iArr6[1] == 0) {
            int[] iArrMult323 = mult32(iArr4[0], iArr6[0]);
            int i27 = iArr3[3];
            int i28 = iArrMult323[1];
            iArr3[3] = i27 ^ i28;
            int i29 = iArr3[2];
            int i31 = iArrMult323[0];
            iArr3[2] = i29 ^ i31;
            iArr3[1] = iArr3[1] ^ i28;
            iArr3[0] = i31 ^ iArr3[0];
            return iArr3;
        }
        int[] iArrMult643 = mult64(iArr4, iArr6);
        int i32 = iArr3[5];
        int i33 = iArrMult643[3];
        iArr3[5] = i32 ^ i33;
        int i34 = iArr3[4];
        int i35 = iArrMult643[2];
        iArr3[4] = i34 ^ i35;
        int i36 = iArr3[3];
        int i37 = iArrMult643[1];
        iArr3[3] = i36 ^ (i33 ^ i37);
        int i38 = iArr3[2];
        int i39 = iArrMult643[0];
        iArr3[2] = i38 ^ (i39 ^ i35);
        iArr3[1] = iArr3[1] ^ i37;
        iArr3[0] = i39 ^ iArr3[0];
        return iArr3;
    }

    private static int[] mult256(int[] iArr, int[] iArr2) {
        char c3;
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[4];
        System.arraycopy(iArr, 0, iArr4, 0, Math.min(4, iArr.length));
        int[] iArr5 = new int[4];
        if (iArr.length > 4) {
            System.arraycopy(iArr, 4, iArr5, 0, Math.min(4, iArr.length - 4));
        }
        int[] iArr6 = new int[4];
        System.arraycopy(iArr2, 0, iArr6, 0, Math.min(4, iArr2.length));
        int[] iArr7 = new int[4];
        if (iArr2.length > 4) {
            System.arraycopy(iArr2, 4, iArr7, 0, Math.min(4, iArr2.length - 4));
        }
        if (iArr5[3] != 0 || iArr5[2] != 0 || iArr7[3] != 0 || iArr7[2] != 0) {
            c3 = 3;
            int[] iArrMult128 = mult128(iArr5, iArr7);
            int i11 = iArr3[15];
            int i12 = iArrMult128[7];
            iArr3[15] = i11 ^ i12;
            int i13 = iArr3[14];
            int i14 = iArrMult128[6];
            iArr3[14] = i13 ^ i14;
            int i15 = iArr3[13];
            int i16 = iArrMult128[5];
            iArr3[13] = i15 ^ i16;
            int i17 = iArr3[12];
            int i18 = iArrMult128[4];
            iArr3[12] = i17 ^ i18;
            int i19 = iArr3[11];
            int i21 = iArrMult128[3];
            iArr3[11] = i19 ^ (i21 ^ i12);
            int i22 = iArr3[10];
            int i23 = iArrMult128[2];
            iArr3[10] = i22 ^ (i23 ^ i14);
            int i24 = iArr3[9];
            int i25 = iArrMult128[1];
            iArr3[9] = i24 ^ (i25 ^ i16);
            int i26 = iArr3[8];
            int i27 = iArrMult128[0];
            iArr3[8] = i26 ^ (i27 ^ i18);
            iArr3[7] = iArr3[7] ^ i21;
            iArr3[6] = iArr3[6] ^ i23;
            iArr3[5] = iArr3[5] ^ i25;
            iArr3[4] = i27 ^ iArr3[4];
        } else if (iArr5[1] == 0 && iArr7[1] == 0) {
            int i28 = iArr5[0];
            if (i28 == 0 && iArr7[0] == 0) {
                c3 = 3;
            } else {
                c3 = 3;
                int[] iArrMult32 = mult32(i28, iArr7[0]);
                int i29 = iArr3[9];
                int i31 = iArrMult32[1];
                iArr3[9] = i29 ^ i31;
                int i32 = iArr3[8];
                int i33 = iArrMult32[0];
                iArr3[8] = i32 ^ i33;
                iArr3[5] = iArr3[5] ^ i31;
                iArr3[4] = i33 ^ iArr3[4];
            }
        } else {
            c3 = 3;
            int[] iArrMult64 = mult64(iArr5, iArr7);
            int i34 = iArr3[11];
            int i35 = iArrMult64[3];
            iArr3[11] = i34 ^ i35;
            int i36 = iArr3[10];
            int i37 = iArrMult64[2];
            iArr3[10] = i36 ^ i37;
            int i38 = iArr3[9];
            int i39 = iArrMult64[1];
            iArr3[9] = i38 ^ i39;
            int i41 = iArr3[8];
            int i42 = iArrMult64[0];
            iArr3[8] = i41 ^ i42;
            iArr3[7] = iArr3[7] ^ i35;
            iArr3[6] = iArr3[6] ^ i37;
            iArr3[5] = iArr3[5] ^ i39;
            iArr3[4] = i42 ^ iArr3[4];
        }
        iArr5[0] = iArr5[0] ^ iArr4[0];
        iArr5[1] = iArr5[1] ^ iArr4[1];
        iArr5[2] = iArr5[2] ^ iArr4[2];
        iArr5[c3] = iArr5[c3] ^ iArr4[c3];
        iArr7[0] = iArr7[0] ^ iArr6[0];
        iArr7[1] = iArr7[1] ^ iArr6[1];
        iArr7[2] = iArr7[2] ^ iArr6[2];
        iArr7[c3] = iArr7[c3] ^ iArr6[c3];
        int[] iArrMult1282 = mult128(iArr5, iArr7);
        iArr3[11] = iArr3[11] ^ iArrMult1282[7];
        iArr3[10] = iArr3[10] ^ iArrMult1282[6];
        iArr3[9] = iArr3[9] ^ iArrMult1282[5];
        iArr3[8] = iArr3[8] ^ iArrMult1282[4];
        iArr3[7] = iArr3[7] ^ iArrMult1282[c3];
        iArr3[6] = iArr3[6] ^ iArrMult1282[2];
        iArr3[5] = iArr3[5] ^ iArrMult1282[1];
        iArr3[4] = iArrMult1282[0] ^ iArr3[4];
        int[] iArrMult1283 = mult128(iArr4, iArr6);
        int i43 = iArr3[11];
        int i44 = iArrMult1283[7];
        iArr3[11] = i43 ^ i44;
        int i45 = iArr3[10];
        int i46 = iArrMult1283[6];
        iArr3[10] = i45 ^ i46;
        int i47 = iArr3[9];
        int i48 = iArrMult1283[5];
        iArr3[9] = i47 ^ i48;
        int i49 = iArr3[8];
        int i51 = iArrMult1283[4];
        iArr3[8] = i49 ^ i51;
        int i52 = iArr3[7];
        int i53 = iArrMult1283[c3];
        iArr3[7] = i52 ^ (i44 ^ i53);
        int i54 = iArr3[6];
        int i55 = iArrMult1283[2];
        iArr3[6] = i54 ^ (i46 ^ i55);
        int i56 = iArr3[5];
        int i57 = iArrMult1283[1];
        iArr3[5] = i56 ^ (i48 ^ i57);
        int i58 = iArr3[4];
        int i59 = iArrMult1283[0];
        iArr3[4] = i58 ^ (i59 ^ i51);
        iArr3[c3] = iArr3[c3] ^ i53;
        iArr3[2] = iArr3[2] ^ i55;
        iArr3[1] = iArr3[1] ^ i57;
        iArr3[0] = i59 ^ iArr3[0];
        return iArr3;
    }

    private static int[] mult32(int i11, int i12) {
        int[] iArr = new int[2];
        if (i11 != 0 && i12 != 0) {
            long j9 = ((long) i12) & 4294967295L;
            long j11 = 0;
            for (int i13 = 1; i13 <= 32; i13++) {
                if ((bitMask[i13 - 1] & i11) != 0) {
                    j11 ^= j9;
                }
                j9 <<= 1;
            }
            iArr[1] = (int) (j11 >>> 32);
            iArr[0] = (int) (j11 & 4294967295L);
        }
        return iArr;
    }

    private static int[] mult512(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[32];
        int[] iArr4 = new int[8];
        System.arraycopy(iArr, 0, iArr4, 0, Math.min(8, iArr.length));
        int[] iArr5 = new int[8];
        if (iArr.length > 8) {
            System.arraycopy(iArr, 8, iArr5, 0, Math.min(8, iArr.length - 8));
        }
        int[] iArr6 = new int[8];
        System.arraycopy(iArr2, 0, iArr6, 0, Math.min(8, iArr2.length));
        int[] iArr7 = new int[8];
        if (iArr2.length > 8) {
            System.arraycopy(iArr2, 8, iArr7, 0, Math.min(8, iArr2.length - 8));
        }
        int[] iArrMult256 = mult256(iArr5, iArr7);
        int i11 = iArr3[31];
        int i12 = iArrMult256[15];
        iArr3[31] = i11 ^ i12;
        int i13 = iArr3[30];
        int i14 = iArrMult256[14];
        iArr3[30] = i13 ^ i14;
        int i15 = iArr3[29];
        int i16 = iArrMult256[13];
        iArr3[29] = i15 ^ i16;
        int i17 = iArr3[28];
        int i18 = iArrMult256[12];
        iArr3[28] = i17 ^ i18;
        int i19 = iArr3[27];
        int i21 = iArrMult256[11];
        iArr3[27] = i19 ^ i21;
        int i22 = iArr3[26];
        int i23 = iArrMult256[10];
        iArr3[26] = i22 ^ i23;
        int i24 = iArr3[25];
        int i25 = iArrMult256[9];
        iArr3[25] = i24 ^ i25;
        int i26 = iArr3[24];
        int i27 = iArrMult256[8];
        iArr3[24] = i26 ^ i27;
        int i28 = iArr3[23];
        int i29 = iArrMult256[7];
        iArr3[23] = i28 ^ (i29 ^ i12);
        int i31 = iArr3[22];
        int i32 = iArrMult256[6];
        iArr3[22] = i31 ^ (i32 ^ i14);
        int i33 = iArr3[21];
        int i34 = iArrMult256[5];
        iArr3[21] = i33 ^ (i34 ^ i16);
        int i35 = iArr3[20];
        int i36 = iArrMult256[4];
        iArr3[20] = i35 ^ (i36 ^ i18);
        int i37 = iArr3[19];
        int i38 = iArrMult256[3];
        iArr3[19] = i37 ^ (i38 ^ i21);
        int i39 = iArr3[18];
        int i41 = iArrMult256[2];
        iArr3[18] = i39 ^ (i41 ^ i23);
        int i42 = iArr3[17];
        int i43 = iArrMult256[1];
        iArr3[17] = i42 ^ (i43 ^ i25);
        int i44 = iArr3[16];
        int i45 = iArrMult256[0];
        iArr3[16] = i44 ^ (i45 ^ i27);
        iArr3[15] = iArr3[15] ^ i29;
        iArr3[14] = iArr3[14] ^ i32;
        iArr3[13] = iArr3[13] ^ i34;
        iArr3[12] = iArr3[12] ^ i36;
        iArr3[11] = iArr3[11] ^ i38;
        iArr3[10] = iArr3[10] ^ i41;
        iArr3[9] = iArr3[9] ^ i43;
        iArr3[8] = iArr3[8] ^ i45;
        iArr5[0] = iArr5[0] ^ iArr4[0];
        iArr5[1] = iArr5[1] ^ iArr4[1];
        iArr5[2] = iArr5[2] ^ iArr4[2];
        iArr5[3] = iArr5[3] ^ iArr4[3];
        iArr5[4] = iArr5[4] ^ iArr4[4];
        iArr5[5] = iArr5[5] ^ iArr4[5];
        iArr5[6] = iArr5[6] ^ iArr4[6];
        iArr5[7] = iArr5[7] ^ iArr4[7];
        iArr7[0] = iArr7[0] ^ iArr6[0];
        iArr7[1] = iArr7[1] ^ iArr6[1];
        iArr7[2] = iArr7[2] ^ iArr6[2];
        iArr7[3] = iArr7[3] ^ iArr6[3];
        iArr7[4] = iArr7[4] ^ iArr6[4];
        iArr7[5] = iArr7[5] ^ iArr6[5];
        iArr7[6] = iArr7[6] ^ iArr6[6];
        iArr7[7] = iArr7[7] ^ iArr6[7];
        int[] iArrMult2562 = mult256(iArr5, iArr7);
        iArr3[23] = iArr3[23] ^ iArrMult2562[15];
        iArr3[22] = iArr3[22] ^ iArrMult2562[14];
        iArr3[21] = iArr3[21] ^ iArrMult2562[13];
        iArr3[20] = iArr3[20] ^ iArrMult2562[12];
        iArr3[19] = iArr3[19] ^ iArrMult2562[11];
        iArr3[18] = iArr3[18] ^ iArrMult2562[10];
        iArr3[17] = iArr3[17] ^ iArrMult2562[9];
        iArr3[16] = iArr3[16] ^ iArrMult2562[8];
        iArr3[15] = iArr3[15] ^ iArrMult2562[7];
        iArr3[14] = iArr3[14] ^ iArrMult2562[6];
        iArr3[13] = iArr3[13] ^ iArrMult2562[5];
        iArr3[12] = iArr3[12] ^ iArrMult2562[4];
        iArr3[11] = iArr3[11] ^ iArrMult2562[3];
        iArr3[10] = iArr3[10] ^ iArrMult2562[2];
        iArr3[9] = iArr3[9] ^ iArrMult2562[1];
        iArr3[8] = iArrMult2562[0] ^ iArr3[8];
        int[] iArrMult2563 = mult256(iArr4, iArr6);
        int i46 = iArr3[23];
        int i47 = iArrMult2563[15];
        iArr3[23] = i46 ^ i47;
        int i48 = iArr3[22];
        int i49 = iArrMult2563[14];
        iArr3[22] = i48 ^ i49;
        int i51 = iArr3[21];
        int i52 = iArrMult2563[13];
        iArr3[21] = i51 ^ i52;
        int i53 = iArr3[20];
        int i54 = iArrMult2563[12];
        iArr3[20] = i53 ^ i54;
        int i55 = iArr3[19];
        int i56 = iArrMult2563[11];
        iArr3[19] = i55 ^ i56;
        int i57 = iArr3[18];
        int i58 = iArrMult2563[10];
        iArr3[18] = i57 ^ i58;
        int i59 = iArr3[17];
        int i61 = iArrMult2563[9];
        iArr3[17] = i59 ^ i61;
        int i62 = iArr3[16];
        int i63 = iArrMult2563[8];
        iArr3[16] = i62 ^ i63;
        int i64 = iArr3[15];
        int i65 = iArrMult2563[7];
        iArr3[15] = i64 ^ (i47 ^ i65);
        int i66 = iArr3[14];
        int i67 = iArrMult2563[6];
        iArr3[14] = i66 ^ (i49 ^ i67);
        int i68 = iArr3[13];
        int i69 = iArrMult2563[5];
        iArr3[13] = i68 ^ (i52 ^ i69);
        int i71 = iArr3[12];
        int i72 = iArrMult2563[4];
        iArr3[12] = i71 ^ (i54 ^ i72);
        int i73 = iArr3[11];
        int i74 = iArrMult2563[3];
        iArr3[11] = i73 ^ (i56 ^ i74);
        int i75 = iArr3[10];
        int i76 = iArrMult2563[2];
        iArr3[10] = i75 ^ (i76 ^ i58);
        int i77 = iArr3[9];
        int i78 = iArrMult2563[1];
        iArr3[9] = i77 ^ (i78 ^ i61);
        int i79 = iArr3[8];
        int i81 = iArrMult2563[0];
        iArr3[8] = i79 ^ (i81 ^ i63);
        iArr3[7] = iArr3[7] ^ i65;
        iArr3[6] = iArr3[6] ^ i67;
        iArr3[5] = iArr3[5] ^ i69;
        iArr3[4] = iArr3[4] ^ i72;
        iArr3[3] = iArr3[3] ^ i74;
        iArr3[2] = iArr3[2] ^ i76;
        iArr3[1] = iArr3[1] ^ i78;
        iArr3[0] = i81 ^ iArr3[0];
        return iArr3;
    }

    private static int[] mult64(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[4];
        int i11 = iArr[0];
        int i12 = iArr.length > 1 ? iArr[1] : 0;
        int i13 = iArr2[0];
        int i14 = iArr2.length > 1 ? iArr2[1] : 0;
        if (i12 != 0 || i14 != 0) {
            int[] iArrMult32 = mult32(i12, i14);
            int i15 = iArr3[3];
            int i16 = iArrMult32[1];
            iArr3[3] = i15 ^ i16;
            int i17 = iArr3[2];
            int i18 = iArrMult32[0];
            iArr3[2] = i17 ^ (i18 ^ i16);
            iArr3[1] = i18 ^ iArr3[1];
        }
        int[] iArrMult322 = mult32(i12 ^ i11, i14 ^ i13);
        iArr3[2] = iArr3[2] ^ iArrMult322[1];
        iArr3[1] = iArrMult322[0] ^ iArr3[1];
        int[] iArrMult323 = mult32(i11, i13);
        int i19 = iArr3[2];
        int i21 = iArrMult323[1];
        iArr3[2] = i19 ^ i21;
        int i22 = iArr3[1];
        int i23 = iArrMult323[0];
        iArr3[1] = i22 ^ (i21 ^ i23);
        iArr3[0] = i23 ^ iArr3[0];
        return iArr3;
    }

    private GF2Polynomial upper(int i11) {
        int iMin = Math.min(i11, this.blocks - i11);
        GF2Polynomial gF2Polynomial = new GF2Polynomial(iMin << 5);
        if (this.blocks >= i11) {
            System.arraycopy(this.value, i11, gF2Polynomial.value, 0, iMin);
        }
        return gF2Polynomial;
    }

    private void zeroUnusedBits() {
        int i11 = this.len;
        if ((i11 & 31) != 0) {
            int[] iArr = this.value;
            int i12 = this.blocks - 1;
            iArr[i12] = reverseRightMask[i11 & 31] & iArr[i12];
        }
    }

    public GF2Polynomial add(GF2Polynomial gF2Polynomial) {
        return xor(gF2Polynomial);
    }

    public void addToThis(GF2Polynomial gF2Polynomial) {
        expandN(gF2Polynomial.len);
        xorThisBy(gF2Polynomial);
    }

    public void assignAll() {
        for (int i11 = 0; i11 < this.blocks; i11++) {
            this.value[i11] = -1;
        }
        zeroUnusedBits();
    }

    public void assignOne() {
        int i11 = 1;
        while (true) {
            int i12 = this.blocks;
            int[] iArr = this.value;
            if (i11 >= i12) {
                iArr[0] = 1;
                return;
            } else {
                iArr[i11] = 0;
                i11++;
            }
        }
    }

    public void assignX() {
        int i11 = 1;
        while (true) {
            int i12 = this.blocks;
            int[] iArr = this.value;
            if (i11 >= i12) {
                iArr[0] = 2;
                return;
            } else {
                iArr[i11] = 0;
                i11++;
            }
        }
    }

    public void assignZero() {
        for (int i11 = 0; i11 < this.blocks; i11++) {
            this.value[i11] = 0;
        }
    }

    public Object clone() {
        return new GF2Polynomial(this);
    }

    public GF2Polynomial[] divide(GF2Polynomial gF2Polynomial) throws RuntimeException {
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[2];
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.len);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial4 = new GF2Polynomial(gF2Polynomial);
        if (gF2Polynomial4.isZero()) {
            d0.c();
            return null;
        }
        gF2Polynomial3.reduceN();
        gF2Polynomial4.reduceN();
        int i11 = gF2Polynomial3.len;
        int i12 = gF2Polynomial4.len;
        if (i11 < i12) {
            gF2PolynomialArr[0] = new GF2Polynomial(0);
            gF2PolynomialArr[1] = gF2Polynomial3;
            return gF2PolynomialArr;
        }
        int i13 = i11 - i12;
        gF2Polynomial2.expandN(i13 + 1);
        while (i13 >= 0) {
            gF2Polynomial3.subtractFromThis(gF2Polynomial4.shiftLeft(i13));
            gF2Polynomial3.reduceN();
            gF2Polynomial2.xorBit(i13);
            i13 = gF2Polynomial3.len - gF2Polynomial4.len;
        }
        gF2PolynomialArr[0] = gF2Polynomial2;
        gF2PolynomialArr[1] = gF2Polynomial3;
        return gF2PolynomialArr;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2Polynomial)) {
            return false;
        }
        GF2Polynomial gF2Polynomial = (GF2Polynomial) obj;
        if (this.len != gF2Polynomial.len) {
            return false;
        }
        for (int i11 = 0; i11 < this.blocks; i11++) {
            if (this.value[i11] != gF2Polynomial.value[i11]) {
                return false;
            }
        }
        return true;
    }

    public void expandN(int i11) {
        if (this.len >= i11) {
            return;
        }
        this.len = i11;
        int i12 = ((i11 - 1) >>> 5) + 1;
        int i13 = this.blocks;
        if (i13 >= i12) {
            return;
        }
        int[] iArr = this.value;
        if (iArr.length >= i12) {
            while (i13 < i12) {
                this.value[i13] = 0;
                i13++;
            }
            this.blocks = i12;
            return;
        }
        int[] iArr2 = new int[i12];
        System.arraycopy(iArr, 0, iArr2, 0, i13);
        this.blocks = i12;
        this.value = iArr2;
    }

    public GF2Polynomial gcd(GF2Polynomial gF2Polynomial) throws RuntimeException {
        if (isZero() && gF2Polynomial.isZero()) {
            d.f("Both operands of gcd equal zero.");
            return null;
        }
        if (isZero()) {
            return new GF2Polynomial(gF2Polynomial);
        }
        if (gF2Polynomial.isZero()) {
            return new GF2Polynomial(this);
        }
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(gF2Polynomial);
        GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
        GF2Polynomial gF2PolynomialRemainder = gF2Polynomial3;
        while (!gF2PolynomialRemainder.isZero()) {
            GF2Polynomial gF2Polynomial5 = gF2PolynomialRemainder;
            gF2PolynomialRemainder = gF2Polynomial4.remainder(gF2PolynomialRemainder);
            gF2Polynomial4 = gF2Polynomial5;
        }
        return gF2Polynomial4;
    }

    public int getBit(int i11) {
        if (i11 < 0) {
            d0.c();
            return 0;
        }
        if (i11 > this.len - 1) {
            return 0;
        }
        return (bitMask[i11 & 31] & this.value[i11 >>> 5]) != 0 ? 1 : 0;
    }

    public int getLength() {
        return this.len;
    }

    public int hashCode() {
        return Arrays.hashCode(this.value) + this.len;
    }

    public GF2Polynomial increase() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this);
        gF2Polynomial.increaseThis();
        return gF2Polynomial;
    }

    public void increaseThis() {
        xorBit(0);
    }

    public boolean isIrreducible() {
        if (isZero()) {
            return false;
        }
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this);
        gF2Polynomial.reduceN();
        int i11 = gF2Polynomial.len;
        int i12 = i11 - 1;
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(i11, "X");
        for (int i13 = 1; i13 <= (i12 >> 1); i13++) {
            gF2Polynomial2.squareThisPreCalc();
            gF2Polynomial2 = gF2Polynomial2.remainder(gF2Polynomial);
            GF2Polynomial gF2PolynomialAdd = gF2Polynomial2.add(new GF2Polynomial(32, "X"));
            if (gF2PolynomialAdd.isZero() || !gF2Polynomial.gcd(gF2PolynomialAdd).isOne()) {
                return false;
            }
        }
        return true;
    }

    public boolean isOne() {
        int i11 = 1;
        while (true) {
            int i12 = this.blocks;
            int[] iArr = this.value;
            if (i11 >= i12) {
                return iArr[0] == 1;
            }
            if (iArr[i11] != 0) {
                return false;
            }
            i11++;
        }
    }

    public boolean isZero() {
        if (this.len == 0) {
            return true;
        }
        for (int i11 = 0; i11 < this.blocks; i11++) {
            if (this.value[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public GF2Polynomial multiply(GF2Polynomial gF2Polynomial) {
        int iMax = Math.max(this.len, gF2Polynomial.len);
        expandN(iMax);
        gF2Polynomial.expandN(iMax);
        return karaMult(gF2Polynomial);
    }

    public GF2Polynomial multiplyClassic(GF2Polynomial gF2Polynomial) {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(Math.max(this.len, gF2Polynomial.len) << 1);
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[32];
        gF2PolynomialArr[0] = new GF2Polynomial(this);
        for (int i11 = 1; i11 <= 31; i11++) {
            gF2PolynomialArr[i11] = gF2PolynomialArr[i11 - 1].shiftLeft();
        }
        for (int i12 = 0; i12 < gF2Polynomial.blocks; i12++) {
            for (int i13 = 0; i13 <= 31; i13++) {
                if ((gF2Polynomial.value[i12] & bitMask[i13]) != 0) {
                    gF2Polynomial2.xorThisBy(gF2PolynomialArr[i13]);
                }
            }
            for (int i14 = 0; i14 <= 31; i14++) {
                gF2PolynomialArr[i14].shiftBlocksLeft();
            }
        }
        return gF2Polynomial2;
    }

    public GF2Polynomial quotient(GF2Polynomial gF2Polynomial) throws RuntimeException {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.len);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial4 = new GF2Polynomial(gF2Polynomial);
        if (gF2Polynomial4.isZero()) {
            d0.c();
            return null;
        }
        gF2Polynomial3.reduceN();
        gF2Polynomial4.reduceN();
        int i11 = gF2Polynomial3.len;
        int i12 = gF2Polynomial4.len;
        if (i11 < i12) {
            return new GF2Polynomial(0);
        }
        int i13 = i11 - i12;
        gF2Polynomial2.expandN(i13 + 1);
        while (i13 >= 0) {
            gF2Polynomial3.subtractFromThis(gF2Polynomial4.shiftLeft(i13));
            gF2Polynomial3.reduceN();
            gF2Polynomial2.xorBit(i13);
            i13 = gF2Polynomial3.len - gF2Polynomial4.len;
        }
        return gF2Polynomial2;
    }

    public void randomize() {
        for (int i11 = 0; i11 < this.blocks; i11++) {
            this.value[i11] = rand.nextInt();
        }
        zeroUnusedBits();
    }

    public void reduceN() {
        int i11;
        int i12 = this.blocks;
        do {
            i12--;
            i11 = this.value[i12];
            if (i11 != 0) {
                break;
            }
        } while (i12 > 0);
        int i13 = 0;
        while (i11 != 0) {
            i11 >>>= 1;
            i13++;
        }
        this.len = (i12 << 5) + i13;
        this.blocks = i12 + 1;
    }

    public void reducePentanomial(int i11, int[] iArr) {
        int[] iArr2;
        int i12 = i11 >>> 5;
        int i13 = i11 & 31;
        int i14 = 32 - i13;
        int i15 = 0;
        int i16 = iArr[0];
        int i17 = (i11 - i16) >>> 5;
        int i18 = 32 - ((i11 - i16) & 31);
        boolean z11 = true;
        int i19 = iArr[1];
        int i21 = (i11 - i19) >>> 5;
        int i22 = 32 - ((i11 - i19) & 31);
        int i23 = iArr[2];
        int i24 = (i11 - i23) >>> 5;
        int i25 = 32 - ((i11 - i23) & 31);
        int i26 = ((i11 << 1) - 2) >>> 5;
        while (true) {
            iArr2 = this.value;
            if (i26 <= i12) {
                break;
            }
            int i27 = i15;
            boolean z12 = z11;
            int i28 = i22;
            long j9 = ((long) iArr2[i26]) & 4294967295L;
            int i29 = i26 - i12;
            int i31 = i29 - 1;
            int i32 = i12;
            int i33 = i13;
            iArr2[i31] = iArr2[i31] ^ ((int) (j9 << i14));
            iArr2[i29] = (int) (((long) iArr2[i29]) ^ (j9 >>> (32 - i14)));
            int i34 = i26 - i17;
            int i35 = i34 - 1;
            iArr2[i35] = ((int) (j9 << i18)) ^ iArr2[i35];
            iArr2[i34] = (int) (((long) iArr2[i34]) ^ (j9 >>> (32 - i18)));
            int i36 = i26 - i21;
            int i37 = i36 - 1;
            iArr2[i37] = ((int) (j9 << i28)) ^ iArr2[i37];
            iArr2[i36] = (int) (((long) iArr2[i36]) ^ (j9 >>> (32 - i28)));
            int i38 = i26 - i24;
            int i39 = i38 - 1;
            iArr2[i39] = ((int) (j9 << i25)) ^ iArr2[i39];
            iArr2[i38] = (int) (((long) iArr2[i38]) ^ (j9 >>> (32 - i25)));
            iArr2[i26] = i27;
            i26--;
            i15 = i27;
            z11 = z12;
            i22 = i28;
            i12 = i32;
            i13 = i33;
        }
        int i41 = i12;
        int i42 = i13;
        int i43 = i15;
        int i44 = i22;
        long j11 = ((long) iArr2[i41]) & 4294967295L & (4294967295 << i42);
        iArr2[i43] = (int) ((j11 >>> (32 - i14)) ^ ((long) iArr2[i43]));
        int i45 = i41 - i17;
        int i46 = i45 - 1;
        if (i46 >= 0) {
            iArr2[i46] = iArr2[i46] ^ ((int) (j11 << i18));
        }
        iArr2[i45] = (int) ((j11 >>> (32 - i18)) ^ ((long) iArr2[i45]));
        int i47 = i41 - i21;
        int i48 = i47 - 1;
        if (i48 >= 0) {
            iArr2[i48] = iArr2[i48] ^ ((int) (j11 << i44));
        }
        iArr2[i47] = (int) (((long) iArr2[i47]) ^ (j11 >>> (32 - i44)));
        int i49 = i41 - i24;
        int i51 = i49 - 1;
        if (i51 >= 0) {
            iArr2[i51] = iArr2[i51] ^ ((int) (j11 << i25));
        }
        iArr2[i49] = (int) ((j11 >>> (32 - i25)) ^ ((long) iArr2[i49]));
        iArr2[i41] = iArr2[i41] & reverseRightMask[i42];
        this.blocks = ((i11 - 1) >>> 5) + 1;
        this.len = i11;
    }

    public void reduceTrinomial(int i11, int i12) {
        int[] iArr;
        int i13 = i11 >>> 5;
        int i14 = i11 & 31;
        int i15 = 32 - i14;
        int i16 = i11 - i12;
        int i17 = i16 >>> 5;
        int i18 = 32 - (i16 & 31);
        int i19 = ((i11 << 1) - 2) >>> 5;
        while (true) {
            iArr = this.value;
            if (i19 <= i13) {
                break;
            }
            long j9 = 4294967295L & ((long) iArr[i19]);
            int i21 = i19 - i13;
            int i22 = i21 - 1;
            iArr[i22] = ((int) (j9 << i15)) ^ iArr[i22];
            iArr[i21] = (int) (((long) iArr[i21]) ^ (j9 >>> (32 - i15)));
            int i23 = i19 - i17;
            int i24 = i23 - 1;
            iArr[i24] = iArr[i24] ^ ((int) (j9 << i18));
            iArr[i23] = (int) (((long) iArr[i23]) ^ (j9 >>> (32 - i18)));
            iArr[i19] = 0;
            i19--;
        }
        long j11 = (4294967295 << i14) & ((long) iArr[i13]) & 4294967295L;
        iArr[0] = (int) (((long) iArr[0]) ^ (j11 >>> (32 - i15)));
        int i25 = i13 - i17;
        int i26 = i25 - 1;
        if (i26 >= 0) {
            iArr[i26] = iArr[i26] ^ ((int) (j11 << i18));
        }
        iArr[i25] = (int) (((long) iArr[i25]) ^ (j11 >>> (32 - i18)));
        iArr[i13] = reverseRightMask[i14] & iArr[i13];
        this.blocks = ((i11 - 1) >>> 5) + 1;
        this.len = i11;
    }

    public GF2Polynomial remainder(GF2Polynomial gF2Polynomial) throws RuntimeException {
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this);
        GF2Polynomial gF2Polynomial3 = new GF2Polynomial(gF2Polynomial);
        if (gF2Polynomial3.isZero()) {
            d0.c();
            return null;
        }
        gF2Polynomial2.reduceN();
        gF2Polynomial3.reduceN();
        int i11 = gF2Polynomial2.len;
        int i12 = gF2Polynomial3.len;
        if (i11 >= i12) {
            while (true) {
                int i13 = i11 - i12;
                if (i13 < 0) {
                    break;
                }
                gF2Polynomial2.subtractFromThis(gF2Polynomial3.shiftLeft(i13));
                gF2Polynomial2.reduceN();
                i11 = gF2Polynomial2.len;
                i12 = gF2Polynomial3.len;
            }
        }
        return gF2Polynomial2;
    }

    public void resetBit(int i11) throws RuntimeException {
        if (i11 < 0) {
            d0.c();
        } else {
            if (i11 > this.len - 1) {
                return;
            }
            int[] iArr = this.value;
            int i12 = i11 >>> 5;
            iArr[i12] = (~bitMask[i11 & 31]) & iArr[i12];
        }
    }

    public void setBit(int i11) throws RuntimeException {
        if (i11 < 0 || i11 > this.len - 1) {
            d0.c();
            return;
        }
        int[] iArr = this.value;
        int i12 = i11 >>> 5;
        iArr[i12] = bitMask[i11 & 31] | iArr[i12];
    }

    public void shiftBlocksLeft() {
        int i11 = this.blocks;
        int i12 = i11 + 1;
        this.blocks = i12;
        this.len += 32;
        int[] iArr = this.value;
        if (i12 > iArr.length) {
            int[] iArr2 = new int[i12];
            System.arraycopy(iArr, 0, iArr2, 1, i11);
            this.value = iArr2;
        } else {
            while (true) {
                int[] iArr3 = this.value;
                if (i11 < 1) {
                    iArr3[0] = 0;
                    return;
                } else {
                    iArr3[i11] = iArr3[i11 - 1];
                    i11--;
                }
            }
        }
    }

    public GF2Polynomial shiftLeft(int i11) {
        int[] iArr;
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.len + i11, this.value);
        if (i11 >= 32) {
            gF2Polynomial.doShiftBlocksLeft(i11 >>> 5);
        }
        int i12 = i11 & 31;
        if (i12 != 0) {
            int i13 = gF2Polynomial.blocks - 1;
            while (true) {
                iArr = gF2Polynomial.value;
                if (i13 < 1) {
                    break;
                }
                int i14 = iArr[i13] << i12;
                iArr[i13] = i14;
                iArr[i13] = i14 | (iArr[i13 - 1] >>> (32 - i12));
                i13--;
            }
            iArr[0] = iArr[0] << i12;
        }
        return gF2Polynomial;
    }

    public void shiftLeftAddThis(GF2Polynomial gF2Polynomial, int i11) {
        int i12;
        if (i11 == 0) {
            addToThis(gF2Polynomial);
            return;
        }
        expandN(gF2Polynomial.len + i11);
        int i13 = i11 >>> 5;
        for (int i14 = gF2Polynomial.blocks - 1; i14 >= 0; i14--) {
            int i15 = i14 + i13;
            int i16 = i15 + 1;
            if (i16 < this.blocks && (i12 = i11 & 31) != 0) {
                int[] iArr = this.value;
                iArr[i16] = (gF2Polynomial.value[i14] >>> (32 - i12)) ^ iArr[i16];
            }
            int[] iArr2 = this.value;
            iArr2[i15] = iArr2[i15] ^ (gF2Polynomial.value[i14] << (i11 & 31));
        }
    }

    public void shiftLeftThis() {
        int i11 = this.len;
        int i12 = i11 & 31;
        this.len = i11 + 1;
        int i13 = this.blocks;
        if (i12 == 0) {
            int i14 = i13 + 1;
            this.blocks = i14;
            int[] iArr = this.value;
            if (i14 > iArr.length) {
                int[] iArr2 = new int[i14];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                this.value = iArr2;
            }
            for (int i15 = this.blocks - 1; i15 >= 1; i15--) {
                int[] iArr3 = this.value;
                int i16 = i15 - 1;
                iArr3[i15] = iArr3[i15] | (iArr3[i16] >>> 31);
                iArr3[i16] = iArr3[i16] << 1;
            }
            return;
        }
        int i17 = i13 - 1;
        while (true) {
            int[] iArr4 = this.value;
            if (i17 < 1) {
                iArr4[0] = iArr4[0] << 1;
                return;
            }
            int i18 = iArr4[i17] << 1;
            iArr4[i17] = i18;
            iArr4[i17] = i18 | (iArr4[i17 - 1] >>> 31);
            i17--;
        }
    }

    public GF2Polynomial shiftRight() {
        int i11;
        int[] iArr;
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.len - 1);
        int i12 = 0;
        System.arraycopy(this.value, 0, gF2Polynomial.value, 0, gF2Polynomial.blocks);
        while (true) {
            i11 = gF2Polynomial.blocks;
            int i13 = i11 - 2;
            iArr = gF2Polynomial.value;
            if (i12 > i13) {
                break;
            }
            int i14 = iArr[i12] >>> 1;
            iArr[i12] = i14;
            int i15 = i12 + 1;
            iArr[i12] = i14 | (iArr[i15] << 31);
            i12 = i15;
        }
        int i16 = i11 - 1;
        iArr[i16] = iArr[i16] >>> 1;
        if (i11 < this.blocks) {
            int i17 = i11 - 1;
            iArr[i17] = (this.value[i11] << 31) | iArr[i17];
        }
        return gF2Polynomial;
    }

    public void shiftRightThis() {
        int i11;
        int[] iArr;
        int i12 = this.len;
        this.len = i12 - 1;
        this.blocks = ((i12 - 2) >>> 5) + 1;
        int i13 = 0;
        while (true) {
            i11 = this.blocks;
            int i14 = i11 - 2;
            iArr = this.value;
            if (i13 > i14) {
                break;
            }
            int i15 = iArr[i13] >>> 1;
            iArr[i13] = i15;
            int i16 = i13 + 1;
            iArr[i13] = i15 | (iArr[i16] << 31);
            i13 = i16;
        }
        int i17 = i11 - 1;
        iArr[i17] = iArr[i17] >>> 1;
        if ((this.len & 31) == 0) {
            int i18 = i11 - 1;
            iArr[i18] = (iArr[i11] << 31) | iArr[i18];
        }
    }

    public void squareThisBitwise() {
        if (isZero()) {
            return;
        }
        int i11 = this.blocks;
        int i12 = i11 << 1;
        int[] iArr = new int[i12];
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            int i14 = this.value[i13];
            int i15 = 1;
            for (int i16 = 0; i16 < 16; i16++) {
                if ((i14 & 1) != 0) {
                    int i17 = i13 << 1;
                    iArr[i17] = iArr[i17] | i15;
                }
                if ((65536 & i14) != 0) {
                    int i18 = (i13 << 1) + 1;
                    iArr[i18] = iArr[i18] | i15;
                }
                i15 <<= 2;
                i14 >>>= 1;
            }
        }
        this.value = iArr;
        this.blocks = i12;
        this.len = (this.len << 1) - 1;
    }

    public void squareThisPreCalc() {
        int i11;
        int i12;
        if (isZero()) {
            return;
        }
        int length = this.value.length;
        int i13 = this.blocks;
        if (length >= (i13 << 1)) {
            for (int i14 = i13 - 1; i14 >= 0; i14--) {
                int[] iArr = this.value;
                int i15 = i14 << 1;
                short[] sArr = squaringTable;
                int i16 = iArr[i14];
                iArr[i15 + 1] = (sArr[(i16 & RoundCornerImageView.DEFAULT_STROKE_COLOR) >>> 24] << 16) | sArr[(i16 & 16711680) >>> 16];
                int i17 = iArr[i14];
                iArr[i15] = (sArr[(i17 & 65280) >>> 8] << 16) | sArr[i17 & 255];
            }
            i12 = this.blocks << 1;
        } else {
            int[] iArr2 = new int[i13 << 1];
            int i18 = 0;
            while (true) {
                i11 = this.blocks;
                if (i18 >= i11) {
                    break;
                }
                int i19 = i18 << 1;
                short[] sArr2 = squaringTable;
                int[] iArr3 = this.value;
                int i21 = iArr3[i18];
                iArr2[i19] = (sArr2[(i21 & 65280) >>> 8] << 16) | sArr2[i21 & 255];
                int i22 = iArr3[i18];
                iArr2[i19 + 1] = (sArr2[(i22 & RoundCornerImageView.DEFAULT_STROKE_COLOR) >>> 24] << 16) | sArr2[(i22 & 16711680) >>> 16];
                i18++;
            }
            this.value = iArr2;
            i12 = i11 << 1;
        }
        this.blocks = i12;
        this.len = (this.len << 1) - 1;
    }

    public GF2Polynomial subtract(GF2Polynomial gF2Polynomial) {
        return xor(gF2Polynomial);
    }

    public void subtractFromThis(GF2Polynomial gF2Polynomial) {
        expandN(gF2Polynomial.len);
        xorThisBy(gF2Polynomial);
    }

    public boolean testBit(int i11) {
        if (i11 < 0) {
            d0.c();
            return false;
        }
        if (i11 > this.len - 1) {
            return false;
        }
        return (bitMask[i11 & 31] & this.value[i11 >>> 5]) != 0;
    }

    public byte[] toByteArray() {
        int i11 = ((this.len - 1) >> 3) + 1;
        int i12 = i11 & 3;
        byte[] bArr = new byte[i11];
        for (int i13 = 0; i13 < (i11 >> 2); i13++) {
            int i14 = i11 - (i13 << 2);
            int i15 = this.value[i13];
            bArr[i14 - 1] = (byte) (i15 & 255);
            bArr[i14 - 2] = (byte) ((65280 & i15) >>> 8);
            bArr[i14 - 3] = (byte) ((16711680 & i15) >>> 16);
            bArr[i14 - 4] = (byte) (((-16777216) & i15) >>> 24);
        }
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = ((i12 - i16) - 1) << 3;
            bArr[i16] = (byte) ((this.value[this.blocks - 1] & (255 << i17)) >>> i17);
        }
        return bArr;
    }

    public BigInteger toFlexiBigInt() {
        return (this.len == 0 || isZero()) ? new BigInteger(0, new byte[0]) : new BigInteger(1, toByteArray());
    }

    public int[] toIntegerArray() {
        int i11 = this.blocks;
        int[] iArr = new int[i11];
        System.arraycopy(this.value, 0, iArr, 0, i11);
        return iArr;
    }

    public String toString(int i11) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        String[] strArr = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        String str = new String();
        int i12 = this.blocks;
        if (i11 == 16) {
            for (int i13 = i12 - 1; i13 >= 0; i13--) {
                StringBuilder sbO = i.o(str);
                sbO.append(cArr[(this.value[i13] >>> 28) & 15]);
                StringBuilder sbO2 = i.o(sbO.toString());
                sbO2.append(cArr[(this.value[i13] >>> 24) & 15]);
                StringBuilder sbO3 = i.o(sbO2.toString());
                sbO3.append(cArr[(this.value[i13] >>> 20) & 15]);
                StringBuilder sbO4 = i.o(sbO3.toString());
                sbO4.append(cArr[(this.value[i13] >>> 16) & 15]);
                StringBuilder sbO5 = i.o(sbO4.toString());
                sbO5.append(cArr[(this.value[i13] >>> 12) & 15]);
                StringBuilder sbO6 = i.o(sbO5.toString());
                sbO6.append(cArr[(this.value[i13] >>> 8) & 15]);
                StringBuilder sbO7 = i.o(sbO6.toString());
                sbO7.append(cArr[(this.value[i13] >>> 4) & 15]);
                StringBuilder sbO8 = i.o(sbO7.toString());
                sbO8.append(cArr[this.value[i13] & 15]);
                str = sbO8.toString().concat(" ");
            }
            return str;
        }
        for (int i14 = i12 - 1; i14 >= 0; i14--) {
            StringBuilder sbO9 = i.o(str);
            sbO9.append(strArr[(this.value[i14] >>> 28) & 15]);
            StringBuilder sbO10 = i.o(sbO9.toString());
            sbO10.append(strArr[(this.value[i14] >>> 24) & 15]);
            StringBuilder sbO11 = i.o(sbO10.toString());
            sbO11.append(strArr[(this.value[i14] >>> 20) & 15]);
            StringBuilder sbO12 = i.o(sbO11.toString());
            sbO12.append(strArr[(this.value[i14] >>> 16) & 15]);
            StringBuilder sbO13 = i.o(sbO12.toString());
            sbO13.append(strArr[(this.value[i14] >>> 12) & 15]);
            StringBuilder sbO14 = i.o(sbO13.toString());
            sbO14.append(strArr[(this.value[i14] >>> 8) & 15]);
            StringBuilder sbO15 = i.o(sbO14.toString());
            sbO15.append(strArr[(this.value[i14] >>> 4) & 15]);
            StringBuilder sbO16 = i.o(sbO15.toString());
            sbO16.append(strArr[this.value[i14] & 15]);
            str = sbO16.toString().concat(" ");
        }
        return str;
    }

    public boolean vectorMult(GF2Polynomial gF2Polynomial) throws RuntimeException {
        if (this.len != gF2Polynomial.len) {
            d0.c();
            return false;
        }
        boolean z11 = false;
        for (int i11 = 0; i11 < this.blocks; i11++) {
            int i12 = this.value[i11] & gF2Polynomial.value[i11];
            boolean[] zArr = parity;
            z11 = (((z11 ^ zArr[i12 & 255]) ^ zArr[(i12 >>> 8) & 255]) ^ zArr[(i12 >>> 16) & 255]) ^ zArr[(i12 >>> 24) & 255];
        }
        return z11;
    }

    public GF2Polynomial xor(GF2Polynomial gF2Polynomial) {
        GF2Polynomial gF2Polynomial2;
        int iMin = Math.min(this.blocks, gF2Polynomial.blocks);
        int i11 = 0;
        if (this.len >= gF2Polynomial.len) {
            gF2Polynomial2 = new GF2Polynomial(this);
            while (i11 < iMin) {
                int[] iArr = gF2Polynomial2.value;
                iArr[i11] = iArr[i11] ^ gF2Polynomial.value[i11];
                i11++;
            }
        } else {
            gF2Polynomial2 = new GF2Polynomial(gF2Polynomial);
            while (i11 < iMin) {
                int[] iArr2 = gF2Polynomial2.value;
                iArr2[i11] = iArr2[i11] ^ this.value[i11];
                i11++;
            }
        }
        gF2Polynomial2.zeroUnusedBits();
        return gF2Polynomial2;
    }

    public void xorBit(int i11) throws RuntimeException {
        if (i11 < 0 || i11 > this.len - 1) {
            d0.c();
            return;
        }
        int[] iArr = this.value;
        int i12 = i11 >>> 5;
        iArr[i12] = bitMask[i11 & 31] ^ iArr[i12];
    }

    public void xorThisBy(GF2Polynomial gF2Polynomial) {
        for (int i11 = 0; i11 < Math.min(this.blocks, gF2Polynomial.blocks); i11++) {
            int[] iArr = this.value;
            iArr[i11] = iArr[i11] ^ gF2Polynomial.value[i11];
        }
        zeroUnusedBits();
    }

    public void randomize(Random random) {
        for (int i11 = 0; i11 < this.blocks; i11++) {
            this.value[i11] = random.nextInt();
        }
        zeroUnusedBits();
    }

    public GF2Polynomial shiftLeft() {
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.len + 1, this.value);
        int i11 = gF2Polynomial.blocks - 1;
        while (true) {
            int[] iArr = gF2Polynomial.value;
            if (i11 < 1) {
                iArr[0] = iArr[0] << 1;
                return gF2Polynomial;
            }
            int i12 = iArr[i11] << 1;
            iArr[i11] = i12;
            iArr[i11] = i12 | (iArr[i11 - 1] >>> 31);
            i11--;
        }
    }

    public GF2Polynomial(int i11, String str) {
        i11 = i11 < 1 ? 1 : i11;
        int i12 = ((i11 - 1) >> 5) + 1;
        this.blocks = i12;
        this.value = new int[i12];
        this.len = i11;
        if (str.equalsIgnoreCase("ZERO")) {
            assignZero();
            return;
        }
        if (str.equalsIgnoreCase("ONE")) {
            assignOne();
            return;
        }
        if (str.equalsIgnoreCase("RANDOM")) {
            randomize();
            return;
        }
        if (str.equalsIgnoreCase("X")) {
            assignX();
        } else if (str.equalsIgnoreCase("ALL")) {
            assignAll();
        } else {
            a.f(a0.p("Error: GF2Polynomial was called using ", str, " as value!"));
            throw null;
        }
    }

    public GF2Polynomial(int i11) {
        i11 = i11 < 1 ? 1 : i11;
        int i12 = ((i11 - 1) >> 5) + 1;
        this.blocks = i12;
        this.value = new int[i12];
        this.len = i11;
    }

    public GF2Polynomial(int i11, Random random) {
        i11 = i11 < 1 ? 1 : i11;
        int i12 = ((i11 - 1) >> 5) + 1;
        this.blocks = i12;
        this.value = new int[i12];
        this.len = i11;
        randomize(random);
    }

    public GF2Polynomial(int i11, byte[] bArr) {
        int i12;
        int[] iArr;
        i11 = i11 < 1 ? 1 : i11;
        int i13 = ((i11 - 1) >> 5) + 1;
        this.blocks = i13;
        this.value = new int[i13];
        this.len = i11;
        int iMin = Math.min(((bArr.length - 1) >> 2) + 1, i13);
        int i14 = 0;
        while (true) {
            i12 = iMin - 1;
            iArr = this.value;
            if (i14 >= i12) {
                break;
            }
            int length = bArr.length - (i14 << 2);
            int i15 = bArr[length - 1] & 255;
            iArr[i14] = i15;
            int i16 = (65280 & (bArr[length - 2] << 8)) | i15;
            iArr[i14] = i16;
            int i17 = (16711680 & (bArr[length - 3] << 16)) | i16;
            iArr[i14] = i17;
            iArr[i14] = ((bArr[length - 4] << 24) & RoundCornerImageView.DEFAULT_STROKE_COLOR) | i17;
            i14++;
        }
        int length2 = bArr.length - (i12 << 2);
        int i18 = length2 - 1;
        int i19 = bArr[i18] & 255;
        iArr[i12] = i19;
        if (i18 > 0) {
            iArr[i12] = (65280 & (bArr[length2 - 2] << 8)) | i19;
        }
        if (i18 > 1) {
            iArr[i12] = iArr[i12] | (16711680 & (bArr[length2 - 3] << 16));
        }
        if (i18 > 2) {
            iArr[i12] = ((bArr[length2 - 4] << 24) & RoundCornerImageView.DEFAULT_STROKE_COLOR) | iArr[i12];
        }
        zeroUnusedBits();
        reduceN();
    }

    public GF2Polynomial(int i11, int[] iArr) {
        i11 = i11 < 1 ? 1 : i11;
        int i12 = ((i11 - 1) >> 5) + 1;
        this.blocks = i12;
        this.value = new int[i12];
        this.len = i11;
        System.arraycopy(iArr, 0, this.value, 0, Math.min(i12, iArr.length));
        zeroUnusedBits();
    }

    public GF2Polynomial(GF2Polynomial gF2Polynomial) {
        this.len = gF2Polynomial.len;
        this.blocks = gF2Polynomial.blocks;
        this.value = IntUtils.clone(gF2Polynomial.value);
    }
}
