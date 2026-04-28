package org.bouncycastle.crypto.macs;

import i4.a;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.i1;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.digests.DSTU7564Digest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;
import qc.y;

/* JADX INFO: loaded from: classes3.dex */
public class DSTU7564Mac implements Mac {
    private static final int BITS_IN_BYTE = 8;
    private DSTU7564Digest engine;
    private long inputLength;
    private int macSize;
    private byte[] paddedKey = null;
    private byte[] invertedKey = null;

    public DSTU7564Mac(int i11) {
        this.engine = new DSTU7564Digest(i11);
        this.macSize = i11 / 8;
    }

    private void pad() {
        int byteLength = this.engine.getByteLength() - ((int) (this.inputLength % ((long) this.engine.getByteLength())));
        if (byteLength < 13) {
            byteLength += this.engine.getByteLength();
        }
        byte[] bArr = new byte[byteLength];
        bArr[0] = ByteCompanionObject.MIN_VALUE;
        Pack.longToLittleEndian(this.inputLength * 8, bArr, byteLength - 12);
        this.engine.update(bArr, 0, byteLength);
    }

    private byte[] padKey(byte[] bArr) {
        int byteLength = this.engine.getByteLength() * (((this.engine.getByteLength() + bArr.length) - 1) / this.engine.getByteLength());
        if (byteLength - bArr.length < 13) {
            byteLength += this.engine.getByteLength();
        }
        byte[] bArr2 = new byte[byteLength];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[bArr.length] = ByteCompanionObject.MIN_VALUE;
        Pack.intToLittleEndian(bArr.length * 8, bArr2, byteLength - 12);
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i11) throws IllegalStateException, DataLengthException {
        if (this.paddedKey == null) {
            y.g(getAlgorithmName(), " not initialised");
            return 0;
        }
        if (bArr.length - i11 < this.macSize) {
            i1.r("Output buffer too short");
            return 0;
        }
        pad();
        DSTU7564Digest dSTU7564Digest = this.engine;
        byte[] bArr2 = this.invertedKey;
        dSTU7564Digest.update(bArr2, 0, bArr2.length);
        this.inputLength = 0L;
        int iDoFinal = this.engine.doFinal(bArr, i11);
        reset();
        return iDoFinal;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "DSTU7564Mac";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.macSize;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        this.paddedKey = null;
        reset();
        if (!(cipherParameters instanceof KeyParameter)) {
            a.f("Bad parameter passed");
            return;
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.invertedKey = new byte[key.length];
        this.paddedKey = padKey(key);
        int i11 = 0;
        while (true) {
            byte[] bArr = this.invertedKey;
            if (i11 >= bArr.length) {
                DSTU7564Digest dSTU7564Digest = this.engine;
                byte[] bArr2 = this.paddedKey;
                dSTU7564Digest.update(bArr2, 0, bArr2.length);
                return;
            }
            bArr[i11] = (byte) (~key[i11]);
            i11++;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.inputLength = 0L;
        this.engine.reset();
        byte[] bArr = this.paddedKey;
        if (bArr != null) {
            this.engine.update(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i11, int i12) throws IllegalStateException, DataLengthException {
        if (bArr.length - i11 < i12) {
            i1.t("Input buffer too short");
        } else if (this.paddedKey == null) {
            y.g(getAlgorithmName(), " not initialised");
        } else {
            this.engine.update(bArr, i11, i12);
            this.inputLength += (long) i12;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b8) throws IllegalStateException {
        this.engine.update(b8);
        this.inputLength++;
    }
}
