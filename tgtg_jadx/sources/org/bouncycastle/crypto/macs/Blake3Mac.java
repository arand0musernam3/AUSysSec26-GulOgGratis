package org.bouncycastle.crypto.macs;

import i4.a;
import j4.s;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.digests.Blake3Digest;
import org.bouncycastle.crypto.params.Blake3Parameters;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes3.dex */
public class Blake3Mac implements Mac {
    private final Blake3Digest theDigest;

    public Blake3Mac(Blake3Digest blake3Digest) {
        this.theDigest = blake3Digest;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i11) {
        return this.theDigest.doFinal(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.theDigest.getAlgorithmName() + "Mac";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.theDigest.getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        CipherParameters cipherParametersKey = cipherParameters instanceof KeyParameter ? Blake3Parameters.key(((KeyParameter) cipherParameters).getKey()) : cipherParameters;
        if (!(cipherParametersKey instanceof Blake3Parameters)) {
            a.f(s.n("Invalid parameter passed to Blake3Mac init - ", cipherParameters));
            return;
        }
        Blake3Parameters blake3Parameters = (Blake3Parameters) cipherParametersKey;
        if (blake3Parameters.getKey() != null) {
            this.theDigest.init(blake3Parameters);
        } else {
            a.f("Blake3Mac requires a key parameter.");
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.theDigest.reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b8) {
        this.theDigest.update(b8);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i11, int i12) {
        this.theDigest.update(bArr, i11, i12);
    }
}
