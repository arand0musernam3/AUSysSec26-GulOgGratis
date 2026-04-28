package org.bouncycastle.crypto.engines;

import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.AEADBaseEngine;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class Grain128AEADEngine extends AEADBaseEngine {
    private static final int STATE_SIZE = 4;
    private final int[] authAcc;
    private final int[] authSr;
    private final int[] lfsr;
    private final int[] nfsr;
    private byte[] workingIV;
    private byte[] workingKey;

    public Grain128AEADEngine() {
        this.algorithmName = "Grain-128 AEAD";
        this.KEY_SIZE = 16;
        this.IV_SIZE = 12;
        this.MAC_SIZE = 8;
        this.lfsr = new int[4];
        this.nfsr = new int[4];
        this.authAcc = new int[2];
        this.authSr = new int[2];
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Immediate, AEADBaseEngine.AADOperatorType.Stream, AEADBaseEngine.DataOperatorType.StreamCipher);
    }

    private void absorbAadData(byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            byte b8 = bArr[i11 + i13];
            for (int i14 = 0; i14 < 8; i14++) {
                shift();
                updateInternalState((b8 >> i14) & 1);
            }
        }
    }

    private int getByteKeyStream() {
        int output = getOutput();
        shift();
        return output;
    }

    private int getOutput() {
        int[] iArr = this.nfsr;
        int i11 = iArr[0];
        int i12 = i11 >>> 12;
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = i14 >>> 9;
        int i16 = i14 >>> 25;
        int i17 = i14 >>> 31;
        int[] iArr2 = this.lfsr;
        int i18 = iArr2[0];
        int i19 = iArr2[1];
        int i21 = iArr2[2];
        int i22 = (i18 >>> 20) & (i18 >>> 13);
        return (((i14 ^ (((((((((i22 ^ ((i18 >>> 8) & i12)) ^ (i17 & (i19 >>> 10))) ^ ((i19 >>> 28) & (i21 >>> 15))) ^ ((i12 & i17) & (i21 >>> 30))) ^ (i21 >>> 29)) ^ (i11 >>> 2)) ^ (i11 >>> 15)) ^ (i13 >>> 4)) ^ (i13 >>> 13))) ^ i15) ^ i16) & 1;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i11 = iArr[0];
        int i12 = iArr[1] >>> 6;
        int i13 = iArr[2];
        return (iArr[3] ^ ((((i11 ^ (i11 >>> 7)) ^ i12) ^ (i13 >>> 6)) ^ (i13 >>> 17))) & 1;
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i11 = iArr[0];
        int i12 = i11 >>> 25;
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = ((i11 >>> 26) ^ i11) ^ (i13 >>> 24);
        return (((((((((((iArr[3] ^ (i15 ^ (i14 >>> 27))) ^ ((i11 & i14) >>> 3)) ^ ((i11 >>> 11) & (i11 >>> 13))) ^ ((i11 >>> 17) & (i11 >>> 18))) ^ ((i11 & i13) >>> 27)) ^ ((i13 >>> 8) & (i13 >>> 16))) ^ ((i13 >>> 29) & (i14 >>> 1))) ^ ((i14 >>> 4) & (i14 >>> 20))) ^ (((i11 >>> 22) & (i11 >>> 24)) & i12)) ^ (((i14 >>> 6) & (i14 >>> 14)) & (i14 >>> 18))) ^ ((((i14 >>> 24) & (i14 >>> 28)) & (i14 >>> 29)) & (i14 >>> 31))) & 1;
    }

    private void initGrain(int[] iArr) {
        for (int i11 = 0; i11 < 2; i11++) {
            for (int i12 = 0; i12 < 32; i12++) {
                iArr[i11] = iArr[i11] | (getByteKeyStream() << i12);
            }
        }
    }

    private void shift(int[] iArr, int i11) {
        int i12 = iArr[0] >>> 1;
        int i13 = iArr[1];
        iArr[0] = i12 | (i13 << 31);
        int i14 = i13 >>> 1;
        int i15 = iArr[2];
        iArr[1] = i14 | (i15 << 31);
        int i16 = iArr[3];
        iArr[2] = (i15 >>> 1) | (i16 << 31);
        iArr[3] = (i11 << 31) | (i16 >>> 1);
    }

    private void updateInternalState(int i11) {
        int i12 = -i11;
        int[] iArr = this.authAcc;
        int i13 = iArr[0];
        int[] iArr2 = this.authSr;
        iArr[0] = i13 ^ (iArr2[0] & i12);
        iArr[1] = (i12 & iArr2[1]) ^ iArr[1];
        int byteKeyStream = getByteKeyStream();
        int[] iArr3 = this.authSr;
        int i14 = iArr3[0] >>> 1;
        int i15 = iArr3[1];
        iArr3[0] = i14 | (i15 << 31);
        iArr3[1] = (byteKeyStream << 31) | (i15 >>> 1);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i11) throws InvalidCipherTextException, IllegalStateException {
        return super.doFinal(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void finishAAD(AEADBaseEngine.State state, boolean z11) {
        finishAAD1(state);
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
    public int getUpdateOutputSize(int i11) {
        return getTotalBytesForUpdate(i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void init(byte[] bArr, byte[] bArr2) throws IllegalArgumentException {
        byte[] bArr3 = new byte[16];
        this.workingIV = bArr3;
        this.workingKey = bArr;
        System.arraycopy(bArr2, 0, bArr3, 0, this.IV_SIZE);
        byte[] bArr4 = this.workingIV;
        bArr4[12] = -1;
        bArr4[13] = -1;
        bArr4[14] = -1;
        bArr4[15] = ByteCompanionObject.MAX_VALUE;
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
    public void processBufferDecrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int len = this.dataOperator.getLen();
        for (int i13 = 0; i13 < len; i13++) {
            byte b8 = bArr[i11 + i13];
            byte byteKeyStream = 0;
            for (int i14 = 0; i14 < 8; i14++) {
                byteKeyStream = (byte) (byteKeyStream | ((((b8 >> i14) & 1) ^ getByteKeyStream()) << i14));
                updateInternalState((byteKeyStream >> i14) & 1);
            }
            bArr2[i12 + i13] = byteKeyStream;
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int len = this.dataOperator.getLen();
        for (int i13 = 0; i13 < len; i13++) {
            byte b8 = bArr[i11 + i13];
            byte byteKeyStream = 0;
            for (int i14 = 0; i14 < 8; i14++) {
                int i15 = (b8 >> i14) & 1;
                byteKeyStream = (byte) (byteKeyStream | ((getByteKeyStream() ^ i15) << i14));
                updateInternalState(i15);
            }
            bArr2[i12 + i13] = byteKeyStream;
        }
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
        int i11;
        int i12;
        int len = this.aadOperator.getLen();
        byte[] bytes = ((AEADBaseEngine.StreamAADOperator) this.aadOperator).getBytes();
        byte[] bArr = new byte[5];
        if (len < 128) {
            i12 = 4;
            bArr[4] = (byte) len;
        } else {
            int i13 = len;
            int i14 = 5;
            while (true) {
                i11 = i14 - 1;
                bArr[i11] = (byte) i13;
                i13 >>>= 8;
                if (i13 == 0) {
                    break;
                } else {
                    i14 = i11;
                }
            }
            int i15 = i14 - 2;
            bArr[i15] = (byte) ((5 - i11) | 128);
            i12 = i15;
        }
        absorbAadData(bArr, i12, 5 - i12);
        absorbAadData(bytes, 0, len);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i11) {
        int[] iArr = this.authAcc;
        int i12 = iArr[0];
        int[] iArr2 = this.authSr;
        iArr[0] = i12 ^ iArr2[0];
        iArr[1] = iArr2[1] ^ iArr[1];
        Pack.intToLittleEndian(iArr, this.mac, 0);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z11) {
        super.reset(z11);
        Pack.littleEndianToInt(this.workingKey, 0, this.nfsr);
        Pack.littleEndianToInt(this.workingIV, 0, this.lfsr);
        Arrays.clear(this.authAcc);
        Arrays.clear(this.authSr);
        for (int i11 = 0; i11 < 320; i11++) {
            int output = getOutput();
            shift(this.nfsr, ((getOutputNFSR() ^ this.lfsr[0]) ^ output) & 1);
            shift(this.lfsr, (output ^ getOutputLFSR()) & 1);
        }
        for (int i12 = 0; i12 < 8; i12++) {
            for (int i13 = 0; i13 < 8; i13++) {
                int output2 = getOutput();
                shift(this.nfsr, (((getOutputNFSR() ^ this.lfsr[0]) ^ output2) ^ (this.workingKey[i12] >> i13)) & 1);
                shift(this.lfsr, ((output2 ^ getOutputLFSR()) ^ (this.workingKey[i12 + 8] >> i13)) & 1);
            }
        }
        initGrain(this.authAcc);
        initGrain(this.authSr);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void init(boolean z11, CipherParameters cipherParameters) {
        super.init(z11, cipherParameters);
    }

    private void shift() {
        shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 1);
        shift(this.lfsr, getOutputLFSR() & 1);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferAAD(byte[] bArr, int i11) {
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }
}
