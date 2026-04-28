package org.bouncycastle.crypto;

import i4.a;
import m0.i1;

/* JADX INFO: loaded from: classes3.dex */
public class BufferedAsymmetricBlockCipher {
    protected byte[] buf;
    protected int bufOff;
    private final AsymmetricBlockCipher cipher;

    public BufferedAsymmetricBlockCipher(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.cipher = asymmetricBlockCipher;
    }

    public byte[] doFinal() throws InvalidCipherTextException {
        byte[] bArrProcessBlock = this.cipher.processBlock(this.buf, 0, this.bufOff);
        reset();
        return bArrProcessBlock;
    }

    public int getBufferPosition() {
        return this.bufOff;
    }

    public int getInputBlockSize() {
        return this.cipher.getInputBlockSize();
    }

    public int getOutputBlockSize() {
        return this.cipher.getOutputBlockSize();
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    public void init(boolean z11, CipherParameters cipherParameters) {
        reset();
        this.cipher.init(z11, cipherParameters);
        this.buf = new byte[this.cipher.getInputBlockSize() + (z11 ? 1 : 0)];
        this.bufOff = 0;
    }

    public void processByte(byte b8) {
        int i11 = this.bufOff;
        byte[] bArr = this.buf;
        if (i11 >= bArr.length) {
            i1.t("attempt to process message too long for cipher");
        } else {
            this.bufOff = i11 + 1;
            bArr[i11] = b8;
        }
    }

    public void processBytes(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return;
        }
        if (i12 < 0) {
            a.f("Can't have a negative input length!");
            return;
        }
        int i13 = this.bufOff;
        int i14 = i13 + i12;
        byte[] bArr2 = this.buf;
        if (i14 > bArr2.length) {
            i1.t("attempt to process message too long for cipher");
        } else {
            System.arraycopy(bArr, i11, bArr2, i13, i12);
            this.bufOff += i12;
        }
    }

    public void reset() {
        if (this.buf != null) {
            int i11 = 0;
            while (true) {
                byte[] bArr = this.buf;
                if (i11 >= bArr.length) {
                    break;
                }
                bArr[i11] = 0;
                i11++;
            }
        }
        this.bufOff = 0;
    }
}
