package org.bouncycastle.crypto.modes;

import i4.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class G3413OFBBlockCipher extends StreamBlockCipher {
    private byte[] R;
    private byte[] R_init;
    private byte[] Y;
    private int blockSize;
    private int byteCount;
    private BlockCipher cipher;
    private boolean initialized;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f33195m;

    public G3413OFBBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.initialized = false;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.cipher = blockCipher;
        this.Y = new byte[blockSize];
    }

    private void generateR() {
        byte[] bArrLSB = GOST3413CipherUtil.LSB(this.R, this.f33195m - this.blockSize);
        System.arraycopy(bArrLSB, 0, this.R, 0, bArrLSB.length);
        System.arraycopy(this.Y, 0, this.R, bArrLSB.length, this.f33195m - bArrLSB.length);
    }

    private void generateY() {
        this.cipher.processBlock(GOST3413CipherUtil.MSB(this.R, this.blockSize), 0, this.Y, 0);
    }

    private void initArrays() {
        int i11 = this.f33195m;
        this.R = new byte[i11];
        this.R_init = new byte[i11];
    }

    private void setupDefaultParams() {
        this.f33195m = this.blockSize * 2;
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b8) {
        if (this.byteCount == 0) {
            generateY();
        }
        byte[] bArr = this.Y;
        int i11 = this.byteCount;
        byte b11 = (byte) (b8 ^ bArr[i11]);
        int i12 = i11 + 1;
        this.byteCount = i12;
        if (i12 == getBlockSize()) {
            this.byteCount = 0;
            generateR();
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/OFB";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) throws IllegalArgumentException {
        BlockCipher blockCipher;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv2 = parametersWithIV.getIV();
            if (iv2.length < this.blockSize) {
                a.f("Parameter m must blockSize <= m");
                return;
            }
            this.f33195m = iv2.length;
            initArrays();
            byte[] bArrClone = Arrays.clone(iv2);
            this.R_init = bArrClone;
            System.arraycopy(bArrClone, 0, this.R, 0, bArrClone.length);
            if (parametersWithIV.getParameters() != null) {
                blockCipher = this.cipher;
                cipherParameters = parametersWithIV.getParameters();
                blockCipher.init(true, cipherParameters);
            }
        } else {
            setupDefaultParams();
            initArrays();
            byte[] bArr = this.R_init;
            System.arraycopy(bArr, 0, this.R, 0, bArr.length);
            if (cipherParameters != null) {
                blockCipher = this.cipher;
                blockCipher.init(true, cipherParameters);
            }
        }
        this.initialized = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) throws IllegalStateException, DataLengthException {
        processBytes(bArr, i11, this.blockSize, bArr2, i12);
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        if (this.initialized) {
            byte[] bArr = this.R_init;
            System.arraycopy(bArr, 0, this.R, 0, bArr.length);
            Arrays.clear(this.Y);
            this.byteCount = 0;
            this.cipher.reset();
        }
    }
}
