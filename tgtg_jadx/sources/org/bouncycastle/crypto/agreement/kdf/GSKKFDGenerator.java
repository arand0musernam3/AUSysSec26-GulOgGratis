package org.bouncycastle.crypto.agreement.kdf;

import i4.a;
import m0.i1;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.DigestDerivationFunction;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class GSKKFDGenerator implements DigestDerivationFunction {
    private byte[] buf;
    private int counter;
    private final Digest digest;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private byte[] f33037r;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private byte[] f33038z;

    public GSKKFDGenerator(Digest digest) {
        this.digest = digest;
        this.buf = new byte[digest.getDigestSize()];
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i11, int i12) throws DataLengthException, IllegalArgumentException {
        if (i11 + i12 > bArr.length) {
            i1.t("output buffer too small");
            return 0;
        }
        Digest digest = this.digest;
        byte[] bArr2 = this.f33038z;
        digest.update(bArr2, 0, bArr2.length);
        int i13 = this.counter;
        this.counter = i13 + 1;
        byte[] bArrIntToBigEndian = Pack.intToBigEndian(i13);
        this.digest.update(bArrIntToBigEndian, 0, bArrIntToBigEndian.length);
        byte[] bArr3 = this.f33037r;
        if (bArr3 != null) {
            this.digest.update(bArr3, 0, bArr3.length);
        }
        this.digest.doFinal(this.buf, 0);
        System.arraycopy(this.buf, 0, bArr, i11, i12);
        Arrays.clear(this.buf);
        return i12;
    }

    @Override // org.bouncycastle.crypto.DigestDerivationFunction
    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof GSKKDFParameters)) {
            a.f("unkown parameters type");
            return;
        }
        GSKKDFParameters gSKKDFParameters = (GSKKDFParameters) derivationParameters;
        this.f33038z = gSKKDFParameters.getZ();
        this.counter = gSKKDFParameters.getStartCounter();
        this.f33037r = gSKKDFParameters.getNonce();
    }
}
