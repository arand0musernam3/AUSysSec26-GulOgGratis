package org.bouncycastle.math.ec.rfc7748;

import j4.s;
import org.bouncycastle.math.raw.Mod;

/* JADX INFO: loaded from: classes3.dex */
public abstract class X25519Field {
    private static final int M24 = 16777215;
    private static final int M25 = 33554431;
    private static final int M26 = 67108863;
    private static final int[] P32 = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] ROOT_NEG_ONE = {-32595792, -7943725, 4688975, 3500415, 6194736, 33281959, -12573105, -1002827, 163343, 5703241};
    public static final int SIZE = 10;

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i11 = 0; i11 < 10; i11++) {
            iArr3[i11] = iArr[i11] + iArr2[i11];
        }
    }

    public static void addOne(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static void apm(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i11 = 0; i11 < 10; i11++) {
            int i12 = iArr[i11];
            int i13 = iArr2[i11];
            iArr3[i11] = i12 + i13;
            iArr4[i11] = i12 - i13;
        }
    }

    public static int areEqual(int[] iArr, int[] iArr2) {
        int i11 = 0;
        for (int i12 = 0; i12 < 10; i12++) {
            i11 |= iArr[i12] ^ iArr2[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static boolean areEqualVar(int[] iArr, int[] iArr2) {
        return areEqual(iArr, iArr2) != 0;
    }

    public static void carry(int[] iArr) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        int i19 = iArr[8];
        int i21 = iArr[9];
        int i22 = i13 + (i12 >> 26);
        int i23 = i12 & M26;
        int i24 = i15 + (i14 >> 26);
        int i25 = i14 & M26;
        int i26 = i18 + (i17 >> 26);
        int i27 = i17 & M26;
        int i28 = i21 + (i19 >> 26);
        int i29 = i19 & M26;
        int i31 = i25 + (i22 >> 25);
        int i32 = i22 & M25;
        int i33 = i16 + (i24 >> 25);
        int i34 = i24 & M25;
        int i35 = i29 + (i26 >> 25);
        int i36 = i26 & M25;
        int i37 = ((i28 >> 25) * 38) + i11;
        int i38 = i28 & M25;
        int i39 = i23 + (i37 >> 26);
        int i41 = i37 & M26;
        int i42 = i27 + (i33 >> 26);
        int i43 = i33 & M26;
        int i44 = i32 + (i39 >> 26);
        int i45 = i39 & M26;
        int i46 = i34 + (i31 >> 26);
        int i47 = i31 & M26;
        int i48 = i36 + (i42 >> 26);
        int i49 = i42 & M26;
        int i51 = i38 + (i35 >> 26);
        int i52 = i35 & M26;
        iArr[0] = i41;
        iArr[1] = i45;
        iArr[2] = i44;
        iArr[3] = i47;
        iArr[4] = i46;
        iArr[5] = i43;
        iArr[6] = i49;
        iArr[7] = i48;
        iArr[8] = i52;
        iArr[9] = i51;
    }

    public static void cmov(int i11, int[] iArr, int i12, int[] iArr2, int i13) {
        for (int i14 = 0; i14 < 10; i14++) {
            int i15 = i13 + i14;
            int i16 = iArr2[i15];
            iArr2[i15] = i16 ^ ((iArr[i12 + i14] ^ i16) & i11);
        }
    }

    public static void cnegate(int i11, int[] iArr) {
        int i12 = 0 - i11;
        for (int i13 = 0; i13 < 10; i13++) {
            iArr[i13] = (iArr[i13] ^ i12) - i12;
        }
    }

    public static void copy(int[] iArr, int i11, int[] iArr2, int i12) {
        for (int i13 = 0; i13 < 10; i13++) {
            iArr2[i12 + i13] = iArr[i11 + i13];
        }
    }

    public static int[] create() {
        return new int[10];
    }

    public static int[] createTable(int i11) {
        return new int[i11 * 10];
    }

    public static void cswap(int i11, int[] iArr, int[] iArr2) {
        int i12 = 0 - i11;
        for (int i13 = 0; i13 < 10; i13++) {
            int i14 = iArr[i13];
            int i15 = iArr2[i13];
            int i16 = (i14 ^ i15) & i12;
            iArr[i13] = i14 ^ i16;
            iArr2[i13] = i15 ^ i16;
        }
    }

    public static void decode(byte[] bArr, int i11, int[] iArr) {
        decode128(bArr, i11, iArr, 0);
        decode128(bArr, i11 + 16, iArr, 5);
        iArr[9] = iArr[9] & M24;
    }

    private static void decode128(byte[] bArr, int i11, int[] iArr, int i12) {
        int iDecode32 = decode32(bArr, i11);
        int iDecode322 = decode32(bArr, i11 + 4);
        int iDecode323 = decode32(bArr, i11 + 8);
        int iDecode324 = decode32(bArr, i11 + 12);
        iArr[i12] = iDecode32 & M26;
        iArr[i12 + 1] = ((iDecode32 >>> 26) | (iDecode322 << 6)) & M26;
        iArr[i12 + 2] = ((iDecode322 >>> 20) | (iDecode323 << 12)) & M25;
        iArr[i12 + 3] = M26 & ((iDecode324 << 19) | (iDecode323 >>> 13));
        iArr[i12 + 4] = iDecode324 >>> 7;
    }

    private static int decode32(byte[] bArr, int i11) {
        return (bArr[i11 + 3] << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    public static void encode(int[] iArr, int i11, byte[] bArr, int i12) {
        encode128(iArr, i11, bArr, i12);
        encode128(iArr, i11 + 5, bArr, i12 + 16);
    }

    private static void encode128(int[] iArr, int i11, byte[] bArr, int i12) {
        int i13 = iArr[i11];
        int i14 = iArr[i11 + 1];
        int i15 = iArr[i11 + 2];
        int i16 = iArr[i11 + 3];
        int i17 = iArr[i11 + 4];
        encode32((i14 << 26) | i13, bArr, i12);
        encode32((i14 >>> 6) | (i15 << 20), bArr, i12 + 4);
        encode32((i15 >>> 12) | (i16 << 13), bArr, i12 + 8);
        encode32((i17 << 7) | (i16 >>> 19), bArr, i12 + 12);
    }

    private static void encode32(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12 + 2] = (byte) (i11 >>> 16);
        bArr[i12 + 3] = (byte) (i11 >>> 24);
    }

    public static void inv(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        int[] iArr3 = new int[8];
        copy(iArr, 0, iArrCreate, 0);
        normalize(iArrCreate);
        encode(iArrCreate, iArr3, 0);
        Mod.modOddInverse(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static void invVar(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        int[] iArr3 = new int[8];
        copy(iArr, 0, iArrCreate, 0);
        normalize(iArrCreate);
        encode(iArrCreate, iArr3, 0);
        Mod.modOddInverseVar(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static int isOne(int[] iArr) {
        int i11 = iArr[0] ^ 1;
        for (int i12 = 1; i12 < 10; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static boolean isOneVar(int[] iArr) {
        return isOne(iArr) != 0;
    }

    public static int isZero(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 10; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static boolean isZeroVar(int[] iArr) {
        return isZero(iArr) != 0;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        int i11 = iArr[0];
        int i12 = iArr2[0];
        int i13 = iArr[1];
        int i14 = iArr2[1];
        int i15 = iArr[2];
        int i16 = iArr2[2];
        int i17 = iArr[3];
        int i18 = iArr2[3];
        int i19 = iArr[4];
        int i21 = iArr2[4];
        int i22 = iArr[5];
        int i23 = iArr2[5];
        int i24 = iArr[6];
        int i25 = iArr2[6];
        int i26 = iArr[7];
        int i27 = iArr2[7];
        int i28 = iArr[8];
        int i29 = iArr2[8];
        int i31 = iArr[9];
        int i32 = iArr2[9];
        long j9 = i11;
        long j11 = i12;
        long j12 = j9 * j11;
        long j13 = i14;
        long j14 = j9 * j13;
        long j15 = i13;
        long j16 = (j15 * j11) + j14;
        long j17 = i16;
        long j18 = (j15 * j13) + (j9 * j17);
        long j19 = i15;
        long j21 = (j19 * j11) + j18;
        long j22 = ((j19 * j13) + (j15 * j17)) << 1;
        long j23 = i18;
        long j24 = j9 * j23;
        long j25 = i17;
        long jC = s.c(j25, j11, j24, j22);
        long j26 = (j19 * j17) << 1;
        long j27 = i21;
        long j28 = i19;
        long jC2 = s.c(j28, j11, (j25 * j13) + (j15 * j23) + (j9 * j27), j26);
        long j29 = ((j28 * j13) + ((j25 * j17) + ((j19 * j23) + (j15 * j27)))) << 1;
        long j31 = (j25 * j23) + (((j28 * j17) + (j19 * j27)) << 1);
        long j32 = (j28 * j23) + (j25 * j27);
        long j33 = (j28 * j27) << 1;
        long j34 = i22;
        long j35 = i23;
        long j36 = j34 * j35;
        long j37 = i25;
        long j38 = j34 * j37;
        long j39 = i24;
        long j41 = (j39 * j35) + j38;
        long j42 = i27;
        long j43 = (j39 * j37) + (j34 * j42);
        long j44 = i26;
        long j45 = i29;
        long j46 = j34 * j45;
        long j47 = i28;
        long jC3 = s.c(j47, j35, j46, ((j44 * j37) + (j39 * j42)) << 1);
        long j48 = i32;
        long j49 = (j47 * j37) + (j39 * j45) + (j34 * j48);
        long j51 = i31;
        long jC4 = s.c(j51, j35, j49, (j44 * j42) << 1);
        long j52 = j12 - (((j37 * j51) + ((j47 * j42) + ((j44 * j45) + (j39 * j48)))) * 76);
        long j53 = j16 - (((j47 * j45) + (((j42 * j51) + (j44 * j48)) << 1)) * 38);
        long j54 = j21 - (((j51 * j45) + (j47 * j48)) * 38);
        long j55 = jC - ((j48 * j51) * 76);
        long j56 = j29 - j36;
        long j57 = j31 - j41;
        long j58 = j32 - ((j44 * j35) + j43);
        long j59 = j33 - jC3;
        long j61 = i11 + i22;
        long j62 = i12 + i23;
        long j63 = j61 * j62;
        long j64 = i14 + i25;
        long j65 = j61 * j64;
        long j66 = i13 + i24;
        long j67 = (j66 * j62) + j65;
        long j68 = i16 + i27;
        long j69 = i15 + i26;
        long j71 = (j69 * j62) + (j66 * j64) + (j61 * j68);
        long j72 = ((j69 * j64) + (j66 * j68)) << 1;
        long j73 = i18 + i29;
        long j74 = i17 + i28;
        long jC5 = s.c(j74, j62, j61 * j73, j72);
        long j75 = i21 + i32;
        long j76 = i19 + i31;
        long jC6 = s.c(j76, j62, (j74 * j64) + (j66 * j73) + (j61 * j75), (j69 * j68) << 1);
        long j77 = ((j64 * j76) + ((j74 * j68) + ((j69 * j73) + (j66 * j75)))) << 1;
        long j78 = (j74 * j73) + (((j68 * j76) + (j69 * j75)) << 1);
        long j79 = (j76 * j73) + (j74 * j75);
        long j81 = (j75 * j76) << 1;
        long j82 = (jC5 - j55) + j59;
        int i33 = ((int) j82) & M26;
        long j83 = ((jC6 - jC2) - jC4) + (j82 >> 26);
        int i34 = ((int) j83) & M25;
        long j84 = ((((j83 >> 25) + j77) - j56) * 38) + j52;
        iArr3[0] = ((int) j84) & M26;
        long j85 = ((j78 - j57) * 38) + j53 + (j84 >> 26);
        iArr3[1] = ((int) j85) & M26;
        long j86 = ((j79 - j58) * 38) + j54 + (j85 >> 26);
        iArr3[2] = ((int) j86) & M25;
        long j87 = ((j81 - j59) * 38) + j55 + (j86 >> 25);
        iArr3[3] = ((int) j87) & M26;
        long jC7 = s.c(jC4, 38L, jC2, j87 >> 26);
        iArr3[4] = ((int) jC7) & M25;
        long j88 = (j63 - j52) + j56 + (jC7 >> 25);
        iArr3[5] = ((int) j88) & M26;
        long j89 = (j67 - j53) + j57 + (j88 >> 26);
        iArr3[6] = ((int) j89) & M26;
        long j90 = (j71 - j54) + j58 + (j89 >> 26);
        iArr3[7] = ((int) j90) & M25;
        long j91 = (j90 >> 25) + ((long) i33);
        iArr3[8] = ((int) j91) & M26;
        iArr3[9] = i34 + ((int) (j91 >> 26));
    }

    public static void negate(int[] iArr, int[] iArr2) {
        for (int i11 = 0; i11 < 10; i11++) {
            iArr2[i11] = -iArr[i11];
        }
    }

    public static void normalize(int[] iArr) {
        int i11 = (iArr[9] >>> 23) & 1;
        reduce(iArr, i11);
        reduce(iArr, -i11);
    }

    public static void one(int[] iArr) {
        iArr[0] = 1;
        for (int i11 = 1; i11 < 10; i11++) {
            iArr[i11] = 0;
        }
    }

    private static void powPm5d8(int[] iArr, int[] iArr2, int[] iArr3) {
        sqr(iArr, iArr2);
        mul(iArr, iArr2, iArr2);
        int[] iArrCreate = create();
        sqr(iArr2, iArrCreate);
        mul(iArr, iArrCreate, iArrCreate);
        sqr(iArrCreate, 2, iArrCreate);
        mul(iArr2, iArrCreate, iArrCreate);
        int[] iArrCreate2 = create();
        sqr(iArrCreate, 5, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate2);
        int[] iArrCreate3 = create();
        sqr(iArrCreate2, 5, iArrCreate3);
        mul(iArrCreate, iArrCreate3, iArrCreate3);
        sqr(iArrCreate3, 10, iArrCreate);
        mul(iArrCreate2, iArrCreate, iArrCreate);
        sqr(iArrCreate, 25, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate2);
        sqr(iArrCreate2, 25, iArrCreate3);
        mul(iArrCreate, iArrCreate3, iArrCreate3);
        sqr(iArrCreate3, 50, iArrCreate);
        mul(iArrCreate2, iArrCreate, iArrCreate);
        sqr(iArrCreate, 125, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate2);
        sqr(iArrCreate2, 2, iArrCreate);
        mul(iArrCreate, iArr, iArr3);
    }

    private static void reduce(int[] iArr, int i11) {
        int i12 = iArr[9];
        int i13 = M24 & i12;
        long j9 = ((long) (((i12 >> 24) + i11) * 19)) + ((long) iArr[0]);
        iArr[0] = ((int) j9) & M26;
        long j11 = (j9 >> 26) + ((long) iArr[1]);
        iArr[1] = ((int) j11) & M26;
        long j12 = (j11 >> 26) + ((long) iArr[2]);
        iArr[2] = ((int) j12) & M25;
        long j13 = (j12 >> 25) + ((long) iArr[3]);
        iArr[3] = ((int) j13) & M26;
        long j14 = (j13 >> 26) + ((long) iArr[4]);
        iArr[4] = ((int) j14) & M25;
        long j15 = (j14 >> 25) + ((long) iArr[5]);
        iArr[5] = ((int) j15) & M26;
        long j16 = (j15 >> 26) + ((long) iArr[6]);
        iArr[6] = ((int) j16) & M26;
        long j17 = (j16 >> 26) + ((long) iArr[7]);
        iArr[7] = M25 & ((int) j17);
        long j18 = (j17 >> 25) + ((long) iArr[8]);
        iArr[8] = M26 & ((int) j18);
        iArr[9] = i13 + ((int) (j18 >> 26));
    }

    public static void sqr(int[] iArr, int[] iArr2) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        int i19 = iArr[8];
        int i21 = iArr[9];
        long j9 = i11;
        long j11 = j9 * j9;
        long j12 = i12 * 2;
        long j13 = j9 * j12;
        long j14 = i13 * 2;
        long j15 = j9 * j14;
        long j16 = i12;
        long j17 = (j16 * j16) + j15;
        long j18 = i14 * 2;
        long j19 = (j9 * j18) + (j12 * j14);
        long j21 = i15 * 2;
        long j22 = (j16 * j18) + (j9 * j21) + (((long) i13) * j14);
        long j23 = (j14 * j18) + (j12 * j21);
        long j24 = j14 * j21;
        long j25 = i14;
        long j26 = (j25 * j25) + j24;
        long j27 = j25 * j21;
        long j28 = i16;
        long j29 = j28 * j28;
        long j31 = i17 * 2;
        long j32 = j28 * j31;
        long j33 = i18 * 2;
        long j34 = j28 * j33;
        long j35 = i17;
        long j36 = (j35 * j35) + j34;
        long j37 = j31 * j33;
        long j38 = i19 * 2;
        long j39 = i21 * 2;
        long j41 = (j35 * j38) + (j28 * j39) + (((long) i18) * j33);
        long j42 = (j33 * j38) + (j31 * j39);
        long j43 = j33 * j39;
        long j44 = i19;
        long j45 = j11 - (j42 * 38);
        long j46 = j13 - (((j44 * j44) + j43) * 38);
        long j47 = j17 - ((j44 * j39) * 38);
        long j48 = j19 - ((((long) i21) * j39) * 38);
        long j49 = j23 - j29;
        long j51 = j26 - j32;
        long j52 = j27 - j36;
        long j53 = (((long) i15) * j21) - ((j28 * j38) + j37);
        int i22 = i12 + i17;
        int i23 = i13 + i18;
        int i24 = i14 + i19;
        int i25 = i15 + i21;
        long j54 = i11 + i16;
        long j55 = i22 * 2;
        long j56 = j54 * j55;
        long j57 = i23 * 2;
        long j58 = i22;
        long j59 = (j58 * j58) + (j54 * j57);
        long j61 = i24 * 2;
        long j62 = i25 * 2;
        long j63 = i24;
        long j64 = ((long) i25) * j62;
        long j65 = (((j54 * j61) + (j55 * j57)) - j48) + j53;
        int i26 = ((int) j65) & M26;
        long j66 = ((((j58 * j61) + ((j54 * j62) + (((long) i23) * j57))) - j22) - j41) + (j65 >> 26);
        int i27 = ((int) j66) & M25;
        long j67 = ((((j66 >> 25) + ((j61 * j57) + (j55 * j62))) - j49) * 38) + j45;
        iArr2[0] = ((int) j67) & M26;
        long j68 = ((((j63 * j63) + (j57 * j62)) - j51) * 38) + j46 + (j67 >> 26);
        iArr2[1] = ((int) j68) & M26;
        long j69 = (((j63 * j62) - j52) * 38) + j47 + (j68 >> 26);
        iArr2[2] = ((int) j69) & M25;
        long j71 = ((j64 - j53) * 38) + j48 + (j69 >> 25);
        iArr2[3] = ((int) j71) & M26;
        long jC = s.c(j41, 38L, j22, j71 >> 26);
        iArr2[4] = ((int) jC) & M25;
        long j72 = ((j54 * j54) - j45) + j49 + (jC >> 25);
        iArr2[5] = ((int) j72) & M26;
        long j73 = (j56 - j46) + j51 + (j72 >> 26);
        iArr2[6] = ((int) j73) & M26;
        long j74 = (j59 - j47) + j52 + (j73 >> 26);
        iArr2[7] = ((int) j74) & M25;
        long j75 = (j74 >> 25) + ((long) i26);
        iArr2[8] = ((int) j75) & M26;
        iArr2[9] = i27 + ((int) (j75 >> 26));
    }

    public static boolean sqrtRatioVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreate = create();
        int[] iArrCreate2 = create();
        mul(iArr, iArr2, iArrCreate);
        sqr(iArr2, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate);
        sqr(iArrCreate2, iArrCreate2);
        mul(iArrCreate2, iArrCreate, iArrCreate2);
        int[] iArrCreate3 = create();
        int[] iArrCreate4 = create();
        powPm5d8(iArrCreate2, iArrCreate3, iArrCreate4);
        mul(iArrCreate4, iArrCreate, iArrCreate4);
        int[] iArrCreate5 = create();
        sqr(iArrCreate4, iArrCreate5);
        mul(iArrCreate5, iArr2, iArrCreate5);
        sub(iArrCreate5, iArr, iArrCreate3);
        normalize(iArrCreate3);
        if (isZeroVar(iArrCreate3)) {
            copy(iArrCreate4, 0, iArr3, 0);
            return true;
        }
        add(iArrCreate5, iArr, iArrCreate3);
        normalize(iArrCreate3);
        if (!isZeroVar(iArrCreate3)) {
            return false;
        }
        mul(iArrCreate4, ROOT_NEG_ONE, iArr3);
        return true;
    }

    public static void sub(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i11 = 0; i11 < 10; i11++) {
            iArr3[i11] = iArr[i11] - iArr2[i11];
        }
    }

    public static void subOne(int[] iArr) {
        iArr[0] = iArr[0] - 1;
    }

    public static void zero(int[] iArr) {
        for (int i11 = 0; i11 < 10; i11++) {
            iArr[i11] = 0;
        }
    }

    public static void mul(int[] iArr, int i11, int[] iArr2) {
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        int i16 = iArr[4];
        int i17 = iArr[5];
        int i18 = iArr[6];
        int i19 = iArr[7];
        int i21 = iArr[8];
        int i22 = iArr[9];
        long j9 = i11;
        long j11 = ((long) i14) * j9;
        int i23 = ((int) j11) & M25;
        long j12 = j11 >> 25;
        long j13 = ((long) i16) * j9;
        int i24 = ((int) j13) & M25;
        long j14 = ((long) i19) * j9;
        int i25 = ((int) j14) & M25;
        long j15 = ((long) i22) * j9;
        int i26 = ((int) j15) & M25;
        long j16 = (((long) i12) * j9) + ((j15 >> 25) * 38);
        iArr2[0] = ((int) j16) & M26;
        long j17 = (((long) i17) * j9) + (j13 >> 25);
        iArr2[5] = ((int) j17) & M26;
        long j18 = (((long) i13) * j9) + (j16 >> 26);
        iArr2[1] = ((int) j18) & M26;
        long j19 = (((long) i15) * j9) + j12;
        iArr2[3] = ((int) j19) & M26;
        long j21 = (((long) i18) * j9) + (j17 >> 26);
        iArr2[6] = ((int) j21) & M26;
        long j22 = (((long) i21) * j9) + (j14 >> 25);
        iArr2[8] = ((int) j22) & M26;
        iArr2[2] = i23 + ((int) (j18 >> 26));
        iArr2[4] = i24 + ((int) (j19 >> 26));
        iArr2[7] = i25 + ((int) (j21 >> 26));
        iArr2[9] = i26 + ((int) (j22 >> 26));
    }

    public static void addOne(int[] iArr, int i11) {
        iArr[i11] = iArr[i11] + 1;
    }

    public static void encode(int[] iArr, byte[] bArr) {
        encode128(iArr, 0, bArr, 0);
        encode128(iArr, 5, bArr, 16);
    }

    public static void encode(int[] iArr, byte[] bArr, int i11) {
        encode128(iArr, 0, bArr, i11);
        encode128(iArr, 5, bArr, i11 + 16);
    }

    public static void encode(int[] iArr, int[] iArr2, int i11) {
        encode128(iArr, 0, iArr2, i11);
        encode128(iArr, 5, iArr2, i11 + 4);
    }

    public static void decode(byte[] bArr, int i11, int[] iArr, int i12) {
        decode128(bArr, i11, iArr, i12);
        decode128(bArr, i11 + 16, iArr, i12 + 5);
        int i13 = i12 + 9;
        iArr[i13] = iArr[i13] & M24;
    }

    public static void decode(byte[] bArr, int[] iArr) {
        decode128(bArr, 0, iArr, 0);
        decode128(bArr, 16, iArr, 5);
        iArr[9] = iArr[9] & M24;
    }

    public static void decode(int[] iArr, int i11, int[] iArr2) {
        decode128(iArr, i11, iArr2, 0);
        decode128(iArr, i11 + 4, iArr2, 5);
        iArr2[9] = iArr2[9] & M24;
    }

    private static void encode128(int[] iArr, int i11, int[] iArr2, int i12) {
        int i13 = iArr[i11];
        int i14 = iArr[i11 + 1];
        int i15 = iArr[i11 + 2];
        int i16 = iArr[i11 + 3];
        int i17 = iArr[i11 + 4];
        iArr2[i12] = (i14 << 26) | i13;
        iArr2[i12 + 1] = (i14 >>> 6) | (i15 << 20);
        iArr2[i12 + 2] = (i15 >>> 12) | (i16 << 13);
        iArr2[i12 + 3] = (i17 << 7) | (i16 >>> 19);
    }

    private static void decode128(int[] iArr, int i11, int[] iArr2, int i12) {
        int i13 = iArr[i11];
        int i14 = iArr[i11 + 1];
        int i15 = iArr[i11 + 2];
        int i16 = iArr[i11 + 3];
        iArr2[i12] = i13 & M26;
        iArr2[i12 + 1] = ((i13 >>> 26) | (i14 << 6)) & M26;
        iArr2[i12 + 2] = ((i14 >>> 20) | (i15 << 12)) & M25;
        iArr2[i12 + 3] = M26 & ((i16 << 19) | (i15 >>> 13));
        iArr2[i12 + 4] = i16 >>> 7;
    }

    public static void sqr(int[] iArr, int i11, int[] iArr2) {
        sqr(iArr, iArr2);
        while (true) {
            i11--;
            if (i11 <= 0) {
                return;
            } else {
                sqr(iArr2, iArr2);
            }
        }
    }
}
