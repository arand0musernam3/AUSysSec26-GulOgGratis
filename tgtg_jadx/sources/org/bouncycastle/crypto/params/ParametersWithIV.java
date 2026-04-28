package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes3.dex */
public class ParametersWithIV implements CipherParameters {

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f33255iv;
    private CipherParameters parameters;

    public ParametersWithIV(CipherParameters cipherParameters, byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        this.f33255iv = bArr2;
        this.parameters = cipherParameters;
        System.arraycopy(bArr, i11, bArr2, 0, i12);
    }

    public byte[] getIV() {
        return this.f33255iv;
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }

    public ParametersWithIV(CipherParameters cipherParameters, byte[] bArr) {
        this(cipherParameters, bArr, 0, bArr.length);
    }
}
