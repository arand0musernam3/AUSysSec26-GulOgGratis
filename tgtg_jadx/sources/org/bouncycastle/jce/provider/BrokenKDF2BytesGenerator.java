package org.bouncycastle.jce.provider;

import m0.i1;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.KDFParameters;

/* JADX INFO: loaded from: classes3.dex */
public class BrokenKDF2BytesGenerator implements DerivationFunction {
    private Digest digest;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f33317iv;
    private byte[] shared;

    public BrokenKDF2BytesGenerator(Digest digest) {
        this.digest = digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i11, int i12) throws DataLengthException, IllegalArgumentException {
        if (bArr.length - i12 < i11) {
            i1.r("output buffer too small");
            return 0;
        }
        long j9 = ((long) i12) * 8;
        if (j9 > ((long) this.digest.getDigestSize()) * 17179869184L) {
            i4.a.f("Output length too large");
            return 0;
        }
        int digestSize = (int) (j9 / ((long) this.digest.getDigestSize()));
        int digestSize2 = this.digest.getDigestSize();
        byte[] bArr2 = new byte[digestSize2];
        int i13 = 1;
        while (true) {
            Digest digest = this.digest;
            if (i13 > digestSize) {
                digest.reset();
                return i12;
            }
            byte[] bArr3 = this.shared;
            digest.update(bArr3, 0, bArr3.length);
            this.digest.update((byte) (i13 & 255));
            this.digest.update((byte) ((i13 >> 8) & 255));
            this.digest.update((byte) ((i13 >> 16) & 255));
            this.digest.update((byte) ((i13 >> 24) & 255));
            Digest digest2 = this.digest;
            byte[] bArr4 = this.f33317iv;
            digest2.update(bArr4, 0, bArr4.length);
            this.digest.doFinal(bArr2, 0);
            int i14 = i12 - i11;
            if (i14 > digestSize2) {
                System.arraycopy(bArr2, 0, bArr, i11, digestSize2);
                i11 += digestSize2;
            } else {
                System.arraycopy(bArr2, 0, bArr, i11, i14);
            }
            i13++;
        }
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFParameters)) {
            i4.a.f("KDF parameters required for generator");
            return;
        }
        KDFParameters kDFParameters = (KDFParameters) derivationParameters;
        this.shared = kDFParameters.getSharedSecret();
        this.f33317iv = kDFParameters.getIV();
    }
}
