package org.bouncycastle.crypto.digests;

import m0.i1;
import org.bouncycastle.crypto.engines.AsconPermutationFriend;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class AsconCXof128 extends AsconXofBase {

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private final long f33049z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    private final long f33050z1;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    private final long f33051z2;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private final long f33052z3;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    private final long f33053z4;

    public AsconCXof128(byte[] bArr, int i11, int i12) {
        this.algorithmName = "Ascon-CXOF128";
        ensureSufficientInputBuffer(bArr, i11, i12);
        if (i12 > 256) {
            i1.t("customized string is too long");
            throw null;
        }
        initState(bArr, i11, i12);
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f33048p;
        this.f33049z0 = asconPermutation.f33096x0;
        this.f33050z1 = asconPermutation.f33097x1;
        this.f33051z2 = asconPermutation.f33098x2;
        this.f33052z3 = asconPermutation.f33099x3;
        this.f33053z4 = asconPermutation.f33100x4;
    }

    private void initState(byte[] bArr, int i11, int i12) {
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f33048p;
        if (i12 == 0) {
            asconPermutation.set(5768210384618244584L, 6623958265790276749L, 4252419465292010770L, 1238191464582506891L, 56353695744608240L);
        } else {
            asconPermutation.set(7445901275803737603L, 4886737088792722364L, -1616759365661982283L, 3076320316797452470L, -8124743304765850554L);
            AsconPermutationFriend.AsconPermutation asconPermutation2 = this.f33048p;
            asconPermutation2.f33096x0 ^= ((long) i12) << 3;
            asconPermutation2.p(12);
            update(bArr, i11, i12);
            padAndAbsorb();
        }
        super.reset();
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
        this.f33048p.set(this.f33049z0, this.f33050z1, this.f33051z2, this.f33052z3, this.f33053z4);
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

    public AsconCXof128(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public AsconCXof128() {
        this(new byte[0], 0, 0);
    }
}
