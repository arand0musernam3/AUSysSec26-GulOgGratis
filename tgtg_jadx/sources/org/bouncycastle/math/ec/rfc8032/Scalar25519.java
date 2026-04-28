package org.bouncycastle.math.ec.rfc8032;

import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* JADX INFO: loaded from: classes3.dex */
abstract class Scalar25519 {
    private static final int L0 = -50998291;
    private static final int L1 = 19280294;
    private static final int L2 = 127719000;
    private static final int L3 = -6428113;
    private static final int L4 = 5343;
    private static final long M08L = 255;
    private static final long M28L = 268435455;
    private static final long M32L = 4294967295L;
    private static final int SCALAR_BYTES = 32;
    static final int SIZE = 8;
    private static final int TARGET_LENGTH = 254;
    private static final int[] L = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    private static final int[] LSq = {-1424848535, -487721339, 580428573, 1745064566, -770181698, 1036971123, 461123738, -1582065343, 1268693629, -889041821, -731974758, 43769659, 0, 0, 0, 16777216};

    public static boolean checkVar(byte[] bArr, int[] iArr) {
        decode(bArr, iArr);
        return !Nat256.gte(iArr, L);
    }

    public static void decode(byte[] bArr, int[] iArr) {
        Codec.decode32(bArr, 0, iArr, 0, 8);
    }

    public static void getOrderWnafVar(int i11, byte[] bArr) {
        Wnaf.getSignedVar(L, i11, bArr);
    }

    public static void multiply128Var(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        Nat256.mul128(iArr, iArr2, iArr4);
        if (iArr2[3] < 0) {
            Nat256.addTo(L, 0, iArr4, 4, 0);
            Nat256.subFrom(iArr, 0, iArr4, 4, 0);
        }
        byte[] bArr = new byte[48];
        Codec.encode32(iArr4, 0, 12, bArr, 0);
        decode(reduce384(bArr), iArr3);
    }

