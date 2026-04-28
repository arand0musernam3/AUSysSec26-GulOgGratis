package org.bouncycastle.crypto.engines;

import c50.w;
import java.lang.reflect.Array;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.digests.PhotonBeetleDigest;
import org.bouncycastle.crypto.engines.AEADBaseEngine;
import org.bouncycastle.util.Bytes;

/* JADX INFO: loaded from: classes3.dex */
public class PhotonBeetleEngine extends AEADBaseEngine {
    private static final int D = 8;
    private byte[] K;
    private final int LAST_THREE_BITS_OFFSET;
    private byte[] N;
    private final int RATE_INBYTES_HALF;
    private final int STATE_INBYTES;
    private boolean input_empty;
    private byte[] state;
    private static final byte[][] RC = {new byte[]{1, 3, 7, 14, 13, 11, 6, 12, 9, 2, 5, 10}, new byte[]{0, 2, 6, 15, 12, 10, 7, 13, 8, 3, 4, 11}, new byte[]{2, 0, 4, 13, 14, 8, 5, 15, 10, 1, 6, 9}, new byte[]{6, 4, 0, 9, 10, 12, 1, 11, 14, 5, 2, 13}, new byte[]{14, 12, 8, 1, 2, 4, 9, 3, 6, 13, 10, 5}, new byte[]{15, 13, 9, 0, 3, 5, 8, 2, 7, 12, 11, 4}, new byte[]{13, 15, 11, 2, 1, 7, 10, 0, 5, 14, 9, 6}, new byte[]{9, 11, 15, 6, 5, 3, 14, 4, 1, 10, 13, 2}};
    private static final byte[][] MixColMatrix = {new byte[]{2, 4, 2, 11, 2, 8, 5, 6}, new byte[]{12, 9, 8, 13, 7, 7, 5, 2}, new byte[]{4, 4, 13, 13, 9, 4, 13, 9}, new byte[]{1, 6, 5, 1, 12, 13, 15, 14}, new byte[]{15, 12, 9, 13, 14, 5, 14, 13}, new byte[]{9, 14, 5, 15, 4, 12, 9, 6}, new byte[]{12, 2, 2, 10, 3, 1, 1, 14}, new byte[]{15, 1, 13, 10, 5, 10, 2, 3}};
    private static final byte[] sbox = {12, 5, 6, 11, 9, 0, 10, 13, 3, 14, 15, 8, 4, 7, 1, 2};

