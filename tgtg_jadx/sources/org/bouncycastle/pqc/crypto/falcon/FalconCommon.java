package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.crypto.digests.SHAKEDigest;

/* JADX INFO: loaded from: classes3.dex */
class FalconCommon {
    static final int[] l2bound = {0, 101498, 208714, 428865, 892039, 1852696, 3842630, 7959734, 16468416, 34034726, 70265242};

    public static void hash_to_point_vartime(SHAKEDigest sHAKEDigest, short[] sArr, int i11) {
        int i12 = 1 << i11;
        byte[] bArr = new byte[2];
        int i13 = 0;
        while (i12 > 0) {
            sHAKEDigest.doOutput(bArr, 0, 2);
            int i14 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            if (i14 < 61445) {
                sArr[i13] = (short) (i14 % 12289);
                i12--;
                i13++;
            }
        }
    }

    public static int is_short(short[] sArr, int i11, short[] sArr2, int i12) {
        int i13 = 1 << i12;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < i13) {
            short s7 = sArr[i11 + i14];
            int i17 = (s7 * s7) + i15;
            int i18 = i16 | i17;
            short s8 = sArr2[i14];
            int i19 = (s8 * s8) + i17;
            i14++;
            i16 = i18 | i19;
            i15 = i19;
        }
        return (((long) ((-(i16 >>> 31)) | i15)) & 4294967295L) <= ((long) l2bound[i12]) ? 1 : 0;
    }

    public static int is_short_half(int i11, short[] sArr, int i12) {
        int i13 = 1 << i12;
        int i14 = -(i11 >>> 31);
        for (int i15 = 0; i15 < i13; i15++) {
            short s7 = sArr[i15];
            i11 += s7 * s7;
            i14 |= i11;
        }
        return (((long) (i11 | (-(i14 >>> 31)))) & 4294967295L) <= ((long) l2bound[i12]) ? 1 : 0;
    }
}
