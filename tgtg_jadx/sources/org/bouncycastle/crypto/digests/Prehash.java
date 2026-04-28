package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.io.LimitedBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class Prehash implements Digest {
    private final String algorithmName;
    private final LimitedBuffer buf;

    private Prehash(Digest digest) {
        this.algorithmName = digest.getAlgorithmName();
        this.buf = new LimitedBuffer(digest.getDigestSize());
    }

    public static Prehash forDigest(Digest digest) {
        return new Prehash(digest);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        try {
            if (getDigestSize() == this.buf.size()) {
                return this.buf.copyTo(bArr, i11);
            }
            throw new IllegalStateException("Incorrect prehash size");
        } finally {
            reset();
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.buf.limit();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.buf.reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b8) {
        this.buf.write(b8);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i11, int i12) {
        this.buf.write(bArr, i11, i12);
    }
}
