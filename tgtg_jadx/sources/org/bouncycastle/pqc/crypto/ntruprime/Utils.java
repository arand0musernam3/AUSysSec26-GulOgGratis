package org.bouncycastle.pqc.crypto.ntruprime;

import com.braze.h2;
import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.crypto.modes.CTRModeCipher;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.brotli.dec.BrotliInputStream;
import w2.l1;

/* JADX INFO: loaded from: classes3.dex */
class Utils {
    public static int bToUnsignedInt(byte b8) {
        return b8 & 255;
    }

    public static void checkForSmallPolynomial(byte[] bArr, byte[] bArr2, int i11, int i12) {
        int i13 = 0;
        for (int i14 = 0; i14 != bArr2.length; i14++) {
            i13 += bArr2[i14] & 1;
        }
        int iCheckNotEqualToZero = checkNotEqualToZero(i13 - i12);
        for (int i15 = 0; i15 < i12; i15++) {
            bArr[i15] = (byte) (((bArr2[i15] ^ 1) & (~iCheckNotEqualToZero)) ^ 1);
        }
        while (i12 < i11) {
            bArr[i12] = (byte) (bArr2[i12] & (~iCheckNotEqualToZero));
            i12++;
        }
    }

    private static int checkLessThanZero(int i11) {
        return -(i11 >>> 31);
    }

    private static int checkNotEqualToZero(int i11) {
        return -((int) ((-iToUnsignedLong(i11)) >>> 63));
    }

    public static void cryptoSort(int[] iArr, int i11) {
        if (i11 < 2) {
            return;
        }
        int i12 = 1;
        while (i12 < i11 - i12) {
            i12 += i12;
        }
        for (int i13 = i12; i13 > 0; i13 >>>= 1) {
            for (int i14 = 0; i14 < i11 - i13; i14++) {
                if ((i14 & i13) == 0) {
                    minmax(iArr, i14, i14 + i13);
                }
            }
            for (int i15 = i12; i15 > i13; i15 >>>= 1) {
                for (int i16 = 0; i16 < i11 - i15; i16++) {
                    if ((i16 & i13) == 0) {
                        minmax(iArr, i16 + i13, i16 + i15);
                    }
                }
            }
        }
    }

    private static void decode(short[] sArr, byte[] bArr, short[] sArr2, int i11, int i12, int i13) {
        int i14;
        if (i11 == 1) {
            short s7 = sArr2[0];
            if (s7 == 1) {
                sArr[i12] = 0;
            } else if (s7 <= 256) {
                sArr[i12] = (short) getUnsignedMod(bToUnsignedInt(bArr[i13]), sArr2[0]);
            } else {
                sArr[i12] = (short) getUnsignedMod(bToUnsignedInt(bArr[i13]) + (bArr[i13 + 1] << 8), sArr2[0]);
            }
        }
        if (i11 > 1) {
            int i15 = (i11 + 1) / 2;
            short[] sArr3 = new short[i15];
            short[] sArr4 = new short[i15];
            int i16 = i11 / 2;
            short[] sArr5 = new short[i16];
            int[] iArr = new int[i16];
            int i17 = i13;
            int i18 = 0;
            while (true) {
                i14 = i11 - 1;
                if (i18 >= i14) {
                    break;
                }
                int i19 = sArr2[i18] * sArr2[i18 + 1];
                if (i19 > 4194048) {
                    int i21 = i18 / 2;
                    iArr[i21] = 65536;
                    sArr5[i21] = (short) ((bToUnsignedInt(bArr[i17 + 1]) * 256) + bToUnsignedInt(bArr[i17]));
                    i17 += 2;
                    sArr4[i21] = (short) ((((i19 + 255) >>> 8) + 255) >>> 8);
                } else if (i19 >= 16384) {
                    int i22 = i18 / 2;
                    iArr[i22] = 256;
                    sArr5[i22] = (short) bToUnsignedInt(bArr[i17]);
                    i17++;
                    sArr4[i22] = (short) ((i19 + 255) >>> 8);
                } else {
                    int i23 = i18 / 2;
                    iArr[i23] = 1;
                    sArr5[i23] = 0;
                    sArr4[i23] = (short) i19;
                }
                i18 += 2;
            }
            if (i18 < i11) {
                sArr4[i18 / 2] = sArr2[i18];
            }
            decode(sArr3, bArr, sArr4, i15, i12, i17);
            int i24 = i12;
            int i25 = 0;
            while (i25 < i14) {
                int i26 = i25 / 2;
                int[] unsignedDivMod = getUnsignedDivMod((iArr[i26] * sToUnsignedInt(sArr3[i26])) + sToUnsignedInt(sArr5[i26]), sArr2[i25]);
                int i27 = i24 + 1;
                sArr[i24] = (short) unsignedDivMod[1];
                i24 += 2;
                sArr[i27] = (short) getUnsignedMod(unsignedDivMod[0], sArr2[i25 + 1]);
                i25 += 2;
            }
            if (i25 < i11) {
                sArr[i24] = sArr3[i25 / 2];
            }
        }
    }

