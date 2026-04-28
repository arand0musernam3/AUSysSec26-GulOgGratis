package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class AsconXof128 extends AsconXofBase {
    public AsconXof128() {
        this.algorithmName = "Ascon-XOF-128";
        reset();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i11) {
        return super.doFinal(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.digests.AsconXofBase, org.bouncycastle.crypto.Xof
    public /* bridge */ /* synthetic */ int doOutput(byte[] bArr, int i11, int i12) {
        return super.doOutput(bArr, i11, i12);
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

    @Override // org.bouncycastle.crypto.digests.AsconXofBase, org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f33048p.set(-2701369817892108309L, -3711838248891385495L, -1778763697082575311L, 1072114354614917324L, -2282070310009238562L);
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    public void setBytes(long j9, byte[] bArr, int i11) {
        Pack.longToLittleEndian(j9, bArr, i11);
    }

    @Override // org.bouncycastle.crypto.digests.AsconXofBase, org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ void update(byte b8) {
        super.update(b8);
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    public void setBytes(long j9, byte[] bArr, int i11, int i12) {
        Pack.longToLittleEndian(j9, bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.digests.AsconXofBase, org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ void update(byte[] bArr, int i11, int i12) {
        super.update(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.digests.AsconXofBase, org.bouncycastle.crypto.Xof
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i11, int i12) {
        return super.doFinal(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    public long loadBytes(byte[] bArr, int i11, int i12) {
        return Pack.littleEndianToLong(bArr, i11, i12);
    }
}
