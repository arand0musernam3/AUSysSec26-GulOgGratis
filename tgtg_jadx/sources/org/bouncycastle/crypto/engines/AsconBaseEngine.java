package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.engines.AEADBaseEngine;
import org.bouncycastle.crypto.engines.AsconPermutationFriend;

/* JADX INFO: loaded from: classes3.dex */
abstract class AsconBaseEngine extends AEADBaseEngine {
    protected long ASCON_IV;
    protected long K0;
    protected long K1;
    protected long N0;
    protected long N1;
    protected long dsep;

    /* JADX INFO: renamed from: nr, reason: collision with root package name */
    protected int f33094nr;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    AsconPermutationFriend.AsconPermutation f33095p = new AsconPermutationFriend.AsconPermutation();

    public abstract void ascon_aeadinit();

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void finishAAD(AEADBaseEngine.State state, boolean z11) {
        int i11 = this.m_state.ord;
        if (i11 == 2 || i11 == 6) {
            processFinalAAD();
            this.f33095p.p(this.f33094nr);
        }
        this.f33095p.f33100x4 ^= this.dsep;
        this.m_aadPos = 0;
        this.m_state = state;
    }

    public abstract String getAlgorithmVersion();

    public abstract long loadBytes(byte[] bArr, int i11);

    public abstract long pad(int i11);

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferAAD(byte[] bArr, int i11) {
        this.f33095p.f33096x0 ^= loadBytes(bArr, i11);
        if (this.BlockSize == 16) {
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f33095p;
            asconPermutation.f33097x1 = loadBytes(bArr, i11 + 8) ^ asconPermutation.f33097x1;
        }
        this.f33095p.p(this.f33094nr);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        long jLoadBytes = loadBytes(bArr, i11);
        setBytes(this.f33095p.f33096x0 ^ jLoadBytes, bArr2, i12);
        this.f33095p.f33096x0 = jLoadBytes;
        if (this.BlockSize == 16) {
            long jLoadBytes2 = loadBytes(bArr, i11 + 8);
            setBytes(this.f33095p.f33097x1 ^ jLoadBytes2, bArr2, i12 + 8);
            this.f33095p.f33097x1 = jLoadBytes2;
        }
        this.f33095p.p(this.f33094nr);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        this.f33095p.f33096x0 ^= loadBytes(bArr, i11);
        setBytes(this.f33095p.f33096x0, bArr2, i12);
        if (this.BlockSize == 16) {
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f33095p;
            asconPermutation.f33097x1 = loadBytes(bArr, i11 + 8) ^ asconPermutation.f33097x1;
            setBytes(this.f33095p.f33097x1, bArr2, i12 + 8);
        }
        this.f33095p.p(this.f33094nr);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i11) {
        boolean z11 = this.forEncryption;
        byte[] bArr2 = this.m_buf;
        if (z11) {
            processFinalEncrypt(bArr2, this.m_bufPos, bArr, i11);
        } else {
            processFinalDecrypt(bArr2, this.m_bufPos, bArr, i11);
        }
        setBytes(this.f33095p.f33099x3, this.mac, 0);
        setBytes(this.f33095p.f33100x4, this.mac, 8);
    }

    public abstract void processFinalDecrypt(byte[] bArr, int i11, byte[] bArr2, int i12);

    public abstract void processFinalEncrypt(byte[] bArr, int i11, byte[] bArr2, int i12);

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z11) {
        super.reset(z11);
        ascon_aeadinit();
    }

    public abstract void setBytes(long j9, byte[] bArr, int i11);
}
