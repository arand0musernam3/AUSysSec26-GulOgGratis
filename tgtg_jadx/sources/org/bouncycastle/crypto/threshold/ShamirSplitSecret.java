package org.bouncycastle.crypto.threshold;

import java.io.IOException;
import java.lang.reflect.Array;
import org.bouncycastle.crypto.threshold.ShamirSecretSplitter;

/* JADX INFO: loaded from: classes3.dex */
public class ShamirSplitSecret implements SplitSecret {
    private final Polynomial poly;
    private final ShamirSplitSecretShare[] secretShares;

    public ShamirSplitSecret(ShamirSecretSplitter.Algorithm algorithm, ShamirSecretSplitter.Mode mode, ShamirSplitSecretShare[] shamirSplitSecretShareArr) {
        this.secretShares = shamirSplitSecretShareArr;
        this.poly = Polynomial.newInstance(algorithm, mode);
    }

    public ShamirSplitSecret divide(int i11) throws IOException {
        int i12 = 0;
        while (true) {
            ShamirSplitSecretShare[] shamirSplitSecretShareArr = this.secretShares;
            if (i12 >= shamirSplitSecretShareArr.length) {
                return this;
            }
            byte[] encoded = shamirSplitSecretShareArr[i12].getEncoded();
            for (int i13 = 0; i13 < encoded.length; i13++) {
                encoded[i13] = this.poly.gfDiv(encoded[i13] & 255, i11);
            }
            int i14 = i12 + 1;
            this.secretShares[i12] = new ShamirSplitSecretShare(encoded, i14);
            i12 = i14;
        }
    }

    @Override // org.bouncycastle.crypto.threshold.SplitSecret
    public byte[] getSecret() throws IOException {
        ShamirSplitSecretShare[] shamirSplitSecretShareArr = this.secretShares;
        int length = shamirSplitSecretShareArr.length;
        byte[] bArr = new byte[length];
        int i11 = length - 1;
        byte[] bArr2 = new byte[i11];
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, length, shamirSplitSecretShareArr[0].getEncoded().length);
        for (int i12 = 0; i12 < length; i12++) {
            bArr3[i12] = this.secretShares[i12].getEncoded();
            byte b8 = 0;
            for (int i13 = 0; i13 < length; i13++) {
                if (i13 != i12) {
                    Polynomial polynomial = this.poly;
                    ShamirSplitSecretShare[] shamirSplitSecretShareArr2 = this.secretShares;
                    int i14 = shamirSplitSecretShareArr2[i13].f33276r;
                    bArr2[b8] = polynomial.gfDiv(i14, shamirSplitSecretShareArr2[i12].f33276r ^ i14);
                    b8 = (byte) (b8 + 1);
                }
            }
            byte bGfMul = 1;
            for (int i15 = 0; i15 != i11; i15++) {
                bGfMul = this.poly.gfMul(bGfMul & 255, bArr2[i15] & 255);
            }
            bArr[i12] = bGfMul;
        }
        return this.poly.gfVecMul(bArr, bArr3);
    }

    public ShamirSplitSecret multiple(int i11) throws IOException {
        int i12 = 0;
        while (true) {
            ShamirSplitSecretShare[] shamirSplitSecretShareArr = this.secretShares;
            if (i12 >= shamirSplitSecretShareArr.length) {
                return this;
            }
            byte[] encoded = shamirSplitSecretShareArr[i12].getEncoded();
            for (int i13 = 0; i13 < encoded.length; i13++) {
                encoded[i13] = this.poly.gfMul(encoded[i13] & 255, i11);
            }
            int i14 = i12 + 1;
            this.secretShares[i12] = new ShamirSplitSecretShare(encoded, i14);
            i12 = i14;
        }
    }

    @Override // org.bouncycastle.crypto.threshold.SplitSecret
    public ShamirSplitSecretShare[] getSecretShares() {
        return this.secretShares;
    }

    public ShamirSplitSecret(Polynomial polynomial, ShamirSplitSecretShare[] shamirSplitSecretShareArr) {
        this.secretShares = shamirSplitSecretShareArr;
        this.poly = polynomial;
    }
}
