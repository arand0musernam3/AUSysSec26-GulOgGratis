package org.bouncycastle.crypto.generators;

import i4.a;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.engines.Salsa20Engine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
public class SCrypt {
    private SCrypt() {
    }

    private static void BlockMix(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i11) {
        System.arraycopy(iArr, iArr.length - 16, iArr2, 0, 16);
        int length = iArr.length >>> 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = i11 * 2; i14 > 0; i14--) {
            Xor(iArr2, iArr, i12, iArr3);
            Salsa20Engine.salsaCore(8, iArr3, iArr2);
            System.arraycopy(iArr2, 0, iArr4, i13, 16);
            i13 = (length + i12) - i13;
            i12 += 16;
        }
    }

    private static void Clear(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    private static void ClearAll(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            Clear(iArr2);
        }
    }

    private static byte[] MFcrypt(byte[] bArr, byte[] bArr2, int i11, int i12, int i13, int i14) {
        int i15 = i12 * 128;
        byte[] bArrSingleIterationPBKDF2 = SingleIterationPBKDF2(bArr, bArr2, i13 * i15);
        int[] iArr = null;
        try {
            int length = bArrSingleIterationPBKDF2.length >>> 2;
            iArr = new int[length];
            Pack.littleEndianToInt(bArrSingleIterationPBKDF2, 0, iArr);
            int i16 = 0;
            for (int i17 = i11 * i12; i11 - i16 > 2 && i17 > 1024; i17 >>>= 1) {
                i16++;
            }
            int i18 = i15 >>> 2;
            for (int i19 = 0; i19 < length; i19 += i18) {
                SMix(iArr, i19, i11, i16, i12);
            }
            Pack.intToLittleEndian(iArr, bArrSingleIterationPBKDF2, 0);
            byte[] bArrSingleIterationPBKDF22 = SingleIterationPBKDF2(bArr, bArrSingleIterationPBKDF2, i14);
            Clear(bArrSingleIterationPBKDF2);
            Clear(iArr);
            return bArrSingleIterationPBKDF22;
        } catch (Throwable th2) {
            Clear(bArrSingleIterationPBKDF2);
            Clear(iArr);
            throw th2;
        }
    }

    private static void SMix(int[] iArr, int i11, int i12, int i13, int i14) {
        int i15 = i12 >>> i13;
        int i16 = 1 << i13;
        int i17 = i15 - 1;
        int iNumberOfTrailingZeros = Integers.numberOfTrailingZeros(i12) - i13;
        int i18 = i14 * 32;
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[i18];
        int[] iArr5 = new int[i18];
        int[][] iArr6 = new int[i16][];
        try {
            System.arraycopy(iArr, i11, iArr5, 0, i18);
            int i19 = 0;
            while (i19 < i16) {
                int[] iArr7 = new int[i15 * i18];
                iArr6[i19] = iArr7;
                int i21 = iNumberOfTrailingZeros;
                int i22 = i16;
                int i23 = 0;
                for (int i24 = 0; i24 < i15; i24 += 2) {
                    System.arraycopy(iArr5, 0, iArr7, i23, i18);
                    int i25 = i23 + i18;
                    BlockMix(iArr5, iArr2, iArr3, iArr4, i14);
                    System.arraycopy(iArr4, 0, iArr7, i25, i18);
                    i23 = i25 + i18;
                    BlockMix(iArr4, iArr2, iArr3, iArr5, i14);
                }
                i19++;
                iNumberOfTrailingZeros = i21;
                i16 = i22;
            }
            int i26 = iNumberOfTrailingZeros;
            int i27 = i12 - 1;
            for (int i28 = 0; i28 < i12; i28++) {
                int i29 = iArr5[i18 - 16] & i27;
                System.arraycopy(iArr6[i29 >>> i26], (i29 & i17) * i18, iArr4, 0, i18);
                Xor(iArr4, iArr5, 0, iArr4);
                BlockMix(iArr4, iArr2, iArr3, iArr5, i14);
            }
            System.arraycopy(iArr5, 0, iArr, i11, i18);
            ClearAll(iArr6);
            ClearAll(new int[][]{iArr5, iArr2, iArr3, iArr4});
        } catch (Throwable th2) {
            ClearAll(iArr6);
            ClearAll(new int[][]{iArr5, iArr2, iArr3, iArr4});
            throw th2;
        }
    }

    private static byte[] SingleIterationPBKDF2(byte[] bArr, byte[] bArr2, int i11) {
        PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(SHA256Digest.newInstance());
        pKCS5S2ParametersGenerator.init(bArr, bArr2, 1);
        return ((KeyParameter) pKCS5S2ParametersGenerator.generateDerivedMacParameters(i11 * 8)).getKey();
    }

    private static void Xor(int[] iArr, int[] iArr2, int i11, int[] iArr3) {
        for (int length = iArr3.length - 1; length >= 0; length--) {
            iArr3[length] = iArr[length] ^ iArr2[i11 + length];
        }
    }

    public static byte[] generate(byte[] bArr, byte[] bArr2, int i11, int i12, int i13, int i14) {
        String strG;
        String str;
        if (bArr == null) {
            strG = "Passphrase P must be provided.";
        } else if (bArr2 == null) {
            strG = "Salt S must be provided.";
        } else {
            if (i11 > 1 && isPowerOf2(i11)) {
                if (i12 == 1 && i11 >= 65536) {
                    str = "Cost parameter N must be > 1 and < 65536.";
                } else if (i12 >= 1) {
                    int i15 = Integer.MAX_VALUE / (i12 * 1024);
                    if (i13 < 1 || i13 > i15) {
                        strG = k.g(i15, i12, "Parallelisation parameter p must be >= 1 and <= ", " (based on block size r of ", ")");
                    } else {
                        if (i14 >= 1) {
                            return MFcrypt(bArr, bArr2, i11, i12, i13, i14);
                        }
                        str = "Generated key length dkLen must be >= 1.";
                    }
                } else {
                    strG = "Block size r must be >= 1.";
                }
                a.f(str);
                return null;
            }
            strG = "Cost parameter N must be > 1 and a power of 2";
        }
        a.f(strG);
        return null;
    }

    private static boolean isPowerOf2(int i11) {
        return (i11 & (i11 + (-1))) == 0;
    }

    private static void Clear(int[] iArr) {
        if (iArr != null) {
            Arrays.fill(iArr, 0);
        }
    }
}
