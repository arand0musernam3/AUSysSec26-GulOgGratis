package org.bouncycastle.crypto;

import m0.i1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class StreamBlockCipher extends DefaultMultiBlockCipher implements StreamCipher {
    private final BlockCipher cipher;

    public StreamBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
    }

    public abstract byte calculateByte(byte b8);

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws DataLengthException {
        int i14 = i11 + i12;
        if (i14 > bArr.length) {
            i1.t("input buffer too small");
            return 0;
        }
        if (i13 + i12 > bArr2.length) {
            i1.r("output buffer too short");
            return 0;
        }
        while (i11 < i14) {
            bArr2[i13] = calculateByte(bArr[i11]);
            i13++;
            i11++;
        }
        return i12;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public final byte returnByte(byte b8) {
        return calculateByte(b8);
    }
}
