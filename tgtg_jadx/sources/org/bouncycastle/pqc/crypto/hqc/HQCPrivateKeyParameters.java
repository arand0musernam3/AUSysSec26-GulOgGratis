package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class HQCPrivateKeyParameters extends HQCKeyParameters {

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private byte[] f33520sk;

    public HQCPrivateKeyParameters(HQCParameters hQCParameters, byte[] bArr) {
        super(true, hQCParameters);
        this.f33520sk = Arrays.clone(bArr);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.f33520sk);
    }

    public byte[] getPrivateKey() {
        return Arrays.clone(this.f33520sk);
    }
}
