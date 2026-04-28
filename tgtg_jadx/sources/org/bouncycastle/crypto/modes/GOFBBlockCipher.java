package org.bouncycastle.crypto.modes;

import android.R;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import i4.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes3.dex */
public class GOFBBlockCipher extends StreamBlockCipher {
    static final int C1 = 16843012;
    static final int C2 = 16843009;
    private byte[] IV;
    int N3;
    int N4;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    boolean firstStep;
    private byte[] ofbOutV;
    private byte[] ofbV;

    public GOFBBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.firstStep = true;
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        if (blockSize != 8) {
            a.f("GCTR only for 64 bit block ciphers");
            throw null;
        }
        this.IV = new byte[blockCipher.getBlockSize()];
        this.ofbV = new byte[blockCipher.getBlockSize()];
        this.ofbOutV = new byte[blockCipher.getBlockSize()];
    }

    private int bytesToint(byte[] bArr, int i11) {
        return ((bArr[i11 + 3] << 24) & RoundCornerImageView.DEFAULT_STROKE_COLOR) + ((bArr[i11 + 2] << 16) & 16711680) + ((bArr[i11 + 1] << 8) & 65280) + (bArr[i11] & 255);
    }

    private void intTobytes(int i11, byte[] bArr, int i12) {
        bArr[i12 + 3] = (byte) (i11 >>> 24);
        bArr[i12 + 2] = (byte) (i11 >>> 16);
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12] = (byte) i11;
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b8) {
        if (this.byteCount == 0) {
            if (this.firstStep) {
                this.firstStep = false;
                this.cipher.processBlock(this.ofbV, 0, this.ofbOutV, 0);
                this.N3 = bytesToint(this.ofbOutV, 0);
                this.N4 = bytesToint(this.ofbOutV, 4);
            }
            int i11 = this.N3 + 16843009;
            this.N3 = i11;
            int i12 = this.N4;
            int i13 = i12 + 16843012;
            this.N4 = i13;
            if (i13 < 16843012 && i13 > 0) {
                this.N4 = i12 + R.attr.format;
            }
            intTobytes(i11, this.ofbV, 0);
            intTobytes(this.N4, this.ofbV, 4);
            this.cipher.processBlock(this.ofbV, 0, this.ofbOutV, 0);
        }
        byte[] bArr = this.ofbOutV;
        int i14 = this.byteCount;
        int i15 = i14 + 1;
        this.byteCount = i15;
        byte b11 = (byte) (b8 ^ bArr[i14]);
        int i16 = this.blockSize;
        if (i15 == i16) {
            this.byteCount = 0;
            byte[] bArr2 = this.ofbV;
            System.arraycopy(bArr2, i16, bArr2, 0, bArr2.length - i16);
            byte[] bArr3 = this.ofbOutV;
            byte[] bArr4 = this.ofbV;
            int length = bArr4.length;
            int i17 = this.blockSize;
            System.arraycopy(bArr3, 0, bArr4, length - i17, i17);
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/GCTR";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) throws IllegalArgumentException {
        BlockCipher blockCipher;
        this.firstStep = true;
        this.N3 = 0;
        this.N4 = 0;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv2 = parametersWithIV.getIV();
            int length = iv2.length;
            byte[] bArr = this.IV;
            if (length < bArr.length) {
                System.arraycopy(iv2, 0, bArr, bArr.length - iv2.length, iv2.length);
                int i11 = 0;
                while (true) {
                    byte[] bArr2 = this.IV;
                    if (i11 >= bArr2.length - iv2.length) {
                        break;
                    }
                    bArr2[i11] = 0;
                    i11++;
                }
            } else {
                System.arraycopy(iv2, 0, bArr, 0, bArr.length);
            }
            reset();
            if (parametersWithIV.getParameters() == null) {
                return;
            }
            blockCipher = this.cipher;
            cipherParameters = parametersWithIV.getParameters();
        } else {
            reset();
            if (cipherParameters == null) {
                return;
            } else {
                blockCipher = this.cipher;
            }
        }
        blockCipher.init(true, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) throws IllegalStateException, DataLengthException {
        processBytes(bArr, i11, this.blockSize, bArr2, i12);
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.firstStep = true;
        this.N3 = 0;
        this.N4 = 0;
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.ofbV, 0, bArr.length);
        this.byteCount = 0;
        this.cipher.reset();
    }
}
