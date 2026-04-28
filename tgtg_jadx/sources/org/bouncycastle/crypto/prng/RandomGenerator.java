package org.bouncycastle.crypto.prng;

/* JADX INFO: loaded from: classes3.dex */
public interface RandomGenerator {
    void addSeedMaterial(long j9);

    void addSeedMaterial(byte[] bArr);

    void nextBytes(byte[] bArr);

    void nextBytes(byte[] bArr, int i11, int i12);
}
