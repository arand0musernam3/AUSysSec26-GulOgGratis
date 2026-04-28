package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;

/* JADX INFO: loaded from: classes3.dex */
public class KDFParameters implements DerivationParameters {

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    byte[] f33251iv;
    byte[] shared;

    public KDFParameters(byte[] bArr, byte[] bArr2) {
        this.shared = bArr;
        this.f33251iv = bArr2;
    }

    public byte[] getIV() {
        return this.f33251iv;
    }

    public byte[] getSharedSecret() {
        return this.shared;
    }
}
