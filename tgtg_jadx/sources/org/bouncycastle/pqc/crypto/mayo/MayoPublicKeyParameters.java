package org.bouncycastle.pqc.crypto.mayo;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class MayoPublicKeyParameters extends MayoKeyParameters {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final byte[] f33542p;

    public MayoPublicKeyParameters(MayoParameters mayoParameters, byte[] bArr) {
        super(false, mayoParameters);
        this.f33542p = Arrays.clone(bArr);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.f33542p);
    }

    public byte[] getP() {
        return Arrays.clone(this.f33542p);
    }
}
