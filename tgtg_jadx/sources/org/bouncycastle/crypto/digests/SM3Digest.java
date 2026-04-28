package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class SM3Digest extends GeneralDigest {
    private static final int BLOCK_SIZE = 16;
    private static final int DIGEST_LENGTH = 32;
    private static final int[] T = new int[64];
    private int[] V;
    private int[] W;
    private int[] inwords;
    private int xOff;

    static {
        int i11;
        int i12 = 0;
        while (true) {
            if (i12 >= 16) {
                break;
            }
            T[i12] = (2043430169 >>> (32 - i12)) | (2043430169 << i12);
            i12++;
        }
        for (i11 = 16; i11 < 64; i11++) {
            int i13 = i11 % 32;
            T[i11] = (2055708042 >>> (32 - i13)) | (2055708042 << i13);
        }
    }

    public SM3Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset();
    }

    private int FF0(int i11, int i12, int i13) {
        return (i11 ^ i12) ^ i13;
    }

    private int FF1(int i11, int i12, int i13) {
        return (i11 & (i12 | i13)) | (i12 & i13);
    }

    private int GG0(int i11, int i12, int i13) {
        return (i11 ^ i12) ^ i13;
    }

    private int GG1(int i11, int i12, int i13) {
        return ((~i11) & i13) | (i12 & i11);
    }

    private int P0(int i11) {
        return (i11 ^ ((i11 << 9) | (i11 >>> 23))) ^ ((i11 << 17) | (i11 >>> 15));
    }

    private int P1(int i11) {
        return (i11 ^ ((i11 << 15) | (i11 >>> 17))) ^ ((i11 << 23) | (i11 >>> 9));
    }

    private void copyIn(SM3Digest sM3Digest) {
        int[] iArr = sM3Digest.V;
        int[] iArr2 = this.V;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = sM3Digest.inwords;
        int[] iArr4 = this.inwords;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.xOff = sM3Digest.xOff;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SM3Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 256, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        finish();
        Pack.intToBigEndian(this.V, bArr, i11);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SM3";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = 16;
            if (i12 >= 16) {
                break;
            }
            this.W[i12] = this.inwords[i12];
            i12++;
        }
        for (int i13 = 16; i13 < 68; i13++) {
            int[] iArr = this.W;
            int i14 = iArr[i13 - 3];
            int i15 = iArr[i13 - 13];
            iArr[i13] = (P1(((i14 >>> 17) | (i14 << 15)) ^ (iArr[i13 - 16] ^ iArr[i13 - 9])) ^ ((i15 >>> 25) | (i15 << 7))) ^ this.W[i13 - 6];
        }
        int[] iArr2 = this.V;
        int i16 = iArr2[0];
        int i17 = iArr2[1];
        int i18 = iArr2[2];
        char c3 = 3;
        int i19 = iArr2[3];
        char c7 = 4;
        int iP0 = iArr2[4];
        char c8 = 5;
        int i21 = iArr2[5];
        char c11 = 6;
        int i22 = iArr2[6];
        int i23 = iArr2[7];
        int i24 = i22;
        int i25 = 0;
        while (i25 < i11) {
            int i26 = (i16 << 12) | (i16 >>> 20);
            int i27 = i26 + iP0 + T[i25];
            int i28 = (i27 << 7) | (i27 >>> 25);
            char c12 = c3;
            int i29 = i28 ^ i26;
            char c13 = c7;
            int[] iArr3 = this.W;
            char c14 = c8;
            int i31 = iArr3[i25];
            int iC = a.C(FF0(i16, i17, i18), i19, i29, iArr3[i25 + 4] ^ i31);
            int iC2 = a.C(GG0(iP0, i21, i24), i23, i28, i31);
            int i32 = (i17 << 9) | (i17 >>> 23);
            int i33 = (i21 << 19) | (i21 >>> 13);
            i25++;
            i19 = i18;
            i21 = iP0;
            c7 = c13;
            c8 = c14;
            c11 = c11;
            iP0 = P0(iC2);
            i18 = i32;
            i23 = i24;
            i24 = i33;
            i11 = 16;
            i17 = i16;
            i16 = iC;
            c3 = c12;
        }
        char c15 = c3;
        char c16 = c7;
        char c17 = c8;
        char c18 = c11;
        int i34 = i23;
        int i35 = i24;
        int i36 = i16;
        int i37 = 16;
        while (i37 < 64) {
            int i38 = (i36 << 12) | (i36 >>> 20);
            int i39 = i38 + iP0 + T[i37];
            int i41 = (i39 >>> 25) | (i39 << 7);
            int[] iArr4 = this.W;
            int i42 = iArr4[i37];
            int iC3 = a.C(FF1(i36, i17, i18), i19, i38 ^ i41, iArr4[i37 + 4] ^ i42);
            int iC4 = a.C(GG1(iP0, i21, i35), i34, i41, i42);
            int i43 = (i21 << 19) | (i21 >>> 13);
            i37++;
            i19 = i18;
            i21 = iP0;
            iP0 = P0(iC4);
            i18 = (i17 >>> 23) | (i17 << 9);
            i34 = i35;
            i17 = i36;
            i36 = iC3;
            i35 = i43;
        }
        int[] iArr5 = this.V;
        iArr5[0] = i36 ^ iArr5[0];
        iArr5[1] = iArr5[1] ^ i17;
        iArr5[2] = iArr5[2] ^ i18;
        iArr5[c15] = iArr5[c15] ^ i19;
        iArr5[c16] = iArr5[c16] ^ iP0;
        iArr5[c17] = iArr5[c17] ^ i21;
        iArr5[c18] = i35 ^ iArr5[c18];
        iArr5[7] = iArr5[7] ^ i34;
        this.xOff = 0;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j9) {
        int i11 = this.xOff;
        if (i11 > 14) {
            this.inwords[i11] = 0;
            this.xOff = i11 + 1;
            processBlock();
        }
        while (true) {
            int i12 = this.xOff;
            int[] iArr = this.inwords;
            if (i12 >= 14) {
                int i13 = i12 + 1;
                this.xOff = i13;
                iArr[i12] = (int) (j9 >>> 32);
                this.xOff = i12 + 2;
                iArr[i13] = (int) j9;
                return;
            }
            iArr[i12] = 0;
            this.xOff = i12 + 1;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i11) {
        int[] iArr = this.inwords;
        int i12 = this.xOff;
        this.xOff = i12 + 1;
        iArr[i12] = Pack.bigEndianToInt(bArr, i11);
        if (this.xOff >= 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        int[] iArr = this.V;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.xOff = 0;
    }

    public SM3Digest() {
        this(CryptoServicePurpose.ANY);
    }

    public SM3Digest(SM3Digest sM3Digest) {
        super(sM3Digest);
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        copyIn(sM3Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SM3Digest sM3Digest = (SM3Digest) memoable;
        super.copyIn((GeneralDigest) sM3Digest);
        copyIn(sM3Digest);
    }
}