    /* JADX INFO: renamed from: org.bouncycastle.crypto.engines.PhotonBeetleEngine$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$PhotonBeetleEngine$PhotonBeetleParameters;

        static {
            int[] iArr = new int[PhotonBeetleParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$PhotonBeetleEngine$PhotonBeetleParameters = iArr;
            try {
                iArr[PhotonBeetleParameters.pb32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$PhotonBeetleEngine$PhotonBeetleParameters[PhotonBeetleParameters.pb128.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum PhotonBeetleParameters {
        pb32,
        pb128
    }

    public PhotonBeetleEngine(PhotonBeetleParameters photonBeetleParameters) {
        int i11;
        int i12;
        this.MAC_SIZE = 16;
        this.IV_SIZE = 16;
        this.KEY_SIZE = 16;
        int i13 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$PhotonBeetleEngine$PhotonBeetleParameters[photonBeetleParameters.ordinal()];
        if (i13 != 1) {
            i11 = i13 != 2 ? 0 : 128;
            i12 = i11;
        } else {
            i11 = 32;
            i12 = BERTags.FLAGS;
        }
        int i14 = i11 + 7;
        int i15 = i14 >>> 3;
        this.BlockSize = i15;
        this.AADBufferSize = i15;
        this.RATE_INBYTES_HALF = i14 >>> 4;
        int i16 = ((i11 + i12) + 7) >>> 3;
        this.STATE_INBYTES = i16;
        this.LAST_THREE_BITS_OFFSET = (r4 - ((i16 - 1) << 3)) - 3;
        this.algorithmName = "Photon-Beetle AEAD";
        this.state = new byte[i16];
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Buffered, AEADBaseEngine.AADOperatorType.Counter, AEADBaseEngine.DataOperatorType.Counter);
    }

    private static void photonPermutation(byte[] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 8, 8);
        for (int i11 = 0; i11 < 64; i11++) {
            bArr2[i11 >>> 3][i11 & 7] = (byte) (((bArr[i11 >> 1] & 255) >>> ((i11 & 1) * 4)) & 15);
        }
        for (int i12 = 0; i12 < 12; i12++) {
            for (int i13 = 0; i13 < 8; i13++) {
                byte[] bArr3 = bArr2[i13];
                bArr3[0] = (byte) (bArr3[0] ^ RC[i13][i12]);
            }
            for (int i14 = 0; i14 < 8; i14++) {
                for (int i15 = 0; i15 < 8; i15++) {
                    byte[] bArr4 = bArr2[i14];
                    bArr4[i15] = sbox[bArr4[i15]];
                }
            }
            for (int i16 = 1; i16 < 8; i16++) {
                System.arraycopy(bArr2[i16], 0, bArr, 0, 8);
                int i17 = 8 - i16;
                System.arraycopy(bArr, i16, bArr2[i16], 0, i17);
                System.arraycopy(bArr, 0, bArr2[i16], i17, i16);
            }
            for (int i18 = 0; i18 < 8; i18++) {
                for (int i19 = 0; i19 < 8; i19++) {
                    int i21 = 0;
                    for (int i22 = 0; i22 < 8; i22++) {
                        byte b8 = MixColMatrix[i19][i22];
                        byte b11 = bArr2[i22][i18];
                        i21 = (((i21 ^ ((b11 & 1) * b8)) ^ ((b11 & 2) * b8)) ^ ((b11 & 4) * b8)) ^ (b8 * (b11 & 8));
                    }
                    int i23 = i21 >>> 4;
                    int i24 = (i23 << 1) ^ ((i21 & 15) ^ i23);
                    int i25 = i24 >>> 4;
                    bArr[i19] = (byte) (((i24 & 15) ^ i25) ^ (i25 << 1));
                }
                for (int i26 = 0; i26 < 8; i26++) {
                    bArr2[i26][i18] = bArr[i26];
                }
            }
        }
        for (int i27 = 0; i27 < 64; i27 += 2) {
            byte[] bArr5 = bArr2[i27 >>> 3];
            bArr[i27 >>> 1] = (byte) (((bArr5[(i27 + 1) & 7] & 15) << 4) | (bArr5[i27 & 7] & 15));
        }
    }

    private void rhoohr(byte[] bArr, int i11, byte[] bArr2, int i12, int i13) {
        photonPermutation(this.state);
        byte[] bArr3 = new byte[8];
        int iMin = Math.min(i13, this.RATE_INBYTES_HALF);
        int i14 = 0;
        while (true) {
            int i15 = this.RATE_INBYTES_HALF;
            int i16 = i15 - 1;
            byte[] bArr4 = this.state;
            if (i14 >= i16) {
                bArr3[i15 - 1] = (byte) (((bArr4[0] & 1) << 7) | ((bArr4[i14] & 255) >>> 1));
                Bytes.xor(iMin, bArr4, i15, bArr2, i12, bArr, i11);
                Bytes.xor(i13 - iMin, bArr3, iMin - this.RATE_INBYTES_HALF, bArr2, i12 + iMin, bArr, i11 + iMin);
                return;
            }
            int i17 = i14 + 1;
            bArr3[i14] = (byte) (((bArr4[i17] & 1) << 7) | ((bArr4[i14] & 255) >>> 1));
            i14 = i17;
        }
    }

    private byte select(boolean z11, boolean z12, byte b8, byte b11) {
        if (z11 && z12) {
            return (byte) 1;
        }
        if (z11) {
            return (byte) 2;
        }
        return z12 ? b8 : b11;
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
        this.N = bArr2;
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
        photonPermutation(this.state);
        Bytes.xorTo(this.BlockSize, bArr, i11, this.state);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        rhoohr(bArr2, i12, bArr, i11, this.BlockSize);
        Bytes.xorTo(this.BlockSize, bArr2, i12, this.state);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        rhoohr(bArr2, i12, bArr, i11, this.BlockSize);
        Bytes.xorTo(this.BlockSize, bArr, i11, this.state);
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
        int len = this.aadOperator.getLen();
        if (len != 0) {
            if (this.m_aadPos != 0) {
                photonPermutation(this.state);
                Bytes.xorTo(this.m_aadPos, this.m_aad, this.state);
                int i11 = this.m_aadPos;
                if (i11 < this.BlockSize) {
                    byte[] bArr = this.state;
                    bArr[i11] = (byte) (bArr[i11] ^ 1);
                }
            }
            byte[] bArr2 = this.state;
            int i12 = this.STATE_INBYTES - 1;
            bArr2[i12] = (byte) ((select(this.dataOperator.getLen() - (this.forEncryption ? 0 : this.MAC_SIZE) > 0, len % this.BlockSize == 0, (byte) 3, (byte) 4) << this.LAST_THREE_BITS_OFFSET) ^ bArr2[i12]);
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i11) {
        PhotonBeetleEngine photonBeetleEngine;
        int len = this.dataOperator.getLen() - (this.forEncryption ? 0 : this.MAC_SIZE);
        int i12 = this.m_bufPos;
        int len2 = this.aadOperator.getLen();
        if (len2 != 0 || len != 0) {
            this.input_empty = false;
        }
        byte bSelect = select(len2 != 0, len % this.BlockSize == 0, (byte) 5, (byte) 6);
        if (len != 0) {
            if (i12 != 0) {
                photonBeetleEngine = this;
                photonBeetleEngine.rhoohr(bArr, i11, this.m_buf, 0, i12);
                if (photonBeetleEngine.forEncryption) {
                    Bytes.xorTo(i12, photonBeetleEngine.m_buf, photonBeetleEngine.state);
                } else {
                    Bytes.xorTo(i12, bArr, i11, photonBeetleEngine.state);
                }
                if (i12 < photonBeetleEngine.BlockSize) {
                    byte[] bArr2 = photonBeetleEngine.state;
                    bArr2[i12] = (byte) (bArr2[i12] ^ 1);
                }
            } else {
                photonBeetleEngine = this;
            }
            byte[] bArr3 = photonBeetleEngine.state;
            int i13 = photonBeetleEngine.STATE_INBYTES - 1;
            bArr3[i13] = (byte) (bArr3[i13] ^ (bSelect << photonBeetleEngine.LAST_THREE_BITS_OFFSET));
        } else {
            photonBeetleEngine = this;
            if (photonBeetleEngine.input_empty) {
                byte[] bArr4 = photonBeetleEngine.state;
                int i14 = photonBeetleEngine.STATE_INBYTES - 1;
                bArr4[i14] = (byte) (bArr4[i14] ^ (1 << photonBeetleEngine.LAST_THREE_BITS_OFFSET));
            }
        }
        photonPermutation(photonBeetleEngine.state);
        System.arraycopy(photonBeetleEngine.state, 0, photonBeetleEngine.mac, 0, photonBeetleEngine.MAC_SIZE);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z11) {
        super.reset(z11);
        this.input_empty = true;
        byte[] bArr = this.K;
        System.arraycopy(bArr, 0, this.state, 0, bArr.length);
        byte[] bArr2 = this.N;
        System.arraycopy(bArr2, 0, this.state, this.K.length, bArr2.length);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void init(boolean z11, CipherParameters cipherParameters) {
        super.init(z11, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    public static void photonPermutation(PhotonBeetleDigest.Friend friend, byte[] bArr) {
        if (friend != null) {
            photonPermutation(bArr);
        } else {
            w.l("This method is only for use by PhotonBeetleDigest");
        }
    }
}
