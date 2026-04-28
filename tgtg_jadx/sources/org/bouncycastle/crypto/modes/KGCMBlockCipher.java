package org.bouncycastle.crypto.modes;

import i4.a;
import j4.s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import m0.i1;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier;
import org.bouncycastle.crypto.modes.kgcm.Tables16kKGCMMultiplier_512;
import org.bouncycastle.crypto.modes.kgcm.Tables4kKGCMMultiplier_128;
import org.bouncycastle.crypto.modes.kgcm.Tables8kKGCMMultiplier_256;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class KGCMBlockCipher implements AEADBlockCipher {
    private static final int MIN_MAC_BITS = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f33198b;
    private final int blockSize;
    private BufferedBlockCipher ctrEngine;
    private BlockCipher engine;
    private boolean forEncryption;
    private byte[] initialAssociatedText;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f33199iv;
    private byte[] macBlock;
    private KGCMMultiplier multiplier;
    private ExposedByteArrayOutputStream associatedText = new ExposedByteArrayOutputStream();
    private ExposedByteArrayOutputStream data = new ExposedByteArrayOutputStream();
    private int macSize = -1;

    public static class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        public byte[] getBuffer() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public KGCMBlockCipher(BlockCipher blockCipher) {
        this.engine = blockCipher;
        this.ctrEngine = new BufferedBlockCipher(new KCTRBlockCipher(blockCipher));
        int blockSize = this.engine.getBlockSize();
        this.blockSize = blockSize;
        this.initialAssociatedText = new byte[blockSize];
        this.f33199iv = new byte[blockSize];
        this.multiplier = createDefaultMultiplier(blockSize);
        this.f33198b = new long[blockSize >>> 3];
        this.macBlock = null;
    }

    private void calculateMac(byte[] bArr, int i11, int i12, int i13) {
        int i14 = i11 + i12;
        while (true) {
            long[] jArr = this.f33198b;
            if (i11 >= i14) {
                jArr[0] = ((((long) i13) & 4294967295L) << 3) ^ jArr[0];
                int i15 = this.blockSize >>> 4;
                jArr[i15] = jArr[i15] ^ ((4294967295L & ((long) i12)) << 3);
                byte[] bArrLongToLittleEndian = Pack.longToLittleEndian(jArr);
                this.macBlock = bArrLongToLittleEndian;
                this.engine.processBlock(bArrLongToLittleEndian, 0, bArrLongToLittleEndian, 0);
                return;
            }
            xorWithInput(jArr, bArr, i11);
            this.multiplier.multiplyH(this.f33198b);
            i11 += this.blockSize;
        }
    }

    private static KGCMMultiplier createDefaultMultiplier(int i11) {
        if (i11 == 16) {
            return new Tables4kKGCMMultiplier_128();
        }
        if (i11 == 32) {
            return new Tables8kKGCMMultiplier_256();
        }
        if (i11 == 64) {
            return new Tables16kKGCMMultiplier_512();
        }
        a.f("Only 128, 256, and 512 -bit block sizes supported");
        return null;
    }

    private void processAAD(byte[] bArr, int i11, int i12) {
        int i13 = i12 + i11;
        while (i11 < i13) {
            xorWithInput(this.f33198b, bArr, i11);
            this.multiplier.multiplyH(this.f33198b);
            i11 += this.blockSize;
        }
    }

    private static void xorWithInput(long[] jArr, byte[] bArr, int i11) {
        for (int i12 = 0; i12 < jArr.length; i12++) {
            jArr[i12] = jArr[i12] ^ Pack.littleEndianToLong(bArr, i11);
            i11 += 8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    @Override // org.bouncycastle.crypto.modes.AEADCipher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int doFinal(byte[] r10, int r11) throws org.bouncycastle.crypto.InvalidCipherTextException, java.lang.IllegalStateException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.modes.KGCMBlockCipher.doFinal(byte[], int):int");
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName() + "/KGCM";
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
        int size = this.data.size() + i11;
        boolean z11 = this.forEncryption;
        int i12 = this.macSize;
        if (z11) {
            return size + i12;
        }
        if (size < i12) {
            return 0;
        }
        return size - i12;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i11) {
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z11, CipherParameters cipherParameters) throws IOException, IllegalArgumentException {
        KeyParameter key;
        this.forEncryption = z11;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            byte[] nonce = aEADParameters.getNonce();
            byte[] bArr = this.f33199iv;
            int length = bArr.length - nonce.length;
            Arrays.fill(bArr, (byte) 0);
            System.arraycopy(nonce, 0, this.f33199iv, length, nonce.length);
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 64 || macSize > (this.blockSize << 3) || (macSize & 7) != 0) {
                a.f(s.f(macSize, "Invalid value for MAC size: "));
                return;
            }
            this.macSize = macSize >>> 3;
            key = aEADParameters.getKey();
            byte[] bArr2 = this.initialAssociatedText;
            if (bArr2 != null) {
                processAADBytes(bArr2, 0, bArr2.length);
            }
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                a.f("Invalid parameter passed");
                return;
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv2 = parametersWithIV.getIV();
            byte[] bArr3 = this.f33199iv;
            int length2 = bArr3.length - iv2.length;
            Arrays.fill(bArr3, (byte) 0);
            System.arraycopy(iv2, 0, this.f33199iv, length2, iv2.length);
            this.initialAssociatedText = null;
            this.macSize = this.blockSize;
            key = (KeyParameter) parametersWithIV.getParameters();
        }
        this.macBlock = new byte[this.blockSize];
        this.ctrEngine.init(true, new ParametersWithIV(key, this.f33199iv));
        this.engine.init(true, key);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b8) throws IOException {
        this.associatedText.write(b8);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i11, int i12) throws IOException {
        this.associatedText.write(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b8, byte[] bArr, int i11) throws IllegalStateException, DataLengthException, IOException {
        this.data.write(b8);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws IllegalStateException, DataLengthException, IOException {
        if (bArr.length >= i11 + i12) {
            this.data.write(bArr, i11, i12);
            return 0;
        }
        i1.t("input buffer too short");
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() throws IOException {
        Arrays.fill(this.f33198b, 0L);
        this.engine.reset();
        this.data.reset();
        this.associatedText.reset();
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }
}
