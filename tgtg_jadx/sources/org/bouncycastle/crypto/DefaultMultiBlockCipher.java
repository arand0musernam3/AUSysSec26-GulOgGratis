package org.bouncycastle.crypto;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DefaultMultiBlockCipher implements MultiBlockCipher {
    @Override // org.bouncycastle.crypto.MultiBlockCipher
    public int getMultiBlockSize() {
        return getBlockSize();
    }

    @Override // org.bouncycastle.crypto.MultiBlockCipher
    public int processBlocks(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws IllegalStateException, DataLengthException {
        int multiBlockSize = getMultiBlockSize();
        int i14 = i12 * multiBlockSize;
        if (bArr == bArr2 && Arrays.segmentsOverlap(i11, i14, i13, i14)) {
            bArr = new byte[i14];
            System.arraycopy(bArr2, i11, bArr, 0, i14);
            i11 = 0;
        }
        int iProcessBlock = 0;
        for (int i15 = 0; i15 != i12; i15++) {
            iProcessBlock += processBlock(bArr, i11, bArr2, i13 + iProcessBlock);
            i11 += multiBlockSize;
        }
        return iProcessBlock;
    }
}
