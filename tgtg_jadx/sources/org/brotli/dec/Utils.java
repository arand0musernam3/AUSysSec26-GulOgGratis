package org.brotli.dec;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
final class Utils {
    private static final byte[] BYTE_ZEROES = new byte[1024];
    private static final int[] INT_ZEROES = new int[1024];

    public static void fillWithZeroes(byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12) {
            int iMin = Math.min(i13 + 1024, i12) - i13;
            System.arraycopy(BYTE_ZEROES, 0, bArr, i11 + i13, iMin);
            i13 += iMin;
        }
    }

    public static void fillWithZeroes(int[] iArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12) {
            int iMin = Math.min(i13 + 1024, i12) - i13;
            System.arraycopy(INT_ZEROES, 0, iArr, i11 + i13, iMin);
            i13 += iMin;
        }
    }
}
