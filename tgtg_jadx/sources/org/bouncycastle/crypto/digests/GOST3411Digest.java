package org.bouncycastle.crypto.digests;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.engines.GOST28147Engine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class GOST3411Digest implements ExtendedDigest, Memoable {
    private static final byte[] C2 = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};
    private static final int DIGEST_LENGTH = 32;
    private byte[][] C;
    private byte[] H;
    private byte[] K;
    private byte[] L;
    private byte[] M;
    byte[] S;
    private byte[] Sum;
    byte[] U;
    byte[] V;
    byte[] W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    byte[] f33061a;
    private long byteCount;
    private BlockCipher cipher;
    private final CryptoServicePurpose purpose;
    private byte[] sBox;
    short[] wS;
    short[] w_S;
    private byte[] xBuf;
    private int xBufOff;

    public GOST3411Digest(CryptoServicePurpose cryptoServicePurpose) {
        this.H = new byte[32];
        this.L = new byte[32];
        this.M = new byte[32];
        this.Sum = new byte[32];
        this.C = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.xBuf = new byte[32];
        this.cipher = new GOST28147Engine();
        this.K = new byte[32];
        this.f33061a = new byte[8];
        this.wS = new short[16];
        this.w_S = new short[16];
        this.S = new byte[32];
        this.U = new byte[32];
        this.V = new byte[32];
        this.W = new byte[32];
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        byte[] sBox = GOST28147Engine.getSBox("D-A");
        this.sBox = sBox;
        this.cipher.init(true, new ParametersWithSBox(null, sBox));
        reset();
    }

    private byte[] A(byte[] bArr) {
        for (int i11 = 0; i11 < 8; i11++) {
            this.f33061a[i11] = (byte) (bArr[i11] ^ bArr[i11 + 8]);
        }
        System.arraycopy(bArr, 8, bArr, 0, 24);
        System.arraycopy(this.f33061a, 0, bArr, 24, 8);
        return bArr;
    }

    private void E(byte[] bArr, byte[] bArr2, int i11, byte[] bArr3, int i12) {
        this.cipher.init(true, new KeyParameter(bArr));
        this.cipher.processBlock(bArr3, i12, bArr2, i11);
    }

    private byte[] P(byte[] bArr) {
        int i11 = 0;
        while (true) {
            byte[] bArr2 = this.K;
            if (i11 >= 8) {
                return bArr2;
            }
            int i12 = i11 * 4;
            bArr2[i12] = bArr[i11];
            bArr2[i12 + 1] = bArr[i11 + 8];
            bArr2[i12 + 2] = bArr[i11 + 16];
            bArr2[i12 + 3] = bArr[i11 + 24];
            i11++;
        }
    }

    private void cpyBytesToShort(byte[] bArr, short[] sArr) {
        for (int i11 = 0; i11 < bArr.length / 2; i11++) {
            int i12 = i11 * 2;
            sArr[i11] = (short) ((bArr[i12] & 255) | ((bArr[i12 + 1] << 8) & 65280));
        }
    }

    private void cpyShortToBytes(short[] sArr, byte[] bArr) {
        for (int i11 = 0; i11 < bArr.length / 2; i11++) {
            int i12 = i11 * 2;
            short s7 = sArr[i11];
            bArr[i12 + 1] = (byte) (s7 >> 8);
            bArr[i12] = (byte) s7;
        }
    }

    private void finish() {
        Pack.longToLittleEndian(this.byteCount * 8, this.L, 0);
        while (this.xBufOff != 0) {
            update((byte) 0);
        }
        processBlock(this.L, 0);
        processBlock(this.Sum, 0);
    }

    private void fw(byte[] bArr) {
        cpyBytesToShort(bArr, this.wS);
        short[] sArr = this.w_S;
        short[] sArr2 = this.wS;
        sArr[15] = (short) (((((sArr2[0] ^ sArr2[1]) ^ sArr2[2]) ^ sArr2[3]) ^ sArr2[12]) ^ sArr2[15]);
        System.arraycopy(sArr2, 1, sArr, 0, 15);
        cpyShortToBytes(this.w_S, bArr);
    }

    private void sumByteArray(byte[] bArr) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr2 = this.Sum;
            if (i11 == bArr2.length) {
                return;
            }
            int i13 = (bArr2[i11] & 255) + (bArr[i11] & 255) + i12;
            bArr2[i11] = (byte) i13;
            i12 = i13 >>> 8;
            i11++;
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new GOST3411Digest(this);
    }

    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 256, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        finish();
        byte[] bArr2 = this.H;
        System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "GOST3411";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    public void processBlock(byte[] bArr, int i11) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        System.arraycopy(bArr, i11, this.M, 0, 32);
        System.arraycopy(this.H, 0, this.U, 0, 32);
        System.arraycopy(this.M, 0, this.V, 0, 32);
        int i12 = 0;
        while (true) {
            bArr2 = this.W;
            if (i12 >= 32) {
                break;
            }
            bArr2[i12] = (byte) (this.U[i12] ^ this.V[i12]);
            i12++;
        }
        E(P(bArr2), this.S, 0, this.H, 0);
        for (int i13 = 1; i13 < 4; i13++) {
            byte[] bArrA = A(this.U);
            for (int i14 = 0; i14 < 32; i14++) {
                this.U[i14] = (byte) (bArrA[i14] ^ this.C[i13][i14]);
            }
            this.V = A(A(this.V));
            int i15 = 0;
            while (true) {
                bArr4 = this.W;
                if (i15 < 32) {
                    bArr4[i15] = (byte) (this.U[i15] ^ this.V[i15]);
                    i15++;
                }
            }
            int i16 = i13 * 8;
            E(P(bArr4), this.S, i16, this.H, i16);
        }
        for (int i17 = 0; i17 < 12; i17++) {
            fw(this.S);
        }
        int i18 = 0;
        while (true) {
            bArr3 = this.S;
            if (i18 >= 32) {
                break;
            }
            bArr3[i18] = (byte) (bArr3[i18] ^ this.M[i18]);
            i18++;
        }
        fw(bArr3);
        for (int i19 = 0; i19 < 32; i19++) {
            byte[] bArr5 = this.S;
            bArr5[i19] = (byte) (this.H[i19] ^ bArr5[i19]);
        }
        int i21 = 0;
        while (true) {
            byte[] bArr6 = this.S;
            if (i21 >= 61) {
                byte[] bArr7 = this.H;
                System.arraycopy(bArr6, 0, bArr7, 0, bArr7.length);
                return;
            } else {
                fw(bArr6);
                i21++;
            }
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        GOST3411Digest gOST3411Digest = (GOST3411Digest) memoable;
        byte[] bArr = gOST3411Digest.sBox;
        this.sBox = bArr;
        this.cipher.init(true, new ParametersWithSBox(null, bArr));
        reset();
        byte[] bArr2 = gOST3411Digest.H;
        System.arraycopy(bArr2, 0, this.H, 0, bArr2.length);
        byte[] bArr3 = gOST3411Digest.L;
        System.arraycopy(bArr3, 0, this.L, 0, bArr3.length);
        byte[] bArr4 = gOST3411Digest.M;
        System.arraycopy(bArr4, 0, this.M, 0, bArr4.length);
        byte[] bArr5 = gOST3411Digest.Sum;
        System.arraycopy(bArr5, 0, this.Sum, 0, bArr5.length);
        byte[] bArr6 = gOST3411Digest.C[1];
        System.arraycopy(bArr6, 0, this.C[1], 0, bArr6.length);
        byte[] bArr7 = gOST3411Digest.C[2];
        System.arraycopy(bArr7, 0, this.C[2], 0, bArr7.length);
        byte[] bArr8 = gOST3411Digest.C[3];
        System.arraycopy(bArr8, 0, this.C[3], 0, bArr8.length);
        byte[] bArr9 = gOST3411Digest.xBuf;
        System.arraycopy(bArr9, 0, this.xBuf, 0, bArr9.length);
        this.xBufOff = gOST3411Digest.xBufOff;
        this.byteCount = gOST3411Digest.byteCount;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i11, int i12) {
        while (this.xBufOff != 0 && i12 > 0) {
            update(bArr[i11]);
            i11++;
            i12--;
        }
        while (true) {
            byte[] bArr2 = this.xBuf;
            if (i12 < bArr2.length) {
                break;
            }
            System.arraycopy(bArr, i11, bArr2, 0, bArr2.length);
            sumByteArray(this.xBuf);
            processBlock(this.xBuf, 0);
            byte[] bArr3 = this.xBuf;
            i11 += bArr3.length;
            i12 -= bArr3.length;
            this.byteCount += (long) bArr3.length;
        }
        while (i12 > 0) {
            update(bArr[i11]);
            i11++;
            i12--;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b8) {
        byte[] bArr = this.xBuf;
        int i11 = this.xBufOff;
        int i12 = i11 + 1;
        this.xBufOff = i12;
        bArr[i11] = b8;
        if (i12 == bArr.length) {
            sumByteArray(bArr);
            processBlock(this.xBuf, 0);
            this.xBufOff = 0;
        }
        this.byteCount++;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.byteCount = 0L;
        this.xBufOff = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.H;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = 0;
            i11++;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr2 = this.L;
            if (i12 >= bArr2.length) {
                break;
            }
            bArr2[i12] = 0;
            i12++;
        }
        int i13 = 0;
        while (true) {
            byte[] bArr3 = this.M;
            if (i13 >= bArr3.length) {
                break;
            }
            bArr3[i13] = 0;
            i13++;
        }
        int i14 = 0;
        while (true) {
            byte[] bArr4 = this.C[1];
            if (i14 >= bArr4.length) {
                break;
            }
            bArr4[i14] = 0;
            i14++;
        }
        int i15 = 0;
        while (true) {
            byte[] bArr5 = this.C[3];
            if (i15 >= bArr5.length) {
                break;
            }
            bArr5[i15] = 0;
            i15++;
        }
        int i16 = 0;
        while (true) {
            byte[] bArr6 = this.Sum;
            if (i16 >= bArr6.length) {
                break;
            }
            bArr6[i16] = 0;
            i16++;
        }
        int i17 = 0;
        while (true) {
            byte[] bArr7 = this.xBuf;
            if (i17 >= bArr7.length) {
                byte[] bArr8 = C2;
                System.arraycopy(bArr8, 0, this.C[2], 0, bArr8.length);
                return;
            } else {
                bArr7[i17] = 0;
                i17++;
            }
        }
    }

    public GOST3411Digest() {
        this(CryptoServicePurpose.ANY);
    }

    public GOST3411Digest(GOST3411Digest gOST3411Digest) {
        this.H = new byte[32];
        this.L = new byte[32];
        this.M = new byte[32];
        this.Sum = new byte[32];
        this.C = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.xBuf = new byte[32];
        this.cipher = new GOST28147Engine();
        this.K = new byte[32];
        this.f33061a = new byte[8];
        this.wS = new short[16];
        this.w_S = new short[16];
        this.S = new byte[32];
        this.U = new byte[32];
        this.V = new byte[32];
        this.W = new byte[32];
        this.purpose = gOST3411Digest.purpose;
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset(gOST3411Digest);
    }

    public GOST3411Digest(byte[] bArr) {
        this(bArr, CryptoServicePurpose.ANY);
    }

    public GOST3411Digest(byte[] bArr, CryptoServicePurpose cryptoServicePurpose) {
        this.H = new byte[32];
        this.L = new byte[32];
        this.M = new byte[32];
        this.Sum = new byte[32];
        this.C = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.xBuf = new byte[32];
        this.cipher = new GOST28147Engine();
        this.K = new byte[32];
        this.f33061a = new byte[8];
        this.wS = new short[16];
        this.w_S = new short[16];
        this.S = new byte[32];
        this.U = new byte[32];
        this.V = new byte[32];
        this.W = new byte[32];
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        byte[] bArrClone = Arrays.clone(bArr);
        this.sBox = bArrClone;
        this.cipher.init(true, new ParametersWithSBox(null, bArrClone));
        reset();
    }
}