    public static byte[] reduce384(byte[] bArr) {
        long jDecode32 = ((long) Codec.decode32(bArr, 0)) & M32L;
        long jDecode24 = ((long) (Codec.decode24(bArr, 4) << 4)) & M32L;
        long jDecode322 = ((long) Codec.decode32(bArr, 7)) & M32L;
        long jDecode242 = ((long) (Codec.decode24(bArr, 11) << 4)) & M32L;
        long jDecode323 = ((long) Codec.decode32(bArr, 14)) & M32L;
        long jDecode243 = ((long) (Codec.decode24(bArr, 18) << 4)) & M32L;
        long jDecode324 = ((long) Codec.decode32(bArr, 21)) & M32L;
        long jDecode244 = ((long) (Codec.decode24(bArr, 25) << 4)) & M32L;
        long jDecode325 = ((long) Codec.decode32(bArr, 28)) & M32L;
        long jDecode245 = Codec.decode24(bArr, 32) << 4;
        long j9 = jDecode245 & M32L;
        long jDecode326 = Codec.decode32(bArr, 35);
        long j11 = jDecode326 & M32L;
        long jDecode246 = Codec.decode24(bArr, 39) << 4;
        long j12 = jDecode246 & M32L;
        long jDecode327 = Codec.decode32(bArr, 42);
        long jDecode16 = (((long) (Codec.decode16(bArr, 46) << 4)) & M32L) + ((jDecode327 & M32L) >> 28);
        long j13 = jDecode325 - (jDecode16 * 5343);
        long j14 = (jDecode327 & M28L) + (j12 >> 28);
        long j15 = (jDecode323 - (jDecode16 * (-50998291))) - (j14 * 19280294);
        long j16 = (jDecode243 - (jDecode16 * 19280294)) - (j14 * 127719000);
        long j17 = (jDecode324 - (jDecode16 * 127719000)) - (j14 * (-6428113));
        long j18 = (jDecode244 - (jDecode16 * (-6428113))) - (j14 * 5343);
        long j19 = (jDecode246 & M28L) + (j11 >> 28);
        long j21 = jDecode322 - (j19 * (-50998291));
        long j22 = (jDecode242 - (j14 * (-50998291))) - (j19 * 19280294);
        long j23 = j15 - (j19 * 127719000);
        long j24 = j16 - (j19 * (-6428113));
        long j25 = j17 - (j19 * 5343);
        long j26 = (jDecode326 & M28L) + (j9 >> 28);
        long j27 = jDecode245 & M28L;
        long j28 = jDecode24 - (j26 * (-50998291));
        long j29 = j21 - (j26 * 19280294);
        long j31 = j22 - (j26 * 127719000);
        long j32 = j23 - (j26 * (-6428113));
        long j33 = j24 - (j26 * 5343);
        long j34 = j13 + (j18 >> 28);
        long j35 = j18 & M28L;
        long j36 = j27 + (j34 >> 28);
        long j37 = j34 & M28L;
        long j38 = j37 >>> 27;
        long j39 = j36 + j38;
        long j41 = jDecode32 - (j39 * (-50998291));
        long j42 = j29 - (j39 * 127719000);
        long j43 = j31 - (j39 * (-6428113));
        long j44 = j32 - (j39 * 5343);
        long j45 = (j28 - (j39 * 19280294)) + (j41 >> 28);
        long j46 = j41 & M28L;
        long j47 = j42 + (j45 >> 28);
        long j48 = j45 & M28L;
        long j49 = j43 + (j47 >> 28);
        long j51 = j47 & M28L;
        long j52 = j44 + (j49 >> 28);
        long j53 = j49 & M28L;
        long j54 = j33 + (j52 >> 28);
        long j55 = j52 & M28L;
        long j56 = j25 + (j54 >> 28);
        long j57 = j54 & M28L;
        long j58 = j35 + (j56 >> 28);
        long j59 = j56 & M28L;
        long j61 = j37 + (j58 >> 28);
        long j62 = j58 & M28L;
        long j63 = j61 >> 28;
        long j64 = j61 & M28L;
        long j65 = j63 - j38;
        long j66 = j46 + (j65 & (-50998291));
        long j67 = j48 + (j65 & 19280294) + (j66 >> 28);
        long j68 = j66 & M28L;
        long j69 = j51 + (j65 & 127719000) + (j67 >> 28);
        long j71 = j67 & M28L;
        long j72 = j53 + (j65 & (-6428113)) + (j69 >> 28);
        long j73 = j69 & M28L;
        long j74 = j55 + (j65 & 5343) + (j72 >> 28);
        long j75 = j72 & M28L;
        long j76 = j57 + (j74 >> 28);
        long j77 = j74 & M28L;
        long j78 = j59 + (j76 >> 28);
        long j79 = j76 & M28L;
        long j81 = j62 + (j78 >> 28);
        long j82 = j78 & M28L;
        long j83 = j64 + (j81 >> 28);
        long j84 = M28L & j81;
        byte[] bArr2 = new byte[64];
        Codec.encode56(j68 | (j71 << 28), bArr2, 0);
        Codec.encode56(j73 | (j75 << 28), bArr2, 7);
        Codec.encode56((j79 << 28) | j77, bArr2, 14);
        Codec.encode56((j84 << 28) | j82, bArr2, 21);
        Codec.encode32((int) j83, bArr2, 28);
        return bArr2;
    }

