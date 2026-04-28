package org.bouncycastle.util.encoders;

import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public class UTF8 {
    private static final byte C_CR1 = 1;
    private static final byte C_CR2 = 2;
    private static final byte C_CR3 = 3;
    private static final byte C_ILL = 0;
    private static final byte C_L2A = 4;
    private static final byte C_L3A = 5;
    private static final byte C_L3B = 6;
    private static final byte C_L3C = 7;
    private static final byte C_L4A = 8;
    private static final byte C_L4B = 9;
    private static final byte C_L4C = 10;
    private static final byte S_CS1 = 0;
    private static final byte S_CS2 = 16;
    private static final byte S_CS3 = 32;
    private static final byte S_END = -1;
    private static final byte S_ERR = -2;
    private static final byte S_P3A = 48;
    private static final byte S_P3B = 64;
    private static final byte S_P4A = 80;
    private static final byte S_P4B = 96;
    private static final short[] firstUnitTable = new short[128];
    private static final byte[] transitionTable;

    static {
        byte[] bArr = new byte[112];
        transitionTable = bArr;
        byte[] bArr2 = new byte[128];
        fill(bArr2, 0, 15, (byte) 1);
        fill(bArr2, 16, 31, (byte) 2);
        fill(bArr2, 32, 63, (byte) 3);
        fill(bArr2, 64, 65, (byte) 0);
        fill(bArr2, 66, 95, (byte) 4);
        fill(bArr2, 96, 96, C_L3A);
        fill(bArr2, 97, 108, C_L3B);
        fill(bArr2, 109, 109, C_L3C);
        fill(bArr2, 110, 111, C_L3B);
        fill(bArr2, 112, 112, C_L4A);
        fill(bArr2, 113, 115, C_L4B);
        fill(bArr2, 116, 116, C_L4C);
        fill(bArr2, 117, 127, (byte) 0);
        fill(bArr, 0, bArr.length - 1, S_ERR);
        fill(bArr, 8, 11, S_END);
        fill(bArr, 24, 27, (byte) 0);
        fill(bArr, 40, 43, S_CS2);
        fill(bArr, 58, 59, (byte) 0);
        fill(bArr, 72, 73, (byte) 0);
        fill(bArr, 89, 91, S_CS2);
        fill(bArr, 104, 104, S_CS2);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, C_L3C, C_L3C, C_L3C};
        byte[] bArr4 = {S_ERR, S_ERR, S_ERR, S_ERR, 0, S_P3A, S_CS2, S_P3B, S_P4A, S_CS3, S_P4B};
        for (int i11 = 0; i11 < 128; i11++) {
            byte b8 = bArr2[i11];
            firstUnitTable[i11] = (short) (bArr4[b8] | ((bArr3[b8] & i11) << 8));
        }
    }

    private static void fill(byte[] bArr, int i11, int i12, byte b8) {
        while (i11 <= i12) {
            bArr[i11] = b8;
            i11++;
        }
    }

    public static int transcodeToUTF16(byte[] bArr, int i11, int i12, char[] cArr) {
        int i13 = i12 + i11;
        int i14 = 0;
        while (i11 < i13) {
            int i15 = i11 + 1;
            byte b8 = bArr[i11];
            if (b8 < 0) {
                short s7 = firstUnitTable[b8 & ByteCompanionObject.MAX_VALUE];
                int i16 = s7 >>> 8;
                byte b11 = (byte) s7;
                while (b11 >= 0) {
                    if (i15 >= i13) {
                        return -1;
                    }
                    int i17 = i15 + 1;
                    byte b12 = bArr[i15];
                    i16 = (i16 << 6) | (b12 & 63);
                    b11 = transitionTable[b11 + ((b12 & S_END) >>> 4)];
                    i15 = i17;
                }
                if (b11 == -2) {
                    return -1;
                }
                if (i16 <= 65535) {
                    if (i14 >= cArr.length) {
                        return -1;
                    }
                    cArr[i14] = (char) i16;
                    i14++;
                } else {
                    if (i14 >= cArr.length - 1) {
                        return -1;
                    }
                    int i18 = i14 + 1;
                    cArr[i14] = (char) ((i16 >>> 10) + 55232);
                    i14 += 2;
                    cArr[i18] = (char) ((i16 & 1023) | 56320);
                }
                i11 = i15;
            } else {
                if (i14 >= cArr.length) {
                    return -1;
                }
                cArr[i14] = (char) b8;
                i11 = i15;
                i14++;
            }
        }
        return i14;
    }

    public static int transcodeToUTF16(byte[] bArr, char[] cArr) {
        return transcodeToUTF16(bArr, 0, bArr.length, cArr);
    }
}
