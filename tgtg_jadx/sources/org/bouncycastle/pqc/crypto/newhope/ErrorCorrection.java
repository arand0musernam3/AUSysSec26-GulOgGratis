package org.bouncycastle.pqc.crypto.newhope;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class ErrorCorrection {
    public static short LDDecode(int i11, int i12, int i13, int i14) {
        return (short) (((((g(i11) + g(i12)) + g(i13)) + g(i14)) - 98312) >>> 31);
    }

    public static int abs(int i11) {
        int i12 = i11 >> 31;
        return (i11 ^ i12) - i12;
    }

    public static int f(int[] iArr, int i11, int i12, int i13) {
        int i14 = (i13 * 2730) >> 25;
        int i15 = i14 - ((12288 - (i13 - (i14 * 12289))) >> 31);
        iArr[i11] = (i15 >> 1) + (i15 & 1);
        int i16 = i15 - 1;
        iArr[i12] = (i16 >> 1) + (i16 & 1);
        return abs(i13 - (iArr[i11] * 24578));
    }

    public static int g(int i11) {
        int i12 = (i11 * 2730) >> 27;
        int i13 = i12 - ((49155 - (i11 - (49156 * i12))) >> 31);
        return abs((((i13 >> 1) + (i13 & 1)) * 98312) - i11);
    }

    public static void helpRec(short[] sArr, short[] sArr2, byte[] bArr, byte b8) {
        short s7 = 8;
        byte[] bArr2 = new byte[8];
        bArr2[0] = b8;
        byte[] bArr3 = new byte[32];
        ChaCha20.process(bArr, bArr2, bArr3, 0, 32);
        int[] iArr = new int[8];
        int i11 = 0;
        while (i11 < 256) {
            int i12 = ((bArr3[i11 >>> 3] >>> (i11 & 7)) & 1) * 4;
            int i13 = i11 + 256;
            int i14 = i11 + 512;
            int i15 = i11 + 768;
            int iF = (24577 - (((f(iArr, 0, 4, (sArr2[i11] * s7) + i12) + f(iArr, 1, 5, (sArr2[i13] * s7) + i12)) + f(iArr, 2, 6, (sArr2[i14] * s7) + i12)) + f(iArr, 3, 7, (sArr2[i15] * s7) + i12))) >> 31;
            int i16 = ~iF;
            int[] iArr2 = {(i16 & iArr[0]) ^ (iArr[4] & iF), (i16 & iArr[1]) ^ (iArr[5] & iF), (i16 & iArr[2]) ^ (iArr[6] & iF), (iArr[7] & iF) ^ (i16 & iArr[3])};
            int i17 = iArr2[0];
            int i18 = iArr2[3];
            sArr[i11] = (short) ((i17 - i18) & 3);
            sArr[i13] = (short) ((iArr2[1] - i18) & 3);
            sArr[i14] = (short) ((iArr2[2] - i18) & 3);
            sArr[i15] = (short) (((i18 * 2) + (-iF)) & 3);
            i11++;
            s7 = 8;
        }
    }

    public static void rec(byte[] bArr, short[] sArr, short[] sArr2) {
        Arrays.fill(bArr, (byte) 0);
        for (int i11 = 0; i11 < 256; i11++) {
            int i12 = (sArr[i11] * 8) + 196624;
            int i13 = sArr2[i11] * 2;
            int i14 = i11 + 768;
            short s7 = sArr2[i14];
            int i15 = i12 - ((i13 + s7) * 12289);
            int i16 = i11 + 256;
            int i17 = ((sArr[i16] * 8) + 196624) - (((sArr2[i16] * 2) + s7) * 12289);
            int i18 = i11 + 512;
            int[] iArr = {i15, i17, ((sArr[i18] * 8) + 196624) - (((sArr2[i18] * 2) + s7) * 12289), ((sArr[i14] * 8) + 196624) - (s7 * 12289)};
            int i19 = i11 >>> 3;
            bArr[i19] = (byte) ((LDDecode(iArr[0], iArr[1], iArr[2], iArr[3]) << (i11 & 7)) | bArr[i19]);
        }
    }
}
