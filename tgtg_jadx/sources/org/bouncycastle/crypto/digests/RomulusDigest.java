package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.digests.BufferBaseDigest;
import org.bouncycastle.crypto.engines.RomulusEngine;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class RomulusDigest extends BufferBaseDigest {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f33065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f33066h;

    public static class Friend {
        private static final Friend INSTANCE = new Friend();

        private Friend() {
        }
    }

    public RomulusDigest() {
        super(BufferBaseDigest.ProcessingBufferType.Immediate, 32);
        this.f33066h = new byte[16];
        this.f33065g = new byte[16];
        this.DigestSize = 32;
        this.algorithmName = "Romulus Hash";
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i11) {
        return super.doFinal(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest
    public void finish(byte[] bArr, int i11) {
        Arrays.fill(this.m_buf, this.m_bufPos, 31, (byte) 0);
        this.m_buf[31] = (byte) (this.m_bufPos & 31);
        byte[] bArr2 = this.f33066h;
        bArr2[0] = (byte) (bArr2[0] ^ 2);
        RomulusEngine.hirose_128_128_256(Friend.INSTANCE, this.f33066h, this.f33065g, this.m_buf, 0);
        System.arraycopy(this.f33066h, 0, bArr, i11, 16);
        System.arraycopy(this.f33065g, 0, bArr, i11 + 16, 16);
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
        RomulusEngine.hirose_128_128_256(Friend.INSTANCE, this.f33066h, this.f33065g, bArr, i11);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        Arrays.clear(this.f33066h);
        Arrays.clear(this.f33065g);
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
