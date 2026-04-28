package org.bouncycastle.pqc.crypto.saber;

import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
class Utils {
    private final int SABER_EP;
    private final int SABER_ET;
    private final int SABER_KEYBYTES;
    private final int SABER_L;
    private final int SABER_N;
    private final int SABER_POLYBYTES;
    private final boolean usingEffectiveMasking;

    public Utils(SABEREngine sABEREngine) {
        this.SABER_N = sABEREngine.getSABER_N();
        this.SABER_L = sABEREngine.getSABER_L();
        this.SABER_ET = sABEREngine.getSABER_ET();
        this.SABER_POLYBYTES = sABEREngine.getSABER_POLYBYTES();
        this.SABER_EP = sABEREngine.getSABER_EP();
        this.SABER_KEYBYTES = sABEREngine.getSABER_KEYBYTES();
        this.usingEffectiveMasking = sABEREngine.usingEffectiveMasking;
    }

    private void BS2POLq(byte[] bArr, int i11, short[] sArr) {
        short s7 = 0;
        if (this.usingEffectiveMasking) {
            while (s7 < this.SABER_N / 2) {
                short s8 = (short) (s7 * 2);
                int i12 = ((short) (s7 * 3)) + i11;
                int i13 = bArr[i12] & 255;
                byte b8 = bArr[i12 + 1];
                sArr[s8] = (short) (i13 | ((b8 & 15) << 8));
                sArr[s8 + 1] = (short) (((bArr[i12 + 2] & 255) << 4) | ((b8 >> 4) & 15));
                s7 = (short) (s7 + 1);
            }
            return;
        }
        while (s7 < this.SABER_N / 8) {
            short s11 = (short) (s7 * 8);
            int i14 = ((short) (s7 * 13)) + i11;
            int i15 = bArr[i14] & 255;
            byte b11 = bArr[i14 + 1];
            sArr[s11] = (short) (i15 | ((b11 & 31) << 8));
            int i16 = ((b11 >> 5) & 7) | ((bArr[i14 + 2] & 255) << 3);
            byte b12 = bArr[i14 + 3];
            sArr[s11 + 1] = (short) (i16 | ((b12 & 3) << 11));
            int i17 = (b12 >> 2) & 63;
            byte b13 = bArr[i14 + 4];
            sArr[s11 + 2] = (short) (i17 | ((b13 & ByteCompanionObject.MAX_VALUE) << 6));
            int i18 = ((b13 >> 7) & 1) | ((bArr[i14 + 5] & 255) << 1);
            byte b14 = bArr[i14 + 6];
            sArr[s11 + 3] = (short) (i18 | ((b14 & 15) << 9));
            int i19 = ((b14 >> 4) & 15) | ((bArr[i14 + 7] & 255) << 4);
            byte b15 = bArr[i14 + 8];
            sArr[s11 + 4] = (short) (i19 | ((b15 & 1) << 12));
            int i21 = (b15 >> 1) & 127;
            byte b16 = bArr[i14 + 9];
            sArr[s11 + 5] = (short) (i21 | ((b16 & 63) << 7));
            int i22 = ((b16 >> 6) & 3) | ((bArr[i14 + 10] & 255) << 2);
            byte b17 = bArr[i14 + 11];
            sArr[s11 + 6] = (short) (i22 | ((b17 & 7) << 10));
            sArr[s11 + 7] = (short) (((bArr[i14 + 12] & 255) << 5) | ((b17 >> 3) & 31));
            s7 = (short) (s7 + 1);
        }
    }

    private void POLp2BS(byte[] bArr, int i11, short[] sArr) {
        for (short s7 = 0; s7 < this.SABER_N / 4; s7 = (short) (s7 + 1)) {
            short s8 = (short) (s7 * 4);
            int i12 = ((short) (s7 * 5)) + i11;
            short s11 = sArr[s8];
            bArr[i12] = (byte) (s11 & 255);
            short s12 = sArr[s8 + 1];
            bArr[i12 + 1] = (byte) (((s11 >> 8) & 3) | ((s12 & 63) << 2));
            int i13 = (s12 >> 6) & 15;
            short s13 = sArr[s8 + 2];
            bArr[i12 + 2] = (byte) (i13 | ((s13 & 15) << 4));
            short s14 = sArr[s8 + 3];
            bArr[i12 + 3] = (byte) (((s13 >> 4) & 63) | ((s14 & 3) << 6));
            bArr[i12 + 4] = (byte) ((s14 >> 2) & 255);
        }
    }

