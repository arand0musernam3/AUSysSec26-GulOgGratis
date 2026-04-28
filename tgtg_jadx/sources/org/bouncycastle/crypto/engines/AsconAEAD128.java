package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.AEADBaseEngine;
import org.bouncycastle.crypto.engines.AsconPermutationFriend;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class AsconAEAD128 extends AsconBaseEngine {
    public AsconAEAD128() {
        this.BlockSize = 16;
        this.AADBufferSize = 16;
        this.MAC_SIZE = 16;
        this.IV_SIZE = 16;
        this.KEY_SIZE = 16;
        this.ASCON_IV = 17594342703105L;
        this.algorithmName = "Ascon-AEAD128";
        this.f33094nr = 8;
        this.dsep = Long.MIN_VALUE;
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Immediate, AEADBaseEngine.AADOperatorType.Default, AEADBaseEngine.DataOperatorType.Default);
    }

    private void finishData(AEADBaseEngine.State state) {
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f33095p;
        asconPermutation.f33098x2 ^= this.K0;
        asconPermutation.f33099x3 ^= this.K1;
        asconPermutation.p(12);
        AsconPermutationFriend.AsconPermutation asconPermutation2 = this.f33095p;
        asconPermutation2.f33099x3 ^= this.K0;
        asconPermutation2.f33100x4 ^= this.K1;
        this.m_state = state;
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public void ascon_aeadinit() {
        this.f33095p.set(this.ASCON_IV, this.K0, this.K1, this.N0, this.N1);
        this.f33095p.p(12);
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f33095p;
        asconPermutation.f33099x3 ^= this.K0;
        asconPermutation.f33100x4 ^= this.K1;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i11) throws InvalidCipherTextException, IllegalStateException {
        return super.doFinal(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public String getAlgorithmVersion() {
        return "v1.3";
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getIVBytesSize() {
        return super.getIVBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getKeyBytesSize() {
        return super.getKeyBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ byte[] getMac() {
        return super.getMac();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getOutputSize(int i11) {
        return super.getOutputSize(i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getUpdateOutputSize(int i11) {
        return super.getUpdateOutputSize(i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void init(byte[] bArr, byte[] bArr2) throws IllegalArgumentException {
        this.K0 = Pack.littleEndianToLong(bArr, 0);
        this.K1 = Pack.littleEndianToLong(bArr, 8);
        this.N0 = Pack.littleEndianToLong(bArr2, 0);
        this.N1 = Pack.littleEndianToLong(bArr2, 8);
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public long loadBytes(byte[] bArr, int i11) {
        return Pack.littleEndianToLong(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public long pad(int i11) {
        return 1 << (i11 << 3);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADByte(byte b8) {
        super.processAADByte(b8);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADBytes(byte[] bArr, int i11, int i12) {
        super.processAADBytes(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processByte(byte b8, byte[] bArr, int i11) throws DataLengthException {
        return super.processByte(b8, bArr, i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws DataLengthException {
        return super.processBytes(bArr, i11, i12, bArr2, i13);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalAAD() {
        if (this.m_aadPos == this.BlockSize) {
            this.f33095p.f33096x0 ^= loadBytes(this.m_aad, 0);
            this.f33095p.f33097x1 ^= loadBytes(this.m_aad, 8);
            this.m_aadPos -= this.BlockSize;
            this.f33095p.p(this.f33094nr);
        }
        Arrays.fill(this.m_aad, this.m_aadPos, this.AADBufferSize, (byte) 0);
        int i11 = this.m_aadPos;
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f33095p;
        long j9 = asconPermutation.f33096x0;
        if (i11 < 8) {
            asconPermutation.f33096x0 = (Pack.littleEndianToLong(this.m_aad, 0) ^ pad(this.m_aadPos)) ^ j9;
            return;
        }
        asconPermutation.f33096x0 = j9 ^ Pack.littleEndianToLong(this.m_aad, 0);
        AsconPermutationFriend.AsconPermutation asconPermutation2 = this.f33095p;
        asconPermutation2.f33097x1 = (Pack.littleEndianToLong(this.m_aad, 8) ^ pad(this.m_aadPos)) ^ asconPermutation2.f33097x1;
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public void processFinalDecrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (i11 >= 8) {
            long jLittleEndianToLong = Pack.littleEndianToLong(bArr, 0);
            int i13 = i11 - 8;
            long jLittleEndianToLong2 = Pack.littleEndianToLong(bArr, 8, i13);
            Pack.longToLittleEndian(this.f33095p.f33096x0 ^ jLittleEndianToLong, bArr2, i12);
            Pack.longToLittleEndian(this.f33095p.f33097x1 ^ jLittleEndianToLong2, bArr2, i12 + 8, i13);
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f33095p;
            asconPermutation.f33096x0 = jLittleEndianToLong;
            long j9 = (asconPermutation.f33097x1 & (-(1 << (i13 << 3)))) | jLittleEndianToLong2;
            asconPermutation.f33097x1 = j9;
            asconPermutation.f33097x1 = j9 ^ pad(i13);
        } else {
            if (i11 != 0) {
                long jLittleEndianToLong3 = Pack.littleEndianToLong(bArr, 0, i11);
                Pack.longToLittleEndian(this.f33095p.f33096x0 ^ jLittleEndianToLong3, bArr2, i12, i11);
                AsconPermutationFriend.AsconPermutation asconPermutation2 = this.f33095p;
                asconPermutation2.f33096x0 = (asconPermutation2.f33096x0 & (-(1 << (i11 << 3)))) | jLittleEndianToLong3;
            }
            this.f33095p.f33096x0 ^= pad(i11);
        }
        finishData(AEADBaseEngine.State.DecFinal);
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public void processFinalEncrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (i11 >= 8) {
            this.f33095p.f33096x0 ^= Pack.littleEndianToLong(bArr, 0);
            int i13 = i11 - 8;
            this.f33095p.f33097x1 ^= Pack.littleEndianToLong(bArr, 8, i13);
            Pack.longToLittleEndian(this.f33095p.f33096x0, bArr2, i12);
            Pack.longToLittleEndian(this.f33095p.f33097x1, bArr2, i12 + 8);
            this.f33095p.f33097x1 ^= pad(i13);
        } else {
            if (i11 != 0) {
                this.f33095p.f33096x0 ^= Pack.littleEndianToLong(bArr, 0, i11);
                Pack.longToLittleEndian(this.f33095p.f33096x0, bArr2, i12, i11);
            }
            this.f33095p.f33096x0 ^= pad(i11);
        }
        finishData(AEADBaseEngine.State.EncFinal);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public void setBytes(long j9, byte[] bArr, int i11) {
        Pack.longToLittleEndian(j9, bArr, i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void init(boolean z11, CipherParameters cipherParameters) {
        super.init(z11, cipherParameters);
    }
}
