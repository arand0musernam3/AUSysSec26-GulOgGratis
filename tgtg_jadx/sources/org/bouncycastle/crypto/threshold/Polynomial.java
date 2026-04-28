package org.bouncycastle.crypto.threshold;

import org.bouncycastle.crypto.threshold.ShamirSecretSplitter;

/* JADX INFO: loaded from: classes3.dex */
abstract class Polynomial {
    public static Polynomial newInstance(ShamirSecretSplitter.Algorithm algorithm, ShamirSecretSplitter.Mode mode) {
        return mode == ShamirSecretSplitter.Mode.Native ? new PolynomialNative(algorithm) : new PolynomialTable(algorithm);
    }

    public abstract byte gfDiv(int i11, int i12);

    public abstract byte gfMul(int i11, int i12);

    public byte gfPow(int i11, byte b8) {
        byte bGfMul = 1;
        for (int i12 = 0; i12 < 8; i12++) {
            if (((1 << i12) & b8) != 0) {
                bGfMul = gfMul(bGfMul & 255, i11 & 255);
            }
            int i13 = i11 & 255;
            i11 = gfMul(i13, i13);
        }
        return bGfMul;
    }

    public byte[] gfVecMul(byte[] bArr, byte[][] bArr2) {
        byte[] bArr3 = new byte[bArr2[0].length];
        for (int i11 = 0; i11 < bArr2[0].length; i11++) {
            int iGfMul = 0;
            for (int i12 = 0; i12 < bArr.length; i12++) {
                iGfMul ^= gfMul(bArr[i12] & 255, bArr2[i12][i11] & 255);
            }
            bArr3[i11] = (byte) iGfMul;
        }
        return bArr3;
    }
}
