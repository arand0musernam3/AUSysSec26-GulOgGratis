package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.digests.BufferBaseDigest;
import org.bouncycastle.crypto.engines.PhotonBeetleEngine;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;

/* JADX INFO: loaded from: classes3.dex */
public class PhotonBeetleDigest extends BufferBaseDigest {
    private static final int D = 8;
    private static final int SQUEEZE_RATE_INBYTES = 16;
    private int blockCount;
    private final byte[] state;

    public static class Friend {
        private static final Friend INSTANCE = new Friend();

        private Friend() {
        }
    }

    public PhotonBeetleDigest() {
        super(BufferBaseDigest.ProcessingBufferType.Buffered, 4);
        this.DigestSize = 32;
        this.state = new byte[32];
        this.algorithmName = "Photon-Beetle Hash";
        this.blockCount = 0;
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i11) {
        return super.doFinal(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    public void finish(byte[] bArr, int i11) {
        int i12 = this.m_bufPos;
        if (i12 == 0 && this.blockCount == 0) {
            byte[] bArr2 = this.state;
            int i13 = this.DigestSize - 1;
            bArr2[i13] = (byte) (bArr2[i13] ^ 32);
        } else {
            int i14 = this.blockCount;
            if (i14 < 4) {
                System.arraycopy(this.m_buf, 0, this.state, i14 << 2, i12);
                byte[] bArr3 = this.state;
                int i15 = (this.blockCount << 2) + this.m_bufPos;
                bArr3[i15] = (byte) (bArr3[i15] ^ 1);
                int i16 = this.DigestSize - 1;
                bArr3[i16] = (byte) (bArr3[i16] ^ 32);
            } else if (i14 == 4 && i12 == 0) {
                byte[] bArr4 = this.state;
                int i17 = this.DigestSize - 1;
                bArr4[i17] = (byte) (bArr4[i17] ^ 64);
            } else {
                PhotonBeetleEngine.photonPermutation(Friend.INSTANCE, this.state);
                Bytes.xorTo(this.m_bufPos, this.m_buf, this.state);
                int i18 = this.m_bufPos;
                int i19 = this.BlockSize;
                if (i18 < i19) {
                    byte[] bArr5 = this.state;
                    bArr5[i18] = (byte) (bArr5[i18] ^ 1);
                }
                byte[] bArr6 = this.state;
                int i21 = this.DigestSize - 1;
                bArr6[i21] = (byte) (((i18 % i19 != 0 ? 2 : 1) << 5) ^ bArr6[i21]);
            }
        }
        PhotonBeetleEngine.photonPermutation(Friend.INSTANCE, this.state);
        System.arraycopy(this.state, 0, bArr, i11, 16);
        PhotonBeetleEngine.photonPermutation(Friend.INSTANCE, this.state);
        System.arraycopy(this.state, 0, bArr, i11 + 16, 16);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.ExtendedDigest
    public /* bridge */ /* synthetic */ int getByteLength() {
        return super.getByteLength();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int getDigestSize() {
        return super.getDigestSize();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    public void processBytes(byte[] bArr, int i11) {
        int i12 = this.blockCount;
        if (i12 < 4) {
            System.arraycopy(bArr, i11, this.state, i12 << 2, this.BlockSize);
        } else {
            PhotonBeetleEngine.photonPermutation(Friend.INSTANCE, this.state);
            Bytes.xorTo(this.BlockSize, bArr, i11, this.state);
        }
        this.blockCount++;
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        Arrays.fill(this.state, (byte) 0);
        this.blockCount = 0;
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ void update(byte b8) {
        super.update(b8);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ void update(byte[] bArr, int i11, int i12) {
        super.update(bArr, i11, i12);
    }
}
