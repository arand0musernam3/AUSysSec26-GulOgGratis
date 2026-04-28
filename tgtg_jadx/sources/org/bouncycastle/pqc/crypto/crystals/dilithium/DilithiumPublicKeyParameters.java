package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class DilithiumPublicKeyParameters extends DilithiumKeyParameters {
    final byte[] rho;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    final byte[] f33481t1;

    public DilithiumPublicKeyParameters(DilithiumParameters dilithiumParameters, byte[] bArr) {
        super(false, dilithiumParameters);
        this.rho = Arrays.copyOfRange(bArr, 0, 32);
        this.f33481t1 = Arrays.copyOfRange(bArr, 32, bArr.length);
    }

    public byte[] getEncoded() {
        return getEncoded(this.rho, this.f33481t1);
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getT1() {
        return Arrays.clone(this.f33481t1);
    }

    public static byte[] getEncoded(byte[] bArr, byte[] bArr2) {
        return Arrays.concatenate(bArr, bArr2);
    }

    public DilithiumPublicKeyParameters(DilithiumParameters dilithiumParameters, byte[] bArr, byte[] bArr2) {
        super(false, dilithiumParameters);
        this.rho = Arrays.clone(bArr);
        this.f33481t1 = Arrays.clone(bArr2);
    }
}
