package org.bouncycastle.crypto.modes;

import i4.a;
import j4.s;
import java.util.Vector;
import kotlin.jvm.internal.ByteCompanionObject;
import m0.i1;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Longs;

/* JADX INFO: loaded from: classes3.dex */
public class OCBBlockCipher implements AEADBlockCipher {
    private static final int BLOCK_SIZE = 16;
    private byte[] Checksum;
    private Vector L;
    private byte[] L_Asterisk;
    private byte[] L_Dollar;
    private byte[] OffsetHASH;
    private byte[] Sum;
    private boolean forEncryption;
    private byte[] hashBlock;
    private long hashBlockCount;
    private int hashBlockPos;
    private BlockCipher hashCipher;
    private byte[] initialAssociatedText;
    private byte[] macBlock;
    private int macSize;
    private byte[] mainBlock;
    private long mainBlockCount;
    private int mainBlockPos;
    private BlockCipher mainCipher;
    private byte[] KtopInput = null;
    private byte[] Stretch = new byte[24];
    private byte[] OffsetMAIN_0 = new byte[16];
    private byte[] OffsetMAIN = new byte[16];

    public OCBBlockCipher(BlockCipher blockCipher, BlockCipher blockCipher2) {
        if (blockCipher == null) {
            a.f("'hashCipher' cannot be null");
            throw null;
        }
        if (blockCipher.getBlockSize() != 16) {
            a.f("'hashCipher' must have a block size of 16");
            throw null;
        }
        if (blockCipher2 == null) {
            a.f("'mainCipher' cannot be null");
            throw null;
        }
        if (blockCipher2.getBlockSize() != 16) {
            a.f("'mainCipher' must have a block size of 16");
            throw null;
        }
        if (!blockCipher.getAlgorithmName().equals(blockCipher2.getAlgorithmName())) {
            a.f("'hashCipher' and 'mainCipher' must be the same algorithm");
            throw null;
        }
        this.hashCipher = blockCipher;
        this.mainCipher = blockCipher2;
    }

