package org.bouncycastle.util;

/* JADX INFO: loaded from: classes3.dex */
public class Longs {
    public static final int BYTES = 8;
    public static final int SIZE = 64;

    public static long highestOneBit(long j9) {
        return Long.highestOneBit(j9);
    }

    public static long lowestOneBit(long j9) {
        return Long.lowestOneBit(j9);
    }

    public static int numberOfLeadingZeros(long j9) {
        return Long.numberOfLeadingZeros(j9);
    }

    public static int numberOfTrailingZeros(long j9) {
        return Long.numberOfTrailingZeros(j9);
    }

    public static long reverse(long j9) {
        return Long.reverse(j9);
    }

    public static long reverseBytes(long j9) {
        return Long.reverseBytes(j9);
    }

    public static long rotateLeft(long j9, int i11) {
        return Long.rotateLeft(j9, i11);
    }

    public static long rotateRight(long j9, int i11) {
        return Long.rotateRight(j9, i11);
    }

    public static Long valueOf(long j9) {
        return Long.valueOf(j9);
    }

    public static void xorTo(int i11, long[] jArr, int i12, long[] jArr2, int i13) {
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = i13 + i14;
            jArr2[i15] = jArr2[i15] ^ jArr[i12 + i14];
        }
    }
}
