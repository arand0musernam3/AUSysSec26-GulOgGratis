package org.bouncycastle.crypto.digests;

import com.braze.h2;
import org.bouncycastle.crypto.Xof;

/* JADX INFO: loaded from: classes3.dex */
abstract class AsconXofBase extends AsconBaseDigest implements Xof {
    private final byte[] buffer = new byte[this.BlockSize];
    private int bytesInBuffer;
    private boolean m_squeezing;

    private void ensureNoAbsorbWhileSqueezing(boolean z11) {
        if (z11) {
            h2.b("attempt to absorb while squeezing");
        }
    }

    public int doFinal(byte[] bArr, int i11, int i12) {
        int iDoOutput = doOutput(bArr, i11, i12);
        reset();
        return iDoOutput;
    }

    public int doOutput(byte[] bArr, int i11, int i12) {
        int iHash;
        ensureSufficientOutputBuffer(bArr, i11, i12);
        int i13 = this.bytesInBuffer;
        if (i13 != 0) {
            int i14 = this.BlockSize - i13;
            iHash = Math.min(i12, i13);
            System.arraycopy(this.buffer, i14, bArr, i11, iHash);
            this.bytesInBuffer -= iHash;
        } else {
            iHash = 0;
        }
        int i15 = i12 - iHash;
        int i16 = this.BlockSize;
        if (i15 >= i16) {
            iHash += hash(bArr, i11 + iHash, i15 - (i15 % i16));
        }
        if (iHash >= i12) {
            return iHash;
        }
        hash(this.buffer, 0, this.BlockSize);
        int i17 = i12 - iHash;
        System.arraycopy(this.buffer, 0, bArr, i11 + iHash, i17);
        this.bytesInBuffer = this.buffer.length - i17;
        return iHash + i17;
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    public void padAndAbsorb() {
        if (this.m_squeezing) {
            this.f33048p.p(this.ASCON_PB_ROUNDS);
        } else {
            this.m_squeezing = true;
            super.padAndAbsorb();
        }
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        this.m_squeezing = false;
        this.bytesInBuffer = 0;
        super.reset();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void update(byte b8) {
        ensureNoAbsorbWhileSqueezing(this.m_squeezing);
        super.update(b8);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i11, int i12) {
        ensureNoAbsorbWhileSqueezing(this.m_squeezing);
        super.update(bArr, i11, i12);
    }
}
