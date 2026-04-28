package org.bouncycastle.crypto.modes;

import i4.a;
import m0.i1;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class NISTCTSBlockCipher extends DefaultBufferedBlockCipher {
    public static final int CS1 = 1;
    public static final int CS2 = 2;
    public static final int CS3 = 3;
    private final int blockSize;
    private final int type;

    public NISTCTSBlockCipher(int i11, BlockCipher blockCipher) {
        this.type = i11;
        ((DefaultBufferedBlockCipher) this).cipher = CBCBlockCipher.newInstance(blockCipher);
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        ((DefaultBufferedBlockCipher) this).buf = new byte[blockSize * 2];
        ((DefaultBufferedBlockCipher) this).bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i11) throws InvalidCipherTextException, IllegalStateException, DataLengthException {
        if (((DefaultBufferedBlockCipher) this).bufOff + i11 > bArr.length) {
            i1.r("output buffer to small in doFinal");
            return 0;
        }
        int blockSize = ((DefaultBufferedBlockCipher) this).cipher.getBlockSize();
        int i12 = ((DefaultBufferedBlockCipher) this).bufOff;
        int i13 = i12 - blockSize;
        byte[] bArr2 = new byte[blockSize];
        if (((DefaultBufferedBlockCipher) this).forEncryption) {
            if (i12 < blockSize) {
                i1.t("need at least one block of input for NISTCTS");
                return 0;
            }
            if (i12 > blockSize) {
                byte[] bArr3 = new byte[blockSize];
                int i14 = this.type;
                if (i14 == 2 || i14 == 3) {
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
                    System.arraycopy(((DefaultBufferedBlockCipher) this).buf, blockSize, bArr3, 0, i13);
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr3, 0, bArr3, 0);
                    if (this.type == 2 && i13 == blockSize) {
                        System.arraycopy(bArr2, 0, bArr, i11, blockSize);
                        System.arraycopy(bArr3, 0, bArr, i11 + blockSize, i13);
                    } else {
                        System.arraycopy(bArr3, 0, bArr, i11, blockSize);
                        System.arraycopy(bArr2, 0, bArr, i11 + blockSize, i13);
                    }
                } else {
                    System.arraycopy(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0, blockSize);
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i11, i13);
                    System.arraycopy(((DefaultBufferedBlockCipher) this).buf, ((DefaultBufferedBlockCipher) this).bufOff - i13, bArr3, 0, i13);
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr3, 0, bArr3, 0);
                    System.arraycopy(bArr3, 0, bArr, i11 + i13, blockSize);
                }
            } else {
                ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i11, blockSize);
            }
        } else {
            if (i12 < blockSize) {
                i1.t("need at least one block of input for CTS");
                return 0;
            }
            byte[] bArr4 = new byte[blockSize];
            if (i12 > blockSize) {
                int i15 = this.type;
                if (i15 == 3 || (i15 == 2 && (((DefaultBufferedBlockCipher) this).buf.length - i12) % blockSize != 0)) {
                    BlockCipher blockCipher = ((DefaultBufferedBlockCipher) this).cipher;
                    if (blockCipher instanceof CBCModeCipher) {
                        ((CBCModeCipher) blockCipher).getUnderlyingCipher().processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
                    } else {
                        blockCipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
                    }
                    for (int i16 = blockSize; i16 != ((DefaultBufferedBlockCipher) this).bufOff; i16++) {
                        int i17 = i16 - blockSize;
                        bArr4[i17] = (byte) (bArr2[i17] ^ ((DefaultBufferedBlockCipher) this).buf[i16]);
                    }
                    System.arraycopy(((DefaultBufferedBlockCipher) this).buf, blockSize, bArr2, 0, i13);
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr, i11);
                } else {
                    ((CBCModeCipher) ((DefaultBufferedBlockCipher) this).cipher).getUnderlyingCipher().processBlock(((DefaultBufferedBlockCipher) this).buf, ((DefaultBufferedBlockCipher) this).bufOff - blockSize, bArr4, 0);
                    System.arraycopy(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0, blockSize);
                    if (i13 != blockSize) {
                        System.arraycopy(bArr4, i13, bArr2, i13, blockSize - i13);
                    }
                    ((DefaultBufferedBlockCipher) this).cipher.processBlock(bArr2, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i11, blockSize);
                    for (int i18 = 0; i18 != i13; i18++) {
                        bArr4[i18] = (byte) (bArr4[i18] ^ ((DefaultBufferedBlockCipher) this).buf[i18]);
                    }
                }
                System.arraycopy(bArr4, 0, bArr, i11 + blockSize, i13);
            } else {
                ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i11, blockSize);
            }
        }
        int i19 = ((DefaultBufferedBlockCipher) this).bufOff;
        reset();
        return i19;
    }

    @Override // org.bouncycastle.crypto.DefaultBufferedBlockCipher, org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i11) {
        return i11 + ((DefaultBufferedBlockCipher) this).bufOff;
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
            byte[] bArr3 = ((DefaultBufferedBlockCipher) this).buf;
            int i14 = this.blockSize;
            System.arraycopy(bArr3, i14, bArr3, 0, i14);
            ((DefaultBufferedBlockCipher) this).bufOff = this.blockSize;
            i13 = iProcessBlock;
        }
        byte[] bArr4 = ((DefaultBufferedBlockCipher) this).buf;
        int i15 = ((DefaultBufferedBlockCipher) this).bufOff;
        ((DefaultBufferedBlockCipher) this).bufOff = i15 + 1;
        bArr4[i15] = b8;
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
        int i16 = 0;
        if (i12 > i15) {
            System.arraycopy(bArr, i11, bArr3, i14, i15);
            i11 += i15;
            i12 -= i15;
            if (bArr == bArr2 && Arrays.segmentsOverlap(i11, i12, i13, updateOutputSize)) {
                bArr = new byte[i12];
                System.arraycopy(bArr2, i11, bArr, 0, i12);
                i11 = 0;
            }
            int iProcessBlock = ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, i13);
            byte[] bArr4 = ((DefaultBufferedBlockCipher) this).buf;
            System.arraycopy(bArr4, blockSize, bArr4, 0, blockSize);
            ((DefaultBufferedBlockCipher) this).bufOff = blockSize;
            while (i12 > blockSize) {
                System.arraycopy(bArr, i11, ((DefaultBufferedBlockCipher) this).buf, ((DefaultBufferedBlockCipher) this).bufOff, blockSize);
                iProcessBlock += ((DefaultBufferedBlockCipher) this).cipher.processBlock(((DefaultBufferedBlockCipher) this).buf, 0, bArr2, i13 + iProcessBlock);
                byte[] bArr5 = ((DefaultBufferedBlockCipher) this).buf;
                System.arraycopy(bArr5, blockSize, bArr5, 0, blockSize);
                i12 -= blockSize;
                i11 += blockSize;
            }
            i16 = iProcessBlock;
        }
        System.arraycopy(bArr, i11, ((DefaultBufferedBlockCipher) this).buf, ((DefaultBufferedBlockCipher) this).bufOff, i12);
        ((DefaultBufferedBlockCipher) this).bufOff += i12;
        return i16;
    }
}
