package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class SipHash128 extends SipHash {
    public SipHash128() {
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i11) throws IllegalStateException, DataLengthException {
        long j9 = this.f33180m;
        int i12 = this.wordPos;
        this.f33180m = ((j9 >>> ((7 - i12) << 3)) >>> 8) | ((((long) ((this.wordCount << 3) + i12)) & 255) << 56);
        processMessageWord();
        this.f33183v2 ^= 238;
        applySipRounds(this.f33177d);
        long j11 = this.f33181v0;
        long j12 = this.f33182v1;
        long j13 = ((j11 ^ j12) ^ this.f33183v2) ^ this.v3;
        this.f33182v1 = j12 ^ 221;
        applySipRounds(this.f33177d);
        long j14 = ((this.f33181v0 ^ this.f33182v1) ^ this.f33183v2) ^ this.v3;
        reset();
        Pack.longToLittleEndian(j13, bArr, i11);
        Pack.longToLittleEndian(j14, bArr, i11 + 8);
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash128-" + this.f33176c + "-" + this.f33177d;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public void reset() {
        super.reset();
        this.f33182v1 ^= 238;
    }

    public SipHash128(int i11, int i12) {
        super(i11, i12);
    }

    @Override // org.bouncycastle.crypto.macs.SipHash
    public long doFinal() throws IllegalStateException, DataLengthException {
        throw new UnsupportedOperationException("doFinal() is not supported");
    }
}
