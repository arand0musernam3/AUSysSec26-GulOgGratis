package org.bouncycastle.crypto.paddings;

import i4.a;
import m0.i1;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class PaddedBufferedBlockCipher extends DefaultBufferedBlockCipher {
    BlockCipherPadding padding;

    public PaddedBufferedBlockCipher(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
        ((DefaultBufferedBlockCipher) this).cipher = blockCipher;
        this.padding = blockCipherPadding;
        ((DefaultBufferedBlockCipher) this).buf = new byte[blockCipher.getBlockSize()];
        ((DefaultBufferedBlockCipher) this).bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i11) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        int iProcessBlock;
        int blockSize = ((DefaultBufferedBlockCipher) this).cipher.getBlockSize();
        boolean z11 = ((DefaultBufferedBlockCipher) this).forEncryption;
        int i12 = ((DefaultBufferedBlockCipher) this).bufOff;
        if (z11) {
            if (i12 != blockSize) {
                iProcessBlock = 0;
            } else {
                if ((blockSize * 2) + i11 > bArr.length) {
                    reset();
                    i1.r("output buffer too short");
                    return 0;
                }
                iProcessBlock = ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr, i11);
                ((DefaultBufferedBlockCipher) this).bufOff = 0;
            }
            this.padding.addPadding(((DefaultBufferedBlockCipher) this).buf, ((DefaultBufferedBlockCipher) this).bufOff);
            return ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr, i11 + iProcessBlock) + iProcessBlock;
        }
        if (i12 != blockSize) {
            reset();
            i1.t("last block incomplete in decryption");
            return 0;
        }
        BlockCipher blockCipher = ((DefaultBufferedBlockCipher) this).cipher;
        byte[] bArr2 = ((DefaultBufferedBlockCipher) this).buf;
        int iProcessBlock2 = blockCipher.processBlock(bArr2, 0, bArr2, 0);
        ((DefaultBufferedBlockCipher) this).bufOff = 0;
        try {
            int iPadCount = iProcessBlock2 - this.padding.padCount(((DefaultBufferedBlockCipher) this).buf);
            System.arraycopy(((DefaultBufferedBlockCipher) this).buf, 0, bArr, i11, iPadCount);
            return iPadCount;
        } finally {
            reset();
        }
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i11) {
        int i12 = i11 + ((DefaultBufferedBlockCipher) this).bufOff;
        byte[] bArr = ((DefaultBufferedBlockCipher) this).buf;
        int length = i12 % bArr.length;
        if (length != 0) {
            i12 -= length;
        } else if (!((DefaultBufferedBlockCipher) this).forEncryption) {
            return i12;
        }
        return i12 + bArr.length;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i11) {
        int i12 = i11 + ((DefaultBufferedBlockCipher) this).bufOff;
        byte[] bArr = ((DefaultBufferedBlockCipher) this).buf;
        int length = i12 % bArr.length;
        return length == 0 ? Math.max(0, i12 - bArr.length) : i12 - length;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) throws IllegalArgumentException {
        BlockCipher blockCipher;
        ((DefaultBufferedBlockCipher) this).forEncryption = z11;
        reset();
        boolean z12 = cipherParameters instanceof ParametersWithRandom;
        BlockCipherPadding blockCipherPadding = this.padding;
        if (z12) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            blockCipherPadding.init(parametersWithRandom.getRandom());
            blockCipher = ((DefaultBufferedBlockCipher) this).cipher;
            cipherParameters = parametersWithRandom.getParameters();
        } else {
            blockCipherPadding.init(null);
            blockCipher = ((DefaultBufferedBlockCipher) this).cipher;
        }
        blockCipher.init(z11, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b8, byte[] bArr, int i11) throws IllegalStateException, DataLengthException {
        int i12 = ((DefaultBufferedBlockCipher) this).bufOff;
        byte[] bArr2 = ((DefaultBufferedBlockCipher) this).buf;
        int i13 = 0;
        if (i12 == bArr2.length) {
            int iProcessBlock = ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr, i11);
            ((DefaultBufferedBlockCipher) this).bufOff = 0;
            i13 = iProcessBlock;
        }
        byte[] bArr3 = ((DefaultBufferedBlockCipher) this).buf;
        int i14 = ((DefaultBufferedBlockCipher) this).bufOff;
        ((DefaultBufferedBlockCipher) this).bufOff = i14 + 1;
        bArr3[i14] = b8;
        return i13;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws IllegalStateException, DataLengthException {
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
        byte[] bArr3 = ((DefaultBufferedBlockCipher) this).buf;
        int length = bArr3.length;
        int i14 = ((DefaultBufferedBlockCipher) this).bufOff;
        int i15 = length - i14;
        int iProcessBlock = 0;
        if (i12 > i15) {
            System.arraycopy(bArr, i11, bArr3, i14, i15);
            i11 += i15;
            i12 -= i15;
            if (bArr == bArr2 && Arrays.segmentsOverlap(i11, i12, i13, updateOutputSize)) {
                bArr = new byte[i12];
                System.arraycopy(bArr2, i11, bArr, 0, i12);
                i11 = 0;
            }
            int iProcessBlock2 = ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, i13);
            ((DefaultBufferedBlockCipher) this).bufOff = 0;
            iProcessBlock = iProcessBlock2;
            while (i12 > ((DefaultBufferedBlockCipher) this).buf.length) {
                iProcessBlock += ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr, i11, bArr2, i13 + iProcessBlock);
                i12 -= blockSize;
                i11 += blockSize;
            }
        }
        System.arraycopy(bArr, i11, ((DefaultBufferedBlockCipher) this).buf, ((DefaultBufferedBlockCipher) this).bufOff, i12);
        ((DefaultBufferedBlockCipher) this).bufOff += i12;
        return iProcessBlock;
    }

    public PaddedBufferedBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, new PKCS7Padding());
    }
}
