package org.bouncycastle.pqc.crypto.slhdsa;

/* JADX INFO: loaded from: classes3.dex */
class SIG_FORS {
    final byte[][] authPath;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    final byte[] f33594sk;

    public SIG_FORS(byte[] bArr, byte[][] bArr2) {
        this.authPath = bArr2;
        this.f33594sk = bArr;
    }

    public byte[][] getAuthPath() {
        return this.authPath;
    }

    public byte[] getSK() {
        return this.f33594sk;
    }
}
