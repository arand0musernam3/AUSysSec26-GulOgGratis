package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
class Utils {
    public static short bitrev(short s7, int i11) {
        short s8 = (short) (((s7 & 65280) >> 8) | ((s7 & 255) << 8));
        short s11 = (short) (((s8 & 61680) >> 4) | ((s8 & 3855) << 4));
        short s12 = (short) (((s11 & 52428) >> 2) | ((s11 & 13107) << 2));
        short s13 = (short) (((s12 & 43690) >> 1) | ((s12 & 21845) << 1));
        return (short) (i11 == 12 ? s13 >> 4 : s13 >> 3);
    }

    public static int load4(byte[] bArr, int i11) {
        return Pack.littleEndianToInt(bArr, i11);
    }

    public static long load8(byte[] bArr, int i11) {
        return Pack.littleEndianToLong(bArr, i11);
    }

    public static short load_gf(byte[] bArr, int i11, int i12) {
        return (short) (Pack.littleEndianToShort(bArr, i11) & i12);
    }

    public static void store8(byte[] bArr, int i11, long j9) {
        bArr[i11] = (byte) (j9 & 255);
        bArr[i11 + 1] = (byte) ((j9 >> 8) & 255);
        bArr[i11 + 2] = (byte) ((j9 >> 16) & 255);
        bArr[i11 + 3] = (byte) ((j9 >> 24) & 255);
        bArr[i11 + 4] = (byte) ((j9 >> 32) & 255);
        bArr[i11 + 5] = (byte) ((j9 >> 40) & 255);
        bArr[i11 + 6] = (byte) ((j9 >> 48) & 255);
        bArr[i11 + 7] = (byte) ((j9 >> 56) & 255);
    }

    public static void store_gf(byte[] bArr, int i11, short s7) {
        bArr[i11] = (byte) (s7 & 255);
        bArr[i11 + 1] = (byte) (s7 >> 8);
    }
}
