package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class FalconPrivateKeyParameters extends FalconKeyParameters {
    private final byte[] F;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f33482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f33483g;

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    private final byte[] f33484pk;

    public FalconPrivateKeyParameters(FalconParameters falconParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, falconParameters);
        this.f33482f = Arrays.clone(bArr);
        this.f33483g = Arrays.clone(bArr2);
        this.F = Arrays.clone(bArr3);
        this.f33484pk = Arrays.clone(bArr4);
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(this.f33482f, this.f33483g, this.F);
    }

    public byte[] getG() {
        return Arrays.clone(this.f33483g);
    }

    public byte[] getPublicKey() {
        return Arrays.clone(this.f33484pk);
    }

    public byte[] getSpolyF() {
        return Arrays.clone(this.F);
    }

    public byte[] getSpolyf() {
        return Arrays.clone(this.f33482f);
    }
}
