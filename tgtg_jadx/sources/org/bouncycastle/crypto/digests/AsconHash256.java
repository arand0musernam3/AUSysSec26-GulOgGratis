package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class AsconHash256 extends AsconBaseDigest {
    public AsconHash256() {
        this.algorithmName = "Ascon-Hash256";
        reset();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i11) {
        return super.doFinal(bArr, i11);
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

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    public long loadBytes(byte[] bArr, int i11) {
        return Pack.littleEndianToLong(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    public long pad(int i11) {
        return 1 << (i11 << 3);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f33048p.set(-7269279749984954751L, 5459383224871899602L, -5880230600644446182L, 4359436768738168243L, 1899470422303676269L);
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    public void setBytes(long j9, byte[] bArr, int i11) {
        Pack.longToLittleEndian(j9, bArr, i11);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ void update(byte b8) {
        super.update(b8);
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    public void setBytes(long j9, byte[] bArr, int i11, int i12) {
        Pack.longToLittleEndian(j9, bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ void update(byte[] bArr, int i11, int i12) {
        super.update(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    public long loadBytes(byte[] bArr, int i11, int i12) {
        return Pack.littleEndianToLong(bArr, i11, i12);
    }
}
