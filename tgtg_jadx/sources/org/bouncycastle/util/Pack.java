package org.bouncycastle.util;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Pack {
    public static int bigEndianToInt(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & 255) | (bArr[i11] << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }

    public static long bigEndianToLong(byte[] bArr, int i11) {
        int iBigEndianToInt = bigEndianToInt(bArr, i11);
        return (((long) bigEndianToInt(bArr, i11 + 4)) & 4294967295L) | ((((long) iBigEndianToInt) & 4294967295L) << 32);
    }

    public static short bigEndianToShort(byte[] bArr, int i11) {
        return (short) ((bArr[i11 + 1] & 255) | ((bArr[i11] & 255) << 8));
    }

    public static void intToBigEndian(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) (i11 >>> 24);
        bArr[i12 + 1] = (byte) (i11 >>> 16);
        bArr[i12 + 2] = (byte) (i11 >>> 8);
        bArr[i12 + 3] = (byte) i11;
    }

    public static void intToLittleEndian(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12 + 2] = (byte) (i11 >>> 16);
        bArr[i12 + 3] = (byte) (i11 >>> 24);
    }

    public static int littleEndianToInt(byte[] bArr, int i11) {
        return (bArr[i11 + 3] << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    public static int littleEndianToInt_High(byte[] bArr, int i11, int i12) {
        return littleEndianToInt_Low(bArr, i11, i12) << ((4 - i12) << 3);
    }

    public static int littleEndianToInt_Low(byte[] bArr, int i11, int i12) {
        int i13 = bArr[i11] & 255;
        int i14 = 0;
        for (int i15 = 1; i15 < i12; i15++) {
            i14 += 8;
            i13 |= (bArr[i11 + i15] & 255) << i14;
        }
        return i13;
    }

    public static long littleEndianToLong(byte[] bArr, int i11) {
        return ((((long) littleEndianToInt(bArr, i11 + 4)) & 4294967295L) << 32) | (((long) littleEndianToInt(bArr, i11)) & 4294967295L);
    }

    public static long littleEndianToLong_High(byte[] bArr, int i11, int i12) {
        return littleEndianToLong_Low(bArr, i11, i12) << ((8 - i12) << 3);
    }

    public static long littleEndianToLong_Low(byte[] bArr, int i11, int i12) {
        long j9 = bArr[i11] & 255;
        for (int i13 = 1; i13 < i12; i13++) {
            j9 = (j9 << 8) | ((long) (bArr[i11 + i13] & 255));
        }
        return j9;
    }

    public static void littleEndianToShort(byte[] bArr, int i11, short[] sArr, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            sArr[i12 + i14] = littleEndianToShort(bArr, i11);
            i11 += 2;
        }
    }

    public static void longToBigEndian(long j9, byte[] bArr, int i11) {
        intToBigEndian((int) (j9 >>> 32), bArr, i11);
        intToBigEndian((int) (j9 & 4294967295L), bArr, i11 + 4);
    }

    public static void longToLittleEndian(long j9, byte[] bArr, int i11) {
        intToLittleEndian((int) (4294967295L & j9), bArr, i11);
        intToLittleEndian((int) (j9 >>> 32), bArr, i11 + 4);
    }

    public static void longToLittleEndian_High(long j9, byte[] bArr, int i11, int i12) {
        int i13 = 56;
        bArr[i11] = (byte) (j9 >>> 56);
        for (int i14 = 1; i14 < i12; i14++) {
            i13 -= 8;
            bArr[i11 + i14] = (byte) (j9 >>> i13);
        }
    }

    public static void shortToBigEndian(short s7, byte[] bArr, int i11) {
        bArr[i11] = (byte) (s7 >>> 8);
        bArr[i11 + 1] = (byte) s7;
    }

    public static void shortToLittleEndian(short[] sArr, int i11, int i12, byte[] bArr, int i13) {
        for (int i14 = 0; i14 < i12; i14++) {
            shortToLittleEndian(sArr[i11 + i14], bArr, i13);
            i13 += 2;
        }
    }

    public static byte[] shortToBigEndian(short s7) {
        byte[] bArr = new byte[2];
        shortToBigEndian(s7, bArr, 0);
        return bArr;
    }

    public static void shortToLittleEndian(short s7, byte[] bArr, int i11) {
        bArr[i11] = (byte) s7;
        bArr[i11 + 1] = (byte) (s7 >>> 8);
    }

    public static short littleEndianToShort(byte[] bArr, int i11) {
        return (short) (((bArr[i11 + 1] & 255) << 8) | (bArr[i11] & 255));
    }

    public static byte[] shortToLittleEndian(short s7) {
        byte[] bArr = new byte[2];
        shortToLittleEndian(s7, bArr, 0);
        return bArr;
    }

    public static void longToLittleEndian(long j9, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[i11 + i13] = (byte) (j9 >>> (i13 << 3));
        }
    }

    public static void longToBigEndian(long j9, byte[] bArr, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            bArr[i13 + i11] = (byte) (255 & j9);
            j9 >>>= 8;
        }
    }

    public static void longToLittleEndian(long[] jArr, int i11, int i12, byte[] bArr, int i13) {
        for (int i14 = 0; i14 < i12; i14++) {
            longToLittleEndian(jArr[i11 + i14], bArr, i13);
            i13 += 8;
        }
    }

    public static void longToBigEndian(long[] jArr, int i11, int i12, byte[] bArr, int i13) {
        for (int i14 = 0; i14 < i12; i14++) {
            longToBigEndian(jArr[i11 + i14], bArr, i13);
            i13 += 8;
        }
    }

    public static void longToLittleEndian(long[] jArr, byte[] bArr, int i11) {
        for (long j9 : jArr) {
            longToLittleEndian(j9, bArr, i11);
            i11 += 8;
        }
    }

    public static void longToBigEndian(long[] jArr, byte[] bArr, int i11) {
        for (long j9 : jArr) {
            longToBigEndian(j9, bArr, i11);
            i11 += 8;
        }
    }

    public static byte[] longToLittleEndian(long j9) {
        byte[] bArr = new byte[8];
        longToLittleEndian(j9, bArr, 0);
        return bArr;
    }

    public static long bigEndianToLong(byte[] bArr, int i11, int i12) {
        long j9 = 0;
        for (int i13 = 0; i13 < i12; i13++) {
            j9 |= (((long) bArr[i13 + i11]) & 255) << ((7 - i13) << 3);
        }
        return j9;
    }

    public static byte[] longToBigEndian(long j9) {
        byte[] bArr = new byte[8];
        longToBigEndian(j9, bArr, 0);
        return bArr;
    }

    public static byte[] longToLittleEndian(long[] jArr) {
        byte[] bArr = new byte[jArr.length * 8];
        longToLittleEndian(jArr, bArr, 0);
        return bArr;
    }

    public static void bigEndianToLong(byte[] bArr, int i11, long[] jArr) {
        for (int i12 = 0; i12 < jArr.length; i12++) {
            jArr[i12] = bigEndianToLong(bArr, i11);
            i11 += 8;
        }
    }

    public static void intToBigEndian(int[] iArr, int i11, int i12, byte[] bArr, int i13) {
        for (int i14 = 0; i14 < i12; i14++) {
            intToBigEndian(iArr[i11 + i14], bArr, i13);
            i13 += 4;
        }
    }

    public static void intToLittleEndian(int[] iArr, int i11, int i12, byte[] bArr, int i13) {
        for (int i14 = 0; i14 < i12; i14++) {
            intToLittleEndian(iArr[i11 + i14], bArr, i13);
            i13 += 4;
        }
    }

    public static long littleEndianToLong(byte[] bArr, int i11, int i12) {
        long j9 = 0;
        for (int i13 = 0; i13 < i12; i13++) {
            j9 |= (((long) bArr[i11 + i13]) & 255) << (i13 << 3);
        }
        return j9;
    }

    public static byte[] longToBigEndian(long[] jArr) {
        byte[] bArr = new byte[jArr.length * 8];
        longToBigEndian(jArr, bArr, 0);
        return bArr;
    }

    public static void bigEndianToLong(byte[] bArr, int i11, long[] jArr, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            jArr[i12 + i14] = bigEndianToLong(bArr, i11);
            i11 += 8;
        }
    }

    public static void intToBigEndian(int[] iArr, byte[] bArr, int i11) {
        for (int i12 : iArr) {
            intToBigEndian(i12, bArr, i11);
            i11 += 4;
        }
    }

    public static void intToLittleEndian(int[] iArr, byte[] bArr, int i11) {
        for (int i12 : iArr) {
            intToLittleEndian(i12, bArr, i11);
            i11 += 4;
        }
    }

    public static void littleEndianToLong(byte[] bArr, int i11, long[] jArr) {
        for (int i12 = 0; i12 < jArr.length; i12++) {
            jArr[i12] = littleEndianToLong(bArr, i11);
            i11 += 8;
        }
    }

    public static byte[] intToBigEndian(int i11) {
        byte[] bArr = new byte[4];
        intToBigEndian(i11, bArr, 0);
        return bArr;
    }

    public static byte[] intToLittleEndian(int i11) {
        byte[] bArr = new byte[4];
        intToLittleEndian(i11, bArr, 0);
        return bArr;
    }

    public static void littleEndianToLong(byte[] bArr, int i11, long[] jArr, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            jArr[i12 + i14] = littleEndianToLong(bArr, i11);
            i11 += 8;
        }
    }

    public static byte[] intToBigEndian(int[] iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        intToBigEndian(iArr, bArr, 0);
        return bArr;
    }

    public static byte[] intToLittleEndian(int[] iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        intToLittleEndian(iArr, bArr, 0);
        return bArr;
    }

    public static void bigEndianToInt(byte[] bArr, int i11, int[] iArr) {
        for (int i12 = 0; i12 < iArr.length; i12++) {
            iArr[i12] = bigEndianToInt(bArr, i11);
            i11 += 4;
        }
    }

    public static void littleEndianToInt(byte[] bArr, int i11, int[] iArr) {
        for (int i12 = 0; i12 < iArr.length; i12++) {
            iArr[i12] = littleEndianToInt(bArr, i11);
            i11 += 4;
        }
    }

    public static void bigEndianToInt(byte[] bArr, int i11, int[] iArr, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            iArr[i12 + i14] = bigEndianToInt(bArr, i11);
            i11 += 4;
        }
    }

    public static void littleEndianToInt(byte[] bArr, int i11, int[] iArr, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            iArr[i12 + i14] = littleEndianToInt(bArr, i11);
            i11 += 4;
        }
    }

    public static int[] littleEndianToInt(byte[] bArr, int i11, int i12) {
        int[] iArr = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            iArr[i13] = littleEndianToInt(bArr, i11);
            i11 += 4;
        }
        return iArr;
    }
}
