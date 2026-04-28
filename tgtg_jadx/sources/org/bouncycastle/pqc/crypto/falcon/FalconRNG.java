package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
class FalconRNG {

    /* JADX INFO: renamed from: bd, reason: collision with root package name */
    byte[] f33485bd = new byte[512];
    int ptr = 0;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    byte[] f33486sd = new byte[256];

    private void QROUND(int i11, int i12, int i13, int i14, int[] iArr) {
        int i15 = iArr[i11] + iArr[i12];
        iArr[i11] = i15;
        int i16 = i15 ^ iArr[i14];
        iArr[i14] = i16;
        int i17 = (i16 >>> 16) | (i16 << 16);
        iArr[i14] = i17;
        int i18 = iArr[i13] + i17;
        iArr[i13] = i18;
        int i19 = iArr[i12] ^ i18;
        iArr[i12] = i19;
        int i21 = (i19 >>> 20) | (i19 << 12);
        iArr[i12] = i21;
        int i22 = iArr[i11] + i21;
        iArr[i11] = i22;
        int i23 = iArr[i14] ^ i22;
        iArr[i14] = i23;
        int i24 = (i23 >>> 24) | (i23 << 8);
        iArr[i14] = i24;
        int i25 = iArr[i13] + i24;
        iArr[i13] = i25;
        int i26 = iArr[i12] ^ i25;
        iArr[i12] = i26;
        iArr[i12] = (i26 >>> 25) | (i26 << 7);
    }

    public long prng_get_u64() {
        int i11 = this.ptr;
        if (i11 >= this.f33485bd.length - 9) {
            prng_refill();
            i11 = 0;
        }
        this.ptr = i11 + 8;
        return Pack.littleEndianToLong(this.f33485bd, i11);
    }

    public byte prng_get_u8() {
        byte[] bArr = this.f33485bd;
        int i11 = this.ptr;
        int i12 = i11 + 1;
        this.ptr = i12;
        byte b8 = bArr[i11];
        if (i12 == bArr.length) {
            prng_refill();
        }
        return b8;
    }

    public void prng_init(SHAKEDigest sHAKEDigest) {
        sHAKEDigest.doOutput(this.f33486sd, 0, 56);
        prng_refill();
    }

    public void prng_refill() {
        FalconRNG falconRNG = this;
        int[] iArr = {1634760805, 857760878, 2036477234, 1797285236};
        int[] iArr2 = new int[16];
        long jLittleEndianToLong = Pack.littleEndianToLong(falconRNG.f33486sd, 48);
        for (int i11 = 0; i11 < 8; i11++) {
            System.arraycopy(iArr, 0, iArr2, 0, 4);
            Pack.littleEndianToInt(falconRNG.f33486sd, 0, iArr2, 4, 12);
            int i12 = (int) jLittleEndianToLong;
            iArr2[14] = iArr2[14] ^ i12;
            int i13 = (int) (jLittleEndianToLong >>> 32);
            iArr2[15] = iArr2[15] ^ i13;
            int i14 = 0;
            while (i14 < 10) {
                falconRNG.QROUND(0, 4, 8, 12, iArr2);
                falconRNG = this;
                falconRNG.QROUND(1, 5, 9, 13, iArr2);
                falconRNG.QROUND(2, 6, 10, 14, iArr2);
                falconRNG.QROUND(3, 7, 11, 15, iArr2);
                falconRNG.QROUND(0, 5, 10, 15, iArr2);
                falconRNG.QROUND(1, 6, 11, 12, iArr2);
                falconRNG.QROUND(2, 7, 8, 13, iArr2);
                falconRNG.QROUND(3, 4, 9, 14, iArr2);
                i14++;
                i13 = i13;
            }
            int i15 = i13;
            for (int i16 = 0; i16 < 4; i16++) {
                iArr2[i16] = iArr2[i16] + iArr[i16];
            }
            for (int i17 = 4; i17 < 14; i17++) {
                iArr2[i17] = Pack.littleEndianToInt(falconRNG.f33486sd, (i17 * 4) - 16) + iArr2[i17];
            }
            iArr2[14] = iArr2[14] + (Pack.littleEndianToInt(falconRNG.f33486sd, 40) ^ i12);
            iArr2[15] = iArr2[15] + (Pack.littleEndianToInt(falconRNG.f33486sd, 44) ^ i15);
            jLittleEndianToLong++;
            for (int i18 = 0; i18 < 16; i18++) {
                Pack.intToLittleEndian(iArr2[i18], falconRNG.f33485bd, (i11 << 2) + (i18 << 5));
            }
        }
        Pack.longToLittleEndian(jLittleEndianToLong, falconRNG.f33486sd, 48);
        falconRNG.ptr = 0;
    }
}