    private void POLq2BS(byte[] bArr, int i11, short[] sArr) {
        short s7 = 0;
        if (this.usingEffectiveMasking) {
            while (s7 < this.SABER_N / 2) {
                short s8 = (short) (s7 * 2);
                int i12 = ((short) (s7 * 3)) + i11;
                short s11 = sArr[s8];
                bArr[i12] = (byte) (s11 & 255);
                short s12 = sArr[s8 + 1];
                bArr[i12 + 1] = (byte) (((s11 >> 8) & 15) | ((s12 & 15) << 4));
                bArr[i12 + 2] = (byte) ((s12 >> 4) & 255);
                s7 = (short) (s7 + 1);
            }
            return;
        }
        while (s7 < this.SABER_N / 8) {
            short s13 = (short) (s7 * 8);
            int i13 = ((short) (s7 * 13)) + i11;
            short s14 = sArr[s13];
            bArr[i13] = (byte) (s14 & 255);
            short s15 = sArr[s13 + 1];
            bArr[i13 + 1] = (byte) (((s14 >> 8) & 31) | ((s15 & 7) << 5));
            bArr[i13 + 2] = (byte) ((s15 >> 3) & 255);
            int i14 = (s15 >> 11) & 3;
            short s16 = sArr[s13 + 2];
            bArr[i13 + 3] = (byte) (i14 | ((s16 & 63) << 2));
            int i15 = (s16 >> 6) & 127;
            short s17 = sArr[s13 + 3];
            bArr[i13 + 4] = (byte) (i15 | ((s17 & 1) << 7));
            bArr[i13 + 5] = (byte) ((s17 >> 1) & 255);
            int i16 = (s17 >> 9) & 15;
            short s18 = sArr[s13 + 4];
            bArr[i13 + 6] = (byte) (i16 | ((s18 & 15) << 4));
            bArr[i13 + 7] = (byte) ((s18 >> 4) & 255);
            int i17 = (s18 >> 12) & 1;
            short s19 = sArr[s13 + 5];
            bArr[i13 + 8] = (byte) (i17 | ((s19 & 127) << 1));
            int i18 = (s19 >> 7) & 63;
            short s21 = sArr[s13 + 6];
            bArr[i13 + 9] = (byte) (i18 | ((s21 & 3) << 6));
            bArr[i13 + 10] = (byte) ((s21 >> 2) & 255);
            short s22 = sArr[s13 + 7];
            bArr[i13 + 11] = (byte) (((s21 >> 10) & 7) | ((s22 & 31) << 3));
            bArr[i13 + 12] = (byte) ((s22 >> 5) & 255);
            s7 = (short) (s7 + 1);
        }
    }

    public void BS2POLT(byte[] bArr, int i11, short[] sArr) {
        int i12 = this.SABER_ET;
        short s7 = 0;
        if (i12 == 3) {
            while (s7 < this.SABER_N / 8) {
                short s8 = (short) (s7 * 8);
                int i13 = ((short) (s7 * 3)) + i11;
                byte b8 = bArr[i13];
                sArr[s8] = (short) (b8 & 7);
                sArr[s8 + 1] = (short) ((b8 >> 3) & 7);
                byte b11 = bArr[i13 + 1];
                sArr[s8 + 2] = (short) (((b8 >> 6) & 3) | ((b11 & 1) << 2));
                sArr[s8 + 3] = (short) ((b11 >> 1) & 7);
                sArr[s8 + 4] = (short) ((b11 >> 4) & 7);
                byte b12 = bArr[i13 + 2];
                sArr[s8 + 5] = (short) (((b11 >> 7) & 1) | ((b12 & 3) << 1));
                sArr[s8 + 6] = (short) ((b12 >> 2) & 7);
                sArr[s8 + 7] = (short) ((b12 >> 5) & 7);
                s7 = (short) (s7 + 1);
            }
            return;
        }
        if (i12 == 4) {
            while (s7 < this.SABER_N / 2) {
                short s11 = (short) (s7 * 2);
                byte b13 = bArr[i11 + s7];
                sArr[s11] = (short) (b13 & 15);
                sArr[s11 + 1] = (short) ((b13 >> 4) & 15);
                s7 = (short) (s7 + 1);
            }
            return;
        }
        if (i12 == 6) {
            while (s7 < this.SABER_N / 4) {
                short s12 = (short) (s7 * 4);
                int i14 = ((short) (s7 * 3)) + i11;
                byte b14 = bArr[i14];
                sArr[s12] = (short) (b14 & 63);
                byte b15 = bArr[i14 + 1];
                sArr[s12 + 1] = (short) (((b14 >> 6) & 3) | ((b15 & 15) << 2));
                byte b16 = bArr[i14 + 2];
                sArr[s12 + 2] = (short) (((b15 & 255) >> 4) | ((b16 & 3) << 4));
                sArr[s12 + 3] = (short) ((b16 & 255) >> 2);
                s7 = (short) (s7 + 1);
            }
        }
    }

    public void BS2POLVECp(byte[] bArr, short[][] sArr) {
        for (byte b8 = 0; b8 < this.SABER_L; b8 = (byte) (b8 + 1)) {
            BS2POLp(bArr, ((this.SABER_EP * this.SABER_N) / 8) * b8, sArr[b8]);
        }
    }

