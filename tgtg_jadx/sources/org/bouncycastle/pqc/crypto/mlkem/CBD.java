package org.bouncycastle.pqc.crypto.mlkem;

/* JADX INFO: loaded from: classes3.dex */
final class CBD {
    private static long convertByteTo24BitUnsignedInt(byte[] bArr, int i11) {
        return (((long) (bArr[i11 + 2] & 255)) << 16) | ((long) (bArr[i11] & 255)) | (((long) (bArr[i11 + 1] & 255)) << 8);
    }

    private static long convertByteTo32BitUnsignedInt(byte[] bArr, int i11) {
        return (((long) (bArr[i11 + 3] & 255)) << 24) | ((long) (bArr[i11] & 255)) | (((long) (bArr[i11 + 1] & 255)) << 8) | (((long) (bArr[i11 + 2] & 255)) << 16);
    }

    public static void mlkemCBD(Poly poly, byte[] bArr, int i11) {
        if (i11 != 3) {
            for (int i12 = 0; i12 < 32; i12++) {
                long jConvertByteTo32BitUnsignedInt = convertByteTo32BitUnsignedInt(bArr, i12 * 4);
                long j9 = (jConvertByteTo32BitUnsignedInt & 1431655765) + ((jConvertByteTo32BitUnsignedInt >> 1) & 1431655765);
                for (int i13 = 0; i13 < 8; i13++) {
                    int i14 = i13 * 4;
                    poly.setCoeffIndex((i12 * 8) + i13, (short) (((short) ((j9 >> i14) & 3)) - ((short) (3 & (j9 >> (i14 + i11))))));
                }
            }
            return;
        }
        for (int i15 = 0; i15 < 64; i15++) {
            long jConvertByteTo24BitUnsignedInt = convertByteTo24BitUnsignedInt(bArr, i15 * 3);
            long j11 = (jConvertByteTo24BitUnsignedInt & 2396745) + ((jConvertByteTo24BitUnsignedInt >> 1) & 2396745) + ((jConvertByteTo24BitUnsignedInt >> 2) & 2396745);
            for (int i16 = 0; i16 < 4; i16++) {
                int i17 = i16 * 6;
                poly.setCoeffIndex((i15 * 4) + i16, (short) (((short) ((j11 >> i17) & 7)) - ((short) (7 & (j11 >> (i17 + 3))))));
            }
        }
    }
}
