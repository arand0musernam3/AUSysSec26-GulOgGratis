package org.bouncycastle.crypto.modes;

import i4.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import wy.o;

/* JADX INFO: loaded from: classes3.dex */
public class G3413CTRBlockCipher extends StreamBlockCipher {
    private byte[] CTR;
    private byte[] IV;
    private final int blockSize;
    private byte[] buf;
    private int byteCount;
    private final BlockCipher cipher;
    private boolean initialized;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f33194s;

    public G3413CTRBlockCipher(BlockCipher blockCipher, int i11) {
        super(blockCipher);
        this.byteCount = 0;
        if (i11 < 0 || i11 > blockCipher.getBlockSize() * 8) {
            o.l(blockCipher.getBlockSize() * 8, "Parameter bitBlockSize must be in range 0 < bitBlockSize <= ");
            throw null;
        }
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.f33194s = i11 / 8;
        this.CTR = new byte[blockSize];
    }

    private byte[] generateBuf() {
        byte[] bArr = this.CTR;
        byte[] bArr2 = new byte[bArr.length];
        this.cipher.processBlock(bArr, 0, bArr2, 0);
        return GOST3413CipherUtil.MSB(bArr2, this.f33194s);
    }

    private void generateCRT() {
        byte[] bArr = this.CTR;
        int length = bArr.length - 1;
        bArr[length] = (byte) (bArr[length] + 1);
    }

    private void initArrays() {
        int i11 = this.blockSize;
        this.IV = new byte[i11 / 2];
        this.CTR = new byte[i11];
        this.buf = new byte[this.f33194s];
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b8) {
        if (this.byteCount == 0) {
            this.buf = generateBuf();
        }
        byte[] bArr = this.buf;
        int i11 = this.byteCount;
        byte b11 = (byte) (b8 ^ bArr[i11]);
        int i12 = i11 + 1;
        this.byteCount = i12;
        if (i12 == this.f33194s) {
            this.byteCount = 0;
            generateCRT();
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/GCTR";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f33194s;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) throws IllegalArgumentException {
        BlockCipher blockCipher;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            initArrays();
            byte[] bArrClone = Arrays.clone(parametersWithIV.getIV());
            this.IV = bArrClone;
            if (bArrClone.length != this.blockSize / 2) {
                a.f("Parameter IV length must be == blockSize/2");
                return;
            }
            System.arraycopy(bArrClone, 0, this.CTR, 0, bArrClone.length);
            for (int length = this.IV.length; length < this.blockSize; length++) {
                this.CTR[length] = 0;
            }
            if (parametersWithIV.getParameters() != null) {
                blockCipher = this.cipher;
                cipherParameters = parametersWithIV.getParameters();
                blockCipher.init(true, cipherParameters);
            }
        } else {
            initArrays();
            if (cipherParameters != null) {
                blockCipher = this.cipher;
                blockCipher.init(true, cipherParameters);
            }
        }
        this.initialized = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) throws IllegalStateException, DataLengthException {
        processBytes(bArr, i11, this.f33194s, bArr2, i12);
        return this.f33194s;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        if (this.initialized) {
            byte[] bArr = this.IV;
            System.arraycopy(bArr, 0, this.CTR, 0, bArr.length);
            for (int length = this.IV.length; length < this.blockSize; length++) {
                this.CTR[length] = 0;
            }
            this.byteCount = 0;
            this.cipher.reset();
        }
    }

    public G3413CTRBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, blockCipher.getBlockSize() * 8);
    }
}
