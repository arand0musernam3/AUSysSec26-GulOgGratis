package org.bouncycastle.crypto;

import i4.a;
import m0.i1;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultBufferedBlockCipher extends BufferedBlockCipher {
    protected byte[] buf;
    protected int bufOff;
    protected BlockCipher cipher;
    protected boolean forEncryption;
    protected MultiBlockCipher mbCipher;
    protected boolean partialBlockOkay;
    protected boolean pgpCFB;

    public DefaultBufferedBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        if (blockCipher instanceof MultiBlockCipher) {
            MultiBlockCipher multiBlockCipher = (MultiBlockCipher) blockCipher;
            this.mbCipher = multiBlockCipher;
            this.buf = new byte[multiBlockCipher.getMultiBlockSize()];
        } else {
            this.mbCipher = null;
            this.buf = new byte[blockCipher.getBlockSize()];
        }
        boolean z11 = false;
        this.bufOff = 0;
        String algorithmName = blockCipher.getAlgorithmName();
        int iIndexOf = algorithmName.indexOf(47) + 1;
        boolean z12 = iIndexOf > 0 && algorithmName.startsWith("PGP", iIndexOf);
        this.pgpCFB = z12;
        if (z12 || (blockCipher instanceof StreamCipher)) {
            this.partialBlockOkay = true;
            return;
        }
        if (iIndexOf > 0 && algorithmName.startsWith("OpenPGP", iIndexOf)) {
            z11 = true;
        }
        this.partialBlockOkay = z11;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i11) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        try {
            int i12 = this.bufOff;
            if (i11 + i12 > bArr.length) {
                throw new OutputLengthException("output buffer too short for doFinal()");
            }
            int i13 = 0;
            if (i12 != 0) {
                if (!this.partialBlockOkay) {
                    throw new DataLengthException("data not block size aligned");
                }
                BlockCipher blockCipher = this.cipher;
                byte[] bArr2 = this.buf;
                blockCipher.processBlock(bArr2, 0, bArr2, 0);
                int i14 = this.bufOff;
                this.bufOff = 0;
                System.arraycopy(this.buf, 0, bArr, i11, i14);
                i13 = i14;
            }
            reset();
            return i13;
        } catch (Throwable th2) {
            reset();
            throw th2;
        }
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i11) {
        if (!this.pgpCFB || !this.forEncryption) {
            return i11 + this.bufOff;
        }
        return this.cipher.getBlockSize() + 2 + i11 + this.bufOff;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i11) {
        int length;
        int length2;
        int i12 = i11 + this.bufOff;
        if (this.pgpCFB) {
            boolean z11 = this.forEncryption;
            byte[] bArr = this.buf;
            if (z11) {
                length2 = (i12 % bArr.length) - (this.cipher.getBlockSize() + 2);
                return i12 - length2;
            }
            length = bArr.length;
        } else {
            length = this.buf.length;
        }
        length2 = i12 % length;
        return i12 - length2;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.forEncryption = z11;
        reset();
        this.cipher.init(z11, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b8, byte[] bArr, int i11) throws IllegalStateException, DataLengthException {
        byte[] bArr2 = this.buf;
        int i12 = this.bufOff;
        int i13 = i12 + 1;
        this.bufOff = i13;
        bArr2[i12] = b8;
        if (i13 != bArr2.length) {
            return 0;
        }
        int iProcessBlock = this.cipher.processBlock(bArr2, 0, bArr, i11);
        this.bufOff = 0;
        return iProcessBlock;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws IllegalStateException, DataLengthException {
        byte[] bArr3;
        int i14;
        int i15;
        int iProcessBlock;
        if (i12 < 0) {
            a.f("Can't have a negative input length!");
            return 0;
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i12);
        if (updateOutputSize > 0 && i13 + updateOutputSize > bArr2.length) {
            i1.r("output buffer too short");
            return 0;
        }
        byte[] bArr4 = this.buf;
        int length = bArr4.length;
        int i16 = this.bufOff;
        int i17 = length - i16;
        if (i12 > i17) {
            System.arraycopy(bArr, i11, bArr4, i16, i17);
            int i18 = i11 + i17;
            i15 = i12 - i17;
            if (bArr == bArr2 && Arrays.segmentsOverlap(i18, i15, i13, updateOutputSize)) {
                byte[] bArr5 = new byte[i15];
                System.arraycopy(bArr2, i18, bArr5, 0, i15);
                bArr3 = bArr5;
                i14 = 0;
            } else {
                i14 = i18;
                bArr3 = bArr;
            }
            iProcessBlock = this.cipher.processBlock(this.buf, 0, bArr2, i13);
            this.bufOff = 0;
            MultiBlockCipher multiBlockCipher = this.mbCipher;
            if (multiBlockCipher != null) {
                int multiBlockSize = i15 / multiBlockCipher.getMultiBlockSize();
                if (multiBlockSize > 0) {
                    iProcessBlock += this.mbCipher.processBlocks(bArr3, i14, multiBlockSize, bArr2, i13 + iProcessBlock);
                    int multiBlockSize2 = this.mbCipher.getMultiBlockSize() * multiBlockSize;
                    i15 -= multiBlockSize2;
                    i14 += multiBlockSize2;
                }
            } else {
                while (i15 > this.buf.length) {
                    iProcessBlock += this.cipher.processBlock(bArr3, i14, bArr2, i13 + iProcessBlock);
                    i15 -= blockSize;
                    i14 += blockSize;
                }
            }
        } else {
            bArr3 = bArr;
            i14 = i11;
            i15 = i12;
            iProcessBlock = 0;
        }
        System.arraycopy(bArr3, i14, this.buf, this.bufOff, i15);
        int i19 = this.bufOff + i15;
        this.bufOff = i19;
        byte[] bArr6 = this.buf;
        if (i19 != bArr6.length) {
            return iProcessBlock;
        }
        int iProcessBlock2 = this.cipher.processBlock(bArr6, 0, bArr2, i13 + iProcessBlock) + iProcessBlock;
        this.bufOff = 0;
        return iProcessBlock2;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public void reset() {
        int i11 = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i11 >= bArr.length) {
                this.bufOff = 0;
                this.cipher.reset();
                return;
            } else {
                bArr[i11] = 0;
                i11++;
            }
        }
    }

    public DefaultBufferedBlockCipher() {
    }
}
