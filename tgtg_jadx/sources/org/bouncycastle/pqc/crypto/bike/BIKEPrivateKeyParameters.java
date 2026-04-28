package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class BIKEPrivateKeyParameters extends BIKEKeyParameters {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private byte[] f33468h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private byte[] f33469h1;
    private byte[] sigma;

    public BIKEPrivateKeyParameters(BIKEParameters bIKEParameters, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(true, bIKEParameters);
        this.f33468h0 = Arrays.clone(bArr);
        this.f33469h1 = Arrays.clone(bArr2);
        this.sigma = Arrays.clone(bArr3);
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(this.f33468h0, this.f33469h1, this.sigma);
    }

    public byte[] getH0() {
        return this.f33468h0;
    }

    public byte[] getH1() {
        return this.f33469h1;
    }

    public byte[] getSigma() {
        return this.sigma;
    }
}
