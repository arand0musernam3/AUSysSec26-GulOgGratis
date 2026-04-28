package org.bouncycastle.pqc.legacy.crypto.gemss;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class GeMSSPrivateKeyParameters extends GeMSSKeyParameters {

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    final byte[] f33652sk;

    public GeMSSPrivateKeyParameters(GeMSSParameters geMSSParameters, byte[] bArr) {
        super(false, geMSSParameters);
        byte[] bArr2 = new byte[bArr.length];
        this.f33652sk = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.f33652sk);
    }
}
