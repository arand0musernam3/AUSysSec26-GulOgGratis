package org.bouncycastle.crypto.modes;

import i4.a;
import m0.i1;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes3.dex */
public class PaddedBlockCipher extends DefaultBufferedBlockCipher {
    public PaddedBlockCipher(BlockCipher blockCipher) {
        ((DefaultBufferedBlockCipher) this).cipher = blockCipher;
        ((DefaultBufferedBlockCipher) this).buf = new byte[blockCipher.getBlockSize()];
        ((DefaultBufferedBlockCipher) this).bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i11) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        int iProcessBlock;
        int iProcessBlock2;
        int blockSize = ((DefaultBufferedBlockCipher) this).cipher.getBlockSize();
        boolean z11 = ((DefaultBufferedBlockCipher) this).forEncryption;
        int i12 = ((DefaultBufferedBlockCipher) this).bufOff;
        if (z11) {
            if (i12 != blockSize) {
                iProcessBlock2 = 0;
            } else {
                if ((blockSize * 2) + i11 > bArr.length) {
                    i1.r("output buffer too short");
                    return 0;
                }
                iProcessBlock2 = ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr, i11);
                ((DefaultBufferedBlockCipher) this).bufOff = 0;
            }
            byte b8 = (byte) (blockSize - ((DefaultBufferedBlockCipher) this).bufOff);
            while (true) {
                int i13 = ((DefaultBufferedBlockCipher) this).bufOff;
                if (i13 >= blockSize) {
                    break;
                }
                ((DefaultBufferedBlockCipher) this).buf[i13] = b8;
                ((DefaultBufferedBlockCipher) this).bufOff = i13 + 1;
            }
            iProcessBlock = ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr, i11 + iProcessBlock2) + iProcessBlock2;
        } else {
            if (i12 != blockSize) {
                i1.t("last block incomplete in decryption");
                return 0;
            }
            BlockCipher blockCipher = ((DefaultBufferedBlockCipher) this).cipher;
            byte[] bArr2 = ((DefaultBufferedBlockCipher) this).buf;
            int iProcessBlock3 = blockCipher.processBlock(bArr2, 0, bArr2, 0);
            ((DefaultBufferedBlockCipher) this).bufOff = 0;
            byte[] bArr3 = ((DefaultBufferedBlockCipher) this).buf;
            int i14 = bArr3[blockSize - 1] & 255;
            if (i14 > blockSize) {
                i1.i("pad block corrupted");
                return 0;
            }
            int i15 = iProcessBlock3 - i14;
            System.arraycopy(bArr3, 0, bArr, i11, i15);
            iProcessBlock = i15;
        }
        reset();
        return iProcessBlock;
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
        return length == 0 ? i12 - bArr.length : i12 - length;
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
        if (updateOutputSize > 0 && updateOutputSize + i13 > bArr2.length) {
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
            int iProcessBlock2 = ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, i13);
            ((DefaultBufferedBlockCipher) this).bufOff = 0;
            i12 -= i15;
            i11 += i15;
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
}
