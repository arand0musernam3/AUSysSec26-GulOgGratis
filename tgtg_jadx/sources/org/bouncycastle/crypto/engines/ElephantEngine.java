package org.bouncycastle.crypto.engines;

import i4.a;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.AEADBaseEngine;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Bytes;
import qc.y;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
public class ElephantEngine extends AEADBaseEngine {

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private byte[] f33108ad;
    private int adOff;
    private int adlen;
    private final byte[] buffer;
    private byte[] current_mask;
    private byte[] expanded_key;
    private final Permutation instance;
    private int nb_its;
    private byte[] next_mask;
    private byte[] npub;
    private byte[] previous_mask;
    private final byte[] previous_outputMessage;
    private final byte[] tag_buffer;

    /* JADX INFO: renamed from: org.bouncycastle.crypto.engines.ElephantEngine$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters;

        static {
            int[] iArr = new int[ElephantParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters = iArr;
            try {
                iArr[ElephantParameters.elephant160.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters[ElephantParameters.elephant176.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters[ElephantParameters.elephant200.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class Dumbo extends Spongent {
        public Dumbo() {
            super(160, 20, 80, (byte) 117);
        }

        @Override // org.bouncycastle.crypto.engines.ElephantEngine.Permutation
        public void lfsr_step() {
            ElephantEngine.this.next_mask[r1.BlockSize - 1] = (byte) (((((ElephantEngine.this.current_mask[0] & 255) << 3) | ((ElephantEngine.this.current_mask[0] & 255) >>> 5)) ^ ((ElephantEngine.this.current_mask[3] & 255) << 7)) ^ ((ElephantEngine.this.current_mask[13] & 255) >>> 7));
        }
    }

    public enum ElephantParameters {
        elephant160,
        elephant176,
        elephant200
    }

    public class Jumbo extends Spongent {
        public Jumbo() {
            super(176, 22, 90, (byte) 69);
        }

        @Override // org.bouncycastle.crypto.engines.ElephantEngine.Permutation
        public void lfsr_step() {
            byte[] bArr = ElephantEngine.this.next_mask;
            ElephantEngine elephantEngine = ElephantEngine.this;
            bArr[elephantEngine.BlockSize - 1] = (byte) ((elephantEngine.rotl(elephantEngine.current_mask[0]) ^ ((ElephantEngine.this.current_mask[3] & 255) << 7)) ^ ((ElephantEngine.this.current_mask[19] & 255) >>> 7));
        }
    }

    public interface Permutation {
        void lfsr_step();

        void permutation(byte[] bArr);
    }

    public static abstract class Spongent implements Permutation {
        private final byte lfsrIV;
        private final int nBits;
        private final int nRounds;
        private final int nSBox;
        private final byte[] sBoxLayer = {-18, -19, -21, -32, -30, -31, -28, -17, -25, -22, -24, -27, -23, -20, -29, -26, -34, -35, -37, -48, -46, -47, -44, -33, -41, -38, -40, -43, -39, -36, -45, -42, -66, -67, -69, -80, -78, -79, -76, -65, -73, -70, -72, -75, -71, PSSSigner.TRAILER_IMPLICIT, -77, -74, 14, 13, 11, 0, 2, 1, 4, 15, 7, 10, 8, 5, 9, 12, 3, 6, 46, 45, 43, 32, 34, 33, 36, 47, 39, 42, 40, 37, 41, 44, 35, 38, 30, 29, 27, 16, 18, 17, 20, 31, 23, 26, 24, 21, 25, 28, 19, 22, 78, 77, 75, 64, 66, 65, 68, 79, 71, 74, 72, 69, 73, 76, 67, 70, -2, -3, -5, -16, -14, -15, -12, -1, -9, -6, -8, -11, -7, -4, -13, -10, 126, 125, 123, 112, 114, 113, 116, ByteCompanionObject.MAX_VALUE, 119, 122, 120, 117, 121, 124, 115, 118, -82, -83, -85, -96, -94, -95, -92, -81, -89, -86, -88, -91, -87, -84, -93, -90, -114, -115, -117, ByteCompanionObject.MIN_VALUE, -126, -127, -124, -113, -121, -118, -120, -123, -119, -116, -125, -122, 94, 93, 91, 80, 82, 81, 84, 95, 87, 90, 88, 85, 89, 92, 83, 86, -98, -99, -101, -112, -110, -111, -108, -97, -105, -102, -104, -107, -103, -100, -109, -106, -50, -51, -53, -64, -62, -63, -60, -49, -57, -54, -56, -59, -55, -52, -61, -58, 62, 61, 59, 48, 50, 49, 52, 63, 55, 58, 56, 53, 57, 60, 51, 54, 110, 109, 107, 96, 98, 97, 100, 111, 103, 106, 104, 101, 105, 108, 99, 102};

        public Spongent(int i11, int i12, int i13, byte b8) {
            this.nRounds = i13;
            this.nSBox = i12;
            this.lfsrIV = b8;
            this.nBits = i11;
        }

        @Override // org.bouncycastle.crypto.engines.ElephantEngine.Permutation
        public void permutation(byte[] bArr) {
            int i11;
            byte b8 = this.lfsrIV;
            byte[] bArr2 = new byte[this.nSBox];
            for (int i12 = 0; i12 < this.nRounds; i12++) {
                bArr[0] = (byte) (bArr[0] ^ b8);
                int i13 = this.nSBox - 1;
                int i14 = b8 & 32;
                int i15 = b8 & 64;
                bArr[i13] = (byte) (bArr[i13] ^ ((byte) (((((((((b8 & 1) << 7) | ((b8 & 2) << 5)) | ((b8 & 4) << 3)) | ((b8 & 8) << 1)) | ((b8 & 16) >>> 1)) | (i14 >>> 3)) | (i15 >>> 5)) | ((b8 & ByteCompanionObject.MIN_VALUE) >>> 7))));
                b8 = (byte) (((b8 << 1) | ((i15 >>> 6) ^ (i14 >>> 5))) & 127);
                for (int i16 = 0; i16 < this.nSBox; i16++) {
                    bArr[i16] = this.sBoxLayer[bArr[i16] & 255];
                }
                Arrays.fill(bArr2, (byte) 0);
                int i17 = 0;
                while (true) {
                    i11 = this.nSBox;
                    if (i17 < i11) {
                        for (int i18 = 0; i18 < 8; i18++) {
                            int i19 = (i17 << 3) + i18;
                            int i21 = this.nBits;
                            if (i19 != i21 - 1) {
                                i19 = ((i19 * i21) >> 2) % (i21 - 1);
                            }
                            int i22 = i19 >>> 3;
                            bArr2[i22] = (byte) (((((bArr[i17] & 255) >>> i18) & 1) << (i19 & 7)) ^ bArr2[i22]);
                        }
                        i17++;
                    }
                }
                System.arraycopy(bArr2, 0, bArr, 0, i11);
            }
        }
    }

    public ElephantEngine(ElephantParameters elephantParameters) {
        this.KEY_SIZE = 16;
        this.IV_SIZE = 12;
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$ElephantEngine$ElephantParameters[elephantParameters.ordinal()];
        if (i11 == 1) {
            this.BlockSize = 20;
            this.instance = new Dumbo();
            this.MAC_SIZE = 8;
            this.algorithmName = "Elephant 160 AEAD";
        } else if (i11 == 2) {
            this.BlockSize = 22;
            this.instance = new Jumbo();
            this.algorithmName = "Elephant 176 AEAD";
            this.MAC_SIZE = 8;
        } else {
            if (i11 != 3) {
                a.f("Invalid parameter settings for Elephant");
                throw null;
            }
            this.BlockSize = 25;
            this.instance = new Delirium(this, null);
            this.algorithmName = "Elephant 200 AEAD";
            this.MAC_SIZE = 16;
        }
        int i12 = this.BlockSize;
        this.tag_buffer = new byte[i12];
        this.previous_mask = new byte[i12];
        this.current_mask = new byte[i12];
        this.next_mask = new byte[i12];
        this.buffer = new byte[i12];
        this.previous_outputMessage = new byte[i12];
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Immediate, AEADBaseEngine.AADOperatorType.Stream, AEADBaseEngine.DataOperatorType.Counter);
    }

    private void absorbAAD() {
        processAADBytes(this.buffer);
        Bytes.xorTo(this.BlockSize, this.next_mask, this.buffer);
        this.instance.permutation(this.buffer);
        Bytes.xorTo(this.BlockSize, this.next_mask, this.buffer);
        Bytes.xorTo(this.BlockSize, this.buffer, this.tag_buffer);
    }

    private void absorbCiphertext() {
        xorTo(this.BlockSize, this.previous_mask, this.next_mask, this.buffer);
        this.instance.permutation(this.buffer);
        xorTo(this.BlockSize, this.previous_mask, this.next_mask, this.buffer);
        Bytes.xorTo(this.BlockSize, this.buffer, this.tag_buffer);
    }

    private void computeCipherBlock(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        System.arraycopy(this.npub, 0, this.buffer, 0, this.IV_SIZE);
        Arrays.fill(this.buffer, this.IV_SIZE, this.BlockSize, (byte) 0);
        xorTo(this.BlockSize, this.current_mask, this.next_mask, this.buffer);
        this.instance.permutation(this.buffer);
        xorTo(this.BlockSize, this.current_mask, this.next_mask, this.buffer);
        Bytes.xorTo(i12, bArr, i11, this.buffer);
        System.arraycopy(this.buffer, 0, bArr2, i13, i12);
    }

    private void lfsr_step() {
        this.instance.lfsr_step();
        System.arraycopy(this.current_mask, 1, this.next_mask, 0, this.BlockSize - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void processAADBytes(byte[] r10) {
        /*
            r9 = this;
            org.bouncycastle.crypto.engines.AEADBaseEngine$State r0 = r9.m_state
            int r0 = r0.ord
            r1 = 6
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == r4) goto L39
            if (r0 == r2) goto L29
            r5 = 5
            if (r0 == r5) goto L12
            if (r0 == r1) goto L29
            goto L37
        L12:
            byte[] r0 = r9.expanded_key
            byte[] r5 = r9.current_mask
            int r6 = r9.BlockSize
            java.lang.System.arraycopy(r0, r3, r5, r3, r6)
            byte[] r0 = r9.npub
            int r5 = r9.IV_SIZE
            java.lang.System.arraycopy(r0, r3, r10, r3, r5)
            int r0 = r9.IV_SIZE
            org.bouncycastle.crypto.engines.AEADBaseEngine$State r5 = org.bouncycastle.crypto.engines.AEADBaseEngine.State.DecAad
        L26:
            r9.m_state = r5
            goto L4e
        L29:
            int r0 = r9.adOff
            int r5 = r9.adlen
            if (r0 != r5) goto L37
            int r0 = r9.BlockSize
            java.util.Arrays.fill(r10, r3, r0, r3)
            r10[r3] = r4
            return
        L37:
            r0 = r3
            goto L4e
        L39:
            byte[] r0 = r9.expanded_key
            byte[] r5 = r9.current_mask
            int r6 = r9.BlockSize
            java.lang.System.arraycopy(r0, r3, r5, r3, r6)
            byte[] r0 = r9.npub
            int r5 = r9.IV_SIZE
            java.lang.System.arraycopy(r0, r3, r10, r3, r5)
            int r0 = r9.IV_SIZE
            org.bouncycastle.crypto.engines.AEADBaseEngine$State r5 = org.bouncycastle.crypto.engines.AEADBaseEngine.State.EncAad
            goto L26
        L4e:
            int r5 = r9.BlockSize
            int r5 = r5 - r0
            int r6 = r9.adlen
            int r7 = r9.adOff
            int r6 = r6 - r7
            if (r5 > r6) goto L63
            byte[] r1 = r9.f33108ad
            java.lang.System.arraycopy(r1, r7, r10, r0, r5)
            int r10 = r9.adOff
            int r10 = r10 + r5
            r9.adOff = r10
            return
        L63:
            if (r6 <= 0) goto L6f
            byte[] r8 = r9.f33108ad
            java.lang.System.arraycopy(r8, r7, r10, r0, r6)
            int r7 = r9.adOff
            int r7 = r7 + r6
            r9.adOff = r7
        L6f:
            int r6 = r6 + r0
            int r0 = r0 + r5
            java.util.Arrays.fill(r10, r6, r0, r3)
            r10[r6] = r4
            org.bouncycastle.crypto.engines.AEADBaseEngine$State r10 = r9.m_state
            int r10 = r10.ord
            if (r10 == r2) goto L84
            if (r10 == r1) goto L7f
            return
        L7f:
            org.bouncycastle.crypto.engines.AEADBaseEngine$State r10 = org.bouncycastle.crypto.engines.AEADBaseEngine.State.DecData
            r9.m_state = r10
            return
        L84:
            org.bouncycastle.crypto.engines.AEADBaseEngine$State r10 = org.bouncycastle.crypto.engines.AEADBaseEngine.State.EncData
            r9.m_state = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.engines.ElephantEngine.processAADBytes(byte[]):void");
    }

    private void processBuffer(byte[] bArr, int i11, byte[] bArr2, int i12, AEADBaseEngine.State state) {
        AEADBaseEngine.State state2 = this.m_state;
        if (state2 == AEADBaseEngine.State.DecInit || state2 == AEADBaseEngine.State.EncInit) {
            processFinalAAD();
        }
        lfsr_step();
        computeCipherBlock(bArr, i11, this.BlockSize, bArr2, i12);
        if (this.nb_its > 0) {
            System.arraycopy(this.previous_outputMessage, 0, this.buffer, 0, this.BlockSize);
            absorbCiphertext();
        }
        if (this.m_state != state) {
            absorbAAD();
        }
        swapMasks();
        this.nb_its++;
    }

    private void processBytes(byte[] bArr, byte[] bArr2, int i11, int i12, int i13, int i14, int i15, int i16) {
        byte[] bArr3 = new byte[this.BlockSize];
        int i17 = this.nb_its;
        int i18 = i11;
        int i19 = 0;
        while (i17 < i12) {
            int i21 = i13 - 1;
            int i22 = this.BlockSize;
            if (i17 == i21) {
                i22 = i15 - (i22 * i17);
            }
            int i23 = i22;
            lfsr_step();
            if (i17 < i13) {
                computeCipherBlock(bArr, i19, i23, bArr2, i18);
                if (this.forEncryption) {
                    System.arraycopy(this.buffer, 0, bArr3, 0, i23);
                } else {
                    System.arraycopy(bArr, i19, bArr3, 0, i23);
                }
                i18 += i23;
                i19 += i23;
            }
            if (i17 > 0 && i17 <= i14) {
                int i24 = this.BlockSize;
                int i25 = (i17 - 1) * i24;
                if (i25 == i15) {
                    Arrays.fill(this.buffer, 1, i24, (byte) 0);
                    this.buffer[0] = 1;
                } else {
                    int i26 = i15 - i25;
                    if (i24 <= i26) {
                        System.arraycopy(this.previous_outputMessage, 0, this.buffer, 0, i24);
                    } else if (i26 > 0) {
                        System.arraycopy(this.previous_outputMessage, 0, this.buffer, 0, i26);
                        Arrays.fill(this.buffer, i26, this.BlockSize, (byte) 0);
                        this.buffer[i26] = 1;
                    }
                }
                absorbCiphertext();
            }
            i17++;
            if (i17 < i16) {
                absorbAAD();
            }
            swapMasks();
            System.arraycopy(bArr3, 0, this.previous_outputMessage, 0, this.BlockSize);
        }
        this.nb_its = i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte rotl(byte b8) {
        return (byte) (((b8 & 255) >>> 7) | (b8 << 1));
    }

    private void swapMasks() {
        byte[] bArr = this.previous_mask;
        this.previous_mask = this.current_mask;
        this.current_mask = this.next_mask;
        this.next_mask = bArr;
    }

    public static void xorTo(int i11, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i12 = 0; i12 < i11; i12++) {
            bArr3[i12] = (byte) (bArr3[i12] ^ (bArr[i12] ^ bArr2[i12]));
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void checkAAD() {
        StringBuilder sb2;
        String str;
        String str2;
        int i11 = this.m_state.ord;
        if (i11 == 3) {
            sb2 = new StringBuilder();
            str = this.algorithmName;
            str2 = " cannot process AAD when the length of the ciphertext to be processed exceeds the a block size";
        } else if (i11 == 4) {
            sb2 = new StringBuilder();
            str = this.algorithmName;
            str2 = " cannot be reused for encryption";
        } else {
            if (i11 != 7) {
                return;
            }
            sb2 = new StringBuilder();
            str = this.algorithmName;
            str2 = " cannot process AAD when the length of the plaintext to be processed exceeds the a block size";
        }
        a.f(k.p(sb2, str, str2));
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public boolean checkData(boolean z11) {
        String algorithmName;
        String str;
        switch (this.m_state.ord) {
            case 1:
            case 2:
            case 3:
                return true;
            case 4:
                algorithmName = getAlgorithmName();
                str = " cannot be reused for encryption";
                break;
            case 5:
            case 6:
            case 7:
                return false;
            default:
                algorithmName = getAlgorithmName();
                str = " needs to be initialized";
                break;
        }
        y.g(algorithmName, str);
        return false;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i11) throws InvalidCipherTextException, IllegalStateException {
        return super.doFinal(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void finishAAD(AEADBaseEngine.State state, boolean z11) {
        finishAAD2(state);
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
    public int getOutputSize(int i11) {
        int i12 = this.m_state.ord;
        if (i12 == 0) {
            a.f(k.p(new StringBuilder(), this.algorithmName, " needs call init function before getUpdateOutputSize"));
            return 0;
        }
        if (i12 == 1 || i12 == 2 || i12 == 3) {
            return i11 + this.m_bufPos + this.MAC_SIZE;
        }
        if (i12 == 4 || i12 == 8) {
            return 0;
        }
        return Math.max(0, (i11 + this.m_bufPos) - this.MAC_SIZE);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i11) {
        switch (this.m_state.ord) {
            case 0:
                a.f(k.p(new StringBuilder(), this.algorithmName, " needs call init function before getUpdateOutputSize"));
                return 0;
            case 1:
            case 2:
            case 3:
                int i12 = this.m_bufPos + i11;
                return i12 - (i12 % this.BlockSize);
            case 4:
            case 8:
                return 0;
            case 5:
            case 6:
            case 7:
                int iMax = Math.max(0, (this.m_bufPos + i11) - this.MAC_SIZE);
                return iMax - (iMax % this.BlockSize);
            default:
                return Math.max(0, (i11 + this.m_bufPos) - this.MAC_SIZE);
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void init(byte[] bArr, byte[] bArr2) throws IllegalArgumentException {
        this.npub = bArr2;
        byte[] bArr3 = new byte[this.BlockSize];
        this.expanded_key = bArr3;
        System.arraycopy(bArr, 0, bArr3, 0, this.KEY_SIZE);
        this.instance.permutation(this.expanded_key);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADByte(byte b8) {
        super.processAADByte(b8);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        processBuffer(bArr, i11, bArr2, i12, AEADBaseEngine.State.DecData);
        System.arraycopy(bArr, i11, this.previous_outputMessage, 0, this.BlockSize);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        processBuffer(bArr, i11, bArr2, i12, AEADBaseEngine.State.EncData);
        System.arraycopy(bArr2, i12, this.previous_outputMessage, 0, this.BlockSize);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processByte(byte b8, byte[] bArr, int i11) throws DataLengthException {
        return super.processByte(b8, bArr, i11);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalAAD() {
        if (this.adOff == -1) {
            this.f33108ad = ((AEADBaseEngine.StreamAADOperator) this.aadOperator).getBytes();
            this.adOff = 0;
            this.adlen = this.aadOperator.getLen();
            this.aadOperator.reset();
        }
        int i11 = this.m_state.ord;
        if (i11 == 1 || i11 == 5) {
            processAADBytes(this.tag_buffer);
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i11) {
        int len = this.dataOperator.getLen() - (this.forEncryption ? 0 : this.MAC_SIZE);
        processFinalAAD();
        int i12 = this.BlockSize;
        int i13 = len / i12;
        int i14 = i13 + 1;
        int i15 = len % i12 != 0 ? i14 : i13;
        int i16 = (this.IV_SIZE + this.adlen) / i12;
        processBytes(this.m_buf, bArr, i11, Math.max(i13 + 2, i16), i15, i14, len, i16 + 1);
        Bytes.xorTo(this.BlockSize, this.expanded_key, this.tag_buffer);
        this.instance.permutation(this.tag_buffer);
        Bytes.xorTo(this.BlockSize, this.expanded_key, this.tag_buffer);
        System.arraycopy(this.tag_buffer, 0, this.mac, 0, this.MAC_SIZE);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z11) {
        super.reset(z11);
        Arrays.fill(this.tag_buffer, (byte) 0);
        Arrays.fill(this.previous_outputMessage, (byte) 0);
        this.nb_its = 0;
        this.adOff = -1;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void init(boolean z11, CipherParameters cipherParameters) {
        super.init(z11, cipherParameters);
    }

    public class Delirium implements Permutation {
        private static final int nRounds = 18;
        private final int[] KeccakRhoOffsets;
        private final byte[] KeccakRoundConstants;

        private Delirium() {
            this.KeccakRoundConstants = new byte[]{1, -126, -118, 0, -117, 1, -127, 9, -118, -120, 9, 10, -117, -117, -119, 3, 2, ByteCompanionObject.MIN_VALUE};
            this.KeccakRhoOffsets = new int[]{0, 1, 6, 4, 3, 4, 4, 6, 7, 4, 3, 2, 3, 1, 7, 1, 5, 7, 5, 0, 2, 2, 5, 0, 6};
        }

        private void KeccakP200Round(byte[] bArr, int i11) {
            byte[] bArr2 = new byte[25];
            for (int i12 = 0; i12 < 5; i12++) {
                for (int i13 = 0; i13 < 5; i13++) {
                    bArr2[i12] = (byte) (bArr2[i12] ^ bArr[index(i12, i13)]);
                }
            }
            int i14 = 0;
            while (i14 < 5) {
                int i15 = i14 + 1;
                bArr2[i14 + 5] = (byte) (bArr2[(i14 + 4) % 5] ^ ROL8(bArr2[i15 % 5], 1));
                i14 = i15;
            }
            for (int i16 = 0; i16 < 5; i16++) {
                for (int i17 = 0; i17 < 5; i17++) {
                    int iIndex = index(i16, i17);
                    bArr[iIndex] = (byte) (bArr[iIndex] ^ bArr2[i16 + 5]);
                }
            }
            for (int i18 = 0; i18 < 5; i18++) {
                for (int i19 = 0; i19 < 5; i19++) {
                    bArr2[index(i18, i19)] = ROL8(bArr[index(i18, i19)], this.KeccakRhoOffsets[index(i18, i19)]);
                }
            }
            for (int i21 = 0; i21 < 5; i21++) {
                for (int i22 = 0; i22 < 5; i22++) {
                    bArr[index(i22, ((i22 * 3) + (i21 * 2)) % 5)] = bArr2[index(i21, i22)];
                }
            }
            for (int i23 = 0; i23 < 5; i23++) {
                int i24 = 0;
                while (i24 < 5) {
                    int i25 = i24 + 1;
                    bArr2[i24] = (byte) (bArr[index(i24, i23)] ^ ((~bArr[index(i25 % 5, i23)]) & bArr[index((i24 + 2) % 5, i23)]));
                    i24 = i25;
                }
                for (int i26 = 0; i26 < 5; i26++) {
                    bArr[index(i26, i23)] = bArr2[i26];
                }
            }
            bArr[0] = (byte) (this.KeccakRoundConstants[i11] ^ bArr[0]);
        }

        private byte ROL8(byte b8, int i11) {
            return (byte) (((b8 & 255) >>> (8 - i11)) | (b8 << i11));
        }

        private int index(int i11, int i12) {
            return (i12 * 5) + i11;
        }

        @Override // org.bouncycastle.crypto.engines.ElephantEngine.Permutation
        public void lfsr_step() {
            byte[] bArr = ElephantEngine.this.next_mask;
            ElephantEngine elephantEngine = ElephantEngine.this;
            int i11 = elephantEngine.BlockSize - 1;
            byte bRotl = elephantEngine.rotl(elephantEngine.current_mask[0]);
            ElephantEngine elephantEngine2 = ElephantEngine.this;
            bArr[i11] = (byte) ((bRotl ^ elephantEngine2.rotl(elephantEngine2.current_mask[2])) ^ (ElephantEngine.this.current_mask[13] << 1));
        }

        @Override // org.bouncycastle.crypto.engines.ElephantEngine.Permutation
        public void permutation(byte[] bArr) {
            for (int i11 = 0; i11 < 18; i11++) {
                KeccakP200Round(bArr, i11);
            }
        }

        public /* synthetic */ Delirium(ElephantEngine elephantEngine, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferAAD(byte[] bArr, int i11) {
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADBytes(byte[] bArr, int i11, int i12) {
        super.processAADBytes(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws DataLengthException {
        return super.processBytes(bArr, i11, i12, bArr2, i13);
    }
}