    private static void encode(byte[] bArr, short[] sArr, short[] sArr2, int i11, int i12) {
        int i13 = 0;
        if (i11 == 1) {
            short s7 = sArr[0];
            short s8 = sArr2[0];
            while (s8 > 1) {
                bArr[i12] = (byte) s7;
                s7 = (short) (s7 >>> 8);
                s8 = (short) ((s8 + 255) >>> 8);
                i12++;
            }
        }
        if (i11 > 1) {
            int i14 = (i11 + 1) / 2;
            short[] sArr3 = new short[i14];
            short[] sArr4 = new short[i14];
            while (i13 < i11 - 1) {
                short s11 = sArr2[i13];
                int i15 = i13 + 1;
                int i16 = (sArr[i15] * s11) + sArr[i13];
                int i17 = sArr2[i15] * s11;
                while (i17 >= 16384) {
                    bArr[i12] = (byte) i16;
                    i16 >>>= 8;
                    i17 = (i17 + 255) >>> 8;
                    i12++;
                }
                int i18 = i13 / 2;
                sArr3[i18] = (short) i16;
                sArr4[i18] = (short) i17;
                i13 += 2;
            }
            if (i13 < i11) {
                int i19 = i13 / 2;
                sArr3[i19] = sArr[i13];
                sArr4[i19] = sArr2[i13];
            }
            encode(bArr, sArr3, sArr4, i14, i12);
        }
    }

