package org.bouncycastle.crypto.digests;

import m0.i1;
import org.bouncycastle.crypto.digests.BufferBaseDigest;
import org.bouncycastle.crypto.digests.ISAPDigest;
import org.bouncycastle.crypto.engines.AsconPermutationFriend;

/* JADX INFO: loaded from: classes3.dex */
abstract class AsconBaseDigest extends BufferBaseDigest {
    protected int ASCON_PB_ROUNDS;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    AsconPermutationFriend.AsconPermutation f33048p;

    public static class Friend {
        private static final Friend INSTANCE = new Friend();

        private Friend() {
        }
    }

    public AsconBaseDigest() {
        super(BufferBaseDigest.ProcessingBufferType.Immediate, 8);
        this.ASCON_PB_ROUNDS = 12;
        this.f33048p = AsconPermutationFriend.getAsconPermutation(ISAPDigest.Friend.getFriend(Friend.INSTANCE));
        this.DigestSize = 32;
    }

    public void ensureSufficientOutputBuffer(byte[] bArr, int i11, int i12) {
        if (i11 + i12 <= bArr.length) {
            return;
        }
        i1.r("output buffer is too short");
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    public void finish(byte[] bArr, int i11) {
        padAndAbsorb();
        squeeze(bArr, i11, this.DigestSize);
    }

    public int hash(byte[] bArr, int i11, int i12) {
        ensureSufficientOutputBuffer(bArr, i11, i12);
        padAndAbsorb();
        squeeze(bArr, i11, i12);
        return i12;
    }

    public abstract long loadBytes(byte[] bArr, int i11);

    public abstract long loadBytes(byte[] bArr, int i11, int i12);

    public abstract long pad(int i11);

    public void padAndAbsorb() {
        this.f33048p.f33096x0 ^= loadBytes(this.m_buf, 0, this.m_bufPos) ^ pad(this.m_bufPos);
        this.f33048p.p(12);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    public void processBytes(byte[] bArr, int i11) {
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f33048p;
        asconPermutation.f33096x0 = loadBytes(bArr, i11) ^ asconPermutation.f33096x0;
        this.f33048p.p(this.ASCON_PB_ROUNDS);
    }

    public abstract void setBytes(long j9, byte[] bArr, int i11);

    public abstract void setBytes(long j9, byte[] bArr, int i11, int i12);

    public void squeeze(byte[] bArr, int i11, int i12) {
        int i13 = i11;
        int i14 = i12;
        while (true) {
            int i15 = this.BlockSize;
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f33048p;
            if (i14 <= i15) {
                setBytes(asconPermutation.f33096x0, bArr, i13, i14);
                return;
            }
            setBytes(asconPermutation.f33096x0, bArr, i13);
            this.f33048p.p(this.ASCON_PB_ROUNDS);
            int i16 = this.BlockSize;
            i13 += i16;
            i14 -= i16;
        }
    }
}
