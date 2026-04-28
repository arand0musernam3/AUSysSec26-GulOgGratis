package org.bouncycastle.crypto.modes;

import com.braze.h2;
import i4.a;
import m0.i1;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class EAXBlockCipher implements AEADBlockCipher {
    private static final byte cTAG = 2;
    private static final byte hTAG = 1;
    private static final byte nTAG = 0;
    private byte[] associatedTextMac;
    private int blockSize;
    private byte[] bufBlock;
    private int bufOff;
    private CTRModeCipher cipher;
    private boolean cipherInitialized;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private Mac mac;
    private byte[] macBlock;
    private int macSize;
    private byte[] nonceMac;

    public EAXBlockCipher(BlockCipher blockCipher) {
        this.blockSize = blockCipher.getBlockSize();
        CMac cMac = new CMac(blockCipher);
        this.mac = cMac;
        this.macBlock = new byte[this.blockSize];
        this.associatedTextMac = new byte[cMac.getMacSize()];
        this.nonceMac = new byte[this.mac.getMacSize()];
        this.cipher = SICBlockCipher.newInstance(blockCipher);
    }

    private void calculateMac() {
        byte[] bArr = new byte[this.blockSize];
        int i11 = 0;
        this.mac.doFinal(bArr, 0);
        while (true) {
            byte[] bArr2 = this.macBlock;
            if (i11 >= bArr2.length) {
                return;
            }
            bArr2[i11] = (byte) ((this.nonceMac[i11] ^ this.associatedTextMac[i11]) ^ bArr[i11]);
            i11++;
        }
    }

    private void initCipher() {
        if (this.cipherInitialized) {
            return;
        }
        this.cipherInitialized = true;
        this.mac.doFinal(this.associatedTextMac, 0);
        int i11 = this.blockSize;
        byte[] bArr = new byte[i11];
        bArr[i11 - 1] = 2;
        this.mac.update(bArr, 0, i11);
    }

    private int process(byte b8, byte[] bArr, int i11) {
        int iProcessBlock;
        byte[] bArr2 = this.bufBlock;
        int i12 = this.bufOff;
        int i13 = i12 + 1;
        this.bufOff = i13;
        bArr2[i12] = b8;
        if (i13 != bArr2.length) {
            return 0;
        }
        int length = bArr.length;
        int i14 = this.blockSize;
        if (length < i11 + i14) {
            i1.r("Output buffer is too short");
            return 0;
        }
        if (this.forEncryption) {
            iProcessBlock = this.cipher.processBlock(bArr2, 0, bArr, i11);
            this.mac.update(bArr, i11, this.blockSize);
        } else {
            this.mac.update(bArr2, 0, i14);
            iProcessBlock = this.cipher.processBlock(this.bufBlock, 0, bArr, i11);
        }
        this.bufOff = 0;
        if (!this.forEncryption) {
            byte[] bArr3 = this.bufBlock;
            System.arraycopy(bArr3, this.blockSize, bArr3, 0, this.macSize);
            this.bufOff = this.macSize;
        }
        return iProcessBlock;
    }

    private void reset(boolean z11) {
        this.cipher.reset();
        this.mac.reset();
        this.bufOff = 0;
        Arrays.fill(this.bufBlock, (byte) 0);
        if (z11) {
            Arrays.fill(this.macBlock, (byte) 0);
        }
        int i11 = this.blockSize;
        byte[] bArr = new byte[i11];
        bArr[i11 - 1] = 1;
        this.mac.update(bArr, 0, i11);
        this.cipherInitialized = false;
        byte[] bArr2 = this.initialAssociatedText;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }

    private boolean verifyMac(byte[] bArr, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < this.macSize; i13++) {
            i12 |= this.macBlock[i13] ^ bArr[i11 + i13];
        }
        return i12 == 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i11) throws InvalidCipherTextException, IllegalStateException {
        String str;
        initCipher();
        int i12 = this.bufOff;
        byte[] bArr2 = this.bufBlock;
        byte[] bArr3 = new byte[bArr2.length];
        this.bufOff = 0;
        if (!this.forEncryption) {
            int i13 = this.macSize;
            if (i12 < i13) {
                str = "data too short";
            } else if (bArr.length >= (i11 + i12) - i13) {
                if (i12 > i13) {
                    this.mac.update(bArr2, 0, i12 - i13);
                    this.cipher.processBlock(this.bufBlock, 0, bArr3, 0);
                    System.arraycopy(bArr3, 0, bArr, i11, i12 - this.macSize);
                }
                calculateMac();
                if (verifyMac(this.bufBlock, i12 - this.macSize)) {
                    reset(false);
                    return i12 - this.macSize;
                }
                str = "mac check in EAX failed";
            }
            i1.i(str);
            return 0;
        }
        int i14 = i11 + i12;
        if (bArr.length >= this.macSize + i14) {
            this.cipher.processBlock(bArr2, 0, bArr3, 0);
            System.arraycopy(bArr3, 0, bArr, i11, i12);
            this.mac.update(bArr3, 0, i12);
            calculateMac();
            System.arraycopy(this.macBlock, 0, bArr, i14, this.macSize);
            reset(false);
            return i12 + this.macSize;
        }
        i1.r("Output buffer too short");
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.cipher.getUnderlyingCipher().getAlgorithmName() + "/EAX";
    }

    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        int i11 = this.macSize;
        byte[] bArr = new byte[i11];
        System.arraycopy(this.macBlock, 0, bArr, 0, i11);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i11) {
        int i12 = i11 + this.bufOff;
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
        return this.cipher.getUnderlyingCipher();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i11) {
        int i12 = i11 + this.bufOff;
        if (!this.forEncryption) {
            int i13 = this.macSize;
            if (i12 < i13) {
                return 0;
            }
            i12 -= i13;
        }
        return i12 - (i12 % this.blockSize);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z11, CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] iv2;
        CipherParameters parameters;
        this.forEncryption = z11;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv2 = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            this.macSize = aEADParameters.getMacSize() / 8;
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                a.f("invalid parameters passed to EAX");
                return;
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv2 = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = this.mac.getMacSize() / 2;
            parameters = parametersWithIV.getParameters();
        }
        int i11 = this.blockSize;
        if (!z11) {
            i11 += this.macSize;
        }
        this.bufBlock = new byte[i11];
        byte[] bArr = new byte[this.blockSize];
        this.mac.init(parameters);
        int i12 = this.blockSize;
        bArr[i12 - 1] = 0;
        this.mac.update(bArr, 0, i12);
        this.mac.update(iv2, 0, iv2.length);
        this.mac.doFinal(this.nonceMac, 0);
        this.cipher.init(true, new ParametersWithIV(parameters, this.nonceMac));
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b8) {
        if (this.cipherInitialized) {
            h2.b("AAD data cannot be added after encryption/decryption processing has begun.");
        } else {
            this.mac.update(b8);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i11, int i12) {
        if (this.cipherInitialized) {
            h2.b("AAD data cannot be added after encryption/decryption processing has begun.");
        } else {
            this.mac.update(bArr, i11, i12);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b8, byte[] bArr, int i11) throws DataLengthException {
        initCipher();
        return process(b8, bArr, i11);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws DataLengthException {
        initCipher();
        if (bArr.length < i11 + i12) {
            i1.t("Input buffer too short");
            return 0;
        }
        if (bArr == bArr2 && Arrays.segmentsOverlap(i11, i12, i13, getUpdateOutputSize(i12))) {
            bArr = new byte[i12];
            System.arraycopy(bArr2, i11, bArr, 0, i12);
            i11 = 0;
        }
        int iProcess = 0;
        for (int i14 = 0; i14 != i12; i14++) {
            iProcess += process(bArr[i11 + i14], bArr2, i13 + iProcess);
        }
        return iProcess;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }
}
