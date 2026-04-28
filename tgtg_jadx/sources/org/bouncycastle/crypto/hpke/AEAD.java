package org.bouncycastle.crypto.hpke;

import com.braze.h2;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.modes.ChaCha20Poly1305;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Pack;
import qc.y;

/* JADX INFO: loaded from: classes3.dex */
public class AEAD {
    private final short aeadId;
    private final byte[] baseNonce;
    private AEADCipher cipher;
    private final byte[] key;
    private long seq = 0;

    public AEAD(short s7, byte[] bArr, byte[] bArr2) {
        AEADCipher aEADCipherNewInstance;
        this.key = bArr;
        this.baseNonce = bArr2;
        this.aeadId = s7;
        if (s7 == 1 || s7 == 2) {
            aEADCipherNewInstance = GCMBlockCipher.newInstance(AESEngine.newInstance());
        } else if (s7 != 3) {
            return;
        } else {
            aEADCipherNewInstance = new ChaCha20Poly1305();
        }
        this.cipher = aEADCipherNewInstance;
    }

    private byte[] computeNonce() {
        long j9 = this.seq;
        this.seq = 1 + j9;
        byte[] bArrLongToBigEndian = Pack.longToBigEndian(j9);
        byte[] bArrClone = Arrays.clone(this.baseNonce);
        Bytes.xorTo(8, bArrLongToBigEndian, 0, bArrClone, bArrClone.length - 8);
        return bArrClone;
    }

    private byte[] process(boolean z11, byte[] bArr, byte[] bArr2, int i11, int i12) throws InvalidCipherTextException {
        short s7 = this.aeadId;
        if (s7 != 1 && s7 != 2 && s7 != 3) {
            h2.b("Export only mode, cannot be used to seal/open");
            return null;
        }
        this.cipher.init(z11, new ParametersWithIV(new KeyParameter(this.key), computeNonce()));
        this.cipher.processAADBytes(bArr, 0, bArr.length);
        int outputSize = this.cipher.getOutputSize(i12);
        byte[] bArr3 = new byte[outputSize];
        int iProcessBytes = this.cipher.processBytes(bArr2, i11, i12, bArr3, 0);
        if (this.cipher.doFinal(bArr3, iProcessBytes) + iProcessBytes == outputSize) {
            return bArr3;
        }
        y.e();
        return null;
    }

    public byte[] open(byte[] bArr, byte[] bArr2, int i11, int i12) throws InvalidCipherTextException {
        Arrays.validateSegment(bArr2, i11, i12);
        return process(false, bArr, bArr2, i11, i12);
    }

    public byte[] seal(byte[] bArr, byte[] bArr2, int i11, int i12) throws InvalidCipherTextException {
        Arrays.validateSegment(bArr2, i11, i12);
        return process(true, bArr, bArr2, i11, i12);
    }

    public byte[] open(byte[] bArr, byte[] bArr2) throws InvalidCipherTextException {
        return process(false, bArr, bArr2, 0, bArr2.length);
    }

    public byte[] seal(byte[] bArr, byte[] bArr2) throws InvalidCipherTextException {
        return process(true, bArr, bArr2, 0, bArr2.length);
    }
}
