package org.bouncycastle.crypto.threshold;

import i4.a;
import org.bouncycastle.crypto.threshold.ShamirSecretSplitter;

/* JADX INFO: loaded from: classes3.dex */
class PolynomialNative extends Polynomial {
    private final int IRREDUCIBLE;

    /* JADX INFO: renamed from: org.bouncycastle.crypto.threshold.PolynomialNative$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$threshold$ShamirSecretSplitter$Algorithm;

        static {
            int[] iArr = new int[ShamirSecretSplitter.Algorithm.values().length];
            $SwitchMap$org$bouncycastle$crypto$threshold$ShamirSecretSplitter$Algorithm = iArr;
            try {
                iArr[ShamirSecretSplitter.Algorithm.AES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$threshold$ShamirSecretSplitter$Algorithm[ShamirSecretSplitter.Algorithm.RSA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PolynomialNative(ShamirSecretSplitter.Algorithm algorithm) {
        int i11;
        int i12 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$threshold$ShamirSecretSplitter$Algorithm[algorithm.ordinal()];
        if (i12 == 1) {
            i11 = 283;
        } else {
            if (i12 != 2) {
                a.f("The algorithm is not correct");
                throw null;
            }
            i11 = 285;
        }
        this.IRREDUCIBLE = i11;
    }

    @Override // org.bouncycastle.crypto.threshold.Polynomial
    public byte gfDiv(int i11, int i12) {
        return gfMul(i11, gfPow((byte) i12, (byte) -2) & 255);
    }

    @Override // org.bouncycastle.crypto.threshold.Polynomial
    public byte gfMul(int i11, int i12) {
        int i13 = 0;
        while (i12 > 0) {
            if ((i12 & 1) != 0) {
                i13 ^= i11;
            }
            i11 <<= 1;
            if ((i11 & 256) != 0) {
                i11 ^= this.IRREDUCIBLE;
            }
            i12 >>= 1;
        }
        while (i13 >= 256) {
            if ((i13 & 256) != 0) {
                i13 ^= this.IRREDUCIBLE;
            }
            i13 <<= 1;
        }
        return (byte) (i13 & 255);
    }
}
