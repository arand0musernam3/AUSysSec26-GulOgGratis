package org.bouncycastle.crypto.engines;

import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.AEADBaseEngine;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.util.Bytes;

/* JADX INFO: loaded from: classes3.dex */
public class GiftCofbEngine extends AEADBaseEngine {
    private static final byte[] GIFT_RC = {1, 3, 7, 15, 31, 62, 61, 59, 55, 47, 30, 60, 57, 51, 39, 14, 29, 58, 53, 43, 22, 44, 24, 48, 33, 2, 5, 11, 23, 46, 28, 56, 49, 35, 6, 13, 27, 54, 45, 26};
    private byte[] Y;
    private byte[] input;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f33110k;
    private byte[] npub;
    private byte[] offset;

    public GiftCofbEngine() {
        this.KEY_SIZE = 16;
        this.IV_SIZE = 16;
        this.MAC_SIZE = 16;
        this.BlockSize = 16;
        this.AADBufferSize = 16;
        this.algorithmName = "GIFT-COFB AEAD";
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Buffered, AEADBaseEngine.AADOperatorType.Default, AEADBaseEngine.DataOperatorType.Counter);
    }

    private void double_half_block(byte[] bArr) {
        int i11 = 0;
        int i12 = ((bArr[0] & 255) >>> 7) * 27;
        while (i11 < 7) {
            int i13 = i11 + 1;
            bArr[i11] = (byte) (((bArr[i11] & 255) << 1) | ((bArr[i13] & 255) >>> 7));
            i11 = i13;
        }
        bArr[7] = (byte) (((bArr[7] & 255) << 1) ^ i12);
    }

    private void giftb128(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        char c3 = 0;
        int[] iArr = {((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255), ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255), ((bArr[8] & 255) << 24) | ((bArr[9] & 255) << 16) | ((bArr[10] & 255) << 8) | (bArr[11] & 255), ((bArr[13] & 255) << 16) | ((bArr[12] & 255) << 24) | ((bArr[14] & 255) << 8) | (bArr[15] & 255)};
        short[] sArr = {(short) (((bArr2[0] & 255) << 8) | (bArr2[1] & 255)), (short) (((bArr2[2] & 255) << 8) | (bArr2[3] & 255)), (short) (((bArr2[4] & 255) << 8) | (bArr2[5] & 255)), (short) (((bArr2[6] & 255) << 8) | (bArr2[7] & 255)), (short) (((bArr2[8] & 255) << 8) | (bArr2[9] & 255)), (short) (((bArr2[10] & 255) << 8) | (bArr2[11] & 255)), (short) (((bArr2[12] & 255) << 8) | (bArr2[13] & 255)), (short) (((bArr2[14] & 255) << 8) | (bArr2[15] & 255))};
        int i11 = 0;
        while (i11 < 40) {
            int i12 = iArr[1];
            int i13 = iArr[c3];
            int i14 = iArr[2];
            int i15 = i12 ^ (i13 & i14);
            iArr[1] = i15;
            int i16 = iArr[3];
            int i17 = i13 ^ (i15 & i16);
            iArr[c3] = i17;
            int i18 = i14 ^ (i17 | i15);
            iArr[2] = i18;
            char c7 = c3;
            int i19 = i16 ^ i18;
            iArr[3] = i19;
            int i21 = i15 ^ i19;
            iArr[1] = i21;
            int i22 = ~i19;
            iArr[3] = i22;
            iArr[2] = i18 ^ (i17 & i21);
            iArr[c7] = i22;
            iArr[3] = i17;
            iArr[c7] = rowperm(i22, 0, 3, 2, 1);
            iArr[1] = rowperm(iArr[1], 1, 0, 3, 2);
            iArr[2] = rowperm(iArr[2], 2, 1, 0, 3);
            int iRowperm = rowperm(iArr[3], 3, 2, 1, 0);
            iArr[3] = iRowperm;
            int i23 = iArr[2];
            short s7 = sArr[2];
            int i24 = (s7 & HPKE.aead_EXPORT_ONLY) << 16;
            short s8 = sArr[3];
            iArr[2] = i23 ^ (i24 | (s8 & HPKE.aead_EXPORT_ONLY));
            int i25 = iArr[1];
            short s11 = sArr[6];
            int i26 = (s11 & HPKE.aead_EXPORT_ONLY) << 16;
            short s12 = sArr[7];
            iArr[1] = i25 ^ (i26 | (s12 & HPKE.aead_EXPORT_ONLY));
            iArr[3] = iRowperm ^ ((GIFT_RC[i11] & 255) ^ Integer.MIN_VALUE);
            short s13 = (short) (((s11 & HPKE.aead_EXPORT_ONLY) >>> 2) | ((s11 & HPKE.aead_EXPORT_ONLY) << 14));
            short s14 = (short) (((s12 & HPKE.aead_EXPORT_ONLY) >>> 12) | ((s12 & HPKE.aead_EXPORT_ONLY) << 4));
            sArr[7] = sArr[5];
            sArr[6] = sArr[4];
            sArr[5] = s8;
            sArr[4] = s7;
            sArr[3] = sArr[1];
            sArr[2] = sArr[c7];
            sArr[1] = s14;
            sArr[c7] = s13;
            i11++;
            c3 = c7;
        }
        char c8 = c3;
        int i27 = iArr[c8];
        bArr3[c8] = (byte) (i27 >>> 24);
        bArr3[1] = (byte) (i27 >>> 16);
        bArr3[2] = (byte) (i27 >>> 8);
        bArr3[3] = (byte) i27;
        int i28 = iArr[1];
        bArr3[4] = (byte) (i28 >>> 24);
        bArr3[5] = (byte) (i28 >>> 16);
        bArr3[6] = (byte) (i28 >>> 8);
        bArr3[7] = (byte) i28;
        int i29 = iArr[2];
        bArr3[8] = (byte) (i29 >>> 24);
        bArr3[9] = (byte) (i29 >>> 16);
        bArr3[10] = (byte) (i29 >>> 8);
        bArr3[11] = (byte) i29;
        int i31 = iArr[3];
        bArr3[12] = (byte) (i31 >>> 24);
        bArr3[13] = (byte) (i31 >>> 16);
        bArr3[14] = (byte) (i31 >>> 8);
        bArr3[15] = (byte) i31;
    }

    private void pho1(byte[] bArr, byte[] bArr2, byte[] bArr3, int i11, int i12) {
        byte[] bArr4 = new byte[16];
        byte[] bArr5 = new byte[16];
        if (i12 == 0) {
            bArr4[0] = ByteCompanionObject.MIN_VALUE;
        } else {
            System.arraycopy(bArr3, i11, bArr4, 0, i12);
            if (i12 < 16) {
                bArr4[i12] = ByteCompanionObject.MIN_VALUE;
            }
        }
        System.arraycopy(bArr2, 8, bArr5, 0, 8);
        int i13 = 0;
        while (i13 < 7) {
            int i14 = i13 + 8;
            int i15 = (bArr2[i13] & 255) << 1;
            i13++;
            bArr5[i14] = (byte) (((bArr2[i13] & 255) >>> 7) | i15);
        }
        bArr5[15] = (byte) (((bArr2[7] & 255) << 1) | ((bArr2[0] & 255) >>> 7));
        System.arraycopy(bArr5, 0, bArr2, 0, 16);
        Bytes.xor(16, bArr2, bArr4, bArr);
    }

    private int rowperm(int i11, int i12, int i13, int i14, int i15) {
        int i16 = 0;
        for (int i17 = 0; i17 < 8; i17++) {
            int i18 = i17 * 4;
            i16 = i16 | (((i11 >>> i18) & 1) << ((i12 * 8) + i17)) | (((i11 >>> (i18 + 1)) & 1) << ((i13 * 8) + i17)) | (((i11 >>> (i18 + 2)) & 1) << ((i14 * 8) + i17)) | (((i11 >>> (i18 + 3)) & 1) << ((8 * i15) + i17));
        }
        return i16;
    }

    private void triple_half_block(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        int i11 = 0;
        while (i11 < 7) {
            int i12 = i11 + 1;
            bArr2[i11] = (byte) (((bArr[i12] & 255) >>> 7) | ((bArr[i11] & 255) << 1));
            i11 = i12;
        }
        bArr2[7] = (byte) ((((bArr[0] & 255) >>> 7) * 27) ^ ((bArr[7] & 255) << 1));
        Bytes.xorTo(8, bArr2, bArr);
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
    public void init(byte[] bArr, byte[] bArr2) {
        this.npub = bArr2;
        this.f33110k = bArr;
        this.Y = new byte[this.BlockSize];
        this.input = new byte[16];
        this.offset = new byte[8];
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
        pho1(this.input, this.Y, bArr, i11, 16);
        double_half_block(this.offset);
        Bytes.xorTo(8, this.offset, this.input);
        giftb128(this.input, this.f33110k, this.Y);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        double_half_block(this.offset);
        Bytes.xor(this.BlockSize, this.Y, bArr, i11, bArr2, i12);
        pho1(this.input, this.Y, bArr2, i12, this.BlockSize);
        Bytes.xorTo(8, this.offset, this.input);
        giftb128(this.input, this.f33110k, this.Y);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        double_half_block(this.offset);
        Bytes.xor(this.BlockSize, this.Y, bArr, i11, bArr2, i12);
        pho1(this.input, this.Y, bArr, i11, this.BlockSize);
        Bytes.xorTo(8, this.offset, this.input);
        giftb128(this.input, this.f33110k, this.Y);
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
        AEADBaseEngine.State state;
        int len = this.dataOperator.getLen() - (this.forEncryption ? 0 : this.MAC_SIZE);
        triple_half_block(this.offset);
        if ((this.m_aadPos & 15) != 0 || (state = this.m_state) == AEADBaseEngine.State.DecInit || state == AEADBaseEngine.State.EncInit) {
            triple_half_block(this.offset);
        }
        if (len == 0) {
            triple_half_block(this.offset);
            triple_half_block(this.offset);
        }
        pho1(this.input, this.Y, this.m_aad, 0, this.m_aadPos);
        Bytes.xorTo(8, this.offset, this.input);
        giftb128(this.input, this.f33110k, this.Y);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i11) {
        GiftCofbEngine giftCofbEngine;
        int len = this.dataOperator.getLen() - (this.forEncryption ? 0 : this.MAC_SIZE);
        if (len != 0) {
            triple_half_block(this.offset);
            if ((len & 15) != 0) {
                triple_half_block(this.offset);
            }
            Bytes.xor(this.m_bufPos, this.Y, this.m_buf, 0, bArr, i11);
            boolean z11 = this.forEncryption;
            byte[] bArr2 = this.input;
            if (z11) {
                giftCofbEngine = this;
                giftCofbEngine.pho1(bArr2, this.Y, this.m_buf, 0, this.m_bufPos);
            } else {
                giftCofbEngine = this;
                giftCofbEngine.pho1(bArr2, giftCofbEngine.Y, bArr, i11, giftCofbEngine.m_bufPos);
            }
            Bytes.xorTo(8, giftCofbEngine.offset, giftCofbEngine.input);
            giftb128(giftCofbEngine.input, giftCofbEngine.f33110k, giftCofbEngine.Y);
        } else {
            giftCofbEngine = this;
        }
        System.arraycopy(giftCofbEngine.Y, 0, giftCofbEngine.mac, 0, giftCofbEngine.BlockSize);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z11) {
        super.reset(z11);
        System.arraycopy(this.npub, 0, this.input, 0, this.IV_SIZE);
        giftb128(this.input, this.f33110k, this.Y);
        System.arraycopy(this.Y, 0, this.offset, 0, 8);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void init(boolean z11, CipherParameters cipherParameters) {
        super.init(z11, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }
}