    public static byte[] reduce512(byte[] bArr) {
        long jDecode32 = ((long) Codec.decode32(bArr, 0)) & M32L;
        long jDecode24 = ((long) (Codec.decode24(bArr, 4) << 4)) & M32L;
        long jDecode322 = ((long) Codec.decode32(bArr, 7)) & M32L;
        long jDecode242 = ((long) (Codec.decode24(bArr, 11) << 4)) & M32L;
        long jDecode323 = ((long) Codec.decode32(bArr, 14)) & M32L;
        long jDecode243 = ((long) (Codec.decode24(bArr, 18) << 4)) & M32L;
        long jDecode324 = ((long) Codec.decode32(bArr, 21)) & M32L;
        long jDecode244 = ((long) (Codec.decode24(bArr, 25) << 4)) & M32L;
        long jDecode325 = ((long) Codec.decode32(bArr, 28)) & M32L;
        long jDecode245 = ((long) (Codec.decode24(bArr, 32) << 4)) & M32L;
        long jDecode326 = ((long) Codec.decode32(bArr, 35)) & M32L;
        long jDecode246 = ((long) (Codec.decode24(bArr, 39) << 4)) & M32L;
        long jDecode327 = ((long) Codec.decode32(bArr, 42)) & M32L;
        long jDecode247 = ((long) (Codec.decode24(bArr, 46) << 4)) & M32L;
        long jDecode328 = Codec.decode32(bArr, 49);
        long j9 = jDecode328 & M32L;
        long jDecode248 = ((long) (Codec.decode24(bArr, 53) << 4)) & M32L;
        long jDecode329 = Codec.decode32(bArr, 56);
        long j11 = jDecode329 & M32L;
        long jDecode249 = ((long) (Codec.decode24(bArr, 60) << 4)) & M32L;
        long j12 = ((long) bArr[63]) & M08L;
        long j13 = jDecode249 + (j11 >> 28);
        long j14 = jDecode329 & M28L;
        long j15 = (jDecode327 - (j12 * (-6428113))) - (j13 * 5343);
        long j16 = (jDecode325 - (j13 * (-50998291))) - (j14 * 19280294);
        long j17 = ((jDecode245 - (j12 * (-50998291))) - (j13 * 19280294)) - (j14 * 127719000);
        long j18 = ((jDecode326 - (j12 * 19280294)) - (j13 * 127719000)) - (j14 * (-6428113));
        long j19 = ((jDecode246 - (j12 * 127719000)) - (j13 * (-6428113))) - (j14 * 5343);
        long j21 = jDecode248 + (j9 >> 28);
        long j22 = jDecode328 & M28L;
        long j23 = j18 - (j21 * 5343);
        long j24 = (j17 - (j21 * (-6428113))) - (j22 * 5343);
        long j25 = (jDecode247 - (j12 * 5343)) + (j15 >> 28);
        long j26 = ((jDecode324 - (j21 * (-50998291))) - (j22 * 19280294)) - (j25 * 127719000);
        long j27 = (((jDecode244 - (j14 * (-50998291))) - (j21 * 19280294)) - (j22 * 127719000)) - (j25 * (-6428113));
        long j28 = ((j16 - (j21 * 127719000)) - (j22 * (-6428113))) - (j25 * 5343);
        long j29 = (j15 & M28L) + (j19 >> 28);
        long j31 = (jDecode323 - (j25 * (-50998291))) - (j29 * 19280294);
        long j32 = ((jDecode243 - (j22 * (-50998291))) - (j25 * 19280294)) - (j29 * 127719000);
        long j33 = j27 - (j29 * 5343);
        long j34 = (j19 & M28L) + (j23 >> 28);
        long j35 = jDecode322 - (j34 * (-50998291));
        long j36 = (jDecode242 - (j29 * (-50998291))) - (j34 * 19280294);
        long j37 = j31 - (j34 * 127719000);
        long j38 = j32 - (j34 * (-6428113));
        long j39 = (j26 - (j29 * (-6428113))) - (j34 * 5343);
        long j41 = (j23 & M28L) + (j24 >> 28);
        long j42 = j24 & M28L;
        long j43 = jDecode24 - (j41 * (-50998291));
        long j44 = j35 - (j41 * 19280294);
        long j45 = j36 - (j41 * 127719000);
        long j46 = j37 - (j41 * (-6428113));
        long j47 = j38 - (j41 * 5343);
        long j48 = j28 + (j33 >> 28);
        long j49 = j33 & M28L;
        long j51 = j42 + (j48 >> 28);
        long j52 = j48 & M28L;
        long j53 = j52 >>> 27;
        long j54 = j51 + j53;
        long j55 = jDecode32 - (j54 * (-50998291));
        long j56 = j44 - (j54 * 127719000);
        long j57 = j45 - (j54 * (-6428113));
        long j58 = j46 - (j54 * 5343);
        long j59 = (j43 - (j54 * 19280294)) + (j55 >> 28);
        long j61 = j55 & M28L;
        long j62 = j56 + (j59 >> 28);
        long j63 = j59 & M28L;
        long j64 = j57 + (j62 >> 28);
        long j65 = j62 & M28L;
        long j66 = j58 + (j64 >> 28);
        long j67 = j64 & M28L;
        long j68 = j47 + (j66 >> 28);
        long j69 = j66 & M28L;
        long j71 = j39 + (j68 >> 28);
        long j72 = j68 & M28L;
        long j73 = j49 + (j71 >> 28);
        long j74 = j71 & M28L;
        long j75 = j52 + (j73 >> 28);
        long j76 = j73 & M28L;
        long j77 = j75 >> 28;
        long j78 = j75 & M28L;
        long j79 = j77 - j53;
        long j81 = j61 + (j79 & (-50998291));
        long j82 = j63 + (j79 & 19280294) + (j81 >> 28);
        long j83 = j81 & M28L;
        long j84 = j65 + (j79 & 127719000) + (j82 >> 28);
        long j85 = j82 & M28L;
        long j86 = j67 + (j79 & (-6428113)) + (j84 >> 28);
        long j87 = j84 & M28L;
        long j88 = j69 + (j79 & 5343) + (j86 >> 28);
        long j89 = j86 & M28L;
        long j90 = j72 + (j88 >> 28);
        long j91 = j88 & M28L;
        long j92 = j74 + (j90 >> 28);
        long j93 = j90 & M28L;
        long j94 = j76 + (j92 >> 28);
        long j95 = j92 & M28L;
        long j96 = j78 + (j94 >> 28);
        long j97 = j94 & M28L;
        byte[] bArr2 = new byte[32];
        Codec.encode56(j83 | (j85 << 28), bArr2, 0);
        Codec.encode56(j87 | (j89 << 28), bArr2, 7);
        Codec.encode56((j93 << 28) | j91, bArr2, 14);
        Codec.encode56((j97 << 28) | j95, bArr2, 21);
        Codec.encode32((int) j96, bArr2, 28);
        return bArr2;
    }

