package org.bouncycastle.crypto.modes;

import i4.a;
import m0.i1;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class KCTRBlockCipher extends StreamBlockCipher {
    private int byteCount;
    private BlockCipher engine;
    private boolean initialised;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f33197iv;
    private byte[] ofbOutV;
    private byte[] ofbV;

    public KCTRBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.engine = blockCipher;
        this.f33197iv = new byte[blockCipher.getBlockSize()];
        this.ofbV = new byte[blockCipher.getBlockSize()];
        this.ofbOutV = new byte[blockCipher.getBlockSize()];
    }

    private void incrementCounterAt(int i11) {
        while (true) {
            byte[] bArr = this.ofbV;
            if (i11 >= bArr.length) {
                return;
            }
            int i12 = i11 + 1;
            byte b8 = (byte) (bArr[i11] + 1);
            bArr[i11] = b8;
            if (b8 != 0) {
                return;
            } else {
                i11 = i12;
            }
        }
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b8) {
        int i11 = this.byteCount;
        if (i11 == 0) {
            incrementCounterAt(0);
            checkCounter();
            this.engine.processBlock(this.ofbV, 0, this.ofbOutV, 0);
            byte[] bArr = this.ofbOutV;
            int i12 = this.byteCount;
            this.byteCount = i12 + 1;
            return (byte) (b8 ^ bArr[i12]);
        }
        byte[] bArr2 = this.ofbOutV;
        int i13 = i11 + 1;
        this.byteCount = i13;
        byte b11 = (byte) (b8 ^ bArr2[i11]);
        if (i13 == this.ofbV.length) {
            this.byteCount = 0;
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName() + "/KCTR";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.engine.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.initialised = true;
        if (!(cipherParameters instanceof ParametersWithIV)) {
            a.f("invalid parameter passed");
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv2 = parametersWithIV.getIV();
        byte[] bArr = this.f33197iv;
        int length = bArr.length - iv2.length;
        Arrays.fill(bArr, (byte) 0);
        System.arraycopy(iv2, 0, this.f33197iv, length, iv2.length);
        CipherParameters parameters = parametersWithIV.getParameters();
        if (parameters != null) {
            this.engine.init(true, parameters);
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) throws IllegalStateException, DataLengthException {
        if (bArr.length - i11 < getBlockSize()) {
            i1.t("input buffer too short");
            return 0;
        }
        if (bArr2.length - i12 >= getBlockSize()) {
            processBytes(bArr, i11, getBlockSize(), bArr2, i12);
            return getBlockSize();
        }
        i1.r("output buffer too short");
        return 0;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        if (this.initialised) {
            this.engine.processBlock(this.f33197iv, 0, this.ofbV, 0);
        }
        this.engine.reset();
        this.byteCount = 0;
    }

    private void checkCounter() {
    }
}