    public static void expand(int[] iArr, byte[] bArr) {
        byte[] bArr2 = new byte[iArr.length * 4];
        byte[] bArr3 = new byte[iArr.length * 4];
        generateAES256CTRStream(bArr2, bArr3, new byte[16], bArr);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = i11 * 4;
            iArr[i11] = bToUnsignedInt(bArr3[i12]) + (bToUnsignedInt(bArr3[i12 + 1]) << 8) + (bToUnsignedInt(bArr3[i12 + 2]) << 16) + (bToUnsignedInt(bArr3[i12 + 3]) << 24);
        }
    }

    private static void generateAES256CTRStream(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        CTRModeCipher cTRModeCipherNewInstance = SICBlockCipher.newInstance(AESEngine.newInstance());
        cTRModeCipherNewInstance.init(true, new ParametersWithIV(new KeyParameter(bArr4), bArr3));
        cTRModeCipherNewInstance.processBytes(bArr, 0, bArr2.length, bArr2, 0);
    }

    public static void generatePolynomialInRQFromSeed(short[] sArr, byte[] bArr, int i11, int i12) {
        int[] iArr = new int[i11];
        expand(iArr, bArr);
        for (int i13 = 0; i13 < i11; i13++) {
            sArr[i13] = (short) (getUnsignedMod(iArr[i13], i12) - ((i12 - 1) / 2));
        }
    }

    public static void getDecodedPolynomial(short[] sArr, byte[] bArr, int i11, int i12) {
        short[] sArr2 = new short[i11];
        short[] sArr3 = new short[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            sArr3[i13] = (short) i12;
        }
        decode(sArr2, bArr, sArr3, i11, 0, 0);
        for (int i14 = 0; i14 < i11; i14++) {
            sArr[i14] = (short) (sArr2[i14] - ((i12 - 1) / 2));
        }
    }

    public static void getDecodedSmallPolynomial(byte[] bArr, byte[] bArr2, int i11) {
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i11 / 4) {
            int i15 = i13 + 1;
            byte b8 = bArr2[i13];
            bArr[i14] = (byte) ((bToUnsignedInt(b8) & 3) - 1);
            bArr[i14 + 1] = (byte) ((bToUnsignedInt(r1) & 3) - 1);
            byte b11 = (byte) (((byte) (b8 >>> 2)) >>> 2);
            int i16 = i14 + 3;
            bArr[i14 + 2] = (byte) ((bToUnsignedInt(b11) & 3) - 1);
            i14 += 4;
            bArr[i16] = (byte) ((bToUnsignedInt((byte) (b11 >>> 2)) & 3) - 1);
            i12++;
            i13 = i15;
        }
        bArr[i14] = (byte) ((bToUnsignedInt(bArr2[i13]) & 3) - 1);
    }

    public static void getEncodedInputs(byte[] bArr, byte[] bArr2) {
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            int i12 = i11 >>> 3;
            bArr[i12] = (byte) (bArr[i12] | (bArr2[i11] << (i11 & 7)));
        }
    }

    public static void getEncodedPolynomial(byte[] bArr, short[] sArr, int i11, int i12) {
        short[] sArr2 = new short[i11];
        short[] sArr3 = new short[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            sArr2[i13] = (short) a.a(i12, 1, 2, sArr[i13]);
        }
        for (int i14 = 0; i14 < i11; i14++) {
            sArr3[i14] = (short) i12;
        }
        encode(bArr, sArr2, sArr3, i11, 0);
    }

    public static void getEncodedSmallPolynomial(byte[] bArr, byte[] bArr2, int i11) {
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i11 / 4) {
            int i15 = i14 + 3;
            byte b8 = (byte) (((byte) (((byte) (bArr2[i14] + 1)) + (((byte) (bArr2[i14 + 1] + 1)) << 2))) + (((byte) (bArr2[i14 + 2] + 1)) << 4));
            i14 += 4;
            bArr[i13] = (byte) (b8 + (((byte) (bArr2[i15] + 1)) << 6));
            i12++;
            i13++;
        }
        bArr[i13] = (byte) (bArr2[i14] + 1);
    }

    public static byte[] getHashWithPrefix(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[64];
        int length = bArr.length + bArr2.length;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
        SHA512Digest sHA512Digest = new SHA512Digest();
        sHA512Digest.update(bArr4, 0, length);
        sHA512Digest.doFinal(bArr3, 0);
        return bArr3;
    }

    public static int getInverseInRQ(int i11, int i12) {
        int modFreeze = i11;
        for (int i13 = 1; i13 < i12 - 2; i13++) {
            modFreeze = getModFreeze(modFreeze * i11, i12);
        }
        return modFreeze;
    }

    public static int getModFreeze(int i11, int i12) {
        int i13 = (i12 - 1) / 2;
        return getSignedDivMod(i11 + i13, i12)[1] - i13;
    }

    public static void getOneThirdInverseInRQ(short[] sArr, byte[] bArr, int i11, int i12) {
        int i13 = i11 + 1;
        short[] sArr2 = new short[i13];
        short[] sArr3 = new short[i13];
        short[] sArr4 = new short[i13];
        short[] sArr5 = new short[i13];
        sArr4[0] = (short) getInverseInRQ(3, i12);
        sArr2[0] = 1;
        int i14 = i11 - 1;
        sArr2[i14] = -1;
        sArr2[i11] = -1;
        for (int i15 = 0; i15 < i11; i15++) {
            sArr3[i14 - i15] = bArr[i15];
        }
        sArr3[i11] = 0;
        int i16 = 1;
        for (int i17 = 0; i17 < (i11 * 2) - 1; i17++) {
            System.arraycopy(sArr5, 0, sArr5, 1, i11);
            sArr5[0] = 0;
            int i18 = -i16;
            int iCheckLessThanZero = checkLessThanZero(i18) & checkNotEqualToZero(sArr3[0]);
            i16 = (i16 ^ ((i18 ^ i16) & iCheckLessThanZero)) + 1;
            for (int i19 = 0; i19 < i13; i19++) {
                short s7 = sArr2[i19];
                int i21 = (sArr3[i19] ^ s7) & iCheckLessThanZero;
                sArr2[i19] = (short) (s7 ^ i21);
                sArr3[i19] = (short) (sArr3[i19] ^ i21);
                short s8 = sArr5[i19];
                int i22 = (sArr4[i19] ^ s8) & iCheckLessThanZero;
                sArr5[i19] = (short) (s8 ^ i22);
                sArr4[i19] = (short) (sArr4[i19] ^ i22);
            }
            short s11 = sArr2[0];
            short s12 = sArr3[0];
            for (int i23 = 0; i23 < i13; i23++) {
                sArr3[i23] = (short) getModFreeze((sArr3[i23] * s11) - (sArr2[i23] * s12), i12);
            }
            for (int i24 = 0; i24 < i13; i24++) {
                sArr4[i24] = (short) getModFreeze((sArr4[i24] * s11) - (sArr5[i24] * s12), i12);
            }
            int i25 = 0;
            while (i25 < i11) {
                int i26 = i25 + 1;
                sArr3[i25] = sArr3[i26];
                i25 = i26;
            }
            sArr3[i11] = 0;
        }
        int inverseInRQ = getInverseInRQ(sArr2[0], i12);
        for (int i27 = 0; i27 < i11; i27++) {
            sArr[i27] = (short) getModFreeze(sArr5[i14 - i27] * inverseInRQ, i12);
        }
    }

    public static void getRandomInputs(SecureRandom secureRandom, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length / 8];
        secureRandom.nextBytes(bArr2);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr[i11] = (byte) ((bArr2[i11 >>> 3] >>> (i11 & 7)) & 1);
        }
    }

    public static void getRandomShortPolynomial(SecureRandom secureRandom, byte[] bArr, int i11, int i12) {
        int[] iArr = new int[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            iArr[i13] = getRandomUnsignedInteger(secureRandom);
        }
        sortGenerateShortPolynomial(bArr, iArr, i11, i12);
    }

    public static void getRandomSmallPolynomial(SecureRandom secureRandom, byte[] bArr) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr[i11] = (byte) ((((getRandomUnsignedInteger(secureRandom) & 1073741823) * 3) >>> 30) - 1);
        }
    }

    public static int getRandomUnsignedInteger(SecureRandom secureRandom) {
        byte[] bArr = new byte[4];
        secureRandom.nextBytes(bArr);
        return bToUnsignedInt(bArr[0]) + (bToUnsignedInt(bArr[1]) << 8) + (bToUnsignedInt(bArr[2]) << 16) + (bToUnsignedInt(bArr[3]) << 24);
    }

    public static void getRoundedDecodedPolynomial(short[] sArr, byte[] bArr, int i11, int i12) {
        short[] sArr2 = new short[i11];
        short[] sArr3 = new short[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            sArr3[i13] = (short) ((i12 + 2) / 3);
        }
        decode(sArr2, bArr, sArr3, i11, 0, 0);
        for (int i14 = 0; i14 < i11; i14++) {
            sArr[i14] = (short) ((sArr2[i14] * 3) - ((i12 - 1) / 2));
        }
    }

    public static void getRoundedEncodedPolynomial(byte[] bArr, short[] sArr, int i11, int i12) {
        short[] sArr2 = new short[i11];
        short[] sArr3 = new short[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            sArr2[i13] = (short) (((((i12 - 1) / 2) + sArr[i13]) * 10923) >>> 15);
            sArr3[i13] = (short) ((i12 + 2) / 3);
        }
        encode(bArr, sArr2, sArr3, i11, 0);
    }

    private static int[] getSignedDivMod(int i11, int i12) {
        int[] unsignedDivMod = getUnsignedDivMod(toIntExact(iToUnsignedLong(i11) - 2147483648L), i12);
        int[] unsignedDivMod2 = getUnsignedDivMod(Integer.MIN_VALUE, i12);
        int intExact = toIntExact(iToUnsignedLong(unsignedDivMod[0]) - iToUnsignedLong(unsignedDivMod2[0]));
        int intExact2 = toIntExact(iToUnsignedLong(unsignedDivMod[1]) - iToUnsignedLong(unsignedDivMod2[1]));
        int i13 = -(intExact2 >>> 31);
        return new int[]{intExact + i13, intExact2 + (i12 & i13)};
    }

    public static void getTopDecodedPolynomial(byte[] bArr, byte[] bArr2) {
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            int i12 = i11 * 2;
            bArr[i12] = (byte) (bArr2[i11] & 15);
            bArr[i12 + 1] = (byte) (bArr2[i11] >>> 4);
        }
    }

    public static void getTopEncodedPolynomial(byte[] bArr, byte[] bArr2) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) (bArr2[i12] + (bArr2[i12 + 1] << 4));
        }
    }

    private static int[] getUnsignedDivMod(int i11, int i12) {
        long jIToUnsignedLong = iToUnsignedLong(i11);
        long j9 = i12;
        long jIToUnsignedLong2 = iToUnsignedLong(Integer.MIN_VALUE) / j9;
        long j11 = (jIToUnsignedLong * jIToUnsignedLong2) >>> 31;
        long j12 = jIToUnsignedLong - (j11 * j9);
        long j13 = (jIToUnsignedLong2 * j12) >>> 31;
        long j14 = (j12 - (j13 * j9)) - j9;
        long j15 = j11 + j13 + 1;
        long j16 = -(j14 >>> 63);
        return new int[]{toIntExact(j15 + j16), toIntExact(j14 + (j9 & j16))};
    }

    private static int getUnsignedMod(int i11, int i12) {
        return getUnsignedDivMod(i11, i12)[1];
    }

    public static long iToUnsignedLong(int i11) {
        return ((long) i11) & 4294967295L;
    }

    public static boolean isInvertiblePolynomialInR3(byte[] bArr, byte[] bArr2, int i11) {
        int i12 = i11 + 1;
        byte[] bArr3 = new byte[i12];
        byte[] bArr4 = new byte[i12];
        byte[] bArr5 = new byte[i12];
        byte[] bArr6 = new byte[i12];
        bArr5[0] = 1;
        bArr3[0] = 1;
        int i13 = i11 - 1;
        bArr3[i13] = -1;
        bArr3[i11] = -1;
        for (int i14 = 0; i14 < i11; i14++) {
            bArr4[i13 - i14] = bArr[i14];
        }
        bArr4[i11] = 0;
        int i15 = 1;
        for (int i16 = 0; i16 < (i11 * 2) - 1; i16++) {
            System.arraycopy(bArr6, 0, bArr6, 1, i11);
            bArr6[0] = 0;
            int i17 = (-bArr4[0]) * bArr3[0];
            int i18 = -i15;
            int iCheckLessThanZero = checkLessThanZero(i18) & checkNotEqualToZero(bArr4[0]);
            i15 = (i15 ^ ((i18 ^ i15) & iCheckLessThanZero)) + 1;
            for (int i19 = 0; i19 < i12; i19++) {
                byte b8 = bArr3[i19];
                int i21 = (bArr4[i19] ^ b8) & iCheckLessThanZero;
                bArr3[i19] = (byte) (b8 ^ i21);
                bArr4[i19] = (byte) (bArr4[i19] ^ i21);
                byte b11 = bArr6[i19];
                int i22 = (bArr5[i19] ^ b11) & iCheckLessThanZero;
                bArr6[i19] = (byte) (b11 ^ i22);
                bArr5[i19] = (byte) (bArr5[i19] ^ i22);
            }
            for (int i23 = 0; i23 < i12; i23++) {
                bArr4[i23] = (byte) getModFreeze((bArr3[i23] * i17) + bArr4[i23], 3);
            }
            for (int i24 = 0; i24 < i12; i24++) {
                bArr5[i24] = (byte) getModFreeze((bArr6[i24] * i17) + bArr5[i24], 3);
            }
            int i25 = 0;
            while (i25 < i11) {
                int i26 = i25 + 1;
                bArr4[i25] = bArr4[i26];
                i25 = i26;
            }
            bArr4[i11] = 0;
        }
        byte b12 = bArr3[0];
        for (int i27 = 0; i27 < i11; i27++) {
            bArr2[i27] = (byte) (bArr6[i13 - i27] * b12);
        }
        return i15 == 0;
    }

    public static void minmax(int[] iArr, int i11, int i12) {
        int i13 = iArr[i11];
        int i14 = iArr[i12];
        int i15 = i13 ^ i14;
        int i16 = i14 - i13;
        int i17 = i15 & (-((i16 ^ (((i16 ^ i14) ^ Integer.MIN_VALUE) & i15)) >>> 31));
        iArr[i11] = i13 ^ i17;
        iArr[i12] = i14 ^ i17;
    }

    public static void multiplicationInR3(byte[] bArr, byte[] bArr2, byte[] bArr3, int i11) {
        int i12 = i11 + i11;
        int i13 = i12 - 1;
        byte[] bArr4 = new byte[i13];
        for (int i14 = 0; i14 < i11; i14++) {
            byte modFreeze = 0;
            for (int i15 = 0; i15 <= i14; i15++) {
                modFreeze = (byte) getModFreeze((bArr2[i15] * bArr3[i14 - i15]) + modFreeze, 3);
            }
            bArr4[i14] = modFreeze;
        }
        for (int i16 = i11; i16 < i13; i16++) {
            byte modFreeze2 = 0;
            for (int i17 = (i16 - i11) + 1; i17 < i11; i17++) {
                modFreeze2 = (byte) getModFreeze((bArr2[i17] * bArr3[i16 - i17]) + modFreeze2, 3);
            }
            bArr4[i16] = modFreeze2;
        }
        for (int i18 = i12 - 2; i18 >= i11; i18--) {
            int i19 = i18 - i11;
            bArr4[i19] = (byte) getModFreeze(bArr4[i19] + bArr4[i18], 3);
            int i21 = i19 + 1;
            bArr4[i21] = (byte) getModFreeze(bArr4[i21] + bArr4[i18], 3);
        }
        for (int i22 = 0; i22 < i11; i22++) {
            bArr[i22] = bArr4[i22];
        }
    }

    public static void multiplicationInRQ(short[] sArr, short[] sArr2, byte[] bArr, int i11, int i12) {
        int i13 = i11 + i11;
        int i14 = i13 - 1;
        short[] sArr3 = new short[i14];
        for (int i15 = 0; i15 < i11; i15++) {
            short modFreeze = 0;
            for (int i16 = 0; i16 <= i15; i16++) {
                modFreeze = (short) getModFreeze((sArr2[i16] * bArr[i15 - i16]) + modFreeze, i12);
            }
            sArr3[i15] = modFreeze;
        }
        for (int i17 = i11; i17 < i14; i17++) {
            short modFreeze2 = 0;
            for (int i18 = (i17 - i11) + 1; i18 < i11; i18++) {
                modFreeze2 = (short) getModFreeze((sArr2[i18] * bArr[i17 - i18]) + modFreeze2, i12);
            }
            sArr3[i17] = modFreeze2;
        }
        for (int i19 = i13 - 2; i19 >= i11; i19--) {
            int i21 = i19 - i11;
            sArr3[i21] = (short) getModFreeze(sArr3[i21] + sArr3[i19], i12);
            int i22 = i21 + 1;
            sArr3[i22] = (short) getModFreeze(sArr3[i22] + sArr3[i19], i12);
        }
        for (int i23 = 0; i23 < i11; i23++) {
            sArr[i23] = sArr3[i23];
        }
    }

    public static void right(byte[] bArr, short[] sArr, byte[] bArr2, int i11, int i12, int i13, int i14) {
        for (int i15 = 0; i15 < bArr.length; i15++) {
            bArr[i15] = (byte) (-checkLessThanZero(getModFreeze(l1.a(i12, 4, getModFreeze((bArr2[i15] * i14) - i13, i11) - sArr[i15], 1), i11)));
        }
    }

    public static void roundPolynomial(short[] sArr, short[] sArr2) {
        for (int i11 = 0; i11 < sArr.length; i11++) {
            short s7 = sArr2[i11];
            sArr[i11] = (short) (s7 - getModFreeze(s7, 3));
        }
    }

    public static int sToUnsignedInt(short s7) {
        return s7 & HPKE.aead_EXPORT_ONLY;
    }

    public static void scalarMultiplicationInRQ(short[] sArr, short[] sArr2, int i11, int i12) {
        for (int i13 = 0; i13 < sArr2.length; i13++) {
            sArr[i13] = (short) getModFreeze(sArr2[i13] * i11, i12);
        }
    }

    public static void sortGenerateShortPolynomial(byte[] bArr, int[] iArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            iArr[i13] = iArr[i13] & (-2);
        }
        while (i12 < i11) {
            iArr[i12] = (iArr[i12] & (-3)) | 1;
            i12++;
        }
        cryptoSort(iArr, i11);
        for (int i14 = 0; i14 < i11; i14++) {
            bArr[i14] = (byte) ((iArr[i14] & 3) - 1);
        }
    }

    public static int toIntExact(long j9) {
        int i11 = (int) j9;
        if (i11 == j9) {
            return i11;
        }
        h2.b("value out of integer range");
        return 0;
    }

    public static void top(byte[] bArr, short[] sArr, byte[] bArr2, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < bArr.length; i14++) {
            bArr[i14] = (byte) ((((getModFreeze((((i11 - 1) / 2) * bArr2[i14]) + sArr[i14], i11) + i12) * i13) + BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) >>> 15);
        }
    }

    public static void transformRQToR3(byte[] bArr, short[] sArr) {
        for (int i11 = 0; i11 < sArr.length; i11++) {
            bArr[i11] = (byte) getModFreeze(sArr[i11], 3);
        }
    }

    public static void updateDiffMask(byte[] bArr, byte[] bArr2, int i11) {
        for (int i12 = 0; i12 < bArr.length; i12++) {
            int i13 = bArr[i12];
            bArr[i12] = (byte) (i13 ^ ((bArr2[i12] ^ i13) & i11));
        }
    }
}
