package org.bouncycastle.crypto.threshold;

import i4.a;
import java.io.IOException;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class ShamirSecretSplitter implements SecretSplitter {
    protected int l;
    private final Polynomial poly;
    protected SecureRandom random;

    public enum Algorithm {
        AES,
        RSA
    }

    public enum Mode {
        Native,
        Table
    }

    public ShamirSecretSplitter(Algorithm algorithm, Mode mode, int i11, SecureRandom secureRandom) {
        if (i11 < 0 || i11 > 65534) {
            a.f("Invalid input: l ranges from 0 to 65534 (2^16-2) bytes.");
            throw null;
        }
        this.poly = Polynomial.newInstance(algorithm, mode);
        this.l = i11;
        this.random = secureRandom;
    }

    private byte[][] initP(int i11, int i12) {
        String str;
        if (i11 < 1 || i11 > 255) {
            str = "Invalid input: m must be less than 256 and positive.";
        } else {
            if (i12 >= i11 && i12 <= 255) {
                byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i12, i11);
                for (int i13 = 0; i13 < i12; i13++) {
                    for (int i14 = 0; i14 < i11; i14++) {
                        bArr[i13][i14] = this.poly.gfPow((byte) (i13 + 1), (byte) i14);
                    }
                }
                return bArr;
            }
            str = "Invalid input: n must be less than 256 and greater than or equal to n.";
        }
        a.f(str);
        return null;
    }

    @Override // org.bouncycastle.crypto.threshold.SecretSplitter
    public ShamirSplitSecret resplit(byte[] bArr, int i11, int i12) {
        byte[][] bArrInitP = initP(i11, i12);
        int i13 = 0;
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, this.l);
        ShamirSplitSecretShare[] shamirSplitSecretShareArr = new ShamirSplitSecretShare[this.l];
        bArr2[0] = Arrays.clone(bArr);
        for (int i14 = 1; i14 < i11; i14++) {
            this.random.nextBytes(bArr2[i14]);
        }
        while (true) {
            int length = bArrInitP.length;
            Polynomial polynomial = this.poly;
            if (i13 >= length) {
                return new ShamirSplitSecret(polynomial, shamirSplitSecretShareArr);
            }
            int i15 = i13 + 1;
            shamirSplitSecretShareArr[i13] = new ShamirSplitSecretShare(polynomial.gfVecMul(bArrInitP[i13], bArr2), i15);
            i13 = i15;
        }
    }

    @Override // org.bouncycastle.crypto.threshold.SecretSplitter
    public ShamirSplitSecret split(int i11, int i12) {
        byte[][] bArrInitP = initP(i11, i12);
        int i13 = 0;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, this.l);
        ShamirSplitSecretShare[] shamirSplitSecretShareArr = new ShamirSplitSecretShare[this.l];
        for (int i14 = 0; i14 < i11; i14++) {
            this.random.nextBytes(bArr[i14]);
        }
        while (true) {
            int length = bArrInitP.length;
            Polynomial polynomial = this.poly;
            if (i13 >= length) {
                return new ShamirSplitSecret(polynomial, shamirSplitSecretShareArr);
            }
            int i15 = i13 + 1;
            shamirSplitSecretShareArr[i13] = new ShamirSplitSecretShare(polynomial.gfVecMul(bArrInitP[i13], bArr), i15);
            i13 = i15;
        }
    }

    @Override // org.bouncycastle.crypto.threshold.SecretSplitter
    public ShamirSplitSecret splitAround(SecretShare secretShare, int i11, int i12) throws IOException {
        byte[][] bArrInitP = initP(i11, i12);
        int i13 = 1;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, this.l);
        ShamirSplitSecretShare[] shamirSplitSecretShareArr = new ShamirSplitSecretShare[this.l];
        byte[] encoded = secretShare.getEncoded();
        shamirSplitSecretShareArr[0] = new ShamirSplitSecretShare(encoded, 1);
        for (int i14 = 0; i14 < i11; i14++) {
            this.random.nextBytes(bArr[i14]);
        }
        for (int i15 = 0; i15 < this.l; i15++) {
            byte b8 = bArr[1][i15];
            for (int i16 = 2; i16 < i11; i16++) {
                b8 = (byte) (b8 ^ bArr[i16][i15]);
            }
            bArr[0][i15] = (byte) (b8 ^ encoded[i15]);
        }
        while (true) {
            int length = bArrInitP.length;
            Polynomial polynomial = this.poly;
            if (i13 >= length) {
                return new ShamirSplitSecret(polynomial, shamirSplitSecretShareArr);
            }
            int i17 = i13 + 1;
            shamirSplitSecretShareArr[i13] = new ShamirSplitSecretShare(polynomial.gfVecMul(bArrInitP[i13], bArr), i17);
            i13 = i17;
        }
    }
}
