package org.bouncycastle.crypto.digests;

import c50.w;
import org.bouncycastle.crypto.digests.AsconBaseDigest;
import org.bouncycastle.crypto.digests.BufferBaseDigest;
import org.bouncycastle.crypto.engines.AsconPermutationFriend;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class ISAPDigest extends BufferBaseDigest {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AsconPermutationFriend.AsconPermutation f33064p;

    public static class Friend {
        private static final Friend INSTANCE = new Friend();

        private Friend() {
        }

        public static Friend getFriend(AsconBaseDigest.Friend friend) {
            if (friend != null) {
                return INSTANCE;
            }
            w.l("This method is only for use by AsconBaseDigest");
            return null;
        }
    }

    public ISAPDigest() {
        super(BufferBaseDigest.ProcessingBufferType.Immediate, 8);
        this.f33064p = AsconPermutationFriend.getAsconPermutation(Friend.INSTANCE);
        this.DigestSize = 32;
        this.algorithmName = "ISAP Hash";
        reset();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i11) {
        return super.doFinal(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    public void finish(byte[] bArr, int i11) {
        this.f33064p.f33096x0 ^= 128 << ((7 - this.m_bufPos) << 3);
        while (true) {
            int i12 = this.m_bufPos;
            if (i12 <= 0) {
                break;
            }
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f33064p;
            long j9 = asconPermutation.f33096x0;
            byte[] bArr2 = this.m_buf;
            int i13 = i12 - 1;
            this.m_bufPos = i13;
            asconPermutation.f33096x0 = j9 ^ ((((long) bArr2[i13]) & 255) << ((7 - i13) << 3));
        }
        for (int i14 = 0; i14 < 4; i14++) {
            this.f33064p.p(12);
            Pack.longToBigEndian(this.f33064p.f33096x0, bArr, i11);
            i11 += 8;
        }
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
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f33064p;
        asconPermutation.f33096x0 = Pack.bigEndianToLong(bArr, i11) ^ asconPermutation.f33096x0;
        this.f33064p.p(12);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f33064p.set(-1255492011513352131L, -8380609354527731710L, -5437372128236807582L, 4834782570098516968L, 3787428097924915520L);
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
