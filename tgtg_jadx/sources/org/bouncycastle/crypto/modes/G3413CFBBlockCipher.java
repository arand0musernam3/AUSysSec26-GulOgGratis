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
public class G3413CFBBlockCipher extends StreamBlockCipher {
    private byte[] R;
    private byte[] R_init;
    private int blockSize;
    private int byteCount;
    private BlockCipher cipher;
    private boolean forEncryption;
    private byte[] gamma;
    private byte[] inBuf;
    private boolean initialized;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f33192m;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f33193s;

    public G3413CFBBlockCipher(BlockCipher blockCipher, int i11) {
        super(blockCipher);
        this.initialized = false;
        if (i11 < 0 || i11 > blockCipher.getBlockSize() * 8) {
            o.l(blockCipher.getBlockSize() * 8, "Parameter bitBlockSize must be in range 0 < bitBlockSize <= ");
            throw null;
        }
        this.blockSize = blockCipher.getBlockSize();
        this.cipher = blockCipher;
        this.f33193s = i11 / 8;
        this.inBuf = new byte[getBlockSize()];
    }

    private void initArrays() {
        int i11 = this.f33192m;
        this.R = new byte[i11];
        this.R_init = new byte[i11];
    }

    private void setupDefaultParams() {
        this.f33192m = this.blockSize * 2;
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b8) {
        if (this.byteCount == 0) {
            this.gamma = createGamma();
        }
        byte[] bArr = this.gamma;
        int i11 = this.byteCount;
        byte b11 = (byte) (bArr[i11] ^ b8);
        byte[] bArr2 = this.inBuf;
        int i12 = i11 + 1;
        this.byteCount = i12;
        if (this.forEncryption) {
            b8 = b11;
        }
        bArr2[i11] = b8;
        if (i12 == getBlockSize()) {
            this.byteCount = 0;
            generateR(this.inBuf);
        }
        return b11;
    }

    public byte[] createGamma() {
        byte[] bArrMSB = GOST3413CipherUtil.MSB(this.R, this.blockSize);
        byte[] bArr = new byte[bArrMSB.length];
        this.cipher.processBlock(bArrMSB, 0, bArr, 0);
        return GOST3413CipherUtil.MSB(bArr, this.f33193s);
    }

    public void generateR(byte[] bArr) {
        byte[] bArrLSB = GOST3413CipherUtil.LSB(this.R, this.f33192m - this.f33193s);
        System.arraycopy(bArrLSB, 0, this.R, 0, bArrLSB.length);
        System.arraycopy(bArr, 0, this.R, bArrLSB.length, this.f33192m - bArrLSB.length);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/CFB" + (this.blockSize * 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f33193s;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) throws IllegalArgumentException {
        BlockCipher blockCipher;
        this.forEncryption = z11;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv2 = parametersWithIV.getIV();
            if (iv2.length < this.blockSize) {
                a.f("Parameter m must blockSize <= m");
                return;
            }
            this.f33192m = iv2.length;
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
        processBytes(bArr, i11, getBlockSize(), bArr2, i12);
        return getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.byteCount = 0;
        Arrays.clear(this.inBuf);
        Arrays.clear(this.gamma);
        if (this.initialized) {
            byte[] bArr = this.R_init;
            System.arraycopy(bArr, 0, this.R, 0, bArr.length);
            this.cipher.reset();
        }
    }

    public G3413CFBBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, blockCipher.getBlockSize() * 8);
    }
}
