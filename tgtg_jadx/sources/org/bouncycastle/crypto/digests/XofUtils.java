package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class XofUtils {
    public static byte[] encode(byte[] bArr, int i11, int i12) {
        return bArr.length == i12 ? Arrays.concatenate(leftEncode(i12 * 8), bArr) : Arrays.concatenate(leftEncode(i12 * 8), Arrays.copyOfRange(bArr, i11, i12 + i11));
    }

    public static byte[] leftEncode(long j9) {
        long j11 = j9;
        byte b8 = 1;
        while (true) {
            j11 >>= 8;
            if (j11 == 0) {
                break;
            }
            b8 = (byte) (b8 + 1);
        }
        byte[] bArr = new byte[b8 + 1];
        bArr[0] = b8;
        for (int i11 = 1; i11 <= b8; i11++) {
            bArr[i11] = (byte) (j9 >> ((b8 - i11) * 8));
        }
        return bArr;
    }

    public static byte[] rightEncode(long j9) {
        long j11 = j9;
        byte b8 = 1;
        while (true) {
            j11 >>= 8;
            if (j11 == 0) {
                break;
            }
            b8 = (byte) (b8 + 1);
        }
        byte[] bArr = new byte[b8 + 1];
        bArr[b8] = b8;
        for (int i11 = 0; i11 < b8; i11++) {
            bArr[i11] = (byte) (j9 >> (((b8 - i11) - 1) * 8));
        }
        return bArr;
    }

    public static byte[] encode(byte b8) {
        return Arrays.concatenate(leftEncode(8L), new byte[]{b8});
    }
}
