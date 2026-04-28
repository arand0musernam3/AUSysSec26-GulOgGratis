package org.bouncycastle.pqc.legacy.crypto.gemss;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class GeMSSPublicKeyParameters extends GeMSSKeyParameters {

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    private final byte[] f33653pk;

    public GeMSSPublicKeyParameters(GeMSSParameters geMSSParameters, byte[] bArr) {
        super(false, geMSSParameters);
        byte[] bArr2 = new byte[bArr.length];
        this.f33653pk = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.f33653pk);
    }

    public byte[] getPK() {
        return this.f33653pk;
    }
}
