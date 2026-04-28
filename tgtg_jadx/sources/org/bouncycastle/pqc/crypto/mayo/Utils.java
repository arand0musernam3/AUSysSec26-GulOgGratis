package org.bouncycastle.pqc.crypto.mayo;

import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.CTRModeCipher;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
class Utils {
    public static void expandP1P2(MayoParameters mayoParameters, long[] jArr, byte[] bArr) {
        int p2Bytes = mayoParameters.getP2Bytes() + mayoParameters.getP1Bytes();
        byte[] bArr2 = new byte[p2Bytes];
        CTRModeCipher cTRModeCipherNewInstance = SICBlockCipher.newInstance(AESEngine.newInstance());
        cTRModeCipherNewInstance.init(true, new ParametersWithIV(new KeyParameter(Arrays.copyOf(bArr, mayoParameters.getPkSeedBytes())), new byte[16]));
        int blockSize = cTRModeCipherNewInstance.getBlockSize();
        byte[] bArr3 = new byte[blockSize];
        byte[] bArr4 = new byte[blockSize];
        int i11 = 0;
        while (true) {
            int i12 = i11 + blockSize;
            if (i12 > p2Bytes) {
                break;
            }
            cTRModeCipherNewInstance.processBlock(bArr3, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, bArr2, i11, blockSize);
            i11 = i12;
        }
        if (i11 < p2Bytes) {
            cTRModeCipherNewInstance.processBlock(bArr3, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, bArr2, i11, p2Bytes - i11);
        }
        unpackMVecs(bArr2, 0, jArr, 0, (mayoParameters.getP2Limbs() + mayoParameters.getP1Limbs()) / mayoParameters.getMVecLimbs(), mayoParameters.getM());
    }

    public static void packMVecs(long[] jArr, byte[] bArr, int i11, int i12, int i13) {
        int i14 = (i13 + 15) >> 4;
        int i15 = i13 >> 1;
        int i16 = (8 - (i14 << 3)) + i15;
        int i17 = 0;
        int i18 = 0;
        while (i17 < i12) {
            int i19 = 0;
            while (i19 < i14 - 1) {
                Pack.longToLittleEndian(jArr[i18 + i19], bArr, (i19 << 3) + i11);
                i19++;
            }
            Pack.longToLittleEndian(jArr[i18 + i19], bArr, (i19 << 3) + i11, i16);
            i17++;
            i11 += i15;
            i18 += i14;
        }
    }

    public static void unpackMVecs(byte[] bArr, int i11, long[] jArr, int i12, int i13, int i14) {
        int i15 = (i14 + 15) >> 4;
        int i16 = i14 >> 1;
        int i17 = (8 - (i15 << 3)) + i16;
        int i18 = i13 - 1;
        int i19 = (i18 * i15) + i12;
        int i21 = (i18 * i16) + i11;
        while (i18 >= 0) {
            int i22 = 0;
            while (i22 < i15 - 1) {
                jArr[i19 + i22] = Pack.littleEndianToLong(bArr, (i22 << 3) + i21);
                i22++;
            }
            jArr[i19 + i22] = Pack.littleEndianToLong(bArr, (i22 << 3) + i21, i17);
            i18--;
            i19 -= i15;
            i21 -= i16;
        }
    }
}
