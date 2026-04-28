package org.bouncycastle.util;

/* JADX INFO: loaded from: classes3.dex */
public class GF16 {
    private static final byte[] F_STAR = {1, 2, 4, 8, 3, 6, 12, 11, 5, 10, 7, 14, 15, 13, 9};
    private static final byte[] MT4B = new byte[256];
    private static final byte[] INV4B = new byte[16];

    static {
        for (int i11 = 0; i11 < 15; i11++) {
            for (int i12 = 0; i12 < 15; i12++) {
                byte[] bArr = MT4B;
                byte[] bArr2 = F_STAR;
                bArr[(bArr2[i11] << 4) ^ bArr2[i12]] = bArr2[(i11 + i12) % 15];
            }
        }
        byte[] bArr3 = F_STAR;
        byte bMt = 1;
        byte b8 = bArr3[1];
        byte b11 = bArr3[14];
        INV4B[1] = 1;
        byte bMt2 = 1;
        for (int i13 = 0; i13 < 14; i13++) {
            bMt = mt(bMt, b8);
            bMt2 = mt(bMt2, b11);
            INV4B[bMt] = bMt2;
        }
    }

    public static void decode(byte[] bArr, int i11, byte[] bArr2, int i12, int i13) {
        int i14 = i13 >> 1;
        int i15 = 0;
        while (i15 < i14) {
            int i16 = i12 + 1;
            bArr2[i12] = (byte) (bArr[i11] & 15);
            i12 += 2;
            bArr2[i16] = (byte) ((bArr[i11] >>> 4) & 15);
            i15++;
            i11++;
        }
        if ((i13 & 1) == 1) {
            bArr2[i12] = (byte) (bArr[i11] & 15);
        }
    }

    public static void encode(byte[] bArr, byte[] bArr2, int i11, int i12) {
        int i13 = i12 >> 1;
        int i14 = 0;
        int i15 = 0;
        while (i14 < i13) {
            int i16 = i15 + 1;
            int i17 = bArr[i15] & 15;
            i15 += 2;
            bArr2[i11] = (byte) (((bArr[i16] & 15) << 4) | i17);
            i14++;
            i11++;
        }
        if ((i12 & 1) == 1) {
            bArr2[i11] = (byte) (bArr[i15] & 15);
        }
    }

    public static byte innerProduct(byte[] bArr, int i11, byte[] bArr2, int i12, int i13) {
        int i14 = 0;
        byte bMul = 0;
        while (i14 < i13) {
            bMul = (byte) (mul(bArr[i11], bArr2[i12]) ^ bMul);
            i14++;
            i12 += i13;
            i11++;
        }
        return bMul;
    }

    public static byte inv(byte b8) {
        return INV4B[b8 & 15];
    }

    public static byte mt(int i11, int i12) {
        return MT4B[(i11 << 4) ^ i12];
    }

    public static byte mul(byte b8, byte b11) {
        return MT4B[(b8 << 4) | b11];
    }

    public static int mul(int i11, int i12) {
        return MT4B[(i11 << 4) | i12];
    }

    public static void encode(byte[] bArr, byte[] bArr2, int i11) {
        int i12 = i11 >> 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int i15 = i14 + 1;
            int i16 = bArr[i14] & 15;
            i14 += 2;
            bArr2[i13] = (byte) (((bArr[i15] & 15) << 4) | i16);
            i13++;
        }
        if ((i11 & 1) == 1) {
            bArr2[i13] = (byte) (bArr[i14] & 15);
        }
    }

    public static void decode(byte[] bArr, byte[] bArr2, int i11) {
        int i12 = i11 >> 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int i15 = i14 + 1;
            bArr2[i14] = (byte) (bArr[i13] & 15);
            i14 += 2;
            bArr2[i15] = (byte) ((bArr[i13] >>> 4) & 15);
            i13++;
        }
        if ((i11 & 1) == 1) {
            bArr2[i14] = (byte) (bArr[i13] & 15);
        }
    }
}
