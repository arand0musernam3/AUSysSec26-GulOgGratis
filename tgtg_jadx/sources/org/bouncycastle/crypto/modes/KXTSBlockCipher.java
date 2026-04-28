package org.bouncycastle.crypto.modes;

import com.braze.h2;
import i4.a;
import m0.i1;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class KXTSBlockCipher extends DefaultBufferedBlockCipher {
    private static final long RED_POLY_128 = 135;
    private static final long RED_POLY_256 = 1061;
    private static final long RED_POLY_512 = 293;
    private final int blockSize;
    private int counter;
    private final long reductionPolynomial;
    private final long[] tw_current;
    private final long[] tw_init;

    public KXTSBlockCipher(BlockCipher blockCipher) {
        ((DefaultBufferedBlockCipher) this).cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.reductionPolynomial = getReductionPolynomial(blockSize);
        this.tw_init = new long[blockSize >>> 3];
        this.tw_current = new long[blockSize >>> 3];
        this.counter = -1;
    }

    private static void GF_double(long j9, long[] jArr) {
        long j11 = 0;
        int i11 = 0;
        while (i11 < jArr.length) {
            long j12 = jArr[i11];
            jArr[i11] = j11 ^ (j12 << 1);
            i11++;
            j11 = j12 >>> 63;
        }
        jArr[0] = (j9 & (-j11)) ^ jArr[0];
    }

    public static long getReductionPolynomial(int i11) {
        if (i11 == 16) {
            return RED_POLY_128;
        }
        if (i11 == 32) {
            return RED_POLY_256;
        }
        if (i11 == 64) {
            return RED_POLY_512;
        }
        a.f("Only 128, 256, and 512 -bit block sizes supported");
        return 0L;
    }

    private void processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = this.counter;
        if (i13 == -1) {
            h2.b("Attempt to process too many blocks");
            return;
        }
        this.counter = i13 + 1;
        GF_double(this.reductionPolynomial, this.tw_current);
        byte[] bArr3 = new byte[this.blockSize];
        Pack.longToLittleEndian(this.tw_current, bArr3, 0);
        int i14 = this.blockSize;
        byte[] bArr4 = new byte[i14];
        System.arraycopy(bArr3, 0, bArr4, 0, i14);
        for (int i15 = 0; i15 < this.blockSize; i15++) {
            bArr4[i15] = (byte) (bArr4[i15] ^ bArr[i11 + i15]);
        }
        ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr4, 0, bArr4, 0);
        for (int i16 = 0; i16 < this.blockSize; i16++) {
            bArr2[i12 + i16] = (byte) (bArr4[i16] ^ bArr3[i16]);
        }
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i11) {
        reset();
        return 0;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            a.f("Invalid parameters passed");
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        CipherParameters parameters = parametersWithIV.getParameters();
        byte[] iv2 = parametersWithIV.getIV();
        int length = iv2.length;
        int i11 = this.blockSize;
        if (length != i11) {
            a.f("Currently only support IVs of exactly one block");
            return;
        }
        byte[] bArr = new byte[i11];
        System.arraycopy(iv2, 0, bArr, 0, i11);
        ((DefaultBufferedBlockCipher) this).cipher.init(true, parameters);
        ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr, 0, bArr, 0);
        ((DefaultBufferedBlockCipher) this).cipher.init(z11, parameters);
        Pack.littleEndianToLong(bArr, 0, this.tw_init);
        long[] jArr = this.tw_init;
        System.arraycopy(jArr, 0, this.tw_current, 0, jArr.length);
        this.counter = 0;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b8, byte[] bArr, int i11) {
        throw new IllegalStateException("unsupported operation");
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (bArr.length - i11 < i12) {
            i1.t("Input buffer too short");
            return 0;
        }
        if (bArr2.length - i11 < i12) {
            i1.r("Output buffer too short");
            return 0;
        }
        if (i12 % this.blockSize != 0) {
            a.f("Partial blocks not supported");
            return 0;
        }
        int i14 = 0;
        if (bArr == bArr2 && Arrays.segmentsOverlap(i11, i12, i13, i12)) {
            bArr = new byte[i12];
            System.arraycopy(bArr2, i11, bArr, 0, i12);
            i11 = 0;
        }
        while (i14 < i12) {
            processBlock(bArr, i11 + i14, bArr2, i13 + i14);
            i14 += this.blockSize;
        }
        return i12;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public void reset() {
        ((DefaultBufferedBlockCipher) this).cipher.reset();
        long[] jArr = this.tw_init;
        System.arraycopy(jArr, 0, this.tw_current, 0, jArr.length);
        this.counter = 0;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i11) {
        return i11;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i11) {
        return i11;
    }
}
