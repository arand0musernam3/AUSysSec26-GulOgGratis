package org.bouncycastle.crypto.engines;

import com.braze.h2;
import m0.i1;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;

/* JADX INFO: loaded from: classes3.dex */
public class NullEngine implements BlockCipher {
    protected static final int DEFAULT_BLOCK_SIZE = 1;
    private final int blockSize;
    private boolean initialised;

    public NullEngine(int i11) {
        this.blockSize = i11;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Null";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.initialised = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) throws IllegalStateException, DataLengthException {
        if (!this.initialised) {
            h2.b("Null engine not initialised");
            return 0;
        }
        int i13 = this.blockSize;
        if (i11 + i13 > bArr.length) {
            i1.t("input buffer too short");
            return 0;
        }
        if (i13 + i12 > bArr2.length) {
            i1.r("output buffer too short");
            return 0;
        }
        int i14 = 0;
        while (true) {
            int i15 = this.blockSize;
            if (i14 >= i15) {
                return i15;
            }
            bArr2[i12 + i14] = bArr[i11 + i14];
            i14++;
        }
    }

    public NullEngine() {
        this(1);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
