package org.bouncycastle.pqc.crypto.hqc;

import kotlin.jvm.internal.LongCompanionObject;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
class Utils {
    public static long bitMask(long j9, long j11) {
        return (1 << ((int) (j9 % j11))) - 1;
    }

    public static void copyBytes(int[] iArr, int i11, int[] iArr2, int i12, int i13) {
        System.arraycopy(iArr, i11, iArr2, i12, i13 / 2);
    }

    public static void fromByte16ArrayToLongArray(long[] jArr, int[] iArr) {
        for (int i11 = 0; i11 != iArr.length; i11 += 4) {
            int i12 = i11 / 4;
            long j9 = ((long) iArr[i11]) & 65535;
            jArr[i12] = j9;
            long j11 = j9 | (((long) iArr[i11 + 1]) << 16);
            jArr[i12] = j11;
            long j12 = j11 | (((long) iArr[i11 + 2]) << 32);
            jArr[i12] = j12;
            jArr[i12] = j12 | (((long) iArr[i11 + 3]) << 48);
        }
    }

    public static void fromByte32ArrayToLongArray(long[] jArr, int[] iArr) {
        for (int i11 = 0; i11 != iArr.length; i11 += 2) {
            int i12 = i11 / 2;
            long j9 = ((long) iArr[i11]) & 4294967295L;
            jArr[i12] = j9;
            jArr[i12] = j9 | (((long) iArr[i11 + 1]) << 32);
        }
    }

    public static void fromByteArrayToByte16Array(int[] iArr, byte[] bArr) {
        if (bArr.length % 2 != 0) {
            byte[] bArr2 = new byte[((bArr.length + 1) / 2) * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr = bArr2;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            iArr[i12] = Pack.littleEndianToShort(bArr, i11) & HPKE.aead_EXPORT_ONLY;
            i11 += 2;
        }
    }

    public static void fromByteArrayToLongArray(long[] jArr, byte[] bArr) {
        if (bArr.length % 8 != 0) {
            byte[] bArr2 = new byte[((bArr.length + 7) / 8) * 8];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr = bArr2;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < jArr.length; i12++) {
            jArr[i12] = Pack.littleEndianToLong(bArr, i11);
            i11 += 8;
        }
    }

    public static void fromLongArrayToByte32Array(int[] iArr, long[] jArr) {
        for (int i11 = 0; i11 != jArr.length; i11++) {
            int i12 = i11 * 2;
            long j9 = jArr[i11];
            iArr[i12] = (int) j9;
            iArr[i12 + 1] = (int) (j9 >> 32);
        }
    }

    public static void fromLongArrayToByteArray(byte[] bArr, long[] jArr) {
        int length = bArr.length / 8;
        int i11 = 0;
        for (int i12 = 0; i12 != length; i12++) {
            Pack.longToLittleEndian(jArr[i12], bArr, i12 * 8);
        }
        if (bArr.length % 8 != 0) {
            int i13 = length * 8;
            while (i13 < bArr.length) {
                bArr[i13] = (byte) (jArr[length] >>> (i11 * 8));
                i13++;
                i11++;
            }
        }
    }

    public static int getByte64SizeFromBitSize(int i11) {
        return (i11 + 63) / 64;
    }

    public static int getByteSizeFromBitSize(int i11) {
        return (i11 + 7) / 8;
    }

    public static void resizeArray(long[] jArr, int i11, long[] jArr2, int i12, int i13, int i14) {
        if (i11 >= i12) {
            System.arraycopy(jArr2, 0, jArr, 0, (i12 + 7) / 8);
            return;
        }
        int i15 = i11 % 64;
        int i16 = i15 != 0 ? 64 - i15 : 0;
        System.arraycopy(jArr2, 0, jArr, 0, i13);
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = i14 - 1;
            jArr[i18] = jArr[i18] & (LongCompanionObject.MAX_VALUE >> i17);
        }
    }

    public static int toUnsigned16Bits(int i11) {
        return i11 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
    }

    public static int toUnsigned8bits(int i11) {
        return i11 & 255;
    }

    public static void xorLongToByte16Array(int[] iArr, long j9, int i11) {
        iArr[i11] = iArr[i11] ^ (((int) j9) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        int i12 = i11 + 1;
        iArr[i12] = iArr[i12] ^ (((int) (j9 >>> 16)) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        int i13 = i11 + 2;
        iArr[i13] = iArr[i13] ^ (((int) (j9 >>> 32)) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        int i14 = i11 + 3;
        iArr[i14] = (((int) (j9 >>> 48)) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) ^ iArr[i14];
    }
}
