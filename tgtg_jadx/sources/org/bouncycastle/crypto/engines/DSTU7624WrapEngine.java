package org.bouncycastle.crypto.engines;

import com.braze.h2;
import i4.a;
import java.util.ArrayList;
import m0.i1;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class DSTU7624WrapEngine implements Wrapper {
    private static final int BYTES_IN_INTEGER = 4;
    private byte[] B;
    private ArrayList<byte[]> Btemp;
    private byte[] checkSumArray;
    private DSTU7624Engine engine;
    private boolean forWrapping;
    private byte[] intArray;
    private byte[] zeroArray;

    public DSTU7624WrapEngine(int i11) {
        DSTU7624Engine dSTU7624Engine = new DSTU7624Engine(i11);
        this.engine = dSTU7624Engine;
        this.B = new byte[dSTU7624Engine.getBlockSize() / 2];
        this.checkSumArray = new byte[this.engine.getBlockSize()];
        this.zeroArray = new byte[this.engine.getBlockSize()];
        this.Btemp = new ArrayList<>();
        this.intArray = new byte[4];
    }

    private void intToBytes(int i11, byte[] bArr, int i12) {
        bArr[i12 + 3] = (byte) (i11 >> 24);
        bArr[i12 + 2] = (byte) (i11 >> 16);
        bArr[i12 + 1] = (byte) (i11 >> 8);
        bArr[i12] = (byte) i11;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return "DSTU7624WrapEngine";
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        this.forWrapping = z11;
        if (cipherParameters instanceof KeyParameter) {
            this.engine.init(z11, cipherParameters);
        } else {
            a.f("invalid parameters passed to DSTU7624WrapEngine");
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i11, int i12) throws InvalidCipherTextException {
        DSTU7624Engine dSTU7624Engine;
        if (this.forWrapping) {
            h2.b("not set for unwrapping");
            return null;
        }
        int blockSize = i12 % this.engine.getBlockSize();
        DSTU7624Engine dSTU7624Engine2 = this.engine;
        if (blockSize != 0) {
            throw new DataLengthException("unwrap data must be a multiple of " + dSTU7624Engine2.getBlockSize() + " bytes");
        }
        int blockSize2 = (i12 * 2) / dSTU7624Engine2.getBlockSize();
        int i13 = blockSize2 - 1;
        int i14 = i13 * 6;
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        byte[] bArr3 = new byte[this.engine.getBlockSize() / 2];
        System.arraycopy(bArr2, 0, bArr3, 0, this.engine.getBlockSize() / 2);
        this.Btemp.clear();
        int blockSize3 = i12 - (this.engine.getBlockSize() / 2);
        int blockSize4 = this.engine.getBlockSize() / 2;
        while (blockSize3 != 0) {
            byte[] bArr4 = new byte[this.engine.getBlockSize() / 2];
            System.arraycopy(bArr2, blockSize4, bArr4, 0, this.engine.getBlockSize() / 2);
            this.Btemp.add(bArr4);
            blockSize3 -= this.engine.getBlockSize() / 2;
            blockSize4 += this.engine.getBlockSize() / 2;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            System.arraycopy(this.Btemp.get(blockSize2 - 2), 0, bArr2, 0, this.engine.getBlockSize() / 2);
            System.arraycopy(bArr3, 0, bArr2, this.engine.getBlockSize() / 2, this.engine.getBlockSize() / 2);
            intToBytes(i14 - i15, this.intArray, 0);
            int i16 = 0;
            while (true) {
                dSTU7624Engine = this.engine;
                if (i16 >= 4) {
                    break;
                }
                int blockSize5 = (dSTU7624Engine.getBlockSize() / 2) + i16;
                bArr2[blockSize5] = (byte) (bArr2[blockSize5] ^ this.intArray[i16]);
                i16++;
            }
            dSTU7624Engine.processBlock(bArr2, 0, bArr2, 0);
            System.arraycopy(bArr2, 0, bArr3, 0, this.engine.getBlockSize() / 2);
            for (int i17 = 2; i17 < blockSize2; i17++) {
                int i18 = blockSize2 - i17;
                System.arraycopy(this.Btemp.get(i18 - 1), 0, this.Btemp.get(i18), 0, this.engine.getBlockSize() / 2);
            }
            System.arraycopy(bArr2, this.engine.getBlockSize() / 2, this.Btemp.get(0), 0, this.engine.getBlockSize() / 2);
        }
        System.arraycopy(bArr3, 0, bArr2, 0, this.engine.getBlockSize() / 2);
        int blockSize6 = this.engine.getBlockSize() / 2;
        for (int i19 = 0; i19 < i13; i19++) {
            System.arraycopy(this.Btemp.get(i19), 0, bArr2, blockSize6, this.engine.getBlockSize() / 2);
            blockSize6 += this.engine.getBlockSize() / 2;
        }
        System.arraycopy(bArr2, i12 - this.engine.getBlockSize(), this.checkSumArray, 0, this.engine.getBlockSize());
        byte[] bArr5 = new byte[i12 - this.engine.getBlockSize()];
        if (Arrays.areEqual(this.checkSumArray, this.zeroArray)) {
            System.arraycopy(bArr2, 0, bArr5, 0, i12 - this.engine.getBlockSize());
            return bArr5;
        }
        i1.i("checksum failed");
        return null;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i11, int i12) {
        byte[] bArr2;
        DSTU7624Engine dSTU7624Engine;
        ArrayList<byte[]> arrayList;
        if (!this.forWrapping) {
            h2.b("not set for wrapping");
            return null;
        }
        if (i12 % this.engine.getBlockSize() != 0) {
            throw new DataLengthException("wrap data must be a multiple of " + this.engine.getBlockSize() + " bytes");
        }
        if (i11 + i12 > bArr.length) {
            i1.t("input buffer too short");
            return null;
        }
        int blockSize = ((i12 / this.engine.getBlockSize()) + 1) * 2;
        int i13 = blockSize - 1;
        int i14 = i13 * 6;
        int blockSize2 = this.engine.getBlockSize() + i12;
        byte[] bArr3 = new byte[blockSize2];
        System.arraycopy(bArr, i11, bArr3, 0, i12);
        System.arraycopy(bArr3, 0, this.B, 0, this.engine.getBlockSize() / 2);
        this.Btemp.clear();
        int blockSize3 = blockSize2 - (this.engine.getBlockSize() / 2);
        int blockSize4 = this.engine.getBlockSize() / 2;
        while (blockSize3 != 0) {
            byte[] bArr4 = new byte[this.engine.getBlockSize() / 2];
            System.arraycopy(bArr3, blockSize4, bArr4, 0, this.engine.getBlockSize() / 2);
            this.Btemp.add(bArr4);
            blockSize3 -= this.engine.getBlockSize() / 2;
            blockSize4 += this.engine.getBlockSize() / 2;
        }
        int i15 = 0;
        while (true) {
            bArr2 = this.B;
            if (i15 >= i14) {
                break;
            }
            System.arraycopy(bArr2, 0, bArr3, 0, this.engine.getBlockSize() / 2);
            System.arraycopy(this.Btemp.get(0), 0, bArr3, this.engine.getBlockSize() / 2, this.engine.getBlockSize() / 2);
            this.engine.processBlock(bArr3, 0, bArr3, 0);
            i15++;
            intToBytes(i15, this.intArray, 0);
            int i16 = 0;
            while (true) {
                dSTU7624Engine = this.engine;
                if (i16 >= 4) {
                    break;
                }
                int blockSize5 = (dSTU7624Engine.getBlockSize() / 2) + i16;
                bArr3[blockSize5] = (byte) (bArr3[blockSize5] ^ this.intArray[i16]);
                i16++;
            }
            System.arraycopy(bArr3, dSTU7624Engine.getBlockSize() / 2, this.B, 0, this.engine.getBlockSize() / 2);
            int i17 = 2;
            while (true) {
                arrayList = this.Btemp;
                if (i17 < blockSize) {
                    System.arraycopy(arrayList.get(i17 - 1), 0, this.Btemp.get(i17 - 2), 0, this.engine.getBlockSize() / 2);
                    i17++;
                }
            }
            System.arraycopy(bArr3, 0, arrayList.get(blockSize - 2), 0, this.engine.getBlockSize() / 2);
        }
        System.arraycopy(bArr2, 0, bArr3, 0, this.engine.getBlockSize() / 2);
        int blockSize6 = this.engine.getBlockSize() / 2;
        for (int i18 = 0; i18 < i13; i18++) {
            System.arraycopy(this.Btemp.get(i18), 0, bArr3, blockSize6, this.engine.getBlockSize() / 2);
            blockSize6 += this.engine.getBlockSize() / 2;
        }
        return bArr3;
    }
}