    public static byte[] OCB_double(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) ((135 >>> ((1 - shiftLeft(bArr, bArr2)) << 3)) ^ bArr2[15]);
        return bArr2;
    }

    public static void OCB_extend(byte[] bArr, int i11) {
        bArr[i11] = ByteCompanionObject.MIN_VALUE;
        while (true) {
            i11++;
            if (i11 >= 16) {
                return;
            } else {
                bArr[i11] = 0;
            }
        }
    }

    public static int OCB_ntz(long j9) {
        return Longs.numberOfTrailingZeros(j9);
    }

    public static int shiftLeft(byte[] bArr, byte[] bArr2) {
        int i11 = 16;
        int i12 = 0;
        while (true) {
            i11--;
            if (i11 < 0) {
                return i12;
            }
            int i13 = bArr[i11] & 255;
            bArr2[i11] = (byte) (i12 | (i13 << 1));
            i12 = (i13 >>> 7) & 1;
        }
    }

    public static void xor(byte[] bArr, byte[] bArr2) {
        Bytes.xorTo(16, bArr2, bArr);
    }

    public void clear(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i11) throws InvalidCipherTextException, IllegalStateException {
        byte[] bArr2;
        String str;
        if (this.forEncryption) {
            bArr2 = null;
        } else {
            int i12 = this.mainBlockPos;
            int i13 = this.macSize;
            if (i12 < i13) {
                str = "data too short";
                i1.i(str);
                return 0;
            }
            int i14 = i12 - i13;
            this.mainBlockPos = i14;
            bArr2 = new byte[i13];
            System.arraycopy(this.mainBlock, i14, bArr2, 0, i13);
        }
        int i15 = this.hashBlockPos;
        if (i15 > 0) {
            OCB_extend(this.hashBlock, i15);
            updateHASH(this.L_Asterisk);
        }
        int i16 = this.mainBlockPos;
        if (i16 > 0) {
            if (this.forEncryption) {
                OCB_extend(this.mainBlock, i16);
                xor(this.Checksum, this.mainBlock);
            }
            xor(this.OffsetMAIN, this.L_Asterisk);
            byte[] bArr3 = new byte[16];
            this.hashCipher.processBlock(this.OffsetMAIN, 0, bArr3, 0);
            xor(this.mainBlock, bArr3);
            int length = bArr.length;
            int i17 = this.mainBlockPos;
            if (length >= i11 + i17) {
                System.arraycopy(this.mainBlock, 0, bArr, i11, i17);
                if (!this.forEncryption) {
                    OCB_extend(this.mainBlock, this.mainBlockPos);
                    xor(this.Checksum, this.mainBlock);
                }
            }
            i1.r("Output buffer too short");
            return 0;
        }
        xor(this.Checksum, this.OffsetMAIN);
        xor(this.Checksum, this.L_Dollar);
        BlockCipher blockCipher = this.hashCipher;
        byte[] bArr4 = this.Checksum;
        blockCipher.processBlock(bArr4, 0, bArr4, 0);
        xor(this.Checksum, this.Sum);
        int i18 = this.macSize;
        byte[] bArr5 = new byte[i18];
        this.macBlock = bArr5;
        System.arraycopy(this.Checksum, 0, bArr5, 0, i18);
        int i19 = this.mainBlockPos;
        if (this.forEncryption) {
            int length2 = bArr.length;
            int i21 = i11 + i19;
            int i22 = this.macSize;
            if (length2 >= i21 + i22) {
                System.arraycopy(this.macBlock, 0, bArr, i21, i22);
                i19 += this.macSize;
            }
            i1.r("Output buffer too short");
            return 0;
        }
        if (!Arrays.constantTimeAreEqual(this.macBlock, bArr2)) {
            str = "mac check in OCB failed";
            i1.i(str);
            return 0;
        }
        reset(false);
        return i19;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.mainCipher.getAlgorithmName() + "/OCB";
    }

    public byte[] getLSub(int i11) {
        while (true) {
            int size = this.L.size();
            Vector vector = this.L;
            if (i11 < size) {
                return (byte[]) vector.elementAt(i11);
            }
            vector.addElement(OCB_double((byte[]) vector.lastElement()));
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        byte[] bArr = this.macBlock;
        return bArr == null ? new byte[this.macSize] : Arrays.clone(bArr);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i11) {
        int i12 = i11 + this.mainBlockPos;
        boolean z11 = this.forEncryption;
        int i13 = this.macSize;
        if (z11) {
            return i12 + i13;
        }
        if (i12 < i13) {
            return 0;
        }
        return i12 - i13;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.mainCipher;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i11) {
        int i12 = i11 + this.mainBlockPos;
        if (!this.forEncryption) {
            int i13 = this.macSize;
            if (i12 < i13) {
                return 0;
            }
            i12 -= i13;
        }
        return i12 - (i12 % 16);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z11, CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] iv2;
        KeyParameter key;
        boolean z12 = this.forEncryption;
        this.forEncryption = z11;
        this.macBlock = null;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv2 = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 64 || macSize > 128 || macSize % 8 != 0) {
                a.f(s.f(macSize, "Invalid value for MAC size: "));
                return;
            } else {
                this.macSize = macSize / 8;
                key = aEADParameters.getKey();
            }
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                a.f("invalid parameters passed to OCB");
                return;
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv2 = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = 16;
            key = (KeyParameter) parametersWithIV.getParameters();
        }
        this.hashBlock = new byte[16];
        this.mainBlock = new byte[z11 ? 16 : this.macSize + 16];
        if (iv2 == null) {
            iv2 = new byte[0];
        }
        if (iv2.length > 15) {
            a.f("IV must be no more than 15 bytes");
            return;
        }
        if (key != null) {
            this.hashCipher.init(true, key);
            this.mainCipher.init(z11, key);
            this.KtopInput = null;
        } else if (z12 != z11) {
            a.f("cannot change encrypting state without providing key.");
            return;
        }
        byte[] bArr = new byte[16];
        this.L_Asterisk = bArr;
        this.hashCipher.processBlock(bArr, 0, bArr, 0);
        this.L_Dollar = OCB_double(this.L_Asterisk);
        Vector vector = new Vector();
        this.L = vector;
        vector.addElement(OCB_double(this.L_Dollar));
        int iProcessNonce = processNonce(iv2);
        int i11 = iProcessNonce % 8;
        int i12 = iProcessNonce / 8;
        if (i11 == 0) {
            System.arraycopy(this.Stretch, i12, this.OffsetMAIN_0, 0, 16);
        } else {
            for (int i13 = 0; i13 < 16; i13++) {
                byte[] bArr2 = this.Stretch;
                int i14 = bArr2[i12] & 255;
                i12++;
                this.OffsetMAIN_0[i13] = (byte) (((bArr2[i12] & 255) >>> (8 - i11)) | (i14 << i11));
            }
        }
        this.hashBlockPos = 0;
        this.mainBlockPos = 0;
        this.hashBlockCount = 0L;
        this.mainBlockCount = 0L;
        this.OffsetHASH = new byte[16];
        this.Sum = new byte[16];
        System.arraycopy(this.OffsetMAIN_0, 0, this.OffsetMAIN, 0, 16);
        this.Checksum = new byte[16];
        byte[] bArr3 = this.initialAssociatedText;
        if (bArr3 != null) {
            processAADBytes(bArr3, 0, bArr3.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b8) {
        byte[] bArr = this.hashBlock;
        int i11 = this.hashBlockPos;
        bArr[i11] = b8;
        int i12 = i11 + 1;
        this.hashBlockPos = i12;
        if (i12 == bArr.length) {
            processHashBlock();
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            byte[] bArr2 = this.hashBlock;
            int i14 = this.hashBlockPos;
            bArr2[i14] = bArr[i11 + i13];
            int i15 = i14 + 1;
            this.hashBlockPos = i15;
            if (i15 == bArr2.length) {
                processHashBlock();
            }
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b8, byte[] bArr, int i11) throws DataLengthException {
        byte[] bArr2 = this.mainBlock;
        int i12 = this.mainBlockPos;
        bArr2[i12] = b8;
        int i13 = i12 + 1;
        this.mainBlockPos = i13;
        if (i13 != bArr2.length) {
            return 0;
        }
        processMainBlock(bArr, i11);
        return 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws DataLengthException {
        if (bArr.length < i11 + i12) {
            i1.t("Input buffer too short");
            return 0;
        }
        if (bArr == bArr2 && Arrays.segmentsOverlap(i11, i12, i13, getUpdateOutputSize(i12))) {
            bArr = new byte[i12];
            System.arraycopy(bArr2, i11, bArr, 0, i12);
            i11 = 0;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            byte[] bArr3 = this.mainBlock;
            int i16 = this.mainBlockPos;
            bArr3[i16] = bArr[i11 + i15];
            int i17 = i16 + 1;
            this.mainBlockPos = i17;
            if (i17 == bArr3.length) {
                processMainBlock(bArr2, i13 + i14);
                i14 += 16;
            }
        }
        return i14;
    }

    public void processHashBlock() {
        long j9 = this.hashBlockCount + 1;
        this.hashBlockCount = j9;
        updateHASH(getLSub(OCB_ntz(j9)));
        this.hashBlockPos = 0;
    }

    public void processMainBlock(byte[] bArr, int i11) {
        if (bArr.length < i11 + 16) {
            i1.r("Output buffer too short");
            return;
        }
        if (this.forEncryption) {
            xor(this.Checksum, this.mainBlock);
            this.mainBlockPos = 0;
        }
        byte[] bArr2 = this.OffsetMAIN;
        long j9 = this.mainBlockCount + 1;
        this.mainBlockCount = j9;
        xor(bArr2, getLSub(OCB_ntz(j9)));
        xor(this.mainBlock, this.OffsetMAIN);
        BlockCipher blockCipher = this.mainCipher;
        byte[] bArr3 = this.mainBlock;
        blockCipher.processBlock(bArr3, 0, bArr3, 0);
        xor(this.mainBlock, this.OffsetMAIN);
        System.arraycopy(this.mainBlock, 0, bArr, i11, 16);
        if (this.forEncryption) {
            return;
        }
        xor(this.Checksum, this.mainBlock);
        byte[] bArr4 = this.mainBlock;
        System.arraycopy(bArr4, 16, bArr4, 0, this.macSize);
        this.mainBlockPos = this.macSize;
    }

    public int processNonce(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i11 = 0;
        System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
        bArr2[0] = (byte) (this.macSize << 4);
        int length = 15 - bArr.length;
        bArr2[length] = (byte) (bArr2[length] | 1);
        byte b8 = bArr2[15];
        int i12 = b8 & 63;
        bArr2[15] = (byte) (b8 & 192);
        byte[] bArr3 = this.KtopInput;
        if (bArr3 == null || !Arrays.areEqual(bArr2, bArr3)) {
            byte[] bArr4 = new byte[16];
            this.KtopInput = bArr2;
            this.hashCipher.processBlock(bArr2, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, this.Stretch, 0, 16);
            while (i11 < 8) {
                byte[] bArr5 = this.Stretch;
                int i13 = i11 + 16;
                byte b11 = bArr4[i11];
                i11++;
                bArr5[i13] = (byte) (b11 ^ bArr4[i11]);
            }
        }
        return i12;
    }

    public void reset(boolean z11) {
        this.hashCipher.reset();
        this.mainCipher.reset();
        clear(this.hashBlock);
        clear(this.mainBlock);
        this.hashBlockPos = 0;
        this.mainBlockPos = 0;
        this.hashBlockCount = 0L;
        this.mainBlockCount = 0L;
        clear(this.OffsetHASH);
        clear(this.Sum);
        System.arraycopy(this.OffsetMAIN_0, 0, this.OffsetMAIN, 0, 16);
        clear(this.Checksum);
        if (z11) {
            this.macBlock = null;
        }
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    public void updateHASH(byte[] bArr) {
        xor(this.OffsetHASH, bArr);
        xor(this.hashBlock, this.OffsetHASH);
        BlockCipher blockCipher = this.hashCipher;
        byte[] bArr2 = this.hashBlock;
        blockCipher.processBlock(bArr2, 0, bArr2, 0);
        xor(this.Sum, this.hashBlock);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }
}
