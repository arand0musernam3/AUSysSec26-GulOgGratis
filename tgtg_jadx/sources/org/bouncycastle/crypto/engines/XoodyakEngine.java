package org.bouncycastle.crypto.engines;

import c50.w;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.digests.XoodyakDigest;
import org.bouncycastle.crypto.engines.AEADBaseEngine;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class XoodyakEngine extends AEADBaseEngine {
    private static final int ModeHash = 1;
    private static final int ModeKeyed = 0;
    private static final int PhaseDown = 1;
    private static final int PhaseUp = 2;
    private static final int[] RC = {88, 56, 960, 208, 288, 20, 96, 44, 896, 240, 416, 18};
    private static final int f_bPrime_1 = 47;
    private byte[] K;
    private byte aadcd;
    private boolean encrypted;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f33140iv;
    private int mode;
    private int phase;
    private final byte[] state;

    public XoodyakEngine() {
        this.algorithmName = "Xoodyak AEAD";
        this.MAC_SIZE = 16;
        this.IV_SIZE = 16;
        this.KEY_SIZE = 16;
        this.BlockSize = 24;
        this.AADBufferSize = 44;
        this.state = new byte[48];
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Immediate, AEADBaseEngine.AADOperatorType.Default, AEADBaseEngine.DataOperatorType.Counter);
    }

    private void AbsorbAny(byte[] bArr, int i11, int i12, int i13) {
        if (this.phase != 2) {
            up(this.mode, this.state, 0);
        }
        int i14 = i11;
        int i15 = i13;
        while (true) {
            int iMin = Math.min(i12, this.AADBufferSize);
            byte[] bArr2 = bArr;
            down(this.mode, this.state, bArr2, i14, iMin, i15);
            this.phase = 1;
            i14 += iMin;
            i12 -= iMin;
            if (i12 == 0) {
                return;
            }
            i15 = 0;
            bArr = bArr2;
        }
    }

    private static void down(int i11, byte[] bArr, byte[] bArr2, int i12, int i13, int i14) {
        Bytes.xorTo(i13, bArr2, i12, bArr);
        bArr[i13] = (byte) (bArr[i13] ^ 1);
        int i15 = bArr[f_bPrime_1];
        if (i11 == 1) {
            i14 &= 1;
        }
        bArr[f_bPrime_1] = (byte) (i15 ^ i14);
    }

    private static void up(int i11, byte[] bArr, int i12) {
        if (i11 != 1) {
            bArr[f_bPrime_1] = (byte) (bArr[f_bPrime_1] ^ i12);
        }
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
        int i13 = 12;
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
        int iLittleEndianToInt5 = Pack.littleEndianToInt(bArr, 16);
        int iLittleEndianToInt6 = Pack.littleEndianToInt(bArr, 20);
        int iLittleEndianToInt7 = Pack.littleEndianToInt(bArr, 24);
        int iLittleEndianToInt8 = Pack.littleEndianToInt(bArr, 28);
        int iLittleEndianToInt9 = Pack.littleEndianToInt(bArr, 32);
        int i14 = 0;
        int i15 = iLittleEndianToInt8;
        int iRotateLeft = iLittleEndianToInt9;
        int iLittleEndianToInt10 = Pack.littleEndianToInt(bArr, 36);
        int iLittleEndianToInt11 = Pack.littleEndianToInt(bArr, 40);
        int iLittleEndianToInt12 = Pack.littleEndianToInt(bArr, 44);
        while (i14 < i13) {
            int i16 = (iLittleEndianToInt ^ iLittleEndianToInt5) ^ iRotateLeft;
            int i17 = (iLittleEndianToInt2 ^ iLittleEndianToInt6) ^ iLittleEndianToInt10;
            int i18 = i14;
            int i19 = (iLittleEndianToInt3 ^ iLittleEndianToInt7) ^ iLittleEndianToInt11;
            int i21 = iLittleEndianToInt12;
            int i22 = (iLittleEndianToInt4 ^ i15) ^ i21;
            int i23 = iLittleEndianToInt11;
            int iRotateLeft2 = Integers.rotateLeft(i22, 5) ^ Integers.rotateLeft(i22, 14);
            int iRotateLeft3 = Integers.rotateLeft(i16, 5) ^ Integers.rotateLeft(i16, 14);
            int iRotateLeft4 = Integers.rotateLeft(i17, 5) ^ Integers.rotateLeft(i17, 14);
            int iRotateLeft5 = Integers.rotateLeft(i19, 5) ^ Integers.rotateLeft(i19, 14);
            int i24 = iLittleEndianToInt ^ iRotateLeft2;
            int i25 = iLittleEndianToInt5 ^ iRotateLeft2;
            int i26 = iRotateLeft ^ iRotateLeft2;
            int i27 = iLittleEndianToInt2 ^ iRotateLeft3;
            int i28 = iLittleEndianToInt6 ^ iRotateLeft3;
            int i29 = iRotateLeft3 ^ iLittleEndianToInt10;
            int i31 = iLittleEndianToInt3 ^ iRotateLeft4;
            int i32 = iLittleEndianToInt7 ^ iRotateLeft4;
            int i33 = iLittleEndianToInt4 ^ iRotateLeft5;
            int i34 = i15 ^ iRotateLeft5;
            int iRotateLeft6 = Integers.rotateLeft(i26, 11);
            int iRotateLeft7 = Integers.rotateLeft(i29, 11);
            int iRotateLeft8 = Integers.rotateLeft(i23 ^ iRotateLeft4, 11);
            int iRotateLeft9 = Integers.rotateLeft(i21 ^ iRotateLeft5, 11);
            int i35 = i24 ^ RC[i18];
            int i36 = ((~i34) & iRotateLeft6) ^ i35;
            int i37 = ((~i25) & iRotateLeft7) ^ i27;
            int i38 = ((~i28) & iRotateLeft8) ^ i31;
            int i39 = ((~i32) & iRotateLeft9) ^ i33;
            int i41 = ((~iRotateLeft6) & i35) ^ i34;
            int i42 = i25 ^ ((~iRotateLeft7) & i27);
            int i43 = ((~iRotateLeft8) & i31) ^ i28;
            int i44 = ((~iRotateLeft9) & i33) ^ i32;
            int i45 = iRotateLeft6 ^ ((~i35) & i34);
            int i46 = iRotateLeft7 ^ ((~i27) & i25);
            int i47 = iRotateLeft8 ^ ((~i31) & i28);
            int i48 = iRotateLeft9 ^ ((~i33) & i32);
            iLittleEndianToInt5 = Integers.rotateLeft(i41, 1);
            int iRotateLeft10 = Integers.rotateLeft(i42, 1);
            int iRotateLeft11 = Integers.rotateLeft(i43, 1);
            int iRotateLeft12 = Integers.rotateLeft(i44, 1);
            iRotateLeft = Integers.rotateLeft(i47, 8);
            iLittleEndianToInt10 = Integers.rotateLeft(i48, 8);
            iLittleEndianToInt11 = Integers.rotateLeft(i45, 8);
            iLittleEndianToInt12 = Integers.rotateLeft(i46, 8);
            iLittleEndianToInt = i36;
            iLittleEndianToInt6 = iRotateLeft10;
            iLittleEndianToInt3 = i38;
            i13 = 12;
            iLittleEndianToInt7 = iRotateLeft11;
            i14 = i18 + 1;
            iLittleEndianToInt2 = i37;
            i15 = iRotateLeft12;
            iLittleEndianToInt4 = i39;
        }
        Pack.intToLittleEndian(iLittleEndianToInt, bArr, 0);
        Pack.intToLittleEndian(iLittleEndianToInt2, bArr, 4);
        Pack.intToLittleEndian(iLittleEndianToInt3, bArr, 8);
        Pack.intToLittleEndian(iLittleEndianToInt4, bArr, 12);
        Pack.intToLittleEndian(iLittleEndianToInt5, bArr, 16);
        Pack.intToLittleEndian(iLittleEndianToInt6, bArr, 20);
        Pack.intToLittleEndian(iLittleEndianToInt7, bArr, 24);
        Pack.intToLittleEndian(i15, bArr, 28);
        Pack.intToLittleEndian(iRotateLeft, bArr, 32);
        Pack.intToLittleEndian(iLittleEndianToInt10, bArr, 36);
        Pack.intToLittleEndian(iLittleEndianToInt11, bArr, 40);
        Pack.intToLittleEndian(iLittleEndianToInt12, bArr, 44);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i11) throws InvalidCipherTextException, IllegalStateException {
        return super.doFinal(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void finishAAD(AEADBaseEngine.State state, boolean z11) {
        finishAAD3(state, z11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
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
        this.K = bArr;
        this.f33140iv = bArr2;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADByte(byte b8) {
        super.processAADByte(b8);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADBytes(byte[] bArr, int i11, int i12) {
        super.processAADBytes(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferAAD(byte[] bArr, int i11) {
        AbsorbAny(bArr, i11, this.AADBufferSize, this.aadcd);
        this.aadcd = (byte) 0;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        up(this.mode, this.state, this.encrypted ? 0 : 128);
        Bytes.xor(this.BlockSize, this.state, bArr, i11, bArr2, i12);
        down(this.mode, this.state, bArr2, i12, this.BlockSize, 0);
        this.phase = 1;
        this.encrypted = true;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        up(this.mode, this.state, this.encrypted ? 0 : 128);
        Bytes.xor(this.BlockSize, this.state, bArr, i11, bArr2, i12);
        down(this.mode, this.state, bArr, i11, this.BlockSize, 0);
        this.phase = 1;
        this.encrypted = true;
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
        AbsorbAny(this.m_aad, 0, this.m_aadPos, this.aadcd);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i11) {
        if (this.m_bufPos != 0 || !this.encrypted) {
            up(this.mode, this.state, this.encrypted ? 0 : 128);
            Bytes.xor(this.m_bufPos, this.state, this.m_buf, 0, bArr, i11);
            boolean z11 = this.forEncryption;
            int i12 = this.mode;
            if (z11) {
                down(i12, this.state, this.m_buf, 0, this.m_bufPos, 0);
            } else {
                down(i12, this.state, bArr, i11, this.m_bufPos, 0);
            }
            this.phase = 1;
        }
        up(this.mode, this.state, 64);
        System.arraycopy(this.state, 0, this.mac, 0, this.MAC_SIZE);
        this.phase = 2;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z11) {
        super.reset(z11);
        Arrays.fill(this.state, (byte) 0);
        this.encrypted = false;
        this.phase = 2;
        this.aadcd = (byte) 3;
        byte[] bArr = this.K;
        int length = bArr.length;
        int length2 = this.f33140iv.length;
        byte[] bArr2 = new byte[this.AADBufferSize];
        this.mode = 0;
        System.arraycopy(bArr, 0, bArr2, 0, length);
        System.arraycopy(this.f33140iv, 0, bArr2, length, length2);
        int i11 = length + length2;
        bArr2[i11] = (byte) length2;
        AbsorbAny(bArr2, 0, i11 + 1, 2);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void init(boolean z11, CipherParameters cipherParameters) {
        super.init(z11, cipherParameters);
    }

    public static void down(XoodyakDigest.Friend friend, int i11, byte[] bArr, byte[] bArr2, int i12, int i13, int i14) {
        if (friend != null) {
            down(i11, bArr, bArr2, i12, i13, i14);
        } else {
            w.l("This method is only for use by XoodyakDigest");
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    public static void up(XoodyakDigest.Friend friend, int i11, byte[] bArr, int i12) {
        if (friend != null) {
            up(i11, bArr, i12);
        } else {
            w.l("This method is only for use by XoodyakDigest");
        }
    }
}
