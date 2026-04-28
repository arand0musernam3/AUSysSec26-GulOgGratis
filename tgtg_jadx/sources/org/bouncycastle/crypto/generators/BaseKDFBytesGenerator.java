package org.bouncycastle.crypto.generators;

import i4.a;
import m0.i1;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.DigestDerivationFunction;
import org.bouncycastle.crypto.params.ISO18033KDFParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class BaseKDFBytesGenerator implements DigestDerivationFunction {
    private int counterStart;
    private Digest digest;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f33142iv;
    private byte[] shared;

    public BaseKDFBytesGenerator(int i11, Digest digest) {
        this.counterStart = i11;
        this.digest = digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i11, int i12) throws DataLengthException, IllegalArgumentException {
        int i13 = i12;
        int i14 = i11;
        if (bArr.length - i13 < i14) {
            i1.r("output buffer too small");
            return 0;
        }
        long j9 = i13;
        int digestSize = this.digest.getDigestSize();
        if (j9 > 8589934591L) {
            a.f("Output length too large");
            return 0;
        }
        long j11 = digestSize;
        int i15 = (int) (((j9 + j11) - 1) / j11);
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        byte[] bArr3 = new byte[4];
        Pack.intToBigEndian(this.counterStart, bArr3, 0);
        int i16 = this.counterStart & (-256);
        int i17 = 0;
        while (true) {
            Digest digest = this.digest;
            if (i17 >= i15) {
                digest.reset();
                return (int) j9;
            }
            byte[] bArr4 = this.shared;
            digest.update(bArr4, 0, bArr4.length);
            this.digest.update(bArr3, 0, 4);
            byte[] bArr5 = this.f33142iv;
            if (bArr5 != null) {
                this.digest.update(bArr5, 0, bArr5.length);
            }
            this.digest.doFinal(bArr2, 0);
            if (i13 > digestSize) {
                System.arraycopy(bArr2, 0, bArr, i14, digestSize);
                i14 += digestSize;
                i13 -= digestSize;
            } else {
                System.arraycopy(bArr2, 0, bArr, i14, i13);
            }
            byte b8 = (byte) (bArr3[3] + 1);
            bArr3[3] = b8;
            if (b8 == 0) {
                i16 += 256;
                Pack.intToBigEndian(i16, bArr3, 0);
            }
            i17++;
        }
    }

    @Override // org.bouncycastle.crypto.DigestDerivationFunction
    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (derivationParameters instanceof KDFParameters) {
            KDFParameters kDFParameters = (KDFParameters) derivationParameters;
            this.shared = kDFParameters.getSharedSecret();
            this.f33142iv = kDFParameters.getIV();
        } else if (!(derivationParameters instanceof ISO18033KDFParameters)) {
            a.f("KDF parameters required for generator");
        } else {
            this.shared = ((ISO18033KDFParameters) derivationParameters).getSeed();
            this.f33142iv = null;
        }
    }
}
