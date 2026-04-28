package org.bouncycastle.crypto.engines;

import i4.a;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.AEADBaseEngine;
import org.bouncycastle.crypto.engines.AsconPermutationFriend;
import org.bouncycastle.util.Pack;
import qc.y;

/* JADX INFO: loaded from: classes3.dex */
public class AsconEngine extends AsconBaseEngine {
    private long K2;
    private final AsconParameters asconParameters;

    /* JADX INFO: renamed from: org.bouncycastle.crypto.engines.AsconEngine$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters;

        static {
            int[] iArr = new int[AsconParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters = iArr;
            try {
                iArr[AsconParameters.ascon80pq.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters[AsconParameters.ascon128a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters[AsconParameters.ascon128.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum AsconParameters {
        ascon80pq,
        ascon128a,
        ascon128
    }

    public AsconEngine(AsconParameters asconParameters) {
        String str;
        this.asconParameters = asconParameters;
        this.MAC_SIZE = 16;
        this.IV_SIZE = 16;
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters[asconParameters.ordinal()];
        if (i11 == 1) {
            this.KEY_SIZE = 20;
            this.BlockSize = 8;
            this.ASCON_IV = -6899501409222262784L;
            str = "Ascon-80pq AEAD";
        } else if (i11 == 2) {
            this.KEY_SIZE = 16;
            this.BlockSize = 16;
            this.ASCON_IV = -9187330011336540160L;
            str = "Ascon-128a AEAD";
        } else {
            if (i11 != 3) {
                a.f("invalid parameter setting for ASCON AEAD");
                throw null;
            }
            this.KEY_SIZE = 16;
            this.BlockSize = 8;
            this.ASCON_IV = -9205344418435956736L;
            str = "Ascon-128 AEAD";
        }
        this.algorithmName = str;
        int i12 = this.BlockSize;
        this.f33094nr = i12 == 8 ? 6 : 8;
        this.AADBufferSize = i12;
        this.dsep = 1L;
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Immediate, AEADBaseEngine.AADOperatorType.Default, AEADBaseEngine.DataOperatorType.Default);
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public void ascon_aeadinit() {
        this.f33095p.set(this.ASCON_IV, this.K1, this.K2, this.N0, this.N1);
        if (this.KEY_SIZE == 20) {
            this.f33095p.f33096x0 ^= this.K0;
        }
        this.f33095p.p(12);
        if (this.KEY_SIZE == 20) {
            this.f33095p.f33098x2 ^= this.K0;
        }
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f33095p;
        asconPermutation.f33099x3 ^= this.K1;
        asconPermutation.f33100x4 ^= this.K2;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i11) throws InvalidCipherTextException, IllegalStateException {
        return super.doFinal(bArr, i11);
    }

    public void finishData(AEADBaseEngine.State state) {
        AsconPermutationFriend.AsconPermutation asconPermutation;
        long j9;
        long j11;
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters[this.asconParameters.ordinal()];
        if (i11 == 1) {
            asconPermutation = this.f33095p;
            long j12 = asconPermutation.f33097x1;
            long j13 = this.K0 << 32;
            long j14 = this.K1;
            asconPermutation.f33097x1 = j12 ^ (j13 | (j14 >> 32));
            long j15 = asconPermutation.f33098x2;
            long j16 = j14 << 32;
            long j17 = this.K2;
            asconPermutation.f33098x2 = j15 ^ (j16 | (j17 >> 32));
            j9 = asconPermutation.f33099x3;
            j11 = j17 << 32;
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    y.e();
                    return;
                }
                AsconPermutationFriend.AsconPermutation asconPermutation2 = this.f33095p;
                asconPermutation2.f33097x1 ^= this.K1;
                asconPermutation2.f33098x2 ^= this.K2;
                this.f33095p.p(12);
                AsconPermutationFriend.AsconPermutation asconPermutation3 = this.f33095p;
                asconPermutation3.f33099x3 ^= this.K1;
                asconPermutation3.f33100x4 ^= this.K2;
                this.m_state = state;
            }
            asconPermutation = this.f33095p;
            asconPermutation.f33098x2 ^= this.K1;
            j9 = asconPermutation.f33099x3;
            j11 = this.K2;
        }
        asconPermutation.f33099x3 = j9 ^ j11;
        this.f33095p.p(12);
        AsconPermutationFriend.AsconPermutation asconPermutation32 = this.f33095p;
        asconPermutation32.f33099x3 ^= this.K1;
        asconPermutation32.f33100x4 ^= this.K2;
        this.m_state = state;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public String getAlgorithmVersion() {
        return "v1.2";
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
        long jBigEndianToLong;
        this.N0 = Pack.bigEndianToLong(bArr2, 0);
        this.N1 = Pack.bigEndianToLong(bArr2, 8);
        int i11 = this.KEY_SIZE;
        if (i11 == 16) {
            this.K1 = Pack.bigEndianToLong(bArr, 0);
            jBigEndianToLong = Pack.bigEndianToLong(bArr, 8);
        } else if (i11 != 20) {
            y.e();
            return;
        } else {
            this.K0 = Pack.bigEndianToInt(bArr, 0);
            this.K1 = Pack.bigEndianToLong(bArr, 4);
            jBigEndianToLong = Pack.bigEndianToLong(bArr, 12);
        }
        this.K2 = jBigEndianToLong;
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public long loadBytes(byte[] bArr, int i11) {
        return Pack.bigEndianToLong(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public long pad(int i11) {
        return 128 << (56 - (i11 << 3));
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
        byte[] bArr = this.m_aad;
        int i11 = this.m_aadPos;
        bArr[i11] = ByteCompanionObject.MIN_VALUE;
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f33095p;
        if (i11 < 8) {
            asconPermutation.f33096x0 = (Pack.bigEndianToLong(bArr, 0) & ((-1) << (56 - (this.m_aadPos << 3)))) ^ asconPermutation.f33096x0;
            return;
        }
        asconPermutation.f33096x0 = Pack.bigEndianToLong(bArr, 0) ^ asconPermutation.f33096x0;
        this.f33095p.f33097x1 ^= ((-1) << (56 - ((this.m_aadPos - 8) << 3))) & Pack.bigEndianToLong(this.m_aad, 8);
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public void processFinalDecrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (i11 >= 8) {
            long jBigEndianToLong = Pack.bigEndianToLong(bArr, 0);
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f33095p;
            long j9 = asconPermutation.f33096x0 ^ jBigEndianToLong;
            asconPermutation.f33096x0 = j9;
            Pack.longToBigEndian(j9, bArr2, i12);
            AsconPermutationFriend.AsconPermutation asconPermutation2 = this.f33095p;
            asconPermutation2.f33096x0 = jBigEndianToLong;
            int i13 = i12 + 8;
            int i14 = i11 - 8;
            asconPermutation2.f33097x1 ^= pad(i14);
            if (i14 != 0) {
                long jLittleEndianToLong_High = Pack.littleEndianToLong_High(bArr, 8, i14);
                AsconPermutationFriend.AsconPermutation asconPermutation3 = this.f33095p;
                long j11 = asconPermutation3.f33097x1 ^ jLittleEndianToLong_High;
                asconPermutation3.f33097x1 = j11;
                Pack.longToLittleEndian_High(j11, bArr2, i13, i14);
                AsconPermutationFriend.AsconPermutation asconPermutation4 = this.f33095p;
                asconPermutation4.f33097x1 = (asconPermutation4.f33097x1 & ((-1) >>> (i14 << 3))) ^ jLittleEndianToLong_High;
            }
        } else {
            this.f33095p.f33096x0 ^= pad(i11);
            if (i11 != 0) {
                long jLittleEndianToLong_High2 = Pack.littleEndianToLong_High(bArr, 0, i11);
                AsconPermutationFriend.AsconPermutation asconPermutation5 = this.f33095p;
                long j12 = asconPermutation5.f33096x0 ^ jLittleEndianToLong_High2;
                asconPermutation5.f33096x0 = j12;
                Pack.longToLittleEndian_High(j12, bArr2, i12, i11);
                AsconPermutationFriend.AsconPermutation asconPermutation6 = this.f33095p;
                asconPermutation6.f33096x0 = (asconPermutation6.f33096x0 & ((-1) >>> (i11 << 3))) ^ jLittleEndianToLong_High2;
            }
        }
        finishData(AEADBaseEngine.State.DecFinal);
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public void processFinalEncrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        long j9;
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f33095p;
        if (i11 >= 8) {
            asconPermutation.f33096x0 ^= Pack.bigEndianToLong(bArr, 0);
            Pack.longToBigEndian(this.f33095p.f33096x0, bArr2, i12);
            i12 += 8;
            i11 -= 8;
            this.f33095p.f33097x1 ^= pad(i11);
            if (i11 != 0) {
                AsconPermutationFriend.AsconPermutation asconPermutation2 = this.f33095p;
                asconPermutation2.f33097x1 = Pack.littleEndianToLong_High(bArr, 8, i11) ^ asconPermutation2.f33097x1;
                j9 = this.f33095p.f33097x1;
                Pack.longToLittleEndian_High(j9, bArr2, i12, i11);
            }
        } else {
            asconPermutation.f33096x0 ^= pad(i11);
            if (i11 != 0) {
                this.f33095p.f33096x0 ^= Pack.littleEndianToLong_High(bArr, 0, i11);
                j9 = this.f33095p.f33096x0;
                Pack.longToLittleEndian_High(j9, bArr2, i12, i11);
            }
        }
        finishData(AEADBaseEngine.State.EncFinal);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.engines.AsconBaseEngine
    public void setBytes(long j9, byte[] bArr, int i11) {
        Pack.longToBigEndian(j9, bArr, i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void init(boolean z11, CipherParameters cipherParameters) {
        super.init(z11, cipherParameters);
    }
}