    public static boolean reduceBasisVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        System.arraycopy(LSq, 0, iArr4, 0, 16);
        int[] iArr5 = new int[16];
        Nat256.square(iArr, iArr5);
        iArr5[0] = iArr5[0] + 1;
        int[] iArr6 = new int[16];
        int[] iArr7 = L;
        Nat256.mul(iArr7, iArr, iArr6);
        int[] iArr8 = new int[16];
        int[] iArr9 = new int[4];
        System.arraycopy(iArr7, 0, iArr9, 0, 4);
        int[] iArr10 = new int[4];
        System.arraycopy(iArr, 0, iArr10, 0, 4);
        int[] iArr11 = new int[4];
        iArr11[0] = 1;
        int i11 = 1016;
        int[] iArr12 = iArr11;
        int[] iArr13 = new int[4];
        int[] iArr14 = iArr9;
        int[] iArr15 = iArr10;
        int i12 = 15;
        int bitLengthPositive = ScalarUtil.getBitLengthPositive(15, iArr5);
        int[] iArr16 = iArr4;
        int[] iArr17 = iArr5;
        while (bitLengthPositive > TARGET_LENGTH) {
            i11--;
            if (i11 < 0) {
                return false;
            }
            int bitLength = ScalarUtil.getBitLength(i12, iArr6) - bitLengthPositive;
            int i13 = bitLength & (~(bitLength >> 31));
            if (iArr6[i12] < 0) {
                ScalarUtil.addShifted_NP(i12, i13, iArr16, iArr17, iArr6, iArr8);
                ScalarUtil.addShifted_UV(3, i13, iArr14, iArr13, iArr15, iArr12);
            } else {
                ScalarUtil.subShifted_NP(i12, i13, iArr16, iArr17, iArr6, iArr8);
                ScalarUtil.subShifted_UV(3, i13, iArr14, iArr13, iArr15, iArr12);
            }
            int[] iArr18 = iArr15;
            int[] iArr19 = iArr12;
            if (ScalarUtil.lessThan(i12, iArr16, iArr17)) {
                int i14 = bitLengthPositive >>> 5;
                int bitLengthPositive2 = ScalarUtil.getBitLengthPositive(i14, iArr16);
                int[] iArr20 = iArr17;
                iArr17 = iArr16;
                iArr16 = iArr20;
                i12 = i14;
                bitLengthPositive = bitLengthPositive2;
                iArr15 = iArr14;
                iArr12 = iArr13;
                iArr13 = iArr19;
                iArr14 = iArr18;
            } else {
                iArr12 = iArr19;
                iArr15 = iArr18;
            }
        }
        System.arraycopy(iArr15, 0, iArr2, 0, 4);
        System.arraycopy(iArr12, 0, iArr3, 0, 4);
        return true;
    }

    public static void toSignedDigits(int i11, int[] iArr) {
        Nat.caddTo(8, (~iArr[0]) & 1, L, iArr);
        Nat.shiftDownBit(8, iArr, 1);
    }
}
