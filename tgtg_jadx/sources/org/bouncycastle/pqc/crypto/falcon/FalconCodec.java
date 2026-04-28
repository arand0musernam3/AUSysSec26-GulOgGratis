package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes3.dex */
class FalconCodec {
    static final byte[] max_fg_bits = {0, 8, 8, 8, 8, 8, 7, 7, 6, 6, 5};
    static final byte[] max_FG_bits = {0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};

    public static int comp_decode(short[] sArr, int i11, byte[] bArr, int i12) {
        int i13 = 1 << i11;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < i13; i17++) {
            if (i16 >= i12) {
                return 0;
            }
            i14 = (i14 << 8) | (bArr[i16] & 255);
            i16++;
            int i18 = i14 >>> i15;
            int i19 = i18 & 128;
            int i21 = i18 & 127;
            do {
                if (i15 == 0) {
                    if (i16 >= i12) {
                        return 0;
                    }
                    i14 = (i14 << 8) | (bArr[i16] & 255);
                    i16++;
                    i15 = 8;
                }
                i15--;
                if (((i14 >>> i15) & 1) == 0) {
                    i21 += 128;
                } else {
                    if (i19 != 0 && i21 == 0) {
                        return 0;
                    }
                    if (i19 != 0) {
                        i21 = -i21;
                    }
                    sArr[i17] = (short) i21;
                }
            } while (i21 <= 2047);
            return 0;
        }
        if ((((1 << i15) - 1) & i14) != 0) {
            return 0;
        }
        return i16;
    }

    public static int comp_encode(byte[] bArr, int i11, short[] sArr, int i12) {
        int i13 = 1 << i12;
        for (int i14 = 0; i14 < i13; i14++) {
            short s7 = sArr[i14];
            if (s7 < -2047 || s7 > 2047) {
                return 0;
            }
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < i13; i18++) {
            int i19 = i16 << 1;
            short s8 = sArr[i18];
            int i21 = s8;
            if (s8 < 0) {
                i19 |= 1;
                i21 = -s8;
            }
            int i22 = (i19 << 7) | (i21 & 127);
            int i23 = (i21 >>> 7) + 1;
            i16 = (i22 << i23) | 1;
            i15 = i15 + 8 + i23;
            while (i15 >= 8) {
                i15 -= 8;
                if (bArr != null) {
                    if (i17 >= i11) {
                        return 0;
                    }
                    bArr[i17] = (byte) (i16 >>> i15);
                }
                i17++;
            }
        }
        if (i15 <= 0) {
            return i17;
        }
        if (bArr != null) {
            if (i17 >= i11) {
                return 0;
            }
            bArr[i17] = (byte) (i16 << (8 - i15));
        }
        return i17 + 1;
    }

    public static int modq_decode(short[] sArr, int i11, byte[] bArr, int i12) {
        int i13 = 1 << i11;
        int i14 = ((i13 * 14) + 7) >> 3;
        if (i14 > i12) {
            return 0;
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i15 < i13) {
            int i19 = i18 + 1;
            i16 = (i16 << 8) | (bArr[i18] & 255);
            int i21 = i17 + 8;
            if (i21 >= 14) {
                i17 -= 6;
                int i22 = (i16 >>> i17) & 16383;
                if (i22 >= 12289) {
                    return 0;
                }
                sArr[i15] = (short) i22;
                i15++;
            } else {
                i17 = i21;
            }
            i18 = i19;
        }
        if ((((1 << i17) - 1) & i16) != 0) {
            return 0;
        }
        return i14;
    }

    public static int modq_encode(byte[] bArr, int i11, short[] sArr, int i12) {
        int i13 = 1;
        int i14 = 1 << i12;
        for (int i15 = 0; i15 < i14; i15++) {
            if ((65535 & sArr[i15]) >= 12289) {
                return 0;
            }
        }
        int i16 = ((i14 * 14) + 7) >> 3;
        if (bArr != null) {
            if (i16 > i11) {
                return 0;
            }
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < i14; i19++) {
                i18 = (i18 << 14) | (sArr[i19] & HPKE.aead_EXPORT_ONLY);
                i17 += 14;
                while (i17 >= 8) {
                    i17 -= 8;
                    bArr[i13] = (byte) (i18 >> i17);
                    i13++;
                }
            }
            if (i17 > 0) {
                bArr[i13] = (byte) (i18 << (8 - i17));
            }
        }
        return i16;
    }

    public static int trim_i8_decode(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) {
        int i15 = 1 << i11;
        int i16 = ((i15 * i12) + 7) >> 3;
        if (i16 > i14) {
            return 0;
        }
        int i17 = (1 << i12) - 1;
        int i18 = 1 << (i12 - 1);
        int i19 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i19 < i15) {
            int i23 = i13 + 1;
            i21 = (i21 << 8) | (bArr2[i13] & 255);
            i22 += 8;
            while (i22 >= i12 && i19 < i15) {
                i22 -= i12;
                int i24 = (i21 >>> i22) & i17;
                int i25 = i24 | (-(i24 & i18));
                if (i25 == (-i18)) {
                    return 0;
                }
                bArr[i19] = (byte) i25;
                i19++;
            }
            i13 = i23;
        }
        if ((((1 << i22) - 1) & i21) != 0) {
            return 0;
        }
        return i16;
    }

    public static int trim_i8_encode(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) {
        int i15 = 1 << i13;
        int i16 = (1 << (i14 - 1)) - 1;
        int i17 = -i16;
        for (int i18 = 0; i18 < i15; i18++) {
            int i19 = bArr2[i18];
            if (i19 < i17 || i19 > i16) {
                return 0;
            }
        }
        int i21 = ((i15 * i14) + 7) >> 3;
        if (bArr != null) {
            if (i21 > i12) {
                return 0;
            }
            int i22 = (1 << i14) - 1;
            int i23 = 0;
            int i24 = 0;
            for (int i25 = 0; i25 < i15; i25++) {
                i24 = (i24 << i14) | (bArr2[i25] & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & i22);
                i23 += i14;
                while (i23 >= 8) {
                    i23 -= 8;
                    bArr[i11] = (byte) (i24 >>> i23);
                    i11++;
                }
            }
            if (i23 > 0) {
                bArr[i11] = (byte) (i24 << (8 - i23));
            }
        }
        return i21;
    }
}
