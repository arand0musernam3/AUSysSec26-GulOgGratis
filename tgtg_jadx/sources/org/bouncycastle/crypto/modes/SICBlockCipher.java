package org.bouncycastle.crypto.modes;

import a40.d0;
import com.braze.h2;
import i4.a;
import m0.i1;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
public class SICBlockCipher extends StreamBlockCipher implements CTRModeCipher {
    private byte[] IV;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    private byte[] counter;
    private byte[] counterOut;

    public SICBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.counter = new byte[blockSize];
        this.counterOut = new byte[blockSize];
        this.byteCount = 0;
    }

    private void adjustCounter(long j9) {
        long j11;
        long j12;
        int i11 = this.byteCount;
        int i12 = 5;
        if (j9 >= 0) {
            long j13 = (((long) i11) + j9) / ((long) this.blockSize);
            if (j13 > 255) {
                j12 = j13;
                while (i12 >= 1) {
                    long j14 = 1 << (i12 * 8);
                    while (j12 >= j14) {
                        incrementCounterAt(i12);
                        j12 -= j14;
                    }
                    i12--;
                }
            } else {
                j12 = j13;
            }
            incrementCounter((int) j12);
            this.byteCount = (int) ((j9 + ((long) this.byteCount)) - (((long) this.blockSize) * j13));
            return;
        }
        long j15 = ((-j9) - ((long) i11)) / ((long) this.blockSize);
        if (j15 > 255) {
            j11 = j15;
            while (i12 >= 1) {
                long j16 = 1 << (i12 * 8);
                while (j11 > j16) {
                    decrementCounterAt(i12);
                    j11 -= j16;
                }
                i12--;
            }
        } else {
            j11 = j15;
        }
        for (long j17 = 0; j17 != j11; j17++) {
            decrementCounterAt(0);
        }
        int i13 = (int) ((((long) this.blockSize) * j15) + ((long) this.byteCount) + j9);
        if (i13 >= 0) {
            this.byteCount = 0;
        } else {
            decrementCounterAt(0);
            this.byteCount = this.blockSize + i13;
        }
    }

    private void checkCounter() {
        byte[] bArr = this.IV;
        if (bArr.length < this.blockSize) {
            for (int length = bArr.length - 1; length >= 0; length--) {
                if (this.counter[length] != this.IV[length]) {
                    h2.b("Counter in CTR/SIC mode out of range.");
                    return;
                }
            }
        }
    }

    private void checkLastIncrement() {
        byte[] bArr = this.IV;
        if (bArr.length >= this.blockSize || this.counter[bArr.length - 1] == bArr[bArr.length - 1]) {
            return;
        }
        h2.b("Counter in CTR/SIC mode out of range.");
    }

    private void decrementCounterAt(int i11) {
        byte b8;
        int length = this.counter.length - i11;
        do {
            length--;
            if (length < 0) {
                return;
            }
            b8 = (byte) (r1[length] - 1);
            this.counter[length] = b8;
        } while (b8 == -1);
    }

    private void incrementCounter(int i11) {
        byte[] bArr = this.counter;
        byte b8 = bArr[bArr.length - 1];
        int length = bArr.length - 1;
        bArr[length] = (byte) (bArr[length] + ((byte) i11));
        if ((b8 & 255) + i11 > 255) {
            incrementCounterAt(1);
        }
    }

    private void incrementCounterAt(int i11) {
        byte b8;
        int length = this.counter.length - i11;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b8 = (byte) (bArr[length] + 1);
            bArr[length] = b8;
        } while (b8 == 0);
    }

    public static CTRModeCipher newInstance(BlockCipher blockCipher) {
        return new SICBlockCipher(blockCipher);
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b8) throws IllegalStateException, DataLengthException {
        int i11 = this.byteCount;
        if (i11 == 0) {
            checkLastIncrement();
            this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
            byte[] bArr = this.counterOut;
            int i12 = this.byteCount;
            this.byteCount = i12 + 1;
            return (byte) (b8 ^ bArr[i12]);
        }
        byte[] bArr2 = this.counterOut;
        int i13 = i11 + 1;
        this.byteCount = i13;
        byte b11 = (byte) (b8 ^ bArr2[i11]);
        if (i13 == this.counter.length) {
            this.byteCount = 0;
            incrementCounter();
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/SIC";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long getPosition() {
        byte[] bArr = this.counter;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        int i11 = length - 1;
        while (i11 >= 1) {
            byte[] bArr3 = this.IV;
            int i12 = i11 < bArr3.length ? (bArr2[i11] & 255) - (bArr3[i11] & 255) : bArr2[i11] & 255;
            if (i12 < 0) {
                int i13 = i11 - 1;
                bArr2[i13] = (byte) (bArr2[i13] - 1);
                i12 += 256;
            }
            bArr2[i11] = (byte) i12;
            i11--;
        }
        return (Pack.bigEndianToLong(bArr2, length - 8) * ((long) this.blockSize)) + ((long) this.byteCount);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            a.f("CTR/SIC mode requires ParametersWithIV");
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] bArrClone = Arrays.clone(parametersWithIV.getIV());
        this.IV = bArrClone;
        int i11 = this.blockSize;
        if (i11 < bArrClone.length) {
            a.f(k.i(this.blockSize, " bytes.", new StringBuilder("CTR/SIC mode requires IV no greater than: ")));
            return;
        }
        int i12 = 8 > i11 / 2 ? i11 / 2 : 8;
        if (i11 - bArrClone.length > i12) {
            d0.f(" bytes.", this.blockSize - i12, "CTR/SIC mode requires IV of at least: ");
            return;
        }
        if (parametersWithIV.getParameters() != null) {
            this.cipher.init(true, parametersWithIV.getParameters());
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) throws IllegalStateException, DataLengthException {
        int i13 = this.byteCount;
        int i14 = this.blockSize;
        if (i13 != 0) {
            processBytes(bArr, i11, i14, bArr2, i12);
            return this.blockSize;
        }
        if (i11 + i14 > bArr.length) {
            i1.t("input buffer too small");
            return 0;
        }
        if (i12 + i14 > bArr2.length) {
            i1.r("output buffer too short");
            return 0;
        }
        this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
        for (int i15 = 0; i15 < this.blockSize; i15++) {
            bArr2[i12 + i15] = (byte) (bArr[i11 + i15] ^ this.counterOut[i15]);
        }
        incrementCounter();
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher, org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws DataLengthException {
        byte b8;
        if (i11 + i12 > bArr.length) {
            i1.t("input buffer too small");
            return 0;
        }
        if (i13 + i12 > bArr2.length) {
            i1.r("output buffer too short");
            return 0;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = this.byteCount;
            if (i15 == 0) {
                checkLastIncrement();
                this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
                byte b11 = bArr[i11 + i14];
                byte[] bArr3 = this.counterOut;
                int i16 = this.byteCount;
                this.byteCount = i16 + 1;
                b8 = (byte) (b11 ^ bArr3[i16]);
            } else {
                byte b12 = bArr[i11 + i14];
                byte[] bArr4 = this.counterOut;
                int i17 = i15 + 1;
                this.byteCount = i17;
                b8 = (byte) (bArr4[i15] ^ b12);
                if (i17 == this.counter.length) {
                    this.byteCount = 0;
                    incrementCounter();
                }
            }
            bArr2[i13 + i14] = b8;
        }
        return i12;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        Arrays.fill(this.counter, (byte) 0);
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.counter, 0, bArr.length);
        this.cipher.reset();
        this.byteCount = 0;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long seekTo(long j9) {
        reset();
        return skip(j9);
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long skip(long j9) {
        adjustCounter(j9);
        checkCounter();
        this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
        return j9;
    }

    private void incrementCounter() {
        byte b8;
        int length = this.counter.length;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b8 = (byte) (bArr[length] + 1);
            bArr[length] = b8;
        } while (b8 == 0);
    }
}
