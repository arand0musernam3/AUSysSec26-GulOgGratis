package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class SHA1Digest extends GeneralDigest implements EncodableDigest {
    private static final int DIGEST_LENGTH = 20;
    private static final int Y1 = 1518500249;
    private static final int Y2 = 1859775393;
    private static final int Y3 = -1894007588;
    private static final int Y4 = -899497514;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int H5;
    private int[] X;
    private int xOff;

    public SHA1Digest(byte[] bArr) {
        super(bArr);
        this.X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        this.H1 = Pack.bigEndianToInt(bArr, 16);
        this.H2 = Pack.bigEndianToInt(bArr, 20);
        this.H3 = Pack.bigEndianToInt(bArr, 24);
        this.H4 = Pack.bigEndianToInt(bArr, 28);
        this.H5 = Pack.bigEndianToInt(bArr, 32);
        this.xOff = Pack.bigEndianToInt(bArr, 36);
        for (int i11 = 0; i11 != this.xOff; i11++) {
            this.X[i11] = Pack.bigEndianToInt(bArr, (i11 * 4) + 40);
        }
    }

    private void copyIn(SHA1Digest sHA1Digest) {
        this.H1 = sHA1Digest.H1;
        this.H2 = sHA1Digest.H2;
        this.H3 = sHA1Digest.H3;
        this.H4 = sHA1Digest.H4;
        this.H5 = sHA1Digest.H5;
        int[] iArr = sHA1Digest.X;
        System.arraycopy(iArr, 0, this.X, 0, iArr.length);
        this.xOff = sHA1Digest.xOff;
    }

    private int f(int i11, int i12, int i13) {
        return ((~i11) & i13) | (i12 & i11);
    }

    private int g(int i11, int i12, int i13) {
        return (i11 & (i12 | i13)) | (i12 & i13);
    }

    private int h(int i11, int i12, int i13) {
        return (i11 ^ i12) ^ i13;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA1Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 128, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        finish();
        Pack.intToBigEndian(this.H1, bArr, i11);
        Pack.intToBigEndian(this.H2, bArr, i11 + 4);
        Pack.intToBigEndian(this.H3, bArr, i11 + 8);
        Pack.intToBigEndian(this.H4, bArr, i11 + 12);
        Pack.intToBigEndian(this.H5, bArr, i11 + 16);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return McElieceCCA2KeyGenParameterSpec.SHA1;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        int i11 = this.xOff * 4;
        byte[] bArr = new byte[i11 + 41];
        super.populateState(bArr);
        Pack.intToBigEndian(this.H1, bArr, 16);
        Pack.intToBigEndian(this.H2, bArr, 20);
        Pack.intToBigEndian(this.H3, bArr, 24);
        Pack.intToBigEndian(this.H4, bArr, 28);
        Pack.intToBigEndian(this.H5, bArr, 32);
        Pack.intToBigEndian(this.xOff, bArr, 36);
        for (int i12 = 0; i12 != this.xOff; i12++) {
            Pack.intToBigEndian(this.X[i12], bArr, (i12 * 4) + 40);
        }
        bArr[i11 + 40] = (byte) this.purpose.ordinal();
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        for (int i11 = 16; i11 < 80; i11++) {
            int[] iArr = this.X;
            int i12 = ((iArr[i11 - 3] ^ iArr[i11 - 8]) ^ iArr[i11 - 14]) ^ iArr[i11 - 16];
            iArr[i11] = (i12 >>> 31) | (i12 << 1);
        }
        int iC = this.H1;
        int iC2 = this.H2;
        int i13 = this.H3;
        int i14 = this.H4;
        int i15 = this.H5;
        int i16 = 0;
        for (int i17 = 0; i17 < 4; i17++) {
            int iC3 = a.C(((iC << 5) | (iC >>> 27)) + f(iC2, i13, i14), this.X[i16], Y1, i15);
            int i18 = (iC2 >>> 2) | (iC2 << 30);
            int iC4 = a.C(((iC3 << 5) | (iC3 >>> 27)) + f(iC, i18, i13), this.X[i16 + 1], Y1, i14);
            int i19 = (iC >>> 2) | (iC << 30);
            int iC5 = a.C(((iC4 << 5) | (iC4 >>> 27)) + f(iC3, i19, i18), this.X[i16 + 2], Y1, i13);
            i15 = (iC3 >>> 2) | (iC3 << 30);
            int i21 = i16 + 4;
            iC2 = a.C(((iC5 << 5) | (iC5 >>> 27)) + f(iC4, i15, i19), this.X[i16 + 3], Y1, i18);
            i14 = (iC4 >>> 2) | (iC4 << 30);
            i16 += 5;
            iC = a.C(((iC2 << 5) | (iC2 >>> 27)) + f(iC5, i14, i15), this.X[i21], Y1, i19);
            i13 = (iC5 >>> 2) | (iC5 << 30);
        }
        for (int i22 = 0; i22 < 4; i22++) {
            int iC6 = a.C(((iC << 5) | (iC >>> 27)) + h(iC2, i13, i14), this.X[i16], Y2, i15);
            int i23 = (iC2 >>> 2) | (iC2 << 30);
            int iC7 = a.C(((iC6 << 5) | (iC6 >>> 27)) + h(iC, i23, i13), this.X[i16 + 1], Y2, i14);
            int i24 = (iC >>> 2) | (iC << 30);
            int iC8 = a.C(((iC7 << 5) | (iC7 >>> 27)) + h(iC6, i24, i23), this.X[i16 + 2], Y2, i13);
            i15 = (iC6 >>> 2) | (iC6 << 30);
            int i25 = i16 + 4;
            iC2 = a.C(((iC8 << 5) | (iC8 >>> 27)) + h(iC7, i15, i24), this.X[i16 + 3], Y2, i23);
            i14 = (iC7 >>> 2) | (iC7 << 30);
            i16 += 5;
            iC = a.C(((iC2 << 5) | (iC2 >>> 27)) + h(iC8, i14, i15), this.X[i25], Y2, i24);
            i13 = (iC8 >>> 2) | (iC8 << 30);
        }
        for (int i26 = 0; i26 < 4; i26++) {
            int iC9 = a.C(((iC << 5) | (iC >>> 27)) + g(iC2, i13, i14), this.X[i16], Y3, i15);
            int i27 = (iC2 >>> 2) | (iC2 << 30);
            int iC10 = a.C(((iC9 << 5) | (iC9 >>> 27)) + g(iC, i27, i13), this.X[i16 + 1], Y3, i14);
            int i28 = (iC >>> 2) | (iC << 30);
            int iC11 = a.C(((iC10 << 5) | (iC10 >>> 27)) + g(iC9, i28, i27), this.X[i16 + 2], Y3, i13);
            i15 = (iC9 >>> 2) | (iC9 << 30);
            int i29 = i16 + 4;
            iC2 = a.C(((iC11 << 5) | (iC11 >>> 27)) + g(iC10, i15, i28), this.X[i16 + 3], Y3, i27);
            i14 = (iC10 >>> 2) | (iC10 << 30);
            i16 += 5;
            iC = a.C(((iC2 << 5) | (iC2 >>> 27)) + g(iC11, i14, i15), this.X[i29], Y3, i28);
            i13 = (iC11 >>> 2) | (iC11 << 30);
        }
        for (int i31 = 0; i31 <= 3; i31++) {
            int iC12 = a.C(((iC << 5) | (iC >>> 27)) + h(iC2, i13, i14), this.X[i16], Y4, i15);
            int i32 = (iC2 >>> 2) | (iC2 << 30);
            int iC13 = a.C(((iC12 << 5) | (iC12 >>> 27)) + h(iC, i32, i13), this.X[i16 + 1], Y4, i14);
            int i33 = (iC >>> 2) | (iC << 30);
            int iC14 = a.C(((iC13 << 5) | (iC13 >>> 27)) + h(iC12, i33, i32), this.X[i16 + 2], Y4, i13);
            i15 = (iC12 >>> 2) | (iC12 << 30);
            int i34 = i16 + 4;
            iC2 = a.C(((iC14 << 5) | (iC14 >>> 27)) + h(iC13, i15, i33), this.X[i16 + 3], Y4, i32);
            i14 = (iC13 >>> 2) | (iC13 << 30);
            i16 += 5;
            iC = a.C(((iC2 << 5) | (iC2 >>> 27)) + h(iC14, i14, i15), this.X[i34], Y4, i33);
            i13 = (iC14 >>> 2) | (iC14 << 30);
        }
        this.H1 += iC;
        this.H2 += iC2;
        this.H3 += i13;
        this.H4 += i14;
        this.H5 += i15;
        this.xOff = 0;
        for (int i35 = 0; i35 < 16; i35++) {
            this.X[i35] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j9) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.X;
        iArr[14] = (int) (j9 >>> 32);
        iArr[15] = (int) j9;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i11) {
        this.X[this.xOff] = Pack.bigEndianToInt(bArr, i11);
        int i12 = this.xOff + 1;
        this.xOff = i12;
        if (i12 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.H1 = 1732584193;
        this.H2 = -271733879;
        this.H3 = -1732584194;
        this.H4 = 271733878;
        this.H5 = -1009589776;
        this.xOff = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.X;
            if (i11 == iArr.length) {
                return;
            }
            iArr[i11] = 0;
            i11++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SHA1Digest sHA1Digest = (SHA1Digest) memoable;
        super.copyIn((GeneralDigest) sHA1Digest);
        copyIn(sHA1Digest);
    }

    public SHA1Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset();
    }

    public SHA1Digest(SHA1Digest sHA1Digest) {
        super(sHA1Digest);
        this.X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        copyIn(sHA1Digest);
    }

    public SHA1Digest() {
        this(CryptoServicePurpose.ANY);
    }
}
