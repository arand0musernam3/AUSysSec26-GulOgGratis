package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes3.dex */
public class ParametersWithID implements CipherParameters {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private byte[] f33254id;
    private CipherParameters parameters;

    public ParametersWithID(CipherParameters cipherParameters, byte[] bArr) {
        this.parameters = cipherParameters;
        this.f33254id = bArr;
    }

    public byte[] getID() {
        return this.f33254id;
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }
}
