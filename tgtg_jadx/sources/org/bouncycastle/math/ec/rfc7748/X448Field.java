package org.bouncycastle.math.ec.rfc7748;

import com.app.tgtg.model.local.AppConstants;
import org.bouncycastle.math.raw.Mod;

/* JADX INFO: loaded from: classes3.dex */
public abstract class X448Field {
    private static final int M28 = 268435455;
    private static final int[] P32 = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
    public static final int SIZE = 16;
    private static final long U32 = 4294967295L;

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i11 = 0; i11 < 16; i11++) {
            iArr3[i11] = iArr[i11] + iArr2[i11];
        }
    }

    public static void addOne(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static int areEqual(int[] iArr, int[] iArr2) {
        int i11 = 0;
        for (int i12 = 0; i12 < 16; i12++) {
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
        int i22 = iArr[10];
        int i23 = iArr[11];
        int i24 = iArr[12];
        int i25 = iArr[13];
        int i26 = iArr[14];
        int i27 = iArr[15];
        int i28 = i12 + (i11 >>> 28);
        int i29 = i11 & M28;
        int i31 = i16 + (i15 >>> 28);
        int i32 = i15 & M28;
        int i33 = i21 + (i19 >>> 28);
        int i34 = i19 & M28;
        int i35 = i25 + (i24 >>> 28);
        int i36 = i24 & M28;
        int i37 = i13 + (i28 >>> 28);
        int i38 = i28 & M28;
        int i39 = i17 + (i31 >>> 28);
        int i41 = i31 & M28;
        int i42 = i22 + (i33 >>> 28);
        int i43 = i33 & M28;
        int i44 = i26 + (i35 >>> 28);
        int i45 = i35 & M28;
        int i46 = i14 + (i37 >>> 28);
        int i47 = i37 & M28;
        int i48 = i18 + (i39 >>> 28);
        int i49 = i39 & M28;
        int i51 = i23 + (i42 >>> 28);
        int i52 = i42 & M28;
        int i53 = i27 + (i44 >>> 28);
        int i54 = i44 & M28;
        int i55 = i53 >>> 28;
        int i56 = i53 & M28;
        int i57 = i29 + i55;
        int i58 = i32 + (i46 >>> 28);
        int i59 = i46 & M28;
        int i61 = i34 + i55 + (i48 >>> 28);
        int i62 = i48 & M28;
        int i63 = i36 + (i51 >>> 28);
        int i64 = i51 & M28;
        int i65 = i38 + (i57 >>> 28);
        int i66 = i57 & M28;
        int i67 = i41 + (i58 >>> 28);
        int i68 = i58 & M28;
        int i69 = i43 + (i61 >>> 28);
        int i71 = i61 & M28;
        int i72 = i45 + (i63 >>> 28);
        int i73 = i63 & M28;
        iArr[0] = i66;
        iArr[1] = i65;
        iArr[2] = i47;
        iArr[3] = i59;
        iArr[4] = i68;
        iArr[5] = i67;
        iArr[6] = i49;
        iArr[7] = i62;
        iArr[8] = i71;
        iArr[9] = i69;
        iArr[10] = i52;
        iArr[11] = i64;
        iArr[12] = i73;
        iArr[13] = i72;
        iArr[14] = i54;
        iArr[15] = i56;
    }

    public static void cmov(int i11, int[] iArr, int i12, int[] iArr2, int i13) {
        for (int i14 = 0; i14 < 16; i14++) {
            int i15 = i13 + i14;
            int i16 = iArr2[i15];
            iArr2[i15] = i16 ^ ((iArr[i12 + i14] ^ i16) & i11);
        }
    }

    public static void cnegate(int i11, int[] iArr) {
        int[] iArrCreate = create();
        sub(iArrCreate, iArr, iArrCreate);
        cmov(-i11, iArrCreate, 0, iArr, 0);
    }

    public static void copy(int[] iArr, int i11, int[] iArr2, int i12) {
        for (int i13 = 0; i13 < 16; i13++) {
            iArr2[i12 + i13] = iArr[i11 + i13];
        }
    }

    public static int[] create() {
        return new int[16];
    }

    public static int[] createTable(int i11) {
        return new int[i11 * 16];
    }

    public static void cswap(int i11, int[] iArr, int[] iArr2) {
        int i12 = 0 - i11;
        for (int i13 = 0; i13 < 16; i13++) {
            int i14 = iArr[i13];
            int i15 = iArr2[i13];
            int i16 = (i14 ^ i15) & i12;
            iArr[i13] = i14 ^ i16;
            iArr2[i13] = i15 ^ i16;
        }
    }

    public static void decode(byte[] bArr, int i11, int[] iArr, int i12) {
        decode56(bArr, i11, iArr, i12);
        decode56(bArr, i11 + 7, iArr, i12 + 2);
        decode56(bArr, i11 + 14, iArr, i12 + 4);
        decode56(bArr, i11 + 21, iArr, i12 + 6);
        decode56(bArr, i11 + 28, iArr, i12 + 8);
        decode56(bArr, i11 + 35, iArr, i12 + 10);
        decode56(bArr, i11 + 42, iArr, i12 + 12);
        decode56(bArr, i11 + 49, iArr, i12 + 14);
    }

    private static void decode224(int[] iArr, int i11, int[] iArr2, int i12) {
        int i13 = iArr[i11];
        int i14 = iArr[i11 + 1];
        int i15 = iArr[i11 + 2];
        int i16 = iArr[i11 + 3];
        int i17 = iArr[i11 + 4];
        int i18 = iArr[i11 + 5];
        int i19 = iArr[i11 + 6];
        iArr2[i12] = i13 & M28;
        iArr2[i12 + 1] = ((i13 >>> 28) | (i14 << 4)) & M28;
        iArr2[i12 + 2] = ((i14 >>> 24) | (i15 << 8)) & M28;
        iArr2[i12 + 3] = ((i15 >>> 20) | (i16 << 12)) & M28;
        iArr2[i12 + 4] = ((i16 >>> 16) | (i17 << 16)) & M28;
        iArr2[i12 + 5] = ((i17 >>> 12) | (i18 << 20)) & M28;
        iArr2[i12 + 6] = M28 & ((i18 >>> 8) | (i19 << 24));
        iArr2[i12 + 7] = i19 >>> 4;
    }

    private static int decode24(byte[] bArr, int i11) {
        return ((bArr[i11 + 2] & 255) << 16) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8);
    }

    private static int decode32(byte[] bArr, int i11) {
        return (bArr[i11 + 3] << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    private static void decode56(byte[] bArr, int i11, int[] iArr, int i12) {
        int iDecode32 = decode32(bArr, i11);
        int iDecode24 = decode24(bArr, i11 + 4);
        iArr[i12] = M28 & iDecode32;
        iArr[i12 + 1] = (iDecode24 << 4) | (iDecode32 >>> 28);
    }

    public static void encode(int[] iArr, int i11, byte[] bArr, int i12) {
        encode56(iArr, i11, bArr, i12);
        encode56(iArr, i11 + 2, bArr, i12 + 7);
        encode56(iArr, i11 + 4, bArr, i12 + 14);
        encode56(iArr, i11 + 6, bArr, i12 + 21);
        encode56(iArr, i11 + 8, bArr, i12 + 28);
        encode56(iArr, i11 + 10, bArr, i12 + 35);
        encode56(iArr, i11 + 12, bArr, i12 + 42);
        encode56(iArr, i11 + 14, bArr, i12 + 49);
    }

    private static void encode224(int[] iArr, int i11, int[] iArr2, int i12) {
        int i13 = iArr[i11];
        int i14 = iArr[i11 + 1];
        int i15 = iArr[i11 + 2];
        int i16 = iArr[i11 + 3];
        int i17 = iArr[i11 + 4];
        int i18 = iArr[i11 + 5];
        int i19 = iArr[i11 + 6];
        int i21 = iArr[i11 + 7];
        iArr2[i12] = (i14 << 28) | i13;
        iArr2[i12 + 1] = (i14 >>> 4) | (i15 << 24);
        iArr2[i12 + 2] = (i15 >>> 8) | (i16 << 20);
        iArr2[i12 + 3] = (i16 >>> 12) | (i17 << 16);
        iArr2[i12 + 4] = (i17 >>> 16) | (i18 << 12);
        iArr2[i12 + 5] = (i18 >>> 20) | (i19 << 8);
        iArr2[i12 + 6] = (i21 << 4) | (i19 >>> 24);
    }

    private static void encode24(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12 + 2] = (byte) (i11 >>> 16);
    }

    private static void encode32(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12 + 2] = (byte) (i11 >>> 16);
        bArr[i12 + 3] = (byte) (i11 >>> 24);
    }

    private static void encode56(int[] iArr, int i11, byte[] bArr, int i12) {
        int i13 = iArr[i11];
        int i14 = iArr[i11 + 1];
        encode32((i14 << 28) | i13, bArr, i12);
        encode24(i14 >>> 4, bArr, i12 + 4);
    }

    public static void inv(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        int[] iArr3 = new int[14];
        copy(iArr, 0, iArrCreate, 0);
        normalize(iArrCreate);
        encode(iArrCreate, iArr3, 0);
        Mod.modOddInverse(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static void invVar(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        int[] iArr3 = new int[14];
        copy(iArr, 0, iArrCreate, 0);
        normalize(iArrCreate);
        encode(iArrCreate, iArr3, 0);
        Mod.modOddInverseVar(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static int isOne(int[] iArr) {
        int i11 = iArr[0] ^ 1;
        for (int i12 = 1; i12 < 16; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static boolean isOneVar(int[] iArr) {
        return isOne(iArr) != 0;
    }

    public static int isZero(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static boolean isZeroVar(int[] iArr) {
        return isZero(iArr) != 0;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
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
        int i22 = iArr[10];
        int i23 = iArr[11];
        int i24 = iArr[12];
        int i25 = iArr[13];
        int i26 = iArr[14];
        int i27 = iArr[15];
        int i28 = iArr2[0];
        int i29 = iArr2[1];
        int i31 = iArr2[2];
        int i32 = iArr2[3];
        int i33 = iArr2[4];
        int i34 = iArr2[5];
        int i35 = iArr2[6];
        int i36 = iArr2[7];
        int i37 = iArr2[8];
        int i38 = iArr2[9];
        int i39 = iArr2[10];
        int i41 = iArr2[11];
        int i42 = iArr2[12];
        int i43 = iArr2[13];
        int i44 = iArr2[14];
        int i45 = iArr2[15];
        int i46 = i11 + i19;
        int i47 = i12 + i21;
        int i48 = i13 + i22;
        int i49 = i14 + i23;
        int i51 = i15 + i24;
        int i52 = i16 + i25;
        int i53 = i17 + i26;
        int i54 = i18 + i27;
        int i55 = i28 + i37;
        int i56 = i29 + i38;
        int i57 = i31 + i39;
        int i58 = i32 + i41;
        int i59 = i33 + i42;
        int i61 = i34 + i43;
        int i62 = i35 + i44;
        int i63 = i36 + i45;
        long j9 = i11;
        long j11 = i28;
        long j12 = j9 * j11;
        long j13 = i18;
        long j14 = i29;
        long j15 = j13 * j14;
        long j16 = i17;
        long j17 = i31;
        long j18 = (j16 * j17) + j15;
        long j19 = i16;
        long j21 = i32;
        long j22 = i15;
        long j23 = i33;
        long j24 = i14;
        long j25 = i34;
        long j26 = (j24 * j25) + (j22 * j23) + (j19 * j21) + j18;
        long j27 = i13;
        long j28 = i35;
        long j29 = i12;
        long j31 = i36;
        long j32 = j29 * j31;
        long j33 = i19;
        long j34 = i37;
        long j35 = j33 * j34;
        long j36 = i27;
        long j37 = i38;
        long j38 = j36 * j37;
        long j39 = i26;
        long j41 = i39;
        long j42 = (j39 * j41) + j38;
        long j43 = i25;
        long j44 = i41;
        long j45 = (j43 * j44) + j42;
        long j46 = i24;
        long j47 = i42;
        long j48 = (j46 * j47) + j45;
        long j49 = i23;
        long j51 = i43;
        long j52 = (j49 * j51) + j48;
        long j53 = i22;
        long j54 = i44;
        long j55 = (j53 * j54) + j52;
        long j56 = i21;
        long j57 = i45;
        long j58 = (j56 * j57) + j55;
        long j59 = i46;
        long j61 = i55;
        long j62 = j59 * j61;
        long j63 = i54;
        long j64 = i56;
        long j65 = j63 * j64;
        long j66 = i53;
        long j67 = i57;
        long j68 = (j66 * j67) + j65;
        long j69 = i52;
        long j71 = i58;
        long j72 = (j69 * j71) + j68;
        long j73 = i51;
        long j74 = i59;
        long j75 = (j73 * j74) + j72;
        long j76 = i49;
        long j77 = i61;
        long j78 = (j76 * j77) + j75;
        long j79 = i48;
        long j81 = i62;
        long j82 = (j79 * j81) + j78;
        long j83 = i47;
        long j84 = i63;
        long j85 = (j83 * j84) + j82;
        long j86 = ((j12 + j35) + j85) - (j32 + ((j27 * j28) + j26));
        int i64 = ((int) j86) & M28;
        long j87 = ((j58 + j62) - j12) + j85;
        int i65 = ((int) j87) & M28;
        long j88 = j87 >>> 28;
        long j89 = (j9 * j14) + (j29 * j11);
        long j90 = (j53 * j57) + (j49 * j54) + (j46 * j51) + (j43 * j47) + (j39 * j44) + (j36 * j41);
        long j91 = (j59 * j64) + (j83 * j61);
        long j92 = (j79 * j84) + (j76 * j81) + (j73 * j77) + (j69 * j74) + (j66 * j71) + (j63 * j67);
        long j93 = (((j89 + ((j33 * j37) + (j56 * j34))) + j92) - ((j27 * j31) + ((j24 * j28) + ((j22 * j25) + ((j19 * j23) + ((j16 * j21) + (j13 * j17))))))) + (j86 >>> 28);
        int i66 = ((int) j93) & M28;
        long j94 = j93 >>> 28;
        long j95 = ((j90 + j91) - j89) + j92 + j88;
        int i67 = ((int) j95) & M28;
        long j96 = j95 >>> 28;
        long j97 = (j9 * j17) + (j29 * j14) + (j27 * j11);
        long j98 = (j49 * j57) + (j46 * j54) + (j43 * j51) + (j39 * j47) + (j36 * j44);
        long j99 = (j59 * j67) + (j83 * j64) + (j79 * j61);
        long j100 = (j76 * j84) + (j73 * j81) + (j69 * j77) + (j66 * j74) + (j63 * j71);
        long j101 = (((j97 + ((j33 * j41) + ((j56 * j37) + (j53 * j34)))) + j100) - ((j24 * j31) + ((j22 * j28) + ((j19 * j25) + ((j16 * j23) + (j13 * j21)))))) + j94;
        int i68 = ((int) j101) & M28;
        long j102 = j101 >>> 28;
        long j103 = ((j98 + j99) - j97) + j100 + j96;
        int i69 = ((int) j103) & M28;
        long j104 = j103 >>> 28;
        long j105 = (j9 * j21) + (j29 * j17) + (j27 * j14) + (j24 * j11);
        long j106 = (j46 * j57) + (j43 * j54) + (j39 * j51) + (j36 * j47);
        long j107 = (j59 * j71) + (j83 * j67) + (j79 * j64) + (j76 * j61);
        long j108 = (j73 * j84) + (j69 * j81) + (j66 * j77) + (j63 * j74);
        long j109 = (((j105 + ((j33 * j44) + ((j56 * j41) + ((j53 * j37) + (j49 * j34))))) + j108) - ((j22 * j31) + ((j19 * j28) + ((j16 * j25) + (j13 * j23))))) + j102;
        int i71 = ((int) j109) & M28;
        long j110 = j109 >>> 28;
        long j111 = ((j106 + j107) - j105) + j108 + j104;
        int i72 = ((int) j111) & M28;
        long j112 = j111 >>> 28;
        long j113 = (j9 * j23) + (j29 * j21) + (j27 * j17) + (j24 * j14) + (j22 * j11);
        long j114 = (j43 * j57) + (j39 * j54) + (j36 * j51);
        long j115 = (j59 * j74) + (j83 * j71) + (j79 * j67) + (j76 * j64) + (j73 * j61);
        long j116 = (j69 * j84) + (j66 * j81) + (j63 * j77);
        long j117 = (((j113 + ((j33 * j47) + ((j56 * j44) + ((j53 * j41) + ((j49 * j37) + (j46 * j34)))))) + j116) - ((j19 * j31) + ((j16 * j28) + (j13 * j25)))) + j110;
        int i73 = ((int) j117) & M28;
        long j118 = j117 >>> 28;
        long j119 = ((j114 + j115) - j113) + j116 + j112;
        int i74 = ((int) j119) & M28;
        long j120 = j119 >>> 28;
        long j121 = (j9 * j25) + (j29 * j23) + (j27 * j21) + (j24 * j17) + (j22 * j14) + (j19 * j11);
        long j122 = (j39 * j57) + (j36 * j54);
        long j123 = (j59 * j77) + (j83 * j74) + (j79 * j71) + (j76 * j67) + (j73 * j64) + (j69 * j61);
        long j124 = (j66 * j84) + (j63 * j81);
        long j125 = (((j121 + ((j33 * j51) + ((j56 * j47) + ((j53 * j44) + ((j49 * j41) + ((j46 * j37) + (j43 * j34))))))) + j124) - ((j16 * j31) + (j13 * j28))) + j118;
        int i75 = ((int) j125) & M28;
        long j126 = j125 >>> 28;
        long j127 = ((j122 + j123) - j121) + j124 + j120;
        int i76 = ((int) j127) & M28;
        long j128 = j127 >>> 28;
        long j129 = (j9 * j28) + (j29 * j25) + (j27 * j23) + (j24 * j21) + (j22 * j17) + (j19 * j14) + (j16 * j11);
        long j130 = j36 * j57;
        long j131 = (j59 * j81) + (j83 * j77) + (j79 * j74) + (j76 * j71) + (j73 * j67) + (j69 * j64) + (j66 * j61);
        long j132 = j63 * j84;
        long j133 = (((j129 + ((j33 * j54) + ((j56 * j51) + ((j53 * j47) + ((j49 * j44) + ((j46 * j41) + ((j43 * j37) + (j39 * j34)))))))) + j132) - (j13 * j31)) + j126;
        int i77 = ((int) j133) & M28;
        long j134 = j133 >>> 28;
        long j135 = ((j130 + j131) - j129) + j132 + j128;
        int i78 = ((int) j135) & M28;
        long j136 = j24 * j23;
        long j137 = (j9 * j31) + (j29 * j28) + (j27 * j25) + j136 + (j22 * j21) + (j19 * j17) + (j16 * j14) + (j11 * j13);
        long j138 = (j33 * j57) + (j56 * j54) + (j53 * j51) + (j49 * j47) + (j46 * j44) + (j43 * j41) + (j39 * j37) + (j36 * j34) + j137 + j134;
        int i79 = ((int) j138) & M28;
        long j139 = (((j59 * j84) + ((j83 * j81) + ((j79 * j77) + ((j76 * j74) + ((j73 * j71) + ((j69 * j67) + ((j66 * j64) + (j63 * j61)))))))) - j137) + (j135 >>> 28);
        int i81 = ((int) j139) & M28;
        long j140 = j139 >>> 28;
        long j141 = (j138 >>> 28) + j140 + ((long) i65);
        int i82 = ((int) j141) & M28;
        long j142 = j140 + ((long) i64);
        iArr3[0] = ((int) j142) & M28;
        iArr3[1] = i66 + ((int) (j142 >>> 28));
        iArr3[2] = i68;
        iArr3[3] = i71;
        iArr3[4] = i73;
        iArr3[5] = i75;
        iArr3[6] = i77;
        iArr3[7] = i79;
        iArr3[8] = i82;
        iArr3[9] = i67 + ((int) (j141 >>> 28));
        iArr3[10] = i69;
        iArr3[11] = i72;
        iArr3[12] = i74;
        iArr3[13] = i76;
        iArr3[14] = i78;
        iArr3[15] = i81;
    }

    public static void negate(int[] iArr, int[] iArr2) {
        sub(create(), iArr, iArr2);
    }

    public static void normalize(int[] iArr) {
        reduce(iArr, 1);
        reduce(iArr, -1);
    }

    public static void one(int[] iArr) {
        iArr[0] = 1;
        for (int i11 = 1; i11 < 16; i11++) {
            iArr[i11] = 0;
        }
    }

    private static void powPm3d4(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        sqr(iArr, iArrCreate);
        mul(iArr, iArrCreate, iArrCreate);
        int[] iArrCreate2 = create();
        sqr(iArrCreate, iArrCreate2);
        mul(iArr, iArrCreate2, iArrCreate2);
        int[] iArrCreate3 = create();
        sqr(iArrCreate2, 3, iArrCreate3);
        mul(iArrCreate2, iArrCreate3, iArrCreate3);
        int[] iArrCreate4 = create();
        sqr(iArrCreate3, 3, iArrCreate4);
        mul(iArrCreate2, iArrCreate4, iArrCreate4);
        int[] iArrCreate5 = create();
        sqr(iArrCreate4, 9, iArrCreate5);
        mul(iArrCreate4, iArrCreate5, iArrCreate5);
        int[] iArrCreate6 = create();
        sqr(iArrCreate5, iArrCreate6);
        mul(iArr, iArrCreate6, iArrCreate6);
        int[] iArrCreate7 = create();
        sqr(iArrCreate6, 18, iArrCreate7);
        mul(iArrCreate5, iArrCreate7, iArrCreate7);
        int[] iArrCreate8 = create();
        sqr(iArrCreate7, 37, iArrCreate8);
        mul(iArrCreate7, iArrCreate8, iArrCreate8);
        int[] iArrCreate9 = create();
        sqr(iArrCreate8, 37, iArrCreate9);
        mul(iArrCreate7, iArrCreate9, iArrCreate9);
        int[] iArrCreate10 = create();
        sqr(iArrCreate9, 111, iArrCreate10);
        mul(iArrCreate9, iArrCreate10, iArrCreate10);
        int[] iArrCreate11 = create();
        sqr(iArrCreate10, iArrCreate11);
        mul(iArr, iArrCreate11, iArrCreate11);
        int[] iArrCreate12 = create();
        sqr(iArrCreate11, AppConstants.GO_TO_GPS_SETTINGS, iArrCreate12);
        mul(iArrCreate12, iArrCreate10, iArr2);
    }

    private static void reduce(int[] iArr, int i11) {
        int i12;
        int i13 = iArr[15];
        int i14 = i13 & M28;
        long j9 = (i13 >>> 28) + i11;
        int i15 = 0;
        long j11 = j9;
        while (true) {
            if (i15 >= 8) {
                break;
            }
            long j12 = j11 + (U32 & ((long) iArr[i15]));
            iArr[i15] = ((int) j12) & M28;
            j11 = j12 >> 28;
            i15++;
        }
        long j13 = j11 + j9;
        for (i12 = 8; i12 < 15; i12++) {
            long j14 = j13 + (((long) iArr[i12]) & U32);
            iArr[i12] = ((int) j14) & M28;
            j13 = j14 >> 28;
        }
        iArr[15] = i14 + ((int) j13);
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
        int i22 = iArr[10];
        int i23 = iArr[11];
        int i24 = iArr[12];
        int i25 = iArr[13];
        int i26 = iArr[14];
        int i27 = iArr[15];
        int i28 = i11 * 2;
        int i29 = i12 * 2;
        int i31 = i15 * 2;
        int i32 = i16 * 2;
        int i33 = i17 * 2;
        int i34 = i19 * 2;
        int i35 = i22 * 2;
        int i36 = i23 * 2;
        int i37 = i24 * 2;
        int i38 = i11 + i19;
        int i39 = i12 + i21;
        int i41 = i13 + i22;
        int i42 = i14 + i23;
        int i43 = i15 + i24;
        int i44 = i16 + i25;
        int i45 = i17 + i26;
        int i46 = i38 * 2;
        int i47 = i39 * 2;
        int i48 = i41 * 2;
        int i49 = i42 * 2;
        long j9 = i11;
        long j11 = j9 * j9;
        long j12 = i18;
        long j13 = i29;
        long j14 = j12 * j13;
        long j15 = i17;
        long j16 = i13 * 2;
        long j17 = (j15 * j16) + j14;
        long j18 = i16;
        long j19 = i14 * 2;
        long j21 = (j18 * j19) + j17;
        long j22 = i15;
        long j23 = i19;
        long j24 = j23 * j23;
        long j25 = i27;
        long j26 = i21 * 2;
        long j27 = i26;
        long j28 = i35;
        long j29 = (j27 * j28) + (j25 * j26);
        long j31 = i25;
        long j32 = i36;
        long j33 = i24;
        long j34 = j33 * j33;
        long j35 = i38;
        long j36 = j35 * j35;
        long j37 = i18 + i27;
        long j38 = ((long) i47) & U32;
        long j39 = j37 * j38;
        long j41 = i45;
        long j42 = ((long) i48) & U32;
        long j43 = (j41 * j42) + j39;
        long j44 = i44;
        long j45 = ((long) i49) & U32;
        long j46 = (j44 * j45) + j43;
        long j47 = i43;
        long j48 = (j47 * j47) + j46;
        long j49 = ((j11 + j24) + j48) - ((j22 * j22) + j21);
        int i51 = ((int) j49) & M28;
        long j51 = j49 >>> 28;
        long j52 = (((j34 + ((j31 * j32) + j29)) + j36) - j11) + j48;
        int i52 = ((int) j52) & M28;
        long j53 = j52 >>> 28;
        long j54 = i12;
        long j55 = i28;
        long j56 = j54 * j55;
        long j57 = i31;
        long j58 = j18 * j57;
        long j59 = i21;
        long j61 = i34;
        long j62 = j59 * j61;
        long j63 = i37;
        long j64 = j31 * j63;
        long j65 = i39;
        long j66 = ((long) i46) & U32;
        long j67 = j65 * j66;
        long j68 = (j41 * j45) + (j37 * j42);
        long j69 = ((long) (i43 * 2)) & U32;
        long j71 = (j44 * j69) + j68;
        long j72 = (((j56 + j62) + j71) - (j58 + ((j15 * j19) + (j12 * j16)))) + j51;
        int i53 = ((int) j72) & M28;
        long j73 = j72 >>> 28;
        long j74 = (((j64 + ((j27 * j32) + (j25 * j28))) + j67) - j56) + j71 + j53;
        int i54 = ((int) j74) & M28;
        long j75 = j74 >>> 28;
        long j76 = i13;
        long j77 = (j54 * j54) + (j76 * j55);
        long j78 = (j15 * j57) + (j12 * j19);
        long j79 = i22;
        long j81 = (j59 * j59) + (j79 * j61);
        long j82 = (j27 * j63) + (j25 * j32);
        long j83 = i41;
        long j84 = (j65 * j65) + (j83 * j66);
        long j85 = (j44 * j44) + (j41 * j69) + (j37 * j45);
        long j86 = (((j77 + j81) + j85) - ((j18 * j18) + j78)) + j73;
        int i55 = ((int) j86) & M28;
        long j87 = j86 >>> 28;
        long j88 = ((((j31 * j31) + j82) + j84) - j77) + j85 + j75;
        int i56 = ((int) j88) & M28;
        long j89 = j88 >>> 28;
        long j90 = i14;
        long j91 = (j76 * j13) + (j90 * j55);
        long j92 = j12 * j57;
        long j93 = i32;
        long j94 = (j15 * j93) + j92;
        long j95 = i23;
        long j96 = (j79 * j26) + (j95 * j61);
        long j97 = j25 * j63;
        long j98 = i25 * 2;
        long j99 = (j27 * j98) + j97;
        long j100 = i42;
        long j101 = (j83 * j38) + (j100 * j66);
        long j102 = j69 * j37;
        long j103 = ((long) (i44 * 2)) & U32;
        long j104 = (j41 * j103) + j102;
        long j105 = (((j91 + j96) + j104) - j94) + j87;
        int i57 = ((int) j105) & M28;
        long j106 = j105 >>> 28;
        long j107 = ((j99 + j101) - j91) + j104 + j89;
        int i58 = ((int) j107) & M28;
        long j108 = j107 >>> 28;
        long j109 = (j76 * j76) + (j90 * j13) + (j22 * j55);
        long j110 = (j27 * j27) + (j98 * j25);
        long j111 = (j83 * j83) + (j100 * j38) + (j47 * j66);
        long j112 = (j41 * j41) + (j37 * j103);
        long j113 = (((j109 + ((j79 * j79) + ((j95 * j26) + (j33 * j61)))) + j112) - ((j15 * j15) + (j12 * j93))) + j106;
        int i59 = ((int) j113) & M28;
        long j114 = j113 >>> 28;
        long j115 = ((j110 + j111) - j109) + j112 + j108;
        int i61 = ((int) j115) & M28;
        long j116 = j115 >>> 28;
        long j117 = (j90 * j16) + (j22 * j13) + (j18 * j55);
        long j118 = (j95 * j28) + (j33 * j26) + (j31 * j61);
        long j119 = (j100 * j42) + (j47 * j38) + (j44 * j66);
        long j120 = (((long) (i45 * 2)) & U32) * j37;
        long j121 = (((j117 + j118) + j120) - (((long) i33) * j12)) + j114;
        int i62 = ((int) j121) & M28;
        long j122 = j121 >>> 28;
        long j123 = (((((long) (i26 * 2)) * j25) + j119) - j117) + j120 + j116;
        int i63 = ((int) j123) & M28;
        long j124 = j123 >>> 28;
        long j125 = (j90 * j90) + (j22 * j16) + (j18 * j13) + (j15 * j55);
        long j126 = (j100 * j100) + (j47 * j42) + (j44 * j38) + (j41 * j66);
        long j127 = j37 * j37;
        long j128 = (((j125 + ((j95 * j95) + ((j33 * j28) + ((j31 * j26) + (j27 * j61))))) + j127) - (j12 * j12)) + j122;
        int i64 = ((int) j128) & M28;
        long j129 = j128 >>> 28;
        long j130 = (((j25 * j25) + j126) - j125) + j127 + j124;
        int i65 = ((int) j130) & M28;
        long j131 = (j19 * j22) + (j18 * j16) + (j15 * j13) + (j12 * j55);
        long j132 = j31 * j28;
        long j133 = (j33 * j32) + j132 + (j27 * j26) + (j25 * j61);
        long j134 = j133 + j131 + j129;
        int i66 = ((int) j134) & M28;
        long j135 = (((j47 * j45) + ((j44 * j42) + ((j41 * j38) + (j37 * j66)))) - j131) + (j130 >>> 28);
        int i67 = ((int) j135) & M28;
        long j136 = j135 >>> 28;
        long j137 = (j134 >>> 28) + j136 + ((long) i52);
        int i68 = ((int) j137) & M28;
        long j138 = j136 + ((long) i51);
        iArr2[0] = ((int) j138) & M28;
        iArr2[1] = i53 + ((int) (j138 >>> 28));
        iArr2[2] = i55;
        iArr2[3] = i57;
        iArr2[4] = i59;
        iArr2[5] = i62;
        iArr2[6] = i64;
        iArr2[7] = i66;
        iArr2[8] = i68;
        iArr2[9] = i54 + ((int) (j137 >>> 28));
        iArr2[10] = i56;
        iArr2[11] = i58;
        iArr2[12] = i61;
        iArr2[13] = i63;
        iArr2[14] = i65;
        iArr2[15] = i67;
    }

    public static boolean sqrtRatioVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreate = create();
        int[] iArrCreate2 = create();
        sqr(iArr, iArrCreate);
        mul(iArrCreate, iArr2, iArrCreate);
        sqr(iArrCreate, iArrCreate2);
        mul(iArrCreate, iArr, iArrCreate);
        mul(iArrCreate2, iArr, iArrCreate2);
        mul(iArrCreate2, iArr2, iArrCreate2);
        int[] iArrCreate3 = create();
        powPm3d4(iArrCreate2, iArrCreate3);
        mul(iArrCreate3, iArrCreate, iArrCreate3);
        int[] iArrCreate4 = create();
        sqr(iArrCreate3, iArrCreate4);
        mul(iArrCreate4, iArr2, iArrCreate4);
        sub(iArr, iArrCreate4, iArrCreate4);
        normalize(iArrCreate4);
        if (!isZeroVar(iArrCreate4)) {
            return false;
        }
        copy(iArrCreate3, 0, iArr3, 0);
        return true;
    }

    public static void sub(int[] iArr, int[] iArr2, int[] iArr3) {
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
        int i22 = iArr[10];
        int i23 = iArr[11];
        int i24 = iArr[12];
        int i25 = iArr[13];
        int i26 = iArr[14];
        int i27 = iArr[15];
        int i28 = iArr2[0];
        int i29 = iArr2[1];
        int i31 = iArr2[2];
        int i32 = iArr2[3];
        int i33 = iArr2[4];
        int i34 = iArr2[5];
        int i35 = iArr2[6];
        int i36 = iArr2[7];
        int i37 = iArr2[8];
        int i38 = iArr2[9];
        int i39 = iArr2[10];
        int i41 = iArr2[11];
        int i42 = iArr2[12];
        int i43 = iArr2[13];
        int i44 = iArr2[14];
        int i45 = (i12 + 536870910) - i29;
        int i46 = (i16 + 536870910) - i34;
        int i47 = (i21 + 536870910) - i38;
        int i48 = (i25 + 536870910) - i43;
        int i49 = (i27 + 536870910) - iArr2[15];
        int i51 = ((i13 + 536870910) - i31) + (i45 >>> 28);
        int i52 = i45 & M28;
        int i53 = ((i17 + 536870910) - i35) + (i46 >>> 28);
        int i54 = i46 & M28;
        int i55 = ((i22 + 536870910) - i39) + (i47 >>> 28);
        int i56 = i47 & M28;
        int i57 = ((i26 + 536870910) - i44) + (i48 >>> 28);
        int i58 = i48 & M28;
        int i59 = ((i14 + 536870910) - i32) + (i51 >>> 28);
        int i61 = i51 & M28;
        int i62 = ((i18 + 536870910) - i36) + (i53 >>> 28);
        int i63 = i53 & M28;
        int i64 = ((i23 + 536870910) - i41) + (i55 >>> 28);
        int i65 = i55 & M28;
        int i66 = i49 + (i57 >>> 28);
        int i67 = i57 & M28;
        int i68 = i66 >>> 28;
        int i69 = i66 & M28;
        int i71 = ((i11 + 536870910) - i28) + i68;
        int i72 = ((i15 + 536870910) - i33) + (i59 >>> 28);
        int i73 = i59 & M28;
        int i74 = ((i19 + 536870908) - i37) + i68 + (i62 >>> 28);
        int i75 = i62 & M28;
        int i76 = ((i24 + 536870910) - i42) + (i64 >>> 28);
        int i77 = i64 & M28;
        int i78 = i52 + (i71 >>> 28);
        int i79 = i71 & M28;
        int i81 = i54 + (i72 >>> 28);
        int i82 = i72 & M28;
        int i83 = i56 + (i74 >>> 28);
        int i84 = i74 & M28;
        int i85 = i58 + (i76 >>> 28);
        int i86 = i76 & M28;
        iArr3[0] = i79;
        iArr3[1] = i78;
        iArr3[2] = i61;
        iArr3[3] = i73;
        iArr3[4] = i82;
        iArr3[5] = i81;
        iArr3[6] = i63;
        iArr3[7] = i75;
        iArr3[8] = i84;
        iArr3[9] = i83;
        iArr3[10] = i65;
        iArr3[11] = i77;
        iArr3[12] = i86;
        iArr3[13] = i85;
        iArr3[14] = i67;
        iArr3[15] = i69;
    }

    public static void subOne(int[] iArr) {
        int[] iArrCreate = create();
        iArrCreate[0] = 1;
        sub(iArr, iArrCreate, iArr);
    }

    public static void zero(int[] iArr) {
        for (int i11 = 0; i11 < 16; i11++) {
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
        int i23 = iArr[10];
        int i24 = iArr[11];
        int i25 = iArr[12];
        int i26 = iArr[13];
        int i27 = iArr[14];
        int i28 = iArr[15];
        long j9 = i11;
        long j11 = ((long) i13) * j9;
        int i29 = ((int) j11) & M28;
        long j12 = j11 >>> 28;
        long j13 = ((long) i17) * j9;
        int i31 = ((int) j13) & M28;
        long j14 = j13 >>> 28;
        long j15 = ((long) i22) * j9;
        int i32 = ((int) j15) & M28;
        long j16 = j15 >>> 28;
        long j17 = ((long) i26) * j9;
        int i33 = ((int) j17) & M28;
        long j18 = j17 >>> 28;
        long j19 = (((long) i14) * j9) + j12;
        iArr2[2] = ((int) j19) & M28;
        long j21 = j19 >>> 28;
        long j22 = (((long) i18) * j9) + j14;
        iArr2[6] = ((int) j22) & M28;
        long j23 = j22 >>> 28;
        long j24 = (((long) i23) * j9) + j16;
        iArr2[10] = ((int) j24) & M28;
        long j25 = (((long) i27) * j9) + j18;
        iArr2[14] = ((int) j25) & M28;
        long j26 = j25 >>> 28;
        long j27 = (((long) i15) * j9) + j21;
        iArr2[3] = ((int) j27) & M28;
        long j28 = (((long) i19) * j9) + j23;
        iArr2[7] = ((int) j28) & M28;
        long j29 = (((long) i24) * j9) + (j24 >>> 28);
        iArr2[11] = ((int) j29) & M28;
        long j31 = j29 >>> 28;
        long j32 = (((long) i28) * j9) + j26;
        iArr2[15] = ((int) j32) & M28;
        long j33 = j32 >>> 28;
        long j34 = (((long) i16) * j9) + (j27 >>> 28);
        iArr2[4] = ((int) j34) & M28;
        long j35 = j34 >>> 28;
        long j36 = (((long) i21) * j9) + (j28 >>> 28) + j33;
        iArr2[8] = ((int) j36) & M28;
        long j37 = (((long) i25) * j9) + j31;
        iArr2[12] = ((int) j37) & M28;
        long j38 = j37 >>> 28;
        long j39 = (((long) i12) * j9) + j33;
        iArr2[0] = ((int) j39) & M28;
        iArr2[1] = i29 + ((int) (j39 >>> 28));
        iArr2[5] = i31 + ((int) j35);
        iArr2[9] = i32 + ((int) (j36 >>> 28));
        iArr2[13] = i33 + ((int) j38);
    }

    public static void addOne(int[] iArr, int i11) {
        iArr[i11] = iArr[i11] + 1;
    }

    public static void decode(byte[] bArr, int i11, int[] iArr) {
        decode56(bArr, i11, iArr, 0);
        decode56(bArr, i11 + 7, iArr, 2);
        decode56(bArr, i11 + 14, iArr, 4);
        decode56(bArr, i11 + 21, iArr, 6);
        decode56(bArr, i11 + 28, iArr, 8);
        decode56(bArr, i11 + 35, iArr, 10);
        decode56(bArr, i11 + 42, iArr, 12);
        decode56(bArr, i11 + 49, iArr, 14);
    }

    public static void encode(int[] iArr, byte[] bArr) {
        encode56(iArr, 0, bArr, 0);
        encode56(iArr, 2, bArr, 7);
        encode56(iArr, 4, bArr, 14);
        encode56(iArr, 6, bArr, 21);
        encode56(iArr, 8, bArr, 28);
        encode56(iArr, 10, bArr, 35);
        encode56(iArr, 12, bArr, 42);
        encode56(iArr, 14, bArr, 49);
    }

    public static void decode(byte[] bArr, int[] iArr) {
        decode56(bArr, 0, iArr, 0);
        decode56(bArr, 7, iArr, 2);
        decode56(bArr, 14, iArr, 4);
        decode56(bArr, 21, iArr, 6);
        decode56(bArr, 28, iArr, 8);
        decode56(bArr, 35, iArr, 10);
        decode56(bArr, 42, iArr, 12);
        decode56(bArr, 49, iArr, 14);
    }

    public static void encode(int[] iArr, byte[] bArr, int i11) {
        encode56(iArr, 0, bArr, i11);
        encode56(iArr, 2, bArr, i11 + 7);
        encode56(iArr, 4, bArr, i11 + 14);
        encode56(iArr, 6, bArr, i11 + 21);
        encode56(iArr, 8, bArr, i11 + 28);
        encode56(iArr, 10, bArr, i11 + 35);
        encode56(iArr, 12, bArr, i11 + 42);
        encode56(iArr, 14, bArr, i11 + 49);
    }

    public static void decode(int[] iArr, int i11, int[] iArr2) {
        decode224(iArr, i11, iArr2, 0);
        decode224(iArr, i11 + 7, iArr2, 8);
    }

    public static void encode(int[] iArr, int[] iArr2, int i11) {
        encode224(iArr, 0, iArr2, i11);
        encode224(iArr, 8, iArr2, i11 + 7);
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