    public void BS2POLVECq(byte[] bArr, int i11, short[][] sArr) {
        for (byte b8 = 0; b8 < this.SABER_L; b8 = (byte) (b8 + 1)) {
            BS2POLq(bArr, (this.SABER_POLYBYTES * b8) + i11, sArr[b8]);
        }
    }

    public void BS2POLmsg(byte[] bArr, short[] sArr) {
        for (byte b8 = 0; b8 < this.SABER_KEYBYTES; b8 = (byte) (b8 + 1)) {
            for (byte b11 = 0; b11 < 8; b11 = (byte) (b11 + 1)) {
                sArr[(b8 * 8) + b11] = (short) ((bArr[b8] >> b11) & 1);
            }
        }
    }

    public void BS2POLp(byte[] bArr, int i11, short[] sArr) {
        for (short s7 = 0; s7 < this.SABER_N / 4; s7 = (short) (s7 + 1)) {
            short s8 = (short) (s7 * 4);
            int i12 = ((short) (s7 * 5)) + i11;
            int i13 = bArr[i12] & 255;
            byte b8 = bArr[i12 + 1];
            sArr[s8] = (short) (i13 | ((b8 & 3) << 8));
            byte b11 = bArr[i12 + 2];
            sArr[s8 + 1] = (short) (((b8 >> 2) & 63) | ((b11 & 15) << 6));
            int i14 = (b11 >> 4) & 15;
            byte b12 = bArr[i12 + 3];
            sArr[s8 + 2] = (short) (i14 | ((b12 & 63) << 4));
            sArr[s8 + 3] = (short) (((bArr[i12 + 4] & 255) << 2) | ((b12 >> 6) & 3));
        }
    }

    public void POLT2BS(byte[] bArr, int i11, short[] sArr) {
        int i12 = this.SABER_ET;
        short s7 = 0;
        if (i12 == 3) {
            while (s7 < this.SABER_N / 8) {
                short s8 = (short) (s7 * 8);
                int i13 = ((short) (s7 * 3)) + i11;
                int i14 = (sArr[s8] & 7) | ((sArr[s8 + 1] & 7) << 3);
                short s11 = sArr[s8 + 2];
                bArr[i13] = (byte) (i14 | ((s11 & 3) << 6));
                int i15 = ((s11 >> 2) & 1) | ((sArr[s8 + 3] & 7) << 1) | ((sArr[s8 + 4] & 7) << 4);
                short s12 = sArr[s8 + 5];
                bArr[i13 + 1] = (byte) (i15 | ((s12 & 1) << 7));
                bArr[i13 + 2] = (byte) (((sArr[s8 + 7] & 7) << 5) | ((s12 >> 1) & 3) | ((sArr[s8 + 6] & 7) << 2));
                s7 = (short) (s7 + 1);
            }
            return;
        }
        if (i12 == 4) {
            while (s7 < this.SABER_N / 2) {
                short s13 = (short) (s7 * 2);
                bArr[i11 + s7] = (byte) (((sArr[s13 + 1] & 15) << 4) | (sArr[s13] & 15));
                s7 = (short) (s7 + 1);
            }
            return;
        }
        if (i12 == 6) {
            while (s7 < this.SABER_N / 4) {
                short s14 = (short) (s7 * 4);
                int i16 = ((short) (s7 * 3)) + i11;
                int i17 = sArr[s14] & 63;
                short s15 = sArr[s14 + 1];
                bArr[i16] = (byte) (i17 | ((s15 & 3) << 6));
                short s16 = sArr[s14 + 2];
                bArr[i16 + 1] = (byte) (((s15 >> 2) & 15) | ((s16 & 15) << 4));
                bArr[i16 + 2] = (byte) (((sArr[s14 + 3] & 63) << 2) | ((s16 >> 4) & 3));
                s7 = (short) (s7 + 1);
            }
        }
    }

    public void POLVECp2BS(byte[] bArr, short[][] sArr) {
        for (byte b8 = 0; b8 < this.SABER_L; b8 = (byte) (b8 + 1)) {
            POLp2BS(bArr, ((this.SABER_EP * this.SABER_N) / 8) * b8, sArr[b8]);
        }
    }

    public void POLVECq2BS(byte[] bArr, short[][] sArr) {
        for (byte b8 = 0; b8 < this.SABER_L; b8 = (byte) (b8 + 1)) {
            POLq2BS(bArr, this.SABER_POLYBYTES * b8, sArr[b8]);
        }
    }

    public void POLmsg2BS(byte[] bArr, short[] sArr) {
        for (byte b8 = 0; b8 < this.SABER_KEYBYTES; b8 = (byte) (b8 + 1)) {
            for (byte b11 = 0; b11 < 8; b11 = (byte) (b11 + 1)) {
                bArr[b8] = (byte) (bArr[b8] | ((sArr[(b8 * 8) + b11] & 1) << b11));
            }
        }
    }
}
